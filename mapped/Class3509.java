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
@HACHIMI_CLIENT(mv=100, d1={"\ub193\ub195\ub194\ub192\ub192\ub193\ub193\ub190", "\u6537\u6535\u6530\u6535\u6536\u6537\u653d\u653d", "\u8cf8\u8cf2\u8cff\u8cfb\u8cf8\u8cf9\u8cf9\u8cfb", "\u1a0a\u1a0e\u1a0f\u1a0a\u1a0e\u1a04\u1a05\u1a09", "\u5bde\u5bdb\u5bd9\u5bdf\u5bdc\u5bda\u5bd2\u5bd2", "\u5730\u5730\u573c\u5732\u573c\u5732\u573d\u5733", "\u5502\u5501\u550e\u5500\u5505\u5501\u5502", "\ub35c\ub35b\ub35c\ub35a\ub35f\ub358\ub359\ub358", "\u3340\u334a\u3343\u3340\u3341\u3346\u334b", "\u57f9\u57fe\u57fc\u57fb\u57f9\u57fe\u57f5\u57f8", "\ua0a8\ua0a9\ua0aa\ua0ad\ua0ad\ua0ad\ua0ae\ua0ad", "\ua9af\ua9ae\ua9af\ua9ae\ua9af\ua9af\ua9ad\ua9a8", "\u556e\u5560\u556d\u556f\u5569\u5561\u556d\u556d", "\uc45d\uc456\uc45e\uc45a\uc459\uc458\uc45b\uc45c", "\ubeee\ubeed\ubee2\ubeed\ubee9\ubeeb\ubee8\ubee3", "\u23be\u23b5\u23ba\u23bc\u23b4\u23b5\u23be\u23b5"}, d2={"\u0568\u0544\u057e\u2503\u0531\u0533\u0525\u0541\u0567\u056c\u057b\u056c\u0522\u0561\u056c\u0563\u056a\u0522\u055e\u0579\u057f\u0564\u0563\u056a\u0536\u0524\u0541\u0567\u056c\u057b\u056c\u0522\u0561\u056c\u0563\u056a\u0522\u055e\u0579\u057f\u0564\u0563\u056a\u0536", "\u00df\u00f3\u00ce\u20b4\u0086\u0084\u0092\u00f6\u00d0\u00db\u00cc\u00db\u0095\u00d6\u00db\u00d4\u00dd\u0095\u00e9\u00ce\u00c8\u00d3\u00d4\u00dd\u0081\u0093\u00f6\u00d0\u00db\u00cc\u00db\u0095\u00d6\u00db\u00d4\u00dd\u0095\u00e9\u00ce\u00c8\u00d3\u00d4\u00dd\u0081", "\u0640\u061f\u0610\u0615\u0612\u0615\u0608\u0642\u0640\u0642\u0654\u0655\u062a", "\u0130\u0165\u0162\u0165\u0178\u0132\u0130\u0132\u0124\u0125\u015a", "\u0753\u0751\u0740\u0777\u0758\u0755\u0747\u0747\u0708\u070a\u071c\u071d\u0778\u075e\u0755\u0742\u0755\u071b\u0758\u0755\u075a\u0753\u071b\u0777\u0758\u0755\u0747\u0747\u070f", "\u068e\u0687\u0695\u068e\u06a5\u0689\u0682\u0683\u06da\u06d8\u06ce\u06cf\u06af", "\u05e3\u05f7\u05f3\u05e7\u05ea\u05f5\u05ba\u05b8\u05ae\u05ca\u05ec\u05e7\u05f0\u05e7\u05a9\u05ea\u05e7\u05e8\u05e1\u05a9\u05c9\u05e4\u05ec\u05e3\u05e5\u05f2\u05bd\u05af\u05dc", "\u03db\u03d4\u03d7\u03d6\u03dd\u0384\u0386\u0390\u0391\u03f4\u03d2\u03d9\u03ce\u03d9\u0397\u03d4\u03d9\u03d6\u03df\u0397\u03f7\u03da\u03d2\u03dd\u03db\u03cc\u0383", "\u0506\u051d\u0521\u0506\u0500\u051b\u051c\u0515\u054e\u054c\u055a\u055b\u053e\u0518\u0513\u0504\u0513\u055d\u051e\u0513\u051c\u0515\u055d\u0521\u0506\u0500\u051b\u051c\u0515\u0549", "\u014f\u014e\u0155\u0148\u0147\u0158\u011d\u011f\u0109\u0108\u0177", "\u059e\u059f\u0584\u0599\u0596\u0589\u05b1\u059c\u059c\u05cc\u05ce\u05d8\u05d9\u05a6", "\u04e6\u04f0\u04f8\u04e5\u04ad\u04af\u04b9\u04b8\u04c7", "\u0289\u029f\u0297\u028a\u02c2\u02c0\u02d6\u02b4\u02d7\u02a8", "\u04b1\u04a7\u04af\u04b2\u04f6\u04fa\u04f8\u04ee\u048c\u04ef\u0490", "\u078c\u079a\u0792\u078f\u07c7\u07c5\u07d3\u07b1\u07b2\u07d2\u07ad", "\u033a\u0335\u0332\u033d\u0330\u0335\u0326\u0339\u0360\u0362\u0374\u0375\u030a"})
public final class Class3509 {
    public static float field7727 = Float.intBitsToFloat(1043749260);
    public static float field7728;
    public static float field7729;
    public static float field7730;

    static {
        q\u200e = "instant_health";
        field7729 = Float.intBitsToFloat(1038571816);
        br\u200e = "The distance of your reach";
        field7730 = Float.intBitsToFloat(1060786494);
        field7728 = Float.intBitsToFloat(1056598820);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite wpzBmgSFXtdwWl(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3509.7Z6a87l24V7NHlAN(k2, -33507559));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3509.7Z6a87l24V7NHlAN(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 10436 : 10437;
            block7: while (true) {
                switch (n3) {
                    case 10437: {
                        n3 = 10435;
                        continue block7;
                    }
                    case 10436: {
                        String c2 = Class3509.7Z6a87l24V7NHlAN(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class3509.7Z6a87l24V7NHlAN(k2, -33507559) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 7Z6a87l24V7NHlAN(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 64119 : 64120;
            block5: while (true) {
                switch (n2) {
                    case 64120: {
                        n2 = 64118;
                        continue block5;
                    }
                    case 64119: {
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
}

