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
@HACHIMI_CLIENT(mv=100, d1={"\u324f\u3245\u324d\u324d\u3249\u324a\u324c\u3248", "\ue53b\ue533\ue53d\ue53d\ue538\ue53a\ue53a\ue53b", "\u55ca\u55cd\u55c9\u55cc\u55cf\u55cc\u55ce", "\u8977\u8970\u8973\u8975\u8974\u8972\u8975\u8977", "\ub402\ub405\ub405\ub407\ub400\ub403\ub405\ub40d", "\u3ef1\u3ef6\u3ef0\u3ef6\u3ef4", "\u3abf\u3ab6\u3aba\u3abf\u3ab6\u3abf\u3abe\u3abd", "\u2c5f\u2c55\u2c5e\u2c59\u2c55\u2c58\u2c5f\u2c59", "\udefe\udefb\udefa\udef5\udefd\udef8\udef4\udef8", "\u92f2\u92f3\u92f1\u92f5\u92f1\u92f2\u92f1\u92f7", "\u1c65\u1c67\u1c63\u1c64\u1c62\u1c64\u1c67\u1c61", "\u822e\u8222\u822f\u822a\u822a\u822d\u8228\u822d", "\ua38f\ua38c\ua388\ua38d\ua389\ua385\ua384\ua38a", "\u4465\u4467\u4461\u4462\u446a\u446a\u4460\u4464", "\u3f1c\u3f1e\u3f1d\u3f1b\u3f10\u3f18\u3f18\u3f1e", "\u6699\u6698\u6699\u669a\u669c\u669b\u669d\u669c", "\u6111\u6114\u6114\u6114\u611c\u6114\u611c\u611c"}, d2={"\u0425\u0425\u0430\u2458\u046a\u0468\u047e\u041a\u043c\u0437\u0420\u0437\u0479\u043a\u0437\u0438\u0431\u0479\u0405\u0422\u0424\u043f\u0438\u0431\u046d\u047f\u041a\u043c\u0437\u0420\u0437\u0479\u043a\u0437\u0438\u0431\u0479\u0405\u0422\u0424\u043f\u0438\u0431\u046d", "\u040c\u040c\u0418\u2471\u0443\u0441\u0457\u0433\u0415\u041e\u0409\u041e\u0450\u0413\u041e\u0411\u0418\u0450\u042c\u040b\u040d\u0416\u0411\u0418\u0444\u0456\u0433\u0415\u041e\u0409\u041e\u0450\u0413\u041e\u0411\u0418\u0450\u042c\u040b\u040d\u0416\u0411\u0418\u0444", "\u02ee\u02ee\u02f5\u2293\u02a1\u02a3\u02b5\u02d1\u02f7\u02fc\u02eb\u02fc\u02b2\u02f1\u02fc\u02f3\u02fa\u02b2\u02ce\u02e9\u02ef\u02f4\u02f3\u02fa\u02a6\u02b4\u02d1\u02f7\u02fc\u02eb\u02fc\u02b2\u02f1\u02fc\u02f3\u02fa\u02b2\u02ce\u02e9\u02ef\u02f4\u02f3\u02fa\u02a6", "\u05ad\u05f2\u05fd\u05f8\u05ff\u05f8\u05e5\u05af\u05ad\u05af\u05b9\u05b8\u05c7", "\u07a4\u07f1\u07f6\u07f1\u07ec\u07a6\u07a4\u07a6\u07b0\u07b1\u07ce", "\u0587\u0585\u0594\u05a3\u058c\u0581\u0593\u0593\u05dc\u05de\u05c8\u05c9\u05ac\u058a\u0581\u0596\u0581\u05cf\u058c\u0581\u058e\u0587\u05cf\u05a3\u058c\u0581\u0593\u0593\u05db", "\u000e\u0007\u0015\u000e%\t\u0002\u0003ZXNO/", "\u01fe\u01ea\u01ee\u01fa\u01f7\u01e8\u01a7\u01a5\u01b3\u01d7\u01f1\u01fa\u01ed\u01fa\u01b4\u01f7\u01fa\u01f5\u01fc\u01b4\u01d4\u01f9\u01f1\u01fe\u01f8\u01ef\u01a0\u01b2\u01c1", "\u0452\u045d\u045e\u045f\u0454\u040d\u040f\u0419\u0418\u047d\u045b\u0450\u0447\u0450\u041e\u045d\u0450\u045f\u0456\u041e\u047e\u0453\u045b\u0454\u0452\u0445\u040a", "\u0603\u0618\u0624\u0603\u0605\u061e\u0619\u0610\u064b\u0649\u065f\u065e\u063b\u061d\u0616\u0601\u0616\u0658\u061b\u0616\u0619\u0610\u0658\u0624\u0603\u0605\u061e\u0619\u0610\u064c", "\u03f5\u03f4\u03ef\u03f2\u03fd\u03e2\u03a7\u03a5\u03b3\u03b2\u03cd", "\u0181\u0180\u019b\u0186\u0189\u0196\u01ae\u0183\u0183\u01d3\u01d1\u01c7\u01c6\u01b9", "\u07cc\u07da\u07d2\u07cf\u0787\u0785\u0793\u0792\u07ed", "\u04a2\u04b4\u04bc\u04a1\u04e9\u04eb\u04fd\u049f\u04fc\u0483", "\u0253\u0245\u024d\u0250\u0214\u0218\u021a\u020c\u026e\u020d\u0272", "\u0528\u053e\u0536\u052b\u0563\u0561\u0577\u0515\u0516\u0576\u0509", "961>36%:cawv\t"})
public final class Class1679 {
    public static float field6225;
    public static double field6226;
    public static float field6227;

    private static String GQQJXWLYLLOIbDG3(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        x\u200e = "REMOVE";
        R\u200e = "PhasedOnly";
        field6225 = Float.intBitsToFloat(1058421656);
        field6227 = Float.intBitsToFloat(1050173460);
        field6226 = Double.longBitsToDouble(0x4000000000000000L);
        bP\u200e = "Use a custom delay instead of the vanilla cooldown";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 1drZC18mzFbVbq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1679.GQQJXWLYLLOIbDG3(k2, -618354597));
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
                int a2 = Integer.parseInt(Class1679.GQQJXWLYLLOIbDG3(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1679.GQQJXWLYLLOIbDG3(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1679.GQQJXWLYLLOIbDG3(k2, -618354597) + " " + l2 + " " + m2);
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

