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

@HACHIMI_CLIENT(mv=100, d1={"\u6236\u6233\u6236\u623e\u623e\u6231\u6231\u6236", "\ub605\ub608\ub60c\ub60c\ub60c\ub60b", "\u169d\u169a\u169a\u1691\u169e\u1690\u169c\u169e", "\u484c\u4846\u484b\u484b\u484a\u484d\u4846\u484c", "\uc173\uc173\uc174\uc172\uc17e\uc17f\uc17f\uc170", "\u5e15\u5e10\u5e17\u5e10\u5e17\u5e11\u5e10\u5e13", "\u0e9f\u0e9f\u0e9d\u0e9f\u0e90\u0e9a\u0e9f\u0e9c", "\u1278\u127c\u1279\u1278\u1272\u1272\u127d\u127c", "\u81c3\u81cf\u81ce\u81ce\u81ce\u81c6\u81c3\u81c3", "\u6472\u6472\u6473\u647d\u6475\u6472\u647c", "\udbfa\udbf8\udbff\udbfb\udbfd\udbfd\udbf6\udbf6", "\u0c25\u0c29\u0c23\u0c25\u0c25\u0c23\u0c24\u0c28", "\ucca2\ucca2\ucca4\ucca7\ucca2\ucca0\ucca6", "\u34e5\u34ef\u34e0\u34e1\u34ee\u34e2\u34ee\u34ee", "\u53ae\u53a9\u53ad\u53a9\u53ac\u53a8\u53ae\u53aa"}, d2={"]\u007fn\u203a\b\n\u001cx^UBU\u001bXUZS\u001bg@F]ZS\u000f\u001dx^UBU\u001bXUZS\u001bg@F]ZS\u000f", "\u060c\u0653\u065c\u0659\u065e\u0659\u0644\u060e\u060c\u060e\u0618\u0619\u0666", "\u04bb\u04ee\u04e9\u04ee\u04f3\u04b9\u04bb\u04b9\u04af\u04ae\u04d1", "\u07f3\u07f1\u07e0\u07d7\u07f8\u07f5\u07e7\u07e7\u07a8\u07aa\u07bc\u07bd\u07d8\u07fe\u07f5\u07e2\u07f5\u07bb\u07f8\u07f5\u07fa\u07f3\u07bb\u07d7\u07f8\u07f5\u07e7\u07e7\u07af", "\u0252\u025b\u0249\u0252\u0279\u0255\u025e\u025f\u0206\u0204\u0212\u0213\u0273", "\u0518\u050c\u0508\u051c\u0511\u050e\u0541\u0543\u0555\u0531\u0517\u051c\u050b\u051c\u0552\u0511\u051c\u0513\u051a\u0552\u0532\u051f\u0517\u0518\u051e\u0509\u0546\u0554\u0527", "\u0103\u010c\u010f\u010e\u0105\u015c\u015e\u0148\u0149\u012c\u010a\u0101\u0116\u0101\u014f\u010c\u0101\u010e\u0107\u014f\u012f\u0102\u010a\u0105\u0103\u0114\u015b", "\u05dd\u05c6\u05fa\u05dd\u05db\u05c0\u05c7\u05ce\u0595\u0597\u0581\u0580\u05e5\u05c3\u05c8\u05df\u05c8\u0586\u05c5\u05c8\u05c7\u05ce\u0586\u05fa\u05dd\u05db\u05c0\u05c7\u05ce\u0592", "\u0449\u0448\u0453\u044e\u0441\u045e\u041b\u0419\u040f\u040e\u0471", "\u03a2\u03a3\u03b8\u03a5\u03aa\u03b5\u038d\u03a0\u03a0\u03f0\u03f2\u03e4\u03e5\u039a", "\u0258\u024e\u0246\u025b\u0213\u0211\u0207\u0206\u0279", "\u061b\u060d\u0605\u0618\u0650\u0652\u0644\u0626\u0645\u063a", "\u0653\u0645\u064d\u0650\u0614\u0618\u061a\u060c\u066e\u060d\u0672", "\u01a4\u01b2\u01ba\u01a7\u01ef\u01ed\u01fb\u0199\u019a\u01fa\u0185", "\u06a0\u06af\u06a8\u06a7\u06aa\u06af\u06bc\u06a3\u06fa\u06f8\u06ee\u06ef\u0690"})
public final class Class3908 {
    public static float field8899 = Float.intBitsToFloat(1063687081);
    public static int field8900 = 1;
    public static int field8901 = -1108366236;
    public static float field8902;

    static {
        aJ\u200e = "Boost";
        field8902 = Float.intBitsToFloat(1042213212);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite cQsClc2xCwOW6T(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3908.cSGI9WvWFZdt6mrq(k2, 1697894420));
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
                int a2 = Integer.parseInt(Class3908.cSGI9WvWFZdt6mrq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3908.cSGI9WvWFZdt6mrq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3908.cSGI9WvWFZdt6mrq(k2, 1697894420) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String cSGI9WvWFZdt6mrq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

