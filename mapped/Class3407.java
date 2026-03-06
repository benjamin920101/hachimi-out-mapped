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

@HACHIMI_CLIENT(mv=100, d1={"\ue342\ue342\ue344\ue343\ue348\ue343\ue344\ue348", "\uaae9\uaaee\uaaea\uaae9\uaaec", "\u24be\u24be\u24b2\u24bf\u24bf\u24bd\u24bd\u24bf", "\ue093\ue093\ue091\ue095\ue091\ue091\ue091\ue094", "\ud920\ud927\ud922\ud922\ud92b\ud92b\ud927\ud921", "\u740c\u740a\u740f\u740b\u740e\u740d\u740a\u740d", "\uce31\uce31\uce3a\uce35\uce3b\uce31\uce32", "\u64cc\u64cd\u64c8\u64cd\u64ca\u64c5\u64c5\u64c8", "\u17ba\u17bb\u17bd\u17b9\u17bd\u17bb\u17ba\u17b7", "\ud8b7\ud8b6\ud8b3\ud8b5\ud8b1\ud8b4\ud8b2", "\u6603\u6604\u6601\u6607\u660c\u6601\u6606\u6607", "\u45b1\u45bd\u45bc\u45b4\u45b1\u45b5\u45bc\u45b1", "\uc00b\uc00e\uc008\uc00a\uc009\uc00e\uc00b\uc00e", "\u7c8b\u7c8f\u7c89\u7c86\u7c88\u7c87\u7c88\u7c89"}, d2={"\u03c7\u0398\u0397\u0392\u0395\u0392\u038f\u03c5\u03c7\u03c5\u03d3\u03d2\u03ad", "\u0354\u0301\u0306\u0301\u031c\u0356\u0354\u0356\u0340\u0341\u033e", "\u00e3\u00e1\u00f0\u00c7\u00e8\u00e5\u00f7\u00f7\u00b8\u00ba\u00ac\u00ad\u00c8\u00ee\u00e5\u00f2\u00e5\u00ab\u00e8\u00e5\u00ea\u00e3\u00ab\u00c7\u00e8\u00e5\u00f7\u00f7\u00bf", "\u03df\u03d6\u03c4\u03df\u03f4\u03d8\u03d3\u03d2\u038b\u0389\u039f\u039e\u03fe", "\u0138\u012c\u0128\u013c\u0131\u012e\u0161\u0163\u0175\u0111\u0137\u013c\u012b\u013c\u0172\u0131\u013c\u0133\u013a\u0172\u0112\u013f\u0137\u0138\u013e\u0129\u0166\u0174\u0107", "69:;0ik}|\u0019?4#4z94;2z\u001a7?06!n", "\u074d\u0756\u076a\u074d\u074b\u0750\u0757\u075e\u0705\u0707\u0711\u0710\u0775\u0753\u0758\u074f\u0758\u0716\u0755\u0758\u0757\u075e\u0716\u076a\u074d\u074b\u0750\u0757\u075e\u0702", "\u063a\u063b\u0620\u063d\u0632\u062d\u0668\u066a\u067c\u067d\u0602", "\u0500\u0501\u051a\u0507\u0508\u0517\u052f\u0502\u0502\u0552\u0550\u0546\u0547\u0538", "\u03c5\u03d3\u03db\u03c6\u038e\u038c\u039a\u039b\u03e4", "\u066c\u067a\u0672\u066f\u0627\u0625\u0633\u0651\u0632\u064d", "\u0283\u0295\u029d\u0280\u02c4\u02c8\u02ca\u02dc\u02be\u02dd\u02a2", "\u0217\u0201\u0209\u0214\u025c\u025e\u0248\u022a\u0229\u0249\u0236", "\u0529\u0526\u0521\u052e\u0523\u0526\u0535\u052a\u0573\u0571\u0567\u0566\u0519"})
public final class Class3407 {
    public static float field7423 = Float.intBitsToFloat(1062864475);
    public static double field7424 = 0.9030718371445362;

    private static String ZncAvL4Gl872O70Q(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite wguAWlGdW04FDA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3407.ZncAvL4Gl872O70Q(k2, -635350484));
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
                int a2 = Integer.parseInt(Class3407.ZncAvL4Gl872O70Q(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3407.ZncAvL4Gl872O70Q(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3407.ZncAvL4Gl872O70Q(k2, -635350484) + " " + l2 + " " + m2);
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

