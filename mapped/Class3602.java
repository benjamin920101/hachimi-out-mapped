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
@HACHIMI_CLIENT(mv=100, d1={"\ua47c\ua473\ua47e\ua478\ua47f\ua473\ua47c\ua479", "\ue02e\ue026\ue02e\ue028\ue02a\ue02e\ue028\ue02d", "\u10c4\u10c7\u10cd\u10c3\u10cd\u10c3\u10c0\u10c6", "\ud5df\ud5de\ud5da\ud5db\ud5d9\ud5de\ud5da\ud5de", "\u15f9\u15f4\u15f5\u15fc\u15fb\u15f8\u15f9\u15ff", "\uc74b\uc74f\uc74d\uc749\uc74a\uc74c\uc749\uc74f", "\u9e15\u9e11\u9e19\u9e17\u9e14\u9e11\u9e18\u9e14", "\u604c\u604a\u604b\u604c\u604b\u604e\u6049", "\u3fdc\u3fde\u3fde\u3fdb\u3fde\u3fd9\u3fd0\u3fdd", "\u60fb\u60f9\u60fc\u60fa\u60f9\u60fd\u60fd\u60fe", "\u9ec8\u9eca\u9ecd\u9ecb\u9ece\u9ec2\u9ecb\u9ec2", "\u6c1d\u6c1a\u6c14\u6c14\u6c1e\u6c1f\u6c1e\u6c1f", "\u1da4\u1da5\u1da2\u1da7\u1da0\u1da8\u1da8\u1da8", "\u2386\u2387\u2387\u2380\u2387\u2384\u238c", "\u5152\u5151\u5152\u5152\u5153\u5151\u5152\u5154"}, d2={"\u02e5\u02f3\u02ed\u2287\u02b5\u02b7\u02a1\u02c5\u02e3\u02e8\u02ff\u02e8\u02a6\u02e5\u02e8\u02e7\u02ee\u02a6\u02da\u02fd\u02fb\u02e0\u02e7\u02ee\u02b2\u02a0\u02c5\u02e3\u02e8\u02ff\u02e8\u02a6\u02e5\u02e8\u02e7\u02ee\u02a6\u02da\u02fd\u02fb\u02e0\u02e7\u02ee\u02b2", "\u07a2\u07fd\u07f2\u07f7\u07f0\u07f7\u07ea\u07a0\u07a2\u07a0\u07b6\u07b7\u07c8", "\u0232\u0267\u0260\u0267\u027a\u0230\u0232\u0230\u0226\u0227\u0258", "\u042d\u042f\u043e\u0409\u0426\u042b\u0439\u0439\u0476\u0474\u0462\u0463\u0406\u0420\u042b\u043c\u042b\u0465\u0426\u042b\u0424\u042d\u0465\u0409\u0426\u042b\u0439\u0439\u0471", "\u070b\u0702\u0710\u070b\u0720\u070c\u0707\u0706\u075f\u075d\u074b\u074a\u072a", "\u060f\u061b\u061f\u060b\u0606\u0619\u0656\u0654\u0642\u0626\u0600\u060b\u061c\u060b\u0645\u0606\u060b\u0604\u060d\u0645\u0625\u0608\u0600\u060f\u0609\u061e\u0651\u0643\u0630", "\u0187\u0188\u018b\u018a\u0181\u01d8\u01da\u01cc\u01cd\u01a8\u018e\u0185\u0192\u0185\u01cb\u0188\u0185\u018a\u0183\u01cb\u01ab\u0186\u018e\u0181\u0187\u0190\u01df", "\u0771\u076a\u0756\u0771\u0777\u076c\u076b\u0762\u0739\u073b\u072d\u072c\u0749\u076f\u0764\u0773\u0764\u072a\u0769\u0764\u076b\u0762\u072a\u0756\u0771\u0777\u076c\u076b\u0762\u073e", "\u0674\u0675\u066e\u0673\u067c\u0663\u0626\u0624\u0632\u0633\u064c", "\u02b3\u02b2\u02a9\u02b4\u02bb\u02a4\u029c\u02b1\u02b1\u02e1\u02e3\u02f5\u02f4\u028b", "\u0406\u0410\u0418\u0405\u044d\u044f\u0459\u0458\u0427", "\u02f3\u02e5\u02ed\u02f0\u02b8\u02ba\u02ac\u02ce\u02ad\u02d2", "\u06e2\u06f4\u06fc\u06e1\u06a5\u06a9\u06ab\u06bd\u06df\u06bc\u06c3", "\u008d\u009b\u0093\u008e\u00c6\u00c4\u00d2\u00b0\u00b3\u00d3\u00ac", "\u035a\u0355\u0352\u035d\u0350\u0355\u0346\u0359\u0300\u0302\u0314\u0315\u036a"})
public final class Class3602 {
    public static float field8037;
    public static double field8038;
    public static float field8039;
    public static float field8040;

    private static String 9orSvPIrrHaLtaDN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        I\u200e = "Logs PickFromInventoryC2SPacket";
        field8037 = Float.intBitsToFloat(1045484356);
        field8038 = Double.longBitsToDouble(4602437128014212608L);
        field8039 = Float.intBitsToFloat(1049385700);
        field8040 = Float.intBitsToFloat(1045442692);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 5ppuAHpB1dL7Nq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3602.9orSvPIrrHaLtaDN(k2, 708683468));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 60732 : 60733;
        block10: while (true) {
            switch (n3) {
                case 60733: {
                    n3 = 60731;
                    continue block10;
                }
                case 60732: {
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
                int a2 = Integer.parseInt(Class3602.9orSvPIrrHaLtaDN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3602.9orSvPIrrHaLtaDN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3602.9orSvPIrrHaLtaDN(k2, 708683468) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n4 = n2 != 1 ? 27988 : 27987;
        block12: while (true) {
            switch (n4) {
                case 27988: {
                    n4 = 27986;
                    continue block12;
                }
                case 27987: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

