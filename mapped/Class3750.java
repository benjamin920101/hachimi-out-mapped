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

@HACHIMI_CLIENT(mv=100, d1={"\u52ec\u52eb\u52ed\u52e2\u52eb\u52e2\u52eb\u52e3", "\u9295\u929c\u9293\u9297\u929c\u9290\u9297\u929c", "\u8a7f\u8a78\u8a79\u8a78\u8a7e\u8a7b\u8a7c", "\ud24d\ud242\ud24f\ud24f\ud242\ud24e\ud243", "\ue65f\ue65e\ue658\ue65f\ue65f\ue652\ue65f\ue65c", "\uaa6c\uaa6b\uaa6e\uaa68\uaa60", "\u5feb\u5fed\u5feb\u5fed\u5fec\u5fe3\u5fef\u5fee", "\u0f59\u0f5d\u0f5b\u0f55\u0f5c\u0f5e\u0f55\u0f5d", "\u5ccb\u5cc8\u5cc9\u5cc1\u5ccb\u5cc0\u5ccf", "\u42f0\u42fa\u42f3\u42fa\u42f5\u42f7\u42f7\u42f3", "\uc4bf\uc4b1\uc4bf\uc4bc\uc4b0\uc4b0\uc4be\uc4be", "\ue41a\ue41d\ue41e\ue41e\ue41e\ue41c\ue41b\ue41b", "\uc949\uc949\uc94b\uc94e\uc94f\uc94c\uc948\uc94e", "\ud93a\ud93b\ud93c\ud93e\ud93e\ud936\ud936\ud93b"}, d2={"\u065a\u0605\u060a\u060f\u0608\u060f\u0612\u0658\u065a\u0658\u064e\u064f\u0630", "\u0005PWPM\u0007\u0005\u0007\u0011\u0010o", "\u03f7\u03f5\u03e4\u03d3\u03fc\u03f1\u03e3\u03e3\u03ac\u03ae\u03b8\u03b9\u03dc\u03fa\u03f1\u03e6\u03f1\u03bf\u03fc\u03f1\u03fe\u03f7\u03bf\u03d3\u03fc\u03f1\u03e3\u03e3\u03ab", "\u06e1\u06e8\u06fa\u06e1\u06ca\u06e6\u06ed\u06ec\u06b5\u06b7\u06a1\u06a0\u06c0", "\b\u001c\u0018\f\u0001\u001eQSE!\u0007\f\u001b\fB\u0001\f\u0003\nB\"\u000f\u0007\b\u000e\u0019VD7", "\u0510\u051f\u051c\u051d\u0516\u054f\u054d\u055b\u055a\u053f\u0519\u0512\u0505\u0512\u055c\u051f\u0512\u051d\u0514\u055c\u053c\u0511\u0519\u0516\u0510\u0507\u0548", "\u079a\u0781\u07bd\u079a\u079c\u0787\u0780\u0789\u07d2\u07d0\u07c6\u07c7\u07a2\u0784\u078f\u0798\u078f\u07c1\u0782\u078f\u0780\u0789\u07c1\u07bd\u079a\u079c\u0787\u0780\u0789\u07d5", "\u0229\u0228\u0233\u022e\u0221\u023e\u027b\u0279\u026f\u026e\u0211", "\u0684\u0685\u069e\u0683\u068c\u0693\u06ab\u0686\u0686\u06d6\u06d4\u06c2\u06c3\u06bc", "\u0546\u0550\u0558\u0545\u050d\u050f\u0519\u0518\u0567", "\u02ab\u02bd\u02b5\u02a8\u02e0\u02e2\u02f4\u0296\u02f5\u028a", "\f\u001a\u0012\u000fKGES1R-", "\u0536\u0520\u0528\u0535\u057d\u057f\u0569\u050b\u0508\u0568\u0517", "BMJEHM^A\u0018\u001a\f\rr"})
public final class Class3750 {
    public static double field8488 = Double.longBitsToDouble(4587275052230083184L);
    public static double field8489 = Double.longBitsToDouble(4606838190948541110L);

    private static String fBQghlXR66VmsnLF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite iS1dpLL8zWG8I6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3750.fBQghlXR66VmsnLF(k2, 143260983));
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
                int a2 = Integer.parseInt(Class3750.fBQghlXR66VmsnLF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3750.fBQghlXR66VmsnLF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3750.fBQghlXR66VmsnLF(k2, 143260983) + " " + l2 + " " + m2);
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

