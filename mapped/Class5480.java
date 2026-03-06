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

@HACHIMI_CLIENT(mv=100, d1={"\ue644\ue649\ue646\ue649\ue643\ue640\ue648\ue644", "\u626a\u626c\u626a\u626f\u6268\u626c\u6269\u6266", "\u143f\u1433\u143f\u143c\u1438\u143b\u1439\u143a", "\ud334\ud330\ud331\ud334\ud333\ud333\ud33e\ud337", "\u3e46\u3e41\u3e40\u3e47\u3e46\u3e41\u3e44\u3e4a", "\u9298\u9298\u9290\u929d\u9291\u9290\u929d\u929c", "\u4dbd\u4db9\u4dbf\u4db0\u4dbe\u4dbb\u4db1\u4db9", "\ua5dd\ua5d8\ua5db\ua5dd\ua5d4\ua5d8\ua5d8", "\uc45f\uc45a\uc45c\uc45a\uc451\uc459\uc45d\uc45a", "\uc9bf\uc9b9\uc9bc\uc9b8\uc9bd\uc9bb\uc9b9\uc9bf", "\ud134\ud13c\ud13d\ud13b\ud13c\ud135\ud13c", "\ua410\ua414\ua413\ua411\ua410\ua41e\ua411\ua414", "\u3876\u3870\u3877\u3873\u3870\u3870\u3877\u387e", "\u1b2c\u1b2c\u1b28\u1b27\u1b26\u1b2f\u1b2b\u1b27", "\u833e\u833e\u833c\u833b\u8331\u833d\u8331\u8331"}, d2={"\u00ed\u00f4\u00dd\u2092\u00a0\u00a2\u00b4\u00d0\u00f6\u00fd\u00ea\u00fd\u00b3\u00f0\u00fd\u00f2\u00fb\u00b3\u00cf\u00e8\u00ee\u00f5\u00f2\u00fb\u00a7\u00b5\u00d0\u00f6\u00fd\u00ea\u00fd\u00b3\u00f0\u00fd\u00f2\u00fb\u00b3\u00cf\u00e8\u00ee\u00f5\u00f2\u00fb\u00a7", "\u028f\u02d0\u02df\u02da\u02dd\u02da\u02c7\u028d\u028f\u028d\u029b\u029a\u02e5", "\u0150\u0105\u0102\u0105\u0118\u0152\u0150\u0152\u0144\u0145\u013a", "\u02a8\u02aa\u02bb\u028c\u02a3\u02ae\u02bc\u02bc\u02f3\u02f1\u02e7\u02e6\u0283\u02a5\u02ae\u02b9\u02ae\u02e0\u02a3\u02ae\u02a1\u02a8\u02e0\u028c\u02a3\u02ae\u02bc\u02bc\u02f4", "\u033d\u0334\u0326\u033d\u0316\u033a\u0331\u0330\u0369\u036b\u037d\u037c\u031c", "I]YM@_\u0010\u0012\u0004`FMZM\u0003@MBK\u0003cNFIOX\u0017\u0005v", "\u0397\u0398\u039b\u039a\u0391\u03c8\u03ca\u03dc\u03dd\u03b8\u039e\u0395\u0382\u0395\u03db\u0398\u0395\u039a\u0393\u03db\u03bb\u0396\u039e\u0391\u0397\u0380\u03cf", "\u0098\u0083\u00bf\u0098\u009e\u0085\u0082\u008b\u00d0\u00d2\u00c4\u00c5\u00a0\u0086\u008d\u009a\u008d\u00c3\u0080\u008d\u0082\u008b\u00c3\u00bf\u0098\u009e\u0085\u0082\u008b\u00d7", "\n\u000b\u0010\r\u0002\u001dXZLM2", "\u022c\u022d\u0236\u022b\u0224\u023b\u0203\u022e\u022e\u027e\u027c\u026a\u026b\u0214", "\u00d4\u00c2\u00ca\u00d7\u009f\u009d\u008b\u008a\u00f5", "\u0374\u0362\u036a\u0377\u033f\u033d\u032b\u0349\u032a\u0355", "\u06d8\u06ce\u06c6\u06db\u069f\u0693\u0691\u0687\u06e5\u0686\u06f9", "\u04f8\u04ee\u04e6\u04fb\u04b3\u04b1\u04a7\u04c5\u04c6\u04a6\u04d9", "\u00ca\u00c5\u00c2\u00cd\u00c0\u00c5\u00d6\u00c9\u0090\u0092\u0084\u0085\u00fa"})
public final class Class5480 {
    public static double field10272 = 0.5269685204898279;
    public static int field10273 = -1948377941;
    public static double field10274 = Double.longBitsToDouble(4595142042517646864L);

    private static String yXNTglOpphJlLEyT(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        bB\u200e = "HachimiTitleScreen";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite F7ylQ36nGlMAqr(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5480.yXNTglOpphJlLEyT(k2, 351275644));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5480.yXNTglOpphJlLEyT(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5480.yXNTglOpphJlLEyT(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class5480.yXNTglOpphJlLEyT(k2, 351275644) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 != 1 ? 29646 : 29645;
        block7: while (true) {
            switch (n3) {
                case 29646: {
                    n3 = 29644;
                    continue block7;
                }
                case 29645: {
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

