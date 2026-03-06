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

@HACHIMI_CLIENT(mv=100, d1={"\ub75d\ub751\ub75f\ub75d\ub75c\ub75d\ub75f\ub75c", "\u8961\u8967\u8966\u896d\u8965\u8964\u896d\u8961", "\u1295\u1295\u1298\u1290\u1299\u1296\u1297\u1297", "\uaac2\uaac5\uaac6\uaac7\uaac4\uaac5\uaac7\uaac0", "\udf28\udf2f\udf28\udf2b\udf29\udf28\udf22\udf2b", "\u791e\u791b\u7919\u7918\u791c\u791e\u791c\u791b", "\u3570\u3574\u3573\u3577\u3571\u3573\u3573\u3574", "\u93af\u93ad\u93ae\u93ae\u93aa\u93a3\u93ab\u93af", "\u6105\u6105\u6107\u610a\u6103\u6107\u610a\u6106", "\uda03\uda04\uda06\uda05\uda08\uda04\uda07\uda03", "\ud6c1\ud6c0\ud6c8\ud6c9\ud6c4\ud6c3\ud6c9\ud6c8", "\u3bbe\u3bbd\u3bbd\u3bb0\u3bbf\u3bbc\u3bb1\u3bbf", "\uadd4\uadd9\uadd3\uadd0\uadd4\uadd5\uadd3", "\u098a\u0986\u0986\u0980\u098a\u0986", "\ubf1a\ubf11\ubf1f\ubf18\ubf10\ubf1b\ubf1a\ubf1a", "\u47c3\u47c5\u47c1\u47ce\u47c3\u47c3\u47c4", "\u25ff\u25f3\u25fa\u25ff\u25f2\u25fb\u25fd"}, d2={"\u07a2\u07ad\u07b7\u27c0\u07f2\u07f0\u07e6\u0782\u07a4\u07af\u07b8\u07af\u07e1\u07a2\u07af\u07a0\u07a9\u07e1\u079d\u07ba\u07bc\u07a7\u07a0\u07a9\u07f5\u07e7\u0782\u07a4\u07af\u07b8\u07af\u07e1\u07a2\u07af\u07a0\u07a9\u07e1\u079d\u07ba\u07bc\u07a7\u07a0\u07a9\u07f5", "\u042c\u0423\u043a\u244e\u047c\u047e\u0468\u040c\u042a\u0421\u0436\u0421\u046f\u042c\u0421\u042e\u0427\u046f\u0413\u0434\u0432\u0429\u042e\u0427\u047b\u0469\u040c\u042a\u0421\u0436\u0421\u046f\u042c\u0421\u042e\u0427\u046f\u0413\u0434\u0432\u0429\u042e\u0427\u047b", "\u0083\u008c\u00ae\u20e1\u00d3\u00d1\u00c7\u00a3\u0085\u008e\u0099\u008e\u00c0\u0083\u008e\u0081\u0088\u00c0\u00bc\u009b\u009d\u0086\u0081\u0088\u00d4\u00c6\u00a3\u0085\u008e\u0099\u008e\u00c0\u0083\u008e\u0081\u0088\u00c0\u00bc\u009b\u009d\u0086\u0081\u0088\u00d4", "\u04fb\u04a4\u04ab\u04ae\u04a9\u04ae\u04b3\u04f9\u04fb\u04f9\u04ef\u04ee\u0491", "\u07fb\u07ae\u07a9\u07ae\u07b3\u07f9\u07fb\u07f9\u07ef\u07ee\u0791", "\u0775\u0777\u0766\u0751\u077e\u0773\u0761\u0761\u072e\u072c\u073a\u073b\u075e\u0778\u0773\u0764\u0773\u073d\u077e\u0773\u077c\u0775\u073d\u0751\u077e\u0773\u0761\u0761\u0729", "\u029b\u0292\u0280\u029b\u02b0\u029c\u0297\u0296\u02cf\u02cd\u02db\u02da\u02ba", "\u0530\u0524\u0520\u0534\u0539\u0526\u0569\u056b\u057d\u0519\u053f\u0534\u0523\u0534\u057a\u0539\u0534\u053b\u0532\u057a\u051a\u0537\u053f\u0530\u0536\u0521\u056e\u057c\u050f", "\u0245\u024a\u0249\u0248\u0243\u021a\u0218\u020e\u020f\u026a\u024c\u0247\u0250\u0247\u0209\u024a\u0247\u0248\u0241\u0209\u0269\u0244\u024c\u0243\u0245\u0252\u021d", "\u030c\u0317\u032b\u030c\u030a\u0311\u0316\u031f\u0344\u0346\u0350\u0351\u0334\u0312\u0319\u030e\u0319\u0357\u0314\u0319\u0316\u031f\u0357\u032b\u030c\u030a\u0311\u0316\u031f\u0343", "\u02aa\u02ab\u02b0\u02ad\u02a2\u02bd\u02f8\u02fa\u02ec\u02ed\u0292", "\u00ad\u00ac\u00b7\u00aa\u00a5\u00ba\u0082\u00af\u00af\u00ff\u00fd\u00eb\u00ea\u0095", "\u0660\u0676\u067e\u0663\u062b\u0629\u063f\u063e\u0641", "\u0225\u0233\u023b\u0226\u026e\u026c\u027a\u0218\u027b\u0204", "\u032b\u033d\u0335\u0328\u036c\u0360\u0362\u0374\u0316\u0375\u030a", "\u05f7\u05e1\u05e9\u05f4\u05bc\u05be\u05a8\u05ca\u05c9\u05a9\u05d6", "\u0297\u0298\u029f\u0290\u029d\u0298\u028b\u0294\u02cd\u02cf\u02d9\u02d8\u02a7"})
public final class Class1175 {
    public static int field4670 = 1;
    public static float field4671;
    public static float field4672;
    public static float field4673;

    static {
        field4673 = Float.intBitsToFloat(1054316126);
        aa\u200e = "Notifies you if the server you join is running Grim";
        field4671 = Float.intBitsToFloat(1052663384);
        aQ\u200e = "Confirm the teleport";
        bz\u200e = "Base can be placed when the crystal damage is below the set value";
        field4672 = Float.intBitsToFloat(1061088002);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite dy5jYdnlutMg3o(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1175.I4MIARca8XON3lgi(k2, -20120803));
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
                int a2 = Integer.parseInt(Class1175.I4MIARca8XON3lgi(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1175.I4MIARca8XON3lgi(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1175.I4MIARca8XON3lgi(k2, -20120803) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String I4MIARca8XON3lgi(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 30678 : 30677;
            block5: while (true) {
                switch (n2) {
                    case 30678: {
                        n2 = 30676;
                        continue block5;
                    }
                    case 30677: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

