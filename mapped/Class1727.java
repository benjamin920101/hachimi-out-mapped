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

@HACHIMI_CLIENT(mv=100, d1={"\u2cde\u2cd7\u2cdf\u2cda\u2cd8\u2cdd\u2cd8\u2cdb", "\ud206\ud204\ud203\ud202\ud203\ud206\ud203\ud207", "\uba61\uba60\uba60\uba67\uba63\uba63\uba62\uba62", "\u7936\u7934\u7935\u7932\u7935\u7936\u7930\u7932", "\u8cb1\u8cb2\u8cb6\u8cbd\u8cb6\u8cb2\u8cbd\u8cbd", "\u84a8\u84a8\u84a8\u84a9\u84ac\u84a9\u84ae", "\ua3da\ua3da\ua3df\ua3db\ua3db\ua3d9\ua3df\ua3df", "\u8cd3\u8cd2\u8cda\u8cd9\u8cde\u8cd8\u8cd8", "\u91dc\u91d2\u91da\u91df\u91db\u91de\u91de\u91d2", "\u1e52\u1e57\u1e54\u1e56\u1e53\u1e55\u1e55\u1e53", "\u0c6a\u0c62\u0c68\u0c6e\u0c62\u0c6a\u0c63\u0c63", "\ubbb8\ubbba\ubbb2\ubbba\ubbba\ubbbb\ubbbb\ubbbd", "\u72b3\u72b2\u72b5\u72b6\u72b5\u72bc\u72b1\u72b7", "\u8c88\u8c8a\u8c88\u8c88\u8c8f\u8c82\u8c8e\u8c83", "\ubbe2\ubbe1\ubbe5\ubbe4\ubbe7\ubbe2\ubbe5\ubbe4", "\u87e2\u87e2\u87e7\u87ec\u87e5\u87e6\u87e3\u87e4", "\u8d46\u8d43\u8d42\u8d41\u8d4f\u8d46\u8d45\u8d44", "\u5140\u5145\u5146\u5140\u514b\u5141\u514b"}, d2={"\u0504\u050f\u0506\u2560\u0552\u0550\u0546\u0522\u0504\u050f\u0518\u050f\u0541\u0502\u050f\u0500\u0509\u0541\u053d\u051a\u051c\u0507\u0500\u0509\u0555\u0547\u0522\u0504\u050f\u0518\u050f\u0541\u0502\u050f\u0500\u0509\u0541\u053d\u051a\u051c\u0507\u0500\u0509\u0555", "\u03eb\u03e0\u03e8\u238f\u03bd\u03bf\u03a9\u03cd\u03eb\u03e0\u03f7\u03e0\u03ae\u03ed\u03e0\u03ef\u03e6\u03ae\u03d2\u03f5\u03f3\u03e8\u03ef\u03e6\u03ba\u03a8\u03cd\u03eb\u03e0\u03f7\u03e0\u03ae\u03ed\u03e0\u03ef\u03e6\u03ae\u03d2\u03f5\u03f3\u03e8\u03ef\u03e6\u03ba", "\u0423\u0428\u0423\u2447\u0475\u0477\u0461\u0405\u0423\u0428\u043f\u0428\u0466\u0425\u0428\u0427\u042e\u0466\u041a\u043d\u043b\u0420\u0427\u042e\u0472\u0460\u0405\u0423\u0428\u043f\u0428\u0466\u0425\u0428\u0427\u042e\u0466\u041a\u043d\u043b\u0420\u0427\u042e\u0472", "\u0252\u0259\u0253\u2236\u0204\u0206\u0210\u0274\u0252\u0259\u024e\u0259\u0217\u0254\u0259\u0256\u025f\u0217\u026b\u024c\u024a\u0251\u0256\u025f\u0203\u0211\u0274\u0252\u0259\u024e\u0259\u0217\u0254\u0259\u0256\u025f\u0217\u026b\u024c\u024a\u0251\u0256\u025f\u0203", "\u0174\u012b\u0124\u0121\u0126\u0121\u013c\u0176\u0174\u0176\u0160\u0161\u011e", "\u0128\u017d\u017a\u017d\u0160\u012a\u0128\u012a\u013c\u013d\u0142", "\u0432\u0430\u0421\u0416\u0439\u0434\u0426\u0426\u0469\u046b\u047d\u047c\u0419\u043f\u0434\u0423\u0434\u047a\u0439\u0434\u043b\u0432\u047a\u0416\u0439\u0434\u0426\u0426\u046e", "\u06b6\u06bf\u06ad\u06b6\u069d\u06b1\u06ba\u06bb\u06e2\u06e0\u06f6\u06f7\u0697", "\u03c5\u03d1\u03d5\u03c1\u03cc\u03d3\u039c\u039e\u0388\u03ec\u03ca\u03c1\u03d6\u03c1\u038f\u03cc\u03c1\u03ce\u03c7\u038f\u03ef\u03c2\u03ca\u03c5\u03c3\u03d4\u039b\u0389\u03fa", "\u0554\u055b\u0558\u0559\u0552\u050b\u0509\u051f\u051e\u057b\u055d\u0556\u0541\u0556\u0518\u055b\u0556\u0559\u0550\u0518\u0578\u0555\u055d\u0552\u0554\u0543\u050c", "\u06ea\u06f1\u06cd\u06ea\u06ec\u06f7\u06f0\u06f9\u06a2\u06a0\u06b6\u06b7\u06d2\u06f4\u06ff\u06e8\u06ff\u06b1\u06f2\u06ff\u06f0\u06f9\u06b1\u06cd\u06ea\u06ec\u06f7\u06f0\u06f9\u06a5", "\u0657\u0656\u064d\u0650\u065f\u0640\u0605\u0607\u0611\u0610\u066f", "\u0625\u0624\u063f\u0622\u062d\u0632\u060a\u0627\u0627\u0677\u0675\u0663\u0662\u061d", "\u04b8\u04ae\u04a6\u04bb\u04f3\u04f1\u04e7\u04e6\u0499", "\u0134\u0122\u012a\u0137\u017f\u017d\u016b\u0109\u016a\u0115", "\u04d2\u04c4\u04cc\u04d1\u0495\u0499\u049b\u048d\u04ef\u048c\u04f3", "\u0623\u0635\u063d\u0620\u0668\u066a\u067c\u061e\u061d\u067d\u0602", "\u0135\u013a\u013d\u0132\u013f\u013a\u0129\u0136\u016f\u016d\u017b\u017a\u0105"})
public final class Class1727 {
    public static float field6379;
    public static float field6380;
    public static double field6381 = 0.6095118582949249;

    static {
        field6380 = Float.intBitsToFloat(1063404951);
        q\u200e = "MobOwner";
        field6379 = Float.intBitsToFloat(1057666968);
        aN\u200e = "mount";
        bw\u200e = "Slimes";
        bD\u200e = "Fill";
    }

    private static String jGHJ4F1qqqjDn4WM(String a2, int b2) {
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
    private static CallSite bf31QS64nHGUMB(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1727.jGHJ4F1qqqjDn4WM(k2, -758106992));
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
                int a2 = Integer.parseInt(Class1727.jGHJ4F1qqqjDn4WM(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1727.jGHJ4F1qqqjDn4WM(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 31608 : 31609;
        block7: while (true) {
            switch (n3) {
                case 31609: {
                    n3 = 31607;
                    continue block7;
                }
                case 31608: {
                    throw new Exception("Can't find method in " + Class1727.jGHJ4F1qqqjDn4WM(k2, -758106992) + " " + l2 + " " + m2);
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

