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

@HACHIMI_CLIENT(mv=100, d1={"\u1ddd\u1dda\u1dd9\u1dde\u1dde\u1dde\u1ddd\u1ddf", "\u94f4\u94f4\u94f3\u94f6\u94f4\u94f1\u94f7\u94f0", "\u7e8d\u7e8a\u7e8a\u7e88\u7e84\u7e84\u7e88\u7e8b", "\u7194\u719b\u7196\u7195\u7190\u7197\u7197\u7190", "\u291f\u291e\u2914\u291a\u291d\u291b\u2919", "\u8d73\u8d72\u8d74\u8d7f\u8d74\u8d73\u8d7f\u8d75", "\u1276\u1271\u127a\u127b\u127a\u1273\u127a\u1271", "\u1a21\u1a29\u1a21\u1a22\u1a24\u1a29\u1a26", "\u8a2b\u8a29\u8a2d\u8a26\u8a26\u8a29\u8a2a\u8a27", "\u26da\u26dd\u26da\u26d3\u26db\u26db\u26d9", "\u0202\u0206\u0209\u0207\u0209\u0208\u0208\u0201", "\u492d\u492c\u492f\u4920\u4921\u4920\u492a\u492b", "\u4cb7\u4cb6\u4cb7\u4cb1\u4cb3\u4cbd\u4cb4\u4cbc", "\ud0e0\ud0e4\ud0e6\ud0e3\ud0e4\ud0e4\ud0ef\ud0ef", "\ub660\ub663\ub666\ub660\ub66a\ub66b\ub666\ub66a", "\u7996\u799b\u7995\u799a\u7997\u7994\u799b\u7997", "\uc4d3\uc4da\uc4d6\uc4d7\uc4d1\uc4d7\uc4d3\uc4d7"}, d2={"\u035a\u034b\u035d\u233f\u030d\u030f\u0319\u037d\u035b\u0350\u0347\u0350\u031e\u035d\u0350\u035f\u0356\u031e\u0362\u0345\u0343\u0358\u035f\u0356\u030a\u0318\u037d\u035b\u0350\u0347\u0350\u031e\u035d\u0350\u035f\u0356\u031e\u0362\u0345\u0343\u0358\u035f\u0356\u030a", "\u0482\u0493\u0484\u24e7\u04d5\u04d7\u04c1\u04a5\u0483\u0488\u049f\u0488\u04c6\u0485\u0488\u0487\u048e\u04c6\u04ba\u049d\u049b\u0480\u0487\u048e\u04d2\u04c0\u04a5\u0483\u0488\u049f\u0488\u04c6\u0485\u0488\u0487\u048e\u04c6\u04ba\u049d\u049b\u0480\u0487\u048e\u04d2", "\u0767\u0776\u0762\u2702\u0730\u0732\u0724\u0740\u0766\u076d\u077a\u076d\u0723\u0760\u076d\u0762\u076b\u0723\u075f\u0778\u077e\u0765\u0762\u076b\u0737\u0725\u0740\u0766\u076d\u077a\u076d\u0723\u0760\u076d\u0762\u076b\u0723\u075f\u0778\u077e\u0765\u0762\u076b\u0737", "\u030a\u0355\u035a\u035f\u0358\u035f\u0342\u0308\u030a\u0308\u031e\u031f\u0360", "\u0741\u0714\u0713\u0714\u0709\u0743\u0741\u0743\u0755\u0754\u072b", "|~oXwzhh'%32Wqzmz4wzu|4Xwzhh ", "\u0083\u008a\u0098\u0083\u00a8\u0084\u008f\u008e\u00d7\u00d5\u00c3\u00c2\u00a2", "\u00ab\u00bf\u00bb\u00af\u00a2\u00bd\u00f2\u00f0\u00e6\u0082\u00a4\u00af\u00b8\u00af\u00e1\u00a2\u00af\u00a0\u00a9\u00e1\u0081\u00ac\u00a4\u00ab\u00ad\u00ba\u00f5\u00e7\u0094", "\u061b\u0614\u0617\u0616\u061d\u0644\u0646\u0650\u0651\u0634\u0612\u0619\u060e\u0619\u0657\u0614\u0619\u0616\u061f\u0657\u0637\u061a\u0612\u061d\u061b\u060c\u0643", "\u05a6\u05bd\u0581\u05a6\u05a0\u05bb\u05bc\u05b5\u05ee\u05ec\u05fa\u05fb\u059e\u05b8\u05b3\u05a4\u05b3\u05fd\u05be\u05b3\u05bc\u05b5\u05fd\u0581\u05a6\u05a0\u05bb\u05bc\u05b5\u05e9", "\u0596\u0597\u058c\u0591\u059e\u0581\u05c4\u05c6\u05d0\u05d1\u05ae", "\u03c2\u03c3\u03d8\u03c5\u03ca\u03d5\u03ed\u03c0\u03c0\u0390\u0392\u0384\u0385\u03fa", "\u0638\u062e\u0626\u063b\u0673\u0671\u0667\u0666\u0619", "\u0410\u0406\u040e\u0413\u045b\u0459\u044f\u042d\u044e\u0431", "\u0099\u008f\u0087\u009a\u00de\u00d2\u00d0\u00c6\u00a4\u00c7\u00b8", "\u01ea\u01fc\u01f4\u01e9\u01a1\u01a3\u01b5\u01d7\u01d4\u01b4\u01cb", "\u00b8\u00b7\u00b0\u00bf\u00b2\u00b7\u00a4\u00bb\u00e2\u00e0\u00f6\u00f7\u0088"})
public final class Class1281 {
    public static double field4991;
    public static double field4992;
    public static float field4993;
    public static float field4994;

    static {
        field4993 = Float.intBitsToFloat(1034366600);
        O\u200e = "username";
        ao\u200e = "Fall";
        field4994 = Float.intBitsToFloat(1020934912);
        field4992 = Double.longBitsToDouble(4604549142712746229L);
        field4991 = Double.longBitsToDouble(4656510908468559872L);
        bx\u200e = "Could not find player name history!";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ld4BijtInkNyWav4(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 47960 : 47961;
            block5: while (true) {
                switch (n2) {
                    case 47961: {
                        n2 = 47959;
                        continue block5;
                    }
                    case 47960: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite hlJyb0OoLQKJiO(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1281.ld4BijtInkNyWav4(k2, -1184519924));
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
                int a2 = Integer.parseInt(Class1281.ld4BijtInkNyWav4(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1281.ld4BijtInkNyWav4(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1281.ld4BijtInkNyWav4(k2, -1184519924) + " " + l2 + " " + m2);
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

