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
@HACHIMI_CLIENT(mv=100, d1={"\ua74e\ua744\ua74a\ua74b\ua74a\ua74e\ua744\ua74b", "\ubde4\ubde1\ubde0\ubde4\ubde5\ubde2\ubdee\ubdef", "\u7a55\u7a56\u7a55\u7a56\u7a55\u7a50\u7a54\u7a57", "\ue0d5\ue0d9\ue0d6\ue0d6\ue0d4\ue0d0\ue0d8\ue0d4", "\u291f\u2919\u2918\u2919\u291a\u291c\u291c\u2919", "\u7543\u754a\u7541\u7543\u7546\u7542\u7544\u7547", "\ud9b1\ud9b1\ud9b1\ud9b4\ud9b7\ud9b6\ud9b1\ud9b5", "\u75f1\u75fd\u75f1\u75fe\u75fb\u75fd\u75fe", "\u4d2d\u4d25\u4d28\u4d25\u4d28\u4d24\u4d2b\u4d25", "\u5a8a\u5a88\u5a8e\u5a8e\u5a89\u5a8a\u5a8b\u5a88", "\u49d6\u49d7\u49d7\u49d6\u49d7\u49d3\u49d2\u49d0", "\u263c\u263a\u263e\u263d\u263e\u263c\u2632", "\u8a6a\u8a6c\u8a6a\u8a67\u8a67\u8a6b\u8a68\u8a6d", "\u5ece\u5ec5\u5ece\u5ec0\u5ec1", "\ue3fb\ue3f1\ue3fc\ue3fe\ue3fd\ue3f0\ue3fb", "\u8aa7\u8aa7\u8aa2\u8aa9\u8aa0\u8aa8\u8aa6\u8aa0", "\u0bc9\u0bcc\u0bc9\u0bc3\u0bc8\u0bc9\u0bc3\u0bc9", "\u74ec\u74ed\u74ea\u74e7\u74eb\u74ed\u74e9\u74e8"}, d2={"\u05f6\u05c7\u05f4\u258b\u05b9\u05bb\u05ad\u05c9\u05ef\u05e4\u05f3\u05e4\u05aa\u05e9\u05e4\u05eb\u05e2\u05aa\u05d6\u05f1\u05f7\u05ec\u05eb\u05e2\u05be\u05ac\u05c9\u05ef\u05e4\u05f3\u05e4\u05aa\u05e9\u05e4\u05eb\u05e2\u05aa\u05d6\u05f1\u05f7\u05ec\u05eb\u05e2\u05be", "\u0293\u02a2\u0292\u22ee\u02dc\u02de\u02c8\u02ac\u028a\u0281\u0296\u0281\u02cf\u028c\u0281\u028e\u0287\u02cf\u02b3\u0294\u0292\u0289\u028e\u0287\u02db\u02c9\u02ac\u028a\u0281\u0296\u0281\u02cf\u028c\u0281\u028e\u0287\u02cf\u02b3\u0294\u0292\u0289\u028e\u0287\u02db", "\u046a\u045b\u046a\u2417\u0425\u0427\u0431\u0455\u0473\u0478\u046f\u0478\u0436\u0475\u0478\u0477\u047e\u0436\u044a\u046d\u046b\u0470\u0477\u047e\u0422\u0430\u0455\u0473\u0478\u046f\u0478\u0436\u0475\u0478\u0477\u047e\u0436\u044a\u046d\u046b\u0470\u0477\u047e\u0422", "\u013d\u010c\u013a\u2140\u0172\u0170\u0166\u0102\u0124\u012f\u0138\u012f\u0161\u0122\u012f\u0120\u0129\u0161\u011d\u013a\u013c\u0127\u0120\u0129\u0175\u0167\u0102\u0124\u012f\u0138\u012f\u0161\u0122\u012f\u0120\u0129\u0161\u011d\u013a\u013c\u0127\u0120\u0129\u0175", "\u0367\u0338\u0337\u0332\u0335\u0332\u032f\u0365\u0367\u0365\u0373\u0372\u030d", "\u0625\u0670\u0677\u0670\u066d\u0627\u0625\u0627\u0631\u0630\u064f", "\u0235\u0237\u0226\u0211\u023e\u0233\u0221\u0221\u026e\u026c\u027a\u027b\u021e\u0238\u0233\u0224\u0233\u027d\u023e\u0233\u023c\u0235\u027d\u0211\u023e\u0233\u0221\u0221\u0269", "\u0572\u057b\u0569\u0572\u0559\u0575\u057e\u057f\u0526\u0524\u0532\u0533\u0553", "\u03f6\u03e2\u03e6\u03f2\u03ff\u03e0\u03af\u03ad\u03bb\u03df\u03f9\u03f2\u03e5\u03f2\u03bc\u03ff\u03f2\u03fd\u03f4\u03bc\u03dc\u03f1\u03f9\u03f6\u03f0\u03e7\u03a8\u03ba\u03c9", "\u016e\u0161\u0162\u0163\u0168\u0131\u0133\u0125\u0124\u0141\u0167\u016c\u017b\u016c\u0122\u0161\u016c\u0163\u016a\u0122\u0142\u016f\u0167\u0168\u016e\u0179\u0136", "\u04d3\u04c8\u04f4\u04d3\u04d5\u04ce\u04c9\u04c0\u049b\u0499\u048f\u048e\u04eb\u04cd\u04c6\u04d1\u04c6\u0488\u04cb\u04c6\u04c9\u04c0\u0488\u04f4\u04d3\u04d5\u04ce\u04c9\u04c0\u049c", "\u0205\u0204\u021f\u0202\u020d\u0212\u0257\u0255\u0243\u0242\u023d", "\u0250\u0251\u024a\u0257\u0258\u0247\u027f\u0252\u0252\u0202\u0200\u0216\u0217\u0268", "\u0351\u0347\u034f\u0352\u031a\u0318\u030e\u030f\u0370", "\u0685\u0693\u069b\u0686\u06ce\u06cc\u06da\u06b8\u06db\u06a4", "\u06c2\u06d4\u06dc\u06c1\u0685\u0689\u068b\u069d\u06ff\u069c\u06e3", "\u074a\u075c\u0754\u0749\u0701\u0703\u0715\u0777\u0774\u0714\u076b", "\u061b\u0614\u0613\u061c\u0611\u0614\u0607\u0618\u0641\u0643\u0655\u0654\u062b"})
public final class Class1074 {
    public static float field4373;
    public static float field4374;
    public static double field4375;
    public static float field4376 = 0.52102596f;
    public static float field4377;
    public static double field4378;

    private static String I0WaGbyJFq3d5W5y(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field4374 = Float.intBitsToFloat(1063305218);
        field4375 = Double.longBitsToDouble(4624070917402656768L);
        field4373 = Float.intBitsToFloat(1059968397);
        u\u200e = "Scaling";
        T\u200e = "Removes the slowdown effect caused by walking over Honey blocks";
        field4378 = Double.longBitsToDouble(4603985442518581006L);
        aJ\u200e = "Server";
        br\u200e = "OFF";
        field4377 = Float.intBitsToFloat(1029430880);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 9aWgI2SMnVI761(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1074.I0WaGbyJFq3d5W5y(k2, 348854458));
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
                int a2 = Integer.parseInt(Class1074.I0WaGbyJFq3d5W5y(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1074.I0WaGbyJFq3d5W5y(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 8603 : 8604;
        block7: while (true) {
            switch (n3) {
                case 8604: {
                    n3 = 8602;
                    continue block7;
                }
                case 8603: {
                    throw new Exception("Can't find method in " + Class1074.I0WaGbyJFq3d5W5y(k2, 348854458) + " " + l2 + " " + m2);
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

