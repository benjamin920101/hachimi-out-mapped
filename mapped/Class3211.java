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

@HACHIMI_CLIENT(mv=100, d1={"\u425b\u425e\u4259\u4257\u425d\u425b\u425f", "\ubf02\ubf06\ubf09\ubf00\ubf09\ubf01\ubf05\ubf01", "\ubf0a\ubf08\ubf0d\ubf0a\ubf0c\ubf0d\ubf00\ubf0b", "\u2171\u2174\u2172\u2177\u2175\u217d\u2172\u2172", "\u3d97\u3d9a\u3d97\u3d92\u3d92\u3d95\u3d97\u3d90", "\u0a7b\u0a78\u0a7d\u0a7f\u0a7f\u0a71\u0a7c", "\ubc1b\ubc1d\ubc1e\ubc1a\ubc1b\ubc16\ubc18\ubc1b", "\uc979\uc97c\uc97a\uc970\uc97d\uc97e\uc97d\uc979", "\u014e\u014f\u0149\u014e\u014d\u0143\u014b\u014d", "\u4081\u4084\u4083\u408c\u408d\u4084\u408d", "\u1db5\u1db7\u1db3\u1db4\u1db1\u1db2\u1db2\u1db2", "\u9e14\u9e15\u9e14\u9e15\u9e10\u9e13\u9e14\u9e1d", "\u79d5\u79d3\u79d0\u79dc\u79d5\u79d0\u79d4\u79d1", "\u629d\u6297\u629c\u6298\u629b\u629c\u6296\u629a", "\u4ffa\u4ffa\u4ffc\u4fff\u4ffb\u4ffc\u4ff9\u4ffb", "\ua0ff\ua0f2\ua0f9\ua0f2\ua0ff\ua0f3\ua0fb\ua0f9", "\udf53\udf5c\udf5c\udf52\udf52\udf54\udf55\udf52"}, d2={"\u02a8\u029e\u02a6\u22c5\u02f7\u02f5\u02e3\u0287\u02a1\u02aa\u02bd\u02aa\u02e4\u02a7\u02aa\u02a5\u02ac\u02e4\u0298\u02bf\u02b9\u02a2\u02a5\u02ac\u02f0\u02e2\u0287\u02a1\u02aa\u02bd\u02aa\u02e4\u02a7\u02aa\u02a5\u02ac\u02e4\u0298\u02bf\u02b9\u02a2\u02a5\u02ac\u02f0", "\u04b5\u0483\u04b8\u24d8\u04ea\u04e8\u04fe\u049a\u04bc\u04b7\u04a0\u04b7\u04f9\u04ba\u04b7\u04b8\u04b1\u04f9\u0485\u04a2\u04a4\u04bf\u04b8\u04b1\u04ed\u04ff\u049a\u04bc\u04b7\u04a0\u04b7\u04f9\u04ba\u04b7\u04b8\u04b1\u04f9\u0485\u04a2\u04a4\u04bf\u04b8\u04b1\u04ed", "\u06ce\u06f8\u06c2\u26a3\u0691\u0693\u0685\u06e1\u06c7\u06cc\u06db\u06cc\u0682\u06c1\u06cc\u06c3\u06ca\u0682\u06fe\u06d9\u06df\u06c4\u06c3\u06ca\u0696\u0684\u06e1\u06c7\u06cc\u06db\u06cc\u0682\u06c1\u06cc\u06c3\u06ca\u0682\u06fe\u06d9\u06df\u06c4\u06c3\u06ca\u0696", "\u0674\u062b\u0624\u0621\u0626\u0621\u063c\u0676\u0674\u0676\u0660\u0661\u061e", "\u0484\u04d1\u04d6\u04d1\u04cc\u0486\u0484\u0486\u0490\u0491\u04ee", "\u01c4\u01c6\u01d7\u01e0\u01cf\u01c2\u01d0\u01d0\u019f\u019d\u018b\u018a\u01ef\u01c9\u01c2\u01d5\u01c2\u018c\u01cf\u01c2\u01cd\u01c4\u018c\u01e0\u01cf\u01c2\u01d0\u01d0\u0198", "\u03f0\u03f9\u03eb\u03f0\u03db\u03f7\u03fc\u03fd\u03a4\u03a6\u03b0\u03b1\u03d1", "\u0639\u062d\u0629\u063d\u0630\u062f\u0660\u0662\u0674\u0610\u0636\u063d\u062a\u063d\u0673\u0630\u063d\u0632\u063b\u0673\u0613\u063e\u0636\u0639\u063f\u0628\u0667\u0675\u0606", "\u0358\u0357\u0354\u0355\u035e\u0307\u0305\u0313\u0312\u0377\u0351\u035a\u034d\u035a\u0314\u0357\u035a\u0355\u035c\u0314\u0374\u0359\u0351\u035e\u0358\u034f\u0300", "\u05f0\u05eb\u05d7\u05f0\u05f6\u05ed\u05ea\u05e3\u05b8\u05ba\u05ac\u05ad\u05c8\u05ee\u05e5\u05f2\u05e5\u05ab\u05e8\u05e5\u05ea\u05e3\u05ab\u05d7\u05f0\u05f6\u05ed\u05ea\u05e3\u05bf", "\u07bc\u07bd\u07a6\u07bb\u07b4\u07ab\u07ee\u07ec\u07fa\u07fb\u0784", "\u015e\u015f\u0144\u0159\u0156\u0149\u0171\u015c\u015c\u010c\u010e\u0118\u0119\u0166", "\u018f\u0199\u0191\u018c\u01c4\u01c6\u01d0\u01d1\u01ae", "\u062b\u063d\u0635\u0628\u0660\u0662\u0674\u0616\u0675\u060a", "\u01c0\u01d6\u01de\u01c3\u0187\u018b\u0189\u019f\u01fd\u019e\u01e1", "\u0725\u0733\u073b\u0726\u076e\u076c\u077a\u0718\u071b\u077b\u0704", "\u0420\u042f\u0428\u0427\u042a\u042f\u043c\u0423\u047a\u0478\u046e\u046f\u0410"})
public final class Class3211 {
    public static double field6887;
    public static float field6888;
    public static double field6889;

    private static String FISGFKDHtBRQi3vS(String a2, int b2) {
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
    private static CallSite jeUk06kreNvt2J(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3211.FISGFKDHtBRQi3vS(k2, 354343486));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 52863 : 52862;
        block6: while (true) {
            switch (n3) {
                case 52863: {
                    n3 = 52861;
                    continue block6;
                }
                case 52862: {
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
                int a2 = Integer.parseInt(Class3211.FISGFKDHtBRQi3vS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3211.FISGFKDHtBRQi3vS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3211.FISGFKDHtBRQi3vS(k2, 354343486) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field6889 = Double.longBitsToDouble(4576918229175238656L);
        field6887 = Double.longBitsToDouble(4606074550874910214L);
        o\u200e = "GradientColor";
        field6888 = Float.intBitsToFloat(1045571636);
        aE\u200e = "in places, number of blocks";
        by\u200e = "NORMAL";
    }
}

