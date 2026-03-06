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

@HACHIMI_CLIENT(mv=100, d1={"\uba99\uba9f\uba9a\uba9a\uba9d\uba9d\uba9e\uba9f", "\ud204\ud204\ud201\ud206\ud202\ud205\ud207\ud203", "\ud4d3\ud4d1\ud4d6\ud4d3\ud4d1\ud4d6\ud4d6\ud4d7", "\u55b1\u55b5\u55b6\u55be\u55be\u55b3\u55b7\u55b4", "\u6617\u6615\u6619\u6613\u6615\u6610\u6617\u6610", "\ud5fb\ud5f9\ud5f9\ud5f9\ud5ff\ud5f3\ud5fe\ud5fb", "\u6b6d\u6b6e\u6b68\u6b6f\u6b68\u6b6e\u6b69\u6b6f", "\u90a9\u90ab\u90aa\u90ad\u90ac\u90a9\u90a3\u90ae", "\u2e0d\u2e0d\u2e0e\u2e02\u2e0d\u2e0e\u2e0d\u2e0a", "\u6f49\u6f47\u6f46\u6f4c\u6f4a\u6f46\u6f46\u6f4d", "\u418b\u4187\u4188\u4187\u418c\u4187\u418a\u418a", "\ubd8d\ubd86\ubd87\ubd8d\ubd87\ubd8c\ubd87\ubd8b", "\u1adb\u1ad4\u1ad4\u1ad5\u1adb\u1ade\u1adb\u1ad5", "\u74e3\u74e8\u74e3\u74e2\u74e5\u74e0\u74e5\u74e5", "\u97fd\u97fd\u97fd\u97fc\u97fd\u97f1\u97f0\u97f8", "\u8a7c\u8a7a\u8a76\u8a7f\u8a7f\u8a7f\u8a7f\u8a76"}, d2={"\u0362\u0362\u0355\u230f\u033d\u033f\u0329\u034d\u036b\u0360\u0377\u0360\u032e\u036d\u0360\u036f\u0366\u032e\u0352\u0375\u0373\u0368\u036f\u0366\u033a\u0328\u034d\u036b\u0360\u0377\u0360\u032e\u036d\u0360\u036f\u0366\u032e\u0352\u0375\u0373\u0368\u036f\u0366\u033a", "\u06c3\u06c3\u06f5\u26ae\u069c\u069e\u0688\u06ec\u06ca\u06c1\u06d6\u06c1\u068f\u06cc\u06c1\u06ce\u06c7\u068f\u06f3\u06d4\u06d2\u06c9\u06ce\u06c7\u069b\u0689\u06ec\u06ca\u06c1\u06d6\u06c1\u068f\u06cc\u06c1\u06ce\u06c7\u068f\u06f3\u06d4\u06d2\u06c9\u06ce\u06c7\u069b", "\u033b\u0364\u036b\u036e\u0369\u036e\u0373\u0339\u033b\u0339\u032f\u032e\u0351", "\u06cc\u0699\u069e\u0699\u0684\u06ce\u06cc\u06ce\u06d8\u06d9\u06a6", "\u027c\u027e\u026f\u0258\u0277\u027a\u0268\u0268\u0227\u0225\u0233\u0232\u0257\u0271\u027a\u026d\u027a\u0234\u0277\u027a\u0275\u027c\u0234\u0258\u0277\u027a\u0268\u0268\u0220", "\u0465\u046c\u047e\u0465\u044e\u0462\u0469\u0468\u0431\u0433\u0425\u0424\u0444", "\u06b0\u06a4\u06a0\u06b4\u06b9\u06a6\u06e9\u06eb\u06fd\u0699\u06bf\u06b4\u06a3\u06b4\u06fa\u06b9\u06b4\u06bb\u06b2\u06fa\u069a\u06b7\u06bf\u06b0\u06b6\u06a1\u06ee\u06fc\u068f", "\u0421\u042e\u042d\u042c\u0427\u047e\u047c\u046a\u046b\u040e\u0428\u0423\u0434\u0423\u046d\u042e\u0423\u042c\u0425\u046d\u040d\u0420\u0428\u0427\u0421\u0436\u0479", "\u0007\u001c \u0007\u0001\u001a\u001d\u0014OM[Z?\u0019\u0012\u0005\u0012\\\u001f\u0012\u001d\u0014\\ \u0007\u0001\u001a\u001d\u0014H", "\u0513\u0512\u0509\u0514\u051b\u0504\u0541\u0543\u0555\u0554\u052b", "\u0413\u0412\u0409\u0414\u041b\u0404\u043c\u0411\u0411\u0441\u0443\u0455\u0454\u042b", "\u011e\u0108\u0100\u011d\u0155\u0157\u0141\u0140\u013f", "\u0143\u0155\u015d\u0140\u0108\u010a\u011c\u017e\u011d\u0162", "\u03b5\u03a3\u03ab\u03b6\u03f2\u03fe\u03fc\u03ea\u0388\u03eb\u0394", "\u0712\u0704\u070c\u0711\u0759\u075b\u074d\u072f\u072c\u074c\u0733", "\u0588\u0587\u0580\u058f\u0582\u0587\u0594\u058b\u05d2\u05d0\u05c6\u05c7\u05b8"})
public final class Class4076 {
    public static int field9428 = 1;
    public static float field9429;
    public static float field9430 = 0.45415914f;
    public static String field9431;
    public static float field9432 = 0.036680818f;

    private static String IzVjW8PIVQgAW2Kt(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite lemYnN1rorLywS(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4076.IzVjW8PIVQgAW2Kt(k2, -376353719));
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
                int a2 = Integer.parseInt(Class4076.IzVjW8PIVQgAW2Kt(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4076.IzVjW8PIVQgAW2Kt(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4076.IzVjW8PIVQgAW2Kt(k2, -376353719) + " " + l2 + " " + m2);
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
        field9431 = "global";
        af\u200e = "assets/hachimi/font/default.ttf";
        field9429 = Float.intBitsToFloat(1062178582);
    }
}

