/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.hit.BlockHitResult
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.hit.BlockHitResult;

public class Class3691 {
    private static long[] field8286 = new long[1];
    private float[] field8287;
    private class_3965 field8288;

    /*
     * Enabled aggressive block sorting
     */
    private static String iwQqLb8LOiwA4BbQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 5567 : 5566;
            block5: while (true) {
                switch (n2) {
                    case 5567: {
                        n2 = 5565;
                        continue block5;
                    }
                    case 5566: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    public void method18151(class_3965 a2) {
        this.field8288 = a2;
    }

    public static Class3691 method18152(class_2338 a2, class_2350 b2) {
        return new Class3691(new class_3965(a2.method_46558(), b2, a2, (boolean)field8286[0]), null);
    }

    public void method18153(float[] a2) {
        this.field8287 = a2;
    }

    static {
        Class3691.method18155(-3686001962169974985L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite bHydCNOu1Obbyw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3691.iwQqLb8LOiwA4BbQ(k2, -1375373119));
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
                int a2 = Integer.parseInt(Class3691.iwQqLb8LOiwA4BbQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3691.iwQqLb8LOiwA4BbQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3691.iwQqLb8LOiwA4BbQ(k2, -1375373119) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    public class_2338 method18154() {
        return this.field8288.method_17777().method_10093(this.field8288.method_17780());
    }

    private static void method18155(long l2) {
        Class3691.field8286[0] = l2 ^ 0xCCD8B0BEA3773F37L;
    }

    public float[] method18156() {
        return this.field8287;
    }

    public Class3691(class_3965 a2, float[] b2) {
        this.field8288 = a2;
        this.field8287 = b2;
    }

    public class_3965 method18157() {
        return this.field8288;
    }
}

