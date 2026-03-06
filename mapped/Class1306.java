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
@HACHIMI_CLIENT(mv=100, d1={"\u9b41\u9b42\u9b44\u9b47\u9b40\u9b42\u9b4b\u9b40", "\ua689\ua68c\ua685\ua68c\ua688\ua68f\ua68a\ua68e", "\ue124\ue12e\ue121\ue121\ue124\ue127\ue125\ue12f", "\uc308\uc30e\uc309\uc30e\uc303\uc308\uc309\uc30e", "\u2f55\u2f55\u2f54\u2f51\u2f50\u2f53\u2f51\u2f59", "\u0816\u0812\u081c\u0816\u0815\u0810\u081d", "\u0ac9\u0ace\u0acd\u0ace\u0acb\u0aca\u0ace", "\u109c\u1090\u1091\u109c\u1090\u1099\u109c\u1099", "\u37ed\u37ec\u37ee\u37ee\u37ea\u37e2\u37e8\u37ec", "\u3035\u3038\u3039\u3031\u3030\u3038\u3035\u3030", "\u1c73\u1c75\u1c7e\u1c72\u1c70\u1c71\u1c70\u1c70", "\u3e2c\u3e20\u3e2a\u3e2a\u3e2d\u3e2f\u3e2f\u3e20", "\u0626\u0620\u0622\u0621\u062c\u0622\u0622", "\u1632\u1637\u1635\u163c\u1632\u1633\u163c", "\ubbc5\ubbc3\ubbc7\ubbc6\ubbc8\ubbc5\ubbc2\ubbc6", "\ua419\ua419\ua41f\ua41f\ua41c\ua41f\ua41d\ua41b", "\u598f\u5985\u5985\u5984\u5989\u598b\u598d\u5985", "\u2581\u258f\u258f\u258f\u2588\u2588\u258c"}, d2={"\u007f}B\u201d/-;_yrer<\u007fr}t<@gaz}t(:_yrer<\u007fr}t<@gaz}t(", "\u0570\u0572\u054e\u2512\u0520\u0522\u0534\u0550\u0576\u057d\u056a\u057d\u0533\u0570\u057d\u0572\u057b\u0533\u054f\u0568\u056e\u0575\u0572\u057b\u0527\u0535\u0550\u0576\u057d\u056a\u057d\u0533\u0570\u057d\u0572\u057b\u0533\u054f\u0568\u056e\u0575\u0572\u057b\u0527", "\u01e3\u01e1\u01dc\u2181\u01b3\u01b1\u01a7\u01c3\u01e5\u01ee\u01f9\u01ee\u01a0\u01e3\u01ee\u01e1\u01e8\u01a0\u01dc\u01fb\u01fd\u01e6\u01e1\u01e8\u01b4\u01a6\u01c3\u01e5\u01ee\u01f9\u01ee\u01a0\u01e3\u01ee\u01e1\u01e8\u01a0\u01dc\u01fb\u01fd\u01e6\u01e1\u01e8\u01b4", "\u0178\u017a\u0140\u211a\u0128\u012a\u013c\u0158\u017e\u0175\u0162\u0175\u013b\u0178\u0175\u017a\u0173\u013b\u0147\u0160\u0166\u017d\u017a\u0173\u012f\u013d\u0158\u017e\u0175\u0162\u0175\u013b\u0178\u0175\u017a\u0173\u013b\u0147\u0160\u0166\u017d\u017a\u0173\u012f", "\u02e1\u02be\u02b1\u02b4\u02b3\u02b4\u02a9\u02e3\u02e1\u02e3\u02f5\u02f4\u028b", "\u0479\u042c\u042b\u042c\u0431\u047b\u0479\u047b\u046d\u046c\u0413", "HJ[lCN\\\\\u0013\u0011\u0007\u0006cENYN\u0000CNAH\u0000lCN\\\\\u0014", "\u023b\u0232\u0220\u023b\u0210\u023c\u0237\u0236\u026f\u026d\u027b\u027a\u021a", "\u02d0\u02c4\u02c0\u02d4\u02d9\u02c6\u0289\u028b\u029d\u02f9\u02df\u02d4\u02c3\u02d4\u029a\u02d9\u02d4\u02db\u02d2\u029a\u02fa\u02d7\u02df\u02d0\u02d6\u02c1\u028e\u029c\u02ef", "\u06b7\u06b8\u06bb\u06ba\u06b1\u06e8\u06ea\u06fc\u06fd\u0698\u06be\u06b5\u06a2\u06b5\u06fb\u06b8\u06b5\u06ba\u06b3\u06fb\u069b\u06b6\u06be\u06b1\u06b7\u06a0\u06ef", "\u00ca\u00d1\u00ed\u00ca\u00cc\u00d7\u00d0\u00d9\u0082\u0080\u0096\u0097\u00f2\u00d4\u00df\u00c8\u00df\u0091\u00d2\u00df\u00d0\u00d9\u0091\u00ed\u00ca\u00cc\u00d7\u00d0\u00d9\u0085", "\u0384\u0385\u039e\u0383\u038c\u0393\u03d6\u03d4\u03c2\u03c3\u03bc", "\u04bc\u04bd\u04a6\u04bb\u04b4\u04ab\u0493\u04be\u04be\u04ee\u04ec\u04fa\u04fb\u0484", "\u0627\u0631\u0639\u0624\u066c\u066e\u0678\u0679\u0606", "\u0128\u013e\u0136\u012b\u0163\u0161\u0177\u0115\u0176\u0109", "\u065b\u064d\u0645\u0658\u061c\u0610\u0612\u0604\u0666\u0605\u067a", "\u024c\u025a\u0252\u024f\u0207\u0205\u0213\u0271\u0272\u0212\u026d", "\u0647\u0648\u064f\u0640\u064d\u0648\u065b\u0644\u061d\u061f\u0609\u0608\u0677"})
public final class Class1306 {
    public static float field5071;
    public static float field5072;
    public static String field5073;
    public static float field5074;
    public static float field5075;

    private static String 275Gvyy0xxo4as9J(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field5072 = Float.intBitsToFloat(1014333888);
        ac\u200e = "Delay";
        field5074 = Float.intBitsToFloat(0x43340000);
        field5071 = Float.intBitsToFloat(1049647234);
        field5075 = Float.intBitsToFloat(1057236372);
        bE\u200e = "glowRadius";
        field5073 = "-XBootclasspath";
        cb\u200e = "Delay to break crystals";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Q0s6Xp62vBOvix(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1306.275Gvyy0xxo4as9J(k2, 1368157447));
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
                int a2 = Integer.parseInt(Class1306.275Gvyy0xxo4as9J(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1306.275Gvyy0xxo4as9J(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1306.275Gvyy0xxo4as9J(k2, 1368157447) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

