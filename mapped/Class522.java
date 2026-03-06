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

public final class Class522
extends Enum {
    private static final Class522[] field2579;
    public static final /* enum */ Class522 field2580;
    private static long[] field2581;
    public static final /* enum */ Class522 field2582;
    public static final /* enum */ Class522 field2583;
    public static final /* enum */ Class522 field2584;

    public static Class522[] values() {
        return Class522.method10847();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite BQvfrPWBwvXD1b(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class522.a4rjgwneDpra9yc1(k2, -428427865));
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
                int a2 = Integer.parseInt(Class522.a4rjgwneDpra9yc1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class522.a4rjgwneDpra9yc1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class522.a4rjgwneDpra9yc1(k2, -428427865) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    public static Class522 method10844() {
        return field2582;
    }

    private static Class522[] method10845() {
        Class522[] class522Array = new Class522[(int)field2581[4]];
        class522Array[(int)Class522.field2581[3]] = field2583;
        class522Array[(int)Class522.field2581[0]] = Class522.method10844();
        class522Array[(int)Class522.field2581[2]] = field2580;
        class522Array[(int)Class522.field2581[1]] = field2584;
        return class522Array;
    }

    private static String a4rjgwneDpra9yc1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    public static Class522 method10846(String a2) {
        return Enum.valueOf(Class522.class, a2);
    }

    static {
        field2581 = new long[5];
        Class522.method10848(-423536833414913290L);
        field2583 = new Class522("Full", (int)field2581[3]);
        field2582 = new Class522("Head", (int)field2581[0]);
        field2580 = new Class522("Fixed", (int)field2581[2]);
        field2584 = new Class522("Disable", (int)field2581[1]);
        field2579 = Class522.method10845();
    }

    public static Class522[] method10847() {
        return field2579;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class522() {
        void var2_-1;
        void var1_-1;
    }

    private static void method10848(long l2) {
        Class522.field2581[1] = l2 ^ 0xFA1F4B7E7702A2F5L;
        Class522.field2581[2] = l2 ^ 0xFA1F4B7E7702A2F4L;
        Class522.field2581[0] = l2 ^ 0xFA1F4B7E7702A2F7L;
        Class522.field2581[4] = l2 ^ 0xFA1F4B7E7702A2F2L;
        Class522.field2581[3] = l2 ^ 0xFA1F4B7E7702A2F6L;
    }
}

