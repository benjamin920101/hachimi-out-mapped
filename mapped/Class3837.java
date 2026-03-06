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

@HACHIMI_CLIENT(mv=100, d1={"\ue76a\ue760\ue76f\ue768\ue76e\ue769\ue76c\ue769", "\u7bf3\u7bf1\u7bf6\u7bf3\u7bfb\u7bf1\u7bf4", "\u3c2a\u3c28\u3c27\u3c2a\u3c28\u3c2d\u3c2e\u3c28", "\u15f4\u15f3\u15f0\u15f0\u15f6\u15f8\u15f5\u15f5", "\u3e39\u3e3e\u3e3e\u3e31\u3e39\u3e30\u3e3c\u3e38", "\u819b\u819d\u819d\u819b\u819b\u819b\u8198\u819e", "\u2aa1\u2aac\u2aac\u2aa2\u2aac\u2aa7\u2aa7\u2aa1", "\udcf7\udcf6\udcfb\udcf4\udcfa\udcf2\udcf4\udcfa", "\u6400\u6404\u6407\u640f\u6403\u640e\u6404", "\uda17\uda11\uda15\uda1d\uda10\uda10\uda13\uda10", "\u3896\u3895\u389b\u3897\u3895\u389a\u389a\u3891", "\u6683\u6687\u6680\u6683\u6684\u6684\u6681\u6686", "\udde8\udde0\udde8\udde8\uddec\udde9\uddea\uddea", "\uc8d3\uc8d4\uc8db\uc8d4\uc8d7\uc8d4\uc8d3\uc8d6"}, d2={"\u0541\u051e\u0511\u0514\u0513\u0514\u0509\u0543\u0541\u0543\u0555\u0554\u052b", "\u011f\u014a\u014d\u014a\u0157\u011d\u011f\u011d\u010b\u010a\u0175", "\u056a\u0568\u0579\u054e\u0561\u056c\u057e\u057e\u0531\u0533\u0525\u0524\u0541\u0567\u056c\u057b\u056c\u0522\u0561\u056c\u0563\u056a\u0522\u054e\u0561\u056c\u057e\u057e\u0536", "\u04b5\u04bc\u04ae\u04b5\u049e\u04b2\u04b9\u04b8\u04e1\u04e3\u04f5\u04f4\u0494", "\u049a\u048e\u048a\u049e\u0493\u048c\u04c3\u04c1\u04d7\u04b3\u0495\u049e\u0489\u049e\u04d0\u0493\u049e\u0491\u0498\u04d0\u04b0\u049d\u0495\u049a\u049c\u048b\u04c4\u04d6\u04a5", "\u035f\u0350\u0353\u0352\u0359\u0300\u0302\u0314\u0315\u0370\u0356\u035d\u034a\u035d\u0313\u0350\u035d\u0352\u035b\u0313\u0373\u035e\u0356\u0359\u035f\u0348\u0307", "\u0265\u027e\u0242\u0265\u0263\u0278\u027f\u0276\u022d\u022f\u0239\u0238\u025d\u027b\u0270\u0267\u0270\u023e\u027d\u0270\u027f\u0276\u023e\u0242\u0265\u0263\u0278\u027f\u0276\u022a", "\u07f9\u07f8\u07e3\u07fe\u07f1\u07ee\u07ab\u07a9\u07bf\u07be\u07c1", "\u026d\u026c\u0277\u026a\u0265\u027a\u0242\u026f\u026f\u023f\u023d\u022b\u022a\u0255", "0&.3{yon\u0011", "\u015c\u014a\u0142\u015f\u0117\u0115\u0103\u0161\u0102\u017d", "\u0364\u0372\u037a\u0367\u0323\u032f\u032d\u033b\u0359\u033a\u0345", "\u0014\u0002\n\u0017_]K)*J5", "\u00d5\u00da\u00dd\u00d2\u00df\u00da\u00c9\u00d6\u008f\u008d\u009b\u009a\u00e5"})
public final class Class3837 {
    public static float field8697;
    public static int field8698 = 788401403;
    public static float field8699;
    public static double field8700;
    public static int field8701 = 890763784;
    public static float field8702;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite wfDnF2ZdHOq2i2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3837.LNvQMX7lT7K2D73e(k2, 1408950890));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 57458 : 57459;
        block10: while (true) {
            switch (n3) {
                case 57459: {
                    n3 = 57457;
                    continue block10;
                }
                case 57458: {
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
                int a2 = Integer.parseInt(Class3837.LNvQMX7lT7K2D73e(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3837.LNvQMX7lT7K2D73e(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3837.LNvQMX7lT7K2D73e(k2, 1408950890) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n4 = n2 != 1 ? 55235 : 55234;
        block12: while (true) {
            switch (n4) {
                case 55235: {
                    n4 = 55233;
                    continue block12;
                }
                case 55234: {
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
        field8700 = Double.longBitsToDouble(4576915619430486400L);
        field8697 = Float.intBitsToFloat(1058460324);
        field8702 = Float.intBitsToFloat(1030793760);
        field8699 = Float.intBitsToFloat(1054766408);
    }

    private static String LNvQMX7lT7K2D73e(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

