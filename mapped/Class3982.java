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
@HACHIMI_CLIENT(mv=100, d1={"\uc6f3\uc6f1\uc6f6\uc6f3\uc6ff\uc6f7\uc6f7\uc6f2", "\u5405\u540f\u5402\u5402\u540e\u5404\u540f\u5404", "\u9dfb\u9dfb\u9df8\u9dfa\u9dff\u9df9\u9dfd\u9df9", "\u7eb1\u7eb6\u7eba\u7eb3\u7eb1\u7eb4\u7eb5\u7eb6", "\u46bd\u46bf\u46b1\u46b1\u46b0\u46bd\u46b8\u46bf", "\ue60f\ue608\ue609\ue60d\ue60a\ue607\ue60e\ue60c", "\u61fc\u61fc\u61fe\u61fe\u61ff\u61fb\u61f9\u61ff", "\u805f\u8058\u805c\u805d\u805c\u805d\u8056\u805c", "\u8d2d\u8d2a\u8d2c\u8d2c\u8d2e\u8d2a\u8d20\u8d28", "\u4e27\u4e2f\u4e29\u4e2f\u4e2e\u4e26\u4e2b", "\ua9be\ua9bf\ua9bb\ua9b2\ua9bd\ua9bc\ua9ba\ua9b2", "\u046f\u0463\u0469\u046f\u0469\u0469\u0463\u046e", "\uafd0\uafd6\uafd1\uafdf\uafd5\uafd7\uafd1\uafd6", "\u20ef\u20e5\u20e5\u20ee\u20e9\u20ed\u20ed\u20ec", "\ubd23\ubd26\ubd26\ubd27\ubd25\ubd29\ubd25\ubd25", "\u8d7e\u8d7e\u8d74\u8d75\u8d7e\u8d7b\u8d7b\u8d7e", "\u5d9d\u5d9f\u5d98\u5d9b\u5d98\u5d99\u5d90\u5d9c", "\ud63a\ud63d\ud63b\ud63e\ud63e\ud63d\ud639\ud63f", "\u9da9\u9dae\u9daf\u9da8\u9da9\u9da2\u9dae\u9da3"}, d2={"\u03f7\u03db\u03d2\u239b\u03a9\u03ab\u03bd\u03d9\u03ff\u03f4\u03e3\u03f4\u03ba\u03f9\u03f4\u03fb\u03f2\u03ba\u03c6\u03e1\u03e7\u03fc\u03fb\u03f2\u03ae\u03bc\u03d9\u03ff\u03f4\u03e3\u03f4\u03ba\u03f9\u03f4\u03fb\u03f2\u03ba\u03c6\u03e1\u03e7\u03fc\u03fb\u03f2\u03ae", "\u0133\u011f\u0119\u215f\u016d\u016f\u0179\u011d\u013b\u0130\u0127\u0130\u017e\u013d\u0130\u013f\u0136\u017e\u0102\u0125\u0123\u0138\u013f\u0136\u016a\u0178\u011d\u013b\u0130\u0127\u0130\u017e\u013d\u0130\u013f\u0136\u017e\u0102\u0125\u0123\u0138\u013f\u0136\u016a", "\u070b\u0727\u0720\u2767\u0755\u0757\u0741\u0725\u0703\u0708\u071f\u0708\u0746\u0705\u0708\u0707\u070e\u0746\u073a\u071d\u071b\u0700\u0707\u070e\u0752\u0740\u0725\u0703\u0708\u071f\u0708\u0746\u0705\u0708\u0707\u070e\u0746\u073a\u071d\u071b\u0700\u0707\u070e\u0752", "\u0452\u047e\u047a\u243e\u040c\u040e\u0418\u047c\u045a\u0451\u0446\u0451\u041f\u045c\u0451\u045e\u0457\u041f\u0463\u0444\u0442\u0459\u045e\u0457\u040b\u0419\u047c\u045a\u0451\u0446\u0451\u041f\u045c\u0451\u045e\u0457\u041f\u0463\u0444\u0442\u0459\u045e\u0457\u040b", "\u0378\u0354\u0351\u2314\u0326\u0324\u0332\u0356\u0370\u037b\u036c\u037b\u0335\u0376\u037b\u0374\u037d\u0335\u0349\u036e\u0368\u0373\u0374\u037d\u0321\u0333\u0356\u0370\u037b\u036c\u037b\u0335\u0376\u037b\u0374\u037d\u0335\u0349\u036e\u0368\u0373\u0374\u037d\u0321", "\u02da\u0285\u028a\u028f\u0288\u028f\u0292\u02d8\u02da\u02d8\u02ce\u02cf\u02b0", "\u056a\u053f\u0538\u053f\u0522\u0568\u056a\u0568\u057e\u057f\u0500", "\u01e4\u01e6\u01f7\u01c0\u01ef\u01e2\u01f0\u01f0\u01bf\u01bd\u01ab\u01aa\u01cf\u01e9\u01e2\u01f5\u01e2\u01ac\u01ef\u01e2\u01ed\u01e4\u01ac\u01c0\u01ef\u01e2\u01f0\u01f0\u01b8", "\u00f6\u00ff\u00ed\u00f6\u00dd\u00f1\u00fa\u00fb\u00a2\u00a0\u00b6\u00b7\u00d7", "\u0612\u0606\u0602\u0616\u061b\u0604\u064b\u0649\u065f\u063b\u061d\u0616\u0601\u0616\u0658\u061b\u0616\u0619\u0610\u0658\u0638\u0615\u061d\u0612\u0614\u0603\u064c\u065e\u062d", "\u0779\u0776\u0775\u0774\u077f\u0726\u0724\u0732\u0733\u0756\u0770\u077b\u076c\u077b\u0735\u0776\u077b\u0774\u077d\u0735\u0755\u0778\u0770\u077f\u0779\u076e\u0721", "\u03eb\u03f0\u03cc\u03eb\u03ed\u03f6\u03f1\u03f8\u03a3\u03a1\u03b7\u03b6\u03d3\u03f5\u03fe\u03e9\u03fe\u03b0\u03f3\u03fe\u03f1\u03f8\u03b0\u03cc\u03eb\u03ed\u03f6\u03f1\u03f8\u03a4", "\u0595\u0594\u058f\u0592\u059d\u0582\u05c7\u05c5\u05d3\u05d2\u05ad", "\u03e4\u03e5\u03fe\u03e3\u03ec\u03f3\u03cb\u03e6\u03e6\u03b6\u03b4\u03a2\u03a3\u03dc", "\u010a\u011c\u0114\u0109\u0141\u0143\u0155\u0154\u012b", "\u07c7\u07d1\u07d9\u07c4\u078c\u078e\u0798\u07fa\u0799\u07e6", "\u00f1\u00e7\u00ef\u00f2\u00b6\u00ba\u00b8\u00ae\u00cc\u00af\u00d0", "\u0585\u0593\u059b\u0586\u05ce\u05cc\u05da\u05b8\u05bb\u05db\u05a4", "\u0749\u0746\u0741\u074e\u0743\u0746\u0755\u074a\u0713\u0711\u0707\u0706\u0779"})
public final class Class3982 {
    public static float field9091 = 0.4339329f;
    public static float field9092;

    /*
     * WARNING - void declaration
     */
    private static CallSite uqY8SYzDFsKEl7(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3982.2N4ilyA3otV1OTRH(k2, -1773622473));
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
                int a2 = Integer.parseInt(Class3982.2N4ilyA3otV1OTRH(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3982.2N4ilyA3otV1OTRH(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3982.2N4ilyA3otV1OTRH(k2, -1773622473) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 2N4ilyA3otV1OTRH(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        T\u200e = "PlayerMove Full - ";
        field9092 = Float.intBitsToFloat(1049441810);
        an\u200e = "Delay for break crystal";
        as\u200e = "\\{(.*?)}";
        bm\u200e = "OFF";
        bT\u200e = "AutoJump";
    }
}

