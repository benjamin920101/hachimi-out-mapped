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

@HACHIMI_CLIENT(mv=100, d1={"\u3ddc\u3dd6\u3dd8\u3dde\u3ddd\u3ddc\u3ddf\u3dda", "\ua0cc\ua0cd\ua0c5\ua0c1\ua0c5\ua0cd\ua0c3", "\ud85b\ud85c\ud85e\ud851\ud85d\ud859\ud85b\ud85c", "\u4325\u4322\u4326\u432e\u4325\u4321\u4321\u432e", "\u57a4\u57a2\u57a3\u57a7\u57a7\u57a2\u57a6\u57a4", "\u0bdb\u0bd6\u0bdc\u0bde\u0bd9\u0bdd\u0bda\u0bde", "\u774e\u774f\u774e\u7740\u774f\u774b\u774b\u774e", "\ucc58\ucc51\ucc5e\ucc5c\ucc5a\ucc5b\ucc5b\ucc5e", "\u4b44\u4b44\u4b41\u4b41\u4b4e\u4b47\u4b45\u4b43", "\u304d\u3048\u304e\u304e\u304f\u3047\u304a\u304f", "\u8c23\u8c27\u8c25\u8c21\u8c26\u8c2f\u8c25", "\u516e\u516c\u516d\u5160\u5168\u516e\u5169\u516a", "\u7d5f\u7d56\u7d54\u7d53\u7d54\u7d56\u7d5f", "\u1d22\u1d28\u1d24\u1d27\u1d25\u1d26\u1d28\u1d26", "\ue1f9\ue1fa\ue1fe\ue1fe\ue1fc\ue1fc\ue1f9\ue1f9"}, d2={"\u0349\u037f\u036d\u2324\u0316\u0314\u0302\u0366\u0340\u034b\u035c\u034b\u0305\u0346\u034b\u0344\u034d\u0305\u0379\u035e\u0358\u0343\u0344\u034d\u0311\u0303\u0366\u0340\u034b\u035c\u034b\u0305\u0346\u034b\u0344\u034d\u0305\u0379\u035e\u0358\u0343\u0344\u034d\u0311", "\u0195\u01ca\u01c5\u01c0\u01c7\u01c0\u01dd\u0197\u0195\u0197\u0181\u0180\u01ff", "\u03fd\u03a8\u03af\u03a8\u03b5\u03ff\u03fd\u03ff\u03e9\u03e8\u0397", "\u0626\u0624\u0635\u0602\u062d\u0620\u0632\u0632\u067d\u067f\u0669\u0668\u060d\u062b\u0620\u0637\u0620\u066e\u062d\u0620\u062f\u0626\u066e\u0602\u062d\u0620\u0632\u0632\u067a", "\u033b\u0332\u0320\u033b\u0310\u033c\u0337\u0336\u036f\u036d\u037b\u037a\u031a", "\u03ed\u03f9\u03fd\u03e9\u03e4\u03fb\u03b4\u03b6\u03a0\u03c4\u03e2\u03e9\u03fe\u03e9\u03a7\u03e4\u03e9\u03e6\u03ef\u03a7\u03c7\u03ea\u03e2\u03ed\u03eb\u03fc\u03b3\u03a1\u03d2", "\u001b\u0014\u0017\u0016\u001dDFPQ4\u0012\u0019\u000e\u0019W\u0014\u0019\u0016\u001fW7\u001a\u0012\u001d\u001b\fC", "\u07a6\u07bd\u0781\u07a6\u07a0\u07bb\u07bc\u07b5\u07ee\u07ec\u07fa\u07fb\u079e\u07b8\u07b3\u07a4\u07b3\u07fd\u07be\u07b3\u07bc\u07b5\u07fd\u0781\u07a6\u07a0\u07bb\u07bc\u07b5\u07e9", "23(5:%`btu\n", "\u00c1\u00c0\u00db\u00c6\u00c9\u00d6\u00ee\u00c3\u00c3\u0093\u0091\u0087\u0086\u00f9", "\u03b1\u03a7\u03af\u03b2\u03fa\u03f8\u03ee\u03ef\u0390", "\u06e1\u06f7\u06ff\u06e2\u06aa\u06a8\u06be\u06dc\u06bf\u06c0", "_IA\\\u0018\u0014\u0016\u0000b\u0001~", "\u02f6\u02e0\u02e8\u02f5\u02bd\u02bf\u02a9\u02cb\u02c8\u02a8\u02d7", "\u0345\u034a\u034d\u0342\u034f\u034a\u0359\u0346\u031f\u031d\u030b\u030a\u0375"})
public final class Class1585 {
    public static float field5920;
    public static double field5921;
    public static double field5922;
    public static int field5923 = 586856856;
    public static float field5924;
    public static int field5925 = 434035134;
    public static int field5926 = 578191436;
    public static float field5927;

    private static String EAwL1iUeqjG1XQie(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        C\u200e = "Slows down the speed to the concealed speed";
        field5921 = Double.longBitsToDouble(4593502172552567384L);
        field5920 = Float.intBitsToFloat(1061515924);
        field5927 = Float.intBitsToFloat(1046047124);
        field5922 = Double.longBitsToDouble(0x404E000000000000L);
        field5924 = Float.intBitsToFloat(1062216295);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite nNzOa9KwpV1bat(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1585.EAwL1iUeqjG1XQie(k2, -775665397));
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
                int a2 = Integer.parseInt(Class1585.EAwL1iUeqjG1XQie(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1585.EAwL1iUeqjG1XQie(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1585.EAwL1iUeqjG1XQie(k2, -775665397) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

