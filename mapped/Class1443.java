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
@HACHIMI_CLIENT(mv=100, d1={"\u8495\u8495\u8493\u8490\u8492\u8493\u8492\u849f", "\uc960\uc967\uc961\uc963\uc964\uc963\uc96f\uc962", "\u0a26\u0a24\u0a2a\u0a23\u0a26\u0a21\u0a2a\u0a22", "\u95d3\u95d2\u95d2\u95d0\u95d1\u95d3\u95dd\u95d7", "\u96ed\u96ef\u96ee\u96e0\u96e9\u96e1\u96ef\u96eb", "\u2bad\u2ba3\u2ba8\u2ba3\u2ba9\u2bae\u2ba2\u2ba2", "\ua5a9\ua5a6\ua5ab\ua5a7\ua5aa\ua5a7\ua5a9\ua5ae", "\u4d8e\u4d80\u4d8a\u4d8f\u4d8a\u4d8a\u4d89\u4d80", "\uc1ef\uc1ef\uc1ef\uc1e3\uc1e0\uc1e2\uc1e7", "\u111f\u111b\u111e\u111b\u1118\u111a\u111e\u111e", "\u4fca\u4fc7\u4fc9\u4fc7\u4fcb\u4fce\u4fcd\u4fcb", "\u68c9\u68c9\u68ca\u68c8\u68cb\u68ce\u68cf\u68c8", "\u4d99\u4d9d\u4d98\u4d9e\u4d99\u4d9a\u4d9a\u4d9d", "\u759a\u759e\u759f\u759e\u7599\u7598\u759d\u759c"}, d2={"\u0131\u016e\u0161\u0164\u0163\u0164\u0179\u0133\u0131\u0133\u0125\u0124\u015b", "\u0380\u03d5\u03d2\u03d5\u03c8\u0382\u0380\u0382\u0394\u0395\u03ea", "\u0761\u0763\u0772\u0745\u076a\u0767\u0775\u0775\u073a\u0738\u072e\u072f\u074a\u076c\u0767\u0770\u0767\u0729\u076a\u0767\u0768\u0761\u0729\u0745\u076a\u0767\u0775\u0775\u073d", "\u00be\u00b7\u00a5\u00be\u0095\u00b9\u00b2\u00b3\u00ea\u00e8\u00fe\u00ff\u009f", "\u0596\u0582\u0586\u0592\u059f\u0580\u05cf\u05cd\u05db\u05bf\u0599\u0592\u0585\u0592\u05dc\u059f\u0592\u059d\u0594\u05dc\u05bc\u0591\u0599\u0596\u0590\u0587\u05c8\u05da\u05a9", "\u0728\u0727\u0724\u0725\u072e\u0777\u0775\u0763\u0762\u0707\u0721\u072a\u073d\u072a\u0764\u0727\u072a\u0725\u072c\u0764\u0704\u0729\u0721\u072e\u0728\u073f\u0770", "\u01ad\u01b6\u018a\u01ad\u01ab\u01b0\u01b7\u01be\u01e5\u01e7\u01f1\u01f0\u0195\u01b3\u01b8\u01af\u01b8\u01f6\u01b5\u01b8\u01b7\u01be\u01f6\u018a\u01ad\u01ab\u01b0\u01b7\u01be\u01e2", "\u05ea\u05eb\u05f0\u05ed\u05e2\u05fd\u05b8\u05ba\u05ac\u05ad\u05d2", "45.3<#\u001b66fdrs\f", "\u0737\u0721\u0729\u0734\u077c\u077e\u0768\u0769\u0716", "\u0690\u0686\u068e\u0693\u06db\u06d9\u06cf\u06ad\u06ce\u06b1", "\u0199\u018f\u0187\u019a\u01de\u01d2\u01d0\u01c6\u01a4\u01c7\u01b8", "\u0679\u066f\u0667\u067a\u0632\u0630\u0626\u0644\u0647\u0627\u0658", "\u0668\u0667\u0660\u066f\u0662\u0667\u0674\u066b\u0632\u0630\u0626\u0627\u0658"})
public final class Class1443 {
    public static float field5494 = Float.intBitsToFloat(1053207562);
    public static float field5495 = Float.intBitsToFloat(0x3F000000);
    public static double field5496 = Double.longBitsToDouble(0x4000000000000000L);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 19yTIoQP6zv3Jq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1443.NomUFq67b662bD4V(k2, -797765595));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1443.NomUFq67b662bD4V(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 14724 : 14725;
            block7: while (true) {
                switch (n3) {
                    case 14725: {
                        n3 = 14723;
                        continue block7;
                    }
                    case 14724: {
                        String c2 = Class1443.NomUFq67b662bD4V(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1443.NomUFq67b662bD4V(k2, -797765595) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String NomUFq67b662bD4V(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

