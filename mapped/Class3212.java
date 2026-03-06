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
@HACHIMI_CLIENT(mv=100, d1={"\u13e5\u13e4\u13e9\u13e1\u13e5\u13e5\u13e1\u13e7", "\u2653\u2650\u2650\u2651\u2651\u2652\u2653", "\u6096\u6094\u6093\u609b\u6093\u6090\u6097\u6096", "\u9173\u9171\u9175\u917c\u9172\u917d\u917d", "\u0bb5\u0bb4\u0bb8\u0bb3\u0bb0\u0bb2\u0bb8\u0bb3", "\u0c70\u0c73\u0c73\u0c7a\u0c71\u0c77", "\u1c7e\u1c7c\u1c7f\u1c7c\u1c78\u1c7c\u1c7c\u1c7e", "\ub68e\ub686\ub684\ub681\ub682\ub687\ub684", "\u9050\u905d\u9056\u9057\u9055\u9054\u9050\u9052", "\u8209\u8203\u820c\u8209\u8202\u820d\u820e\u8209", "\ud3f9\ud3fd\ud3f1\ud3fd\ud3fd\ud3f1\ud3fb\ud3fd", "\u30c0\u30ce\u30cf\u30c7\u30cf\u30cf\u30ce\u30c5", "\u2dfb\u2df9\u2dfe\u2dfe\u2dfe\u2dff\u2df5\u2df8", "\u0506\u0506\u0507\u0500\u0505\u0501\u0506\u0508", "\u95a5\u95af\u95a0\u95a2\u95a5\u95a0\u95af\u95af", "\uded4\uded2\uded4\udedf\uded0\uded1\uded0\uded7", "\u2804\u2800\u2800\u280f\u2807\u280e\u2805\u2806"}, d2={"\u0552\u054b\u057d\u253d\u050f\u050d\u051b\u057f\u0559\u0552\u0545\u0552\u051c\u055f\u0552\u055d\u0554\u051c\u0560\u0547\u0541\u055a\u055d\u0554\u0508\u051a\u057f\u0559\u0552\u0545\u0552\u051c\u055f\u0552\u055d\u0554\u051c\u0560\u0547\u0541\u055a\u055d\u0554\u0508", "\u054c\u0555\u0562\u2523\u0511\u0513\u0505\u0561\u0547\u054c\u055b\u054c\u0502\u0541\u054c\u0543\u054a\u0502\u057e\u0559\u055f\u0544\u0543\u054a\u0516\u0504\u0561\u0547\u054c\u055b\u054c\u0502\u0541\u054c\u0543\u054a\u0502\u057e\u0559\u055f\u0544\u0543\u054a\u0516", "\u0384\u039d\u03b5\u23eb\u03d9\u03db\u03cd\u03a9\u038f\u0384\u0393\u0384\u03ca\u0389\u0384\u038b\u0382\u03ca\u03b6\u0391\u0397\u038c\u038b\u0382\u03de\u03cc\u03a9\u038f\u0384\u0393\u0384\u03ca\u0389\u0384\u038b\u0382\u03ca\u03b6\u0391\u0397\u038c\u038b\u0382\u03de", "\u05b9\u05e6\u05e9\u05ec\u05eb\u05ec\u05f1\u05bb\u05b9\u05bb\u05ad\u05ac\u05d3", "\u07bc\u07e9\u07ee\u07e9\u07f4\u07be\u07bc\u07be\u07a8\u07a9\u07d6", "\u0188\u018a\u019b\u01ac\u0183\u018e\u019c\u019c\u01d3\u01d1\u01c7\u01c6\u01a3\u0185\u018e\u0199\u018e\u01c0\u0183\u018e\u0181\u0188\u01c0\u01ac\u0183\u018e\u019c\u019c\u01d4", "\u0215\u021c\u020e\u0215\u023e\u0212\u0219\u0218\u0241\u0243\u0255\u0254\u0234", "\u02be\u02aa\u02ae\u02ba\u02b7\u02a8\u02e7\u02e5\u02f3\u0297\u02b1\u02ba\u02ad\u02ba\u02f4\u02b7\u02ba\u02b5\u02bc\u02f4\u0294\u02b9\u02b1\u02be\u02b8\u02af\u02e0\u02f2\u0281", "\u067e\u0671\u0672\u0673\u0678\u0621\u0623\u0635\u0634\u0651\u0677\u067c\u066b\u067c\u0632\u0671\u067c\u0673\u067a\u0632\u0652\u067f\u0677\u0678\u067e\u0669\u0626", "\u072d\u0736\u070a\u072d\u072b\u0730\u0737\u073e\u0765\u0767\u0771\u0770\u0715\u0733\u0738\u072f\u0738\u0776\u0735\u0738\u0737\u073e\u0776\u070a\u072d\u072b\u0730\u0737\u073e\u0762", "\u01f6\u01f7\u01ec\u01f1\u01fe\u01e1\u01a4\u01a6\u01b0\u01b1\u01ce", "\u049e\u049f\u0484\u0499\u0496\u0489\u04b1\u049c\u049c\u04cc\u04ce\u04d8\u04d9\u04a6", "\u05c1\u05d7\u05df\u05c2\u058a\u0588\u059e\u059f\u05e0", "\u01ce\u01d8\u01d0\u01cd\u0185\u0187\u0191\u01f3\u0190\u01ef", "\u0597\u0581\u0589\u0594\u05d0\u05dc\u05de\u05c8\u05aa\u05c9\u05b6", "\u018f\u0199\u0191\u018c\u01c4\u01c6\u01d0\u01b2\u01b1\u01d1\u01ae", "\u0713\u071c\u071b\u0714\u0719\u071c\u070f\u0710\u0749\u074b\u075d\u075c\u0723"})
public final class Class3212 {
    public static double field6890;
    public static String field6891;
    public static float field6892;
    public static double field6893;

    private static String XwZaV4AwaegJoRju(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field6893 = Double.longBitsToDouble(4599646281175752498L);
        E\u200e = "Prevents the player from being levitated";
        R\u200e = "Spammer";
        field6890 = Double.longBitsToDouble(4599770522087339342L);
        field6892 = Float.intBitsToFloat(1050614660);
        field6891 = "Initializing AntiCheatManager ...";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 0ejvAojFdvGQGw(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3212.XwZaV4AwaegJoRju(k2, -443363449));
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
                int a2 = Integer.parseInt(Class3212.XwZaV4AwaegJoRju(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3212.XwZaV4AwaegJoRju(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3212.XwZaV4AwaegJoRju(k2, -443363449) + " " + l2 + " " + m2);
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

