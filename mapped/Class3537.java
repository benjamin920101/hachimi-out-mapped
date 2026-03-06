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

@HACHIMI_CLIENT(mv=100, d1={"\ue44f\ue44b\ue449\ue44d\ue44c\ue44e\ue44a", "\u87ef\u87e4\u87ed\u87e9\u87ed\u87ee\u87ea\u87ec", "\u64ac\u64a6\u64ae\u64aa\u64ab\u64a8\u64af\u64a7", "\ua3dd\ua3dc\ua3d2\ua3dc\ua3dc\ua3d2\ua3d5", "\u916f\u916f\u916c\u916b\u916f\u9162\u916d\u916a", "\u480c\u4800\u480d\u480c\u480f\u480a\u480e\u480c", "\ubb54\ubb56\ubb53\ubb54\ubb53\ubb52\ubb56\ubb53", "\uc8d6\uc8d3\uc8d4\uc8d2\uc8da\uc8d7\uc8db", "\ud6b9\ud6b7\ud6bb\ud6b7\ud6ba\ud6b6\ud6bd\ud6bf", "\u3393\u3396\u3393\u339d\u3394\u3390", "\uc32d\uc32a\uc320\uc32e\uc32f\uc329\uc32f", "\ub16e\ub168\ub16d\ub16d\ub168\ub16e\ub16b\ub169", "\u166c\u166f\u1663\u1669\u166f\u1669\u1668\u166b", "\ub9dc\ub9d9\ub9de\ub9d9\ub9dc\ub9df\ub9da\ub9da"}, d2={"\u03bb\u03e4\u03eb\u03ee\u03e9\u03ee\u03f3\u03b9\u03bb\u03b9\u03af\u03ae\u03d1", "\u029d\u02c8\u02cf\u02c8\u02d5\u029f\u029d\u029f\u0289\u0288\u02f7", "\u0089\u008b\u009a\u00ad\u0082\u008f\u009d\u009d\u00d2\u00d0\u00c6\u00c7\u00a2\u0084\u008f\u0098\u008f\u00c1\u0082\u008f\u0080\u0089\u00c1\u00ad\u0082\u008f\u009d\u009d\u00d5", "\u05b4\u05bd\u05af\u05b4\u059f\u05b3\u05b8\u05b9\u05e0\u05e2\u05f4\u05f5\u0595", "\u0661\u0675\u0671\u0665\u0668\u0677\u0638\u063a\u062c\u0648\u066e\u0665\u0672\u0665\u062b\u0668\u0665\u066a\u0663\u062b\u064b\u0666\u066e\u0661\u0667\u0670\u063f\u062d\u065e", "\u057b\u0574\u0577\u0576\u057d\u0524\u0526\u0530\u0531\u0554\u0572\u0579\u056e\u0579\u0537\u0574\u0579\u0576\u057f\u0537\u0557\u057a\u0572\u057d\u057b\u056c\u0523", "\u05d9\u05c2\u05fe\u05d9\u05df\u05c4\u05c3\u05ca\u0591\u0593\u0585\u0584\u05e1\u05c7\u05cc\u05db\u05cc\u0582\u05c1\u05cc\u05c3\u05ca\u0582\u05fe\u05d9\u05df\u05c4\u05c3\u05ca\u0596", "\u061a\u061b\u0600\u061d\u0612\u060d\u0648\u064a\u065c\u065d\u0622", "\u06bc\u06bd\u06a6\u06bb\u06b4\u06ab\u0693\u06be\u06be\u06ee\u06ec\u06fa\u06fb\u0684", "\u02ea\u02fc\u02f4\u02e9\u02a1\u02a3\u02b5\u02b4\u02cb", "\u016e\u0178\u0170\u016d\u0125\u0127\u0131\u0153\u0130\u014f", "\u0171\u0167\u016f\u0172\u0136\u013a\u0138\u012e\u014c\u012f\u0150", "\u05bf\u05a9\u05a1\u05bc\u05f4\u05f6\u05e0\u0582\u0581\u05e1\u059e", "\u072f\u0720\u0727\u0728\u0725\u0720\u0733\u072c\u0775\u0777\u0761\u0760\u071f"})
public final class Class3537 {
    public static double field7828 = Double.longBitsToDouble(4597092670382047624L);
    public static double field7829 = Double.longBitsToDouble(4606541377112303196L);
    public static double field7830 = 0.40940394222653964;
    public static float field7831 = Float.intBitsToFloat(1057138087);
    public static double field7832 = 0.34134691022597874;

    private static String oVd4Bwag0ELxGtmm(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Y2neVnWWg8oFv2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3537.oVd4Bwag0ELxGtmm(k2, -423384701));
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
                int a2 = Integer.parseInt(Class3537.oVd4Bwag0ELxGtmm(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3537.oVd4Bwag0ELxGtmm(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3537.oVd4Bwag0ELxGtmm(k2, -423384701) + " " + l2 + " " + m2);
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

