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
@HACHIMI_CLIENT(mv=100, d1={"\u5861\u5862\u5862\u5865\u5866\u5860\u5867\u5865", "\u5005\u5000\u5005\u5001\u5004\u5007\u5003\u5004", "\u9d6f\u9d6e\u9d6d\u9d65\u9d65\u9d65\u9d69\u9d69", "\u53df\u53de\u53da\u53db\u53d9\u53d1\u53d0\u53d8", "\u1bff\u1bfa\u1bf8\u1bf0\u1bfe\u1bf9\u1bf0\u1bf9", "\u1299\u1298\u1298\u129f\u1295\u1294\u129b\u1294", "\u19b6\u19b0\u19b5\u19bc\u19b2\u19b2\u19b3\u19b0", "\uc4f3\uc4f5\uc4f5\uc4f4\uc4f6\uc4f3\uc4f4\uc4f0", "\u345d\u345d\u345d\u345e\u345b\u3459\u3456\u345b", "\ud46d\ud46a\ud46f\ud469\ud467\ud46c\ud46f\ud468", "\u184c\u1849\u184b\u184b\u1840\u1840\u184a\u184a", "\u98ea\u98ed\u98ef\u98eb\u98e6\u98ea\u98ee\u98ec", "\u2e9e\u2e9e\u2e98\u2e92\u2e92\u2e92\u2e9e\u2e9c", "\ub2d1\ub2d1\ub2d5\ub2d4\ub2d0\ub2d2\ub2d9\ub2d3", "\uc783\uc786\uc781\uc784\uc78c\uc782\uc782\uc786", "\u13b0\u13b3\u13b0\u13bd\u13b1\u13b4\u13b1\u13b2"}, d2={"\u07a4\u27c7\u07f5\u07f7\u07e1\u0785\u07a3\u07a8\u07bf\u07a8\u07e6\u07a5\u07a8\u07a7\u07ae\u07e6\u079a\u07bd\u07bb\u07a0\u07a7\u07ae\u07f2\u07e0\u0785\u07a3\u07a8\u07bf\u07a8\u07e6\u07a5\u07a8\u07a7\u07ae\u07e6\u079a\u07bd\u07bb\u07a0\u07a7\u07ae\u07f2", "\u068e\u26ee\u06dc\u06de\u06c8\u06ac\u068a\u0681\u0696\u0681\u06cf\u068c\u0681\u068e\u0687\u06cf\u06b3\u0694\u0692\u0689\u068e\u0687\u06db\u06c9\u06ac\u068a\u0681\u0696\u0681\u06cf\u068c\u0681\u068e\u0687\u06cf\u06b3\u0694\u0692\u0689\u068e\u0687\u06db", "\u001f@OJMJW\u001d\u001f\u001d\u000b\nu", "\u0258\u020d\u020a\u020d\u0210\u025a\u0258\u025a\u024c\u024d\u0232", "\u057c\u057e\u056f\u0558\u0577\u057a\u0568\u0568\u0527\u0525\u0533\u0532\u0557\u0571\u057a\u056d\u057a\u0534\u0577\u057a\u0575\u057c\u0534\u0558\u0577\u057a\u0568\u0568\u0520", "\u06b6\u06bf\u06ad\u06b6\u069d\u06b1\u06ba\u06bb\u06e2\u06e0\u06f6\u06f7\u0697", "\u02f5\u02e1\u02e5\u02f1\u02fc\u02e3\u02ac\u02ae\u02b8\u02dc\u02fa\u02f1\u02e6\u02f1\u02bf\u02fc\u02f1\u02fe\u02f7\u02bf\u02df\u02f2\u02fa\u02f5\u02f3\u02e4\u02ab\u02b9\u02ca", "\u0353\u035c\u035f\u035e\u0355\u030c\u030e\u0318\u0319\u037c\u035a\u0351\u0346\u0351\u031f\u035c\u0351\u035e\u0357\u031f\u037f\u0352\u035a\u0355\u0353\u0344\u030b", "\u0708\u0713\u072f\u0708\u070e\u0715\u0712\u071b\u0740\u0742\u0754\u0755\u0730\u0716\u071d\u070a\u071d\u0753\u0710\u071d\u0712\u071b\u0753\u072f\u0708\u070e\u0715\u0712\u071b\u0747", "\u0730\u0731\u072a\u0737\u0738\u0727\u0762\u0760\u0776\u0777\u0708", "\u03e8\u03e9\u03f2\u03ef\u03e0\u03ff\u03c7\u03ea\u03ea\u03ba\u03b8\u03ae\u03af\u03d0", "\u0739\u072f\u0727\u073a\u0772\u0770\u0766\u0767\u0718", "\u0575\u0563\u056b\u0576\u053e\u053c\u052a\u0548\u052b\u0554", "\u02a6\u02b0\u02b8\u02a5\u02e1\u02ed\u02ef\u02f9\u029b\u02f8\u0287", "\u0741\u0757\u075f\u0742\u070a\u0708\u071e\u077c\u077f\u071f\u0760", "\u0015\u001a\u001d\u0012\u001f\u001a\t\u0016OM[Z%"})
public final class Class3517 {
    public static double field7761;
    public static double field7762;
    public static float field7763;

    static {
        field7763 = Float.intBitsToFloat(1057406518);
        S\u200e = "";
        T\u200e = "Auto disable the module when mending finish or no xp bottles";
        field7761 = Double.longBitsToDouble(4588057082205627328L);
        field7762 = Double.longBitsToDouble(4606221414306173514L);
    }

    private static String Mn0xmyAe72lbBCVF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 1V3kjbSTfHvsdc(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3517.Mn0xmyAe72lbBCVF(k2, -1054570280));
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
                int a2 = Integer.parseInt(Class3517.Mn0xmyAe72lbBCVF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3517.Mn0xmyAe72lbBCVF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 33540 : 33541;
        block7: while (true) {
            switch (n3) {
                case 33541: {
                    n3 = 33539;
                    continue block7;
                }
                case 33540: {
                    throw new Exception("Can't find method in " + Class3517.Mn0xmyAe72lbBCVF(k2, -1054570280) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

