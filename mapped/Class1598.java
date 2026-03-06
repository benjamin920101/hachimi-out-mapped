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

@HACHIMI_CLIENT(mv=100, d1={"\ua58f\ua585\ua589\ua58e\ua584\ua58b\ua58d\ua585", "\u23b8\u23b2\u23b8\u23b7\u23b5\u23b1\u23b1", "\u0e74\u0e71\u0e72\u0e75\u0e74\u0e71\u0e70", "\u8019\u8015\u8014\u8014\u801b\u8019\u8015\u801b", "\u6282\u6280\u6280\u6286\u6286\u6281\u6282", "\u8deb\u8dee\u8de3\u8de8\u8def\u8def\u8dec\u8dee", "\u8850\u8853\u8859\u8854\u8857\u8850\u8851", "\u1e28\u1e29\u1e2a\u1e2c\u1e28\u1e2c\u1e2d\u1e2a", "\u3d20\u3d2a\u3d2f\u3d2f\u3d29\u3d20\u3d29", "\u6adf\u6ade\u6ada\u6ad4\u6add\u6adb\u6adc\u6adb", "\ud986\ud982\ud984\ud987\ud985\ud984\ud985\ud980", "\ud395\ud395\ud393\ud395\ud394\ud395\ud396\ud390", "\u600f\u6005\u600c\u600e\u6008\u6008\u6009\u600c", "\u43b0\u43b6\u43b1\u43b2\u43b6\u43b7\u43b4\u43b3", "\u912b\u9128\u9129\u912c\u912f\u912e\u912e\u912f", "\u0c8b\u0c8e\u0c88\u0c89\u0c8d\u0c89\u0c82\u0c8b"}, d2={"\u04a7\u04a7\u0494\u24c3\u04f1\u04f3\u04e5\u0481\u04a7\u04ac\u04bb\u04ac\u04e2\u04a1\u04ac\u04a3\u04aa\u04e2\u049e\u04b9\u04bf\u04a4\u04a3\u04aa\u04f6\u04e4\u0481\u04a7\u04ac\u04bb\u04ac\u04e2\u04a1\u04ac\u04a3\u04aa\u04e2\u049e\u04b9\u04bf\u04a4\u04a3\u04aa\u04f6", "\u0602\u0602\u0632\u2666\u0654\u0656\u0640\u0624\u0602\u0609\u061e\u0609\u0647\u0604\u0609\u0606\u060f\u0647\u063b\u061c\u061a\u0601\u0606\u060f\u0653\u0641\u0624\u0602\u0609\u061e\u0609\u0647\u0604\u0609\u0606\u060f\u0647\u063b\u061c\u061a\u0601\u0606\u060f\u0653", "\u0424\u047b\u0474\u0471\u0476\u0471\u046c\u0426\u0424\u0426\u0430\u0431\u044e", "\u0086\u00d3\u00d4\u00d3\u00ce\u0084\u0086\u0084\u0092\u0093\u00ec", "\u0591\u0593\u0582\u05b5\u059a\u0597\u0585\u0585\u05ca\u05c8\u05de\u05df\u05ba\u059c\u0597\u0580\u0597\u05d9\u059a\u0597\u0598\u0591\u05d9\u05b5\u059a\u0597\u0585\u0585\u05cd", "\u0707\u070e\u071c\u0707\u072c\u0700\u070b\u070a\u0753\u0751\u0747\u0746\u0726", "\u06a2\u06b6\u06b2\u06a6\u06ab\u06b4\u06fb\u06f9\u06ef\u068b\u06ad\u06a6\u06b1\u06a6\u06e8\u06ab\u06a6\u06a9\u06a0\u06e8\u0688\u06a5\u06ad\u06a2\u06a4\u06b3\u06fc\u06ee\u069d", "\u0774\u077b\u0778\u0779\u0772\u072b\u0729\u073f\u073e\u075b\u077d\u0776\u0761\u0776\u0738\u077b\u0776\u0779\u0770\u0738\u0758\u0775\u077d\u0772\u0774\u0763\u072c", "\u00eb\u00f0\u00cc\u00eb\u00ed\u00f6\u00f1\u00f8\u00a3\u00a1\u00b7\u00b6\u00d3\u00f5\u00fe\u00e9\u00fe\u00b0\u00f3\u00fe\u00f1\u00f8\u00b0\u00cc\u00eb\u00ed\u00f6\u00f1\u00f8\u00a4", "ED_BMR\u0017\u0015\u0003\u0002}", "\u06b7\u06b6\u06ad\u06b0\u06bf\u06a0\u0698\u06b5\u06b5\u06e5\u06e7\u06f1\u06f0\u068f", "\u0183\u0195\u019d\u0180\u01c8\u01ca\u01dc\u01dd\u01a2", "\u05bd\u05ab\u05a3\u05be\u05f6\u05f4\u05e2\u0580\u05e3\u059c", "\u0546\u0550\u0558\u0545\u0501\u050d\u050f\u0519\u057b\u0518\u0567", "\u0498\u048e\u0486\u049b\u04d3\u04d1\u04c7\u04a5\u04a6\u04c6\u04b9", "\u0651\u065e\u0659\u0656\u065b\u065e\u064d\u0652\u060b\u0609\u061f\u061e\u0661"})
public final class Class1598 {
    public static double field5978 = 0.5202016603484376;
    public static float field5979;
    public static float field5980 = 0.6538238f;
    public static float field5981;

    static {
        field5981 = Float.intBitsToFloat(1062992394);
        ad\u200e = "Rotate";
        field5979 = Float.intBitsToFloat(1060777618);
        bP\u200e = "The color of the light";
    }

    private static String nDCI9JCLvDiphYIY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite DJmEA7XQRe6dY2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1598.nDCI9JCLvDiphYIY(k2, -534900640));
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
                int a2 = Integer.parseInt(Class1598.nDCI9JCLvDiphYIY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1598.nDCI9JCLvDiphYIY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1598.nDCI9JCLvDiphYIY(k2, -534900640) + " " + l2 + " " + m2);
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

