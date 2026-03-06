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
@HACHIMI_CLIENT(mv=100, d1={"\ua3ba\ua3bd\ua3be\ua3bc\ua3b4\ua3bc\ua3bf\ua3b4", "\ucb4d\ucb4f\ucb4f\ucb49\ucb4c\ucb4d\ucb4b\ucb48", "\ue5b0\ue5b2\ue5ba\ue5b1\ue5b2\ue5b4\ue5b6\ue5b3", "\u70e9\u70ee\u70ed\u70e2\u70ec\u70e2\u70ee\u70e3", "\u9222\u9229\u9224\u9226\u9221\u9226\u9226\u9223", "\udf47\udf47\udf49\udf49\udf46\udf41\udf40", "\u940b\u9408\u9400\u940a\u9400\u9401\u9409\u940b", "\ub402\ub406\ub401\ub40a\ub401\ub404\ub401\ub400", "\u3df1\u3df5\u3df1\u3dfb\u3df3\u3df7\u3df7\u3dfb", "\u5677\u5670\u5672\u5677\u5674\u5676\u5678\u5670", "\ucaf3\ucaf7\ucaf1\ucaf3\ucaf2\ucaf3\ucaf1\ucaf0", "\uadcb\uadc5\uadca\uadc9\uadca\uadce\uadcd", "\u38e1\u38e2\u38e1\u38e4\u38e5\u38e0\u38ea\u38e5", "\u5370\u5372\u537c\u537d\u5376\u5371\u5373", "\u5c7f\u5c78\u5c7e\u5c7a\u5c74\u5c75\u5c7c\u5c7f", "\u06d0\u06d7\u06da\u06d3\u06d1\u06d2\u06d5\u06d6"}, d2={"\u02c1\u02eb\u02e4\u22a2\u0290\u0292\u0284\u02e0\u02c6\u02cd\u02da\u02cd\u0283\u02c0\u02cd\u02c2\u02cb\u0283\u02ff\u02d8\u02de\u02c5\u02c2\u02cb\u0297\u0285\u02e0\u02c6\u02cd\u02da\u02cd\u0283\u02c0\u02cd\u02c2\u02cb\u0283\u02ff\u02d8\u02de\u02c5\u02c2\u02cb\u0297", "\u06d5\u06ff\u06f1\u26b6\u0684\u0686\u0690\u06f4\u06d2\u06d9\u06ce\u06d9\u0697\u06d4\u06d9\u06d6\u06df\u0697\u06eb\u06cc\u06ca\u06d1\u06d6\u06df\u0683\u0691\u06f4\u06d2\u06d9\u06ce\u06d9\u0697\u06d4\u06d9\u06d6\u06df\u0697\u06eb\u06cc\u06ca\u06d1\u06d6\u06df\u0683", "${tqvql&$&01N", "\u01a7\u01f2\u01f5\u01f2\u01ef\u01a5\u01a7\u01a5\u01b3\u01b2\u01cd", "\u035d\u035f\u034e\u0379\u0356\u035b\u0349\u0349\u0306\u0304\u0312\u0313\u0376\u0350\u035b\u034c\u035b\u0315\u0356\u035b\u0354\u035d\u0315\u0379\u0356\u035b\u0349\u0349\u0301", "\u046d\u0464\u0476\u046d\u0446\u046a\u0461\u0460\u0439\u043b\u042d\u042c\u044c", "\u02e8\u02fc\u02f8\u02ec\u02e1\u02fe\u02b1\u02b3\u02a5\u02c1\u02e7\u02ec\u02fb\u02ec\u02a2\u02e1\u02ec\u02e3\u02ea\u02a2\u02c2\u02ef\u02e7\u02e8\u02ee\u02f9\u02b6\u02a4\u02d7", "\u031c\u0313\u0310\u0311\u031a\u0343\u0341\u0357\u0356\u0333\u0315\u031e\u0309\u031e\u0350\u0313\u031e\u0311\u0318\u0350\u0330\u031d\u0315\u031a\u031c\u030b\u0344", "\u074b\u0750\u076c\u074b\u074d\u0756\u0751\u0758\u0703\u0701\u0717\u0716\u0773\u0755\u075e\u0749\u075e\u0710\u0753\u075e\u0751\u0758\u0710\u076c\u074b\u074d\u0756\u0751\u0758\u0704", "\u05fc\u05fd\u05e6\u05fb\u05f4\u05eb\u05ae\u05ac\u05ba\u05bb\u05c4", "\u0584\u0585\u059e\u0583\u058c\u0593\u05ab\u0586\u0586\u05d6\u05d4\u05c2\u05c3\u05bc", "\u0540\u0556\u055e\u0543\u050b\u0509\u051f\u051e\u0561", "\u02ed\u02fb\u02f3\u02ee\u02a6\u02a4\u02b2\u02d0\u02b3\u02cc", "\u0610\u0606\u060e\u0613\u0657\u065b\u0659\u064f\u062d\u064e\u0631", "\u032d\u033b\u0333\u032e\u0366\u0364\u0372\u0310\u0313\u0373\u030c", "\u0127\u0128\u012f\u0120\u012d\u0128\u013b\u0124\u017d\u017f\u0169\u0168\u0117"})
public final class Class3315 {
    public static long field7140 = 0xFFFFFFFFL;
    public static int field7141 = 0;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite iCO6nHJ3fMI7sd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3315.2ZOPT2f6yBNeROVM(k2, -452359076));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 30879 : 30880;
        block6: while (true) {
            switch (n3) {
                case 30880: {
                    n3 = 30878;
                    continue block6;
                }
                case 30879: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3315.2ZOPT2f6yBNeROVM(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3315.2ZOPT2f6yBNeROVM(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3315.2ZOPT2f6yBNeROVM(k2, -452359076) + " " + l2 + " " + m2);
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
        s\u200e = "Tridents util";
        aK\u200e = "Cross";
    }

    private static String 2ZOPT2f6yBNeROVM(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

