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

@HACHIMI_CLIENT(mv=100, d1={"\u8bd2\u8bd4\u8bd3\u8bd3\u8bd5\u8bd0\u8bd6\u8bd4", "\ucf4b\ucf4e\ucf4e\ucf46\ucf4e\ucf47\ucf47\ucf46", "\u28b9\u28bd\u28bf\u28be\u28be\u28b4\u28be", "\udb42\udb44\udb44\udb42\udb4e\udb41\udb4e\udb4f", "\u7e8c\u7e86\u7e8e\u7e8c\u7e8a\u7e8c\u7e8d\u7e88", "\u85be\u85bd\u85b9\u85b3\u85bb\u85b2\u85b3", "\uce9c\uce9a\uce98\uce9a\uce9f\uce9e\uce9d\uce9c", "\udd41\udd47\udd4e\udd4f\udd44\udd42\udd47\udd41", "\ub0f8\ub0f9\ub0fc\ub0f5\ub0ff\ub0f8\ub0fa\ub0f9", "\ucf55\ucf55\ucf5b\ucf57\ucf57\ucf52\ucf52", "\ud63d\ud63a\ud63b\ud63d\ud636\ud63d\ud63e\ud63f", "\u9b1a\u9b1a\u9b1c\u9b1e\u9b14\u9b14\u9b14\u9b1c", "\u8eb2\u8eba\u8eb6\u8eb2\u8eb2\u8eb5\u8eb1\u8eb1", "\u9a6e\u9a68\u9a68\u9a6e\u9a68\u9a69\u9a65\u9a64", "\uce22\uce25\uce26\uce26\uce25\uce25\uce29\uce25", "\u28d1\u28d6\u28d9\u28d2\u28d4\u28d6\u28d5\u28d2"}, d2={"\u03fe\u03d5\u03c4\u239c\u03ae\u03ac\u03ba\u03de\u03f8\u03f3\u03e4\u03f3\u03bd\u03fe\u03f3\u03fc\u03f5\u03bd\u03c1\u03e6\u03e0\u03fb\u03fc\u03f5\u03a9\u03bb\u03de\u03f8\u03f3\u03e4\u03f3\u03bd\u03fe\u03f3\u03fc\u03f5\u03bd\u03c1\u03e6\u03e0\u03fb\u03fc\u03f5\u03a9", "\u041d\u0436\u0426\u247f\u044d\u044f\u0459\u043d\u041b\u0410\u0407\u0410\u045e\u041d\u0410\u041f\u0416\u045e\u0422\u0405\u0403\u0418\u041f\u0416\u044a\u0458\u043d\u041b\u0410\u0407\u0410\u045e\u041d\u0410\u041f\u0416\u045e\u0422\u0405\u0403\u0418\u041f\u0416\u044a", "\u01f9\u01a6\u01a9\u01ac\u01ab\u01ac\u01b1\u01fb\u01f9\u01fb\u01ed\u01ec\u0193", "\u01ab\u01fe\u01f9\u01fe\u01e3\u01a9\u01ab\u01a9\u01bf\u01be\u01c1", "\u0781\u0783\u0792\u07a5\u078a\u0787\u0795\u0795\u07da\u07d8\u07ce\u07cf\u07aa\u078c\u0787\u0790\u0787\u07c9\u078a\u0787\u0788\u0781\u07c9\u07a5\u078a\u0787\u0795\u0795\u07dd", "\u04cf\u04c6\u04d4\u04cf\u04e4\u04c8\u04c3\u04c2\u049b\u0499\u048f\u048e\u04ee", "\u04e7\u04f3\u04f7\u04e3\u04ee\u04f1\u04be\u04bc\u04aa\u04ce\u04e8\u04e3\u04f4\u04e3\u04ad\u04ee\u04e3\u04ec\u04e5\u04ad\u04cd\u04e0\u04e8\u04e7\u04e1\u04f6\u04b9\u04ab\u04d8", "\u0086\u0089\u008a\u008b\u0080\u00d9\u00db\u00cd\u00cc\u00a9\u008f\u0084\u0093\u0084\u00ca\u0089\u0084\u008b\u0082\u00ca\u00aa\u0087\u008f\u0080\u0086\u0091\u00de", "\u0789\u0792\u07ae\u0789\u078f\u0794\u0793\u079a\u07c1\u07c3\u07d5\u07d4\u07b1\u0797\u079c\u078b\u079c\u07d2\u0791\u079c\u0793\u079a\u07d2\u07ae\u0789\u078f\u0794\u0793\u079a\u07c6", "\u0518\u0519\u0502\u051f\u0510\u050f\u054a\u0548\u055e\u055f\u0520", "\u038b\u038a\u0391\u038c\u0383\u039c\u03a4\u0389\u0389\u03d9\u03db\u03cd\u03cc\u03b3", "\u00ae\u00b8\u00b0\u00ad\u00e5\u00e7\u00f1\u00f0\u008f", "\u0501\u0517\u051f\u0502\u054a\u0548\u055e\u053c\u055f\u0520", "\u008a\u009c\u0094\u0089\u00cd\u00c1\u00c3\u00d5\u00b7\u00d4\u00ab", "\u03f2\u03e4\u03ec\u03f1\u03b9\u03bb\u03ad\u03cf\u03cc\u03ac\u03d3", "\u04ef\u04e0\u04e7\u04e8\u04e5\u04e0\u04f3\u04ec\u04b5\u04b7\u04a1\u04a0\u04df"})
public final class Class4139 {
    public static float field9615;
    public static float field9616;
    public static int field9617 = 617179274;
    public static double field9618;
    public static int field9619 = 913611125;

    private static String H6dyAD6XSwaVSbh1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Ie4oeAa1oZr4Uj(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4139.H6dyAD6XSwaVSbh1(k2, -1752847246));
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
                int a2 = Integer.parseInt(Class4139.H6dyAD6XSwaVSbh1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4139.H6dyAD6XSwaVSbh1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4139.H6dyAD6XSwaVSbh1(k2, -1752847246) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        I\u200e = "CIRC_OUT";
        field9615 = Float.intBitsToFloat(1057388768);
        field9616 = Float.intBitsToFloat(1057100175);
        field9618 = Double.longBitsToDouble(4604421637089287328L);
        bk\u200e = "RainbowSpeed";
    }
}

