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

@HACHIMI_CLIENT(mv=100, d1={"\ua3d7\ua3d8\ua3d4\ua3d1\ua3d4\ua3d7\ua3d4", "\u6ae9\u6aee\u6ae8\u6aee\u6aec\u6aea\u6aee\u6aed", "\ub7b2\ub7b5\ub7b4\ub7b4\ub7b3\ub7be\ub7b6\ub7b1", "\u97c1\u97c1\u97c2\u97c0\u97c7\u97c6\u97c7\u97c5", "\u4a70\u4a73\u4a7c\u4a70\u4a77\u4a76\u4a7c\u4a77", "\u7565\u7563\u7563\u7565\u7560\u7567\u756a\u7562", "\ubda4\ubda0\ubda6\ubda0\ubda6\ubda8\ubda4\ubda5", "\uc81c\uc81e\uc818\uc816\uc81a\uc81e\uc81d\uc817", "\u9df6\u9df3\u9df4\u9df5\u9dfd\u9df3\u9df4\u9dfd", "\u78ab\u78a1\u78ae\u78a1\u78ad\u78a0\u78ab\u78ac", "\u8eed\u8ee6\u8ee8\u8ee6\u8ee7\u8eee\u8ee8\u8ee9", "\u8d1f\u8d15\u8d18\u8d1d\u8d19\u8d1e\u8d15\u8d1a", "\u6a4a\u6a4f\u6a4e\u6a4b\u6a4a\u6a4b\u6a45\u6a48", "\u53c8\u53c3\u53cd\u53cc\u53c8\u53c2\u53c2\u53c9"}, d2={"\u01bf\u01e0\u01ef\u01ea\u01ed\u01ea\u01f7\u01bd\u01bf\u01bd\u01ab\u01aa\u01d5", "\u02a7\u02f2\u02f5\u02f2\u02ef\u02a5\u02a7\u02a5\u02b3\u02b2\u02cd", "\u0719\u071b\u070a\u073d\u0712\u071f\u070d\u070d\u0742\u0740\u0756\u0757\u0732\u0714\u071f\u0708\u071f\u0751\u0712\u071f\u0710\u0719\u0751\u073d\u0712\u071f\u070d\u070d\u0745", "\u024c\u0245\u0257\u024c\u0267\u024b\u0240\u0241\u0218\u021a\u020c\u020d\u026d", "\u03af\u03bb\u03bf\u03ab\u03a6\u03b9\u03f6\u03f4\u03e2\u0386\u03a0\u03ab\u03bc\u03ab\u03e5\u03a6\u03ab\u03a4\u03ad\u03e5\u0385\u03a8\u03a0\u03af\u03a9\u03be\u03f1\u03e3\u0390", "\u0511\u051e\u051d\u051c\u0517\u054e\u054c\u055a\u055b\u053e\u0518\u0513\u0504\u0513\u055d\u051e\u0513\u051c\u0515\u055d\u053d\u0510\u0518\u0517\u0511\u0506\u0549", "\u06fe\u06e5\u06d9\u06fe\u06f8\u06e3\u06e4\u06ed\u06b6\u06b4\u06a2\u06a3\u06c6\u06e0\u06eb\u06fc\u06eb\u06a5\u06e6\u06eb\u06e4\u06ed\u06a5\u06d9\u06fe\u06f8\u06e3\u06e4\u06ed\u06b1", "\u0737\u0736\u072d\u0730\u073f\u0720\u0765\u0767\u0771\u0770\u070f", "\u06f7\u06f6\u06ed\u06f0\u06ff\u06e0\u06d8\u06f5\u06f5\u06a5\u06a7\u06b1\u06b0\u06cf", "\u0178\u016e\u0166\u017b\u0133\u0131\u0127\u0126\u0159", "\u0627\u0631\u0639\u0624\u066c\u066e\u0678\u061a\u0679\u0606", "\u044e\u0458\u0450\u044d\u0409\u0405\u0407\u0411\u0473\u0410\u046f", "\u07b7\u07a1\u07a9\u07b4\u07fc\u07fe\u07e8\u078a\u0789\u07e9\u0796", "\u021b\u0214\u0213\u021c\u0211\u0214\u0207\u0218\u0241\u0243\u0255\u0254\u022b"})
public final class Class3423 {
    public static float field7456 = 0.025278449f;
    public static float field7457 = Float.intBitsToFloat(1058010029);
    public static float field7458 = Float.intBitsToFloat(1050707320);
    public static float field7459 = 0.86857885f;

    /*
     * WARNING - void declaration
     */
    private static CallSite pa3Jg1b8fdPIQv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3423.Db6QtpDuAVHX2FUa(k2, 1354219479));
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
                int a2 = Integer.parseInt(Class3423.Db6QtpDuAVHX2FUa(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3423.Db6QtpDuAVHX2FUa(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3423.Db6QtpDuAVHX2FUa(k2, 1354219479) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String Db6QtpDuAVHX2FUa(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

