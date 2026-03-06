/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u243f\u2439\u243a\u2439\u2438\u243a", "\uc353\uc35f\uc354\uc352\uc35f\uc350\uc35e\uc356", "\u46dc\u46df\u46dc\u46db\u46da\u46da\u46d5\u46d8", "\u6fc4\u6fc6\u6fc7\u6fc3\u6fc1\u6fc3\u6fc6\u6fc7", "\u7072\u7071\u7074\u7076\u707d\u7075\u707c", "]\\ZZ\\T]]", "\ue409\ue40e\ue40d\ue40d\ue40b\ue408\ue407\ue40e", "\u831c\u8317\u8313\u8315\u8311\u8311\u8316", "\u8b53\u8b51\u8b50\u8b56\u8b50\u8b5c\u8b54\u8b53", "\ue3b4\ue3b1\ue3b2\ue3b9\ue3b2\ue3b8\ue3b1\ue3b7", "\ub555\ub553\ub55c\ub551\ub557\ub55d\ub553\ub55d", "\u8149\u8148\u814d\u814f\u814c\u814f\u814b\u814b", "\u9e88\u9e8b\u9e8d\u9e8b\u9e81\u9e8d\u9e81\u9e80", "\u95bc\u95b4\u95b4\u95b5\u95b4\u95b5\u95b5\u95bd", "\u8446\u8440\u8443\u8441\u8444\u8444\u8442\u8447", "\u5c5e\u5c58\u5c58\u5c5e\u5c53\u5c5f\u5c5d\u5c5b", "\u823d\u823c\u8230\u823a\u823d\u823f\u823a\u8230", "\ud4df\ud4de\ud4db\ud4d9\ud4dd\ud4df\ud4dc\ud4dd"}, d2={"\u0472\u047e\u046a\u2413\u0421\u0423\u0435\u0451\u0477\u047c\u046b\u047c\u0432\u0471\u047c\u0473\u047a\u0432\u044e\u0469\u046f\u0474\u0473\u047a\u0426\u0434\u0451\u0477\u047c\u046b\u047c\u0432\u0471\u047c\u0473\u047a\u0432\u044e\u0469\u046f\u0474\u0473\u047a\u0426", "\u0454\u0458\u0443\u2435\u0407\u0405\u0413\u0477\u0451\u045a\u044d\u045a\u0414\u0457\u045a\u0455\u045c\u0414\u0468\u044f\u0449\u0452\u0455\u045c\u0400\u0412\u0477\u0451\u045a\u044d\u045a\u0414\u0457\u045a\u0455\u045c\u0414\u0468\u044f\u0449\u0452\u0455\u045c\u0400", "\u0772\u077e\u0764\u2713\u0721\u0723\u0735\u0751\u0777\u077c\u076b\u077c\u0732\u0771\u077c\u0773\u077a\u0732\u074e\u0769\u076f\u0774\u0773\u077a\u0726\u0734\u0751\u0777\u077c\u076b\u077c\u0732\u0771\u077c\u0773\u077a\u0732\u074e\u0769\u076f\u0774\u0773\u077a\u0726", "\u053c\u0530\u0529\u255d\u056f\u056d\u057b\u051f\u0539\u0532\u0525\u0532\u057c\u053f\u0532\u053d\u0534\u057c\u0500\u0527\u0521\u053a\u053d\u0534\u0568\u057a\u051f\u0539\u0532\u0525\u0532\u057c\u053f\u0532\u053d\u0534\u057c\u0500\u0527\u0521\u053a\u053d\u0534\u0568", "0o`ebex202$%Z", "\u07a9\u07fc\u07fb\u07fc\u07e1\u07ab\u07a9\u07ab\u07bd\u07bc\u07c3", "\u0113\u0111\u0100\u0137\u0118\u0115\u0107\u0107\u0148\u014a\u015c\u015d\u0138\u011e\u0115\u0102\u0115\u015b\u0118\u0115\u011a\u0113\u015b\u0137\u0118\u0115\u0107\u0107\u014f", "\u03ff\u03f6\u03e4\u03ff\u03d4\u03f8\u03f3\u03f2\u03ab\u03a9\u03bf\u03be\u03de", "\u0633\u0627\u0623\u0637\u063a\u0625\u066a\u0668\u067e\u061a\u063c\u0637\u0620\u0637\u0679\u063a\u0637\u0638\u0631\u0679\u0619\u0634\u063c\u0633\u0635\u0622\u066d\u067f\u060c", "\u061e\u0611\u0612\u0613\u0618\u0641\u0643\u0655\u0654\u0631\u0617\u061c\u060b\u061c\u0652\u0611\u061c\u0613\u061a\u0652\u0632\u061f\u0617\u0618\u061e\u0609\u0646", "\u0564\u057f\u0543\u0564\u0562\u0579\u057e\u0577\u052c\u052e\u0538\u0539\u055c\u057a\u0571\u0566\u0571\u053f\u057c\u0571\u057e\u0577\u053f\u0543\u0564\u0562\u0579\u057e\u0577\u052b", "\u03ba\u03bb\u03a0\u03bd\u03b2\u03ad\u03e8\u03ea\u03fc\u03fd\u0382", "\u03b8\u03b9\u03a2\u03bf\u03b0\u03af\u0397\u03ba\u03ba\u03ea\u03e8\u03fe\u03ff\u0380", "\u039b\u038d\u0385\u0398\u03d0\u03d2\u03c4\u03c5\u03ba", "ZLDY\u0011\u0013\u0005g\u0004{", "\u06b5\u06a3\u06ab\u06b6\u06f2\u06fe\u06fc\u06ea\u0688\u06eb\u0694", "\u0728\u073e\u0736\u072b\u0763\u0761\u0777\u0715\u0716\u0776\u0709", "\u0787\u0788\u078f\u0780\u078d\u0788\u079b\u0784\u07dd\u07df\u07c9\u07c8\u07b7"})
public final class Class3756 {
    static {
        H\u200e = ".";
        ae\u200e = "Timer for the fade";
        ao\u200e = "NoLimbSwing";
        bE\u200e = "Keep you static in the air";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite NqvVK6BadLtSAj(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3756.Eu7WgAYDPYy96HqR(k, 1399800505));
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
                        v0 = 52799;
                        ** GOTO lbl19
                    }
                    v0 = 52800;
                    if (true) ** GOTO lbl19
                    do {
                        v0 = var14_15 = 52798;
lbl19:
                        // 3 sources

                        if (var14_15 == 52799) break block9;
                    } while (var14_15 == 52800);
                    break;
                }
                try {
                    a = Integer.parseInt(Class3756.Eu7WgAYDPYy96HqR(q[f], m));
                }
                catch (NumberFormatException b) {
                    break block10;
                }
                if (e % 59557 == m.intValue()) {
                    c = Class3756.Eu7WgAYDPYy96HqR(r[f], l);
                    d = c.split("<>");
                    s = d[0];
                    t = d[1];
                    break;
                }
            }
            ++f;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3756.Eu7WgAYDPYy96HqR(k, 1399800505) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    private static String Eu7WgAYDPYy96HqR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

