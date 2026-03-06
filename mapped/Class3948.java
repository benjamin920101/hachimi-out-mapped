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

@HACHIMI_CLIENT(mv=100, d1={"\u961c\u9619\u9618\u961c\u961d\u961a\u9614\u961b", "\ub459\ub45c\ub458\ub45e\ub45d\ub459\ub45d\ub45b", "\uab31\uab36\uab34\uab32\uab31\uab3b\uab37\uab35", "\u726e\u7269\u7269\u7268\u726e\u726f\u726f\u726e", "\u8023\u8027\u8024\u8023\u8024\u8025\u8028\u8020", "\u96ca\u96cd\u96cf\u96cd\u96cd\u96c2\u96cb", "\u1405\u1402\u1404\u140c\u1401\u1401\u1402\u1406", "\u60a1\u60a9\u60a5\u60a5\u60a9\u60a4\u60a1\u60a6", "\ub050\ub05e\ub050\ub058\ub051\ub05a\ub05d", "\u90fe\u90f9\u90fe\u90fe\u90f8\u90fb\u90f9\u90fe", "\u618d\u618c\u618e\u6182\u6189\u618b\u618e", "\u0ac2\u0ac7\u0ac6\u0ac1\u0ac6\u0ac7\u0ac7\u0acc", "\u49b6\u49b4\u49b7\u49bb\u49b0\u49b1\u49bb\u49b0", "\u0298\u029c\u029a\u0299\u029f\u0291\u029a\u0299", "\u4889\u4888\u488b\u4889\u4888\u4880\u488d", "\ua0f1\ua0f3\ua0f5\ua0f2\ua0fd\ua0f2\ua0f4\ua0fd", "\u8911\u8916\u8915\u8912\u8911\u8912\u8913", "\u7f28\u7f29\u7f24\u7f25\u7f2d\u7f28\u7f2f\u7f2c"}, d2={"\u00d4\u00d7\u00c5\u20a8\u009a\u0098\u008e\u00ea\u00cc\u00c7\u00d0\u00c7\u0089\u00ca\u00c7\u00c8\u00c1\u0089\u00f5\u00d2\u00d4\u00cf\u00c8\u00c1\u009d\u008f\u00ea\u00cc\u00c7\u00d0\u00c7\u0089\u00ca\u00c7\u00c8\u00c1\u0089\u00f5\u00d2\u00d4\u00cf\u00c8\u00c1\u009d", "\u03e4\u03e7\u03f2\u2398\u03aa\u03a8\u03be\u03da\u03fc\u03f7\u03e0\u03f7\u03b9\u03fa\u03f7\u03f8\u03f1\u03b9\u03c5\u03e2\u03e4\u03ff\u03f8\u03f1\u03ad\u03bf\u03da\u03fc\u03f7\u03e0\u03f7\u03b9\u03fa\u03f7\u03f8\u03f1\u03b9\u03c5\u03e2\u03e4\u03ff\u03f8\u03f1\u03ad", "\u07e7\u07e4\u07f0\u279b\u07a9\u07ab\u07bd\u07d9\u07ff\u07f4\u07e3\u07f4\u07ba\u07f9\u07f4\u07fb\u07f2\u07ba\u07c6\u07e1\u07e7\u07fc\u07fb\u07f2\u07ae\u07bc\u07d9\u07ff\u07f4\u07e3\u07f4\u07ba\u07f9\u07f4\u07fb\u07f2\u07ba\u07c6\u07e1\u07e7\u07fc\u07fb\u07f2\u07ae", "\u02b6\u02b5\u02a2\u22ca\u02f8\u02fa\u02ec\u0288\u02ae\u02a5\u02b2\u02a5\u02eb\u02a8\u02a5\u02aa\u02a3\u02eb\u0297\u02b0\u02b6\u02ad\u02aa\u02a3\u02ff\u02ed\u0288\u02ae\u02a5\u02b2\u02a5\u02eb\u02a8\u02a5\u02aa\u02a3\u02eb\u0297\u02b0\u02b6\u02ad\u02aa\u02a3\u02ff", "\u0651\u060e\u0601\u0604\u0603\u0604\u0619\u0653\u0651\u0653\u0645\u0644\u063b", "\u0566\u0533\u0534\u0533\u052e\u0564\u0566\u0564\u0572\u0573\u050c", "\u06b2\u06b0\u06a1\u0696\u06b9\u06b4\u06a6\u06a6\u06e9\u06eb\u06fd\u06fc\u0699\u06bf\u06b4\u06a3\u06b4\u06fa\u06b9\u06b4\u06bb\u06b2\u06fa\u0696\u06b9\u06b4\u06a6\u06a6\u06ee", "\u0216\u021f\u020d\u0216\u023d\u0211\u021a\u021b\u0242\u0240\u0256\u0257\u0237", "\u0547\u0553\u0557\u0543\u054e\u0551\u051e\u051c\u050a\u056e\u0548\u0543\u0554\u0543\u050d\u054e\u0543\u054c\u0545\u050d\u056d\u0540\u0548\u0547\u0541\u0556\u0519\u050b\u0578", "\u0481\u048e\u048d\u048c\u0487\u04de\u04dc\u04ca\u04cb\u04ae\u0488\u0483\u0494\u0483\u04cd\u048e\u0483\u048c\u0485\u04cd\u04ad\u0480\u0488\u0487\u0481\u0496\u04d9", "\u03c0\u03db\u03e7\u03c0\u03c6\u03dd\u03da\u03d3\u0388\u038a\u039c\u039d\u03f8\u03de\u03d5\u03c2\u03d5\u039b\u03d8\u03d5\u03da\u03d3\u039b\u03e7\u03c0\u03c6\u03dd\u03da\u03d3\u038f", "\u0486\u0487\u049c\u0481\u048e\u0491\u04d4\u04d6\u04c0\u04c1\u04be", "\u0459\u0458\u0443\u045e\u0451\u044e\u0476\u045b\u045b\u040b\u0409\u041f\u041e\u0461", "\u00bd\u00ab\u00a3\u00be\u00f6\u00f4\u00e2\u00e3\u009c", "\u07da\u07cc\u07c4\u07d9\u0791\u0793\u0785\u07e7\u0784\u07fb", "\u064e\u0658\u0650\u064d\u0609\u0605\u0607\u0611\u0673\u0610\u066f", "\u0011\u0007\u000f\u0012ZXN,/O0", "\u01e0\u01ef\u01e8\u01e7\u01ea\u01ef\u01fc\u01e3\u01ba\u01b8\u01ae\u01af\u01d0"})
public final class Class3948 {
    public static float field8985;
    public static double field8986;
    public static float field8987;
    public static String field8988;

    static {
        field8987 = Float.intBitsToFloat(1057174686);
        field8985 = Float.intBitsToFloat(1049925672);
        field8988 = "id";
        C\u200e = "CONSOLE";
        field8986 = Double.longBitsToDouble(4604558707117588228L);
        aB\u200e = "Not enough experience levels.";
        aR\u200e = "GroundSpoof";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite IfxwWoZIR2a3lJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3948.L6NLJJgboOITjstc(k2, 5326653));
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
                int a2 = Integer.parseInt(Class3948.L6NLJJgboOITjstc(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3948.L6NLJJgboOITjstc(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3948.L6NLJJgboOITjstc(k2, 5326653) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String L6NLJJgboOITjstc(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

