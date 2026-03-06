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
@HACHIMI_CLIENT(mv=100, d1={"\uc3d6\uc3da\uc3d4\uc3d6\uc3da\uc3d4\uc3d7\uc3da", "\ub32f\ub328\ub32b\ub32f\ub32d\ub32b\ub32b\ub32e", "\u8a2c\u8a2a\u8a2a\u8a2f\u8a2e\u8a2a\u8a25\u8a2b", "\ud9cd\ud9ca\ud9cb\ud9cd\ud9c7\ud9cd\ud9ce\ud9c7", "\u63ad\u63af\u63ab\u63ad\u63a8\u63ae\u63ab\u63a0", "\ud42d\ud42a\ud42f\ud42c\ud423\ud42d\ud422\ud42c", "\u76d5\u76d4\u76d4\u76d2\u76d0\u76d8\u76d9\u76d0", "\u6573\u6571\u6572\u6575\u657e\u657e\u6571\u6572", "\u75e5\u75e6\u75ec\u75ed\u75e0\u75e0\u75e3\u75e2", "\u493d\u4939\u4930\u493b\u493b\u493a\u4930\u493e", "\u402c\u4028\u4028\u4027\u4029\u4027\u402b\u402e", "\ub206\ub206\ub205\ub201\ub205\ub204\ub20c\ub20c", "\udfc1\udfc4\udfc6\udfc5\udfcf\udfc6\udfce\udfcf", "\u96b1\u96b0\u96b3\u96b0\u96bc\u96b4\u96bc\u96b0", "\u0deb\u0ded\u0dee\u0dee\u0def\u0dec\u0dea\u0def", "\ua223\ua221\ua226\ua221\ua226\ua226\ua227\ua229", "\ud177\ud171\ud17d\ud174\ud172\ud17c\ud17c\ud172"}, d2={"\u058c\u05ab\u0591\u25e8\u05da\u05d8\u05ce\u05aa\u058c\u0587\u0590\u0587\u05c9\u058a\u0587\u0588\u0581\u05c9\u05b5\u0592\u0594\u058f\u0588\u0581\u05dd\u05cf\u05aa\u058c\u0587\u0590\u0587\u05c9\u058a\u0587\u0588\u0581\u05c9\u05b5\u0592\u0594\u058f\u0588\u0581\u05dd", "\u04a4\u0483\u04b6\u24c0\u04f2\u04f0\u04e6\u0482\u04a4\u04af\u04b8\u04af\u04e1\u04a2\u04af\u04a0\u04a9\u04e1\u049d\u04ba\u04bc\u04a7\u04a0\u04a9\u04f5\u04e7\u0482\u04a4\u04af\u04b8\u04af\u04e1\u04a2\u04af\u04a0\u04a9\u04e1\u049d\u04ba\u04bc\u04a7\u04a0\u04a9\u04f5", "\u06eb\u06cc\u06f8\u268f\u06bd\u06bf\u06a9\u06cd\u06eb\u06e0\u06f7\u06e0\u06ae\u06ed\u06e0\u06ef\u06e6\u06ae\u06d2\u06f5\u06f3\u06e8\u06ef\u06e6\u06ba\u06a8\u06cd\u06eb\u06e0\u06f7\u06e0\u06ae\u06ed\u06e0\u06ef\u06e6\u06ae\u06d2\u06f5\u06f3\u06e8\u06ef\u06e6\u06ba", "\u00c2\u009d\u0092\u0097\u0090\u0097\u008a\u00c0\u00c2\u00c0\u00d6\u00d7\u00a8", "\u05d2\u0587\u0580\u0587\u059a\u05d0\u05d2\u05d0\u05c6\u05c7\u05b8", "\u017e\u017c\u016d\u015a\u0175\u0178\u016a\u016a\u0125\u0127\u0131\u0130\u0155\u0173\u0178\u016f\u0178\u0136\u0175\u0178\u0177\u017e\u0136\u015a\u0175\u0178\u016a\u016a\u0122", "\u00fa\u00f3\u00e1\u00fa\u00d1\u00fd\u00f6\u00f7\u00ae\u00ac\u00ba\u00bb\u00db", "\u0080\u0094\u0090\u0084\u0089\u0096\u00d9\u00db\u00cd\u00a9\u008f\u0084\u0093\u0084\u00ca\u0089\u0084\u008b\u0082\u00ca\u00aa\u0087\u008f\u0080\u0086\u0091\u00de\u00cc\u00bf", "\u050f\u0500\u0503\u0502\u0509\u0550\u0552\u0544\u0545\u0520\u0506\u050d\u051a\u050d\u0543\u0500\u050d\u0502\u050b\u0543\u0523\u050e\u0506\u0509\u050f\u0518\u0557", "\u0285\u029e\u02a2\u0285\u0283\u0298\u029f\u0296\u02cd\u02cf\u02d9\u02d8\u02bd\u029b\u0290\u0287\u0290\u02de\u029d\u0290\u029f\u0296\u02de\u02a2\u0285\u0283\u0298\u029f\u0296\u02ca", "\u024e\u024f\u0254\u0249\u0246\u0259\u021c\u021e\u0208\u0209\u0276", "\u013a\u013b\u0120\u013d\u0132\u012d\u0115\u0138\u0138\u0168\u016a\u017c\u017d\u0102", "\u0762\u0774\u077c\u0761\u0729\u072b\u073d\u073c\u0743", "\u079d\u078b\u0783\u079e\u07d6\u07d4\u07c2\u07a0\u07c3\u07bc", "\u0796\u0780\u0788\u0795\u07d1\u07dd\u07df\u07c9\u07ab\u07c8\u07b7", "\u019e\u0188\u0180\u019d\u01d5\u01d7\u01c1\u01a3\u01a0\u01c0\u01bf", "\u074f\u0740\u0747\u0748\u0745\u0740\u0753\u074c\u0715\u0717\u0701\u0700\u077f"})
public final class Class5485 {
    public static float field10289;
    public static float field10290 = 0.019990802f;
    public static int field10291 = -1480678762;

    private static String 5CTGKndqBdoLjWvF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Hg8liCqMbvMew3(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5485.5CTGKndqBdoLjWvF(k2, -1609978526));
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
                int a2 = Integer.parseInt(Class5485.5CTGKndqBdoLjWvF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5485.5CTGKndqBdoLjWvF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5485.5CTGKndqBdoLjWvF(k2, -1609978526) + " " + l2 + " " + m2);
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
        S\u200e = "Fade";
        bj\u200e = "Trap your head when you crawling";
        bk\u200e = "Break time";
        field10289 = Float.intBitsToFloat(1055251534);
    }
}

