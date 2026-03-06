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
public final class Class534
extends Enum {
    public static final /* enum */ Class534 field2636;
    public static final /* enum */ Class534 field2637;
    private static long[] field2638;
    private static final Class534[] field2639;
    public static final /* enum */ Class534 field2640;
    public static final /* enum */ Class534 field2641;
    public static final /* enum */ Class534 field2642;

    static {
        field2638 = new long[6];
        Class534.method10946(-8654098273140354475L);
        field2636 = new Class534("CLEAR", (int)field2638[5]);
        field2642 = new Class534("RAIN", (int)field2638[3]);
        field2637 = new Class534("THUNDER", (int)field2638[2]);
        field2640 = new Class534("ASH", (int)field2638[1]);
        field2641 = new Class534("DISABLED", (int)field2638[0]);
        field2639 = Class534.method10945();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class534() {
        void var2_-1;
        void var1_-1;
    }

    public static Class534 method10942(String a2) {
        return Enum.valueOf(Class534.class, a2);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String Nusgn53d47QaGMr0(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        boolean bl2 = true;
        block0: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                stringBuilder.append((char)(string.charAt(n2) ^ 0x8F4620E7));
                ++n2;
            }
            int n3 = n2 >= string.length() ? 14459 : 14460;
            while (true) {
                int n4;
                if ((n4 = n3) == 14459) {
                    return stringBuilder.toString();
                }
                if (n4 != 14460) continue block0;
                n3 = 14458;
            }
            break;
        }
    }

    public static Class534[] values() {
        return field2639;
    }

    private static Class534[] method10943() {
        Class534[] class534Array = new Class534[(int)field2638[4]];
        class534Array[(int)Class534.field2638[5]] = Class534.method10944();
        class534Array[(int)Class534.field2638[3]] = field2642;
        class534Array[(int)Class534.field2638[2]] = field2637;
        class534Array[(int)Class534.field2638[1]] = field2640;
        class534Array[(int)Class534.field2638[0]] = field2641;
        return class534Array;
    }

    public static Class534 method10944() {
        return field2636;
    }

    private static Class534[] method10945() {
        return Class534.method10943();
    }

    private static void method10946(long l2) {
        Class534.field2638[4] = l2 ^ 0x87E67778D225D250L;
        Class534.field2638[5] = l2 ^ 0x87E67778D225D255L;
        Class534.field2638[1] = l2 ^ 0x87E67778D225D256L;
        Class534.field2638[3] = l2 ^ 0x87E67778D225D254L;
        Class534.field2638[2] = l2 ^ 0x87E67778D225D257L;
        Class534.field2638[0] = l2 ^ 0x87E67778D225D251L;
    }

    public static CallSite FYNSmZY5G8Xjqdy1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class534.Nusgn53d47QaGMr0(string7), Class534.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class534.Nusgn53d47QaGMr0(string5)), Class534.Nusgn53d47QaGMr0(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class534.Nusgn53d47QaGMr0(string5)), Class534.Nusgn53d47QaGMr0(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

