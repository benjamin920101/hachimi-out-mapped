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

@HACHIMI_CLIENT(mv=100, d1={"\ucdaa\ucdab\ucda9\ucda2\ucdad\ucdaf\ucda8\ucda2", "\u884e\u884b\u8842\u884c\u8849\u8843\u884f", "\u0531\u0537\u0537\u0537\u0532\u0534\u053c\u053d", "\udb2e\udb2e\udb27\udb2b\udb27\udb2c\udb27\udb2e", "\ua9ae\ua9af\ua9a9\ua9a8\ua9ac\ua9ad\ua9a1\ua9a0", "\u6e9e\u6e9d\u6e9f\u6e95\u6e9e\u6e9f\u6e95\u6e94", "\u314e\u314c\u314b\u3145\u3144\u314c\u314a\u314d", "\u20c3\u20c2\u20c4\u20c8\u20c2\u20c1\u20c1\u20c4", "\u6831\u6831\u6836\u6830\u6837\u683d", "\u87fb\u87fb\u87fd\u87fb\u87f1\u87f8\u87f0\u87fa", "\ubeaa\ubea9\ubeaa\ubea8\ubea3\ubea3\ubead\ubead", "\u5332\u533f\u533e\u5335\u5334\u5336\u5335\u533f", "\u52c4\u52c5\u52ce\u52c2\u52c2\u52c6\u52c5\u52ce", "\u65b3\u65b2\u65b7\u65b4\u65b5\u65b7\u65b5\u65b7", "\u766e\u766e\u766f\u766c\u766c\u7663\u766d\u766d", "\ud0df\ud0df\ud0da\ud0d9\ud0d9\ud0da\ud0dd\ud0df", "\ue336\ue333\ue337\ue335\ue334\ue330\ue331"}, d2={"\u031f\u030d\u031a\u2370\u0342\u0340\u0356\u0332\u0314\u031f\u0308\u031f\u0351\u0312\u031f\u0310\u0319\u0351\u032d\u030a\u030c\u0317\u0310\u0319\u0345\u0357\u0332\u0314\u031f\u0308\u031f\u0351\u0312\u031f\u0310\u0319\u0351\u032d\u030a\u030c\u0317\u0310\u0319\u0345", "\u05c6\u05d4\u05c2\u25a9\u059b\u0599\u058f\u05eb\u05cd\u05c6\u05d1\u05c6\u0588\u05cb\u05c6\u05c9\u05c0\u0588\u05f4\u05d3\u05d5\u05ce\u05c9\u05c0\u059c\u058e\u05eb\u05cd\u05c6\u05d1\u05c6\u0588\u05cb\u05c6\u05c9\u05c0\u0588\u05f4\u05d3\u05d5\u05ce\u05c9\u05c0\u059c", "\u03f9\u03eb\u03fe\u2396\u03a4\u03a6\u03b0\u03d4\u03f2\u03f9\u03ee\u03f9\u03b7\u03f4\u03f9\u03f6\u03ff\u03b7\u03cb\u03ec\u03ea\u03f1\u03f6\u03ff\u03a3\u03b1\u03d4\u03f2\u03f9\u03ee\u03f9\u03b7\u03f4\u03f9\u03f6\u03ff\u03b7\u03cb\u03ec\u03ea\u03f1\u03f6\u03ff\u03a3", "\u0652\u060d\u0602\u0607\u0600\u0607\u061a\u0650\u0652\u0650\u0646\u0647\u0638", "\u00ad\u00f8\u00ff\u00f8\u00e5\u00af\u00ad\u00af\u00b9\u00b8\u00c7", "\u00b9\u00bb\u00aa\u009d\u00b2\u00bf\u00ad\u00ad\u00e2\u00e0\u00f6\u00f7\u0092\u00b4\u00bf\u00a8\u00bf\u00f1\u00b2\u00bf\u00b0\u00b9\u00f1\u009d\u00b2\u00bf\u00ad\u00ad\u00e5", "\u057b\u0572\u0560\u057b\u0550\u057c\u0577\u0576\u052f\u052d\u053b\u053a\u055a", "\u0747\u0753\u0757\u0743\u074e\u0751\u071e\u071c\u070a\u076e\u0748\u0743\u0754\u0743\u070d\u074e\u0743\u074c\u0745\u070d\u076d\u0740\u0748\u0747\u0741\u0756\u0719\u070b\u0778", "\u03d0\u03df\u03dc\u03dd\u03d6\u038f\u038d\u039b\u039a\u03ff\u03d9\u03d2\u03c5\u03d2\u039c\u03df\u03d2\u03dd\u03d4\u039c\u03fc\u03d1\u03d9\u03d6\u03d0\u03c7\u0388", "\u03c7\u03dc\u03e0\u03c7\u03c1\u03da\u03dd\u03d4\u038f\u038d\u039b\u039a\u03ff\u03d9\u03d2\u03c5\u03d2\u039c\u03df\u03d2\u03dd\u03d4\u039c\u03e0\u03c7\u03c1\u03da\u03dd\u03d4\u0388", "\u027a\u027b\u0260\u027d\u0272\u026d\u0228\u022a\u023c\u023d\u0242", "\u0635\u0634\u062f\u0632\u063d\u0622\u061a\u0637\u0637\u0667\u0665\u0673\u0672\u060d", "\u0210\u0206\u020e\u0213\u025b\u0259\u024f\u024e\u0231", "\u0614\u0602\u060a\u0617\u065f\u065d\u064b\u0629\u064a\u0635", "\u05fe\u05e8\u05e0\u05fd\u05b9\u05b5\u05b7\u05a1\u05c3\u05a0\u05df", "\u044e\u0458\u0450\u044d\u0405\u0407\u0411\u0473\u0470\u0410\u046f", "\u00fc\u00f3\u00f4\u00fb\u00f6\u00f3\u00e0\u00ff\u00a6\u00a4\u00b2\u00b3\u00cc"})
public final class Class4097 {
    public static float field9495;
    public static int field9496 = 1030440909;
    public static double field9497 = 0.3897759872879183;
    public static int field9498 = 515873119;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite edUntgxoeN05JX(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4097.HCqHjzwFsrIRfnHa(k2, 834757777));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4097.HCqHjzwFsrIRfnHa(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 63997 : 63996;
            block7: while (true) {
                switch (n3) {
                    case 63997: {
                        n3 = 63995;
                        continue block7;
                    }
                    case 63996: {
                        String c2 = Class4097.HCqHjzwFsrIRfnHa(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class4097.HCqHjzwFsrIRfnHa(k2, 834757777) + " " + l2 + " " + m2);
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
        t\u200e = "FractionalMetrics";
        ak\u200e = "Notifies in chat";
        field9495 = Float.intBitsToFloat(1042349220);
        aU\u200e = "The color of the chams";
    }

    private static String HCqHjzwFsrIRfnHa(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

