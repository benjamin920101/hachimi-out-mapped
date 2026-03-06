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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\uc838\uc838\uc83f\uc83b\uc83d\uc838\uc838\uc83f", "\u1d4e\u1d49\u1d4b\u1d42\u1d4c\u1d49\u1d4d\u1d4b", "\ubacb\ubacc\ubaca\ubaca\ubac3\ubacb\ubace\ubac8", "\ucb6f\ucb6e\ucb6f\ucb6c\ucb64\ucb6a\ucb6e\ucb69", "\u3025\u3024\u3027\u3028\u3023\u3024\u3023\u3025", "\ucdb0\ucdb5\ucdb3\ucdb3\ucdb5\ucdb3\ucdb1", "NKOLMJEL", "\uda33\uda3d\uda32\uda3a\uda3e\uda33\uda3f", "\u1236\u1232\u1231\u1235\u1233\u1231\u1235\u123c", "\u4b89\u4b8c\u4b8f\u4b8c\u4b8e\u4b8a\u4b8d\u4b8f", "\u2340\u2341\u2347\u234e\u234f\u2345\u2341\u2342", "\u4fe0\u4fe6\u4fe5\u4fe0\u4fe0\u4fe1\u4fe6\u4fe6", "\ub55b\ub55d\ub55d\ub558\ub55d\ub55c\ub559\ub55f", "\ud5f1\ud5f4\ud5fb\ud5f3\ud5fb\ud5f1\ud5fb\ud5f6"}, d2={"\u02e6\u02b9\u02b6\u02b3\u02b4\u02b3\u02ae\u02e4\u02e6\u02e4\u02f2\u02f3\u028c", "*\u007fx\u007fb(*(>?@", "\u066c\u066e\u067f\u0648\u0667\u066a\u0678\u0678\u0637\u0635\u0623\u0622\u0647\u0661\u066a\u067d\u066a\u0624\u0667\u066a\u0665\u066c\u0624\u0648\u0667\u066a\u0678\u0678\u0630", "\u03f3\u03fa\u03e8\u03f3\u03d8\u03f4\u03ff\u03fe\u03a7\u03a5\u03b3\u03b2\u03d2", "\u00ee\u00fa\u00fe\u00ea\u00e7\u00f8\u00b7\u00b5\u00a3\u00c7\u00e1\u00ea\u00fd\u00ea\u00a4\u00e7\u00ea\u00e5\u00ec\u00a4\u00c4\u00e9\u00e1\u00ee\u00e8\u00ff\u00b0\u00a2\u00d1", "\u05b4\u05bb\u05b8\u05b9\u05b2\u05eb\u05e9\u05ff\u05fe\u059b\u05bd\u05b6\u05a1\u05b6\u05f8\u05bb\u05b6\u05b9\u05b0\u05f8\u0598\u05b5\u05bd\u05b2\u05b4\u05a3\u05ec", "\u065b\u0640\u067c\u065b\u065d\u0646\u0641\u0648\u0613\u0611\u0607\u0606\u0663\u0645\u064e\u0659\u064e\u0600\u0643\u064e\u0641\u0648\u0600\u067c\u065b\u065d\u0646\u0641\u0648\u0614", "\u06c8\u06c9\u06d2\u06cf\u06c0\u06df\u069a\u0698\u068e\u068f\u06f0", "\u027b\u027a\u0261\u027c\u0273\u026c\u0254\u0279\u0279\u0229\u022b\u023d\u023c\u0243", "\u0138\u012e\u0126\u013b\u0173\u0171\u0167\u0166\u0119", "\u032f\u0339\u0331\u032c\u0364\u0366\u0370\u0312\u0371\u030e", "\u058e\u0598\u0590\u058d\u05c9\u05c5\u05c7\u05d1\u05b3\u05d0\u05af", "\u0274\u0262\u026a\u0277\u023f\u023d\u022b\u0249\u024a\u022a\u0255", "\u07fa\u07f5\u07f2\u07fd\u07f0\u07f5\u07e6\u07f9\u07a0\u07a2\u07b4\u07b5\u07ca"})
public final class Class5684 {
    public static float field10906 = Float.intBitsToFloat(1062202905);
    public static double field10907 = 0.9454080596300651;
    public static float field10908 = Float.intBitsToFloat(1031106448);
    public static int field10909 = 411572219;
    public static double field10910 = Double.longBitsToDouble(4602240388509985612L);

    /*
     * WARNING - void declaration
     */
    private static CallSite hVoIM9u5U1O7Im(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5684.1xOYhRghVqb77Ddg(k2, -1958215655));
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
                int a2 = Integer.parseInt(Class5684.1xOYhRghVqb77Ddg(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5684.1xOYhRghVqb77Ddg(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5684.1xOYhRghVqb77Ddg(k2, -1958215655) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 1xOYhRghVqb77Ddg(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 54216 : 54215;
            block5: while (true) {
                switch (n2) {
                    case 54216: {
                        n2 = 54214;
                        continue block5;
                    }
                    case 54215: {
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
}

