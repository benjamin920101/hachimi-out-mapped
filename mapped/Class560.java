/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class561;
import mapped.Class562;
import mapped.Class563;
import mapped.Class564;
import mapped.Class565;
import mapped.Class566;
import mapped.Class567;
import mapped.Class568;
import net.minecraft.util.math.Vec3d;

public abstract sealed class Class560
extends Enum
permits Class561, Class566, Class565, Class562, Class568, Class567, Class564, Class563 {
    public static final /* enum */ Class560 field2772;
    public static final /* enum */ Class560 field2773;
    private static long[] field2774;
    public static final /* enum */ Class560 field2775;
    public static final /* enum */ Class560 field2776;
    public static final /* enum */ Class560 field2777;
    private static final Class560[] field2778;
    public static final /* enum */ Class560 field2779;
    public static final /* enum */ Class560 field2780;
    public static final /* enum */ Class560 field2781;

    public static Class560 method11055() {
        return field2781;
    }

    public abstract class_243 method11056(class_243 var1);

    public static Class560 method11057(String a2) {
        return Enum.valueOf(Class560.class, a2);
    }

    private static String nDzA1yVwEEalT7OO(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x94EC87A));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static CallSite vnhLa0qQcDbl0On2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class560.nDzA1yVwEEalT7OO(string7), Class560.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class560.nDzA1yVwEEalT7OO(string5)), Class560.nDzA1yVwEEalT7OO(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class560.nDzA1yVwEEalT7OO(string5)), Class560.nDzA1yVwEEalT7OO(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class560() {
        void var2_-1;
        void var1_-1;
    }

    static {
        field2774 = new long[9];
        Class560.method11062(-1064920969815092637L);
        field2779 = new Class561();
        field2780 = new Class566();
        field2777 = new Class565();
        field2775 = new Class562();
        field2772 = new Class568();
        field2776 = new Class567();
        field2773 = new Class564();
        field2781 = new Class563();
        field2778 = Class560.method11059();
    }

    public static Class560 method11058() {
        return field2779;
    }

    private static Class560[] method11059() {
        Class560[] class560Array = new Class560[(int)field2774[5]];
        class560Array[(int)Class560.field2774[4]] = Class560.method11058();
        class560Array[(int)Class560.field2774[0]] = field2780;
        class560Array[(int)Class560.field2774[1]] = field2777;
        class560Array[(int)Class560.field2774[7]] = field2775;
        class560Array[(int)Class560.field2774[2]] = field2772;
        class560Array[(int)Class560.field2774[3]] = field2776;
        class560Array[(int)Class560.field2774[8]] = Class560.method11060();
        class560Array[(int)Class560.field2774[6]] = Class560.method11055();
        return class560Array;
    }

    public static Class560 method11060() {
        return field2773;
    }

    public static Class560[] method11061() {
        return field2778;
    }

    public static Class560[] values() {
        return Class560.method11061();
    }

    private static void method11062(long l2) {
        Class560.field2774[8] = l2 ^ 0xF138A405284E9265L;
        Class560.field2774[2] = l2 ^ 0xF138A405284E9267L;
        Class560.field2774[5] = l2 ^ 0xF138A405284E926BL;
        Class560.field2774[1] = l2 ^ 0xF138A405284E9261L;
        Class560.field2774[6] = l2 ^ 0xF138A405284E9264L;
        Class560.field2774[3] = l2 ^ 0xF138A405284E9266L;
        Class560.field2774[4] = l2 ^ 0xF138A405284E9263L;
        Class560.field2774[0] = l2 ^ 0xF138A405284E9262L;
        Class560.field2774[7] = l2 ^ 0xF138A405284E9260L;
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}

