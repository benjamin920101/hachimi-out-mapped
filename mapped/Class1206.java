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

@HACHIMI_CLIENT(mv=100, d1={"\u4700\u4704\u4703\u4704\u4701\u4705\u4706\u470b", "\u6579\u657d\u6579\u6572\u657b\u657e\u657d\u6573", "\ub940\ub941\ub947\ub943\ub944\ub947\ub941\ub947", "\u3565\u3561\u3567\u3562\u3564\u3563\u3564", "\ud13d\ud13e\ud13d\ud138\ud136\ud13e\ud13d\ud13f", "\u4115\u4110\u4111\u4114\u4110\u4115\u4115\u4117", "\u9b48\u9b45\u9b4a\u9b4b\u9b4e\u9b4d\u9b4d\u9b4a", "\ucf45\ucf45\ucf45\ucf45\ucf4d\ucf4f\ucf49", "\u5daa\u5daa\u5da8\u5dae\u5da8\u5da8\u5dad\u5da8", "\ubd10\ubd14\ubd1b\ubd14\ubd1a\ubd13\ubd1a\ubd10", "\uaa37\uaa3d\uaa33\uaa34\uaa3c\uaa30\uaa3c\uaa32", "\u2c22\u2c21\u2c21\u2c23\u2c29\u2c21\u2c21\u2c28", "\ucb39\ucb36\ucb38\ucb36\ucb3c\ucb3d\ucb3c\ucb3f", "\ua878\ua87b\ua87a\ua878\ua878\ua871\ua87b\ua87a", "\u64bb\u64bb\u64b8\u64ba\u64bc\u64bf\u64ba\u64bf", "\ud5c6\ud5cf\ud5cf\ud5c6\ud5c2\ud5c5\ud5c4\ud5c7"}, d2={"\u0132\u0117\u0104\u214f\u017d\u017f\u0169\u010d\u012b\u0120\u0137\u0120\u016e\u012d\u0120\u012f\u0126\u016e\u0112\u0135\u0133\u0128\u012f\u0126\u017a\u0168\u010d\u012b\u0120\u0137\u0120\u016e\u012d\u0120\u012f\u0126\u016e\u0112\u0135\u0133\u0128\u012f\u0126\u017a", "\u06d4\u06f1\u06e1\u26a9\u069b\u0699\u068f\u06eb\u06cd\u06c6\u06d1\u06c6\u0688\u06cb\u06c6\u06c9\u06c0\u0688\u06f4\u06d3\u06d5\u06ce\u06c9\u06c0\u069c\u068e\u06eb\u06cd\u06c6\u06d1\u06c6\u0688\u06cb\u06c6\u06c9\u06c0\u0688\u06f4\u06d3\u06d5\u06ce\u06c9\u06c0\u069c", "\u042b\u0474\u047b\u047e\u0479\u047e\u0463\u0429\u042b\u0429\u043f\u043e\u0441", "\u077e\u072b\u072c\u072b\u0736\u077c\u077e\u077c\u076a\u076b\u0714", "\u04bd\u04bf\u04ae\u0499\u04b6\u04bb\u04a9\u04a9\u04e6\u04e4\u04f2\u04f3\u0496\u04b0\u04bb\u04ac\u04bb\u04f5\u04b6\u04bb\u04b4\u04bd\u04f5\u0499\u04b6\u04bb\u04a9\u04a9\u04e1", "\u0599\u0590\u0582\u0599\u05b2\u059e\u0595\u0594\u05cd\u05cf\u05d9\u05d8\u05b8", "\u0506\u0512\u0516\u0502\u050f\u0510\u055f\u055d\u054b\u052f\u0509\u0502\u0515\u0502\u054c\u050f\u0502\u050d\u0504\u054c\u052c\u0501\u0509\u0506\u0500\u0517\u0558\u054a\u0539", "\u0192\u019d\u019e\u019f\u0194\u01cd\u01cf\u01d9\u01d8\u01bd\u019b\u0190\u0187\u0190\u01de\u019d\u0190\u019f\u0196\u01de\u01be\u0193\u019b\u0194\u0192\u0185\u01ca", "\u0264\u027f\u0243\u0264\u0262\u0279\u027e\u0277\u022c\u022e\u0238\u0239\u025c\u027a\u0271\u0266\u0271\u023f\u027c\u0271\u027e\u0277\u023f\u0243\u0264\u0262\u0279\u027e\u0277\u022b", "\u04e9\u04e8\u04f3\u04ee\u04e1\u04fe\u04bb\u04b9\u04af\u04ae\u04d1", "\u021a\u021b\u0200\u021d\u0212\u020d\u0235\u0218\u0218\u0248\u024a\u025c\u025d\u0222", "\u0734\u0722\u072a\u0737\u077f\u077d\u076b\u076a\u0715", "\u05f9\u05ef\u05e7\u05fa\u05b2\u05b0\u05a6\u05c4\u05a7\u05d8", "\u050f\u0519\u0511\u050c\u0548\u0544\u0546\u0550\u0532\u0551\u052e", "\u0190\u0186\u018e\u0193\u01db\u01d9\u01cf\u01ad\u01ae\u01ce\u01b1", "\u03a0\u03af\u03a8\u03a7\u03aa\u03af\u03bc\u03a3\u03fa\u03f8\u03ee\u03ef\u0390"})
public final class Class1206 {
    public static int field4753 = -475019051;
    public static int field4754 = 817923301;

    private static String qCNjnnLAgewWQHWN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite S12T2nTTjwsm2f(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1206.qCNjnnLAgewWQHWN(k2, 46543765));
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
                int a2 = Integer.parseInt(Class1206.qCNjnnLAgewWQHWN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1206.qCNjnnLAgewWQHWN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1206.qCNjnnLAgewWQHWN(k2, 46543765) + " " + l2 + " " + m2);
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
        m\u200e = "poison";
        U\u200e = "BlockHighlight";
    }
}

