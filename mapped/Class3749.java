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

@HACHIMI_CLIENT(mv=100, d1={"\ub373\ub371\ub374\ub377\ub37c\ub377\ub377\ub370", "\uaff5\uaff6\uaff8\uaff3\uaff9\uaff9\uaff3\uaff0", "\u3496\u3490\u3498\u3498\u3492\u3498\u3496", "\uab81\uab8f\uab85\uab84\uab81\uab80\uab85\uab83", "\uc90e\uc906\uc90f\uc90a\uc90f\uc90d\uc90f\uc90d", "\u920e\u9209\u9208\u9209\u9203\u920f\u9203\u920a", "\u863e\u8633\u8638\u8638\u8632\u8639\u8633\u863c", "\u7a7f\u7a73\u7a7f\u7a7e\u7a7a\u7a7a\u7a7f\u7a73", "\u1fd8\u1fd5\u1fd5\u1fdd\u1fda\u1fd5\u1fdf\u1fd4", "\u647e\u647f\u647c\u647e\u6473\u647e\u647e\u6473", "\u9f19\u9f1a\u9f18\u9f1d\u9f19\u9f1a\u9f1e\u9f18", "\ub09b\ub091\ub090\ub09a\ub099\ub09a\ub09e\ub099", "\u1ad1\u1ad2\u1ad2\u1ada\u1ad1\u1ad3\u1ad4\u1ad5", "\ubd12\ubd16\ubd1b\ubd10\ubd12\ubd13\ubd11\ubd17", "\u7fa0\u7fa4\u7fa3\u7fa5\u7fa4\u7fa4\u7fad\u7fa5", "\udcd4\udcd3\udcd7\udcd5\udcd6\udcd6\udcd2\udcd1", "\u542f\u542a\u542a\u542d\u542c\u542e\u5428"}, d2={"SZF\u203e\f\u000e\u0018|ZQFQ\u001f\\Q^W\u001fcDBY^W\u000b\u0019|ZQFQ\u001f\\Q^W\u001fcDBY^W\u000b", "\u0381\u0388\u0395\u23ec\u03de\u03dc\u03ca\u03ae\u0388\u0383\u0394\u0383\u03cd\u038e\u0383\u038c\u0385\u03cd\u03b1\u0396\u0390\u038b\u038c\u0385\u03d9\u03cb\u03ae\u0388\u0383\u0394\u0383\u03cd\u038e\u0383\u038c\u0385\u03cd\u03b1\u0396\u0390\u038b\u038c\u0385\u03d9", "{r`\u2016$&0Tryny7tyv\u007f7Kljqv\u007f#1Tryny7tyv\u007f7Kljqv\u007f#", "\u035f\u0300\u030f\u030a\u030d\u030a\u0317\u035d\u035f\u035d\u034b\u034a\u0335", "\u0624\u0671\u0676\u0671\u066c\u0626\u0624\u0626\u0630\u0631\u064e", "\u0226\u0224\u0235\u0202\u022d\u0220\u0232\u0232\u027d\u027f\u0269\u0268\u020d\u022b\u0220\u0237\u0220\u026e\u022d\u0220\u022f\u0226\u026e\u0202\u022d\u0220\u0232\u0232\u027a", "\u01d9\u01d0\u01c2\u01d9\u01f2\u01de\u01d5\u01d4\u018d\u018f\u0199\u0198\u01f8", "\u00d9\u00cd\u00c9\u00dd\u00d0\u00cf\u0080\u0082\u0094\u00f0\u00d6\u00dd\u00ca\u00dd\u0093\u00d0\u00dd\u00d2\u00db\u0093\u00f3\u00de\u00d6\u00d9\u00df\u00c8\u0087\u0095\u00e6", "\u04ad\u04a2\u04a1\u04a0\u04ab\u04f2\u04f0\u04e6\u04e7\u0482\u04a4\u04af\u04b8\u04af\u04e1\u04a2\u04af\u04a0\u04a9\u04e1\u0481\u04ac\u04a4\u04ab\u04ad\u04ba\u04f5", "\u0147\u015c\u0160\u0147\u0141\u015a\u015d\u0154\u010f\u010d\u011b\u011a\u017f\u0159\u0152\u0145\u0152\u011c\u015f\u0152\u015d\u0154\u011c\u0160\u0147\u0141\u015a\u015d\u0154\u0108", "\u0243\u0242\u0259\u0244\u024b\u0254\u0211\u0213\u0205\u0204\u027b", "\u02d1\u02d0\u02cb\u02d6\u02d9\u02c6\u02fe\u02d3\u02d3\u0283\u0281\u0297\u0296\u02e9", "\u023d\u022b\u0223\u023e\u0276\u0274\u0262\u0263\u021c", "\u0470\u0466\u046e\u0473\u043b\u0439\u042f\u044d\u042e\u0451", "\u00a6\u00b0\u00b8\u00a5\u00e1\u00ed\u00ef\u00f9\u009b\u00f8\u0087", "\u06b7\u06a1\u06a9\u06b4\u06fc\u06fe\u06e8\u068a\u0689\u06e9\u0696", "\u038d\u0382\u0385\u038a\u0387\u0382\u0391\u038e\u03d7\u03d5\u03c3\u03c2\u03bd"})
public final class Class3749 {
    public static float field8483;
    public static float field8484;
    public static double field8485;
    public static double field8486;
    public static float field8487;

    private static String sB3rjF3jLuLhtCAu(String a2, int b2) {
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
    private static CallSite IojVLvWnr92YPG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3749.sB3rjF3jLuLhtCAu(k2, 47321960));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3749.sB3rjF3jLuLhtCAu(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 1388 : 1389;
            block7: while (true) {
                switch (n3) {
                    case 1389: {
                        n3 = 1387;
                        continue block7;
                    }
                    case 1388: {
                        String c2 = Class3749.sB3rjF3jLuLhtCAu(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class3749.sB3rjF3jLuLhtCAu(k2, 47321960) + " " + l2 + " " + m2);
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
        x\u200e = "";
        L\u200e = "AntiRegear";
        field8486 = Double.longBitsToDouble(4602805569458802104L);
        field8483 = Float.intBitsToFloat(1057388112);
        aR\u200e = "Floor";
        field8485 = Double.longBitsToDouble(4606672385540016832L);
        field8484 = Float.intBitsToFloat(1033215584);
        field8487 = Float.intBitsToFloat(-1028390912);
    }
}

