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

@HACHIMI_CLIENT(mv=100, d1={"\ucca6\ucca6\ucca6\ucca2\ucca3\ucca5\ucca7\ucca7", "\u07bd\u07bf\u07b1\u07bd\u07b8\u07b0\u07b0\u07b1", "\uc917\uc911\uc917\uc912\uc91c\uc913\uc91d\uc917", "\u3e68\u3e62\u3e6b\u3e69\u3e6e\u3e6c\u3e62\u3e63", "\u07f1\u07fc\u07f9\u07f9\u07f1\u07f1\u07f0", "\u174a\u174a\u174b\u174c\u1745\u1744\u1749\u174e", "\ucd07\ucd07\ucd02\ucd08\ucd08\ucd01\ucd03\ucd06", "\ub3da\ub3d7\ub3d8\ub3d9\ub3d6\ub3dd\ub3d9\ub3da", "\u76b5\u76b0\u76b9\u76b2\u76b6\u76b8\u76b1", "\ubcd2\ubcd6\ubcd6\ubcd7\ubcd7\ubcd7\ubcd6\ubcd3", "\uc660\uc666\uc66e\uc660\uc661\uc666\uc662", "\u513b\u5138\u513c\u5139\u5134\u513d\u513a", "\u3228\u3225\u3222\u3229\u3224\u3226\u3227", "\u807d\u807e\u807a\u8076\u807d\u807b\u8077\u807e", "\u40db\u40da\u40dd\u40db\u40db\u40dc\u40d8\u40d1"}, d2={"\u06c9\u06e5\u06fb\u26a3\u0691\u0693\u0685\u06e1\u06c7\u06cc\u06db\u06cc\u0682\u06c1\u06cc\u06c3\u06ca\u0682\u06fe\u06d9\u06df\u06c4\u06c3\u06ca\u0696\u0684\u06e1\u06c7\u06cc\u06db\u06cc\u0682\u06c1\u06cc\u06c3\u06ca\u0682\u06fe\u06d9\u06df\u06c4\u06c3\u06ca\u0696", "\u07d8\u0787\u0788\u078d\u078a\u078d\u0790\u07da\u07d8\u07da\u07cc\u07cd\u07b2", "\u055b\u050e\u0509\u050e\u0513\u0559\u055b\u0559\u054f\u054e\u0531", "\u00c3\u00c1\u00d0\u00e7\u00c8\u00c5\u00d7\u00d7\u0098\u009a\u008c\u008d\u00e8\u00ce\u00c5\u00d2\u00c5\u008b\u00c8\u00c5\u00ca\u00c3\u008b\u00e7\u00c8\u00c5\u00d7\u00d7\u009f", "\u0544\u054d\u055f\u0544\u056f\u0543\u0548\u0549\u0510\u0512\u0504\u0505\u0565", "\u0225\u0231\u0235\u0221\u022c\u0233\u027c\u027e\u0268\u020c\u022a\u0221\u0236\u0221\u026f\u022c\u0221\u022e\u0227\u026f\u020f\u0222\u022a\u0225\u0223\u0234\u027b\u0269\u021a", "\u06f0\u06ff\u06fc\u06fd\u06f6\u06af\u06ad\u06bb\u06ba\u06df\u06f9\u06f2\u06e5\u06f2\u06bc\u06ff\u06f2\u06fd\u06f4\u06bc\u06dc\u06f1\u06f9\u06f6\u06f0\u06e7\u06a8", "\u07f1\u07ea\u07d6\u07f1\u07f7\u07ec\u07eb\u07e2\u07b9\u07bb\u07ad\u07ac\u07c9\u07ef\u07e4\u07f3\u07e4\u07aa\u07e9\u07e4\u07eb\u07e2\u07aa\u07d6\u07f1\u07f7\u07ec\u07eb\u07e2\u07be", "\u0302\u0303\u0318\u0305\u030a\u0315\u0350\u0352\u0344\u0345\u033a", "\u06a0\u06a1\u06ba\u06a7\u06a8\u06b7\u068f\u06a2\u06a2\u06f2\u06f0\u06e6\u06e7\u0698", "\u02e2\u02f4\u02fc\u02e1\u02a9\u02ab\u02bd\u02bc\u02c3", "\u0205\u0213\u021b\u0206\u024e\u024c\u025a\u0238\u025b\u0224", "\u0378\u036e\u0366\u037b\u033f\u0333\u0331\u0327\u0345\u0326\u0359", "\u0704\u0712\u071a\u0707\u074f\u074d\u075b\u0739\u073a\u075a\u0725", "\u0553\u055c\u055b\u0554\u0559\u055c\u054f\u0550\u0509\u050b\u051d\u051c\u0563"})
public final class Class1088 {
    public static int field4415 = 1069889348;
    public static double field4416;
    public static float field4417;
    public static long field4418 = -178469587925176356L;

    /*
     * WARNING - void declaration
     */
    private static CallSite JtQbygSVwYNXjI(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1088.NPADD4e942n1Y63K(k2, -570743287));
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
                int a2 = Integer.parseInt(Class1088.NPADD4e942n1Y63K(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1088.NPADD4e942n1Y63K(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1088.NPADD4e942n1Y63K(k2, -570743287) + " " + l2 + " " + m2);
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
        field4417 = Float.intBitsToFloat(1052702818);
        field4416 = Double.longBitsToDouble(4603185123528856540L);
        aD\u200e = "Prevents the block Hud overlay from rendering";
    }

    private static String NPADD4e942n1Y63K(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

