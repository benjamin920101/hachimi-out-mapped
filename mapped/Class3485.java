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
@HACHIMI_CLIENT(mv=100, d1={"\ube94\ube97\ube90\ube92\ube96\ube93\ube94\ube92", "\u39f1\u39f7\u39fd\u39f6\u39f3\u39f7\u39f2\u39f7", "\uc58a\uc58d\uc584\uc58b\uc58c\uc58b\uc584\uc58a", "\ua2a3\ua2a6\ua2a7\ua2a6\ua2a4\ua2a0\ua2ac\ua2ad", "\u775e\u775c\u7755\u775a\u775d\u7754\u7759", "\u350b\u350f\u350d\u350c\u350f\u3500\u350a\u350a", "\u182a\u182c\u182d\u182a\u182f\u182e\u182c\u182c", "\u8387\u8385\u838d\u8381\u8382\u8386\u8382\u838c", "\u1b2c\u1b2a\u1b28\u1b2a\u1b2b\u1b2f\u1b28\u1b2b", "\u8f45\u8f46\u8f43\u8f41\u8f48\u8f40\u8f48\u8f45", "\u172f\u1729\u1729\u1723\u172a\u172f", "\ua248\ua247\ua24b\ua24a\ua24a\ua248\ua24f\ua249", "\u64a8\u64ad\u64a2\u64ae\u64aa\u64ab\u64a2\u64ae", "\ud063\ud065\ud062\ud060\ud060\ud067\ud064\ud064", "\uceaa\ucea9\uceaf\uceae\uceac\ucea7\uceac\uceaa", "\ua3ea\ua3e8\ua3ec\ua3ec\ua3ea\ua3e8\ua3e7\ua3ea"}, d2={"\u0299\u0293\u0299\u22e4\u02d6\u02d4\u02c2\u02a6\u0280\u028b\u029c\u028b\u02c5\u0286\u028b\u0284\u028d\u02c5\u02b9\u029e\u0298\u0283\u0284\u028d\u02d1\u02c3\u02a6\u0280\u028b\u029c\u028b\u02c5\u0286\u028b\u0284\u028d\u02c5\u02b9\u029e\u0298\u0283\u0284\u028d\u02d1", "\u03e0\u03ea\u03e7\u239d\u03af\u03ad\u03bb\u03df\u03f9\u03f2\u03e5\u03f2\u03bc\u03ff\u03f2\u03fd\u03f4\u03bc\u03c0\u03e7\u03e1\u03fa\u03fd\u03f4\u03a8\u03ba\u03df\u03f9\u03f2\u03e5\u03f2\u03bc\u03ff\u03f2\u03fd\u03f4\u03bc\u03c0\u03e7\u03e1\u03fa\u03fd\u03f4\u03a8", "\u062e\u0671\u067e\u067b\u067c\u067b\u0666\u062c\u062e\u062c\u063a\u063b\u0644", "\u03ba\u03ef\u03e8\u03ef\u03f2\u03b8\u03ba\u03b8\u03ae\u03af\u03d0", "\u0731\u0733\u0722\u0715\u073a\u0737\u0725\u0725\u076a\u0768\u077e\u077f\u071a\u073c\u0737\u0720\u0737\u0779\u073a\u0737\u0738\u0731\u0779\u0715\u073a\u0737\u0725\u0725\u076d", "\u04d3\u04da\u04c8\u04d3\u04f8\u04d4\u04df\u04de\u0487\u0485\u0493\u0492\u04f2", "\u067f\u066b\u066f\u067b\u0676\u0669\u0626\u0624\u0632\u0656\u0670\u067b\u066c\u067b\u0635\u0676\u067b\u0674\u067d\u0635\u0655\u0678\u0670\u067f\u0679\u066e\u0621\u0633\u0640", "\u0367\u0368\u036b\u036a\u0361\u0338\u033a\u032c\u032d\u0348\u036e\u0365\u0372\u0365\u032b\u0368\u0365\u036a\u0363\u032b\u034b\u0366\u036e\u0361\u0367\u0370\u033f", "\u06b3\u06a8\u0694\u06b3\u06b5\u06ae\u06a9\u06a0\u06fb\u06f9\u06ef\u06ee\u068b\u06ad\u06a6\u06b1\u06a6\u06e8\u06ab\u06a6\u06a9\u06a0\u06e8\u0694\u06b3\u06b5\u06ae\u06a9\u06a0\u06fc", "\u0251\u0250\u024b\u0256\u0259\u0246\u0203\u0201\u0217\u0216\u0269", "\u07c9\u07c8\u07d3\u07ce\u07c1\u07de\u07e6\u07cb\u07cb\u079b\u0799\u078f\u078e\u07f1", "\u00bf\u00a9\u00a1\u00bc\u00f4\u00f6\u00e0\u00e1\u009e", "\u04e2\u04f4\u04fc\u04e1\u04a9\u04ab\u04bd\u04df\u04bc\u04c3", "9/':~rpf\u0004g\u0018", "\u04e5\u04f3\u04fb\u04e6\u04ae\u04ac\u04ba\u04d8\u04db\u04bb\u04c4", "\u032f\u0320\u0327\u0328\u0325\u0320\u0333\u032c\u0375\u0377\u0361\u0360\u031f"})
public final class Class3485 {
    public static double field7659;
    public static float field7660;

    static {
        field7660 = Float.intBitsToFloat(1055029770);
        field7659 = Double.longBitsToDouble(4602395209408961304L);
        aI\u200e = "JumpFix";
        bg\u200e = "PhantomView";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 2U2poScqY1Ny8q(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3485.X1nBx0gDEavhyKd1(k2, -1618449824));
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
                int a2 = Integer.parseInt(Class3485.X1nBx0gDEavhyKd1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3485.X1nBx0gDEavhyKd1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3485.X1nBx0gDEavhyKd1(k2, -1618449824) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String X1nBx0gDEavhyKd1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

