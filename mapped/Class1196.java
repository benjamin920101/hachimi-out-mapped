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

@HACHIMI_CLIENT(mv=100, d1={"\u6c4c\u6c4f\u6c4c\u6c45\u6c44\u6c4c\u6c4e", "\u65c6\u65c5\u65c5\u65c4\u65c2\u65c5\u65cf\u65cf", "\u8087\u8087\u8082\u8083\u8086\u8082\u8081\u8084", "\ue315\ue311\ue316\ue313\ue313\ue316\ue316\ue310", "\ucf0f\ucf0a\ucf0c\ucf0d\ucf0c\ucf0f\ucf0a\ucf0a", "\ua365\ua365\ua367\ua361\ua363\ua362\ua360\ua366", "\u1544\u1547\u1547\u1547\u1540\u1542\u1540\u1542", "\u1159\u1159\u115f\u1159\u115f\u115a\u115e\u1153", "\u9dfa\u9dfe\u9dfe\u9df8\u9df1\u9df8\u9df8", "\ua03a\ua03e\ua039\ua03b\ua03c\ua031\ua03f\ua03f", "\u0fc0\u0fc3\u0fc1\u0fc3\u0fc1\u0fc4\u0fc7\u0fc4", "\u6cb2\u6cbc\u6cb6\u6cbd\u6cb4\u6cb3", "\u25ab\u25a1\u25a1\u25a1\u25a1\u25ac\u25ab", "\u8dbb\u8db7\u8db9\u8dbf\u8dbc\u8dbd\u8dbb\u8dbc", "\u115f\u1159\u115d\u1158\u115f\u115c\u1155\u115c", "\ud6d2\ud6de\ud6d1\ud6df\ud6d7\ud6d5\ud6d7", "\uad8b\uad8f\uad8b\uad87\uad8c\uad89\uad87\uad8d"}, d2={"\u0391\u0390\u038b\u23f5\u03c7\u03c5\u03d3\u03b7\u0391\u039a\u038d\u039a\u03d4\u0397\u039a\u0395\u039c\u03d4\u03a8\u038f\u0389\u0392\u0395\u039c\u03c0\u03d2\u03b7\u0391\u039a\u038d\u039a\u03d4\u0397\u039a\u0395\u039c\u03d4\u03a8\u038f\u0389\u0392\u0395\u039c\u03c0", "\u00cd\u00cc\u00d6\u20a9\u009b\u0099\u008f\u00eb\u00cd\u00c6\u00d1\u00c6\u0088\u00cb\u00c6\u00c9\u00c0\u0088\u00f4\u00d3\u00d5\u00ce\u00c9\u00c0\u009c\u008e\u00eb\u00cd\u00c6\u00d1\u00c6\u0088\u00cb\u00c6\u00c9\u00c0\u0088\u00f4\u00d3\u00d5\u00ce\u00c9\u00c0\u009c", "\u013e\u013f\u0126\u215a\u0168\u016a\u017c\u0118\u013e\u0135\u0122\u0135\u017b\u0138\u0135\u013a\u0133\u017b\u0107\u0120\u0126\u013d\u013a\u0133\u016f\u017d\u0118\u013e\u0135\u0122\u0135\u017b\u0138\u0135\u013a\u0133\u017b\u0107\u0120\u0126\u013d\u013a\u0133\u016f", "\u02b5\u02ea\u02e5\u02e0\u02e7\u02e0\u02fd\u02b7\u02b5\u02b7\u02a1\u02a0\u02df", "\u01b7\u01e2\u01e5\u01e2\u01ff\u01b5\u01b7\u01b5\u01a3\u01a2\u01dd", "\u0376\u0374\u0365\u0352\u037d\u0370\u0362\u0362\u032d\u032f\u0339\u0338\u035d\u037b\u0370\u0367\u0370\u033e\u037d\u0370\u037f\u0376\u033e\u0352\u037d\u0370\u0362\u0362\u032a", "\u0646\u064f\u065d\u0646\u066d\u0641\u064a\u064b\u0612\u0610\u0606\u0607\u0667", "\u03e2\u03f6\u03f2\u03e6\u03eb\u03f4\u03bb\u03b9\u03af\u03cb\u03ed\u03e6\u03f1\u03e6\u03a8\u03eb\u03e6\u03e9\u03e0\u03a8\u03c8\u03e5\u03ed\u03e2\u03e4\u03f3\u03bc\u03ae\u03dd", "\u03cd\u03c2\u03c1\u03c0\u03cb\u0392\u0390\u0386\u0387\u03e2\u03c4\u03cf\u03d8\u03cf\u0381\u03c2\u03cf\u03c0\u03c9\u0381\u03e1\u03cc\u03c4\u03cb\u03cd\u03da\u0395", "\u0337\u032c\u0310\u0337\u0331\u032a\u032d\u0324\u037f\u037d\u036b\u036a\u030f\u0329\u0322\u0335\u0322\u036c\u032f\u0322\u032d\u0324\u036c\u0310\u0337\u0331\u032a\u032d\u0324\u0378", "\u0474\u0475\u046e\u0473\u047c\u0463\u0426\u0424\u0432\u0433\u044c", "\u04de\u04df\u04c4\u04d9\u04d6\u04c9\u04f1\u04dc\u04dc\u048c\u048e\u0498\u0499\u04e6", "\u0126\u0130\u0138\u0125\u016d\u016f\u0179\u0178\u0107", "\u03ec\u03fa\u03f2\u03ef\u03a7\u03a5\u03b3\u03d1\u03b2\u03cd", "\u01f3\u01e5\u01ed\u01f0\u01b4\u01b8\u01ba\u01ac\u01ce\u01ad\u01d2", "\u056c\u057a\u0572\u056f\u0527\u0525\u0533\u0551\u0552\u0532\u054d", "\u0779\u0776\u0771\u077e\u0773\u0776\u0765\u077a\u0723\u0721\u0737\u0736\u0749"})
public final class Class1196 {
    public static double field4728;

    /*
     * WARNING - void declaration
     */
    private static CallSite kllXi4o1VNwp5o(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1196.GVQDNQMaOtcfqt2O(k2, 900830523));
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
                int a2 = Integer.parseInt(Class1196.GVQDNQMaOtcfqt2O(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1196.GVQDNQMaOtcfqt2O(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1196.GVQDNQMaOtcfqt2O(k2, 900830523) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String GVQDNQMaOtcfqt2O(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        c\u200e = "HandSwing";
        F\u200e = "%s";
        field4728 = Double.longBitsToDouble(4605742082721116202L);
        bo\u200e = "Neutrals";
    }
}

