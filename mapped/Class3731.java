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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u5e52\u5e55\u5e52\u5e52\u5e57\u5e54\u5e57\u5e5f", "\ud3f6\ud3f5\ud3f3\ud3f3\ud3f3\ud3f0\ud3f4\ud3f4", "\ub1c0\ub1c3\ub1c5\ub1c0\ub1c6\ub1c1\ub1c2\ub1c0", "\u5bf8\u5bfd\u5bfd\u5bfd\u5bfb\u5bf4\u5bff\u5bfc", "\u1a90\u1a9a\u1a94\u1a97\u1a91\u1a95\u1a91\u1a97", "\u4063\u4067\u4061\u4065\u4063\u4069\u4066\u4065", "\u76d8\u76d4\u76d8\u76d7\u76d5\u76d2\u76d6", "\uc6d2\uc6df\uc6d5\uc6d6\uc6d2\uc6d3\uc6d3\uc6d1", "\u2e0c\u2e09\u2e05\u2e09\u2e0c\u2e08\u2e0e\u2e0d", "\uaeb2\uaebe\uaeb1\uaeb6\uaeb4\uaeb1\uaeb2\uaeb1", "\u3588\u3589\u3584\u358b\u358e\u358a\u3588\u358a", "\u5d4a\u5d4a\u5d4f\u5d4c\u5d4e\u5d48\u5d46", "\ua2cb\ua2ca\ua2c8\ua2c2\ua2cf\ua2cf\ua2c8\ua2cc", "\u3e7e\u3e7e\u3e72\u3e78\u3e72\u3e72\u3e7c\u3e7b", "\u9c4a\u9c4f\u9c4e\u9c49\u9c4c\u9c41\u9c4c\u9c4f", "\u057c\u057b\u057b\u0572\u0572\u0572\u057f\u057f"}, d2={"\u02eb\u02d0\u02ed\u2289\u02bb\u02b9\u02af\u02cb\u02ed\u02e6\u02f1\u02e6\u02a8\u02eb\u02e6\u02e9\u02e0\u02a8\u02d4\u02f3\u02f5\u02ee\u02e9\u02e0\u02bc\u02ae\u02cb\u02ed\u02e6\u02f1\u02e6\u02a8\u02eb\u02e6\u02e9\u02e0\u02a8\u02d4\u02f3\u02f5\u02ee\u02e9\u02e0\u02bc", "\u00f0\u00cb\u00f7\u2092\u00a0\u00a2\u00b4\u00d0\u00f6\u00fd\u00ea\u00fd\u00b3\u00f0\u00fd\u00f2\u00fb\u00b3\u00cf\u00e8\u00ee\u00f5\u00f2\u00fb\u00a7\u00b5\u00d0\u00f6\u00fd\u00ea\u00fd\u00b3\u00f0\u00fd\u00f2\u00fb\u00b3\u00cf\u00e8\u00ee\u00f5\u00f2\u00fb\u00a7", "\u07ce\u0791\u079e\u079b\u079c\u079b\u0786\u07cc\u07ce\u07cc\u07da\u07db\u07a4", "\u0448\u041d\u041a\u041d\u0400\u044a\u0448\u044a\u045c\u045d\u0422", "\u02ae\u02ac\u02bd\u028a\u02a5\u02a8\u02ba\u02ba\u02f5\u02f7\u02e1\u02e0\u0285\u02a3\u02a8\u02bf\u02a8\u02e6\u02a5\u02a8\u02a7\u02ae\u02e6\u028a\u02a5\u02a8\u02ba\u02ba\u02f2", "\u0656\u065f\u064d\u0656\u067d\u0651\u065a\u065b\u0602\u0600\u0616\u0617\u0677", "\u04bb\u04af\u04ab\u04bf\u04b2\u04ad\u04e2\u04e0\u04f6\u0492\u04b4\u04bf\u04a8\u04bf\u04f1\u04b2\u04bf\u04b0\u04b9\u04f1\u0491\u04bc\u04b4\u04bb\u04bd\u04aa\u04e5\u04f7\u0484", "\u05e1\u05ee\u05ed\u05ec\u05e7\u05be\u05bc\u05aa\u05ab\u05ce\u05e8\u05e3\u05f4\u05e3\u05ad\u05ee\u05e3\u05ec\u05e5\u05ad\u05cd\u05e0\u05e8\u05e7\u05e1\u05f6\u05b9", "\u03bd\u03a6\u039a\u03bd\u03bb\u03a0\u03a7\u03ae\u03f5\u03f7\u03e1\u03e0\u0385\u03a3\u03a8\u03bf\u03a8\u03e6\u03a5\u03a8\u03a7\u03ae\u03e6\u039a\u03bd\u03bb\u03a0\u03a7\u03ae\u03f2", "\u03c3\u03c2\u03d9\u03c4\u03cb\u03d4\u0391\u0393\u0385\u0384\u03fb", "\u05be\u05bf\u05a4\u05b9\u05b6\u05a9\u0591\u05bc\u05bc\u05ec\u05ee\u05f8\u05f9\u0586", "\u036d\u037b\u0373\u036e\u0326\u0324\u0332\u0333\u034c", "\u011b\u010d\u0105\u0118\u0150\u0152\u0144\u0126\u0145\u013a", "oyql($&0R1N", "\u02e7\u02f1\u02f9\u02e4\u02ac\u02ae\u02b8\u02da\u02d9\u02b9\u02c6", "\u052b\u0524\u0523\u052c\u0521\u0524\u0537\u0528\u0571\u0573\u0565\u0564\u051b"})
public final class Class3731 {
    public static float field8422 = Float.intBitsToFloat(1052266244);
    public static double field8423;
    public static double field8424;

    static {
        x\u200e = "HighestDistance";
        field8424 = Double.longBitsToDouble(4605380978949069210L);
        aW\u200e = "AnimalsColor";
        field8423 = Double.longBitsToDouble(4597698320031967392L);
    }

    private static String 4FUakB62j0ehMxI0(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite FPstAJ0WSDQxLE(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3731.4FUakB62j0ehMxI0(k2, -917625656));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3731.4FUakB62j0ehMxI0(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 33282 : 33281;
            block7: while (true) {
                switch (n3) {
                    case 33282: {
                        n3 = 33280;
                        continue block7;
                    }
                    case 33281: {
                        String c2 = Class3731.4FUakB62j0ehMxI0(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class3731.4FUakB62j0ehMxI0(k2, -917625656) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

