/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u9c3e\u9c38\u9c33\u9c32\u9c3a\u9c3f\u9c3e\u9c39", "\u1bd7\u1bd5\u1bd2\u1bdd\u1bd5\u1bd0\u1bd2\u1bd0", "\ue6bf\ue6be\ue6bf\ue6b5\ue6bb\ue6bf\ue6b8\ue6bc", "\u68cb\u68c9\u68c0\u68c0\u68c1\u68c0\u68ce\u68cf", "\u98b5\u98b4\u98b3\u98b7\u98b3\u98b5\u98b5\u98bb", "\uaa20\uaa25\uaa26\uaa21\uaa22\uaa2d\uaa2c\uaa20", "\ud0a1\ud0aa\ud0aa\ud0a6\ud0a2\ud0a3\ud0a3\ud0aa", "\ud790\ud79f\ud791\ud79f\ud790\ud792\ud793\ud795", "\u3306\u3304\u330a\u3305\u3301\u3303\u3305\u330b", "\u4a72\u4a74\u4a79\u4a77\u4a73\u4a73\u4a79\u4a71", "\ua6bb\ua6bc\ua6b6\ua6bd\ua6b8\ua6bb\ua6ba", "\ud378\ud376\ud37c\ud37a\ud378\ud376\ud37b\ud377", "\u2980\u2980\u2982\u2983\u298c\u2980\u2986\u2982", "\u8126\u812b\u8121\u8124\u812a\u8124\u812b\u812a", "\u55bb\u55be\u55be\u55b8\u55bc\u55b0\u55b9\u55bb", "\u4e4c\u4e4b\u4e4d\u4e49\u4e4d\u4e44\u4e4f\u4e4b", "\u5fd9\u5fd9\u5fd8\u5fdd\u5fd7\u5fdc\u5fd6\u5fd6", "\u8490\u849c\u8499\u849a\u849c\u849b\u849d", "\uab97\uab9a\uab9a\uab9a\uab94\uab90\uab97\uab96"}, d2={"\u05e3\u05fe\u05db\u259d\u05af\u05ad\u05bb\u05df\u05f9\u05f2\u05e5\u05f2\u05bc\u05ff\u05f2\u05fd\u05f4\u05bc\u05c0\u05e7\u05e1\u05fa\u05fd\u05f4\u05a8\u05ba\u05df\u05f9\u05f2\u05e5\u05f2\u05bc\u05ff\u05f2\u05fd\u05f4\u05bc\u05c0\u05e7\u05e1\u05fa\u05fd\u05f4\u05a8", "\u061e\u0603\u0627\u2660\u0652\u0650\u0646\u0622\u0604\u060f\u0618\u060f\u0641\u0602\u060f\u0600\u0609\u0641\u063d\u061a\u061c\u0607\u0600\u0609\u0655\u0647\u0622\u0604\u060f\u0618\u060f\u0641\u0602\u060f\u0600\u0609\u0641\u063d\u061a\u061c\u0607\u0600\u0609\u0655", "\u01bc\u01a1\u0186\u21c2\u01f0\u01f2\u01e4\u0180\u01a6\u01ad\u01ba\u01ad\u01e3\u01a0\u01ad\u01a2\u01ab\u01e3\u019f\u01b8\u01be\u01a5\u01a2\u01ab\u01f7\u01e5\u0180\u01a6\u01ad\u01ba\u01ad\u01e3\u01a0\u01ad\u01a2\u01ab\u01e3\u019f\u01b8\u01be\u01a5\u01a2\u01ab\u01f7", "\u05ba\u05a7\u0581\u25c4\u05f6\u05f4\u05e2\u0586\u05a0\u05ab\u05bc\u05ab\u05e5\u05a6\u05ab\u05a4\u05ad\u05e5\u0599\u05be\u05b8\u05a3\u05a4\u05ad\u05f1\u05e3\u0586\u05a0\u05ab\u05bc\u05ab\u05e5\u05a6\u05ab\u05a4\u05ad\u05e5\u0599\u05be\u05b8\u05a3\u05a4\u05ad\u05f1", "\u01d4\u01c9\u01e8\u21aa\u0198\u019a\u018c\u01e8\u01ce\u01c5\u01d2\u01c5\u018b\u01c8\u01c5\u01ca\u01c3\u018b\u01f7\u01d0\u01d6\u01cd\u01ca\u01c3\u019f\u018d\u01e8\u01ce\u01c5\u01d2\u01c5\u018b\u01c8\u01c5\u01ca\u01c3\u018b\u01f7\u01d0\u01d6\u01cd\u01ca\u01c3\u019f", "\u06cd\u0692\u069d\u0698\u069f\u0698\u0685\u06cf\u06cd\u06cf\u06d9\u06d8\u06a7", "\u0396\u03c3\u03c4\u03c3\u03de\u0394\u0396\u0394\u0382\u0383\u03fc", "\u0578\u057a\u056b\u055c\u0573\u057e\u056c\u056c\u0523\u0521\u0537\u0536\u0553\u0575\u057e\u0569\u057e\u0530\u0573\u057e\u0571\u0578\u0530\u055c\u0573\u057e\u056c\u056c\u0524", "\u05b4\u05bd\u05af\u05b4\u059f\u05b3\u05b8\u05b9\u05e0\u05e2\u05f4\u05f5\u0595", "\u076f\u077b\u077f\u076b\u0766\u0779\u0736\u0734\u0722\u0746\u0760\u076b\u077c\u076b\u0725\u0766\u076b\u0764\u076d\u0725\u0745\u0768\u0760\u076f\u0769\u077e\u0731\u0723\u0750", "\u078f\u0780\u0783\u0782\u0789\u07d0\u07d2\u07c4\u07c5\u07a0\u0786\u078d\u079a\u078d\u07c3\u0780\u078d\u0782\u078b\u07c3\u07a3\u078e\u0786\u0789\u078f\u0798\u07d7", "\u0336\u032d\u0311\u0336\u0330\u032b\u032c\u0325\u037e\u037c\u036a\u036b\u030e\u0328\u0323\u0334\u0323\u036d\u032e\u0323\u032c\u0325\u036d\u0311\u0336\u0330\u032b\u032c\u0325\u0379", "\u04f1\u04f0\u04eb\u04f6\u04f9\u04e6\u04a3\u04a1\u04b7\u04b6\u04c9", "\u03bc\u03bd\u03a6\u03bb\u03b4\u03ab\u0393\u03be\u03be\u03ee\u03ec\u03fa\u03fb\u0384", "\u04bc\u04aa\u04a2\u04bf\u04f7\u04f5\u04e3\u04e2\u049d", "\u0295\u0283\u028b\u0296\u02de\u02dc\u02ca\u02a8\u02cb\u02b4", "\u05e0\u05f6\u05fe\u05e3\u05a7\u05ab\u05a9\u05bf\u05dd\u05be\u05c1", "\u05d0\u05c6\u05ce\u05d3\u059b\u0599\u058f\u05ed\u05ee\u058e\u05f1", "\u0291\u029e\u0299\u0296\u029b\u029e\u028d\u0292\u02cb\u02c9\u02df\u02de\u02a1"})
public final class Class3883 {
    public static double field8830 = 0.4445863795904992;
    public static int field8831 = 1;
    public static float field8832 = Float.intBitsToFloat(1051418812);
    public static float field8833;
    public static double field8834;
    public static float field8835;
    public static double field8836;

    private static String XNlFGDGNYftB8Yi2(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite 36oTWo6tQ4WGbr(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3883.XNlFGDGNYftB8Yi2(k, 1277835293));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        while (true) {
            block10: {
                block9: {
                    block11: {
                        if (f >= q.length) break block11;
                        v0 = 634;
                        ** GOTO lbl19
                    }
                    v0 = 635;
                    if (true) ** GOTO lbl19
                    do {
                        v0 = var14_15 = 633;
lbl19:
                        // 3 sources

                        if (var14_15 == 634) break block9;
                    } while (var14_15 == 635);
                    break;
                }
                try {
                    a = Integer.parseInt(Class3883.XNlFGDGNYftB8Yi2(q[f], m));
                }
                catch (NumberFormatException b) {
                    break block10;
                }
                if (e % 59557 == m.intValue()) {
                    c = Class3883.XNlFGDGNYftB8Yi2(r[f], l);
                    d = c.split("<>");
                    s = d[0];
                    t = d[1];
                    break;
                }
            }
            ++f;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3883.XNlFGDGNYftB8Yi2(k, 1277835293) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        T\u200e = "Delay";
        X\u200e = "HoneyBlock";
        aa\u200e = "The vertical flight speed";
        field8833 = Float.intBitsToFloat(1062845468);
        au\u200e = "FastLatency";
        field8834 = Double.longBitsToDouble(4605848155130740112L);
        field8836 = Double.longBitsToDouble(4577063793500541696L);
        field8835 = Float.intBitsToFloat(1061046537);
        bL\u200e = "Only attacks an entity when a specified weapon is in your hand";
    }
}

