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
@HACHIMI_CLIENT(mv=100, d1={"\u7600\u7600\u7601\u7603\u7603\u7609\u7602", "\ud4a5\ud4a2\ud4ac\ud4a0\ud4ad\ud4a0\ud4ad\ud4a0", "\ue7b6\ue7b5\ue7b2\ue7b7\ue7b1\ue7b1\ue7bf\ue7b3", "\ue59b\ue59b\ue59b\ue597\ue597\ue59c\ue59d\ue59e", "\u4fee\u4fe8\u4fe5\u4feb\u4fe8\u4fe4\u4fee\u4feb", "\uc54a\uc54f\uc54d\uc54a\uc540\uc541\uc541\uc549", "\u97a6\u97a0\u97ad\u97ad\u97a7\u97a5\u97ac\u97a3", "\uc931\uc93b\uc93c\uc93e\uc939\uc93f", "\u2214\u2214\u2210\u2213\u2217\u2212\u221c\u221c", "\u7c87\u7c85\u7c86\u7c86\u7c81\u7c82\u7c89\u7c81", "\u84c6\u84c7\u84cd\u84c5\u84c2\u84c7\u84cd\u84c7", "\u7861\u7861\u7863\u7865\u7862\u7861\u786d\u786d", "\u75c1\u75c2\u75ce\u75c2\u75ce\u75c0\u75ce\u75cf", "\u56b9\u56be\u56bd\u56b8\u56ba\u56bd\u56bd\u56be"}, d2={"0o`ebex202$%Z", "\u01ed\u01b8\u01bf\u01b8\u01a5\u01ef\u01ed\u01ef\u01f9\u01f8\u0187", "\u00bc\u00be\u00af\u0098\u00b7\u00ba\u00a8\u00a8\u00e7\u00e5\u00f3\u00f2\u0097\u00b1\u00ba\u00ad\u00ba\u00f4\u00b7\u00ba\u00b5\u00bc\u00f4\u0098\u00b7\u00ba\u00a8\u00a8\u00e0", "\u0707\u070e\u071c\u0707\u072c\u0700\u070b\u070a\u0753\u0751\u0747\u0746\u0726", "\u0109\u011d\u0119\u010d\u0100\u011f\u0150\u0152\u0144\u0120\u0106\u010d\u011a\u010d\u0143\u0100\u010d\u0102\u010b\u0143\u0123\u010e\u0106\u0109\u010f\u0118\u0157\u0145\u0136", "\u02c3\u02cc\u02cf\u02ce\u02c5\u029c\u029e\u0288\u0289\u02ec\u02ca\u02c1\u02d6\u02c1\u028f\u02cc\u02c1\u02ce\u02c7\u028f\u02ef\u02c2\u02ca\u02c5\u02c3\u02d4\u029b", "\u044b\u0450\u046c\u044b\u044d\u0456\u0451\u0458\u0403\u0401\u0417\u0416\u0473\u0455\u045e\u0449\u045e\u0410\u0453\u045e\u0451\u0458\u0410\u046c\u044b\u044d\u0456\u0451\u0458\u0404", "\u02ca\u02cb\u02d0\u02cd\u02c2\u02dd\u0298\u029a\u028c\u028d\u02f2", "\u06fc\u06fd\u06e6\u06fb\u06f4\u06eb\u06d3\u06fe\u06fe\u06ae\u06ac\u06ba\u06bb\u06c4", "\u07c0\u07d6\u07de\u07c3\u078b\u0789\u079f\u079e\u07e1", "\u01b6\u01a0\u01a8\u01b5\u01fd\u01ff\u01e9\u018b\u01e8\u0197", "\u0595\u0583\u058b\u0596\u05d2\u05de\u05dc\u05ca\u05a8\u05cb\u05b4", "\u04d9\u04cf\u04c7\u04da\u0492\u0490\u0486\u04e4\u04e7\u0487\u04f8", "\u04e2\u04ed\u04ea\u04e5\u04e8\u04ed\u04fe\u04e1\u04b8\u04ba\u04ac\u04ad\u04d2"})
public final class Class5611 {
    public static double field10703 = 0.5022946285908253;
    public static double field10704 = Double.longBitsToDouble(4606119784251378670L);

    private static String 7jg0bOCxCX6a61KK(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite NmNr4DWd0ClOQF(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5611.7jg0bOCxCX6a61KK(k2, -851401665));
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
                int a2 = Integer.parseInt(Class5611.7jg0bOCxCX6a61KK(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5611.7jg0bOCxCX6a61KK(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5611.7jg0bOCxCX6a61KK(k2, -851401665) + " " + l2 + " " + m2);
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

