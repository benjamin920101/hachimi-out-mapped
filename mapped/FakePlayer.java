/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1;
import mapped.Class1468;
import mapped.Class229;
import mapped.Class278;
import mapped.Class50;
import mapped.Class556;
import mapped.Class5836;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FakePlayer
extends Class278 {
    private static long[] field2338 = new long[1];
    private Class1468 field2339;

    @Class1
    public void method10355(Class50 a2) {
        if (FakePlayer.method10357(a2).equals((Object)FakePlayer.field290.field_1724) && a2.method101().equals((Object)this.field2339)) {
            a2.method14((boolean)field2338[0]);
        }
    }

    public static Class1468 method10356(FakePlayer class449) {
        return class449.field2339;
    }

    public FakePlayer() {
        super("FakePlayer", "Spawns an indestructible client-side player", Class556.field2756);
    }

    static {
        FakePlayer.method10359(3453607779741468131L);
    }

    private static class_1297 method10357(Class50 class50) {
        return class50.method102();
    }

    @Override
    public void method1279() {
        if (this.field2339 != null) {
            this.field2339.method14392();
            this.field2339 = null;
        }
    }

    @Class1
    public void method10358(Class229 a2) {
        this.field2339 = null;
        this.method1268();
    }

    private static void method10359(long l2) {
        FakePlayer.field2338[0] = l2 ^ 0x2FEDADFA490405E2L;
    }

    @Override
    public void method1274() {
        if (FakePlayer.field290.field_1724 != null && FakePlayer.field290.field_1687 != null) {
            this.field2339 = new Class1468((class_1657)FakePlayer.field290.field_1724, "FakePlayer");
            FakePlayer.method10356(this).method14391();
        }
    }

    public static CallSite j9nMoGtL5qoEwwQe(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(FakePlayer.qmzo1LNe3DTHdorc(string7), FakePlayer.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(FakePlayer.qmzo1LNe3DTHdorc(string5)), FakePlayer.qmzo1LNe3DTHdorc(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(FakePlayer.qmzo1LNe3DTHdorc(string5)), FakePlayer.qmzo1LNe3DTHdorc(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String qmzo1LNe3DTHdorc(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x158A20F3));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static void method10360(float f2) {
        Class5836.method22907(f2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

