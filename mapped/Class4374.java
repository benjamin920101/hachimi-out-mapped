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

@HACHIMI_CLIENT(mv=100, d1={"\u85bf\u85ba\u85b0\u85b0\u85b1\u85bd\u85b9\u85ba", "\u0c9c\u0c9f\u0c94\u0c95\u0c9b\u0c9b\u0c9a\u0c9c", "\ud12a\ud121\ud120\ud12d\ud12d\ud12b\ud12c\ud129", "\u60fe\u60fb\u60fd\u60f8\u60fb\u60fa\u60fb\u60fb", "\u626e\u626f\u626c\u6267\u6267\u626e\u626f\u626e", "\u720e\u720b\u720e\u720b\u720e\u7209\u7209\u720e", "\u9126\u9127\u9120\u9127\u9125\u9122\u9120", "\ub002\ub00f\ub005\ub003\ub00e\ub005\ub006\ub000", "\ua87b\ua877\ua87a\ua87c\ua87f\ua87a\ua87f\ua87b", "\u8a17\u8a16\u8a13\u8a13\u8a13\u8a1b\u8a1a\u8a1b", "\u12b0\u12bf\u12b8\u12b8\u12b8\u12be\u12be", "\ud375\ud372\ud373\ud374\ud375\ud371\ud372\ud376", "\u99f6\u99f5\u99f0\u99f5\u99f2\u99f7\u99f7\u99ff", "\uaa13\uaa17\uaa11\uaa15\uaa1f\uaa16\uaa15\uaa12"}, d2={"\u043c\u0463\u046c\u0469\u046e\u0469\u0474\u043e\u043c\u043e\u0428\u0429\u0456", "\u0631\u0664\u0663\u0664\u0679\u0633\u0631\u0633\u0625\u0624\u065b", "\u0179\u017b\u016a\u015d\u0172\u017f\u016d\u016d\u0122\u0120\u0136\u0137\u0152\u0174\u017f\u0168\u017f\u0131\u0172\u017f\u0170\u0179\u0131\u015d\u0172\u017f\u016d\u016d\u0125", "\u0558\u0551\u0543\u0558\u0573\u055f\u0554\u0555\u050c\u050e\u0518\u0519\u0579", "\u02b4\u02a0\u02a4\u02b0\u02bd\u02a2\u02ed\u02ef\u02f9\u029d\u02bb\u02b0\u02a7\u02b0\u02fe\u02bd\u02b0\u02bf\u02b6\u02fe\u029e\u02b3\u02bb\u02b4\u02b2\u02a5\u02ea\u02f8\u028b", "\u0234\u023b\u0238\u0239\u0232\u026b\u0269\u027f\u027e\u021b\u023d\u0236\u0221\u0236\u0278\u023b\u0236\u0239\u0230\u0278\u0218\u0235\u023d\u0232\u0234\u0223\u026c", "\u05ba\u05a1\u059d\u05ba\u05bc\u05a7\u05a0\u05a9\u05f2\u05f0\u05e6\u05e7\u0582\u05a4\u05af\u05b8\u05af\u05e1\u05a2\u05af\u05a0\u05a9\u05e1\u059d\u05ba\u05bc\u05a7\u05a0\u05a9\u05f5", "\u060a\u060b\u0610\u060d\u0602\u061d\u0658\u065a\u064c\u064d\u0632", "\u0671\u0670\u066b\u0676\u0679\u0666\u065e\u0673\u0673\u0623\u0621\u0637\u0636\u0649", "\u0758\u074e\u0746\u075b\u0713\u0711\u0707\u0706\u0779", "\u0695\u0683\u068b\u0696\u06de\u06dc\u06ca\u06a8\u06cb\u06b4", "\u04a0\u04b6\u04be\u04a3\u04e7\u04eb\u04e9\u04ff\u049d\u04fe\u0481", "\u0445\u0453\u045b\u0446\u040e\u040c\u041a\u0478\u047b\u041b\u0464", "\u056d\u0562\u0565\u056a\u0567\u0562\u0571\u056e\u0537\u0535\u0523\u0522\u055d"})
public final class Class4374 {
    public static float field9973 = Float.intBitsToFloat(1050153110);

    /*
     * WARNING - void declaration
     */
    private static CallSite gGXCTuFggXAWEb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4374.RbfYikvMflSXBP8s(k2, 1359273852));
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
                int a2 = Integer.parseInt(Class4374.RbfYikvMflSXBP8s(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4374.RbfYikvMflSXBP8s(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4374.RbfYikvMflSXBP8s(k2, 1359273852) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String RbfYikvMflSXBP8s(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

