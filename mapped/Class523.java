/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1807;
import mapped.Class3979;
import mapped.Class4196;
import mapped.Class5659;
import mapped.Class5836;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class523
extends Enum {
    public static final /* enum */ Class523 field2585;
    public static final /* enum */ Class523 field2586;
    public static final /* enum */ Class523 field2587;
    private static long[] field2588;
    private static final Class523[] field2589;
    public static final /* enum */ Class523 field2590;
    public static final /* enum */ Class523 field2591;
    public static final /* enum */ Class523 field2592;
    public static final /* enum */ Class523 field2593;

    /*
     * Enabled aggressive block sorting
     */
    public boolean method10849() {
        int n2;
        if (this == field2590) {
            return Class5659.method22111();
        }
        int n3 = 10913;
        block4: while (true) {
            switch (n3) {
                case 10913: {
                    n3 = 10911;
                    continue block4;
                }
                case 10912: {
                    n2 = (int)field2588[1];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field2588[0];
        return n2 != 0;
    }

    public boolean method10850() {
        return (this == field2587 ? (int)field2588[1] : (int)field2588[0]) != 0;
    }

    private static Class523 method10851() {
        return Class523.method10858();
    }

    public static Class523 method10852(String a2) {
        return Enum.valueOf(Class523.class, a2);
    }

    private static Class523 method10853() {
        return Class523.method10870();
    }

    public static Class523 method10854() {
        return field2586;
    }

    public static Class523 method10855() {
        return field2586;
    }

    private static String A41kJG4n1vGFHJHN(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x49031B5B));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static Class523 method10856() {
        return field2585;
    }

    private static boolean method10857(int n2) {
        return Class4196.method20803(n2);
    }

    public static Class523 method10858() {
        return field2585;
    }

    private static Class523[] method10859() {
        Class523[] class523Array = new Class523[(int)field2588[2]];
        class523Array[(int)Class523.field2588[0]] = field2590;
        class523Array[(int)Class523.field2588[1]] = Class523.method10855();
        class523Array[(int)Class523.field2588[7]] = field2592;
        class523Array[(int)Class523.field2588[6]] = field2593;
        class523Array[(int)Class523.field2588[5]] = Class523.method10851();
        class523Array[(int)Class523.field2588[3]] = field2587;
        class523Array[(int)Class523.field2588[4]] = Class523.method10853();
        return class523Array;
    }

    private static boolean method10860(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public boolean method10861() {
        return (this == field2591 ? (int)field2588[1] : (int)field2588[0]) != 0;
    }

    private static boolean method10862(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    public boolean method10863() {
        return (this == Class523.method10856() ? (int)field2588[1] : (int)field2588[0]) != 0;
    }

    private static boolean method10864(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static boolean method10865() {
        return Class3979.method19539();
    }

    private static void method10866(long l2) {
        Class523.field2588[5] = l2 ^ 0x9E41A67557A5ECFDL;
        Class523.field2588[3] = l2 ^ 0x9E41A67557A5ECFCL;
        Class523.field2588[1] = l2 ^ 0x9E41A67557A5ECF8L;
        Class523.field2588[2] = l2 ^ 0x9E41A67557A5ECFEL;
        Class523.field2588[7] = l2 ^ 0x9E41A67557A5ECFBL;
        Class523.field2588[0] = l2 ^ 0x9E41A67557A5ECF9L;
        Class523.field2588[6] = l2 ^ 0x9E41A67557A5ECFAL;
        Class523.field2588[4] = l2 ^ 0x9E41A67557A5ECFFL;
    }

    public static CallSite FTi47tKMTv7lDA6e(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class523.A41kJG4n1vGFHJHN(string7), Class523.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class523.A41kJG4n1vGFHJHN(string5)), Class523.A41kJG4n1vGFHJHN(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class523.A41kJG4n1vGFHJHN(string5)), Class523.A41kJG4n1vGFHJHN(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static boolean method10867() {
        return Class4196.method20801();
    }

    public boolean method10868() {
        return (this == Class523.method10854() ? (int)field2588[1] : (int)field2588[0]) != 0;
    }

    public boolean method10869() {
        if (this != field2593) {
            return Class5836.method22894();
        }
        return (int)field2588[1] != 0;
    }

    public static Class523 method10870() {
        return field2591;
    }

    private static boolean method10871() {
        return Class1807.method15769();
    }

    static {
        field2588 = new long[8];
        Class523.method10866(-7043165319318868743L);
        field2590 = new Class523("PLACE", (int)field2588[0]);
        field2586 = new Class523("BREAK", (int)field2588[1]);
        field2592 = new Class523("ROTATE", (int)field2588[7]);
        field2593 = new Class523("MISC", (int)field2588[6]);
        field2585 = new Class523("Calc", (int)field2588[5]);
        field2587 = new Class523("BASE", (int)field2588[3]);
        field2591 = new Class523("RENDER", (int)field2588[4]);
        field2589 = Class523.method10859();
    }

    private static boolean method10872() {
        return Class1807.method15742();
    }

    private static boolean method10873(double d2) {
        return Class5659.method22193(d2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class523() {
        void var2_-1;
        void var1_-1;
    }

    private static boolean method10874() {
        return Class1807.method15742();
    }

    public static Class523[] values() {
        return field2589;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method10875() {
        int n2 = this != field2592 ? 54240 : 54239;
        while (true) {
            int n3;
            int n4;
            if ((n4 = n2) == 54239) {
                n3 = (int)field2588[1];
                return n3 != 0;
            }
            if (n4 != 54240) {
                n3 = (int)field2588[0];
                return n3 != 0;
            }
            n2 = 54238;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

