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
@HACHIMI_CLIENT(mv=100, d1={"\u4336\u4332\u4330\u4332\u4334\u4330\u4332\u4330", "\u2862\u286c\u286d\u2865\u2863\u2863\u2863\u2867", "\u1548\u154f\u154c\u1546\u1547\u1548\u154b\u154b", "\u7b6e\u7b6a\u7b68\u7b6b\u7b62\u7b63\u7b6d", "\u239c\u2398\u2398\u239a\u239b\u239c\u2398", "\u6784\u6786\u6782\u6787\u6781\u6783\u6780\u678c", "\u74ff\u74f2\u74fe\u74f9\u74fa\u74fc\u74fd\u74fd", "\u2aff\u2af9\u2af4\u2afc\u2af5\u2af8", "\ua1f4\ua1f6\ua1f6\ua1f0\ua1f1\ua1ff\ua1f3", "\ub99a\ub995\ub99d\ub99f\ub99f\ub99a\ub999\ub99e", "\u5c4a\u5c42\u5c44\u5c43\u5c41\u5c41", "\u37e8\u37e6\u37e6\u37e8\u37ec\u37ef\u37e7\u37ea", "\ua463\ua466\ua467\ua466\ua460\ua465\ua46f\ua460", "\u2c38\u2c33\u2c35\u2c33\u2c37\u2c31\u2c31", "\ubcee\ubcec\ubcec\ubce7\ubce6\ubcee\ubcee\ubce6"}, d2={"\u02e9\u02ff\u02c4\u228b\u02b9\u02bb\u02ad\u02c9\u02ef\u02e4\u02f3\u02e4\u02aa\u02e9\u02e4\u02eb\u02e2\u02aa\u02d6\u02f1\u02f7\u02ec\u02eb\u02e2\u02be\u02ac\u02c9\u02ef\u02e4\u02f3\u02e4\u02aa\u02e9\u02e4\u02eb\u02e2\u02aa\u02d6\u02f1\u02f7\u02ec\u02eb\u02e2\u02be", "\u068b\u06d4\u06db\u06de\u06d9\u06de\u06c3\u0689\u068b\u0689\u069f\u069e\u06e1", "\u03bc\u03e9\u03ee\u03e9\u03f4\u03be\u03bc\u03be\u03a8\u03a9\u03d6", "\u022a\u0228\u0239\u020e\u0221\u022c\u023e\u023e\u0271\u0273\u0265\u0264\u0201\u0227\u022c\u023b\u022c\u0262\u0221\u022c\u0223\u022a\u0262\u020e\u0221\u022c\u023e\u023e\u0276", "\u0773\u077a\u0768\u0773\u0758\u0774\u077f\u077e\u0727\u0725\u0733\u0732\u0752", "\u0701\u0715\u0711\u0705\u0708\u0717\u0758\u075a\u074c\u0728\u070e\u0705\u0712\u0705\u074b\u0708\u0705\u070a\u0703\u074b\u072b\u0706\u070e\u0701\u0707\u0710\u075f\u074d\u073e", "\u0589\u0586\u0585\u0584\u058f\u05d6\u05d4\u05c2\u05c3\u05a6\u0580\u058b\u059c\u058b\u05c5\u0586\u058b\u0584\u058d\u05c5\u05a5\u0588\u0580\u058f\u0589\u059e\u05d1", "\u045c\u0447\u047b\u045c\u045a\u0441\u0446\u044f\u0414\u0416\u0400\u0401\u0464\u0442\u0449\u045e\u0449\u0407\u0444\u0449\u0446\u044f\u0407\u047b\u045c\u045a\u0441\u0446\u044f\u0413", "\u0143\u0142\u0159\u0144\u014b\u0154\u0111\u0113\u0105\u0104\u017b", "\u0789\u0788\u0793\u078e\u0781\u079e\u07a6\u078b\u078b\u07db\u07d9\u07cf\u07ce\u07b1", "\u056c\u057a\u0572\u056f\u0527\u0525\u0533\u0532\u054d", "\u0118\u010e\u0106\u011b\u0153\u0151\u0147\u0125\u0146\u0139", "\u0131\u0127\u012f\u0132\u0176\u017a\u0178\u016e\u010c\u016f\u0110", "\u018b\u019d\u0195\u0188\u01c0\u01c2\u01d4\u01b6\u01b5\u01d5\u01aa", "\u0096\u0099\u009e\u0091\u009c\u0099\u008a\u0095\u00cc\u00ce\u00d8\u00d9\u00a6"})
public final class Class1575 {
    public static int field5882 = -186614954;
    public static int field5883 = 0;
    public static float field5884 = 0.7469781f;
    public static float field5885;

    static {
        aM\u200e = "Apply velocity";
        field5885 = Float.intBitsToFloat(1020165696);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 4hdaJdD4ym9Ku4Q8(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 20790 : 20789;
            block5: while (true) {
                switch (n2) {
                    case 20790: {
                        n2 = 20788;
                        continue block5;
                    }
                    case 20789: {
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

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite epkptbS7kqt0yt(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1575.4hdaJdD4ym9Ku4Q8(k2, -1391292212));
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
                int a2 = Integer.parseInt(Class1575.4hdaJdD4ym9Ku4Q8(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1575.4hdaJdD4ym9Ku4Q8(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1575.4hdaJdD4ym9Ku4Q8(k2, -1391292212) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 != 1 ? 23027 : 23026;
        block7: while (true) {
            switch (n3) {
                case 23027: {
                    n3 = 23025;
                    continue block7;
                }
                case 23026: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

