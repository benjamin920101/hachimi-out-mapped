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

@HACHIMI_CLIENT(mv=100, d1={"\u0fac\u0fa8\u0fa5\u0fa9\u0fab\u0fac\u0fa8\u0fa4", "\u997d\u997b\u997b\u9977\u997a\u9979\u9979\u997b", "\ua119\ua11e\ua118\ua112\ua11c\ua11f\ua119\ua119", "\u1a22\u1a2e\u1a2e\u1a25\u1a26\u1a27\u1a25\u1a26", "\u1002\u1002\u1005\u1000\u1004\u1007\u1003\u1000", "\uc765\uc765\uc767\uc766\uc763\uc767\uc760\uc763", "\u348a\u3488\u3488\u348d\u348b\u348d\u348c\u3489", "\u34e3\u34e3\u34ee\u34e1\u34e1\u34ef\u34ef\u34e4", "\u2f56\u2f56\u2f53\u2f55\u2f57\u2f57\u2f5d\u2f54", "\u8c07\u8c07\u8c01\u8c07\u8c0c\u8c06\u8c07\u8c00", "\u3625\u3620\u3627\u3622\u3623\u3624\u362c\u3625", "\ue502\ue502\ue50e\ue505\ue504\ue506\ue503\ue502", "\u6e64\u6e64\u6e69\u6e63\u6e64\u6e62\u6e61\u6e68", "\ua577\ua574\ua57a\ua577\ua57b\ua574\ua57a\ua576", "\u2ec1\u2ec2\u2ec1\u2ec2\u2ec7\u2ec0\u2ec2\u2ec2", "\u8d6a\u8d6f\u8d6b\u8d62\u8d6a\u8d6d\u8d68\u8d62", "\uc4a6\uc4a5\uc4a6\uc4ae\uc4ae\uc4ae\uc4a2\uc4a2"}, d2={"\u078a\u07b1\u078b\u27e8\u07da\u07d8\u07ce\u07aa\u078c\u0787\u0790\u0787\u07c9\u078a\u0787\u0788\u0781\u07c9\u07b5\u0792\u0794\u078f\u0788\u0781\u07dd\u07cf\u07aa\u078c\u0787\u0790\u0787\u07c9\u078a\u0787\u0788\u0781\u07c9\u07b5\u0792\u0794\u078f\u0788\u0781\u07dd", "LwN\u202e\u001c\u001e\blJAVA\u000fLANG\u000fsTRING\u001b\tlJAVA\u000fLANG\u000fsTRING\u001b", "\u05c2\u05f9\u05c1\u25a0\u0592\u0590\u0586\u05e2\u05c4\u05cf\u05d8\u05cf\u0581\u05c2\u05cf\u05c0\u05c9\u0581\u05fd\u05da\u05dc\u05c7\u05c0\u05c9\u0595\u0587\u05e2\u05c4\u05cf\u05d8\u05cf\u0581\u05c2\u05cf\u05c0\u05c9\u0581\u05fd\u05da\u05dc\u05c7\u05c0\u05c9\u0595", "\u0766\u0739\u0736\u0733\u0734\u0733\u072e\u0764\u0766\u0764\u0772\u0773\u070c", "\u031f\u034a\u034d\u034a\u0357\u031d\u031f\u031d\u030b\u030a\u0375", "\u05c4\u05c6\u05d7\u05e0\u05cf\u05c2\u05d0\u05d0\u059f\u059d\u058b\u058a\u05ef\u05c9\u05c2\u05d5\u05c2\u058c\u05cf\u05c2\u05cd\u05c4\u058c\u05e0\u05cf\u05c2\u05d0\u05d0\u0598", "\u0167\u016e\u017c\u0167\u014c\u0160\u016b\u016a\u0133\u0131\u0127\u0126\u0146", "\u026a\u027e\u027a\u026e\u0263\u027c\u0233\u0231\u0227\u0243\u0265\u026e\u0279\u026e\u0220\u0263\u026e\u0261\u0268\u0220\u0240\u026d\u0265\u026a\u026c\u027b\u0234\u0226\u0255", "\u0087\u0088\u008b\u008a\u0081\u00d8\u00da\u00cc\u00cd\u00a8\u008e\u0085\u0092\u0085\u00cb\u0088\u0085\u008a\u0083\u00cb\u00ab\u0086\u008e\u0081\u0087\u0090\u00df", "\u00cf\u00d4\u00e8\u00cf\u00c9\u00d2\u00d5\u00dc\u0087\u0085\u0093\u0092\u00f7\u00d1\u00da\u00cd\u00da\u0094\u00d7\u00da\u00d5\u00dc\u0094\u00e8\u00cf\u00c9\u00d2\u00d5\u00dc\u0080", "z{`}rm(*<=B", "\u0721\u0720\u073b\u0726\u0729\u0736\u070e\u0723\u0723\u0773\u0771\u0767\u0766\u0719", "\u04ff\u04e9\u04e1\u04fc\u04b4\u04b6\u04a0\u04a1\u04de", "\u04f1\u04e7\u04ef\u04f2\u04ba\u04b8\u04ae\u04cc\u04af\u04d0", "\u04eb\u04fd\u04f5\u04e8\u04ac\u04a0\u04a2\u04b4\u04d6\u04b5\u04ca", "\u010c\u011a\u0112\u010f\u0147\u0145\u0153\u0131\u0132\u0152\u012d", "\u06b5\u06ba\u06bd\u06b2\u06bf\u06ba\u06a9\u06b6\u06ef\u06ed\u06fb\u06fa\u0685"})
public final class Class3895 {
    public static float field8866;
    public static double field8867 = 0.8445896022881134;
    public static float field8868;
    public static int field8869 = 373674104;
    public static double field8870;

    /*
     * WARNING - void declaration
     */
    private static CallSite rxgmDFzLkTibtG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3895.qukC7Wa4DdvvIUVN(k2, -627577605));
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
                int a2 = Integer.parseInt(Class3895.qukC7Wa4DdvvIUVN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3895.qukC7Wa4DdvvIUVN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3895.qukC7Wa4DdvvIUVN(k2, -627577605) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String qukC7Wa4DdvvIUVN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8868 = Float.intBitsToFloat(-1127428915);
        B\u200e = "yes.";
        O\u200e = ":";
        field8870 = Double.longBitsToDouble(4598159537587408120L);
        field8866 = Float.intBitsToFloat(0x40800000);
        bE\u200e = "Obsidian";
    }
}

