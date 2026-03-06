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

@HACHIMI_CLIENT(mv=100, d1={"\u030b\u030c\u0308\u030f\u030e\u030f\u030c\u030d", "\u4a85\u4a87\u4a8a\u4a80\u4a8a\u4a84\u4a83", "\u9aad\u9aa9\u9aab\u9aa2\u9aac\u9aa2\u9aac\u9aa8", "\ub167\ub166\ub164\ub166\ub163\ub161\ub164\ub161", "\u589e\u589a\u589e\u5898\u5892\u589e\u589b\u589f", "\u34b9\u34b9\u34ba\u34bb\u34b2\u34bb\u34b2\u34b3", "\u3ee1\u3ee1\u3ee7\u3ee6\u3ee4\u3ee4\u3ee5\u3ee1", "\ue0aa\ue0a0\ue0a8\ue0a1\ue0af\ue0ad\ue0ad\ue0af", "\u48ea\u48ed\u48e4\u48ef\u48e4\u48e4\u48ed\u48e4", "\u4c21\u4c27\u4c27\u4c20\u4c24\u4c2b\u4c27\u4c26", "\u9b4f\u9b4a\u9b47\u9b4c\u9b47\u9b4e\u9b4b\u9b48", "\uad2e\uad2f\uad2b\uad2d\uad29\uad2e\uad2a\uad2f", "\u4aff\u4afc\u4afc\u4afb\u4afc\u4af5\u4af5\u4af9", "\ud332\ud335\ud334\ud335\ud334\ud33e\ud332\ud331", "\u4fff\u4ffc\u4fff\u4fff\u4fff\u4ffa\u4fff\u4ffc", "\ua632\ua637\ua630\ua638\ua631\ua633\ua637\ua634", "\u0440\u0444\u0449\u0445\u0442\u0443\u0448\u0448"}, d2={"\u0211\u0216\u0217\u2271\u0243\u0241\u0257\u0233\u0215\u021e\u0209\u021e\u0250\u0213\u021e\u0211\u0218\u0250\u022c\u020b\u020d\u0216\u0211\u0218\u0244\u0256\u0233\u0215\u021e\u0209\u021e\u0250\u0213\u021e\u0211\u0218\u0250\u022c\u020b\u020d\u0216\u0211\u0218\u0244", "\u04b7\u04b0\u04b0\u24d7\u04e5\u04e7\u04f1\u0495\u04b3\u04b8\u04af\u04b8\u04f6\u04b5\u04b8\u04b7\u04be\u04f6\u048a\u04ad\u04ab\u04b0\u04b7\u04be\u04e2\u04f0\u0495\u04b3\u04b8\u04af\u04b8\u04f6\u04b5\u04b8\u04b7\u04be\u04f6\u048a\u04ad\u04ab\u04b0\u04b7\u04be\u04e2", "\u01b2\u01b5\u01b6\u21d2\u01e0\u01e2\u01f4\u0190\u01b6\u01bd\u01aa\u01bd\u01f3\u01b0\u01bd\u01b2\u01bb\u01f3\u018f\u01a8\u01ae\u01b5\u01b2\u01bb\u01e7\u01f5\u0190\u01b6\u01bd\u01aa\u01bd\u01f3\u01b0\u01bd\u01b2\u01bb\u01f3\u018f\u01a8\u01ae\u01b5\u01b2\u01bb\u01e7", "\u01fd\u01a2\u01ad\u01a8\u01af\u01a8\u01b5\u01ff\u01fd\u01ff\u01e9\u01e8\u0197", "\u06e0\u06b5\u06b2\u06b5\u06a8\u06e2\u06e0\u06e2\u06f4\u06f5\u068a", "\u00a9\u00ab\u00ba\u008d\u00a2\u00af\u00bd\u00bd\u00f2\u00f0\u00e6\u00e7\u0082\u00a4\u00af\u00b8\u00af\u00e1\u00a2\u00af\u00a0\u00a9\u00e1\u008d\u00a2\u00af\u00bd\u00bd\u00f5", "\u07c4\u07cd\u07df\u07c4\u07ef\u07c3\u07c8\u07c9\u0790\u0792\u0784\u0785\u07e5", "\u03ca\u03de\u03da\u03ce\u03c3\u03dc\u0393\u0391\u0387\u03e3\u03c5\u03ce\u03d9\u03ce\u0380\u03c3\u03ce\u03c1\u03c8\u0380\u03e0\u03cd\u03c5\u03ca\u03cc\u03db\u0394\u0386\u03f5", "\u041e\u0411\u0412\u0413\u0418\u0441\u0443\u0455\u0454\u0431\u0417\u041c\u040b\u041c\u0452\u0411\u041c\u0413\u041a\u0452\u0432\u041f\u0417\u0418\u041e\u0409\u0446", "\u044d\u0456\u046a\u044d\u044b\u0450\u0457\u045e\u0405\u0407\u0411\u0410\u0475\u0453\u0458\u044f\u0458\u0416\u0455\u0458\u0457\u045e\u0416\u046a\u044d\u044b\u0450\u0457\u045e\u0402", "\u057e\u057f\u0564\u0579\u0576\u0569\u052c\u052e\u0538\u0539\u0546", "! ;&)6\u000e##sqgf\u0019", "\u0294\u0282\u028a\u0297\u02df\u02dd\u02cb\u02ca\u02b5", "\u06e7\u06f1\u06f9\u06e4\u06ac\u06ae\u06b8\u06da\u06b9\u06c6", "\u00f3\u00e5\u00ed\u00f0\u00b4\u00b8\u00ba\u00ac\u00ce\u00ad\u00d2", "\u051c\u050a\u0502\u051f\u0557\u0555\u0543\u0521\u0522\u0542\u053d", "\u05e5\u05ea\u05ed\u05e2\u05ef\u05ea\u05f9\u05e6\u05bf\u05bd\u05ab\u05aa\u05d5"})
public final class Class3631 {
    public static String field8112;
    public static double field8113;
    public static double field8114;
    public static float field8115 = 0.0445289f;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite IjJWlG6lCcYtYe(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3631.lAagLnjBXY2QLVYT(k2, -943228897));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 16774 : 16775;
        while (true) {
            int n4 = n3;
            if (n4 == 16774) throw new Exception("Outdated metadata version");
            if (n4 != 16775) break;
            n3 = 16773;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3631.lAagLnjBXY2QLVYT(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3631.lAagLnjBXY2QLVYT(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class3631.lAagLnjBXY2QLVYT(k2, -943228897) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String lAagLnjBXY2QLVYT(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8113 = Double.longBitsToDouble(4588662864688311056L);
        field8112 = "value";
        field8114 = Double.longBitsToDouble(4599023996914471414L);
        br\u200e = "Throw out the Strength potion";
        bH\u200e = "uLocation";
    }
}

