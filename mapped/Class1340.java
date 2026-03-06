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
@HACHIMI_CLIENT(mv=100, d1={"\ua5bd\ua5ba\ua5b8\ua5ba\ua5ba\ua5b7\ua5b7\ua5b7", "\ud35d\ud351\ud35d\ud35e\ud35a\ud350\ud35f\ud35b", "\ubc77\ubc7a\ubc73\ubc75\ubc77\ubc7a\ubc70\ubc74", "\u288c\u288f\u288e\u2884\u2885\u288f\u2885\u2888", "\u01dc\u01d4\u01d8\u01d4\u01d9\u01da\u01d9\u01db", "\u7175\u7174\u7172\u7178\u7175\u7174\u7171\u7179", "\u89bf\u89bc\u89b0\u89bf\u89bd\u89b1\u89b9\u89b1", "\u4460\u4464\u4461\u4467\u4463\u4465\u4462\u4465", "\u5198\u519d\u519b\u519b\u5193\u5199\u519e\u519b", "\u86a1\u86a4\u86ad\u86a2\u86a3\u86ad\u86a3", "\u4fb2\u4fbe\u4fb3\u4fb3\u4fbf\u4fb5\u4fb7\u4fb5", "\u31aa\u31ad\u31ac\u31a9\u31a4\u31aa\u31ae\u31a9", "\u9315\u9316\u9313\u9311\u9319\u9310\u9312\u9319", "\u19a9\u19a5\u19a9\u19a5\u19a8\u19a4\u19a8\u19a8", "\u1900\u1902\u1902\u1906\u1907\u1904\u1905\u1901"}, d2={"\u03b0\u0385\u03b1\u23cc\u03fe\u03fc\u03ea\u038e\u03a8\u03a3\u03b4\u03a3\u03ed\u03ae\u03a3\u03ac\u03a5\u03ed\u0391\u03b6\u03b0\u03ab\u03ac\u03a5\u03f9\u03eb\u038e\u03a8\u03a3\u03b4\u03a3\u03ed\u03ae\u03a3\u03ac\u03a5\u03ed\u0391\u03b6\u03b0\u03ab\u03ac\u03a5\u03f9", "\u008c\u00d3\u00dc\u00d9\u00de\u00d9\u00c4\u008e\u008c\u008e\u0098\u0099\u00e6", "\u0503\u0556\u0551\u0556\u054b\u0501\u0503\u0501\u0517\u0516\u0569", "\u0443\u0441\u0450\u0467\u0448\u0445\u0457\u0457\u0418\u041a\u040c\u040d\u0468\u044e\u0445\u0452\u0445\u040b\u0448\u0445\u044a\u0443\u040b\u0467\u0448\u0445\u0457\u0457\u041f", "\u02cf\u02c6\u02d4\u02cf\u02e4\u02c8\u02c3\u02c2\u029b\u0299\u028f\u028e\u02ee", "znj~sl#!7Su~i~0s~qx0P}uz|k$6E", "\u00a9\u00a6\u00a5\u00a4\u00af\u00f6\u00f4\u00e2\u00e3\u0086\u00a0\u00ab\u00bc\u00ab\u00e5\u00a6\u00ab\u00a4\u00ad\u00e5\u0085\u00a8\u00a0\u00af\u00a9\u00be\u00f1", "\u05be\u05a5\u0599\u05be\u05b8\u05a3\u05a4\u05ad\u05f6\u05f4\u05e2\u05e3\u0586\u05a0\u05ab\u05bc\u05ab\u05e5\u05a6\u05ab\u05a4\u05ad\u05e5\u0599\u05be\u05b8\u05a3\u05a4\u05ad\u05f1", "\u04e7\u04e6\u04fd\u04e0\u04ef\u04f0\u04b5\u04b7\u04a1\u04a0\u04df", "\u048e\u048f\u0494\u0489\u0486\u0499\u04a1\u048c\u048c\u04dc\u04de\u04c8\u04c9\u04b6", "\u01d4\u01c2\u01ca\u01d7\u019f\u019d\u018b\u018a\u01f5", "\u0230\u0226\u022e\u0233\u027b\u0279\u026f\u020d\u026e\u0211", "\u0267\u0271\u0279\u0264\u0220\u022c\u022e\u0238\u025a\u0239\u0246", "\u0718\u070e\u0706\u071b\u0753\u0751\u0747\u0725\u0726\u0746\u0739", "\u0799\u0796\u0791\u079e\u0793\u0796\u0785\u079a\u07c3\u07c1\u07d7\u07d6\u07a9"})
public final class Class1340 {
    public static float field5180;
    public static double field5181;

    static {
        field5181 = Double.longBitsToDouble(4602923830951026422L);
        field5180 = Float.intBitsToFloat(1058108417);
        bH\u200e = "";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite VndOzth0QJ1N5S(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1340.1MrYqhN44oYe9ug0(k2, 215681183));
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
                int a2 = Integer.parseInt(Class1340.1MrYqhN44oYe9ug0(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1340.1MrYqhN44oYe9ug0(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1340.1MrYqhN44oYe9ug0(k2, 215681183) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 1MrYqhN44oYe9ug0(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 2006 : 2005;
            block5: while (true) {
                switch (n2) {
                    case 2006: {
                        n2 = 2004;
                        continue block5;
                    }
                    case 2005: {
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
}

