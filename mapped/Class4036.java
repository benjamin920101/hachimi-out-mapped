/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Identifier
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class4122;
import net.hachimi.HACHIMI_CLIENT;
import net.hachimi.client.api.render.satin.ManagedShaderEffect;
import net.hachimi.client.api.render.satin.ShaderEffectManager;
import net.minecraft.util.Identifier;

public class Class4036 {
    public static final ManagedShaderEffect field9296;
    private static long[] field9297;

    public static ManagedShaderEffect method20084() {
        return field9296;
    }

    public static void method20085(float a2, float b2, float c2, float d2, float e2, float f2) {
        float g2 = (float)Class4122.field9561.method_22683().method_4495() / 2.0f;
        field9296.setUniformValue("uRadius", f2);
        Class4036.method20084().setUniformValue("uStrength", e2);
        field9296.setUniformValue("uLocation", a2 * g2, (float)Class4122.field9561.method_22683().method_4507() / 2.0f - (b2 + d2) * g2);
        field9296.setUniformValue("uSize", c2 * g2, d2 * g2);
        field9296.render(Class4122.field9561.method_60646().method_60637((boolean)field9297[0]));
    }

    private static void method20086(long l2) {
        Class4036.field9297[0] = l2 ^ 0xFC21ACCF652AC0CL;
    }

    static {
        field9297 = new long[1];
        Class4036.method20087(1135499523659049997L);
        field9296 = ShaderEffectManager.getInstance().manage(class_2960.method_60655((String)"hachimi", (String)"shaders/post/blur.json"));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite nKpCZljeiDQuKF(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4036.y6jW2SCYThv5YWzq(k2, 1729375536));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4036.y6jW2SCYThv5YWzq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 58753 : 58754;
            block7: while (true) {
                switch (n3) {
                    case 58754: {
                        n3 = 58752;
                        continue block7;
                    }
                    case 58753: {
                        String c2 = Class4036.y6jW2SCYThv5YWzq(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        int n4 = s2.isEmpty() ? 10358 : 10359;
        while (true) {
            int n5 = n4;
            if (n5 == 10358) throw new Exception("Can't find method in " + Class4036.y6jW2SCYThv5YWzq(k2, 1729375536) + " " + l2 + " " + m2);
            if (n5 != 10359) break;
            n4 = 10357;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String y6jW2SCYThv5YWzq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    private static void method20087(long l2) {
        Class4036.method20086(l2);
    }
}

