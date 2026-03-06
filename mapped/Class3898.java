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
@HACHIMI_CLIENT(mv=100, d1={"\u6aa7\u6aa4\u6aa6\u6aaa\u6aa5\u6aa1\u6aa3\u6aaa", "\uaaec\uaaef\uaae7\uaaee\uaaef\uaaef\uaae8\uaaef", "\u6048\u604a\u604f\u604d\u604b\u6042\u604c\u6049", "\u72ba\u72b6\u72b6\u72b8\u72b8\u72be\u72b8\u72b8", "\u24cc\u24cb\u24c1\u24ce\u24ca\u24cd\u24cb\u24c8", "\u89fe\u89f4\u89fd\u89f9\u89f8\u89fc\u89fc\u89ff", "\u9ae4\u9ae3\u9ae1\u9ae2\u9ae3\u9ae9\u9ae8\u9ae5", "\u34d0\u34d4\u34d3\u34d2\u34de\u34d5\u34df\u34d4", "\u8cff\u8cfd\u8cfb\u8cff\u8cfb\u8cf8\u8cfa\u8cff", "\u877e\u877b\u877a\u877c\u8775\u8779\u877e\u877b", "\u902d\u9029\u9029\u9021\u902e\u902b\u902d\u9029", "\u8910\u8912\u891d\u8913\u8911\u891c\u8910\u8913", "\uad03\uad00\uad00\uad06\uad01\uad00\uad06\uad04", "\u6de2\u6de1\u6de6\u6de0\u6de7\u6de4\u6de7\u6de5", "\ue2c4\ue2cd\ue2cd\ue2c2\ue2cd\ue2c4\ue2c4\ue2c6", "\u0d8b\u0d81\u0d8c\u0d8a\u0d88\u0d8a\u0d88\u0d8f"}, d2={"\u009b\u00a8\u00af\u20f2\u00c0\u00c2\u00d4\u00b0\u0096\u009d\u008a\u009d\u00d3\u0090\u009d\u0092\u009b\u00d3\u00af\u0088\u008e\u0095\u0092\u009b\u00c7\u00d5\u00b0\u0096\u009d\u008a\u009d\u00d3\u0090\u009d\u0092\u009b\u00d3\u00af\u0088\u008e\u0095\u0092\u009b\u00c7", "\u0579\u054a\u054a\u2510\u0522\u0520\u0536\u0552\u0574\u057f\u0568\u057f\u0531\u0572\u057f\u0570\u0579\u0531\u054d\u056a\u056c\u0577\u0570\u0579\u0525\u0537\u0552\u0574\u057f\u0568\u057f\u0531\u0572\u057f\u0570\u0579\u0531\u054d\u056a\u056c\u0577\u0570\u0579\u0525", "\u01f0\u01af\u01a0\u01a5\u01a2\u01a5\u01b8\u01f2\u01f0\u01f2\u01e4\u01e5\u019a", "\u049e\u04cb\u04cc\u04cb\u04d6\u049c\u049e\u049c\u048a\u048b\u04f4", "\u0273\u0271\u0260\u0257\u0278\u0275\u0267\u0267\u0228\u022a\u023c\u023d\u0258\u027e\u0275\u0262\u0275\u023b\u0278\u0275\u027a\u0273\u023b\u0257\u0278\u0275\u0267\u0267\u022f", "\u0265\u026c\u027e\u0265\u024e\u0262\u0269\u0268\u0231\u0233\u0225\u0224\u0244", "\u02ef\u02fb\u02ff\u02eb\u02e6\u02f9\u02b6\u02b4\u02a2\u02c6\u02e0\u02eb\u02fc\u02eb\u02a5\u02e6\u02eb\u02e4\u02ed\u02a5\u02c5\u02e8\u02e0\u02ef\u02e9\u02fe\u02b1\u02a3\u02d0", "\u06c7\u06c8\u06cb\u06ca\u06c1\u0698\u069a\u068c\u068d\u06e8\u06ce\u06c5\u06d2\u06c5\u068b\u06c8\u06c5\u06ca\u06c3\u068b\u06eb\u06c6\u06ce\u06c1\u06c7\u06d0\u069f", "\u04f3\u04e8\u04d4\u04f3\u04f5\u04ee\u04e9\u04e0\u04bb\u04b9\u04af\u04ae\u04cb\u04ed\u04e6\u04f1\u04e6\u04a8\u04eb\u04e6\u04e9\u04e0\u04a8\u04d4\u04f3\u04f5\u04ee\u04e9\u04e0\u04bc", "\u07ee\u07ef\u07f4\u07e9\u07e6\u07f9\u07bc\u07be\u07a8\u07a9\u07d6", "\u03d2\u03d3\u03c8\u03d5\u03da\u03c5\u03fd\u03d0\u03d0\u0380\u0382\u0394\u0395\u03ea", "\u070e\u0718\u0710\u070d\u0745\u0747\u0751\u0750\u072f", "\u022e\u0238\u0230\u022d\u0265\u0267\u0271\u0213\u0270\u020f", "\u0421\u0437\u043f\u0422\u0466\u046a\u0468\u047e\u041c\u047f\u0400", "\u0164\u0172\u017a\u0167\u012f\u012d\u013b\u0159\u015a\u013a\u0145", "\u071e\u0711\u0716\u0719\u0714\u0711\u0702\u071d\u0744\u0746\u0750\u0751\u072e"})
public final class Class3898 {
    public static int field8875 = -1983209887;
    public static float field8876 = Float.intBitsToFloat(1061409559);

    private static String ILz2aDM4yjt2S20b(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        as\u200e = "NoSlotSet";
        aC\u200e = "Break block desync server";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 9grwdZQK191GPf(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3898.ILz2aDM4yjt2S20b(k2, -570033441));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block10: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3898.ILz2aDM4yjt2S20b(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 59869 : 59868;
            block11: while (true) {
                switch (n3) {
                    case 59869: {
                        n3 = 59867;
                        continue block11;
                    }
                    case 59868: {
                        String c2 = Class3898.ILz2aDM4yjt2S20b(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block10;
                    }
                    default: {
                        continue block10;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3898.ILz2aDM4yjt2S20b(k2, -570033441) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n4 = n2 != 1 ? 43286 : 43285;
        block12: while (true) {
            switch (n4) {
                case 43286: {
                    n4 = 43284;
                    continue block12;
                }
                case 43285: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

