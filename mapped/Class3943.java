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
@HACHIMI_CLIENT(mv=100, d1={"\ue5f3\ue5f5\ue5f4\ue5f2\ue5f7\ue5f6\ue5f5\ue5f5", "\u51e0\u51e6\u51e0\u51e0\u51e2\u51e9\u51e1\u51e5", "\uaf2f\uaf24\uaf2e\uaf29\uaf2b\uaf25\uaf2a\uaf2e", "\u3f03\u3f09\u3f06\u3f09\u3f03\u3f03\u3f01\u3f09", "\ua763\ua766\ua762\ua763\ua760\ua764\ua760", "\u7e23\u7e28\u7e27\u7e22\u7e23\u7e20\u7e21\u7e23", "\ub485\ub485\ub485\ub48f\ub48e\ub487\ub48e\ub484", "\ub913\ub914\ub912\ub919\ub912\ub916\ub916\ub917", "\ucf06\ucf01\ucf07\ucf0a\ucf0b\ucf00\ucf02\ucf0b", "\ubb93\ubb93\ubb95\ubb9c\ubb93\ubb92\ubb90\ubb95", "\ua9ad\ua9ab\ua9ab\ua9af\ua9ad\ua9a4\ua9a8\ua9a5", "\u19d3\u19d0\u19d7\u19d2\u19d1\u19d1\u19d1\u19d6", "\u74e2\u74e2\u74e0\u74e6\u74e2\u74e0\u74e7\u74e1", "\u1d3d\u1d3c\u1d36\u1d3b\u1d36\u1d3c\u1d3a\u1d3c", "\u9f79\u9f7f\u9f7f\u9f7e\u9f7b\u9f79\u9f77\u9f7d"}, d2={"\u015a\u017f\u014e\u2139\u010b\u0109\u011f\u017b\u015d\u0156\u0141\u0156\u0118\u015b\u0156\u0159\u0150\u0118\u0164\u0143\u0145\u015e\u0159\u0150\u010c\u011e\u017b\u015d\u0156\u0141\u0156\u0118\u015b\u0156\u0159\u0150\u0118\u0164\u0143\u0145\u015e\u0159\u0150\u010c", "\u03e6\u03b9\u03b6\u03b3\u03b4\u03b3\u03ae\u03e4\u03e6\u03e4\u03f2\u03f3\u038c", "\u01e9\u01bc\u01bb\u01bc\u01a1\u01eb\u01e9\u01eb\u01fd\u01fc\u0183", "\u073a\u0738\u0729\u071e\u0731\u073c\u072e\u072e\u0761\u0763\u0775\u0774\u0711\u0737\u073c\u072b\u073c\u0772\u0731\u073c\u0733\u073a\u0772\u071e\u0731\u073c\u072e\u072e\u0766", "\u04df\u04d6\u04c4\u04df\u04f4\u04d8\u04d3\u04d2\u048b\u0489\u049f\u049e\u04fe", "\u008c\u0098\u009c\u0088\u0085\u009a\u00d5\u00d7\u00c1\u00a5\u0083\u0088\u009f\u0088\u00c6\u0085\u0088\u0087\u008e\u00c6\u00a6\u008b\u0083\u008c\u008a\u009d\u00d2\u00c0\u00b3", "\u045e\u0451\u0452\u0453\u0458\u0401\u0403\u0415\u0414\u0471\u0457\u045c\u044b\u045c\u0412\u0451\u045c\u0453\u045a\u0412\u0472\u045f\u0457\u0458\u045e\u0449\u0406", "\u070e\u0715\u0729\u070e\u0708\u0713\u0714\u071d\u0746\u0744\u0752\u0753\u0736\u0710\u071b\u070c\u071b\u0755\u0716\u071b\u0714\u071d\u0755\u0729\u070e\u0708\u0713\u0714\u071d\u0741", "\u00bd\u00bc\u00a7\u00ba\u00b5\u00aa\u00ef\u00ed\u00fb\u00fa\u0085", "()2/ ?\u0007**zxno\u0010", "\u0702\u0714\u071c\u0701\u0749\u074b\u075d\u075c\u0723", "\u04b0\u04a6\u04ae\u04b3\u04fb\u04f9\u04ef\u048d\u04ee\u0491", "\u0417\u0401\u0409\u0414\u0450\u045c\u045e\u0448\u042a\u0449\u0436", "\u0457\u0441\u0449\u0454\u041c\u041e\u0408\u046a\u0469\u0409\u0476", "\u03cd\u03c2\u03c5\u03ca\u03c7\u03c2\u03d1\u03ce\u0397\u0395\u0383\u0382\u03fd"})
public final class Class3943 {
    public static int field8972 = 577378740;
    public static double field8973;
    public static float field8974 = 0.73625994f;

    static {
        al\u200e = "offset * baseSpeed + (offset * speed - velocity) * factor";
        field8973 = Double.longBitsToDouble(4589842997446401040L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite jyclUg6vobXTQb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3943.5ffVCHCjmV9Gqfd5(k2, 814436257));
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
                int a2 = Integer.parseInt(Class3943.5ffVCHCjmV9Gqfd5(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3943.5ffVCHCjmV9Gqfd5(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3943.5ffVCHCjmV9Gqfd5(k2, 814436257) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 5ffVCHCjmV9Gqfd5(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

