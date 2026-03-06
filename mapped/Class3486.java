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

@HACHIMI_CLIENT(mv=100, d1={"\udb27\udb27\udb23\udb25\udb2b\udb24\udb23\udb25", "\u9696\u9693\u9695\u9698\u9695\u9698\u9697\u9699", "\u2a07\u2a01\u2a07\u2a0c\u2a03\u2a02\u2a02\u2a06", "\u042d\u0429\u042c\u042d\u0420\u042a\u0421\u042e", "\u64ba\u64b5\u64b5\u64ba\u64bf\u64bb\u64b8", "\uc608\uc60f\uc60e\uc604\uc605\uc60d\uc60f\uc60c", "\u55be\u55ba\u55b9\u55bf\u55bb\u55b2\u55ba\u55b2", "\u0bc8\u0bc8\u0bce\u0bcb\u0bcf\u0bc9\u0bc6\u0bcd", "\ucd15\ucd14\ucd11\ucd12\ucd16\ucd14\ucd12", "\u65a4\u65a6\u65a3\u65a5\u65a0\u65a5\u65a5\u65a4", "\uc6c9\uc6cb\uc6cb\uc6c1\uc6c9\uc6cf\uc6c8\uc6cc", "\u127f\u127f\u1275\u1275\u1278\u127f\u127f", "\u2f9e\u2f9b\u2f99\u2f9e\u2f9b\u2f99\u2f9f\u2f94", "\ue78a\ue78c\ue788\ue788\ue786\ue788\ue78b\ue78e", "\u8b73\u8b7f\u8b7f\u8b70\u8b75\u8b74\u8b7e\u8b72", "\u1eb2\u1eb9\u1eb6\u1eb6\u1eb8\u1eb5\u1eb0\u1eb7"}, d2={"\u04a6\u0490\u04b6\u24da\u04e8\u04ea\u04fc\u0498\u04be\u04b5\u04a2\u04b5\u04fb\u04b8\u04b5\u04ba\u04b3\u04fb\u0487\u04a0\u04a6\u04bd\u04ba\u04b3\u04ef\u04fd\u0498\u04be\u04b5\u04a2\u04b5\u04fb\u04b8\u04b5\u04ba\u04b3\u04fb\u0487\u04a0\u04a6\u04bd\u04ba\u04b3\u04ef", "\u02d8\u02ee\u02c9\u22a4\u0296\u0294\u0282\u02e6\u02c0\u02cb\u02dc\u02cb\u0285\u02c6\u02cb\u02c4\u02cd\u0285\u02f9\u02de\u02d8\u02c3\u02c4\u02cd\u0291\u0283\u02e6\u02c0\u02cb\u02dc\u02cb\u0285\u02c6\u02cb\u02c4\u02cd\u0285\u02f9\u02de\u02d8\u02c3\u02c4\u02cd\u0291", "\u06a5\u06fa\u06f5\u06f0\u06f7\u06f0\u06ed\u06a7\u06a5\u06a7\u06b1\u06b0\u06cf", "\u03c8\u039d\u039a\u039d\u0380\u03ca\u03c8\u03ca\u03dc\u03dd\u03a2", "\u052a\u0528\u0539\u050e\u0521\u052c\u053e\u053e\u0571\u0573\u0565\u0564\u0501\u0527\u052c\u053b\u052c\u0562\u0521\u052c\u0523\u052a\u0562\u050e\u0521\u052c\u053e\u053e\u0576", "\u0432\u043b\u0429\u0432\u0419\u0435\u043e\u043f\u0466\u0464\u0472\u0473\u0413", "\u0330\u0324\u0320\u0334\u0339\u0326\u0369\u036b\u037d\u0319\u033f\u0334\u0323\u0334\u037a\u0339\u0334\u033b\u0332\u037a\u031a\u0337\u033f\u0330\u0336\u0321\u036e\u037c\u030f", "\u0152\u015d\u015e\u015f\u0154\u010d\u010f\u0119\u0118\u017d\u015b\u0150\u0147\u0150\u011e\u015d\u0150\u015f\u0156\u011e\u017e\u0153\u015b\u0154\u0152\u0145\u010a", "\u02ac\u02b7\u028b\u02ac\u02aa\u02b1\u02b6\u02bf\u02e4\u02e6\u02f0\u02f1\u0294\u02b2\u02b9\u02ae\u02b9\u02f7\u02b4\u02b9\u02b6\u02bf\u02f7\u028b\u02ac\u02aa\u02b1\u02b6\u02bf\u02e3", "\u04f0\u04f1\u04ea\u04f7\u04f8\u04e7\u04a2\u04a0\u04b6\u04b7\u04c8", "\u01cb\u01ca\u01d1\u01cc\u01c3\u01dc\u01e4\u01c9\u01c9\u0199\u019b\u018d\u018c\u01f3", "\u0374\u0362\u036a\u0377\u033f\u033d\u032b\u032a\u0355", "YOGZ\u0012\u0010\u0006d\u0007x", "\u0589\u059f\u0597\u058a\u05ce\u05c2\u05c0\u05d6\u05b4\u05d7\u05a8", "\u0667\u0671\u0679\u0664\u062c\u062e\u0638\u065a\u0659\u0639\u0646", "\u069a\u0695\u0692\u069d\u0690\u0695\u0686\u0699\u06c0\u06c2\u06d4\u06d5\u06aa"})
public final class Class3486 {
    public static float field7661;
    public static double field7662;
    public static double field7663;
    public static float field7664;
    public static double field7665;
    public static float field7666;
    public static float field7667;

    static {
        field7663 = Double.longBitsToDouble(4600124464935381862L);
        field7666 = Float.intBitsToFloat(991690240);
        field7664 = Float.intBitsToFloat(1036317968);
        field7667 = Float.intBitsToFloat(1059384844);
        ar\u200e = "Binds";
        field7662 = Double.longBitsToDouble(4599442312750238374L);
        field7661 = Float.intBitsToFloat(1057142190);
        field7665 = Double.longBitsToDouble(0x4024000000000000L);
        by\u200e = "Allow baritone to jump up blocks";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite DzWt1NGSJVCyHn(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3486.ykBjOVtlxc9xioqr(k2, -281162501));
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
                int a2 = Integer.parseInt(Class3486.ykBjOVtlxc9xioqr(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3486.ykBjOVtlxc9xioqr(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3486.ykBjOVtlxc9xioqr(k2, -281162501) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String ykBjOVtlxc9xioqr(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

