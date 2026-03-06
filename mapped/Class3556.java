/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Stream;
import mapped.Class652;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u4dd1\u4dd1\u4ddd\u4dd5\u4dd3\u4ddd\u4dd5\u4dd0", "\u0d43\u0d42\u0d45\u0d47\u0d49\u0d49\u0d48\u0d48", "\u7f44\u7f40\u7f41\u7f41\u7f44\u7f44\u7f48\u7f45", "\u7625\u7620\u7621\u7627\u7621\u7625\u7622\u7624", "\u3697\u3694\u3696\u3694\u369d\u3697\u369c\u3693", "\u3445\u344f\u3446\u344f\u3444\u344f\u344e\u3445", "\u1564\u1564\u1564\u1562\u1560\u1564\u156f\u1564", "\u1d73\u1d75\u1d77\u1d71\u1d75\u1d74\u1d72\u1d71", "\u3826\u3828\u3820\u3823\u3828\u3825\u3820", "\ud266\ud267\ud266\ud26b\ud267\ud26a\ud261\ud261", "\u87f9\u87fa\u87f1\u87fd\u87f0\u87fe\u87fa\u87f1", "\u59f3\u59f0\u59f2\u59f4\u59f1\u59f6\u59f0\u59f7", "\u7f05\u7f06\u7f04\u7f02\u7f04\u7f0e\u7f00\u7f04", "\u1c20\u1c21\u1c27\u1c23\u1c2d\u1c22\u1c23", "\u2c82\u2c84\u2c81\u2c87\u2c85\u2c8e\u2c87\u2c83", "\uc2c5\uc2c3\uc2c4\uc2c0\uc2cb\uc2c7\uc2ca\uc2c3"}, d2={"\u0245\u0210\u0217\u0210\u020d\u0247\u0245\u0247\u0251\u0250\u022f", "\u01e0\u01d7\u01fa\u219d\u01af\u01ad\u01bb\u01df\u01f9\u01f2\u01e5\u01f2\u01bc\u01e6\u01e7\u01fa\u01ff\u01bc\u01e0\u01e7\u01e1\u01f6\u01f2\u01fe\u01bc\u01c0\u01e7\u01e1\u01f6\u01f2\u01fe\u01a8\u01df\u01f9\u01f2\u01e5\u01f2\u01bc\u01e6\u01e7\u01fa\u01ff\u01bc\u01f5\u01e6\u01fd\u01f0\u01e7\u01fa\u01fc\u01fd\u01bc\u01d5\u01e6\u01fd\u01f0\u01e7\u01fa\u01fc\u01fd\u01a8\u01ba\u01df\u01f9\u01f2\u01e5\u01f2\u01bc\u01e6\u01e7\u01fa\u01ff\u01bc\u01e0\u01e7\u01e1\u01f6\u01f2\u01fe\u01bc\u01c0\u01e7\u01e1\u01f6\u01f2\u01fe\u01a8", "\u0450\u0467\u0449\u242d\u041f\u041d\u040b\u046f\u0449\u0442\u0455\u0442\u040c\u0456\u0457\u044a\u044f\u040c\u0445\u0456\u044d\u0440\u0457\u044a\u044c\u044d\u040c\u0465\u0456\u044d\u0440\u0457\u044a\u044c\u044d\u0418\u046f\u0449\u0442\u0455\u0442\u040c\u044f\u0442\u044d\u0444\u040c\u046c\u0441\u0449\u0446\u0440\u0457\u0418\u040a\u046f\u044d\u0446\u0457\u040c\u044b\u0442\u0440\u044b\u044a\u044e\u044a\u040c\u0440\u044f\u044a\u0446\u044d\u0457\u040c\u0423\u044b\u0442\u0440\u044b\u044a\u044e\u044a\u0440\u044f\u044a\u0446\u044d\u0457\u0407\u0456\u0448\u0418", "\u04e7\u04b2\u04b5\u04b2\u04af\u04e5\u04e7\u04e5\u04f3\u04f2\u048d", "\u0346\u0344\u0355\u0362\u034d\u0340\u0352\u0352\u031d\u031f\u0309\u0308\u036d\u034b\u0340\u0357\u0340\u030e\u034d\u0340\u034f\u0346\u030e\u0362\u034d\u0340\u0352\u0352\u031a", "\u0015\u001c\u000e\u0015>\u0012\u0019\u0018ACUT4", "\u0724\u0730\u0734\u0720\u072d\u0732\u077d\u077f\u0769\u070d\u072b\u0720\u0737\u0720\u076e\u072d\u0720\u072f\u0726\u076e\u070e\u0723\u072b\u0724\u0722\u0735\u077a\u0768\u071b", "\u0225\u022a\u0229\u0228\u0223\u027a\u0278\u026e\u026f\u020a\u022c\u0227\u0230\u0227\u0269\u022a\u0227\u0228\u0221\u0269\u0209\u0224\u022c\u0223\u0225\u0232\u027d", "\u04a3\u04b8\u0484\u04a3\u04a5\u04be\u04b9\u04b0\u04eb\u04e9\u04ff\u04fe\u049b\u04bd\u04b6\u04a1\u04b6\u04f8\u04bb\u04b6\u04b9\u04b0\u04f8\u0484\u04a3\u04a5\u04be\u04b9\u04b0\u04ec", "()2/ ?zxno\u0010", "\u0152\u0153\u0148\u0155\u015a\u0145\u017d\u0150\u0150\u0100\u0102\u0114\u0115\u016a", "\u02c6\u02d0\u02d8\u02c5\u028d\u028f\u0299\u0298\u02e7", "\u0602\u0614\u061c\u0601\u0649\u064b\u065d\u063f\u065c\u0623", ".80-iegq\u0013p\u000f", "\u05b3\u05a5\u05ad\u05b0\u05f8\u05fa\u05ec\u058e\u058d\u05ed\u0592", "\u0443\u044c\u044b\u0444\u0449\u044c\u045f\u0440\u0419\u041b\u040d\u040c\u0473"})
public class Class3556 {
    private static Class652 method17827(Function a2, Object b2) {
        Comparable c2 = (Comparable)a2.apply(b2);
        return new Class652(b2, c2);
    }

    private static String wJtllv2YYrG3AY2j(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite EbNQT6AgpFlTo7(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3556.wJtllv2YYrG3AY2j(k2, 1152322734));
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
                int a2 = Integer.parseInt(Class3556.wJtllv2YYrG3AY2j(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3556.wJtllv2YYrG3AY2j(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3556.wJtllv2YYrG3AY2j(k2, 1152322734) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    public static Stream method17828(Stream a2, Function b2) {
        return a2.map(arg_0 -> Class3556.method17827(b2, arg_0)).sorted(Comparator.comparing(Class652::method11459)).map(Class652::method11460);
    }
}

