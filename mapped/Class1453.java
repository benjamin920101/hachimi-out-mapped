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
@HACHIMI_CLIENT(mv=100, d1={"\ucdc2\ucdc1\ucdc8\ucdc5\ucdc0\ucdc5\ucdc8\ucdc2", "\u32fb\u32f7\u32f8\u32f6\u32ff\u32fe\u32f6\u32ff", "\u3645\u364e\u3648\u364c\u3644\u364f\u3644", "\u8222\u8227\u8220\u8226\u8221\u8224\u8226\u8227", "\u561c\u561b\u5619\u5612\u5612\u5618\u561a\u5612", "\ua178\ua17d\ua179\ua17c\ua17b\ua17e\ua179", "\u6777\u677d\u6771\u6773\u6775\u677d\u677c", "\u8f34\u8f36\u8f3f\u8f32\u8f37\u8f37\u8f34\u8f37", "\ucb6f\ucb6d\ucb6f\ucb6b\ucb6a\ucb68\ucb6e\ucb6c", "\ubec9\ubece\ubecc\ubecc\ubecd\ubecf", "\u5727\u5721\u572d\u5727\u5721\u5725\u5722\u5727", "\u11a1\u11a6\u11a6\u11ad\u11a1\u11a1\u11a0\u11a2", "\u30a5\u30a2\u30a4\u30af\u30a4\u30a0\u30a5\u30a6", "\uc351\uc35b\uc350\uc35b\uc35a\uc352\uc35a\uc353"}, d2={"\u0252\u020d\u0202\u0207\u0200\u0207\u021a\u0250\u0252\u0250\u0246\u0247\u0238", "\u001aOHOR\u0018\u001a\u0018\u000e\u000fp", "\u03f6\u03f4\u03e5\u03d2\u03fd\u03f0\u03e2\u03e2\u03ad\u03af\u03b9\u03b8\u03dd\u03fb\u03f0\u03e7\u03f0\u03be\u03fd\u03f0\u03ff\u03f6\u03be\u03d2\u03fd\u03f0\u03e2\u03e2\u03aa", "\u0080\u0089\u009b\u0080\u00ab\u0087\u008c\u008d\u00d4\u00d6\u00c0\u00c1\u00a1", "\u0707\u0713\u0717\u0703\u070e\u0711\u075e\u075c\u074a\u072e\u0708\u0703\u0714\u0703\u074d\u070e\u0703\u070c\u0705\u074d\u072d\u0700\u0708\u0707\u0701\u0716\u0759\u074b\u0738", "\u0125\u012a\u0129\u0128\u0123\u017a\u0178\u016e\u016f\u010a\u012c\u0127\u0130\u0127\u0169\u012a\u0127\u0128\u0121\u0169\u0109\u0124\u012c\u0123\u0125\u0132\u017d", "\u0665\u067e\u0642\u0665\u0663\u0678\u067f\u0676\u062d\u062f\u0639\u0638\u065d\u067b\u0670\u0667\u0670\u063e\u067d\u0670\u067f\u0676\u063e\u0642\u0665\u0663\u0678\u067f\u0676\u062a", "\u02ba\u02bb\u02a0\u02bd\u02b2\u02ad\u02e8\u02ea\u02fc\u02fd\u0282", "\u0124\u0125\u013e\u0123\u012c\u0133\u010b\u0126\u0126\u0176\u0174\u0162\u0163\u011c", "\u0186\u0190\u0198\u0185\u01cd\u01cf\u01d9\u01d8\u01a7", "\u07d1\u07c7\u07cf\u07d2\u079a\u0798\u078e\u07ec\u078f\u07f0", "\u0370\u0366\u036e\u0373\u0337\u033b\u0339\u032f\u034d\u032e\u0351", "\u01ff\u01e9\u01e1\u01fc\u01b4\u01b6\u01a0\u01c2\u01c1\u01a1\u01de", "\u06f6\u06f9\u06fe\u06f1\u06fc\u06f9\u06ea\u06f5\u06ac\u06ae\u06b8\u06b9\u06c6"})
public final class Class1453 {
    public static float field5531;
    public static float field5532;
    public static float field5533;

    /*
     * WARNING - void declaration
     */
    private static CallSite MYK8ohpOJ6QglO(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1453.1tqiJicEc2Jc47tb(k2, -372461338));
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
                int a2 = Integer.parseInt(Class1453.1tqiJicEc2Jc47tb(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1453.1tqiJicEc2Jc47tb(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1453.1tqiJicEc2Jc47tb(k2, -372461338) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field5532 = Float.intBitsToFloat(1061189440);
        field5531 = Float.intBitsToFloat(1063941361);
        field5533 = Float.intBitsToFloat(1063643140);
    }

    private static String 1tqiJicEc2Jc47tb(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

