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

@HACHIMI_CLIENT(mv=100, d1={"\uc697\uc69a\uc694\uc691\uc692\uc690\uc69b\uc69a", "\u4c51\u4c56\u4c5a\u4c51\u4c55\u4c5b\u4c56\u4c53", "\u0128\u012c\u012e\u012b\u0126\u0128\u0126\u012e", "\u92c9\u92c8\u92c7\u92ce\u92cc\u92cb\u92c6\u92c8", "\u3713\u3713\u3712\u3714\u3712\u371c\u3710\u3712", "\uac42\uac40\uac4e\uac4f\uac43\uac4f\uac40", "\u0845\u0847\u084d\u084d\u084c\u0844\u0841\u084d", "\u45b5\u45b2\u45b0\u45b3\u45b2\u45ba\u45b7\u45bb", "\uc47b\uc47e\uc477\uc47a\uc476\uc47d\uc479\uc476", "\ud852\ud857\ud857\ud853\ud85b\ud855\ud850\ud851", "\u75db\u75db\u75db\u75d7\u75d8\u75d6\u75d9\u75df", "\u36ee\u36ee\u36eb\u36ee\u36ef\u36ed\u36ed\u36e3", "\ue663\ue665\ue661\ue66b\ue662\ue662\ue666\ue66b", "\u19eb\u19ea\u19e9\u19e7\u19e7\u19ee\u19e8\u19ec", "\u73e9\u73e3\u73ec\u73e9\u73ef\u73ea\u73ec\u73e9", "\ubf8d\ubf8a\ubf8b\ubf8d\ubf8f\ubf8c\ubf89\ubf86", "\u0a4c\u0a49\u0a47\u0a4f\u0a47\u0a46\u0a4e\u0a4c", "\uaf18\uaf1e\uaf19\uaf1a\uaf14\uaf19\uaf18\uaf1e"}, d2={"\u048f\u0493\u0486\u24ef\u04dd\u04df\u04c9\u04ad\u048b\u0480\u0497\u0480\u04ce\u048d\u0480\u048f\u0486\u04ce\u04b2\u0495\u0493\u0488\u048f\u0486\u04da\u04c8\u04ad\u048b\u0480\u0497\u0480\u04ce\u048d\u0480\u048f\u0486\u04ce\u04b2\u0495\u0493\u0488\u048f\u0486\u04da", "\u041a\u0406\u041c\u247a\u0448\u044a\u045c\u0438\u041e\u0415\u0402\u0415\u045b\u0418\u0415\u041a\u0413\u045b\u0427\u0400\u0406\u041d\u041a\u0413\u044f\u045d\u0438\u041e\u0415\u0402\u0415\u045b\u0418\u0415\u041a\u0413\u045b\u0427\u0400\u0406\u041d\u041a\u0413\u044f", "\u0504\u0518\u0503\u2564\u0556\u0554\u0542\u0526\u0500\u050b\u051c\u050b\u0545\u0506\u050b\u0504\u050d\u0545\u0539\u051e\u0518\u0503\u0504\u050d\u0551\u0543\u0526\u0500\u050b\u051c\u050b\u0545\u0506\u050b\u0504\u050d\u0545\u0539\u051e\u0518\u0503\u0504\u050d\u0551", "\u0388\u0394\u038c\u23e8\u03da\u03d8\u03ce\u03aa\u038c\u0387\u0390\u0387\u03c9\u038a\u0387\u0388\u0381\u03c9\u03b5\u0392\u0394\u038f\u0388\u0381\u03dd\u03cf\u03aa\u038c\u0387\u0390\u0387\u03c9\u038a\u0387\u0388\u0381\u03c9\u03b5\u0392\u0394\u038f\u0388\u0381\u03dd", "\u071e\u0741\u074e\u074b\u074c\u074b\u0756\u071c\u071e\u071c\u070a\u070b\u0774", "\u04e6\u04b3\u04b4\u04b3\u04ae\u04e4\u04e6\u04e4\u04f2\u04f3\u048c", "\u06cc\u06ce\u06df\u06e8\u06c7\u06ca\u06d8\u06d8\u0697\u0695\u0683\u0682\u06e7\u06c1\u06ca\u06dd\u06ca\u0684\u06c7\u06ca\u06c5\u06cc\u0684\u06e8\u06c7\u06ca\u06d8\u06d8\u0690", "\u0592\u059b\u0589\u0592\u05b9\u0595\u059e\u059f\u05c6\u05c4\u05d2\u05d3\u05b3", "\u0262\u0276\u0272\u0266\u026b\u0274\u023b\u0239\u022f\u024b\u026d\u0266\u0271\u0266\u0228\u026b\u0266\u0269\u0260\u0228\u0248\u0265\u026d\u0262\u0264\u0273\u023c\u022e\u025d", "\u024c\u0243\u0240\u0241\u024a\u0213\u0211\u0207\u0206\u0263\u0245\u024e\u0259\u024e\u0200\u0243\u024e\u0241\u0248\u0200\u0260\u024d\u0245\u024a\u024c\u025b\u0214", "\u03ec\u03f7\u03cb\u03ec\u03ea\u03f1\u03f6\u03ff\u03a4\u03a6\u03b0\u03b1\u03d4\u03f2\u03f9\u03ee\u03f9\u03b7\u03f4\u03f9\u03f6\u03ff\u03b7\u03cb\u03ec\u03ea\u03f1\u03f6\u03ff\u03a3", "\u03b5\u03b4\u03af\u03b2\u03bd\u03a2\u03e7\u03e5\u03f3\u03f2\u038d", "\u02b0\u02b1\u02aa\u02b7\u02b8\u02a7\u029f\u02b2\u02b2\u02e2\u02e0\u02f6\u02f7\u0288", "\u07fe\u07e8\u07e0\u07fd\u07b5\u07b7\u07a1\u07a0\u07df", "\u01d0\u01c6\u01ce\u01d3\u019b\u0199\u018f\u01ed\u018e\u01f1", "\u0184\u0192\u019a\u0187\u01c3\u01cf\u01cd\u01db\u01b9\u01da\u01a5", "\u0186\u0190\u0198\u0185\u01cd\u01cf\u01d9\u01bb\u01b8\u01d8\u01a7", "\u026d\u0262\u0265\u026a\u0267\u0262\u0271\u026e\u0237\u0235\u0223\u0222\u025d"})
public final class Class5495 {
    public static float field10317 = Float.intBitsToFloat(1059068218);

    /*
     * WARNING - void declaration
     */
    private static CallSite nsaGUpyEybBMCz(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5495.Mzivno3g88NYwloD(k2, -186478179));
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
                int a2 = Integer.parseInt(Class5495.Mzivno3g88NYwloD(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5495.Mzivno3g88NYwloD(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5495.Mzivno3g88NYwloD(k2, -186478179) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String Mzivno3g88NYwloD(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        w\u200e = "setting";
        C\u200e = "Applies to arrows shot from a bow";
        ap\u200e = "ObstaclePasser";
        aQ\u200e = "Allow player to carry items in the crafting slots";
    }
}

