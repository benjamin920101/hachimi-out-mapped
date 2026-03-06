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

@HACHIMI_CLIENT(mv=100, d1={"\uc9c4\uc9c4\uc9c4\uc9c6\uc9c0\uc9cf\uc9c6\uc9c0", "\u910c\u910b\u910b\u910b\u910d\u9109\u9109\u910d", "\u668f\u6684\u668d\u6684\u668d\u668c\u668c\u668a", "\u4227\u422f\u4220\u4221\u4226\u4221\u4224\u422e", "\u8903\u8901\u8906\u8900\u8900\u8903\u8903\u8900", "\ue008\ue00b\ue008\ue00a\ue00a\ue00b\ue009\ue00d", "\u7d5b\u7d5a\u7d57\u7d5c\u7d5e\u7d5b\u7d5b\u7d5b", "\ub682\ub683\ub685\ub680\ub68f\ub680\ub683\ub687", "\u041a\u0419\u041f\u0418\u041a\u041a\u041f\u041a", "\ub552\ub555\ub553\ub557\ub554\ub551\ub55d\ub557", "\u7e1d\u7e17\u7e10\u7e14\u7e14\u7e10\u7e1c", "\ub736\ub735\ub730\ub73c\ub73c\ub730\ub73c\ub731", "\u7a1f\u7a18\u7a18\u7a1f\u7a1c\u7a1b\u7a1a\u7a1e", "\u086e\u086c\u0868\u086a\u086d\u0861\u0869\u0869"}, d2={"\u0486\u04d9\u04d6\u04d3\u04d4\u04d3\u04ce\u0484\u0486\u0484\u0492\u0493\u04ec", "\u0520\u0575\u0572\u0575\u0568\u0522\u0520\u0522\u0534\u0535\u054a", "\u00ea\u00e8\u00f9\u00ce\u00e1\u00ec\u00fe\u00fe\u00b1\u00b3\u00a5\u00a4\u00c1\u00e7\u00ec\u00fb\u00ec\u00a2\u00e1\u00ec\u00e3\u00ea\u00a2\u00ce\u00e1\u00ec\u00fe\u00fe\u00b6", "\u0247\u024e\u025c\u0247\u026c\u0240\u024b\u024a\u0213\u0211\u0207\u0206\u0266", "\u0234\u0220\u0224\u0230\u023d\u0222\u026d\u026f\u0279\u021d\u023b\u0230\u0227\u0230\u027e\u023d\u0230\u023f\u0236\u027e\u021e\u0233\u023b\u0234\u0232\u0225\u026a\u0278\u020b", "\u060e\u0601\u0602\u0603\u0608\u0651\u0653\u0645\u0644\u0621\u0607\u060c\u061b\u060c\u0642\u0601\u060c\u0603\u060a\u0642\u0622\u060f\u0607\u0608\u060e\u0619\u0656", "\u068a\u0691\u06ad\u068a\u068c\u0697\u0690\u0699\u06c2\u06c0\u06d6\u06d7\u06b2\u0694\u069f\u0688\u069f\u06d1\u0692\u069f\u0690\u0699\u06d1\u06ad\u068a\u068c\u0697\u0690\u0699\u06c5", "\u071d\u071c\u0707\u071a\u0715\u070a\u074f\u074d\u075b\u075a\u0725", "\u03ad\u03ac\u03b7\u03aa\u03a5\u03ba\u0382\u03af\u03af\u03ff\u03fd\u03eb\u03ea\u0395", "\u0458\u044e\u0446\u045b\u0413\u0411\u0407\u0406\u0479", "\u0785\u0793\u079b\u0786\u07ce\u07cc\u07da\u07b8\u07db\u07a4", "\u073b\u072d\u0725\u0738\u077c\u0770\u0772\u0764\u0706\u0765\u071a", "xnf{31'EF&Y", "\u05c1\u05ce\u05c9\u05c6\u05cb\u05ce\u05dd\u05c2\u059b\u0599\u058f\u058e\u05f1"})
public final class Class1803 {
    public static float field6738 = Float.intBitsToFloat(1051639344);
    public static double field6739 = Double.longBitsToDouble(4598539041603959086L);

    private static String vq01Glkq4ZEHaxSm(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite wOG8H8eyytUt3V(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1803.vq01Glkq4ZEHaxSm(k2, -1625306461));
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
                int a2 = Integer.parseInt(Class1803.vq01Glkq4ZEHaxSm(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1803.vq01Glkq4ZEHaxSm(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1803.vq01Glkq4ZEHaxSm(k2, -1625306461) + " " + l2 + " " + m2);
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

