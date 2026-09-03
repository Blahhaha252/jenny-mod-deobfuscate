package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.a1;
import com.trolmastercard.sexmod.a6;
import com.trolmastercard.sexmod.a8;
import com.trolmastercard.sexmod.ab;
import com.trolmastercard.sexmod.ac;
import com.trolmastercard.sexmod.aq;
import com.trolmastercard.sexmod.au;
import com.trolmastercard.sexmod.b0;
import com.trolmastercard.sexmod.b1;
import com.trolmastercard.sexmod.b3;
import com.trolmastercard.sexmod.b_;
import com.trolmastercard.sexmod.bd;
import com.trolmastercard.sexmod.bg;
import com.trolmastercard.sexmod.bk;
import com.trolmastercard.sexmod.bo;
import com.trolmastercard.sexmod.bv;
import com.trolmastercard.sexmod.bw;
import com.trolmastercard.sexmod.cd;
import com.trolmastercard.sexmod.ct;
import com.trolmastercard.sexmod.cu;
import com.trolmastercard.sexmod.cz;
import com.trolmastercard.sexmod.dc;
import com.trolmastercard.sexmod.dq;
import com.trolmastercard.sexmod.e6;
import com.trolmastercard.sexmod.ej;
import com.trolmastercard.sexmod.en;
import com.trolmastercard.sexmod.eu;
import com.trolmastercard.sexmod.f3;
import com.trolmastercard.sexmod.fc;
import com.trolmastercard.sexmod.fj;
import com.trolmastercard.sexmod.fw;
import com.trolmastercard.sexmod.g4;
import com.trolmastercard.sexmod.g6;
import com.trolmastercard.sexmod.g9;
import com.trolmastercard.sexmod.g_;
import com.trolmastercard.sexmod.gd;
import com.trolmastercard.sexmod.gf;
import com.trolmastercard.sexmod.gg;
import com.trolmastercard.sexmod.gh;
import com.trolmastercard.sexmod.gk;
import com.trolmastercard.sexmod.gz;
import com.trolmastercard.sexmod.h6;
import com.trolmastercard.sexmod.n;
import com.trolmastercard.sexmod.s;
import com.trolmastercard.sexmod.t;
import com.trolmastercard.sexmod.z;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

// was ge
public class NetworkManager {
    public static SimpleNetworkWrapper  channel;
    public static int newPacketId;
    private static int newPacketId() {
        return newPacketId++;
    }
    
    public static void registerPackets() {
        channel = NetworkRegistry.INSTANCE.newSimpleChannel("sexmodchannel");
        channel.registerMessage(gh.a.class, gh.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(gh.a.class, gh.class, newPacketId(), Side.SERVER);
        channel.registerMessage(gz.a.class, gz.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(a8.a.class, a8.class, newPacketId(), Side.SERVER);
        channel.registerMessage(ac.a.class, ac.class, newPacketId(), Side.SERVER);
        channel.registerMessage(b0.a.class, b0.class, newPacketId(), Side.SERVER);
        channel.registerMessage(dc.a.class, dc.class, newPacketId(), Side.SERVER);
        channel.registerMessage(a1.a.class, a1.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(a1.a.class, a1.class, newPacketId(), Side.SERVER);
        channel.registerMessage(s.a.class, s.class, newPacketId(), Side.SERVER);
        channel.registerMessage(n.a.class, n.class, newPacketId(), Side.SERVER);
        channel.registerMessage(bo.a.class, bo.class, newPacketId(), Side.SERVER);
        channel.registerMessage(gg.a.class, gg.class, newPacketId(), Side.SERVER);
        channel.registerMessage(a6.a.class, a6.class, newPacketId(), Side.SERVER);
        channel.registerMessage(b1.a.class, b1.class, newPacketId(), Side.SERVER);
        channel.registerMessage(t.a.class, t.class, newPacketId(), Side.SERVER);
        channel.registerMessage(bg.a.class, bg.class, newPacketId(), Side.SERVER);
        channel.registerMessage(cz.a.class, cz.class, newPacketId(), Side.SERVER);
        channel.registerMessage(bw.a.class, bw.class, newPacketId(), Side.SERVER);
        channel.registerMessage(b_.a.class, b_.class, newPacketId(), Side.SERVER);
        channel.registerMessage(g4.a.class, g4.class, newPacketId(), Side.SERVER);
        channel.registerMessage(g4.a.class, g4.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(eu.a.class, eu.class, newPacketId(), Side.SERVER);
        channel.registerMessage(f3.a.class, f3.class, newPacketId(), Side.SERVER);
        channel.registerMessage(ej.a.class, ej.class, newPacketId(), Side.SERVER);
        channel.registerMessage(gk.a.class, gk.class, newPacketId(), Side.SERVER);
        channel.registerMessage(dq.a.class, dq.class, newPacketId(), Side.SERVER);
        channel.registerMessage(g9.a.class, g9.class, newPacketId(), Side.SERVER);
        channel.registerMessage(b3.a.class, b3.class, newPacketId(), Side.SERVER);
        channel.registerMessage(b3.a.class, b3.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(fj.a.class, fj.class, newPacketId(), Side.SERVER);
        channel.registerMessage(fc.a.class, fc.class, newPacketId(), Side.SERVER);
        channel.registerMessage(h6.a.class, h6.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(h6.a.class, h6.class, newPacketId(), Side.SERVER);
        channel.registerMessage(au.a.class, au.class, newPacketId(), Side.SERVER);
        channel.registerMessage(en.a.class, en.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(z.a.class, z.class, newPacketId(), Side.SERVER);
        channel.registerMessage(e6.a.class, e6.class, newPacketId(), Side.SERVER);
        channel.registerMessage(bd.a.class, bd.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(gd.a.class, gd.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(fw.a.class, fw.class, newPacketId(), Side.SERVER);
        channel.registerMessage(g_.a.class, g_.class, newPacketId(), Side.SERVER);
        channel.registerMessage(ct.a.class, ct.class, newPacketId(), Side.SERVER);
        channel.registerMessage(g6.a.class, g6.class, newPacketId(), Side.SERVER);
        channel.registerMessage(g6.a.class, g6.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(cu.a.class, cu.class, newPacketId(), Side.SERVER);
        channel.registerMessage(cu.a.class, cu.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(bv.a.class, bv.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(cd.a.class, cd.class, newPacketId(), Side.SERVER);
        channel.registerMessage(gf.a.class, gf.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(bk.a.class, bk.class, newPacketId(), Side.SERVER);
        channel.registerMessage(ab.a.class, ab.class, newPacketId(), Side.CLIENT);
        channel.registerMessage(aq.a.class, aq.class, newPacketId(), Side.CLIENT);
        
    }
}