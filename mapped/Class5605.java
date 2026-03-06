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

@HACHIMI_CLIENT(mv=100, d1={"\u5eb6\u5eb9\u5eb3\u5eb4\u5eb8\u5eb5\u5eb4\u5eb0", "\u407b\u407c\u407a\u4078\u407a\u4079\u407f\u407c", "\u5f24\u5f29\u5f29\u5f27\u5f27\u5f27\u5f24\u5f22", "\u9f84\u9f86\u9f88\u9f89\u9f88\u9f89\u9f85\u9f83", "\uc2a3\uc2a6\uc2a6\uc2a3\uc2a3\uc2a6\uc2a3\uc2a2", "\u554e\u5548\u5549\u5548\u5545\u554e\u554d\u554d", "\uba9d\uba98\uba9a\uba97\uba98\uba98\uba99\uba9a", "\u2734\u2734\u2731\u2735\u2737\u2733\u2730", "\u9cf1\u9cf6\u9cfb\u9cf1\u9cfb\u9cf0\u9cf2\u9cf1", "\u37f9\u37f9\u37f0\u37fe\u37fe\u37f9\u37fa\u37fb", "\u81f1\u81f5\u81f3\u81fb\u81f4\u81f5\u81fa\u81f4", "\u88bc\u88bb\u88b0\u88be\u88b0\u88b1\u88b8\u88bc", "\uda75\uda76\uda79\uda73\uda72\uda78\uda70\uda77", "\u78de\u78d9\u78de\u78db\u78db\u78dd\u78dc\u78d9", "\u5beb\u5be0\u5be5\u5be2\u5be7\u5beb\u5be4", "\ud191\ud190\ud19d\ud190\ud196\ud195\ud195\ud197", "\u9bbe\u9bbf\u9bb8\u9bbc\u9bb9\u9bbc\u9bbc\u9bb9"}, d2={"\u0221\u0206\u0221\u225b\u0269\u026b\u027d\u0219\u023f\u0234\u0223\u0234\u027a\u0239\u0234\u023b\u0232\u027a\u0206\u0221\u0227\u023c\u023b\u0232\u026e\u027c\u0219\u023f\u0234\u0223\u0234\u027a\u0239\u0234\u023b\u0232\u027a\u0206\u0221\u0227\u023c\u023b\u0232\u026e", "\u0247\u0260\u0246\u223d\u020f\u020d\u021b\u027f\u0259\u0252\u0245\u0252\u021c\u025f\u0252\u025d\u0254\u021c\u0260\u0247\u0241\u025a\u025d\u0254\u0208\u021a\u027f\u0259\u0252\u0245\u0252\u021c\u025f\u0252\u025d\u0254\u021c\u0260\u0247\u0241\u025a\u025d\u0254\u0208", "\u0196\u01b1\u0194\u21ec\u01de\u01dc\u01ca\u01ae\u0188\u0183\u0194\u0183\u01cd\u018e\u0183\u018c\u0185\u01cd\u01b1\u0196\u0190\u018b\u018c\u0185\u01d9\u01cb\u01ae\u0188\u0183\u0194\u0183\u01cd\u018e\u0183\u018c\u0185\u01cd\u01b1\u0196\u0190\u018b\u018c\u0185\u01d9", "\u05d0\u058f\u0580\u0585\u0582\u0585\u0598\u05d2\u05d0\u05d2\u05c4\u05c5\u05ba", "\u0729\u077c\u077b\u077c\u0761\u072b\u0729\u072b\u073d\u073c\u0743", "\u0244\u0246\u0257\u0260\u024f\u0242\u0250\u0250\u021f\u021d\u020b\u020a\u026f\u0249\u0242\u0255\u0242\u020c\u024f\u0242\u024d\u0244\u020c\u0260\u024f\u0242\u0250\u0250\u0218", "\u065d\u0654\u0646\u065d\u0676\u065a\u0651\u0650\u0609\u060b\u061d\u061c\u067c", "\u0479\u046d\u0469\u047d\u0470\u046f\u0420\u0422\u0434\u0450\u0476\u047d\u046a\u047d\u0433\u0470\u047d\u0472\u047b\u0433\u0453\u047e\u0476\u0479\u047f\u0468\u0427\u0435\u0446", "\u0654\u065b\u0658\u0659\u0652\u060b\u0609\u061f\u061e\u067b\u065d\u0656\u0641\u0656\u0618\u065b\u0656\u0659\u0650\u0618\u0678\u0655\u065d\u0652\u0654\u0643\u060c", "\u049e\u0485\u04b9\u049e\u0498\u0483\u0484\u048d\u04d6\u04d4\u04c2\u04c3\u04a6\u0480\u048b\u049c\u048b\u04c5\u0486\u048b\u0484\u048d\u04c5\u04b9\u049e\u0498\u0483\u0484\u048d\u04d1", "\u0322\u0323\u0338\u0325\u032a\u0335\u0370\u0372\u0364\u0365\u031a", "\u0757\u0756\u074d\u0750\u075f\u0740\u0778\u0755\u0755\u0705\u0707\u0711\u0710\u076f", "\u0506\u0510\u0518\u0505\u054d\u054f\u0559\u0558\u0527", "\u02f4\u02e2\u02ea\u02f7\u02bf\u02bd\u02ab\u02c9\u02aa\u02d5", "\u036a\u037c\u0374\u0369\u032d\u0321\u0323\u0335\u0357\u0334\u034b", "aw\u007fb*(>\\_?@", "\u0373\u037c\u037b\u0374\u0379\u037c\u036f\u0370\u0329\u032b\u033d\u033c\u0343"})
public final class Class5605 {
    public static float field10686 = 0.20671207f;
    public static float field10687;
    public static int field10688 = 951958027;
    public static double field10689;
    public static int field10690 = 1176288366;
    public static double field10691 = 0.08077913742148124;

    static {
        ad\u200e = "Strict";
        aA\u200e = "OpenInventory";
        field10689 = Double.longBitsToDouble(4595323078571781404L);
        field10687 = Float.intBitsToFloat(1050764412);
        bI\u200e = "Items to steal";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite lbK1z9fINvJtbO(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5605.xu10tTjUWWYeRnE1(k2, 179017489));
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
                int a2 = Integer.parseInt(Class5605.xu10tTjUWWYeRnE1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5605.xu10tTjUWWYeRnE1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5605.xu10tTjUWWYeRnE1(k2, 179017489) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String xu10tTjUWWYeRnE1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

