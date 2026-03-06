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

@HACHIMI_CLIENT(mv=100, d1={"\u3666\u3668\u3664\u3664\u3664\u3668\u3669\u3667", "\ub2b5\ub2b1\ub2ba\ub2ba\ub2b4\ub2b7\ub2b7\ub2bb", "\ue1f3\ue1f8\ue1f8\ue1f4\ue1f4\ue1f5\ue1f1\ue1f6", "\u7086\u7083\u7080\u7086\u7087\u7086\u7082\u7085", "\ue0c4\ue0c5\ue0c2\ue0c4\ue0cd\ue0c7\ue0cc\ue0c7", "\u0d60\u0d6b\u0d61\u0d64\u0d67\u0d62\u0d63\u0d63", "\u3c84\u3c83\u3c86\u3c83\u3c86\u3c80\u3c87\u3c83", "\u181e\u181f\u181d\u181a\u1812\u1812\u181e\u181d", "\udac9\udacb\udacd\udac4\udace\udacb\udacf\udacf", "\u0aae\u0aab\u0aaa\u0aa9\u0aad\u0aae\u0aa2\u0aad", "\u0605\u060a\u0604\u0601\u0603\u0603\u0602", "\u6880\u6882\u6880\u6880\u688d\u688d\u6883\u6882", "\u2234\u2231\u2234\u2230\u2232\u2231\u2235\u2230", "\u9899\u9890\u9898\u989a\u989d\u989a\u9891\u989c", "\ua887\ua885\ua885\ua880\ua881\ua886\ua881\ua884"}, d2={"\u0712\u072d\u0719\u2775\u0747\u0745\u0753\u0737\u0711\u071a\u070d\u071a\u0754\u0717\u071a\u0715\u071c\u0754\u0728\u070f\u0709\u0712\u0715\u071c\u0740\u0752\u0737\u0711\u071a\u070d\u071a\u0754\u0717\u071a\u0715\u071c\u0754\u0728\u070f\u0709\u0712\u0715\u071c\u0740", "\u00e7\u00b8\u00b7\u00b2\u00b5\u00b2\u00af\u00e5\u00e7\u00e5\u00f3\u00f2\u008d", "\u0412\u0447\u0440\u0447\u045a\u0410\u0412\u0410\u0406\u0407\u0478", "\u03a7\u03a5\u03b4\u0383\u03ac\u03a1\u03b3\u03b3\u03fc\u03fe\u03e8\u03e9\u038c\u03aa\u03a1\u03b6\u03a1\u03ef\u03ac\u03a1\u03ae\u03a7\u03ef\u0383\u03ac\u03a1\u03b3\u03b3\u03fb", "\u01e3\u01ea\u01f8\u01e3\u01c8\u01e4\u01ef\u01ee\u01b7\u01b5\u01a3\u01a2\u01c2", "\u05a2\u05b6\u05b2\u05a6\u05ab\u05b4\u05fb\u05f9\u05ef\u058b\u05ad\u05a6\u05b1\u05a6\u05e8\u05ab\u05a6\u05a9\u05a0\u05e8\u0588\u05a5\u05ad\u05a2\u05a4\u05b3\u05fc\u05ee\u059d", "\u0252\u025d\u025e\u025f\u0254\u020d\u020f\u0219\u0218\u027d\u025b\u0250\u0247\u0250\u021e\u025d\u0250\u025f\u0256\u021e\u027e\u0253\u025b\u0254\u0252\u0245\u020a", "\u041e\u0405\u0439\u041e\u0418\u0403\u0404\u040d\u0456\u0454\u0442\u0443\u0426\u0400\u040b\u041c\u040b\u0445\u0406\u040b\u0404\u040d\u0445\u0439\u041e\u0418\u0403\u0404\u040d\u0451", "\u022a\u022b\u0230\u022d\u0222\u023d\u0278\u027a\u026c\u026d\u0212", "\u043c\u043d\u0426\u043b\u0434\u042b\u0413\u043e\u043e\u046e\u046c\u047a\u047b\u0404", "\u06af\u06b9\u06b1\u06ac\u06e4\u06e6\u06f0\u06f1\u068e", "\u062f\u0639\u0631\u062c\u0664\u0666\u0670\u0612\u0671\u060e", "\u0258\u024e\u0246\u025b\u021f\u0213\u0211\u0207\u0265\u0206\u0279", "\u0291\u0287\u028f\u0292\u02da\u02d8\u02ce\u02ac\u02af\u02cf\u02b0", "\u021b\u0214\u0213\u021c\u0211\u0214\u0207\u0218\u0241\u0243\u0255\u0254\u022b"})
public final class Class3574 {
    public static float field7947;
    public static float field7948;
    public static double field7949 = 0.3842371076673198;
    public static double field7950;
    public static float field7951;

    private static String T19ziLeE5tLOWLAF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite SmNpis8TgKGbut(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3574.T19ziLeE5tLOWLAF(k2, -1694793063));
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
                int a2 = Integer.parseInt(Class3574.T19ziLeE5tLOWLAF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3574.T19ziLeE5tLOWLAF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3574.T19ziLeE5tLOWLAF(k2, -1694793063) + " " + l2 + " " + m2);
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
        field7948 = Float.intBitsToFloat(1118437376);
        field7947 = Float.intBitsToFloat(1062876130);
        field7950 = Double.longBitsToDouble(4591352555748161336L);
        field7951 = Float.intBitsToFloat(1050510982);
        bz\u200e = "Disable the spam place on mined pos";
    }
}

