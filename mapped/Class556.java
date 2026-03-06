/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

public final class Class556
extends Enum {
    private static final Class556[] field2751;
    public static final /* enum */ Class556 field2752;
    private static long[] field2753;
    public static final /* enum */ Class556 field2754;
    public static final /* enum */ Class556 field2755;
    public static final /* enum */ Class556 field2756;
    public static final /* enum */ Class556 field2757;
    public static final /* enum */ Class556 field2758;
    public static final /* enum */ Class556 field2759;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite t0WWNZuTRLaDgT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class556.ZTAWAGJOMyFbsMcI(k2, -1883237339));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class556.ZTAWAGJOMyFbsMcI(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class556.ZTAWAGJOMyFbsMcI(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 8358 : 8359;
        block7: while (true) {
            switch (n3) {
                case 8359: {
                    n3 = 8357;
                    continue block7;
                }
                case 8358: {
                    throw new Exception("Can't find method in " + Class556.ZTAWAGJOMyFbsMcI(k2, -1883237339) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field2753 = new long[8];
        Class556.method11038(2099000377298413635L);
        field2758 = new Class556("COMBAT", (int)field2753[0]);
        field2756 = new Class556("MISC", (int)field2753[6]);
        field2759 = new Class556("RENDER", (int)field2753[3]);
        field2752 = new Class556("MOVEMENT", (int)field2753[1]);
        field2754 = new Class556("PLAYER", (int)field2753[5]);
        field2755 = new Class556("EXPLOIT", (int)field2753[2]);
        field2757 = new Class556("CLIENT", (int)field2753[4]);
        field2751 = Class556.method11040();
    }

    public static Class556[] values() {
        return field2751;
    }

    private static void method11038(long l2) {
        Class556.field2753[1] = l2 ^ 0x1D2125B8E0486840L;
        Class556.field2753[3] = l2 ^ 0x1D2125B8E0486841L;
        Class556.field2753[0] = l2 ^ 0x1D2125B8E0486843L;
        Class556.field2753[4] = l2 ^ 0x1D2125B8E0486845L;
        Class556.field2753[5] = l2 ^ 0x1D2125B8E0486847L;
        Class556.field2753[6] = l2 ^ 0x1D2125B8E0486842L;
        Class556.field2753[2] = l2 ^ 0x1D2125B8E0486846L;
        Class556.field2753[7] = l2 ^ 0x1D2125B8E0486844L;
    }

    public static Class556 method11039() {
        return field2755;
    }

    private static Class556[] method11040() {
        Class556[] class556Array = new Class556[(int)field2753[7]];
        class556Array[(int)Class556.field2753[0]] = field2758;
        class556Array[(int)Class556.field2753[6]] = field2756;
        class556Array[(int)Class556.field2753[3]] = field2759;
        class556Array[(int)Class556.field2753[1]] = field2752;
        class556Array[(int)Class556.field2753[5]] = field2754;
        class556Array[(int)Class556.field2753[2]] = Class556.method11039();
        class556Array[(int)Class556.field2753[4]] = field2757;
        return class556Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class556() {
        void var2_-1;
        void var1_-1;
    }

    public static Class556 method11041(String a2) {
        return Enum.valueOf(Class556.class, a2);
    }

    private static String ZTAWAGJOMyFbsMcI(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

