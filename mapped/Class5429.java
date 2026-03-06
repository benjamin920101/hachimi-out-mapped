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
@HACHIMI_CLIENT(mv=100, d1={"\ue7c0\ue7c4\ue7c9\ue7c5\ue7c0\ue7c8\ue7c9\ue7c3", "\u31db\u31de\u31db\u31d1\u31d0\u31d1\u31d1\u31da", "\u1db4\u1db6\u1db5\u1db8\u1db1\u1db1\u1db2\u1db6", "\u7952\u7954\u7959\u7952\u7955\u7958\u7959\u7958", "\u966a\u966e\u966b\u9666\u966a\u9668\u966b\u966c", "\u1183\u1189\u1180\u1181\u1184\u1183\u1186\u1183", "\u3d82\u3d85\u3d83\u3d85\u3d82\u3d8e\u3d82\u3d8e", "\u10a6\u10a0\u10a2\u10a6\u10a3\u10a7\u10a7\u10a2", "\u12a7\u12a6\u12a1\u12ae\u12a2\u12a3\u12a1\u12a3", "\uaacf\uaace\uaacd\uaac9\uaacb\uaace\uaaca\uaacf", "\u0dff\u0dfe\u0dfc\u0dfc\u0dfc\u0dfb\u0df9\u0df4", "\u1324\u1323\u132f\u1327\u1324\u1327\u132e\u1327", "\u6602\u6602\u6602\u660e\u6605\u660f\u6603\u660f", "\uc95c\uc956\uc95f\uc958\uc95c\uc95a\uc959\uc95e", "\u177e\u1779\u177e\u1772\u1778\u177f\u177d\u1778"}, d2={"\u0263\u0263\u0252\u2208\u023a\u0238\u022e\u024a\u026c\u0267\u0270\u0267\u0229\u026a\u0267\u0268\u0261\u0229\u0255\u0272\u0274\u026f\u0268\u0261\u023d\u022f\u024a\u026c\u0267\u0270\u0267\u0229\u026a\u0267\u0268\u0261\u0229\u0255\u0272\u0274\u026f\u0268\u0261\u023d", "\u0679\u0626\u0629\u062c\u062b\u062c\u0631\u067b\u0679\u067b\u066d\u066c\u0613", "\u03bb\u03ee\u03e9\u03ee\u03f3\u03b9\u03bb\u03b9\u03af\u03ae\u03d1", "\u0005\u0007\u0016!\u000e\u0003\u0011\u0011^\\JK.\b\u0003\u0014\u0003M\u000e\u0003\f\u0005M!\u000e\u0003\u0011\u0011Y", "\u03c4\u03cd\u03df\u03c4\u03ef\u03c3\u03c8\u03c9\u0390\u0392\u0384\u0385\u03e5", "\u00d5\u00c1\u00c5\u00d1\u00dc\u00c3\u008c\u008e\u0098\u00fc\u00da\u00d1\u00c6\u00d1\u009f\u00dc\u00d1\u00de\u00d7\u009f\u00ff\u00d2\u00da\u00d5\u00d3\u00c4\u008b\u0099\u00ea", "\u00f5\u00fa\u00f9\u00f8\u00f3\u00aa\u00a8\u00be\u00bf\u00da\u00fc\u00f7\u00e0\u00f7\u00b9\u00fa\u00f7\u00f8\u00f1\u00b9\u00d9\u00f4\u00fc\u00f3\u00f5\u00e2\u00ad", "\u013a\u0121\u011d\u013a\u013c\u0127\u0120\u0129\u0172\u0170\u0166\u0167\u0102\u0124\u012f\u0138\u012f\u0161\u0122\u012f\u0120\u0129\u0161\u011d\u013a\u013c\u0127\u0120\u0129\u0175", "\u04f6\u04f7\u04ec\u04f1\u04fe\u04e1\u04a4\u04a6\u04b0\u04b1\u04ce", "\u00b9\u00b8\u00a3\u00be\u00b1\u00ae\u0096\u00bb\u00bb\u00eb\u00e9\u00ff\u00fe\u0081", "\u05ce\u05d8\u05d0\u05cd\u0585\u0587\u0591\u0590\u05ef", "\u052b\u053d\u0535\u0528\u0560\u0562\u0574\u0516\u0575\u050a", "\u07e4\u07f2\u07fa\u07e7\u07a3\u07af\u07ad\u07bb\u07d9\u07ba\u07c5", "\u03bd\u03ab\u03a3\u03be\u03f6\u03f4\u03e2\u0380\u0383\u03e3\u039c", "\u04e4\u04eb\u04ec\u04e3\u04ee\u04eb\u04f8\u04e7\u04be\u04bc\u04aa\u04ab\u04d4"})
public final class Class5429 {
    public static double field10111 = 0.301146981292008;
    public static float field10112 = 0.79019004f;
    public static double field10113;
    public static int field10114 = 405403335;
    public static float field10115;
    public static double field10116;

    private static String mvb9AeTTrnB4D1wq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 4MDJldJWdzt16V(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5429.mvb9AeTTrnB4D1wq(k2, -246445339));
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
                int a2 = Integer.parseInt(Class5429.mvb9AeTTrnB4D1wq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5429.mvb9AeTTrnB4D1wq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5429.mvb9AeTTrnB4D1wq(k2, -246445339) + " " + l2 + " " + m2);
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
        field10115 = Float.intBitsToFloat(1061382698);
        ab\u200e = "DisableOnJump";
        field10116 = Double.longBitsToDouble(4616752568008179712L);
        field10113 = Double.longBitsToDouble(4605040496895400071L);
    }
}

