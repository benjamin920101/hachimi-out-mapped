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
@HACHIMI_CLIENT(mv=100, d1={"\ub865\ub867\ub862\ub865\ub865\ub861\ub864\ub86f", "\u1c68\u1c6e\u1c6c\u1c64\u1c6c\u1c6b\u1c6b\u1c6f", "\ud305\ud309\ud303\ud307\ud302\ud308\ud303\ud306", "\uab21\uab20\uab2a\uab27\uab2b\uab25\uab22\uab23", "\u55da\u55db\u55da\u55d8\u55dd\u55d7\u55d6\u55d7", "\ubd6a\ubd68\ubd69\ubd6b\ubd6f\ubd6f\ubd66\ubd67", "\u0bd0\u0bd2\u0bd0\u0bd1\u0bd4\u0bd4\u0bd9\u0bd0", "\ud0e8\ud0e2\ud0e9\ud0ef\ud0ed\ud0ec\ud0e9", "\u0e59\u0e59\u0e55\u0e5e\u0e5b\u0e5b\u0e5d\u0e59", "\u5c8b\u5c8b\u5c81\u5c8f\u5c80\u5c89\u5c8a", "\uc1f5\uc1f0\uc1f6\uc1f0\uc1f4\uc1f0\uc1f5\uc1f6", "\uc843\uc840\uc840\uc842\uc841\uc843\uc840\uc841", "\u81fb\u81fa\u81f9\u81fe\u81f8\u81fb\u81fb\u81f8", "\u0085\u0080\u0082\u0082\u0083\u0086\u0082\u0084", "\u89a9\u89a1\u89aa\u89a9\u89aa\u89ad\u89af\u89a0", "\u2875\u2876\u2870\u2870\u2878\u2879\u2878\u2873", "\uc898\uc89b\uc898\uc89d\uc898\uc89d\uc89d\uc899", "\u5e00\u5e03\u5e04\u5e0a\u5e03\u5e04\u5e04"}, d2={"\u048f\u04b5\u04ad\u24ef\u04dd\u04df\u04c9\u04ad\u048b\u0480\u0497\u0480\u04ce\u048d\u0480\u048f\u0486\u04ce\u04b2\u0495\u0493\u0488\u048f\u0486\u04da\u04c8\u04ad\u048b\u0480\u0497\u0480\u04ce\u048d\u0480\u048f\u0486\u04ce\u04b2\u0495\u0493\u0488\u048f\u0486\u04da", "\u06b7\u068d\u0694\u26d7\u06e5\u06e7\u06f1\u0695\u06b3\u06b8\u06af\u06b8\u06f6\u06b5\u06b8\u06b7\u06be\u06f6\u068a\u06ad\u06ab\u06b0\u06b7\u06be\u06e2\u06f0\u0695\u06b3\u06b8\u06af\u06b8\u06f6\u06b5\u06b8\u06b7\u06be\u06f6\u068a\u06ad\u06ab\u06b0\u06b7\u06be\u06e2", "\u052e\u0514\u050e\u254e\u057c\u057e\u0568\u050c\u052a\u0521\u0536\u0521\u056f\u052c\u0521\u052e\u0527\u056f\u0513\u0534\u0532\u0529\u052e\u0527\u057b\u0569\u050c\u052a\u0521\u0536\u0521\u056f\u052c\u0521\u052e\u0527\u056f\u0513\u0534\u0532\u0529\u052e\u0527\u057b", "\u0489\u04b3\u04a8\u24e9\u04db\u04d9\u04cf\u04ab\u048d\u0486\u0491\u0486\u04c8\u048b\u0486\u0489\u0480\u04c8\u04b4\u0493\u0495\u048e\u0489\u0480\u04dc\u04ce\u04ab\u048d\u0486\u0491\u0486\u04c8\u048b\u0486\u0489\u0480\u04c8\u04b4\u0493\u0495\u048e\u0489\u0480\u04dc", "\u070d\u0752\u075d\u0758\u075f\u0758\u0745\u070f\u070d\u070f\u0719\u0718\u0767", "\u02fa\u02af\u02a8\u02af\u02b2\u02f8\u02fa\u02f8\u02ee\u02ef\u0290", "\u00f0\u00f2\u00e3\u00d4\u00fb\u00f6\u00e4\u00e4\u00ab\u00a9\u00bf\u00be\u00db\u00fd\u00f6\u00e1\u00f6\u00b8\u00fb\u00f6\u00f9\u00f0\u00b8\u00d4\u00fb\u00f6\u00e4\u00e4\u00ac", "\u05b2\u05bb\u05a9\u05b2\u0599\u05b5\u05be\u05bf\u05e6\u05e4\u05f2\u05f3\u0593", "\u027c\u0268\u026c\u0278\u0275\u026a\u0225\u0227\u0231\u0255\u0273\u0278\u026f\u0278\u0236\u0275\u0278\u0277\u027e\u0236\u0256\u027b\u0273\u027c\u027a\u026d\u0222\u0230\u0243", "\u0422\u042d\u042e\u042f\u0424\u047d\u047f\u0469\u0468\u040d\u042b\u0420\u0437\u0420\u046e\u042d\u0420\u042f\u0426\u046e\u040e\u0423\u042b\u0424\u0422\u0435\u047a", "\u05fc\u05e7\u05db\u05fc\u05fa\u05e1\u05e6\u05ef\u05b4\u05b6\u05a0\u05a1\u05c4\u05e2\u05e9\u05fe\u05e9\u05a7\u05e4\u05e9\u05e6\u05ef\u05a7\u05db\u05fc\u05fa\u05e1\u05e6\u05ef\u05b3", "\u0424\u0425\u043e\u0423\u042c\u0433\u0476\u0474\u0462\u0463\u041c", "\u06ec\u06ed\u06f6\u06eb\u06e4\u06fb\u06c3\u06ee\u06ee\u06be\u06bc\u06aa\u06ab\u06d4", "\u01bd\u01ab\u01a3\u01be\u01f6\u01f4\u01e2\u01e3\u019c", "\u05d8\u05ce\u05c6\u05db\u0593\u0591\u0587\u05e5\u0586\u05f9", "\u0770\u0766\u076e\u0773\u0737\u073b\u0739\u072f\u074d\u072e\u0751", "\u013b\u012d\u0125\u0138\u0170\u0172\u0164\u0106\u0105\u0165\u011a", "\u0541\u054e\u0549\u0546\u054b\u054e\u055d\u0542\u051b\u0519\u050f\u050e\u0571"})
public final class Class5577 {
    public static double field10588;
    public static float field10589;
    public static int field10590 = -278603581;
    public static int field10591 = -167703972;
    public static float field10592 = 0.41343522f;
    public static int field10593 = 155232893;

    static {
        ad\u200e = "V_HOP";
        af\u200e = "Transforms the first person eating animation";
        field10589 = Float.intBitsToFloat(1056574652);
        field10588 = Double.longBitsToDouble(4594451045577810672L);
        bO\u200e = "";
        bU\u200e = "PlayersColor";
    }

    private static String GXnb57ka9WyV9dYJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 3JgnLcaJF6qTYL(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5577.GXnb57ka9WyV9dYJ(k2, -476032423));
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
                int a2 = Integer.parseInt(Class5577.GXnb57ka9WyV9dYJ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5577.GXnb57ka9WyV9dYJ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5577.GXnb57ka9WyV9dYJ(k2, -476032423) + " " + l2 + " " + m2);
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

