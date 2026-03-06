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

@HACHIMI_CLIENT(mv=100, d1={"\uace1\uace0\uace0\uace3\uace6\uacef\uacef", "\u477f\u477d\u477f\u4776\u477e\u477d\u477b\u477f", "\uc254\uc252\uc250\uc256\uc255\uc257\uc251\uc254", "\u8981\u8986\u8982\u8986\u8980\u8980\u898b\u8985", "\u0226\u0221\u0221\u0227\u0221\u0221\u0222\u022c", "\u8f3b\u8f3f\u8f3a\u8f3c\u8f3a\u8f3c\u8f37\u8f3c", "\u357f\u357f\u357f\u3570\u3571\u3574\u3575", "\u3540\u3545\u3540\u3544\u3541\u3543\u354d\u354d", "\u3274\u3278\u3278\u3274\u3279\u3276\u3270\u3274", "\u1c29\u1c2a\u1c22\u1c23\u1c28\u1c2c\u1c29\u1c23", "\u992a\u9921\u9921\u992e\u9929\u992a\u992c\u992e", "\u158e\u158b\u158f\u158a\u1588\u158a\u158a\u1585", "\u7d79\u7d7b\u7d77\u7d7b\u7d76\u7d7f\u7d79", "\ud3a3\ud3a0\ud3a9\ud3a6\ud3a4\ud3a2\ud3a4\ud3a3", "\uc1ad\uc1ad\uc1a9\uc1ad\uc1ae\uc1a9\uc1a8\uc1af", "\u5646\u5642\u5640\u5645\u5643\u5641\u5645\u5646", "\u7226\u7225\u7220\u7226\u7223\u722f\u7223\u722f", "\u0eb0\u0eb6\u0ebf\u0ebf\u0eb6\u0eb6\u0ebe\u0eb0"}, d2={"\u0656\u066d\u0651\u262c\u061e\u061c\u060a\u066e\u0648\u0643\u0654\u0643\u060d\u064e\u0643\u064c\u0645\u060d\u0671\u0656\u0650\u064b\u064c\u0645\u0619\u060b\u066e\u0648\u0643\u0654\u0643\u060d\u064e\u0643\u064c\u0645\u060d\u0671\u0656\u0650\u064b\u064c\u0645\u0619", "e^e\u201f-/9]{pgp>}p\u007fv>Becx\u007fv*8]{pgp>}p\u007fv>Becx\u007fv*", "\u008c\u00b7\u008d\u20f6\u00c4\u00c6\u00d0\u00b4\u0092\u0099\u008e\u0099\u00d7\u0094\u0099\u0096\u009f\u00d7\u00ab\u008c\u008a\u0091\u0096\u009f\u00c3\u00d1\u00b4\u0092\u0099\u008e\u0099\u00d7\u0094\u0099\u0096\u009f\u00d7\u00ab\u008c\u008a\u0091\u0096\u009f\u00c3", "\u0502\u0539\u0500\u2578\u054a\u0548\u055e\u053a\u051c\u0517\u0500\u0517\u0559\u051a\u0517\u0518\u0511\u0559\u0525\u0502\u0504\u051f\u0518\u0511\u054d\u055f\u053a\u051c\u0517\u0500\u0517\u0559\u051a\u0517\u0518\u0511\u0559\u0525\u0502\u0504\u051f\u0518\u0511\u054d", "\u0437\u0468\u0467\u0462\u0465\u0462\u047f\u0435\u0437\u0435\u0423\u0422\u045d", "\u06ec\u06b9\u06be\u06b9\u06a4\u06ee\u06ec\u06ee\u06f8\u06f9\u0686", "\u050e\u050c\u051d\u052a\u0505\u0508\u051a\u051a\u0555\u0557\u0541\u0540\u0525\u0503\u0508\u051f\u0508\u0546\u0505\u0508\u0507\u050e\u0546\u052a\u0505\u0508\u051a\u051a\u0552", "\u03b2\u03bb\u03a9\u03b2\u0399\u03b5\u03be\u03bf\u03e6\u03e4\u03f2\u03f3\u0393", "\u00ea\u00fe\u00fa\u00ee\u00e3\u00fc\u00b3\u00b1\u00a7\u00c3\u00e5\u00ee\u00f9\u00ee\u00a0\u00e3\u00ee\u00e1\u00e8\u00a0\u00c0\u00ed\u00e5\u00ea\u00ec\u00fb\u00b4\u00a6\u00d5", "=210;b`vw\u00124?(?q2?09q\u0011<4;=*e", "\u060f\u0614\u0628\u060f\u0609\u0612\u0615\u061c\u0647\u0645\u0653\u0652\u0637\u0611\u061a\u060d\u061a\u0654\u0617\u061a\u0615\u061c\u0654\u0628\u060f\u0609\u0612\u0615\u061c\u0640", "\u0352\u0353\u0348\u0355\u035a\u0345\u0300\u0302\u0314\u0315\u036a", "\u060c\u060d\u0616\u060b\u0604\u061b\u0623\u060e\u060e\u065e\u065c\u064a\u064b\u0634", "\u068b\u069d\u0695\u0688\u06c0\u06c2\u06d4\u06d5\u06aa", "\u0121\u0137\u013f\u0122\u016a\u0168\u017e\u011c\u017f\u0100", "\u0529\u053f\u0537\u052a\u056e\u0562\u0560\u0576\u0514\u0577\u0508", "\u07f6\u07e0\u07e8\u07f5\u07bd\u07bf\u07a9\u07cb\u07c8\u07a8\u07d7", "\u0293\u029c\u029b\u0294\u0299\u029c\u028f\u0290\u02c9\u02cb\u02dd\u02dc\u02a3"})
public final class Class3354 {
    public static double field7265;

    /*
     * Enabled aggressive block sorting
     */
    private static String jRAJOOXdqQLU5b7U(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 49469 : 49468;
            block5: while (true) {
                switch (n2) {
                    case 49469: {
                        n2 = 49467;
                        continue block5;
                    }
                    case 49468: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    static {
        d\u200e = "Scaling in y-direction";
        l\u200e = "Displays facing direction";
        J\u200e = "GLOW";
        bu\u200e = "value";
        field7265 = Double.longBitsToDouble(4602616370744263508L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite jjnvnOe396S57a(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3354.jRAJOOXdqQLU5b7U(k2, 589329643));
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
                int a2 = Integer.parseInt(Class3354.jRAJOOXdqQLU5b7U(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3354.jRAJOOXdqQLU5b7U(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3354.jRAJOOXdqQLU5b7U(k2, 589329643) + " " + l2 + " " + m2);
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

