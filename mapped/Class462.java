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

@HACHIMI_CLIENT(mv=100, d1={"\u9287\u9282\u9285\u928a\u9282\u9283\u9283\u928a", "\udd54\udd54\udd54\udd5c\udd56\udd5d\udd56\udd53", "\uc900\uc901\uc901\uc906\uc90e\uc904\uc900\uc904", "\u1d52\u1d5b\u1d57\u1d52\u1d53\u1d55\u1d50\u1d55", "\ub903\ub906\ub903\ub905\ub900\ub900\ub903", "\u0a42\u0a40\u0a42\u0a41\u0a4a\u0a41\u0a4a", "\u41bc\u41b0\u41b9\u41b1\u41b0\u41bb\u41b0\u41b1", "\u48fb\u48fa\u48fa\u48f9\u48fc\u48fd\u48fb\u48f9", "\u20b0\u20b2\u20b6\u20b5\u20b2\u20b7\u20be", "\u31e6\u31eb\u31e2\u31e0\u31ea\u31e3\u31e4\u31e7", "\u2f97\u2f93\u2f95\u2f92\u2f95\u2f94\u2f95\u2f92", "\ua96a\ua96b\ua96e\ua968\ua966\ua96a\ua96b\ua96e", "\u627b\u627e\u6278\u6271\u627a\u6278\u627c\u627a", "\u0201\u0203\u0204\u020a\u0206\u020a\u020a\u0204", "\u8690\u8695\u869f\u8695\u869f\u8697\u8695\u8697", "\u5db8\u5dbe\u5dba\u5dbc\u5dbc\u5db9\u5dba\u5dbb", "\ube07\ube0c\ube03\ube04\ube05\ube05\ube0c\ube01"}, d2={"\u076e\u0777\u0766\u270e\u073c\u073e\u0728\u074c\u076a\u0761\u0776\u0761\u072f\u076c\u0761\u076e\u0767\u072f\u0753\u0774\u0772\u0769\u076e\u0767\u073b\u0729\u074c\u076a\u0761\u0776\u0761\u072f\u076c\u0761\u076e\u0767\u072f\u0753\u0774\u0772\u0769\u076e\u0767\u073b", "\u0132\u012b\u013b\u2152\u0160\u0162\u0174\u0110\u0136\u013d\u012a\u013d\u0173\u0130\u013d\u0132\u013b\u0173\u010f\u0128\u012e\u0135\u0132\u013b\u0167\u0175\u0110\u0136\u013d\u012a\u013d\u0173\u0130\u013d\u0132\u013b\u0173\u010f\u0128\u012e\u0135\u0132\u013b\u0167", "\u03b0\u03a9\u03b6\u23d0\u03e2\u03e0\u03f6\u0392\u03b4\u03bf\u03a8\u03bf\u03f1\u03b2\u03bf\u03b0\u03b9\u03f1\u038d\u03aa\u03ac\u03b7\u03b0\u03b9\u03e5\u03f7\u0392\u03b4\u03bf\u03a8\u03bf\u03f1\u03b2\u03bf\u03b0\u03b9\u03f1\u038d\u03aa\u03ac\u03b7\u03b0\u03b9\u03e5", "A\u001e\u0011\u0014\u0013\u0014\tCACUT+", "\u026f\u023a\u023d\u023a\u0227\u026d\u026f\u026d\u027b\u027a\u0205", "\u04a3\u04a1\u04b0\u0487\u04a8\u04a5\u04b7\u04b7\u04f8\u04fa\u04ec\u04ed\u0488\u04ae\u04a5\u04b2\u04a5\u04eb\u04a8\u04a5\u04aa\u04a3\u04eb\u0487\u04a8\u04a5\u04b7\u04b7\u04ff", "\u045c\u0455\u0447\u045c\u0477\u045b\u0450\u0451\u0408\u040a\u041c\u041d\u047d", "\u03df\u03cb\u03cf\u03db\u03d6\u03c9\u0386\u0384\u0392\u03f6\u03d0\u03db\u03cc\u03db\u0395\u03d6\u03db\u03d4\u03dd\u0395\u03f5\u03d8\u03d0\u03df\u03d9\u03ce\u0381\u0393\u03e0", "\u0122\u012d\u012e\u012f\u0124\u017d\u017f\u0169\u0168\u010d\u012b\u0120\u0137\u0120\u016e\u012d\u0120\u012f\u0126\u016e\u010e\u0123\u012b\u0124\u0122\u0135\u017a", "\u010c\u0117\u012b\u010c\u010a\u0111\u0116\u011f\u0144\u0146\u0150\u0151\u0134\u0112\u0119\u010e\u0119\u0157\u0114\u0119\u0116\u011f\u0157\u012b\u010c\u010a\u0111\u0116\u011f\u0143", "\u06d9\u06d8\u06c3\u06de\u06d1\u06ce\u068b\u0689\u069f\u069e\u06e1", "\u0456\u0457\u044c\u0451\u045e\u0441\u0479\u0454\u0454\u0404\u0406\u0410\u0411\u046e", "\u030d\u031b\u0313\u030e\u0346\u0344\u0352\u0353\u032c", "\u06fe\u06e8\u06e0\u06fd\u06b5\u06b7\u06a1\u06c3\u06a0\u06df", "\u0591\u0587\u058f\u0592\u05d6\u05da\u05d8\u05ce\u05ac\u05cf\u05b0", "\u04e6\u04f0\u04f8\u04e5\u04ad\u04af\u04b9\u04db\u04d8\u04b8\u04c7", "\u04a8\u04a7\u04a0\u04af\u04a2\u04a7\u04b4\u04ab\u04f2\u04f0\u04e6\u04e7\u0498"})
public final class Class462 {
    public static float field2428 = 0.07255393f;
    public static float field2429;
    public static int field2430 = 1;
    public static double field2431;
    public static float field2432;
    public static double field2433;
    public static int field2434 = 129872760;

    /*
     * Enabled aggressive block sorting
     */
    private static String Wet9aqy92d1JSukq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 1850 : 1851;
            block5: while (true) {
                switch (n2) {
                    case 1851: {
                        n2 = 1849;
                        continue block5;
                    }
                    case 1850: {
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
    private static CallSite dUd0ySAVIzCwlk(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class462.Wet9aqy92d1JSukq(k2, 2051198944));
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
                int a2 = Integer.parseInt(Class462.Wet9aqy92d1JSukq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class462.Wet9aqy92d1JSukq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class462.Wet9aqy92d1JSukq(k2, 2051198944) + " " + l2 + " " + m2);
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
        G\u200e = "The gap between the lines";
        L\u200e = "TargetRange";
        field2431 = Double.longBitsToDouble(4604632794734309313L);
        field2429 = Float.intBitsToFloat(1063799720);
        field2433 = Double.longBitsToDouble(4598641966798401476L);
        bz\u200e = "InstantMax";
        field2432 = Float.intBitsToFloat(1061076834);
    }
}

