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

@HACHIMI_CLIENT(mv=100, d1={"\u8d5c\u8d58\u8d58\u8d56\u8d5a\u8d5c\u8d5b\u8d5a", "\udca9\udca9\udca9\udcaa\udcaf\udcaa\udcac\udcac", "\u3f87\u3f86\u3f89\u3f89\u3f81\u3f85\u3f87", "\ub459\ub458\ub45d\ub45e\ub458\ub453\ub45d\ub453", "\ud24c\ud24d\ud242\ud249\ud242\ud248\ud249", "_[R[_\\_", "\u8f0b\u8f0b\u8f0d\u8f0d\u8f08\u8f06\u8f09\u8f0a", "\ub917\ub913\ub913\ub912\ub913\ub912\ub917\ub911", "\u3f1c\u3f1e\u3f1f\u3f1e\u3f10\u3f1c\u3f19\u3f1b", "\ube21\ube26\ube25\ube24\ube23\ube20\ube20", "\u694f\u6941\u6948\u694f\u694d\u6940\u6940", "\u6144\u6147\u6149\u6146\u6148\u6143\u6142\u6149", "\u5a00\u5a08\u5a05\u5a02\u5a09\u5a07\u5a06\u5a00", "\u7f48\u7f49\u7f48\u7f45\u7f4b\u7f45\u7f49\u7f44"}, d2={"\u0277\u0228\u0227\u0222\u0225\u0222\u023f\u0275\u0277\u0275\u0263\u0262\u021d", "\u00bc\u00e9\u00ee\u00e9\u00f4\u00be\u00bc\u00be\u00a8\u00a9\u00d6", "\u0084\u0086\u0097\u00a0\u008f\u0082\u0090\u0090\u00df\u00dd\u00cb\u00ca\u00af\u0089\u0082\u0095\u0082\u00cc\u008f\u0082\u008d\u0084\u00cc\u00a0\u008f\u0082\u0090\u0090\u00d8", "\u0510\u0519\u050b\u0510\u053b\u0517\u051c\u051d\u0544\u0546\u0550\u0551\u0531", "\u01d6\u01c2\u01c6\u01d2\u01df\u01c0\u018f\u018d\u019b\u01ff\u01d9\u01d2\u01c5\u01d2\u019c\u01df\u01d2\u01dd\u01d4\u019c\u01fc\u01d1\u01d9\u01d6\u01d0\u01c7\u0188\u019a\u01e9", "\u0469\u0466\u0465\u0464\u046f\u0436\u0434\u0422\u0423\u0446\u0460\u046b\u047c\u046b\u0425\u0466\u046b\u0464\u046d\u0425\u0445\u0468\u0460\u046f\u0469\u047e\u0431", "\u04df\u04c4\u04f8\u04df\u04d9\u04c2\u04c5\u04cc\u0497\u0495\u0483\u0482\u04e7\u04c1\u04ca\u04dd\u04ca\u0484\u04c7\u04ca\u04c5\u04cc\u0484\u04f8\u04df\u04d9\u04c2\u04c5\u04cc\u0490", "\u037a\u037b\u0360\u037d\u0372\u036d\u0328\u032a\u033c\u033d\u0342", "\u0499\u0498\u0483\u049e\u0491\u048e\u04b6\u049b\u049b\u04cb\u04c9\u04df\u04de\u04a1", "\u070c\u071a\u0712\u070f\u0747\u0745\u0753\u0752\u072d", "\u00c6\u00d0\u00d8\u00c5\u008d\u008f\u0099\u00fb\u0098\u00e7", "\u0172\u0164\u016c\u0171\u0135\u0139\u013b\u012d\u014f\u012c\u0153", "\u013e\u0128\u0120\u013d\u0175\u0177\u0161\u0103\u0100\u0160\u011f", "\u07bd\u07b2\u07b5\u07ba\u07b7\u07b2\u07a1\u07be\u07e7\u07e5\u07f3\u07f2\u078d"})
public final class Class5505 {
    public static float field10356 = Float.intBitsToFloat(1058819912);
    public static int field10357 = 1;
    public static float field10358 = 0.9232922f;

    private static String svrRjqBD4QP4lD1r(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite vQ97NqOzGjzWLx(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5505.svrRjqBD4QP4lD1r(k2, 594078131));
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
                int a2 = Integer.parseInt(Class5505.svrRjqBD4QP4lD1r(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5505.svrRjqBD4QP4lD1r(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5505.svrRjqBD4QP4lD1r(k2, 594078131) + " " + l2 + " " + m2);
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

