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
@HACHIMI_CLIENT(mv=100, d1={"\uaa18\uaa13\uaa19\uaa1e\uaa1f\uaa1c\uaa1a\uaa1c", "\ucc3f\ucc3d\ucc33\ucc3b\ucc3f\ucc3f\ucc33\ucc3b", "\u99e6\u99e3\u99e4\u99e3\u99e2\u99e3\u99e4\u99e6", "\ubdad\ubda8\ubdac\ubdab\ubda7\ubdaf\ubda7\ubda6", "\u673b\u673a\u673d\u673c\u673c\u673c\u6731\u6730", "\uc833\uc83a\uc837\uc833\uc831\uc83a\uc835\uc830", "\u8887\u8882\u8885\u8881\u8882\u8887\u8885\u8880", "\u9367\u9364\u9367\u9361\u9364\u9362\u936b", "\u5565\u5565\u5566\u5563\u556c\u5565\u5565\u5563", "\ud6fc\ud6fe\ud6fc\ud6fd\ud6fd\ud6fb\ud6fe\ud6f9", "\u2e19\u2e12\u2e18\u2e1a\u2e18\u2e13\u2e1d\u2e18", "\u0f6b\u0f69\u0f68\u0f68\u0f6f\u0f6f\u0f62\u0f6e", "\ua915\ua917\ua918\ua911\ua913\ua915\ua918\ua916", "\ub859\ub852\ub85a\ub85a\ub85a\ub85b\ub859\ub85c", "\ua614\ua610\ua611\ua618\ua613\ua619\ua614\ua616", "\u2bfe\u2bfd\u2bf9\u2bf8\u2bff\u2bf8\u2bf8\u2bf1"}, d2={"\u06c4\u06e7\u06df\u26ab\u0699\u069b\u068d\u06e9\u06cf\u06c4\u06d3\u06c4\u068a\u06c9\u06c4\u06cb\u06c2\u068a\u06f6\u06d1\u06d7\u06cc\u06cb\u06c2\u069e\u068c\u06e9\u06cf\u06c4\u06d3\u06c4\u068a\u06c9\u06c4\u06cb\u06c2\u068a\u06f6\u06d1\u06d7\u06cc\u06cb\u06c2\u069e", "\u0420\u0403\u0400\u244f\u047d\u047f\u0469\u040d\u042b\u0420\u0437\u0420\u046e\u042d\u0420\u042f\u0426\u046e\u0412\u0435\u0433\u0428\u042f\u0426\u047a\u0468\u040d\u042b\u0420\u0437\u0420\u046e\u042d\u0420\u042f\u0426\u046e\u0412\u0435\u0433\u0428\u042f\u0426\u047a", "\u048a\u04d5\u04da\u04df\u04d8\u04df\u04c2\u0488\u048a\u0488\u049e\u049f\u04e0", "\u0320\u0375\u0372\u0375\u0368\u0322\u0320\u0322\u0334\u0335\u034a", "\u072a\u0728\u0739\u070e\u0721\u072c\u073e\u073e\u0771\u0773\u0765\u0764\u0701\u0727\u072c\u073b\u072c\u0762\u0721\u072c\u0723\u072a\u0762\u070e\u0721\u072c\u073e\u073e\u0776", "\u0366\u036f\u037d\u0366\u034d\u0361\u036a\u036b\u0332\u0330\u0326\u0327\u0347", "\u0250\u0244\u0240\u0254\u0259\u0246\u0209\u020b\u021d\u0279\u025f\u0254\u0243\u0254\u021a\u0259\u0254\u025b\u0252\u021a\u027a\u0257\u025f\u0250\u0256\u0241\u020e\u021c\u026f", "\u0109\u0106\u0105\u0104\u010f\u0156\u0154\u0142\u0143\u0126\u0100\u010b\u011c\u010b\u0145\u0106\u010b\u0104\u010d\u0145\u0125\u0108\u0100\u010f\u0109\u011e\u0151", "\u0609\u0612\u062e\u0609\u060f\u0614\u0613\u061a\u0641\u0643\u0655\u0654\u0631\u0617\u061c\u060b\u061c\u0652\u0611\u061c\u0613\u061a\u0652\u062e\u0609\u060f\u0614\u0613\u061a\u0646", "\u05fd\u05fc\u05e7\u05fa\u05f5\u05ea\u05af\u05ad\u05bb\u05ba\u05c5", "\u00dc\u00dd\u00c6\u00db\u00d4\u00cb\u00f3\u00de\u00de\u008e\u008c\u009a\u009b\u00e4", "\u0448\u045e\u0456\u044b\u0403\u0401\u0417\u0416\u0469", "\u0523\u0535\u053d\u0520\u0568\u056a\u057c\u051e\u057d\u0502", "#5= dhj|\u001e}\u0002", "\u0202\u0214\u021c\u0201\u0249\u024b\u025d\u023f\u023c\u025c\u0223", "\u01eb\u01e4\u01e3\u01ec\u01e1\u01e4\u01f7\u01e8\u01b1\u01b3\u01a5\u01a4\u01db"})
public final class Class5629 {
    public static float field10761;
    public static int field10762 = -10865839;
    public static float field10763;
    public static int field10764 = 146863533;
    public static int field10765 = 658867663;
    public static float field10766;
    public static double field10767;

    /*
     * WARNING - void declaration
     */
    private static CallSite 2g2HVDSwVtjJjd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5629.BEa7iCKGLcpAPND9(k2, -289780538));
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
                int a2 = Integer.parseInt(Class5629.BEa7iCKGLcpAPND9(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5629.BEa7iCKGLcpAPND9(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5629.BEa7iCKGLcpAPND9(k2, -289780538) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        w\u200e = "Range";
        Y\u200e = ", ";
        field10766 = Float.intBitsToFloat(1061421091);
        field10767 = Double.longBitsToDouble(4601423731393774700L);
        field10763 = Float.intBitsToFloat(1062347241);
        field10761 = Float.intBitsToFloat(1140457472);
    }

    private static String BEa7iCKGLcpAPND9(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

