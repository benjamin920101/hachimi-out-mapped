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

@HACHIMI_CLIENT(mv=100, d1={"\u406c\u4067\u4067\u406f\u406a\u406e\u4067\u406c", "\u43ff\u43f8\u43fb\u43fa\u43fc\u43fe\u43fb\u43f2", "\ue3ab\ue3a9\ue3ab\ue3ac\ue3a5\ue3ad\ue3a8\ue3aa", "\udfbe\udfbf\udfba\udfb2\udfbf\udfbe\udfbf\udfbb", "\u5b71\u5b72\u5b74\u5b76\u5b77\u5b7c\u5b70\u5b77", "\u9352\u9355\u9352\u9352\u935b\u9352\u9351\u9352", "\u3c05\u3c04\u3c02\u3c08\u3c06\u3c09\u3c05\u3c02", "\u5fe3\u5fe3\u5fe3\u5fe2\u5fe3\u5fe7\u5fe2\u5fe0", "\u41d2\u41d7\u41d4\u41d0\u41d5\u41d6\u41d5", "\u2f1a\u2f19\u2f18\u2f11\u2f1d\u2f1a\u2f1d\u2f18", "\u4161\u4167\u4164\u4160\u4167\u4163\u4166\u4164", "\u2c79\u2c73\u2c73\u2c78\u2c7d\u2c72\u2c79\u2c7c", "\u28db\u28df\u28dd\u28dd\u28d4\u28de\u28dc\u28d9", "\uc290\uc297\uc294\uc295\uc296\uc290\uc290\uc295", "\u1e1b\u1e1e\u1e1d\u1e1f\u1e1d\u1e1f\u1e19\u1e10", "\u1af2\u1af3\u1af2\u1af2\u1af7\u1af2\u1af4\u1af0", "\u8c8d\u8c8e\u8c8e\u8c88\u8c87\u8c88\u8c89\u8c89"}, d2={"\u01cc\u01fd\u01ee\u21b0\u0182\u0180\u0196\u01f2\u01d4\u01df\u01c8\u01df\u0191\u01d2\u01df\u01d0\u01d9\u0191\u01ed\u01ca\u01cc\u01d7\u01d0\u01d9\u0185\u0197\u01f2\u01d4\u01df\u01c8\u01df\u0191\u01d2\u01df\u01d0\u01d9\u0191\u01ed\u01ca\u01cc\u01d7\u01d0\u01d9\u0185", "\u044c\u047d\u046f\u2430\u0402\u0400\u0416\u0472\u0454\u045f\u0448\u045f\u0411\u0452\u045f\u0450\u0459\u0411\u046d\u044a\u044c\u0457\u0450\u0459\u0405\u0417\u0472\u0454\u045f\u0448\u045f\u0411\u0452\u045f\u0450\u0459\u0411\u046d\u044a\u044c\u0457\u0450\u0459\u0405", "\u068f\u06be\u06af\u26f3\u06c1\u06c3\u06d5\u06b1\u0697\u069c\u068b\u069c\u06d2\u0691\u069c\u0693\u069a\u06d2\u06ae\u0689\u068f\u0694\u0693\u069a\u06c6\u06d4\u06b1\u0697\u069c\u068b\u069c\u06d2\u0691\u069c\u0693\u069a\u06d2\u06ae\u0689\u068f\u0694\u0693\u069a\u06c6", "\u0122\u017d\u0172\u0177\u0170\u0177\u016a\u0120\u0122\u0120\u0136\u0137\u0148", "\u0247\u0212\u0215\u0212\u020f\u0245\u0247\u0245\u0253\u0252\u022d", "\u0687\u0685\u0694\u06a3\u068c\u0681\u0693\u0693\u06dc\u06de\u06c8\u06c9\u06ac\u068a\u0681\u0696\u0681\u06cf\u068c\u0681\u068e\u0687\u06cf\u06a3\u068c\u0681\u0693\u0693\u06db", "\u03f5\u03fc\u03ee\u03f5\u03de\u03f2\u03f9\u03f8\u03a1\u03a3\u03b5\u03b4\u03d4", "\u077e\u076a\u076e\u077a\u0777\u0768\u0727\u0725\u0733\u0757\u0771\u077a\u076d\u077a\u0734\u0777\u077a\u0775\u077c\u0734\u0754\u0779\u0771\u077e\u0778\u076f\u0720\u0732\u0741", "\u0084\u008b\u0088\u0089\u0082\u00db\u00d9\u00cf\u00ce\u00ab\u008d\u0086\u0091\u0086\u00c8\u008b\u0086\u0089\u0080\u00c8\u00a8\u0085\u008d\u0082\u0084\u0093\u00dc", "\u07f5\u07ee\u07d2\u07f5\u07f3\u07e8\u07ef\u07e6\u07bd\u07bf\u07a9\u07a8\u07cd\u07eb\u07e0\u07f7\u07e0\u07ae\u07ed\u07e0\u07ef\u07e6\u07ae\u07d2\u07f5\u07f3\u07e8\u07ef\u07e6\u07ba", "\u034d\u034c\u0357\u034a\u0345\u035a\u031f\u031d\u030b\u030a\u0375", "\u01ad\u01ac\u01b7\u01aa\u01a5\u01ba\u0182\u01af\u01af\u01ff\u01fd\u01eb\u01ea\u0195", "\u03a9\u03bf\u03b7\u03aa\u03e2\u03e0\u03f6\u03f7\u0388", "\u05f2\u05e4\u05ec\u05f1\u05b9\u05bb\u05ad\u05cf\u05ac\u05d3", "&08%amoy\u001bx\u0007", "\u042e\u0438\u0430\u042d\u0465\u0467\u0471\u0413\u0410\u0470\u040f", "\u0279\u0276\u0271\u027e\u0273\u0276\u0265\u027a\u0223\u0221\u0237\u0236\u0249"})
public final class Class3877 {
    public static float field8815;
    public static double field8816;
    public static float field8817;
    public static float field8818;

    static {
        e\u200e = "CraftRequest";
        v\u200e = "Respawns automatically after a death";
        field8818 = Float.intBitsToFloat(1042812636);
        aB\u200e = "";
        field8816 = Double.longBitsToDouble(0x4024000000000000L);
        field8815 = Float.intBitsToFloat(1056949406);
        field8817 = Float.intBitsToFloat(1058894026);
    }

    private static String qYzf2SN1RRJWeSvC(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Vd0eOxS6bxLijW(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3877.qYzf2SN1RRJWeSvC(k2, -542331327));
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
                int a2 = Integer.parseInt(Class3877.qYzf2SN1RRJWeSvC(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3877.qYzf2SN1RRJWeSvC(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3877.qYzf2SN1RRJWeSvC(k2, -542331327) + " " + l2 + " " + m2);
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

