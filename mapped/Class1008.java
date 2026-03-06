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
@HACHIMI_CLIENT(mv=100, d1={"\u4727\u472d\u4724\u472d\u472d\u4723\u4720\u472d", "\u2ca2\u2ca7\u2ca4\u2ca4\u2ca0\u2ca7\u2caf\u2ca7", "\u4f6d\u4f6f\u4f69\u4f69\u4f69\u4f6c\u4f6d\u4f6a", "\u4dce\u4dca\u4dc2\u4dce\u4dc8\u4dcd\u4dcd\u4dcc", "\u253f\u253c\u253e\u2538\u253e\u2532\u253d\u2532", "\u0d7b\u0d70\u0d74\u0d72\u0d7a\u0d70", "\u02b1\u02b2\u02b2\u02b7\u02b0\u02b0\u02b4\u02bb", "\ub511\ub510\ub516\ub511\ub510\ub512\ub51e", "\u8e8a\u8e8c\u8e89\u8e8c\u8e8f\u8e89\u8e8c\u8e8a", "\u7951\u795c\u7956\u7955\u795c\u7956\u7952\u7951", "\ua053\ua054\ua054\ua054\ua053\ua054\ua057", "\u51c1\u51c8\u51cf\u51cb\u51ce\u51cc\u51c0", "\u5bb6\u5bb0\u5bb2\u5bb6\u5bb4\u5bb0\u5bb2\u5bbd", "\u5f6e\u5f67\u5f6f\u5f6e\u5f6f\u5f69\u5f6d\u5f66", "\ube34\ube34\ube30\ube31\ube36\ube34\ube31\ube33", "\u9830\u9833\u9835\u9836\u9832\u9831\u9832\u9830", "\u1b80\u1b8c\u1b8c\u1b8d\u1b85\u1b8c\u1b8c\u1b87", "\u06e6\u06e2\u06e0\u06ea\u06ea\u06e7\u06e0\u06eb", "\u1df8\u1dfc\u1dfc\u1dfd\u1dfd\u1dfc\u1dfd\u1dfe"}, d2={"\u068a\u06a9\u06a6\u26ea\u06d8\u06da\u06cc\u06a8\u068e\u0685\u0692\u0685\u06cb\u0688\u0685\u068a\u0683\u06cb\u06b7\u0690\u0696\u068d\u068a\u0683\u06df\u06cd\u06a8\u068e\u0685\u0692\u0685\u06cb\u0688\u0685\u068a\u0683\u06cb\u06b7\u0690\u0696\u068d\u068a\u0683\u06df", "\u0703\u0720\u072e\u2763\u0751\u0753\u0745\u0721\u0707\u070c\u071b\u070c\u0742\u0701\u070c\u0703\u070a\u0742\u073e\u0719\u071f\u0704\u0703\u070a\u0756\u0744\u0721\u0707\u070c\u071b\u070c\u0742\u0701\u070c\u0703\u070a\u0742\u073e\u0719\u071f\u0704\u0703\u070a\u0756", "\u0754\u0777\u077e\u2734\u0706\u0704\u0712\u0776\u0750\u075b\u074c\u075b\u0715\u0756\u075b\u0754\u075d\u0715\u0769\u074e\u0748\u0753\u0754\u075d\u0701\u0713\u0776\u0750\u075b\u074c\u075b\u0715\u0756\u075b\u0754\u075d\u0715\u0769\u074e\u0748\u0753\u0754\u075d\u0701", "\u069a\u06b9\u06b1\u26fa\u06c8\u06ca\u06dc\u06b8\u069e\u0695\u0682\u0695\u06db\u0698\u0695\u069a\u0693\u06db\u06a7\u0680\u0686\u069d\u069a\u0693\u06cf\u06dd\u06b8\u069e\u0695\u0682\u0695\u06db\u0698\u0695\u069a\u0693\u06db\u06a7\u0680\u0686\u069d\u069a\u0693\u06cf", "aBI\u200131'Cenyn cnah \\{}fah4&Cenyn cnah \\{}fah4", "\u0493\u04cc\u04c3\u04c6\u04c1\u04c6\u04db\u0491\u0493\u0491\u0487\u0486\u04f9", "\u062b\u067e\u0679\u067e\u0663\u0629\u062b\u0629\u063f\u063e\u0641", "\u00ad\u00af\u00be\u0089\u00a6\u00ab\u00b9\u00b9\u00f6\u00f4\u00e2\u00e3\u0086\u00a0\u00ab\u00bc\u00ab\u00e5\u00a6\u00ab\u00a4\u00ad\u00e5\u0089\u00a6\u00ab\u00b9\u00b9\u00f1", "\u05c2\u05cb\u05d9\u05c2\u05e9\u05c5\u05ce\u05cf\u0596\u0594\u0582\u0583\u05e3", "\u01fe\u01ea\u01ee\u01fa\u01f7\u01e8\u01a7\u01a5\u01b3\u01d7\u01f1\u01fa\u01ed\u01fa\u01b4\u01f7\u01fa\u01f5\u01fc\u01b4\u01d4\u01f9\u01f1\u01fe\u01f8\u01ef\u01a0\u01b2\u01c1", "\u05cf\u05c0\u05c3\u05c2\u05c9\u0590\u0592\u0584\u0585\u05e0\u05c6\u05cd\u05da\u05cd\u0583\u05c0\u05cd\u05c2\u05cb\u0583\u05e3\u05ce\u05c6\u05c9\u05cf\u05d8\u0597", "\u0191\u018a\u01b6\u0191\u0197\u018c\u018b\u0182\u01d9\u01db\u01cd\u01cc\u01a9\u018f\u0184\u0193\u0184\u01ca\u0189\u0184\u018b\u0182\u01ca\u01b6\u0191\u0197\u018c\u018b\u0182\u01de", "\u019d\u019c\u0187\u019a\u0195\u018a\u01cf\u01cd\u01db\u01da\u01a5", "\u0476\u0477\u046c\u0471\u047e\u0461\u0459\u0474\u0474\u0424\u0426\u0430\u0431\u044e", "\u00e2\u00f4\u00fc\u00e1\u00a9\u00ab\u00bd\u00bc\u00c3", "\u020d\u021b\u0213\u020e\u0246\u0244\u0252\u0230\u0253\u022c", "\u041d\u040b\u0403\u041e\u045a\u0456\u0454\u0442\u0420\u0443\u043c", "DRZG\u000f\r\u001byz\u001ae", "\u03fc\u03f3\u03f4\u03fb\u03f6\u03f3\u03e0\u03ff\u03a6\u03a4\u03b2\u03b3\u03cc"})
public final class Class1008 {
    public static int field4174 = 1;
    public static float field4175 = 0.6935261f;
    public static float field4176;
    public static String field4177;

    static {
        h\u200e = "Leave";
        Y\u200e = "STRAFE_B_HOP";
        field4176 = Float.intBitsToFloat(1048801918);
        aX\u200e = "VoidColor";
        bd\u200e = "SmoothColor";
        field4177 = "Initializing PositionManager ...";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 62wBd16L96hmPT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1008.NWrmnxNaG6wl5R69(k2, 438382466));
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
                int a2 = Integer.parseInt(Class1008.NWrmnxNaG6wl5R69(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1008.NWrmnxNaG6wl5R69(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1008.NWrmnxNaG6wl5R69(k2, 438382466) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String NWrmnxNaG6wl5R69(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

