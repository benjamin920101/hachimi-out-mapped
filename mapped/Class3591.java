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

@HACHIMI_CLIENT(mv=100, d1={"\u077a\u077f\u0778\u077d\u077c\u077c\u077f\u077d", "\u2a0c\u2a0c\u2a0e\u2a08\u2a09\u2a09\u2a0a", "\u2434\u243f\u2435\u2431\u2436\u243e\u2434\u2435", "\ua4d0\ua4d7\ua4d2\ua4d7\ua4d4\ua4d3\ua4d7\ua4d2", "\u5e1b\u5e13\u5e1d\u5e19\u5e1d\u5e1e\u5e1d\u5e19", "\u0eaf\u0eac\u0ea5\u0ead\u0eac\u0eab\u0ead\u0eae", "\u25f0\u25f1\u25f5\u25f2\u25f3\u25f0\u25f5\u25f1", "\ud303\ud30d\ud305\ud305\ud30d\ud303\ud305\ud303", "\u2d1c\u2d14\u2d1c\u2d1f\u2d14\u2d1e\u2d1b\u2d1f", "\u4e76\u4e76\u4e72\u4e72\u4e73\u4e71\u4e75\u4e73", "\uccc7\uccc2\uccc3\uccce\uccc2\uccc5\uccc1\uccce", "\u1a74\u1a76\u1a73\u1a72\u1a75\u1a7f\u1a75\u1a74", "\u9e01\u9e05\u9e00\u9e06\u9e0c\u9e07\u9e03\u9e04", "\u2fd9\u2fdb\u2fd9\u2fdd\u2fda\u2fdc\u2fda\u2fdf", "\u327d\u327a\u3276\u327d\u327f\u327e\u3278\u327b", "\uc5e5\uc5e5\uc5e5\uc5e3\uc5e1\uc5e7\uc5e1\uc5e7", "\u901f\u901a\u901e\u901f\u9013\u901a\u9018\u901d", "\u9a1b\u9a1b\u9a18\u9a1d\u9a1f\u9a14\u9a1b"}, d2={"\u008a\u0097\u00b7\u20ef\u00dd\u00df\u00c9\u00ad\u008b\u0080\u0097\u0080\u00ce\u008d\u0080\u008f\u0086\u00ce\u00b2\u0095\u0093\u0088\u008f\u0086\u00da\u00c8\u00ad\u008b\u0080\u0097\u0080\u00ce\u008d\u0080\u008f\u0086\u00ce\u00b2\u0095\u0093\u0088\u008f\u0086\u00da", "\u025c\u0241\u0260\u2239\u020b\u0209\u021f\u027b\u025d\u0256\u0241\u0256\u0218\u025b\u0256\u0259\u0250\u0218\u0264\u0243\u0245\u025e\u0259\u0250\u020c\u021e\u027b\u025d\u0256\u0241\u0256\u0218\u025b\u0256\u0259\u0250\u0218\u0264\u0243\u0245\u025e\u0259\u0250\u020c", "\u0281\u029c\u02b2\u22e4\u02d6\u02d4\u02c2\u02a6\u0280\u028b\u029c\u028b\u02c5\u0286\u028b\u0284\u028d\u02c5\u02b9\u029e\u0298\u0283\u0284\u028d\u02d1\u02c3\u02a6\u0280\u028b\u029c\u028b\u02c5\u0286\u028b\u0284\u028d\u02c5\u02b9\u029e\u0298\u0283\u0284\u028d\u02d1", "\u0588\u0595\u05ba\u25ed\u05df\u05dd\u05cb\u05af\u0589\u0582\u0595\u0582\u05cc\u058f\u0582\u058d\u0584\u05cc\u05b0\u0597\u0591\u058a\u058d\u0584\u05d8\u05ca\u05af\u0589\u0582\u0595\u0582\u05cc\u058f\u0582\u058d\u0584\u05cc\u05b0\u0597\u0591\u058a\u058d\u0584\u05d8", "\u0215\u024a\u0245\u0240\u0247\u0240\u025d\u0217\u0215\u0217\u0201\u0200\u027f", "G\u0012\u0015\u0012\u000fEGESR-", "\u015f\u015d\u014c\u017b\u0154\u0159\u014b\u014b\u0104\u0106\u0110\u0111\u0174\u0152\u0159\u014e\u0159\u0117\u0154\u0159\u0156\u015f\u0117\u017b\u0154\u0159\u014b\u014b\u0103", "\u027b\u0272\u0260\u027b\u0250\u027c\u0277\u0276\u022f\u022d\u023b\u023a\u025a", "\u04ff\u04eb\u04ef\u04fb\u04f6\u04e9\u04a6\u04a4\u04b2\u04d6\u04f0\u04fb\u04ec\u04fb\u04b5\u04f6\u04fb\u04f4\u04fd\u04b5\u04d5\u04f8\u04f0\u04ff\u04f9\u04ee\u04a1\u04b3\u04c0", "\u072a\u0725\u0726\u0727\u072c\u0775\u0777\u0761\u0760\u0705\u0723\u0728\u073f\u0728\u0766\u0725\u0728\u0727\u072e\u0766\u0706\u072b\u0723\u072c\u072a\u073d\u0772", "\u0433\u0428\u0414\u0433\u0435\u042e\u0429\u0420\u047b\u0479\u046f\u046e\u040b\u042d\u0426\u0431\u0426\u0468\u042b\u0426\u0429\u0420\u0468\u0414\u0433\u0435\u042e\u0429\u0420\u047c", "\u077f\u077e\u0765\u0778\u0777\u0768\u072d\u072f\u0739\u0738\u0747", "\u0770\u0771\u076a\u0777\u0778\u0767\u075f\u0772\u0772\u0722\u0720\u0736\u0737\u0748", "&08%moyx\u0007", "\u038d\u039b\u0393\u038e\u03c6\u03c4\u03d2\u03b0\u03d3\u03ac", "\u028b\u029d\u0295\u0288\u02cc\u02c0\u02c2\u02d4\u02b6\u02d5\u02aa", "\u02a8\u02be\u02b6\u02ab\u02e3\u02e1\u02f7\u0295\u0296\u02f6\u0289", "\u052b\u0524\u0523\u052c\u0521\u0524\u0537\u0528\u0571\u0573\u0565\u0564\u051b"})
public final class Class3591 {
    public static double field8003;
    public static double field8004 = 0.9341700601251857;
    public static float field8005;

    private static String TkCv54UvTYvXy9C2(String a2, int b2) {
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
    private static CallSite gJlPbQ7wj6qIBx(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3591.TkCv54UvTYvXy9C2(k2, -1972055281));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 5157 : 5156;
        block6: while (true) {
            switch (n3) {
                case 5157: {
                    n3 = 5155;
                    continue block6;
                }
                case 5156: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3591.TkCv54UvTYvXy9C2(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3591.TkCv54UvTYvXy9C2(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3591.TkCv54UvTYvXy9C2(k2, -1972055281) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        o\u200e = "Animation easing";
        aq\u200e = "Vanilla";
        aM\u200e = "Make your elytra unbreakable";
        field8003 = Double.longBitsToDouble(4604622404620576311L);
        bp\u200e = "Toggle the module when you released the keybind";
        field8005 = Float.intBitsToFloat(1063099834);
    }
}

