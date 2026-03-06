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

@HACHIMI_CLIENT(mv=100, d1={"\uaea2\uaeaf\uaea3\uaea0\uaea7\uaea6\uaea6\uaea5", "\u863a\u8638\u863f\u8638\u863f\u863d\u863f\u863b", "\u65ed\u65e0\u65e0\u65e0\u65ed\u65ea\u65e0\u65ef", "\u8037\u8033\u8039\u8031\u8034\u8039\u8035\u8036", "\u1b61\u1b68\u1b69\u1b64\u1b66\u1b61\u1b61\u1b68", "\ub122\ub129\ub123\ub129\ub121\ub128\ub123\ub122", "\ub9df\ub9da\ub9d9\ub9dd\ub9d9\ub9d8\ub9df\ub9d3", "\u7601\u7602\u760c\u7601\u760d\u7607\u7604", "\u2f07\u2f0c\u2f04\u2f0c\u2f00\u2f05\u2f04\u2f00", "\u8b61\u8b62\u8b63\u8b63\u8b63\u8b6b\u8b67\u8b63", "\u1492\u1497\u1498\u1496\u1499\u1490\u1494", "\u657a\u6578\u657b\u657a\u657a\u657e\u6570\u657e", "\u8101\u8102\u8105\u8107\u8106\u8100\u8100\u8105", "\udc33\udc36\udc3a\udc30\udc34\udc36\udc37\udc3a", "\u63f9\u63f9\u63ff\u63ff\u63fc\u63fb\u63f9\u63fd", "\u904a\u904d\u9046\u904d\u904c\u9049\u904f\u9048"}, d2={"\u07ec\u07d2\u07f4\u2789\u07bb\u07b9\u07af\u07cb\u07ed\u07e6\u07f1\u07e6\u07a8\u07eb\u07e6\u07e9\u07e0\u07a8\u07d4\u07f3\u07f5\u07ee\u07e9\u07e0\u07bc\u07ae\u07cb\u07ed\u07e6\u07f1\u07e6\u07a8\u07eb\u07e6\u07e9\u07e0\u07a8\u07d4\u07f3\u07f5\u07ee\u07e9\u07e0\u07bc", "\u04fc\u04c2\u04e3\u2499\u04ab\u04a9\u04bf\u04db\u04fd\u04f6\u04e1\u04f6\u04b8\u04fb\u04f6\u04f9\u04f0\u04b8\u04c4\u04e3\u04e5\u04fe\u04f9\u04f0\u04ac\u04be\u04db\u04fd\u04f6\u04e1\u04f6\u04b8\u04fb\u04f6\u04f9\u04f0\u04b8\u04c4\u04e3\u04e5\u04fe\u04f9\u04f0\u04ac", "\u0434\u046b\u0464\u0461\u0466\u0461\u047c\u0436\u0434\u0436\u0420\u0421\u045e", "\u06a4\u06f1\u06f6\u06f1\u06ec\u06a6\u06a4\u06a6\u06b0\u06b1\u06ce", "\u0367\u0365\u0374\u0343\u036c\u0361\u0373\u0373\u033c\u033e\u0328\u0329\u034c\u036a\u0361\u0376\u0361\u032f\u036c\u0361\u036e\u0367\u032f\u0343\u036c\u0361\u0373\u0373\u033b", "\u0203\u020a\u0218\u0203\u0228\u0204\u020f\u020e\u0257\u0255\u0243\u0242\u0222", "\u0232\u0226\u0222\u0236\u023b\u0224\u026b\u0269\u027f\u021b\u023d\u0236\u0221\u0236\u0278\u023b\u0236\u0239\u0230\u0278\u0218\u0235\u023d\u0232\u0234\u0223\u026c\u027e\u020d", "\u049e\u0491\u0492\u0493\u0498\u04c1\u04c3\u04d5\u04d4\u04b1\u0497\u049c\u048b\u049c\u04d2\u0491\u049c\u0493\u049a\u04d2\u04b2\u049f\u0497\u0498\u049e\u0489\u04c6", "\u025d\u0246\u027a\u025d\u025b\u0240\u0247\u024e\u0215\u0217\u0201\u0200\u0265\u0243\u0248\u025f\u0248\u0206\u0245\u0248\u0247\u024e\u0206\u027a\u025d\u025b\u0240\u0247\u024e\u0212", "\u001a\u001b\u0000\u001d\u0012\rHJ\\]\"", "\u0389\u0388\u0393\u038e\u0381\u039e\u03a6\u038b\u038b\u03db\u03d9\u03cf\u03ce\u03b1", "\u0326\u0330\u0338\u0325\u036d\u036f\u0379\u0378\u0307", "\u05dc\u05ca\u05c2\u05df\u0597\u0595\u0583\u05e1\u0582\u05fd", "\u01e3\u01f5\u01fd\u01e0\u01a4\u01a8\u01aa\u01bc\u01de\u01bd\u01c2", "\u0343\u0355\u035d\u0340\u0308\u030a\u031c\u037e\u037d\u031d\u0362", "\u0087\u0088\u008f\u0080\u008d\u0088\u009b\u0084\u00dd\u00df\u00c9\u00c8\u00b7"})
public final class Class5637 {
    public static float field10783;
    public static double field10784;
    public static double field10785;
    public static float field10786;
    public static double field10787 = 0.9429986058874833;

    private static String mFHqr4S8Y9V4ZGGo(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field10784 = Double.longBitsToDouble(4604838036352557782L);
        K\u200e = "Dynamic";
        ao\u200e = "Blacklist";
        field10783 = Float.intBitsToFloat(0x40C00000);
        field10785 = Double.longBitsToDouble(4596772347884172204L);
        field10786 = Float.intBitsToFloat(1063943169);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite A9GrdjLn2eN9zG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5637.mFHqr4S8Y9V4ZGGo(k2, -1789343987));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5637.mFHqr4S8Y9V4ZGGo(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 9682 : 9683;
            block7: while (true) {
                switch (n3) {
                    case 9683: {
                        n3 = 9681;
                        continue block7;
                    }
                    case 9682: {
                        String c2 = Class5637.mFHqr4S8Y9V4ZGGo(r2[f2], l2);
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
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5637.mFHqr4S8Y9V4ZGGo(k2, -1789343987) + " " + l2 + " " + m2);
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

