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

@HACHIMI_CLIENT(mv=100, d1={"\u2042\u204b\u2042\u2042\u2040\u2045\u2040\u2046", "\u1f98\u1f99\u1f9c\u1f9e\u1f9b\u1f9f\u1f98", "\ua87c\ua87c\ua870\ua87f\ua87e\ua878\ua879\ua87d", "\u6740\u6744\u674c\u6743\u6745\u6744\u674d\u674c", "\udbad\udbae\udbae\udba6\udba7\udba6\udbaa\udba7", "\ub5a4\ub5a2\ub5a6\ub5a1\ub5a6\ub5a2\ub5a2\ub5a9", "\u98bb\u98b7\u98b6\u98b6\u98bb\u98b6\u98bf\u98b6", "\u37d6\u37d5\u37d1\u37d0\u37d5\u37d2\u37d2\u37d6", "\u9f44\u9f45\u9f41\u9f40\u9f4f\u9f47\u9f42\u9f4e", "\u9cdb\u9cdf\u9cdf\u9cd9\u9cdf\u9cde\u9cde", "\uc9c4\uc9c3\uc9cd\uc9c1\uc9c3\uc9c2\uc9c2\uc9c0", "\u2fcc\u2fce\u2fca\u2fca\u2fc0\u2fcd\u2fc9\u2fca", "\u81e1\u81e1\u81e0\u81ed\u81e4\u81ed\u81e2\u81e6", "\u83c8\u83c5\u83cc\u83c8\u83c5\u83cd\u83c5\u83c5", "\u1ee1\u1eee\u1ee8\u1ee0\u1ee8\u1ee0", "\u3c78\u3c7d\u3c7d\u3c7a\u3c75\u3c7f\u3c7e\u3c7f"}, d2={"\u00bc\u00be\u0089\u20de\u00ec\u00ee\u00f8\u009c\u00ba\u00b1\u00a6\u00b1\u00ff\u00bc\u00b1\u00be\u00b7\u00ff\u0083\u00a4\u00a2\u00b9\u00be\u00b7\u00eb\u00f9\u009c\u00ba\u00b1\u00a6\u00b1\u00ff\u00bc\u00b1\u00be\u00b7\u00ff\u0083\u00a4\u00a2\u00b9\u00be\u00b7\u00eb", "\u074f\u074d\u0779\u272d\u071f\u071d\u070b\u076f\u0749\u0742\u0755\u0742\u070c\u074f\u0742\u074d\u0744\u070c\u0770\u0757\u0751\u074a\u074d\u0744\u0718\u070a\u076f\u0749\u0742\u0755\u0742\u070c\u074f\u0742\u074d\u0744\u070c\u0770\u0757\u0751\u074a\u074d\u0744\u0718", "\u03e6\u03b9\u03b6\u03b3\u03b4\u03b3\u03ae\u03e4\u03e6\u03e4\u03f2\u03f3\u038c", "\u01b1\u01e4\u01e3\u01e4\u01f9\u01b3\u01b1\u01b3\u01a5\u01a4\u01db", "\u039e\u039c\u038d\u03ba\u0395\u0398\u038a\u038a\u03c5\u03c7\u03d1\u03d0\u03b5\u0393\u0398\u038f\u0398\u03d6\u0395\u0398\u0397\u039e\u03d6\u03ba\u0395\u0398\u038a\u038a\u03c2", "\u06b5\u06bc\u06ae\u06b5\u069e\u06b2\u06b9\u06b8\u06e1\u06e3\u06f5\u06f4\u0694", "\u01d8\u01cc\u01c8\u01dc\u01d1\u01ce\u0181\u0183\u0195\u01f1\u01d7\u01dc\u01cb\u01dc\u0192\u01d1\u01dc\u01d3\u01da\u0192\u01f2\u01df\u01d7\u01d8\u01de\u01c9\u0186\u0194\u01e7", "\u0001\u000e\r\f\u0007^\\JK.\b\u0003\u0014\u0003M\u000e\u0003\f\u0005M-\u0000\b\u0007\u0001\u0016Y", "\u031b\u0300\u033c\u031b\u031d\u0306\u0301\u0308\u0353\u0351\u0347\u0346\u0323\u0305\u030e\u0319\u030e\u0340\u0303\u030e\u0301\u0308\u0340\u033c\u031b\u031d\u0306\u0301\u0308\u0354", "\u0642\u0643\u0658\u0645\u064a\u0655\u0610\u0612\u0604\u0605\u067a", "\u05b0\u05b1\u05aa\u05b7\u05b8\u05a7\u059f\u05b2\u05b2\u05e2\u05e0\u05f6\u05f7\u0588", "\u0585\u0593\u059b\u0586\u05ce\u05cc\u05da\u05db\u05a4", "\u00e6\u00f0\u00f8\u00e5\u00ad\u00af\u00b9\u00db\u00b8\u00c7", "\u060f\u0619\u0611\u060c\u0648\u0644\u0646\u0650\u0632\u0651\u062e", "\u00f2\u00e4\u00ec\u00f1\u00b9\u00bb\u00ad\u00cf\u00cc\u00ac\u00d3", "\u0180\u018f\u0188\u0187\u018a\u018f\u019c\u0183\u01da\u01d8\u01ce\u01cf\u01b0"})
public final class Class1643 {
    public static int field6104 = 1037083105;
    public static double field6105 = 0.7258166513783125;
    public static double field6106 = 0.441593009092731;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite yT4r864tvnwnK6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1643.SzGAltJFBWmzl44i(k2, -811179160));
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
                int a2 = Integer.parseInt(Class1643.SzGAltJFBWmzl44i(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1643.SzGAltJFBWmzl44i(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1643.SzGAltJFBWmzl44i(k2, -811179160) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 61943 : 61944;
        block7: while (true) {
            switch (n3) {
                case 61944: {
                    n3 = 61942;
                    continue block7;
                }
                case 61943: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String SzGAltJFBWmzl44i(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 2562 : 2561;
            block5: while (true) {
                switch (n2) {
                    case 2562: {
                        n2 = 2560;
                        continue block5;
                    }
                    case 2561: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    static {
        S\u200e = "No Nbt tags on this item!";
        aL\u200e = "The render color for items";
    }
}

