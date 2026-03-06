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

@HACHIMI_CLIENT(mv=100, d1={"\u5c88\u5c8e\u5c8a\u5c89\u5c89\u5c8c\u5c88\u5c88", "\ude4b\ude4e\ude4f\ude49\ude47\ude4c\ude4a", "\uad2e\uad26\uad2b\uad2f\uad2f\uad2c\uad2b\uad2b", "\u5a35\u5a31\u5a3e\u5a33\u5a35\u5a3f\u5a36\u5a36", "\u37f7\u37f2\u37f7\u37f3\u37f5\u37f0\u37fa\u37f3", "\u6681\u6684\u6682\u6687\u668a\u6680\u6685\u6687", "\u430e\u4308\u430c\u430d\u4304\u430a\u4304\u430f", "\u5fa2\u5fa2\u5fa1\u5fa2\u5fa7\u5fa0\u5fa7\u5fae", "\uafe6\uafeb\uafe1\uafe1\uafe3\uafe7\uafe3", "\u10cf\u10ce\u10ce\u10cd\u10ce\u10cf\u10ce\u10c9", "\u2c60\u2c66\u2c62\u2c6c\u2c64\u2c66\u2c67\u2c65", "\ucc1b\ucc10\ucc1e\ucc1c\ucc1d\ucc1a\ucc18\ucc18", "\u3ba4\u3ba4\u3ba2\u3ba4\u3ba1\u3bab\u3ba4\u3ba1", "\u5389\u5381\u538d\u538d\u538e\u5389\u538a\u5380"}, d2={"\u018a\u01d5\u01da\u01df\u01d8\u01df\u01c2\u0188\u018a\u0188\u019e\u019f\u01e0", "\u0375\u0320\u0327\u0320\u033d\u0377\u0375\u0377\u0361\u0360\u031f", "\u03a3\u03a1\u03b0\u0387\u03a8\u03a5\u03b7\u03b7\u03f8\u03fa\u03ec\u03ed\u0388\u03ae\u03a5\u03b2\u03a5\u03eb\u03a8\u03a5\u03aa\u03a3\u03eb\u0387\u03a8\u03a5\u03b7\u03b7\u03ff", "\u00a1\u00a8\u00ba\u00a1\u008a\u00a6\u00ad\u00ac\u00f5\u00f7\u00e1\u00e0\u0080", "\u036c\u0378\u037c\u0368\u0365\u037a\u0335\u0337\u0321\u0345\u0363\u0368\u037f\u0368\u0326\u0365\u0368\u0367\u036e\u0326\u0346\u036b\u0363\u036c\u036a\u037d\u0332\u0320\u0353", "\u0674\u067b\u0678\u0679\u0672\u062b\u0629\u063f\u063e\u065b\u067d\u0676\u0661\u0676\u0638\u067b\u0676\u0679\u0670\u0638\u0658\u0675\u067d\u0672\u0674\u0663\u062c", "\u04aa\u04b1\u048d\u04aa\u04ac\u04b7\u04b0\u04b9\u04e2\u04e0\u04f6\u04f7\u0492\u04b4\u04bf\u04a8\u04bf\u04f1\u04b2\u04bf\u04b0\u04b9\u04f1\u048d\u04aa\u04ac\u04b7\u04b0\u04b9\u04e5", "\u060a\u060b\u0610\u060d\u0602\u061d\u0658\u065a\u064c\u064d\u0632", "\u0377\u0376\u036d\u0370\u037f\u0360\u0358\u0375\u0375\u0325\u0327\u0331\u0330\u034f", "\u05fc\u05ea\u05e2\u05ff\u05b7\u05b5\u05a3\u05a2\u05dd", "\u01c2\u01d4\u01dc\u01c1\u0189\u018b\u019d\u01ff\u019c\u01e3", "\u054e\u0558\u0550\u054d\u0509\u0505\u0507\u0511\u0573\u0510\u056f", "\u0134\u0122\u012a\u0137\u017f\u017d\u016b\u0109\u010a\u016a\u0115", "\u05af\u05a0\u05a7\u05a8\u05a5\u05a0\u05b3\u05ac\u05f5\u05f7\u05e1\u05e0\u059f"})
public final class Class3634 {
    public static double field8119 = Double.longBitsToDouble(0x400A000000000000L);

    private static String N4GieQoHBN3kFNTn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite nHyF5K0mLaqzcj(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3634.N4GieQoHBN3kFNTn(k2, 1794394537));
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
                int a2 = Integer.parseInt(Class3634.N4GieQoHBN3kFNTn(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3634.N4GieQoHBN3kFNTn(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3634.N4GieQoHBN3kFNTn(k2, 1794394537) + " " + l2 + " " + m2);
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

