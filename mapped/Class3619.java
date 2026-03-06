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

@HACHIMI_CLIENT(mv=100, d1={"\u650a\u650f\u650b\u6509\u650a\u6503\u650a\u650b", "\ubb1d\ubb1d\ubb17\ubb1a\ubb17\ubb1d\ubb1a\ubb1f", "\u1ac4\u1ac1\u1ac7\u1ace\u1acf\u1ac3\u1ac3\u1ac2", "\u6b77\u6b78\u6b76\u6b77\u6b79\u6b76\u6b71\u6b75", "\u6099\u609a\u609c\u609e\u6099\u609e\u609e\u609b", "\u54bc\u54bd\u54bf\u54ba\u54bc\u54bd\u54b8\u54b9", "\u770a\u770f\u770f\u7705\u7705\u770d\u770b\u770e", "\u1b53\u1b56\u1b53\u1b51\u1b56\u1b5f\u1b56\u1b51", "\ub0b9\ub0ba\ub0b9\ub0b1\ub0bc\ub0b0\ub0ba\ub0b8", "\u4f5b\u4f5c\u4f59\u4f5c\u4f56\u4f5c\u4f59\u4f57", "\u573b\u573d\u573f\u5738\u5730\u573a\u573b\u573b", "\u94bb\u94ba\u94b8\u94bc\u94bb\u94bc\u94bc\u94bd", "\uc0d4\uc0d4\uc0d6\uc0d8\uc0d5\uc0d6\uc0d3\uc0d8", "\u289c\u2898\u2891\u2891\u289d\u289c\u289c\u289f"}, d2={"\u0084\u00db\u00d4\u00d1\u00d6\u00d1\u00cc\u0086\u0084\u0086\u0090\u0091\u00ee", "\u0672\u0627\u0620\u0627\u063a\u0670\u0672\u0670\u0666\u0667\u0618", "\u052c\u052e\u053f\u0508\u0527\u052a\u0538\u0538\u0577\u0575\u0563\u0562\u0507\u0521\u052a\u053d\u052a\u0564\u0527\u052a\u0525\u052c\u0564\u0508\u0527\u052a\u0538\u0538\u0570", "\u0356\u035f\u034d\u0356\u037d\u0351\u035a\u035b\u0302\u0300\u0316\u0317\u0377", "\u00f6\u00e2\u00e6\u00f2\u00ff\u00e0\u00af\u00ad\u00bb\u00df\u00f9\u00f2\u00e5\u00f2\u00bc\u00ff\u00f2\u00fd\u00f4\u00bc\u00dc\u00f1\u00f9\u00f6\u00f0\u00e7\u00a8\u00ba\u00c9", "\u028f\u0280\u0283\u0282\u0289\u02d0\u02d2\u02c4\u02c5\u02a0\u0286\u028d\u029a\u028d\u02c3\u0280\u028d\u0282\u028b\u02c3\u02a3\u028e\u0286\u0289\u028f\u0298\u02d7", "\u079b\u0780\u07bc\u079b\u079d\u0786\u0781\u0788\u07d3\u07d1\u07c7\u07c6\u07a3\u0785\u078e\u0799\u078e\u07c0\u0783\u078e\u0781\u0788\u07c0\u07bc\u079b\u079d\u0786\u0781\u0788\u07d4", "\u0749\u0748\u0753\u074e\u0741\u075e\u071b\u0719\u070f\u070e\u0771", "\u05ad\u05ac\u05b7\u05aa\u05a5\u05ba\u0582\u05af\u05af\u05ff\u05fd\u05eb\u05ea\u0595", "\u0355\u0343\u034b\u0356\u031e\u031c\u030a\u030b\u0374", "\u0740\u0756\u075e\u0743\u070b\u0709\u071f\u077d\u071e\u0761", "\u0314\u0302\u030a\u0317\u0353\u035f\u035d\u034b\u0329\u034a\u0335", "\u05d8\u05ce\u05c6\u05db\u0593\u0591\u0587\u05e5\u05e6\u0586\u05f9", "\u05f5\u05fa\u05fd\u05f2\u05ff\u05fa\u05e9\u05f6\u05af\u05ad\u05bb\u05ba\u05c5"})
public final class Class3619 {
    public static int field8074 = -969247670;
    public static float field8075;
    public static float field8076;
    public static double field8077;
    public static float field8078;
    public static double field8079;

    static {
        field8078 = Float.intBitsToFloat(1044684608);
        field8075 = Float.intBitsToFloat(1053281116);
        field8076 = Float.intBitsToFloat(1062947078);
        field8077 = Double.longBitsToDouble(4585641637448717376L);
        field8079 = Double.longBitsToDouble(4603637968955618232L);
    }

    private static String SmIQ1vTWVQApf9nM(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite JGJ0fQ1VYSGvbt(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3619.SmIQ1vTWVQApf9nM(k2, 1165665933));
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
                int a2 = Integer.parseInt(Class3619.SmIQ1vTWVQApf9nM(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3619.SmIQ1vTWVQApf9nM(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3619.SmIQ1vTWVQApf9nM(k2, 1165665933) + " " + l2 + " " + m2);
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

