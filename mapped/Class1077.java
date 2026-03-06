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

@HACHIMI_CLIENT(mv=100, d1={"\ua783\ua786\ua782\ua781\ua78a\ua78a\ua780\ua787", "\ucaeb\ucaea\ucaea\ucaea\ucaec\ucaeb\ucae7\ucaec", "\u5600\u560e\u5601\u5607\u5607\u5604\u5603", "\ucf55\ucf52\ucf55\ucf50\ucf56\ucf53\ucf51\ucf5a", "\u86e7\u86e2\u86e2\u86e2\u86e0\u86ea\u86e1\u86e5", "\u3b78\u3b78\u3b78\u3b79\u3b71\u3b76\u3b71", "\u6cc7\u6cc2\u6cc4\u6cc2\u6cc4\u6cc4\u6cca\u6cc2", "\u2b9d\u2b91\u2b9d\u2b9e\u2b90\u2b99\u2b9f\u2b9e", "\ud69c\ud69f\ud69b\ud69f\ud69c\ud699\ud695\ud699", "\u188e\u1889\u188e\u1882\u1888\u1883\u188e\u188a", "\u152a\u152e\u152d\u1528\u1520\u152a\u152e\u152d", "\u41e2\u41e6\u41e0\u41e4\u41e3\u41e2\u41e5\u41e7", "\u9bb9\u9bbf\u9bb5\u9bb5\u9bb5\u9bb9\u9bbc", "\ud469\ud469\ud46a\ud46e\ud46b\ud46b\ud46a\ud46b", "\ud934\ud934\ud93c\ud933\ud933\ud93c\ud930\ud932", "\u4de9\u4dea\u4dee\u4de8\u4dea\u4ded\u4de6\u4dec", "\u6ac6\u6ac7\u6ac0\u6acd\u6ac6\u6acc\u6ac7\u6acc", "\u9d8f\u9d87\u9d86\u9d8f\u9d8d\u9d8d\u9d8e\u9d88", "\u28f8\u28f1\u28f1\u28f2\u28f4\u28f5\u28f1"}, d2={"\u041d\u043f\u041f\u247e\u044c\u044e\u0458\u043c\u041a\u0411\u0406\u0411\u045f\u041c\u0411\u041e\u0417\u045f\u0423\u0404\u0402\u0419\u041e\u0417\u044b\u0459\u043c\u041a\u0411\u0406\u0411\u045f\u041c\u0411\u041e\u0417\u045f\u0423\u0404\u0402\u0419\u041e\u0417\u044b", "\u0456\u0474\u044b\u2435\u0407\u0405\u0413\u0477\u0451\u045a\u044d\u045a\u0414\u0457\u045a\u0455\u045c\u0414\u0468\u044f\u0449\u0452\u0455\u045c\u0400\u0412\u0477\u0451\u045a\u044d\u045a\u0414\u0457\u045a\u0455\u045c\u0414\u0468\u044f\u0449\u0452\u0455\u045c\u0400", "\u038b\u03a9\u0397\u23e8\u03da\u03d8\u03ce\u03aa\u038c\u0387\u0390\u0387\u03c9\u038a\u0387\u0388\u0381\u03c9\u03b5\u0392\u0394\u038f\u0388\u0381\u03dd\u03cf\u03aa\u038c\u0387\u0390\u0387\u03c9\u038a\u0387\u0388\u0381\u03c9\u03b5\u0392\u0394\u038f\u0388\u0381\u03dd", "\u03a2\u0380\u03bd\u23c1\u03f3\u03f1\u03e7\u0383\u03a5\u03ae\u03b9\u03ae\u03e0\u03a3\u03ae\u03a1\u03a8\u03e0\u039c\u03bb\u03bd\u03a6\u03a1\u03a8\u03f4\u03e6\u0383\u03a5\u03ae\u03b9\u03ae\u03e0\u03a3\u03ae\u03a1\u03a8\u03e0\u039c\u03bb\u03bd\u03a6\u03a1\u03a8\u03f4", "\u01b4\u0196\u01aa\u21d7\u01e5\u01e7\u01f1\u0195\u01b3\u01b8\u01af\u01b8\u01f6\u01b5\u01b8\u01b7\u01be\u01f6\u018a\u01ad\u01ab\u01b0\u01b7\u01be\u01e2\u01f0\u0195\u01b3\u01b8\u01af\u01b8\u01f6\u01b5\u01b8\u01b7\u01be\u01f6\u018a\u01ad\u01ab\u01b0\u01b7\u01be\u01e2", "\u0728\u0777\u0778\u077d\u077a\u077d\u0760\u072a\u0728\u072a\u073c\u073d\u0742", "\u0564\u0531\u0536\u0531\u052c\u0566\u0564\u0566\u0570\u0571\u050e", "\u07a3\u07a1\u07b0\u0787\u07a8\u07a5\u07b7\u07b7\u07f8\u07fa\u07ec\u07ed\u0788\u07ae\u07a5\u07b2\u07a5\u07eb\u07a8\u07a5\u07aa\u07a3\u07eb\u0787\u07a8\u07a5\u07b7\u07b7\u07ff", "\u06e0\u06e9\u06fb\u06e0\u06cb\u06e7\u06ec\u06ed\u06b4\u06b6\u06a0\u06a1\u06c1", "\u0677\u0663\u0667\u0673\u067e\u0661\u062e\u062c\u063a\u065e\u0678\u0673\u0664\u0673\u063d\u067e\u0673\u067c\u0675\u063d\u065d\u0670\u0678\u0677\u0671\u0666\u0629\u063b\u0648", "\u03b0\u03bf\u03bc\u03bd\u03b6\u03ef\u03ed\u03fb\u03fa\u039f\u03b9\u03b2\u03a5\u03b2\u03fc\u03bf\u03b2\u03bd\u03b4\u03fc\u039c\u03b1\u03b9\u03b6\u03b0\u03a7\u03e8", "\u0244\u025f\u0263\u0244\u0242\u0259\u025e\u0257\u020c\u020e\u0218\u0219\u027c\u025a\u0251\u0246\u0251\u021f\u025c\u0251\u025e\u0257\u021f\u0263\u0244\u0242\u0259\u025e\u0257\u020b", "\u019f\u019e\u0185\u0198\u0197\u0188\u01cd\u01cf\u01d9\u01d8\u01a7", "\u033b\u033a\u0321\u033c\u0333\u032c\u0314\u0339\u0339\u0369\u036b\u037d\u037c\u0303", "\u0433\u0425\u042d\u0430\u0478\u047a\u046c\u046d\u0412", "\u0354\u0342\u034a\u0357\u031f\u031d\u030b\u0369\u030a\u0375", "\u04a1\u04b7\u04bf\u04a2\u04e6\u04ea\u04e8\u04fe\u049c\u04ff\u0480", "\u01d6\u01c0\u01c8\u01d5\u019d\u019f\u0189\u01eb\u01e8\u0188\u01f7", "\u0664\u066b\u066c\u0663\u066e\u066b\u0678\u0667\u063e\u063c\u062a\u062b\u0654"})
public final class Class1077 {
    public static float field4385;
    public static float field4386;

    /*
     * Unable to fully structure code
     */
    private static String fDU1hnQWqTMicbqI(String a, int b) {
        c = new StringBuilder();
        d = 0;
        while (true) {
            block2: {
                block3: {
                    if (d >= a.length()) break block3;
                    v0 = 1623;
                    ** GOTO lbl12
                }
                v0 = 1624;
                if (true) ** GOTO lbl12
                do {
                    v0 = var4_4 = 1622;
lbl12:
                    // 3 sources

                    if (var4_4 == 1623) break block2;
                } while (var4_4 == 1624);
                break;
            }
            c.append((char)(a.charAt(d) ^ b));
            ++d;
        }
        return c.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite FVUe9VYxVSi2m7(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1077.fDU1hnQWqTMicbqI(k2, -1316199681));
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
                int a2 = Integer.parseInt(Class1077.fDU1hnQWqTMicbqI(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1077.fDU1hnQWqTMicbqI(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1077.fDU1hnQWqTMicbqI(k2, -1316199681) + " " + l2 + " " + m2);
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
        g\u200e = "ARRAYLIST_INFO";
        i\u200e = "0";
        field4386 = Float.intBitsToFloat(1055475316);
        Q\u200e = "LogChat";
        field4385 = Float.intBitsToFloat(1064354581);
        aJ\u200e = "MineRange";
        bN\u200e = "Notify";
    }
}

