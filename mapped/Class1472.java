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

@HACHIMI_CLIENT(mv=100, d1={"\ub12f\ub12b\ub12a\ub128\ub12c\ub12b\ub129\ub12a", "\u6026\u6027\u6021\u6024\u6025\u6023\u6023\u6021", "\ud724\ud723\ud722\ud727\ud724\ud720\ud727", "\u430c\u430f\u4309\u430d\u4306\u430a\u430e\u430c", "\ua5c5\ua5c5\ua5c6\ua5c6\ua5c8\ua5c7\ua5c1\ua5c8", "\u51ef\u51ea\u51ea\u51e1\u51e0\u51ef\u51e9\u51e8", "\u2fcc\u2fcb\u2fcc\u2fca\u2fcb\u2fc0\u2fce", "\ub0fe\ub0ff\ub0fa\ub0f9\ub0f8\ub0fb\ub0fa\ub0fe", "\u5765\u5762\u5765\u5764\u5761\u5767\u576f\u5766", "\u3dc1\u3dc7\u3dc5\u3dc5\u3dc0\u3dce\u3dce\u3dc7", "\udec2\udec2\udec1\udec4\udec0\udec7\udec4\udec0", "\ue234\ue232\ue233\ue235\ue233\ue233\ue234\ue239", "\ua2cc\ua2ca\ua2cc\ua2c1\ua2ca\ua2cd\ua2cf\ua2cd", "\u28ed\u28ec\u28e8\u28e0\u28e0\u28ea\u28e9\u28ea", "\u4d9d\u4d98\u4d9f\u4d98\u4d9a\u4d90\u4d90\u4d9f", "\u9d7b\u9d78\u9d7a\u9d71\u9d7d\u9d7a\u9d7a\u9d78", "\uc2f7\uc2f7\uc2fb\uc2f3\uc2f6\uc2f1\uc2f0\uc2f6", "\u3f0d\u3f09\u3f0b\u3f0c\u3f0f\u3f0e\u3f03\u3f0a"}, d2={"\u02ca\u02c5\u02e2\u22a2\u0290\u0292\u0284\u02e0\u02c6\u02cd\u02da\u02cd\u0283\u02c0\u02cd\u02c2\u02cb\u0283\u02ff\u02d8\u02de\u02c5\u02c2\u02cb\u0297\u0285\u02e0\u02c6\u02cd\u02da\u02cd\u0283\u02c0\u02cd\u02c2\u02cb\u0283\u02ff\u02d8\u02de\u02c5\u02c2\u02cb\u0297", "\u0584\u058b\u05ad\u25ec\u05de\u05dc\u05ca\u05ae\u0588\u0583\u0594\u0583\u05cd\u058e\u0583\u058c\u0585\u05cd\u05b1\u0596\u0590\u058b\u058c\u0585\u05d9\u05cb\u05ae\u0588\u0583\u0594\u0583\u05cd\u058e\u0583\u058c\u0585\u05cd\u05b1\u0596\u0590\u058b\u058c\u0585\u05d9", "\u03f4\u03fb\u03c2\u239c\u03ae\u03ac\u03ba\u03de\u03f8\u03f3\u03e4\u03f3\u03bd\u03fe\u03f3\u03fc\u03f5\u03bd\u03c1\u03e6\u03e0\u03fb\u03fc\u03f5\u03a9\u03bb\u03de\u03f8\u03f3\u03e4\u03f3\u03bd\u03fe\u03f3\u03fc\u03f5\u03bd\u03c1\u03e6\u03e0\u03fb\u03fc\u03f5\u03a9", "\u036c\u0363\u035b\u2304\u0336\u0334\u0322\u0346\u0360\u036b\u037c\u036b\u0325\u0366\u036b\u0364\u036d\u0325\u0359\u037e\u0378\u0363\u0364\u036d\u0331\u0323\u0346\u0360\u036b\u037c\u036b\u0325\u0366\u036b\u0364\u036d\u0325\u0359\u037e\u0378\u0363\u0364\u036d\u0331", "\u0287\u02d8\u02d7\u02d2\u02d5\u02d2\u02cf\u0285\u0287\u0285\u0293\u0292\u02ed", "\u0555\u0500\u0507\u0500\u051d\u0557\u0555\u0557\u0541\u0540\u053f", "\u06dc\u06de\u06cf\u06f8\u06d7\u06da\u06c8\u06c8\u0687\u0685\u0693\u0692\u06f7\u06d1\u06da\u06cd\u06da\u0694\u06d7\u06da\u06d5\u06dc\u0694\u06f8\u06d7\u06da\u06c8\u06c8\u0680", "\u073c\u0735\u0727\u073c\u0717\u073b\u0730\u0731\u0768\u076a\u077c\u077d\u071d", "\u064c\u0658\u065c\u0648\u0645\u065a\u0615\u0617\u0601\u0665\u0643\u0648\u065f\u0648\u0606\u0645\u0648\u0647\u064e\u0606\u0666\u064b\u0643\u064c\u064a\u065d\u0612\u0600\u0673", "\u063e\u0631\u0632\u0633\u0638\u0661\u0663\u0675\u0674\u0611\u0637\u063c\u062b\u063c\u0672\u0631\u063c\u0633\u063a\u0672\u0612\u063f\u0637\u0638\u063e\u0629\u0666", "\u0218\u0203\u023f\u0218\u021e\u0205\u0202\u020b\u0250\u0252\u0244\u0245\u0220\u0206\u020d\u021a\u020d\u0243\u0200\u020d\u0202\u020b\u0243\u023f\u0218\u021e\u0205\u0202\u020b\u0257", "\u0545\u0544\u055f\u0542\u054d\u0552\u0517\u0515\u0503\u0502\u057d", "\u0343\u0342\u0359\u0344\u034b\u0354\u036c\u0341\u0341\u0311\u0313\u0305\u0304\u037b", "\u032d\u033b\u0333\u032e\u0366\u0364\u0372\u0373\u030c", "\u0674\u0662\u066a\u0677\u063f\u063d\u062b\u0649\u062a\u0655", "\u0771\u0767\u076f\u0772\u0736\u073a\u0738\u072e\u074c\u072f\u0750", "\u00a1\u00b7\u00bf\u00a2\u00ea\u00e8\u00fe\u009c\u009f\u00ff\u0080", "\u05d9\u05d6\u05d1\u05de\u05d3\u05d6\u05c5\u05da\u0583\u0581\u0597\u0596\u05e9"})
public final class Class1472 {
    private static String DVQ99vV6NOhyk6xR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        am\u200e = "Crossbow";
        aZ\u200e = "PRESERVE_BOUNDED";
        br\u200e = "AntiKick";
        bw\u200e = "Inhibit";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite LunnRynGwgSBJN(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1472.DVQ99vV6NOhyk6xR(k2, -1198773046));
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
                int a2 = Integer.parseInt(Class1472.DVQ99vV6NOhyk6xR(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1472.DVQ99vV6NOhyk6xR(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 24261 : 24262;
        block7: while (true) {
            switch (n3) {
                case 24262: {
                    n3 = 24260;
                    continue block7;
                }
                case 24261: {
                    throw new Exception("Can't find method in " + Class1472.DVQ99vV6NOhyk6xR(k2, -1198773046) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

