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

@HACHIMI_CLIENT(mv=100, d1={"\u58e7\u58e0\u58e0\u58e6\u58e1\u58e7\u58e6\u58e8", "\ua19b\ua19c\ua19d\ua19e\ua19b\ua19b\ua19b\ua19d", "\u6fce\u6fc3\u6fc3\u6fc3\u6fcc\u6fc3\u6fc2\u6fc3", "\u9d28\u9d28\u9d23\u9d2b\u9d22\u9d2b\u9d28\u9d23", "\uc5af\uc5ae\uc5aa\uc5af\uc5ad\uc5ab\uc5ae\uc5a6", "\ub0f8\ub0fd\ub0fc\ub0f8\ub0f9\ub0f8\ub0fc\ub0fa", "\u3c08\u3c0e\u3c0e\u3c0a\u3c05\u3c09\u3c04\u3c0e", "\u65a4\u65a5\u65a6\u65a1\u65a2\u65a3\u65a0\u65a3", "\u5cb9\u5cb5\u5cb5\u5cb2\u5cb8\u5cb0\u5cb0", "\u2d2f\u2d2b\u2d23\u2d2b\u2d23\u2d2b\u2d22\u2d29", "\u2d90\u2d91\u2d9d\u2d93\u2d91\u2d93\u2d97", "\u288a\u288b\u2889\u288f\u2880\u2888\u2881\u288f", "\u738b\u738d\u738e\u738d\u7383\u7382\u7388\u738d", "\u3f50\u3f52\u3f50\u3f5e\u3f5e\u3f50\u3f57", "\uceef\uceee\ucee6\uceed\uceec\ucee9\ucee9\uceeb", "\ua1bb\ua1b9\ua1bc\ua1b8\ua1ba\ua1b9\ua1bf\ua1ba", "\u75ac\u75ae\u75aa\u75ac\u75aa\u75a8\u75a9\u75ab"}, d2={"\u06fc\u06c7\u06ec\u2691\u06a3\u06a1\u06b7\u06d3\u06f5\u06fe\u06e9\u06fe\u06b0\u06f3\u06fe\u06f1\u06f8\u06b0\u06cc\u06eb\u06ed\u06f6\u06f1\u06f8\u06a4\u06b6\u06d3\u06f5\u06fe\u06e9\u06fe\u06b0\u06f3\u06fe\u06f1\u06f8\u06b0\u06cc\u06eb\u06ed\u06f6\u06f1\u06f8\u06a4", "\u0596\u05ad\u0581\u25fb\u05c9\u05cb\u05dd\u05b9\u059f\u0594\u0583\u0594\u05da\u0599\u0594\u059b\u0592\u05da\u05a6\u0581\u0587\u059c\u059b\u0592\u05ce\u05dc\u05b9\u059f\u0594\u0583\u0594\u05da\u0599\u0594\u059b\u0592\u05da\u05a6\u0581\u0587\u059c\u059b\u0592\u05ce", "\u0415\u042e\u0403\u2478\u044a\u0448\u045e\u043a\u041c\u0417\u0400\u0417\u0459\u041a\u0417\u0418\u0411\u0459\u0425\u0402\u0404\u041f\u0418\u0411\u044d\u045f\u043a\u041c\u0417\u0400\u0417\u0459\u041a\u0417\u0418\u0411\u0459\u0425\u0402\u0404\u041f\u0418\u0411\u044d", "\u062f\u0670\u067f\u067a\u067d\u067a\u0667\u062d\u062f\u062d\u063b\u063a\u0645", "\u0319\u034c\u034b\u034c\u0351\u031b\u0319\u031b\u030d\u030c\u0373", "\u047b\u0479\u0468\u045f\u0470\u047d\u046f\u046f\u0420\u0422\u0434\u0435\u0450\u0476\u047d\u046a\u047d\u0433\u0470\u047d\u0472\u047b\u0433\u045f\u0470\u047d\u046f\u046f\u0427", "\u026f\u0266\u0274\u026f\u0244\u0268\u0263\u0262\u023b\u0239\u022f\u022e\u024e", "\u04db\u04cf\u04cb\u04df\u04d2\u04cd\u0482\u0480\u0496\u04f2\u04d4\u04df\u04c8\u04df\u0491\u04d2\u04df\u04d0\u04d9\u0491\u04f1\u04dc\u04d4\u04db\u04dd\u04ca\u0485\u0497\u04e4", "\u06eb\u06e4\u06e7\u06e6\u06ed\u06b4\u06b6\u06a0\u06a1\u06c4\u06e2\u06e9\u06fe\u06e9\u06a7\u06e4\u06e9\u06e6\u06ef\u06a7\u06c7\u06ea\u06e2\u06ed\u06eb\u06fc\u06b3", "\u07b2\u07a9\u0795\u07b2\u07b4\u07af\u07a8\u07a1\u07fa\u07f8\u07ee\u07ef\u078a\u07ac\u07a7\u07b0\u07a7\u07e9\u07aa\u07a7\u07a8\u07a1\u07e9\u0795\u07b2\u07b4\u07af\u07a8\u07a1\u07fd", "\u075c\u075d\u0746\u075b\u0754\u074b\u070e\u070c\u071a\u071b\u0764", "\u062d\u062c\u0637\u062a\u0625\u063a\u0602\u062f\u062f\u067f\u067d\u066b\u066a\u0615", "#5= hj|}\u0002", "\u028c\u029a\u0292\u028f\u02c7\u02c5\u02d3\u02b1\u02d2\u02ad", "\u06a7\u06b1\u06b9\u06a4\u06e0\u06ec\u06ee\u06f8\u069a\u06f9\u0686", "\u06b4\u06a2\u06aa\u06b7\u06ff\u06fd\u06eb\u0689\u068a\u06ea\u0695", "\u04ff\u04f0\u04f7\u04f8\u04f5\u04f0\u04e3\u04fc\u04a5\u04a7\u04b1\u04b0\u04cf"})
public final class Class4095 {
    public static int field9493 = 0;
    public static double field9494 = Double.longBitsToDouble(4605380978949069210L);

    static {
        ak\u200e = "\u00a7g";
        bq\u200e = "The maximum fall height";
        bB\u200e = "Whether or not to attack mobs with a name";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite NW6NhbkV37ecMn(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4095.pgfw0wyREgqmKw1d(k2, -149924271));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4095.pgfw0wyREgqmKw1d(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 41249 : 41250;
            block7: while (true) {
                switch (n3) {
                    case 41250: {
                        n3 = 41248;
                        continue block7;
                    }
                    case 41249: {
                        String c2 = Class4095.pgfw0wyREgqmKw1d(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class4095.pgfw0wyREgqmKw1d(k2, -149924271) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String pgfw0wyREgqmKw1d(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

