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

@HACHIMI_CLIENT(mv=100, d1={"\u4efa\u4eff\u4efe\u4eff\u4ef8\u4ef9\u4efe\u4efd", "\u590d\u590d\u590d\u590b\u590c\u590e\u590d\u5902", "\uc226\uc22d\uc226\uc22d\uc226\uc225\uc223\uc225", "\u1604\u1604\u1602\u160e\u1602\u160f\u1604\u1602", "\ue6f9\ue6fc\ue6ff\ue6f9\ue6f8\ue6f9\ue6f8\ue6fa", "\ud28d\ud28f\ud288\ud28d\ud28f\ud28d\ud28c\ud28f", "\ua065\ua063\ua067\ua063\ua065\ua062\ua066\ua06f", "\ue87d\ue87e\ue87d\ue878\ue875\ue879\ue87f\ue875", "\ua9e6\ua9e7\ua9e4\ua9e1\ua9e1\ua9e2\ua9e5\ua9e5", "\ue4d1\ue4d1\ue4db\ue4d1\ue4d5\ue4da\ue4d4", "\uc978\uc97e\uc979\uc977\uc977\uc978\uc979\uc97a", "\u79c4\u79c5\u79c3\u79c5\u79c4\u79c0\u79c9\u79c3", "\u45cc\u45ce\u45cc\u45cd\u45c0\u45c0\u45ce\u45cc", "\u8337\u8338\u8330\u8330\u8338\u8337\u8334\u8336", "\u2262\u2264\u2265\u2264\u2265\u226c\u2264\u2265", "\u67bb\u67ba\u67bc\u67b8\u67bd\u67bc\u67bf\u67b8"}, d2={"\u0666\u0641\u066a\u260a\u0638\u063a\u062c\u0648\u066e\u0665\u0672\u0665\u062b\u0668\u0665\u066a\u0663\u062b\u0657\u0670\u0676\u066d\u066a\u0663\u063f\u062d\u0648\u066e\u0665\u0672\u0665\u062b\u0668\u0665\u066a\u0663\u062b\u0657\u0670\u0676\u066d\u066a\u0663\u063f", "\u045c\u047b\u0451\u2430\u0402\u0400\u0416\u0472\u0454\u045f\u0448\u045f\u0411\u0452\u045f\u0450\u0459\u0411\u046d\u044a\u044c\u0457\u0450\u0459\u0405\u0417\u0472\u0454\u045f\u0448\u045f\u0411\u0452\u045f\u0450\u0459\u0411\u046d\u044a\u044c\u0457\u0450\u0459\u0405", "l3<9>9$nlnxy\u0006", "\u0670\u0625\u0622\u0625\u0638\u0672\u0670\u0672\u0664\u0665\u061a", "\f\u000e\u001f(\u0007\n\u0018\u0018WUCB'\u0001\n\u001d\nD\u0007\n\u0005\fD(\u0007\n\u0018\u0018P", "\u0756\u075f\u074d\u0756\u077d\u0751\u075a\u075b\u0702\u0700\u0716\u0717\u0777", "\u068c\u0698\u069c\u0688\u0685\u069a\u06d5\u06d7\u06c1\u06a5\u0683\u0688\u069f\u0688\u06c6\u0685\u0688\u0687\u068e\u06c6\u06a6\u068b\u0683\u068c\u068a\u069d\u06d2\u06c0\u06b3", "\u001c\u0013\u0010\u0011\u001aCAWV3\u0015\u001e\t\u001eP\u0013\u001e\u0011\u0018P0\u001d\u0015\u001a\u001c\u000bD", "\u0705\u071e\u0722\u0705\u0703\u0718\u071f\u0716\u074d\u074f\u0759\u0758\u073d\u071b\u0710\u0707\u0710\u075e\u071d\u0710\u071f\u0716\u075e\u0722\u0705\u0703\u0718\u071f\u0716\u074a", "\u0661\u0660\u067b\u0666\u0669\u0676\u0633\u0631\u0627\u0626\u0659", "\u0318\u0319\u0302\u031f\u0310\u030f\u0337\u031a\u031a\u034a\u0348\u035e\u035f\u0320", "\u0792\u0784\u078c\u0791\u07d9\u07db\u07cd\u07cc\u07b3", "\u05ee\u05f8\u05f0\u05ed\u05a5\u05a7\u05b1\u05d3\u05b0\u05cf", "\u0306\u0310\u0318\u0305\u0341\u034d\u034f\u0359\u033b\u0358\u0327", "\u0371\u0367\u036f\u0372\u033a\u0338\u032e\u034c\u034f\u032f\u0350", "\u02be\u02b1\u02b6\u02b9\u02b4\u02b1\u02a2\u02bd\u02e4\u02e6\u02f0\u02f1\u028e"})
public final class Class1408 {
    public static float field5419 = 0.7311994f;
    public static String field5420;

    private static String vJcC2WJdap4kT5hS(String a2, int b2) {
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
    private static CallSite IbDsL2Qh4RBhTS(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1408.vJcC2WJdap4kT5hS(k2, 521182550));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1408.vJcC2WJdap4kT5hS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1408.vJcC2WJdap4kT5hS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1408.vJcC2WJdap4kT5hS(k2, 521182550) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 != 1 ? 46728 : 46727;
        block7: while (true) {
            switch (n3) {
                case 46728: {
                    n3 = 46726;
                    continue block7;
                }
                case 46727: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        U\u200e = "ShiftTicks";
        field5420 = "Initializing HoleManager ...";
    }
}

