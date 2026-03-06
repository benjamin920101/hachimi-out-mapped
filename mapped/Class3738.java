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

@HACHIMI_CLIENT(mv=100, d1={"\ue632\ue636\ue635\ue637\ue63f\ue632\ue637\ue63e", "\u173d\u173b\u1739\u173c\u173c\u173e\u1733\u1738", "\ub406\ub400\ub401\ub406\ub400\ub404\ub401\ub40d", "\u80eb\u80e9\u80e8\u80e9\u80ea\u80ef\u80e0\u80ed", "\u48e0\u48e2\u48e7\u48e0\u48e7\u48e3\u48e5\u48e3", "\ua524\ua522\ua525\ua523\ua527\ua523\ua522\ua527", "\u8ea1\u8ea4\u8ea0\u8ea6\u8ea3\u8ea0\u8ea7", "\uc7c2\uc7c5\uc7c2\uc7cd\uc7c6\uc7c2\uc7cc\uc7c7", "\u8a8e\u8a8f\u8a85\u8a88\u8a8c\u8a89\u8a8f\u8a89", "\udd73\udd70\udd74\udd71\udd7e\udd72\udd73\udd72", "\ub9cf\ub9cb\ub9ce\ub9cb\ub9cb\ub9c7\ub9c9\ub9c6", "\ua748\ua748\ua74e\ua745\ua74f\ua74b\ua74e\ua74b", "\u49da\u49d1\u49d0\u49d9\u49d8\u49db\u49df", "\u6dea\u6deb\u6dee\u6ded\u6de2\u6dec\u6dea\u6de9", "\u359f\u3598\u3598\u359a\u359a\u359d\u359c\u3593", "\u74f2\u74f0\u74f5\u74f1\u74f7\u74f4\u74f9\u74f6"}, d2={"\u023c\u0208\u0239\u2255\u0267\u0265\u0273\u0217\u0231\u023a\u022d\u023a\u0274\u0237\u023a\u0235\u023c\u0274\u0208\u022f\u0229\u0232\u0235\u023c\u0260\u0272\u0217\u0231\u023a\u022d\u023a\u0274\u0237\u023a\u0235\u023c\u0274\u0208\u022f\u0229\u0232\u0235\u023c\u0260", "\u0093\u00a7\u0097\u20fa\u00c8\u00ca\u00dc\u00b8\u009e\u0095\u0082\u0095\u00db\u0098\u0095\u009a\u0093\u00db\u00a7\u0080\u0086\u009d\u009a\u0093\u00cf\u00dd\u00b8\u009e\u0095\u0082\u0095\u00db\u0098\u0095\u009a\u0093\u00db\u00a7\u0080\u0086\u009d\u009a\u0093\u00cf", "\u074e\u0711\u071e\u071b\u071c\u071b\u0706\u074c\u074e\u074c\u075a\u075b\u0724", "\u07a1\u07f4\u07f3\u07f4\u07e9\u07a3\u07a1\u07a3\u07b5\u07b4\u07cb", "\u021b\u0219\u0208\u023f\u0210\u021d\u020f\u020f\u0240\u0242\u0254\u0255\u0230\u0216\u021d\u020a\u021d\u0253\u0210\u021d\u0212\u021b\u0253\u023f\u0210\u021d\u020f\u020f\u0247", "\u01f3\u01fa\u01e8\u01f3\u01d8\u01f4\u01ff\u01fe\u01a7\u01a5\u01b3\u01b2\u01d2", "\u05c3\u05d7\u05d3\u05c7\u05ca\u05d5\u059a\u0598\u058e\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05e9\u05c4\u05cc\u05c3\u05c5\u05d2\u059d\u058f\u05fc", "\u07f1\u07fe\u07fd\u07fc\u07f7\u07ae\u07ac\u07ba\u07bb\u07de\u07f8\u07f3\u07e4\u07f3\u07bd\u07fe\u07f3\u07fc\u07f5\u07bd\u07dd\u07f0\u07f8\u07f7\u07f1\u07e6\u07a9", "\u00a9\u00b2\u008e\u00a9\u00af\u00b4\u00b3\u00ba\u00e1\u00e3\u00f5\u00f4\u0091\u00b7\u00bc\u00ab\u00bc\u00f2\u00b1\u00bc\u00b3\u00ba\u00f2\u008e\u00a9\u00af\u00b4\u00b3\u00ba\u00e6", "\u0700\u0701\u071a\u0707\u0708\u0717\u0752\u0750\u0746\u0747\u0738", "\u053a\u053b\u0520\u053d\u0532\u052d\u0515\u0538\u0538\u0568\u056a\u057c\u057d\u0502", "\u0258\u024e\u0246\u025b\u0213\u0211\u0207\u0206\u0279", "\u01a3\u01b5\u01bd\u01a0\u01e8\u01ea\u01fc\u019e\u01fd\u0182", "\u03a7\u03b1\u03b9\u03a4\u03e0\u03ec\u03ee\u03f8\u039a\u03f9\u0386", "\u04ae\u04b8\u04b0\u04ad\u04e5\u04e7\u04f1\u0493\u0490\u04f0\u048f", "\u0687\u0688\u068f\u0680\u068d\u0688\u069b\u0684\u06dd\u06df\u06c9\u06c8\u06b7"})
public final class Class3738 {
    /*
     * WARNING - void declaration
     */
    private static CallSite nzWqiedXFTiDfo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3738.KqTiMdb2lqOilDJP(k2, -666105805));
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
                int a2 = Integer.parseInt(Class3738.KqTiMdb2lqOilDJP(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3738.KqTiMdb2lqOilDJP(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3738.KqTiMdb2lqOilDJP(k2, -666105805) + " " + l2 + " " + m2);
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
        a\u200e = "YOffset";
        bk\u200e = "The maximum number of blocks for helper can place";
    }

    private static String KqTiMdb2lqOilDJP(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

