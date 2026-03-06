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
@HACHIMI_CLIENT(mv=100, d1={"\u8dec\u8dea\u8dec\u8dea\u8def\u8ded\u8de2\u8de9", "\ubbd9\ubbdb\ubbd9\ubbd8\ubbdc\ubbd2\ubbd8\ubbdb", "\u96dd\u96db\u96db\u96dc\u96db\u96de\u96df", "\ude8e\ude8b\ude8f\ude8b\ude8c\ude84\ude89", "\ua453\ua453\ua455\ua45c\ua455\ua452\ua45c\ua45d", "\uce0c\uce0a\uce0a\uce02\uce0c\uce08\uce0f\uce0a", "\u97d4\u97d3\u97d6\u97d5\u97d7\u97d9\u97d3\u97d7", "\ub02c\ub02d\ub02f\ub028\ub029\ub02b\ub02c\ub029", "\u9a2b\u9a28\u9a2e\u9a2b\u9a26\u9a2f\u9a2b\u9a2d", "\u10cb\u10ce\u10ce\u10ca\u10cf\u10c4\u10c4\u10ca", "\u1d9e\u1d9a\u1d9e\u1d9c\u1d9a\u1d9f\u1d98\u1d98", "\u2687\u268a\u268a\u2684\u268b\u2681\u2680\u2683", "\u9644\u9645\u964d\u964e\u9649\u964d\u964b", "\u9fea\u9fef\u9fe9\u9fe8\u9fea\u9fea\u9fed\u9fe0", "\u1719\u171c\u171e\u171c\u1719\u171c\u171a\u171a", "\ud6f7\ud6f1\ud6f2\ud6f2\ud6f3\ud6f3\ud6f7\ud6f3", "\ube82\ube8d\ube82\ube83\ube84\ube8d\ube81\ube87"}, d2={"\u07b5\u07b2\u0796\u27cf\u07fd\u07ff\u07e9\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u0792\u07b5\u07b3\u07a8\u07af\u07a6\u07fa\u07e8\u078d\u07ab\u07a0\u07b7\u07a0\u07ee\u07ad\u07a0\u07af\u07a6\u07ee\u0792\u07b5\u07b3\u07a8\u07af\u07a6\u07fa", "\u0219\u021e\u0235\u2263\u0251\u0253\u0245\u0221\u0207\u020c\u021b\u020c\u0242\u0201\u020c\u0203\u020a\u0242\u023e\u0219\u021f\u0204\u0203\u020a\u0256\u0244\u0221\u0207\u020c\u021b\u020c\u0242\u0201\u020c\u0203\u020a\u0242\u023e\u0219\u021f\u0204\u0203\u020a\u0256", "\u069a\u069d\u06b7\u26e0\u06d2\u06d0\u06c6\u06a2\u0684\u068f\u0698\u068f\u06c1\u0682\u068f\u0680\u0689\u06c1\u06bd\u069a\u069c\u0687\u0680\u0689\u06d5\u06c7\u06a2\u0684\u068f\u0698\u068f\u06c1\u0682\u068f\u0680\u0689\u06c1\u06bd\u069a\u069c\u0687\u0680\u0689\u06d5", "\u057d\u0522\u052d\u0528\u052f\u0528\u0535\u057f\u057d\u057f\u0569\u0568\u0517", "\u0482\u04d7\u04d0\u04d7\u04ca\u0480\u0482\u0480\u0496\u0497\u04e8", "\u052e\u052c\u053d\u050a\u0525\u0528\u053a\u053a\u0575\u0577\u0561\u0560\u0505\u0523\u0528\u053f\u0528\u0566\u0525\u0528\u0527\u052e\u0566\u050a\u0525\u0528\u053a\u053a\u0572", "\u04cc\u04c5\u04d7\u04cc\u04e7\u04cb\u04c0\u04c1\u0498\u049a\u048c\u048d\u04ed", "\u0666\u0672\u0676\u0662\u066f\u0670\u063f\u063d\u062b\u064f\u0669\u0662\u0675\u0662\u062c\u066f\u0662\u066d\u0664\u062c\u064c\u0661\u0669\u0666\u0660\u0677\u0638\u062a\u0659", "\u00f1\u00fe\u00fd\u00fc\u00f7\u00ae\u00ac\u00ba\u00bb\u00de\u00f8\u00f3\u00e4\u00f3\u00bd\u00fe\u00f3\u00fc\u00f5\u00bd\u00dd\u00f0\u00f8\u00f7\u00f1\u00e6\u00a9", "\u0552\u0549\u0575\u0552\u0554\u054f\u0548\u0541\u051a\u0518\u050e\u050f\u056a\u054c\u0547\u0550\u0547\u0509\u054a\u0547\u0548\u0541\u0509\u0575\u0552\u0554\u054f\u0548\u0541\u051d", "\u0123\u0122\u0139\u0124\u012b\u0134\u0171\u0173\u0165\u0164\u011b", "\u0243\u0242\u0259\u0244\u024b\u0254\u026c\u0241\u0241\u0211\u0213\u0205\u0204\u027b", "\u07f2\u07e4\u07ec\u07f1\u07b9\u07bb\u07ad\u07ac\u07d3", "<*\"?wuc\u0001b\u001d", "\u064e\u0658\u0650\u064d\u0609\u0605\u0607\u0611\u0673\u0610\u066f", "\u07a4\u07b2\u07ba\u07a7\u07ef\u07ed\u07fb\u0799\u079a\u07fa\u0785", "\u01b6\u01b9\u01be\u01b1\u01bc\u01b9\u01aa\u01b5\u01ec\u01ee\u01f8\u01f9\u0186"})
public final class Class1589 {
    public static int field5939 = 70950828;
    public static double field5940 = Double.longBitsToDouble(4611321226857570894L);
    public static double field5941;
    public static double field5942;
    public static double field5943 = 0.18456124496367965;

    static {
        L\u200e = "HUD";
        ag\u200e = "<";
        field5942 = Double.longBitsToDouble(4589384005139066728L);
        field5941 = Double.longBitsToDouble(4600740459139594190L);
        bU\u200e = "Prevents rendering of bottle splash particles";
    }

    private static String 9TnJKC0bDOSukX8g(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 62qcVOL172nAGF(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1589.9TnJKC0bDOSukX8g(k2, -1298509318));
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
                int a2 = Integer.parseInt(Class1589.9TnJKC0bDOSukX8g(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1589.9TnJKC0bDOSukX8g(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1589.9TnJKC0bDOSukX8g(k2, -1298509318) + " " + l2 + " " + m2);
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

