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

@HACHIMI_CLIENT(mv=100, d1={"\u25d1\u25d7\u25d2\u25d2\u25d4\u25d3\u25d7\u25d2", "\u40ee\u40eb\u40e2\u40e8\u40ec\u40e3\u40e8\u40e3", "\u72e5\u72e8\u72e6\u72e4\u72e8\u72e5\u72e9\u72e9", "\u2e07\u2e03\u2e07\u2e0a\u2e0a\u2e03\u2e0a\u2e0a", "\u3f1e\u3f19\u3f18\u3f18\u3f1b\u3f1c\u3f1d\u3f1d", "\u304f\u3047\u304b\u304a\u3049\u304f\u304f\u304e", "\uce1a\uce1d\uce19\uce19\uce14\uce1c\uce18\uce18", "\ua875\ua872\ua877\ua877\ua875\ua870\ua877\ua871", "\uc4c8\uc4c1\uc4ca\uc4c0\uc4ca\uc4c0\uc4c1\uc4c8", "\u3467\u3467\u3466\u3461\u3462\u3467\u3462\u3467", "\u5261\u5267\u5261\u526d\u5260\u5267\u5264\u526d", "\u1c0b\u1c0b\u1c0b\u1c09\u1c0d\u1c07\u1c0f\u1c0f", "\u2e98\u2e9c\u2e99\u2e98\u2e9e\u2e9f\u2e9e", "\u01c6\u01c9\u01c2\u01c0\u01c5\u01c7\u01c3\u01c0", "\u3a4b\u3a49\u3a4d\u3a4b\u3a49\u3a4a\u3a42\u3a4a", "\u8cbf\u8cbe\u8cbd\u8cbf\u8cb9\u8cb4\u8cb5\u8cbe"}, d2={"\u027b\u027c\u0258\u221a\u0228\u022a\u023c\u0258\u027e\u0275\u0262\u0275\u023b\u0278\u0275\u027a\u0273\u023b\u0247\u0260\u0266\u027d\u027a\u0273\u022f\u023d\u0258\u027e\u0275\u0262\u0275\u023b\u0278\u0275\u027a\u0273\u023b\u0247\u0260\u0266\u027d\u027a\u0273\u022f", "\u011d\u011a\u013f\u217c\u014e\u014c\u015a\u013e\u0118\u0113\u0104\u0113\u015d\u011e\u0113\u011c\u0115\u015d\u0121\u0106\u0100\u011b\u011c\u0115\u0149\u015b\u013e\u0118\u0113\u0104\u0113\u015d\u011e\u0113\u011c\u0115\u015d\u0121\u0106\u0100\u011b\u011c\u0115\u0149", "\u07df\u0780\u078f\u078a\u078d\u078a\u0797\u07dd\u07df\u07dd\u07cb\u07ca\u07b5", "\u0619\u064c\u064b\u064c\u0651\u061b\u0619\u061b\u060d\u060c\u0673", "\u05d7\u05d5\u05c4\u05f3\u05dc\u05d1\u05c3\u05c3\u058c\u058e\u0598\u0599\u05fc\u05da\u05d1\u05c6\u05d1\u059f\u05dc\u05d1\u05de\u05d7\u059f\u05f3\u05dc\u05d1\u05c3\u05c3\u058b", "\u0416\u041f\u040d\u0416\u043d\u0411\u041a\u041b\u0442\u0440\u0456\u0457\u0437", "\u00ea\u00fe\u00fa\u00ee\u00e3\u00fc\u00b3\u00b1\u00a7\u00c3\u00e5\u00ee\u00f9\u00ee\u00a0\u00e3\u00ee\u00e1\u00e8\u00a0\u00c0\u00ed\u00e5\u00ea\u00ec\u00fb\u00b4\u00a6\u00d5", "\u0755\u075a\u0759\u0758\u0753\u070a\u0708\u071e\u071f\u077a\u075c\u0757\u0740\u0757\u0719\u075a\u0757\u0758\u0751\u0719\u0779\u0754\u075c\u0753\u0755\u0742\u070d", "\u0732\u0729\u0715\u0732\u0734\u072f\u0728\u0721\u077a\u0778\u076e\u076f\u070a\u072c\u0727\u0730\u0727\u0769\u072a\u0727\u0728\u0721\u0769\u0715\u0732\u0734\u072f\u0728\u0721\u077d", "\u06ec\u06ed\u06f6\u06eb\u06e4\u06fb\u06be\u06bc\u06aa\u06ab\u06d4", "\u02ad\u02ac\u02b7\u02aa\u02a5\u02ba\u0282\u02af\u02af\u02ff\u02fd\u02eb\u02ea\u0295", "\u05aa\u05bc\u05b4\u05a9\u05e1\u05e3\u05f5\u05f4\u058b", "\u00f2\u00e4\u00ec\u00f1\u00b9\u00bb\u00ad\u00cf\u00ac\u00d3", "\u04e3\u04f5\u04fd\u04e0\u04a4\u04a8\u04aa\u04bc\u04de\u04bd\u04c2", "\u0270\u0266\u026e\u0273\u023b\u0239\u022f\u024d\u024e\u022e\u0251", "\u011d\u0112\u0115\u011a\u0117\u0112\u0101\u011e\u0147\u0145\u0153\u0152\u012d"})
public final class Class4150 {
    public static double field9645 = 0.21417477021474973;
    public static double field9646;
    public static double field9647;
    public static double field9648;
    public static double field9649;

    static {
        field9649 = Double.longBitsToDouble(4605187197913295568L);
        field9646 = Double.longBitsToDouble(4595947256057047932L);
        field9648 = Double.longBitsToDouble(4604355131424357603L);
        bf\u200e = "The color of the tracked spawners";
        field9647 = Double.longBitsToDouble(4604563356527579801L);
        bM\u200e = "Shoots player with beneficial tipped arrows";
    }

    private static String o0Nsah1y4BdauvgR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite WHYo09Ta4aOR38(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4150.o0Nsah1y4BdauvgR(k2, -966787318));
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
                int a2 = Integer.parseInt(Class4150.o0Nsah1y4BdauvgR(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4150.o0Nsah1y4BdauvgR(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4150.o0Nsah1y4BdauvgR(k2, -966787318) + " " + l2 + " " + m2);
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

