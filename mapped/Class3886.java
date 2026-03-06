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

@HACHIMI_CLIENT(mv=100, d1={"\u7cc1\u7cc4\u7cc1\u7ccd\u7cc1\u7ccc\u7ccc\u7cc5", "\ub87b\ub878\ub87d\ub871\ub87e\ub87f\ub870\ub87e", "\u2fad\u2fa2\u2fad\u2fa8\u2faf\u2fa8\u2fa9\u2fab", "\ube9a\ube9c\ube9d\ube9b\ube9c\ube9f\ube9f\ube9e", "\u7463\u7465\u7468\u7468\u7463\u7460\u7469\u7460", "\u4c60\u4c60\u4c63\u4c63\u4c67\u4c63\u4c6a\u4c67", "\ub9e6\ub9e4\ub9ed\ub9e0\ub9e4\ub9e5\ub9e4\ub9e4", "\u7110\u7116\u7114\u7113\u7110\u7115\u7113\u7115", "\u010c\u010d\u0108\u0100\u010c\u0101\u010e\u0109", "\u8ea5\u8ea0\u8eaf\u8ea6\u8ea4\u8ea4\u8eae\u8ea3", "\u5fb2\u5fb9\u5fb5\u5fb2\u5fb9\u5fb6\u5fb0\u5fb5", "\u2808\u2801\u2806\u2809\u2805\u2809\u2807", "\u4bd2\u4bd2\u4bd3\u4bd7\u4bd0\u4bd3\u4bd3\u4bd6", "\uaff7\uaff4\uafff\uaff3\uaff0\uafff\uaff3", "\u5eb8\u5eb5\u5eb4\u5ebb\u5ebf\u5eb8\u5ebd\u5ebf", "\u453f\u453b\u4535\u453a\u453a\u4535\u4535\u4539"}, d2={"\u04a1\u04bd\u04ba\u24c1\u04f3\u04f1\u04e7\u0483\u04a5\u04ae\u04b9\u04ae\u04e0\u04a3\u04ae\u04a1\u04a8\u04e0\u049c\u04bb\u04bd\u04a6\u04a1\u04a8\u04f4\u04e6\u0483\u04a5\u04ae\u04b9\u04ae\u04e0\u04a3\u04ae\u04a1\u04a8\u04e0\u049c\u04bb\u04bd\u04a6\u04a1\u04a8\u04f4", "\u0131\u012d\u0129\u2151\u0163\u0161\u0177\u0113\u0135\u013e\u0129\u013e\u0170\u0133\u013e\u0131\u0138\u0170\u010c\u012b\u012d\u0136\u0131\u0138\u0164\u0176\u0113\u0135\u013e\u0129\u013e\u0170\u0133\u013e\u0131\u0138\u0170\u010c\u012b\u012d\u0136\u0131\u0138\u0164", "\u02af\u02f0\u02ff\u02fa\u02fd\u02fa\u02e7\u02ad\u02af\u02ad\u02bb\u02ba\u02c5", "\u0467\u0432\u0435\u0432\u042f\u0465\u0467\u0465\u0473\u0472\u040d", "\u012b\u0129\u0138\u010f\u0120\u012d\u013f\u013f\u0170\u0172\u0164\u0165\u0100\u0126\u012d\u013a\u012d\u0163\u0120\u012d\u0122\u012b\u0163\u010f\u0120\u012d\u013f\u013f\u0177", "\u0123\u012a\u0138\u0123\u0108\u0124\u012f\u012e\u0177\u0175\u0163\u0162\u0102", "\u0764\u0770\u0774\u0760\u076d\u0772\u073d\u073f\u0729\u074d\u076b\u0760\u0777\u0760\u072e\u076d\u0760\u076f\u0766\u072e\u074e\u0763\u076b\u0764\u0762\u0775\u073a\u0728\u075b", "\u0167\u0168\u016b\u016a\u0161\u0138\u013a\u012c\u012d\u0148\u016e\u0165\u0172\u0165\u012b\u0168\u0165\u016a\u0163\u012b\u014b\u0166\u016e\u0161\u0167\u0170\u013f", "\u03ed\u03f6\u03ca\u03ed\u03eb\u03f0\u03f7\u03fe\u03a5\u03a7\u03b1\u03b0\u03d5\u03f3\u03f8\u03ef\u03f8\u03b6\u03f5\u03f8\u03f7\u03fe\u03b6\u03ca\u03ed\u03eb\u03f0\u03f7\u03fe\u03a2", "}|gzuj/-;:E", "\u0719\u0718\u0703\u071e\u0711\u070e\u0736\u071b\u071b\u074b\u0749\u075f\u075e\u0721", "\u018f\u0199\u0191\u018c\u01c4\u01c6\u01d0\u01d1\u01ae", "\u032b\u033d\u0335\u0328\u0360\u0362\u0374\u0316\u0375\u030a", "\u078b\u079d\u0795\u0788\u07cc\u07c0\u07c2\u07d4\u07b6\u07d5\u07aa", "\u071e\u0708\u0700\u071d\u0755\u0757\u0741\u0723\u0720\u0740\u073f", "\u01ac\u01a3\u01a4\u01ab\u01a6\u01a3\u01b0\u01af\u01f6\u01f4\u01e2\u01e3\u019c"})
public final class Class3886 {
    public static float field8838 = Float.intBitsToFloat(1040382164);
    public static int field8839 = 931275686;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite QqhQd95nJ6E7ii(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3886.vOQtkJSb5WB2TfgN(k2, 789301717));
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
                int a2 = Integer.parseInt(Class3886.vOQtkJSb5WB2TfgN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3886.vOQtkJSb5WB2TfgN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class3886.vOQtkJSb5WB2TfgN(k2, 789301717) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 30726 : 30727;
        block7: while (true) {
            switch (n3) {
                case 30727: {
                    n3 = 30725;
                    continue block7;
                }
                case 30726: {
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
        aB\u200e = "DeathPoints";
        aZ\u200e = "Grim";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String vOQtkJSb5WB2TfgN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 23915 : 23914;
            block5: while (true) {
                switch (n2) {
                    case 23915: {
                        n2 = 23913;
                        continue block5;
                    }
                    case 23914: {
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
}

