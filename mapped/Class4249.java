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

@HACHIMI_CLIENT(mv=100, d1={"\u783d\u7833\u783d\u7832\u7832\u7832\u783e\u7839", "\u37e7\u37e7\u37e7\u37ea\u37e2\u37eb\u37e5\u37e3", "\u3d42\u3d40\u3d42\u3d40\u3d45\u3d45\u3d45\u3d41", "\ub23c\ub23f\ub23e\ub238\ub237\ub23c\ub23e\ub23d", "\u52dd\u52d8\u52d9\u52da\u52da\u52d9\u52d8\u52d6", "\u66ad\u66a0\u66a8\u66ab\u66ac\u66af\u66a0\u66aa", "\u2a28\u2a22\u2a22\u2a29\u2a26\u2a23\u2a24", "\u765d\u7650\u765b\u765b\u765e\u765e\u7659\u765d", "\u3514\u351e\u3517\u351e\u3512\u3516\u3510\u3511", "\u4c7e\u4c7b\u4c7a\u4c7d\u4c7d\u4c7e\u4c79\u4c7e", "\ud4bd\ud4b9\ud4b0\ud4b8\ud4b1\ud4bc\ud4bc\ud4b9", "\u3ef3\u3ef7\u3ef2\u3ef5\u3ef1\u3ef3\u3ef4\u3ef8", "\u4ba8\u4ba8\u4baf\u4ba6\u4ba9\u4baf\u4ba6\u4bab", "\ue6a3\ue6a1\ue6a1\ue6a1\ue6a5\ue6a4\ue6a1\ue6a3", "\u4f60\u4f64\u4f64\u4f67\u4f65\u4f67\u4f69\u4f63"}, d2={"\u06fb\u06c6\u06f5\u269e\u06ac\u06ae\u06b8\u06dc\u06fa\u06f1\u06e6\u06f1\u06bf\u06fc\u06f1\u06fe\u06f7\u06bf\u06c3\u06e4\u06e2\u06f9\u06fe\u06f7\u06ab\u06b9\u06dc\u06fa\u06f1\u06e6\u06f1\u06bf\u06fc\u06f1\u06fe\u06f7\u06bf\u06c3\u06e4\u06e2\u06f9\u06fe\u06f7\u06ab", "a>1434)cacut\u000b", "\u0634\u0661\u0666\u0661\u067c\u0636\u0634\u0636\u0620\u0621\u065e", "\u0233\u0231\u0220\u0217\u0238\u0235\u0227\u0227\u0268\u026a\u027c\u027d\u0218\u023e\u0235\u0222\u0235\u027b\u0238\u0235\u023a\u0233\u027b\u0217\u0238\u0235\u0227\u0227\u026f", "\u0422\u042b\u0439\u0422\u0409\u0425\u042e\u042f\u0476\u0474\u0462\u0463\u0403", "\u019d\u0189\u018d\u0199\u0194\u018b\u01c4\u01c6\u01d0\u01b4\u0192\u0199\u018e\u0199\u01d7\u0194\u0199\u0196\u019f\u01d7\u01b7\u019a\u0192\u019d\u019b\u018c\u01c3\u01d1\u01a2", "\u0194\u019b\u0198\u0199\u0192\u01cb\u01c9\u01df\u01de\u01bb\u019d\u0196\u0181\u0196\u01d8\u019b\u0196\u0199\u0190\u01d8\u01b8\u0195\u019d\u0192\u0194\u0183\u01cc", "\u060c\u0617\u062b\u060c\u060a\u0611\u0616\u061f\u0644\u0646\u0650\u0651\u0634\u0612\u0619\u060e\u0619\u0657\u0614\u0619\u0616\u061f\u0657\u062b\u060c\u060a\u0611\u0616\u061f\u0643", "\u0100\u0101\u011a\u0107\u0108\u0117\u0152\u0150\u0146\u0147\u0138", "\u0322\u0323\u0338\u0325\u032a\u0335\u030d\u0320\u0320\u0370\u0372\u0364\u0365\u031a", "\u0705\u0713\u071b\u0706\u074e\u074c\u075a\u075b\u0724", "\u06b2\u06a4\u06ac\u06b1\u06f9\u06fb\u06ed\u068f\u06ec\u0693", "\u0760\u0776\u077e\u0763\u0727\u072b\u0729\u073f\u075d\u073e\u0741", "\u04dd\u04cb\u04c3\u04de\u0496\u0494\u0482\u04e0\u04e3\u0483\u04fc", "\u024c\u0243\u0244\u024b\u0246\u0243\u0250\u024f\u0216\u0214\u0202\u0203\u027c"})
public final class Class4249 {
    public static float field9923;
    public static double field9924;
    public static float field9925;
    public static double field9926;

    /*
     * WARNING - void declaration
     */
    private static CallSite ln4dqn2U5GVMKr(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4249.vMFBaLCYvmbo6SFS(k2, -1507109415));
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
                int a2 = Integer.parseInt(Class4249.vMFBaLCYvmbo6SFS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4249.vMFBaLCYvmbo6SFS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4249.vMFBaLCYvmbo6SFS(k2, -1507109415) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String vMFBaLCYvmbo6SFS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field9925 = Float.intBitsToFloat(1062077248);
        field9926 = Double.longBitsToDouble(4605907016167929358L);
        field9923 = Float.intBitsToFloat(1054069594);
        bs\u200e = "glowRadius";
        field9924 = Double.longBitsToDouble(4600723696493863150L);
    }
}

