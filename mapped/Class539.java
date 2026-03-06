/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class539
extends Enum {
    private static long[] field2668 = new long[3];
    public static final /* enum */ Class539 field2669;
    public static final /* enum */ Class539 field2670;
    private static final Class539[] field2671;

    private static String 4SYQ4VR7y2k3nUen(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xEFF0029B));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static void method10964(long l2) {
        Class539.method10967(l2);
    }

    public static CallSite 2wFTwwNLbtdxZvkW(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class539.4SYQ4VR7y2k3nUen(string7), Class539.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class539.4SYQ4VR7y2k3nUen(string5)), Class539.4SYQ4VR7y2k3nUen(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class539.4SYQ4VR7y2k3nUen(string5)), Class539.4SYQ4VR7y2k3nUen(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Class539[] method10965() {
        Class539[] class539Array = new Class539[(int)field2668[2]];
        class539Array[(int)Class539.field2668[1]] = field2669;
        class539Array[(int)Class539.field2668[0]] = field2670;
        return class539Array;
    }

    public static Class539[] values() {
        return field2671;
    }

    public static Class539 method10966(String a2) {
        return Enum.valueOf(Class539.class, a2);
    }

    static {
        Class539.method10964(-1477757860558149743L);
        field2669 = new Class539("Damage", (int)field2668[1]);
        field2670 = new Class539("Packet", (int)field2668[0]);
        field2671 = Class539.method10965();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class539() {
        void var2_-1;
        void var1_-1;
    }

    private static void method10967(long l2) {
        Class539.field2668[0] = l2 ^ 0xEB7DF30E2963E790L;
        Class539.field2668[2] = l2 ^ 0xEB7DF30E2963E793L;
        Class539.field2668[1] = l2 ^ 0xEB7DF30E2963E791L;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

