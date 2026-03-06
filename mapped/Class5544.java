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

@HACHIMI_CLIENT(mv=100, d1={"\ua948\ua943\ua94e\ua94c\ua94e\ua94f\ua94e\ua94e", "\ub461\ub461\ub466\ub465\ub469\ub467\ub467\ub465", "\u6ef7\u6ef5\u6ef5\u6ef5\u6ef3\u6ef5\u6ef5\u6ef4", "\ude57\ude5c\ude50\ude56\ude52\ude53\ude51\ude5d", "\u9dfa\u9dfe\u9dfe\u9dfb\u9dff\u9dfc\u9dff\u9dfa", "\uc3d1\uc3d0\uc3d7\uc3d0\uc3d6\uc3dc\uc3d4\uc3d7", "\uba3f\uba3e\uba3d\uba3e\uba3b\uba3b\uba3e\uba3c", "\u10db\u10d0\u10de\u10db\u10da\u10db\u10de\u10db", "\u678b\u6784\u678f\u6784\u678c\u678e\u6789\u6785", "\u3048\u304f\u304d\u304d\u304c\u304a\u304c", "\ua4cb\ua4cc\ua4cf\ua4cb\ua4cb\ua4c5\ua4ce\ua4ce", "\u73ed\u73ee\u73ea\u73e9\u73ee\u73ef\u73ed\u73eb", "\ua17e\ua17d\ua17e\ua179\ua17b\ua17d\ua17c\ua17d", "\u97fe\u97f4\u97ff\u97fe\u97f4\u97f7\u97f3", "\udd16\udd18\udd1f\udd1b\udd17\udd1a\udd18"}, d2={"\u074f\u0740\u0761\u272d\u071f\u071d\u070b\u076f\u0749\u0742\u0755\u0742\u070c\u074f\u0742\u074d\u0744\u070c\u0770\u0757\u0751\u074a\u074d\u0744\u0718\u070a\u076f\u0749\u0742\u0755\u0742\u070c\u074f\u0742\u074d\u0744\u070c\u0770\u0757\u0751\u074a\u074d\u0744\u0718", "\u0216\u0249\u0246\u0243\u0244\u0243\u025e\u0214\u0216\u0214\u0202\u0203\u027c", "\u0695\u06c0\u06c7\u06c0\u06dd\u0697\u0695\u0697\u0681\u0680\u06ff", "\u032c\u032e\u033f\u0308\u0327\u032a\u0338\u0338\u0377\u0375\u0363\u0362\u0307\u0321\u032a\u033d\u032a\u0364\u0327\u032a\u0325\u032c\u0364\u0308\u0327\u032a\u0338\u0338\u0370", "\u0469\u0460\u0472\u0469\u0442\u046e\u0465\u0464\u043d\u043f\u0429\u0428\u0448", "\u01dd\u01c9\u01cd\u01d9\u01d4\u01cb\u0184\u0186\u0190\u01f4\u01d2\u01d9\u01ce\u01d9\u0197\u01d4\u01d9\u01d6\u01df\u0197\u01f7\u01da\u01d2\u01dd\u01db\u01cc\u0183\u0191\u01e2", "\u00fe\u00f1\u00f2\u00f3\u00f8\u00a1\u00a3\u00b5\u00b4\u00d1\u00f7\u00fc\u00eb\u00fc\u00b2\u00f1\u00fc\u00f3\u00fa\u00b2\u00d2\u00ff\u00f7\u00f8\u00fe\u00e9\u00a6", "\u05f5\u05ee\u05d2\u05f5\u05f3\u05e8\u05ef\u05e6\u05bd\u05bf\u05a9\u05a8\u05cd\u05eb\u05e0\u05f7\u05e0\u05ae\u05ed\u05e0\u05ef\u05e6\u05ae\u05d2\u05f5\u05f3\u05e8\u05ef\u05e6\u05ba", "\u00d6\u00d7\u00cc\u00d1\u00de\u00c1\u0084\u0086\u0090\u0091\u00ee", "\u05d6\u05d7\u05cc\u05d1\u05de\u05c1\u05f9\u05d4\u05d4\u0584\u0586\u0590\u0591\u05ee", "\u02ad\u02bb\u02b3\u02ae\u02e6\u02e4\u02f2\u02f3\u028c", "\u0558\u054e\u0546\u055b\u0513\u0511\u0507\u0565\u0506\u0579", "\u06af\u06b9\u06b1\u06ac\u06e8\u06e4\u06e6\u06f0\u0692\u06f1\u068e", "\u02fd\u02eb\u02e3\u02fe\u02b6\u02b4\u02a2\u02c0\u02c3\u02a3\u02dc", "\u019a\u0195\u0192\u019d\u0190\u0195\u0186\u0199\u01c0\u01c2\u01d4\u01d5\u01aa"})
public final class Class5544 {
    public static float field10492;
    public static int field10493 = -1484737920;

    /*
     * WARNING - void declaration
     */
    private static CallSite IDbPyNZeIjVFH2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5544.bb888gUTWAJpmYFe(k2, -967288959));
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
                int a2 = Integer.parseInt(Class5544.bb888gUTWAJpmYFe(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5544.bb888gUTWAJpmYFe(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5544.bb888gUTWAJpmYFe(k2, -967288959) + " " + l2 + " " + m2);
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
        Q\u200e = "Break crystal before place";
        field10492 = Float.intBitsToFloat(1063106198);
    }

    private static String bb888gUTWAJpmYFe(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

