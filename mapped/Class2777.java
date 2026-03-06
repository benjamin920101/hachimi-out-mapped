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

@HACHIMI_CLIENT(mv=100, d1={"\u01e9\u01ed\u01e7\u01ec\u01ec\u01ee\u01ee\u01eb", "\ude0a\ude0c\ude0e\ude00\ude08\ude09\ude01\ude00", "\u6642\u6646\u6646\u6649\u6644\u6642\u6647\u6642", "\u255e\u255d\u2558\u255b\u255f\u255e\u255f\u255f", "\ue878\ue87d\ue873\ue873\ue87a\ue872\ue872", "\u185f\u185d\u1850\u1851\u185b\u1850\u185a\u185f", "\u7fcb\u7fce\u7fc8\u7fc8\u7fcd\u7fc9\u7fc0\u7fc0", "\u23d5\u23d6\u23d5\u23d7\u23d2\u23d3\u23d3\u23d2", "\u5efd\u5efd\u5ef7\u5ef8\u5efb\u5efc\u5ef8", "\u8115\u811b\u8117\u8113\u8117\u8117\u811a\u8116", "\u17c0\u17c4\u17c0\u17c0\u17c6\u17c6\u17cf\u17ce", "\ubac5\ubac7\ubac0\ubac7\ubac1\ubaca", "\u4d7d\u4d79\u4d76\u4d76\u4d76\u4d7e\u4d7e\u4d7d", "\u23a3\u23a5\u23a8\u23a7\u23a2\u23a5\u23a9\u23a9"}, d2={"\u0567\u0538\u0537\u0532\u0535\u0532\u052f\u0565\u0567\u0565\u0573\u0572\u050d", "\u02bd\u02e8\u02ef\u02e8\u02f5\u02bf\u02bd\u02bf\u02a9\u02a8\u02d7", "\u075b\u0759\u0748\u077f\u0750\u075d\u074f\u074f\u0700\u0702\u0714\u0715\u0770\u0756\u075d\u074a\u075d\u0713\u0750\u075d\u0752\u075b\u0713\u077f\u0750\u075d\u074f\u074f\u0707", "\u03ee\u03e7\u03f5\u03ee\u03c5\u03e9\u03e2\u03e3\u03ba\u03b8\u03ae\u03af\u03cf", "\u0654\u0640\u0644\u0650\u065d\u0642\u060d\u060f\u0619\u067d\u065b\u0650\u0647\u0650\u061e\u065d\u0650\u065f\u0656\u061e\u067e\u0653\u065b\u0654\u0652\u0645\u060a\u0618\u066b", "\u057c\u0573\u0570\u0571\u057a\u0523\u0521\u0537\u0536\u0553\u0575\u057e\u0569\u057e\u0530\u0573\u057e\u0571\u0578\u0530\u0550\u057d\u0575\u057a\u057c\u056b\u0524", "\u00e9\u00f2\u00ce\u00e9\u00ef\u00f4\u00f3\u00fa\u00a1\u00a3\u00b5\u00b4\u00d1\u00f7\u00fc\u00eb\u00fc\u00b2\u00f1\u00fc\u00f3\u00fa\u00b2\u00ce\u00e9\u00ef\u00f4\u00f3\u00fa\u00a6", "\u0610\u0611\u060a\u0617\u0618\u0607\u0642\u0640\u0656\u0657\u0628", "\u0340\u0341\u035a\u0347\u0348\u0357\u036f\u0342\u0342\u0312\u0310\u0306\u0307\u0378", "\u06e7\u06f1\u06f9\u06e4\u06ac\u06ae\u06b8\u06b9\u06c6", "\u0186\u0190\u0198\u0185\u01cd\u01cf\u01d9\u01bb\u01d8\u01a7", "\u01eb\u01fd\u01f5\u01e8\u01ac\u01a0\u01a2\u01b4\u01d6\u01b5\u01ca", "\u03c7\u03d1\u03d9\u03c4\u038c\u038e\u0398\u03fa\u03f9\u0399\u03e6", "\u01bf\u01b0\u01b7\u01b8\u01b5\u01b0\u01a3\u01bc\u01e5\u01e7\u01f1\u01f0\u018f"})
public final class Class2777 {
    public static double field6832;
    public static double field6833;

    /*
     * WARNING - void declaration
     */
    private static CallSite RfxzthqyGR2ntS(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class2777.cgb5wSiN9NAqO4ck(k2, 1012171286));
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
                int a2 = Integer.parseInt(Class2777.cgb5wSiN9NAqO4ck(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class2777.cgb5wSiN9NAqO4ck(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class2777.cgb5wSiN9NAqO4ck(k2, 1012171286) + " " + l2 + " " + m2);
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
        field6833 = Double.longBitsToDouble(4601759210105695148L);
        field6832 = Double.longBitsToDouble(4605689381527942162L);
    }

    private static String cgb5wSiN9NAqO4ck(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

