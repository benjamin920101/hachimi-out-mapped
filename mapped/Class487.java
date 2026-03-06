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
public final class Class487
extends Enum {
    private static long[] field2523 = new long[4];
    public static final /* enum */ Class487 field2524;
    private static final Class487[] field2525;
    public static final /* enum */ Class487 field2526;
    public static final /* enum */ Class487 field2527;

    static {
        Class487.method10797(-658774659070182645L);
        field2524 = new Class487("Vanilla", (int)field2523[0]);
        field2526 = new Class487("NCP", (int)field2523[2]);
        field2527 = new Class487("Grim", (int)field2523[3]);
        field2525 = Class487.method10798();
    }

    public static Class487[] values() {
        return field2525;
    }

    public static CallSite lPSQeiqIyw9tRXFn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class487.BjUyMNAnO3MD6qnY(string7), Class487.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class487.BjUyMNAnO3MD6qnY(string5)), Class487.BjUyMNAnO3MD6qnY(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class487.BjUyMNAnO3MD6qnY(string5)), Class487.BjUyMNAnO3MD6qnY(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class487 method10796(String a2) {
        return Enum.valueOf(Class487.class, a2);
    }

    private static void method10797(long l2) {
        Class487.field2523[0] = l2 ^ 0xF6DB8FF01B17BB0BL;
        Class487.field2523[2] = l2 ^ 0xF6DB8FF01B17BB0AL;
        Class487.field2523[3] = l2 ^ 0xF6DB8FF01B17BB09L;
        Class487.field2523[1] = l2 ^ 0xF6DB8FF01B17BB08L;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String BjUyMNAnO3MD6qnY(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        boolean bl2 = true;
        block0: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                stringBuilder.append((char)(string.charAt(n2) ^ 0x957FB907));
                ++n2;
            }
            int n3 = n2 >= string.length() ? 56011 : 56012;
            while (true) {
                int n4;
                if ((n4 = n3) == 56011) {
                    return stringBuilder.toString();
                }
                if (n4 != 56012) continue block0;
                n3 = 56010;
            }
            break;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class487() {
        void var2_-1;
        void var1_-1;
    }

    private static Class487[] method10798() {
        Class487[] class487Array = new Class487[(int)field2523[1]];
        class487Array[(int)Class487.field2523[0]] = field2524;
        class487Array[(int)Class487.field2523[2]] = field2526;
        class487Array[(int)Class487.field2523[3]] = field2527;
        return class487Array;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

