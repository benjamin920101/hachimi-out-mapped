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

@HACHIMI_CLIENT(mv=100, d1={"\u07f3\u07f7\u07fd\u07fc\u07f1\u07f4\u07fd\u07f4", "\u3de1\u3de6\u3de5\u3dee\u3dee\u3dee\u3def\u3de3", "\u384a\u3849\u384c\u384e\u3842\u384d\u384e\u384c", "\u8cb3\u8cb5\u8cb6\u8cb5\u8cb2\u8cb3\u8cb0\u8cb2", "\u1685\u1687\u1680\u1684\u1685\u1685\u1683", "\u632f\u6326\u6327\u6328\u632a\u632b\u632e\u632e", "\u6f73\u6f7e\u6f71\u6f73\u6f77\u6f70\u6f7e\u6f7e", "\ub2a1\ub2a4\ub2a4\ub2aa\ub2aa\ub2a1\ub2a4\ub2a4", "\u0ba5\u0bae\u0ba6\u0ba5\u0ba1\u0ba4\u0ba3\u0ba7", "\u39df\u39df\u39d8\u39dc\u39d6\u39da\u39da\u39db", "\u8156\u8154\u8158\u8157\u8159\u8157\u8151", "\uc989\uc98a\uc98c\uc98b\uc981\uc98c\uc981\uc98e", "\u61df\u61da\u61d9\u61da\u61df\u61da\u61de\u61d8", "\u7a11\u7a1b\u7a13\u7a14\u7a12\u7a10\u7a13\u7a17"}, d2={"\u0662\u063d\u0632\u0637\u0630\u0637\u062a\u0660\u0662\u0660\u0676\u0677\u0608", ".{|{f,.,:;D", "\u07ef\u07ed\u07fc\u07cb\u07e4\u07e9\u07fb\u07fb\u07b4\u07b6\u07a0\u07a1\u07c4\u07e2\u07e9\u07fe\u07e9\u07a7\u07e4\u07e9\u07e6\u07ef\u07a7\u07cb\u07e4\u07e9\u07fb\u07fb\u07b3", "\u034a\u0343\u0351\u034a\u0361\u034d\u0346\u0347\u031e\u031c\u030a\u030b\u036b", "\u0774\u0760\u0764\u0770\u077d\u0762\u072d\u072f\u0739\u075d\u077b\u0770\u0767\u0770\u073e\u077d\u0770\u077f\u0776\u073e\u075e\u0773\u077b\u0774\u0772\u0765\u072a\u0738\u074b", "\u010d\u0102\u0101\u0100\u010b\u0152\u0150\u0146\u0147\u0122\u0104\u010f\u0118\u010f\u0141\u0102\u010f\u0100\u0109\u0141\u0121\u010c\u0104\u010b\u010d\u011a\u0155", "\u02bb\u02a0\u029c\u02bb\u02bd\u02a6\u02a1\u02a8\u02f3\u02f1\u02e7\u02e6\u0283\u02a5\u02ae\u02b9\u02ae\u02e0\u02a3\u02ae\u02a1\u02a8\u02e0\u029c\u02bb\u02bd\u02a6\u02a1\u02a8\u02f4", "\u023a\u023b\u0220\u023d\u0232\u022d\u0268\u026a\u027c\u027d\u0202", "\u0656\u0657\u064c\u0651\u065e\u0641\u0679\u0654\u0654\u0604\u0606\u0610\u0611\u066e", "\u03d9\u03cf\u03c7\u03da\u0392\u0390\u0386\u0387\u03f8", "\u0236\u0220\u0228\u0235\u027d\u027f\u0269\u020b\u0268\u0217", "\u04de\u04c8\u04c0\u04dd\u0499\u0495\u0497\u0481\u04e3\u0480\u04ff", "\u03b6\u03a0\u03a8\u03b5\u03fd\u03ff\u03e9\u038b\u0388\u03e8\u0397", "\\ST[VS@_\u0006\u0004\u0012\u0013l"})
public final class Class5654 {
    public static int field10833 = -1762310651;
    public static int field10834 = 1446784177;
    public static float field10835;
    public static float field10836;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite GMEmmqkbmVGgHz(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5654.roICz3JNSgmTogwj(k2, -1680754143));
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
                int a2 = Integer.parseInt(Class5654.roICz3JNSgmTogwj(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5654.roICz3JNSgmTogwj(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 62534 : 62535;
        block7: while (true) {
            switch (n3) {
                case 62535: {
                    n3 = 62533;
                    continue block7;
                }
                case 62534: {
                    throw new Exception("Can't find method in " + Class5654.roICz3JNSgmTogwj(k2, -1680754143) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String roICz3JNSgmTogwj(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field10836 = Float.intBitsToFloat(1061629043);
        field10835 = Float.intBitsToFloat(1062840563);
    }
}

