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

@HACHIMI_CLIENT(mv=100, d1={"\ubd35\ubd35\ubd36\ubd30\ubd37\ubd30\ubd32\ubd34", "\ud11d\ud118\ud119\ud11e\ud119\ud114\ud115\ud115", "\u51e9\u51ee\u51ef\u51ef\u51e7\u51eb\u51ea\u51e9", "\u6d82\u6d80\u6d84\u6d82\u6d82\u6d86\u6d82\u6d85", "\ub7f6\ub7fe\ub7f6\ub7f1\ub7f3\ub7ff\ub7f3\ub7f3", "\uae72\uae74\uae72\uae7a\uae74\uae73\uae71\uae74", "\u7b1c\u7b1c\u7b1b\u7b1e\u7b1c\u7b1c\u7b1b", "\ud9ea\ud9e5\ud9e8\ud9ea\ud9ea\ud9e9\ud9ed", "\ub0f7\ub0f3\ub0f0\ub0f7\ub0f2\ub0f3\ub0f1\ub0f1", "\u2139\u2135\u2139\u2137\u2131\u2132\u2135", "\u0843\u0840\u0840\u0842\u0846\u084e\u0841\u0845", "\udfc8\udfc0\udfcc\udfca\udfcb\udfcd\udfce\udfcf", "\u792a\u792d\u7926\u792e\u7928\u7929\u792d\u792c", "\u0f74\u0f7f\u0f70\u0f70\u0f75\u0f74\u0f7f\u0f70", "\u95bf\u95b5\u95b4\u95bf\u95b7\u95b1\u95b6"}, d2={"\u04d9\u04df\u04e7\u24b0\u0482\u0480\u0496\u04f2\u04d4\u04df\u04c8\u04df\u0491\u04d2\u04df\u04d0\u04d9\u0491\u04ed\u04ca\u04cc\u04d7\u04d0\u04d9\u0485\u0497\u04f2\u04d4\u04df\u04c8\u04df\u0491\u04d2\u04df\u04d0\u04d9\u0491\u04ed\u04ca\u04cc\u04d7\u04d0\u04d9\u0485", "\u0728\u0777\u0778\u077d\u077a\u077d\u0760\u072a\u0728\u072a\u073c\u073d\u0742", "\u01b8\u01ed\u01ea\u01ed\u01f0\u01ba\u01b8\u01ba\u01ac\u01ad\u01d2", "@BSdKFTT\u001b\u0019\u000f\u000ekMFQF\bKFI@\bdKFTT\u001c", "\u0604\u060d\u061f\u0604\u062f\u0603\u0608\u0609\u0650\u0652\u0644\u0645\u0625", "\u02f8\u02ec\u02e8\u02fc\u02f1\u02ee\u02a1\u02a3\u02b5\u02d1\u02f7\u02fc\u02eb\u02fc\u02b2\u02f1\u02fc\u02f3\u02fa\u02b2\u02d2\u02ff\u02f7\u02f8\u02fe\u02e9\u02a6\u02b4\u02c7", "{twv}$&01Tryny7tyv\u007f7Wzr}{l#", "\u0364\u037f\u0343\u0364\u0362\u0379\u037e\u0377\u032c\u032e\u0338\u0339\u035c\u037a\u0371\u0366\u0371\u033f\u037c\u0371\u037e\u0377\u033f\u0343\u0364\u0362\u0379\u037e\u0377\u032b", "\u063c\u063d\u0626\u063b\u0634\u062b\u066e\u066c\u067a\u067b\u0604", "\u0703\u0702\u0719\u0704\u070b\u0714\u072c\u0701\u0701\u0751\u0753\u0745\u0744\u073b", "\u0338\u032e\u0326\u033b\u0373\u0371\u0367\u0366\u0319", "\u074c\u075a\u0752\u074f\u0707\u0705\u0713\u0771\u0712\u076d", "\u06a5\u06b3\u06bb\u06a6\u06e2\u06ee\u06ec\u06fa\u0698\u06fb\u0684", "\u02ca\u02dc\u02d4\u02c9\u0281\u0283\u0295\u02f7\u02f4\u0294\u02eb", "\u0623\u062c\u062b\u0624\u0629\u062c\u063f\u0620\u0679\u067b\u066d\u066c\u0613"})
public final class Class3973 {
    public static int field9057 = 1507866816;

    /*
     * Enabled aggressive block sorting
     */
    private static String jJBwby5BIhDo4Gm9(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 34947 : 34948;
            block5: while (true) {
                switch (n2) {
                    case 34948: {
                        n2 = 34946;
                        continue block5;
                    }
                    case 34947: {
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite iTMFqnydcST6sP(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3973.jJBwby5BIhDo4Gm9(k2, 1134774685));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3973.jJBwby5BIhDo4Gm9(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 46507 : 46506;
            block7: while (true) {
                switch (n3) {
                    case 46507: {
                        n3 = 46505;
                        continue block7;
                    }
                    case 46506: {
                        String c2 = Class3973.jJBwby5BIhDo4Gm9(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3973.jJBwby5BIhDo4Gm9(k2, 1134774685) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        bc\u200e = "Render shaders on animals";
    }
}

