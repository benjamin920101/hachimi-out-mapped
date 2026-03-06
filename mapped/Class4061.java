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

@HACHIMI_CLIENT(mv=100, d1={"\u41ba\u41bd\u41bc\u41b9\u41b9\u41bb\u41b1\u41b9", "\u1f5b\u1f5a\u1f5f\u1f58\u1f5c\u1f50\u1f5b\u1f5b", "\u027e\u0279\u027e\u027b\u0279\u0274\u027a\u0275", "\u7570\u7572\u7576\u7579\u7576\u7577\u7579\u7575", "\u9069\u9068\u9063\u906b\u906b\u906a\u9062\u9063", "\u0f8a\u0f88\u0f88\u0f87\u0f88\u0f89\u0f8f\u0f86", "\u0208\u020d\u0209\u020a\u020a\u0209\u0209\u020c", "\u4691\u4692\u469d\u4691\u4690\u4691\u4693\u4692", "\u1bac\u1bae\u1ba1\u1ba1\u1baf\u1bad\u1bab\u1baf", "\ud086\ud08b\ud083\ud080\ud08a\ud081\ud08b\ud086", "\u91e2\u91e4\u91e7\u91e1\u91e4\u91ea\u91e4\u91e6", "\u6e43\u6e47\u6e44\u6e41\u6e43\u6e47\u6e47\u6e4d", "\ud190\ud190\ud192\ud197\ud198\ud195\ud198\ud194", "\ua3e3\ua3ef\ua3e2\ua3e1\ua3ef\ua3ee\ua3e4\ua3ee", "\ua3a2\ua3a1\ua3a3\ua3ad\ua3a6\ua3ac\ua3a4\ua3a0", "\u3eb3\u3eb9\u3eb0\u3eb3\u3eb7\u3eb8\u3eb1\u3eb4", "\u87b3\u87b6\u87b4\u87b1\u87b0\u87b5\u87b2\u87b4", "\ua5eb\ua5e1\ua5ec\ua5e8\ua5e9\ua5ee\ua5e9\ua5ea"}, d2={"\u05d4\u05d2\u05f7\u25bd\u058f\u058d\u059b\u05ff\u05d9\u05d2\u05c5\u05d2\u059c\u05df\u05d2\u05dd\u05d4\u059c\u05e0\u05c7\u05c1\u05da\u05dd\u05d4\u0588\u059a\u05ff\u05d9\u05d2\u05c5\u05d2\u059c\u05df\u05d2\u05dd\u05d4\u059c\u05e0\u05c7\u05c1\u05da\u05dd\u05d4\u0588", "\u04e9\u04ef\u04cb\u2480\u04b2\u04b0\u04a6\u04c2\u04e4\u04ef\u04f8\u04ef\u04a1\u04e2\u04ef\u04e0\u04e9\u04a1\u04dd\u04fa\u04fc\u04e7\u04e0\u04e9\u04b5\u04a7\u04c2\u04e4\u04ef\u04f8\u04ef\u04a1\u04e2\u04ef\u04e0\u04e9\u04a1\u04dd\u04fa\u04fc\u04e7\u04e0\u04e9\u04b5", "\u026c\u026a\u024d\u2205\u0237\u0235\u0223\u0247\u0261\u026a\u027d\u026a\u0224\u0267\u026a\u0265\u026c\u0224\u0258\u027f\u0279\u0262\u0265\u026c\u0230\u0222\u0247\u0261\u026a\u027d\u026a\u0224\u0267\u026a\u0265\u026c\u0224\u0258\u027f\u0279\u0262\u0265\u026c\u0230", "\u04c9\u04cf\u04e9\u24a0\u0492\u0490\u0486\u04e2\u04c4\u04cf\u04d8\u04cf\u0481\u04c2\u04cf\u04c0\u04c9\u0481\u04fd\u04da\u04dc\u04c7\u04c0\u04c9\u0495\u0487\u04e2\u04c4\u04cf\u04d8\u04cf\u0481\u04c2\u04cf\u04c0\u04c9\u0481\u04fd\u04da\u04dc\u04c7\u04c0\u04c9\u0495", "\u0019FILKLQ\u001b\u0019\u001b\r\fs", "\u01a7\u01f2\u01f5\u01f2\u01ef\u01a5\u01a7\u01a5\u01b3\u01b2\u01cd", "\u02d2\u02d0\u02c1\u02f6\u02d9\u02d4\u02c6\u02c6\u0289\u028b\u029d\u029c\u02f9\u02df\u02d4\u02c3\u02d4\u029a\u02d9\u02d4\u02db\u02d2\u029a\u02f6\u02d9\u02d4\u02c6\u02c6\u028e", "\u0508\u0501\u0513\u0508\u0523\u050f\u0504\u0505\u055c\u055e\u0548\u0549\u0529", "\u03e4\u03f0\u03f4\u03e0\u03ed\u03f2\u03bd\u03bf\u03a9\u03cd\u03eb\u03e0\u03f7\u03e0\u03ae\u03ed\u03e0\u03ef\u03e6\u03ae\u03ce\u03e3\u03eb\u03e4\u03e2\u03f5\u03ba\u03a8\u03db", "\u0794\u079b\u0798\u0799\u0792\u07cb\u07c9\u07df\u07de\u07bb\u079d\u0796\u0781\u0796\u07d8\u079b\u0796\u0799\u0790\u07d8\u07b8\u0795\u079d\u0792\u0794\u0783\u07cc", "\u01be\u01a5\u0199\u01be\u01b8\u01a3\u01a4\u01ad\u01f6\u01f4\u01e2\u01e3\u0186\u01a0\u01ab\u01bc\u01ab\u01e5\u01a6\u01ab\u01a4\u01ad\u01e5\u0199\u01be\u01b8\u01a3\u01a4\u01ad\u01f1", "\u0653\u0652\u0649\u0654\u065b\u0644\u0601\u0603\u0615\u0614\u066b", "\u0653\u0652\u0649\u0654\u065b\u0644\u067c\u0651\u0651\u0601\u0603\u0615\u0614\u066b", "\u015d\u014b\u0143\u015e\u0116\u0114\u0102\u0103\u017c", "\u070d\u071b\u0713\u070e\u0746\u0744\u0752\u0730\u0753\u072c", "\u0760\u0776\u077e\u0763\u0727\u072b\u0729\u073f\u075d\u073e\u0741", "\u0266\u0270\u0278\u0265\u022d\u022f\u0239\u025b\u0258\u0238\u0247", "^QVYTQB]\u0004\u0006\u0010\u0011n"})
public final class Class4061 {
    public static float field9372;

    /*
     * WARNING - void declaration
     */
    private static CallSite zjE6vhfRQeNPAS(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4061.WeQWbt4SXVZcDuYr(k2, 1192652934));
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
                int a2 = Integer.parseInt(Class4061.WeQWbt4SXVZcDuYr(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4061.WeQWbt4SXVZcDuYr(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4061.WeQWbt4SXVZcDuYr(k2, 1192652934) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String WeQWbt4SXVZcDuYr(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        j\u200e = "Displays the current movement speed of the player";
        field9372 = Float.intBitsToFloat(1054446568);
        aB\u200e = "RCONTROL";
        aN\u200e = "MovementFix";
        aU\u200e = "Shulkers";
    }
}

