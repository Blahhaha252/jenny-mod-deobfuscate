/*
 * Decompiled with CFR 0.152.
 */
package com.trolmastercard.sexmod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class gl<K, V> {
    private final HashMap<K, V> b = new HashMap();
    private final HashMap<V, K> a = new HashMap();

    public void a(K k, V v) {
        V v2 = this.b.put(k, v);
        this.a.remove(v2);
        this.a.put(v, k);
    }

    public V c(K k) {
        return this.b.get(k);
    }

    public K b(V v) {
        return this.a.get(v);
    }

    public int e() {
        return this.b.size();
    }

    public void a(K k) {
        block0: {
            V v = this.b.get(k);
            if (v == null) break block0;
            this.b.remove(k);
            this.a.remove(v);
        }
    }

    public Set<Map.Entry<K, V>> c() {
        return this.b.entrySet();
    }

    public Set<K> a() {
        return this.b.keySet();
    }

    public Set<V> d() {
        return this.a.keySet();
    }

    public void b() {
        this.a.clear();
        this.b.clear();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}
