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

@HACHIMI_CLIENT(mv=100, d1={"\ua7e7\ua7e4\ua7e4\ua7e0\ua7e0\ua7e3\ua7e3\ua7e0", "\ub026\ub027\ub020\ub025\ub022\ub023\ub026\ub02a", "\u6281\u6283\u6280\u6286\u6283\u6280\u6284", "\ua947\ua94b\ua942\ua943\ua946\ua94b\ua944\ua94b", "\ua8c9\ua8cb\ua8c9\ua8cd\ua8c9\ua8cb\ua8ca\ua8c9", "\u79be\u79bd\u79bd\u79b9\u79ba\u79bd\u79bd", "\u7f38\u7f39\u7f3a\u7f3b\u7f3f\u7f3e\u7f3b\u7f3e", "\ue358\ue35f\ue359\ue35c\ue353\ue353\ue35e\ue359", "\u0b4d\u0b4d\u0b4c\u0b46\u0b49\u0b4c\u0b48\u0b4a", "\u6ae0\u6aea\u6ae0\u6ae4\u6ae7\u6ae0\u6ae7", "\ubf86\ubf8d\ubf80\ubf8d\ubf87\ubf81\ubf80\ubf83", "\u4cab\u4cac\u4caa\u4ca8\u4cad\u4cab\u4caa\u4cae", "\u3259\u3259\u325e\u3259\u325e\u325f\u325e\u3258", "\ubef2\ubef7\ubef2\ubef0\ubef8\ubef1\ubef5\ubef7", "\u819c\u8199\u819a\u819c\u819e\u819e\u819b\u819e", "\u941b\u9419\u9418\u941e\u9415\u941c\u941b\u9419", "\u57ca\u57c8\u57ce\u57cf\u57ca\u57c2\u57cd\u57c9", "\ua00a\ua008\ua00c\ua006\ua00b\ua00b\ua00e\ua00b"}, d2={"\u0636\u0633\u0631\u2648\u067a\u0678\u066e\u060a\u062c\u0627\u0630\u0627\u0669\u062a\u0627\u0628\u0621\u0669\u0615\u0632\u0634\u062f\u0628\u0621\u067d\u066f\u060a\u062c\u0627\u0630\u0627\u0669\u062a\u0627\u0628\u0621\u0669\u0615\u0632\u0634\u062f\u0628\u0621\u067d", "\u0358\u035d\u0350\u2326\u0314\u0316\u0300\u0364\u0342\u0349\u035e\u0349\u0307\u0344\u0349\u0346\u034f\u0307\u037b\u035c\u035a\u0341\u0346\u034f\u0313\u0301\u0364\u0342\u0349\u035e\u0349\u0307\u0344\u0349\u0346\u034f\u0307\u037b\u035c\u035a\u0341\u0346\u034f\u0313", "\u011a\u011f\u0113\u2164\u0156\u0154\u0142\u0126\u0100\u010b\u011c\u010b\u0145\u0106\u010b\u0104\u010d\u0145\u0139\u011e\u0118\u0103\u0104\u010d\u0151\u0143\u0126\u0100\u010b\u011c\u010b\u0145\u0106\u010b\u0104\u010d\u0145\u0139\u011e\u0118\u0103\u0104\u010d\u0151", "\u0706\u0703\u070c\u2778\u074a\u0748\u075e\u073a\u071c\u0717\u0700\u0717\u0759\u071a\u0717\u0718\u0711\u0759\u0725\u0702\u0704\u071f\u0718\u0711\u074d\u075f\u073a\u071c\u0717\u0700\u0717\u0759\u071a\u0717\u0718\u0711\u0759\u0725\u0702\u0704\u071f\u0718\u0711\u074d", "\u075a\u0705\u070a\u070f\u0708\u070f\u0712\u0758\u075a\u0758\u074e\u074f\u0730", "\u02db\u028e\u0289\u028e\u0293\u02d9\u02db\u02d9\u02cf\u02ce\u02b1", "\u0184\u0186\u0197\u01a0\u018f\u0182\u0190\u0190\u01df\u01dd\u01cb\u01ca\u01af\u0189\u0182\u0195\u0182\u01cc\u018f\u0182\u018d\u0184\u01cc\u01a0\u018f\u0182\u0190\u0190\u01d8", "\u0290\u0299\u028b\u0290\u02bb\u0297\u029c\u029d\u02c4\u02c6\u02d0\u02d1\u02b1", "\u03d0\u03c4\u03c0\u03d4\u03d9\u03c6\u0389\u038b\u039d\u03f9\u03df\u03d4\u03c3\u03d4\u039a\u03d9\u03d4\u03db\u03d2\u039a\u03fa\u03d7\u03df\u03d0\u03d6\u03c1\u038e\u039c\u03ef", "\u0776\u0779\u077a\u077b\u0770\u0729\u072b\u073d\u073c\u0759\u077f\u0774\u0763\u0774\u073a\u0779\u0774\u077b\u0772\u073a\u075a\u0777\u077f\u0770\u0776\u0761\u072e", "\u043c\u0427\u041b\u043c\u043a\u0421\u0426\u042f\u0474\u0476\u0460\u0461\u0404\u0422\u0429\u043e\u0429\u0467\u0424\u0429\u0426\u042f\u0467\u041b\u043c\u043a\u0421\u0426\u042f\u0473", "\u06c2\u06c3\u06d8\u06c5\u06ca\u06d5\u0690\u0692\u0684\u0685\u06fa", "\u0349\u0348\u0353\u034e\u0341\u035e\u0366\u034b\u034b\u031b\u0319\u030f\u030e\u0371", "\u07f8\u07ee\u07e6\u07fb\u07b3\u07b1\u07a7\u07a6\u07d9", "\u0332\u0324\u032c\u0331\u0379\u037b\u036d\u030f\u036c\u0313", "\u0270\u0266\u026e\u0273\u0237\u023b\u0239\u022f\u024d\u022e\u0251", "\u0404\u0412\u041a\u0407\u044f\u044d\u045b\u0439\u043a\u045a\u0425", "\u035e\u0351\u0356\u0359\u0354\u0351\u0342\u035d\u0304\u0306\u0310\u0311\u036e"})
public final class Class3736 {
    public static float field8439;
    public static double field8440;
    public static float field8441;
    public static float field8442 = 0.35944617f;
    public static float field8443;

    static {
        field8440 = Double.longBitsToDouble(4599192330255501664L);
        field8443 = Float.intBitsToFloat(1048715382);
        Y\u200e = "Full";
        field8441 = Float.intBitsToFloat(1058146958);
        ar\u200e = "Fix your head";
        field8439 = Float.intBitsToFloat(1061699415);
        aI\u200e = "Checks the 2b2t queue";
        bx\u200e = "glow";
    }

    private static String Cq7wiRdVAjgbGvbF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Wx9b1aarrdFafQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3736.Cq7wiRdVAjgbGvbF(k2, 1623944039));
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
                int a2 = Integer.parseInt(Class3736.Cq7wiRdVAjgbGvbF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3736.Cq7wiRdVAjgbGvbF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3736.Cq7wiRdVAjgbGvbF(k2, 1623944039) + " " + l2 + " " + m2);
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

