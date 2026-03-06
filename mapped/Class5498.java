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
@HACHIMI_CLIENT(mv=100, d1={"\ud75b\ud752\ud75a\ud75e\ud75b\ud759\ud75c\ud75a", "\u5483\u548f\u5485\u5482\u5486\u5482\u5483\u548e", "\ude30\ude35\ude3e\ude32\ude34\ude35\ude3e\ude33", "\uaef8\uaefa\uaefd\uaef9\uaefd\uaefa\uaef4\uaef5", "\ub191\ub19b\ub190\ub190\ub196\ub193\ub196\ub193", "\u5c74\u5c72\u5c73\u5c73\u5c74\u5c74\u5c71\u5c73", "\u7d53\u7d5c\u7d57\u7d50\u7d54\u7d52\u7d53", "\u3edf\u3edd\u3ed2\u3ede\u3edf\u3ed3\u3edf\u3ed9", "\u23a9\u23a7\u23a8\u23a6\u23a8\u23ab\u23aa\u23ab", "\u9a95\u9a92\u9a95\u9a91\u9a92\u9a96\u9a91\u9a96", "\u29a8\u29a4\u29a5\u29aa\u29aa\u29a9\u29ac\u29aa", "\ucb78\ucb78\ucb72\ucb7a\ucb78\ucb72\ucb7b\ucb7c", "\u4d29\u4d2a\u4d2b\u4d2b\u4d2a\u4d29\u4d29", "\u4dd7\u4dd4\u4dd6\u4dd0\u4dd2\u4dd6\u4dd3\u4dd5"}, d2={"\u0780\u07df\u07d0\u07d5\u07d2\u07d5\u07c8\u0782\u0780\u0782\u0794\u0795\u07ea", "\u03e4\u03b1\u03b6\u03b1\u03ac\u03e6\u03e4\u03e6\u03f0\u03f1\u038e", "\u0764\u0766\u0777\u0740\u076f\u0762\u0770\u0770\u073f\u073d\u072b\u072a\u074f\u0769\u0762\u0775\u0762\u072c\u076f\u0762\u076d\u0764\u072c\u0740\u076f\u0762\u0770\u0770\u0738", "\u022d\u0224\u0236\u022d\u0206\u022a\u0221\u0220\u0279\u027b\u026d\u026c\u020c", "\u05d3\u05c7\u05c3\u05d7\u05da\u05c5\u058a\u0588\u059e\u05fa\u05dc\u05d7\u05c0\u05d7\u0599\u05da\u05d7\u05d8\u05d1\u0599\u05f9\u05d4\u05dc\u05d3\u05d5\u05c2\u058d\u059f\u05ec", "\u0639\u0636\u0635\u0634\u063f\u0666\u0664\u0672\u0673\u0616\u0630\u063b\u062c\u063b\u0675\u0636\u063b\u0634\u063d\u0675\u0615\u0638\u0630\u063f\u0639\u062e\u0661", "\u00bb\u00a0\u009c\u00bb\u00bd\u00a6\u00a1\u00a8\u00f3\u00f1\u00e7\u00e6\u0083\u00a5\u00ae\u00b9\u00ae\u00e0\u00a3\u00ae\u00a1\u00a8\u00e0\u009c\u00bb\u00bd\u00a6\u00a1\u00a8\u00f4", "\u04b0\u04b1\u04aa\u04b7\u04b8\u04a7\u04e2\u04e0\u04f6\u04f7\u0488", "\u0796\u0797\u078c\u0791\u079e\u0781\u07b9\u0794\u0794\u07c4\u07c6\u07d0\u07d1\u07ae", "\u0423\u0435\u043d\u0420\u0468\u046a\u047c\u047d\u0402", "\u061a\u060c\u0604\u0619\u0651\u0653\u0645\u0627\u0644\u063b", "\u03ac\u03ba\u03b2\u03af\u03eb\u03e7\u03e5\u03f3\u0391\u03f2\u038d", "\u07e2\u07f4\u07fc\u07e1\u07a9\u07ab\u07bd\u07df\u07dc\u07bc\u07c3", "\u03be\u03b1\u03b6\u03b9\u03b4\u03b1\u03a2\u03bd\u03e4\u03e6\u03f0\u03f1\u038e"})
public final class Class5498 {
    public static double field10329;
    public static float field10330;
    public static double field10331 = 0.09473265040960133;
    public static double field10332;
    public static int field10333 = 162955043;
    public static float field10334;
    public static double field10335;
    public static int field10336 = 971455921;

    private static String 1BO0VI5sqy4wqwjq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite nSqjRrddZpHOAg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5498.1BO0VI5sqy4wqwjq(k2, 1805901788));
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
                int a2 = Integer.parseInt(Class5498.1BO0VI5sqy4wqwjq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5498.1BO0VI5sqy4wqwjq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5498.1BO0VI5sqy4wqwjq(k2, 1805901788) + " " + l2 + " " + m2);
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
        field10332 = Double.longBitsToDouble(4594265640848836572L);
        field10334 = Float.intBitsToFloat(1020131072);
        field10330 = Float.intBitsToFloat(1035481304);
        field10335 = Double.longBitsToDouble(4603853819274280770L);
        field10329 = Double.longBitsToDouble(4589281720861074840L);
    }
}

