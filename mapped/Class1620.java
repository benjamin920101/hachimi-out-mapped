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

@HACHIMI_CLIENT(mv=100, d1={"\ubd72\ubd74\ubd7c\ubd70\ubd77\ubd7c\ubd76", "\u92a1\u92a6\u92ab\u92a1\u92a6\u92a4\u92a3\u92a7", "\u1d23\u1d25\u1d22\u1d21\u1d23\u1d20\u1d23", "\u5142\u5147\u5147\u5145\u5149\u5145\u5141\u5145", "\u657a\u6578\u6576\u657d\u6579\u6579\u657d\u6578", "\u090c\u0900\u090b\u090e\u090a\u090e\u090c\u090c", "\u31b0\u31b3\u31b3\u31b1\u31ba\u31b7\u31b3\u31b0", "\u5a30\u5a3e\u5a36\u5a35\u5a31\u5a37\u5a32\u5a36", "\ud710\ud716\ud716\ud716\ud712\ud713\ud717\ud714", "\uc71d\uc710\uc715\uc71d\uc715\uc712\uc710", "\u176b\u176a\u176b\u1762\u176e\u176e\u176d", "\u308f\u308c\u308a\u3089\u3086", "\u23e6\u23e7\u23e8\u23e3\u23e1\u23e3\u23e3", "\u63ec\u63e8\u63ed\u63e4\u63ee\u63e9\u63e5\u63eb", "\u5651\u565b\u5653\u5652\u5650\u565a\u5653\u5656", "\u8f1d\u8f1a\u8f1c\u8f1e\u8f19\u8f1d\u8f1c", "\u2c5c\u2c58\u2c5d\u2c5f\u2c51\u2c5f\u2c58\u2c5e"}, d2={"\u0257\u0247\u0277\u2231\u0203\u0201\u0217\u0273\u0255\u025e\u0249\u025e\u0210\u0253\u025e\u0251\u0258\u0210\u026c\u024b\u024d\u0256\u0251\u0258\u0204\u0216\u0273\u0255\u025e\u0249\u025e\u0210\u0253\u025e\u0251\u0258\u0210\u026c\u024b\u024d\u0256\u0251\u0258\u0204", "\u07a2\u07b2\u0783\u27c4\u07f6\u07f4\u07e2\u0786\u07a0\u07ab\u07bc\u07ab\u07e5\u07a6\u07ab\u07a4\u07ad\u07e5\u0799\u07be\u07b8\u07a3\u07a4\u07ad\u07f1\u07e3\u0786\u07a0\u07ab\u07bc\u07ab\u07e5\u07a6\u07ab\u07a4\u07ad\u07e5\u0799\u07be\u07b8\u07a3\u07a4\u07ad\u07f1", "\u025c\u024c\u027e\u223a\u0208\u020a\u021c\u0278\u025e\u0255\u0242\u0255\u021b\u0258\u0255\u025a\u0253\u021b\u0267\u0240\u0246\u025d\u025a\u0253\u020f\u021d\u0278\u025e\u0255\u0242\u0255\u021b\u0258\u0255\u025a\u0253\u021b\u0267\u0240\u0246\u025d\u025a\u0253\u020f", "\u0662\u063d\u0632\u0637\u0630\u0637\u062a\u0660\u0662\u0660\u0676\u0677\u0608", "\u02d1\u0284\u0283\u0284\u0299\u02d3\u02d1\u02d3\u02c5\u02c4\u02bb", "\u01eb\u01e9\u01f8\u01cf\u01e0\u01ed\u01ff\u01ff\u01b0\u01b2\u01a4\u01a5\u01c0\u01e6\u01ed\u01fa\u01ed\u01a3\u01e0\u01ed\u01e2\u01eb\u01a3\u01cf\u01e0\u01ed\u01ff\u01ff\u01b7", "\u0288\u0281\u0293\u0288\u02a3\u028f\u0284\u0285\u02dc\u02de\u02c8\u02c9\u02a9", "\u017d\u0169\u016d\u0179\u0174\u016b\u0124\u0126\u0130\u0154\u0172\u0179\u016e\u0179\u0137\u0174\u0179\u0176\u017f\u0137\u0157\u017a\u0172\u017d\u017b\u016c\u0123\u0131\u0142", "\u034d\u0342\u0341\u0340\u034b\u0312\u0310\u0306\u0307\u0362\u0344\u034f\u0358\u034f\u0301\u0342\u034f\u0340\u0349\u0301\u0361\u034c\u0344\u034b\u034d\u035a\u0315", "\u05c7\u05dc\u05e0\u05c7\u05c1\u05da\u05dd\u05d4\u058f\u058d\u059b\u059a\u05ff\u05d9\u05d2\u05c5\u05d2\u059c\u05df\u05d2\u05dd\u05d4\u059c\u05e0\u05c7\u05c1\u05da\u05dd\u05d4\u0588", "\u00df\u00de\u00c5\u00d8\u00d7\u00c8\u008d\u008f\u0099\u0098\u00e7", "\u0790\u0791\u078a\u0797\u0798\u0787\u07bf\u0792\u0792\u07c2\u07c0\u07d6\u07d7\u07a8", "\u079a\u078c\u0784\u0799\u07d1\u07d3\u07c5\u07c4\u07bb", "\u0619\u060f\u0607\u061a\u0652\u0650\u0646\u0624\u0647\u0638", "\u01f5\u01e3\u01eb\u01f6\u01b2\u01be\u01bc\u01aa\u01c8\u01ab\u01d4", "bt|a)+=_\\<C", "\u02c0\u02cf\u02c8\u02c7\u02ca\u02cf\u02dc\u02c3\u029a\u0298\u028e\u028f\u02f0"})
public final class Class1620 {
    public static int field6047 = -1446126489;
    public static double field6048 = Double.longBitsToDouble(4600721840544864378L);
    public static double field6049 = 0.47156904259714927;

    private static String j8IgJ7D4tYy6FIo5(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        ag\u200e = "Auto jump when you on ground";
        bk\u200e = "Switches to your selected weapon when attacking the target";
        bJ\u200e = "VANILLA";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite FdYTqogPTJBvLI(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1620.j8IgJ7D4tYy6FIo5(k2, -1448346290));
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
                int a2 = Integer.parseInt(Class1620.j8IgJ7D4tYy6FIo5(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1620.j8IgJ7D4tYy6FIo5(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1620.j8IgJ7D4tYy6FIo5(k2, -1448346290) + " " + l2 + " " + m2);
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

