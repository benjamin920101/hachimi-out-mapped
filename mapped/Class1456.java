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

@HACHIMI_CLIENT(mv=100, d1={"\u9c5d\u9c5e\u9c5c\u9c5b\u9c5c\u9c59\u9c59\u9c54", "\u78f7\u78fa\u78f3\u78f7\u78fa\u78f7\u78f6\u78f4", "\u4a82\u4a83\u4a81\u4a83\u4a80\u4a80\u4a84\u4a83", "\u1f50\u1f5b\u1f57\u1f56\u1f5a\u1f51\u1f52\u1f54", "\u0c90\u0c9f\u0c96\u0c94\u0c9f\u0c9e\u0c96\u0c97", "\u1bd0\u1bd6\u1bd5\u1bd5\u1bde\u1bd5\u1bde\u1bd5", "\u5142\u5147\u5148\u5143\u5143\u5149\u5146\u5147", "\uced1\uced2\uced4\uced0\uced2\uced4\uced2\uced2", "\u581f\u581a\u581e\u581c\u581d\u5819\u581e\u5813", "\uda54\uda56\uda58\uda50\uda58\uda51\uda54\uda59", "\ucd5d\ucd5b\ucd5b\ucd55\ucd5b\ucd58\ucd5d", "\udb8c\udb80\udb81\udb8c\udb88\udb8d\udb8e\udb8e", "\ue44d\ue441\ue446\ue44c\ue444\ue440\ue443", "\u8fa9\u8fac\u8fa2\u8fad\u8fa3\u8fa2\u8fa2\u8fad", "\ud9ce\ud9c9\ud9cf\ud9cb\ud9cd\ud9c7\ud9c6", "\u9ad6\u9adc\u9ad3\u9ad0\u9ad2\u9ad5\u9ad6\u9ad2", "\u6ee2\u6ee3\u6ee1\u6ee6\u6eee\u6ee3\u6eef\u6ee5", "\uc5f2\uc5f2\uc5f4\uc5f0\uc5fe\uc5f7\uc5ff\uc5f3"}, d2={"\u078a\u07a8\u07b3\u27ea\u07d8\u07da\u07cc\u07a8\u078e\u0785\u0792\u0785\u07cb\u0788\u0785\u078a\u0783\u07cb\u07b7\u0790\u0796\u078d\u078a\u0783\u07df\u07cd\u07a8\u078e\u0785\u0792\u0785\u07cb\u0788\u0785\u078a\u0783\u07cb\u07b7\u0790\u0796\u078d\u078a\u0783\u07df", "\u01d0\u01f2\u01e6\u21b0\u0182\u0180\u0196\u01f2\u01d4\u01df\u01c8\u01df\u0191\u01d2\u01df\u01d0\u01d9\u0191\u01ed\u01ca\u01cc\u01d7\u01d0\u01d9\u0185\u0197\u01f2\u01d4\u01df\u01c8\u01df\u0191\u01d2\u01df\u01d0\u01d9\u0191\u01ed\u01ca\u01cc\u01d7\u01d0\u01d9\u0185", "\u0148\u016a\u017f\u2128\u011a\u0118\u010e\u016a\u014c\u0147\u0150\u0147\u0109\u014a\u0147\u0148\u0141\u0109\u0175\u0152\u0154\u014f\u0148\u0141\u011d\u010f\u016a\u014c\u0147\u0150\u0147\u0109\u014a\u0147\u0148\u0141\u0109\u0175\u0152\u0154\u014f\u0148\u0141\u011d", "\u0245\u0267\u0271\u2225\u0217\u0215\u0203\u0267\u0241\u024a\u025d\u024a\u0204\u0247\u024a\u0245\u024c\u0204\u0278\u025f\u0259\u0242\u0245\u024c\u0210\u0202\u0267\u0241\u024a\u025d\u024a\u0204\u0247\u024a\u0245\u024c\u0204\u0278\u025f\u0259\u0242\u0245\u024c\u0210", "\u033c\u0363\u036c\u0369\u036e\u0369\u0374\u033e\u033c\u033e\u0328\u0329\u0356", "\u02ab\u02fe\u02f9\u02fe\u02e3\u02a9\u02ab\u02a9\u02bf\u02be\u02c1", "\u05de\u05dc\u05cd\u05fa\u05d5\u05d8\u05ca\u05ca\u0585\u0587\u0591\u0590\u05f5\u05d3\u05d8\u05cf\u05d8\u0596\u05d5\u05d8\u05d7\u05de\u0596\u05fa\u05d5\u05d8\u05ca\u05ca\u0582", "\u0277\u027e\u026c\u0277\u025c\u0270\u027b\u027a\u0223\u0221\u0237\u0236\u0256", "\u0769\u077d\u0779\u076d\u0760\u077f\u0730\u0732\u0724\u0740\u0766\u076d\u077a\u076d\u0723\u0760\u076d\u0762\u076b\u0723\u0743\u076e\u0766\u0769\u076f\u0778\u0737\u0725\u0756", "\u02a0\u02af\u02ac\u02ad\u02a6\u02ff\u02fd\u02eb\u02ea\u028f\u02a9\u02a2\u02b5\u02a2\u02ec\u02af\u02a2\u02ad\u02a4\u02ec\u028c\u02a1\u02a9\u02a6\u02a0\u02b7\u02f8", "\u051f\u0504\u0538\u051f\u0519\u0502\u0505\u050c\u0557\u0555\u0543\u0542\u0527\u0501\u050a\u051d\u050a\u0544\u0507\u050a\u0505\u050c\u0544\u0538\u051f\u0519\u0502\u0505\u050c\u0550", "\u04b3\u04b2\u04a9\u04b4\u04bb\u04a4\u04e1\u04e3\u04f5\u04f4\u048b", "\u022e\u022f\u0234\u0229\u0226\u0239\u0201\u022c\u022c\u027c\u027e\u0268\u0269\u0216", "\u0160\u0176\u017e\u0163\u012b\u0129\u013f\u013e\u0141", "\u04b5\u04a3\u04ab\u04b6\u04fe\u04fc\u04ea\u0488\u04eb\u0494", "\u00f7\u00e1\u00e9\u00f4\u00b0\u00bc\u00be\u00a8\u00ca\u00a9\u00d6", "\u0241\u0257\u025f\u0242\u020a\u0208\u021e\u027c\u027f\u021f\u0260", "\u07bd\u07b2\u07b5\u07ba\u07b7\u07b2\u07a1\u07be\u07e7\u07e5\u07f3\u07f2\u078d"})
public final class Class1456 {
    public static double field5538;
    public static float field5539;
    public static float field5540;

    /*
     * WARNING - void declaration
     */
    private static CallSite gJ1rTh7rQwq7uv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1456.JnmhgNdDL5xbepFY(k2, 256530660));
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
                int a2 = Integer.parseInt(Class1456.JnmhgNdDL5xbepFY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1456.JnmhgNdDL5xbepFY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1456.JnmhgNdDL5xbepFY(k2, 256530660) + " " + l2 + " " + m2);
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
        b\u200e = "create/del/load";
        field5538 = Double.longBitsToDouble(4599951533433077042L);
        H\u200e = "2.3.67";
        field5539 = Float.intBitsToFloat(1043626040);
        field5540 = Float.intBitsToFloat(1060088545);
        aU\u200e = "dots";
        bh\u200e = "Width";
    }

    private static String JnmhgNdDL5xbepFY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

