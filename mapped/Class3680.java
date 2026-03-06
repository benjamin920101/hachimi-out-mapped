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

@HACHIMI_CLIENT(mv=100, d1={"\ud79d\ud793\ud798\ud79b\ud79c\ud79e\ud798\ud798", "\u0876\u087b\u0872\u087b\u087a\u0870\u0873\u0877", "\u1a93\u1a90\u1a90\u1a92\u1a9c\u1a95\u1a92\u1a9d", "\u81be\u81b9\u81b8\u81bd\u81bb\u81bf\u81be\u81be", "\u075f\u075e\u075c\u075a\u0750\u075c\u075a\u075c", "\u6dee\u6de8\u6dec\u6dee\u6de5\u6de9\u6de5\u6de9", "\ua35f\ua35e\ua35b\ua35b\ua353\ua35f\ua353\ua35a", "\uc4f9\uc4fd\uc4ff\uc4fb\uc4f6\uc4fd\uc4fd\uc4ff", "\ue033\ue036\ue034\ue030\ue032\ue030\ue033\ue033", "\u86a7\u86ab\u86a6\u86a3\u86a0\u86a5\u86a5\u86ab", "\u9a12\u9a13\u9a16\u9a18\u9a13\u9a15\u9a18\u9a15", "\uc327\uc32a\uc321\uc327\uc327\uc323\uc321\uc322", "\u070a\u070f\u070a\u0709\u070a\u0708\u070b\u0707", "\ud97a\ud97c\ud979\ud979\ud97e\ud97e\ud97d\ud97a", "\u5231\u5231\u5236\u523a\u5230\u5233\u523a\u523b", "\uc930\uc93b\uc93a\uc93a\uc93b\uc937\uc933\uc937"}, d2={"\u061e\u0627\u2658\u066a\u0668\u067e\u061a\u063c\u0637\u0620\u0637\u0679\u063a\u0637\u0638\u0631\u0679\u0605\u0622\u0624\u063f\u0638\u0631\u066d\u067f\u061a\u063c\u0637\u0620\u0637\u0679\u063a\u0637\u0638\u0631\u0679\u0605\u0622\u0624\u063f\u0638\u0631\u066d", "\u0398\u03a2\u23de\u03ec\u03ee\u03f8\u039c\u03ba\u03b1\u03a6\u03b1\u03ff\u03bc\u03b1\u03be\u03b7\u03ff\u0383\u03a4\u03a2\u03b9\u03be\u03b7\u03eb\u03f9\u039c\u03ba\u03b1\u03a6\u03b1\u03ff\u03bc\u03b1\u03be\u03b7\u03ff\u0383\u03a4\u03a2\u03b9\u03be\u03b7\u03eb", "\u0159\u0106\u0109\u010c\u010b\u010c\u0111\u015b\u0159\u015b\u014d\u014c\u0133", "\u0703\u0756\u0751\u0756\u074b\u0701\u0703\u0701\u0717\u0716\u0769", "\u079b\u0799\u0788\u07bf\u0790\u079d\u078f\u078f\u07c0\u07c2\u07d4\u07d5\u07b0\u0796\u079d\u078a\u079d\u07d3\u0790\u079d\u0792\u079b\u07d3\u07bf\u0790\u079d\u078f\u078f\u07c7", "\u0003\n\u0018\u0003(\u0004\u000f\u000eWUCB\"", "\u0643\u0657\u0653\u0647\u064a\u0655\u061a\u0618\u060e\u066a\u064c\u0647\u0650\u0647\u0609\u064a\u0647\u0648\u0641\u0609\u0669\u0644\u064c\u0643\u0645\u0652\u061d\u060f\u067c", "\u0576\u0579\u057a\u057b\u0570\u0529\u052b\u053d\u053c\u0559\u057f\u0574\u0563\u0574\u053a\u0579\u0574\u057b\u0572\u053a\u055a\u0577\u057f\u0570\u0576\u0561\u052e", "\u01a7\u01bc\u0180\u01a7\u01a1\u01ba\u01bd\u01b4\u01ef\u01ed\u01fb\u01fa\u019f\u01b9\u01b2\u01a5\u01b2\u01fc\u01bf\u01b2\u01bd\u01b4\u01fc\u0180\u01a7\u01a1\u01ba\u01bd\u01b4\u01e8", "\u0321\u0320\u033b\u0326\u0329\u0336\u0373\u0371\u0367\u0366\u0319", "\u0013\u0012\t\u0014\u001b\u0004<\u0011\u0011ACUT+", "\u07b3\u07a5\u07ad\u07b0\u07f8\u07fa\u07ec\u07ed\u0792", "\u0692\u0684\u068c\u0691\u06d9\u06db\u06cd\u06af\u06cc\u06b3", "\u06cd\u06db\u06d3\u06ce\u068a\u0686\u0684\u0692\u06f0\u0693\u06ec", "\u04f2\u04e4\u04ec\u04f1\u04b9\u04bb\u04ad\u04cf\u04cc\u04ac\u04d3", "\u06ea\u06e5\u06e2\u06ed\u06e0\u06e5\u06f6\u06e9\u06b0\u06b2\u06a4\u06a5\u06da"})
public final class Class3680 {
    public static float field8250 = 0.9548528f;
    public static float field8251;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite A9xQWmFYtNeFgV(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3680.VOFzC069qtovoMnD(k2, -75830531));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3680.VOFzC069qtovoMnD(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 53604 : 53603;
            block7: while (true) {
                switch (n3) {
                    case 53604: {
                        n3 = 53602;
                        continue block7;
                    }
                    case 53603: {
                        String c2 = Class3680.VOFzC069qtovoMnD(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3680.VOFzC069qtovoMnD(k2, -75830531) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String VOFzC069qtovoMnD(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        i\u200e = "ItemFrame";
        field8251 = Float.intBitsToFloat(1058279691);
        o\u200e = "strength";
    }
}

