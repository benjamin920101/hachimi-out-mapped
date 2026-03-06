/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class152;
import mapped.Class1668;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class556;
import net.minecraft.class_1657;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class341
extends Class278 {
    Class248 field961 = this.method450(new Class253("OnlyPlayers", "Only reveal invisible players", (boolean)field962[0]));
    private static long[] field962 = new long[1];

    private static void method3731(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static CallSite jht3jet8QbbqsGeL(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class341.yIDP1Bdw6Bmv5OQP(string7), Class341.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class341.yIDP1Bdw6Bmv5OQP(string5)), Class341.yIDP1Bdw6Bmv5OQP(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class341.yIDP1Bdw6Bmv5OQP(string5)), Class341.yIDP1Bdw6Bmv5OQP(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method3732(long l2) {
        Class341.field962[0] = l2 ^ 0xAE61EF5F40025F5AL;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String yIDP1Bdw6Bmv5OQP(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        block4: while (true) {
            int n3 = n2 < string.length() ? 62191 : 62190;
            block5: while (true) {
                switch (n3) {
                    default: {
                        stringBuilder.append((char)(string.charAt(n2) ^ 0x42878326));
                        ++n2;
                        continue block4;
                    }
                    case 62191: {
                        n3 = 62189;
                        continue block5;
                    }
                    case 62190: 
                }
                break;
            }
            break;
        }
        return stringBuilder.toString();
    }

    public Class341() {
        super("TrueSight", "Allows you to see invisible entities", Class556.field2759);
    }

    static {
        Class341.method3732(-5881156445994328229L);
    }

    private static void method3733(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method3734() {
        Class3979.method19561();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3735(Class152 a2) {
        int n2 = !a2.method297().method_5767() ? 32552 : 32551;
        block4: while (true) {
            switch (n2) {
                case 32552: {
                    n2 = 32550;
                    continue block4;
                }
                case 32551: {
                    if (((Boolean)Class341.method3736(this).method507()).booleanValue() && !(a2.method297() instanceof class_1657)) return;
                    a2.method10();
                    return;
                }
            }
            break;
        }
    }

    public static Class248 method3736(Class341 class341) {
        return class341.field961;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

