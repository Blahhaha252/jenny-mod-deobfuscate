/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.c8;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.gw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import net.minecraft.util.ResourceLocation;

public static class br.b {
    gw d;
    HashSet<fy> g;
    HashSet<String> b;
    String k;
    String j;
    boolean c;
    c8 e;
    float m;
    float a;
    ResourceLocation i;
    ResourceLocation f;
    public String h;
    float l;

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public br.b(File var1_1, String var2_2) {
        block57: {
            block56: {
                block55: {
                    block54: {
                        block53: {
                            block52: {
                                block51: {
                                    block50: {
                                        block49: {
                                            super();
                                            this.g = new HashSet<E>();
                                            this.b = new HashSet<E>();
                                            this.m = 1.0f;
                                            this.a = 0.0f;
                                            this.h = null;
                                            if (var2_2.contains(" ")) ** GOTO lbl15
                                            if (var2_2.contains("#")) ** GOTO lbl15
                                            try {
                                                block58: {
                                                    if (!var2_2.contains("$")) break block49;
                                                    break block58;
                                                    catch (FileNotFoundException v0) {
                                                        throw br.b.a(v0);
                                                    }
                                                }
                                                this.h = String.format("You cannot call your custom model '%s'. '#', '$' and spaces are illegal characters", new Object[]{var2_2});
                                                return;
                                            }
                                            catch (FileNotFoundException v1) {
                                                throw br.b.a(v1);
                                            }
                                        }
                                        try {
                                            if ("cross".equalsIgnoreCase(var2_2)) {
                                                this.h = "You cannot call your custom model 'cross'. Im sorry, but I need that specific name for internal stuff";
                                                return;
                                            }
                                        }
                                        catch (FileNotFoundException v2) {
                                            throw br.b.a(v2);
                                        }
                                        var3_3 = new Properties();
                                        try {
                                            var4_4 = new FileInputStream(var1_1);
                                        }
                                        catch (FileNotFoundException var5_5) {
                                            this.h = String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", new Object[]{var2_2, var1_1.getAbsolutePath()});
                                            return;
                                        }
                                        try {
                                            var3_3.load(var4_4);
                                        }
                                        catch (IOException var5_6) {
                                            this.h = String.format("couldn't read the cfg File for '%s' at '%s'. It appears to be corrupted. Try making a new one", new Object[]{var2_2, var1_1.getAbsolutePath()});
                                            return;
                                        }
                                        var5_7 = var3_3.getProperty("wear_type");
                                        try {
                                            if (var5_7 == null) {
                                                this.h = String.format("The cfg File for the model '%s' at '%s' is missing the 'wear_type'. Go to the bottom of the cfg File and write 'wear_type=HEAD'. Check the cfg files of my examples to see what values for 'wear_type' are possible", new Object[]{var2_2, var1_1.getAbsolutePath()});
                                                return;
                                            }
                                        }
                                        catch (FileNotFoundException v3) {
                                            throw br.b.a(v3);
                                        }
                                        try {
                                            var5_7 = var5_7.replace(" ", "");
                                            this.d = gw.valueOf(var5_7);
                                        }
                                        catch (IllegalArgumentException var6_8) {
                                            this.h = String.format("you entered '%s' into the 'wear_type' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'wear_type", new Object[]{var5_7, var2_2, var1_1.getAbsolutePath()});
                                            return;
                                        }
                                        if (!gw.CUSTOM_BONE.equals((Object)this.d)) break block50;
                                        try {
                                            block59: {
                                                this.j = var3_3.getProperty("custom_bone");
                                                if (!"".equals(this.j)) break block50;
                                                break block59;
                                                catch (FileNotFoundException v4) {
                                                    throw br.b.a(v4);
                                                }
                                            }
                                            this.h = String.format("You selected CUSTOM_BONE as the 'wear_type' in the cfg file for '%s' at '%s', yet you left the 'custom_bone' field right underneath it empty. If you want ur model to be parented to a specific bone, you have to enter the name of that bone at the field 'custom_bone'.", new Object[]{var2_2, var1_1.getAbsolutePath()});
                                            return;
                                        }
                                        catch (FileNotFoundException v5) {
                                            throw br.b.a(v5);
                                        }
                                    }
                                    var6_9 = var3_3.getProperty("which_girls");
                                    var6_9 = var6_9.replace(" ", "");
                                    var7_10 = var6_9.split(",");
                                    for (String[] var11_17 : var7_10) {
                                        try {
                                            if ("".equals(var11_17)) {
                                                continue;
                                            }
                                        }
                                        catch (FileNotFoundException v6) {
                                            throw br.b.a(v6);
                                        }
                                        try {
                                            this.g.add(fy.valueOf((String)var11_17));
                                        }
                                        catch (IllegalArgumentException var12_18) {
                                            this.h = String.format("you entered '%s' as one of the girls, you put into the 'which_girls' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_girls'.", new Object[]{var11_17, var2_2, var1_1.getAbsolutePath()});
                                            return;
                                        }
                                    }
                                    var8_11 = var3_3.getProperty("which_lighting");
                                    try {
                                        if (var8_11 == null) {
                                            this.h = String.format("The %s's cfg file at '%s' doesn't contain the field 'which_lighting'. Go to the bottom of the cfg file and write either 'which_lighting=DEFAULT', 'which_lighting=SEXMOD', or 'which_lighting=NONE'.", new Object[]{var2_2, var1_1.getAbsolutePath()});
                                            return;
                                        }
                                    }
                                    catch (FileNotFoundException v7) {
                                        throw br.b.a(v7);
                                    }
                                    var8_11 = var8_11.replace(" ", "");
                                    try {
                                        this.e = c8.valueOf((String)var8_11);
                                    }
                                    catch (IllegalArgumentException var9_13) {
                                        this.h = String.format("you entered '%s' into the 'which_lighting' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_lighting'.", new Object[]{var8_11, var2_2, var1_1.getAbsolutePath()});
                                    }
                                    var9_14 = var3_3.getProperty("author");
                                    if (var9_14 == null) ** GOTO lbl109
                                    try {
                                        block60: {
                                            if (!"".equals(var9_14)) break block51;
                                            break block60;
                                            catch (FileNotFoundException v8) {
                                                throw br.b.a(v8);
                                            }
                                        }
                                        this.k = "anon";
                                        break block52;
                                    }
                                    catch (FileNotFoundException v9) {
                                        throw br.b.a(v9);
                                    }
                                }
                                this.k = var9_14;
                            }
                            var10_16 = var3_3.getProperty("bones_to_hide");
                            try {
                                if (var10_16 == null || "".equals(var10_16)) break block53;
                            }
                            catch (FileNotFoundException v10) {
                                throw br.b.a(v10);
                            }
                            var10_16 = var10_16.replace(" ", "");
                            var11_17 = var10_16.split(",");
                            this.b.addAll(Arrays.asList(var11_17));
                        }
                        var11_17 = var3_3.getProperty("enable_when_nude");
                        try {
                            if (var11_17 != null) break block54;
                            this.c = false;
                            break block55;
                        }
                        catch (FileNotFoundException v11) {
                            throw br.b.a(v11);
                        }
                    }
                    var11_17 = var11_17.replace(" ", "");
                    this.c = var11_17.equalsIgnoreCase("yes");
                }
                var12_19 = var3_3.getProperty("gui_size_factor");
                try {
                    if (var12_19 == null || "".equals(var12_19)) break block56;
                }
                catch (FileNotFoundException v12) {
                    throw br.b.a(v12);
                }
                var12_19 = var12_19.replace(" ", "");
                var12_19 = var12_19.replace(",", ".");
                try {
                    this.m = Float.parseFloat(var12_19);
                }
                catch (NumberFormatException var13_20) {
                    this.h = String.format("you entered '%s' into the 'gui_size_factor' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_size_factor'.", new Object[]{var12_19, var2_2, var1_1.getAbsolutePath()});
                }
            }
            var13_21 = var3_3.getProperty("gui_vertical_positioning");
            try {
                if (var13_21 == null || "".equals(var13_21)) break block57;
            }
            catch (FileNotFoundException v13) {
                throw br.b.a(v13);
            }
            var13_21 = var13_21.replace(" ", "");
            var13_21 = var13_21.replace(",", ".");
            try {
                this.a = Float.parseFloat(var13_21);
            }
            catch (NumberFormatException var14_22) {
                this.h = String.format("you entered '%s' into the 'gui_vertical_positioning' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_vertical_positioning'.", new Object[]{var13_21, var2_2, var1_1.getAbsolutePath()});
            }
        }
        var14_23 = var3_3.getProperty("version");
        var14_23 = var14_23.replace(" ", "");
        var14_23 = var14_23.replace(",", ".");
        try {
            this.l = Float.parseFloat(var14_23);
        }
        catch (NumberFormatException var15_24) {
            this.h = String.format("you entered '%s' into the 'versionString' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'versionString'.", new Object[]{var14_23, var2_2, var1_1.getAbsolutePath()});
        }
    }

    public String b() {
        return this.j;
    }

    public c8 i() {
        return this.e;
    }

    public float g() {
        return this.a;
    }

    public float d() {
        return this.m;
    }

    public gw j() {
        return this.d;
    }

    public HashSet<fy> l() {
        return this.g;
    }

    public String e() {
        return this.k;
    }

    public boolean a() {
        return this.c;
    }

    public HashSet<String> h() {
        return this.b;
    }

    public ResourceLocation k() {
        return this.i;
    }

    public void a(ResourceLocation resourceLocation) {
        this.i = resourceLocation;
    }

    public ResourceLocation c() {
        return this.f;
    }

    public void b(ResourceLocation resourceLocation) {
        this.f = resourceLocation;
    }

    public float f() {
        return this.l;
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }
}
