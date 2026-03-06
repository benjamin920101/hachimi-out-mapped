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

@HACHIMI_CLIENT(mv=100, d1={"\uac43\uac47\uac43\uac46\uac46\uac47\uac48", "\u74cf\u74cb\u74cf\u74c4\u74c9\u74c8\u74c5\u74cb", "\u83d5\u83d8\u83d5\u83d1\u83d8\u83d7\u83d3\u83d4", "\u1fdc\u1fdf\u1fd3\u1fd9\u1fdd\u1fdd\u1fdc\u1fd3", "\u741a\u741c\u741a\u7413\u7419\u741a\u741e\u741e", "\u2116\u2116\u2112\u2111\u2115\u2112\u2113\u2112", "\u4915\u4912\u491e\u4913\u491f\u4913\u4911\u4917", "\u30f0\u30f6\u30f4\u30f2\u30fb\u30f7\u30f0\u30f1", "\u4ed2\u4ed7\u4ed4\u4ed7\u4ed5\u4ed1\u4ed4\u4ed6", "\u26ae\u26a8\u26a1\u26ab\u26ae\u26ae\u26a1\u26a9", "\u34f0\u34f3\u34f1\u34f6\u34f2\u34fe\u34fe\u34f7", "\u4231\u4230\u423d\u4232\u4235\u4230\u4230", "\u2ebc\u2eba\u2eb9\u2ebb\u2ebf\u2ebc\u2ebc\u2eb5", "\u125a\u1258\u1250\u1251\u125f\u1251\u125b\u125b", "\u6e83\u6e8b\u6e83\u6e86\u6e84\u6e83\u6e81\u6e87", "\u98eb\u98e9\u98eb\u98eb\u98e1\u98e0\u98ec\u98eb"}, d2={"\u0774\u0771\u0771\u2718\u072a\u0728\u073e\u075a\u077c\u0777\u0760\u0777\u0739\u077a\u0777\u0778\u0771\u0739\u0745\u0762\u0764\u077f\u0778\u0771\u072d\u073f\u075a\u077c\u0777\u0760\u0777\u0739\u077a\u0777\u0778\u0771\u0739\u0745\u0762\u0764\u077f\u0778\u0771\u072d", "\u06ab\u06ae\u06a1\u26c7\u06f5\u06f7\u06e1\u0685\u06a3\u06a8\u06bf\u06a8\u06e6\u06a5\u06a8\u06a7\u06ae\u06e6\u069a\u06bd\u06bb\u06a0\u06a7\u06ae\u06f2\u06e0\u0685\u06a3\u06a8\u06bf\u06a8\u06e6\u06a5\u06a8\u06a7\u06ae\u06e6\u069a\u06bd\u06bb\u06a0\u06a7\u06ae\u06f2", "\u0122\u017d\u0172\u0177\u0170\u0177\u016a\u0120\u0122\u0120\u0136\u0137\u0148", "\u0123\u0176\u0171\u0176\u016b\u0121\u0123\u0121\u0137\u0136\u0149", "\u035f\u035d\u034c\u037b\u0354\u0359\u034b\u034b\u0304\u0306\u0310\u0311\u0374\u0352\u0359\u034e\u0359\u0317\u0354\u0359\u0356\u035f\u0317\u037b\u0354\u0359\u034b\u034b\u0303", "\u026c\u0265\u0277\u026c\u0247\u026b\u0260\u0261\u0238\u023a\u022c\u022d\u024d", "\u02cb\u02df\u02db\u02cf\u02c2\u02dd\u0292\u0290\u0286\u02e2\u02c4\u02cf\u02d8\u02cf\u0281\u02c2\u02cf\u02c0\u02c9\u0281\u02e1\u02cc\u02c4\u02cb\u02cd\u02da\u0295\u0287\u02f4", "\u0138\u0137\u0134\u0135\u013e\u0167\u0165\u0173\u0172\u0117\u0131\u013a\u012d\u013a\u0174\u0137\u013a\u0135\u013c\u0174\u0114\u0139\u0131\u013e\u0138\u012f\u0160", "\u04b4\u04af\u0493\u04b4\u04b2\u04a9\u04ae\u04a7\u04fc\u04fe\u04e8\u04e9\u048c\u04aa\u04a1\u04b6\u04a1\u04ef\u04ac\u04a1\u04ae\u04a7\u04ef\u0493\u04b4\u04b2\u04a9\u04ae\u04a7\u04fb", "\u040b\u040a\u0411\u040c\u0403\u041c\u0459\u045b\u044d\u044c\u0433", "\u04fa\u04fb\u04e0\u04fd\u04f2\u04ed\u04d5\u04f8\u04f8\u04a8\u04aa\u04bc\u04bd\u04c2", "\u01eb\u01fd\u01f5\u01e8\u01a0\u01a2\u01b4\u01b5\u01ca", "\u0772\u0764\u076c\u0771\u0739\u073b\u072d\u074f\u072c\u0753", "\u0625\u0633\u063b\u0626\u0662\u066e\u066c\u067a\u0618\u067b\u0604", "\u0693\u0685\u068d\u0690\u06d8\u06da\u06cc\u06ae\u06ad\u06cd\u06b2", "\u038c\u0383\u0384\u038b\u0386\u0383\u0390\u038f\u03d6\u03d4\u03c2\u03c3\u03bc"})
public final class Class1183 {
    public static int field4693 = 50118582;
    public static float field4694;

    private static String rJbWaF6nhzQpGBGn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite XtVnL9O2hSG13p(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1183.rJbWaF6nhzQpGBGn(k2, -49628503));
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
                int a2 = Integer.parseInt(Class1183.rJbWaF6nhzQpGBGn(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1183.rJbWaF6nhzQpGBGn(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1183.rJbWaF6nhzQpGBGn(k2, -49628503) + " " + l2 + " " + m2);
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
        ai\u200e = "How much horizontal knock-back to take";
        ay\u200e = "Amplifier";
        field4694 = Float.intBitsToFloat(1037622576);
    }
}

