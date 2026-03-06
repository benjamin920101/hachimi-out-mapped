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

@HACHIMI_CLIENT(mv=100, d1={"\u3c1b\u3c13\u3c1a\u3c15\u3c13\u3c15\u3c10", "\uab43\uab49\uab43\uab46\uab42\uab48\uab41\uab46", "\u8a27\u8a26\u8a25\u8a2f\u8a2e\u8a24\u8a20\u8a2e", "\ubd1d\ubd1a\ubd17\ubd1a\ubd16\ubd16\ubd1d\ubd1c", "\ud567\ud567\ud561\ud56a\ud561\ud562\ud564\ud561", "\u7f9c\u7f9c\u7f9c\u7f9d\u7f9c\u7f93\u7f9c\u7f9f", "\u69c4\u69c1\u69c0\u69c0\u69c4\u69c0\u69ce\u69c1", "\u592b\u592b\u592a\u592f\u592b\u592b\u5928\u592e", "\u34a7\u34a3\u34a1\u34a2\u34a7\u34a7\u34a0\u34a7", "\u2f15\u2f1e\u2f13\u2f12\u2f13\u2f12\u2f12\u2f1f", "\ua830\ua837\ua83c\ua83d\ua83c\ua834\ua83d\ua833", "\ue482\ue480\ue487\ue489\ue482\ue482\ue480\ue483", "\u88d1\u88d1\u88d2\u88d0\u88d3\u88d5\u88da\u88d3", "\u4525\u452f\u4523\u452f\u4522\u452e\u4524\u4524", "\u52f5\u52f7\u52f1\u52f1\u52f1\u52f7\u52f7", "\ue7e6\ue7e6\ue7e6\ue7ea\ue7ea\ue7ea\ue7e4\ue7ea", "\u5886\u588c\u5882\u5881\u5882\u5887\u5887\u588d"}, d2={"\u04e0\u04eb\u04cc\u248d\u04bf\u04bd\u04ab\u04cf\u04e9\u04e2\u04f5\u04e2\u04ac\u04ef\u04e2\u04ed\u04e4\u04ac\u04d0\u04f7\u04f1\u04ea\u04ed\u04e4\u04b8\u04aa\u04cf\u04e9\u04e2\u04f5\u04e2\u04ac\u04ef\u04e2\u04ed\u04e4\u04ac\u04d0\u04f7\u04f1\u04ea\u04ed\u04e4\u04b8", "\u01e8\u01e3\u01db\u2185\u01b7\u01b5\u01a3\u01c7\u01e1\u01ea\u01fd\u01ea\u01a4\u01e7\u01ea\u01e5\u01ec\u01a4\u01d8\u01ff\u01f9\u01e2\u01e5\u01ec\u01b0\u01a2\u01c7\u01e1\u01ea\u01fd\u01ea\u01a4\u01e7\u01ea\u01e5\u01ec\u01a4\u01d8\u01ff\u01f9\u01e2\u01e5\u01ec\u01b0", "\u05f3\u05f8\u05c1\u259e\u05ac\u05ae\u05b8\u05dc\u05fa\u05f1\u05e6\u05f1\u05bf\u05fc\u05f1\u05fe\u05f7\u05bf\u05c3\u05e4\u05e2\u05f9\u05fe\u05f7\u05ab\u05b9\u05dc\u05fa\u05f1\u05e6\u05f1\u05bf\u05fc\u05f1\u05fe\u05f7\u05bf\u05c3\u05e4\u05e2\u05f9\u05fe\u05f7\u05ab", "\u053d\u0562\u056d\u0568\u056f\u0568\u0575\u053f\u053d\u053f\u0529\u0528\u0557", "w\"%\"?uwucb\u001d", "\u06f5\u06f7\u06e6\u06d1\u06fe\u06f3\u06e1\u06e1\u06ae\u06ac\u06ba\u06bb\u06de\u06f8\u06f3\u06e4\u06f3\u06bd\u06fe\u06f3\u06fc\u06f5\u06bd\u06d1\u06fe\u06f3\u06e1\u06e1\u06a9", "\u00cf\u00c6\u00d4\u00cf\u00e4\u00c8\u00c3\u00c2\u009b\u0099\u008f\u008e\u00ee", "\u07dd\u07c9\u07cd\u07d9\u07d4\u07cb\u0784\u0786\u0790\u07f4\u07d2\u07d9\u07ce\u07d9\u0797\u07d4\u07d9\u07d6\u07df\u0797\u07f7\u07da\u07d2\u07dd\u07db\u07cc\u0783\u0791\u07e2", "\u07e5\u07ea\u07e9\u07e8\u07e3\u07ba\u07b8\u07ae\u07af\u07ca\u07ec\u07e7\u07f0\u07e7\u07a9\u07ea\u07e7\u07e8\u07e1\u07a9\u07c9\u07e4\u07ec\u07e3\u07e5\u07f2\u07bd", "\u0782\u0799\u07a5\u0782\u0784\u079f\u0798\u0791\u07ca\u07c8\u07de\u07df\u07ba\u079c\u0797\u0780\u0797\u07d9\u079a\u0797\u0798\u0791\u07d9\u07a5\u0782\u0784\u079f\u0798\u0791\u07cd", "\u019e\u019f\u0184\u0199\u0196\u0189\u01cc\u01ce\u01d8\u01d9\u01a6", "\u00bd\u00bc\u00a7\u00ba\u00b5\u00aa\u0092\u00bf\u00bf\u00ef\u00ed\u00fb\u00fa\u0085", "\u0630\u0626\u062e\u0633\u067b\u0679\u066f\u066e\u0611", "\u065d\u064b\u0643\u065e\u0616\u0614\u0602\u0660\u0603\u067c", "\u044b\u045d\u0455\u0448\u040c\u0400\u0402\u0414\u0476\u0415\u046a", "\u04e4\u04f2\u04fa\u04e7\u04af\u04ad\u04bb\u04d9\u04da\u04ba\u04c5", "\u0744\u074b\u074c\u0743\u074e\u074b\u0758\u0747\u071e\u071c\u070a\u070b\u0774"})
public final class Class4128 {
    public static float field9582;
    public static float field9583;
    public static float field9584;
    public static int field9585 = 2081918749;
    public static float field9586;

    static {
        field9584 = Float.intBitsToFloat(1052876908);
        field9583 = Float.intBitsToFloat(1059667753);
        field9586 = Float.intBitsToFloat(1050308734);
        field9582 = Float.intBitsToFloat(1016892896);
        bc\u200e = "Renders a line connecting all previous positions";
        bt\u200e = "MovingDisable";
        bB\u200e = "PACKET";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite gja4JSbfvOyOdH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4128.yBIREqUMgt1mGoTN(k2, 1806342003));
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
                int a2 = Integer.parseInt(Class4128.yBIREqUMgt1mGoTN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4128.yBIREqUMgt1mGoTN(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4128.yBIREqUMgt1mGoTN(k2, 1806342003) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String yBIREqUMgt1mGoTN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

