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

@HACHIMI_CLIENT(mv=100, d1={"\u0b88\u0b8f\u0b83\u0b8c\u0b83\u0b82\u0b8f\u0b8e", "\uce56\uce57\uce57\uce5d\uce5d\uce55\uce5c\uce54", "\u4b0e\u4b0c\u4b0f\u4b09\u4b0d\u4b0d\u4b0b\u4b09", "\uc5a1\uc5ac\uc5a6\uc5a5\uc5a1\uc5a7\uc5a7\uc5a5", "\u2798\u2794\u279c\u279d\u279f\u279c\u2795\u2794", "\u2ad3\u2ad3\u2adf\u2ad5\u2ad3\u2ad6\u2ad6\u2ad3", "\u8498\u849e\u849a\u8493\u849e\u8493\u8493\u849a", "\u109c\u1098\u1099\u109c\u109a\u109e\u109e\u109f", "\u54b8\u54b5\u54be\u54bd\u54b9\u54bb\u54be\u54ba", "\u843c\u8439\u843f\u8437\u843f\u8439\u8437\u8436", "\u3a4f\u3a44\u3a45\u3a4c\u3a49\u3a4a\u3a45\u3a4f", "\u64e2\u64e9\u64e9\u64e8\u64e2\u64e9\u64e7\u64e9", "\u9a7d\u9a7d\u9a73\u9a7d\u9a79\u9a7f\u9a7e\u9a78", "\u6cdb\u6cdd\u6cd7\u6cdb\u6cd6\u6cdc\u6cd8\u6cdf", "\u01f0\u01f3\u01f7\u01fd\u01f4\u01fd\u01f4\u01fd", "\ud527\ud52d\ud523\ud523\ud52d\ud524\ud522\ud523"}, d2={"\u02ad\u029e\u02b1\u22d7\u02e5\u02e7\u02f1\u0295\u02b3\u02b8\u02af\u02b8\u02f6\u02b5\u02b8\u02b7\u02be\u02f6\u028a\u02ad\u02ab\u02b0\u02b7\u02be\u02e2\u02f0\u0295\u02b3\u02b8\u02af\u02b8\u02f6\u02b5\u02b8\u02b7\u02be\u02f6\u028a\u02ad\u02ab\u02b0\u02b7\u02be\u02e2", "\u0721\u0712\u073c\u275b\u0769\u076b\u077d\u0719\u073f\u0734\u0723\u0734\u077a\u0739\u0734\u073b\u0732\u077a\u0706\u0721\u0727\u073c\u073b\u0732\u076e\u077c\u0719\u073f\u0734\u0723\u0734\u077a\u0739\u0734\u073b\u0732\u077a\u0706\u0721\u0727\u073c\u073b\u0732\u076e", "\u03bb\u03e4\u03eb\u03ee\u03e9\u03ee\u03f3\u03b9\u03bb\u03b9\u03af\u03ae\u03d1", "\u0583\u05d6\u05d1\u05d6\u05cb\u0581\u0583\u0581\u0597\u0596\u05e9", "\u065e\u065c\u064d\u067a\u0655\u0658\u064a\u064a\u0605\u0607\u0611\u0610\u0675\u0653\u0658\u064f\u0658\u0616\u0655\u0658\u0657\u065e\u0616\u067a\u0655\u0658\u064a\u064a\u0602", "LEWLgK@A\u0018\u001a\f\rm", "\u0578\u056c\u0568\u057c\u0571\u056e\u0521\u0523\u0535\u0551\u0577\u057c\u056b\u057c\u0532\u0571\u057c\u0573\u057a\u0532\u0552\u057f\u0577\u0578\u057e\u0569\u0526\u0534\u0547", "\u0306\u0309\u030a\u030b\u0300\u0359\u035b\u034d\u034c\u0329\u030f\u0304\u0313\u0304\u034a\u0309\u0304\u030b\u0302\u034a\u032a\u0307\u030f\u0300\u0306\u0311\u035e", "\u04f4\u04ef\u04d3\u04f4\u04f2\u04e9\u04ee\u04e7\u04bc\u04be\u04a8\u04a9\u04cc\u04ea\u04e1\u04f6\u04e1\u04af\u04ec\u04e1\u04ee\u04e7\u04af\u04d3\u04f4\u04f2\u04e9\u04ee\u04e7\u04bb", "\u043d\u043c\u0427\u043a\u0435\u042a\u046f\u046d\u047b\u047a\u0405", "\u03f6\u03f7\u03ec\u03f1\u03fe\u03e1\u03d9\u03f4\u03f4\u03a4\u03a6\u03b0\u03b1\u03ce", "\u0446\u0450\u0458\u0445\u040d\u040f\u0419\u0418\u0467", "\u0243\u0255\u025d\u0240\u0208\u020a\u021c\u027e\u021d\u0262", "\u043a\u042c\u0424\u0439\u047d\u0471\u0473\u0465\u0407\u0464\u041b", "\u013d\u012b\u0123\u013e\u0176\u0174\u0162\u0100\u0103\u0163\u011c", "\u060e\u0601\u0606\u0609\u0604\u0601\u0612\u060d\u0654\u0656\u0640\u0641\u063e"})
public final class Class5687 {
    public static double field10927;
    public static float field10928;
    public static float field10929;
    public static double field10930;
    public static double field10931 = 0.15046773515295508;

    /*
     * WARNING - void declaration
     */
    private static CallSite d9911QeddQP7FT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5687.fIKNJORubXEJA6U6(k2, -347889304));
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
                int a2 = Integer.parseInt(Class5687.fIKNJORubXEJA6U6(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5687.fIKNJORubXEJA6U6(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5687.fIKNJORubXEJA6U6(k2, -347889304) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String fIKNJORubXEJA6U6(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field10930 = Double.longBitsToDouble(4597937985155528968L);
        V\u200e = "AirPlace";
        field10927 = Double.longBitsToDouble(4594596354314998836L);
        field10929 = Float.intBitsToFloat(1059202106);
        field10928 = Float.intBitsToFloat(1059638889);
        bs\u200e = ", ";
    }
}

