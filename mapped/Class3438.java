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

@HACHIMI_CLIENT(mv=100, d1={"\ud26d\ud26d\ud26c\ud26d\ud26b\ud260\ud26b\ud261", "\u4c46\u4c47\u4c42\u4c44\u4c40\u4c45\u4c40\u4c40", "\ube68\ube68\ube67\ube67\ube6e\ube66\ube6e\ube6c", "\u7977\u7976\u7977\u7975\u7974\u797d\u7977\u797c", "\u7d98\u7d9c\u7d99\u7d99\u7d9a\u7d9a", "\ucfb2\ucfb2\ucfb7\ucfbe\ucfb2\ucfbe\ucfb0\ucfb5", "\u61e2\u61e0\u61e4\u61eb\u61e1\u61e4\u61e2\u61e3", "\u1a5a\u1a5d\u1a5e\u1a59\u1a5e\u1a58\u1a55\u1a5f", "\uacd1\uacd6\uacd3\uacd6\uacdc\uacdc\uacdd\uacd0", "\u8cf0\u8cf5\u8cfe\u8cfe\u8cf7\u8cf7\u8cf2\u8cf4", "\ubc17\ubc11\ubc11\ubc13\ubc13\ubc10\ubc16\ubc10", "\u4a66\u4a67\u4a6a\u4a65\u4a65\u4a6b\u4a63\u4a64", "\u3c1e\u3c1e\u3c1e\u3c1f\u3c15\u3c1f\u3c17", "\u6f47\u6f48\u6f4f\u6f49\u6f4c\u6f4f\u6f47"}, d2={"\u01fb\u01a4\u01ab\u01ae\u01a9\u01ae\u01b3\u01f9\u01fb\u01f9\u01ef\u01ee\u0191", "\u0624\u0671\u0676\u0671\u066c\u0626\u0624\u0626\u0630\u0631\u064e", "\u06e0\u06e2\u06f3\u06c4\u06eb\u06e6\u06f4\u06f4\u06bb\u06b9\u06af\u06ae\u06cb\u06ed\u06e6\u06f1\u06e6\u06a8\u06eb\u06e6\u06e9\u06e0\u06a8\u06c4\u06eb\u06e6\u06f4\u06f4\u06bc", "\u04ae\u04a7\u04b5\u04ae\u0485\u04a9\u04a2\u04a3\u04fa\u04f8\u04ee\u04ef\u048f", "\u05d5\u05c1\u05c5\u05d1\u05dc\u05c3\u058c\u058e\u0598\u05fc\u05da\u05d1\u05c6\u05d1\u059f\u05dc\u05d1\u05de\u05d7\u059f\u05ff\u05d2\u05da\u05d5\u05d3\u05c4\u058b\u0599\u05ea", "T[XYR\u000b\t\u001f\u001e{]VAV\u0018[VYP\u0018xU]RTC\f", "\u0599\u0582\u05be\u0599\u059f\u0584\u0583\u058a\u05d1\u05d3\u05c5\u05c4\u05a1\u0587\u058c\u059b\u058c\u05c2\u0581\u058c\u0583\u058a\u05c2\u05be\u0599\u059f\u0584\u0583\u058a\u05d6", "\u0166\u0167\u017c\u0161\u016e\u0171\u0134\u0136\u0120\u0121\u015e", "\u0607\u0606\u061d\u0600\u060f\u0610\u0628\u0605\u0605\u0655\u0657\u0641\u0640\u063f", "\u0553\u0545\u054d\u0550\u0518\u051a\u050c\u050d\u0572", "\u064b\u065d\u0655\u0648\u0600\u0602\u0614\u0676\u0615\u066a", "\u018b\u019d\u0195\u0188\u01cc\u01c0\u01c2\u01d4\u01b6\u01d5\u01aa", "\u00a0\u00b6\u00be\u00a3\u00eb\u00e9\u00ff\u009d\u009e\u00fe\u0081", "\u0387\u0388\u038f\u0380\u038d\u0388\u039b\u0384\u03dd\u03df\u03c9\u03c8\u03b7"})
public final class Class3438 {
    public static int field7499 = 993932391;
    public static float field7500 = Float.intBitsToFloat(1062994819);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite lt1PBAa4cBpvyF(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3438.OZuBZX27Vkh2N492(k2, -321130749));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 16106 : 16107;
        block6: while (true) {
            switch (n3) {
                case 16107: {
                    n3 = 16105;
                    continue block6;
                }
                case 16106: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3438.OZuBZX27Vkh2N492(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3438.OZuBZX27Vkh2N492(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3438.OZuBZX27Vkh2N492(k2, -321130749) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String OZuBZX27Vkh2N492(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

