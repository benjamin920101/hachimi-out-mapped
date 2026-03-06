/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1893
 *  net.minecraft.class_5321
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1893;
import net.minecraft.class_5321;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class529
extends Enum {
    private static long[] field2623 = new long[4];
    public static final /* enum */ Class529 field2624;
    public static final /* enum */ Class529 field2625;
    private final class_5321 field2626;
    private static final Class529[] field2627;
    public static final /* enum */ Class529 field2628;

    public static Class529[] values() {
        return field2627;
    }

    private static void method10928(long l2) {
        Class529.field2623[1] = l2 ^ 0x7AEEC62D2E82437CL;
        Class529.field2623[2] = l2 ^ 0x7AEEC62D2E82437FL;
        Class529.field2623[0] = l2 ^ 0x7AEEC62D2E82437EL;
        Class529.field2623[3] = l2 ^ 0x7AEEC62D2E82437DL;
    }

    static {
        Class529.method10928(8858235414440461183L);
        field2624 = new Class529("BLAST_PROTECTION", (int)field2623[2], class_1893.field_9107);
        field2625 = new Class529("PROTECTION", (int)field2623[0], class_1893.field_9111);
        field2628 = new Class529("PROJECTILE_PROTECTION", (int)field2623[3], class_1893.field_9096);
        field2627 = Class529.method10929();
    }

    private static Class529[] method10929() {
        Class529[] class529Array = new Class529[(int)field2623[1]];
        class529Array[(int)Class529.field2623[2]] = Class529.method10931();
        class529Array[(int)Class529.field2623[0]] = field2625;
        class529Array[(int)Class529.field2623[3]] = field2628;
        return class529Array;
    }

    public class_5321 method10930() {
        return Class529.method10932(this);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class529() {
        void a2;
        void var2_-1;
        void var1_-1;
        this.field2626 = a2;
    }

    public static Class529 method10931() {
        return field2624;
    }

    public static CallSite AMplvLO4QrgvwPyV(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class529.VANi1aBuW6tvaCDg(string7), Class529.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class529.VANi1aBuW6tvaCDg(string5)), Class529.VANi1aBuW6tvaCDg(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class529.VANi1aBuW6tvaCDg(string5)), Class529.VANi1aBuW6tvaCDg(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static class_5321 method10932(Class529 class529) {
        return class529.field2626;
    }

    private static String VANi1aBuW6tvaCDg(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x6AAADEBD));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static Class529 method10933(String a2) {
        return Enum.valueOf(Class529.class, a2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

