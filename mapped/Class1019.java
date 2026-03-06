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

@HACHIMI_CLIENT(mv=100, d1={"\u20f3\u20f7\u20f3\u20f5\u20f7\u20f2\u20fc\u20f3", "\u4788\u478d\u4781\u478d\u4781\u4789\u478c\u478d", "\u235e\u2355\u235e\u235d\u2359\u235f\u235f\u235d", "\ua29d\ua29b\ua299\ua29c\ua297\ua299\ua297\ua297", "\uc5c2\uc5c2\uc5ca\uc5c3\uc5c1\uc5c6\uc5c2\uc5cb", "\u1a60\u1a67\u1a66\u1a61\u1a63\u1a6f\u1a6f\u1a6e", "\u08c4\u08c9\u08c0\u08c7\u08c7\u08c2\u08c5\u08c6", "\u06a9\u06a1\u06a0\u06a1\u06ab\u06af\u06aa\u06ae", "\u4843\u4845\u484a\u4840\u4844\u4842\u484a\u484b", "\u4428\u4426\u4428\u4426\u4428\u4428\u442b\u4427", "\u34a8\u34a6\u34a7\u34a6\u34ae\u34aa\u34a9\u34a8", "\ud685\ud680\ud681\ud68f\ud68e\ud683\ud686\ud682", "\u1b0e\u1b0f\u1b08\u1b0b\u1b0a\u1b0d\u1b09\u1b09", "\u2799\u2798\u279e\u279c\u2792\u279d\u279b\u2793", "\u3f40\u3f49\u3f47\u3f43\u3f44\u3f41\u3f49"}, d2={"$\u0013:\u205bik}\u0019?4#4z94;2z\u0006!'<;2n|\u0019?4#4z94;2z\u0006!'<;2n", "\u05eb\u05b4\u05bb\u05be\u05b9\u05be\u05a3\u05e9\u05eb\u05e9\u05ff\u05fe\u0581", "\u01b4\u01e1\u01e6\u01e1\u01fc\u01b6\u01b4\u01b6\u01a0\u01a1\u01de", "\u00fc\u00fe\u00ef\u00d8\u00f7\u00fa\u00e8\u00e8\u00a7\u00a5\u00b3\u00b2\u00d7\u00f1\u00fa\u00ed\u00fa\u00b4\u00f7\u00fa\u00f5\u00fc\u00b4\u00d8\u00f7\u00fa\u00e8\u00e8\u00a0", "\u0432\u043b\u0429\u0432\u0419\u0435\u043e\u043f\u0466\u0464\u0472\u0473\u0413", "\u06e3\u06f7\u06f3\u06e7\u06ea\u06f5\u06ba\u06b8\u06ae\u06ca\u06ec\u06e7\u06f0\u06e7\u06a9\u06ea\u06e7\u06e8\u06e1\u06a9\u06c9\u06e4\u06ec\u06e3\u06e5\u06f2\u06bd\u06af\u06dc", "\u06de\u06d1\u06d2\u06d3\u06d8\u0681\u0683\u0695\u0694\u06f1\u06d7\u06dc\u06cb\u06dc\u0692\u06d1\u06dc\u06d3\u06da\u0692\u06f2\u06df\u06d7\u06d8\u06de\u06c9\u0686", "\u0180\u019b\u01a7\u0180\u0186\u019d\u019a\u0193\u01c8\u01ca\u01dc\u01dd\u01b8\u019e\u0195\u0182\u0195\u01db\u0198\u0195\u019a\u0193\u01db\u01a7\u0180\u0186\u019d\u019a\u0193\u01cf", "\u059f\u059e\u0585\u0598\u0597\u0588\u05cd\u05cf\u05d9\u05d8\u05a7", "\u0141\u0140\u015b\u0146\u0149\u0156\u016e\u0143\u0143\u0113\u0111\u0107\u0106\u0179", "\u0693\u0685\u068d\u0690\u06d8\u06da\u06cc\u06cd\u06b2", "\u0362\u0374\u037c\u0361\u0329\u032b\u033d\u035f\u033c\u0343", "\u07fc\u07ea\u07e2\u07ff\u07bb\u07b7\u07b5\u07a3\u07c1\u07a2\u07dd", "\u0429\u043f\u0437\u042a\u0462\u0460\u0476\u0414\u0417\u0477\u0408", "\u04d1\u04de\u04d9\u04d6\u04db\u04de\u04cd\u04d2\u048b\u0489\u049f\u049e\u04e1"})
public final class Class1019 {
    public static double field4213 = Double.longBitsToDouble(4607048889212954279L);
    public static float field4214;
    public static float field4215;
    public static double field4216 = 0.10917277836753347;
    public static float field4217;

    /*
     * WARNING - void declaration
     */
    private static CallSite Ce24zgXyBgXF6j(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1019.nShFgndQa9v4tjlF(k2, 317998589));
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
                int a2 = Integer.parseInt(Class1019.nShFgndQa9v4tjlF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1019.nShFgndQa9v4tjlF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1019.nShFgndQa9v4tjlF(k2, 317998589) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String nShFgndQa9v4tjlF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field4217 = Float.intBitsToFloat(1055971146);
        field4214 = Float.intBitsToFloat(1050481796);
        field4215 = Float.intBitsToFloat(0x3DCCCCCD);
        bW\u200e = "Swap";
    }
}

