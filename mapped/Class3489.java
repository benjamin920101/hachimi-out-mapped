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

@HACHIMI_CLIENT(mv=100, d1={"\u7b06\u7b0b\u7b0b\u7b02\u7b07\u7b01\u7b0a\u7b0b", "\u1a67\u1a6c\u1a61\u1a6d\u1a6d\u1a62\u1a63\u1a62", "\u91f3\u91f4\u91f0\u91f4\u91f4\u91f3\u91f5\u91f9", "\u852c\u852b\u8525\u8525\u8525\u852a\u852d\u8525", "\u24c7\u24c4\u24c6\u24c0\u24c6\u24ca\u24c7\u24c6", "\u410d\u4106\u4107\u410a\u410b\u4108\u4109\u410f", "\u6b59\u6b59\u6b50\u6b59\u6b51\u6b5f\u6b50\u6b5a", "\uaf8a\uaf82\uaf8a\uaf8d\uaf89\uaf8c\uaf83\uaf8f", "\ue497\ue496\ue490\ue490\ue498\ue496\ue490\ue490", "\ue36b\ue36f\ue36d\ue369\ue361\ue36d\ue36d\ue36b", "\u66a5\u66ae\u66a6\u66ae\u66a5\u66a7\u66ae\u66a3", "\ua476\ua47f\ua474\ua47f\ua472\ua471\ua476\ua476", "\ude8b\ude80\ude8d\ude88\ude81\ude8f\ude88\ude81", "\u06b0\u06b7\u06b1\u06bd\u06b3\u06b7\u06bd\u06b6", "\ud720\ud724\ud722\ud72a\ud723\ud726\ud724\ud725"}, d2={"\u04b8\u0494\u0494\u24d9\u04eb\u04e9\u04ff\u049b\u04bd\u04b6\u04a1\u04b6\u04f8\u04bb\u04b6\u04b9\u04b0\u04f8\u0484\u04a3\u04a5\u04be\u04b9\u04b0\u04ec\u04fe\u049b\u04bd\u04b6\u04a1\u04b6\u04f8\u04bb\u04b6\u04b9\u04b0\u04f8\u0484\u04a3\u04a5\u04be\u04b9\u04b0\u04ec", "\u0498\u04c7\u04c8\u04cd\u04ca\u04cd\u04d0\u049a\u0498\u049a\u048c\u048d\u04f2", "\u07e8\u07bd\u07ba\u07bd\u07a0\u07ea\u07e8\u07ea\u07fc\u07fd\u0782", "\u0311\u0313\u0302\u0335\u031a\u0317\u0305\u0305\u034a\u0348\u035e\u035f\u033a\u031c\u0317\u0300\u0317\u0359\u031a\u0317\u0318\u0311\u0359\u0335\u031a\u0317\u0305\u0305\u034d", "\u029d\u0294\u0286\u029d\u02b6\u029a\u0291\u0290\u02c9\u02cb\u02dd\u02dc\u02bc", "\u05a8\u05bc\u05b8\u05ac\u05a1\u05be\u05f1\u05f3\u05e5\u0581\u05a7\u05ac\u05bb\u05ac\u05e2\u05a1\u05ac\u05a3\u05aa\u05e2\u0582\u05af\u05a7\u05a8\u05ae\u05b9\u05f6\u05e4\u0597", "\u0623\u062c\u062f\u062e\u0625\u067c\u067e\u0668\u0669\u060c\u062a\u0621\u0636\u0621\u066f\u062c\u0621\u062e\u0627\u066f\u060f\u0622\u062a\u0625\u0623\u0634\u067b", "\u0471\u046a\u0456\u0471\u0477\u046c\u046b\u0462\u0439\u043b\u042d\u042c\u0449\u046f\u0464\u0473\u0464\u042a\u0469\u0464\u046b\u0462\u042a\u0456\u0471\u0477\u046c\u046b\u0462\u043e", "\u04ad\u04ac\u04b7\u04aa\u04a5\u04ba\u04ff\u04fd\u04eb\u04ea\u0495", "\u02ec\u02ed\u02f6\u02eb\u02e4\u02fb\u02c3\u02ee\u02ee\u02be\u02bc\u02aa\u02ab\u02d4", "\u0707\u0711\u0719\u0704\u074c\u074e\u0758\u0759\u0726", "\u02d6\u02c0\u02c8\u02d5\u029d\u029f\u0289\u02eb\u0288\u02f7", "\u0153\u0145\u014d\u0150\u0114\u0118\u011a\u010c\u016e\u010d\u0172", "\u0353\u0345\u034d\u0350\u0318\u031a\u030c\u036e\u036d\u030d\u0372", "\u0424\u042b\u042c\u0423\u042e\u042b\u0438\u0427\u047e\u047c\u046a\u046b\u0414"})
public final class Class3489 {
    public static float field7675;
    public static int field7676 = 1965318673;
    public static float field7677;
    public static double field7678 = 0.371217845267372;
    public static double field7679;
    public static float field7680;

    /*
     * Unable to fully structure code
     */
    private static String D4ugXe4ErwaqjG0k(String a, int b) {
        c = new StringBuilder();
        d = 0;
        while (true) {
            block2: {
                block3: {
                    if (d >= a.length()) break block3;
                    v0 = 18085;
                    ** GOTO lbl12
                }
                v0 = 18086;
                if (true) ** GOTO lbl12
                do {
                    v0 = var4_4 = 18084;
lbl12:
                    // 3 sources

                    if (var4_4 == 18085) break block2;
                } while (var4_4 == 18086);
                break;
            }
            c.append((char)(a.charAt(d) ^ b));
            ++d;
        }
        return c.toString();
    }

    static {
        b\u200e = "Cancel the blink";
        field7679 = Double.longBitsToDouble(4603848177114272484L);
        field7680 = Float.intBitsToFloat(1132920832);
        field7675 = Float.intBitsToFloat(1051033358);
        field7677 = Float.intBitsToFloat(1064368646);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite jTPYzCttvNQ9EL(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3489.D4ugXe4ErwaqjG0k(k2, 1534539342));
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
                int a2 = Integer.parseInt(Class3489.D4ugXe4ErwaqjG0k(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3489.D4ugXe4ErwaqjG0k(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3489.D4ugXe4ErwaqjG0k(k2, 1534539342) + " " + l2 + " " + m2);
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

