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

@HACHIMI_CLIENT(mv=100, d1={"\u7898\u789b\u789b\u789f\u789a\u789c\u7898\u7895", "\udc05\udc05\udc07\udc02\udc04\udc09\udc06", "\u0df3\u0dff\u0df3\u0dff\u0df5\u0dfe\u0df5\u0df2", "\ub262\ub269\ub265\ub264\ub268\ub268\ub260\ub265", "\uafb3\uafb9\uafb8\uafb8\uafb8\uafb5\uafb6\uafb1", "\u3fc4\u3fc3\u3fc4\u3fc6\u3fc2\u3fc9\u3fc4", "\uc8f6\uc8f2\uc8f6\uc8f6\uc8f1\uc8f5\uc8f2\uc8fc", "\u2f16\u2f10\u2f1c\u2f10\u2f13\u2f17\u2f17\u2f13", "\u35ba\u35b0\u35bc\u35bc\u35b0\u35bc\u35bc\u35ba", "\u271d\u271e\u271b\u271f\u271d\u2719\u271c\u271a", "\ubeb3\ubeb1\ubeb1\ubeb3\ubebf\ubeb3\ubeb6\ubeb1", "\u3259\u325d\u3258\u3258\u325f\u325a\u325e", "\u0755\u0756\u0752\u0755\u0753\u0753\u0754\u0757", "\u4a78\u4a7c\u4a72\u4a7e\u4a7d\u4a73\u4a79\u4a73"}, d2={"\u021d\u0242\u024d\u0248\u024f\u0248\u0255\u021f\u021d\u021f\u0209\u0208\u0277", "\u07d5\u0780\u0787\u0780\u079d\u07d7\u07d5\u07d7\u07c1\u07c0\u07bf", "\u037b\u0379\u0368\u035f\u0370\u037d\u036f\u036f\u0320\u0322\u0334\u0335\u0350\u0376\u037d\u036a\u037d\u0333\u0370\u037d\u0372\u037b\u0333\u035f\u0370\u037d\u036f\u036f\u0327", "\u0404\u040d\u041f\u0404\u042f\u0403\u0408\u0409\u0450\u0452\u0444\u0445\u0425", "\u06b7\u06a3\u06a7\u06b3\u06be\u06a1\u06ee\u06ec\u06fa\u069e\u06b8\u06b3\u06a4\u06b3\u06fd\u06be\u06b3\u06bc\u06b5\u06fd\u069d\u06b0\u06b8\u06b7\u06b1\u06a6\u06e9\u06fb\u0688", "\u008a\u0085\u0086\u0087\u008c\u00d5\u00d7\u00c1\u00c0\u00a5\u0083\u0088\u009f\u0088\u00c6\u0085\u0088\u0087\u008e\u00c6\u00a6\u008b\u0083\u008c\u008a\u009d\u00d2", "\u017b\u0160\u015c\u017b\u017d\u0166\u0161\u0168\u0133\u0131\u0127\u0126\u0143\u0165\u016e\u0179\u016e\u0120\u0163\u016e\u0161\u0168\u0120\u015c\u017b\u017d\u0166\u0161\u0168\u0134", "\u033d\u033c\u0327\u033a\u0335\u032a\u036f\u036d\u037b\u037a\u0305", "\u061f\u061e\u0605\u0618\u0617\u0608\u0630\u061d\u061d\u064d\u064f\u0659\u0658\u0627", "\u02b0\u02a6\u02ae\u02b3\u02fb\u02f9\u02ef\u02ee\u0291", "\u0351\u0347\u034f\u0352\u031a\u0318\u030e\u036c\u030f\u0370", "\u067e\u0668\u0660\u067d\u0639\u0635\u0637\u0621\u0643\u0620\u065f", "\u03ff\u03e9\u03e1\u03fc\u03b4\u03b6\u03a0\u03c2\u03c1\u03a1\u03de", "\u0584\u058b\u058c\u0583\u058e\u058b\u0598\u0587\u05de\u05dc\u05ca\u05cb\u05b4"})
public final class Class3548 {
    public static int field7858 = 431261208;
    public static double field7859 = 0.876957990929334;
    public static double field7860 = Double.longBitsToDouble(4604661387708363727L);
    public static int field7861 = 0;
    public static float field7862 = Float.intBitsToFloat(1056906280);

    private static String p5NcgaW0fLwqFR1G(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite bxRuDpoJ7aigVz(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3548.p5NcgaW0fLwqFR1G(k2, -1687353087));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3548.p5NcgaW0fLwqFR1G(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3548.p5NcgaW0fLwqFR1G(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3548.p5NcgaW0fLwqFR1G(k2, -1687353087) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 45945 : 45946;
        block7: while (true) {
            switch (n3) {
                case 45946: {
                    n3 = 45944;
                    continue block7;
                }
                case 45945: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

