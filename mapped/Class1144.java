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

@HACHIMI_CLIENT(mv=100, d1={"\u9328\u932b\u932f\u932d\u932d\u932a\u9328\u932d", "\u9e7d\u9e74\u9e75\u9e7e\u9e7c\u9e7c\u9e75\u9e7f", "\u8489\u8487\u848e\u848f\u8488\u8489\u848c\u848b", "\u98fe\u98f2\u98fe\u98f2\u98fd\u98fa\u98fa\u98fe", "\ua30a\ua30a\ua305\ua304\ua30f\ua304\ua309\ua30a", "\u6926\u6925\u6925\u6929\u6929\u6921\u6925\u6923", "\u4eb3\u4eb3\u4eb9\u4eb2\u4eb1\u4eb5\u4eb3\u4eb9", "\u647c\u647c\u647f\u6475\u647c\u6474\u6478\u647d", "\ud547\ud548\ud542\ud540\ud548\ud545\ud542\ud543", "\uda93\uda94\uda98\uda91\uda92\uda96\uda91\uda96", "\ue840\ue84e\ue840\ue846\ue84f\ue840\ue847\ue841", "\u07a0\u07a9\u07ae\u07a9\u07aa\u07ad\u07ab", "\u50e2\u50e7\u50e5\u50e9\u50e5\u50e5\u50e7\u50e9", "\uc3e2\uc3e3\uc3e3\uc3e3\uc3e7\uc3e0\uc3ee\uc3e4", "\ue8ae\ue8ae\ue8a0\ue8aa\ue8aa\ue8a1\ue8ac\ue8a9", "\u92cd\u92ca\u92ca\u92cf\u92cd\u92c3\u92cf"}, d2={"\u0647\u065f\u0671\u2627\u0615\u0617\u0601\u0665\u0643\u0648\u065f\u0648\u0606\u0645\u0648\u0647\u064e\u0606\u067a\u065d\u065b\u0640\u0647\u064e\u0612\u0600\u0665\u0643\u0648\u065f\u0648\u0606\u0645\u0648\u0647\u064e\u0606\u067a\u065d\u065b\u0640\u0647\u064e\u0612", "\u0396\u038e\u03a1\u23f6\u03c4\u03c6\u03d0\u03b4\u0392\u0399\u038e\u0399\u03d7\u0394\u0399\u0396\u039f\u03d7\u03ab\u038c\u038a\u0391\u0396\u039f\u03c3\u03d1\u03b4\u0392\u0399\u038e\u0399\u03d7\u0394\u0399\u0396\u039f\u03d7\u03ab\u038c\u038a\u0391\u0396\u039f\u03c3", "\u016b\u0134\u013b\u013e\u0139\u013e\u0123\u0169\u016b\u0169\u017f\u017e\u0101", "\u03a3\u03f6\u03f1\u03f6\u03eb\u03a1\u03a3\u03a1\u03b7\u03b6\u03c9", "\u013b\u0139\u0128\u011f\u0130\u013d\u012f\u012f\u0160\u0162\u0174\u0175\u0110\u0136\u013d\u012a\u013d\u0173\u0130\u013d\u0132\u013b\u0173\u011f\u0130\u013d\u012f\u012f\u0167", "\u03e4\u03ed\u03ff\u03e4\u03cf\u03e3\u03e8\u03e9\u03b0\u03b2\u03a4\u03a5\u03c5", "\u04ec\u04f8\u04fc\u04e8\u04e5\u04fa\u04b5\u04b7\u04a1\u04c5\u04e3\u04e8\u04ff\u04e8\u04a6\u04e5\u04e8\u04e7\u04ee\u04a6\u04c6\u04eb\u04e3\u04ec\u04ea\u04fd\u04b2\u04a0\u04d3", "]RQP[\u0002\u0000\u0016\u0017rT_H_\u0011R_PY\u0011q\\T[]J\u0005", "\u0227\u023c\u0200\u0227\u0221\u023a\u023d\u0234\u026f\u026d\u027b\u027a\u021f\u0239\u0232\u0225\u0232\u027c\u023f\u0232\u023d\u0234\u027c\u0200\u0227\u0221\u023a\u023d\u0234\u0268", "\u0718\u0719\u0702\u071f\u0710\u070f\u074a\u0748\u075e\u075f\u0720", "\u04e7\u04e6\u04fd\u04e0\u04ef\u04f0\u04c8\u04e5\u04e5\u04b5\u04b7\u04a1\u04a0\u04df", "aw\u007fb*(>?@", "\u06d4\u06c2\u06ca\u06d7\u069f\u069d\u068b\u06e9\u068a\u06f5", "\u02c6\u02d0\u02d8\u02c5\u0281\u028d\u028f\u0299\u02fb\u0298\u02e7", "\u02a7\u02b1\u02b9\u02a4\u02ec\u02ee\u02f8\u029a\u0299\u02f9\u0286", "\u0555\u055a\u055d\u0552\u055f\u055a\u0549\u0556\u050f\u050d\u051b\u051a\u0565"})
public final class Class1144 {
    public static double field4581;
    public static float field4582 = 0.7274516f;
    public static float field4583 = 0.52061653f;
    public static double field4584 = 0.9609172640666;
    public static double field4585;
    public static long field4586 = -4081071078788432875L;
    public static double field4587;
    public static float field4588 = 0.71268594f;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite xaew9Xa7S4Tdy2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1144.TdGHG29xRudiaUjq(k2, -759208230));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 145 : 146;
        block6: while (true) {
            switch (n3) {
                case 146: {
                    n3 = 144;
                    continue block6;
                }
                case 145: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1144.TdGHG29xRudiaUjq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1144.TdGHG29xRudiaUjq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1144.TdGHG29xRudiaUjq(k2, -759208230) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String TdGHG29xRudiaUjq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field4587 = Double.longBitsToDouble(4600136241782635738L);
        field4585 = Double.longBitsToDouble(4593283449973053592L);
        field4581 = Double.longBitsToDouble(4606812747275356344L);
        bh\u200e = "The distance of your block reach";
        bq\u200e = "Swing";
    }
}

