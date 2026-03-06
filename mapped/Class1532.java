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
@HACHIMI_CLIENT(mv=100, d1={"\u4716\u4710\u4714\u4716\u4718\u4715\u4716\u4713", "\u32a5\u32a3\u32ad\u32ad\u32ad\u32a5\u32a2\u32a6", "\u6b08\u6b0a\u6b0c\u6b0d\u6b0f\u6b01\u6b01\u6b01", "\u1b19\u1b1f\u1b1d\u1b18\u1b17\u1b19\u1b1b\u1b1c", "\u6fee\u6fee\u6fec\u6fea\u6fef\u6fef\u6fe8\u6feb", "\u198c\u1989\u198d\u198d\u198f\u1989\u1985\u1989", "\u763e\u763a\u763a\u7638\u763b\u763a\u7639\u763e", "\ucf57\ucf51\ucf5a\ucf5b\ucf50\ucf54\ucf53\ucf5a", "\u77fe\u77f9\u77fa\u77ff\u77f8\u77fb\u77ff\u77f9", "\u234b\u2345\u2344\u2345\u234b\u234e\u234e", "\ucfbb\ucfbf\ucfbb\ucfb2\ucfba\ucfbc\ucfba\ucfb2", "\u8f34\u8f35\u8f30\u8f36\u8f31\u8f37\u8f30\u8f30", "\u787a\u7879\u7871\u787b\u7878\u787e\u787f\u787b", "\u2cc3\u2cc5\u2cc2\u2cc6\u2cc1\u2cc2\u2cc0\u2cc9", "\udf9a\udf9c\udf98\udf98\udf9c\udf9f\udf9a", "\ub9ac\ub9ab\ub9ae\ub9af\ub9aa\ub9ad\ub9a2\ub9ab"}, d2={"\u0083\u008f\u00a7\u20f8\u00ca\u00c8\u00de\u00ba\u009c\u0097\u0080\u0097\u00d9\u009a\u0097\u0098\u0091\u00d9\u00a5\u0082\u0084\u009f\u0098\u0091\u00cd\u00df\u00ba\u009c\u0097\u0080\u0097\u00d9\u009a\u0097\u0098\u0091\u00d9\u00a5\u0082\u0084\u009f\u0098\u0091\u00cd", "\u02f5\u02f9\u02d2\u228e\u02bc\u02be\u02a8\u02cc\u02ea\u02e1\u02f6\u02e1\u02af\u02ec\u02e1\u02ee\u02e7\u02af\u02d3\u02f4\u02f2\u02e9\u02ee\u02e7\u02bb\u02a9\u02cc\u02ea\u02e1\u02f6\u02e1\u02af\u02ec\u02e1\u02ee\u02e7\u02af\u02d3\u02f4\u02f2\u02e9\u02ee\u02e7\u02bb", "\u00b6\u00e9\u00e6\u00e3\u00e4\u00e3\u00fe\u00b4\u00b6\u00b4\u00a2\u00a3\u00dc", "u ' =wuwa`\u001f", "\u023d\u023f\u022e\u0219\u0236\u023b\u0229\u0229\u0266\u0264\u0272\u0273\u0216\u0230\u023b\u022c\u023b\u0275\u0236\u023b\u0234\u023d\u0275\u0219\u0236\u023b\u0229\u0229\u0261", "\u0763\u076a\u0778\u0763\u0748\u0764\u076f\u076e\u0737\u0735\u0723\u0722\u0742", "\u0464\u0470\u0474\u0460\u046d\u0472\u043d\u043f\u0429\u044d\u046b\u0460\u0477\u0460\u042e\u046d\u0460\u046f\u0466\u042e\u044e\u0463\u046b\u0464\u0462\u0475\u043a\u0428\u045b", "\u06f6\u06f9\u06fa\u06fb\u06f0\u06a9\u06ab\u06bd\u06bc\u06d9\u06ff\u06f4\u06e3\u06f4\u06ba\u06f9\u06f4\u06fb\u06f2\u06ba\u06da\u06f7\u06ff\u06f0\u06f6\u06e1\u06ae", "\u04a6\u04bd\u0481\u04a6\u04a0\u04bb\u04bc\u04b5\u04ee\u04ec\u04fa\u04fb\u049e\u04b8\u04b3\u04a4\u04b3\u04fd\u04be\u04b3\u04bc\u04b5\u04fd\u0481\u04a6\u04a0\u04bb\u04bc\u04b5\u04e9", "\u054c\u054d\u0556\u054b\u0544\u055b\u051e\u051c\u050a\u050b\u0574", "\b\t\u0012\u000f\u0000\u001f'\n\nZXNO0", "\u06c2\u06d4\u06dc\u06c1\u0689\u068b\u069d\u069c\u06e3", "\u0507\u0511\u0519\u0504\u054c\u054e\u0558\u053a\u0559\u0526", "\u05bc\u05aa\u05a2\u05bf\u05fb\u05f7\u05f5\u05e3\u0581\u05e2\u059d", "\u01e7\u01f1\u01f9\u01e4\u01ac\u01ae\u01b8\u01da\u01d9\u01b9\u01c6", "\u0688\u0687\u0680\u068f\u0682\u0687\u0694\u068b\u06d2\u06d0\u06c6\u06c7\u06b8"})
public final class Class1532 {
    public static float field5774 = 0.80346316f;
    public static double field5775;

    static {
        W\u200e = "Removes player knockback velocity";
        field5775 = Double.longBitsToDouble(4606480244187355039L);
        bd\u200e = "Render shaders on items";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 6yquiDyA26qq6d(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1532.DeoQHFr71293rdRA(k2, -962004627));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block2: while (true) {
            block9: {
                void e2;
                int n3 = f2 < q2.length ? 2563 : 2564;
                while (true) {
                    int n4;
                    if ((n4 = n3) == 2563) {
                        try {
                            int a2 = Integer.parseInt(Class1532.DeoQHFr71293rdRA(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block9;
                        }
                    }
                    if (n4 != 2564) break block2;
                    n3 = 2562;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class1532.DeoQHFr71293rdRA(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1532.DeoQHFr71293rdRA(k2, -962004627) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String DeoQHFr71293rdRA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

