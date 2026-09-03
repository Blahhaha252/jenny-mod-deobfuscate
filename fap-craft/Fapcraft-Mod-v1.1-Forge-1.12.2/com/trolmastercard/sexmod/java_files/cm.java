/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.IAnimatableModel
 *  software.bernie.geckolib3.geo.exception.GeoModelException
 *  software.bernie.geckolib3.geo.render.built.GeoBone
 *  software.bernie.geckolib3.geo.render.built.GeoModel
 *  software.bernie.geckolib3.model.AnimatedGeoModel
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.c1;
import java.lang.reflect.Field;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimatableModel;
import software.bernie.geckolib3.geo.exception.GeoModelException;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public abstract class cm<T extends IAnimatable>
extends AnimatedGeoModel<T> {
    protected cm() {
        try {
            Field field = Class.forName("software.bernie.geckolib3.model.AnimatedGeoModel").getDeclaredField("animationProcessor");
            field.setAccessible(true);
            field.set((Object)this, (Object)new c1((IAnimatableModel)this));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public GeoModel getModel(ResourceLocation resourceLocation) {
        GeoModel geoModel = super.getModel(resourceLocation);
        try {
            if (geoModel == null) {
                throw new GeoModelException(resourceLocation, "Could not find model.");
            }
        }
        catch (GeoModelException geoModelException) {
            throw cm.a(geoModelException);
        }
        this.getAnimationProcessor().clearModelRendererList();
        for (GeoBone geoBone : geoModel.topLevelBones) {
            this.registerBone(geoBone);
        }
        return geoModel;
    }

    private static GeoModelException a(GeoModelException geoModelException) {
        return geoModelException;
    }
}
