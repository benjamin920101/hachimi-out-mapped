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

@HACHIMI_CLIENT(mv=100, d1={"\u5578\u5578\u5577\u557e\u557a\u557d\u557a\u5577", "\u9061\u906c\u9061\u9066\u9065\u906d\u9066\u9066", "\ua110\ua114\ua112\ua110\ua110\ua112\ua113", "\u79ed\u79ee\u79eb\u79ec\u79ea\u79ed\u79e6\u79ec", "\u2832\u2839\u2836\u2833\u2833\u2833\u2838\u2830", "\u6aaa\u6aa8\u6aac\u6aa7\u6aaf\u6aa9\u6aa7\u6aa9", "\u9cb8\u9cba\u9cb2\u9cbb\u9cb8\u9cbb\u9cbc\u9cbb", "\u2f6b\u2f63\u2f69\u2f6c\u2f62\u2f6b\u2f6e\u2f6d", "\u443e\u4438\u443d\u443d\u4433\u4439\u443e\u443e", "\u1fdd\u1fdf\u1fd1\u1fde\u1fd0\u1fdc\u1fdb\u1fd1", "\ud981\ud984\ud983\ud98d\ud983\ud985\ud982\ud983", "\u4ab5\u4ab3\u4ab9\u4ab5\u4ab1\u4ab4\u4ab4\u4ab7", "\u507d\u507e\u5075\u5078\u5078\u5078\u507e\u5079", "\ue827\ue822\ue826\ue82c\ue823\ue825\ue822\ue823", "\u1f61\u1f60\u1f66\u1f64\u1f64\u1f67\u1f6a\u1f61", "\udc67\udc64\udc61\udc65\udc6c\udc65\udc65", "\u1167\u1166\u1164\u1160\u1162\u1165\u1164\u1166"}, d2={"\u01c2\u01ef\u01c7\u21a6\u0194\u0196\u0180\u01e4\u01c2\u01c9\u01de\u01c9\u0187\u01c4\u01c9\u01c6\u01cf\u0187\u01fb\u01dc\u01da\u01c1\u01c6\u01cf\u0193\u0181\u01e4\u01c2\u01c9\u01de\u01c9\u0187\u01c4\u01c9\u01c6\u01cf\u0187\u01fb\u01dc\u01da\u01c1\u01c6\u01cf\u0193", "\u00fd\u00d0\u00e7\u2099\u00ab\u00a9\u00bf\u00db\u00fd\u00f6\u00e1\u00f6\u00b8\u00fb\u00f6\u00f9\u00f0\u00b8\u00c4\u00e3\u00e5\u00fe\u00f9\u00f0\u00ac\u00be\u00db\u00fd\u00f6\u00e1\u00f6\u00b8\u00fb\u00f6\u00f9\u00f0\u00b8\u00c4\u00e3\u00e5\u00fe\u00f9\u00f0\u00ac", "\u018a\u01a7\u0191\u21ee\u01dc\u01de\u01c8\u01ac\u018a\u0181\u0196\u0181\u01cf\u018c\u0181\u018e\u0187\u01cf\u01b3\u0194\u0192\u0189\u018e\u0187\u01db\u01c9\u01ac\u018a\u0181\u0196\u0181\u01cf\u018c\u0181\u018e\u0187\u01cf\u01b3\u0194\u0192\u0189\u018e\u0187\u01db", "\u07d8\u0787\u0788\u078d\u078a\u078d\u0790\u07da\u07d8\u07da\u07cc\u07cd\u07b2", "\u074e\u071b\u071c\u071b\u0706\u074c\u074e\u074c\u075a\u075b\u0724", "\u011f\u011d\u010c\u013b\u0114\u0119\u010b\u010b\u0144\u0146\u0150\u0151\u0134\u0112\u0119\u010e\u0119\u0157\u0114\u0119\u0116\u011f\u0157\u013b\u0114\u0119\u010b\u010b\u0143", "\u05ef\u05e6\u05f4\u05ef\u05c4\u05e8\u05e3\u05e2\u05bb\u05b9\u05af\u05ae\u05ce", "\u035b\u034f\u034b\u035f\u0352\u034d\u0302\u0300\u0316\u0372\u0354\u035f\u0348\u035f\u0311\u0352\u035f\u0350\u0359\u0311\u0371\u035c\u0354\u035b\u035d\u034a\u0305\u0317\u0364", "\u0286\u0289\u028a\u028b\u0280\u02d9\u02db\u02cd\u02cc\u02a9\u028f\u0284\u0293\u0284\u02ca\u0289\u0284\u028b\u0282\u02ca\u02aa\u0287\u028f\u0280\u0286\u0291\u02de", "\u0253\u0248\u0274\u0253\u0255\u024e\u0249\u0240\u021b\u0219\u020f\u020e\u026b\u024d\u0246\u0251\u0246\u0208\u024b\u0246\u0249\u0240\u0208\u0274\u0253\u0255\u024e\u0249\u0240\u021c", "\u0428\u0429\u0432\u042f\u0420\u043f\u047a\u0478\u046e\u046f\u0410", "\u0570\u0571\u056a\u0577\u0578\u0567\u055f\u0572\u0572\u0522\u0520\u0536\u0537\u0548", "\u0284\u0292\u029a\u0287\u02cf\u02cd\u02db\u02da\u02a5", "oyql$&0R1N", "\u0460\u0476\u047e\u0463\u0427\u042b\u0429\u043f\u045d\u043e\u0441", "\u0006\u0010\u0018\u0005MOY;8X'", "\u00d6\u00d9\u00de\u00d1\u00dc\u00d9\u00ca\u00d5\u008c\u008e\u0098\u0099\u00e6"})
public final class Class3582 {
    public static float field7969;
    public static float field7970;
    public static String field7971;
    public static double field7972;
    public static float field7973;

    /*
     * WARNING - void declaration
     */
    private static CallSite ICoqbrUQSyOnL2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3582.YxQSTqgsvynAMOd4(k2, 2007151687));
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
                int a2 = Integer.parseInt(Class3582.YxQSTqgsvynAMOd4(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3582.YxQSTqgsvynAMOd4(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3582.YxQSTqgsvynAMOd4(k2, 2007151687) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String YxQSTqgsvynAMOd4(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        c\u200e = "MonstersBox";
        field7969 = Float.intBitsToFloat(1059277748);
        field7970 = Float.intBitsToFloat(1118437376);
        field7973 = Float.intBitsToFloat(1063396173);
        bJ\u200e = "ExtraBox";
        field7972 = Double.longBitsToDouble(4585122255268734864L);
        field7971 = "x";
    }
}

