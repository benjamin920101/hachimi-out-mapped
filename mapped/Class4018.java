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
@HACHIMI_CLIENT(mv=100, d1={"\u34bf\u34bc\u34bf\u34be\u34bb\u34b5\u34ba\u34b9", "\u1e30\u1e30\u1e3f\u1e32\u1e3f\u1e31\u1e33\u1e32", "\ud7ff\ud7ff\ud7ff\ud7f0\ud7f0\ud7fc\ud7fb\ud7fd", "\u03b4\u03b7\u03b6\u03b4\u03b1\u03b0\u03b3\u03b2", "\u104e\u104b\u104e\u104f\u1048\u104e\u104c\u1041", "\u8dcf\u8dc8\u8dcf\u8dce\u8dce\u8dc1\u8dcd\u8dc9", "\u8022\u802c\u802c\u802c\u8024\u8022\u802c\u8024", "\u5ef8\u5efe\u5efc\u5efc\u5efb\u5efa\u5ef9", "\ud607\ud60c\ud604\ud606\ud600\ud602\ud606", "\u734e\u734f\u734d\u734c\u734c\u734b\u734a\u7349", "\u5b7c\u5b79\u5b71\u5b71\u5b7c\u5b79\u5b7d\u5b7e", "\u1112\u1116\u1117\u1113\u1113\u1110\u1113\u1117", "@ANECCBG", "\u07fe\u07f4\u07fb\u07fd\u07fa\u07f9\u07fd\u07ff"}, d2={"\u0391\u03ce\u03c1\u03c4\u03c3\u03c4\u03d9\u0393\u0391\u0393\u0385\u0384\u03fb", "\u013e\u016b\u016c\u016b\u0176\u013c\u013e\u013c\u012a\u012b\u0154", "_]L{TYKK\u0004\u0006\u0010\u0011tRYNY\u0017TYV_\u0017{TYKK\u0003", "\u0562\u056b\u0579\u0562\u0549\u0565\u056e\u056f\u0536\u0534\u0522\u0523\u0543", "\u02a7\u02b3\u02b7\u02a3\u02ae\u02b1\u02fe\u02fc\u02ea\u028e\u02a8\u02a3\u02b4\u02a3\u02ed\u02ae\u02a3\u02ac\u02a5\u02ed\u028d\u02a0\u02a8\u02a7\u02a1\u02b6\u02f9\u02eb\u0298", "\u047b\u0474\u0477\u0476\u047d\u0424\u0426\u0430\u0431\u0454\u0472\u0479\u046e\u0479\u0437\u0474\u0479\u0476\u047f\u0437\u0457\u047a\u0472\u047d\u047b\u046c\u0423", "\u0416\u040d\u0431\u0416\u0410\u040b\u040c\u0405\u045e\u045c\u044a\u044b\u042e\u0408\u0403\u0414\u0403\u044d\u040e\u0403\u040c\u0405\u044d\u0431\u0416\u0410\u040b\u040c\u0405\u0459", "\u063b\u063a\u0621\u063c\u0633\u062c\u0669\u066b\u067d\u067c\u0603", "\u015e\u015f\u0144\u0159\u0156\u0149\u0171\u015c\u015c\u010c\u010e\u0118\u0119\u0166", "\u05a6\u05b0\u05b8\u05a5\u05ed\u05ef\u05f9\u05f8\u0587", "\u02a4\u02b2\u02ba\u02a7\u02ef\u02ed\u02fb\u0299\u02fa\u0285", "\u010e\u0118\u0110\u010d\u0149\u0145\u0147\u0151\u0133\u0150\u012f", "\u0491\u0487\u048f\u0492\u04da\u04d8\u04ce\u04ac\u04af\u04cf\u04b0", "\u04d9\u04d6\u04d1\u04de\u04d3\u04d6\u04c5\u04da\u0483\u0481\u0497\u0496\u04e9"})
public final class Class4018 {
    public static int field9234 = 1;
    public static double field9235;
    public static double field9236;
    public static double field9237 = 0.3270395923099779;
    public static int field9238 = -770061710;
    public static int field9239 = -1211501938;

    private static String fg5JXkvdzyIkzcrE(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field9236 = Double.longBitsToDouble(4602678819172646912L);
        field9235 = Double.longBitsToDouble(4603936380995498258L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 0vNd2bzYvDoUvT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4018.fg5JXkvdzyIkzcrE(k2, -283614122));
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
                int a2 = Integer.parseInt(Class4018.fg5JXkvdzyIkzcrE(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4018.fg5JXkvdzyIkzcrE(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4018.fg5JXkvdzyIkzcrE(k2, -283614122) + " " + l2 + " " + m2);
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

