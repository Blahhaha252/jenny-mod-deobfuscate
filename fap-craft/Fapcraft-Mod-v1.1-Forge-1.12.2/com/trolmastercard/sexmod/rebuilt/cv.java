package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.cm;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.gc;
import com.trolmastercard.sexmod.gj;
import com.trolmastercard.sexmod.gs;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public abstract class cv<T extends em>
extends cm<T>
implements gs {
    public static final List<String> b = Arrays.asList("braStringMidStartR", "braStringMidMid1R", "braStringMidMid2R", "braStringMidMid3R", "braStringMidEndR", "braStringBackR", "braStringRightEndR", "braStringRightStartR", "braStringRightL", "braStringMidMid1L", "braStringMidMid2L", "braStringMidMid3L", "braStringMidEndL", "braStringBackL", "braStringLeftEndL", "braStringLeftStartL", "braStringMidStartL", "braStringRightR");
    public static final List<String> e = Arrays.asList("boyCam", "girlCam");
    // was public static boolean d = true;
    public static boolean loadSkins = true;
    protected ResourceLocation[] c = this.a();
    protected Minecraft a = Minecraft.getMinecraft();

    protected cv() {
    }

    protected abstract ResourceLocation[] a();

    public abstract ResourceLocation b();

    public abstract ResourceLocation b(em var1);

    public ResourceLocation c(em em2) {
        return this.b(em2);
    }

    public ResourceLocation a(em em2) {
        if (em2.world instanceof gj) {
            return this.c[0];
        }
        if ((Integer)em2.getDataManager().get(em.D) > this.c.length) {
            System.out.println("Girl doesn't have an outfit Nr." + em2.getDataManager().get(em.D) + " so im just making her nude lol");
            return this.c[0];
        }
        return this.c[(Integer)em2.getDataManager().get(em.D)];
    }

    public ResourceLocation g(em em2) {
        return this.b();
    }

    public void setMolangQueries(IAnimatable iAnimatable, double d) {
        block0: {
            if (Minecraft.getMinecraft().world == null) break block0;
            super.setMolangQueries(iAnimatable, d);
        }
    }

    public void a(T t, Integer n, AnimationEvent animationEvent) {
        super.setLivingAnimations(t, n, animationEvent);
        AnimationProcessor animationProcessor = this.getAnimationProcessor();
        this.a(t, animationProcessor);
        if (((em)((Object)t)).world instanceof gj) {
            return;
        }
        if (((Boolean)t.getDataManager().get(em.G)).booleanValue()) {
            t.setPositionAndRotationDirect(((em)((Object)t)).o().x, ((em)((Object)t)).o().y, ((em)((Object)t)).o().z, ((em)((Object)t)).I().floatValue(), 0.0f, 3, true);
        }
        if (((em)((Object)t)).C != null) {
            ((em)((Object)t)).C.transitionLengthTicks = ((em)((Object)t)).world instanceof gj || ((em)((Object)t)).y() == null ? 5.0 : (double)((em)((Object)t)).y().transitionTick;
        }
        this.a(t, animationProcessor, animationEvent);
        if (!(t instanceof e2) || ((em)((Object)t)).h() || ((em)((Object)t)).ah() == 0) {
            this.a(animationProcessor);
        } else {
            this.a(animationProcessor, (ItemStack)((em)((Object)t)).m.get(e2.X), (ItemStack)((em)((Object)t)).m.get(e2.T), (ItemStack)((em)((Object)t)).m.get(e2.U), (ItemStack)((em)((Object)t)).m.get(e2.W));
        }
    }

    public static Vec3d d(em em2) {
        return cv.a(new Vec3d(em2.lastTickPosX, em2.lastTickPosY, em2.lastTickPosZ), em2.getPositionVector());
    }

    public static Vec3d a(em em2, Vec3d vec3d) {
        return cv.a(vec3d, em2.getPositionVector());
    }

    public static Vec3d a(Vec3d vec3d, Vec3d vec3d2) {
        float f;
        float f2;
        Vec3d vec3d3 = vec3d2.subtract(vec3d);
        Vec3d vec3d4 = new Vec3d(Math.abs(vec3d3.x), Math.abs(vec3d3.y), Math.abs(vec3d3.z));
        double d = vec3d4.x / (vec3d4.x + vec3d4.y + vec3d4.z);
        double d2 = vec3d4.y / (vec3d4.x + vec3d4.y + vec3d4.z);
        double d3 = vec3d4.z / (vec3d4.x + vec3d4.y + vec3d4.z);
        Vec3d vec3d5 = new Vec3d((double)(vec3d3.x > 0.0 ? 1 : -1) * d, (double)(vec3d3.y > 0.0 ? 1 : -1) * d2, (double)(vec3d3.z > 0.0 ? 1 : -1) * d3);
        double d4 = vec3d5.y / 2.0 + 0.5;
        float f3 = (float)b6.b(-180.0, 0.0, d4);
        if (Float.isNaN(f3)) {
            f3 = -90.0f;
        }
        float f4 = f2 = d4 < 0.5 ? 0.0f : (float)b6.b(0.0, 16.0, -d4);
        if (Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        if (Float.isNaN(f = (float)(4.0 - Math.sin(1.5707963267948966 + d4 * 2.0 * Math.PI) * 4.0))) {
            f = 8.0f;
        }
        return new Vec3d((double)gc.c(f3), (double)f2, (double)f);
    }

    void a(AnimationProcessor<T> animationProcessor, ItemStack itemStack, ItemStack itemStack2, ItemStack itemStack3, ItemStack itemStack4) {
        this.c(animationProcessor, !itemStack.isEmpty());
        this.b(animationProcessor, itemStack2.getItem() instanceof ItemArmor);
        this.d(animationProcessor, !itemStack3.isEmpty());
        this.a(animationProcessor, !itemStack4.isEmpty());
    }

    protected void a(AnimationProcessor<T> animationProcessor) {
        this.c(animationProcessor, false);
        this.b(animationProcessor, false);
        this.d(animationProcessor, false);
        this.a(animationProcessor, false);
    }

    void c(AnimationProcessor animationProcessor, boolean bl) {
        this.a(this.c(), bl, animationProcessor);
        this.a(this.g(), !bl, animationProcessor);
    }

    void b(AnimationProcessor<T> animationProcessor, boolean bl) {
        this.a(this.f(), bl, animationProcessor);
        this.a(this.a(), !bl, animationProcessor);
    }

    void d(AnimationProcessor<T> animationProcessor, boolean bl) {
        this.a(this.h(), bl, animationProcessor);
        this.a(this.e(), !bl, animationProcessor);
    }

    void a(AnimationProcessor<T> animationProcessor, boolean bl) {
        this.a(this.b(), bl, animationProcessor);
        this.a(this.d(), !bl, animationProcessor);
    }

    void a(String[] stringArray, boolean bl, AnimationProcessor<T> animationProcessor) {
        for (String string : stringArray) {
            this.a(string, bl, animationProcessor);
        }
    }

    void a(String string, boolean bl, AnimationProcessor<T> animationProcessor) {
        if (animationProcessor.getBone(string) == null) {
            return;
        }
        animationProcessor.getBone(string).setHidden(!bl);
    }

    protected boolean f(T t) {
        UUID uUID = ((em)((Object)t)).ae();
        if (uUID == null) {
            return true;
        }
        World world = ((em)((Object)t)).world;
        AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)world.getPlayerEntityByUUID(uUID);
        if (abstractClientPlayer == null) {
            return true;
        }
        return "default".equals(abstractClientPlayer.getSkinType());
    }

    void a(T t, AnimationProcessor<T> animationProcessor) {
        boolean bl = this.f(t);
        animationProcessor.getBone("rightArmAlex").setHidden(bl);
        animationProcessor.getBone("rightLowerArmAlex").setHidden(bl);
        animationProcessor.getBone("rightArmSteve").setHidden(!bl);
        animationProcessor.getBone("rightLowerArmSteve").setHidden(!bl);
        animationProcessor.getBone("leftArmAlex").setHidden(bl);
        animationProcessor.getBone("leftLowerArmAlex").setHidden(bl);
        animationProcessor.getBone("leftArmSteve").setHidden(!bl);
        animationProcessor.getBone("leftLowerArmSteve").setHidden(!bl);
        IBone iBone = animationProcessor.getBone("steve");
        if (iBone != null) {
            iBone.setHidden(!((em)((Object)t)).y().hasPlayer);
        }
    }

    protected boolean e(T t) {
        return true;
    }

    protected void a(T t, AnimationProcessor<T> animationProcessor, AnimationEvent animationEvent) {
        if (((em)((Object)t)).world instanceof gj) {
            return;
        }
        if (!this.e(t)) {
            return;
        }
        if (((em)((Object)t)).y() != fp.NULL && ((em)((Object)t)).y() != fp.ATTACK && ((em)((Object)t)).y() != fp.BOW) {
            return;
        }
        EntityModelData entityModelData = (EntityModelData)animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
        IBone iBone = animationProcessor.getBone("neck");
        iBone.setRotationY(entityModelData.netHeadYaw * 0.5f * ((float)Math.PI / 180));
        IBone iBone2 = animationProcessor.getBone("head");
        iBone2.setRotationY(entityModelData.netHeadYaw * ((float)Math.PI / 180));
        iBone2.setRotationX(entityModelData.headPitch * ((float)Math.PI / 180));
        IBone iBone3 = animationProcessor.getBone("body") == null ? animationProcessor.getBone("dd") : animationProcessor.getBone("body");
        iBone3.setRotationY(0.0f);
    }

    public ItemStack a(em em2, String string) {
        if (Arrays.asList(this.c()).contains(string)) {
            return (ItemStack)em2.m.get(e2.X);
        }
        if (Arrays.asList(this.f()).contains(string)) {
            return (ItemStack)em2.m.get(e2.T);
        }
        if (Arrays.asList(this.h()).contains(string)) {
            return (ItemStack)em2.m.get(e2.U);
        }
        if (Arrays.asList(this.b()).contains(string)) {
            return (ItemStack)em2.m.get(e2.W);
        }
        return ItemStack.EMPTY;
    }

    private static RuntimeException b(RuntimeException runtimeException) {
        return runtimeException;
    }
}
