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
@HACHIMI_CLIENT(mv=100, d1={"\uc5f8\uc5ff\uc5fb\uc5fc\uc5f9\uc5f5\uc5fd\uc5fb", "\u42ae\u42a3\u42ac\u42a2\u42ad\u42af\u42a2\u42a2", "\u6f76\u6f70\u6f7c\u6f72\u6f77\u6f73\u6f71\u6f77", "\u1334\u1332\u1337\u1331\u1337\u1330\u1337\u1334", "\u21bb\u21ba\u21bd\u21be\u21bd\u21b9\u21bd\u21ba", "\ubab0\ubab4\ubab1\ubab5\ubab3\ubabb\ubab6\ubab2", "\uc8f4\uc8f8\uc8f6\uc8f4\uc8f9\uc8f9\uc8f0\uc8f4", "\uacf8\uacf2\uacfc\uacf9\uacfb\uacff\uacf3\uacfe", "\uacd3\uacd6\uacd4\uacdb\uacd7\uacd0\uacda\uacd2", "\uc24d\uc24b\uc24e\uc24e\uc242\uc24d\uc242\uc242", "\u2399\u2396\u2396\u239d\u2396\u239f\u239a\u239c", "\ue1bd\ue1b8\ue1bc\ue1bc\ue1ba\ue1b1\ue1bd\ue1b0", "\u3c7d\u3c7c\u3c7d\u3c79\u3c78\u3c78\u3c70\u3c7f", "\uc25c\uc25d\uc252\uc258\uc25f\uc25c\uc259\uc25c", "\u3c15\u3c16\u3c1b\u3c11\u3c16\u3c1b\u3c1b\u3c13", "\uc46b\uc468\uc46b\uc46a\uc468\uc469\uc46b\uc46c"}, d2={"\u06b8\u0693\u069f\u26da\u06e8\u06ea\u06fc\u0698\u06be\u06b5\u06a2\u06b5\u06fb\u06b8\u06b5\u06ba\u06b3\u06fb\u0687\u06a0\u06a6\u06bd\u06ba\u06b3\u06ef\u06fd\u0698\u06be\u06b5\u06a2\u06b5\u06fb\u06b8\u06b5\u06ba\u06b3\u06fb\u0687\u06a0\u06a6\u06bd\u06ba\u06b3\u06ef", "\u07b0\u079b\u0790\u27d2\u07e0\u07e2\u07f4\u0790\u07b6\u07bd\u07aa\u07bd\u07f3\u07b0\u07bd\u07b2\u07bb\u07f3\u078f\u07a8\u07ae\u07b5\u07b2\u07bb\u07e7\u07f5\u0790\u07b6\u07bd\u07aa\u07bd\u07f3\u07b0\u07bd\u07b2\u07bb\u07f3\u078f\u07a8\u07ae\u07b5\u07b2\u07bb\u07e7", "\u0190\u01cf\u01c0\u01c5\u01c2\u01c5\u01d8\u0192\u0190\u0192\u0184\u0185\u01fa", "\u07a8\u07fd\u07fa\u07fd\u07e0\u07aa\u07a8\u07aa\u07bc\u07bd\u07c2", "\u02ad\u02af\u02be\u0289\u02a6\u02ab\u02b9\u02b9\u02f6\u02f4\u02e2\u02e3\u0286\u02a0\u02ab\u02bc\u02ab\u02e5\u02a6\u02ab\u02a4\u02ad\u02e5\u0289\u02a6\u02ab\u02b9\u02b9\u02f1", "\u073f\u0736\u0724\u073f\u0714\u0738\u0733\u0732\u076b\u0769\u077f\u077e\u071e", "\u0611\u0605\u0601\u0615\u0618\u0607\u0648\u064a\u065c\u0638\u061e\u0615\u0602\u0615\u065b\u0618\u0615\u061a\u0613\u065b\u063b\u0616\u061e\u0611\u0617\u0600\u064f\u065d\u062e", "\u07b6\u07b9\u07ba\u07bb\u07b0\u07e9\u07eb\u07fd\u07fc\u0799\u07bf\u07b4\u07a3\u07b4\u07fa\u07b9\u07b4\u07bb\u07b2\u07fa\u079a\u07b7\u07bf\u07b0\u07b6\u07a1\u07ee", "\u011e\u0105\u0139\u011e\u0118\u0103\u0104\u010d\u0156\u0154\u0142\u0143\u0126\u0100\u010b\u011c\u010b\u0145\u0106\u010b\u0104\u010d\u0145\u0139\u011e\u0118\u0103\u0104\u010d\u0151", "?>%87(moyx\u0007", "\u009d\u009c\u0087\u009a\u0095\u008a\u00b2\u009f\u009f\u00cf\u00cd\u00db\u00da\u00a5", "\u0726\u0730\u0738\u0725\u076d\u076f\u0779\u0778\u0707", "TBJW\u001f\u001d\u000bi\nu", "\u047c\u046a\u0462\u047f\u043b\u0437\u0435\u0423\u0441\u0422\u045d", "\u00df\u00c9\u00c1\u00dc\u0094\u0096\u0080\u00e2\u00e1\u0081\u00fe", "\u001b\u0014\u0013\u001c\u0011\u0014\u0007\u0018ACUT+"})
public final class Class1021 {
    public static double field4221 = Double.longBitsToDouble(4602834037896046580L);
    public static float field4222;
    public static float field4223 = 0.22967285f;
    public static int field4224 = -894165297;

    private static String Yy6TJjIodQoJNRuP(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aR\u200e = "Chests";
        aY\u200e = "Clips your third-person camera through blocks";
        field4222 = Float.intBitsToFloat(1030395280);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 3dKQ6viyrM7GBx(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1021.Yy6TJjIodQoJNRuP(k2, -804945894));
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
                int a2 = Integer.parseInt(Class1021.Yy6TJjIodQoJNRuP(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1021.Yy6TJjIodQoJNRuP(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1021.Yy6TJjIodQoJNRuP(k2, -804945894) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

