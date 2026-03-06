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

@HACHIMI_CLIENT(mv=100, d1={"\u3183\u3185\u318e\u3183\u3184\u3184\u3183\u3182", "\ud821\ud827\ud825\ud821\ud820\ud823\ud823\ud821", "\u774a\u7743\u774e\u774e\u7749\u7743\u774a\u774f", "\u8740\u8747\u8747\u874a\u8746\u8744\u8740\u8745", "\u4752\u4752\u475f\u475e\u4755\u475e\u4757\u4755", "\u2c3c\u2c36\u2c39\u2c3e\u2c39\u2c39\u2c37\u2c3b", "\ua1ec\ua1ef\ua1ed\ua1e6\ua1e9\ua1ec\ua1e6\ua1ea", "\u2225\u2225\u2220\u2225\u2221\u2225\u2224\u2229", "\u3a9b\u3a9c\u3a9d\u3a9b\u3a9f\u3a9d\u3a9a\u3a9a", "\ud4f0\ud4f7\ud4f7\ud4f7\ud4fa\ud4f4\ud4f2", "\uad43\uad4e\uad43\uad44\uad4f\uad45\uad4e\uad46", "\u55b9\u55b6\u55b7\u55b7\u55bd\u55bd\u55b9\u55bb", "\u19e0\u19e6\u19e3\u19e5\u19e2\u19ec\u19e4\u19e6", "\ue7a6\ue7a2\ue7a2\ue7ac\ue7a5\ue7a6\ue7a2\ue7a7", "\u8068\u806a\u806d\u806e\u806c\u806d\u8069\u806d", "\u60de\u60d8\u60d5\u60dd\u60d5\u60da\u60df\u60d4", "\u868e\u868e\u868c\u868c\u8688\u868d\u868c\u868b"}, d2={"\u03ea\u03c2\u03df\u2388\u03ba\u03b8\u03ae\u03ca\u03ec\u03e7\u03f0\u03e7\u03a9\u03ea\u03e7\u03e8\u03e1\u03a9\u03d5\u03f2\u03f4\u03ef\u03e8\u03e1\u03bd\u03af\u03ca\u03ec\u03e7\u03f0\u03e7\u03a9\u03ea\u03e7\u03e8\u03e1\u03a9\u03d5\u03f2\u03f4\u03ef\u03e8\u03e1\u03bd", "\u0256\u027e\u0260\u2234\u0206\u0204\u0212\u0276\u0250\u025b\u024c\u025b\u0215\u0256\u025b\u0254\u025d\u0215\u0269\u024e\u0248\u0253\u0254\u025d\u0201\u0213\u0276\u0250\u025b\u024c\u025b\u0215\u0256\u025b\u0254\u025d\u0215\u0269\u024e\u0248\u0253\u0254\u025d\u0201", "\u05bc\u0595\u05b1\u25de\u05ec\u05ee\u05f8\u059c\u05ba\u05b1\u05a6\u05b1\u05ff\u05bc\u05b1\u05be\u05b7\u05ff\u0583\u05a4\u05a2\u05b9\u05be\u05b7\u05eb\u05f9\u059c\u05ba\u05b1\u05a6\u05b1\u05ff\u05bc\u05b1\u05be\u05b7\u05ff\u0583\u05a4\u05a2\u05b9\u05be\u05b7\u05eb", "\u048f\u04d0\u04df\u04da\u04dd\u04da\u04c7\u048d\u048f\u048d\u049b\u049a\u04e5", "\u0346\u0313\u0314\u0313\u030e\u0344\u0346\u0344\u0352\u0353\u032c", "\u021c\u021e\u020f\u0238\u0217\u021a\u0208\u0208\u0247\u0245\u0253\u0252\u0237\u0211\u021a\u020d\u021a\u0254\u0217\u021a\u0215\u021c\u0254\u0238\u0217\u021a\u0208\u0208\u0240", "\u00d4\u00dd\u00cf\u00d4\u00ff\u00d3\u00d8\u00d9\u0080\u0082\u0094\u0095\u00f5", "K_[OB]\u0012\u0010\u0006bDOXO\u0001BO@I\u0001aLDKMZ\u0015\u0007t", "\u0583\u058c\u058f\u058e\u0585\u05dc\u05de\u05c8\u05c9\u05ac\u058a\u0581\u0596\u0581\u05cf\u058c\u0581\u058e\u0587\u05cf\u05af\u0582\u058a\u0585\u0583\u0594\u05db", "\u046b\u0470\u044c\u046b\u046d\u0476\u0471\u0478\u0423\u0421\u0437\u0436\u0453\u0475\u047e\u0469\u047e\u0430\u0473\u047e\u0471\u0478\u0430\u044c\u046b\u046d\u0476\u0471\u0478\u0424", "\u067e\u067f\u0664\u0679\u0676\u0669\u062c\u062e\u0638\u0639\u0646", "\u01a5\u01a4\u01bf\u01a2\u01ad\u01b2\u018a\u01a7\u01a7\u01f7\u01f5\u01e3\u01e2\u019d", "5#+6~|jk\u0014", "\u040d\u041b\u0413\u040e\u0446\u0444\u0452\u0430\u0453\u042c", "\u0191\u0187\u018f\u0192\u01d6\u01da\u01d8\u01ce\u01ac\u01cf\u01b0", "\u07fd\u07eb\u07e3\u07fe\u07b6\u07b4\u07a2\u07c0\u07c3\u07a3\u07dc", "\u06a0\u06af\u06a8\u06a7\u06aa\u06af\u06bc\u06a3\u06fa\u06f8\u06ee\u06ef\u0690"})
public final class Class5627 {
    public static float field10757;
    public static float field10758;
    public static double field10759;
    public static int field10760 = -77595111;

    private static String fFOvk0rZHdbDFtM7(String a2, int b2) {
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
    private static CallSite OUQdLwdK752fBu(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5627.fFOvk0rZHdbDFtM7(k2, 1473573813));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5627.fFOvk0rZHdbDFtM7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 44693 : 44694;
            block7: while (true) {
                switch (n3) {
                    case 44694: {
                        n3 = 44692;
                        continue block7;
                    }
                    case 44693: {
                        String c2 = Class5627.fFOvk0rZHdbDFtM7(r2[f2], l2);
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
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class5627.fFOvk0rZHdbDFtM7(k2, 1473573813) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        q\u200e = "Renders a border around the nametag";
        field10757 = Float.intBitsToFloat(1063039530);
        F\u200e = "delete";
        field10758 = Float.intBitsToFloat(1110704128);
        field10759 = Double.longBitsToDouble(4607079940165188716L);
        bU\u200e = "Friends";
    }
}

