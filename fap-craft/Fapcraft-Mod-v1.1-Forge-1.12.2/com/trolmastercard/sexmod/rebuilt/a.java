package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.ClientProxy;
import com.trolmastercard.sexmod.b6;
import com.trolmastercard.sexmod.br;
import com.trolmastercard.sexmod.cy;
import com.trolmastercard.sexmod.e1;
import com.trolmastercard.sexmod.ei;
import com.trolmastercard.sexmod.em;
import com.trolmastercard.sexmod.fw;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.ge;
import com.trolmastercard.sexmod.gq;
import com.trolmastercard.sexmod.gw;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class a extends GuiScreen (
    public static final ResourceLocation k = new ResourceLocation("sexmod", "textures/gui/clothing_icons.png");
    static final int r = 20;
    static final float j = 0.25f;
    int n = 0;
    int l = 0;
    float o = 0.0f;
    public static float b = 0.0f;
    protected static List<Integer> a = nw ArrayList<Integer>();
    protected static int s = 0;
    protected static int h = 0;
    em c;
    boolean p = false;
    gq q;
    public static List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> m = new ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>>();
    final UUID g;
    int i;
    int t;
    public boolean f = false;
    int d = 0;
    int e = 1;
    

    public a(@Nonnull em em2) {
        Object object;
        this.mc = Minecraft.getMinecraft();
        this.g = em2.f();
        fy fy2 = fy.a((Entity)em2);
        if (fy2 == null) {
            fy2 = fy.JENNY;
        }
        try {
            object = fy2.npcClass.getConstructor(World.class);
            this.c = (em)((Object)((Constructor)object).newInstance(this.mc.world));
            this.c.b(true);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.e();
        object = em2.C();
        this.c.getDataManager().set(em.b, object);
        int n = 0;
        for (String string : this.c.Y()) {
            Map.Entry<gw, Map.Entry<List<String>, Integer>> entry;
            gw gw2;
            gw2 = br.e(string);
            if (gw.CUSTOM_BONE.equals((Object)gw2)){
                ++n;
            }
            entry = null;
            if (gw.CUSTOM_BONE.equals((Object)gw2) && n > 1) {
                entry = com.trolmastercard.sexmod.a.b(this.c);
            } else {
                for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry2 : m) {
                    if (!entry2.getKey().equals((Object)gw2)) continue;
                    entry = entry2;
                }
            }
            if (entry == null) {
                continue;
            }
            m.remove(entry);
            int n2 = entry.getValue().getKey().indexOf(string);
            if (n2 == -1) {
                n2 = 0;
            }
            entry.getValue().setValue(n2);
            m.add(entry);
        }
    }

    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.q.handleMouseInput();
    }

    public static HashSet<String> b() {
        HashSet<String> hashSet = new HashSet<String>();
        for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
            if (entry.getValue().getKey().size() == 1) {
                continue;
            }
            Map.Entry<List<String>, Integer> entry2 = entry.getValue();
            List<String> list = entry2.getKey();
            Integer n = entry2.getValue();
            hashSet.add(list.get(n));
        }
        return hashSet;
    }

    public static Map.Entry<gw, Map.Entry<List<String>, Integer>> b(em em2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("cross");
        arrayList.addAll((Collection)br.a(em2).get((Object)gw.CUSTOM_BONE));
        return new AbstractMap.SimpleEntry<gw, Map.Entry<List<String>, Integer>>(gw.CUSTOM_BONE, new AbstractMap.SimpleEntry(arrayList, 0));
    }

    void e() {
        m.clear();
        List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> list = this.c.d(this.g);
        this.i = list.size();
        m.addAll(list);
        for (gw gw2 : gw.values()) {
            if (gw2 == gw.GIRL_SPECIFIC) {
                continue;
            }
            ArrayList<String> object2 = new ArrayList<String>();
            object2.add("cross");
            m.add(new AbstractMap.SimpleEntry(gw2, new AbstractMap.SimpleEntry(object2, 0)));
        }
        for (Map.Entry entry : br.a(this.c).entrySet()) {
            Map.Entry<gw, Map.Entry<List<String>, Integer>> object = null;
            for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry2 : m) {
                if (!((gw)((Object)entry.getKey())).equals((Object)entry2.getKey())) continue;
                object = entry2;
            }
            if (object == null) {
                continue;
            }
            int n = m.indexOf(object);
            m.remove(object);
            object.getValue().getKey().addAll((Collection)entry.getValue());
            m.add(n, object);
        }
    }

    public void initGui() {
        this.q = new gq(this.mc, this);
    }

    public void setWorldAndResolution(Minecraft minecraft, int n, int n2) {
        super.setWorldAndResolution(minecraft, n, n2);
        this.n = this.a(76.0f);
        this.l = this.b(89.0f);
        this.o = 90.0f;
    }

    boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        return n >= n3 && n <= n5 && n2 >= n4 && n2 <= n6;
    }
    
    
    public void a(int n2, int n3, float f, cy cy2) {
        this.a(n2, n3, f, cy2, 1.876945f);
    }
    
    public void drawScreen(int n, int n2, float f) {
        int n3;
        super.drawScreen(n, n2, f);
        if (this.p) {
            b += b6.a((float)h, (float)s, f);
        }
        this.a();
        this.mc.renderEngine.bindTexture(k);
        int n7 = this.n - this.a(15.0f);
        int n8 = this.l - 20;
        n3 = this.a(n, n2, n7, n8, n7 + 20, n8 + 20) ? 40 : 20;
        this.drawTexturedModalRect(n7, n8, 100, n3, 20, 20);
        if (br.g() == null) {
            this.b(n7, n, n2);
        }
        this.a(this.n, this.l, this.o, (EntityLivingBase)this.c, 1.2345679f);
        this.c.onUpdate();
        this.q.drawScreen(n, n2, f);
    }
    
    
    

    void b(int n, int n2, int n3) {
        int n4;
        int n8;
        int n12;
        int n16 = this.l - 40;
        n12 = this.a(n2, n3, n, n16, n + 20, n16 + 20) ? 40 : 20;
        this.drawTexturedModalRect(n, n16, 120, n12, 20, 20);
        n16 -= 20;
        n8 = this.a(n2, n3, n, n16, n + 20, n16 + 20) ? 170 : 150;
        this.drawTexturedModalRect(n, n16, 20, n8, 20, 20);
        n16 -= 20;
        n4 = this.a(n2, n3, n, n16, n + 20, n16 + 20) ? 170 : 150;
        this.drawTexturedModalRect(n, n16, 0, n4, 20, 20);
    }

    public boolean doesGuiPauseGame() {
        return false;
    }

    void c() {
        this.mc.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
        HashSet<String> hashSet = new HashSet<String>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
            if (entry.getKey() == gw.GIRL_SPECIFIC) {
                arrayList.add(entry.getValue().getValue());
                continue;
            }
            Map.Entry<List<String>, Integer> entry2 = entry.getValue();
            Integer n2 = entry2.getValue();
            if (n2 == 0) {
                continue;
            }
            String string = entry2.getKey().get(n2);
            hashSet.add(string);
        }
        ge.b.sendToServer((IMessage)new fw(em.a(hashSet), this.g, arrayList));
        this.mc.player.closeScreen();
    }
    
    
    public void a(gw, gw, boolean bl, int n2) {
        int n3;
        int n4;
        Object object;
        int n5;
        int n6;
        ArrayList<Integer> arrayList;
        ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>> arrayList2;
        this.mc.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
        arrayList2 = new ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>>();
        arrayList = new ArrayList<Integer>();
        int n7 = 0;
        for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
            if (entry.getKey().equals((Object)gw2)) {
                arrayList2.add(entry);
                arrayList.add(n7);
            }
            ++n7;
        }
        if (arrayList2.size() == 0) {
            return;
        }
        if (arrayList2.size() == 1) {
            object = (Map.Entry)arrayList2.get(0);
            n4 = (Integer)arrayList.get(0);
        } else {
            if (this.i == 0 || n2 > this.i - 1 + gw.a()) {
                n6 = n2 - (this.i + gw.a());
            } else {
                n6 = n2;
            }
            object = (Map.Entry)arrayList2.get(n6);
            n4 = (Integer)arrayList.get(n6);
        }
        if (object == null) {
            return;
        }
        Map.Entry entry = (Map.Entry)object.getValue();
        n3 = (Integer)entry.getValue();
        n5 = ((List)entry.getKey()).size();
        if (bl) {
            if (++n3 >= n5) {
                n3 = 0;
            }
        } else {
            if (--n3 < 0) {
                n3 = n5 - 1;
            }
        }
        m.set(n4, new AbstractMap.SimpleEntry(object.getKey(), new AbstractMap.SimpleEntry(((Map.Entry)object.getValue()).getKey(), n3)));
        ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>> arrayList3 = new ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>>();
        for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
            if (entry.getKey() != gw.GIRL_SPECIFIC) continue;
            arrayList3.add(entry);
        }
        this.c.b(arrayList3);
    }
    public void a(gw gw2, boolean bl, int n2) {
        int n3;
        int n4;
        Object object;
        block20: {
            int n5;
            block19: {
                block22: {
                    int n6;
                    ArrayList<Integer> arrayList;
                    ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>> arrayList2;
                    block23: {
                        block18: {
                            block21: {
                                this.mc.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
                                arrayList2 = new ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>>();
                                arrayList = new ArrayList<Integer>();
                                int n7 = 0;
                                for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
                                    if (entry.getKey().equals((Object)gw2)) {
                                        arrayList2.add(entry);
                                        arrayList.add(n7);
                                    }
                                    ++n7;
                                }
                                if (arrayList2.size() == 0) {
                                    return;
                                }
                                if (arrayList2.size() != 1) break block21;
                                object = (Map.Entry)arrayList2.get(0);
                                n4 = (Integer)arrayList.get(0);
                                break block22;
                            }
                            if (this.i != 0 && n2 <= this.i - 1 + gw.a()) break block18;
                            n6 = n2 - (this.i + gw.a());
                            break block23;
                        }
                        n6 = n2;
                    }
                    object = (Map.Entry)arrayList2.get(n6);
                    n4 = (Integer)arrayList.get(n6);
                }
                if (object == null) {
                    return;
                }
                Map.Entry entry = (Map.Entry)object.getValue();
                n3 = (Integer)entry.getValue();
                n5 = ((List)entry.getKey()).size();
                if (!bl) break block19;
                if (++n3 < n5) break block20;
                n3 = 0;
                break block20;
            }
            if (--n3 < 0) {
                n3 = n5 - 1;
            }
        }
        m.set(n4, new AbstractMap.SimpleEntry(object.getKey(), new AbstractMap.SimpleEntry(((Map.Entry)object.getValue()).getKey(), n3)));
        ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>> arrayList = new ArrayList<Map.Entry<gw, Map.Entry<List<String>, Integer>>>();
        for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
            try {
                if (entry.getKey() != gw.GIRL_SPECIFIC) continue;
                arrayList.add(entry);
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.a.a(runtimeException);
            }
        }
        this.c.b(arrayList);
    }

    

    public void a(cy cy2) {
        int n2;
        float f;
        cy cy3;
        float f2;
        int n3;
        int n4;
        a a2;
        try {
            a2 = this;
            n4 = this.n;
            n3 = this.l;
            f2 = this.o;
            cy3 = cy2;
            f = 2.876945f;
            n2 = cy2.f ? 1 : 0;
        }
        catch (RuntimeException runtimeException) {
            throw com.trolmastercard.sexmod.a.a(runtimeException);
        }
        a2.a(n4, n3, f2, cy3, f, n2);
    }

    public void a(String string, int n2, int n3) {
        this.drawHoveringText(string, n2, n3);
    }

    protected void mouseClickMove(int n2, int n3, int n4, long l) {
        try {
            super.mouseClickMove(n2, n3, n4, l);
            if (n4 != 0) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw com.trolmastercard.sexmod.a.a(runtimeException);
        }
        try {
            if (n2 < this.width / 2) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw com.trolmastercard.sexmod.a.a(runtimeException);
        }
        int n5 = n2 - this.t;
        a.add(n5);
        this.t = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void mouseClicked(int n2, int n3, int n4) throws IOException {
        try {
            super.mouseClicked(n2, n3, n4);
            this.q.mouseClicked(n2, n3, n4);
            if (n4 != 0) {
                return;
            }
        }
        catch (URISyntaxException uRISyntaxException) {
            throw com.trolmastercard.sexmod.a.a(uRISyntaxException);
        }
        this.f = true;
        this.p = true;
        this.t = n2;
        int n5 = this.n - this.a(15.0f);
        int n6 = this.l - 20;
        try {
            if (this.a(n2, n3, n5, n6, n5 + 20, n6 + 20)) {
                this.c();
            }
        }
        catch (URISyntaxException uRISyntaxException) {
            throw com.trolmastercard.sexmod.a.a(uRISyntaxException);
        }
        try {
            if (br.g() != null) {
                return;
            }
        }
        catch (URISyntaxException uRISyntaxException) {
            throw com.trolmastercard.sexmod.a.a(uRISyntaxException);
        }
        n6 = this.l - 40;
        if (this.a(n2, n3, n5, n6, n5 + 20, n6 + 20)) {
            this.mc.getSoundHandler().playSound((ISound)PositionedSoundRecord.getMasterRecord((SoundEvent)SoundEvents.UI_BUTTON_CLICK, (float)1.0f));
            this.mc.player.closeScreen();
            int n7 = br.b(true);
            try {
                if (n7 != 0) {
                    br.d = true;
                    return;
                }
            }
            catch (URISyntaxException uRISyntaxException) {
                throw com.trolmastercard.sexmod.a.a(uRISyntaxException);
            }
            em em2 = em.b(this.g);
            try {
                if (em2 == null) return;
                com.trolmastercard.sexmod.a.a(em2);
                return;
            }
            catch (URISyntaxException uRISyntaxException) {
                throw com.trolmastercard.sexmod.a.a(uRISyntaxException);
            }
        }
        try {
            if (this.a(n2, n3, n5, n6 -= 20, n5 + 20, n6 + 20)) {
                Desktop.getDesktop().open(new File(br.d()));
                return;
            }
        }
        catch (URISyntaxException uRISyntaxException) {
            throw com.trolmastercard.sexmod.a.a(uRISyntaxException);
        }
        try {
            if (!this.a(n2, n3, n5, n6 -= 20, n5 + 20, n6 + 20)) return;
            try {
                Desktop.getDesktop().browse(new URI("http://fapcraft.org/assets/video/tutorial/girl_wand.mp4"));
                return;
            }
            catch (URISyntaxException uRISyntaxException) {
                throw new RuntimeException(uRISyntaxException);
            }
        }
        catch (IOException iOException) {
            throw com.trolmastercard.sexmod.a.a(iOException);
        }
    }

    protected void mouseReleased(int n2, int n3, int n4) {
        try {
            super.mouseReleased(n2, n3, n4);
            if (n4 == 0) {
                this.p = false;
                this.f = false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw com.trolmastercard.sexmod.a.a(runtimeException);
        }
        this.d = h;
    }

    int a(float f) {
        return Math.round((float)this.width * (f / 100.0f));
    }

    int b(float f) {
        return Math.round((float)this.height * (f / 100.0f));
    }

    public void onGuiClosed() {
        super.onGuiClosed();
        this.c.world.removeEntityDangerously((Entity)this.c);
        a.clear();
        m.clear();
    }

    public em d() {
        return this.c;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.mc.renderEngine.bindTexture(k);
        this.drawTexturedModalRect(n2, n3, n4, n5, 20, 20);
    }

    public void a(int n2, int n3, int n4) {
        this.a(n2, n3, n4, 0);
    }

    public void a(int n2, int n3, e1 e12) {
        this.a(n2, n3, e12.c, e12.b);
    }

    void a(int n2, int n3, float f, EntityLivingBase entityLivingBase, float f2) {
        this.a(n2, n3, f, entityLivingBase, f2, 0);
    }

    void a(int n2, int n3, float f, EntityLivingBase entityLivingBase, float f2, int n4) {
        float f4 = entityLivingBase.renderYawOffset;
        float f5 = entityLivingBase.rotationYaw;
        float f6 = entityLivingBase.rotationPitch;
        float f8 = entityLivingBase.prevRotationYawHead;
        float f9 = entityLivingBase.rotationYawHead;
        entityLivingBase.renderYawOffset = 0.0f;
        entityLivingBase.rotationYaw = 0.0f;
        entityLivingBase.rotationPitch = 0.0f;
        entityLivingBase.prevRotationYawHead = 0.0f;
        entityLivingBase.rotationYawHead = 0.0f;
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)n2, (float)n3, (float)50.0f);
        GlStateManager.scale((float)(-f), (float)f, (float)f);
        GlStateManager.rotate((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GlStateManager.rotate((float)135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate((float)-135.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.translate((float)0.0f, (float)0.0f, (float)n4);
        GlStateManager.rotate((float)b, (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)0.25f, (float)1.0f, (float)0.0f, (float)0.0f);
        GlStateManager.translate((float)0.0f, (float)0.0f, (float)0.0f);
        RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
        renderManager.setPlayerViewY(180.0f);
        renderManager.setRenderShadow(false);
        renderManager.renderEntity((Entity)entityLivingBase, 0.0, 0.0, 0.0, 0.0f, f2, false);
        renderManager.setRenderShadow(true);
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture((int)OpenGlHelper.defaultTexUnit);
        entityLivingBase.renderYawOffset = f4;
        entityLivingBase.rotationYaw = f5;
        entityLivingBase.rotationPitch = f6;
        entityLivingBase.prevRotationYawHead = f8;
        entityLivingBase.rotationYawHead = f9;
    }

    void a() {
        if (this.p) {
            return;
        }

        float fps = Minecraft.getDebugFPS();
        if (fps == 0.0f) {
            fps = 0.1f;
        }

        if (this.d == 0) {
            b += (float)(this.e * 10) / fps;
            return;
        }

        b += (float)this.d / fps;

        this.d = (int)((float)this.d * (1.0f - 0.25f / fps));

        if (Math.abs(this.d) > 10) {
            return;
        }

        this.e = this.d > 0 ? 1 : -1;
        this.d = 0;
    }

    @SideOnly(value=Side.CLIENT)
    public static void a(@Nonnull em em2) {
        boolean bl;
        Minecraft minecraft;
        block11: {
            block10: {
                minecraft = Minecraft.getMinecraft();
                try {
                    if (minecraft.currentScreen instanceof a) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.a.a(runtimeException);
                }
                try {
                    try {
                        if (br.g() != null && !br.b()) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw com.trolmastercard.sexmod.a.a(runtimeException);
                    }
                    bl = true;
                    break block11;
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.a.a(runtimeException);
                }
            }
            bl = false;
        }
        boolean bl2 = bl;
        try {
            if (!bl2) {
                minecraft.player.sendStatusMessage((ITextComponent)new TextComponentString("You have to whitelist the server to use its custom models. " + TextFormatting.YELLOW + "/whitelistserver"), true);
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw com.trolmastercard.sexmod.a.a(runtimeException);
        }
        minecraft.addScheduledTask(() -> minecraft.displayGuiScreen((GuiScreen)new a(em2)));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @SideOnly(value=Side.CLIENT)
    public static class b {
        @SubscribeEvent
        @SideOnly(value=Side.CLIENT)
        public void a(InputEvent.KeyInputEvent keyInputEvent) {
            block13: {
                boolean bl;
                block15: {
                    block14: {
                        try {
                            if (!ClientProxy.keyBindings[1].isPressed()) {
                                return;
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.a$b.a(runtimeException);
                        }
                        try {
                            try {
                                if (!br.d) break block13;
                                if (0 == br.b(true)) break block14;
                            }
                            catch (RuntimeException runtimeException) {
                                throw com.trolmastercard.sexmod.a$b.a(runtimeException);
                            }
                            bl = true;
                            break block15;
                        }
                        catch (RuntimeException runtimeException) {
                            throw com.trolmastercard.sexmod.a$b.a(runtimeException);
                        }
                    }
                    bl = false;
                }
                try {
                    br.d = bl;
                    if (br.d) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw com.trolmastercard.sexmod.a$b.a(runtimeException);
                }
            }
            Minecraft minecraft = Minecraft.getMinecraft();
            ei ei2 = ei.d(minecraft.player.getPersistentID());
            try {
                if (ei2 == null) {
                    minecraft.player.sendStatusMessage((ITextComponent)new TextComponentString("You have to turn into the girl you want to customize"), true);
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw com.trolmastercard.sexmod.a$b.a(runtimeException);
            }
            com.trolmastercard.sexmod.a.a(ei2);
        }

        @SubscribeEvent
        @SideOnly(value=Side.CLIENT)
        public void a(TickEvent.ClientTickEvent clientTickEvent) {
            h = s;
            s = 0;
            for (Integer n : a) {
                s += n.intValue();
            }
            a.clear();
        }

        private static RuntimeException a(RuntimeException runtimeException) {
            return runtimeException;
        }
    }
)