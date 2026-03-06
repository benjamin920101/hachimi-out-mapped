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
@HACHIMI_CLIENT(mv=100, d1={"\u8111\u8112\u811e\u8111\u8115\u8111\u8111\u8115", "\ucaa4\ucaa1\ucaa3\ucaa0\ucaa1\ucaa7\ucaaf\ucaa0", "\u7e76\u7e73\u7e70\u7e76\u7e77\u7e75\u7e74\u7e74", "\ucf81\ucf80\ucf87\ucf81\ucf83\ucf88\ucf87\ucf81", "\ue42a\ue421\ue42b\ue428\ue428\ue420\ue42f\ue421", "\u56d6\u56d2\u56dc\u56d3\u56d5\u56d5\u56d0\u56d1", "\u91d1\u91d4\u91d0\u91d4\u91d5\u91d7\u91d2", "\u3163\u3161\u3165\u3166\u3163\u3161\u3165\u3161", "\u5b1c\u5b1d\u5b10\u5b15\u5b17\u5b16\u5b1d", "\u7f2f\u7f24\u7f28\u7f2c\u7f2e\u7f2f\u7f28\u7f2b", "\u2807\u2806\u2801\u280c\u2803\u280d\u2803\u2805", "\u0f24\u0f21\u0f25\u0f22\u0f26\u0f23\u0f24\u0f23", "\u9d81\u9d88\u9d89\u9d87\u9d89\u9d84\u9d89\u9d84", "\u18ae\u18a0\u18af\u18ab\u18ad\u18a8\u18af\u18ac"}, d2={"\u02d6\u0289\u0286\u0283\u0284\u0283\u029e\u02d4\u02d6\u02d4\u02c2\u02c3\u02bc", "\u02f0\u02a5\u02a2\u02a5\u02b8\u02f2\u02f0\u02f2\u02e4\u02e5\u029a", "\u0012\u0010\u00016\u0019\u0014\u0006\u0006IK]\\9\u001f\u0014\u0003\u0014Z\u0019\u0014\u001b\u0012Z6\u0019\u0014\u0006\u0006N", "\u042b\u0422\u0430\u042b\u0400\u042c\u0427\u0426\u047f\u047d\u046b\u046a\u040a", "\u07a1\u07b5\u07b1\u07a5\u07a8\u07b7\u07f8\u07fa\u07ec\u0788\u07ae\u07a5\u07b2\u07a5\u07eb\u07a8\u07a5\u07aa\u07a3\u07eb\u078b\u07a6\u07ae\u07a1\u07a7\u07b0\u07ff\u07ed\u079e", "\u02d3\u02dc\u02df\u02de\u02d5\u028c\u028e\u0298\u0299\u02fc\u02da\u02d1\u02c6\u02d1\u029f\u02dc\u02d1\u02de\u02d7\u029f\u02ff\u02d2\u02da\u02d5\u02d3\u02c4\u028b", "\u0583\u0598\u05a4\u0583\u0585\u059e\u0599\u0590\u05cb\u05c9\u05df\u05de\u05bb\u059d\u0596\u0581\u0596\u05d8\u059b\u0596\u0599\u0590\u05d8\u05a4\u0583\u0585\u059e\u0599\u0590\u05cc", "\u0432\u0433\u0428\u0435\u043a\u0425\u0460\u0462\u0474\u0475\u040a", "NOTIFYaLL\u001c\u001e\b\tv", "\u0508\u051e\u0516\u050b\u0543\u0541\u0557\u0556\u0529", "\u04a5\u04b3\u04bb\u04a6\u04ee\u04ec\u04fa\u0498\u04fb\u0484", "\u0453\u0445\u044d\u0450\u0414\u0418\u041a\u040c\u046e\u040d\u0472", "\u03f1\u03e7\u03ef\u03f2\u03ba\u03b8\u03ae\u03cc\u03cf\u03af\u03d0", "\u06a9\u06a6\u06a1\u06ae\u06a3\u06a6\u06b5\u06aa\u06f3\u06f1\u06e7\u06e6\u0699"})
public final class Class5077 {
    public static double field10060 = Double.longBitsToDouble(4606044595028429799L);
    public static float field10061 = Float.intBitsToFloat(1033696784);
    public static long field10062 = 0xFFFFFFFFL;
    public static float field10063 = Float.intBitsToFloat(1132396544);
    public static int field10064 = 598758922;

    /*
     * WARNING - void declaration
     */
    private static CallSite uWAd4glN6RTW6y(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5077.12RgQnUv994i2NmR(k2, 502575885));
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
                int a2 = Integer.parseInt(Class5077.12RgQnUv994i2NmR(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5077.12RgQnUv994i2NmR(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5077.12RgQnUv994i2NmR(k2, 502575885) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 12RgQnUv994i2NmR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

