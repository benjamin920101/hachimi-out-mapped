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
@HACHIMI_CLIENT(mv=100, d1={"\ucc60\ucc6b\ucc6b\ucc68\ucc6f\ucc6b\ucc6d", "\u5c84\u5c80\u5c80\u5c85\u5c84\u5c84\u5c86\u5c81", "\u9711\u9716\u9714\u971f\u9715\u9713\u9717\u9712", "\u0719\u071b\u071b\u0714\u0719\u0718\u071f\u0718", "\u8e03\u8e0e\u8e0f\u8e05\u8e01\u8e07\u8e02\u8e0e", "\u0e9d\u0e98\u0e90\u0e9a\u0e98\u0e91\u0e91\u0e98", "\uc8bf\uc8ba\uc8bb\uc8b3\uc8b2\uc8b9\uc8b9\uc8b8", "\u01da\u01da\u01de\u01db\u01de\u01dd\u01dc", "\ubca8\ubcaf\ubca4\ubcae\ubcae\ubcaa\ubcab\ubca5", "\u212e\u212b\u2122\u212b\u212d\u212e\u2122\u2122", "\ubc05\ubc09\ubc04\ubc03\ubc06\ubc04\ubc06\ubc04", "\u2294\u2298\u2298\u2294\u2295\u2296\u2290\u2294", "\u0bce\u0bcf\u0bc0\u0bc2\u0bc7\u0bc1", "\u61e0\u61e1\u61e2\u61e3\u61e6\u61e2\u61e6\u61e6", "\u827a\u827c\u8276\u827b\u827a\u8276\u827a\u827f"}, d2={"\u071f\u0724\u072f\u2773\u0741\u0743\u0755\u0731\u0717\u071c\u070b\u071c\u0752\u0711\u071c\u0713\u071a\u0752\u072e\u0709\u070f\u0714\u0713\u071a\u0746\u0754\u0731\u0717\u071c\u070b\u071c\u0752\u0711\u071c\u0713\u071a\u0752\u072e\u0709\u070f\u0714\u0713\u071a\u0746", "\u0614\u064b\u0644\u0641\u0646\u0641\u065c\u0616\u0614\u0616\u0600\u0601\u067e", "\u04ae\u04fb\u04fc\u04fb\u04e6\u04ac\u04ae\u04ac\u04ba\u04bb\u04c4", "\u02e9\u02eb\u02fa\u02cd\u02e2\u02ef\u02fd\u02fd\u02b2\u02b0\u02a6\u02a7\u02c2\u02e4\u02ef\u02f8\u02ef\u02a1\u02e2\u02ef\u02e0\u02e9\u02a1\u02cd\u02e2\u02ef\u02fd\u02fd\u02b5", "\u0307\u030e\u031c\u0307\u032c\u0300\u030b\u030a\u0353\u0351\u0347\u0346\u0326", "\u0588\u059c\u0598\u058c\u0581\u059e\u05d1\u05d3\u05c5\u05a1\u0587\u058c\u059b\u058c\u05c2\u0581\u058c\u0583\u058a\u05c2\u05a2\u058f\u0587\u0588\u058e\u0599\u05d6\u05c4\u05b7", "\u07c7\u07c8\u07cb\u07ca\u07c1\u0798\u079a\u078c\u078d\u07e8\u07ce\u07c5\u07d2\u07c5\u078b\u07c8\u07c5\u07ca\u07c3\u078b\u07eb\u07c6\u07ce\u07c1\u07c7\u07d0\u079f", "\u03ea\u03f1\u03cd\u03ea\u03ec\u03f7\u03f0\u03f9\u03a2\u03a0\u03b6\u03b7\u03d2\u03f4\u03ff\u03e8\u03ff\u03b1\u03f2\u03ff\u03f0\u03f9\u03b1\u03cd\u03ea\u03ec\u03f7\u03f0\u03f9\u03a5", "\u070d\u070c\u0717\u070a\u0705\u071a\u075f\u075d\u074b\u074a\u0735", "\u0527\u0526\u053d\u0520\u052f\u0530\u0508\u0525\u0525\u0575\u0577\u0561\u0560\u051f", "\u0364\u0372\u037a\u0367\u032f\u032d\u033b\u033a\u0345", "\u0201\u0217\u021f\u0202\u024a\u0248\u025e\u023c\u025f\u0220", "\u0745\u0753\u075b\u0746\u0702\u070e\u070c\u071a\u0778\u071b\u0764", "\u0099\u008f\u0087\u009a\u00d2\u00d0\u00c6\u00a4\u00a7\u00c7\u00b8", "\u0654\u065b\u065c\u0653\u065e\u065b\u0648\u0657\u060e\u060c\u061a\u061b\u0664"})
public final class Class3274 {
    public static float field7027 = Float.intBitsToFloat(1059246932);
    public static float field7028;
    public static float field7029;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 2Q6FdarKeNnobs(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3274.K7zwGqoidQ2OrbPK(k2, -56945815));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3274.K7zwGqoidQ2OrbPK(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 60671 : 60670;
            block7: while (true) {
                switch (n3) {
                    case 60671: {
                        n3 = 60669;
                        continue block7;
                    }
                    case 60670: {
                        String c2 = Class3274.K7zwGqoidQ2OrbPK(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class3274.K7zwGqoidQ2OrbPK(k2, -56945815) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String K7zwGqoidQ2OrbPK(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        al\u200e = "EXPLOIT";
        field7028 = Float.intBitsToFloat(1034212544);
        field7029 = Float.intBitsToFloat(1054914218);
    }
}

