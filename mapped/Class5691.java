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

@HACHIMI_CLIENT(mv=100, d1={"\ucb1d\ucb1b\ucb1e\ucb19\ucb1f\ucb1b\ucb1d\ucb1e", "\u1e23\u1e2a\u1e2a\u1e20\u1e25\u1e25\u1e23\u1e22", "\u31dd\u31d5\u31dc\u31db\u31dd\u31dc\u31de\u31dc", "\ue1da\ue1db\ue1d9\ue1d7\ue1d9\ue1d8\ue1df\ue1da", "\u7e86\u7e84\u7e85\u7e8b\u7e80\u7e85\u7e82\u7e82", "\u51a2\u51a0\u51a0\u51a3\u51a2\u51a0\u51a3\u51a2", "\u892f\u892c\u892a\u8928\u8929\u892e\u892c", "\u5484\u5487\u5486\u5480\u5488\u5488\u5485\u5484", "\u5237\u523a\u5233\u5236\u523a\u5234\u5230\u5234", "\u362a\u3626\u362b\u362a\u362e\u3628\u362b\u362e", "\u2a52\u2a56\u2a56\u2a56\u2a56\u2a51\u2a51\u2a5b", "\u0aee\u0aeb\u0ae6\u0aee\u0ae8\u0aef\u0ae7", "\u4add\u4ad8\u4ad9\u4ada\u4adc\u4ad9\u4adc\u4ade", "\uc4b9\uc4bc\uc4b1\uc4bb\uc4b1\uc4bd\uc4be\uc4ba", "\u9364\u9366\u936c\u9364\u9361\u9361\u936c\u936d", "\u2c35\u2c3a\u2c30\u2c3a\u2c36\u2c32\u2c34\u2c31", "\u36ce\u36cf\u36cf\u36cd\u36cf\u36cb\u36cd\u36c3"}, d2={"\u0344\u0368\u0356\u2329\u031b\u0319\u030f\u036b\u034d\u0346\u0351\u0346\u0308\u034b\u0346\u0349\u0340\u0308\u0374\u0353\u0355\u034e\u0349\u0340\u031c\u030e\u036b\u034d\u0346\u0351\u0346\u0308\u034b\u0346\u0349\u0340\u0308\u0374\u0353\u0355\u034e\u0349\u0340\u031c", "\u07b7\u079b\u07a6\u27da\u07e8\u07ea\u07fc\u0798\u07be\u07b5\u07a2\u07b5\u07fb\u07b8\u07b5\u07ba\u07b3\u07fb\u0787\u07a0\u07a6\u07bd\u07ba\u07b3\u07ef\u07fd\u0798\u07be\u07b5\u07a2\u07b5\u07fb\u07b8\u07b5\u07ba\u07b3\u07fb\u0787\u07a0\u07a6\u07bd\u07ba\u07b3\u07ef", "\u042d\u0401\u043d\u2440\u0472\u0470\u0466\u0402\u0424\u042f\u0438\u042f\u0461\u0422\u042f\u0420\u0429\u0461\u041d\u043a\u043c\u0427\u0420\u0429\u0475\u0467\u0402\u0424\u042f\u0438\u042f\u0461\u0422\u042f\u0420\u0429\u0461\u041d\u043a\u043c\u0427\u0420\u0429\u0475", "7hgbeb\u007f575#\"]", "\u0094\u00c1\u00c6\u00c1\u00dc\u0096\u0094\u0096\u0080\u0081\u00fe", "\u032e\u032c\u033d\u030a\u0325\u0328\u033a\u033a\u0375\u0377\u0361\u0360\u0305\u0323\u0328\u033f\u0328\u0366\u0325\u0328\u0327\u032e\u0366\u030a\u0325\u0328\u033a\u033a\u0372", "\u0562\u056b\u0579\u0562\u0549\u0565\u056e\u056f\u0536\u0534\u0522\u0523\u0543", "\u06ab\u06bf\u06bb\u06af\u06a2\u06bd\u06f2\u06f0\u06e6\u0682\u06a4\u06af\u06b8\u06af\u06e1\u06a2\u06af\u06a0\u06a9\u06e1\u0681\u06ac\u06a4\u06ab\u06ad\u06ba\u06f5\u06e7\u0694", "\u06e8\u06e7\u06e4\u06e5\u06ee\u06b7\u06b5\u06a3\u06a2\u06c7\u06e1\u06ea\u06fd\u06ea\u06a4\u06e7\u06ea\u06e5\u06ec\u06a4\u06c4\u06e9\u06e1\u06ee\u06e8\u06ff\u06b0", "\u06e8\u06f3\u06cf\u06e8\u06ee\u06f5\u06f2\u06fb\u06a0\u06a2\u06b4\u06b5\u06d0\u06f6\u06fd\u06ea\u06fd\u06b3\u06f0\u06fd\u06f2\u06fb\u06b3\u06cf\u06e8\u06ee\u06f5\u06f2\u06fb\u06a7", "\u00ee\u00ef\u00f4\u00e9\u00e6\u00f9\u00bc\u00be\u00a8\u00a9\u00d6", "\u0559\u0558\u0543\u055e\u0551\u054e\u0576\u055b\u055b\u050b\u0509\u051f\u051e\u0561", "\u0450\u0446\u044e\u0453\u041b\u0419\u040f\u040e\u0471", "\u0191\u0187\u018f\u0192\u01da\u01d8\u01ce\u01ac\u01cf\u01b0", "\u05d6\u05c0\u05c8\u05d5\u0591\u059d\u059f\u0589\u05eb\u0588\u05f7", "\u0129\u013f\u0137\u012a\u0162\u0160\u0176\u0114\u0117\u0177\u0108", "\u063c\u0633\u0634\u063b\u0636\u0633\u0620\u063f\u0666\u0664\u0672\u0673\u060c"})
public final class Class5691 {
    public static double field10938 = 0.28108576977421074;
    public static double field10939;
    public static double field10940;
    public static float field10941;
    public static float field10942;
    public static double field10943;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite tVQoVvN3VNb0ii(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5691.vVIM2rWdyYE7vmlf(k2, -1928402933));
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
                int a2 = Integer.parseInt(Class5691.vVIM2rWdyYE7vmlf(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5691.vVIM2rWdyYE7vmlf(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 34720 : 34721;
        block7: while (true) {
            switch (n3) {
                case 34721: {
                    n3 = 34719;
                    continue block7;
                }
                case 34720: {
                    throw new Exception("Can't find method in " + Class5691.vVIM2rWdyYE7vmlf(k2, -1928402933) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field10943 = Double.longBitsToDouble(4619567317775286272L);
        field10940 = Double.longBitsToDouble(4604216046942020987L);
        field10942 = Float.intBitsToFloat(1050480652);
        u\u200e = "[S] ";
        af\u200e = "Plays a sound for private messages";
        field10941 = Float.intBitsToFloat(1060904462);
        aS\u200e = "Only clears above the player y-level";
        field10939 = Double.longBitsToDouble(4609434218613702656L);
    }

    private static String vVIM2rWdyYE7vmlf(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

