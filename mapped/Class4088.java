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

@HACHIMI_CLIENT(mv=100, d1={"\u2854\u2856\u2851\u2855\u2850\u2857\u2851\u285e", "\u880b\u880f\u8805\u880b\u880a\u8808\u880c\u880f", "\u082a\u0829\u082a\u082e\u0827\u082a\u082b\u082e", "\u1b1b\u1b12\u1b1c\u1b1e\u1b12\u1b18\u1b13\u1b1f", "\u1bc2\u1bc0\u1bc1\u1bc8\u1bc4\u1bc8\u1bc1\u1bc6", "\ud541\ud542\ud542\ud547\ud547\ud543\ud54d\ud540", "\u2785\u2786\u2784\u2784\u2786\u2782\u2780\u2784", "\uc8d2\uc8db\uc8da\uc8da\uc8d3\uc8d6\uc8d6\uc8d0", "\u1ce2\u1ce6\u1ce7\u1ce0\u1ce1\u1ce5\u1ce7\u1ce1", "\u1f01\u1f0a\u1f05\u1f03\u1f04\u1f0b\u1f02\u1f05", "\u1e85\u1e80\u1e87\u1e83\u1e86\u1e86\u1e8c", "\u1287\u1286\u128f\u1280\u1285\u1284\u1281\u128e", "\u7318\u731b\u7312\u7312\u731c\u7313\u731a\u731b", "\u9d5e\u9d57\u9d5a\u9d59\u9d5d\u9d5a\u9d5c\u9d5f"}, d2={"\u0563\u053c\u0533\u0536\u0531\u0536\u052b\u0561\u0563\u0561\u0577\u0576\u0509", "\u05e2\u05b7\u05b0\u05b7\u05aa\u05e0\u05e2\u05e0\u05f6\u05f7\u0588", "\u0246\u0244\u0255\u0262\u024d\u0240\u0252\u0252\u021d\u021f\u0209\u0208\u026d\u024b\u0240\u0257\u0240\u020e\u024d\u0240\u024f\u0246\u020e\u0262\u024d\u0240\u0252\u0252\u021a", "\u0778\u0771\u0763\u0778\u0753\u077f\u0774\u0775\u072c\u072e\u0738\u0739\u0759", "\u05c0\u05d4\u05d0\u05c4\u05c9\u05d6\u0599\u059b\u058d\u05e9\u05cf\u05c4\u05d3\u05c4\u058a\u05c9\u05c4\u05cb\u05c2\u058a\u05ea\u05c7\u05cf\u05c0\u05c6\u05d1\u059e\u058c\u05ff", "\u079a\u0795\u0796\u0797\u079c\u07c5\u07c7\u07d1\u07d0\u07b5\u0793\u0798\u078f\u0798\u07d6\u0795\u0798\u0797\u079e\u07d6\u07b6\u079b\u0793\u079c\u079a\u078d\u07c2", "\\G{\\ZAFO\u0014\u0016\u0000\u0001dBI^I\u0007DIFO\u0007{\\ZAFO\u0013", "\u013e\u013f\u0124\u0139\u0136\u0129\u016c\u016e\u0178\u0179\u0106", "\u05f1\u05f0\u05eb\u05f6\u05f9\u05e6\u05de\u05f3\u05f3\u05a3\u05a1\u05b7\u05b6\u05c9", "\u0792\u0784\u078c\u0791\u07d9\u07db\u07cd\u07cc\u07b3", "\u06e5\u06f3\u06fb\u06e6\u06ae\u06ac\u06ba\u06d8\u06bb\u06c4", "\u0343\u0355\u035d\u0340\u0304\u0308\u030a\u031c\u037e\u031d\u0362", "\u011d\u010b\u0103\u011e\u0156\u0154\u0142\u0120\u0123\u0143\u013c", "\u00d7\u00d8\u00df\u00d0\u00dd\u00d8\u00cb\u00d4\u008d\u008f\u0099\u0098\u00e7"})
public final class Class4088 {
    public static double field9464 = Double.longBitsToDouble(4606127697800475622L);
    public static double field9465 = Double.longBitsToDouble(4597741741407813244L);
    public static int field9466 = 653853369;

    private static String vYiAwbcoIhqvnQne(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite eJd8VdVwGqOFYP(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4088.vYiAwbcoIhqvnQne(k2, 1143359261));
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
                int a2 = Integer.parseInt(Class4088.vYiAwbcoIhqvnQne(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4088.vYiAwbcoIhqvnQne(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4088.vYiAwbcoIhqvnQne(k2, 1143359261) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

