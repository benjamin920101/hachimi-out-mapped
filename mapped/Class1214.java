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

@HACHIMI_CLIENT(mv=100, d1={"\u38fe\u38f4\u38f1\u38f3\u38fe\u38ff\u38f3", "\u62f4\u62f7\u62f8\u62f7\u62f0\u62f6\u62f6\u62f2", "\u6b66\u6b69\u6b68\u6b6a\u6b68\u6b6d\u6b6e", "\u100d\u1002\u100b\u1008\u100b\u100c\u100a\u1003", "\udeec\udeee\udee0\udee8\udee1\udeea\udee1\udeeb", "\u6a23\u6a21\u6a20\u6a24\u6a26\u6a25\u6a20\u6a28", "\u7b8d\u7b8e\u7b8a\u7b83\u7b8c\u7b8b\u7b88\u7b88", "\u19bd\u19ba\u19bf\u19b9\u19bb\u19bb\u19bf\u19b8", "\u2a67\u2a62\u2a63\u2a62\u2a64\u2a61\u2a62\u2a60", "\u91a6\u91a6\u91a5\u91a4\u91a4\u91ae\u91af\u91a0", "\u63b8\u63b8\u63bb\u63bb\u63be\u63b8\u63bb\u63bb", "\ua195\ua190\ua196\ua19b\ua19b\ua195\ua19a\ua19b", "\u5bdb\u5bd5\u5bdc\u5bde\u5bdd\u5bde\u5bdc", "\uc6ed\uc6e6\uc6ee\uc6e8\uc6eb\uc6ed\uc6e7\uc6eb", "\u956e\u956b\u956d\u9560\u956d\u956d\u956d\u9569", "\u3975\u3973\u397f\u3973\u397e\u397e\u3974\u3975"}, d2={"hLi\u2017%'1Usxox6uxw~6Jmkpw~\"0Usxox6uxw~6Jmkpw~\"", "\u057a\u055e\u057a\u2505\u0537\u0535\u0523\u0547\u0561\u056a\u057d\u056a\u0524\u0567\u056a\u0565\u056c\u0524\u0558\u057f\u0579\u0562\u0565\u056c\u0530\u0522\u0547\u0561\u056a\u057d\u056a\u0524\u0567\u056a\u0565\u056c\u0524\u0558\u057f\u0579\u0562\u0565\u056c\u0530", "\u032b\u0374\u037b\u037e\u0379\u037e\u0363\u0329\u032b\u0329\u033f\u033e\u0341", "\u0169\u013c\u013b\u013c\u0121\u016b\u0169\u016b\u017d\u017c\u0103", "\u04f7\u04f5\u04e4\u04d3\u04fc\u04f1\u04e3\u04e3\u04ac\u04ae\u04b8\u04b9\u04dc\u04fa\u04f1\u04e6\u04f1\u04bf\u04fc\u04f1\u04fe\u04f7\u04bf\u04d3\u04fc\u04f1\u04e3\u04e3\u04ab", "\u01a3\u01aa\u01b8\u01a3\u0188\u01a4\u01af\u01ae\u01f7\u01f5\u01e3\u01e2\u0182", "\u026a\u027e\u027a\u026e\u0263\u027c\u0233\u0231\u0227\u0243\u0265\u026e\u0279\u026e\u0220\u0263\u026e\u0261\u0268\u0220\u0240\u026d\u0265\u026a\u026c\u027b\u0234\u0226\u0255", "\u035f\u0350\u0353\u0352\u0359\u0300\u0302\u0314\u0315\u0370\u0356\u035d\u034a\u035d\u0313\u0350\u035d\u0352\u035b\u0313\u0373\u035e\u0356\u0359\u035f\u0348\u0307", "\u051e\u0505\u0539\u051e\u0518\u0503\u0504\u050d\u0556\u0554\u0542\u0543\u0526\u0500\u050b\u051c\u050b\u0545\u0506\u050b\u0504\u050d\u0545\u0539\u051e\u0518\u0503\u0504\u050d\u0551", "\u0723\u0722\u0739\u0724\u072b\u0734\u0771\u0773\u0765\u0764\u071b", "\u059f\u059e\u0585\u0598\u0597\u0588\u05b0\u059d\u059d\u05cd\u05cf\u05d9\u05d8\u05a7", "\u0169\u017f\u0177\u016a\u0122\u0120\u0136\u0137\u0148", "\u056d\u057b\u0573\u056e\u0526\u0524\u0532\u0550\u0533\u054c", "\u05ee\u05f8\u05f0\u05ed\u05a9\u05a5\u05a7\u05b1\u05d3\u05b0\u05cf", "\u059a\u058c\u0584\u0599\u05d1\u05d3\u05c5\u05a7\u05a4\u05c4\u05bb", "\u001d\u0012\u0015\u001a\u0017\u0012\u0001\u001eGESR-"})
public final class Class1214 {
    public static float field4778;
    public static float field4779;
    public static double field4780;

    private static String MlfF62r6vbqXXV1Q(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite l1JfgJ384EYCqe(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1214.MlfF62r6vbqXXV1Q(k2, 108986354));
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
                int a2 = Integer.parseInt(Class1214.MlfF62r6vbqXXV1Q(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1214.MlfF62r6vbqXXV1Q(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1214.MlfF62r6vbqXXV1Q(k2, 108986354) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 8016 : 8017;
        block7: while (true) {
            switch (n3) {
                case 8017: {
                    n3 = 8015;
                    continue block7;
                }
                case 8016: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field4780 = Double.longBitsToDouble(0x4000000000000000L);
        as\u200e = "";
        field4779 = Float.intBitsToFloat(1058122806);
        aQ\u200e = "Surround";
        field4778 = Float.intBitsToFloat(998148608);
    }
}

