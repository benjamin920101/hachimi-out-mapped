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

@HACHIMI_CLIENT(mv=100, d1={"\u368b\u368e\u3689\u368e\u368d\u3689\u3688\u368f", "\u927b\u9279\u9276\u9279\u9277\u927c\u9278\u927e", "\ud1b9\ud1be\ud1bb\ud1ba\ud1bd\ud1b9\ud1b4\ud1b5", "\u7e5d\u7e5a\u7e51\u7e5f\u7e50\u7e5d\u7e5b\u7e5b", "\u54be\u54b2\u54b2\u54b2\u54be\u54be\u54bf\u54b9", "\u342d\u342f\u342a\u342c\u342f\u342e\u3429\u342b", "\u7e24\u7e20\u7e24\u7e2f\u7e20\u7e2f\u7e27\u7e23", "\u0d2d\u0d2a\u0d2a\u0d29\u0d28\u0d2b\u0d20\u0d2b", "\u85d4\u85d1\u85d1\u85d1\u85d3\u85d4\u85d8\u85d7", "\u11cb\u11ca\u11c6\u11cd\u11cc\u11cf\u11ca\u11cb", "\u82d3\u82d5\u82d3\u82d5\u82d7\u82dc\u82d2\u82dd", "\u65f4\u65f0\u65f0\u65f4\u65f5\u65fd\u65f2\u65f6", "\uae95\uae93\uae9f\uae95\uae97\uae93\uae95\uae94", "\ub1ab\ub1ad\ub1aa\ub1a8\ub1a6\ub1ae\ub1a7\ub1a7", "\u6813\u6815\u6812\u6813\u6814\u6818\u6810\u6812", "\u92b7\u92b8\u92b9\u92b8\u92b6\u92b9\u92b7\u92b7"}, d2={"\u0562\u0559\u0578\u2518\u052a\u0528\u053e\u055a\u057c\u0577\u0560\u0577\u0539\u057a\u0577\u0578\u0571\u0539\u0545\u0562\u0564\u057f\u0578\u0571\u052d\u053f\u055a\u057c\u0577\u0560\u0577\u0539\u057a\u0577\u0578\u0571\u0539\u0545\u0562\u0564\u057f\u0578\u0571\u052d", "\u0708\u0733\u0713\u2772\u0740\u0742\u0754\u0730\u0716\u071d\u070a\u071d\u0753\u0710\u071d\u0712\u071b\u0753\u072f\u0708\u070e\u0715\u0712\u071b\u0747\u0755\u0730\u0716\u071d\u070a\u071d\u0753\u0710\u071d\u0712\u071b\u0753\u072f\u0708\u070e\u0715\u0712\u071b\u0747", "\u0185\u01da\u01d5\u01d0\u01d7\u01d0\u01cd\u0187\u0185\u0187\u0191\u0190\u01ef", "g252/egesr\r", "\u015b\u0159\u0148\u017f\u0150\u015d\u014f\u014f\u0100\u0102\u0114\u0115\u0170\u0156\u015d\u014a\u015d\u0113\u0150\u015d\u0152\u015b\u0113\u017f\u0150\u015d\u014f\u014f\u0107", "09+0\u001b7<=dfpq\u0011", "H\\XLA^\u0011\u0013\u0005aGL[L\u0002ALCJ\u0002bOGHNY\u0016\u0004w", "\u01a4\u01ab\u01a8\u01a9\u01a2\u01fb\u01f9\u01ef\u01ee\u018b\u01ad\u01a6\u01b1\u01a6\u01e8\u01ab\u01a6\u01a9\u01a0\u01e8\u0188\u01a5\u01ad\u01a2\u01a4\u01b3\u01fc", "\u06d3\u06c8\u06f4\u06d3\u06d5\u06ce\u06c9\u06c0\u069b\u0699\u068f\u068e\u06eb\u06cd\u06c6\u06d1\u06c6\u0688\u06cb\u06c6\u06c9\u06c0\u0688\u06f4\u06d3\u06d5\u06ce\u06c9\u06c0\u069c", "\u07f4\u07f5\u07ee\u07f3\u07fc\u07e3\u07a6\u07a4\u07b2\u07b3\u07cc", "\u04bb\u04ba\u04a1\u04bc\u04b3\u04ac\u0494\u04b9\u04b9\u04e9\u04eb\u04fd\u04fc\u0483", "\u0011\u0007\u000f\u0012ZXNO0", "\u070e\u0718\u0710\u070d\u0745\u0747\u0751\u0733\u0750\u072f", "\u008d\u009b\u0093\u008e\u00ca\u00c6\u00c4\u00d2\u00b0\u00d3\u00ac", "\u0463\u0475\u047d\u0460\u0428\u042a\u043c\u045e\u045d\u043d\u0442", "\u05bf\u05b0\u05b7\u05b8\u05b5\u05b0\u05a3\u05bc\u05e5\u05e7\u05f1\u05f0\u058f"})
public final class Class5463 {
    public static float field10236;
    public static double field10237;

    private static String NTpIvF4dwuhh2Noy(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite R6dHmwBddWag7e(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5463.NTpIvF4dwuhh2Noy(k2, 1566004696));
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
                int a2 = Integer.parseInt(Class5463.NTpIvF4dwuhh2Noy(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5463.NTpIvF4dwuhh2Noy(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5463.NTpIvF4dwuhh2Noy(k2, 1566004696) + " " + l2 + " " + m2);
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
        c\u200e = "Auto mine target blocks";
        k\u200e = "resistance";
        field10237 = Double.longBitsToDouble(-4636005456415188582L);
        field10236 = Float.intBitsToFloat(1064848902);
    }
}

