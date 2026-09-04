/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.controller.AnimationController
 *  software.bernie.geckolib3.core.controller.AnimationController$IAnimationPredicate
 *  software.bernie.geckolib3.core.easing.EasingType
 */
package com.trolmastercard.sexmod;

import java.util.function.Function;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.easing.EasingType;

public class bz<T extends IAnimatable>
extends AnimationController<T> {
    public bz(T t, String string, float f, AnimationController.IAnimationPredicate<T> iAnimationPredicate) {
        super(t, string, f, iAnimationPredicate);
    }

    public bz(T t, String string, float f, EasingType easingType, AnimationController.IAnimationPredicate<T> iAnimationPredicate) {
        super(t, string, f, easingType, iAnimationPredicate);
    }

    public bz(T t, String string, float f, Function<Double, Double> function, AnimationController.IAnimationPredicate<T> iAnimationPredicate) {
        super(t, string, f, function, iAnimationPredicate);
    }
}
