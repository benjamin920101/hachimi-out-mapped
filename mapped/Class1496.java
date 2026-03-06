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
@HACHIMI_CLIENT(mv=100, d1={"\u63b3\u63b5\u63b2\u63b4\u63b1\u63b5\u63b3\u63b5", "\u832a\u832c\u8328\u832e\u8328\u832f\u832a\u832e", "\u5ceb\u5ceb\u5cef\u5cec\u5ce9\u5cec\u5ce6\u5ce7", "\ucb6b\ucb68\ucb6d\ucb63\ucb6d\ucb68\ucb6f\ucb6c", "\uba05\uba00\uba05\uba05\uba02\uba00\uba00\uba00", "\ud357\ud357\ud35f\ud350\ud353\ud353\ud357\ud35e", "\u7d6d\u7d69\u7d69\u7d6b\u7d69\u7d61\u7d61\u7d6c", "\u5130\u513d\u513d\u513c\u513d\u5134\u5132\u5137", "\u775a\u775b\u775f\u7751\u775b\u7750\u7759\u7759", "\ua0b2\ua0b0\ua0b8\ua0b2\ua0b6\ua0b4\ua0b8\ua0b1", "\uc045\uc043\uc04e\uc046\uc046\uc047\uc04f", "\u0c38\u0c3f\u0c3f\u0c3b\u0c3d\u0c3e\u0c3e\u0c36", "\u650e\u650e\u650f\u6508\u6505\u650a\u650f\u650e", "\udef9\udefe\udefb\udeff\udefc\udef7\udef8\udef7", "\u2502\u2500\u2506\u2507\u2505\u2507\u2509\u2509"}, d2={"\u0486\u0485\u04a1\u24e5\u04d7\u04d5\u04c3\u04a7\u0481\u048a\u049d\u048a\u04c4\u0487\u048a\u0485\u048c\u04c4\u04b8\u049f\u0499\u0482\u0485\u048c\u04d0\u04c2\u04a7\u0481\u048a\u049d\u048a\u04c4\u0487\u048a\u0485\u048c\u04c4\u04b8\u049f\u0499\u0482\u0485\u048c\u04d0", "\u00e2\u00bd\u00b2\u00b7\u00b0\u00b7\u00aa\u00e0\u00e2\u00e0\u00f6\u00f7\u0088", "\u0742\u0717\u0710\u0717\u070a\u0740\u0742\u0740\u0756\u0757\u0728", "\u071a\u0718\u0709\u073e\u0711\u071c\u070e\u070e\u0741\u0743\u0755\u0754\u0731\u0717\u071c\u070b\u071c\u0752\u0711\u071c\u0713\u071a\u0752\u073e\u0711\u071c\u070e\u070e\u0746", "\u03b9\u03b0\u03a2\u03b9\u0392\u03be\u03b5\u03b4\u03ed\u03ef\u03f9\u03f8\u0398", "\u0669\u067d\u0679\u066d\u0660\u067f\u0630\u0632\u0624\u0640\u0666\u066d\u067a\u066d\u0623\u0660\u066d\u0662\u066b\u0623\u0643\u066e\u0666\u0669\u066f\u0678\u0637\u0625\u0656", "\u0795\u079a\u0799\u0798\u0793\u07ca\u07c8\u07de\u07df\u07ba\u079c\u0797\u0780\u0797\u07d9\u079a\u0797\u0798\u0791\u07d9\u07b9\u0794\u079c\u0793\u0795\u0782\u07cd", "\u0618\u0603\u063f\u0618\u061e\u0605\u0602\u060b\u0650\u0652\u0644\u0645\u0620\u0606\u060d\u061a\u060d\u0643\u0600\u060d\u0602\u060b\u0643\u063f\u0618\u061e\u0605\u0602\u060b\u0657", "\u07a0\u07a1\u07ba\u07a7\u07a8\u07b7\u07f2\u07f0\u07e6\u07e7\u0798", "\u0174\u0175\u016e\u0173\u017c\u0163\u015b\u0176\u0176\u0126\u0124\u0132\u0133\u014c", "\u0717\u0701\u0709\u0714\u075c\u075e\u0748\u0749\u0736", "\u050b\u051d\u0515\u0508\u0540\u0542\u0554\u0536\u0555\u052a", "\u00bd\u00ab\u00a3\u00be\u00fa\u00f6\u00f4\u00e2\u0080\u00e3\u009c", "\u0688\u069e\u0696\u068b\u06c3\u06c1\u06d7\u06b5\u06b6\u06d6\u06a9", "\u04ea\u04e5\u04e2\u04ed\u04e0\u04e5\u04f6\u04e9\u04b0\u04b2\u04a4\u04a5\u04da"})
public final class Class1496 {
    public static float field5641 = 0.9558178f;
    public static float field5642 = Float.intBitsToFloat(1062884053);

    /*
     * WARNING - void declaration
     */
    private static CallSite 6TiyTgo2n4aZyJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1496.LyVR1a7UQ7okvwSx(k2, -271763258));
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
                int a2 = Integer.parseInt(Class1496.LyVR1a7UQ7okvwSx(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1496.LyVR1a7UQ7okvwSx(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1496.LyVR1a7UQ7okvwSx(k2, -271763258) + " " + l2 + " " + m2);
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
        bp\u200e = "GRIM";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String LyVR1a7UQ7okvwSx(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 9851 : 9852;
            block5: while (true) {
                switch (n2) {
                    case 9852: {
                        n2 = 9850;
                        continue block5;
                    }
                    case 9851: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

