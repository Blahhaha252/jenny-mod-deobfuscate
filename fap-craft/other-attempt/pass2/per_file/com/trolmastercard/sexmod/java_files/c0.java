/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 *  software.bernie.geckolib3.core.event.predicate.AnimationEvent
 *  software.bernie.geckolib3.core.processor.AnimationProcessor
 *  software.bernie.geckolib3.core.processor.IBone
 *  software.bernie.geckolib3.model.provider.data.EntityModelData
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.cv;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gj;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c0
extends cv {
    @Override
    protected ResourceLocation[] a() {
        return new ResourceLocation[]{new ResourceLocation("sexmod", "geo/bee/bee.geo.json"), new ResourceLocation("sexmod", "geo/bee/armored.geo.json")};
    }

    @Override
    public ResourceLocation b() {
        return new ResourceLocation("sexmod", "textures/entity/bee/bee.png");
    }

    @Override
    public ResourceLocation b(em em2) {
        return new ResourceLocation("sexmod", "animations/bee/bee.animation.json");
    }

    public void a(em em2, Integer n, AnimationEvent animationEvent) {
        super.a(em2, n, animationEvent);
        if (em2.field_70170_p instanceof gj) {
            return;
        }
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        IBone iBone = animationProcessor.getBone("chest");
        if (iBone == null) {
            return;
        }
        iBone.setHidden(em2.E.getCurrentAnimation() == null || !em2.E.getCurrentAnimation().animationName.contains("chest"));
    }

    protected void a(em em2, AnimationProcessor animationProcessor, AnimationEvent animationEvent) {
        if (!(em2.field_70170_p instanceof gj || em2.y() != fp.NULL && em2.y() != fp.ATTACK && em2.y() != fp.BOW)) {
            EntityModelData entityModelData = (EntityModelData)animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
            IBone iBone = animationProcessor.getBone("neck");
            iBone.setRotationY(entityModelData.netHeadYaw * 0.5f * ((float)Math.PI / 180));
            IBone iBone2 = animationProcessor.getBone("head");
            iBone2.setRotationY(entityModelData.netHeadYaw * ((float)Math.PI / 180));
            iBone2.setRotationX(1.0f + entityModelData.headPitch * ((float)Math.PI / 180));
            IBone iBone3 = animationProcessor.getBone("body") == null ? animationProcessor.getBone("dd") : animationProcessor.getBone("body");
            iBone3.setRotationY(0.0f);
        }
    }

    @Override
    public String[] c() {
        return new String[]{"armorHelmet"};
    }

    @Override
    public String[] g() {
        return new String[]{"band", "feeler", "feeler2", "brow", "brow2", "brow3", "brow4"};
    }

    @Override
    public String[] f() {
        return new String[]{"armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs"};
    }

    @Override
    public String[] a() {
        return new String[]{"boobsFlesh", "upperBodyL", "upperBodyR"};
    }

    @Override
    public String[] h() {
        return new String[]{"armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip"};
    }

    @Override
    public String[] e() {
        return new String[]{"sideL", "sideR", "fleshL", "fleshR", "vagina", "curvesL", "curvesR", "kneeL", "kneeR"};
    }

    @Override
    public String[] b() {
        return new String[]{"armorShoesL", "armorShoesR"};
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
