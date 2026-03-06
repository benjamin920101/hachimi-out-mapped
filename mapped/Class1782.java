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
@HACHIMI_CLIENT(mv=100, d1={"\u5834\u5836\u5834\u5837\u5836\u5839\u5838\u5838", "\u0da1\u0dae\u0da6\u0da3\u0da2\u0da2\u0da3", "\ub784\ub78f\ub78e\ub78e\ub783\ub786\ub78e\ub781", "\u75f4\u75f8\u75f4\u75f9\u75f6\u75f0\u75f5\u75f4", "\u83c2\u83c1\u83c4\u83c3\u83c4\u83c4\u83c6\u83c0", "\u8d98\u8d98\u8d9a\u8d95\u8d9c\u8d9b\u8d9f\u8d9c", "\u96cd\u96cb\u96c9\u96cb\u96cf\u96ca\u96ca\u96cd", "\u9a21\u9a23\u9a24\u9a29\u9a26\u9a29\u9a24", "\uce94\uce97\uce95\uce94\uce92\uce92\uce96\uce97", "\uac48\uac44\uac44\uac44\uac45\uac48\uac4a", "\u8f1b\u8f12\u8f10\u8f1b\u8f15\u8f16\u8f1b", "\ub8dc\ub8df\ub8d0\ub8db\ub8dd\ub8db\ub8de\ub8db", "\u1e68\u1e6e\u1e67\u1e67\u1e6a\u1e6f\u1e6a\u1e6c", "\ua85d\ua859\ua85b\ua857\ua859\ua85b\ua85d\ua858", "\u4c7d\u4c71\u4c7e\u4c71\u4c7d\u4c7e\u4c7c\u4c7a", "\ue866\ue86c\ue866\ue86c\ue86d\ue860\ue86d\ue860", "\uaa08\uaa0c\uaa0b\uaa00\uaa09\uaa08\uaa0f\uaa00"}, d2={"\u07e0\u07f3\u07fa\u2785\u07b7\u07b5\u07a3\u07c7\u07e1\u07ea\u07fd\u07ea\u07a4\u07e7\u07ea\u07e5\u07ec\u07a4\u07d8\u07ff\u07f9\u07e2\u07e5\u07ec\u07b0\u07a2\u07c7\u07e1\u07ea\u07fd\u07ea\u07a4\u07e7\u07ea\u07e5\u07ec\u07a4\u07d8\u07ff\u07f9\u07e2\u07e5\u07ec\u07b0", "\u022c\u023f\u0235\u2249\u027b\u0279\u026f\u020b\u022d\u0226\u0231\u0226\u0268\u022b\u0226\u0229\u0220\u0268\u0214\u0233\u0235\u022e\u0229\u0220\u027c\u026e\u020b\u022d\u0226\u0231\u0226\u0268\u022b\u0226\u0229\u0220\u0268\u0214\u0233\u0235\u022e\u0229\u0220\u027c", "\u046a\u0479\u0472\u240f\u043d\u043f\u0429\u044d\u046b\u0460\u0477\u0460\u042e\u046d\u0460\u046f\u0466\u042e\u0452\u0475\u0473\u0468\u046f\u0466\u043a\u0428\u044d\u046b\u0460\u0477\u0460\u042e\u046d\u0460\u046f\u0466\u042e\u0452\u0475\u0473\u0468\u046f\u0466\u043a", "\u0097\u00c8\u00c7\u00c2\u00c5\u00c2\u00df\u0095\u0097\u0095\u0083\u0082\u00fd", "i<;<!kik}|\u0003", "\u04b7\u04b5\u04a4\u0493\u04bc\u04b1\u04a3\u04a3\u04ec\u04ee\u04f8\u04f9\u049c\u04ba\u04b1\u04a6\u04b1\u04ff\u04bc\u04b1\u04be\u04b7\u04ff\u0493\u04bc\u04b1\u04a3\u04a3\u04eb", "\u01c8\u01c1\u01d3\u01c8\u01e3\u01cf\u01c4\u01c5\u019c\u019e\u0188\u0189\u01e9", "\u078d\u0799\u079d\u0789\u0784\u079b\u07d4\u07d6\u07c0\u07a4\u0782\u0789\u079e\u0789\u07c7\u0784\u0789\u0786\u078f\u07c7\u07a7\u078a\u0782\u078d\u078b\u079c\u07d3\u07c1\u07b2", "\u018d\u0182\u0181\u0180\u018b\u01d2\u01d0\u01c6\u01c7\u01a2\u0184\u018f\u0198\u018f\u01c1\u0182\u018f\u0180\u0189\u01c1\u01a1\u018c\u0184\u018b\u018d\u019a\u01d5", "\u02b5\u02ae\u0292\u02b5\u02b3\u02a8\u02af\u02a6\u02fd\u02ff\u02e9\u02e8\u028d\u02ab\u02a0\u02b7\u02a0\u02ee\u02ad\u02a0\u02af\u02a6\u02ee\u0292\u02b5\u02b3\u02a8\u02af\u02a6\u02fa", "\u055d\u055c\u0547\u055a\u0555\u054a\u050f\u050d\u051b\u051a\u0565", "\u0295\u0294\u028f\u0292\u029d\u0282\u02ba\u0297\u0297\u02c7\u02c5\u02d3\u02d2\u02ad", "\u03ab\u03bd\u03b5\u03a8\u03e0\u03e2\u03f4\u03f5\u038a", "\u031a\u030c\u0304\u0319\u0351\u0353\u0345\u0327\u0344\u033b", "\u0401\u0417\u041f\u0402\u0446\u044a\u0448\u045e\u043c\u045f\u0420", "\u0156\u0140\u0148\u0155\u011d\u011f\u0109\u016b\u0168\u0108\u0177", "\u01f7\u01f8\u01ff\u01f0\u01fd\u01f8\u01eb\u01f4\u01ad\u01af\u01b9\u01b8\u01c7"})
public final class Class1782 {
    public static float field6676;
    public static float field6677;
    public static double field6678;
    public static float field6679;

    static {
        field6678 = Double.longBitsToDouble(4605200834963974390L);
        field6677 = Float.intBitsToFloat(1057714929);
        field6676 = Float.intBitsToFloat(1046426548);
        field6679 = Float.intBitsToFloat(1050437814);
        bz\u200e = "ALL";
        bT\u200e = "Show spawner range";
        bY\u200e = "Blacklist";
    }

    /*
     * Unable to fully structure code
     */
    private static String 6sVGLhSF1Ei6ZaWA(String a, int b) {
        c = new StringBuilder();
        d = 0;
        while (true) {
            block2: {
                block3: {
                    if (d >= a.length()) break block3;
                    v0 = 13954;
                    ** GOTO lbl12
                }
                v0 = 13955;
                if (true) ** GOTO lbl12
                do {
                    v0 = var4_4 = 13953;
lbl12:
                    // 3 sources

                    if (var4_4 == 13954) break block2;
                } while (var4_4 == 13955);
                break;
            }
            c.append((char)(a.charAt(d) ^ b));
            ++d;
        }
        return c.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite L7bckMWYyQv4x4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1782.6sVGLhSF1Ei6ZaWA(k2, 873964154));
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
                int a2 = Integer.parseInt(Class1782.6sVGLhSF1Ei6ZaWA(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1782.6sVGLhSF1Ei6ZaWA(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1782.6sVGLhSF1Ei6ZaWA(k2, 873964154) + " " + l2 + " " + m2);
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

