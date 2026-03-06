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

@HACHIMI_CLIENT(mv=100, d1={"\u6614\u6612\u661e\u6614\u661e\u6617\u6615\u6615", "\ua0d6\ua0d1\ua0d7\ua0d6\ua0d2\ua0d0\ua0d7\ua0d4", "\u4873\u4877\u4870\u4874\u4877\u4872\u487b\u4872", "\ucfbc\ucfba\ucfbe\ucfbe\ucfba\ucfbc\ucfbd\ucfba", "\u36e1\u36e3\u36e1\u36e1\u36e1\u36e1\u36e1", "\u2820\u2827\u2825\u282f\u2820\u2822\u2825\u2824", "\u4fc3\u4fc1\u4fcf\u4fc1\u4fc2\u4fcf\u4fcf", "\u9af6\u9af3\u9af5\u9af0\u9af4\u9af0\u9af3\u9af1", "\uc572\uc574\uc573\uc575\uc579\uc577\uc579\uc575", "\u3b9b\u3b9b\u3b9d\u3b9d\u3b99\u3b99\u3b9e\u3b9e", "\u84d6\u84d4\u84d5\u84d2\u84d2\u84d1\u84d0\u84d0", "\u4402\u440a\u4407\u440a\u4401\u4406\u440a\u440b", "\u3311\u3310\u3311\u3311\u331e\u331f\u3313\u3310", "\u8fd4\u8fd5\u8fd3\u8fd2\u8fd2\u8fd6\u8fd1\u8fd2", "\u8141\u8145\u8145\u8140\u8147\u8145\u8147\u814f", "\uc663\uc661\uc666\uc662\uc667\uc666\uc666\uc666", "\ua1a5\ua1a6\ua1a3\ua1af\ua1a2\ua1a7\ua1a6\ua1a1"}, d2={"\u07d2\u07f8\u07d3\u27b7\u0785\u0787\u0791\u07f5\u07d3\u07d8\u07cf\u07d8\u0796\u07d5\u07d8\u07d7\u07de\u0796\u07ea\u07cd\u07cb\u07d0\u07d7\u07de\u0782\u0790\u07f5\u07d3\u07d8\u07cf\u07d8\u0796\u07d5\u07d8\u07d7\u07de\u0796\u07ea\u07cd\u07cb\u07d0\u07d7\u07de\u0782", "\u0695\u06bf\u0695\u26f0\u06c2\u06c0\u06d6\u06b2\u0694\u069f\u0688\u069f\u06d1\u0692\u069f\u0690\u0699\u06d1\u06ad\u068a\u068c\u0697\u0690\u0699\u06c5\u06d7\u06b2\u0694\u069f\u0688\u069f\u06d1\u0692\u069f\u0690\u0699\u06d1\u06ad\u068a\u068c\u0697\u0690\u0699\u06c5", "\u018e\u01a4\u0189\u21eb\u01d9\u01db\u01cd\u01a9\u018f\u0184\u0193\u0184\u01ca\u0189\u0184\u018b\u0182\u01ca\u01b6\u0191\u0197\u018c\u018b\u0182\u01de\u01cc\u01a9\u018f\u0184\u0193\u0184\u01ca\u0189\u0184\u018b\u0182\u01ca\u01b6\u0191\u0197\u018c\u018b\u0182\u01de", "\u070c\u0753\u075c\u0759\u075e\u0759\u0744\u070e\u070c\u070e\u0718\u0719\u0766", "\u038b\u03de\u03d9\u03de\u03c3\u0389\u038b\u0389\u039f\u039e\u03e1", "\u03c1\u03c3\u03d2\u03e5\u03ca\u03c7\u03d5\u03d5\u039a\u0398\u038e\u038f\u03ea\u03cc\u03c7\u03d0\u03c7\u0389\u03ca\u03c7\u03c8\u03c1\u0389\u03e5\u03ca\u03c7\u03d5\u03d5\u039d", "\u0733\u073a\u0728\u0733\u0718\u0734\u073f\u073e\u0767\u0765\u0773\u0772\u0712", "\u01ff\u01eb\u01ef\u01fb\u01f6\u01e9\u01a6\u01a4\u01b2\u01d6\u01f0\u01fb\u01ec\u01fb\u01b5\u01f6\u01fb\u01f4\u01fd\u01b5\u01d5\u01f8\u01f0\u01ff\u01f9\u01ee\u01a1\u01b3\u01c0", "\u0371\u037e\u037d\u037c\u0377\u032e\u032c\u033a\u033b\u035e\u0378\u0373\u0364\u0373\u033d\u037e\u0373\u037c\u0375\u033d\u035d\u0370\u0378\u0377\u0371\u0366\u0329", "\u076b\u0770\u074c\u076b\u076d\u0776\u0771\u0778\u0723\u0721\u0737\u0736\u0753\u0775\u077e\u0769\u077e\u0730\u0773\u077e\u0771\u0778\u0730\u074c\u076b\u076d\u0776\u0771\u0778\u0724", "\u0777\u0776\u076d\u0770\u077f\u0760\u0725\u0727\u0731\u0730\u074f", "\u04a8\u04a9\u04b2\u04af\u04a0\u04bf\u0487\u04aa\u04aa\u04fa\u04f8\u04ee\u04ef\u0490", "\u0246\u0250\u0258\u0245\u020d\u020f\u0219\u0218\u0267", "\u0112\u0104\u010c\u0111\u0159\u015b\u014d\u012f\u014c\u0133", "\u00f7\u00e1\u00e9\u00f4\u00b0\u00bc\u00be\u00a8\u00ca\u00a9\u00d6", "\u01dc\u01ca\u01c2\u01df\u0197\u0195\u0183\u01e1\u01e2\u0182\u01fd", "\u04f6\u04f9\u04fe\u04f1\u04fc\u04f9\u04ea\u04f5\u04ac\u04ae\u04b8\u04b9\u04c6"})
public final class Class4078 {
    public static float field9439 = 0.9073522f;
    public static double field9440;
    public static int field9441 = 1;
    public static float field9442;
    public static int field9443 = 60701839;
    public static double field9444;
    public static double field9445;
    public static int field9446 = -1239734560;

    static {
        field9442 = Float.intBitsToFloat(1092616192);
        field9444 = Double.longBitsToDouble(4599653355332754040L);
        field9440 = Double.longBitsToDouble(4603606316129003999L);
        ac\u200e = "Do not wait for server response";
        am\u200e = "The max number of ticks to hold a pickaxe for the packet mine";
        field9445 = Double.longBitsToDouble(4603467327832153081L);
        aU\u200e = "Trap the enemy's head";
    }

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite YzOC8gTLAOvPJT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        String t2;
        String s2;
        Class<?> o2;
        block13: {
            int n3;
            int n4;
            block12: {
                block11: {
                    o2 = Class.forName(Class4078.AN01UFn7P2qBVQo2(k2, -843870379));
                    HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
                    if (p2.mv() < 100) {
                        throw new Exception("Outdated metadata version");
                    }
                    String[] q2 = p2.d1();
                    String[] r2 = p2.d2();
                    s2 = "";
                    t2 = "";
                    for (int f2 = 0; f2 < q2.length; ++f2) {
                        void e2;
                        try {
                            int a2 = Integer.parseInt(Class4078.AN01UFn7P2qBVQo2(q2[f2], m2));
                        }
                        catch (NumberFormatException b2) {
                            continue;
                        }
                        if (e2 % 59557 != m2.intValue()) continue;
                        String c2 = Class4078.AN01UFn7P2qBVQo2(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break;
                    }
                    if (!s2.isEmpty()) break block11;
                    n4 = 23440;
                    n3 = n4;
                    if (n3 == 23440) throw new Exception("Can't find method in " + Class4078.AN01UFn7P2qBVQo2(k2, -843870379) + " " + l2 + " " + m2);
                    if (n3 == 23441) break block12;
                    break block13;
                }
                n4 = 23441;
                if (!true) break block12;
                n3 = n4;
                if (n3 == 23440) throw new Exception("Can't find method in " + Class4078.AN01UFn7P2qBVQo2(k2, -843870379) + " " + l2 + " " + m2);
                if (n3 != 23441) break block13;
            }
            do {
                n4 = 23439;
                n3 = n4;
                if (n3 == 23440) throw new Exception("Can't find method in " + Class4078.AN01UFn7P2qBVQo2(k2, -843870379) + " " + l2 + " " + m2);
            } while (n3 == 23441);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n5 = n2 != 1 ? 41059 : 41058;
        block8: while (true) {
            switch (n5) {
                case 41059: {
                    n5 = 41057;
                    continue block8;
                }
                case 41058: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String AN01UFn7P2qBVQo2(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

