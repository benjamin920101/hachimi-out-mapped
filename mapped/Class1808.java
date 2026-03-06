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
@HACHIMI_CLIENT(mv=100, d1={"\u3215\u3217\u3212\u3211\u3217\u3217\u3217\u3213", "\u3670\u3673\u3670\u3673\u3674\u3673\u367a\u3670", "\u39c8\u39cf\u39cf\u39ca\u39cc\u39c7\u39c8\u39c6", "\u88a5\u88a4\u88a2\u88a2\u88ae\u88ae\u88af\u88a5", "\u7032\u7032\u7031\u7038\u7033\u7038\u7037\u7036", "\u8d61\u8d67\u8d62\u8d66\u8d63\u8d63\u8d67", "\u7114\u7112\u7117\u7112\u711f\u7113\u7113\u7117", "\u64a0\u64a1\u64a5\u64a5\u64a1\u64aa\u64ab\u64a0", "\ua075\ua072\ua072\ua07a\ua072\ua072\ua077\ua07a", "\ue302\ue305\ue306\ue303\ue30e\ue305\ue304\ue306", "\u5186\u5184\u5189\u5189\u5187\u5185\u5189\u5189", "\uc1d7\uc1dc\uc1d3\uc1d2\uc1dc\uc1d6\uc1d5", "\u1958\u195a\u195c\u195d\u1958\u195d\u1952\u195f", "\u99ac\u99ac\u99af\u99ad\u99aa\u99a7\u99a9\u99ad", "\ubb34\ubb34\ubb30\ubb37\ubb3f\ubb3f\ubb3e\ubb37"}, d2={"\u043b\u041e\u042a\u245c\u046e\u046c\u047a\u041e\u0438\u0433\u0424\u0433\u047d\u043e\u0433\u043c\u0435\u047d\u0401\u0426\u0420\u043b\u043c\u0435\u0469\u047b\u041e\u0438\u0433\u0424\u0433\u047d\u043e\u0433\u043c\u0435\u047d\u0401\u0426\u0420\u043b\u043c\u0435\u0469", "\u0754\u070b\u0704\u0701\u0706\u0701\u071c\u0756\u0754\u0756\u0740\u0741\u073e", "\u04b0\u04e5\u04e2\u04e5\u04f8\u04b2\u04b0\u04b2\u04a4\u04a5\u04da", "\u02b1\u02b3\u02a2\u0295\u02ba\u02b7\u02a5\u02a5\u02ea\u02e8\u02fe\u02ff\u029a\u02bc\u02b7\u02a0\u02b7\u02f9\u02ba\u02b7\u02b8\u02b1\u02f9\u0295\u02ba\u02b7\u02a5\u02a5\u02ed", "\u0742\u074b\u0759\u0742\u0769\u0745\u074e\u074f\u0716\u0714\u0702\u0703\u0763", "\u0328\u033c\u0338\u032c\u0321\u033e\u0371\u0373\u0365\u0301\u0327\u032c\u033b\u032c\u0362\u0321\u032c\u0323\u032a\u0362\u0302\u032f\u0327\u0328\u032e\u0339\u0376\u0364\u0317", "\u00d6\u00d9\u00da\u00db\u00d0\u0089\u008b\u009d\u009c\u00f9\u00df\u00d4\u00c3\u00d4\u009a\u00d9\u00d4\u00db\u00d2\u009a\u00fa\u00d7\u00df\u00d0\u00d6\u00c1\u008e", "SHtSUNI@\u001b\u0019\u000f\u000ekMFQF\bKFI@\btSUNI@\u001c", "\u0778\u0779\u0762\u077f\u0770\u076f\u072a\u0728\u073e\u073f\u0740", "\u039d\u039c\u0387\u039a\u0395\u038a\u03b2\u039f\u039f\u03cf\u03cd\u03db\u03da\u03a5", "\u076b\u077d\u0775\u0768\u0720\u0722\u0734\u0735\u074a", "\u0718\u070e\u0706\u071b\u0753\u0751\u0747\u0725\u0746\u0739", "\u018a\u019c\u0194\u0189\u01cd\u01c1\u01c3\u01d5\u01b7\u01d4\u01ab", "\u01bf\u01a9\u01a1\u01bc\u01f4\u01f6\u01e0\u0182\u0181\u01e1\u019e", "\u05cc\u05c3\u05c4\u05cb\u05c6\u05c3\u05d0\u05cf\u0596\u0594\u0582\u0583\u05fc"})
public final class Class1808 {
    public static int field6745 = 1;
    public static float field6746 = 0.07664877f;
    public static double field6747;
    public static float field6748;

    static {
        field6748 = Float.intBitsToFloat(1062087318);
        field6747 = Double.longBitsToDouble(4601334071520303402L);
        bj\u200e = "...";
    }

    private static String 8tJ1DdDg6OAoJZcS(String a2, int b2) {
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
    private static CallSite j2bjqVaGVMJeuB(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1808.8tJ1DdDg6OAoJZcS(k2, -1115219492));
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
                int a2 = Integer.parseInt(Class1808.8tJ1DdDg6OAoJZcS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1808.8tJ1DdDg6OAoJZcS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 57605 : 57606;
        block7: while (true) {
            switch (n3) {
                case 57606: {
                    n3 = 57604;
                    continue block7;
                }
                case 57605: {
                    throw new Exception("Can't find method in " + Class1808.8tJ1DdDg6OAoJZcS(k2, -1115219492) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

