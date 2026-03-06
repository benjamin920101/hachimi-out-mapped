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

@HACHIMI_CLIENT(mv=100, d1={"\ubd91\ubd9e\ubd9d\ubd9a\ubd91\ubd9e\ubd9c", "\u5b08\u5b0c\u5b0e\u5b08\u5b01\u5b0a\u5b0c", "\udb7d\udb76\udb77\udb76\udb7b\udb7d\udb7f\udb7f", "\u366e\u366a\u366f\u366e\u366a\u366d\u3669\u366f", "\u9b29\u9b28\u9b28\u9b2a\u9b29\u9b2f\u9b2d\u9b2f", "\ud9ff\ud9f5\ud9f9\ud9fd\ud9f9\ud9f5\ud9f5\ud9f4", "\uaa63\uaa65\uaa64\uaa64\uaa6e\uaa66\uaa66\uaa61", "\u0935\u093b\u093e\u0935\u093d\u0935\u093f", "\ub9be\ub9b8\ub9bf\ub9bd\ub9be\ub9bd\ub9bb\ub9b7", "\ue313\ue315\ue313\ue31f\ue31f\ue31e\ue31f\ue315", "\udbde\udbd8\udbdd\udbde\udbdc\udbde\udbd2\udbd2", "\ua34b\ua34e\ua341\ua34e\ua34f\ua349\ua340\ua340", "\u076b\u076c\u076d\u0763\u076c\u0763\u076f\u076c", "\u9cd7\u9cd8\u9cd7\u9cd1\u9cd3\u9cd6\u9cd2\u9cd6"}, d2={"\u06e9\u06b6\u06b9\u06bc\u06bb\u06bc\u06a1\u06eb\u06e9\u06eb\u06fd\u06fc\u0683", "\u0419\u044c\u044b\u044c\u0451\u041b\u0419\u041b\u040d\u040c\u0473", "\u053e\u053c\u052d\u051a\u0535\u0538\u052a\u052a\u0565\u0567\u0571\u0570\u0515\u0533\u0538\u052f\u0538\u0576\u0535\u0538\u0537\u053e\u0576\u051a\u0535\u0538\u052a\u052a\u0562", "\u009d\u0094\u0086\u009d\u00b6\u009a\u0091\u0090\u00c9\u00cb\u00dd\u00dc\u00bc", "\u00a9\u00bd\u00b9\u00ad\u00a0\u00bf\u00f0\u00f2\u00e4\u0080\u00a6\u00ad\u00ba\u00ad\u00e3\u00a0\u00ad\u00a2\u00ab\u00e3\u0083\u00ae\u00a6\u00a9\u00af\u00b8\u00f7\u00e5\u0096", "\u042f\u0420\u0423\u0422\u0429\u0470\u0472\u0464\u0465\u0400\u0426\u042d\u043a\u042d\u0463\u0420\u042d\u0422\u042b\u0463\u0403\u042e\u0426\u0429\u042f\u0438\u0477", "\u041a\u0401\u043d\u041a\u041c\u0407\u0400\u0409\u0452\u0450\u0446\u0447\u0422\u0404\u040f\u0418\u040f\u0441\u0402\u040f\u0400\u0409\u0441\u043d\u041a\u041c\u0407\u0400\u0409\u0455", "\u05df\u05de\u05c5\u05d8\u05d7\u05c8\u058d\u058f\u0599\u0598\u05e7", "=<':5*\u0012??om{z\u0005", "\u074e\u0758\u0750\u074d\u0705\u0707\u0711\u0710\u076f", "\u023d\u022b\u0223\u023e\u0276\u0274\u0262\u0200\u0263\u021c", "\u06e9\u06ff\u06f7\u06ea\u06ae\u06a2\u06a0\u06b6\u06d4\u06b7\u06c8", "\u017d\u016b\u0163\u017e\u0136\u0134\u0122\u0140\u0143\u0123\u015c", "\u0334\u033b\u033c\u0333\u033e\u033b\u0328\u0337\u036e\u036c\u037a\u037b\u0304"})
public final class Class5638 {
    public static double field10788 = Double.longBitsToDouble(4605362402290027921L);
    public static double field10789 = 0.4985910765293714;
    public static int field10790 = -430129602;
    public static float field10791 = Float.intBitsToFloat(1045293868);

    private static String AnDjVxYcVrIQ2T4n(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite asyaysbNNRs1RO(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5638.AnDjVxYcVrIQ2T4n(k2, -1672489912));
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
                int a2 = Integer.parseInt(Class5638.AnDjVxYcVrIQ2T4n(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5638.AnDjVxYcVrIQ2T4n(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5638.AnDjVxYcVrIQ2T4n(k2, -1672489912) + " " + l2 + " " + m2);
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

