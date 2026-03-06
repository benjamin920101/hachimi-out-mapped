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

@HACHIMI_CLIENT(mv=100, d1={"\u92a2\u92a0\u92a8\u92a7\u92a1\u92a1\u92a6\u92a2", "\u5177\u5178\u5176\u5171\u5173\u5175\u5178\u5170", "\u511b\u5118\u511a\u511f\u511d\u5118\u511c", "\u98f6\u98f3\u98f9\u98f4\u98f3\u98f7\u98f6\u98f5", "\u1ac3\u1ac1\u1ac3\u1acd\u1ac0\u1acd\u1ac5\u1ac6", "\uac65\uac6d\uac60\uac61\uac6d\uac62\uac6d\uac6c", "\u2dee\u2dea\u2deb\u2de8\u2dec\u2dea\u2deb\u2de8", "\u5eab\u5eac\u5eaa\u5ea7\u5ead\u5ea7\u5ead\u5ea7", "\uc579\uc57d\uc57f\uc57d\uc57b\uc57e\uc57b\uc57c", "\u4c0e\u4c0e\u4c0a\u4c0b\u4c02\u4c0c\u4c0f\u4c0b", "\u79e1\u79e2\u79e0\u79e6\u79e1\u79e6\u79e9\u79e8", "\uc2b0\uc2b1\uc2b7\uc2b3\uc2b3\uc2b7\uc2b3", "\u38b9\u38b8\u38bd\u38be\u38b3\u38bd\u38bb\u38bf", "\uae63\uae67\uae67\uae60\uae6b\uae66\uae66\uae64", "\ue02c\ue02d\ue02a\ue028\ue029\ue02d\ue02f\ue02c", "\u484b\u484e\u4841\u4840\u4848\u484b\u484b\u4840"}, d2={"\u009e\u0087\u00ad\u20e1\u00d3\u00d1\u00c7\u00a3\u0085\u008e\u0099\u008e\u00c0\u0083\u008e\u0081\u0088\u00c0\u00bc\u009b\u009d\u0086\u0081\u0088\u00d4\u00c6\u00a3\u0085\u008e\u0099\u008e\u00c0\u0083\u008e\u0081\u0088\u00c0\u00bc\u009b\u009d\u0086\u0081\u0088\u00d4", "\u070e\u0717\u073c\u2771\u0743\u0741\u0757\u0733\u0715\u071e\u0709\u071e\u0750\u0713\u071e\u0711\u0718\u0750\u072c\u070b\u070d\u0716\u0711\u0718\u0744\u0756\u0733\u0715\u071e\u0709\u071e\u0750\u0713\u071e\u0711\u0718\u0750\u072c\u070b\u070d\u0716\u0711\u0718\u0744", "+t{~y~c)+)?>A", "\u03a6\u03f3\u03f4\u03f3\u03ee\u03a4\u03a6\u03a4\u03b2\u03b3\u03cc", "\u01b8\u01ba\u01ab\u019c\u01b3\u01be\u01ac\u01ac\u01e3\u01e1\u01f7\u01f6\u0193\u01b5\u01be\u01a9\u01be\u01f0\u01b3\u01be\u01b1\u01b8\u01f0\u019c\u01b3\u01be\u01ac\u01ac\u01e4", "\u0515\u051c\u050e\u0515\u053e\u0512\u0519\u0518\u0541\u0543\u0555\u0554\u0534", "\u07be\u07aa\u07ae\u07ba\u07b7\u07a8\u07e7\u07e5\u07f3\u0797\u07b1\u07ba\u07ad\u07ba\u07f4\u07b7\u07ba\u07b5\u07bc\u07f4\u0794\u07b9\u07b1\u07be\u07b8\u07af\u07e0\u07f2\u0781", "\u067c\u0673\u0670\u0671\u067a\u0623\u0621\u0637\u0636\u0653\u0675\u067e\u0669\u067e\u0630\u0673\u067e\u0671\u0678\u0630\u0650\u067d\u0675\u067a\u067c\u066b\u0624", "\u062d\u0636\u060a\u062d\u062b\u0630\u0637\u063e\u0665\u0667\u0671\u0670\u0615\u0633\u0638\u062f\u0638\u0676\u0635\u0638\u0637\u063e\u0676\u060a\u062d\u062b\u0630\u0637\u063e\u0662", "\u03ba\u03bb\u03a0\u03bd\u03b2\u03ad\u03e8\u03ea\u03fc\u03fd\u0382", "\u077c\u077d\u0766\u077b\u0774\u076b\u0753\u077e\u077e\u072e\u072c\u073a\u073b\u0744", "\u0544\u0552\u055a\u0547\u050f\u050d\u051b\u051a\u0565", "\u01e5\u01f3\u01fb\u01e6\u01ae\u01ac\u01ba\u01d8\u01bb\u01c4", "\u0115\u0103\u010b\u0116\u0152\u015e\u015c\u014a\u0128\u014b\u0134", "\u0607\u0611\u0619\u0604\u064c\u064e\u0658\u063a\u0639\u0659\u0626", "\u0433\u043c\u043b\u0434\u0439\u043c\u042f\u0430\u0469\u046b\u047d\u047c\u0403"})
public final class Class1740 {
    public static double field6532;
    public static double field6533;
    public static float field6534;

    /*
     * WARNING - void declaration
     */
    private static CallSite igBt6AgoeYyiqA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1740.nd5tttXiJOjOP9b7(k2, -1582787574));
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
                int a2 = Integer.parseInt(Class1740.nd5tttXiJOjOP9b7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1740.nd5tttXiJOjOP9b7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1740.nd5tttXiJOjOP9b7(k2, -1582787574) + " " + l2 + " " + m2);
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
        b\u200e = "Adds motion reduction to the camera";
        field6532 = Double.longBitsToDouble(4606099774590316862L);
        bi\u200e = "mixFactor";
        field6534 = Float.intBitsToFloat(1040990880);
        field6533 = Double.longBitsToDouble(4600183458962357684L);
    }

    private static String nd5tttXiJOjOP9b7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

