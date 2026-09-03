import java.util.*;

public class Main {

    static int worldMode = 0;
    static int biomeMode = 0;

    static ArrayList<String> trace = new ArrayList<>();


    public static void main(String[] args) {

        String[] blocks = {
            "dirt",
            "stone",
            "grass",
            "oak",
        };

        BlockPos[] starts = {
            new BlockPos(0, 0, 0),
            new BlockPos(1, 0, 0),
            new BlockPos(-1, 0, 0),
            new BlockPos(3, 2, -4),
            new BlockPos(-5, -2, 7),
            new BlockPos(10, 10, 10),
            new BlockPos(-10, 5, 3),
            new BlockPos(100, 0, -100),
            new BlockPos(-37, -12, 91)
        };


        /*
         * BIOME FILTERS
         *
         * null = biome filtering disabled
         */
        ArrayList<HashSet<String>> biomeFilters = new ArrayList<>();

        biomeFilters.add(null);

        biomeFilters.add(setOf());

        biomeFilters.add(setOf(
            "plains"
        ));

        biomeFilters.add(setOf(
            "forest"
        ));

        biomeFilters.add(setOf(
            "desert"
        ));

        biomeFilters.add(setOf(
            "plains",
            "forest"
        ));

        biomeFilters.add(setOf(
            "plains",
            "forest",
            "desert"
        ));


        long tests = 0;

        long resultMismatches = 0;
        long traceMismatches = 0;

        int printedMismatches = 0;
        final int MAX_PRINTED_MISMATCHES = 20;


        /*
         * worldMode:
         *
         * 0 = coordinate hash
         * 1 = checker-ish
         * 2 = vertical layers
         * 3 = x stripes
         * 4 = z stripes
         * 5 = more chaotic coordinate hash
         */
        for (worldMode = 0; worldMode < 6; ++worldMode) {

            /*
             * biomeMode:
             *
             * 0 = coordinate hash
             * 1 = x regions
             * 2 = z regions
             * 3 = chaotic
             */
            for (biomeMode = 0; biomeMode < 4; ++biomeMode) {

                for (BlockPos start : starts) {

                    for (String targetBlock : blocks) {

                        for (HashSet<String> biomeFilter : biomeFilters) {

                            /*
                             * Keep these relatively small first.
                             * This already makes a LOT of tests.
                             */
                            for (int n2 = 1; n2 <= 10; ++n2) {

                                for (int n3 = 2; n3 <= 8; ++n3) {

                                    for (int n4 = 0; n4 <= 5; ++n4) {

                                        ++tests;


                                        /*
                                         * CURSED VERSION
                                         */
                                        trace.clear();

                                        BlockPos cursed = thing(
                                            new BlockPos(
                                                start.x,
                                                start.y,
                                                start.z
                                            ),
                                            n2,
                                            targetBlock,
                                            n3,
                                            n4,
                                            biomeFilter
                                        );

                                        ArrayList<String> cursedTrace =
                                            new ArrayList<>(trace);


                                        /*
                                         * CLEAN VERSION
                                         */
                                        trace.clear();

                                        BlockPos clean = thing2(
                                            new BlockPos(
                                                start.x,
                                                start.y,
                                                start.z
                                            ),
                                            n2,
                                            targetBlock,
                                            n3,
                                            n4,
                                            biomeFilter
                                        );

                                        ArrayList<String> cleanTrace =
                                            new ArrayList<>(trace);


                                        boolean resultSame =
                                            samePos(cursed, clean);

                                        boolean traceSame =
                                            cursedTrace.equals(cleanTrace);


                                        if (!resultSame) {
                                            ++resultMismatches;
                                        }

                                        if (!traceSame) {
                                            ++traceMismatches;
                                        }


                                        if (
                                            (!resultSame || !traceSame) &&
                                            printedMismatches <
                                            MAX_PRINTED_MISMATCHES
                                        ) {
                                            ++printedMismatches;

                                            System.out.println();
                                            System.out.println(
                                                "============ MISMATCH ============"
                                            );

                                            System.out.println(
                                                "worldMode=" + worldMode
                                            );

                                            System.out.println(
                                                "biomeMode=" + biomeMode
                                            );

                                            System.out.println(
                                                "start=" + start
                                            );

                                            System.out.println(
                                                "target=" + targetBlock
                                            );

                                            System.out.println(
                                                "biomes=" + biomeFilter
                                            );

                                            System.out.println(
                                                "n2=" + n2 +
                                                " n3=" + n3 +
                                                " n4=" + n4
                                            );

                                            System.out.println(
                                                "cursed result = " + cursed
                                            );

                                            System.out.println(
                                                "clean result  = " + clean
                                            );

                                            System.out.println(
                                                "result same = " + resultSame
                                            );

                                            System.out.println(
                                                "trace same  = " + traceSame
                                            );


                                            if (!traceSame) {

                                                int firstDifference =
                                                    firstTraceDifference(
                                                        cursedTrace,
                                                        cleanTrace
                                                    );

                                                System.out.println(
                                                    "first trace difference = " +
                                                    firstDifference
                                                );

                                                printTraceArea(
                                                    cursedTrace,
                                                    cleanTrace,
                                                    firstDifference
                                                );
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        System.out.println();
        System.out.println("============ FINISHED ============");

        System.out.println(
            "Tests:             " + tests
        );

        System.out.println(
            "Result mismatches: " + resultMismatches
        );

        System.out.println(
            "Trace mismatches:  " + traceMismatches
        );

        if (
            resultMismatches == 0 &&
            traceMismatches == 0
        ) {
            System.out.println();
            System.out.println(
                "ALL TESTS MATCHED."
            );
        }
    }


    /*
     * Convenience function for biome sets.
     */
    static HashSet<String> setOf(String... values) {
        return new HashSet<>(
            Arrays.asList(values)
        );
    }


    static boolean samePos(BlockPos a, BlockPos b) {

        if (a == null || b == null) {
            return a == b;
        }

        return
            a.x == b.x &&
            a.y == b.y &&
            a.z == b.z;
    }


    /*
     * FAKE BLOCK WORLD
     *
     * Deliberately uses several different layouts so the search
     * can't get away with accidentally traversing coordinates
     * in the wrong order.
     */
    static String getBlock(BlockPos pos) {

        int value;

        switch (worldMode) {

            /*
             * General coordinate hash
             */
            case 0:
                value = Math.floorMod(
                    pos.x +
                    pos.y * 3 +
                    pos.z * 7,
                    3
                );
                break;


            /*
             * Checker-ish pattern
             */
            case 1:
                value = Math.floorMod(
                    pos.x +
                    pos.y +
                    pos.z,
                    3
                );
                break;


            /*
             * Vertical layers
             */
            case 2:
                value = Math.floorMod(
                    pos.y,
                    3
                );
                break;


            /*
             * X stripes
             */
            case 3:
                value = Math.floorMod(
                    pos.x,
                    3
                );
                break;


            /*
             * Z stripes
             */
            case 4:
                value = Math.floorMod(
                    pos.z,
                    3
                );
                break;


            /*
             * More obnoxious deterministic hash
             */
            default:
                value = Math.floorMod(
                    pos.x * 31 +
                    pos.y * 17 +
                    pos.z * 13 +
                    pos.x * pos.z,
                    3
                );
                break;
        }


        String result;

        if (value == 0) {
            result = "dirt";
        }
        else if (value == 1) {
            result = "stone";
        }
        else {
            result = "grass";
        }


        trace.add(
            "BLOCK " +
            pos +
            " -> " +
            result
        );

        return result;
    }


    /*
     * FAKE BIOME WORLD
     */
    static String getBiome(BlockPos pos) {

        int value;

        switch (biomeMode) {

            case 0:
                value = Math.floorMod(
                    pos.x * 5 +
                    pos.y +
                    pos.z * 11,
                    3
                );
                break;


            /*
             * Broad X regions
             */
            case 1:
                value = Math.floorMod(
                    Math.floorDiv(pos.x, 2),
                    3
                );
                break;


            /*
             * Broad Z regions
             */
            case 2:
                value = Math.floorMod(
                    Math.floorDiv(pos.z, 2),
                    3
                );
                break;


            /*
             * More chaotic
             */
            default:
                value = Math.floorMod(
                    pos.x * 19 +
                    pos.y * 23 +
                    pos.z * 29 +
                    pos.x * pos.y,
                    3
                );
                break;
        }


        String result;

        if (value == 0) {
            result = "plains";
        }
        else if (value == 1) {
            result = "forest";
        }
        else {
            result = "desert";
        }


        trace.add(
            "BIOME " +
            pos +
            " -> " +
            result
        );

        return result;
    }


    /*
     * Find where two traces first diverge.
     */
    static int firstTraceDifference(
        ArrayList<String> a,
        ArrayList<String> b
    ) {

        int count = Math.min(
            a.size(),
            b.size()
        );

        for (int i = 0; i < count; ++i) {

            if (!a.get(i).equals(b.get(i))) {
                return i;
            }
        }

        if (a.size() != b.size()) {
            return count;
        }

        return -1;
    }


    /*
     * Don't vomit an entire 500-entry trace onto the terminal.
     * Show a little window surrounding the divergence.
     */
    static void printTraceArea(
        ArrayList<String> cursed,
        ArrayList<String> clean,
        int difference
    ) {

        if (difference < 0) {
            return;
        }

        int start = Math.max(
            0,
            difference - 3
        );

        int end = Math.min(
            Math.max(
                cursed.size(),
                clean.size()
            ),
            difference + 4
        );


        System.out.println();
        System.out.println("--- trace area ---");

        for (int i = start; i < end; ++i) {

            String a =
                i < cursed.size()
                ? cursed.get(i)
                : "<END>";

            String b =
                i < clean.size()
                ? clean.get(i)
                : "<END>";

            String marker =
                a.equals(b)
                ? " "
                : "!";

            System.out.println(
                marker +
                " [" + i + "]"
            );

            System.out.println(
                "    cursed: " + a
            );

            System.out.println(
                "    clean:  " + b
            );
        }
    }
    public static class BlockPos {
        public final int x;
        public final int y;
        public final int z;

        public BlockPos(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public BlockPos add(int x, int y, int z) {
            return new BlockPos(
                this.x + x,
                this.y + y,
                this.z + z
            );
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }
    }
    public static BlockPos thing2(
        BlockPos blockPos,
        int n2,
        String block,
        int n3,
        int n4,
        HashSet<String> hashSet
    ) {
        int n5 = 1;
        int n6 = -1;
        BlockPos blockPos2 = blockPos;
        int n7 = 0;

        while (n5 < n3) {
            for (int i = 0; i < 2; ++i) {
                n6 *= -1;
                // First direction
                for (int n9 = 0; n9 < n5; ++n9) {

                    blockPos2 = blockPos2.add(0, 0, n6);

                    for (int n8 = -n4; n8 <= n4; ++n8) {

                        if (
                            getBlock(
                                blockPos2.add(0, n8, n6)
                            ).equals(block)
                        ) {

                            ++n7;

                            if (n7 >= n2) {

                                if (
                                    hashSet == null ||
                                    hashSet.contains(
                                        getBiome(
                                            blockPos2.add(n6, n8, 0)
                                        )
                                    )
                                ) {
                                    return blockPos2.add(0, n8, n6);
                                }
                            }
                        }
                    }
                }


                // Second direction
                for (int n9 = 0; n9 < n5; ++n9) {

                    blockPos2 = blockPos2.add(n6, 0, 0);

                    for (int n8 = -n4; n8 <= n4; ++n8) {

                        if (
                            getBlock(
                                blockPos2.add(n6, n8, 0)
                            ).equals(block)
                        ) {

                            ++n7;

                            if (n7 >= n2) {

                                if (
                                    hashSet == null ||
                                    hashSet.contains(
                                        getBiome(
                                            blockPos2.add(n6, n8, 0)
                                        )
                                    )
                                ) {
                                    return blockPos2.add(n6, n8, 0);
                                }
                            }
                        }
                    }
                }

                ++n5;
            }
        }

        return null;
    }

    public static BlockPos thing(
        BlockPos blockPos,
        int n2,
        String block,
        int n3,
        int n4,
        HashSet<String> hashSet
    ) {
        int n5 = 1;
        int n6 = -1;
        BlockPos blockPos2 = blockPos;
        int n7 = 0;

        while (n5 < n3) {
            for (int i = 0; i < 2; ++i) {
                int n8;
                int n9;

                n6 *= -1;

                block22:
                for (n9 = 0; n9 < n5; ++n9) {
                    blockPos2 = blockPos2.add(0, 0, n6);
                    n8 = -n4;

                    while (true) {
                        block26: {
                            block27: {
                                if (n8 >= n4 + 1) continue block22;

                                if (!getBlock(
                                    blockPos2.add(0, n8, n6)
                                ).equals(block)) {
                                    break block26;
                                }

                                if (++n7 < n2) break block26;

                                if (hashSet == null) break block27;

                                if (!hashSet.contains(
                                    getBiome(
                                        blockPos2.add(n6, n8, 0)
                                    )
                                )) {
                                    break block26;
                                }
                            }

                            return blockPos2.add(0, n8, n6);
                        }

                        ++n8;
                    }
                }

                block24:
                for (n9 = 0; n9 < n5; ++n9) {
                    blockPos2 = blockPos2.add(n6, 0, 0);
                    n8 = -n4;

                    while (true) {
                        block28: {
                            block29: {
                                if (n8 >= n4 + 1) continue block24;

                                if (!getBlock(
                                    blockPos2.add(n6, n8, 0)
                                ).equals(block)) {
                                    break block28;
                                }

                                if (++n7 < n2) break block28;

                                if (hashSet == null) break block29;

                                if (!hashSet.contains(
                                    getBiome(
                                        blockPos2.add(n6, n8, 0)
                                    )
                                )) {
                                    break block28;
                                }
                            }

                            return blockPos2.add(n6, n8, 0);
                        }

                        ++n8;
                    }
                }

                ++n5;
            }
        }

        return null;
    }
}