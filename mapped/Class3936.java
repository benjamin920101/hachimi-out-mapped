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

@HACHIMI_CLIENT(mv=100, d1={"\u75d1\u75d7\u75d8\u75d3\u75d7\u75d7\u75d1\u75d9", "\u6a35\u6a32\u6a36\u6a35\u6a32\u6a37\u6a3e\u6a3f", "\u02ca\u02cd\u02c0\u02cf\u02c9\u02ce\u02cb\u02c9", "\ua1cb\ua1cc\ua1c9\ua1cc\ua1cc\ua1cd\ua1c9\ua1cc", "\u5828\u582a\u582d\u582b\u5825\u582e\u582f\u582d", "\u1c93\u1c97\u1c97\u1c90\u1c96\u1c99\u1c90\u1c99", "\u5119\u5112\u511a\u511b\u5112\u511b\u511e\u511e", "\u3ae0\u3ae8\u3ae5\u3ae8\u3ae1\u3ae0\u3ae8\u3ae7", "\u7336\u7330\u7332\u7333\u7336\u7333\u7331\u7330", "\ud3dc\ud3db\ud3dd\ud3d6\ud3d6\ud3da\ud3dc\ud3df", "\u8526\u8521\u852b\u8520\u8525\u8527\u8525\u8527", "\u3f55\u3f55\u3f51\u3f56\u3f56\u3f50\u3f50\u3f56", "\u045d\u0456\u045c\u045d\u0453\u0453\u0457", "\u7d5a\u7d56\u7d58\u7d59\u7d58\u7d58\u7d57\u7d5d", "\u6e6f\u6e64\u6e68\u6e68\u6e6e\u6e69\u6e6d\u6e6b"}, d2={"\u03c7\u03c7\u03da\u23a3\u0391\u0393\u0385\u03e1\u03c7\u03cc\u03db\u03cc\u0382\u03c1\u03cc\u03c3\u03ca\u0382\u03fe\u03d9\u03df\u03c4\u03c3\u03ca\u0396\u0384\u03e1\u03c7\u03cc\u03db\u03cc\u0382\u03c1\u03cc\u03c3\u03ca\u0382\u03fe\u03d9\u03df\u03c4\u03c3\u03ca\u0396", "\u03c2\u039d\u0392\u0397\u0390\u0397\u038a\u03c0\u03c2\u03c0\u03d6\u03d7\u03a8", "\u053a\u056f\u0568\u056f\u0572\u0538\u053a\u0538\u052e\u052f\u0550", "\u0110\u0112\u0103\u0134\u011b\u0116\u0104\u0104\u014b\u0149\u015f\u015e\u013b\u011d\u0116\u0101\u0116\u0158\u011b\u0116\u0119\u0110\u0158\u0134\u011b\u0116\u0104\u0104\u014c", "\u0380\u0389\u039b\u0380\u03ab\u0387\u038c\u038d\u03d4\u03d6\u03c0\u03c1\u03a1", "\u02e7\u02f3\u02f7\u02e3\u02ee\u02f1\u02be\u02bc\u02aa\u02ce\u02e8\u02e3\u02f4\u02e3\u02ad\u02ee\u02e3\u02ec\u02e5\u02ad\u02cd\u02e0\u02e8\u02e7\u02e1\u02f6\u02b9\u02ab\u02d8", "\u0739\u0736\u0735\u0734\u073f\u0766\u0764\u0772\u0773\u0716\u0730\u073b\u072c\u073b\u0775\u0736\u073b\u0734\u073d\u0775\u0715\u0738\u0730\u073f\u0739\u072e\u0761", "\u040c\u0417\u042b\u040c\u040a\u0411\u0416\u041f\u0444\u0446\u0450\u0451\u0434\u0412\u0419\u040e\u0419\u0457\u0414\u0419\u0416\u041f\u0457\u042b\u040c\u040a\u0411\u0416\u041f\u0443", "\u045c\u045d\u0446\u045b\u0454\u044b\u040e\u040c\u041a\u041b\u0464", "\u048d\u048c\u0497\u048a\u0485\u049a\u04a2\u048f\u048f\u04df\u04dd\u04cb\u04ca\u04b5", "\u04ca\u04dc\u04d4\u04c9\u0481\u0483\u0495\u0494\u04eb", "\u06ee\u06f8\u06f0\u06ed\u06a5\u06a7\u06b1\u06d3\u06b0\u06cf", "\u0752\u0744\u074c\u0751\u0715\u0719\u071b\u070d\u076f\u070c\u0773", "\u07d8\u07ce\u07c6\u07db\u0793\u0791\u0787\u07e5\u07e6\u0786\u07f9", "\u06fe\u06f1\u06f6\u06f9\u06f4\u06f1\u06e2\u06fd\u06a4\u06a6\u06b0\u06b1\u06ce"})
public final class Class3936 {
    public static float field8962;
    public static double field8963;
    public static double field8964;
    public static double field8965;
    public static int field8966 = 1060798846;
    public static double field8967;
    public static int field8968 = -378634377;

    static {
        field8963 = Double.longBitsToDouble(4593236306546230544L);
        field8965 = Double.longBitsToDouble(4601460162646842700L);
        field8962 = Float.intBitsToFloat(1132396544);
        field8964 = Double.longBitsToDouble(4602767123527621744L);
        field8967 = Double.longBitsToDouble(4605176807902419873L);
        J\u200e = "WHITELIST";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite zGla6UAA1LwioJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3936.oyBaam2ctGarP0FB(k2, -433874669));
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
                int a2 = Integer.parseInt(Class3936.oyBaam2ctGarP0FB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3936.oyBaam2ctGarP0FB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3936.oyBaam2ctGarP0FB(k2, -433874669) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String oyBaam2ctGarP0FB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

