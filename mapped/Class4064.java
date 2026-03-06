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
@HACHIMI_CLIENT(mv=100, d1={"\ud51f\ud518\ud51f\ud519\ud51d\ud51c\ud51e", "\uaf82\uaf83\uaf8e\uaf82\uaf82\uaf85\uaf87\uaf83", "\u5257\u5256\u5250\u5253\u5255\u525b\u5254\u5252", "\u89c5\u89c5\u89c4\u89c2\u89c3\u89c3\u89c2\u89c2", "\u8ba9\u8ba8\u8bae\u8ba9\u8bae\u8bad\u8bae\u8bac", "\u3284\u3285\u3287\u3289\u3287\u3282\u3281\u3282", "\u83c4\u83cf\u83c5\u83c5\u83c3\u83ce\u83c4\u83c0", "\ud1ba\ud1bd\ud1bb\ud1bf\ud1b5\ud1bb\ud1b4\ud1bd", "\u8d5b\u8d5f\u8d58\u8d5f\u8d5b\u8d58\u8d5d", "\u5e97\u5e9d\u5e94\u5e97\u5e90\u5e94\u5e92\u5e97", "\ud17d\ud17b\ud17b\ud17b\ud17c\ud17f\ud17e", "\u844c\u8448\u844c\u844b\u844c\u844e\u8444\u8448", "\ud838\ud83f\ud832\ud83e\ud839\ud83e\ud832\ud83d", "\u867e\u867d\u867f\u8672\u867f\u867f\u867a\u867e", "\u6e53\u6e57\u6e50\u6e5f\u6e56\u6e54\u6e5e"}, d2={"\u0015'\u0000\u207fMOY=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^\"\u0005\u0003\u0018\u001f\u0016JX=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^\"\u0005\u0003\u0018\u001f\u0016J", "\u07f3\u07ac\u07a3\u07a6\u07a1\u07a6\u07bb\u07f1\u07f3\u07f1\u07e7\u07e6\u0799", "\u00eb\u00be\u00b9\u00be\u00a3\u00e9\u00eb\u00e9\u00ff\u00fe\u0081", "\u069c\u069e\u068f\u06b8\u0697\u069a\u0688\u0688\u06c7\u06c5\u06d3\u06d2\u06b7\u0691\u069a\u068d\u069a\u06d4\u0697\u069a\u0695\u069c\u06d4\u06b8\u0697\u069a\u0688\u0688\u06c0", "\u0446\u044f\u045d\u0446\u046d\u0441\u044a\u044b\u0412\u0410\u0406\u0407\u0467", "\u03fc\u03e8\u03ec\u03f8\u03f5\u03ea\u03a5\u03a7\u03b1\u03d5\u03f3\u03f8\u03ef\u03f8\u03b6\u03f5\u03f8\u03f7\u03fe\u03b6\u03d6\u03fb\u03f3\u03fc\u03fa\u03ed\u03a2\u03b0\u03c3", "\u0543\u054c\u054f\u054e\u0545\u051c\u051e\u0508\u0509\u056c\u054a\u0541\u0556\u0541\u050f\u054c\u0541\u054e\u0547\u050f\u056f\u0542\u054a\u0545\u0543\u0554\u051b", "\u014d\u0156\u016a\u014d\u014b\u0150\u0157\u015e\u0105\u0107\u0111\u0110\u0175\u0153\u0158\u014f\u0158\u0116\u0155\u0158\u0157\u015e\u0116\u016a\u014d\u014b\u0150\u0157\u015e\u0102", "\u018d\u018c\u0197\u018a\u0185\u019a\u01df\u01dd\u01cb\u01ca\u01b5", "\u0774\u0775\u076e\u0773\u077c\u0763\u075b\u0776\u0776\u0726\u0724\u0732\u0733\u074c", "\u03d4\u03c2\u03ca\u03d7\u039f\u039d\u038b\u038a\u03f5", "\u04f2\u04e4\u04ec\u04f1\u04b9\u04bb\u04ad\u04cf\u04ac\u04d3", "\u0404\u0412\u041a\u0407\u0443\u044f\u044d\u045b\u0439\u045a\u0425", "\u07b2\u07a4\u07ac\u07b1\u07f9\u07fb\u07ed\u078f\u078c\u07ec\u0793", "_PWXUPC\\\u0005\u0007\u0011\u0010o"})
public final class Class4064 {
    public static float field9383;
    public static float field9384;
    public static float field9385;
    public static float field9386 = 0.7138763f;
    public static float field9387;

    private static String 8UDwWOAsjnlBWY9p(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite XnXt4HMSg11FWV(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class4064.8UDwWOAsjnlBWY9p(k, -231329969));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block6: while (true) {
            block13: {
                if (f >= q.length) break block13;
                v0 = 37189;
                ** GOTO lbl19
            }
            v0 = 37190;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 37188;
lbl19:
                // 3 sources

                switch (v0) {
                    case 37190: {
                        continue block7;
                    }
                    case 37189: {
                        try {
                            a = Integer.parseInt(Class4064.8UDwWOAsjnlBWY9p(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class4064.8UDwWOAsjnlBWY9p(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break block6;
                        }
lbl34:
                        // 3 sources

                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class4064.8UDwWOAsjnlBWY9p(k, -231329969) + " " + l + " " + m);
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
        field9387 = Float.intBitsToFloat(-1048576000);
        field9385 = Float.intBitsToFloat(1065097830);
        field9383 = Float.intBitsToFloat(1063057369);
        bf\u200e = "texelSize";
        field9384 = Float.intBitsToFloat(1062799112);
    }
}

