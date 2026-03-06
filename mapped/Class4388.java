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

@HACHIMI_CLIENT(mv=100, d1={"\u142a\u142a\u142d\u142a\u1423\u142c\u142d\u1429", "\u9d09\u9d00\u9d01\u9d0f\u9d01\u9d0b\u9d0f\u9d0c", "\u7243\u7246\u7247\u7242\u724d\u724d\u7246\u7240", "\u5529\u552e\u552f\u5529\u5527\u5527\u552d\u5528", "\u07a7\u07a3\u07ad\u07ad\u07ad\u07a7\u07a4\u07a2", "\ubfba\ubfbb\ubfbf\ubfb1\ubfbf\ubfbb\ubfbf\ubfb0", "\uc5a5\uc5a7\uc5ad\uc5ac\uc5a2\uc5ad\uc5a5\uc5ac", "\u2414\u2415\u2418\u2419\u2411\u2412\u2417\u2411", "\ud53b\ud53a\ud53b\ud531\ud53b\ud531\ud530\ud53f", "\uda26\uda26\uda24\uda23\uda2c\uda20\uda27\uda24", "\u35d3\u35d0\u35d4\u35d1\u35db\u35da\u35d5\u35da", "\u4f78\u4f78\u4f7d\u4f7e\u4f79\u4f7c\u4f7a\u4f7d", "\uaa2e\uaa2b\uaa2d\uaa21\uaa28\uaa20\uaa2e\uaa2b", "\u9804\u9802\u9802\u980d\u9803\u980c\u9800\u9804", "\u99ae\u99ac\u99ae\u99ad\u99ac\u99a2\u99ae", "\u9239\u923a\u923d\u923a\u9233\u9238\u923e\u923b", "\u2af6\u2afc\u2af1\u2af4\u2af2\u2af4\u2af4"}, d2={"\u0185\u0183\u019a\u21ee\u01dc\u01de\u01c8\u01ac\u018a\u0181\u0196\u0181\u01cf\u018c\u0181\u018e\u0187\u01cf\u01b3\u0194\u0192\u0189\u018e\u0187\u01db\u01c9\u01ac\u018a\u0181\u0196\u0181\u01cf\u018c\u0181\u018e\u0187\u01cf\u01b3\u0194\u0192\u0189\u018e\u0187\u01db", "\u05f9\u05ff\u05dd\u2592\u05a0\u05a2\u05b4\u05d0\u05f6\u05fd\u05ea\u05fd\u05b3\u05f0\u05fd\u05f2\u05fb\u05b3\u05cf\u05e8\u05ee\u05f5\u05f2\u05fb\u05a7\u05b5\u05d0\u05f6\u05fd\u05ea\u05fd\u05b3\u05f0\u05fd\u05f2\u05fb\u05b3\u05cf\u05e8\u05ee\u05f5\u05f2\u05fb\u05a7", "\u0514\u0512\u0533\u257f\u054d\u054f\u0559\u053d\u051b\u0510\u0507\u0510\u055e\u051d\u0510\u051f\u0516\u055e\u0522\u0505\u0503\u0518\u051f\u0516\u054a\u0558\u053d\u051b\u0510\u0507\u0510\u055e\u051d\u0510\u051f\u0516\u055e\u0522\u0505\u0503\u0518\u051f\u0516\u054a", "\u05f4\u05ab\u05a4\u05a1\u05a6\u05a1\u05bc\u05f6\u05f4\u05f6\u05e0\u05e1\u059e", "\u06fc\u06a9\u06ae\u06a9\u06b4\u06fe\u06fc\u06fe\u06e8\u06e9\u0696", "\u051c\u051e\u050f\u0538\u0517\u051a\u0508\u0508\u0547\u0545\u0553\u0552\u0537\u0511\u051a\u050d\u051a\u0554\u0517\u051a\u0515\u051c\u0554\u0538\u0517\u051a\u0508\u0508\u0540", "\u001e\u0017\u0005\u001e5\u0019\u0012\u0013JH^_?", "\u030a\u031e\u031a\u030e\u0303\u031c\u0353\u0351\u0347\u0323\u0305\u030e\u0319\u030e\u0340\u0303\u030e\u0301\u0308\u0340\u0320\u030d\u0305\u030a\u030c\u031b\u0354\u0346\u0335", "\u04ba\u04b5\u04b6\u04b7\u04bc\u04e5\u04e7\u04f1\u04f0\u0495\u04b3\u04b8\u04af\u04b8\u04f6\u04b5\u04b8\u04b7\u04be\u04f6\u0496\u04bb\u04b3\u04bc\u04ba\u04ad\u04e2", "\u0730\u072b\u0717\u0730\u0736\u072d\u072a\u0723\u0778\u077a\u076c\u076d\u0708\u072e\u0725\u0732\u0725\u076b\u0728\u0725\u072a\u0723\u076b\u0717\u0730\u0736\u072d\u072a\u0723\u077f", "\u0715\u0714\u070f\u0712\u071d\u0702\u0747\u0745\u0753\u0752\u072d", "\u07f0\u07f1\u07ea\u07f7\u07f8\u07e7\u07df\u07f2\u07f2\u07a2\u07a0\u07b6\u07b7\u07c8", "\u07b2\u07a4\u07ac\u07b1\u07f9\u07fb\u07ed\u07ec\u0793", "\u06f9\u06ef\u06e7\u06fa\u06b2\u06b0\u06a6\u06c4\u06a7\u06d8", "\u0245\u0253\u025b\u0246\u0202\u020e\u020c\u021a\u0278\u021b\u0264", "\u00cb\u00dd\u00d5\u00c8\u0080\u0082\u0094\u00f6\u00f5\u0095\u00ea", "\u01c3\u01cc\u01cb\u01c4\u01c9\u01cc\u01df\u01c0\u0199\u019b\u018d\u018c\u01f3"})
public final class Class4388 {
    public static float field10019 = 0.09199065f;
    public static float field10020;
    public static double field10021;
    public static int field10022 = 958133747;

    private static String UtPDaIqDneb9IY76(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        e\u200e = "Box rendering mode";
        field10020 = Float.intBitsToFloat(1063336493);
        ai\u200e = "AirPlace";
        field10021 = Double.longBitsToDouble(4605908404465274337L);
        bX\u200e = "How many ticks to wait before hitting an entity after switching hotbar slots";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite diLc4W8FGLEON4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4388.UtPDaIqDneb9IY76(k2, 127916373));
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
                int a2 = Integer.parseInt(Class4388.UtPDaIqDneb9IY76(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4388.UtPDaIqDneb9IY76(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4388.UtPDaIqDneb9IY76(k2, 127916373) + " " + l2 + " " + m2);
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

