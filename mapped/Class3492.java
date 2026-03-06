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

@HACHIMI_CLIENT(mv=100, d1={"\u597d\u5979\u5978\u597c\u5972\u597b\u5978\u5973", "\u70ca\u70ce\u70ca\u70c8\u70c6\u70cf\u70cc\u70c7", "\u6ff7\u6ff5\u6ff4\u6ff7\u6ff3\u6ff6\u6ff4", "\u5891\u5897\u5895\u5893\u589c\u589c\u5896\u5890", "\u9b31\u9b34\u9b35\u9b32\u9b37\u9b36\u9b34\u9b37", "\u79cf\u79ce\u79c5\u79cc\u79cd\u79cf", "\u0334\u0338\u0335\u0339\u0339\u0332\u0338\u0330", "\u144b\u144f\u1447\u1449\u144e\u144c\u144b\u1446", "\u2f26\u2f22\u2f20\u2f26\u2f23\u2f22\u2f2b\u2f26", "\u6d4a\u6d4a\u6d49\u6d49\u6d4f\u6d4c\u6d4f\u6d48", "\ucd55\ucd57\ucd5f\ucd5e\ucd50\ucd52\ucd54\ucd54", "\u5c9f\u5c9d\u5c95\u5c98\u5c9a\u5c9e\u5c9b\u5c9a", "\u08dd\u08dd\u08dd\u08d8\u08d1\u08dc\u08d8\u08dc", "\u41cb\u41c0\u41c1\u41ce\u41cf\u41c9\u41ce\u41ce", "\ubf7e\ubf7d\ubf7c\ubf7d\ubf7f\ubf7c\ubf7f\ubf7a", "\uced2\uced5\uced0\uced6\uced8\uced0\uced3\uced3", "\ue5ed\ue5ee\ue5ef\ue5ef\ue5ea\ue5e8", "\ube78\ube7f\ube7c\ube7d\ube7f\ube79\ube79\ube7b"}, d2={"\u07de\u07d5\u07c0\u27ba\u0788\u078a\u079c\u07f8\u07de\u07d5\u07c2\u07d5\u079b\u07d8\u07d5\u07da\u07d3\u079b\u07e7\u07c0\u07c6\u07dd\u07da\u07d3\u078f\u079d\u07f8\u07de\u07d5\u07c2\u07d5\u079b\u07d8\u07d5\u07da\u07d3\u079b\u07e7\u07c0\u07c6\u07dd\u07da\u07d3\u078f", "\u058b\u0580\u0594\u25ef\u05dd\u05df\u05c9\u05ad\u058b\u0580\u0597\u0580\u05ce\u058d\u0580\u058f\u0586\u05ce\u05b2\u0595\u0593\u0588\u058f\u0586\u05da\u05c8\u05ad\u058b\u0580\u0597\u0580\u05ce\u058d\u0580\u058f\u0586\u05ce\u05b2\u0595\u0593\u0588\u058f\u0586\u05da", "\u0381\u038a\u039d\u23e5\u03d7\u03d5\u03c3\u03a7\u0381\u038a\u039d\u038a\u03c4\u0387\u038a\u0385\u038c\u03c4\u03b8\u039f\u0399\u0382\u0385\u038c\u03d0\u03c2\u03a7\u0381\u038a\u039d\u038a\u03c4\u0387\u038a\u0385\u038c\u03c4\u03b8\u039f\u0399\u0382\u0385\u038c\u03d0", "\u013e\u0135\u0123\u215a\u0168\u016a\u017c\u0118\u013e\u0135\u0122\u0135\u017b\u0138\u0135\u013a\u0133\u017b\u0107\u0120\u0126\u013d\u013a\u0133\u016f\u017d\u0118\u013e\u0135\u0122\u0135\u017b\u0138\u0135\u013a\u0133\u017b\u0107\u0120\u0126\u013d\u013a\u0133\u016f", "\u0614\u064b\u0644\u0641\u0646\u0641\u065c\u0616\u0614\u0616\u0600\u0601\u067e", "\u06a0\u06f5\u06f2\u06f5\u06e8\u06a2\u06a0\u06a2\u06b4\u06b5\u06ca", "\u0335\u0337\u0326\u0311\u033e\u0333\u0321\u0321\u036e\u036c\u037a\u037b\u031e\u0338\u0333\u0324\u0333\u037d\u033e\u0333\u033c\u0335\u037d\u0311\u033e\u0333\u0321\u0321\u0369", "\u0259\u0250\u0242\u0259\u0272\u025e\u0255\u0254\u020d\u020f\u0219\u0218\u0278", "[OK_RM\u0002\u0000\u0016rT_H_\u0011R_PY\u0011q\\T[]J\u0005\u0017d", "\u00aa\u00a5\u00a6\u00a7\u00ac\u00f5\u00f7\u00e1\u00e0\u0085\u00a3\u00a8\u00bf\u00a8\u00e6\u00a5\u00a8\u00a7\u00ae\u00e6\u0086\u00ab\u00a3\u00ac\u00aa\u00bd\u00f2", "\u06b3\u06a8\u0694\u06b3\u06b5\u06ae\u06a9\u06a0\u06fb\u06f9\u06ef\u06ee\u068b\u06ad\u06a6\u06b1\u06a6\u06e8\u06ab\u06a6\u06a9\u06a0\u06e8\u0694\u06b3\u06b5\u06ae\u06a9\u06a0\u06fc", "\u012f\u012e\u0135\u0128\u0127\u0138\u017d\u017f\u0169\u0168\u0117", "\u07f6\u07f7\u07ec\u07f1\u07fe\u07e1\u07d9\u07f4\u07f4\u07a4\u07a6\u07b0\u07b1\u07ce", "\u0676\u0660\u0668\u0675\u063d\u063f\u0629\u0628\u0657", "\u02ad\u02bb\u02b3\u02ae\u02e6\u02e4\u02f2\u0290\u02f3\u028c", "\u052c\u053a\u0532\u052f\u056b\u0567\u0565\u0573\u0511\u0572\u050d", "\u0480\u0496\u049e\u0483\u04cb\u04c9\u04df\u04bd\u04be\u04de\u04a1", "\u008f\u0080\u0087\u0088\u0085\u0080\u0093\u008c\u00d5\u00d7\u00c1\u00c0\u00bf"})
public final class Class3492 {
    public static float field7682;
    public static double field7683;
    public static double field7684;

    /*
     * WARNING - void declaration
     */
    private static CallSite jrDtveDK6k7TMZ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3492.T39gSgwbIaLLNxal(k2, 157476336));
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
                int a2 = Integer.parseInt(Class3492.T39gSgwbIaLLNxal(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3492.T39gSgwbIaLLNxal(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3492.T39gSgwbIaLLNxal(k2, 157476336) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String T39gSgwbIaLLNxal(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        G\u200e = "Not an entity type!";
        field7683 = Double.longBitsToDouble(4606587309465144088L);
        as\u200e = "Health";
        be\u200e = "Parkour";
        bm\u200e = "Target neutrals";
        field7684 = Double.longBitsToDouble(4606322250874196416L);
        field7682 = Float.intBitsToFloat(1046877192);
    }
}

