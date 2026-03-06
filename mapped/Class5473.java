/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScreenRect
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import net.hachimi.HACHIMI_CLIENT;
import net.minecraft.client.gui.ScreenRect;

public class Class5473 {
    private final Deque field10257 = new ArrayDeque();

    public static Deque method21227(Class5473 class5473) {
        return class5473.field10257;
    }

    public static Deque method21228(Class5473 class5473) {
        return class5473.field10257;
    }

    public class_8030 method21229() {
        if (this.field10257.isEmpty()) {
            throw new IllegalStateException("Scissor stack underflow");
        }
        this.field10257.removeLast();
        return (class_8030)Class5473.method21228(this).peekLast();
    }

    public static Deque method21230(Class5473 class5473) {
        return class5473.field10257;
    }

    public class_8030 method21231(class_8030 b2) {
        class_8030 c2 = (class_8030)Class5473.method21227(this).peekLast();
        if (c2 != null) {
            class_8030 a2 = Objects.requireNonNullElse(b2.method_49701(c2), class_8030.method_48248());
            Class5473.method21230(this).addLast(a2);
            return a2;
        }
        this.field10257.addLast(b2);
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite wL3mrNiNy7DiJI(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5473.eN1ydA2SpW7dTFKO(k2, 862647696));
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
                int a2 = Integer.parseInt(Class5473.eN1ydA2SpW7dTFKO(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5473.eN1ydA2SpW7dTFKO(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5473.eN1ydA2SpW7dTFKO(k2, 862647696) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String eN1ydA2SpW7dTFKO(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

