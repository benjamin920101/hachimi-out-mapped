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

@HACHIMI_CLIENT(mv=100, d1={"\u26b4\u26b2\u26bf\u26b6\u26b2\u26b0\u26be\u26be", "\ue58f\ue58c\ue58b\ue58e\ue588\ue58c\ue58c\ue589", "\uaad5\uaad2\uaadb\uaad3\uaad7\uaad0\uaad6\uaad5", "\ub689\ub68e\ub68f\ub68a\ub68b\ub68d\ub689\ub68f", "\ud501\ud506\ud509\ud506\ud508\ud507\ud506\ud504", "\u4fc7\u4fc1\u4fc3\u4fce\u4fcf\u4fc1\u4fce\u4fc3", "\ue60d\ue60a\ue600\ue600\ue60d\ue601\ue601\ue60d", "\ud83b\ud83d\ud838\ud83a\ud83d\ud83d\ud838\ud838", "\udc1b\udc1b\udc17\udc1b\udc1f\udc18\udc19", "\u1e6e\u1e61\u1e69\u1e60\u1e6e\u1e6a\u1e6f", "\u8348\u834e\u8344\u8344\u834f\u834e\u834d\u834e", "\u4b06\u4b0d\u4b04\u4b06\u4b07\u4b01\u4b05\u4b05", "\udae7\udae1\udae2\udae2\udae0\udae0\udae0\udae0", "\u156b\u1569\u156e\u156a\u156f\u156d\u1563\u156b", "\u9ae3\u9ae4\u9ae0\u9ae4\u9ae6\u9ae6\u9ae7\u9ae9", "\ud1c2\ud1c0\ud1c8\ud1c6\ud1c7\ud1c3\ud1c8\ud1c6"}, d2={"\u0270\u025e\u0277\u2213\u0221\u0223\u0235\u0251\u0277\u027c\u026b\u027c\u0232\u0271\u027c\u0273\u027a\u0232\u024e\u0269\u026f\u0274\u0273\u027a\u0226\u0234\u0251\u0277\u027c\u026b\u027c\u0232\u0271\u027c\u0273\u027a\u0232\u024e\u0269\u026f\u0274\u0273\u027a\u0226", "\u0340\u036e\u0346\u2323\u0311\u0313\u0305\u0361\u0347\u034c\u035b\u034c\u0302\u0341\u034c\u0343\u034a\u0302\u037e\u0359\u035f\u0344\u0343\u034a\u0316\u0304\u0361\u0347\u034c\u035b\u034c\u0302\u0341\u034c\u0343\u034a\u0302\u037e\u0359\u035f\u0344\u0343\u034a\u0316", "\u06ea\u06b5\u06ba\u06bf\u06b8\u06bf\u06a2\u06e8\u06ea\u06e8\u06fe\u06ff\u0680", "\u07f5\u07a0\u07a7\u07a0\u07bd\u07f7\u07f5\u07f7\u07e1\u07e0\u079f", "\u0499\u049b\u048a\u04bd\u0492\u049f\u048d\u048d\u04c2\u04c0\u04d6\u04d7\u04b2\u0494\u049f\u0488\u049f\u04d1\u0492\u049f\u0490\u0499\u04d1\u04bd\u0492\u049f\u048d\u048d\u04c5", "\u044e\u0447\u0455\u044e\u0465\u0449\u0442\u0443\u041a\u0418\u040e\u040f\u046f", "\u01f5\u01e1\u01e5\u01f1\u01fc\u01e3\u01ac\u01ae\u01b8\u01dc\u01fa\u01f1\u01e6\u01f1\u01bf\u01fc\u01f1\u01fe\u01f7\u01bf\u01df\u01f2\u01fa\u01f5\u01f3\u01e4\u01ab\u01b9\u01ca", "\u04ed\u04e2\u04e1\u04e0\u04eb\u04b2\u04b0\u04a6\u04a7\u04c2\u04e4\u04ef\u04f8\u04ef\u04a1\u04e2\u04ef\u04e0\u04e9\u04a1\u04c1\u04ec\u04e4\u04eb\u04ed\u04fa\u04b5", "\u034c\u0357\u036b\u034c\u034a\u0351\u0356\u035f\u0304\u0306\u0310\u0311\u0374\u0352\u0359\u034e\u0359\u0317\u0354\u0359\u0356\u035f\u0317\u036b\u034c\u034a\u0351\u0356\u035f\u0303", "\u03ef\u03ee\u03f5\u03e8\u03e7\u03f8\u03bd\u03bf\u03a9\u03a8\u03d7", "\u0109\u0108\u0113\u010e\u0101\u011e\u0126\u010b\u010b\u015b\u0159\u014f\u014e\u0131", "\u0534\u0522\u052a\u0537\u057f\u057d\u056b\u056a\u0515", "\u0233\u0225\u022d\u0230\u0278\u027a\u026c\u020e\u026d\u0212", "\u00c7\u00d1\u00d9\u00c4\u0080\u008c\u008e\u0098\u00fa\u0099\u00e6", "\u0646\u0650\u0658\u0645\u060d\u060f\u0619\u067b\u0678\u0618\u0667", "\u05f9\u05f6\u05f1\u05fe\u05f3\u05f6\u05e5\u05fa\u05a3\u05a1\u05b7\u05b6\u05c9"})
public final class Class5622 {
    public static double field10736;
    public static double field10737;
    public static float field10738;
    public static int field10739 = -758493610;
    public static double field10740;

    /*
     * WARNING - void declaration
     */
    private static CallSite OOq5NwdGuC1yTr(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5622.PErvDAnmrvVgA9tq(k2, -1120073533));
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
                int a2 = Integer.parseInt(Class5622.PErvDAnmrvVgA9tq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5622.PErvDAnmrvVgA9tq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5622.PErvDAnmrvVgA9tq(k2, -1120073533) + " " + l2 + " " + m2);
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
        f\u200e = "";
        field10740 = Double.longBitsToDouble(4606692627698751752L);
        field10737 = Double.longBitsToDouble(4605666304317750722L);
        field10738 = Float.intBitsToFloat(1055517096);
        field10736 = Double.longBitsToDouble(4606043051750066255L);
        ca\u200e = "CryingObsidian";
    }

    private static String PErvDAnmrvVgA9tq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

