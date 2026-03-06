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
@HACHIMI_CLIENT(mv=100, d1={"\uc4f5\uc4f6\uc4f0\uc4f5\uc4f1\uc4f5\uc4f6", "\u8fe0\u8fe3\u8fe6\u8fe1\u8fe5\u8fe6\u8fe0\u8fe0", "\ub468\ub46e\ub469\ub46a\ub465\ub464\ub46b\ub46c", "\u2703\u270f\u2700\u2705\u2700\u2701\u2701\u2702", "\u4810\u4812\u481a\u4812\u4811\u481a\u4817\u481b", "\u6613\u6614\u6612\u6611\u6611\u6618\u6616\u6612", "\ua61f\ua610\ua61e\ua611\ua61a\ua61e\ua611\ua61d", "\u533a\u533d\u533f\u5338\u533b\u533f\u5337\u533e", "\u45f5\u45fe\u45f6\u45f3\u45f6\u45f5\u45f4\u45f1", "\u8ad2\u8ad3\u8adb\u8ad4\u8ad7\u8ada\u8ad1\u8ada", "\u5ff4\u5ff3\u5ffe\u5ff7\u5ff4\u5ff0\u5fff\u5fff", "\u1668\u1668\u166d\u166f\u166c\u166e\u1663\u166c", "\u578c\u578a\u578f\u578e\u5789\u5789\u578e\u5789", "\u0b63\u0b6c\u0b67\u0b63\u0b62\u0b63\u0b6c\u0b67", "\ub13f\ub13a\ub13a\ub134\ub135\ub135\ub135\ub13a", "\u4fa4\u4fa3\u4fa4\u4fa5\u4fa8\u4fa7\u4fa5\u4fa2"}, d2={"\u0136\u0127\u0135\u2153\u0161\u0163\u0175\u0111\u0137\u013c\u012b\u013c\u0172\u0131\u013c\u0133\u013a\u0172\u010e\u0129\u012f\u0134\u0133\u013a\u0166\u0174\u0111\u0137\u013c\u012b\u013c\u0172\u0131\u013c\u0133\u013a\u0172\u010e\u0129\u012f\u0134\u0133\u013a\u0166", "\u0555\u0544\u0557\u2530\u0502\u0500\u0516\u0572\u0554\u055f\u0548\u055f\u0511\u0552\u055f\u0550\u0559\u0511\u056d\u054a\u054c\u0557\u0550\u0559\u0505\u0517\u0572\u0554\u055f\u0548\u055f\u0511\u0552\u055f\u0550\u0559\u0511\u056d\u054a\u054c\u0557\u0550\u0559\u0505", "\u071c\u0743\u074c\u0749\u074e\u0749\u0754\u071e\u071c\u071e\u0708\u0709\u0776", "\u06b5\u06e0\u06e7\u06e0\u06fd\u06b7\u06b5\u06b7\u06a1\u06a0\u06df", "\u0261\u0263\u0272\u0245\u026a\u0267\u0275\u0275\u023a\u0238\u022e\u022f\u024a\u026c\u0267\u0270\u0267\u0229\u026a\u0267\u0268\u0261\u0229\u0245\u026a\u0267\u0275\u0275\u023d", "\u053c\u0535\u0527\u053c\u0517\u053b\u0530\u0531\u0568\u056a\u057c\u057d\u051d", "\u0493\u0487\u0483\u0497\u049a\u0485\u04ca\u04c8\u04de\u04ba\u049c\u0497\u0480\u0497\u04d9\u049a\u0497\u0498\u0491\u04d9\u04b9\u0494\u049c\u0493\u0495\u0482\u04cd\u04df\u04ac", "\u079a\u0795\u0796\u0797\u079c\u07c5\u07c7\u07d1\u07d0\u07b5\u0793\u0798\u078f\u0798\u07d6\u0795\u0798\u0797\u079e\u07d6\u07b6\u079b\u0793\u079c\u079a\u078d\u07c2", "\u0539\u0522\u051e\u0539\u053f\u0524\u0523\u052a\u0571\u0573\u0565\u0564\u0501\u0527\u052c\u053b\u052c\u0562\u0521\u052c\u0523\u052a\u0562\u051e\u0539\u053f\u0524\u0523\u052a\u0576", "\u0006\u0007\u001c\u0001\u000e\u0011TV@A>", "\u00fb\u00fa\u00e1\u00fc\u00f3\u00ec\u00d4\u00f9\u00f9\u00a9\u00ab\u00bd\u00bc\u00c3", "\u071e\u0708\u0700\u071d\u0755\u0757\u0741\u0740\u073f", "\u012b\u013d\u0135\u0128\u0160\u0162\u0174\u0116\u0175\u010a", "\u024c\u025a\u0252\u024f\u020b\u0207\u0205\u0213\u0271\u0212\u026d", "\u0542\u0554\u055c\u0541\u0509\u050b\u051d\u057f\u057c\u051c\u0563", "\u0615\u061a\u061d\u0612\u061f\u061a\u0609\u0616\u064f\u064d\u065b\u065a\u0625"})
public final class Class3487 {
    public static int field7668 = 303209790;
    public static double field7669;
    public static float field7670;
    public static float field7671;

    private static String zqVA2zbvIFPzi4FY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        g\u200e = "Not connected to a server!";
        aa\u200e = "SwingSpeed";
        field7671 = Float.intBitsToFloat(1048936104);
        field7670 = Float.intBitsToFloat(1016728224);
        field7669 = Double.longBitsToDouble(4603947122501765568L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 4bpHnVyCTytYbC(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3487.zqVA2zbvIFPzi4FY(k2, 1755494122));
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
                int a2 = Integer.parseInt(Class3487.zqVA2zbvIFPzi4FY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3487.zqVA2zbvIFPzi4FY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3487.zqVA2zbvIFPzi4FY(k2, 1755494122) + " " + l2 + " " + m2);
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

