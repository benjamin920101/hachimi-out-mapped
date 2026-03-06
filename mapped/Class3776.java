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
@HACHIMI_CLIENT(mv=100, d1={"\ue29a\ue29d\ue299\ue291\ue299\ue298\ue29f\ue290", "\ue477\ue477\ue471\ue47f\ue477\ue477\ue470\ue471", "\u2b1c\u2b1b\u2b1e\u2b1f\u2b1e\u2b18\u2b1b", "\ua6d0\ua6d2\ua6d5\ua6dd\ua6dd\ua6d7\ua6dd\ua6dd", "\u78c7\u78c6\u78c6\u78c4\u78c2\u78c2\u78c0\u78c7", "\u08c0\u08c7\u08c8\u08c0\u08c7\u08c5\u08c6\u08c6", "\u101f\u1011\u101a\u101e\u101c\u101c\u101e\u101a", "\u0c27\u0c25\u0c21\u0c27\u0c24\u0c26\u0c2a\u0c23", "\u901b\u901c\u901a\u901c\u901f\u9015\u901d", "\u54a8\u54ae\u54a9\u54a8\u54a9\u54af\u54a9\u54a4", "\u8751\u8754\u8756\u8754\u8750\u8752\u8754", "\u1a20\u1a23\u1a24\u1a20\u1a27\u1a2a\u1a24\u1a27", "\u6eb7\u6eb0\u6eb7\u6eb7\u6eb5\u6ebc\u6eb5\u6eb1", "\u0b07\u0b0a\u0b03\u0b02\u0b0b\u0b01\u0b04\u0b0b", "\u0220\u0225\u022a\u0221\u0226\u022b\u0224\u0222", "\u2cd1\u2cd7\u2cde\u2cd4\u2cdf\u2cd4\u2cd7\u2cd1", "\u39fc\u39f9\u39fb\u39fd\u39fb\u39ff\u39fb\u39ff", "\u0764\u0763\u0765\u0763\u0768\u0760\u0763\u0769", "\u97e8\u97e2\u97e9\u97e2\u97e2\u97ea\u97ea\u97ec"}, d2={"\u0267\u0242\u024b\u2204\u0236\u0234\u0222\u0246\u0260\u026b\u027c\u026b\u0225\u0266\u026b\u0264\u026d\u0225\u0259\u027e\u0278\u0263\u0264\u026d\u0231\u0223\u0246\u0260\u026b\u027c\u026b\u0225\u0266\u026b\u0264\u026d\u0225\u0259\u027e\u0278\u0263\u0264\u026d\u0231", "\u04ec\u04c9\u04c3\u248f\u04bd\u04bf\u04a9\u04cd\u04eb\u04e0\u04f7\u04e0\u04ae\u04ed\u04e0\u04ef\u04e6\u04ae\u04d2\u04f5\u04f3\u04e8\u04ef\u04e6\u04ba\u04a8\u04cd\u04eb\u04e0\u04f7\u04e0\u04ae\u04ed\u04e0\u04ef\u04e6\u04ae\u04d2\u04f5\u04f3\u04e8\u04ef\u04e6\u04ba", ">\u001b\u0010\u205dom{\u001f92%2|?2=4|\u0000'!:=4hz\u001f92%2|?2=4|\u0000'!:=4h", "\u0507\u0522\u052e\u2564\u0556\u0554\u0542\u0526\u0500\u050b\u051c\u050b\u0545\u0506\u050b\u0504\u050d\u0545\u0539\u051e\u0518\u0503\u0504\u050d\u0551\u0543\u0526\u0500\u050b\u051c\u050b\u0545\u0506\u050b\u0504\u050d\u0545\u0539\u051e\u0518\u0503\u0504\u050d\u0551", "\u0233\u0216\u021b\u2250\u0262\u0260\u0276\u0212\u0234\u023f\u0228\u023f\u0271\u0232\u023f\u0230\u0239\u0271\u020d\u022a\u022c\u0237\u0230\u0239\u0265\u0277\u0212\u0234\u023f\u0228\u023f\u0271\u0232\u023f\u0230\u0239\u0271\u020d\u022a\u022c\u0237\u0230\u0239\u0265", "\u046f\u0430\u043f\u043a\u043d\u043a\u0427\u046d\u046f\u046d\u047b\u047a\u0405", "\u068e\u06db\u06dc\u06db\u06c6\u068c\u068e\u068c\u069a\u069b\u06e4", "\u06b9\u06bb\u06aa\u069d\u06b2\u06bf\u06ad\u06ad\u06e2\u06e0\u06f6\u06f7\u0692\u06b4\u06bf\u06a8\u06bf\u06f1\u06b2\u06bf\u06b0\u06b9\u06f1\u069d\u06b2\u06bf\u06ad\u06ad\u06e5", "\u0308\u0301\u0313\u0308\u0323\u030f\u0304\u0305\u035c\u035e\u0348\u0349\u0329", "\u041f\u040b\u040f\u041b\u0416\u0409\u0446\u0444\u0452\u0436\u0410\u041b\u040c\u041b\u0455\u0416\u041b\u0414\u041d\u0455\u0435\u0418\u0410\u041f\u0419\u040e\u0441\u0453\u0420", "\u0305\u030a\u0309\u0308\u0303\u035a\u0358\u034e\u034f\u032a\u030c\u0307\u0310\u0307\u0349\u030a\u0307\u0308\u0301\u0349\u0329\u0304\u030c\u0303\u0305\u0312\u035d", "\u023a\u0221\u021d\u023a\u023c\u0227\u0220\u0229\u0272\u0270\u0266\u0267\u0202\u0224\u022f\u0238\u022f\u0261\u0222\u022f\u0220\u0229\u0261\u021d\u023a\u023c\u0227\u0220\u0229\u0275", "\u0270\u0271\u026a\u0277\u0278\u0267\u0222\u0220\u0236\u0237\u0248", "\u03e4\u03e5\u03fe\u03e3\u03ec\u03f3\u03cb\u03e6\u03e6\u03b6\u03b4\u03a2\u03a3\u03dc", "\u028c\u029a\u0292\u028f\u02c7\u02c5\u02d3\u02d2\u02ad", "\u049a\u048c\u0484\u0499\u04d1\u04d3\u04c5\u04a7\u04c4\u04bb", "\u02fc\u02ea\u02e2\u02ff\u02bb\u02b7\u02b5\u02a3\u02c1\u02a2\u02dd", "\u0229\u023f\u0237\u022a\u0262\u0260\u0276\u0214\u0217\u0277\u0208", "\u00d0\u00df\u00d8\u00d7\u00da\u00df\u00cc\u00d3\u008a\u0088\u009e\u009f\u00e0"})
public final class Class3776 {
    public static double field8556 = Double.longBitsToDouble(4605570130133418770L);
    public static double field8557;

    private static String qrn9q3wlWkAhaQ8T(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        K\u200e = "\u00a77%s\u00a7f was set to mode \u00a7s%s";
        field8557 = Double.longBitsToDouble(4614256656552045848L);
        bp\u200e = "Support";
        bq\u200e = "Allow multiple assignblocks";
        bx\u200e = "GRIM_V3";
        bC\u200e = "Target players";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 1FwVsqDYzlq6DA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3776.qrn9q3wlWkAhaQ8T(k2, -45524212));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 17818 : 17817;
        block6: while (true) {
            switch (n3) {
                case 17818: {
                    n3 = 17816;
                    continue block6;
                }
                case 17817: {
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
                int a2 = Integer.parseInt(Class3776.qrn9q3wlWkAhaQ8T(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3776.qrn9q3wlWkAhaQ8T(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class3776.qrn9q3wlWkAhaQ8T(k2, -45524212) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

