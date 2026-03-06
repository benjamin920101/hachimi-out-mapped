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

@HACHIMI_CLIENT(mv=100, d1={"\u1ad2\u1ad2\u1ad9\u1ad3\u1ad6\u1ad3\u1ad2\u1ad5", "\ue7f4\ue7f4\ue7f0\ue7f4\ue7ff\ue7f2\ue7f5", "\ua56c\ua566\ua56e\ua56c\ua56a\ua56b\ua56f", "\ub987\ub981\ub982\ub982\ub986\ub982\ub986\ub982", "\ue294\ue29b\ue293\ue293\ue297\ue291\ue29a", "\ucae0\ucae8\ucae4\ucae3\ucae6\ucae1\ucae7\ucae1", "\u4759\u4758\u475d\u4758\u4758\u475b\u4759\u475a", "\u372f\u3729\u372a\u372e\u372d\u372f\u372b\u3729", "\u6ff2\u6ff7\u6fff\u6ff4\u6ff7\u6ff0\u6ff4\u6ff1", "\u2afe\u2af8\u2af2\u2afa\u2afb\u2afb\u2aff\u2afb", "\u9ed7\u9ed6\u9ed2\u9edb\u9ed7\u9edb\u9edb\u9ed2", "\u2e16\u2e14\u2e13\u2e1c\u2e13\u2e14\u2e16\u2e12", "\u16de\u16dd\u16df\u16d6\u16da\u16d6\u16db\u16dd", "\u92f0\u92fd\u92f4\u92f1\u92f6\u92fd\u92fc\u92f7", "\u5f77\u5f76\u5f73\u5f7c\u5f74\u5f73\u5f77\u5f7c", "\u12df\u12d1\u12d0\u12dd\u12dc\u12df\u12d0", "\u1137\u1135\u1137\u1136\u1130\u113e\u113f\u113e"}, d2={"\u07fa\u07f0\u07f2\u2797\u07a5\u07a7\u07b1\u07d5\u07f3\u07f8\u07ef\u07f8\u07b6\u07f5\u07f8\u07f7\u07fe\u07b6\u07ca\u07ed\u07eb\u07f0\u07f7\u07fe\u07a2\u07b0\u07d5\u07f3\u07f8\u07ef\u07f8\u07b6\u07f5\u07f8\u07f7\u07fe\u07b6\u07ca\u07ed\u07eb\u07f0\u07f7\u07fe\u07a2", "\u05c5\u05cf\u05ca\u25a8\u059a\u0598\u058e\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05f5\u05d2\u05d4\u05cf\u05c8\u05c1\u059d\u058f\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05f5\u05d2\u05d4\u05cf\u05c8\u05c1\u059d", "\u01e4\u01ee\u01ea\u2189\u01bb\u01b9\u01af\u01cb\u01ed\u01e6\u01f1\u01e6\u01a8\u01eb\u01e6\u01e9\u01e0\u01a8\u01d4\u01f3\u01f5\u01ee\u01e9\u01e0\u01bc\u01ae\u01cb\u01ed\u01e6\u01f1\u01e6\u01a8\u01eb\u01e6\u01e9\u01e0\u01a8\u01d4\u01f3\u01f5\u01ee\u01e9\u01e0\u01bc", "\u0537\u0568\u0567\u0562\u0565\u0562\u057f\u0535\u0537\u0535\u0523\u0522\u055d", "\u03c7\u0392\u0395\u0392\u038f\u03c5\u03c7\u03c5\u03d3\u03d2\u03ad", "\u0616\u0614\u0605\u0632\u061d\u0610\u0602\u0602\u064d\u064f\u0659\u0658\u063d\u061b\u0610\u0607\u0610\u065e\u061d\u0610\u061f\u0616\u065e\u0632\u061d\u0610\u0602\u0602\u064a", "\u06f4\u06fd\u06ef\u06f4\u06df\u06f3\u06f8\u06f9\u06a0\u06a2\u06b4\u06b5\u06d5", "\u0607\u0613\u0617\u0603\u060e\u0611\u065e\u065c\u064a\u062e\u0608\u0603\u0614\u0603\u064d\u060e\u0603\u060c\u0605\u064d\u062d\u0600\u0608\u0607\u0601\u0616\u0659\u064b\u0638", "\u01a4\u01ab\u01a8\u01a9\u01a2\u01fb\u01f9\u01ef\u01ee\u018b\u01ad\u01a6\u01b1\u01a6\u01e8\u01ab\u01a6\u01a9\u01a0\u01e8\u0188\u01a5\u01ad\u01a2\u01a4\u01b3\u01fc", "\u05cb\u05d0\u05ec\u05cb\u05cd\u05d6\u05d1\u05d8\u0583\u0581\u0597\u0596\u05f3\u05d5\u05de\u05c9\u05de\u0590\u05d3\u05de\u05d1\u05d8\u0590\u05ec\u05cb\u05cd\u05d6\u05d1\u05d8\u0584", "\u0332\u0333\u0328\u0335\u033a\u0325\u0360\u0362\u0374\u0375\u030a", "\u050f\u050e\u0515\u0508\u0507\u0518\u0520\u050d\u050d\u055d\u055f\u0549\u0548\u0537", "\u0510\u0506\u050e\u0513\u055b\u0559\u054f\u054e\u0531", "\u07db\u07cd\u07c5\u07d8\u0790\u0792\u0784\u07e6\u0785\u07fa", "\u0661\u0677\u067f\u0662\u0626\u062a\u0628\u063e\u065c\u063f\u0640", "\u03d9\u03cf\u03c7\u03da\u0392\u0390\u0386\u03e4\u03e7\u0387\u03f8", "\u0212\u021d\u021a\u0215\u0218\u021d\u020e\u0211\u0248\u024a\u025c\u025d\u0222"})
public final class Class3759 {
    public static int field8511 = -1308340074;
    public static float field8512 = Float.intBitsToFloat(1063788912);

    /*
     * WARNING - void declaration
     */
    private static CallSite z3GFezBQbdFo3b(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3759.TWidtx8YABWmIWqL(k2, -913981503));
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
                int a2 = Integer.parseInt(Class3759.TWidtx8YABWmIWqL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3759.TWidtx8YABWmIWqL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3759.TWidtx8YABWmIWqL(k2, -913981503) + " " + l2 + " " + m2);
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
        bs\u200e = "The horizontal flight speed";
        bv\u200e = "BreakTimeout";
        bw\u200e = "crystal per second";
    }

    private static String TWidtx8YABWmIWqL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

