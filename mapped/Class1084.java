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

@HACHIMI_CLIENT(mv=100, d1={"\u750e\u750d\u750a\u7502\u750a\u750a\u750e\u750a", "\u33e1\u33e1\u33e4\u33e4\u33e8\u33e4\u33e7", "\u15cb\u15ce\u15c8\u15c9\u15cd\u15c9\u15cf\u15c9", "\uad4b\uad48\uad47\uad46\uad4e\uad47\uad4e\uad48", "\udcc7\udccc\udcc6\udccb\udcca\udcca\udcca", "\u6af6\u6af0\u6af2\u6afe\u6af1\u6af1\u6af2\u6af7", "\u1782\u1780\u1786\u1782\u1785\u1780\u1785\u1787", "\u884d\u884b\u8845\u884c\u884e\u884c\u8848\u884c", "\u8e2e\u8e28\u8e2f\u8e2c\u8e2a\u8e2a\u8e2d\u8e2c", "\u1bdf\u1bdf\u1bdb\u1bda\u1bd2\u1bdc\u1bdc\u1bdb", "\ue07d\ue07d\ue07b\ue073\ue07d\ue073\ue072", "\u2caf\u2ca1\u2ca9\u2ca1\u2cac\u2ca9\u2caf\u2ca1", "\ude5a\ude53\ude5d\ude58\ude53\ude5c\ude59\ude58", "\u029f\u029d\u029d\u0298\u0298\u0293\u029a\u029f"}, d2={"\u06f8\u06a7\u06a8\u06ad\u06aa\u06ad\u06b0\u06fa\u06f8\u06fa\u06ec\u06ed\u0692", "\u011a\u014f\u0148\u014f\u0152\u0118\u011a\u0118\u010e\u010f\u0170", "\u0443\u0441\u0450\u0467\u0448\u0445\u0457\u0457\u0418\u041a\u040c\u040d\u0468\u044e\u0445\u0452\u0445\u040b\u0448\u0445\u044a\u0443\u040b\u0467\u0448\u0445\u0457\u0457\u041f", "\u0208\u0201\u0213\u0208\u0223\u020f\u0204\u0205\u025c\u025e\u0248\u0249\u0229", "\u024e\u025a\u025e\u024a\u0247\u0258\u0217\u0215\u0203\u0267\u0241\u024a\u025d\u024a\u0204\u0247\u024a\u0245\u024c\u0204\u0264\u0249\u0241\u024e\u0248\u025f\u0210\u0202\u0271", "\u0761\u076e\u076d\u076c\u0767\u073e\u073c\u072a\u072b\u074e\u0768\u0763\u0774\u0763\u072d\u076e\u0763\u076c\u0765\u072d\u074d\u0760\u0768\u0767\u0761\u0776\u0739", "\u0685\u069e\u06a2\u0685\u0683\u0698\u069f\u0696\u06cd\u06cf\u06d9\u06d8\u06bd\u069b\u0690\u0687\u0690\u06de\u069d\u0690\u069f\u0696\u06de\u06a2\u0685\u0683\u0698\u069f\u0696\u06ca", "\u02d9\u02d8\u02c3\u02de\u02d1\u02ce\u028b\u0289\u029f\u029e\u02e1", "\u0201\u0200\u021b\u0206\u0209\u0216\u022e\u0203\u0203\u0253\u0251\u0247\u0246\u0239", "\u0385\u0393\u039b\u0386\u03ce\u03cc\u03da\u03db\u03a4", "\u010e\u0118\u0110\u010d\u0145\u0147\u0151\u0133\u0150\u012f", "\u03b7\u03a1\u03a9\u03b4\u03f0\u03fc\u03fe\u03e8\u038a\u03e9\u0396", "\u07b7\u07a1\u07a9\u07b4\u07fc\u07fe\u07e8\u078a\u0789\u07e9\u0796", "\u03e4\u03eb\u03ec\u03e3\u03ee\u03eb\u03f8\u03e7\u03be\u03bc\u03aa\u03ab\u03d4"})
public final class Class1084 {
    public static float field4403 = Float.intBitsToFloat(1049928088);
    public static double field4404 = 0.21573337281917437;
    public static float field4405 = 0.9900841f;

    private static String CBgJdip4F3KYodmi(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite bGWekEeS63nhj1(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1084.CBgJdip4F3KYodmi(k2, -538997328));
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
                int a2 = Integer.parseInt(Class1084.CBgJdip4F3KYodmi(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1084.CBgJdip4F3KYodmi(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1084.CBgJdip4F3KYodmi(k2, -538997328) + " " + l2 + " " + m2);
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

