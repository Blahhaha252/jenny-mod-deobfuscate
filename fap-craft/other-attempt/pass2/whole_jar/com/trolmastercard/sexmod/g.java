/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureAttribute
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.ai.attributes.AttributeModifier
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.passive.EntityHorse
 *  net.minecraft.entity.projectile.EntityArrow
 *  net.minecraft.entity.projectile.EntityTippedArrow
 *  net.minecraft.init.Enchantments
 *  net.minecraft.init.SoundEvents
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.ItemBow
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package com.trolmastercard.sexmod;

import com.google.common.collect.Multimap;
import com.trolmastercard.sexmod.ck;
import com.trolmastercard.sexmod.e2;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f;
import com.trolmastercard.sexmod.fp;
import com.trolmastercard.sexmod.r;
import java.util.List;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class g
extends f {
    e2 q;
    EntityLivingBase r;
    Entity o;
    double l = 3.4028234663852886E38;
    Vec3d i = Vec3d.field_186680_a;
    int j = 0;
    int n = 0;
    int k = 0;
    int p = 0;
    int m = 0;

    public g(e2 e22) {
        super(e22);
        this.q = e22;
    }

    @Override
    public void func_75246_d() {
        block0: {
            super.func_75246_d();
            this.l = this.q.func_70032_d((Entity)this.a);
            this.i = this.a.func_174791_d();
            if (this.q.y() != fp.BOW) break block0;
            this.q.b(fp.NULL);
        }
    }

    boolean a(EntityLivingBase entityLivingBase) {
        Vec3d vec3d = this.q.func_174791_d();
        return !(entityLivingBase instanceof em) && this.n <= 0 && entityLivingBase != null && entityLivingBase.field_70170_p != null && !this.q.equals(entityLivingBase) && entityLivingBase.func_70089_S() && vec3d.func_72438_d(this.a.func_174791_d()) < 15.0 && vec3d.func_72438_d(entityLivingBase.func_174791_d()) < 20.0 && !entityLivingBase.equals((Object)this.a);
    }

    @Override
    protected void a(f.a.a a10) {
        switch (a10) {
            case ATTACK: {
                this.q.func_70671_ap().func_75651_a((Entity)this.r, 30.0f, 30.0f);
                double d10 = this.q.func_70032_d((Entity)this.r);
                this.c.func_75499_g();
                if (d10 < 1.9 && --this.k <= 0) {
                    this.d();
                    break;
                }
                if (this.q.Q.getStackInSlot(1).func_77973_b() instanceof ItemBow && this.q.func_70635_at().func_75522_a((Entity)this.r) && ++this.p > 0 && d10 > 6.0) {
                    this.e.func_187227_b(e2.M, (Object)2);
                    this.q.b(fp.BOW);
                    if (++this.p >= 32) {
                        this.p = -20;
                        this.e();
                        this.q.b(fp.NULL);
                    }
                    this.l = this.q.func_70032_d((Entity)this.a);
                    this.i = this.a.func_174791_d();
                    return;
                }
                if (d10 < 2.0) {
                    this.e.func_187227_b(e2.M, (Object)1);
                    this.c.func_75497_a((Entity)this.r, 0.5);
                    this.q.a(em.a.a.WALK);
                    break;
                }
                this.e.func_187227_b(e2.M, (Object)1);
                this.c.func_75497_a((Entity)this.r, 0.7);
                this.q.a(em.a.a.RUN);
                break;
            }
            case FOLLOW: {
                this.e.func_187227_b(e2.M, (Object)0);
                double d11 = this.q.func_70032_d((Entity)this.a);
                if ((double)this.c.func_111269_d() > d11) {
                    this.c.func_75499_g();
                    if (!this.q.N) {
                        this.c.func_75497_a((Entity)this.a, 0.5);
                        this.a();
                    }
                } else {
                    this.c();
                }
                this.j = 300;
                this.b();
                break;
            }
            case IDLE: {
                this.e.func_187227_b(e2.M, (Object)0);
                if (!this.q.N) {
                    if (++this.j > 200 + com.trolmastercard.sexmod.r.f.nextInt(100)) {
                        this.j = 0;
                        Vec3d vec3d = this.a.func_174791_d();
                        Vec3d vec3d2 = new Vec3d(vec3d.field_72450_a + 1.0 + (double)(com.trolmastercard.sexmod.r.f.nextFloat() * 3.0f), vec3d.field_72448_b, vec3d.field_72449_c + 1.0 + (double)(com.trolmastercard.sexmod.r.f.nextFloat() * 3.0f));
                        this.c.func_75499_g();
                        this.c.func_75492_a(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, 0.5);
                    }
                    this.b();
                    break;
                }
                if (!(this.q.func_70032_d((Entity)this.a) > 10.0f)) break;
                this.c();
                break;
            }
            case RIDE: {
                if (this.q.func_184218_aH()) {
                    this.q.b(fp.SIT);
                    break;
                }
                this.q.func_189654_d(true);
                this.q.field_70145_X = true;
                Vec3d vec3d = this.a.func_174791_d().func_178786_a(this.o.func_70040_Z().field_72450_a * 0.5, 0.0, this.o.func_70040_Z().field_72449_c * 0.5);
                this.q.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, 0.0f, 0.0f);
                this.q.field_70159_w = 0.0;
                this.q.field_70181_x = 0.0;
                this.q.field_70179_y = 0.0;
                this.q.b(fp.RIDE);
                break;
            }
            case DOWNED: {
                this.c.func_75499_g();
            }
        }
    }

    @Override
    protected f.a.a a() {
        float f10;
        boolean bl2;
        Entity entity;
        --this.n;
        if (this.q.N || this.q.ae() != null) {
            return f.a.a.DOWNED;
        }
        if (this.a.func_184218_aH()) {
            entity = this.a.func_184187_bx();
            if (this.q.func_184218_aH() || this.q.func_184220_m(entity) || entity instanceof EntityHorse && ((EntityHorse)entity).func_110257_ck()) {
                this.o = entity;
                return f.a.a.RIDE;
            }
        } else if (!this.a.func_184218_aH() && this.q.func_184218_aH() || this.f == f.a.a.RIDE && !this.a.func_184218_aH()) {
            this.q.b(fp.NULL);
            this.q.func_184210_p();
            this.q.field_70145_X = false;
            this.q.func_189654_d(false);
        }
        if (this.a(this.r)) {
            return f.a.a.ATTACK;
        }
        DamageSource damageSource = this.q.func_189748_bU();
        if (damageSource != null && this.a((EntityLivingBase)(entity = (EntityLivingBase)damageSource.func_76346_g()))) {
            this.r = entity;
            return f.a.a.ATTACK;
        }
        entity = this.a.func_110144_aD();
        if (this.a.field_70173_aa - this.a.func_142013_aG() < 140 && this.a((EntityLivingBase)entity)) {
            this.r = entity;
            return f.a.a.ATTACK;
        }
        if (this.f != f.a.a.FOLLOW) {
            damageSource = this.a.func_189748_bU();
            if (damageSource != null && this.a((EntityLivingBase)(entity = (EntityLivingBase)damageSource.func_76346_g()))) {
                this.r = entity;
                return f.a.a.ATTACK;
            }
            Vec3d vec3d = this.q.func_174791_d();
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB(vec3d.field_72450_a - 5.0, vec3d.field_72448_b - 2.0, vec3d.field_72449_c - 5.0, vec3d.field_72450_a + 5.0, vec3d.field_72448_b + 2.0, vec3d.field_72449_c + 5.0);
            List list = this.q.field_70170_p.func_72872_a(EntityMob.class, axisAlignedBB);
            list.sort((entityMob, entityMob2) -> {
                double d10;
                double d11 = entityMob.func_70032_d((Entity)this.q);
                if (d11 == (d10 = (double)entityMob2.func_70032_d((Entity)this.q))) {
                    return 0;
                }
                return d11 < d10 ? -1 : 1;
            });
            for (EntityMob entityMob3 : list) {
                if (!this.a((EntityLivingBase)entityMob3) || entityMob3 instanceof EntityCreeper) continue;
                this.r = entityMob3;
                return f.a.a.ATTACK;
            }
        }
        boolean bl3 = bl2 = (f10 = this.q.func_70032_d((Entity)this.a)) > 5.0f;
        if (!bl2 && this.f == f.a.a.FOLLOW) {
            if (++this.m > 60) {
                bl2 = false;
                this.m = 0;
            } else {
                bl2 = true;
            }
        }
        if (bl2 && this.f == f.a.a.ATTACK) {
            this.n = 60;
        }
        if (bl2) {
            return f.a.a.FOLLOW;
        }
        return f.a.a.IDLE;
    }

    public void e() {
        EntityArrow entityArrow = this.b();
        double d10 = this.r.field_70165_t - this.q.field_70165_t;
        double d11 = this.r.func_174813_aQ().field_72338_b + (double)(this.r.field_70131_O / 3.0f) - entityArrow.field_70163_u;
        double d12 = this.r.field_70161_v - this.q.field_70161_v;
        double d13 = MathHelper.func_76133_a((double)(d10 * d10 + d12 * d12));
        entityArrow.func_70186_c(d10, d11 + d13 * (double)0.2f, d12, 1.6f, 2.0f);
        this.q.func_184185_a(SoundEvents.field_187866_fi, 1.0f, 1.0f / (this.q.func_70681_au().nextFloat() * 0.4f + 0.8f));
        this.q.field_70170_p.func_72838_d((Entity)entityArrow);
        entityArrow.func_70239_b(4.5);
    }

    protected EntityArrow b() {
        EntityTippedArrow entityTippedArrow;
        block2: {
            entityTippedArrow = new EntityTippedArrow(this.q.field_70170_p, (EntityLivingBase)this.q);
            ItemStack itemStack = this.q.Q.getStackInSlot(1);
            double d10 = EnchantmentHelper.func_77506_a((Enchantment)Enchantments.field_185309_u, (ItemStack)itemStack);
            int n2 = EnchantmentHelper.func_77506_a((Enchantment)Enchantments.field_185310_v, (ItemStack)itemStack);
            int n3 = EnchantmentHelper.func_77506_a((Enchantment)Enchantments.field_185311_w, (ItemStack)itemStack);
            if (d10 != 0.0) {
                entityTippedArrow.func_70239_b(entityTippedArrow.func_70242_d() + d10 * 0.5 + 0.5);
            }
            if (n2 != 0) {
                entityTippedArrow.func_70240_a(n2);
            }
            if (n3 == 0) break block2;
            entityTippedArrow.func_70015_d(100);
        }
        return entityTippedArrow;
    }

    void d() {
        this.q.b(fp.ATTACK);
        this.e.func_187227_b(e2.M, (Object)1);
        ItemStack itemStack = this.q.Q.getStackInSlot(0);
        Multimap multimap = itemStack.func_111283_C(EntityEquipmentSlot.MAINHAND);
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (AttributeModifier attributeModifier : multimap.get((Object)SharedMonsterAttributes.field_111264_e.func_111108_a())) {
            f10 = (float)attributeModifier.func_111164_d();
        }
        for (AttributeModifier attributeModifier : multimap.get((Object)SharedMonsterAttributes.field_188790_f.func_111108_a())) {
            f11 = (float)attributeModifier.func_111164_d();
        }
        f11 = Math.max(f11, 0.5f);
        float f12 = EnchantmentHelper.func_152377_a((ItemStack)itemStack, (EnumCreatureAttribute)this.r.func_70668_bt());
        int n2 = EnchantmentHelper.func_77506_a((Enchantment)Enchantments.field_180313_o, (ItemStack)itemStack);
        int n3 = EnchantmentHelper.func_77506_a((Enchantment)Enchantments.field_77334_n, (ItemStack)itemStack);
        int n4 = EnchantmentHelper.func_77506_a((Enchantment)Enchantments.field_191530_r, (ItemStack)itemStack);
        this.r.func_70653_a((Entity)this.q, (float)n2 * 0.5f, (double)MathHelper.func_76126_a((float)(this.q.field_70177_z * ((float)Math.PI / 180))), (double)(-MathHelper.func_76134_b((float)(this.q.field_70177_z * ((float)Math.PI / 180)))));
        this.r.func_70015_d(n3 * 4);
        if (n4 != 0) {
            float f13 = 0.5f;
            if (n4 == 2) {
                f13 = 0.67f;
            } else if (n4 == 3) {
                f13 = 0.75f;
            }
            for (EntityLivingBase entityLivingBase : this.q.field_70170_p.func_72872_a(EntityLivingBase.class, this.r.func_174813_aQ().func_72314_b(1.0, 0.25, 1.0))) {
                if (entityLivingBase == this.q || entityLivingBase == this.a || entityLivingBase == this.r || this.q.func_184191_r((Entity)entityLivingBase) || !(this.q.func_70068_e((Entity)entityLivingBase) < 9.0)) continue;
                entityLivingBase.func_70653_a((Entity)this.q, 0.4f, (double)MathHelper.func_76126_a((float)(this.q.field_70177_z * ((float)Math.PI / 180))), (double)(-MathHelper.func_76134_b((float)(this.q.field_70177_z * ((float)Math.PI / 180)))));
                entityLivingBase.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this.q), (f10 + f12) * f13);
            }
        }
        this.r.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this.q), f10 + f12);
        this.k = Math.round(Math.abs(f11) / 3.373494f * 20.0f);
    }

    @Override
    protected double b() {
        double d10 = super.b();
        if (this.q.N) {
            d10 = 0.0;
        }
        this.c.func_75489_a(d10);
        this.q.a(this.q.q());
        return d10;
    }

    @Override
    public void func_75251_c() {
        super.func_75251_c();
        this.q.func_184212_Q().func_187227_b(e2.M, (Object)0);
    }

    void a() {
        if (this.q.field_70122_E || this.q.func_70090_H() || this.q.field_70159_w + this.q.field_70179_y != 0.0 || this.q.field_70181_x <= 0.0) {
            return;
        }
        Vec3d vec3d = new Vec3d(0.0, 0.0, (double)0.1f);
        vec3d = ck.a(vec3d, this.q.field_70177_z);
        this.q.field_70159_w = vec3d.field_72450_a;
        this.q.field_70179_y = vec3d.field_72449_c;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

