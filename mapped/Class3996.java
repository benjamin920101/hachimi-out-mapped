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

@HACHIMI_CLIENT(mv=100, d1={"\u21cb\u21c5\u21cd\u21c5\u21cf\u21ce\u21c8\u21cf", "\u203b\u203c\u2039\u203c\u203c\u2039\u203a\u203f", "\u99d8\u99dd\u99d9\u99dd\u99dc\u99da\u99dc\u99df", "\ue05f\ue058\ue05d\ue054\ue05f\ue05a\ue05d\ue05f", "\uc383\uc386\uc387\uc383\uc385\uc388\uc389\uc389", "\uc81e\uc818\uc81e\uc81a\uc818\uc81f\uc818\uc811", "\ud8db\ud8db\ud8da\ud8d1\ud8d0\ud8dd\ud8d9\ud8dd", "\ud00b\ud00b\ud009\ud00c\ud003\ud00b\ud009\ud00c", "\u73bc\u73b8\u73b4\u73b4\u73bd\u73b5\u73b8\u73ba", "\u3fc8\u3fcf\u3fcf\u3fce\u3fcb\u3fc5", "\u942a\u942b\u942c\u942f\u9425\u9429\u9428\u942d", "\uc952\uc950\uc953\uc95a\uc957\uc956\uc950\uc95b", "\ube7e\ube7c\ube79\ube7f\ube7a\ube7f\ube7e\ube78", "\u3289\u3286\u3289\u328c\u328a\u328e\u328d\u328b", "\udce6\udcea\udce1\udce7\udce5\udce0\udce7\udce5", "\u325b\u325c\u325e\u325d\u3258\u325c\u325b\u3250", "\ue6f3\ue6f2\ue6f2\ue6f4\ue6f0\ue6fd\ue6f7\ue6fc", "\u2358\u235e\u235c\u235a\u235d\u235c\u2359"}, d2={"\u0333\u032d\u031f\u2359\u036b\u0369\u037f\u031b\u033d\u0336\u0321\u0336\u0378\u033b\u0336\u0339\u0330\u0378\u0304\u0323\u0325\u033e\u0339\u0330\u036c\u037e\u031b\u033d\u0336\u0321\u0336\u0378\u033b\u0336\u0339\u0330\u0378\u0304\u0323\u0325\u033e\u0339\u0330\u036c", "\u0228\u0236\u0205\u2242\u0270\u0272\u0264\u0200\u0226\u022d\u023a\u022d\u0263\u0220\u022d\u0222\u022b\u0263\u021f\u0238\u023e\u0225\u0222\u022b\u0277\u0265\u0200\u0226\u022d\u023a\u022d\u0263\u0220\u022d\u0222\u022b\u0263\u021f\u0238\u023e\u0225\u0222\u022b\u0277", "\u01e8\u01f6\u01c6\u2182\u01b0\u01b2\u01a4\u01c0\u01e6\u01ed\u01fa\u01ed\u01a3\u01e0\u01ed\u01e2\u01eb\u01a3\u01df\u01f8\u01fe\u01e5\u01e2\u01eb\u01b7\u01a5\u01c0\u01e6\u01ed\u01fa\u01ed\u01a3\u01e0\u01ed\u01e2\u01eb\u01a3\u01df\u01f8\u01fe\u01e5\u01e2\u01eb\u01b7", "\u0172\u016c\u015d\u2118\u012a\u0128\u013e\u015a\u017c\u0177\u0160\u0177\u0139\u017a\u0177\u0178\u0171\u0139\u0145\u0162\u0164\u017f\u0178\u0171\u012d\u013f\u015a\u017c\u0177\u0160\u0177\u0139\u017a\u0177\u0178\u0171\u0139\u0145\u0162\u0164\u017f\u0178\u0171\u012d", "\u0328\u0377\u0378\u037d\u037a\u037d\u0360\u032a\u0328\u032a\u033c\u033d\u0342", "\u0097\u00c2\u00c5\u00c2\u00df\u0095\u0097\u0095\u0083\u0082\u00fd", "\u0390\u0392\u0383\u03b4\u039b\u0396\u0384\u0384\u03cb\u03c9\u03df\u03de\u03bb\u039d\u0396\u0381\u0396\u03d8\u039b\u0396\u0399\u0390\u03d8\u03b4\u039b\u0396\u0384\u0384\u03cc", "\u00dd\u00d4\u00c6\u00dd\u00f6\u00da\u00d1\u00d0\u0089\u008b\u009d\u009c\u00fc", "\u04fa\u04ee\u04ea\u04fe\u04f3\u04ec\u04a3\u04a1\u04b7\u04d3\u04f5\u04fe\u04e9\u04fe\u04b0\u04f3\u04fe\u04f1\u04f8\u04b0\u04d0\u04fd\u04f5\u04fa\u04fc\u04eb\u04a4\u04b6\u04c5", "\u00f4\u00fb\u00f8\u00f9\u00f2\u00ab\u00a9\u00bf\u00be\u00db\u00fd\u00f6\u00e1\u00f6\u00b8\u00fb\u00f6\u00f9\u00f0\u00b8\u00d8\u00f5\u00fd\u00f2\u00f4\u00e3\u00ac", "\u039c\u0387\u03bb\u039c\u039a\u0381\u0386\u038f\u03d4\u03d6\u03c0\u03c1\u03a4\u0382\u0389\u039e\u0389\u03c7\u0384\u0389\u0386\u038f\u03c7\u03bb\u039c\u039a\u0381\u0386\u038f\u03d3", "\u0161\u0160\u017b\u0166\u0169\u0176\u0133\u0131\u0127\u0126\u0159", "~\u007fdyviQ||,.89F", "\u06dc\u06ca\u06c2\u06df\u0697\u0695\u0683\u0682\u06fd", "\u00e2\u00f4\u00fc\u00e1\u00a9\u00ab\u00bd\u00df\u00bc\u00c3", "\u0159\u014f\u0147\u015a\u011e\u0112\u0110\u0106\u0164\u0107\u0178", "\u02a9\u02bf\u02b7\u02aa\u02e2\u02e0\u02f6\u0294\u0297\u02f7\u0288", "\u04f2\u04fd\u04fa\u04f5\u04f8\u04fd\u04ee\u04f1\u04a8\u04aa\u04bc\u04bd\u04c2"})
public final class Class3996 {
    public static float field9148;
    public static double field9149;
    public static double field9150;
    public static double field9151 = 0.15466929176639121;
    public static String field9152;
    public static int field9153 = 0;

    private static String QheIzgJ17Bz9HDSQ(String a2, int b2) {
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
    private static CallSite a2pgtU4GOriNbp(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3996.QheIzgJ17Bz9HDSQ(k2, 78464785));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 33768 : 33769;
        block6: while (true) {
            switch (n3) {
                case 33769: {
                    n3 = 33767;
                    continue block6;
                }
                case 33768: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3996.QheIzgJ17Bz9HDSQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3996.QheIzgJ17Bz9HDSQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3996.QheIzgJ17Bz9HDSQ(k2, 78464785) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        t\u200e = "Renders nametags on invisible players";
        field9149 = Double.longBitsToDouble(4603097263724074151L);
        field9150 = Double.longBitsToDouble(4605961208861125302L);
        field9148 = Float.intBitsToFloat(1044793640);
        bg\u200e = "Allows the player to jump farther";
        bv\u200e = "Ignore players with no items";
        field9152 = "value";
    }
}

