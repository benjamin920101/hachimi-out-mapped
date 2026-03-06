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
@HACHIMI_CLIENT(mv=100, d1={"\ub67a\ub67b\ub67c\ub67e\ub678\ub67e", "\u97eb\u97ed\u97e9\u97ed\u97ed\u97ee\u97ec\u97eb", "\u438e\u4382\u438b\u4389\u4383\u4389\u4383\u438e", "\u53e9\u53e9\u53ee\u53e4\u53ec\u53e9\u53ee\u53e9", "\u7327\u7321\u7326\u7327\u7320\u7322\u732a\u7325", "\ua573\ua575\ua571\ua57f\ua572\ua576\ua575\ua574", "\u2fcd\u2fce\u2fca\u2fc5\u2fcb\u2fc5\u2fce\u2fc9", "\u2d7e\u2d79\u2d74\u2d7a\u2d7c\u2d78\u2d78\u2d7b", "\u50a2\u50a3\u50a1\u50a0\u50a6\u50a2\u50a6\u50a0", "\u54f4\u54f8\u54fd\u54f5\u54fe\u54f8\u54f9", "\u8a11\u8a13\u8a1b\u8a13\u8a1a\u8a1a\u8a11", "\u6ebc\u6ebd\u6ebe\u6eba\u6ebe\u6eb2\u6ebe", "\uacef\uace9\uace8\uace5\uacec\uacea\uacee\uacea", "\u7b25\u7b2e\u7b23\u7b26\u7b23\u7b25\u7b25\u7b24"}, d2={"N\u0011\u001e\u001b\u001c\u001b\u0006LNLZ[$", "\u0111\u0144\u0143\u0144\u0159\u0113\u0111\u0113\u0105\u0104\u017b", "\u015e\u015c\u014d\u017a\u0155\u0158\u014a\u014a\u0105\u0107\u0111\u0110\u0175\u0153\u0158\u014f\u0158\u0116\u0155\u0158\u0157\u015e\u0116\u017a\u0155\u0158\u014a\u014a\u0102", "\u04b1\u04b8\u04aa\u04b1\u049a\u04b6\u04bd\u04bc\u04e5\u04e7\u04f1\u04f0\u0490", "\u0309\u031d\u0319\u030d\u0300\u031f\u0350\u0352\u0344\u0320\u0306\u030d\u031a\u030d\u0343\u0300\u030d\u0302\u030b\u0343\u0323\u030e\u0306\u0309\u030f\u0318\u0357\u0345\u0336", "\u0469\u0466\u0465\u0464\u046f\u0436\u0434\u0422\u0423\u0446\u0460\u046b\u047c\u046b\u0425\u0466\u046b\u0464\u046d\u0425\u0445\u0468\u0460\u046f\u0469\u047e\u0431", "\u039c\u0387\u03bb\u039c\u039a\u0381\u0386\u038f\u03d4\u03d6\u03c0\u03c1\u03a4\u0382\u0389\u039e\u0389\u03c7\u0384\u0389\u0386\u038f\u03c7\u03bb\u039c\u039a\u0381\u0386\u038f\u03d3", "\u04ed\u04ec\u04f7\u04ea\u04e5\u04fa\u04bf\u04bd\u04ab\u04aa\u04d5", "\u02a8\u02a9\u02b2\u02af\u02a0\u02bf\u0287\u02aa\u02aa\u02fa\u02f8\u02ee\u02ef\u0290", "\u04bd\u04ab\u04a3\u04be\u04f6\u04f4\u04e2\u04e3\u049c", "\u0533\u0525\u052d\u0530\u0578\u057a\u056c\u050e\u056d\u0512", "\u01d6\u01c0\u01c8\u01d5\u0191\u019d\u019f\u0189\u01eb\u0188\u01f7", "\u07f0\u07e6\u07ee\u07f3\u07bb\u07b9\u07af\u07cd\u07ce\u07ae\u07d1", "\u05e2\u05ed\u05ea\u05e5\u05e8\u05ed\u05fe\u05e1\u05b8\u05ba\u05ac\u05ad\u05d2"})
public final class Class1606 {
    public static float field6007;
    public static double field6008;

    private static String 16ombwdGDOtbIqpI(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite mH9hYLysor9qUW(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1606.16ombwdGDOtbIqpI(k2, 1797738996));
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
                int a2 = Integer.parseInt(Class1606.16ombwdGDOtbIqpI(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1606.16ombwdGDOtbIqpI(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1606.16ombwdGDOtbIqpI(k2, 1797738996) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 12792 : 12793;
        block7: while (true) {
            switch (n3) {
                case 12793: {
                    n3 = 12791;
                    continue block7;
                }
                case 12792: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field6008 = Double.longBitsToDouble(4603878236702589228L);
        field6007 = Float.intBitsToFloat(1044618380);
    }
}

