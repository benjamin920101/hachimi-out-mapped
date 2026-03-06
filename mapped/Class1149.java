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
@HACHIMI_CLIENT(mv=100, d1={"\u5dc9\u5dcb\u5dc9\u5dca\u5dce\u5dcd\u5dc1\u5dce", "\u687d\u687f\u687a\u687d\u6872\u687e\u6873\u6873", "\ucf76\ucf76\ucf73\ucf70\ucf77\ucf70\ucf71\ucf7a", "\u31c8\u31cb\u31c8\u31ca\u31ca\u31c8\u31cf\u31cc", "\ucdd3\ucdd7\ucdd2\ucdd4\ucdd3\ucdd2\ucdd5\ucdd2", "\u2d74\u2d77\u2d77\u2d76\u2d71\u2d74\u2d74", "\u31e3\u31e8\u31e9\u31e0\u31e3\u31e4\u31e7\u31e3", "\u3032\u3035\u3035\u3037\u3036\u3034\u3035\u3035", "\u33c4\u33c9\u33c5\u33c6\u33c5\u33c2\u33c7", "\u6f34\u6f3a\u6f31\u6f3b\u6f3b\u6f3a\u6f37\u6f36", "\u2ee8\u2eee\u2eeb\u2eec\u2eee\u2eef\u2ee4\u2eea", "\uccdd\uccd8\uccdf\uccd3\uccdb\uccdd\uccdd\uccdf", "\u0bfc\u0bfe\u0bfc\u0bf0\u0bfc\u0bfe\u0bfa", "\u2af9\u2afe\u2afa\u2aff\u2af8\u2afa\u2af4\u2af8", "\u2017\u2013\u2012\u2017\u2015\u2015\u2011\u2015", "\u4de2\u4de1\u4de2\u4de5\u4dea\u4de6\u4de6\u4de2"}, d2={"\u03cd\u03c7\u03fb\u23b1\u0383\u0381\u0397\u03f3\u03d5\u03de\u03c9\u03de\u0390\u03d3\u03de\u03d1\u03d8\u0390\u03ec\u03cb\u03cd\u03d6\u03d1\u03d8\u0384\u0396\u03f3\u03d5\u03de\u03c9\u03de\u0390\u03d3\u03de\u03d1\u03d8\u0390\u03ec\u03cb\u03cd\u03d6\u03d1\u03d8\u0384", "\u009d\u0097\u00aa\u20e1\u00d3\u00d1\u00c7\u00a3\u0085\u008e\u0099\u008e\u00c0\u0083\u008e\u0081\u0088\u00c0\u00bc\u009b\u009d\u0086\u0081\u0088\u00d4\u00c6\u00a3\u0085\u008e\u0099\u008e\u00c0\u0083\u008e\u0081\u0088\u00c0\u00bc\u009b\u009d\u0086\u0081\u0088\u00d4", "\u0752\u070d\u0702\u0707\u0700\u0707\u071a\u0750\u0752\u0750\u0746\u0747\u0738", "\u06c8\u069d\u069a\u069d\u0680\u06ca\u06c8\u06ca\u06dc\u06dd\u06a2", "\u06dd\u06df\u06ce\u06f9\u06d6\u06db\u06c9\u06c9\u0686\u0684\u0692\u0693\u06f6\u06d0\u06db\u06cc\u06db\u0695\u06d6\u06db\u06d4\u06dd\u0695\u06f9\u06d6\u06db\u06c9\u06c9\u0681", "\u02dd\u02d4\u02c6\u02dd\u02f6\u02da\u02d1\u02d0\u0289\u028b\u029d\u029c\u02fc", "\u0768\u077c\u0778\u076c\u0761\u077e\u0731\u0733\u0725\u0741\u0767\u076c\u077b\u076c\u0722\u0761\u076c\u0763\u076a\u0722\u0742\u076f\u0767\u0768\u076e\u0779\u0736\u0724\u0757", "\u04eb\u04e4\u04e7\u04e6\u04ed\u04b4\u04b6\u04a0\u04a1\u04c4\u04e2\u04e9\u04fe\u04e9\u04a7\u04e4\u04e9\u04e6\u04ef\u04a7\u04c7\u04ea\u04e2\u04ed\u04eb\u04fc\u04b3", "\u036c\u0377\u034b\u036c\u036a\u0371\u0376\u037f\u0324\u0326\u0330\u0331\u0354\u0372\u0379\u036e\u0379\u0337\u0374\u0379\u0376\u037f\u0337\u034b\u036c\u036a\u0371\u0376\u037f\u0323", "\u0082\u0083\u0098\u0085\u008a\u0095\u00d0\u00d2\u00c4\u00c5\u00ba", "\u03c5\u03c4\u03df\u03c2\u03cd\u03d2\u03ea\u03c7\u03c7\u0397\u0395\u0383\u0382\u03fd", "\u0673\u0665\u066d\u0670\u0638\u063a\u062c\u062d\u0652", "\u0290\u0286\u028e\u0293\u02db\u02d9\u02cf\u02ad\u02ce\u02b1", "\u044e\u0458\u0450\u044d\u0409\u0405\u0407\u0411\u0473\u0410\u046f", "\u00b8\u00ae\u00a6\u00bb\u00f3\u00f1\u00e7\u0085\u0086\u00e6\u0099", "\u0408\u0407\u0400\u040f\u0402\u0407\u0414\u040b\u0452\u0450\u0446\u0447\u0438"})
public final class Class1149 {
    public static double field4601;
    public static double field4602;
    public static int field4603 = 7529578;

    /*
     * WARNING - void declaration
     */
    private static CallSite 6fa3FdTe7egW1e(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1149.60US7iSOhb8vY8ni(k2, -1207430493));
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
                int a2 = Integer.parseInt(Class1149.60US7iSOhb8vY8ni(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1149.60US7iSOhb8vY8ni(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1149.60US7iSOhb8vY8ni(k2, -1207430493) + " " + l2 + " " + m2);
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
        M\u200e = "_";
        bu\u200e = "Asynchronous";
        field4601 = Double.longBitsToDouble(4602436929405245762L);
        field4602 = Double.longBitsToDouble(4639270566145032192L);
    }

    private static String 60US7iSOhb8vY8ni(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

