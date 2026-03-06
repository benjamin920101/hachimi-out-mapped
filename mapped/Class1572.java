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
@HACHIMI_CLIENT(mv=100, d1={"\u230a\u2309\u230d\u230c\u2308\u2304\u230e\u230d", "\u6d99\u6d9e\u6d9e\u6d9c\u6d9c\u6d9c\u6d9c\u6d94", "\u1c52\u1c5a\u1c54\u1c5b\u1c53\u1c52\u1c5a\u1c52", "\u6004\u6003\u6003\u6003\u600f\u6002\u6000\u6000", "\u5737\u5731\u5733\u5731\u5734\u5734\u5731", "\u5c6d\u5c6a\u5c6b\u5c69\u5c6b\u5c6d\u5c6f\u5c6f", "\u37d5\u37dd\u37dc\u37d0\u37d2\u37d3\u37dc\u37dd", "\u78fd\u78f2\u78f8\u78fe\u78fe\u78f9\u78fc\u78fa", "\u02d7\u02d5\u02d3\u02d0\u02d0\u02d2\u02d6\u02d5", "\u0eb1\u0eba\u0eb1\u0eb7\u0eba\u0eb6\u0eb0\u0eb0", "\u78f4\u78f6\u78f4\u78f7\u78f2\u78f0\u78f7\u78fb", "\u8dcc\u8dcc\u8dc8\u8dcc\u8dc0\u8dc1\u8dce\u8dcf", "\u719e\u7199\u719b\u719e\u719c\u719a\u719c\u7195", "\ue865\ue86e\ue863\ue865\ue865\ue865\ue866\ue866", "\u8764\u8761\u8761\u8761\u8763\u8768\u8767\u8765", "\ub63a\ub63d\ub63d\ub637\ub63f\ub639\ub639"}, d2={"\u0231\u023e\u0239\u2253\u0261\u0263\u0275\u0211\u0237\u023c\u022b\u023c\u0272\u0231\u023c\u0233\u023a\u0272\u020e\u0229\u022f\u0234\u0233\u023a\u0266\u0274\u0211\u0237\u023c\u022b\u023c\u0272\u0231\u023c\u0233\u023a\u0272\u020e\u0229\u022f\u0234\u0233\u023a\u0266", "\u027c\u0273\u0275\u221e\u022c\u022e\u0238\u025c\u027a\u0271\u0266\u0271\u023f\u027c\u0271\u027e\u0277\u023f\u0243\u0264\u0262\u0279\u027e\u0277\u022b\u0239\u025c\u027a\u0271\u0266\u0271\u023f\u027c\u0271\u027e\u0277\u023f\u0243\u0264\u0262\u0279\u027e\u0277\u022b", "\u054c\u0513\u051c\u0519\u051e\u0519\u0504\u054e\u054c\u054e\u0558\u0559\u0526", "\u0164\u0131\u0136\u0131\u012c\u0166\u0164\u0166\u0170\u0171\u010e", "\u07ef\u07ed\u07fc\u07cb\u07e4\u07e9\u07fb\u07fb\u07b4\u07b6\u07a0\u07a1\u07c4\u07e2\u07e9\u07fe\u07e9\u07a7\u07e4\u07e9\u07e6\u07ef\u07a7\u07cb\u07e4\u07e9\u07fb\u07fb\u07b3", "\u0785\u078c\u079e\u0785\u07ae\u0782\u0789\u0788\u07d1\u07d3\u07c5\u07c4\u07a4", "\u06a8\u06bc\u06b8\u06ac\u06a1\u06be\u06f1\u06f3\u06e5\u0681\u06a7\u06ac\u06bb\u06ac\u06e2\u06a1\u06ac\u06a3\u06aa\u06e2\u0682\u06af\u06a7\u06a8\u06ae\u06b9\u06f6\u06e4\u0697", "\u076c\u0763\u0760\u0761\u076a\u0733\u0731\u0727\u0726\u0743\u0765\u076e\u0779\u076e\u0720\u0763\u076e\u0761\u0768\u0720\u0740\u076d\u0765\u076a\u076c\u077b\u0734", "\u03c2\u03d9\u03e5\u03c2\u03c4\u03df\u03d8\u03d1\u038a\u0388\u039e\u039f\u03fa\u03dc\u03d7\u03c0\u03d7\u0399\u03da\u03d7\u03d8\u03d1\u0399\u03e5\u03c2\u03c4\u03df\u03d8\u03d1\u038d", "\u05ce\u05cf\u05d4\u05c9\u05c6\u05d9\u059c\u059e\u0588\u0589\u05f6", "\u066b\u066a\u0671\u066c\u0663\u067c\u0644\u0669\u0669\u0639\u063b\u062d\u062c\u0653", "\u07ab\u07bd\u07b5\u07a8\u07e0\u07e2\u07f4\u07f5\u078a", "\u076b\u077d\u0775\u0768\u0720\u0722\u0734\u0756\u0735\u074a", "\u0530\u0526\u052e\u0533\u0577\u057b\u0579\u056f\u050d\u056e\u0511", "\u03f9\u03ef\u03e7\u03fa\u03b2\u03b0\u03a6\u03c4\u03c7\u03a7\u03d8", "\u0211\u021e\u0219\u0216\u021b\u021e\u020d\u0212\u024b\u0249\u025f\u025e\u0221"})
public final class Class1572 {
    public static double field5877 = Double.longBitsToDouble(0x3FF7333333333333L);
    public static double field5878 = 0.22781661780199758;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite TYlNvSjFBbx7tb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1572.9Eh1ELgdAnOBhWFQ(k2, 744191748));
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
                int a2 = Integer.parseInt(Class1572.9Eh1ELgdAnOBhWFQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1572.9Eh1ELgdAnOBhWFQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 33842 : 33843;
        while (true) {
            int n4 = n3;
            if (n4 == 33842) throw new Exception("Can't find method in " + Class1572.9Eh1ELgdAnOBhWFQ(k2, 744191748) + " " + l2 + " " + m2);
            if (n4 != 33843) break;
            n3 = 33841;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        bb\u200e = "glowRadius";
        bf\u200e = "whispers:";
    }

    private static String 9Eh1ELgdAnOBhWFQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

