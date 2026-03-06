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
@HACHIMI_CLIENT(mv=100, d1={"\u22fb\u22f6\u22fe\u22f9\u22f8\u22f7\u22f6\u22fb", "\u305e\u3059\u3050\u3051\u305a\u3059\u3059\u305d", "\u771f\u771f\u7711\u7710\u7713\u7714\u7717", "\ub0be\ub0bc\ub0bd\ub0b9\ub0bd\ub0b2\ub0b2\ub0b8", "\u2a7a\u2a7a\u2a7b\u2a7a\u2a77\u2a7c\u2a76\u2a77", "\u213a\u2130\u213f\u2139\u213c\u2131\u213b\u2138", "\u5f9c\u5f90\u5f9b\u5f9a\u5f9d\u5f9a\u5f99\u5f9d", "\u62b3\u62b2\u62b1\u62b3\u62b2\u62bf\u62bf\u62b2", "\u68ea\u68eb\u68e8\u68e8\u68e9\u68ef\u68ea\u68e4", "\u81da\u81de\u81d9\u81d9\u81da\u81d3\u81df", "\u49b9\u49ba\u49bc\u49b3\u49ba\u49bc\u49b2\u49bb", "\u0ea4\u0ea5\u0ea1\u0ea4\u0ea3\u0ea1\u0ea4", "\u9eb9\u9eba\u9ebf\u9ebe\u9eb8\u9ebd\u9eb8\u9eb7", "\ubef7\ubef3\ubef7\ubef1\ubefb\ubef7\ubefb\ubef2", "\u3d9e\u3d9d\u3d9c\u3d95\u3d94\u3d95\u3d9a\u3d9a", "\u3cf9\u3cf8\u3cf2\u3cfe\u3cfc\u3cff\u3cfc\u3cfc", "\u7e61\u7e64\u7e61\u7e64\u7e62\u7e62\u7e61", "\u1740\u174d\u174d\u1743\u1740\u1747\u1746\u1743"}, d2={"\u040f\u042a\u0434\u246b\u0459\u045b\u044d\u0429\u040f\u0404\u0413\u0404\u044a\u0409\u0404\u040b\u0402\u044a\u0436\u0411\u0417\u040c\u040b\u0402\u045e\u044c\u0429\u040f\u0404\u0413\u0404\u044a\u0409\u0404\u040b\u0402\u044a\u0436\u0411\u0417\u040c\u040b\u0402\u045e", "\u0789\u07ac\u07b1\u27ed\u07df\u07dd\u07cb\u07af\u0789\u0782\u0795\u0782\u07cc\u078f\u0782\u078d\u0784\u07cc\u07b0\u0797\u0791\u078a\u078d\u0784\u07d8\u07ca\u07af\u0789\u0782\u0795\u0782\u07cc\u078f\u0782\u078d\u0784\u07cc\u07b0\u0797\u0791\u078a\u078d\u0784\u07d8", "\u0620\u0605\u0619\u2644\u0676\u0674\u0662\u0606\u0620\u062b\u063c\u062b\u0665\u0626\u062b\u0624\u062d\u0665\u0619\u063e\u0638\u0623\u0624\u062d\u0671\u0663\u0606\u0620\u062b\u063c\u062b\u0665\u0626\u062b\u0624\u062d\u0665\u0619\u063e\u0638\u0623\u0624\u062d\u0671", "\u065e\u067b\u0660\u263a\u0608\u060a\u061c\u0678\u065e\u0655\u0642\u0655\u061b\u0658\u0655\u065a\u0653\u061b\u0667\u0640\u0646\u065d\u065a\u0653\u060f\u061d\u0678\u065e\u0655\u0642\u0655\u061b\u0658\u0655\u065a\u0653\u061b\u0667\u0640\u0646\u065d\u065a\u0653\u060f", "\u01b1\u01ee\u01e1\u01e4\u01e3\u01e4\u01f9\u01b3\u01b1\u01b3\u01a5\u01a4\u01db", "\u00b1\u00e4\u00e3\u00e4\u00f9\u00b3\u00b1\u00b3\u00a5\u00a4\u00db", "\u0219\u021b\u020a\u023d\u0212\u021f\u020d\u020d\u0242\u0240\u0256\u0257\u0232\u0214\u021f\u0208\u021f\u0251\u0212\u021f\u0210\u0219\u0251\u023d\u0212\u021f\u020d\u020d\u0245", "\u07f8\u07f1\u07e3\u07f8\u07d3\u07ff\u07f4\u07f5\u07ac\u07ae\u07b8\u07b9\u07d9", "\u0235\u0221\u0225\u0231\u023c\u0223\u026c\u026e\u0278\u021c\u023a\u0231\u0226\u0231\u027f\u023c\u0231\u023e\u0237\u027f\u021f\u0232\u023a\u0235\u0233\u0224\u026b\u0279\u020a", "\u0790\u079f\u079c\u079d\u0796\u07cf\u07cd\u07db\u07da\u07bf\u0799\u0792\u0785\u0792\u07dc\u079f\u0792\u079d\u0794\u07dc\u07bc\u0791\u0799\u0796\u0790\u0787\u07c8", "\u0624\u063f\u0603\u0624\u0622\u0639\u063e\u0637\u066c\u066e\u0678\u0679\u061c\u063a\u0631\u0626\u0631\u067f\u063c\u0631\u063e\u0637\u067f\u0603\u0624\u0622\u0639\u063e\u0637\u066b", "\u01b2\u01b3\u01a8\u01b5\u01ba\u01a5\u01e0\u01e2\u01f4\u01f5\u018a", "\u000e\u000f\u0014\t\u0006\u0019!\f\f\\^HI6", "\u0631\u0627\u062f\u0632\u067a\u0678\u066e\u066f\u0610", "\u0621\u0637\u063f\u0622\u066a\u0668\u067e\u061c\u067f\u0600", "\u0770\u0766\u076e\u0773\u0737\u073b\u0739\u072f\u074d\u072e\u0751", "\u01b0\u01a6\u01ae\u01b3\u01fb\u01f9\u01ef\u018d\u018e\u01ee\u0191", "\u03af\u03a0\u03a7\u03a8\u03a5\u03a0\u03b3\u03ac\u03f5\u03f7\u03e1\u03e0\u039f"})
public final class Class4387 {
    public static long field10015 = 8886587200739081497L;
    public static float field10016;
    public static double field10017;
    public static float field10018;

    private static String 6hoWdJD2Qt35niuq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        f\u200e = "INSTANT";
        field10017 = Double.longBitsToDouble(0x4000000000000000L);
        field10016 = Float.intBitsToFloat(0x40800000);
        field10018 = Float.intBitsToFloat(1064680092);
        O\u200e = "MineExtend";
        U\u200e = "https://laby.net/api/v2/user/%s/get-profile";
        aS\u200e = "Debug-Ticks";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite q3FU97LG7qvV7s(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4387.6hoWdJD2Qt35niuq(k2, 1993660231));
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
                int a2 = Integer.parseInt(Class4387.6hoWdJD2Qt35niuq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4387.6hoWdJD2Qt35niuq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4387.6hoWdJD2Qt35niuq(k2, 1993660231) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

