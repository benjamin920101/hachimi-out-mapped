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

@HACHIMI_CLIENT(mv=100, d1={"\u345e\u3459\u3453\u345f\u345b\u345f\u345c\u3453", "\ub7ea\ub7e2\ub7e0\ub7e5\ub7e4\ub7eb\ub7e4", "\u7e29\u7e2e\u7e2f\u7e2e\u7e27\u7e29\u7e2a\u7e2a", "\u1ab5\u1ab0\u1ab0\u1abf\u1ab5\u1abf\u1ab6\u1ab4", "\ub383\ub382\ub380\ub383\ub380\ub38f\ub385", "\u6543\u6544\u6545\u6545\u6542\u654d\u6542", "\u6e23\u6e25\u6e2f\u6e2e\u6e20\u6e2e\u6e24\u6e22", "\uda77\uda77\uda72\uda7a\uda74\uda77\uda76\uda70", "\u2b02\u2b04\u2b01\u2b08\u2b01\u2b00\u2b02\u2b01", "\u176a\u176d\u176d\u176b\u1760\u1760\u176b\u176a", "\ud8ea\ud8e1\ud8e8\ud8e8\ud8e8\ud8ea\ud8e9\ud8ec", "\uc89f\uc89f\uc89b\uc89a\uc89c\uc89a\uc89f\uc898", "\u12cb\u12c3\u12c9\u12cc\u12ca\u12c2\u12c2\u12c9", "\u83a4\u83a3\u83a5\u83a3\u83ab\u83a4\u83a1\u83ab", "\u12af\u12a9\u12af\u12a0\u12aa\u12aa\u12ad\u12ad"}, d2={"\u063f\u0621\u0637\u265d\u066f\u066d\u067b\u061f\u0639\u0632\u0625\u0632\u067c\u063f\u0632\u063d\u0634\u067c\u0600\u0627\u0621\u063a\u063d\u0634\u0668\u067a\u061f\u0639\u0632\u0625\u0632\u067c\u063f\u0632\u063d\u0634\u067c\u0600\u0627\u0621\u063a\u063d\u0634\u0668", "\u06bf\u06e0\u06ef\u06ea\u06ed\u06ea\u06f7\u06bd\u06bf\u06bd\u06ab\u06aa\u06d5", "\u043b\u046e\u0469\u046e\u0473\u0439\u043b\u0439\u042f\u042e\u0451", "\u0648\u064a\u065b\u066c\u0643\u064e\u065c\u065c\u0613\u0611\u0607\u0606\u0663\u0645\u064e\u0659\u064e\u0600\u0643\u064e\u0641\u0648\u0600\u066c\u0643\u064e\u065c\u065c\u0614", "\u04bf\u04b6\u04a4\u04bf\u0494\u04b8\u04b3\u04b2\u04eb\u04e9\u04ff\u04fe\u049e", "\u0371\u0365\u0361\u0375\u0378\u0367\u0328\u032a\u033c\u0358\u037e\u0375\u0362\u0375\u033b\u0378\u0375\u037a\u0373\u033b\u035b\u0376\u037e\u0371\u0377\u0360\u032f\u033d\u034e", "\u009c\u0093\u0090\u0091\u009a\u00c3\u00c1\u00d7\u00d6\u00b3\u0095\u009e\u0089\u009e\u00d0\u0093\u009e\u0091\u0098\u00d0\u00b0\u009d\u0095\u009a\u009c\u008b\u00c4", "\u07a6\u07bd\u0781\u07a6\u07a0\u07bb\u07bc\u07b5\u07ee\u07ec\u07fa\u07fb\u079e\u07b8\u07b3\u07a4\u07b3\u07fd\u07be\u07b3\u07bc\u07b5\u07fd\u0781\u07a6\u07a0\u07bb\u07bc\u07b5\u07e9", "\u0379\u0378\u0363\u037e\u0371\u036e\u032b\u0329\u033f\u033e\u0341", "\u03da\u03db\u03c0\u03dd\u03d2\u03cd\u03f5\u03d8\u03d8\u0388\u038a\u039c\u039d\u03e2", "\u073a\u072c\u0724\u0739\u0771\u0773\u0765\u0764\u071b", "\u0320\u0336\u033e\u0323\u036b\u0369\u037f\u031d\u037e\u0301", "\u03cb\u03dd\u03d5\u03c8\u038c\u0380\u0382\u0394\u03f6\u0395\u03ea", "\u074a\u075c\u0754\u0749\u0701\u0703\u0715\u0777\u0774\u0714\u076b", "\u02f5\u02fa\u02fd\u02f2\u02ff\u02fa\u02e9\u02f6\u02af\u02ad\u02bb\u02ba\u02c5"})
public final class Class1289 {
    public static float field5018;

    static {
        C\u200e = "MendHandItem";
        field5018 = Float.intBitsToFloat(1058491341);
    }

    private static String MzGJ5QDjY1pbUwz2(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite vLz4MOo9IBwFnv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1289.MzGJ5QDjY1pbUwz2(k2, 1484850824));
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
                int a2 = Integer.parseInt(Class1289.MzGJ5QDjY1pbUwz2(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1289.MzGJ5QDjY1pbUwz2(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1289.MzGJ5QDjY1pbUwz2(k2, 1484850824) + " " + l2 + " " + m2);
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

