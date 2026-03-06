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

@HACHIMI_CLIENT(mv=100, d1={"\uc068\uc068\uc062\uc062\uc06d\uc06c\uc068\uc068", "\ub747\ub745\ub745\ub747\ub741\ub743\ub745\ub74c", "\uc95f\uc956\uc957\uc95d\uc95f\uc95f\uc95d\uc95b", "\u852b\u8521\u8529\u852c\u8529\u852c", "\uad64\uad66\uad6b\uad62\uad63\uad6b\uad66\uad61", "\u524a\u5249\u524d\u524d\u524a\u5245\u524d\u524b", "\u08d1\u08d3\u08d6\u08dc\u08d2\u08d4\u08dd\u08d5", "\u163a\u163e\u163f\u1632\u163b\u163f\u163d\u1638", "\u6c11\u6c14\u6c16\u6c11\u6c19\u6c11\u6c14\u6c15", "\u0362\u0360\u0362\u0364\u0365\u036e\u0366\u0360", "\u0447\u0448\u0444\u0441\u0445\u0440\u0444\u0447", "\u4dfb\u4dfb\u4dfc\u4dfe\u4dfb\u4dfa\u4df5", "\u71cf\u71cd\u71cc\u71c9\u71c4\u71cf\u71cb\u71cb", "\u428c\u428f\u428d\u428c\u4282\u428a\u428b\u428a", "\u569e\u569e\u5699\u569b\u5698\u569c\u569d\u569c", "\u9066\u9060\u9069\u9066\u9063\u9067\u9065\u9065", "\u7d00\u7d05\u7d03\u7d03\u7d07\u7d07\u7d04\u7d0a", "\u64ca\u64c3\u64c8\u64cb\u64c2\u64c3\u64ce\u64cb", "\u3d0e\u3d0f\u3d05\u3d04\u3d0c\u3d0c\u3d09\u3d0c"}, d2={"\u01ac\u01a8\u018c\u21c1\u01f3\u01f1\u01e7\u0183\u01a5\u01ae\u01b9\u01ae\u01e0\u01a3\u01ae\u01a1\u01a8\u01e0\u019c\u01bb\u01bd\u01a6\u01a1\u01a8\u01f4\u01e6\u0183\u01a5\u01ae\u01b9\u01ae\u01e0\u01a3\u01ae\u01a1\u01a8\u01e0\u019c\u01bb\u01bd\u01a6\u01a1\u01a8\u01f4", "\u0269\u026d\u024e\u2204\u0236\u0234\u0222\u0246\u0260\u026b\u027c\u026b\u0225\u0266\u026b\u0264\u026d\u0225\u0259\u027e\u0278\u0263\u0264\u026d\u0231\u0223\u0246\u0260\u026b\u027c\u026b\u0225\u0266\u026b\u0264\u026d\u0225\u0259\u027e\u0278\u0263\u0264\u026d\u0231", "\u0176\u0172\u0150\u211b\u0129\u012b\u013d\u0159\u017f\u0174\u0163\u0174\u013a\u0179\u0174\u017b\u0172\u013a\u0146\u0161\u0167\u017c\u017b\u0172\u012e\u013c\u0159\u017f\u0174\u0163\u0174\u013a\u0179\u0174\u017b\u0172\u013a\u0146\u0161\u0167\u017c\u017b\u0172\u012e", "\u05ce\u05ca\u05eb\u25a3\u0591\u0593\u0585\u05e1\u05c7\u05cc\u05db\u05cc\u0582\u05c1\u05cc\u05c3\u05ca\u0582\u05fe\u05d9\u05df\u05c4\u05c3\u05ca\u0596\u0584\u05e1\u05c7\u05cc\u05db\u05cc\u0582\u05c1\u05cc\u05c3\u05ca\u0582\u05fe\u05d9\u05df\u05c4\u05c3\u05ca\u0596", "\u0249\u024d\u026d\u2224\u0216\u0214\u0202\u0266\u0240\u024b\u025c\u024b\u0205\u0246\u024b\u0244\u024d\u0205\u0279\u025e\u0258\u0243\u0244\u024d\u0211\u0203\u0266\u0240\u024b\u025c\u024b\u0205\u0246\u024b\u0244\u024d\u0205\u0279\u025e\u0258\u0243\u0244\u024d\u0211", "\u0325\u037a\u0375\u0370\u0377\u0370\u036d\u0327\u0325\u0327\u0331\u0330\u034f", "\u0552\u0507\u0500\u0507\u051a\u0550\u0552\u0550\u0546\u0547\u0538", "vteR}pbb-/98]{pgp>}p\u007fv>R}pbb*", "\u069c\u0695\u0687\u069c\u06b7\u069b\u0690\u0691\u06c8\u06ca\u06dc\u06dd\u06bd", "\u06ff\u06eb\u06ef\u06fb\u06f6\u06e9\u06a6\u06a4\u06b2\u06d6\u06f0\u06fb\u06ec\u06fb\u06b5\u06f6\u06fb\u06f4\u06fd\u06b5\u06d5\u06f8\u06f0\u06ff\u06f9\u06ee\u06a1\u06b3\u06c0", "\u07e2\u07ed\u07ee\u07ef\u07e4\u07bd\u07bf\u07a9\u07a8\u07cd\u07eb\u07e0\u07f7\u07e0\u07ae\u07ed\u07e0\u07ef\u07e6\u07ae\u07ce\u07e3\u07eb\u07e4\u07e2\u07f5\u07ba", "XC\u007fX^EBK\u0010\u0012\u0004\u0005`FMZM\u0003@MBK\u0003\u007fX^EBK\u0017", "\u0166\u0167\u017c\u0161\u016e\u0171\u0134\u0136\u0120\u0121\u015e", "\u071c\u071d\u0706\u071b\u0714\u070b\u0733\u071e\u071e\u074e\u074c\u075a\u075b\u0724", "V@HU\u001d\u001f\t\bw", "\u036c\u037a\u0372\u036f\u0327\u0325\u0333\u0351\u0332\u034d", "\u0783\u0795\u079d\u0780\u07c4\u07c8\u07ca\u07dc\u07be\u07dd\u07a2", "\u03da\u03cc\u03c4\u03d9\u0391\u0393\u0385\u03e7\u03e4\u0384\u03fb", "\u03e9\u03e6\u03e1\u03ee\u03e3\u03e6\u03f5\u03ea\u03b3\u03b1\u03a7\u03a6\u03d9"})
public final class Class1329 {
    public static float field5141;
    public static float field5142;
    public static double field5143;
    public static float field5144;
    public static int field5145 = -1895672790;
    public static double field5146;
    public static double field5147;

    /*
     * Enabled aggressive block sorting
     */
    private static String EQBQFEyva842WOJl(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 39673 : 39674;
            block5: while (true) {
                switch (n2) {
                    case 39674: {
                        n2 = 39672;
                        continue block5;
                    }
                    case 39673: {
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

    /*
     * WARNING - void declaration
     */
    private static CallSite GUNpsk4AU74mSu(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1329.EQBQFEyva842WOJl(k2, -1511845378));
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
                int a2 = Integer.parseInt(Class1329.EQBQFEyva842WOJl(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1329.EQBQFEyva842WOJl(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1329.EQBQFEyva842WOJl(k2, -1511845378) + " " + l2 + " " + m2);
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
        field5147 = Double.longBitsToDouble(4602181837351794250L);
        field5142 = Float.intBitsToFloat(1103626240);
        t\u200e = "Packets";
        G\u200e = "Click sounds";
        I\u200e = "Off";
        field5144 = Float.intBitsToFloat(1061792360);
        field5141 = Float.intBitsToFloat(1053399858);
        au\u200e = "Decide which swap mode to use";
        field5143 = Double.longBitsToDouble(4603607375720111672L);
        bJ\u200e = "AutoArmor";
        field5146 = Double.longBitsToDouble(4589107093802537696L);
    }
}

