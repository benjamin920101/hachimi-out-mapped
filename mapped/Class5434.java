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
@HACHIMI_CLIENT(mv=100, d1={"\ub4ef\ub4e5\ub4e8\ub4ed\ub4ef\ub4e8\ub4eb\ub4eb", "\uc214\uc219\uc217\uc217\uc219\uc217\uc219\uc211", "\ubc69\ubc6d\ubc6e\ubc6d\ubc6a\ubc69\ubc6d\ubc68", "\u7cd9\u7cdf\u7cdc\u7cde\u7cdd\u7cda\u7cdc\u7cde", "\udf35\udf3a\udf37\udf3b\udf32\udf37\udf35", "\u33c6\u33c0\u33c1\u33c1\u33c4\u33c3\u33cc\u33c0", "\u633b\u633e\u633c\u6336\u633f\u633a\u6338", "\u5066\u5064\u5064\u5060\u5062\u5061\u506a\u5065", "\ua153\ua151\ua151\ua156\ua153\ua15f\ua15e\ua154", "\ucf0a\ucf0a\ucf04\ucf08\ucf09\ucf0b\ucf0e", "\u9167\u9161\u9164\u9162\u916f\u9167\u9161\u916f", "\u6e55\u6e51\u6e50\u6e51\u6e57\u6e5b\u6e5b\u6e52", "\u9f0e\u9f0e\u9f07\u9f06\u9f0d\u9f09\u9f0e\u9f0f", "\u8f99\u8f99\u8f9f\u8f9a\u8f9d\u8f92\u8f9b\u8f98", "\ue58b\ue58e\ue58a\ue58c\ue585\ue588\ue588"}, d2={"\u03c1\u03d6\u03e7\u23a0\u0392\u0390\u0386\u03e2\u03c4\u03cf\u03d8\u03cf\u0381\u03c2\u03cf\u03c0\u03c9\u0381\u03fd\u03da\u03dc\u03c7\u03c0\u03c9\u0395\u0387\u03e2\u03c4\u03cf\u03d8\u03cf\u0381\u03c2\u03cf\u03c0\u03c9\u0381\u03fd\u03da\u03dc\u03c7\u03c0\u03c9\u0395", "\u0412\u044d\u0442\u0447\u0440\u0447\u045a\u0410\u0412\u0410\u0406\u0407\u0478", "\u0123\u0176\u0171\u0176\u016b\u0121\u0123\u0121\u0137\u0136\u0149", "\u019b\u0199\u0188\u01bf\u0190\u019d\u018f\u018f\u01c0\u01c2\u01d4\u01d5\u01b0\u0196\u019d\u018a\u019d\u01d3\u0190\u019d\u0192\u019b\u01d3\u01bf\u0190\u019d\u018f\u018f\u01c7", "\u03aa\u03a3\u03b1\u03aa\u0381\u03ad\u03a6\u03a7\u03fe\u03fc\u03ea\u03eb\u038b", "\u0365\u0371\u0375\u0361\u036c\u0373\u033c\u033e\u0328\u034c\u036a\u0361\u0376\u0361\u032f\u036c\u0361\u036e\u0367\u032f\u034f\u0362\u036a\u0365\u0363\u0374\u033b\u0329\u035a", "\u056a\u0565\u0566\u0567\u056c\u0535\u0537\u0521\u0520\u0545\u0563\u0568\u057f\u0568\u0526\u0565\u0568\u0567\u056e\u0526\u0546\u056b\u0563\u056c\u056a\u057d\u0532", "\u025b\u0240\u027c\u025b\u025d\u0246\u0241\u0248\u0213\u0211\u0207\u0206\u0263\u0245\u024e\u0259\u024e\u0200\u0243\u024e\u0241\u0248\u0200\u027c\u025b\u025d\u0246\u0241\u0248\u0214", "\u0106\u0107\u011c\u0101\u010e\u0111\u0154\u0156\u0140\u0141\u013e", "\u024d\u024c\u0257\u024a\u0245\u025a\u0262\u024f\u024f\u021f\u021d\u020b\u020a\u0275", "\u03dc\u03ca\u03c2\u03df\u0397\u0395\u0383\u0382\u03fd", "\u033d\u032b\u0323\u033e\u0376\u0374\u0362\u0300\u0363\u031c", "\u03f4\u03e2\u03ea\u03f7\u03b3\u03bf\u03bd\u03ab\u03c9\u03aa\u03d5", "\u00a1\u00b7\u00bf\u00a2\u00ea\u00e8\u00fe\u009c\u009f\u00ff\u0080", "\u03f1\u03fe\u03f9\u03f6\u03fb\u03fe\u03ed\u03f2\u03ab\u03a9\u03bf\u03be\u03c1"})
public final class Class5434 {
    public static float field10136;
    public static float field10137;
    public static double field10138;
    public static double field10139;
    public static float field10140;
    public static double field10141;

    /*
     * Enabled aggressive block sorting
     */
    private static String 1PL38X4gwbyHbXrn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 19759 : 19758;
            block5: while (true) {
                switch (n2) {
                    case 19759: {
                        n2 = 19757;
                        continue block5;
                    }
                    case 19758: {
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
    private static CallSite BWeIJBvDQtRMzV(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5434.1PL38X4gwbyHbXrn(k2, 1840701438));
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
                int a2 = Integer.parseInt(Class5434.1PL38X4gwbyHbXrn(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5434.1PL38X4gwbyHbXrn(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5434.1PL38X4gwbyHbXrn(k2, 1840701438) + " " + l2 + " " + m2);
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
        field10139 = Double.longBitsToDouble(4599158135898244364L);
        field10137 = Float.intBitsToFloat(1052711390);
        field10138 = Double.longBitsToDouble(4601454711158344308L);
        field10140 = Float.intBitsToFloat(1058090892);
        field10136 = Float.intBitsToFloat(1050293104);
        br\u200e = "SliderSpeed";
        field10141 = Double.longBitsToDouble(4596610603411865948L);
    }
}

