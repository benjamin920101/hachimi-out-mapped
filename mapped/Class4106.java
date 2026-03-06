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

@HACHIMI_CLIENT(mv=100, d1={"\u78b9\u78b2\u78bf\u78be\u78b9\u78bb\u78ba\u78bc", "\u9323\u9323\u9327\u9325\u9320\u9321\u932d\u9325", "\ua577\ua572\ua576\ua570\ua575\ua577\ua570\ua57a", "\ue1fd\ue1f9\ue1f8\ue1fa\ue1fb\ue1fe\ue1f5", "\u657c\u657f\u657c\u657a\u657d\u657a\u657e", "\u6487\u6488\u6485\u6481\u6488\u6487\u6489\u6483", "\uae6f\uae6a\uae68\uae6f\uae6f\uae65\uae6a\uae6f", "\u59a5\u59a1\u59a0\u59a6\u59a3\u59a2\u59a7\u59a7", "\u5422\u542d\u5423\u5424\u5427\u5426\u5425\u5420", "\u5bf5\u5bf3\u5bf3\u5bf8\u5bf6\u5bf5\u5bf6\u5bf0", "\u9e2b\u9e29\u9e28\u9e2c\u9e28\u9e2b\u9e28\u9e22", "\ucd4c\ucd40\ucd47\ucd47\ucd44\ucd43\ucd45", "\u16ad\u16a4\u16ad\u16ab\u16ac\u16aa\u16ab\u16af", "\ub864\ub860\ub865\ub860\ub860\ub860\ub860\ub866", "\u23d9\u23d8\u23db\u23df\u23d4\u23d5\u23d8\u23d4", "\u32e6\u32e1\u32e3\u32eb\u32e3\u32ea\u32e1\u32e7", "\u8346\u834c\u834d\u8343\u834c\u8347\u8341\u8340"}, d2={"\u019e\u0185\u01b4\u21fb\u01c9\u01cb\u01dd\u01b9\u019f\u0194\u0183\u0194\u01da\u0199\u0194\u019b\u0192\u01da\u01a6\u0181\u0187\u019c\u019b\u0192\u01ce\u01dc\u01b9\u019f\u0194\u0183\u0194\u01da\u0199\u0194\u019b\u0192\u01da\u01a6\u0181\u0187\u019c\u019b\u0192\u01ce", "\u0398\u0383\u03b1\u23fd\u03cf\u03cd\u03db\u03bf\u0399\u0392\u0385\u0392\u03dc\u039f\u0392\u039d\u0394\u03dc\u03a0\u0387\u0381\u039a\u039d\u0394\u03c8\u03da\u03bf\u0399\u0392\u0385\u0392\u03dc\u039f\u0392\u039d\u0394\u03dc\u03a0\u0387\u0381\u039a\u039d\u0394\u03c8", "\u03dc\u03c7\u03f4\u23b9\u038b\u0389\u039f\u03fb\u03dd\u03d6\u03c1\u03d6\u0398\u03db\u03d6\u03d9\u03d0\u0398\u03e4\u03c3\u03c5\u03de\u03d9\u03d0\u038c\u039e\u03fb\u03dd\u03d6\u03c1\u03d6\u0398\u03db\u03d6\u03d9\u03d0\u0398\u03e4\u03c3\u03c5\u03de\u03d9\u03d0\u038c", "h78=:= jhj|}\u0002", "\u06d6\u0683\u0684\u0683\u069e\u06d4\u06d6\u06d4\u06c2\u06c3\u06bc", "\u05db\u05d9\u05c8\u05ff\u05d0\u05dd\u05cf\u05cf\u0580\u0582\u0594\u0595\u05f0\u05d6\u05dd\u05ca\u05dd\u0593\u05d0\u05dd\u05d2\u05db\u0593\u05ff\u05d0\u05dd\u05cf\u05cf\u0587", "\u0304\u030d\u031f\u0304\u032f\u0303\u0308\u0309\u0350\u0352\u0344\u0345\u0325", "\u011f\u010b\u010f\u011b\u0116\u0109\u0146\u0144\u0152\u0136\u0110\u011b\u010c\u011b\u0155\u0116\u011b\u0114\u011d\u0155\u0135\u0118\u0110\u011f\u0119\u010e\u0141\u0153\u0120", "\u0547\u0548\u054b\u054a\u0541\u0518\u051a\u050c\u050d\u0568\u054e\u0545\u0552\u0545\u050b\u0548\u0545\u054a\u0543\u050b\u056b\u0546\u054e\u0541\u0547\u0550\u051f", "\u042a\u0431\u040d\u042a\u042c\u0437\u0430\u0439\u0462\u0460\u0476\u0477\u0412\u0434\u043f\u0428\u043f\u0471\u0432\u043f\u0430\u0439\u0471\u040d\u042a\u042c\u0437\u0430\u0439\u0465", "\u058f\u058e\u0595\u0588\u0587\u0598\u05dd\u05df\u05c9\u05c8\u05b7", "\u0188\u0189\u0192\u018f\u0180\u019f\u01a7\u018a\u018a\u01da\u01d8\u01ce\u01cf\u01b0", "\u027f\u0269\u0261\u027c\u0234\u0236\u0220\u0221\u025e", "\u0516\u0500\u0508\u0515\u055d\u055f\u0549\u052b\u0548\u0537", "\u0419\u040f\u0407\u041a\u045e\u0452\u0450\u0446\u0424\u0447\u0438", "\u07bd\u07ab\u07a3\u07be\u07f6\u07f4\u07e2\u0780\u0783\u07e3\u079c", "\u02ce\u02c1\u02c6\u02c9\u02c4\u02c1\u02d2\u02cd\u0294\u0296\u0280\u0281\u02fe"})
public final class Class4106 {
    public static float field9524;
    public static double field9525;

    static {
        field9525 = Double.longBitsToDouble(4681608360884174848L);
        t\u200e = "The NCP-Updated bypass for speeding up entity movement";
        field9524 = Float.intBitsToFloat(1053059842);
        bQ\u200e = "vanilla";
        cc\u200e = "Instant";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite DF5ltTrihMTz9b(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4106.WSHrSYjKVfsIgjLo(k2, -604021497));
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
                int a2 = Integer.parseInt(Class4106.WSHrSYjKVfsIgjLo(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4106.WSHrSYjKVfsIgjLo(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4106.WSHrSYjKVfsIgjLo(k2, -604021497) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String WSHrSYjKVfsIgjLo(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

