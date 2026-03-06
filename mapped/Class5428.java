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

@HACHIMI_CLIENT(mv=100, d1={"\u6738\u6738\u673d\u6739\u673c\u673e\u6737", "\u7f1b\u7f1a\u7f1f\u7f1a\u7f18\u7f19\u7f1a\u7f1e", "\uc7dd\uc7d2\uc7d1\uc7d3\uc7d1\uc7dc\uc7d0", "\u02f4\u02f0\u02f4\u02f0\u02f6\u02f4\u02f0\u02f1", "\u8b56\u8b54\u8b55\u8b52\u8b51\u8b5d\u8b51\u8b54", "\u0b6d\u0b61\u0b69\u0b69\u0b6c\u0b61\u0b6d\u0b6e", "\ud8a4\ud8ad\ud8a9\ud8a9\ud8ae\ud8ac\ud8a8", "\u2ef6\u2ef6\u2ef5\u2ef4\u2ef3\u2ef2\u2ef5\u2efd", "\u0635\u0630\u0630\u0632\u0633\u0635\u0630\u0633", "\u8758\u875d\u875d\u8754\u8754\u8759\u8759\u8759", "\ub288\ub28e\ub280\ub28e\ub28b\ub28d\ub288\ub289", "\u951e\u9512\u951e\u951f\u9512\u951a\u9518\u951d", "\ua5ff\ua5f5\ua5f8\ua5fc\ua5fd\ua5fb\ua5f4\ua5fc", "\udcaa\udcae\udca5\udcac\udca4\udca5\udca5", "\u4cce\u4cce\u4ccf\u4ccb\u4cc8\u4cc8\u4ccc", "\u9a32\u9a34\u9a37\u9a32\u9a30\u9a34\u9a34\u9a3f", "\u2748\u274f\u2745\u274a\u274f\u274d\u274b\u2748"}, d2={"\u01bd\u0198\u01bb\u21da\u01e8\u01ea\u01fc\u0198\u01be\u01b5\u01a2\u01b5\u01fb\u01b8\u01b5\u01ba\u01b3\u01fb\u0187\u01a0\u01a6\u01bd\u01ba\u01b3\u01ef\u01fd\u0198\u01be\u01b5\u01a2\u01b5\u01fb\u01b8\u01b5\u01ba\u01b3\u01fb\u0187\u01a0\u01a6\u01bd\u01ba\u01b3\u01ef", "\u0411\u0434\u0408\u2476\u0444\u0446\u0450\u0434\u0412\u0419\u040e\u0419\u0457\u0414\u0419\u0416\u041f\u0457\u042b\u040c\u040a\u0411\u0416\u041f\u0443\u0451\u0434\u0412\u0419\u040e\u0419\u0457\u0414\u0419\u0416\u041f\u0457\u042b\u040c\u040a\u0411\u0416\u041f\u0443", "\u00bb\u009e\u00a3\u20dc\u00ee\u00ec\u00fa\u009e\u00b8\u00b3\u00a4\u00b3\u00fd\u00be\u00b3\u00bc\u00b5\u00fd\u0081\u00a6\u00a0\u00bb\u00bc\u00b5\u00e9\u00fb\u009e\u00b8\u00b3\u00a4\u00b3\u00fd\u00be\u00b3\u00bc\u00b5\u00fd\u0081\u00a6\u00a0\u00bb\u00bc\u00b5\u00e9", "\u0283\u02dc\u02d3\u02d6\u02d1\u02d6\u02cb\u0281\u0283\u0281\u0297\u0296\u02e9", "\u05db\u058e\u0589\u058e\u0593\u05d9\u05db\u05d9\u05cf\u05ce\u05b1", "\u017a\u0178\u0169\u015e\u0171\u017c\u016e\u016e\u0121\u0123\u0135\u0134\u0151\u0177\u017c\u016b\u017c\u0132\u0171\u017c\u0173\u017a\u0132\u015e\u0171\u017c\u016e\u016e\u0126", "\u06ef\u06e6\u06f4\u06ef\u06c4\u06e8\u06e3\u06e2\u06bb\u06b9\u06af\u06ae\u06ce", "\u0516\u0502\u0506\u0512\u051f\u0500\u054f\u054d\u055b\u053f\u0519\u0512\u0505\u0512\u055c\u051f\u0512\u051d\u0514\u055c\u053c\u0511\u0519\u0516\u0510\u0507\u0548\u055a\u0529", "\u06a4\u06ab\u06a8\u06a9\u06a2\u06fb\u06f9\u06ef\u06ee\u068b\u06ad\u06a6\u06b1\u06a6\u06e8\u06ab\u06a6\u06a9\u06a0\u06e8\u0688\u06a5\u06ad\u06a2\u06a4\u06b3\u06fc", "\u06da\u06c1\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0692\u0690\u0686\u0687\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695", "\u0678\u0679\u0662\u067f\u0670\u066f\u062a\u0628\u063e\u063f\u0640", "\u061e\u061f\u0604\u0619\u0616\u0609\u0631\u061c\u061c\u064c\u064e\u0658\u0659\u0626", "\u0442\u0454\u045c\u0441\u0409\u040b\u041d\u041c\u0463", "\u0338\u032e\u0326\u033b\u0373\u0371\u0367\u0305\u0366\u0319", "\u0380\u0396\u039e\u0383\u03c7\u03cb\u03c9\u03df\u03bd\u03de\u03a1", "\u0143\u0155\u015d\u0140\u0108\u010a\u011c\u017e\u017d\u011d\u0162", "\u0260\u026f\u0268\u0267\u026a\u026f\u027c\u0263\u023a\u0238\u022e\u022f\u0250"})
public final class Class5428 {
    public static float field10107 = 0.28231126f;
    public static double field10108;
    public static double field10109;
    public static float field10110 = 0.47825587f;

    private static String jQkwpovIYcyitD2g(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite NeAOcRaSGabjoT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5428.jQkwpovIYcyitD2g(k2, -2132000434));
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
                int a2 = Integer.parseInt(Class5428.jQkwpovIYcyitD2g(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5428.jQkwpovIYcyitD2g(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5428.jQkwpovIYcyitD2g(k2, -2132000434) + " " + l2 + " " + m2);
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
        field10109 = Double.longBitsToDouble(4601901744123742496L);
        field10108 = Double.longBitsToDouble(4606323337366527116L);
        af\u200e = "Allows you to fly freely using an elytra";
        ap\u200e = "Only works in walls";
        au\u200e = "ThroughWalls";
    }
}

