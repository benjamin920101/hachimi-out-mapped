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
@HACHIMI_CLIENT(mv=100, d1={"\u159b\u159f\u1596\u1597\u159f\u1598\u1599\u1598", "\uad20\uad27\uad20\uad25\uad27\uad24\uad20", "\ubcdb\ubcd6\ubcdb\ubcd7\ubcdf\ubcd9\ubcd8\ubcd8", "\u6e68\u6e6a\u6e64\u6e65\u6e65\u6e6a\u6e6d\u6e6d", "\ue25e\ue25a\ue259\ue25c\ue25d\ue252\ue253\ue258", "\u1195\u1190\u1190\u1195\u1194\u1196\u1191\u1195", "\u7756\u7755\u7750\u7756\u7756\u7758\u7750\u7754", "\u7f10\u7f19\u7f10\u7f18\u7f13\u7f14\u7f14", "\u7a3d\u7a3e\u7a39\u7a3b\u7a38\u7a3e\u7a38\u7a3d", "\ubae9\ubae9\ubae8\ubae9\ubae9\ubaea\ubaee\ubae8", "\u6354\u6350\u6351\u635a\u6353\u6354\u6350\u6353", "\u15eb\u15ee\u15e7\u15e6\u15e8\u15ed\u15e7\u15ee", "\u7ae9\u7ae5\u7aee\u7aee\u7aef\u7aec\u7ae5\u7aed", "\u3aa2\u3aa7\u3aa5\u3aa3\u3aa0\u3aa3\u3aa2\u3aa6", "\ud629\ud62b\ud628\ud62c\ud62c\ud628\ud62e\ud628", "\uacfe\uacf8\uacfe\uacfe\uacf2\uacf2\uacfb\uacf2"}, d2={"\u0517\u0507\u0515\u256a\u0558\u055a\u054c\u0528\u050e\u0505\u0512\u0505\u054b\u0508\u0505\u050a\u0503\u054b\u0537\u0510\u0516\u050d\u050a\u0503\u055f\u054d\u0528\u050e\u0505\u0512\u0505\u054b\u0508\u0505\u050a\u0503\u054b\u0537\u0510\u0516\u050d\u050a\u0503\u055f", "\u01c9\u01d9\u01c8\u21b4\u0186\u0184\u0192\u01f6\u01d0\u01db\u01cc\u01db\u0195\u01d6\u01db\u01d4\u01dd\u0195\u01e9\u01ce\u01c8\u01d3\u01d4\u01dd\u0181\u0193\u01f6\u01d0\u01db\u01cc\u01db\u0195\u01d6\u01db\u01d4\u01dd\u0195\u01e9\u01ce\u01c8\u01d3\u01d4\u01dd\u0181", "\u01a3\u01fc\u01f3\u01f6\u01f1\u01f6\u01eb\u01a1\u01a3\u01a1\u01b7\u01b6\u01c9", "\u037f\u032a\u032d\u032a\u0337\u037d\u037f\u037d\u036b\u036a\u0315", "\u0207\u0205\u0214\u0223\u020c\u0201\u0213\u0213\u025c\u025e\u0248\u0249\u022c\u020a\u0201\u0216\u0201\u024f\u020c\u0201\u020e\u0207\u024f\u0223\u020c\u0201\u0213\u0213\u025b", "\u0795\u079c\u078e\u0795\u07be\u0792\u0799\u0798\u07c1\u07c3\u07d5\u07d4\u07b4", "\u0303\u0317\u0313\u0307\u030a\u0315\u035a\u0358\u034e\u032a\u030c\u0307\u0310\u0307\u0349\u030a\u0307\u0308\u0301\u0349\u0329\u0304\u030c\u0303\u0305\u0312\u035d\u034f\u033c", "\u07b6\u07b9\u07ba\u07bb\u07b0\u07e9\u07eb\u07fd\u07fc\u0799\u07bf\u07b4\u07a3\u07b4\u07fa\u07b9\u07b4\u07bb\u07b2\u07fa\u079a\u07b7\u07bf\u07b0\u07b6\u07a1\u07ee", "\u0402\u0419\u0425\u0402\u0404\u041f\u0418\u0411\u044a\u0448\u045e\u045f\u043a\u041c\u0417\u0400\u0417\u0459\u041a\u0417\u0418\u0411\u0459\u0425\u0402\u0404\u041f\u0418\u0411\u044d", "\u00f9\u00f8\u00e3\u00fe\u00f1\u00ee\u00ab\u00a9\u00bf\u00be\u00c1", "\u0252\u0253\u0248\u0255\u025a\u0245\u027d\u0250\u0250\u0200\u0202\u0214\u0215\u026a", "\u020e\u0218\u0210\u020d\u0245\u0247\u0251\u0250\u022f", "\u0646\u0650\u0658\u0645\u060d\u060f\u0619\u067b\u0618\u0667", "\u07f1\u07e7\u07ef\u07f2\u07b6\u07ba\u07b8\u07ae\u07cc\u07af\u07d0", "\u05a1\u05b7\u05bf\u05a2\u05ea\u05e8\u05fe\u059c\u059f\u05ff\u0580", "\u0224\u022b\u022c\u0223\u022e\u022b\u0238\u0227\u027e\u027c\u026a\u026b\u0214"})
public final class Class3292 {
    public static double field7082;
    public static double field7083;
    public static float field7084 = 0.17249215f;

    /*
     * WARNING - void declaration
     */
    private static CallSite GTS1TCSPznTjRW(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3292.9nGVSJsnAf9jf0rt(k2, -712770179));
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
                int a2 = Integer.parseInt(Class3292.9nGVSJsnAf9jf0rt(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3292.9nGVSJsnAf9jf0rt(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3292.9nGVSJsnAf9jf0rt(k2, -712770179) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 9nGVSJsnAf9jf0rt(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        V\u200e = "list";
        field7083 = Double.longBitsToDouble(4607092346893369344L);
        bE\u200e = "Lv.";
        field7082 = Double.longBitsToDouble(4595670975021656868L);
    }
}

