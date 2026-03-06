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

@HACHIMI_CLIENT(mv=100, d1={"\u895e\u8959\u895a\u895e\u8958\u8950\u8950\u895d", "\u3b8f\u3b82\u3b88\u3b89\u3b83\u3b8f\u3b83\u3b8c", "\uc6df\uc6df\uc6df\uc6dd\uc6db\uc6dc\uc6df\uc6d4", "\u5b62\u5b63\u5b64\u5b66\u5b60\u5b69\u5b69", "\u3b82\u3b80\u3b80\u3b8f\u3b82\u3b82\u3b80\u3b80", "\uc46b\uc465\uc46a\uc46c\uc464\uc469\uc464\uc46d", "\u00ca\u00ce\u00ca\u00ce\u00cc\u00c0\u00c0\u00cd", "\uce7f\uce73\uce7f\uce7f\uce7a\uce78\uce7f\uce79", "\u8fd0\u8fdf\u8fdf\u8fd3\u8fd0\u8fd1\u8fd3\u8fd0", "\ua810\ua815\ua817\ua817\ua815\ua81f\ua816\ua81f", "\uadca\uadcd\uadcc\uadcf\uadcc\uadc5\uadcc\uadc4", "\u52b5\u52bb\u52be\u52b4\u52b5\u52be\u52bf", "\udf40\udf40\udf48\udf47\udf49\udf47\udf41\udf40", "\u0e52\u0e54\u0e51\u0e59\u0e53\u0e56\u0e54\u0e55", "\u93f2\u93f1\u93f7\u93fb\u93f6\u93f1\u93f7\u93f3", "\u0990\u0994\u0996\u0997\u0996\u0996\u099b"}, d2={"\u010c\u012b\u013c\u2170\u0142\u0140\u0156\u0132\u0114\u011f\u0108\u011f\u0151\u0112\u011f\u0110\u0119\u0151\u012d\u010a\u010c\u0117\u0110\u0119\u0145\u0157\u0132\u0114\u011f\u0108\u011f\u0151\u0112\u011f\u0110\u0119\u0151\u012d\u010a\u010c\u0117\u0110\u0119\u0145", "\u07ae\u0789\u079f\u27d2\u07e0\u07e2\u07f4\u0790\u07b6\u07bd\u07aa\u07bd\u07f3\u07b0\u07bd\u07b2\u07bb\u07f3\u078f\u07a8\u07ae\u07b5\u07b2\u07bb\u07e7\u07f5\u0790\u07b6\u07bd\u07aa\u07bd\u07f3\u07b0\u07bd\u07b2\u07bb\u07f3\u078f\u07a8\u07ae\u07b5\u07b2\u07bb\u07e7", "\u059d\u05c2\u05cd\u05c8\u05cf\u05c8\u05d5\u059f\u059d\u059f\u0589\u0588\u05f7", "\u015d\u0108\u010f\u0108\u0115\u015f\u015d\u015f\u0149\u0148\u0137", "\u0570\u0572\u0563\u0554\u057b\u0576\u0564\u0564\u052b\u0529\u053f\u053e\u055b\u057d\u0576\u0561\u0576\u0538\u057b\u0576\u0579\u0570\u0538\u0554\u057b\u0576\u0564\u0564\u052c", "\u0766\u076f\u077d\u0766\u074d\u0761\u076a\u076b\u0732\u0730\u0726\u0727\u0747", "\u0795\u0781\u0785\u0791\u079c\u0783\u07cc\u07ce\u07d8\u07bc\u079a\u0791\u0786\u0791\u07df\u079c\u0791\u079e\u0797\u07df\u07bf\u0792\u079a\u0795\u0793\u0784\u07cb\u07d9\u07aa", "\u069a\u0695\u0696\u0697\u069c\u06c5\u06c7\u06d1\u06d0\u06b5\u0693\u0698\u068f\u0698\u06d6\u0695\u0698\u0697\u069e\u06d6\u06b6\u069b\u0693\u069c\u069a\u068d\u06c2", "\u01b4\u01af\u0193\u01b4\u01b2\u01a9\u01ae\u01a7\u01fc\u01fe\u01e8\u01e9\u018c\u01aa\u01a1\u01b6\u01a1\u01ef\u01ac\u01a1\u01ae\u01a7\u01ef\u0193\u01b4\u01b2\u01a9\u01ae\u01a7\u01fb", "\u05a9\u05a8\u05b3\u05ae\u05a1\u05be\u05fb\u05f9\u05ef\u05ee\u0591", "\u0629\u0628\u0633\u062e\u0621\u063e\u0606\u062b\u062b\u067b\u0679\u066f\u066e\u0611", "\u001f\t\u0001\u001cTV@A>", "\u0454\u0442\u044a\u0457\u041f\u041d\u040b\u0469\u040a\u0475", "\u0126\u0130\u0138\u0125\u0161\u016d\u016f\u0179\u011b\u0178\u0107", "\u03e6\u03f0\u03f8\u03e5\u03ad\u03af\u03b9\u03db\u03d8\u03b8\u03c7", "\u00ee\u00e1\u00e6\u00e9\u00e4\u00e1\u00f2\u00ed\u00b4\u00b6\u00a0\u00a1\u00de"})
public final class Class3703 {
    public static float field8335 = Float.intBitsToFloat(1062475821);

    static {
        Q\u200e = "DEGREES";
        bH\u200e = "";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite G4H9QSMbOoRBCv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3703.USdw2FqY0i68J7TQ(k2, -8177177));
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
                int a2 = Integer.parseInt(Class3703.USdw2FqY0i68J7TQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3703.USdw2FqY0i68J7TQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3703.USdw2FqY0i68J7TQ(k2, -8177177) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String USdw2FqY0i68J7TQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

