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

@HACHIMI_CLIENT(mv=100, d1={"\u045f\u0456\u0456\u0456\u045e\u0459\u045e\u045d", "\uc279\uc275\uc27c\uc27b\uc27c\uc27b\uc27e\uc27b", "\u769a\u7690\u7690\u769d\u769d\u7691\u769e\u769c", "\u3fd0\u3fd0\u3fd0\u3fd0\u3fd6\u3fd0\u3fd2\u3fd7", "\u4903\u4902\u4901\u490a\u4903\u4904\u4907\u4904", "\u1a34\u1a31\u1a36\u1a39\u1a36\u1a35\u1a35\u1a36", "\ub6ec\ub6e8\ub6e8\ub6ee\ub6e1\ub6e9\ub6e9\ub6ea", "\u7ec2\u7ec3\u7ec0\u7ec1\u7ec5\u7ec4\u7ec6\u7ec0", "\u4e6e\u4e68\u4e68\u4e6f\u4e64\u4e68\u4e6f\u4e6c", "\ucd73\ucd7e\ucd74\ucd77\ucd71\ucd76\ucd7e\ucd77", "\u1e0a\u1e0b\u1e01\u1e0a\u1e0a\u1e0e\u1e0b", "\u42e9\u42eb\u42ee\u42ed\u42ed\u42ee\u42ee\u42ed", "\u2363\u236c\u2365\u236c\u2360\u2364\u2363\u2360", "\ue363\ue362\ue364\ue364\ue36c\ue366\ue362\ue36c", "\u4717\u4710\u4717\u4714\u4715\u471d\u4717\u4711", "\u6a72\u6a77\u6a71\u6a74\u6a78\u6a70\u6a79\u6a77", "\uae4d\uae48\uae4a\uae4c\uae4e\uae4b\uae43\uae4c"}, d2={"\u06ea\u06fa\u06eb\u2696\u06a4\u06a6\u06b0\u06d4\u06f2\u06f9\u06ee\u06f9\u06b7\u06f4\u06f9\u06f6\u06ff\u06b7\u06cb\u06ec\u06ea\u06f1\u06f6\u06ff\u06a3\u06b1\u06d4\u06f2\u06f9\u06ee\u06f9\u06b7\u06f4\u06f9\u06f6\u06ff\u06b7\u06cb\u06ec\u06ea\u06f1\u06f6\u06ff\u06a3", "\u05f4\u05e4\u05f2\u2588\u05ba\u05b8\u05ae\u05ca\u05ec\u05e7\u05f0\u05e7\u05a9\u05ea\u05e7\u05e8\u05e1\u05a9\u05d5\u05f2\u05f4\u05ef\u05e8\u05e1\u05bd\u05af\u05ca\u05ec\u05e7\u05f0\u05e7\u05a9\u05ea\u05e7\u05e8\u05e1\u05a9\u05d5\u05f2\u05f4\u05ef\u05e8\u05e1\u05bd", "\u036a\u037a\u036d\u2316\u0324\u0326\u0330\u0354\u0372\u0379\u036e\u0379\u0337\u0374\u0379\u0376\u037f\u0337\u034b\u036c\u036a\u0371\u0376\u037f\u0323\u0331\u0354\u0372\u0379\u036e\u0379\u0337\u0374\u0379\u0376\u037f\u0337\u034b\u036c\u036a\u0371\u0376\u037f\u0323", "\u075d\u0702\u070d\u0708\u070f\u0708\u0715\u075f\u075d\u075f\u0749\u0748\u0737", "\u0514\u0541\u0546\u0541\u055c\u0516\u0514\u0516\u0500\u0501\u057e", "\u0678\u067a\u066b\u065c\u0673\u067e\u066c\u066c\u0623\u0621\u0637\u0636\u0653\u0675\u067e\u0669\u067e\u0630\u0673\u067e\u0671\u0678\u0630\u065c\u0673\u067e\u066c\u066c\u0624", "\u05f7\u05fe\u05ec\u05f7\u05dc\u05f0\u05fb\u05fa\u05a3\u05a1\u05b7\u05b6\u05d6", "\u0433\u0427\u0423\u0437\u043a\u0425\u046a\u0468\u047e\u041a\u043c\u0437\u0420\u0437\u0479\u043a\u0437\u0438\u0431\u0479\u0419\u0434\u043c\u0433\u0435\u0422\u046d\u047f\u040c", "\u077b\u0774\u0777\u0776\u077d\u0724\u0726\u0730\u0731\u0754\u0772\u0779\u076e\u0779\u0737\u0774\u0779\u0776\u077f\u0737\u0757\u077a\u0772\u077d\u077b\u076c\u0723", "\u0744\u075f\u0763\u0744\u0742\u0759\u075e\u0757\u070c\u070e\u0718\u0719\u077c\u075a\u0751\u0746\u0751\u071f\u075c\u0751\u075e\u0757\u071f\u0763\u0744\u0742\u0759\u075e\u0757\u070b", "\u0761\u0760\u077b\u0766\u0769\u0776\u0733\u0731\u0727\u0726\u0759", "\u036c\u036d\u0376\u036b\u0364\u037b\u0343\u036e\u036e\u033e\u033c\u032a\u032b\u0354", "\u00bd\u00ab\u00a3\u00be\u00f6\u00f4\u00e2\u00e3\u009c", "\u0679\u066f\u0667\u067a\u0632\u0630\u0626\u0644\u0627\u0658", "\u0137\u0121\u0129\u0134\u0170\u017c\u017e\u0168\u010a\u0169\u0116", "\u02b6\u02a0\u02a8\u02b5\u02fd\u02ff\u02e9\u028b\u0288\u02e8\u0297", "\u04b4\u04bb\u04bc\u04b3\u04be\u04bb\u04a8\u04b7\u04ee\u04ec\u04fa\u04fb\u0484"})
public final class Class3378 {
    public static float field7338;
    public static double field7339;
    public static float field7340;

    static {
        p\u200e = "Leaves the game without disconnecting from the server";
        field7338 = Float.intBitsToFloat(1060391511);
        field7339 = Double.longBitsToDouble(4604732521879139634L);
        ba\u200e = "time";
        br\u200e = "AssumeBestArmor";
        field7340 = Float.intBitsToFloat(1038786696);
    }

    private static String NJ4rgyDYORyYO99v(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite s9FwGeT49FNvlo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3378.NJ4rgyDYORyYO99v(k2, 2101868443));
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
                int a2 = Integer.parseInt(Class3378.NJ4rgyDYORyYO99v(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3378.NJ4rgyDYORyYO99v(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3378.NJ4rgyDYORyYO99v(k2, 2101868443) + " " + l2 + " " + m2);
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

