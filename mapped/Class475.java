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
public final class Class475
extends Enum {
    public static final /* enum */ Class475 field2481;
    public static final /* enum */ Class475 field2482;
    private static final Class475[] field2483;
    private static long[] field2484;
    public static final /* enum */ Class475 field2485;
    public static final /* enum */ Class475 field2486;
    public static final /* enum */ Class475 field2487;

    private static Class475[] method10745() {
        Class475[] class475Array = new Class475[(int)field2484[3]];
        class475Array[(int)Class475.field2484[4]] = Class475.method10749();
        class475Array[(int)Class475.field2484[5]] = field2482;
        class475Array[(int)Class475.field2484[2]] = field2481;
        class475Array[(int)Class475.field2484[1]] = Class475.method10750();
        class475Array[(int)Class475.field2484[0]] = field2485;
        return class475Array;
    }

    public static Class475[] method10746() {
        return field2483;
    }

    public static Class475[] values() {
        return Class475.method10746();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class475() {
        void var2_-1;
        void var1_-1;
    }

    public static Class475 method10747(String a2) {
        return Enum.valueOf(Class475.class, a2);
    }

    public static CallSite QKrDvL6hfuNvvdhk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class475.QjOLvdgOGhIXn7zw(string7), Class475.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class475.QjOLvdgOGhIXn7zw(string5)), Class475.QjOLvdgOGhIXn7zw(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class475.QjOLvdgOGhIXn7zw(string5)), Class475.QjOLvdgOGhIXn7zw(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method10748(long l2) {
        Class475.field2484[2] = l2 ^ 0x84687B16767B428FL;
        Class475.field2484[1] = l2 ^ 0x84687B16767B428EL;
        Class475.field2484[4] = l2 ^ 0x84687B16767B428DL;
        Class475.field2484[3] = l2 ^ 0x84687B16767B4288L;
        Class475.field2484[5] = l2 ^ 0x84687B16767B428CL;
        Class475.field2484[0] = l2 ^ 0x84687B16767B4289L;
    }

    static {
        field2484 = new long[6];
        Class475.method10748(-8905732926717869427L);
        field2487 = new Class475("ANTI", (int)field2484[4]);
        field2482 = new Class475("LIMIT", (int)field2484[5]);
        field2481 = new Class475("PACKET", (int)field2484[2]);
        field2486 = new Class475("STRICT", (int)field2484[1]);
        field2485 = new Class475("GRIM", (int)field2484[0]);
        field2483 = Class475.method10745();
    }

    public static Class475 method10749() {
        return field2487;
    }

    public static Class475 method10750() {
        return field2486;
    }

    private static String QjOLvdgOGhIXn7zw(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x8CEE9EC));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

