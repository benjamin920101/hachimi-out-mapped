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

@HACHIMI_CLIENT(mv=100, d1={"\ud003\ud005\ud006\ud007\ud007\ud002\ud003\ud002", "\ucc18\ucc15\ucc17\ucc13\ucc13\ucc17\ucc12", "\u376e\u3769\u376d\u3768\u376c\u376d\u376c\u3769", "\u15a6\u15a9\u15a4\u15a4\u15a8\u15a9\u15a8\u15a2", "\u79eb\u79ee\u79e9\u79e8\u79e4\u79e9\u79ed\u79ef", "\u5136\u5133\u5136\u5137\u513c\u5136\u513c\u513d", "\u8a8f\u8a8e\u8a89\u8a8c\u8a81\u8a80\u8a8e", "\u09fc\u09fb\u09fd\u09f1\u09f0\u09fa\u09fa\u09f0", "\ud7f3\ud7f0\ud7f5\ud7f6\ud7f4\ud7fc\ud7f7\ud7f1", "\u48e2\u48ed\u48e1\u48e6\u48e5\u48e2\u48e2\u48e7", "\ubfbf\ubfbc\ubfbd\ubfbe\ubfb9\ubfbf\ubfbe\ubfbd", "\u730d\u730a\u7307\u730e\u7308\u7309\u7307\u730b", "\u9dc7\u9dca\u9dc6\u9dc4\u9dc7\u9dca\u9dc7\u9dc3", "\u641c\u6413\u641e\u641a\u6413\u641f\u641e\u641d", "\u1cc5\u1cc8\u1cc8\u1cc4\u1cc9\u1cc7\u1cc2\u1cc4"}, d2={"\u0784\u0785\u078d\u27ee\u07dc\u07de\u07c8\u07ac\u078a\u0781\u0796\u0781\u07cf\u078c\u0781\u078e\u0787\u07cf\u07b3\u0794\u0792\u0789\u078e\u0787\u07db\u07c9\u07ac\u078a\u0781\u0796\u0781\u07cf\u078c\u0781\u078e\u0787\u07cf\u07b3\u0794\u0792\u0789\u078e\u0787\u07db", "\u03fa\u03a5\u03aa\u03af\u03a8\u03af\u03b2\u03f8\u03fa\u03f8\u03ee\u03ef\u0390", "\u0344\u0311\u0316\u0311\u030c\u0346\u0344\u0346\u0350\u0351\u032e", "\u00cf\u00cd\u00dc\u00eb\u00c4\u00c9\u00db\u00db\u0094\u0096\u0080\u0081\u00e4\u00c2\u00c9\u00de\u00c9\u0087\u00c4\u00c9\u00c6\u00cf\u0087\u00eb\u00c4\u00c9\u00db\u00db\u0093", "\u0706\u070f\u071d\u0706\u072d\u0701\u070a\u070b\u0752\u0750\u0746\u0747\u0727", "\u041c\u0408\u040c\u0418\u0415\u040a\u0445\u0447\u0451\u0435\u0413\u0418\u040f\u0418\u0456\u0415\u0418\u0417\u041e\u0456\u0436\u041b\u0413\u041c\u041a\u040d\u0442\u0450\u0423", "\u02de\u02d1\u02d2\u02d3\u02d8\u0281\u0283\u0295\u0294\u02f1\u02d7\u02dc\u02cb\u02dc\u0292\u02d1\u02dc\u02d3\u02da\u0292\u02f2\u02df\u02d7\u02d8\u02de\u02c9\u0286", "\u0532\u0529\u0515\u0532\u0534\u052f\u0528\u0521\u057a\u0578\u056e\u056f\u050a\u052c\u0527\u0530\u0527\u0569\u052a\u0527\u0528\u0521\u0569\u0515\u0532\u0534\u052f\u0528\u0521\u057d", "\u0682\u0683\u0698\u0685\u068a\u0695\u06d0\u06d2\u06c4\u06c5\u06ba", "\u020c\u020d\u0216\u020b\u0204\u021b\u0223\u020e\u020e\u025e\u025c\u024a\u024b\u0234", "-;3.fdrs\f", "\u03e2\u03f4\u03fc\u03e1\u03a9\u03ab\u03bd\u03df\u03bc\u03c3", "\u0597\u0581\u0589\u0594\u05d0\u05dc\u05de\u05c8\u05aa\u05c9\u05b6", "\u0657\u0641\u0649\u0654\u061c\u061e\u0608\u066a\u0669\u0609\u0676", "\u0182\u018d\u018a\u0185\u0188\u018d\u019e\u0181\u01d8\u01da\u01cc\u01cd\u01b2"})
public final class Class4072 {
    public static float field9416;
    public static double field9417;
    public static long field9418 = 7619762586883390462L;
    public static int field9419 = 0;
    public static float field9420 = 0.8406382f;
    public static float field9421;

    static {
        field9417 = Double.longBitsToDouble(4602715828878108233L);
        field9421 = Float.intBitsToFloat(1037145912);
        field9416 = Float.intBitsToFloat(1099956224);
        aQ\u200e = "The shader mode";
    }

    private static String UNJOQ6lTdOvAssin(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite e9STdLPVpj9q6e(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4072.UNJOQ6lTdOvAssin(k2, 1423657336));
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
                int a2 = Integer.parseInt(Class4072.UNJOQ6lTdOvAssin(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4072.UNJOQ6lTdOvAssin(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4072.UNJOQ6lTdOvAssin(k2, 1423657336) + " " + l2 + " " + m2);
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

