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

@HACHIMI_CLIENT(mv=100, d1={"\u745f\u745d\u745a\u7456\u7457\u7458\u7456\u7456", "\u10b1\u10b4\u10ba\u10b0\u10b5\u10b7\u10b5\u10b3", "\ue194\ue192\ue190\ue195\ue192\ue19c\ue193\ue193", "\uc160\uc167\uc167\uc162\uc16a\uc16a\uc166", "\ua33d\ua33d\ua335\ua339\ua33f\ua33d\ua338\ua33c", "\uba00\uba07\uba01\uba01\uba09\uba08\uba05\uba00", "\u4043\u4045\u4045\u4042\u4046\u404b\u4040\u4045", "\udef9\udefa\udefb\udef9\udef9\udeff\udefc\udefc", "\ubc65\ubc60\ubc6b\ubc6a\ubc60\ubc60\ubc62\ubc66", "\u8640\u8646\u8640\u8643\u8646\u8643\u8646\u8647", "\uc39c\uc391\uc39d\uc39e\uc39c\uc39c\uc399\uc39f", "\u79d4\u79d6\u79d1\u79d7\u79d0\u79d5\u79d4\u79d0", "\u21a4\u21a2\u21a4\u21a3\u21a4\u21a5\u21a4\u21a6", "\u7ee5\u7ee5\u7ee9\u7ee5\u7ee6\u7ee4\u7ee8\u7ee7", "\u6773\u677e\u677f\u677e\u6771\u677e\u6770\u677e", "\u7098\u709d\u709b\u7099\u709a\u709d\u7099\u709e", "\u7f73\u7f72\u7f74\u7f7b\u7f71\u7f70\u7f7a\u7f73"}, d2={"\u04de\u04e2\u04fa\u24b9\u048b\u0489\u049f\u04fb\u04dd\u04d6\u04c1\u04d6\u0498\u04db\u04d6\u04d9\u04d0\u0498\u04e4\u04c3\u04c5\u04de\u04d9\u04d0\u048c\u049e\u04fb\u04dd\u04d6\u04c1\u04d6\u0498\u04db\u04d6\u04d9\u04d0\u0498\u04e4\u04c3\u04c5\u04de\u04d9\u04d0\u048c", "\u059f\u05a3\u05b8\u25f8\u05ca\u05c8\u05de\u05ba\u059c\u0597\u0580\u0597\u05d9\u059a\u0597\u0598\u0591\u05d9\u05a5\u0582\u0584\u059f\u0598\u0591\u05cd\u05df\u05ba\u059c\u0597\u0580\u0597\u05d9\u059a\u0597\u0598\u0591\u05d9\u05a5\u0582\u0584\u059f\u0598\u0591\u05cd", "\u0396\u03aa\u03b0\u23f1\u03c3\u03c1\u03d7\u03b3\u0395\u039e\u0389\u039e\u03d0\u0393\u039e\u0391\u0398\u03d0\u03ac\u038b\u038d\u0396\u0391\u0398\u03c4\u03d6\u03b3\u0395\u039e\u0389\u039e\u03d0\u0393\u039e\u0391\u0398\u03d0\u03ac\u038b\u038d\u0396\u0391\u0398\u03c4", "\u04b9\u04e6\u04e9\u04ec\u04eb\u04ec\u04f1\u04bb\u04b9\u04bb\u04ad\u04ac\u04d3", "\u04b7\u04e2\u04e5\u04e2\u04ff\u04b5\u04b7\u04b5\u04a3\u04a2\u04dd", "\u0348\u034a\u035b\u036c\u0343\u034e\u035c\u035c\u0313\u0311\u0307\u0306\u0363\u0345\u034e\u0359\u034e\u0300\u0343\u034e\u0341\u0348\u0300\u036c\u0343\u034e\u035c\u035c\u0314", "\u03a1\u03a8\u03ba\u03a1\u038a\u03a6\u03ad\u03ac\u03f5\u03f7\u03e1\u03e0\u0380", "\u02a9\u02bd\u02b9\u02ad\u02a0\u02bf\u02f0\u02f2\u02e4\u0280\u02a6\u02ad\u02ba\u02ad\u02e3\u02a0\u02ad\u02a2\u02ab\u02e3\u0283\u02ae\u02a6\u02a9\u02af\u02b8\u02f7\u02e5\u0296", "\u039e\u0391\u0392\u0393\u0398\u03c1\u03c3\u03d5\u03d4\u03b1\u0397\u039c\u038b\u039c\u03d2\u0391\u039c\u0393\u039a\u03d2\u03b2\u039f\u0397\u0398\u039e\u0389\u03c6", "\u0645\u065e\u0662\u0645\u0643\u0658\u065f\u0656\u060d\u060f\u0619\u0618\u067d\u065b\u0650\u0647\u0650\u061e\u065d\u0650\u065f\u0656\u061e\u0662\u0645\u0643\u0658\u065f\u0656\u060a", "\u0751\u0750\u074b\u0756\u0759\u0746\u0703\u0701\u0717\u0716\u0769", "\u021f\u021e\u0205\u0218\u0217\u0208\u0230\u021d\u021d\u024d\u024f\u0259\u0258\u0227", "\u04e6\u04f0\u04f8\u04e5\u04ad\u04af\u04b9\u04b8\u04c7", "\u0356\u0340\u0348\u0355\u031d\u031f\u0309\u036b\u0308\u0377", "%3;&bnlz\u0018{\u0004", "\u00e4\u00f2\u00fa\u00e7\u00af\u00ad\u00bb\u00d9\u00da\u00ba\u00c5", "\u03bb\u03b4\u03b3\u03bc\u03b1\u03b4\u03a7\u03b8\u03e1\u03e3\u03f5\u03f4\u038b"})
public final class Class1326 {
    public static float field5134 = Float.intBitsToFloat(1036036664);
    public static float field5135 = 0.46570116f;
    public static String field5136;
    public static double field5137 = 0.8826101484806608;

    /*
     * WARNING - void declaration
     */
    private static CallSite r2Fl111IbeVa7S(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1326.PYGo2nPLmoHzrTO1(k2, -453020421));
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
                int a2 = Integer.parseInt(Class1326.PYGo2nPLmoHzrTO1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1326.PYGo2nPLmoHzrTO1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1326.PYGo2nPLmoHzrTO1(k2, -453020421) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Unable to fully structure code
     */
    private static String PYGo2nPLmoHzrTO1(String a, int b) {
        c = new StringBuilder();
        d = 0;
        while (true) {
            block2: {
                block3: {
                    if (d >= a.length()) break block3;
                    v0 = 51143;
                    ** GOTO lbl12
                }
                v0 = 51144;
                if (true) ** GOTO lbl12
                do {
                    v0 = var4_4 = 51142;
lbl12:
                    // 3 sources

                    if (var4_4 == 51143) break block2;
                } while (var4_4 == 51144);
                break;
            }
            c.append((char)(a.charAt(d) ^ b));
            ++d;
        }
        return c.toString();
    }

    static {
        ae\u200e = "Only place covered blocks";
        field5136 = "Initializing CommandManager ...";
        bS\u200e = "LethalMultiplier";
    }
}

