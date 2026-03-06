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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\ua578\ua57e\ua57f\ua578\ua57a\ua578\ua57e\ua57b", "\uc5fc\uc5fe\uc5fc\uc5fb\uc5fa\uc5f8\uc5fa\uc5f1", "\u68ec\u68eb\u68e0\u68ee\u68ea\u68e9\u68e8\u68ed", "\uab7a\uab77\uab76\uab77\uab7d\uab7e\uab78\uab7d", "\u8e24\u8e2c\u8e29\u8e25\u8e2b\u8e2d\u8e2f", "\u4650\u4656\u4657\u4653\u4654\u465c\u4652\u465c", "\u6672\u6671\u6671\u6670\u6676\u6677\u6671", "\u470e\u470e\u4709\u470f\u470c\u470b\u4704\u470e", "\uc49a\uc49c\uc49d\uc491\uc49f\uc49e\uc49f\uc499", "\u4f6e\u4f6d\u4f6e\u4f69\u4f66\u4f66\u4f6b\u4f68", "\u649e\u649b\u649c\u649c\u6499\u649c\u6495\u649f", "\ue7bd\ue7b8\ue7b9\ue7b5\ue7bd\ue7bd\ue7b4\ue7b8", "\u3f6a\u3f66\u3f65\u3f61\u3f61\u3f62\u3f66", "\u304d\u3049\u304f\u3049\u3043\u304a\u304f\u304c", "\ud633\ud631\ud631\ud631\ud637\ud632\ud639\ud631", "\u77a3\u77af\u77a7\u77a4\u77a4\u77a2\u77a2\u77a0", "\u4ae6\u4ae2\u4aee\u4aef\u4ae7\u4ae3\u4ae4\u4ae2"}, d2={"\u05b4\u05b2\u0580\u25df\u05ed\u05ef\u05f9\u059d\u05bb\u05b0\u05a7\u05b0\u05fe\u05bd\u05b0\u05bf\u05b6\u05fe\u0582\u05a5\u05a3\u05b8\u05bf\u05b6\u05ea\u05f8\u059d\u05bb\u05b0\u05a7\u05b0\u05fe\u05bd\u05b0\u05bf\u05b6\u05fe\u0582\u05a5\u05a3\u05b8\u05bf\u05b6\u05ea", "km\\\u200020&Bdoxo!bo`i!]z|g`i5'Bdoxo!bo`i!]z|g`i5", "\u0102\u0104\u0134\u2169\u015b\u0159\u014f\u012b\u010d\u0106\u0111\u0106\u0148\u010b\u0106\u0109\u0100\u0148\u0134\u0113\u0115\u010e\u0109\u0100\u015c\u014e\u012b\u010d\u0106\u0111\u0106\u0148\u010b\u0106\u0109\u0100\u0148\u0134\u0113\u0115\u010e\u0109\u0100\u015c", "\u0404\u045b\u0454\u0451\u0456\u0451\u044c\u0406\u0404\u0406\u0410\u0411\u046e", "\u03c7\u0392\u0395\u0392\u038f\u03c5\u03c7\u03c5\u03d3\u03d2\u03ad", "\u02d9\u02db\u02ca\u02fd\u02d2\u02df\u02cd\u02cd\u0282\u0280\u0296\u0297\u02f2\u02d4\u02df\u02c8\u02df\u0291\u02d2\u02df\u02d0\u02d9\u0291\u02fd\u02d2\u02df\u02cd\u02cd\u0285", "\u01df\u01d6\u01c4\u01df\u01f4\u01d8\u01d3\u01d2\u018b\u0189\u019f\u019e\u01fe", "\u06eb\u06ff\u06fb\u06ef\u06e2\u06fd\u06b2\u06b0\u06a6\u06c2\u06e4\u06ef\u06f8\u06ef\u06a1\u06e2\u06ef\u06e0\u06e9\u06a1\u06c1\u06ec\u06e4\u06eb\u06ed\u06fa\u06b5\u06a7\u06d4", "\u0699\u0696\u0695\u0694\u069f\u06c6\u06c4\u06d2\u06d3\u06b6\u0690\u069b\u068c\u069b\u06d5\u0696\u069b\u0694\u069d\u06d5\u06b5\u0698\u0690\u069f\u0699\u068e\u06c1", "\u049e\u0485\u04b9\u049e\u0498\u0483\u0484\u048d\u04d6\u04d4\u04c2\u04c3\u04a6\u0480\u048b\u049c\u048b\u04c5\u0486\u048b\u0484\u048d\u04c5\u04b9\u049e\u0498\u0483\u0484\u048d\u04d1", "\u025b\u025a\u0241\u025c\u0253\u024c\u0209\u020b\u021d\u021c\u0263", "\b\t\u0012\u000f\u0000\u001f'\n\nZXNO0", "\u0403\u0415\u041d\u0400\u0448\u044a\u045c\u045d\u0422", "\u0710\u0706\u070e\u0713\u075b\u0759\u074f\u072d\u074e\u0731", "\u0015\u0003\u000b\u0016R^\\J(K4", "\u0641\u0657\u065f\u0642\u060a\u0608\u061e\u067c\u067f\u061f\u0660", "\u02a5\u02aa\u02ad\u02a2\u02af\u02aa\u02b9\u02a6\u02ff\u02fd\u02eb\u02ea\u0295"})
public final class Class2883 {
    public static float field6837;
    public static double field6838;
    public static float field6839 = 0.16400856f;
    public static float field6840 = 0.9279395f;
    public static float field6841;

    /*
     * WARNING - void declaration
     */
    private static CallSite 8e9ld7wC6pvsN4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class2883.7zAjt7FeUetvDwY7(k2, -731456121));
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
                int a2 = Integer.parseInt(Class2883.7zAjt7FeUetvDwY7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class2883.7zAjt7FeUetvDwY7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class2883.7zAjt7FeUetvDwY7(k2, -731456121) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 7zAjt7FeUetvDwY7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        p\u200e = "The items to throw";
        K\u200e = "Valid item blacklist";
        af\u200e = "Spam send use packet";
        field6838 = Double.longBitsToDouble(4603776700636108225L);
        field6837 = Float.intBitsToFloat(1059663678);
        field6841 = Float.intBitsToFloat(1064978820);
    }
}

