/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u5dda\u5ddd\u5ddf\u5dd1\u5ddf\u5ddb\u5dd8\u5ddc", "\u0e95\u0e93\u0e91\u0e95\u0e91\u0e9f\u0e93\u0e96", "\u2ac8\u2aca\u2ac9\u2aca\u2ac3\u2ac3\u2acc\u2aca", "\u1a9a\u1a9c\u1a9d\u1a9c\u1a9c\u1a9b\u1a98\u1a90", "\u4ddd\u4ddc\u4ddb\u4dd1\u4dda\u4ddb\u4ddf\u4ddc", "\u19b0\u19bb\u19b3\u19ba\u19bb\u19b6\u19b4\u19b2", "\u31f4\u31f0\u31f1\u31f5\u31f4\u31f1\u31f5\u31f4", "\ue06c\ue068\ue061\ue06e\ue06b\ue069\ue06b\ue06a", "\ue3e7\ue3e9\ue3e3\ue3e4\ue3e0\ue3e1\ue3e9\ue3e7", "\ud85c\ud85d\ud859\ud856\ud85f\ud85c\ud857", "\ude51\ude54\ude53\ude50\ude55\ude51\ude56\ude51", "\u25eb\u25ed\u25ed\u25ee\u25ed\u25ea\u25e9\u25ef", "\u5386\u5384\u5383\u5385\u538a\u5383\u5382\u5383", "\ue863\ue868\ue863\ue865\ue863\ue865\ue861\ue862", "\u06cf\u06cf\u06cc\u06c9\u06c9\u06c5\u06ce\u06cf", "\ua316\ua312\ua311\ua311\ua316\ua310\ua313\ua314", "\u49e4\u49ef\u49e0\u49ee\u49e7\u49e2\u49e6\u49e7", "\u4830\u4836\u4832\u4834\u4835\u4832\u483d\u4835", "\ua1c6\ua1c4\ua1c6\ua1c1\ua1c4\ua1c1\ua1c4\ua1c3", "\ud811\ud81e\ud81c\ud819\ud81f\ud81c\ud810"}, d2={"\u040d\u0420\u040e\u2465\u0457\u0455\u0443\u0427\u0401\u040a\u041d\u040a\u0444\u0407\u040a\u0405\u040c\u0444\u0438\u041f\u0419\u0402\u0405\u040c\u0450\u0442\u0427\u0401\u040a\u041d\u040a\u0444\u0407\u040a\u0405\u040c\u0444\u0438\u041f\u0419\u0402\u0405\u040c\u0450", "\u040b\u0426\u040b\u2463\u0451\u0453\u0445\u0421\u0407\u040c\u041b\u040c\u0442\u0401\u040c\u0403\u040a\u0442\u043e\u0419\u041f\u0404\u0403\u040a\u0456\u0444\u0421\u0407\u040c\u041b\u040c\u0442\u0401\u040c\u0403\u040a\u0442\u043e\u0419\u041f\u0404\u0403\u040a\u0456", "\u0480\u04ad\u0481\u24e8\u04da\u04d8\u04ce\u04aa\u048c\u0487\u0490\u0487\u04c9\u048a\u0487\u0488\u0481\u04c9\u04b5\u0492\u0494\u048f\u0488\u0481\u04dd\u04cf\u04aa\u048c\u0487\u0490\u0487\u04c9\u048a\u0487\u0488\u0481\u04c9\u04b5\u0492\u0494\u048f\u0488\u0481\u04dd", "\u0726\u070b\u0728\u274e\u077c\u077e\u0768\u070c\u072a\u0721\u0736\u0721\u076f\u072c\u0721\u072e\u0727\u076f\u0713\u0734\u0732\u0729\u072e\u0727\u077b\u0769\u070c\u072a\u0721\u0736\u0721\u076f\u072c\u0721\u072e\u0727\u076f\u0713\u0734\u0732\u0729\u072e\u0727\u077b", "\u0517\u053a\u0518\u257f\u054d\u054f\u0559\u053d\u051b\u0510\u0507\u0510\u055e\u051d\u0510\u051f\u0516\u055e\u0522\u0505\u0503\u0518\u051f\u0516\u054a\u0558\u053d\u051b\u0510\u0507\u0510\u055e\u051d\u0510\u051f\u0516\u055e\u0522\u0505\u0503\u0518\u051f\u0516\u054a", "\u01f0\u01dd\u01fc\u2198\u01aa\u01a8\u01be\u01da\u01fc\u01f7\u01e0\u01f7\u01b9\u01fa\u01f7\u01f8\u01f1\u01b9\u01c5\u01e2\u01e4\u01ff\u01f8\u01f1\u01ad\u01bf\u01da\u01fc\u01f7\u01e0\u01f7\u01b9\u01fa\u01f7\u01f8\u01f1\u01b9\u01c5\u01e2\u01e4\u01ff\u01f8\u01f1\u01ad", "\u024f\u0210\u021f\u021a\u021d\u021a\u0207\u024d\u024f\u024d\u025b\u025a\u0225", "5`g`}757! _", "\u03ba\u03b8\u03a9\u039e\u03b1\u03bc\u03ae\u03ae\u03e1\u03e3\u03f5\u03f4\u0391\u03b7\u03bc\u03ab\u03bc\u03f2\u03b1\u03bc\u03b3\u03ba\u03f2\u039e\u03b1\u03bc\u03ae\u03ae\u03e6", "\u0511\u0518\u050a\u0511\u053a\u0516\u051d\u051c\u0545\u0547\u0551\u0550\u0530", "\u0404\u0410\u0414\u0400\u040d\u0412\u045d\u045f\u0449\u042d\u040b\u0400\u0417\u0400\u044e\u040d\u0400\u040f\u0406\u044e\u042e\u0403\u040b\u0404\u0402\u0415\u045a\u0448\u043b", "\u06d7\u06d8\u06db\u06da\u06d1\u0688\u068a\u069c\u069d\u06f8\u06de\u06d5\u06c2\u06d5\u069b\u06d8\u06d5\u06da\u06d3\u069b\u06fb\u06d6\u06de\u06d1\u06d7\u06c0\u068f", "\u0099\u0082\u00be\u0099\u009f\u0084\u0083\u008a\u00d1\u00d3\u00c5\u00c4\u00a1\u0087\u008c\u009b\u008c\u00c2\u0081\u008c\u0083\u008a\u00c2\u00be\u0099\u009f\u0084\u0083\u008a\u00d6", "\u07e2\u07e3\u07f8\u07e5\u07ea\u07f5\u07b0\u07b2\u07a4\u07a5\u07da", "\u0405\u0404\u041f\u0402\u040d\u0412\u042a\u0407\u0407\u0457\u0455\u0443\u0442\u043d", "\u03a3\u03b5\u03bd\u03a0\u03e8\u03ea\u03fc\u03fd\u0382", "\u01ff\u01e9\u01e1\u01fc\u01b4\u01b6\u01a0\u01c2\u01a1\u01de", "\u0521\u0537\u053f\u0522\u0566\u056a\u0568\u057e\u051c\u057f\u0500", "\u068c\u069a\u0692\u068f\u06c7\u06c5\u06d3\u06b1\u06b2\u06d2\u06ad", "\u04e1\u04ee\u04e9\u04e6\u04eb\u04ee\u04fd\u04e2\u04bb\u04b9\u04af\u04ae\u04d1"})
public final class Class3295 {
    public static double field7087;

    private static String ElD7cSA0bQQ7l2YY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        i\u200e = "ItemName";
        O\u200e = "Adds packets to the logs";
        field7087 = Double.longBitsToDouble(4602891553276010928L);
        ai\u200e = "PickaxeGap";
        aB\u200e = "END";
        aE\u200e = "WorldBorder";
        bs\u200e = "Reverse the entity knock back";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite JgS9DpMYWSFEGn(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class3295.ElD7cSA0bQQ7l2YY(k, -350545964));
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
                        a = Integer.parseInt(Class3295.ElD7cSA0bQQ7l2YY(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        continue;
                    }
                    if (e % 59557 != m.intValue()) break block9;
                    v0 = 26138;
                    ** GOTO lbl23
                }
                v0 = 26139;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_19 = 26137;
lbl23:
                    // 3 sources

                    if (var16_19 == 26138) break block8;
                } while (var16_19 == 26139);
                continue;
            }
            c = Class3295.ElD7cSA0bQQ7l2YY(r[f], l);
            d = c.split("<>");
            s = d[0];
            t = d[1];
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class3295.ElD7cSA0bQQ7l2YY(k, -350545964) + " " + l + " " + m);
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

