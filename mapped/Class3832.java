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

@HACHIMI_CLIENT(mv=100, d1={"\u46f3\u46f6\u46f2\u46f5\u46fe\u46f4\u46f3\u46ff", "\u62a3\u62a1\u62a6\u62ae\u62a6\u62ae\u62a2\u62a2", "\u884f\u884e\u8846\u884f\u884a\u8849\u884b\u8847", "\u3c53\u3c51\u3c54\u3c55\u3c53", "\u191a\u1919\u191c\u191c\u1910\u1918\u1911\u191b", "\ua313\ua314\ua314\ua316\ua315\ua316\ua317\ua31d", "\u9c45\u9c40\u9c45\u9c40\u9c4f\u9c4e\u9c44\u9c42", "\u1414\u1414\u1410\u141b\u1410\u1412\u141b\u1417", "\u19a9\u19ad\u19a9\u19a9\u19a8\u19aa\u19ab\u19ad", "\uda1c\uda11\uda1b\uda1e\uda11\uda18\uda1c\uda1c", "\u8f33\u8f30\u8f3b\u8f34\u8f32\u8f36\u8f35\u8f3b", "\u01f4\u01f4\u01f7\u01f8\u01f7\u01f3\u01f1\u01f2", "\u9ddb\u9dd0\u9ddb\u9dd1\u9ddb\u9dd0\u9dd8\u9ddb", "\u3038\u303f\u3038\u303a\u303c\u303a\u3038\u303a", "\u74bb\u74bc\u74b8\u74bb\u74be\u74b0\u74bf\u74b1"}, d2={"\u00e0\u00c1\u00e8\u2081\u00b3\u00b1\u00a7\u00c3\u00e5\u00ee\u00f9\u00ee\u00a0\u00e3\u00ee\u00e1\u00e8\u00a0\u00dc\u00fb\u00fd\u00e6\u00e1\u00e8\u00b4\u00a6\u00c3\u00e5\u00ee\u00f9\u00ee\u00a0\u00e3\u00ee\u00e1\u00e8\u00a0\u00dc\u00fb\u00fd\u00e6\u00e1\u00e8\u00b4", "\u0390\u03cf\u03c0\u03c5\u03c2\u03c5\u03d8\u0392\u0390\u0392\u0384\u0385\u03fa", "\u03f0\u03a5\u03a2\u03a5\u03b8\u03f2\u03f0\u03f2\u03e4\u03e5\u039a", "\u064d\u064f\u065e\u0669\u0646\u064b\u0659\u0659\u0616\u0614\u0602\u0603\u0666\u0640\u064b\u065c\u064b\u0605\u0646\u064b\u0644\u064d\u0605\u0669\u0646\u064b\u0659\u0659\u0611", "\u069e\u0697\u0685\u069e\u06b5\u0699\u0692\u0693\u06ca\u06c8\u06de\u06df\u06bf", "\u018c\u0198\u019c\u0188\u0185\u019a\u01d5\u01d7\u01c1\u01a5\u0183\u0188\u019f\u0188\u01c6\u0185\u0188\u0187\u018e\u01c6\u01a6\u018b\u0183\u018c\u018a\u019d\u01d2\u01c0\u01b3", "\u04b5\u04ba\u04b9\u04b8\u04b3\u04ea\u04e8\u04fe\u04ff\u049a\u04bc\u04b7\u04a0\u04b7\u04f9\u04ba\u04b7\u04b8\u04b1\u04f9\u0499\u04b4\u04bc\u04b3\u04b5\u04a2\u04ed", "\u0796\u078d\u07b1\u0796\u0790\u078b\u078c\u0785\u07de\u07dc\u07ca\u07cb\u07ae\u0788\u0783\u0794\u0783\u07cd\u078e\u0783\u078c\u0785\u07cd\u07b1\u0796\u0790\u078b\u078c\u0785\u07d9", "\u024e\u024f\u0254\u0249\u0246\u0259\u021c\u021e\u0208\u0209\u0276", "\u05e5\u05e4\u05ff\u05e2\u05ed\u05f2\u05ca\u05e7\u05e7\u05b7\u05b5\u05a3\u05a2\u05dd", "\u057e\u0568\u0560\u057d\u0535\u0537\u0521\u0520\u055f", "\u00d9\u00cf\u00c7\u00da\u0092\u0090\u0086\u00e4\u0087\u00f8", "\u02a9\u02bf\u02b7\u02aa\u02ee\u02e2\u02e0\u02f6\u0294\u02f7\u0288", "\u00b3\u00a5\u00ad\u00b0\u00f8\u00fa\u00ec\u008e\u008d\u00ed\u0092", "\u03fe\u03f1\u03f6\u03f9\u03f4\u03f1\u03e2\u03fd\u03a4\u03a6\u03b0\u03b1\u03ce"})
public final class Class3832 {
    public static int field8686 = 562806916;
    public static int field8687 = 1385157179;
    public static float field8688;
    public static int field8689 = 1235592957;
    public static float field8690;

    private static String B4TsM8N7Z0iB4cJl(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8690 = Float.intBitsToFloat(1052116452);
        O\u200e = "Renders the crystal model";
        field8688 = Float.intBitsToFloat(1054411330);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite YPtKpaq1JYrObb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3832.B4TsM8N7Z0iB4cJl(k2, -1294099470));
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
                int a2 = Integer.parseInt(Class3832.B4TsM8N7Z0iB4cJl(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3832.B4TsM8N7Z0iB4cJl(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3832.B4TsM8N7Z0iB4cJl(k2, -1294099470) + " " + l2 + " " + m2);
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

