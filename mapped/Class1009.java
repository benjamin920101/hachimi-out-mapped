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

@HACHIMI_CLIENT(mv=100, d1={"\uaa07\uaa01\uaa07\uaa00\uaa0d\uaa00\uaa06", "\ud8dc\ud8dc\ud8dc\ud8de\ud8de\ud8d8\ud8df", "\u4dc2\u4dc4\u4dc7\u4dc4\u4dc2\u4dc3\u4dcb", "\ub404\ub403\ub407\ub404\ub40a\ub407\ub403\ub403", "\u3a2e\u3a2b\u3a22\u3a29\u3a22\u3a2c\u3a2e", "\u278f\u2789\u278f\u2789\u2784\u2785\u278a\u278f", "\ud048\ud04f\ud04a\ud048\ud04b\ud04d\ud04a\ud049", "\ud92d\ud92b\ud92f\ud924\ud92a\ud92a\ud92a\ud92b", "\u9f1a\u9f1e\u9f18\u9f18\u9f1f\u9f1d\u9f11\u9f1e", "\u1060\u1064\u1061\u106b\u1065\u106b\u1065\u1062", "\ubf87\ubf84\ubf80\ubf87\ubf83\ubf80\ubf86\ubf83", "\uab25\uab26\uab22\uab28\uab20\uab27\uab21\uab29", "\u1c64\u1c60\u1c6c\u1c63\u1c6d\u1c60\u1c67\u1c6c", "\ue4b0\ue4b1\ue4b6\ue4b2\ue4b6\ue4b6\ue4b2\ue4b7", "\u4205\u4209\u4205\u4202\u4207\u4206\u4209\u4207", "\uc84c\uc84d\uc848\uc84e\uc84e\uc84e\uc848\uc84a", "\ud140\ud142\ud144\ud143\ud140\ud146\ud140\ud14e", "\u3d65\u3d63\u3d67\u3d66\u3d60\u3d66\u3d60\u3d63"}, d2={"\u05fb\u05f8\u05d9\u2598\u05aa\u05a8\u05be\u05da\u05fc\u05f7\u05e0\u05f7\u05b9\u05fa\u05f7\u05f8\u05f1\u05b9\u05c5\u05e2\u05e4\u05ff\u05f8\u05f1\u05ad\u05bf\u05da\u05fc\u05f7\u05e0\u05f7\u05b9\u05fa\u05f7\u05f8\u05f1\u05b9\u05c5\u05e2\u05e4\u05ff\u05f8\u05f1\u05ad", "\u0579\u057a\u0544\u251a\u0528\u052a\u053c\u0558\u057e\u0575\u0562\u0575\u053b\u0578\u0575\u057a\u0573\u053b\u0547\u0560\u0566\u057d\u057a\u0573\u052f\u053d\u0558\u057e\u0575\u0562\u0575\u053b\u0578\u0575\u057a\u0573\u053b\u0547\u0560\u0566\u057d\u057a\u0573\u052f", "\u0246\u0245\u027a\u2225\u0217\u0215\u0203\u0267\u0241\u024a\u025d\u024a\u0204\u0247\u024a\u0245\u024c\u0204\u0278\u025f\u0259\u0242\u0245\u024c\u0210\u0202\u0267\u0241\u024a\u025d\u024a\u0204\u0247\u024a\u0245\u024c\u0204\u0278\u025f\u0259\u0242\u0245\u024c\u0210", "\u01ca\u01c9\u01f5\u21a9\u019b\u0199\u018f\u01eb\u01cd\u01c6\u01d1\u01c6\u0188\u01cb\u01c6\u01c9\u01c0\u0188\u01f4\u01d3\u01d5\u01ce\u01c9\u01c0\u019c\u018e\u01eb\u01cd\u01c6\u01d1\u01c6\u0188\u01cb\u01c6\u01c9\u01c0\u0188\u01f4\u01d3\u01d5\u01ce\u01c9\u01c0\u019c", "\u05e4\u05bb\u05b4\u05b1\u05b6\u05b1\u05ac\u05e6\u05e4\u05e6\u05f0\u05f1\u058e", "\u0102\u0157\u0150\u0157\u014a\u0100\u0102\u0100\u0116\u0117\u0168", "\u00a6\u00a4\u00b5\u0082\u00ad\u00a0\u00b2\u00b2\u00fd\u00ff\u00e9\u00e8\u008d\u00ab\u00a0\u00b7\u00a0\u00ee\u00ad\u00a0\u00af\u00a6\u00ee\u0082\u00ad\u00a0\u00b2\u00b2\u00fa", "\u026e\u0267\u0275\u026e\u0245\u0269\u0262\u0263\u023a\u0238\u022e\u022f\u024f", "\u025d\u0249\u024d\u0259\u0254\u024b\u0204\u0206\u0210\u0274\u0252\u0259\u024e\u0259\u0217\u0254\u0259\u0256\u025f\u0217\u0277\u025a\u0252\u025d\u025b\u024c\u0203\u0211\u0262", "\u018a\u0185\u0186\u0187\u018c\u01d5\u01d7\u01c1\u01c0\u01a5\u0183\u0188\u019f\u0188\u01c6\u0185\u0188\u0187\u018e\u01c6\u01a6\u018b\u0183\u018c\u018a\u019d\u01d2", "\u02fa\u02e1\u02dd\u02fa\u02fc\u02e7\u02e0\u02e9\u02b2\u02b0\u02a6\u02a7\u02c2\u02e4\u02ef\u02f8\u02ef\u02a1\u02e2\u02ef\u02e0\u02e9\u02a1\u02dd\u02fa\u02fc\u02e7\u02e0\u02e9\u02b5", "\u0358\u0359\u0342\u035f\u0350\u034f\u030a\u0308\u031e\u031f\u0360", "\u06fc\u06fd\u06e6\u06fb\u06f4\u06eb\u06d3\u06fe\u06fe\u06ae\u06ac\u06ba\u06bb\u06c4", "\u056f\u0579\u0571\u056c\u0524\u0526\u0530\u0531\u054e", "\u0523\u0535\u053d\u0520\u0568\u056a\u057c\u051e\u057d\u0502", "\u062b\u063d\u0635\u0628\u066c\u0660\u0662\u0674\u0616\u0675\u060a", "\u045a\u044c\u0444\u0459\u0411\u0413\u0405\u0467\u0464\u0404\u047b", "\u033f\u0330\u0337\u0338\u0335\u0330\u0323\u033c\u0365\u0367\u0371\u0370\u030f"})
public final class Class1009 {
    public static double field4178;
    public static double field4179;
    public static double field4180;
    public static float field4181 = 0.043199956f;

    static {
        U\u200e = "Accelerate as you fly";
        aG\u200e = "Prevents advancements from rendering";
        aW\u200e = "AutoWeb";
        field4180 = Double.longBitsToDouble(4602038716522892750L);
        field4179 = Double.longBitsToDouble(4594627521970717776L);
        bH\u200e = "Shrink";
        field4178 = Double.longBitsToDouble(4603001094981125137L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite yHwUDuLOeeng2y(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1009.zA6ANqTB2V2vPz8P(k2, 1405318729));
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
                int a2 = Integer.parseInt(Class1009.zA6ANqTB2V2vPz8P(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1009.zA6ANqTB2V2vPz8P(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1009.zA6ANqTB2V2vPz8P(k2, 1405318729) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String zA6ANqTB2V2vPz8P(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

