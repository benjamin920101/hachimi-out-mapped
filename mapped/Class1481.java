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

@HACHIMI_CLIENT(mv=100, d1={"\u9c6c\u9c6a\u9c6c\u9c6c\u9c63\u9c6a\u9c6f\u9c68", "\uda9e\uda9f\uda9d\uda9e\uda95\uda9d\uda94\uda9d", "\udcdd\udcdf\udcdf\udcd9\udcd8\udcd8\udcde\udcde", "\u2567\u2561\u2562\u2565\u2561\u2566\u2568\u2565", "\u3857\u3852\u3858\u3850\u3853\u3858\u3856", "\u0b24\u0b25\u0b2f\u0b22\u0b22\u0b21\u0b23\u0b24", "\ub43e\ub438\ub430\ub43b\ub430\ub43b\ub430", "\u0646\u0643\u0646\u0647\u0641\u0641\u0640\u0640", "\ubff1\ubff2\ubff5\ubff1\ubff5\ubff3\ubffc\ubff2", "\u8893\u889f\u8897\u8891\u8893\u8896\u889e\u8895", "\u1d50\u1d58\u1d56\u1d53\u1d51\u1d59\u1d59\u1d59", "\ud86b\ud869\ud86b\ud86a\ud86f\ud86d\ud866\ud86b", "\u8549\u854d\u854a\u854a\u854c\u854c\u854b\u854c", "\u97a5\u97a5\u97a5\u97a5\u97a7\u97a7\u97a0\u97af", "\ub747\ub742\ub741\ub745\ub740\ub744\ub740\ub745", "\u3e72\u3e76\u3e77\u3e75\u3e77\u3e70\u3e72\u3e79"}, d2={"\u02c8\u02c6\u02fd\u22a0\u0292\u0290\u0286\u02e2\u02c4\u02cf\u02d8\u02cf\u0281\u02c2\u02cf\u02c0\u02c9\u0281\u02fd\u02da\u02dc\u02c7\u02c0\u02c9\u0295\u0287\u02e2\u02c4\u02cf\u02d8\u02cf\u0281\u02c2\u02cf\u02c0\u02c9\u0281\u02fd\u02da\u02dc\u02c7\u02c0\u02c9\u0295", "\u048e\u0480\u04bc\u24e6\u04d4\u04d6\u04c0\u04a4\u0482\u0489\u049e\u0489\u04c7\u0484\u0489\u0486\u048f\u04c7\u04bb\u049c\u049a\u0481\u0486\u048f\u04d3\u04c1\u04a4\u0482\u0489\u049e\u0489\u04c7\u0484\u0489\u0486\u048f\u04c7\u04bb\u049c\u049a\u0481\u0486\u048f\u04d3", "\u064b\u0614\u061b\u061e\u0619\u061e\u0603\u0649\u064b\u0649\u065f\u065e\u0621", "\u0168\u013d\u013a\u013d\u0120\u016a\u0168\u016a\u017c\u017d\u0102", "\u0164\u0166\u0177\u0140\u016f\u0162\u0170\u0170\u013f\u013d\u012b\u012a\u014f\u0169\u0162\u0175\u0162\u012c\u016f\u0162\u016d\u0164\u012c\u0140\u016f\u0162\u0170\u0170\u0138", "\u04ed\u04e4\u04f6\u04ed\u04c6\u04ea\u04e1\u04e0\u04b9\u04bb\u04ad\u04ac\u04cc", "\u01ef\u01fb\u01ff\u01eb\u01e6\u01f9\u01b6\u01b4\u01a2\u01c6\u01e0\u01eb\u01fc\u01eb\u01a5\u01e6\u01eb\u01e4\u01ed\u01a5\u01c5\u01e8\u01e0\u01ef\u01e9\u01fe\u01b1\u01a3\u01d0", "\u07f9\u07f6\u07f5\u07f4\u07ff\u07a6\u07a4\u07b2\u07b3\u07d6\u07f0\u07fb\u07ec\u07fb\u07b5\u07f6\u07fb\u07f4\u07fd\u07b5\u07d5\u07f8\u07f0\u07ff\u07f9\u07ee\u07a1", "\u0081\u009a\u00a6\u0081\u0087\u009c\u009b\u0092\u00c9\u00cb\u00dd\u00dc\u00b9\u009f\u0094\u0083\u0094\u00da\u0099\u0094\u009b\u0092\u00da\u00a6\u0081\u0087\u009c\u009b\u0092\u00ce", "\t\b\u0013\u000e\u0001\u001e[YON1", "\u01a4\u01a5\u01be\u01a3\u01ac\u01b3\u018b\u01a6\u01a6\u01f6\u01f4\u01e2\u01e3\u019c", "\u06a0\u06b6\u06be\u06a3\u06eb\u06e9\u06ff\u06fe\u0681", "\u047d\u046b\u0463\u047e\u0436\u0434\u0422\u0440\u0423\u045c", "\u0681\u0697\u069f\u0682\u06c6\u06ca\u06c8\u06de\u06bc\u06df\u06a0", "\u0265\u0273\u027b\u0266\u022e\u022c\u023a\u0258\u025b\u023b\u0244", "\u056c\u0563\u0564\u056b\u0566\u0563\u0570\u056f\u0536\u0534\u0522\u0523\u055c"})
public final class Class1481 {
    public static double field5604 = Double.longBitsToDouble(4590275983663685712L);
    public static double field5605 = Double.longBitsToDouble(4576050217207442944L);
    public static float field5606;
    public static float field5607;
    public static float field5608 = 0.54371685f;
    public static float field5609 = 0.8529759f;
    public static float field5610;

    static {
        aD\u200e = "Allow multiple assignblocks";
        aJ\u200e = "AntiAim";
        field5606 = Float.intBitsToFloat(1063534445);
        field5610 = Float.intBitsToFloat(1032378624);
        field5607 = Float.intBitsToFloat(1023999728);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite pOvtGFTbLBUPuU(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1481.tipivQ1DjvAOewZJ(k2, 1443426225));
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
                int a2 = Integer.parseInt(Class1481.tipivQ1DjvAOewZJ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1481.tipivQ1DjvAOewZJ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1481.tipivQ1DjvAOewZJ(k2, 1443426225) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String tipivQ1DjvAOewZJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

