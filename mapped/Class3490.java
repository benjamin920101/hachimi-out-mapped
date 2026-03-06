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

@HACHIMI_CLIENT(mv=100, d1={"\uc7e5\uc7ea\uc7ef\uc7e5\uc7e4\uc7e8\uc7ed", "\u27a3\u27a4\u27a4\u27a3\u27a4\u27a0\u27a7\u27a4", "\u4ecb\u4ec7\u4ecf\u4ec7\u4ecd\u4ec8\u4ecd\u4ecd", "\ue177\ue176\ue172\ue171\ue174\ue170\ue173", "\u0d65\u0d61\u0d61\u0d60\u0d63\u0d63\u0d6c\u0d6d", "\ua125\ua122\ua124\ua120\ua126\ua129\ua125\ua122", "\ue1e8\ue1ea\ue1e4\ue1ed\ue1ec\ue1ec\ue1ea\ue1e9", "\u99a6\u99ab\u99a7\u99ab\u99a2\u99a5\u99a1\u99aa", "\ua25b\ua258\ua25c\ua25d\ua256\ua257\ua25b\ua25e", "\u8ea7\u8ea4\u8ea0\u8ea6\u8ea5\u8ea6\u8ea4\u8eaf", "\u199a\u1998\u1999\u1991\u199e\u199b\u1991\u1999", "\ub433\ub439\ub435\ub439\ub431\ub439\ub432\ub438", "\u1132\u113a\u1132\u1131\u1131\u1132\u1136\u1131", "\u5e83\u5e86\u5e87\u5e82\u5e86\u5e82\u5e82\u5e8c", "\u8da9\u8daf\u8dad\u8da8\u8daf\u8da9\u8dae"}, d2={"\u0095\u00b8\u00b7\u20fd\u00cf\u00cd\u00db\u00bf\u0099\u0092\u0085\u0092\u00dc\u009f\u0092\u009d\u0094\u00dc\u00a0\u0087\u0081\u009a\u009d\u0094\u00c8\u00da\u00bf\u0099\u0092\u0085\u0092\u00dc\u009f\u0092\u009d\u0094\u00dc\u00a0\u0087\u0081\u009a\u009d\u0094\u00c8", "\u065c\u0603\u060c\u0609\u060e\u0609\u0614\u065e\u065c\u065e\u0648\u0649\u0636", "\u02a0\u02f5\u02f2\u02f5\u02e8\u02a2\u02a0\u02a2\u02b4\u02b5\u02ca", "\u01cd\u01cf\u01de\u01e9\u01c6\u01cb\u01d9\u01d9\u0196\u0194\u0182\u0183\u01e6\u01c0\u01cb\u01dc\u01cb\u0185\u01c6\u01cb\u01c4\u01cd\u0185\u01e9\u01c6\u01cb\u01d9\u01d9\u0191", "\u0581\u0588\u059a\u0581\u05aa\u0586\u058d\u058c\u05d5\u05d7\u05c1\u05c0\u05a0", "\u06cb\u06df\u06db\u06cf\u06c2\u06dd\u0692\u0690\u0686\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06e1\u06cc\u06c4\u06cb\u06cd\u06da\u0695\u0687\u06f4", "\u0115\u011a\u0119\u0118\u0113\u014a\u0148\u015e\u015f\u013a\u011c\u0117\u0100\u0117\u0159\u011a\u0117\u0118\u0111\u0159\u0139\u0114\u011c\u0113\u0115\u0102\u014d", "\u0388\u0393\u03af\u0388\u038e\u0395\u0392\u039b\u03c0\u03c2\u03d4\u03d5\u03b0\u0396\u039d\u038a\u039d\u03d3\u0390\u039d\u0392\u039b\u03d3\u03af\u0388\u038e\u0395\u0392\u039b\u03c7", "\u03a8\u03a9\u03b2\u03af\u03a0\u03bf\u03fa\u03f8\u03ee\u03ef\u0390", "\u060b\u060a\u0611\u060c\u0603\u061c\u0624\u0609\u0609\u0659\u065b\u064d\u064c\u0633", "\u05f2\u05e4\u05ec\u05f1\u05b9\u05bb\u05ad\u05ac\u05d3", "\u02c7\u02d1\u02d9\u02c4\u028c\u028e\u0298\u02fa\u0299\u02e6", "\u0158\u014e\u0146\u015b\u011f\u0113\u0111\u0107\u0165\u0106\u0179", "\u019c\u018a\u0182\u019f\u01d7\u01d5\u01c3\u01a1\u01a2\u01c2\u01bd", "\u05fa\u05f5\u05f2\u05fd\u05f0\u05f5\u05e6\u05f9\u05a0\u05a2\u05b4\u05b5\u05ca"})
public final class Class3490 {
    public static double field7681 = 0.28583834598064983;

    static {
        bc\u200e = "The number of steps for finding edges";
    }

    private static String qCHebnha1Q1jwTpY(String a2, int b2) {
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
    private static CallSite IoGw4LMvgbtTdv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3490.qCHebnha1Q1jwTpY(k2, 355982703));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3490.qCHebnha1Q1jwTpY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 20431 : 20432;
            block7: while (true) {
                switch (n3) {
                    case 20432: {
                        n3 = 20430;
                        continue block7;
                    }
                    case 20431: {
                        String c2 = Class3490.qCHebnha1Q1jwTpY(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class3490.qCHebnha1Q1jwTpY(k2, 355982703) + " " + l2 + " " + m2);
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

