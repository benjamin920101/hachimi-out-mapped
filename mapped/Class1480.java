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

@HACHIMI_CLIENT(mv=100, d1={"\u00a6\u00a5\u00a6\u00a3\u00a1\u00a9\u00a5\u00a8", "\u3a43\u3a42\u3a46\u3a42\u3a4e\u3a46\u3a40\u3a44", "\u9d2e\u9d2c\u9d2b\u9d2e\u9d29\u9d2f\u9d2f\u9d2e", "\u0096\u0095\u0097\u0095\u0091\u0090\u0098\u0098", "\u992e\u992b\u9929\u9927\u992a\u9929\u9928", "\u6e1c\u6e17\u6e16\u6e18\u6e18\u6e1c\u6e18\u6e1d", "\ub4e8\ub4ee\ub4ed\ub4ec\ub4e8\ub4ee\ub4ef\ub4e9", "\u6660\u6662\u6664\u6662\u6667\u6663\u6661\u6663", "\u02b4\u02b0\u02b2\u02b5\u02b6\u02b2\u02b2\u02b0", "\u1972\u1971\u1972\u1979\u1971\u1974\u1972\u1974", "\u3c1a\u3c1d\u3c1c\u3c1d\u3c1e\u3c1b", "\u6ebc\u6ebb\u6eb0\u6eb8\u6eba\u6ebe\u6eb1\u6eb9", "\ue673\ue677\ue670\ue67f\ue672\ue67e\ue670\ue67f", "\u8919\u8919\u891b\u891e\u8912\u8912\u891a\u891c"}, d2={"\u05d4\u058b\u0584\u0581\u0586\u0581\u059c\u05d6\u05d4\u05d6\u05c0\u05c1\u05be", "\u02db\u028e\u0289\u028e\u0293\u02d9\u02db\u02d9\u02cf\u02ce\u02b1", "\u021e\u021c\u020d\u023a\u0215\u0218\u020a\u020a\u0245\u0247\u0251\u0250\u0235\u0213\u0218\u020f\u0218\u0256\u0215\u0218\u0217\u021e\u0256\u023a\u0215\u0218\u020a\u020a\u0242", "\u06ae\u06a7\u06b5\u06ae\u0685\u06a9\u06a2\u06a3\u06fa\u06f8\u06ee\u06ef\u068f", "\u019f\u018b\u018f\u019b\u0196\u0189\u01c6\u01c4\u01d2\u01b6\u0190\u019b\u018c\u019b\u01d5\u0196\u019b\u0194\u019d\u01d5\u01b5\u0198\u0190\u019f\u0199\u018e\u01c1\u01d3\u01a0", "\u053e\u0531\u0532\u0533\u0538\u0561\u0563\u0575\u0574\u0511\u0537\u053c\u052b\u053c\u0572\u0531\u053c\u0533\u053a\u0572\u0512\u053f\u0537\u0538\u053e\u0529\u0566", "\u023a\u0221\u021d\u023a\u023c\u0227\u0220\u0229\u0272\u0270\u0266\u0267\u0202\u0224\u022f\u0238\u022f\u0261\u0222\u022f\u0220\u0229\u0261\u021d\u023a\u023c\u0227\u0220\u0229\u0275", "\u00b6\u00b7\u00ac\u00b1\u00be\u00a1\u00e4\u00e6\u00f0\u00f1\u008e", "\u0725\u0724\u073f\u0722\u072d\u0732\u070a\u0727\u0727\u0777\u0775\u0763\u0762\u071d", "\u028a\u029c\u0294\u0289\u02c1\u02c3\u02d5\u02d4\u02ab", "\u0304\u0312\u031a\u0307\u034f\u034d\u035b\u0339\u035a\u0325", "V@HU\u0011\u001d\u001f\tk\bw", "\u0382\u0394\u039c\u0381\u03c9\u03cb\u03dd\u03bf\u03bc\u03dc\u03a3", "\u0089\u0086\u0081\u008e\u0083\u0086\u0095\u008a\u00d3\u00d1\u00c7\u00c6\u00b9"})
public final class Class1480 {
    public static double field5602;
    public static float field5603;

    static {
        field5603 = Float.intBitsToFloat(0x40800000);
        field5602 = Double.longBitsToDouble(4605557227218172983L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite E4wTYr57dxuhBG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1480.aWoj6CgrFAdd1LI7(k2, -1596872884));
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
                int a2 = Integer.parseInt(Class1480.aWoj6CgrFAdd1LI7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1480.aWoj6CgrFAdd1LI7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1480.aWoj6CgrFAdd1LI7(k2, -1596872884) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String aWoj6CgrFAdd1LI7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

