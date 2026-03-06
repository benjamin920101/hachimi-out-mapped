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

@HACHIMI_CLIENT(mv=100, d1={"\ue6d6\ue6d3\ue6d7\ue6d3\ue6d2\ue6d5\ue6d5\ue6da", "\u997b\u9978\u9976\u997b\u9978\u9978\u997c\u997a", "\ud0be\ud0bb\ud0bc\ud0bf\ud0be\ud0bb\ud0bc\ud0b5", "\ua84a\ua84a\ua849\ua84f\ua841\ua841", "\u2470\u247c\u247c\u2477\u2476\u2473\u2477\u2472", "\u33d9\u33d0\u33dd\u33db\u33dd\u33dd\u33d9\u33dd", "\u08d7\u08d1\u08d0\u08d4\u08d5\u08d9\u08d5\u08d2", "\u5cfe\u5cfc\u5cfb\u5cf8\u5cfa\u5cf2\u5cfd\u5cf8", "\u8d5c\u8d5c\u8d5d\u8d5a\u8d5d\u8d5a\u8d5f\u8d51", "\u44e2\u44e9\u44e6\u44e3\u44e8\u44e7\u44e7\u44e6", "\u2d73\u2d7f\u2d76\u2d71\u2d71\u2d75\u2d75", "\u4d7b\u4d7e\u4d7c\u4d7b\u4d7b\u4d78\u4d7f\u4d7b", "\ua740\ua743\ua740\ua746\ua747\ua743\ua747\ua74a", "\u6349\u6347\u634f\u634a\u6346\u6347", "\uc282\uc280\uc280\uc287\uc284\uc28d\uc282\uc285"}, d2={"\u009a\u00b5\u0089\u20f6\u00c4\u00c6\u00d0\u00b4\u0092\u0099\u008e\u0099\u00d7\u0094\u0099\u0096\u009f\u00d7\u00ab\u008c\u008a\u0091\u0096\u009f\u00c3\u00d1\u00b4\u0092\u0099\u008e\u0099\u00d7\u0094\u0099\u0096\u009f\u00d7\u00ab\u008c\u008a\u0091\u0096\u009f\u00c3", "\u0670\u062f\u0620\u0625\u0622\u0625\u0638\u0672\u0670\u0672\u0664\u0665\u061a", "\u04b1\u04e4\u04e3\u04e4\u04f9\u04b3\u04b1\u04b3\u04a5\u04a4\u04db", "\u0657\u0655\u0644\u0673\u065c\u0651\u0643\u0643\u060c\u060e\u0618\u0619\u067c\u065a\u0651\u0646\u0651\u061f\u065c\u0651\u065e\u0657\u061f\u0673\u065c\u0651\u0643\u0643\u060b", "\u0730\u0739\u072b\u0730\u071b\u0737\u073c\u073d\u0764\u0766\u0770\u0771\u0711", "\u021e\u020a\u020e\u021a\u0217\u0208\u0247\u0245\u0253\u0237\u0211\u021a\u020d\u021a\u0254\u0217\u021a\u0215\u021c\u0254\u0234\u0219\u0211\u021e\u0218\u020f\u0240\u0252\u0221", "\u0092\u009d\u009e\u009f\u0094\u00cd\u00cf\u00d9\u00d8\u00bd\u009b\u0090\u0087\u0090\u00de\u009d\u0090\u009f\u0096\u00de\u00be\u0093\u009b\u0094\u0092\u0085\u00ca", "\u011a\u0101\u013d\u011a\u011c\u0107\u0100\u0109\u0152\u0150\u0146\u0147\u0122\u0104\u010f\u0118\u010f\u0141\u0102\u010f\u0100\u0109\u0141\u013d\u011a\u011c\u0107\u0100\u0109\u0155", "\u06f5\u06f4\u06ef\u06f2\u06fd\u06e2\u06a7\u06a5\u06b3\u06b2\u06cd", "\u052d\u052c\u0537\u052a\u0525\u053a\u0502\u052f\u052f\u057f\u057d\u056b\u056a\u0515", "\u0599\u058f\u0587\u059a\u05d2\u05d0\u05c6\u05c7\u05b8", "\u0565\u0573\u057b\u0566\u052e\u052c\u053a\u0558\u053b\u0544", "\u04a9\u04bf\u04b7\u04aa\u04ee\u04e2\u04e0\u04f6\u0494\u04f7\u0488", "\u0701\u0717\u071f\u0702\u074a\u0748\u075e\u073c\u073f\u075f\u0720", "\u0124\u012b\u012c\u0123\u012e\u012b\u0138\u0127\u017e\u017c\u016a\u016b\u0114"})
public final class Class1377 {
    public static double field5312 = 0.713126101205551;
    public static float field5313;
    public static double field5314;
    public static float field5315;
    public static float field5316;
    public static int field5317 = -1318002834;

    private static String gYwBWVbbo5DmnvNy(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        b\u200e = "XOffset";
        field5314 = Double.longBitsToDouble(4600306650357012528L);
        field5313 = Float.intBitsToFloat(1064606949);
        field5316 = Float.intBitsToFloat(1060182794);
        field5315 = Float.intBitsToFloat(1058517834);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite hySqRrbverofJl(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1377.gYwBWVbbo5DmnvNy(k2, 1199523797));
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
                int a2 = Integer.parseInt(Class1377.gYwBWVbbo5DmnvNy(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 48359 : 48358;
            block7: while (true) {
                switch (n3) {
                    case 48359: {
                        n3 = 48357;
                        continue block7;
                    }
                    case 48358: {
                        String c2 = Class1377.gYwBWVbbo5DmnvNy(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class1377.gYwBWVbbo5DmnvNy(k2, 1199523797) + " " + l2 + " " + m2);
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

