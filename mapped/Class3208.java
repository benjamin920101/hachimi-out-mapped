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
@HACHIMI_CLIENT(mv=100, d1={"\u5536\u5534\u5531\u5536\u5534\u5536\u5534\u5539", "\u3ff8\u3ffe\u3ff9\u3ff5\u3ff5\u3ff9\u3ff4\u3ffb", "\u5d94\u5d93\u5d92\u5d96\u5d95\u5d94\u5d96\u5d93", "\u4643\u4643\u4642\u4649\u464b\u4648\u464d", "\u8f5d\u8f59\u8f5a\u8f5c\u8f56\u8f5a\u8f57\u8f5b", "\uc3b6\uc3b5\uc3bb\uc3b1\uc3b1\uc3ba\uc3b5\uc3ba", "\u6032\u6038\u6037\u6039\u6030\u6036\u6030\u6037", "\u95af\u95aa\u95ac\u95ab\u95ac\u95ae\u95a4\u95a9", "\u3992\u3991\u3992\u399e\u3997\u3990\u399e\u3991", "\uc345\uc34a\uc340\uc342\uc347\uc34b\uc341\uc345", "\u5842\u5849\u5847\u5844\u5841\u5845\u5848\u5843", "\u5ed5\u5ed7\u5ed1\u5ed1\u5ed3\u5ed3\u5ed8\u5ed2", "\u314d\u3149\u314b\u3145\u3149\u314e\u314b\u314f", "\u94cc\u94c0\u94c8\u94ca\u94ce\u94c1\u94ce", "\u4017\u4013\u4012\u4016\u4014\u401b\u4010\u4014", "\ue720\ue727\ue720\ue727\ue723\ue725\ue724\ue727", "\u9af0\u9af4\u9afe\u9af1\u9af4\u9af4\u9af3\u9af1"}, d2={"\u033d\u032b\u0311\u235d\u036f\u036d\u037b\u031f\u0339\u0332\u0325\u0332\u037c\u033f\u0332\u033d\u0334\u037c\u0300\u0327\u0321\u033a\u033d\u0334\u0368\u037a\u031f\u0339\u0332\u0325\u0332\u037c\u033f\u0332\u033d\u0334\u037c\u0300\u0327\u0321\u033a\u033d\u0334\u0368", "\u038d\u039b\u03a0\u23ed\u03df\u03dd\u03cb\u03af\u0389\u0382\u0395\u0382\u03cc\u038f\u0382\u038d\u0384\u03cc\u03b0\u0397\u0391\u038a\u038d\u0384\u03d8\u03ca\u03af\u0389\u0382\u0395\u0382\u03cc\u038f\u0382\u038d\u0384\u03cc\u03b0\u0397\u0391\u038a\u038d\u0384\u03d8", "\b\u001e\"\u2068ZXN*\f\u0007\u0010\u0007I\n\u0007\b\u0001I5\u0012\u0014\u000f\b\u0001]O*\f\u0007\u0010\u0007I\n\u0007\b\u0001I5\u0012\u0014\u000f\b\u0001]", "\u079f\u07c0\u07cf\u07ca\u07cd\u07ca\u07d7\u079d\u079f\u079d\u078b\u078a\u07f5", "\u0631\u0664\u0663\u0664\u0679\u0633\u0631\u0633\u0625\u0624\u065b", "\u065f\u065d\u064c\u067b\u0654\u0659\u064b\u064b\u0604\u0606\u0610\u0611\u0674\u0652\u0659\u064e\u0659\u0617\u0654\u0659\u0656\u065f\u0617\u067b\u0654\u0659\u064b\u064b\u0603", "\u012a\u0123\u0131\u012a\u0101\u012d\u0126\u0127\u017e\u017c\u016a\u016b\u010b", "\u06f2\u06e6\u06e2\u06f6\u06fb\u06e4\u06ab\u06a9\u06bf\u06db\u06fd\u06f6\u06e1\u06f6\u06b8\u06fb\u06f6\u06f9\u06f0\u06b8\u06d8\u06f5\u06fd\u06f2\u06f4\u06e3\u06ac\u06be\u06cd", "\u0446\u0449\u044a\u044b\u0440\u0419\u041b\u040d\u040c\u0469\u044f\u0444\u0453\u0444\u040a\u0449\u0444\u044b\u0442\u040a\u046a\u0447\u044f\u0440\u0446\u0451\u041e", "\u04da\u04c1\u04fd\u04da\u04dc\u04c7\u04c0\u04c9\u0492\u0490\u0486\u0487\u04e2\u04c4\u04cf\u04d8\u04cf\u0481\u04c2\u04cf\u04c0\u04c9\u0481\u04fd\u04da\u04dc\u04c7\u04c0\u04c9\u0495", "\u02d8\u02d9\u02c2\u02df\u02d0\u02cf\u028a\u0288\u029e\u029f\u02e0", "\u0757\u0756\u074d\u0750\u075f\u0740\u0778\u0755\u0755\u0705\u0707\u0711\u0710\u076f", "\u03ea\u03fc\u03f4\u03e9\u03a1\u03a3\u03b5\u03b4\u03cb", "\u01d0\u01c6\u01ce\u01d3\u019b\u0199\u018f\u01ed\u018e\u01f1", "\u0784\u0792\u079a\u0787\u07c3\u07cf\u07cd\u07db\u07b9\u07da\u07a5", "\u06bb\u06ad\u06a5\u06b8\u06f0\u06f2\u06e4\u0686\u0685\u06e5\u069a", "\u0497\u0498\u049f\u0490\u049d\u0498\u048b\u0494\u04cd\u04cf\u04d9\u04d8\u04a7"})
public final class Class3208 {
    public static float field6883 = 0.35483223f;
    public static float field6884 = Float.intBitsToFloat(1059210690);
    public static float field6885;
    public static float field6886;

    static {
        p\u200e = "Confirms the step height for NCP servers";
        s\u200e = "Cactus";
        field6885 = Float.intBitsToFloat(1064881235);
        field6886 = Float.intBitsToFloat(1062491765);
        bY\u200e = "player";
    }

    private static String 4GvinWMeJONvUNPf(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite VPLDe4JPsnERpo(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3208.4GvinWMeJONvUNPf(k, 1927479755));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        for (f = 0; f < q.length; ++f) {
            block8: {
                block9: {
                    try {
                        a = Integer.parseInt(Class3208.4GvinWMeJONvUNPf(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        continue;
                    }
                    if (e % 59557 != m.intValue()) break block9;
                    v0 = 34302;
                    ** GOTO lbl23
                }
                v0 = 34303;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_19 = 34301;
lbl23:
                    // 3 sources

                    if (var16_19 == 34302) break block8;
                } while (var16_19 == 34303);
                continue;
            }
            c = Class3208.4GvinWMeJONvUNPf(r[f], l);
            d = c.split("<>");
            s = d[0];
            t = d[1];
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3208.4GvinWMeJONvUNPf(k, 1927479755) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }
}

