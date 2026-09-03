package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.f_;
import com.trolmastercard.sexmod.f2;
import com.trolmastercard.sexmod.fp;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.math.Vec3d;
import java.util.UUID;
import javax.annotation.Nullable;

// bh
public interface bh {
    public void b();
}
// fg
public interface fg {
    public void a();
}
// dr
public interface dr {
    public boolean a();
}
// h_
@FunctionalInterface
public interface h_ {
    public boolean a(f_ var1);
}
// ef$a
@FunctionalInterface
public static interface ef.a {
    public float a(int var1, float var2);
}
// u
@FunctionalInterface
public interface u {
    public void a(f, var1);
}
// ao
@FunctionalInterface
public interface ao {
    public void a(f_ var1);
}
// b2
@FunctionalInterface
public interface b2 {
    public void a(f_ var1);
}
// gt
@FunctionalInterface
public interface gt {
    public float a(em var1);
}
// g1
public interface g1 {
    public boolean a(f_ var1);
}
// b7
public interface b7 {
    public f2 d();

    public boolean c();

    public boolean a();

    public boolean b();
}
// at
public interface at {
    public ModelRenderer a();
}
// ar
@FunctionalInterface
public interface ar {
    public Vec3d a(em var1);
}
// b8
@FunctionalInterface
public interface b8 {
    public Vec3d a(em var1);
}
// ai 
public interface ai {
    @Nullable
    public UUID e();

    public void a(UUID var1);

    public int c();

    public void c(int var1);

    public int a();

    public void a(int var1);

    public int d();

    public void a(fp var1);

    public fp b();

    public void b(int var1);
}
// gs

public interface gs {
    default public String[] c() {
        return new String[0];
    }

    default public String[] g() {
        return new String[0];
    }

    default public String[] f() {
        return new String[0];
    }

    default public String[] a() {
        return new String[0];
    }

    default public String[] h() {
        return new String[0];
    }

    default public String[] e() {
        return new String[0];
    }

    default public String[] b() {
        return new String[0];
    }

    default public String[] d() {
        return new String[0];
    }