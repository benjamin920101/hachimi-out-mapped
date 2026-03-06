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

@HACHIMI_CLIENT(mv=100, d1={"\ub5e9\ub5e8\ub5ea\ub5ed\ub5eb\ub5e9\ub5eb\ub5ef", "\u698f\u698a\u698a\u698d\u6987\u6986\u6988\u698a", "\u2e7b\u2e7f\u2e78\u2e7c\u2e7b\u2e70\u2e7a", "\ua6cd\ua6cd\ua6c7\ua6ca\ua6cc\ua6cf\ua6c7\ua6cd", "\u0375\u037f\u0379\u037d\u037e\u0375\u037f", "\ub941\ub945\ub94f\ub945\ub947\ub942\ub942\ub940", "\ua586\ua586\ua582\ua586\ua589\ua588\ua580\ua580", "\ue269\ue26e\ue268\ue26c\ue264\ue269\ue269\ue26d", "\u5700\u5707\u5706\u5704\u5706\u5706\u5702\u5704", "\u8421\u8422\u8420\u842f\u8423\u8420\u8423\u8424", "\u1165\u1160\u1162\u1161\u1161\u1160\u1161\u116c", "\u906d\u9068\u906e\u906b\u906d\u906c\u906b\u9065", "\u67be\u67bb\u67b8\u67b4\u67be\u67be\u67b4\u67b9", "\u27db\u27db\u27de\u27d8\u27db\u27db\u27de"}, d2={"\u02b1\u02ee\u02e1\u02e4\u02e3\u02e4\u02f9\u02b3\u02b1\u02b3\u02a5\u02a4\u02db", "\u054d\u0518\u051f\u0518\u0505\u054f\u054d\u054f\u0559\u0558\u0527", "\u01e6\u01e4\u01f5\u01c2\u01ed\u01e0\u01f2\u01f2\u01bd\u01bf\u01a9\u01a8\u01cd\u01eb\u01e0\u01f7\u01e0\u01ae\u01ed\u01e0\u01ef\u01e6\u01ae\u01c2\u01ed\u01e0\u01f2\u01f2\u01ba", "\u031a\u0313\u0301\u031a\u0331\u031d\u0316\u0317\u034e\u034c\u035a\u035b\u033b", "\u04ff\u04eb\u04ef\u04fb\u04f6\u04e9\u04a6\u04a4\u04b2\u04d6\u04f0\u04fb\u04ec\u04fb\u04b5\u04f6\u04fb\u04f4\u04fd\u04b5\u04d5\u04f8\u04f0\u04ff\u04f9\u04ee\u04a1\u04b3\u04c0", "\u061b\u0614\u0617\u0616\u061d\u0644\u0646\u0650\u0651\u0634\u0612\u0619\u060e\u0619\u0657\u0614\u0619\u0616\u061f\u0657\u0637\u061a\u0612\u061d\u061b\u060c\u0643", "QJvQWLKB\u0019\u001b\r\fiODSD\nIDKB\nvQWLKB\u001e", "\u05f5\u05f4\u05ef\u05f2\u05fd\u05e2\u05a7\u05a5\u05b3\u05b2\u05cd", "\u00ff\u00fe\u00e5\u00f8\u00f7\u00e8\u00d0\u00fd\u00fd\u00ad\u00af\u00b9\u00b8\u00c7", "\u0316\u0300\u0308\u0315\u035d\u035f\u0349\u0348\u0337", "\u073b\u072d\u0725\u0738\u0770\u0772\u0764\u0706\u0765\u071a", "\u0329\u033f\u0337\u032a\u036e\u0362\u0360\u0376\u0314\u0377\u0308", "\u009f\u0089\u0081\u009c\u00d4\u00d6\u00c0\u00a2\u00a1\u00c1\u00be", "JEBM@EVI\u0010\u0012\u0004\u0005z"})
public final class Class3608 {
    public static double field8045;
    public static double field8046;
    public static float field8047 = 0.2721154f;
    public static float field8048;
    public static float field8049 = 0.37356037f;

    /*
     * WARNING - void declaration
     */
    private static CallSite sfecVdWx3MUjeN(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3608.DhqvGvkF0SwIAtbo(k2, 885495901));
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
                int a2 = Integer.parseInt(Class3608.DhqvGvkF0SwIAtbo(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3608.DhqvGvkF0SwIAtbo(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3608.DhqvGvkF0SwIAtbo(k2, 885495901) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String DhqvGvkF0SwIAtbo(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 43307 : 43306;
            block5: while (true) {
                switch (n2) {
                    case 43307: {
                        n2 = 43305;
                        continue block5;
                    }
                    case 43306: {
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
        field8046 = Double.longBitsToDouble(4604222496890997786L);
        field8048 = Float.intBitsToFloat(1064841856);
        field8045 = Double.longBitsToDouble(4591410439306231720L);
    }
}

