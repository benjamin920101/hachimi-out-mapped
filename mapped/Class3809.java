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

@HACHIMI_CLIENT(mv=100, d1={"\u66a1\u66a6\u66a5\u66a7\u66ac\u66a2\u66a7\u66a1", "\u9674\u9676\u9677\u9671\u9670\u9671\u9671\u967f", "\ub260\ub264\ub265\ub26b\ub266\ub265\ub264\ub266", "\u7de0\u7de6\u7de1\u7dee\u7de6\u7de5\u7de3\u7de2", "\ud044\ud040\ud045\ud046\ud041\ud04e\ud044\ud042", "\ub46c\ub46d\ub468\ub46f\ub465\ub46f\ub46d\ub468", "\u5944\u5945\u5942\u5943\u5940\u5944\u5943", "\u14ff\u14fe\u14fb\u14fd\u14fc\u14f8\u14fe\u14fd", "\ubb0d\ubb00\ubb0d\ubb0b\ubb0a\ubb01\ubb08\ubb0a", "\u9ee3\u9ee6\u9ee3\u9ee1\u9ee6\u9ee3\u9ee3", "\u6d5e\u6d55\u6d5f\u6d5f\u6d5c\u6d5c\u6d59\u6d5a", "\u45f9\u45fb\u45f8\u45fe\u45fc\u45f5\u45f5\u45fb", "\ud7eb\ud7ef\ud7e9\ud7ee\ud7ec\ud7ea\ud7e7\ud7ef", "\u5c06\u5c00\u5c02\u5c07\u5c00\u5c01\u5c07"}, d2={"\u0768\u0737\u0738\u073d\u073a\u073d\u0720\u076a\u0768\u076a\u077c\u077d\u0702", "\u01b5\u01e0\u01e7\u01e0\u01fd\u01b7\u01b5\u01b7\u01a1\u01a0\u01df", "\u0755\u0757\u0746\u0771\u075e\u0753\u0741\u0741\u070e\u070c\u071a\u071b\u077e\u0758\u0753\u0744\u0753\u071d\u075e\u0753\u075c\u0755\u071d\u0771\u075e\u0753\u0741\u0741\u0709", "\u0582\u058b\u0599\u0582\u05a9\u0585\u058e\u058f\u05d6\u05d4\u05c2\u05c3\u05a3", "\u00e4\u00f0\u00f4\u00e0\u00ed\u00f2\u00bd\u00bf\u00a9\u00cd\u00eb\u00e0\u00f7\u00e0\u00ae\u00ed\u00e0\u00ef\u00e6\u00ae\u00ce\u00e3\u00eb\u00e4\u00e2\u00f5\u00ba\u00a8\u00db", "\u0197\u0198\u019b\u019a\u0191\u01c8\u01ca\u01dc\u01dd\u01b8\u019e\u0195\u0182\u0195\u01db\u0198\u0195\u019a\u0193\u01db\u01bb\u0196\u019e\u0191\u0197\u0180\u01cf", "\u0302\u0319\u0325\u0302\u0304\u031f\u0318\u0311\u034a\u0348\u035e\u035f\u033a\u031c\u0317\u0300\u0317\u0359\u031a\u0317\u0318\u0311\u0359\u0325\u0302\u0304\u031f\u0318\u0311\u034d", "\u0335\u0334\u032f\u0332\u033d\u0322\u0367\u0365\u0373\u0372\u030d", "\u0341\u0340\u035b\u0346\u0349\u0356\u036e\u0343\u0343\u0313\u0311\u0307\u0306\u0379", "\u07d8\u07ce\u07c6\u07db\u0793\u0791\u0787\u0786\u07f9", "\u0595\u0583\u058b\u0596\u05de\u05dc\u05ca\u05a8\u05cb\u05b4", "\u0454\u0442\u044a\u0457\u0413\u041f\u041d\u040b\u0469\u040a\u0475", "\u045c\u044a\u0442\u045f\u0417\u0415\u0403\u0461\u0462\u0402\u047d", "\u018f\u0180\u0187\u0188\u0185\u0180\u0193\u018c\u01d5\u01d7\u01c1\u01c0\u01bf"})
public final class Class3809 {
    public static float field8613;
    public static float field8614;

    static {
        field8614 = Float.intBitsToFloat(1042734868);
        field8613 = Float.intBitsToFloat(1055998852);
    }

    private static String hdSNbijXK6krnJFf(String a2, int b2) {
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
    private static CallSite Eq9UgFIgA2Y9OO(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3809.hdSNbijXK6krnJFf(k2, -1218941104));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block2: while (true) {
            block9: {
                void e2;
                int n3 = f2 < q2.length ? 43604 : 43605;
                while (true) {
                    int n4;
                    if ((n4 = n3) == 43604) {
                        try {
                            int a2 = Integer.parseInt(Class3809.hdSNbijXK6krnJFf(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block9;
                        }
                    }
                    if (n4 != 43605) break block2;
                    n3 = 43603;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class3809.hdSNbijXK6krnJFf(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3809.hdSNbijXK6krnJFf(k2, -1218941104) + " " + l2 + " " + m2);
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

