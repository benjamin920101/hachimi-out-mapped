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

@HACHIMI_CLIENT(mv=100, d1={"\u5a17\u5a17\u5a17\u5a10\u5a16\u5a14\u5a15\u5a11", "\ud4ee\ud4ea\ud4ed\ud4ee\ud4e4\ud4ee\ud4e4\ud4ed", "\uc139\uc13f\uc138\uc130\uc13a\uc13f\uc139\uc130", "\u1c19\u1c1f\u1c1e\u1c1f\u1c1f\u1c1d\u1c1d\u1c17", "\uc446\uc44c\uc442\uc44d\uc443\uc446\uc444\uc44d", "\u0c0f\u0c0c\u0c05\u0c0b\u0c0d\u0c08\u0c08\u0c0f", "\u1826\u1822\u1826\u1826\u1827\u1821\u1824\u1827", "\u9c5e\u9c5d\u9c5e\u9c5e\u9c5d\u9c5e\u9c5b\u9c5e", "\u7ab4\u7ab9\u7ab3\u7ab0\u7ab9\u7ab4\u7ab4\u7ab1", "\u5b40\u5b48\u5b48\u5b4c\u5b48\u5b4d\u5b4c", "\uc0b2\uc0b5\uc0b2\uc0b0\uc0b0\uc0b5\uc0b5\uc0bf", "\ud454\ud451\ud453\ud450\ud45f\ud451\ud456\ud45e", "\u780f\u7807\u780d\u780c\u7809\u780c\u780b\u780e", "\u9078\u9072\u907c\u907d\u907a\u907f\u907e\u9073", "\u4b14\u4b13\u4b17\u4b14\u4b1d\u4b12\u4b11\u4b14", "\u78a5\u78a5\u78a0\u78a5\u78a5\u78a7\u78af\u78af", "\u19a1\u19a1\u19a4\u19a2\u19a4\u19a7\u19a3\u19ae"}, d2={"\u0695\u06be\u0694\u26f7\u06c5\u06c7\u06d1\u06b5\u0693\u0698\u068f\u0698\u06d6\u0695\u0698\u0697\u069e\u06d6\u06aa\u068d\u068b\u0690\u0697\u069e\u06c2\u06d0\u06b5\u0693\u0698\u068f\u0698\u06d6\u0695\u0698\u0697\u069e\u06d6\u06aa\u068d\u068b\u0690\u0697\u069e\u06c2", "\u046b\u0440\u0469\u2409\u043b\u0439\u042f\u044b\u046d\u0466\u0471\u0466\u0428\u046b\u0466\u0469\u0460\u0428\u0454\u0473\u0475\u046e\u0469\u0460\u043c\u042e\u044b\u046d\u0466\u0471\u0466\u0428\u046b\u0466\u0469\u0460\u0428\u0454\u0473\u0475\u046e\u0469\u0460\u043c", "bIa\u200020&Bdoxo!bo`i!]z|g`i5'Bdoxo!bo`i!]z|g`i5", "\u0223\u027c\u0273\u0276\u0271\u0276\u026b\u0221\u0223\u0221\u0237\u0236\u0249", "\u03f8\u03ad\u03aa\u03ad\u03b0\u03fa\u03f8\u03fa\u03ec\u03ed\u0392", "\u0003\u0001\u0010'\b\u0005\u0017\u0017XZLM(\u000e\u0005\u0012\u0005K\b\u0005\n\u0003K'\b\u0005\u0017\u0017_", "\u03bd\u03b4\u03a6\u03bd\u0396\u03ba\u03b1\u03b0\u03e9\u03eb\u03fd\u03fc\u039c", "\u001f\u000b\u000f\u001b\u0016\tFDR6\u0010\u001b\f\u001bU\u0016\u001b\u0014\u001dU5\u0018\u0010\u001f\u0019\u000eAS ", "\u0168\u0167\u0164\u0165\u016e\u0137\u0135\u0123\u0122\u0147\u0161\u016a\u017d\u016a\u0124\u0167\u016a\u0165\u016c\u0124\u0144\u0169\u0161\u016e\u0168\u017f\u0130", "\u0242\u0259\u0265\u0242\u0244\u025f\u0258\u0251\u020a\u0208\u021e\u021f\u027a\u025c\u0257\u0240\u0257\u0219\u025a\u0257\u0258\u0251\u0219\u0265\u0242\u0244\u025f\u0258\u0251\u020d", "\u043a\u043b\u0420\u043d\u0432\u042d\u0468\u046a\u047c\u047d\u0402", "\u07a7\u07a6\u07bd\u07a0\u07af\u07b0\u0788\u07a5\u07a5\u07f5\u07f7\u07e1\u07e0\u079f", "\u0599\u058f\u0587\u059a\u05d2\u05d0\u05c6\u05c7\u05b8", "\u02c6\u02d0\u02d8\u02c5\u028d\u028f\u0299\u02fb\u0298\u02e7", "\u053e\u0528\u0520\u053d\u0579\u0575\u0577\u0561\u0503\u0560\u051f", "\u0563\u0575\u057d\u0560\u0528\u052a\u053c\u055e\u055d\u053d\u0542", "\u01ab\u01a4\u01a3\u01ac\u01a1\u01a4\u01b7\u01a8\u01f1\u01f3\u01e5\u01e4\u019b"})
public final class Class1361 {
    public static double field5249;

    static {
        m\u200e = "hunger";
        field5249 = Double.longBitsToDouble(4604927082795566379L);
        C\u200e = "\u00a77%s\u00a7f was set to \u00a7s%s";
        bW\u200e = "Tracers";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite LkEraPwajkTvjV(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1361.qeiVbMGFZhVjSgRT(k2, 2111886916));
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
                int a2 = Integer.parseInt(Class1361.qeiVbMGFZhVjSgRT(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1361.qeiVbMGFZhVjSgRT(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1361.qeiVbMGFZhVjSgRT(k2, 2111886916) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String qeiVbMGFZhVjSgRT(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

