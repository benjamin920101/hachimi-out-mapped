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

@HACHIMI_CLIENT(mv=100, d1={"\ue3e0\ue3e0\ue3e7\ue3e5\ue3e2\ue3ea\ue3e4\ue3ea", "\u4861\u4861\u4860\u486b\u486c\u4868\u486d", "\u598f\u598d\u598a\u598f\u5989\u598d\u5988", "\u791a\u7912\u7917\u7910\u7911\u7910\u7911", "\uca9d\uca93\uca9a\uca93\uca9e\uca9b\uca92\uca9a", "\u548c\u548e\u548c\u548f\u548f\u548b\u548f\u5489", "\uaa08\uaa0d\uaa06\uaa06\uaa06\uaa08\uaa06\uaa08", "\uab37\uab33\uab38\uab38\uab34\uab34\uab33\uab37", "\u3884\u3884\u3881\u3886\u3883\u3881\u3885\u3883", "\ub94b\ub949\ub949\ub945\ub945\ub94c\ub948\ub944", "\u7ceb\u7cef\u7cef\u7ceb\u7cec\u7ced\u7ce2\u7ce8", "\u8673\u8676\u8672\u8673\u8675\u8676\u8673\u8676", "\ub006\ub004\ub00a\ub007\ub004\ub00b\ub002\ub00a", "\u529d\u529d\u5298\u529a\u5292\u5292\u529b", "\ud2ab\ud2af\ud2a5\ud2a5\ud2ab\ud2a8\ud2a8\ud2af", "\u5661\u566f\u5661\u5664\u5666\u5660\u5661\u5660", "\u3759\u375c\u375a\u3755\u375b\u375d\u3755\u3759", "\u17ed\u17e5\u17ee\u17e8\u17ef\u17ec\u17ed\u17e5"}, d2={"\u0632\u063d\u0630\u265b\u0669\u066b\u067d\u0619\u063f\u0634\u0623\u0634\u067a\u0639\u0634\u063b\u0632\u067a\u0606\u0621\u0627\u063c\u063b\u0632\u066e\u067c\u0619\u063f\u0634\u0623\u0634\u067a\u0639\u0634\u063b\u0632\u067a\u0606\u0621\u0627\u063c\u063b\u0632\u066e", "\u0461\u046e\u0460\u2408\u043a\u0438\u042e\u044a\u046c\u0467\u0470\u0467\u0429\u046a\u0467\u0468\u0461\u0429\u0455\u0472\u0474\u046f\u0468\u0461\u043d\u042f\u044a\u046c\u0467\u0470\u0467\u0429\u046a\u0467\u0468\u0461\u0429\u0455\u0472\u0474\u046f\u0468\u0461\u043d", "\u0538\u0537\u0538\u2551\u0563\u0561\u0577\u0513\u0535\u053e\u0529\u053e\u0570\u0533\u053e\u0531\u0538\u0570\u050c\u052b\u052d\u0536\u0531\u0538\u0564\u0576\u0513\u0535\u053e\u0529\u053e\u0570\u0533\u053e\u0531\u0538\u0570\u050c\u052b\u052d\u0536\u0531\u0538\u0564", "\u01a1\u01ae\u01ae\u21c8\u01fa\u01f8\u01ee\u018a\u01ac\u01a7\u01b0\u01a7\u01e9\u01aa\u01a7\u01a8\u01a1\u01e9\u0195\u01b2\u01b4\u01af\u01a8\u01a1\u01fd\u01ef\u018a\u01ac\u01a7\u01b0\u01a7\u01e9\u01aa\u01a7\u01a8\u01a1\u01e9\u0195\u01b2\u01b4\u01af\u01a8\u01a1\u01fd", "\u0358\u0307\u0308\u030d\u030a\u030d\u0310\u035a\u0358\u035a\u034c\u034d\u0332", "\u0187\u01d2\u01d5\u01d2\u01cf\u0185\u0187\u0185\u0193\u0192\u01ed", "\r\u000f\u001e)\u0006\u000b\u0019\u0019VTBC&\u0000\u000b\u001c\u000bE\u0006\u000b\u0004\rE)\u0006\u000b\u0019\u0019Q", "\u02f3\u02fa\u02e8\u02f3\u02d8\u02f4\u02ff\u02fe\u02a7\u02a5\u02b3\u02b2\u02d2", "\u05d0\u05c4\u05c0\u05d4\u05d9\u05c6\u0589\u058b\u059d\u05f9\u05df\u05d4\u05c3\u05d4\u059a\u05d9\u05d4\u05db\u05d2\u059a\u05fa\u05d7\u05df\u05d0\u05d6\u05c1\u058e\u059c\u05ef", "\u05d6\u05d9\u05da\u05db\u05d0\u0589\u058b\u059d\u059c\u05f9\u05df\u05d4\u05c3\u05d4\u059a\u05d9\u05d4\u05db\u05d2\u059a\u05fa\u05d7\u05df\u05d0\u05d6\u05c1\u058e", "\u0596\u058d\u05b1\u0596\u0590\u058b\u058c\u0585\u05de\u05dc\u05ca\u05cb\u05ae\u0588\u0583\u0594\u0583\u05cd\u058e\u0583\u058c\u0585\u05cd\u05b1\u0596\u0590\u058b\u058c\u0585\u05d9", "\u0169\u0168\u0173\u016e\u0161\u017e\u013b\u0139\u012f\u012e\u0151", "\u0261\u0260\u027b\u0266\u0269\u0276\u024e\u0263\u0263\u0233\u0231\u0227\u0226\u0259", "\u0387\u0391\u0399\u0384\u03cc\u03ce\u03d8\u03d9\u03a6", "\u0537\u0521\u0529\u0534\u057c\u057e\u0568\u050a\u0569\u0516", "\u065d\u064b\u0643\u065e\u061a\u0616\u0614\u0602\u0660\u0603\u067c", "\u059d\u058b\u0583\u059e\u05d6\u05d4\u05c2\u05a0\u05a3\u05c3\u05bc", "\u007fpwxupc|%'10O"})
public final class Class3733 {
    public static float field8425;
    public static int field8426 = 531475731;
    public static double field8427;
    public static double field8428;

    /*
     * WARNING - void declaration
     */
    private static CallSite v6V6GpJ5FvTJAZ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3733.q6eO3TAlhbI5vDRW(k2, -2045079488));
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
                int a2 = Integer.parseInt(Class3733.q6eO3TAlhbI5vDRW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3733.q6eO3TAlhbI5vDRW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3733.q6eO3TAlhbI5vDRW(k2, -2045079488) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String q6eO3TAlhbI5vDRW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8428 = Double.longBitsToDouble(4622945017495814144L);
        m\u200e = "\u00a7fServer not responding \u00a77(\u00a7r%s.s\u00a77)";
        Z\u200e = "Decide which swap mode to use";
        aA\u200e = "Size";
        bh\u200e = "Only throw pearl while on ground";
        field8427 = Double.longBitsToDouble(4590138854858425264L);
        field8425 = Float.intBitsToFloat(1112014848);
    }
}

