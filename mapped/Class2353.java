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

@HACHIMI_CLIENT(mv=100, d1={"\u9cfe\u9cfe\u9cfa\u9cf4\u9cff\u9cfb", "\u6a56\u6a51\u6a5a\u6a54\u6a50\u6a57\u6a53\u6a5b", "\u5e97\u5e9c\u5e94\u5e9c\u5e95\u5e95\u5e91\u5e95", "\ua8da\ua8da\ua8dd\ua8dc\ua8dd\ua8de\ua8d8\ua8d1", "\uca06\uca04\uca04\uca02\uca06\uca0d\uca05\uca02", "\ubd4d\ubd4b\ubd49\ubd4f\ubd4b\ubd4b\ubd4c\ubd40", "\u2d45\u2d42\u2d48\u2d41\u2d44\u2d40\u2d45\u2d43", "\u6f8e\u6f8d\u6f86\u6f8a\u6f8d\u6f8b\u6f88\u6f89", "\u6c1e\u6c19\u6c1d\u6c11\u6c1a\u6c1f\u6c1b\u6c19", "\ue118\ue112\ue11b\ue11a\ue112\ue113\ue112\ue113", "\uc827\uc829\uc827\uc821\uc820\uc822\uc823\uc825", "\u499c\u499d\u499e\u4991\u4991\u4998\u499f\u499d", "\uc282\uc283\uc283\uc28f\uc283\uc28e\uc283\uc282", "\u94ab\u94aa\u94ac\u94a3\u94a2\u94ad\u94ae\u94af", "\u2199\u219e\u219b\u2190\u219e\u219f\u2191\u2199", "\u015c\u0150\u0156\u0157\u0153\u015c"}, d2={"\u030a\u0321\u0304\u2369\u035b\u0359\u034f\u032b\u030d\u0306\u0311\u0306\u0348\u030b\u0306\u0309\u0300\u0348\u0334\u0313\u0315\u030e\u0309\u0300\u035c\u034e\u032b\u030d\u0306\u0311\u0306\u0348\u030b\u0306\u0309\u0300\u0348\u0334\u0313\u0315\u030e\u0309\u0300\u035c", "\u0677\u065c\u067e\u2614\u0626\u0624\u0632\u0656\u0670\u067b\u066c\u067b\u0635\u0676\u067b\u0674\u067d\u0635\u0649\u066e\u0668\u0673\u0674\u067d\u0621\u0633\u0656\u0670\u067b\u066c\u067b\u0635\u0676\u067b\u0674\u067d\u0635\u0649\u066e\u0668\u0673\u0674\u067d\u0621", "\u0098\u00c7\u00c8\u00cd\u00ca\u00cd\u00d0\u009a\u0098\u009a\u008c\u008d\u00f2", "\u00ac\u00f9\u00fe\u00f9\u00e4\u00ae\u00ac\u00ae\u00b8\u00b9\u00c6", "\u0403\u0401\u0410\u0427\u0408\u0405\u0417\u0417\u0458\u045a\u044c\u044d\u0428\u040e\u0405\u0412\u0405\u044b\u0408\u0405\u040a\u0403\u044b\u0427\u0408\u0405\u0417\u0417\u045f", "\u0581\u0588\u059a\u0581\u05aa\u0586\u058d\u058c\u05d5\u05d7\u05c1\u05c0\u05a0", "\u02c3\u02d7\u02d3\u02c7\u02ca\u02d5\u029a\u0298\u028e\u02ea\u02cc\u02c7\u02d0\u02c7\u0289\u02ca\u02c7\u02c8\u02c1\u0289\u02e9\u02c4\u02cc\u02c3\u02c5\u02d2\u029d\u028f\u02fc", "\u0674\u067b\u0678\u0679\u0672\u062b\u0629\u063f\u063e\u065b\u067d\u0676\u0661\u0676\u0638\u067b\u0676\u0679\u0670\u0638\u0658\u0675\u067d\u0672\u0674\u0663\u062c", "\u0671\u066a\u0656\u0671\u0677\u066c\u066b\u0662\u0639\u063b\u062d\u062c\u0649\u066f\u0664\u0673\u0664\u062a\u0669\u0664\u066b\u0662\u062a\u0656\u0671\u0677\u066c\u066b\u0662\u063e", "\u017a\u017b\u0160\u017d\u0172\u016d\u0128\u012a\u013c\u013d\u0142", "\u06f0\u06f1\u06ea\u06f7\u06f8\u06e7\u06df\u06f2\u06f2\u06a2\u06a0\u06b6\u06b7\u06c8", "\u051d\u050b\u0503\u051e\u0556\u0554\u0542\u0543\u053c", "\u030b\u031d\u0315\u0308\u0340\u0342\u0354\u0336\u0355\u032a", "\u0670\u0666\u066e\u0673\u0637\u063b\u0639\u062f\u064d\u062e\u0651", "\u0473\u0465\u046d\u0470\u0438\u043a\u042c\u044e\u044d\u042d\u0452", "\u04ba\u04b5\u04b2\u04bd\u04b0\u04b5\u04a6\u04b9\u04e0\u04e2\u04f4\u04f5\u048a"})
public final class Class2353 {
    public static float field6795;
    public static double field6796;
    public static double field6797;
    public static float field6798;
    public static int field6799 = 305349877;

    private static String dYvLNqn0SlSIyetF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field6797 = Double.longBitsToDouble(4601081407223343028L);
        field6798 = Float.intBitsToFloat(0x3DCCCCCD);
        field6795 = Float.intBitsToFloat(1055985696);
        field6796 = Double.longBitsToDouble(4594446087740426416L);
        aD\u200e = "";
        aR\u200e = "MOUSE4";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite T67NBSxY7KKQ2a(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class2353.dYvLNqn0SlSIyetF(k2, 26517263));
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
                int a2 = Integer.parseInt(Class2353.dYvLNqn0SlSIyetF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class2353.dYvLNqn0SlSIyetF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class2353.dYvLNqn0SlSIyetF(k2, 26517263) + " " + l2 + " " + m2);
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

