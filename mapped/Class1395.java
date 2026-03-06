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
@HACHIMI_CLIENT(mv=100, d1={"\uc66c\uc66d\uc66d\uc66e\uc66e\uc66a\uc669\uc66c", "\uaf90\uaf97\uaf9e\uaf90\uaf93\uaf97\uaf95\uaf94", "\u1a74\u1a70\u1a74\u1a77\u1a77\u1a7e\u1a76\u1a70", "\u058b\u058a\u0587\u0589\u058c\u058b\u0586\u058f", "\u9478\u947f\u947a\u9479\u9478\u9474\u947c\u947d", "\uc23d\uc237\uc236\uc23c\uc234\uc235", "\u5951\u5956\u5952\u5950\u5955\u5952\u595f", "\ub709\ub708\ub708\ub709\ub70c\ub70d\ub70d\ub70f", "\ua536\ua53e\ua53c\ua53c\ua536\ua537\ua53c", "\ub45b\ub452\ub45b\ub45a\ub45a\ub456\ub450", "\u6ef2\u6ef3\u6ef0\u6ef3\u6ef8\u6ef4\u6ef6\u6ef7", "\u7631\u7633\u763b\u763b\u763b\u7631", "\u9619\u9613\u9612\u9618\u9618\u961f\u961b\u9612", "\uc97e\uc97d\uc979\uc97a\uc978\uc97c\uc973\uc979", "\ubcc0\ubcc1\ubcc3\ubcc8\ubcc3\ubcc0\ubcc6\ubcc2", "\u5d3a\u5d39\u5d3d\u5d35\u5d35\u5d35\u5d34", "\ubc85\ubc81\ubc87\ubc83\ubc87\ubc87\ubc8b\ubc85"}, d2={"\u06c0\u06f0\u06db\u26ac\u069e\u069c\u068a\u06ee\u06c8\u06c3\u06d4\u06c3\u068d\u06ce\u06c3\u06cc\u06c5\u068d\u06f1\u06d6\u06d0\u06cb\u06cc\u06c5\u0699\u068b\u06ee\u06c8\u06c3\u06d4\u06c3\u068d\u06ce\u06c3\u06cc\u06c5\u068d\u06f1\u06d6\u06d0\u06cb\u06cc\u06c5\u0699", "\u0304\u0334\u031c\u2368\u035a\u0358\u034e\u032a\u030c\u0307\u0310\u0307\u0349\u030a\u0307\u0308\u0301\u0349\u0335\u0312\u0314\u030f\u0308\u0301\u035d\u034f\u032a\u030c\u0307\u0310\u0307\u0349\u030a\u0307\u0308\u0301\u0349\u0335\u0312\u0314\u030f\u0308\u0301\u035d", "\u07e2\u07d2\u07c1\u278e\u07bc\u07be\u07a8\u07cc\u07ea\u07e1\u07f6\u07e1\u07af\u07ec\u07e1\u07ee\u07e7\u07af\u07d3\u07f4\u07f2\u07e9\u07ee\u07e7\u07bb\u07a9\u07cc\u07ea\u07e1\u07f6\u07e1\u07af\u07ec\u07e1\u07ee\u07e7\u07af\u07d3\u07f4\u07f2\u07e9\u07ee\u07e7\u07bb", "\u01b8\u01e7\u01e8\u01ed\u01ea\u01ed\u01f0\u01ba\u01b8\u01ba\u01ac\u01ad\u01d2", "\u01a1\u01f4\u01f3\u01f4\u01e9\u01a3\u01a1\u01a3\u01b5\u01b4\u01cb", "\u0639\u063b\u062a\u061d\u0632\u063f\u062d\u062d\u0662\u0660\u0676\u0677\u0612\u0634\u063f\u0628\u063f\u0671\u0632\u063f\u0630\u0639\u0671\u061d\u0632\u063f\u062d\u062d\u0665", "\u0209\u0200\u0212\u0209\u0222\u020e\u0205\u0204\u025d\u025f\u0249\u0248\u0228", "\u00a9\u00bd\u00b9\u00ad\u00a0\u00bf\u00f0\u00f2\u00e4\u0080\u00a6\u00ad\u00ba\u00ad\u00e3\u00a0\u00ad\u00a2\u00ab\u00e3\u0083\u00ae\u00a6\u00a9\u00af\u00b8\u00f7\u00e5\u0096", "\u0195\u019a\u0199\u0198\u0193\u01ca\u01c8\u01de\u01df\u01ba\u019c\u0197\u0180\u0197\u01d9\u019a\u0197\u0198\u0191\u01d9\u01b9\u0194\u019c\u0193\u0195\u0182\u01cd", "\u0658\u0643\u067f\u0658\u065e\u0645\u0642\u064b\u0610\u0612\u0604\u0605\u0660\u0646\u064d\u065a\u064d\u0603\u0640\u064d\u0642\u064b\u0603\u067f\u0658\u065e\u0645\u0642\u064b\u0617", "\u0002\u0003\u0018\u0005\n\u0015PRDE:", "\u0710\u0711\u070a\u0717\u0718\u0707\u073f\u0712\u0712\u0742\u0740\u0756\u0757\u0728", "\u0249\u025f\u0257\u024a\u0202\u0200\u0216\u0217\u0268", "\u053b\u052d\u0525\u0538\u0570\u0572\u0564\u0506\u0565\u051a", "\u020d\u021b\u0213\u020e\u024a\u0246\u0244\u0252\u0230\u0253\u022c", "\u00cc\u00da\u00d2\u00cf\u0087\u0085\u0093\u00f1\u00f2\u0092\u00ed", "\u019c\u0193\u0194\u019b\u0196\u0193\u0180\u019f\u01c6\u01c4\u01d2\u01d3\u01ac"})
public final class Class1395 {
    public static double field5380;
    public static float field5381;

    static {
        field5381 = Float.intBitsToFloat(1051384912);
        K\u200e = "name";
        field5380 = Double.longBitsToDouble(4590368359923636208L);
        al\u200e = "Calculates lethal damage sources";
        bc\u200e = "fastOutline";
    }

    private static String z66rqoBlfUrtXATB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 9JT9aFVRZO9yOm(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1395.z66rqoBlfUrtXATB(k2, -31122899));
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
                int a2 = Integer.parseInt(Class1395.z66rqoBlfUrtXATB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1395.z66rqoBlfUrtXATB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1395.z66rqoBlfUrtXATB(k2, -31122899) + " " + l2 + " " + m2);
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

