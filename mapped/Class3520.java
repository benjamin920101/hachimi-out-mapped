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

@HACHIMI_CLIENT(mv=100, d1={"\u1ff6\u1ff4\u1ff2\u1ff5\u1ff0\u1ff2\u1ff0\u1ff3", "\u7386\u7380\u7386\u7385\u7388\u7386\u7384\u7382", "\u72db\u72dc\u72dc\u72dd\u72db\u72db\u72de\u72da", "\u2d65\u2d63\u2d64\u2d66\u2d67\u2d6f\u2d61\u2d64", "\u873e\u8739\u8739\u873a\u873f\u8736\u8738\u8737", "\u7209\u720d\u7209\u720d\u720c\u7209\u720a\u720b", "\ue00a\ue00f\ue008\ue00b\ue00e\ue00f\ue00a\ue009", "\ua356\ua352\ua351\ua355\ua353\ua35b\ua357\ua354", "\u6368\u6366\u6368\u6363\u6366\u6366\u6362", "\u7c80\u7c85\u7c86\u7c80\u7c82\u7c80\u7c8c\u7c85", "\u23b6\u23b4\u23b6\u23b0\u23b6\u23b6\u23be\u23b5", "\u443e\u443b\u443e\u4436\u443e\u4436\u4437\u4436", "\u6db5\u6db0\u6dbc\u6db1\u6db3\u6db3\u6db6\u6dbd", "\u7c33\u7c34\u7c32\u7c32\u7c30\u7c32\u7c38", "\ubd8e\ubd8c\ubd84\ubd85\ubd8f\ubd89\ubd8e\ubd8e"}, d2={"\u05be\u0593\u05b6\u25d4\u05e6\u05e4\u05f2\u0596\u05b0\u05bb\u05ac\u05bb\u05f5\u05b6\u05bb\u05b4\u05bd\u05f5\u0589\u05ae\u05a8\u05b3\u05b4\u05bd\u05e1\u05f3\u0596\u05b0\u05bb\u05ac\u05bb\u05f5\u05b6\u05bb\u05b4\u05bd\u05f5\u0589\u05ae\u05a8\u05b3\u05b4\u05bd\u05e1", "\u0724\u077b\u0774\u0771\u0776\u0771\u076c\u0726\u0724\u0726\u0730\u0731\u074e", "\u0394\u03c1\u03c6\u03c1\u03dc\u0396\u0394\u0396\u0380\u0381\u03fe", "\u03b7\u03b5\u03a4\u0393\u03bc\u03b1\u03a3\u03a3\u03ec\u03ee\u03f8\u03f9\u039c\u03ba\u03b1\u03a6\u03b1\u03ff\u03bc\u03b1\u03be\u03b7\u03ff\u0393\u03bc\u03b1\u03a3\u03a3\u03eb", "\u0220\u0229\u023b\u0220\u020b\u0227\u022c\u022d\u0274\u0276\u0260\u0261\u0201", "\u0413\u0407\u0403\u0417\u041a\u0405\u044a\u0448\u045e\u043a\u041c\u0417\u0400\u0417\u0459\u041a\u0417\u0418\u0411\u0459\u0439\u0414\u041c\u0413\u0415\u0402\u044d\u045f\u042c", "\u0602\u060d\u060e\u060f\u0604\u065d\u065f\u0649\u0648\u062d\u060b\u0600\u0617\u0600\u064e\u060d\u0600\u060f\u0606\u064e\u062e\u0603\u060b\u0604\u0602\u0615\u065a", "\u015c\u0147\u017b\u015c\u015a\u0141\u0146\u014f\u0114\u0116\u0100\u0101\u0164\u0142\u0149\u015e\u0149\u0107\u0144\u0149\u0146\u014f\u0107\u017b\u015c\u015a\u0141\u0146\u014f\u0113", "\u019e\u019f\u0184\u0199\u0196\u0189\u01cc\u01ce\u01d8\u01d9\u01a6", "\u07c6\u07c7\u07dc\u07c1\u07ce\u07d1\u07e9\u07c4\u07c4\u0794\u0796\u0780\u0781\u07fe", "\u0688\u069e\u0696\u068b\u06c3\u06c1\u06d7\u06d6\u06a9", "\u061f\u0609\u0601\u061c\u0654\u0656\u0640\u0622\u0641\u063e", "\u0510\u0506\u050e\u0513\u0557\u055b\u0559\u054f\u052d\u054e\u0531", "\u05af\u05b9\u05b1\u05ac\u05e4\u05e6\u05f0\u0592\u0591\u05f1\u058e", "\u049e\u0491\u0496\u0499\u0494\u0491\u0482\u049d\u04c4\u04c6\u04d0\u04d1\u04ae"})
public final class Class3520 {
    public static float field7775;

    private static String QSlyDGJVe5BG2MyW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite tFdukwLV4oCaFo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3520.QSlyDGJVe5BG2MyW(k2, 1069472495));
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
                int a2 = Integer.parseInt(Class3520.QSlyDGJVe5BG2MyW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3520.QSlyDGJVe5BG2MyW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3520.QSlyDGJVe5BG2MyW(k2, 1069472495) + " " + l2 + " " + m2);
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
        ab\u200e = "SkinGrab";
        field7775 = Float.intBitsToFloat(1060423597);
    }
}

