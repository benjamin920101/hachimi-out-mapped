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

@HACHIMI_CLIENT(mv=100, d1={"\u413f\u4136\u4138\u413c\u4137\u413c\u413f", "\ua6ef\ua6e9\ua6ec\ua6ed\ua6ee\ua6ea\ua6e9\ua6e8", "\u0349\u0348\u0345\u0343\u0342\u0347", "\u3e58\u3e5b\u3e52\u3e5b\u3e59\u3e52\u3e5e\u3e5a", "\u44f8\u44f3\u44fd\u44f9\u44fc\u44ff\u44ff\u44f9", "\u0fe0\u0fe2\u0fe6\u0fe6\u0fe4\u0fe6\u0fec\u0fe0", "\u08af\u08ae\u08ad\u08a4\u08ae\u08a4\u08ae", "\u5d11\u5d13\u5d11\u5d14\u5d1d\u5d12\u5d11\u5d1d", "\u4ab4\u4ab4\u4ab4\u4ab4\u4ab8\u4ab5\u4ab9\u4ab4", "\u73b0\u73b6\u73b0\u73b7\u73b5\u73bb\u73b4\u73b1", "\u10f1\u10f3\u10fc\u10fd\u10f7\u10f2\u10fd\u10f2", "\ua6a3\ua6a9\ua6a7\ua6a0\ua6a7\ua6a6\ua6a0\ua6a2", "\u8b81\u8b83\u8b86\u8b80\u8b8f\u8b81\u8b82\u8b81", "\u6dbf\u6db8\u6db4\u6dbe\u6dbf\u6db9\u6dbc", "\u1c28\u1c27\u1c2b\u1c2f\u1c2e\u1c2c\u1c2f\u1c29", "\u4cbd\u4cb3\u4cbb\u4cb2\u4cbb\u4cb2\u4cb8"}, d2={"\u0663\u064f\u0640\u2608\u063a\u0638\u062e\u064a\u066c\u0667\u0670\u0667\u0629\u066a\u0667\u0668\u0661\u0629\u0655\u0672\u0674\u066f\u0668\u0661\u063d\u062f\u064a\u066c\u0667\u0670\u0667\u0629\u066a\u0667\u0668\u0661\u0629\u0655\u0672\u0674\u066f\u0668\u0661\u063d", "\u05bb\u0597\u0599\u25d0\u05e2\u05e0\u05f6\u0592\u05b4\u05bf\u05a8\u05bf\u05f1\u05b2\u05bf\u05b0\u05b9\u05f1\u058d\u05aa\u05ac\u05b7\u05b0\u05b9\u05e5\u05f7\u0592\u05b4\u05bf\u05a8\u05bf\u05f1\u05b2\u05bf\u05b0\u05b9\u05f1\u058d\u05aa\u05ac\u05b7\u05b0\u05b9\u05e5", "\u0176\u0129\u0126\u0123\u0124\u0123\u013e\u0174\u0176\u0174\u0162\u0163\u011c", "\u06e2\u06b7\u06b0\u06b7\u06aa\u06e0\u06e2\u06e0\u06f6\u06f7\u0688", "\u0345\u0347\u0356\u0361\u034e\u0343\u0351\u0351\u031e\u031c\u030a\u030b\u036e\u0348\u0343\u0354\u0343\u030d\u034e\u0343\u034c\u0345\u030d\u0361\u034e\u0343\u0351\u0351\u0319", "\u07ed\u07e4\u07f6\u07ed\u07c6\u07ea\u07e1\u07e0\u07b9\u07bb\u07ad\u07ac\u07cc", "\u06c4\u06d0\u06d4\u06c0\u06cd\u06d2\u069d\u069f\u0689\u06ed\u06cb\u06c0\u06d7\u06c0\u068e\u06cd\u06c0\u06cf\u06c6\u068e\u06ee\u06c3\u06cb\u06c4\u06c2\u06d5\u069a\u0688\u06fb", "\u06fa\u06f5\u06f6\u06f7\u06fc\u06a5\u06a7\u06b1\u06b0\u06d5\u06f3\u06f8\u06ef\u06f8\u06b6\u06f5\u06f8\u06f7\u06fe\u06b6\u06d6\u06fb\u06f3\u06fc\u06fa\u06ed\u06a2", "\u00ae\u00b5\u0089\u00ae\u00a8\u00b3\u00b4\u00bd\u00e6\u00e4\u00f2\u00f3\u0096\u00b0\u00bb\u00ac\u00bb\u00f5\u00b6\u00bb\u00b4\u00bd\u00f5\u0089\u00ae\u00a8\u00b3\u00b4\u00bd\u00e1", "\u0484\u0485\u049e\u0483\u048c\u0493\u04d6\u04d4\u04c2\u04c3\u04bc", "\u06b3\u06b2\u06a9\u06b4\u06bb\u06a4\u069c\u06b1\u06b1\u06e1\u06e3\u06f5\u06f4\u068b", "\u03b2\u03a4\u03ac\u03b1\u03f9\u03fb\u03ed\u03ec\u0393", "\u0799\u078f\u0787\u079a\u07d2\u07d0\u07c6\u07a4\u07c7\u07b8", "\u06df\u06c9\u06c1\u06dc\u0698\u0694\u0696\u0680\u06e2\u0681\u06fe", "\u074c\u075a\u0752\u074f\u0707\u0705\u0713\u0771\u0772\u0712\u076d", "\u04cf\u04c0\u04c7\u04c8\u04c5\u04c0\u04d3\u04cc\u0495\u0497\u0481\u0480\u04ff"})
public final class Class1640 {
    public static double field6099 = 0.6049016712233237;
    public static float field6100;
    public static float field6101;

    static {
        field6101 = Float.intBitsToFloat(1092616192);
        field6100 = Float.intBitsToFloat(1041952128);
        bE\u200e = "Minimum damage";
        bQ\u200e = "Sends player coordinates";
    }

    private static String B9G9d9simneLNwuY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite S9q3CF5O2QiroG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1640.B9G9d9simneLNwuY(k2, 1232954807));
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
                int a2 = Integer.parseInt(Class1640.B9G9d9simneLNwuY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1640.B9G9d9simneLNwuY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1640.B9G9d9simneLNwuY(k2, 1232954807) + " " + l2 + " " + m2);
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

