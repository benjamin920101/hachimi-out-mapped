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

@HACHIMI_CLIENT(mv=100, d1={"\u33c2\u33c3\u33c0\u33c0\u33c5\u33c4\u33c3\u33c1", "\u4578\u457f\u4570\u457a\u4578\u4570\u457b\u457c", "\u4116\u4115\u411c\u4113\u4110\u4114\u411d\u4111", "\u5499\u5492\u549a\u549d\u5492\u549f\u5493\u549d", "\ub3c7\ub3c6\ub3cb\ub3c7\ub3c5\ub3c4\ub3c0\ub3c2", "\ucbf2\ucbf3\ucbf6\ucbf7\ucbf6\ucbf0\ucbf2\ucbf4", "\u97ed\u97ea\u97ee\u97ed\u97ea\u97e9\u97ee\u97ed", "\u12ed\u12ec\u12ea\u12e9\u12ee\u12ee\u12ed\u12ed", "\u6426\u642f\u6421\u6421\u6421\u642e\u6421\u6423", "\uad33\uad37\uad35\uad3e\uad34\uad32\uad34\uad3e", "\u4aa0\u4aa7\u4aa2\u4aae\u4aa3\u4aa6\u4aa3\u4aa7", "\u1b6f\u1b69\u1b6e\u1b6c\u1b64\u1b6a\u1b6b", "\u0935\u093e\u0937\u0931\u093e\u0935\u0932\u0931", "\u0406\u0404\u0404\u0401\u0406\u0400\u0402\u0407"}, d2={"\u06b5\u06ea\u06e5\u06e0\u06e7\u06e0\u06fd\u06b7\u06b5\u06b7\u06a1\u06a0\u06df", "\u05e6\u05b3\u05b4\u05b3\u05ae\u05e4\u05e6\u05e4\u05f2\u05f3\u058c", "\u0122\u0120\u0131\u0106\u0129\u0124\u0136\u0136\u0179\u017b\u016d\u016c\u0109\u012f\u0124\u0133\u0124\u016a\u0129\u0124\u012b\u0122\u016a\u0106\u0129\u0124\u0136\u0136\u017e", "\u01b0\u01b9\u01ab\u01b0\u019b\u01b7\u01bc\u01bd\u01e4\u01e6\u01f0\u01f1\u0191", "\u075d\u0749\u074d\u0759\u0754\u074b\u0704\u0706\u0710\u0774\u0752\u0759\u074e\u0759\u0717\u0754\u0759\u0756\u075f\u0717\u0777\u075a\u0752\u075d\u075b\u074c\u0703\u0711\u0762", "\u06e2\u06ed\u06ee\u06ef\u06e4\u06bd\u06bf\u06a9\u06a8\u06cd\u06eb\u06e0\u06f7\u06e0\u06ae\u06ed\u06e0\u06ef\u06e6\u06ae\u06ce\u06e3\u06eb\u06e4\u06e2\u06f5\u06ba", "\u0525\u053e\u0502\u0525\u0523\u0538\u053f\u0536\u056d\u056f\u0579\u0578\u051d\u053b\u0530\u0527\u0530\u057e\u053d\u0530\u053f\u0536\u057e\u0502\u0525\u0523\u0538\u053f\u0536\u056a", "\u0471\u0470\u046b\u0476\u0479\u0466\u0423\u0421\u0437\u0436\u0449", "\u042f\u042e\u0435\u0428\u0427\u0438\u0400\u042d\u042d\u047d\u047f\u0469\u0468\u0417", "\u06d8\u06ce\u06c6\u06db\u0693\u0691\u0687\u0686\u06f9", "\u04df\u04c9\u04c1\u04dc\u0494\u0496\u0480\u04e2\u0481\u04fe", "\u06c6\u06d0\u06d8\u06c5\u0681\u068d\u068f\u0699\u06fb\u0698\u06e7", "\u07bc\u07aa\u07a2\u07bf\u07f7\u07f5\u07e3\u0781\u0782\u07e2\u079d", "\u03b3\u03bc\u03bb\u03b4\u03b9\u03bc\u03af\u03b0\u03e9\u03eb\u03fd\u03fc\u0383"})
public final class Class4217 {
    public static double field9873 = Double.longBitsToDouble(-4616189618054758400L);
    public static double field9874 = 0.6418507211030043;
    public static float field9875 = Float.intBitsToFloat(1064137437);

    private static String YO4mRwoA9DzrBEMO(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite mrFTHOoDDZ1Ov3(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4217.YO4mRwoA9DzrBEMO(k2, 630888304));
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
                int a2 = Integer.parseInt(Class4217.YO4mRwoA9DzrBEMO(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4217.YO4mRwoA9DzrBEMO(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4217.YO4mRwoA9DzrBEMO(k2, 630888304) + " " + l2 + " " + m2);
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

