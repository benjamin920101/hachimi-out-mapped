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

@HACHIMI_CLIENT(mv=100, d1={"\u72b7\u72b4\u72b5\u72b2\u72b1\u72b5\u72b1\u72bc", "\ud0d2\ud0d1\ud0d3\ud0d7\ud0d4\ud0d8\ud0d7\ud0d8", "\u9337\u9333\u9331\u9332\u9337\u9335\u9336\u9331", "\u0fd6\u0fd3\u0fd5\u0fd5\u0fd1\u0fd3\u0fd8\u0fd3", "\u9fb8\u9fb8\u9fbd\u9fbc\u9fb9\u9fb9\u9fb6\u9fb9", "\u3d34\u3d3d\u3d34\u3d37\u3d35\u3d3c\u3d31\u3d3c", "\u2c27\u2c20\u2c26\u2c25\u2c24\u2c27\u2c27\u2c2f", "\ua2f7\ua2f0\ua2f7\ua2fc\ua2f6\ua2fd\ua2f6\ua2f2", "\u24be\u24b4\u24bd\u24be\u24bc\u24be\u24ba\u24bc", "\u9c15\u9c14\u9c12\u9c1f\u9c1e\u9c13\u9c15\u9c1f", "\ub24f\ub248\ub244\ub248\ub24f\ub244\ub245\ub245", "\u355d\u355b\u3558\u355c\u3554\u355e\u3555", "\u27a6\u27a3\u27ac\u27ac\u27a0\u27a5\u27a6\u27a5", "\u2316\u2312\u231b\u2311\u2310\u2316\u231b\u2316", "\u90c9\u90cc\u90c9\u90cb\u90cc\u90c6\u90c6\u90ca", "\ua088\ua08e\ua087\ua088\ua089\ua087\ua088\ua08f"}, d2={"\u036d\u036d\u0350\u2313\u0321\u0323\u0335\u0351\u0377\u037c\u036b\u037c\u0332\u0371\u037c\u0373\u037a\u0332\u034e\u0369\u036f\u0374\u0373\u037a\u0326\u0334\u0351\u0377\u037c\u036b\u037c\u0332\u0371\u037c\u0373\u037a\u0332\u034e\u0369\u036f\u0374\u0373\u037a\u0326", "\u05d0\u05d0\u05ee\u25ae\u059c\u059e\u0588\u05ec\u05ca\u05c1\u05d6\u05c1\u058f\u05cc\u05c1\u05ce\u05c7\u058f\u05f3\u05d4\u05d2\u05c9\u05ce\u05c7\u059b\u0589\u05ec\u05ca\u05c1\u05d6\u05c1\u058f\u05cc\u05c1\u05ce\u05c7\u058f\u05f3\u05d4\u05d2\u05c9\u05ce\u05c7\u059b", "\u0770\u072f\u0720\u0725\u0722\u0725\u0738\u0772\u0770\u0772\u0764\u0765\u071a", "\u05d8\u058d\u058a\u058d\u0590\u05da\u05d8\u05da\u05cc\u05cd\u05b2", "\u0393\u0391\u0380\u03b7\u0398\u0395\u0387\u0387\u03c8\u03ca\u03dc\u03dd\u03b8\u039e\u0395\u0382\u0395\u03db\u0398\u0395\u039a\u0393\u03db\u03b7\u0398\u0395\u0387\u0387\u03cf", "\u0097\u009e\u008c\u0097\u00bc\u0090\u009b\u009a\u00c3\u00c1\u00d7\u00d6\u00b6", "\u0016\u0002\u0006\u0012\u001f\u0000OM[?\u0019\u0012\u0005\u0012\\\u001f\u0012\u001d\u0014\\<\u0011\u0019\u0016\u0010\u0007HZ)", "\u06d2\u06dd\u06de\u06df\u06d4\u068d\u068f\u0699\u0698\u06fd\u06db\u06d0\u06c7\u06d0\u069e\u06dd\u06d0\u06df\u06d6\u069e\u06fe\u06d3\u06db\u06d4\u06d2\u06c5\u068a", "\u0388\u0393\u03af\u0388\u038e\u0395\u0392\u039b\u03c0\u03c2\u03d4\u03d5\u03b0\u0396\u039d\u038a\u039d\u03d3\u0390\u039d\u0392\u039b\u03d3\u03af\u0388\u038e\u0395\u0392\u039b\u03c7", "\u0570\u0571\u056a\u0577\u0578\u0567\u0522\u0520\u0536\u0537\u0548", "\u069e\u069f\u0684\u0699\u0696\u0689\u06b1\u069c\u069c\u06cc\u06ce\u06d8\u06d9\u06a6", "\u0333\u0325\u032d\u0330\u0378\u037a\u036c\u036d\u0312", "\u055c\u054a\u0542\u055f\u0517\u0515\u0503\u0561\u0502\u057d", "\u05c0\u05d6\u05de\u05c3\u0587\u058b\u0589\u059f\u05fd\u059e\u05e1", "\u0231\u0227\u022f\u0232\u027a\u0278\u026e\u020c\u020f\u026f\u0210", "\u0713\u071c\u071b\u0714\u0719\u071c\u070f\u0710\u0749\u074b\u075d\u075c\u0723"})
public final class Class3314 {
    public static float field7136;
    public static double field7137;
    public static float field7138;
    public static float field7139;

    /*
     * WARNING - void declaration
     */
    private static CallSite eegESqke06rSFH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3314.a9HZnwITOtDZn242(k2, 677150371));
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
                int a2 = Integer.parseInt(Class3314.a9HZnwITOtDZn242(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3314.a9HZnwITOtDZn242(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3314.a9HZnwITOtDZn242(k2, 677150371) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String a9HZnwITOtDZn242(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7138 = Float.intBitsToFloat(1061831188);
        field7137 = Double.longBitsToDouble(4600275464704082310L);
        field7136 = Float.intBitsToFloat(1044461460);
        bz\u200e = "The line width of the highlight";
        bQ\u200e = "ShieldMode";
        field7139 = Float.intBitsToFloat(1049628100);
    }
}

