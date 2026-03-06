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
@HACHIMI_CLIENT(mv=100, d1={"\u80a2\u80a2\u80a1\u80a1\u80ac\u80a4\u80ac\u80a1", "\uc620\uc620\uc62b\uc62a\uc622\uc623\uc627\uc623", "\ua7b0\ua7b6\ua7ba\ua7b6\ua7b6\ua7b4\ua7b6\ua7b7", "\u2854\u285c\u2851\u285d\u2850\u2851\u285d\u2855", "\u1df8\u1df0\u1df1\u1dfd\u1df9\u1df8\u1df9\u1dff", "\u1884\u1888\u1883\u1887\u1884\u1884\u1882\u1887", "\u7150\u715b\u715b\u715a\u7154\u7153\u715b\u7155", "\u9856\u9853\u9851\u9855\u9853\u9857\u9854\u985a", "\u129a\u129c\u129f\u129e\u1290\u129d\u129b\u1299", "\u07da\u07d8\u07da\u07dc\u07db\u07df\u07d6\u07dc", "\u5c03\u5c06\u5c00\u5c05\u5c05\u5c05\u5c08\u5c05", "\ua864\ua861\ua864\ua860\ua865\ua86f\ua861\ua862", "\ud573\ud570\ud572\ud578\ud571\ud579\ud579", "\u9559\u955d\u9558\u955c\u955b\u9559\u955d\u955f"}, d2={"\u0003\\SVQVK\u0001\u0003\u0001\u0017\u0016i", "\u00f4\u00a1\u00a6\u00a1\u00bc\u00f6\u00f4\u00f6\u00e0\u00e1\u009e", "\u0194\u0196\u0187\u01b0\u019f\u0192\u0180\u0180\u01cf\u01cd\u01db\u01da\u01bf\u0199\u0192\u0185\u0192\u01dc\u019f\u0192\u019d\u0194\u01dc\u01b0\u019f\u0192\u0180\u0180\u01c8", "\u0572\u057b\u0569\u0572\u0559\u0575\u057e\u057f\u0526\u0524\u0532\u0533\u0553", "\u0632\u0626\u0622\u0636\u063b\u0624\u066b\u0669\u067f\u061b\u063d\u0636\u0621\u0636\u0678\u063b\u0636\u0639\u0630\u0678\u0618\u0635\u063d\u0632\u0634\u0623\u066c\u067e\u060d", "\u05f4\u05fb\u05f8\u05f9\u05f2\u05ab\u05a9\u05bf\u05be\u05db\u05fd\u05f6\u05e1\u05f6\u05b8\u05fb\u05f6\u05f9\u05f0\u05b8\u05d8\u05f5\u05fd\u05f2\u05f4\u05e3\u05ac", "\u02fe\u02e5\u02d9\u02fe\u02f8\u02e3\u02e4\u02ed\u02b6\u02b4\u02a2\u02a3\u02c6\u02e0\u02eb\u02fc\u02eb\u02a5\u02e6\u02eb\u02e4\u02ed\u02a5\u02d9\u02fe\u02f8\u02e3\u02e4\u02ed\u02b1", "\u023d\u023c\u0227\u023a\u0235\u022a\u026f\u026d\u027b\u027a\u0205", "\u03f5\u03f4\u03ef\u03f2\u03fd\u03e2\u03da\u03f7\u03f7\u03a7\u03a5\u03b3\u03b2\u03cd", "\u0777\u0761\u0769\u0774\u073c\u073e\u0728\u0729\u0756", "\u0324\u0332\u033a\u0327\u036f\u036d\u037b\u0319\u037a\u0305", "\u01f7\u01e1\u01e9\u01f4\u01b0\u01bc\u01be\u01a8\u01ca\u01a9\u01d6", "\u0222\u0234\u023c\u0221\u0269\u026b\u027d\u021f\u021c\u027c\u0203", "\u054b\u0544\u0543\u054c\u0541\u0544\u0557\u0548\u0511\u0513\u0505\u0504\u057b"})
public final class Class5522 {
    public static long field10436 = -5951568518880243851L;
    public static float field10437 = Float.intBitsToFloat(1107820544);

    private static String 0ldbPuMCmQ63dqfN(String a2, int b2) {
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
    private static CallSite GjV9sQ4RFuT4ih(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5522.0ldbPuMCmQ63dqfN(k2, 576214993));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5522.0ldbPuMCmQ63dqfN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5522.0ldbPuMCmQ63dqfN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 14745 : 14746;
        block7: while (true) {
            switch (n3) {
                case 14746: {
                    n3 = 14744;
                    continue block7;
                }
                case 14745: {
                    throw new Exception("Can't find method in " + Class5522.0ldbPuMCmQ63dqfN(k2, 576214993) + " " + l2 + " " + m2);
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
}

