/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 */
package com.trolmastercard.sexmod;

import com.trolmastercard.sexmod.c8;
import com.trolmastercard.sexmod.fy;
import com.trolmastercard.sexmod.gw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import net.minecraft.util.ResourceLocation;

public static class br.b.b {
    gw d;
    HashSet<fy> g = new HashSet();
    HashSet<String> b = new HashSet();
    String k;
    String j;
    boolean c;
    c8 e;
    float m = 1.0f;
    float a = 0.0f;
    ResourceLocation i;
    ResourceLocation f;
    public String h = null;
    float l;

    public br.b.b(File file, String string) {
        String string2;
        String string3;
        FileInputStream fileInputStream;
        if (string.contains(" ") || string.contains("#") || string.contains("$")) {
            this.h = String.format("You cannot call your custom model '%s'. '#', '$' and spaces are illegal characters", string);
            return;
        }
        if ("cross".equalsIgnoreCase(string)) {
            this.h = "You cannot call your custom model 'cross'. Im sorry, but I need that specific name for internal stuff";
            return;
        }
        Properties properties = new Properties();
        try {
            fileInputStream = new FileInputStream(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            this.h = String.format("couldn't find cfg File for '%s'. It should have been at '%s'. Are you sure it exists?", string, file.getAbsolutePath());
            return;
        }
        try {
            properties.load(fileInputStream);
        }
        catch (IOException iOException) {
            this.h = String.format("couldn't read the cfg File for '%s' at '%s'. It appears to be corrupted. Try making a new one", string, file.getAbsolutePath());
            return;
        }
        String string32 = properties.getProperty("wear_type");
        if (string32 == null) {
            this.h = String.format("The cfg File for the model '%s' at '%s' is missing the 'wear_type'. Go to the bottom of the cfg File and write 'wear_type=HEAD'. Check the cfg files of my examples to see what values for 'wear_type' are possible", string, file.getAbsolutePath());
            return;
        }
        try {
            string32 = string32.replace(" ", "");
            this.d = gw.valueOf(string32);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.h = String.format("you entered '%s' into the 'wear_type' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'wear_type", string32, string, file.getAbsolutePath());
            return;
        }
        if (gw.CUSTOM_BONE.equals((Object)this.d)) {
            this.j = properties.getProperty("custom_bone");
            if ("".equals(this.j)) {
                this.h = String.format("You selected CUSTOM_BONE as the 'wear_type' in the cfg file for '%s' at '%s', yet you left the 'custom_bone' field right underneath it empty. If you want ur model to be parented to a specific bone, you have to enter the name of that bone at the field 'custom_bone'.", string, file.getAbsolutePath());
                return;
            }
        }
        String string4 = properties.getProperty("which_girls");
        string4 = string4.replace(" ", "");
        String[] stringArray2 = string4.split(",");
        for (String stringArray3 : stringArray2) {
            try {
                if ("".equals(stringArray3)) continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.h = String.format("you entered '%s' as one of the girls, you put into the 'which_girls' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_girls'.", stringArray3, string, file.getAbsolutePath());
                return;
            }
            this.g.add(fy.valueOf(stringArray3));
        }
        Object object = properties.getProperty("which_lighting");
        if (object == null) {
            this.h = String.format("The %s's cfg file at '%s' doesn't contain the field 'which_lighting'. Go to the bottom of the cfg file and write either 'which_lighting=DEFAULT', 'which_lighting=SEXMOD', or 'which_lighting=NONE'.", string, file.getAbsolutePath());
            return;
        }
        object = ((String)object).replace(" ", "");
        try {
            this.e = c8.valueOf((String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.h = String.format("you entered '%s' into the 'which_lighting' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'which_lighting'.", object, string, file.getAbsolutePath());
        }
        String string5 = properties.getProperty("author");
        this.k = string5 == null || "".equals(string5) ? "anon" : string5;
        String string6 = properties.getProperty("bones_to_hide");
        if (string6 != null && !"".equals(string6)) {
            string6 = string6.replace(" ", "");
            String[] stringArray = string6.split(",");
            this.b.addAll(Arrays.asList(stringArray));
        }
        if ((string3 = properties.getProperty("enable_when_nude")) == null) {
            this.c = false;
        } else {
            String string7 = string3.replace(" ", "");
            this.c = string7.equalsIgnoreCase("yes");
        }
        String string8 = properties.getProperty("gui_size_factor");
        if (string8 != null && !"".equals(string8)) {
            string8 = string8.replace(" ", "");
            string8 = string8.replace(",", ".");
            try {
                this.m = Float.parseFloat(string8);
            }
            catch (NumberFormatException numberFormatException) {
                this.h = String.format("you entered '%s' into the 'gui_size_factor' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_size_factor'.", string8, string, file.getAbsolutePath());
            }
        }
        if ((string2 = properties.getProperty("gui_vertical_positioning")) != null && !"".equals(string2)) {
            string2 = string2.replace(" ", "");
            string2 = string2.replace(",", ".");
            try {
                this.a = Float.parseFloat(string2);
            }
            catch (NumberFormatException numberFormatException) {
                this.h = String.format("you entered '%s' into the 'gui_vertical_positioning' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'gui_vertical_positioning'.", string2, string, file.getAbsolutePath());
            }
        }
        String string9 = properties.getProperty("version");
        string9 = string9.replace(" ", "");
        string9 = string9.replace(",", ".");
        try {
            this.l = Float.parseFloat(string9);
        }
        catch (NumberFormatException numberFormatException) {
            this.h = String.format("you entered '%s' into the 'versionString' field of the %s's cfg file at '%s'. This is not a valid value. Check my examples on what valid values are to enter into the field 'versionString'.", string9, string, file.getAbsolutePath());
        }
    }

    public String b() {
        return this.j;
    }

    public c8 i() {
        return this.e;
    }

    public float g() {
        return this.a;
    }

    public float d() {
        return this.m;
    }

    public gw j() {
        return this.d;
    }

    public HashSet<fy> l() {
        return this.g;
    }

    public String e() {
        return this.k;
    }

    public boolean a() {
        return this.c;
    }

    public HashSet<String> h() {
        return this.b;
    }

    public ResourceLocation k() {
        return this.i;
    }

    public void a(ResourceLocation resourceLocation) {
        this.i = resourceLocation;
    }

    public ResourceLocation c() {
        return this.f;
    }

    public void b(ResourceLocation resourceLocation) {
        this.f = resourceLocation;
    }

    public float f() {
        return this.l;
    }

    private static FileNotFoundException a(FileNotFoundException fileNotFoundException) {
        return fileNotFoundException;
    }
}
