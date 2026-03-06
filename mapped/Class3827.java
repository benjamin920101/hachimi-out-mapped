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
@HACHIMI_CLIENT(mv=100, d1={"\uc582\uc585\uc588\uc584\uc580\uc581\uc580\uc580", "\u47bc\u47b1\u47bd\u47b2\u47bd\u47b2\u47b7", "\u5eab\u5eaf\u5ea8\u5ea8\u5ea9\u5ea8\u5ea1\u5eaa", "\u3a6a\u3a6c\u3a66\u3a6d\u3a68\u3a6a\u3a6c\u3a6b", "\ud61f\ud61c\ud61e\ud619\ud61c\ud61e\ud61e\ud61b", "\u63d8\u63d0\u63db\u63df\u63db\u63dd\u63d1\u63d1", "\ue6c7\ue6c3\ue6c7\ue6c3\ue6c4\ue6c1\ue6c5\ue6c2", "\u178e\u178e\u178b\u1789\u178d\u1782\u178b\u178b", "\u0003\u0002\t\u0003\u0005\u0000\u0006\t", "\u6992\u6996\u6990\u699f\u6995\u6997\u699f\u6997", "\ue791\ue791\ue791\ue797\ue79c\ue797\ue793\ue793", "\u8047\u8046\u804e\u8047\u8044\u8041\u8046\u8045", "\ubc14\ubc13\ubc10\ubc14\ubc18\ubc13\ubc11\ubc14", "\ub798\ub79f\ub799\ub792\ub799\ub799\ub792\ub79f", "\ue269\ue269\ue26a\ue26d\ue26c\ue26a\ue269\ue26c", "\u1554\u1556\u1554\u1554\u1555\u1553\u1551\u1556", "\u1bcd\u1bc6\u1bc6\u1bc9\u1bcb\u1bcc\u1bcc\u1bc7", "\ue40c\ue400\ue40b\ue40d\ue401\ue409\ue40d\ue409"}, d2={"\u03f6\u03d9\u03f2\u239a\u03a8\u03aa\u03bc\u03d8\u03fe\u03f5\u03e2\u03f5\u03bb\u03f8\u03f5\u03fa\u03f3\u03bb\u03c7\u03e0\u03e6\u03fd\u03fa\u03f3\u03af\u03bd\u03d8\u03fe\u03f5\u03e2\u03f5\u03bb\u03f8\u03f5\u03fa\u03f3\u03bb\u03c7\u03e0\u03e6\u03fd\u03fa\u03f3\u03af", "\u0336\u0319\u0333\u235a\u0368\u036a\u037c\u0318\u033e\u0335\u0322\u0335\u037b\u0338\u0335\u033a\u0333\u037b\u0307\u0320\u0326\u033d\u033a\u0333\u036f\u037d\u0318\u033e\u0335\u0322\u0335\u037b\u0338\u0335\u033a\u0333\u037b\u0307\u0320\u0326\u033d\u033a\u0333\u036f", "\u056b\u0544\u0561\u2507\u0535\u0537\u0521\u0545\u0563\u0568\u057f\u0568\u0526\u0565\u0568\u0567\u056e\u0526\u055a\u057d\u057b\u0560\u0567\u056e\u0532\u0520\u0545\u0563\u0568\u057f\u0568\u0526\u0565\u0568\u0567\u056e\u0526\u055a\u057d\u057b\u0560\u0567\u056e\u0532", "\u0439\u0416\u0432\u2455\u0467\u0465\u0473\u0417\u0431\u043a\u042d\u043a\u0474\u0437\u043a\u0435\u043c\u0474\u0408\u042f\u0429\u0432\u0435\u043c\u0460\u0472\u0417\u0431\u043a\u042d\u043a\u0474\u0437\u043a\u0435\u043c\u0474\u0408\u042f\u0429\u0432\u0435\u043c\u0460", "\u075e\u0701\u070e\u070b\u070c\u070b\u0716\u075c\u075e\u075c\u074a\u074b\u0734", "\u015e\u010b\u010c\u010b\u0116\u015c\u015e\u015c\u014a\u014b\u0134", "\u0432\u0430\u0421\u0416\u0439\u0434\u0426\u0426\u0469\u046b\u047d\u047c\u0419\u043f\u0434\u0423\u0434\u047a\u0439\u0434\u043b\u0432\u047a\u0416\u0439\u0434\u0426\u0426\u046e", "\u074f\u0746\u0754\u074f\u0764\u0748\u0743\u0742\u071b\u0719\u070f\u070e\u076e", "\u0447\u0453\u0457\u0443\u044e\u0451\u041e\u041c\u040a\u046e\u0448\u0443\u0454\u0443\u040d\u044e\u0443\u044c\u0445\u040d\u046d\u0440\u0448\u0447\u0441\u0456\u0419\u040b\u0478", "\u07c1\u07ce\u07cd\u07cc\u07c7\u079e\u079c\u078a\u078b\u07ee\u07c8\u07c3\u07d4\u07c3\u078d\u07ce\u07c3\u07cc\u07c5\u078d\u07ed\u07c0\u07c8\u07c7\u07c1\u07d6\u0799", "\u073e\u0725\u0719\u073e\u0738\u0723\u0724\u072d\u0776\u0774\u0762\u0763\u0706\u0720\u072b\u073c\u072b\u0765\u0726\u072b\u0724\u072d\u0765\u0719\u073e\u0738\u0723\u0724\u072d\u0771", "\u076b\u076a\u0771\u076c\u0763\u077c\u0739\u073b\u072d\u072c\u0753", "\u01e5\u01e4\u01ff\u01e2\u01ed\u01f2\u01ca\u01e7\u01e7\u01b7\u01b5\u01a3\u01a2\u01dd", "\u0215\u0203\u020b\u0216\u025e\u025c\u024a\u024b\u0234", "\u0672\u0664\u066c\u0671\u0639\u063b\u062d\u064f\u062c\u0653", "\u00b9\u00af\u00a7\u00ba\u00fe\u00f2\u00f0\u00e6\u0084\u00e7\u0098", "\u04af\u04b9\u04b1\u04ac\u04e4\u04e6\u04f0\u0492\u0491\u04f1\u048e", "\u03f6\u03f9\u03fe\u03f1\u03fc\u03f9\u03ea\u03f5\u03ac\u03ae\u03b8\u03b9\u03c6"})
public final class Class3827 {
    public static float field8669 = Float.intBitsToFloat(1052539152);
    public static int field8670 = -454091818;

    /*
     * WARNING - void declaration
     */
    private static CallSite DhhYpFr7fA0avm(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3827.2SH8xEQL32ZLDli5(k2, 1655003081));
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
                int a2 = Integer.parseInt(Class3827.2SH8xEQL32ZLDli5(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3827.2SH8xEQL32ZLDli5(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3827.2SH8xEQL32ZLDli5(k2, 1655003081) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 2SH8xEQL32ZLDli5(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        F\u200e = "Logs PlayerMoveC2SPacket";
        W\u200e = "LOW_HOP";
        aI\u200e = "The color for the world clouds";
        aP\u200e = "The items to not rename.";
    }
}

