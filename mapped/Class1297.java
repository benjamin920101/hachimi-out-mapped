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

@HACHIMI_CLIENT(mv=100, d1={"\u67cc\u67ca\u67c1\u67cf\u67cf\u67c8\u67cd\u67cc", "\u23b1\u23b2\u23ba\u23b1\u23b5\u23b3\u23b5\u23b4", "\u42e7\u42ea\u42e6\u42e8\u42e8\u42e6\u42ef", "\u5095\u5093\u5097\u5097\u5092\u5095\u5094\u5092", "\ub949\ub94b\ub949\ub942\ub94d\ub943\ub94d\ub948", "\u28bc\u28b0\u28be\u28bd\u28bf\u28b9\u28bd\u28b1", "\u2f29\u2f2a\u2f28\u2f2f\u2f2c\u2f2b\u2f2c\u2f2b", "\u3991\u3998\u3994\u3991\u3997\u3998\u3996\u3995", "\u4276\u4272\u4275\u427c\u4271\u427c\u427c", "\u1bb0\u1bb4\u1bbd\u1bbd\u1bb0\u1bb5\u1bb1", "\u74d6\u74d6\u74d3\u74d2\u74d0\u74d3\u74d2\u74d0", "\ua8c2\ua8c4\ua8c7\ua8c3\ua8cf\ua8ce\ua8cf\ua8c2", "\u575d\u5759\u575e\u575d\u5752\u5752\u5753", "\u8433\u8435\u8438\u8433\u8439\u8437\u8430\u8438", "\u6165\u616a\u6160\u6164\u616a\u616a\u6163"}, d2={"\u043c\u043d\u041a\u2441\u0473\u0471\u0467\u0403\u0425\u042e\u0439\u042e\u0460\u0423\u042e\u0421\u0428\u0460\u041c\u043b\u043d\u0426\u0421\u0428\u0474\u0466\u0403\u0425\u042e\u0439\u042e\u0460\u0423\u042e\u0421\u0428\u0460\u041c\u043b\u043d\u0426\u0421\u0428\u0474", "\u0583\u05dc\u05d3\u05d6\u05d1\u05d6\u05cb\u0581\u0583\u0581\u0597\u0596\u05e9", "\u07e8\u07bd\u07ba\u07bd\u07a0\u07ea\u07e8\u07ea\u07fc\u07fd\u0782", "prcT{vdd+)?>[}vav8{vyp8T{vdd,", "\u063e\u0637\u0625\u063e\u0615\u0639\u0632\u0633\u066a\u0668\u067e\u067f\u061f", "\u0606\u0612\u0616\u0602\u060f\u0610\u065f\u065d\u064b\u062f\u0609\u0602\u0615\u0602\u064c\u060f\u0602\u060d\u0604\u064c\u062c\u0601\u0609\u0606\u0600\u0617\u0658\u064a\u0639", "\u07da\u07d5\u07d6\u07d7\u07dc\u0785\u0787\u0791\u0790\u07f5\u07d3\u07d8\u07cf\u07d8\u0796\u07d5\u07d8\u07d7\u07de\u0796\u07f6\u07db\u07d3\u07dc\u07da\u07cd\u0782", "\u0336\u032d\u0311\u0336\u0330\u032b\u032c\u0325\u037e\u037c\u036a\u036b\u030e\u0328\u0323\u0334\u0323\u036d\u032e\u0323\u032c\u0325\u036d\u0311\u0336\u0330\u032b\u032c\u0325\u0379", "\u02e5\u02e4\u02ff\u02e2\u02ed\u02f2\u02b7\u02b5\u02a3\u02a2\u02dd", "\u029a\u029b\u0280\u029d\u0292\u028d\u02b5\u0298\u0298\u02c8\u02ca\u02dc\u02dd\u02a2", "\u0770\u0766\u076e\u0773\u073b\u0739\u072f\u072e\u0751", "\u0668\u067e\u0676\u066b\u0623\u0621\u0637\u0655\u0636\u0649", "\u0597\u0581\u0589\u0594\u05d0\u05dc\u05de\u05c8\u05aa\u05c9\u05b6", "\u028f\u0299\u0291\u028c\u02c4\u02c6\u02d0\u02b2\u02b1\u02d1\u02ae", "\u05e8\u05e7\u05e0\u05ef\u05e2\u05e7\u05f4\u05eb\u05b2\u05b0\u05a6\u05a7\u05d8"})
public final class Class1297 {
    public static double field5037;

    /*
     * Enabled aggressive block sorting
     */
    private static String StxvrPn65q7vWSvU(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block0: while (true) {
            int n2 = d2 >= a2.length() ? 9211 : 9210;
            while (true) {
                int n3;
                if ((n3 = n2) == 9210) {
                    c2.append((char)(a2.charAt(d2) ^ b2));
                    ++d2;
                    continue block0;
                }
                if (n3 != 9211) {
                    return c2.toString();
                }
                n2 = 9209;
            }
            break;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite LjgSeq54BBiber(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1297.StxvrPn65q7vWSvU(k2, -1373219293));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block2: while (true) {
            block8: {
                void e2;
                int n3;
                int n4 = f2 < q2.length ? 18170 : 18171;
                while ((n3 = n4) != 18170) {
                    if (n3 != 18171) break block2;
                    n4 = 18169;
                }
                try {
                    int a2 = Integer.parseInt(Class1297.StxvrPn65q7vWSvU(q2[f2], m2));
                }
                catch (NumberFormatException b2) {
                    break block8;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class1297.StxvrPn65q7vWSvU(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1297.StxvrPn65q7vWSvU(k2, -1373219293) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        q\u200e = "TOTEM";
        field5037 = Double.longBitsToDouble(4603839728280198078L);
    }
}

