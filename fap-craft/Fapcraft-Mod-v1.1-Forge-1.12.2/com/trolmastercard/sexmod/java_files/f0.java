/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.ResourceLocation
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.geo.render.built.GeoCube
 *  software.bernie.geckolib3.geo.render.built.GeoModel
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 *  software.bernie.geckolib3.renderers.geo.GeoItemRenderer
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a9;
import com.trolmastercard.sexmod.ap;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class f0
extends GeoItemRenderer<ap> {
    Minecraft a = Minecraft.func_71410_x();
    static ResourceLocation b = null;

    public f0() {
        super((AnimatedGeoModel)new a9());
    }

    ResourceLocation a() {
        if (b == null) {
            try {
                URL uRL = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + Minecraft.func_71410_x().field_71439_g.getPersistentID().toString().replace("-", ""));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
                String string = bufferedReader.lines().collect(Collectors.joining());
                int n = string.indexOf("\"value\" : ");
                int n2 = n + 11;
                StringBuilder stringBuilder = new StringBuilder();
                int n3 = 0;
                try {
                    while (string.charAt(n2 + n3) != '\"') {
                        stringBuilder.append(string.charAt(n2 + n3));
                        ++n3;
                    }
                }
                catch (Exception exception) {
                    throw f0.a(exception);
                }
                String string2 = new String(Base64.getDecoder().decode(stringBuilder.toString()));
                int n4 = string2.indexOf("\"url\" : ");
                int n5 = n4 + 9;
                StringBuilder stringBuilder2 = new StringBuilder();
                int n6 = 0;
                try {
                    while (string2.charAt(n5 + n6) != '\"') {
                        stringBuilder2.append(string2.charAt(n5 + n6));
                        ++n6;
                    }
                }
                catch (Exception exception) {
                    throw f0.a(exception);
                }
                URL uRL2 = new URL(stringBuilder2.toString());
                BufferedImage bufferedImage = ImageIO.read(uRL2);
                BufferedImage bufferedImage2 = ImageIO.read(this.a.func_110442_L().func_110536_a(new a9().c(new ap())).func_110527_b());
                for (int i = 0; i < bufferedImage2.getWidth(); ++i) {
                    for (int j = 0; j < bufferedImage2.getHeight(); ++j) {
                        int n7 = bufferedImage.getRGB(i, j);
                        try {
                            if (n7 == 0) continue;
                            bufferedImage2.setRGB(i, j, n7);
                            continue;
                        }
                        catch (Exception exception) {
                            throw f0.a(exception);
                        }
                    }
                }
                b = Minecraft.func_71410_x().func_175598_ae().field_78724_e.func_110578_a("lamptex", new DynamicTexture(bufferedImage2));
            }
            catch (Exception exception) {
                b = new a9().c(new ap());
            }
        }
        return b;
    }

    public void a(GeoModel geoModel, ap ap2, float f, float f2, float f3, float f4, float f5) {
        GlStateManager.func_179129_p();
        GlStateManager.func_179091_B();
        this.renderEarly((Object)ap2, f, f2, f3, f4, f5);
        this.renderLate((Object)ap2, f, f2, f3, f4, f5);
        BufferBuilder bufferBuilder = Tessellator.func_178181_a().func_178180_c();
        bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
        for (GeoBone geoBone : geoModel.topLevelBones) {
            this.a(bufferBuilder, ap2, geoBone, f2, f3, f4, f5);
        }
        Tessellator.func_178181_a().func_78381_a();
        this.renderAfter((Object)ap2, f, f2, f3, f4, f5);
        GlStateManager.func_179101_C();
        GlStateManager.func_179089_o();
    }

    public void a(BufferBuilder bufferBuilder, ap ap2, GeoBone geoBone, float f, float f2, float f3, float f4) {
        try {
            MATRIX_STACK.push();
            MATRIX_STACK.translate(geoBone);
            MATRIX_STACK.moveToPivot(geoBone);
            MATRIX_STACK.rotate(geoBone);
            MATRIX_STACK.scale(geoBone);
            MATRIX_STACK.moveBackFromPivot(geoBone);
            this.a.field_71446_o.func_110577_a(this.a());
            if (this.a(geoBone.getName())) {
                this.b(bufferBuilder, ap2, geoBone, f, f2, f3, f4);
            }
        }
        catch (RuntimeException runtimeException) {
            throw f0.a(runtimeException);
        }
        MATRIX_STACK.pop();
    }

    boolean a(String string) {
        boolean bl;
        block10: {
            block9: {
                block8: {
                    try {
                        try {
                            if (string.equals("leftArm") || string.equals("rightArm")) break block8;
                        }
                        catch (RuntimeException runtimeException) {
                            throw f0.a(runtimeException);
                        }
                        return true;
                    }
                    catch (RuntimeException runtimeException) {
                        throw f0.a(runtimeException);
                    }
                }
                try {
                    try {
                        if (!this.a.field_71439_g.getEntityData().func_74767_n("sexmodAllieInUse") || this.a.field_71474_y.field_74320_O != 0) break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw f0.a(runtimeException);
                    }
                    bl = true;
                    break block10;
                }
                catch (RuntimeException runtimeException) {
                    throw f0.a(runtimeException);
                }
            }
            bl = false;
        }
        return bl;
    }

    void b(BufferBuilder bufferBuilder, ap ap2, GeoBone geoBone, float f, float f2, float f3, float f4) {
        if (!geoBone.isHidden) {
            for (GeoCube geoCube : geoBone.childCubes) {
                MATRIX_STACK.push();
                GlStateManager.func_179094_E();
                this.renderCube(bufferBuilder, geoCube, f, f2, f3, f4);
                GlStateManager.func_179121_F();
                MATRIX_STACK.pop();
            }
            for (GeoCube geoCube : geoBone.childBones) {
                this.a(bufferBuilder, ap2, (GeoBone)geoCube, f, f2, f3, f4);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}
