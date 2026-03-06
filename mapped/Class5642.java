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
@HACHIMI_CLIENT(mv=100, d1={"\ubbdf\ubbd8\ubbd9\ubbd0\ubbdd\ubbd9\ubbda\ubbd9", "\u268c\u268f\u268f\u2682\u2688\u268b\u268d\u268b", "\u98a3\u98ad\u98a1\u98a4\u98a5\u98a1\u98ac\u98a2", "\u0479\u0475\u047d\u047d\u0479\u047d\u0479\u047e", "\ua6d5\ua6d4\ua6db\ua6d2\ua6db\ua6d6\ua6db\ua6da", "\u5379\u537b\u5379\u537a\u537b\u5370\u537e\u5378", "\ubf17\ubf10\ubf14\ubf1d\ubf14\ubf1c\ubf1d\ubf12", "\u5dfd\u5df9\u5df4\u5dfa\u5dfa\u5dfd\u5dfb\u5df8", "\ue607\ue602\ue602\ue600\ue605\ue600\ue607\ue601", "\u2bdc\u2bda\u2bdb\u2bdc\u2bd9\u2bd2\u2bdb\u2bd8", "\u5a91\u5a97\u5a95\u5a99\u5a92\u5a95\u5a91\u5a95", "\u8ce9\u8ce5\u8ce5\u8ced\u8ceb\u8cea\u8cec", "\u92f2\u92f8\u92f3\u92f9\u92f4\u92f7\u92f2\u92f3", "\ub265\ub266\ub261\ub261\ub266\ub262\ub266\ub266", "\u69f3\u69f1\u69ff\u69f1\u69f0\u69f6\u69f5\u69ff", "\uac48\uac4b\uac4c\uac4b\uac47\uac4e\uac49\uac4d"}, d2={"\u01d9\u01c2\u01f0\u21ba\u0188\u018a\u019c\u01f8\u01de\u01d5\u01c2\u01d5\u019b\u01d8\u01d5\u01da\u01d3\u019b\u01e7\u01c0\u01c6\u01dd\u01da\u01d3\u018f\u019d\u01f8\u01de\u01d5\u01c2\u01d5\u019b\u01d8\u01d5\u01da\u01d3\u019b\u01e7\u01c0\u01c6\u01dd\u01da\u01d3\u018f", "\u0480\u049b\u04a8\u24e3\u04d1\u04d3\u04c5\u04a1\u0487\u048c\u049b\u048c\u04c2\u0481\u048c\u0483\u048a\u04c2\u04be\u0499\u049f\u0484\u0483\u048a\u04d6\u04c4\u04a1\u0487\u048c\u049b\u048c\u04c2\u0481\u048c\u0483\u048a\u04c2\u04be\u0499\u049f\u0484\u0483\u048a\u04d6", "\u0467\u0438\u0437\u0432\u0435\u0432\u042f\u0465\u0467\u0465\u0473\u0472\u040d", "\u012b\u017e\u0179\u017e\u0163\u0129\u012b\u0129\u013f\u013e\u0141", "\u045c\u045e\u044f\u0478\u0457\u045a\u0448\u0448\u0407\u0405\u0413\u0412\u0477\u0451\u045a\u044d\u045a\u0414\u0457\u045a\u0455\u045c\u0414\u0478\u0457\u045a\u0448\u0448\u0400", "\u0216\u021f\u020d\u0216\u023d\u0211\u021a\u021b\u0242\u0240\u0256\u0257\u0237", "\u0105\u0111\u0115\u0101\u010c\u0113\u015c\u015e\u0148\u012c\u010a\u0101\u0116\u0101\u014f\u010c\u0101\u010e\u0107\u014f\u012f\u0102\u010a\u0105\u0103\u0114\u015b\u0149\u013a", "\u013b\u0134\u0137\u0136\u013d\u0164\u0166\u0170\u0171\u0114\u0132\u0139\u012e\u0139\u0177\u0134\u0139\u0136\u013f\u0177\u0117\u013a\u0132\u013d\u013b\u012c\u0163", "\u0098\u0083\u00bf\u0098\u009e\u0085\u0082\u008b\u00d0\u00d2\u00c4\u00c5\u00a0\u0086\u008d\u009a\u008d\u00c3\u0080\u008d\u0082\u008b\u00c3\u00bf\u0098\u009e\u0085\u0082\u008b\u00d7", "\u049c\u049d\u0486\u049b\u0494\u048b\u04ce\u04cc\u04da\u04db\u04a4", "\u0742\u0743\u0758\u0745\u074a\u0755\u076d\u0740\u0740\u0710\u0712\u0704\u0705\u077a", "\u06be\u06a8\u06a0\u06bd\u06f5\u06f7\u06e1\u06e0\u069f", "\u05ec\u05fa\u05f2\u05ef\u05a7\u05a5\u05b3\u05d1\u05b2\u05cd", "\u0105\u0113\u011b\u0106\u0142\u014e\u014c\u015a\u0138\u015b\u0124", "\u04d4\u04c2\u04ca\u04d7\u049f\u049d\u048b\u04e9\u04ea\u048a\u04f5", "\u0485\u048a\u048d\u0482\u048f\u048a\u0499\u0486\u04df\u04dd\u04cb\u04ca\u04b5"})
public final class Class5642 {
    public static int field10805 = 985133883;
    public static double field10806 = 0.9917196295950206;
    public static double field10807;

    static {
        l\u200e = "ElytraSpeed";
        field10807 = Double.longBitsToDouble(4604276207279427296L);
        aO\u200e = "NoPigAI";
    }

    private static String 9DHA6RxShQnWdJoD(String a2, int b2) {
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
    private static CallSite edicMnhar6OoOi(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5642.9DHA6RxShQnWdJoD(k2, -695053648));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5642.9DHA6RxShQnWdJoD(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 43326 : 43327;
            block7: while (true) {
                switch (n3) {
                    case 43327: {
                        n3 = 43325;
                        continue block7;
                    }
                    case 43326: {
                        String c2 = Class5642.9DHA6RxShQnWdJoD(r2[f2], l2);
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
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class5642.9DHA6RxShQnWdJoD(k2, -695053648) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

