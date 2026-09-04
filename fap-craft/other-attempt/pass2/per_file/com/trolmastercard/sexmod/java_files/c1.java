/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  software.bernie.geckolib3.core.IAnimatable
 *  software.bernie.geckolib3.core.IAnimatableModel
 *  software.bernie.geckolib3.core.processor.AnimationProcessor
 *  software.bernie.geckolib3.core.processor.IBone
 */
package com.trolmastercard.sexmod;

import java.util.HashMap;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimatableModel;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class c1<T extends IAnimatable>
extends AnimationProcessor<T> {
    HashMap<String, IBone> a = new HashMap();

    public c1(IAnimatableModel iAnimatableModel) {
        super(iAnimatableModel);
    }

    public IBone getBone(String string) {
        return this.a.get(string);
    }

    public void registerModelRenderer(IBone iBone) {
        super.registerModelRenderer(iBone);
        this.a.put(iBone.getName(), iBone);
    }

    public void clearModelRendererList() {
        super.clearModelRendererList();
        this.a.clear();
    }
}
