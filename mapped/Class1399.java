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

@HACHIMI_CLIENT(mv=100, d1={"\u26a4\u26a7\u26a7\u26a3\u26a4\u26a0\u26a7\u26a5", "\u35f0\u35f7\u35f3\u35f1\u35fe\u35f1\u35fe\u35ff", "\uaaf2\uaafc\uaaf3\uaaf5\uaaf6\uaafd\uaaf7\uaaf3", "\ub3e9\ub3e7\ub3e9\ub3ea\ub3ea\ub3e8\ub3ee\ub3ee", "\u5804\u580c\u5805\u5807\u5804\u5807\u5803\u5801", "\ua70d\ua70a\ua701\ua700\ua700\ua701\ua700\ua709", "\u65f9\u65fe\u65fc\u65f2\u65f2\u65f8\u65f9\u65f8", "\ud23c\ud234\ud235\ud235\ud23b\ud23f\ud238\ud239", "\u2b91\u2b97\u2b99\u2b97\u2b98\u2b97\u2b98", "\u90ed\u90e6\u90ed\u90e8\u90e6\u90ea\u90e8\u90eb", "\ue65d\ue659\ue65f\ue65e\ue65f\ue651\ue65c\ue650", "\u779c\u779d\u7790\u779a\u7791\u7791\u779e\u779d", "\u83e3\u83e6\u83e1\u83e3\u83e4\u83ec\u83e0\u83e1", "\u2f36\u2f38\u2f32\u2f36\u2f34\u2f33\u2f35\u2f34", "\ub07d\ub070\ub079\ub079\ub07c\ub079", "\u07c3\u07c2\u07c5\u07c1\u07c1\u07c3\u07c1\u07cf"}, d2={"\u009b\u0092\u00b5\u20f4\u00c6\u00c4\u00d2\u00b6\u0090\u009b\u008c\u009b\u00d5\u0096\u009b\u0094\u009d\u00d5\u00a9\u008e\u0088\u0093\u0094\u009d\u00c1\u00d3\u00b6\u0090\u009b\u008c\u009b\u00d5\u0096\u009b\u0094\u009d\u00d5\u00a9\u008e\u0088\u0093\u0094\u009d\u00c1", "\u06cb\u06c2\u06fa\u26a4\u0696\u0694\u0682\u06e6\u06c0\u06cb\u06dc\u06cb\u0685\u06c6\u06cb\u06c4\u06cd\u0685\u06f9\u06de\u06d8\u06c3\u06c4\u06cd\u0691\u0683\u06e6\u06c0\u06cb\u06dc\u06cb\u0685\u06c6\u06cb\u06c4\u06cd\u0685\u06f9\u06de\u06d8\u06c3\u06c4\u06cd\u0691", "\u035c\u0303\u030c\u0309\u030e\u0309\u0314\u035e\u035c\u035e\u0348\u0349\u0336", "\u01d6\u0183\u0184\u0183\u019e\u01d4\u01d6\u01d4\u01c2\u01c3\u01bc", "\u0251\u0253\u0242\u0275\u025a\u0257\u0245\u0245\u020a\u0208\u021e\u021f\u027a\u025c\u0257\u0240\u0257\u0219\u025a\u0257\u0258\u0251\u0219\u0275\u025a\u0257\u0245\u0245\u020d", "\u02ca\u02c3\u02d1\u02ca\u02e1\u02cd\u02c6\u02c7\u029e\u029c\u028a\u028b\u02eb", "\u0492\u0486\u0482\u0496\u049b\u0484\u04cb\u04c9\u04df\u04bb\u049d\u0496\u0481\u0496\u04d8\u049b\u0496\u0499\u0490\u04d8\u04b8\u0495\u049d\u0492\u0494\u0483\u04cc\u04de\u04ad", "\u0106\u0109\u010a\u010b\u0100\u0159\u015b\u014d\u014c\u0129\u010f\u0104\u0113\u0104\u014a\u0109\u0104\u010b\u0102\u014a\u012a\u0107\u010f\u0100\u0106\u0111\u015e", "\u0753\u0748\u0774\u0753\u0755\u074e\u0749\u0740\u071b\u0719\u070f\u070e\u076b\u074d\u0746\u0751\u0746\u0708\u074b\u0746\u0749\u0740\u0708\u0774\u0753\u0755\u074e\u0749\u0740\u071c", "\u0136\u0137\u012c\u0131\u013e\u0121\u0164\u0166\u0170\u0171\u010e", "\u06e9\u06e8\u06f3\u06ee\u06e1\u06fe\u06c6\u06eb\u06eb\u06bb\u06b9\u06af\u06ae\u06d1", "\u039c\u038a\u0382\u039f\u03d7\u03d5\u03c3\u03c2\u03bd", "\u0437\u0421\u0429\u0434\u047c\u047e\u0468\u040a\u0469\u0416", "\u071a\u070c\u0704\u0719\u075d\u0751\u0753\u0745\u0727\u0744\u073b", "\u0564\u0572\u057a\u0567\u052f\u052d\u053b\u0559\u055a\u053a\u0545", "\u072e\u0721\u0726\u0729\u0724\u0721\u0732\u072d\u0774\u0776\u0760\u0761\u071e"})
public final class Class1399 {
    public static double field5391 = Double.longBitsToDouble(4598884354485858638L);
    public static double field5392;
    public static double field5393 = 0.008094170859983207;
    public static float field5394 = 0.42909557f;
    public static int field5395 = 495340568;
    public static float field5396;
    public static double field5397;
    public static float field5398;
    public static double field5399 = 0.22967351173762252;

    static {
        field5396 = Float.intBitsToFloat(1044675796);
        field5398 = Float.intBitsToFloat(1040233012);
        am\u200e = "The spin speed of crystals";
        field5397 = Double.longBitsToDouble(4587366580439587226L);
        au\u200e = "Highlights friends in the tab list.";
        field5392 = Double.longBitsToDouble(4603351938832374056L);
    }

    private static String buwSWpmnybFlr2dF(String a2, int b2) {
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
    private static CallSite r47WcVrGmnonoR(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1399.buwSWpmnybFlr2dF(k2, -1142535940));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1399.buwSWpmnybFlr2dF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1399.buwSWpmnybFlr2dF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 22011 : 22012;
        block7: while (true) {
            switch (n3) {
                case 22012: {
                    n3 = 22010;
                    continue block7;
                }
                case 22011: {
                    throw new Exception("Can't find method in " + Class1399.buwSWpmnybFlr2dF(k2, -1142535940) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

