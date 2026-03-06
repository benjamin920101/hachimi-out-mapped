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

@HACHIMI_CLIENT(mv=100, d1={"\ua89a\ua89a\ua89c\ua89e\ua89a\ua89e\ua89f\ua891", "\uc617\uc610\uc61b\uc613\uc615\uc611\uc61a", "\uda1c\uda1a\uda16\uda1f\uda16\uda1e\uda19\uda16", "\u9776\u977b\u9777\u9773\u9777\u9776\u977b\u9770", "\u8689\u868f\u868f\u868f\u8684\u868c\u868c\u868b", "\u632e\u632f\u632a\u632f\u632f\u632c\u632b\u632b", "\ud94b\ud94b\ud941\ud949\ud94f\ud94d\ud94d\ud94e", "\ucc26\ucc2c\ucc23\ucc21\ucc2c\ucc23\ucc25\ucc2c", "\u2d0f\u2d0f\u2d09\u2d0b\u2d09\u2d03\u2d0c\u2d08", "\uc97f\uc979\uc97f\uc97c\uc975\uc97e\uc97b\uc97a", "\u1ae9\u1ae0\u1aed\u1aeb\u1ae9\u1aeb\u1ae1", "\u313c\u3138\u313c\u313c\u313c\u313f\u313b\u3132", "\u486e\u486e\u486c\u4866\u486c\u4866\u486e\u486b", "\u98ec\u98ec\u98e7\u98e5\u98e6\u98e2", "\u280b\u2808\u280c\u280d\u280b\u280c\u280d\u280f", "\ua539\ua53a\ua53d\ua53e\ua53f\ua53a\ua53f\ua53b", "\u14df\u14d3\u14db\u14dd\u14dc\u14d3\u14de\u14df", "\u99f3\u99f3\u99f2\u99f5\u99ff\u99f3\u99f3\u99f1", "\u5a52\u5a52\u5a52\u5a53\u5a53\u5a54\u5a57\u5a52"}, d2={"\u04ef\u04f9\u04f3\u248d\u04bf\u04bd\u04ab\u04cf\u04e9\u04e2\u04f5\u04e2\u04ac\u04ef\u04e2\u04ed\u04e4\u04ac\u04d0\u04f7\u04f1\u04ea\u04ed\u04e4\u04b8\u04aa\u04cf\u04e9\u04e2\u04f5\u04e2\u04ac\u04ef\u04e2\u04ed\u04e4\u04ac\u04d0\u04f7\u04f1\u04ea\u04ed\u04e4\u04b8", "\u07c4\u07d2\u07d9\u27a6\u0794\u0796\u0780\u07e4\u07c2\u07c9\u07de\u07c9\u0787\u07c4\u07c9\u07c6\u07cf\u0787\u07fb\u07dc\u07da\u07c1\u07c6\u07cf\u0793\u0781\u07e4\u07c2\u07c9\u07de\u07c9\u0787\u07c4\u07c9\u07c6\u07cf\u0787\u07fb\u07dc\u07da\u07c1\u07c6\u07cf\u0793", "\u0567\u0571\u0579\u2505\u0537\u0535\u0523\u0547\u0561\u056a\u057d\u056a\u0524\u0567\u056a\u0565\u056c\u0524\u0558\u057f\u0579\u0562\u0565\u056c\u0530\u0522\u0547\u0561\u056a\u057d\u056a\u0524\u0567\u056a\u0565\u056c\u0524\u0558\u057f\u0579\u0562\u0565\u056c\u0530", "\u038f\u0399\u0390\u23ed\u03df\u03dd\u03cb\u03af\u0389\u0382\u0395\u0382\u03cc\u038f\u0382\u038d\u0384\u03cc\u03b0\u0397\u0391\u038a\u038d\u0384\u03d8\u03ca\u03af\u0389\u0382\u0395\u0382\u03cc\u038f\u0382\u038d\u0384\u03cc\u03b0\u0397\u0391\u038a\u038d\u0384\u03d8", "\u0186\u0190\u019e\u21e4\u01d6\u01d4\u01c2\u01a6\u0180\u018b\u019c\u018b\u01c5\u0186\u018b\u0184\u018d\u01c5\u01b9\u019e\u0198\u0183\u0184\u018d\u01d1\u01c3\u01a6\u0180\u018b\u019c\u018b\u01c5\u0186\u018b\u0184\u018d\u01c5\u01b9\u019e\u0198\u0183\u0184\u018d\u01d1", "\rR]X_XE\u000f\r\u000f\u0019\u0018g", "\u03c9\u039c\u039b\u039c\u0381\u03cb\u03c9\u03cb\u03dd\u03dc\u03a3", "\u028f\u028d\u029c\u02ab\u0284\u0289\u029b\u029b\u02d4\u02d6\u02c0\u02c1\u02a4\u0282\u0289\u029e\u0289\u02c7\u0284\u0289\u0286\u028f\u02c7\u02ab\u0284\u0289\u029b\u029b\u02d3", "\u0318\u0311\u0303\u0318\u0333\u031f\u0314\u0315\u034c\u034e\u0358\u0359\u0339", "\u0151\u0145\u0141\u0155\u0158\u0147\u0108\u010a\u011c\u0178\u015e\u0155\u0142\u0155\u011b\u0158\u0155\u015a\u0153\u011b\u017b\u0156\u015e\u0151\u0157\u0140\u010f\u011d\u016e", "\u0695\u069a\u0699\u0698\u0693\u06ca\u06c8\u06de\u06df\u06ba\u069c\u0697\u0680\u0697\u06d9\u069a\u0697\u0698\u0691\u06d9\u06b9\u0694\u069c\u0693\u0695\u0682\u06cd", "\u03b7\u03ac\u0390\u03b7\u03b1\u03aa\u03ad\u03a4\u03ff\u03fd\u03eb\u03ea\u038f\u03a9\u03a2\u03b5\u03a2\u03ec\u03af\u03a2\u03ad\u03a4\u03ec\u0390\u03b7\u03b1\u03aa\u03ad\u03a4\u03f8", "\u024b\u024a\u0251\u024c\u0243\u025c\u0219\u021b\u020d\u020c\u0273", "\u053e\u053f\u0524\u0539\u0536\u0529\u0511\u053c\u053c\u056c\u056e\u0578\u0579\u0506", "\u0674\u0662\u066a\u0677\u063f\u063d\u062b\u062a\u0655", "#5= hj|\u001e}\u0002", "\u00d4\u00c2\u00ca\u00d7\u0093\u009f\u009d\u008b\u00e9\u008a\u00f5", "\u0380\u0396\u039e\u0383\u03cb\u03c9\u03df\u03bd\u03be\u03de\u03a1", "\u030b\u0304\u0303\u030c\u0301\u0304\u0317\u0308\u0351\u0353\u0345\u0344\u033b"})
public final class Class1310 {
    public static float field5082;
    public static double field5083;
    public static float field5084 = 0.6976803f;

    static {
        aw\u200e = "Blacklist";
        field5083 = Double.longBitsToDouble(4595115504116687732L);
        bd\u200e = " ";
        be\u200e = "The outline width";
        bl\u200e = "SkinBlink";
        bn\u200e = "Extend";
        field5082 = Float.intBitsToFloat(1037811688);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ozEhqFeRqgIxDu(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1310.AT9uo0l4LWIyFJwi(k2, -1317249095));
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
                int a2 = Integer.parseInt(Class1310.AT9uo0l4LWIyFJwi(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1310.AT9uo0l4LWIyFJwi(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1310.AT9uo0l4LWIyFJwi(k2, -1317249095) + " " + l2 + " " + m2);
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
    private static String AT9uo0l4LWIyFJwi(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 11852 : 11851;
            block5: while (true) {
                switch (n2) {
                    case 11852: {
                        n2 = 11850;
                        continue block5;
                    }
                    case 11851: {
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

