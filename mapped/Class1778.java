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
@HACHIMI_CLIENT(mv=100, d1={"\ub574\ub575\ub574\ub571\ub575\ub570\ub575\ub570", "\u2cfa\u2cf9\u2cfc\u2cfa\u2cfd\u2cfc\u2cf6\u2cfc", "\u0180\u0184\u018f\u0182\u0182\u0187\u0180", "\uc129\uc12a\uc129\uc127\uc12e\uc12d\uc12a\uc12c", "\u49c1\u49c9\u49cc\u49c0\u49c8\u49ca\u49cb", "\u2f4c\u2f49\u2f46\u2f46\u2f4a\u2f46\u2f4d\u2f4a", "\u481b\u481e\u4816\u481c\u481e\u481b\u4817\u4817", "\u0243\u0248\u0247\u0247\u0242\u0242\u0243\u0241", "\ucba7\ucba2\ucba0\ucba5\ucba2\ucbad\ucbac\ucba1", "\ua2f1\ua2f6\ua2f1\ua2ff\ua2f4\ua2f6\ua2f1\ua2f1", "\u9da8\u9da3\u9dae\u9dac\u9dab\u9daf\u9daa\u9dae", "\u018e\u0185\u0189\u018a\u0189\u018f\u018b\u018a", "\u5aa3\u5aa4\u5aaf\u5aa2\u5aa0\u5aa6\u5aa3\u5aa4", "\u4db5\u4db1\u4db7\u4db1\u4db5\u4db3\u4db1\u4db6", "\ue86a\ue861\ue86d\ue86c\ue868\ue869\ue861\ue86d", "\u4ccc\u4cc6\u4ccf\u4cc7\u4cce\u4ccf\u4cc9\u4ccf"}, d2={"\u06bb\u06bf\u26e5\u06d7\u06d5\u06c3\u06a7\u0681\u068a\u069d\u068a\u06c4\u0687\u068a\u0685\u068c\u06c4\u06b8\u069f\u0699\u0682\u0685\u068c\u06d0\u06c2\u06a7\u0681\u068a\u069d\u068a\u06c4\u0687\u068a\u0685\u068c\u06c4\u06b8\u069f\u0699\u0682\u0685\u068c\u06d0", "\u0582\u0587\u25dc\u05ee\u05ec\u05fa\u059e\u05b8\u05b3\u05a4\u05b3\u05fd\u05be\u05b3\u05bc\u05b5\u05fd\u0581\u05a6\u05a0\u05bb\u05bc\u05b5\u05e9\u05fb\u059e\u05b8\u05b3\u05a4\u05b3\u05fd\u05be\u05b3\u05bc\u05b5\u05fd\u0581\u05a6\u05a0\u05bb\u05bc\u05b5\u05e9", "\u0744\u071b\u0714\u0711\u0716\u0711\u070c\u0746\u0744\u0746\u0750\u0751\u072e", "\u020d\u0258\u025f\u0258\u0245\u020f\u020d\u020f\u0219\u0218\u0267", "\u069c\u069e\u068f\u06b8\u0697\u069a\u0688\u0688\u06c7\u06c5\u06d3\u06d2\u06b7\u0691\u069a\u068d\u069a\u06d4\u0697\u069a\u0695\u069c\u06d4\u06b8\u0697\u069a\u0688\u0688\u06c0", "\u0651\u0658\u064a\u0651\u067a\u0656\u065d\u065c\u0605\u0607\u0611\u0610\u0670", "\u0532\u0526\u0522\u0536\u053b\u0524\u056b\u0569\u057f\u051b\u053d\u0536\u0521\u0536\u0578\u053b\u0536\u0539\u0530\u0578\u0518\u0535\u053d\u0532\u0534\u0523\u056c\u057e\u050d", "\u05b3\u05bc\u05bf\u05be\u05b5\u05ec\u05ee\u05f8\u05f9\u059c\u05ba\u05b1\u05a6\u05b1\u05ff\u05bc\u05b1\u05be\u05b7\u05ff\u059f\u05b2\u05ba\u05b5\u05b3\u05a4\u05eb", "\u0154\u014f\u0173\u0154\u0152\u0149\u014e\u0147\u011c\u011e\u0108\u0109\u016c\u014a\u0141\u0156\u0141\u010f\u014c\u0141\u014e\u0147\u010f\u0173\u0154\u0152\u0149\u014e\u0147\u011b", "\u02b0\u02b1\u02aa\u02b7\u02b8\u02a7\u02e2\u02e0\u02f6\u02f7\u0288", "\u05e8\u05e9\u05f2\u05ef\u05e0\u05ff\u05c7\u05ea\u05ea\u05ba\u05b8\u05ae\u05af\u05d0", "\u0400\u0416\u041e\u0403\u044b\u0449\u045f\u045e\u0421", "\u067c\u066a\u0662\u067f\u0637\u0635\u0623\u0641\u0622\u065d", "\b\u001e\u0016\u000bOCAW5V)", "\u019f\u0189\u0181\u019c\u01d4\u01d6\u01c0\u01a2\u01a1\u01c1\u01be", "\u0653\u065c\u065b\u0654\u0659\u065c\u064f\u0650\u0609\u060b\u061d\u061c\u0663"})
public final class Class1778 {
    public static double field6658;
    public static float field6659;

    private static String tVbJgYU7SUWWjDBL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field6659 = Float.intBitsToFloat(1042855944);
        z\u200e = "False";
        I\u200e = "Waypoint already exist!";
        field6658 = Double.longBitsToDouble(4601322405406084248L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 9ZUNGymw0rhpb6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1778.tVbJgYU7SUWWjDBL(k2, -785325449));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 42524 : 42525;
        block6: while (true) {
            switch (n3) {
                case 42525: {
                    n3 = 42523;
                    continue block6;
                }
                case 42524: {
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
                int a2 = Integer.parseInt(Class1778.tVbJgYU7SUWWjDBL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1778.tVbJgYU7SUWWjDBL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class1778.tVbJgYU7SUWWjDBL(k2, -785325449) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

