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

@HACHIMI_CLIENT(mv=100, d1={"\u2a0a\u2a0f\u2a0b\u2a0b\u2a08\u2a0d\u2a0f\u2a0c", "\u57f3\u57f4\u57f5\u57f1\u57f5\u57f6\u57f1\u57f5", "\u651f\u6514\u651e\u6515\u651a\u6518\u651d\u651f", "\u72ad\u72ac\u72aa\u72ad\u72af\u72a9\u72a9", "\u319b\u319d\u319d\u319e\u3190\u319a\u319c\u3199", "\u97c3\u97c6\u97c9\u97c4\u97c3\u97c1\u97c0\u97c7", "\ud345\ud340\ud347\ud341\ud341\ud344\ud344\ud34a", "\uc29b\uc29a\uc299\uc29e\uc29f\uc296\uc29b\uc29b", "\uc74b\uc74a\uc74c\uc74a\uc749\uc747\uc74a\uc74e", "\u940d\u9401\u940f\u940f\u940b\u940e\u9409\u940d", "\u8ac7\u8ac7\u8ac3\u8aca\u8ac7\u8ac1\u8ac7\u8ac0", "\u255d\u255d\u255e\u255b\u255d\u2550\u2559\u255c", "\uc529\uc52f\uc522\uc529\uc529\uc522\uc52d", "\ucfd0\ucfdd\ucfd5\ucfd5\ucfd7\ucfd4\ucfdd\ucfd7", "\ud04b\ud04f\ud04f\ud048\ud04a\ud049\ud048\ud046"}, d2={"\u0166\u0176\u0156\u2109\u013b\u0139\u012f\u014b\u016d\u0166\u0171\u0166\u0128\u016b\u0166\u0169\u0160\u0128\u0154\u0173\u0175\u016e\u0169\u0160\u013c\u012e\u014b\u016d\u0166\u0171\u0166\u0128\u016b\u0166\u0169\u0160\u0128\u0154\u0173\u0175\u016e\u0169\u0160\u013c", "\u056b\u0534\u053b\u053e\u0539\u053e\u0523\u0569\u056b\u0569\u057f\u057e\u0501", "\u0739\u076c\u076b\u076c\u0771\u073b\u0739\u073b\u072d\u072c\u0753", "ZXI~Q\\NN\u0001\u0003\u0015\u0014qW\\K\\\u0012Q\\SZ\u0012~Q\\NN\u0006", "\u0569\u0560\u0572\u0569\u0542\u056e\u0565\u0564\u053d\u053f\u0529\u0528\u0548", "\u00fc\u00e8\u00ec\u00f8\u00f5\u00ea\u00a5\u00a7\u00b1\u00d5\u00f3\u00f8\u00ef\u00f8\u00b6\u00f5\u00f8\u00f7\u00fe\u00b6\u00d6\u00fb\u00f3\u00fc\u00fa\u00ed\u00a2\u00b0\u00c3", "\u0197\u0198\u019b\u019a\u0191\u01c8\u01ca\u01dc\u01dd\u01b8\u019e\u0195\u0182\u0195\u01db\u0198\u0195\u019a\u0193\u01db\u01bb\u0196\u019e\u0191\u0197\u0180\u01cf", "\u0543\u0558\u0564\u0543\u0545\u055e\u0559\u0550\u050b\u0509\u051f\u051e\u057b\u055d\u0556\u0541\u0556\u0518\u055b\u0556\u0559\u0550\u0518\u0564\u0543\u0545\u055e\u0559\u0550\u050c", "\u00d1\u00d0\u00cb\u00d6\u00d9\u00c6\u0083\u0081\u0097\u0096\u00e9", "45.3<#\u001b66fdrs\f", "cu}`(*<=B", "\u06b9\u06af\u06a7\u06ba\u06f2\u06f0\u06e6\u0684\u06e7\u0698", "\u0087\u0091\u0099\u0084\u00c0\u00cc\u00ce\u00d8\u00ba\u00d9\u00a6", "\u068a\u069c\u0694\u0689\u06c1\u06c3\u06d5\u06b7\u06b4\u06d4\u06ab", "\u0169\u0166\u0161\u016e\u0163\u0166\u0175\u016a\u0133\u0131\u0127\u0126\u0159"})
public final class Class3811 {
    public static float field8621 = 0.63688576f;
    public static double field8622 = 0.6525774784741308;
    public static double field8623;
    public static int field8624 = 0;
    public static int field8625 = 5;

    private static String TXVTSMQ8DYOLovei(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite JsOuqXmbOr1ifH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3811.TXVTSMQ8DYOLovei(k2, -431181963));
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
                int a2 = Integer.parseInt(Class3811.TXVTSMQ8DYOLovei(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3811.TXVTSMQ8DYOLovei(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3811.TXVTSMQ8DYOLovei(k2, -431181963) + " " + l2 + " " + m2);
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
        y\u200e = "Hotbar";
        field8623 = Double.longBitsToDouble(4623507967449235456L);
    }
}

