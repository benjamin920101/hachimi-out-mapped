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

@HACHIMI_CLIENT(mv=100, d1={"\u38de\u38db\u38dd\u38d8\u38da\u38db\u38db\u38d8", "\u437a\u4378\u4378\u437d\u4378\u4371\u4370", "\u2091\u2094\u2092\u2097\u2095\u209c\u2094\u2092", "\u49d2\u49d6\u49d0\u49d3\u49d3\u49d8\u49d3\u49d5", "\u5f31\u5f34\u5f35\u5f33\u5f36\u5f38\u5f38", "\ucb3c\ucb32\ucb39\ucb3c\ucb39\ucb32\ucb3f\ucb3d", "\u031c\u0313\u031a\u0318\u031d\u0319\u031d\u0319", "\ue14a\ue14f\ue14c\ue14d\ue143\ue148\ue14b\ue149", "\u03b7\u03b6\u03b7\u03b4\u03b6\u03b7\u03b5\u03b8", "\uc772\uc772\uc774\uc779\uc770\uc777\uc771\uc771", "\u9b88\u9b8e\u9b80\u9b89\u9b8f\u9b80\u9b8f\u9b8c", "\u4d58\u4d5f\u4d59\u4d59\u4d59\u4d55\u4d54\u4d5b", "\u3dba\u3db8\u3db1\u3dbf\u3db1\u3db0\u3db9\u3dbe", "\u8cc8\u8cc8\u8ccd\u8cc3\u8cce\u8ccc\u8cc2\u8ccd", "\u3ddb\u3ddc\u3ddb\u3dd8\u3dd6\u3dd9\u3dde"}, d2={"\u0772\u0777\u0744\u270f\u073d\u073f\u0729\u074d\u076b\u0760\u0777\u0760\u072e\u076d\u0760\u076f\u0766\u072e\u0752\u0775\u0773\u0768\u076f\u0766\u073a\u0728\u074d\u076b\u0760\u0777\u0760\u072e\u076d\u0760\u076f\u0766\u072e\u0752\u0775\u0773\u0768\u076f\u0766\u073a", "\u0535\u056a\u0565\u0560\u0567\u0560\u057d\u0537\u0535\u0537\u0521\u0520\u055f", "\u03a0\u03f5\u03f2\u03f5\u03e8\u03a2\u03a0\u03a2\u03b4\u03b5\u03ca", "\u061a\u0618\u0609\u063e\u0611\u061c\u060e\u060e\u0641\u0643\u0655\u0654\u0631\u0617\u061c\u060b\u061c\u0652\u0611\u061c\u0613\u061a\u0652\u063e\u0611\u061c\u060e\u060e\u0646", "\u03e7\u03ee\u03fc\u03e7\u03cc\u03e0\u03eb\u03ea\u03b3\u03b1\u03a7\u03a6\u03c6", "\u05dc\u05c8\u05cc\u05d8\u05d5\u05ca\u0585\u0587\u0591\u05f5\u05d3\u05d8\u05cf\u05d8\u0596\u05d5\u05d8\u05d7\u05de\u0596\u05f6\u05db\u05d3\u05dc\u05da\u05cd\u0582\u0590\u05e3", "\u015c\u0153\u0150\u0151\u015a\u0103\u0101\u0117\u0116\u0173\u0155\u015e\u0149\u015e\u0110\u0153\u015e\u0151\u0158\u0110\u0170\u015d\u0155\u015a\u015c\u014b\u0104", "\u00e5\u00fe\u00c2\u00e5\u00e3\u00f8\u00ff\u00f6\u00ad\u00af\u00b9\u00b8\u00dd\u00fb\u00f0\u00e7\u00f0\u00be\u00fd\u00f0\u00ff\u00f6\u00be\u00c2\u00e5\u00e3\u00f8\u00ff\u00f6\u00aa", "\u010a\u010b\u0110\u010d\u0102\u011d\u0158\u015a\u014c\u014d\u0132", "\u0258\u0259\u0242\u025f\u0250\u024f\u0277\u025a\u025a\u020a\u0208\u021e\u021f\u0260", "\u0086\u0090\u0098\u0085\u00cd\u00cf\u00d9\u00d8\u00a7", "\u02e9\u02ff\u02f7\u02ea\u02a2\u02a0\u02b6\u02d4\u02b7\u02c8", "\u0754\u0742\u074a\u0757\u0713\u071f\u071d\u070b\u0769\u070a\u0775", "\u0419\u040f\u0407\u041a\u0452\u0450\u0446\u0424\u0427\u0447\u0438", "\u06d5\u06da\u06dd\u06d2\u06df\u06da\u06c9\u06d6\u068f\u068d\u069b\u069a\u06e5"})
public final class Class5432 {
    public static float field10123 = 0.7483022f;
    public static float field10124;
    public static float field10125;
    public static double field10126;

    static {
        field10125 = Float.intBitsToFloat(1042571612);
        field10124 = Float.intBitsToFloat(1063227916);
        field10126 = Double.longBitsToDouble(-4616189618054758400L);
        aX\u200e = "The distance to phase";
    }

    private static String BwOI1QGWPLPOxTF2(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite bezhyQ9FoxWBma(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5432.BwOI1QGWPLPOxTF2(k2, 1947574438));
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
                int a2 = Integer.parseInt(Class5432.BwOI1QGWPLPOxTF2(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5432.BwOI1QGWPLPOxTF2(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 14957 : 14958;
        block7: while (true) {
            switch (n3) {
                case 14958: {
                    n3 = 14956;
                    continue block7;
                }
                case 14957: {
                    throw new Exception("Can't find method in " + Class5432.BwOI1QGWPLPOxTF2(k2, 1947574438) + " " + l2 + " " + m2);
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
}

