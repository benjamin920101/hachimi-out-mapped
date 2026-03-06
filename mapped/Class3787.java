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

@HACHIMI_CLIENT(mv=100, d1={"\u9be3\u9bea\u9bea\u9be4\u9be3\u9be7\u9be5", "\u5037\u5036\u5035\u5038\u5039\u5034\u5037\u5033", "\u9b5b\u9b5b\u9b5b\u9b5f\u9b56\u9b58\u9b5a\u9b59", "\u8a6a\u8a69\u8a6e\u8a6b\u8a6d\u8a6f\u8a6f", "\u9412\u9410\u9417\u941a\u9414\u941b\u9413\u9416", "\u319c\u319f\u319c\u3197\u3199\u3198\u3197\u3196", "\ubf38\ubf35\ubf3c\ubf3c\ubf3b\ubf34\ubf35\ubf39", "\ub2a0\ub2ad\ub2a1\ub2ad\ub2a3\ub2a5\ub2a0\ub2a4", "\ue099\ue09b\ue093\ue092\ue09a\ue09a\ue09c\ue09c", "\uaace\uaacf\uaacc\uaaca\uaacc\uaacb\uaac2\uaacc", "\u69ef\u69e8\u69e3\u69ed\u69e9\u69e8\u69ed\u69eb", "\u7801\u780d\u7806\u7806\u7804\u7800\u7805\u7805", "\u86de\u86d8\u86dc\u86d9\u86da\u86d9\u86dc\u86df", "\ub037\ub034\ub038\ub037\ub032\ub033\ub036", "\u888b\u8880\u8889\u888a\u8880\u888b\u888f\u8889", "\ub7ca\ub7c6\ub7cb\ub7cc\ub7cd\ub7cb\ub7c9", "\ua953\ua950\ua957\ua951\ua955\ua952\ua951\ua955"}, d2={"\u0000\u000b9\u206d_]K/\t\u0002\u0015\u0002L\u000f\u0002\r\u0004L0\u0017\u0011\n\r\u0004XJ/\t\u0002\u0015\u0002L\u000f\u0002\r\u0004L0\u0017\u0011\n\r\u0004X", "\u02fb\u02f1\u02f9\u2296\u02a4\u02a6\u02b0\u02d4\u02f2\u02f9\u02ee\u02f9\u02b7\u02f4\u02f9\u02f6\u02ff\u02b7\u02cb\u02ec\u02ea\u02f1\u02f6\u02ff\u02a3\u02b1\u02d4\u02f2\u02f9\u02ee\u02f9\u02b7\u02f4\u02f9\u02f6\u02ff\u02b7\u02cb\u02ec\u02ea\u02f1\u02f6\u02ff\u02a3", "\u03dc\u03d6\u03dd\u23b1\u0383\u0381\u0397\u03f3\u03d5\u03de\u03c9\u03de\u0390\u03d3\u03de\u03d1\u03d8\u0390\u03ec\u03cb\u03cd\u03d6\u03d1\u03d8\u0384\u0396\u03f3\u03d5\u03de\u03c9\u03de\u0390\u03d3\u03de\u03d1\u03d8\u0390\u03ec\u03cb\u03cd\u03d6\u03d1\u03d8\u0384", "\u050e\u0551\u055e\u055b\u055c\u055b\u0546\u050c\u050e\u050c\u051a\u051b\u0564", "\u03f2\u03a7\u03a0\u03a7\u03ba\u03f0\u03f2\u03f0\u03e6\u03e7\u0398", "\u0680\u0682\u0693\u06a4\u068b\u0686\u0694\u0694\u06db\u06d9\u06cf\u06ce\u06ab\u068d\u0686\u0691\u0686\u06c8\u068b\u0686\u0689\u0680\u06c8\u06a4\u068b\u0686\u0694\u0694\u06dc", "\u00c2\u00cb\u00d9\u00c2\u00e9\u00c5\u00ce\u00cf\u0096\u0094\u0082\u0083\u00e3", "\u06ea\u06fe\u06fa\u06ee\u06e3\u06fc\u06b3\u06b1\u06a7\u06c3\u06e5\u06ee\u06f9\u06ee\u06a0\u06e3\u06ee\u06e1\u06e8\u06a0\u06c0\u06ed\u06e5\u06ea\u06ec\u06fb\u06b4\u06a6\u06d5", "\u0719\u0716\u0715\u0714\u071f\u0746\u0744\u0752\u0753\u0736\u0710\u071b\u070c\u071b\u0755\u0716\u071b\u0714\u071d\u0755\u0735\u0718\u0710\u071f\u0719\u070e\u0741", "\u0450\u044b\u0477\u0450\u0456\u044d\u044a\u0443\u0418\u041a\u040c\u040d\u0468\u044e\u0445\u0452\u0445\u040b\u0448\u0445\u044a\u0443\u040b\u0477\u0450\u0456\u044d\u044a\u0443\u041f", "\u0281\u0280\u029b\u0286\u0289\u0296\u02d3\u02d1\u02c7\u02c6\u02b9", "\u018b\u018a\u0191\u018c\u0183\u019c\u01a4\u0189\u0189\u01d9\u01db\u01cd\u01cc\u01b3", "\u0649\u065f\u0657\u064a\u0602\u0600\u0616\u0617\u0668", "\u048f\u0499\u0491\u048c\u04c4\u04c6\u04d0\u04b2\u04d1\u04ae", "\u00a7\u00b1\u00b9\u00a4\u00e0\u00ec\u00ee\u00f8\u009a\u00f9\u0086", "\u05b8\u05ae\u05a6\u05bb\u05f3\u05f1\u05e7\u0585\u0586\u05e6\u0599", "\u04ed\u04e2\u04e5\u04ea\u04e7\u04e2\u04f1\u04ee\u04b7\u04b5\u04a3\u04a2\u04dd"})
public final class Class3787 {
    public static float field8583;
    public static double field8584;
    public static float field8585 = 0.67024076f;

    private static String fPCGywVTxqGQRAW7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite jOuymNQPXH7yWM(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3787.fPCGywVTxqGQRAW7(k2, 895724377));
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
                int a2 = Integer.parseInt(Class3787.fPCGywVTxqGQRAW7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3787.fPCGywVTxqGQRAW7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3787.fPCGywVTxqGQRAW7(k2, 895724377) + " " + l2 + " " + m2);
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
        q\u200e = "FADE";
        field8583 = Float.intBitsToFloat(1037442864);
        L\u200e = "Logs CommonPongC2SPacket";
        bn\u200e = "Safety";
        field8584 = Double.longBitsToDouble(4604002399405175001L);
    }
}

