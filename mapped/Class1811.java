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

@HACHIMI_CLIENT(mv=100, d1={"\u2b9a\u2b98\u2b97\u2b9a\u2b9c\u2b9e\u2b97\u2b96", "\u2b9c\u2b9b\u2b9e\u2b9f\u2b9f\u2b9e\u2b93", "\ua755\ua750\ua756\ua75a\ua753\ua752\ua754\ua753", "\uc02a\uc02c\uc028\uc02f\uc025\uc025\uc02b\uc024", "\u9407\u9404\u9406\u9407\u9407\u9407\u9407\u940d", "\u0cd7\u0cd0\u0cd0\u0cd1\u0cd6\u0cd5\u0cda\u0cd5", "\ud217\ud211\ud214\ud217\ud217\ud212\ud21b\ud216", "\u1e5b\u1e58\u1e5c\u1e5b\u1e5e\u1e5c\u1e59\u1e5a", "\u71ad\u71ad\u71ae\u71ac\u71ad\u71a8\u71a8\u71aa", "\u627c\u627b\u6278\u6270\u627c\u6270\u627f\u6279", "\u6b78\u6b7b\u6b7d\u6b7a\u6b7c\u6b78\u6b7b\u6b7e", "\ue0f8\ue0fd\ue0fe\ue0f5\ue0fe\ue0ff\ue0fc\ue0f9", "\u0d3e\u0d3e\u0d38\u0d3d\u0d3a\u0d38\u0d3c\u0d31", "\u4112\u4112\u4111\u4113\u4115\u411e\u4116\u4110", "\u6c9f\u6c9c\u6c9f\u6c9c\u6c90\u6c9f\u6c9a\u6c98", "\udd3a\udd39\udd3b\udd3c\udd3d\udd3b\udd3f\udd37", "\u9463\u9469\u9466\u9465\u9465\u9465\u9465\u9462", "\u48f1\u48f0\u48fc\u48f5\u48f5\u48f4\u48f2\u48fc"}, d2={"\u0673\u064f\u0663\u2614\u0626\u0624\u0632\u0656\u0670\u067b\u066c\u067b\u0635\u0676\u067b\u0674\u067d\u0635\u0649\u066e\u0668\u0673\u0674\u067d\u0621\u0633\u0656\u0670\u067b\u066c\u067b\u0635\u0676\u067b\u0674\u067d\u0635\u0649\u066e\u0668\u0673\u0674\u067d\u0621", "\u0313\u032f\u0300\u2374\u0346\u0344\u0352\u0336\u0310\u031b\u030c\u031b\u0355\u0316\u031b\u0314\u031d\u0355\u0329\u030e\u0308\u0313\u0314\u031d\u0341\u0353\u0336\u0310\u031b\u030c\u031b\u0355\u0316\u031b\u0314\u031d\u0355\u0329\u030e\u0308\u0313\u0314\u031d\u0341", "\u020f\u0233\u0227\u2268\u025a\u0258\u024e\u022a\u020c\u0207\u0210\u0207\u0249\u020a\u0207\u0208\u0201\u0249\u0235\u0212\u0214\u020f\u0208\u0201\u025d\u024f\u022a\u020c\u0207\u0210\u0207\u0249\u020a\u0207\u0208\u0201\u0249\u0235\u0212\u0214\u020f\u0208\u0201\u025d", "\u0334\u0308\u031f\u2353\u0361\u0363\u0375\u0311\u0337\u033c\u032b\u033c\u0372\u0331\u033c\u0333\u033a\u0372\u030e\u0329\u032f\u0334\u0333\u033a\u0366\u0374\u0311\u0337\u033c\u032b\u033c\u0372\u0331\u033c\u0333\u033a\u0372\u030e\u0329\u032f\u0334\u0333\u033a\u0366", "\u07b3\u07ec\u07e3\u07e6\u07e1\u07e6\u07fb\u07b1\u07b3\u07b1\u07a7\u07a6\u07d9", "\u055d\u0508\u050f\u0508\u0515\u055f\u055d\u055f\u0549\u0548\u0537", "\u05e8\u05ea\u05fb\u05cc\u05e3\u05ee\u05fc\u05fc\u05b3\u05b1\u05a7\u05a6\u05c3\u05e5\u05ee\u05f9\u05ee\u05a0\u05e3\u05ee\u05e1\u05e8\u05a0\u05cc\u05e3\u05ee\u05fc\u05fc\u05b4", "\u0660\u0669\u067b\u0660\u064b\u0667\u066c\u066d\u0634\u0636\u0620\u0621\u0641", "\u04aa\u04be\u04ba\u04ae\u04a3\u04bc\u04f3\u04f1\u04e7\u0483\u04a5\u04ae\u04b9\u04ae\u04e0\u04a3\u04ae\u04a1\u04a8\u04e0\u0480\u04ad\u04a5\u04aa\u04ac\u04bb\u04f4\u04e6\u0495", "\u0191\u019e\u019d\u019c\u0197\u01ce\u01cc\u01da\u01db\u01be\u0198\u0193\u0184\u0193\u01dd\u019e\u0193\u019c\u0195\u01dd\u01bd\u0190\u0198\u0197\u0191\u0186\u01c9", "\u04cf\u04d4\u04e8\u04cf\u04c9\u04d2\u04d5\u04dc\u0487\u0485\u0493\u0492\u04f7\u04d1\u04da\u04cd\u04da\u0494\u04d7\u04da\u04d5\u04dc\u0494\u04e8\u04cf\u04c9\u04d2\u04d5\u04dc\u0480", "\u0085\u0084\u009f\u0082\u008d\u0092\u00d7\u00d5\u00c3\u00c2\u00bd", "\u06fd\u06fc\u06e7\u06fa\u06f5\u06ea\u06d2\u06ff\u06ff\u06af\u06ad\u06bb\u06ba\u06c5", "\u078d\u079b\u0793\u078e\u07c6\u07c4\u07d2\u07d3\u07ac", "\u0788\u079e\u0796\u078b\u07c3\u07c1\u07d7\u07b5\u07d6\u07a9", "\u0018\u000e\u0006\u001b_SQG%F9", "\u02a6\u02b0\u02b8\u02a5\u02ed\u02ef\u02f9\u029b\u0298\u02f8\u0287", "\u00d4\u00db\u00dc\u00d3\u00de\u00db\u00c8\u00d7\u008e\u008c\u009a\u009b\u00e4"})
public final class Class1811 {
    public static double field6749;
    public static float field6750;

    static {
        e\u200e = "Render dropped items through walls";
        field6749 = Double.longBitsToDouble(4603533422175895103L);
        aq\u200e = "CheckFly";
        aR\u200e = "Render chams on crystals";
        aW\u200e = "AssumeBreak";
        field6750 = Float.intBitsToFloat(1060857804);
    }

    private static String LBmWvJLJMqjYPEst(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Dr2OS8eBePwwC3(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1811.LBmWvJLJMqjYPEst(k2, -390451324));
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
                int a2 = Integer.parseInt(Class1811.LBmWvJLJMqjYPEst(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1811.LBmWvJLJMqjYPEst(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1811.LBmWvJLJMqjYPEst(k2, -390451324) + " " + l2 + " " + m2);
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

