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

@HACHIMI_CLIENT(mv=100, d1={"\u421c\u421b\u421d\u4211\u421f\u421f\u421c\u421d", "\udee4\udee0\udee9\udee1\udee3\udee1\udee4\udee2", "\u8fce\u8fca\u8fc1\u8fca\u8fc1\u8fc8\u8fcc\u8fc0", "\u1ae7\u1aee\u1ae3\u1ae3\u1ae2\u1ae7", "\uaebf\uaebe\uaeb8\uaebd\uaebc\uaebe\uaebd\uaebb", "\uacae\uaca8\uacac\uacab\uacae\uacab\uacaf\uacaf", "\u1e4c\u1e48\u1e4f\u1e4b\u1e4d\u1e4d\u1e4c\u1e47", "\u0513\u0510\u0515\u0515\u0510\u0519\u0512\u0512", "\u34cd\u34cf\u34cc\u34cb\u34ce\u34cc\u34ce\u34c1", "\u20c1\u20c3\u20c7\u20c0\u20c5\u20c7\u20cb\u20c5", "\ue19c\ue19e\ue19e\ue19b\ue199\ue19a\ue19d\ue196", "\u3fd0\u3fd6\u3fd2\u3fd1\u3fdd\u3fd5\u3fd2\u3fdc", "\u6fe2\u6feb\u6fe4\u6fe1\u6fea\u6fe6\u6fe1\u6fe6", "\u7611\u7614\u7613\u7610\u7613\u7615\u761a\u7616", "\ue17f\ue17a\ue175\ue17c\ue17c\ue17f\ue17e\ue174", "\udaf5\udaf5\udaf4\udaf5\udaf0\udaf0\udafd\udaf6", "\u7422\u7421\u7424\u7427\u7420\u7422\u7423\u7422", "\u111b\u111e\u111c\u1114\u1119\u111e\u111a\u1119"}, d2={"\u057b\u0553\u0567\u2513\u0521\u0523\u0535\u0551\u0577\u057c\u056b\u057c\u0532\u0571\u057c\u0573\u057a\u0532\u054e\u0569\u056f\u0574\u0573\u057a\u0526\u0534\u0551\u0577\u057c\u056b\u057c\u0532\u0571\u057c\u0573\u057a\u0532\u054e\u0569\u056f\u0574\u0573\u057a\u0526", "\u077e\u0756\u0759\u2716\u0724\u0726\u0730\u0754\u0772\u0779\u076e\u0779\u0737\u0774\u0779\u0776\u077f\u0737\u074b\u076c\u076a\u0771\u0776\u077f\u0723\u0731\u0754\u0772\u0779\u076e\u0779\u0737\u0774\u0779\u0776\u077f\u0737\u074b\u076c\u076a\u0771\u0776\u077f\u0723", "\u07a4\u078c\u0780\u27cc\u07fe\u07fc\u07ea\u078e\u07a8\u07a3\u07b4\u07a3\u07ed\u07ae\u07a3\u07ac\u07a5\u07ed\u0791\u07b6\u07b0\u07ab\u07ac\u07a5\u07f9\u07eb\u078e\u07a8\u07a3\u07b4\u07a3\u07ed\u07ae\u07a3\u07ac\u07a5\u07ed\u0791\u07b6\u07b0\u07ab\u07ac\u07a5\u07f9", "\u029e\u02b6\u02bb\u22f6\u02c4\u02c6\u02d0\u02b4\u0292\u0299\u028e\u0299\u02d7\u0294\u0299\u0296\u029f\u02d7\u02ab\u028c\u028a\u0291\u0296\u029f\u02c3\u02d1\u02b4\u0292\u0299\u028e\u0299\u02d7\u0294\u0299\u0296\u029f\u02d7\u02ab\u028c\u028a\u0291\u0296\u029f\u02c3", "\u0497\u04c8\u04c7\u04c2\u04c5\u04c2\u04df\u0495\u0497\u0495\u0483\u0482\u04fd", "\u07ef\u07ba\u07bd\u07ba\u07a7\u07ed\u07ef\u07ed\u07fb\u07fa\u0785", "\u0081\u0083\u0092\u00a5\u008a\u0087\u0095\u0095\u00da\u00d8\u00ce\u00cf\u00aa\u008c\u0087\u0090\u0087\u00c9\u008a\u0087\u0088\u0081\u00c9\u00a5\u008a\u0087\u0095\u0095\u00dd", "\u07e0\u07e9\u07fb\u07e0\u07cb\u07e7\u07ec\u07ed\u07b4\u07b6\u07a0\u07a1\u07c1", "\u0105\u0111\u0115\u0101\u010c\u0113\u015c\u015e\u0148\u012c\u010a\u0101\u0116\u0101\u014f\u010c\u0101\u010e\u0107\u014f\u012f\u0102\u010a\u0105\u0103\u0114\u015b\u0149\u013a", "\u03f9\u03f6\u03f5\u03f4\u03ff\u03a6\u03a4\u03b2\u03b3\u03d6\u03f0\u03fb\u03ec\u03fb\u03b5\u03f6\u03fb\u03f4\u03fd\u03b5\u03d5\u03f8\u03f0\u03ff\u03f9\u03ee\u03a1", "\u06eb\u06f0\u06cc\u06eb\u06ed\u06f6\u06f1\u06f8\u06a3\u06a1\u06b7\u06b6\u06d3\u06f5\u06fe\u06e9\u06fe\u06b0\u06f3\u06fe\u06f1\u06f8\u06b0\u06cc\u06eb\u06ed\u06f6\u06f1\u06f8\u06a4", "\u06ab\u06aa\u06b1\u06ac\u06a3\u06bc\u06f9\u06fb\u06ed\u06ec\u0693", "\u0584\u0585\u059e\u0583\u058c\u0593\u05ab\u0586\u0586\u05d6\u05d4\u05c2\u05c3\u05bc", "\u06aa\u06bc\u06b4\u06a9\u06e1\u06e3\u06f5\u06f4\u068b", "\u0577\u0561\u0569\u0574\u053c\u053e\u0528\u054a\u0529\u0556", "\u063d\u062b\u0623\u063e\u067a\u0676\u0674\u0662\u0600\u0663\u061c", "\u03c2\u03d4\u03dc\u03c1\u0389\u038b\u039d\u03ff\u03fc\u039c\u03e3", "\u0726\u0729\u072e\u0721\u072c\u0729\u073a\u0725\u077c\u077e\u0768\u0769\u0716"})
public final class Class1205 {
    public static int field4748 = 512390251;
    public static float field4749 = 0.04921788f;
    public static double field4750 = 0.0961603965638731;
    public static double field4751;
    public static double field4752;

    static {
        R\u200e = "Multi";
        field4751 = Double.longBitsToDouble(4605403927247829858L);
        aR\u200e = "The render color for ender chests";
        bb\u200e = "factor";
        field4752 = Double.longBitsToDouble(4604119971053405471L);
        bL\u200e = "Mode";
    }

    private static String pUwuYnRe8DL178CI(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite IyoKJFVXawaslw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        String t2;
        String s2;
        Class<?> o2;
        block9: {
            int n3;
            int n4;
            block8: {
                block7: {
                    o2 = Class.forName(Class1205.pUwuYnRe8DL178CI(k2, 891075862));
                    HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
                    if (p2.mv() < 100) {
                        throw new Exception("Outdated metadata version");
                    }
                    String[] q2 = p2.d1();
                    String[] r2 = p2.d2();
                    s2 = "";
                    t2 = "";
                    for (int f2 = 0; f2 < q2.length; ++f2) {
                        void e2;
                        try {
                            int a2 = Integer.parseInt(Class1205.pUwuYnRe8DL178CI(q2[f2], m2));
                        }
                        catch (NumberFormatException b2) {
                            continue;
                        }
                        if (e2 % 59557 != m2.intValue()) continue;
                        String c2 = Class1205.pUwuYnRe8DL178CI(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break;
                    }
                    if (!s2.isEmpty()) break block7;
                    n4 = 40559;
                    n3 = n4;
                    if (n3 == 40559) throw new Exception("Can't find method in " + Class1205.pUwuYnRe8DL178CI(k2, 891075862) + " " + l2 + " " + m2);
                    if (n3 == 40560) break block8;
                    break block9;
                }
                n4 = 40560;
                if (!true) break block8;
                n3 = n4;
                if (n3 == 40559) throw new Exception("Can't find method in " + Class1205.pUwuYnRe8DL178CI(k2, 891075862) + " " + l2 + " " + m2);
                if (n3 != 40560) break block9;
            }
            do {
                n4 = 40558;
                n3 = n4;
                if (n3 == 40559) throw new Exception("Can't find method in " + Class1205.pUwuYnRe8DL178CI(k2, 891075862) + " " + l2 + " " + m2);
            } while (n3 == 40560);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

