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

@HACHIMI_CLIENT(mv=100, d1={"\ud7c3\ud7c6\ud7ce\ud7c3\ud7c1\ud7c2\ud7c6\ud7c1", "\u413c\u413f\u4138\u4139\u413b\u413f\u413c\u413f", "\udfb9\udfbc\udfb9\udfb8\udfbd\udfbe\udfb9\udfb3", "\u5083\u5087\u5084\u508b\u5083\u5086\u5082", "\u475e\u4753\u475e\u475d\u4759\u4752", "\u1f64\u1f66\u1f63\u1f65\u1f63\u1f63\u1f68\u1f65", "\u14ba\u14b8\u14bf\u14bb\u14b8\u14bd\u14ba", "\u51ac\u51ab\u51ae\u51a9\u51ae\u51ae\u51a9\u51aa", "\u302a\u302b\u302e\u3029\u302e\u302d\u302a\u3025", "\ub190\ub19a\ub192\ub191\ub195\ub190\ub194\ub196", "\u9a8e\u9a8f\u9a87\u9a81\u9a8e\u9a82\u9a82", "\u58de\u58de\u58d2\u58df\u58dd\u58dc\u58d3\u58dd", "\u55d7\u55d9\u55d1\u55d8\u55d4\u55d7\u55d2\u55d7", "\u1da4\u1da7\u1da4\u1da1\u1da4\u1da9\u1da4\u1da0", "\u5ace\u5ac0\u5ac1\u5ac1\u5ac8\u5aca\u5ac1\u5acc", "\u0382\u0385\u0385\u0382\u0384\u0380\u0386\u0383", "\u09af\u09a1\u09a8\u09aa\u09ac\u09af\u09af\u09ac", "\u10e9\u10eb\u10eb\u10ef\u10e8\u10ec\u10e8\u10ef", "\u3a60\u3a61\u3a67\u3a64\u3a60\u3a67\u3a6a\u3a65", "\u0686\u0684\u068a\u0686\u0683\u0685\u0684\u0685", "\u7a31\u7a32\u7a3f\u7a35\u7a32\u7a37\u7a3e", "\u695f\u695f\u695f\u695e\u695d\u695e\u695b\u6952"}, d2={"\u0169\u017c\u2134\u0106\u0104\u0112\u0176\u0150\u015b\u014c\u015b\u0115\u0156\u015b\u0154\u015d\u0115\u0169\u014e\u0148\u0153\u0154\u015d\u0101\u0113\u0176\u0150\u015b\u014c\u015b\u0115\u0156\u015b\u0154\u015d\u0115\u0169\u014e\u0148\u0153\u0154\u015d\u0101", "\u0601\u0615\u265c\u066e\u066c\u067a\u061e\u0638\u0633\u0624\u0633\u067d\u063e\u0633\u063c\u0635\u067d\u0601\u0626\u0620\u063b\u063c\u0635\u0669\u067b\u061e\u0638\u0633\u0624\u0633\u067d\u063e\u0633\u063c\u0635\u067d\u0601\u0626\u0620\u063b\u063c\u0635\u0669", "\u0125\u013e\u2178\u014a\u0148\u015e\u013a\u011c\u0117\u0100\u0117\u0159\u011a\u0117\u0118\u0111\u0159\u0125\u0102\u0104\u011f\u0118\u0111\u014d\u015f\u013a\u011c\u0117\u0100\u0117\u0159\u011a\u0117\u0118\u0111\u0159\u0125\u0102\u0104\u011f\u0118\u0111\u014d", "`z\u203d\u000f\r\u001b\u007fYRER\u001c_R]T\u001c`GAZ]T\b\u001a\u007fYRER\u001c_R]T\u001c`GAZ]T\b", "\u0520\u0539\u257d\u054f\u054d\u055b\u053f\u0519\u0512\u0505\u0512\u055c\u051f\u0512\u051d\u0514\u055c\u0520\u0507\u0501\u051a\u051d\u0514\u0548\u055a\u053f\u0519\u0512\u0505\u0512\u055c\u051f\u0512\u051d\u0514\u055c\u0520\u0507\u0501\u051a\u051d\u0514\u0548", "\u00a2\u00ba\u20ff\u00cd\u00cf\u00d9\u00bd\u009b\u0090\u0087\u0090\u00de\u009d\u0090\u009f\u0096\u00de\u00a2\u0085\u0083\u0098\u009f\u0096\u00ca\u00d8\u00bd\u009b\u0090\u0087\u0090\u00de\u009d\u0090\u009f\u0096\u00de\u00a2\u0085\u0083\u0098\u009f\u0096\u00ca", "\u0615\u060a\u2648\u067a\u0678\u066e\u060a\u062c\u0627\u0630\u0627\u0669\u062a\u0627\u0628\u0621\u0669\u0615\u0632\u0634\u062f\u0628\u0621\u067d\u066f\u060a\u062c\u0627\u0630\u0627\u0669\u062a\u0627\u0628\u0621\u0669\u0615\u0632\u0634\u062f\u0628\u0621\u067d", "\u0680\u069e\u26dd\u06ef\u06ed\u06fb\u069f\u06b9\u06b2\u06a5\u06b2\u06fc\u06bf\u06b2\u06bd\u06b4\u06fc\u0680\u06a7\u06a1\u06ba\u06bd\u06b4\u06e8\u06fa\u069f\u06b9\u06b2\u06a5\u06b2\u06fc\u06bf\u06b2\u06bd\u06b4\u06fc\u0680\u06a7\u06a1\u06ba\u06bd\u06b4\u06e8", "\u04b9\u04e6\u04e9\u04ec\u04eb\u04ec\u04f1\u04bb\u04b9\u04bb\u04ad\u04ac\u04d3", "\u06b2\u06e7\u06e0\u06e7\u06fa\u06b0\u06b2\u06b0\u06a6\u06a7\u06d8", "\u03a4\u03a6\u03b7\u0380\u03af\u03a2\u03b0\u03b0\u03ff\u03fd\u03eb\u03ea\u038f\u03a9\u03a2\u03b5\u03a2\u03ec\u03af\u03a2\u03ad\u03a4\u03ec\u0380\u03af\u03a2\u03b0\u03b0\u03f8", "\u034b\u0342\u0350\u034b\u0360\u034c\u0347\u0346\u031f\u031d\u030b\u030a\u036a", "\u07b5\u07a1\u07a5\u07b1\u07bc\u07a3\u07ec\u07ee\u07f8\u079c\u07ba\u07b1\u07a6\u07b1\u07ff\u07bc\u07b1\u07be\u07b7\u07ff\u079f\u07b2\u07ba\u07b5\u07b3\u07a4\u07eb\u07f9\u078a", "\u00fe\u00f1\u00f2\u00f3\u00f8\u00a1\u00a3\u00b5\u00b4\u00d1\u00f7\u00fc\u00eb\u00fc\u00b2\u00f1\u00fc\u00f3\u00fa\u00b2\u00d2\u00ff\u00f7\u00f8\u00fe\u00e9\u00a6", "\u07a2\u07b9\u0785\u07a2\u07a4\u07bf\u07b8\u07b1\u07ea\u07e8\u07fe\u07ff\u079a\u07bc\u07b7\u07a0\u07b7\u07f9\u07ba\u07b7\u07b8\u07b1\u07f9\u0785\u07a2\u07a4\u07bf\u07b8\u07b1\u07ed", "\u030c\u030d\u0316\u030b\u0304\u031b\u035e\u035c\u034a\u034b\u0334", "\u02ef\u02ee\u02f5\u02e8\u02e7\u02f8\u02c0\u02ed\u02ed\u02bd\u02bf\u02a9\u02a8\u02d7", "\u0629\u063f\u0637\u062a\u0662\u0660\u0676\u0677\u0608", "\u0749\u075f\u0757\u074a\u0702\u0700\u0716\u0774\u0717\u0768", "\u01f2\u01e4\u01ec\u01f1\u01b5\u01b9\u01bb\u01ad\u01cf\u01ac\u01d3", "\u0129\u013f\u0137\u012a\u0162\u0160\u0176\u0114\u0117\u0177\u0108", "\u015a\u0155\u0152\u015d\u0150\u0155\u0146\u0159\u0100\u0102\u0114\u0115\u016a"})
public final class Class3290 {
    public static int field7080 = 1375655309;
    public static float field7081;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite o9jFV1CMn4jqSn(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3290.hwWy3c6tP7HQvUiW(k2, 1720817754));
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
                int a2 = Integer.parseInt(Class3290.hwWy3c6tP7HQvUiW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 58176 : 58177;
            block7: while (true) {
                switch (n3) {
                    case 58177: {
                        n3 = 58175;
                        continue block7;
                    }
                    case 58176: {
                        String c2 = Class3290.hwWy3c6tP7HQvUiW(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class3290.hwWy3c6tP7HQvUiW(k2, 1720817754) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        C\u200e = "ScrollSpeed";
        F\u200e = "value";
        N\u200e = "application/json";
        field7081 = Float.intBitsToFloat(1035590456);
        ax\u200e = "Mode";
        aU\u200e = "The maximum time for a given position";
        bd\u200e = "Render shaders on friends";
        br\u200e = "multiplayer";
        bQ\u200e = "All";
    }

    private static String hwWy3c6tP7HQvUiW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

