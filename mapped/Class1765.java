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
@HACHIMI_CLIENT(mv=100, d1={"\u79e3\u79e0\u79e0\u79e1\u79e6\u79ed\u79ed\u79ec", "\u9938\u9937\u993d\u993e\u993d\u9937\u9939\u993d", "\u971e\u9718\u9713\u971a\u9713\u971d\u971c\u971b", "\udb0a\udb0d\udb0d\udb0c\udb0e\udb0d\udb09\udb0e", "\uaf1e\uaf1f\uaf1f\uaf1a\uaf1f\uaf1b\uaf1d\uaf1c", "\uabf0\uabf6\uabf6\uabf8\uabf0\uabf8\uabf4\uabf4", "\u8229\u8227\u822d\u8227\u822a\u8229\u822c\u822c", "\u8fc0\u8fc1\u8fcd\u8fcd\u8fcd\u8fcd\u8fc0\u8fc5", "\ua168\ua167\ua16c\ua16a\ua168\ua16b\ua16a\ua16a", "\uc588\uc58a\uc58d\uc58b\uc58c\uc582\uc583\uc58d", "\u34a1\u34a6\u34a1\u34a6\u34a5\u34a0\u34a4\u34a1", "\u311b\u311b\u311b\u311f\u3117\u3119\u311f\u311a", "\u26f1\u26f4\u26f6\u26fb\u26f7\u26fb\u26f2\u26f7", "\u514a\u514b\u5149\u5148\u514e\u5148\u514d\u5146", "\ud191\ud190\ud196\ud192\ud193\ud190\ud191\ud193"}, d2={"\u02a2\u0298\u0284\u22c0\u02f2\u02f0\u02e6\u0282\u02a4\u02af\u02b8\u02af\u02e1\u02a2\u02af\u02a0\u02a9\u02e1\u029d\u02ba\u02bc\u02a7\u02a0\u02a9\u02f5\u02e7\u0282\u02a4\u02af\u02b8\u02af\u02e1\u02a2\u02af\u02a0\u02a9\u02e1\u029d\u02ba\u02bc\u02a7\u02a0\u02a9\u02f5", "\u0495\u04ca\u04c5\u04c0\u04c7\u04c0\u04dd\u0497\u0495\u0497\u0481\u0480\u04ff", "N\u001b\u001c\u001b\u0006LNLZ[$", "/-<\u000b$);;tv`a\u0004\")>)g$)&/g\u000b$);;s", "\u0514\u051d\u050f\u0514\u053f\u0513\u0518\u0519\u0540\u0542\u0554\u0555\u0535", "\u05df\u05cb\u05cf\u05db\u05d6\u05c9\u0586\u0584\u0592\u05f6\u05d0\u05db\u05cc\u05db\u0595\u05d6\u05db\u05d4\u05dd\u0595\u05f5\u05d8\u05d0\u05df\u05d9\u05ce\u0581\u0593\u05e0", "\u04ee\u04e1\u04e2\u04e3\u04e8\u04b1\u04b3\u04a5\u04a4\u04c1\u04e7\u04ec\u04fb\u04ec\u04a2\u04e1\u04ec\u04e3\u04ea\u04a2\u04c2\u04ef\u04e7\u04e8\u04ee\u04f9\u04b6", "\u03ab\u03b0\u038c\u03ab\u03ad\u03b6\u03b1\u03b8\u03e3\u03e1\u03f7\u03f6\u0393\u03b5\u03be\u03a9\u03be\u03f0\u03b3\u03be\u03b1\u03b8\u03f0\u038c\u03ab\u03ad\u03b6\u03b1\u03b8\u03e4", "_^EXWH\r\u000f\u0019\u0018g", "\u00f1\u00f0\u00eb\u00f6\u00f9\u00e6\u00de\u00f3\u00f3\u00a3\u00a1\u00b7\u00b6\u00c9", "\u0132\u0124\u012c\u0131\u0179\u017b\u016d\u016c\u0113", "\u073b\u072d\u0725\u0738\u0770\u0772\u0764\u0706\u0765\u071a", "\u04c1\u04d7\u04df\u04c2\u0486\u048a\u0488\u049e\u04fc\u049f\u04e0", "\u0116\u0100\u0108\u0115\u015d\u015f\u0149\u012b\u0128\u0148\u0137", "\u02c3\u02cc\u02cb\u02c4\u02c9\u02cc\u02df\u02c0\u0299\u029b\u028d\u028c\u02f3"})
public final class Class1765 {
    public static double field6613 = Double.longBitsToDouble(4600341430126869186L);
    public static float field6614 = Float.intBitsToFloat(1051917738);

    private static String 2Koc9ysibeyufKCG(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite O4owDWXFYPa9t9(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1765.2Koc9ysibeyufKCG(k2, 1851636998));
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
                int a2 = Integer.parseInt(Class1765.2Koc9ysibeyufKCG(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1765.2Koc9ysibeyufKCG(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1765.2Koc9ysibeyufKCG(k2, 1851636998) + " " + l2 + " " + m2);
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
        bk\u200e = "How many entities to target at once";
    }
}

