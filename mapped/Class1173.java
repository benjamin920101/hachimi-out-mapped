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

@HACHIMI_CLIENT(mv=100, d1={"\u9597\u9594\u9595\u9590\u9590\u9590\u9596\u959f", "\u68cc\u68ce\u68c9\u68c0\u68cb\u68cd\u68cc\u68cf", "\u0139\u013d\u0132\u0139\u013b\u013b\u0138\u013a", "\ue77a\ue773\ue77f\ue77e\ue772\ue779\ue77a", "\u967c\u9678\u967f\u9676\u967a\u967e\u967e\u967f", "\u9a00\u9a01\u9a08\u9a08\u9a06\u9a08\u9a07\u9a00", "\ucf5e\ucf58\ucf58\ucf50\ucf5e\ucf5d\ucf5d\ucf5a", "\ua40d\ua409\ua40f\ua40b\ua40f\ua40d\ua409\ua40e", "\u8141\u814d\u8140\u8145\u8145\u8140\u8142\u814d", "\u11ce\u11cb\u11cb\u11cf\u11c2\u11ce\u11c2\u11c3", "\u6b6c\u6b63\u6b68\u6b63\u6b68\u6b68\u6b6d\u6b69", "\u8dfd\u8dfd\u8df9\u8dfd\u8dfd\u8dfc\u8df8", "\u620a\u6208\u620c\u620e\u6207\u6206\u6207\u620a", "\udd42\udd46\udd4b\udd40\udd4a\udd41\udd4a\udd45", "\u706b\u7061\u706c\u706d\u706d\u706c\u7061\u706c", "\u3f0d\u3f02\u3f03\u3f0c\u3f0d\u3f0e\u3f0f\u3f03"}, d2={"\u035e\u0375\u0341\u2336\u0304\u0306\u0310\u0374\u0352\u0359\u034e\u0359\u0317\u0354\u0359\u0356\u035f\u0317\u036b\u034c\u034a\u0351\u0356\u035f\u0303\u0311\u0374\u0352\u0359\u034e\u0359\u0317\u0354\u0359\u0356\u035f\u0317\u036b\u034c\u034a\u0351\u0356\u035f\u0303", "\u008f\u00a4\u0093\u20e7\u00d5\u00d7\u00c1\u00a5\u0083\u0088\u009f\u0088\u00c6\u0085\u0088\u0087\u008e\u00c6\u00ba\u009d\u009b\u0080\u0087\u008e\u00d2\u00c0\u00a5\u0083\u0088\u009f\u0088\u00c6\u0085\u0088\u0087\u008e\u00c6\u00ba\u009d\u009b\u0080\u0087\u008e\u00d2", "\u0204\u025b\u0254\u0251\u0256\u0251\u024c\u0206\u0204\u0206\u0210\u0211\u026e", "\u0017BEB_\u0015\u0017\u0015\u0003\u0002}", "\u01cd\u01cf\u01de\u01e9\u01c6\u01cb\u01d9\u01d9\u0196\u0194\u0182\u0183\u01e6\u01c0\u01cb\u01dc\u01cb\u0185\u01c6\u01cb\u01c4\u01cd\u0185\u01e9\u01c6\u01cb\u01d9\u01d9\u0191", "\u05c8\u05c1\u05d3\u05c8\u05e3\u05cf\u05c4\u05c5\u059c\u059e\u0588\u0589\u05e9", "\u0186\u0192\u0196\u0182\u018f\u0190\u01df\u01dd\u01cb\u01af\u0189\u0182\u0195\u0182\u01cc\u018f\u0182\u018d\u0184\u01cc\u01ac\u0181\u0189\u0186\u0180\u0197\u01d8\u01ca\u01b9", "\u04f3\u04fc\u04ff\u04fe\u04f5\u04ac\u04ae\u04b8\u04b9\u04dc\u04fa\u04f1\u04e6\u04f1\u04bf\u04fc\u04f1\u04fe\u04f7\u04bf\u04df\u04f2\u04fa\u04f5\u04f3\u04e4\u04ab", "\u0666\u067d\u0641\u0666\u0660\u067b\u067c\u0675\u062e\u062c\u063a\u063b\u065e\u0678\u0673\u0664\u0673\u063d\u067e\u0673\u067c\u0675\u063d\u0641\u0666\u0660\u067b\u067c\u0675\u0629", "\u051f\u051e\u0505\u0518\u0517\u0508\u054d\u054f\u0559\u0558\u0527", "\u018f\u018e\u0195\u0188\u0187\u0198\u01a0\u018d\u018d\u01dd\u01df\u01c9\u01c8\u01b7", "\u01b1\u01a7\u01af\u01b2\u01fa\u01f8\u01ee\u01ef\u0190", "\u03d4\u03c2\u03ca\u03d7\u039f\u039d\u038b\u03e9\u038a\u03f5", "\u00a5\u00b3\u00bb\u00a6\u00e2\u00ee\u00ec\u00fa\u0098\u00fb\u0084", "\u0471\u0467\u046f\u0472\u043a\u0438\u042e\u044c\u044f\u042f\u0450", "\u03e3\u03ec\u03eb\u03e4\u03e9\u03ec\u03ff\u03e0\u03b9\u03bb\u03ad\u03ac\u03d3"})
public final class Class1173 {
    public static float field4662;
    public static double field4663;

    private static String SSLuGtrYkRlZnYkw(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        j\u200e = "%s \u00a7f%s";
        field4663 = Double.longBitsToDouble(4599200319447655724L);
        field4662 = Float.intBitsToFloat(1055898664);
        bz\u200e = "Rotate";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite lOwjIVuOdITDYL(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1173.SSLuGtrYkRlZnYkw(k2, 1800150842));
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
                int a2 = Integer.parseInt(Class1173.SSLuGtrYkRlZnYkw(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 43328 : 43329;
            block7: while (true) {
                switch (n3) {
                    case 43329: {
                        n3 = 43327;
                        continue block7;
                    }
                    case 43328: {
                        String c2 = Class1173.SSLuGtrYkRlZnYkw(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class1173.SSLuGtrYkRlZnYkw(k2, 1800150842) + " " + l2 + " " + m2);
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

