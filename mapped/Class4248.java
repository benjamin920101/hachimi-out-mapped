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

@HACHIMI_CLIENT(mv=100, d1={"\u25ed\u25e8\u25e0\u25ea\u25ee\u25e1\u25e8\u25ee", "\u16e1\u16ea\u16e1\u16ee\u16ef\u16ec\u16e8", "\uc446\uc44b\uc442\uc442\uc444\uc443\uc446\uc446", "\ua333\ua334\ua330\ua33f\ua336\ua337\ua334\ua334", "\udaab\udaab\udaae\udaad\udaa7\udaae\udaab\udaa8", "\u4dbc\u4dbe\u4dbc\u4dbe\u4db7\u4db8\u4db9\u4db9", "\u1833\u183f\u1836\u1834\u1834\u183f\u1835", "\u79a0\u79a0\u79a2\u79a2\u79a3\u79a1\u79a2\u79a2", "\u1d3e\u1d3d\u1d39\u1d39\u1d3c\u1d3d\u1d3b\u1d39", "\uaea5\uaea8\uaea8\uaea4\uaea2\uaea5\uaea4\uaea4", "\ue16b\ue166\ue16b\ue16a\ue16c\ue168\ue168\ue166", "\u2cbb\u2cbb\u2cb9\u2cb2\u2cbc\u2cbd\u2cb2\u2cb3", "\u9eb8\u9ebc\u9eb9\u9eb5\u9eb4\u9eb5\u9ebc\u9eb9", "\ud67e\ud676\ud67f\ud67a\ud67c\ud67a\ud67b\ud679", "\uc525\uc523\uc522\uc527\uc520\uc527\uc525\uc527"}, d2={"\u072f\u0739\u2772\u0740\u0742\u0754\u0730\u0716\u071d\u070a\u071d\u0753\u0710\u071d\u0712\u071b\u0753\u072f\u0708\u070e\u0715\u0712\u071b\u0747\u0755\u0730\u0716\u071d\u070a\u071d\u0753\u0710\u071d\u0712\u071b\u0753\u072f\u0708\u070e\u0715\u0712\u071b\u0747", "\u06c2\u069d\u0692\u0697\u0690\u0697\u068a\u06c0\u06c2\u06c0\u06d6\u06d7\u06a8", "\u00f2\u00a7\u00a0\u00a7\u00ba\u00f0\u00f2\u00f0\u00e6\u00e7\u0098", "\u018a\u0188\u0199\u01ae\u0181\u018c\u019e\u019e\u01d1\u01d3\u01c5\u01c4\u01a1\u0187\u018c\u019b\u018c\u01c2\u0181\u018c\u0183\u018a\u01c2\u01ae\u0181\u018c\u019e\u019e\u01d6", "\u07ff\u07f6\u07e4\u07ff\u07d4\u07f8\u07f3\u07f2\u07ab\u07a9\u07bf\u07be\u07de", "\u06b3\u06a7\u06a3\u06b7\u06ba\u06a5\u06ea\u06e8\u06fe\u069a\u06bc\u06b7\u06a0\u06b7\u06f9\u06ba\u06b7\u06b8\u06b1\u06f9\u0699\u06b4\u06bc\u06b3\u06b5\u06a2\u06ed\u06ff\u068c", "WX[ZQ\b\n\u001c\u001dx^UBU\u001bXUZS\u001b{V^QW@\u000f", "\u0245\u025e\u0262\u0245\u0243\u0258\u025f\u0256\u020d\u020f\u0219\u0218\u027d\u025b\u0250\u0247\u0250\u021e\u025d\u0250\u025f\u0256\u021e\u0262\u0245\u0243\u0258\u025f\u0256\u020a", "\u0597\u0596\u058d\u0590\u059f\u0580\u05c5\u05c7\u05d1\u05d0\u05af", "\u0440\u0441\u045a\u0447\u0448\u0457\u046f\u0442\u0442\u0412\u0410\u0406\u0407\u0478", "\u0514\u0502\u050a\u0517\u055f\u055d\u054b\u054a\u0535", "\u021a\u020c\u0204\u0219\u0251\u0253\u0245\u0227\u0244\u023b", "gqyd ,.8Z9F", "\u05ca\u05dc\u05d4\u05c9\u0581\u0583\u0595\u05f7\u05f4\u0594\u05eb", "\u026b\u0264\u0263\u026c\u0261\u0264\u0277\u0268\u0231\u0233\u0225\u0224\u025b"})
public final class Class4248 {
    public static float field9921 = Float.intBitsToFloat(1048457684);
    public static double field9922;

    private static String Ejj9Fj9ldZaGqNtI(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aN\u200e = "Speed";
        field9922 = Double.longBitsToDouble(4627730092099895296L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite eB7nDE6W87loZJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4248.Ejj9Fj9ldZaGqNtI(k2, 1320663073));
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
                int a2 = Integer.parseInt(Class4248.Ejj9Fj9ldZaGqNtI(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4248.Ejj9Fj9ldZaGqNtI(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4248.Ejj9Fj9ldZaGqNtI(k2, 1320663073) + " " + l2 + " " + m2);
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

