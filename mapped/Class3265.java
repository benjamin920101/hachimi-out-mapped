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

@HACHIMI_CLIENT(mv=100, d1={"\u38a3\u38a6\u38a3\u38a2\u38a3\u38a1\u38a2\u38a1", "\u75ae\u75ab\u75ad\u75af\u75ab\u75a9\u75a8\u75a8", "\u3760\u3762\u3765\u3764\u3765\u3767\u3764\u3761", "\u1ba3\u1bab\u1ba4\u1ba4\u1ba2\u1baa\u1ba4\u1baa", "\ubf00\ubf01\ubf04\ubf0b\ubf01\ubf02\ubf05\ubf07", "\u740a\u740e\u7409\u740e\u7409\u740f\u7406\u7407", "\u028b\u0288\u028b\u028c\u028e\u028c\u0287\u028b", "\u56dd\u56df\u56d9\u56d8\u56d8\u56df\u56dd\u56db", "\u3d6f\u3d6e\u3d6e\u3d6f\u3d6a\u3d62\u3d6a\u3d6e", "\u43c4\u43c3\u43c4\u43c0\u43c2\u43c6\u43c1\u43c1", "\u10fd\u10f6\u10fb\u10fd\u10f9\u10f8\u10f6\u10ff", "\u1027\u1024\u1024\u1020\u1027\u1029\u1020\u1022", "\u8d39\u8d38\u8d3d\u8d39\u8d30\u8d39\u8d3b\u8d3e", "\u60f7\u60f3\u60f1\u60f0\u60f1\u60f2\u60fc\u60f6", "\u09ca\u09cb\u09c4\u09cf\u09cb\u09c5\u09cb\u09c5"}, d2={"\u01a6\u0193\u019f\u21d8\u01ea\u01e8\u01fe\u019a\u01bc\u01b7\u01a0\u01b7\u01f9\u01ba\u01b7\u01b8\u01b1\u01f9\u0185\u01a2\u01a4\u01bf\u01b8\u01b1\u01ed\u01ff\u019a\u01bc\u01b7\u01a0\u01b7\u01f9\u01ba\u01b7\u01b8\u01b1\u01f9\u0185\u01a2\u01a4\u01bf\u01b8\u01b1\u01ed", "\u04fa\u04a5\u04aa\u04af\u04a8\u04af\u04b2\u04f8\u04fa\u04f8\u04ee\u04ef\u0490", "\u0089\u00dc\u00db\u00dc\u00c1\u008b\u0089\u008b\u009d\u009c\u00e3", "\u04cd\u04cf\u04de\u04e9\u04c6\u04cb\u04d9\u04d9\u0496\u0494\u0482\u0483\u04e6\u04c0\u04cb\u04dc\u04cb\u0485\u04c6\u04cb\u04c4\u04cd\u0485\u04e9\u04c6\u04cb\u04d9\u04d9\u0491", "2;)2\u00195>?fdrs\u0013", "\u02f3\u02e7\u02e3\u02f7\u02fa\u02e5\u02aa\u02a8\u02be\u02da\u02fc\u02f7\u02e0\u02f7\u02b9\u02fa\u02f7\u02f8\u02f1\u02b9\u02d9\u02f4\u02fc\u02f3\u02f5\u02e2\u02ad\u02bf\u02cc", "\u029d\u0292\u0291\u0290\u029b\u02c2\u02c0\u02d6\u02d7\u02b2\u0294\u029f\u0288\u029f\u02d1\u0292\u029f\u0290\u0299\u02d1\u02b1\u029c\u0294\u029b\u029d\u028a\u02c5", "\u03c6\u03dd\u03e1\u03c6\u03c0\u03db\u03dc\u03d5\u038e\u038c\u039a\u039b\u03fe\u03d8\u03d3\u03c4\u03d3\u039d\u03de\u03d3\u03dc\u03d5\u039d\u03e1\u03c6\u03c0\u03db\u03dc\u03d5\u0389", "\u0136\u0137\u012c\u0131\u013e\u0121\u0164\u0166\u0170\u0171\u010e", "\u02b2\u02b3\u02a8\u02b5\u02ba\u02a5\u029d\u02b0\u02b0\u02e0\u02e2\u02f4\u02f5\u028a", "\u04f1\u04e7\u04ef\u04f2\u04ba\u04b8\u04ae\u04af\u04d0", "\u00e9\u00ff\u00f7\u00ea\u00a2\u00a0\u00b6\u00d4\u00b7\u00c8", "\u02ff\u02e9\u02e1\u02fc\u02b8\u02b4\u02b6\u02a0\u02c2\u02a1\u02de", "\u0780\u0796\u079e\u0783\u07cb\u07c9\u07df\u07bd\u07be\u07de\u07a1", "\u0434\u043b\u043c\u0433\u043e\u043b\u0428\u0437\u046e\u046c\u047a\u047b\u0404"})
public final class Class3265 {
    public static float field7007;
    public static float field7008 = 0.13041621f;

    static {
        H\u200e = "Drops items from the hotbar faster";
        field7007 = Float.intBitsToFloat(1054806594);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite GSnhVKDMKtK2v7(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3265.VtL31rlbgRTLvOQ7(k2, 1407213258));
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
                int a2 = Integer.parseInt(Class3265.VtL31rlbgRTLvOQ7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3265.VtL31rlbgRTLvOQ7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3265.VtL31rlbgRTLvOQ7(k2, 1407213258) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String VtL31rlbgRTLvOQ7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

