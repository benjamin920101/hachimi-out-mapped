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
@HACHIMI_CLIENT(mv=100, d1={"\u894c\u8940\u894d\u894e\u894a\u8949\u894e\u8940", "\u4a49\u4a4f\u4a49\u4a43\u4a4f\u4a43\u4a48\u4a4e", "\u3794\u3795\u3793\u379f\u379e\u379e\u3797\u379e", "\u4435\u4431\u4438\u4432\u4432\u4431\u4437\u4439", "\udfaf\udfae\udfa5\udfa5\udfae\udfae\udfaa\udfa9", "\ub03e\ub03c\ub03a\ub035\ub035\ub034\ub038\ub03d", "\ud15a\ud159\ud15d\ud159\ud15b\ud15a\ud158\ud153", "\u5ac1\u5ac7\u5ac7\u5ac6\u5ac3\u5ac0\u5acf", "\u54a5\u54a8\u54a7\u54a2\u54a3\u54a7\u54a2\u54a1", "\ub586\ub58c\ub587\ub586\ub580\ub585\ub587\ub586", "\ub557\ub551\ub555\ub554\ub554\ub55a\ub556\ub55a", "\u4cda\u4cdf\u4cd8\u4cdb\u4cde\u4cde\u4cdd\u4cd9", "\uc60f\uc60d\uc60c\uc60f\uc608\uc60f\uc608\uc60e", "\ud8df\ud8d2\ud8da\ud8da\ud8de\ud8de\ud8d3\ud8db", "\u8c50\u8c53\u8c52\u8c5c\u8c55\u8c51\u8c50\u8c54", "\u55b6\u55b6\u55b2\u55b6\u55b4\u55b4\u55b0\u55b0", "\ue403\ue408\ue409\ue402\ue407\ue408\ue400\ue406"}, d2={"\u0724\u073a\u0730\u2747\u0775\u0777\u0761\u0705\u0723\u0728\u073f\u0728\u0766\u0725\u0728\u0727\u072e\u0766\u071a\u073d\u073b\u0720\u0727\u072e\u0772\u0760\u0705\u0723\u0728\u073f\u0728\u0766\u0725\u0728\u0727\u072e\u0766\u071a\u073d\u073b\u0720\u0727\u072e\u0772", "\u0606\u0618\u0611\u2665\u0657\u0655\u0643\u0627\u0601\u060a\u061d\u060a\u0644\u0607\u060a\u0605\u060c\u0644\u0638\u061f\u0619\u0602\u0605\u060c\u0650\u0642\u0627\u0601\u060a\u061d\u060a\u0644\u0607\u060a\u0605\u060c\u0644\u0638\u061f\u0619\u0602\u0605\u060c\u0650", "\u0536\u0528\u051a\u2555\u0567\u0565\u0573\u0517\u0531\u053a\u052d\u053a\u0574\u0537\u053a\u0535\u053c\u0574\u0508\u052f\u0529\u0532\u0535\u053c\u0560\u0572\u0517\u0531\u053a\u052d\u053a\u0574\u0537\u053a\u0535\u053c\u0574\u0508\u052f\u0529\u0532\u0535\u053c\u0560", "\u01fb\u01a4\u01ab\u01ae\u01a9\u01ae\u01b3\u01f9\u01fb\u01f9\u01ef\u01ee\u0191", "\u0100\u0155\u0152\u0155\u0148\u0102\u0100\u0102\u0114\u0115\u016a", "\u00eb\u00e9\u00f8\u00cf\u00e0\u00ed\u00ff\u00ff\u00b0\u00b2\u00a4\u00a5\u00c0\u00e6\u00ed\u00fa\u00ed\u00a3\u00e0\u00ed\u00e2\u00eb\u00a3\u00cf\u00e0\u00ed\u00ff\u00ff\u00b7", "\u03aa\u03a3\u03b1\u03aa\u0381\u03ad\u03a6\u03a7\u03fe\u03fc\u03ea\u03eb\u038b", "\u0679\u066d\u0669\u067d\u0670\u066f\u0620\u0622\u0634\u0650\u0676\u067d\u066a\u067d\u0633\u0670\u067d\u0672\u067b\u0633\u0653\u067e\u0676\u0679\u067f\u0668\u0627\u0635\u0646", "\u041c\u0413\u0410\u0411\u041a\u0443\u0441\u0457\u0456\u0433\u0415\u041e\u0409\u041e\u0450\u0413\u041e\u0411\u0418\u0450\u0430\u041d\u0415\u041a\u041c\u040b\u0444", "\u06fb\u06e0\u06dc\u06fb\u06fd\u06e6\u06e1\u06e8\u06b3\u06b1\u06a7\u06a6\u06c3\u06e5\u06ee\u06f9\u06ee\u06a0\u06e3\u06ee\u06e1\u06e8\u06a0\u06dc\u06fb\u06fd\u06e6\u06e1\u06e8\u06b4", "\u044c\u044d\u0456\u044b\u0444\u045b\u041e\u041c\u040a\u040b\u0474", "\u01e5\u01e4\u01ff\u01e2\u01ed\u01f2\u01ca\u01e7\u01e7\u01b7\u01b5\u01a3\u01a2\u01dd", "\u046f\u0479\u0471\u046c\u0424\u0426\u0430\u0431\u044e", "\u031b\u030d\u0305\u0318\u0350\u0352\u0344\u0326\u0345\u033a", "\u0182\u0194\u019c\u0181\u01c5\u01c9\u01cb\u01dd\u01bf\u01dc\u01a3", "\u008b\u009d\u0095\u0088\u00c0\u00c2\u00d4\u00b6\u00b5\u00d5\u00aa", "\u00b8\u00b7\u00b0\u00bf\u00b2\u00b7\u00a4\u00bb\u00e2\u00e0\u00f6\u00f7\u0088"})
public final class Class3334 {
    public static double field7193;
    public static double field7194;
    public static float field7195 = 0.08982086f;
    public static float field7196;
    public static int field7197 = 798467885;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite nyrQAlNBFJLLWQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3334.4DfOCFkC6ToBpLgR(k2, -1349877949));
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
                int a2 = Integer.parseInt(Class3334.4DfOCFkC6ToBpLgR(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 49631 : 49632;
            block7: while (true) {
                switch (n3) {
                    case 49632: {
                        n3 = 49630;
                        continue block7;
                    }
                    case 49631: {
                        String c2 = Class3334.4DfOCFkC6ToBpLgR(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class3334.4DfOCFkC6ToBpLgR(k2, -1349877949) + " " + l2 + " " + m2);
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
        field7196 = Float.intBitsToFloat(1092616192);
        field7193 = Double.longBitsToDouble(4607083683036595980L);
        q\u200e = "InventoryManager";
        ai\u200e = "The item steal delay";
        aQ\u200e = "vanish";
        field7194 = Double.longBitsToDouble(4605491146621373138L);
    }

    private static String 4DfOCFkC6ToBpLgR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

