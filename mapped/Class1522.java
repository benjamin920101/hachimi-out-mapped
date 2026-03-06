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

@HACHIMI_CLIENT(mv=100, d1={"\u89c8\u89cb\u89c9\u89cf\u89cc\u89c1\u89ca\u89cc", "\u8ac4\u8ac4\u8ac7\u8acc\u8ac4\u8acd\u8ac1\u8ac3", "\u9483\u9483\u9487\u9487\u9488\u9486\u9483\u9484", "\u655d\u6559\u655b\u6559\u655b\u6558\u655a", "\u111f\u111c\u111f\u1118\u1119\u1113\u1112\u111d", "\u863b\u8639\u8635\u8634\u863c\u8639\u8639", "\u94d5\u94d5\u94dc\u94dc\u94dd\u94dd\u94d1\u94dd", "\u8cf9\u8cfa\u8cf2\u8cfe\u8cf8\u8cfb\u8cfa\u8cf2", "\u2d5b\u2d5e\u2d5b\u2d51\u2d51\u2d5e\u2d5a\u2d58", "\u9d56\u9d52\u9d5c\u9d54\u9d5d\u9d50\u9d51\u9d50", "\u6e2d\u6e2c\u6e25\u6e2e\u6e2b\u6e2d\u6e2d\u6e25", "\ubf7e\ubf7d\ubf7f\ubf7f\ubf72\ubf7f\ubf7e\ubf7b", "\ua892\ua894\ua892\ua898\ua892\ua898\ua896\ua897", "\ube41\ube42\ube4a\ube45\ube46\ube44\ube40\ube42", "\u8aff\u8afb\u8af9\u8afa\u8af5\u8af5\u8af9\u8afc", "\ub69a\ub692\ub69d\ub69f\ub69a\ub69b\ub69a\ub69d", "\ua6bf\ua6bc\ua6bc\ua6bf\ua6b8\ua6b5\ua6bc\ua6b8"}, d2={"\u0241\u024a\u024e\u2225\u0217\u0215\u0203\u0267\u0241\u024a\u025d\u024a\u0204\u0247\u024a\u0245\u024c\u0204\u0278\u025f\u0259\u0242\u0245\u024c\u0210\u0202\u0267\u0241\u024a\u025d\u024a\u0204\u0247\u024a\u0245\u024c\u0204\u0278\u025f\u0259\u0242\u0245\u024c\u0210", "\u0712\u0719\u071e\u2776\u0744\u0746\u0750\u0734\u0712\u0719\u070e\u0719\u0757\u0714\u0719\u0716\u071f\u0757\u072b\u070c\u070a\u0711\u0716\u071f\u0743\u0751\u0734\u0712\u0719\u070e\u0719\u0757\u0714\u0719\u0716\u071f\u0757\u072b\u070c\u070a\u0711\u0716\u071f\u0743", "\u0511\u051a\u051c\u2575\u0547\u0545\u0553\u0537\u0511\u051a\u050d\u051a\u0554\u0517\u051a\u0515\u051c\u0554\u0528\u050f\u0509\u0512\u0515\u051c\u0540\u0552\u0537\u0511\u051a\u050d\u051a\u0554\u0517\u051a\u0515\u051c\u0554\u0528\u050f\u0509\u0512\u0515\u051c\u0540", "\u02e9\u02b6\u02b9\u02bc\u02bb\u02bc\u02a1\u02eb\u02e9\u02eb\u02fd\u02fc\u0283", "\u001bNINS\u0019\u001b\u0019\u000f\u000eq", "\u05e2\u05e0\u05f1\u05c6\u05e9\u05e4\u05f6\u05f6\u05b9\u05bb\u05ad\u05ac\u05c9\u05ef\u05e4\u05f3\u05e4\u05aa\u05e9\u05e4\u05eb\u05e2\u05aa\u05c6\u05e9\u05e4\u05f6\u05f6\u05be", "\u0574\u057d\u056f\u0574\u055f\u0573\u0578\u0579\u0520\u0522\u0534\u0535\u0555", "\u0427\u0433\u0437\u0423\u042e\u0431\u047e\u047c\u046a\u040e\u0428\u0423\u0434\u0423\u046d\u042e\u0423\u042c\u0425\u046d\u040d\u0420\u0428\u0427\u0421\u0436\u0479\u046b\u0418", "\u0246\u0249\u024a\u024b\u0240\u0219\u021b\u020d\u020c\u0269\u024f\u0244\u0253\u0244\u020a\u0249\u0244\u024b\u0242\u020a\u026a\u0247\u024f\u0240\u0246\u0251\u021e", "\u0653\u0648\u0674\u0653\u0655\u064e\u0649\u0640\u061b\u0619\u060f\u060e\u066b\u064d\u0646\u0651\u0646\u0608\u064b\u0646\u0649\u0640\u0608\u0674\u0653\u0655\u064e\u0649\u0640\u061c", "\u03f8\u03f9\u03e2\u03ff\u03f0\u03ef\u03aa\u03a8\u03be\u03bf\u03c0", "\u059f\u059e\u0585\u0598\u0597\u0588\u05b0\u059d\u059d\u05cd\u05cf\u05d9\u05d8\u05a7", "\u05f7\u05e1\u05e9\u05f4\u05bc\u05be\u05a8\u05a9\u05d6", "\u0578\u056e\u0566\u057b\u0533\u0531\u0527\u0545\u0526\u0559", "\u04a1\u04b7\u04bf\u04a2\u04e6\u04ea\u04e8\u04fe\u049c\u04ff\u0480", "\u057a\u056c\u0564\u0579\u0531\u0533\u0525\u0547\u0544\u0524\u055b", "\u078e\u0781\u0786\u0789\u0784\u0781\u0792\u078d\u07d4\u07d6\u07c0\u07c1\u07be"})
public final class Class1522 {
    public static double field5739;
    public static double field5740;
    public static float field5741;
    public static float field5742;
    public static double field5743;
    public static double field5744;
    public static double field5745;
    public static float field5746 = 0.3269207f;

    static {
        field5743 = Double.longBitsToDouble(4592417620910935352L);
        field5742 = Float.intBitsToFloat(1063554018);
        A\u200e = "Equips a golden apple if holding down the item use button";
        field5744 = Double.longBitsToDouble(4603885315177723081L);
        E\u200e = ", z: ";
        field5745 = Double.longBitsToDouble(4604163195612520367L);
        field5741 = Float.intBitsToFloat(1049440374);
        an\u200e = "Freeze mode";
        field5739 = Double.longBitsToDouble(4605963953523655237L);
        field5740 = Double.longBitsToDouble(4597890703522943864L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite x2IIK4w6AH4LR7(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1522.FkwfQt9qqqQSRYHa(k2, 2071150944));
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
                int a2 = Integer.parseInt(Class1522.FkwfQt9qqqQSRYHa(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1522.FkwfQt9qqqQSRYHa(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1522.FkwfQt9qqqQSRYHa(k2, 2071150944) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String FkwfQt9qqqQSRYHa(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

