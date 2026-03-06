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

@HACHIMI_CLIENT(mv=100, d1={"\u849f\u8498\u849c\u8492\u8498\u8499\u849f\u849a", "\u7ca7\u7ca5\u7cab\u7ca7\u7ca0\u7ca5\u7caa\u7ca0", "\u4464\u4463\u4464\u4460\u446f\u4460\u4460\u4464", "\u6f78\u6f7c\u6f7b\u6f7d\u6f79\u6f75\u6f78\u6f78", "\u2d74\u2d79\u2d74\u2d7b\u2d74\u2d7c\u2d78", "\ubd51\ubd56\ubd52\ubd53\ubd56\ubd56\ubd57\ubd56", "\uaef3\uaefd\uaef7\uaefc\uaef2\uaef5\uaef3\uaef6", "\u41a5\u41a5\u41a7\u41a9\u41a5\u41a4\u41a2\u41a4", "\u90a8\u90ab\u90a5\u90a8\u90a9\u90ae\u90a4\u90a4", "\u3a22\u3a27\u3a20\u3a22\u3a20\u3a23\u3a24\u3a22", "\u3286\u3288\u3286\u3282\u3280\u3283\u3281", "\ue28d\ue280\ue28c\ue28a\ue28b\ue281\ue288\ue288", "\u75e7\u75e2\u75e5\u75e5\u75ec\u75e1\u75ed\u75e3", "\ub9f2\ub9fd\ub9f2\ub9f2\ub9fd\ub9f2\ub9fc\ub9fd", "\u02da\u02dc\u02dc\u02dc\u02d8\u02d8\u02d8\u02dd", "\u21ea\u21ee\u21ed\u21e4\u21ea\u21ed\u21eb\u21ea", "\u3d30\u3d35\u3d3b\u3d3b\u3d32\u3d37\u3d33\u3d31", "\u4fc4\u4fc0\u4fc6\u4fc7\u4fc3\u4fc3\u4fc4\u4fcd", "\u775e\u775f\u775e\u775a\u775a\u775d\u7759\u775a"}, d2={"\u00ed\u00fd\u00cc\u2086\u00b4\u00b6\u00a0\u00c4\u00e2\u00e9\u00fe\u00e9\u00a7\u00e4\u00e9\u00e6\u00ef\u00a7\u00db\u00fc\u00fa\u00e1\u00e6\u00ef\u00b3\u00a1\u00c4\u00e2\u00e9\u00fe\u00e9\u00a7\u00e4\u00e9\u00e6\u00ef\u00a7\u00db\u00fc\u00fa\u00e1\u00e6\u00ef\u00b3", "\u057e\u056e\u055e\u2515\u0527\u0525\u0533\u0557\u0571\u057a\u056d\u057a\u0534\u0577\u057a\u0575\u057c\u0534\u0548\u056f\u0569\u0572\u0575\u057c\u0520\u0532\u0557\u0571\u057a\u056d\u057a\u0534\u0577\u057a\u0575\u057c\u0534\u0548\u056f\u0569\u0572\u0575\u057c\u0520", "\u061a\u060a\u0639\u2671\u0643\u0641\u0657\u0633\u0615\u061e\u0609\u061e\u0650\u0613\u061e\u0611\u0618\u0650\u062c\u060b\u060d\u0616\u0611\u0618\u0644\u0656\u0633\u0615\u061e\u0609\u061e\u0650\u0613\u061e\u0611\u0618\u0650\u062c\u060b\u060d\u0616\u0611\u0618\u0644", "\u014b\u015b\u0169\u2120\u0112\u0110\u0106\u0162\u0144\u014f\u0158\u014f\u0101\u0142\u014f\u0140\u0149\u0101\u017d\u015a\u015c\u0147\u0140\u0149\u0115\u0107\u0162\u0144\u014f\u0158\u014f\u0101\u0142\u014f\u0140\u0149\u0101\u017d\u015a\u015c\u0147\u0140\u0149\u0115", "\u045c\u044c\u0471\u2437\u0405\u0407\u0411\u0475\u0453\u0458\u044f\u0458\u0416\u0455\u0458\u0457\u045e\u0416\u046a\u044d\u044b\u0450\u0457\u045e\u0402\u0410\u0475\u0453\u0458\u044f\u0458\u0416\u0455\u0458\u0457\u045e\u0416\u046a\u044d\u044b\u0450\u0457\u045e\u0402", "\u0535\u056a\u0565\u0560\u0567\u0560\u057d\u0537\u0535\u0537\u0521\u0520\u055f", "\u04c2\u0497\u0490\u0497\u048a\u04c0\u04c2\u04c0\u04d6\u04d7\u04a8", "\u060a\u0608\u0619\u062e\u0601\u060c\u061e\u061e\u0651\u0653\u0645\u0644\u0621\u0607\u060c\u061b\u060c\u0642\u0601\u060c\u0603\u060a\u0642\u062e\u0601\u060c\u061e\u061e\u0656", "\u057a\u0573\u0561\u057a\u0551\u057d\u0576\u0577\u052e\u052c\u053a\u053b\u055b", "\u0158\u014c\u0148\u015c\u0151\u014e\u0101\u0103\u0115\u0171\u0157\u015c\u014b\u015c\u0112\u0151\u015c\u0153\u015a\u0112\u0172\u015f\u0157\u0158\u015e\u0149\u0106\u0114\u0167", "\u0465\u046a\u0469\u0468\u0463\u043a\u0438\u042e\u042f\u044a\u046c\u0467\u0470\u0467\u0429\u046a\u0467\u0468\u0461\u0429\u0449\u0464\u046c\u0463\u0465\u0472\u043d", "\u00b9\u00a2\u009e\u00b9\u00bf\u00a4\u00a3\u00aa\u00f1\u00f3\u00e5\u00e4\u0081\u00a7\u00ac\u00bb\u00ac\u00e2\u00a1\u00ac\u00a3\u00aa\u00e2\u009e\u00b9\u00bf\u00a4\u00a3\u00aa\u00f6", "\u06ae\u06af\u06b4\u06a9\u06a6\u06b9\u06fc\u06fe\u06e8\u06e9\u0696", "\u068d\u068c\u0697\u068a\u0685\u069a\u06a2\u068f\u068f\u06df\u06dd\u06cb\u06ca\u06b5", "\u02aa\u02bc\u02b4\u02a9\u02e1\u02e3\u02f5\u02f4\u028b", "\u020c\u021a\u0212\u020f\u0247\u0245\u0253\u0231\u0252\u022d", "\u0500\u0516\u051e\u0503\u0547\u054b\u0549\u055f\u053d\u055e\u0521", "\u0181\u0197\u019f\u0182\u01ca\u01c8\u01de\u01bc\u01bf\u01df\u01a0", "\u07a3\u07ac\u07ab\u07a4\u07a9\u07ac\u07bf\u07a0\u07f9\u07fb\u07ed\u07ec\u0793"})
public final class Class1264 {
    public static double field4940;
    public static float field4941;
    public static int field4942 = -1789434911;
    public static double field4943;
    public static double field4944;
    public static float field4945;
    public static float field4946 = 0.2548002f;
    public static double field4947;

    private static String r8S6VGTTmKfyeu87(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite FjGefoDoYaraxn(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1264.r8S6VGTTmKfyeu87(k2, 8236563));
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
                int a2 = Integer.parseInt(Class1264.r8S6VGTTmKfyeu87(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1264.r8S6VGTTmKfyeu87(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1264.r8S6VGTTmKfyeu87(k2, 8236563) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        L\u200e = "BackGround";
        field4947 = Double.longBitsToDouble(4602746703002322665L);
        Z\u200e = "GrimV3";
        field4943 = Double.longBitsToDouble(4602761428271763972L);
        field4944 = Double.longBitsToDouble(4603727129529739271L);
        field4945 = Float.intBitsToFloat(1046823364);
        field4941 = Float.intBitsToFloat(1047731828);
        aX\u200e = "Rotate to obstacles";
        aY\u200e = "Blocks";
        bd\u200e = "CalcDelay";
        field4940 = Double.longBitsToDouble(4594580707743921496L);
    }
}

