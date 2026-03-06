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
@HACHIMI_CLIENT(mv=100, d1={"\u6eae\u6eab\u6eaa\u6eac\u6ea8\u6ea9\u6eaf\u6ea4", "\u6f31\u6f36\u6f3a\u6f30\u6f36\u6f34\u6f32\u6f37", "\uaca8\uaca8\uacac\uacab\uacac\uaca8\uaca2\uaca3", "\uc645\uc646\uc645\uc640\uc644\uc64c\uc643\uc641", "\ua7aa\ua7ac\ua7a8\ua7a1\ua7a8\ua7ac\ua7aa\ua7ac", "\udcc2\udcc0\udcc7\udcc5\udccc\udcc1\udcc2\udcc3", "\uc619\uc617\uc619\uc61f\uc616\uc61f\uc61b", "\u4995\u4990\u4993\u4998\u4990\u4999\u4994\u4991", "\u97ae\u97ac\u97aa\u97ac\u97a9\u97aa\u97ad\u97ac", "\ub807\ub806\ub806\ub80a\ub800\ub800\ub807\ub800", "\u2d19\u2d12\u2d1f\u2d18\u2d19\u2d1c\u2d19\u2d1a", "\u1b2f\u1b2a\u1b29\u1b2b\u1b28\u1b2b\u1b2e", "\ue65d\ue65c\ue65e\ue65f\ue658\ue65a\ue65a\ue65f", "\u0d6e\u0d6e\u0d6f\u0d6e\u0d6b\u0d62\u0d63\u0d6d", "\uc647\uc647\uc641\uc642\uc642\uc646\uc644", "\u7754\u7756\u775f\u7754\u7755\u7751"}, d2={"\u02c1\u02e2\u02fa\u22a1\u0293\u0291\u0287\u02e3\u02c5\u02ce\u02d9\u02ce\u0280\u02c3\u02ce\u02c1\u02c8\u0280\u02fc\u02db\u02dd\u02c6\u02c1\u02c8\u0294\u0286\u02e3\u02c5\u02ce\u02d9\u02ce\u0280\u02c3\u02ce\u02c1\u02c8\u0280\u02fc\u02db\u02dd\u02c6\u02c1\u02c8\u0294", "\u03f8\u03db\u03c0\u2398\u03aa\u03a8\u03be\u03da\u03fc\u03f7\u03e0\u03f7\u03b9\u03fa\u03f7\u03f8\u03f1\u03b9\u03c5\u03e2\u03e4\u03ff\u03f8\u03f1\u03ad\u03bf\u03da\u03fc\u03f7\u03e0\u03f7\u03b9\u03fa\u03f7\u03f8\u03f1\u03b9\u03c5\u03e2\u03e4\u03ff\u03f8\u03f1\u03ad", "\u02bd\u02e2\u02ed\u02e8\u02ef\u02e8\u02f5\u02bf\u02bd\u02bf\u02a9\u02a8\u02d7", "\u019a\u01cf\u01c8\u01cf\u01d2\u0198\u019a\u0198\u018e\u018f\u01f0", "\u013c\u013e\u012f\u0118\u0137\u013a\u0128\u0128\u0167\u0165\u0173\u0172\u0117\u0131\u013a\u012d\u013a\u0174\u0137\u013a\u0135\u013c\u0174\u0118\u0137\u013a\u0128\u0128\u0160", "\u0722\u072b\u0739\u0722\u0709\u0725\u072e\u072f\u0776\u0774\u0762\u0763\u0703", "\u06ce\u06da\u06de\u06ca\u06c7\u06d8\u0697\u0695\u0683\u06e7\u06c1\u06ca\u06dd\u06ca\u0684\u06c7\u06ca\u06c5\u06cc\u0684\u06e4\u06c9\u06c1\u06ce\u06c8\u06df\u0690\u0682\u06f1", "\u06b0\u06bf\u06bc\u06bd\u06b6\u06ef\u06ed\u06fb\u06fa\u069f\u06b9\u06b2\u06a5\u06b2\u06fc\u06bf\u06b2\u06bd\u06b4\u06fc\u069c\u06b1\u06b9\u06b6\u06b0\u06a7\u06e8", "\u00a2\u00b9\u0085\u00a2\u00a4\u00bf\u00b8\u00b1\u00ea\u00e8\u00fe\u00ff\u009a\u00bc\u00b7\u00a0\u00b7\u00f9\u00ba\u00b7\u00b8\u00b1\u00f9\u0085\u00a2\u00a4\u00bf\u00b8\u00b1\u00ed", "\u0106\u0107\u011c\u0101\u010e\u0111\u0154\u0156\u0140\u0141\u013e", "\u0176\u0177\u016c\u0171\u017e\u0161\u0159\u0174\u0174\u0124\u0126\u0130\u0131\u014e", "\u05cd\u05db\u05d3\u05ce\u0586\u0584\u0592\u0593\u05ec", "\u0784\u0792\u079a\u0787\u07cf\u07cd\u07db\u07b9\u07da\u07a5", "\u03ad\u03bb\u03b3\u03ae\u03ea\u03e6\u03e4\u03f2\u0390\u03f3\u038c", "DRZG\u000f\r\u001byz\u001ae", "\u02e6\u02e9\u02ee\u02e1\u02ec\u02e9\u02fa\u02e5\u02bc\u02be\u02a8\u02a9\u02d6"})
public final class Class3353 {
    public static float field7263;
    public static float field7264;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 7Dwtiplgb4zYg7(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3353.i9OQOAwfGPGQ9lYw(k2, 1397116461));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block2: while (true) {
            block9: {
                void e2;
                int n3 = f2 >= q2.length ? 16466 : 16465;
                while (true) {
                    int n4;
                    if ((n4 = n3) == 16465) {
                        try {
                            int a2 = Integer.parseInt(Class3353.i9OQOAwfGPGQ9lYw(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block9;
                        }
                    }
                    if (n4 != 16466) break block2;
                    n3 = 16464;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class3353.i9OQOAwfGPGQ9lYw(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3353.i9OQOAwfGPGQ9lYw(k2, 1397116461) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String i9OQOAwfGPGQ9lYw(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7264 = Float.intBitsToFloat(1064058192);
        ah\u200e = "Animations";
        ba\u200e = "Players";
        field7263 = Float.intBitsToFloat(1061072413);
    }
}

