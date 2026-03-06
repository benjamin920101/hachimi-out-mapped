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

@HACHIMI_CLIENT(mv=100, d1={"\u6b32\u6b3c\u6b32\u6b3f\u6b3c\u6b3e\u6b3a", "\u7924\u792b\u792c\u7924\u792b\u7925\u792f", "\ua7ea\ua7ec\ua7e0\ua7ec\ua7e0\ua7e8\ua7ed", "\ubc12\ubc10\ubc1d\ubc12\ubc11\ubc16\ubc1d\ubc10", "\uce5d\uce5e\uce51\uce50\uce51\uce5b\uce5b\uce5a", "\ud13b\ud13c\ud13a\ud139\ud13c\ud13f\ud131\ud138", "\uac5f\uac57\uac53\uac50\uac55\uac53\uac53", "\u2847\u2841\u2848\u2842\u2846\u2840\u2847\u2845", "\u24b2\u24b0\u24b7\u24b3\u24ba\u24b5\u24b4\u24b1", "\ua73d\ua73e\ua73f\ua732\ua73e\ua732\ua73b\ua73d", "\ua075\ua075\ua074\ua070\ua073\ua07e\ua077\ua071", "\ue038\ue03b\ue03c\ue039\ue032\ue039\ue03a\ue03b", "\ube43\ube47\ube41\ube46\ube44\ube40\ube47\ube43", "\uc2c1\uc2c5\uc2c6\uc2c1\uc2c0\uc2cf\uc2c1\uc2c5", "\u1f0d\u1f0b\u1f0a\u1f0d\u1f0b\u1f0e\u1f0d\u1f0e", "\ub1f9\ub1fe\ub1f8\ub1f6\ub1f7\ub1f6\ub1ff", "\u9de6\u9de2\u9de5\u9dec\u9de1\u9ded\u9de6\u9de3"}, d2={"\u0776\u075a\u0759\u271d\u072f\u072d\u073b\u075f\u0779\u0772\u0765\u0772\u073c\u077f\u0772\u077d\u0774\u073c\u0740\u0767\u0761\u077a\u077d\u0774\u0728\u073a\u075f\u0779\u0772\u0765\u0772\u073c\u077f\u0772\u077d\u0774\u073c\u0740\u0767\u0761\u077a\u077d\u0774\u0728", "\u035c\u0370\u0372\u2337\u0305\u0307\u0311\u0375\u0353\u0358\u034f\u0358\u0316\u0355\u0358\u0357\u035e\u0316\u036a\u034d\u034b\u0350\u0357\u035e\u0302\u0310\u0375\u0353\u0358\u034f\u0358\u0316\u0355\u0358\u0357\u035e\u0316\u036a\u034d\u034b\u0350\u0357\u035e\u0302", "\u0378\u0354\u0351\u2313\u0321\u0323\u0335\u0351\u0377\u037c\u036b\u037c\u0332\u0371\u037c\u0373\u037a\u0332\u034e\u0369\u036f\u0374\u0373\u037a\u0326\u0334\u0351\u0377\u037c\u036b\u037c\u0332\u0371\u037c\u0373\u037a\u0332\u034e\u0369\u036f\u0374\u0373\u037a\u0326", "\u0230\u026f\u0260\u0265\u0262\u0265\u0278\u0232\u0230\u0232\u0224\u0225\u025a", "\u05db\u058e\u0589\u058e\u0593\u05d9\u05db\u05d9\u05cf\u05ce\u05b1", "\u0364\u0366\u0377\u0340\u036f\u0362\u0370\u0370\u033f\u033d\u032b\u032a\u034f\u0369\u0362\u0375\u0362\u032c\u036f\u0362\u036d\u0364\u032c\u0340\u036f\u0362\u0370\u0370\u0338", "\u07ba\u07b3\u07a1\u07ba\u0791\u07bd\u07b6\u07b7\u07ee\u07ec\u07fa\u07fb\u079b", "\u01b8\u01ac\u01a8\u01bc\u01b1\u01ae\u01e1\u01e3\u01f5\u0191\u01b7\u01bc\u01ab\u01bc\u01f2\u01b1\u01bc\u01b3\u01ba\u01f2\u0192\u01bf\u01b7\u01b8\u01be\u01a9\u01e6\u01f4\u0187", "\u00eb\u00e4\u00e7\u00e6\u00ed\u00b4\u00b6\u00a0\u00a1\u00c4\u00e2\u00e9\u00fe\u00e9\u00a7\u00e4\u00e9\u00e6\u00ef\u00a7\u00c7\u00ea\u00e2\u00ed\u00eb\u00fc\u00b3", "\u0400\u041b\u0427\u0400\u0406\u041d\u041a\u0413\u0448\u044a\u045c\u045d\u0438\u041e\u0415\u0402\u0415\u045b\u0418\u0415\u041a\u0413\u045b\u0427\u0400\u0406\u041d\u041a\u0413\u044f", "\u0627\u0626\u063d\u0620\u062f\u0630\u0675\u0677\u0661\u0660\u061f", "\u0093\u0092\u0089\u0094\u009b\u0084\u00bc\u0091\u0091\u00c1\u00c3\u00d5\u00d4\u00ab", "\u0736\u0720\u0728\u0735\u077d\u077f\u0769\u0768\u0717", "\u0241\u0257\u025f\u0242\u020a\u0208\u021e\u027c\u021f\u0260", "\u07dc\u07ca\u07c2\u07df\u079b\u0797\u0795\u0783\u07e1\u0782\u07fd", "\u020b\u021d\u0215\u0208\u0240\u0242\u0254\u0236\u0235\u0255\u022a", "\u0534\u053b\u053c\u0533\u053e\u053b\u0528\u0537\u056e\u056c\u057a\u057b\u0504"})
public final class Class3284 {
    public static float field7055 = 0.6759452f;
    public static double field7056 = Double.longBitsToDouble(4604471919862472820L);
    public static double field7057;
    public static float field7058;
    public static double field7059;
    public static String field7060;
    public static double field7061;

    private static String PlNUYJoqyjcHHVl4(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        w\u200e = "Sounds";
        field7058 = Float.intBitsToFloat(1062540500);
        P\u200e = ",";
        field7061 = Double.longBitsToDouble(4604152948431841402L);
        field7060 = "Initializing MacroManager ...";
        field7057 = Double.longBitsToDouble(4603525520004308286L);
        field7059 = Double.longBitsToDouble(4551510721646314285L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite rzog9yreq2O6fl(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3284.PlNUYJoqyjcHHVl4(k2, 1557638575));
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
                int a2 = Integer.parseInt(Class3284.PlNUYJoqyjcHHVl4(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3284.PlNUYJoqyjcHHVl4(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3284.PlNUYJoqyjcHHVl4(k2, 1557638575) + " " + l2 + " " + m2);
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

