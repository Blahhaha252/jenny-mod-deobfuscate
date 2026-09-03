package com.trolmastercard.sexmod;
// fm
public enum tribe {
    ACTIVE,
    REST;
}
// gr
public enum gr {
    W, A, S, D;
}
// c8 {
public enum c8 {
    DEFAULT, SEXMOD, NONE;
}
// em$a
public static enum em.a {
    WALK, FAST_WALK, RUN;
}
// gi$a
static enum gi.a {
    FLYING, HOOKED_IN_ENTITY, BOBBING;
}
// f$a
public static enum f.a {
    ATTACK, FOLLOW, IDLE, RIDE, DOWNED;
}
// fn$a
static enum fn.a {
    IDLE("animation.slime.idle"),
    JUMP_START("animation.slime.jumpstart"),
    JUMP_AIR("animation.slime.jumpair"),
    JUMP_END("animation.slime.jumpend");

    String a;

    public String a() {
        return this.a;
    }

    private fn.a(String string2) {
        this.a = string2;
    }
}
// bs$a
public static enum bs.a {
    FALL_TREE(1),
    MINE(3);

    int a;

    private bs.a(int n2) {
        this.a = n2;
    }

    int a() {
        return this.a;
    }
}
// cu$b
public static enum cu.b {
    CFG(".cfg"),
    PNG(".png"),
    GEO(".geo.json");

    public String ending;

    private cu.b(String string2) {
        this.ending = string2;
    }
}
// ba
public enum ba {
    Vags,
    Snis,
    Suk,
    Snok,
    Orpu,
    Dovni,
    Ahza,
    Zarbu,
    Rupli,
    Kagri,
    Nud,
    Gox,
    Vum,
    Snek,
    Aglo,
    Givlu,
    Gukle,
    Vutu,
    Evni,
    Kakla,
    Tuks,
    Nev,
    Kugs,
    Sneks,
    Vihli,
    Snuppu,
    Sogi,
    Guldo,
    Durbi,
    Hikbu,
    Guv,
    San,
    Ken,
    Nern,
    Zogni,
    Ahze,
    Snoblo,
    Snoggi,
    Nutro,
    Vekda,
    Morn,
    Snogs,
    Teg,
    Tigs,
    Rokko,
    Oblu,
    Tihzi,
    Mohru,
    Sahsu,
    Mahlu;

}
// gw
public enum gw {
    GIRL_SPECIFIC,
    HEAD(0, "customHead"),
    FOOT_L(60, "customShoeL"),
    FOOT_R(80, "customShoeR"),
    HAND_L(100, "customHandL"),
    HAND_R(120, "customHandR"),
    CUSTOM_BONE(140);

    public static final String SEPARATOR = "#";
    public int buttonIDPlus;
    public int buttonIDMinus;
    public String boneName = null;
    public int iconXPos = 0;

    private gw() {
    }

    private gw(int n2) {
        this.iconXPos = n2;
    }

    private gw(int n2, String string2) {
        this.iconXPos = n2;
        this.boneName = string2;
        ++r.i;
        this.buttonIDPlus = r.i++;
        this.buttonIDMinus = r.i;
    }

    public static int a() {
        return gw.values().length - 2;
    }
}
