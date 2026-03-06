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
@HACHIMI_CLIENT(mv=100, d1={"\u2f3c\u2f39\u2f33\u2f3d\u2f3c\u2f38\u2f3c\u2f3a", "\u1277\u1273\u1275\u1276\u1274\u1275\u127d\u1273", "\u9d4f\u9d4f\u9d4f\u9d45\u9d4e\u9d4e\u9d4f\u9d4a", "\u2e04\u2e01\u2e0f\u2e02\u2e02\u2e06\u2e00\u2e05", "\ue27e\ue276\ue278\ue27e\ue27e\ue278\ue27b\ue27a", "\u5ce3\u5cea\u5ce4\u5ce4\u5ce7\u5ce3\u5ce2\u5ce1", "\u830a\u830b\u8309\u830c\u8309\u830f\u8308\u8300", "\u33e0\u33eb\u33e4\u33e1\u33e6\u33e0\u33e2\u33e4", "\u4b40\u4b42\u4b44\u4b44\u4b47\u4b41\u4b40\u4b42", "\uda19\uda13\uda13\uda13\uda1a\uda1f\uda18\uda12", "\u5323\u5325\u5327\u5325\u5325\u5324\u5326\u5324", "\u8763\u8762\u8767\u8760\u8768\u8763\u8760\u8762", "\u78ad\u78ae\u78ac\u78ac\u78a8\u78ac\u78a9\u78a9", "\u1010\u1017\u1010\u101c\u1017\u101c\u1013\u1011", "\u0720\u0723\u0729\u0727\u0727\u0720\u0723\u0720", "\ud8e8\ud8ef\ud8ea\ud8e9\ud8e9\ud8ea\ud8ea\ud8e2"}, d2={"\u06da\u06f6\u06e6\u26b0\u0682\u0680\u0696\u06f2\u06d4\u06df\u06c8\u06df\u0691\u06d2\u06df\u06d0\u06d9\u0691\u06ed\u06ca\u06cc\u06d7\u06d0\u06d9\u0685\u0697\u06f2\u06d4\u06df\u06c8\u06df\u0691\u06d2\u06df\u06d0\u06d9\u0691\u06ed\u06ca\u06cc\u06d7\u06d0\u06d9\u0685", "\u056c\u0540\u0551\u2506\u0534\u0536\u0520\u0544\u0562\u0569\u057e\u0569\u0527\u0564\u0569\u0566\u056f\u0527\u055b\u057c\u057a\u0561\u0566\u056f\u0533\u0521\u0544\u0562\u0569\u057e\u0569\u0527\u0564\u0569\u0566\u056f\u0527\u055b\u057c\u057a\u0561\u0566\u056f\u0533", "\u03c6\u0399\u0396\u0393\u0394\u0393\u038e\u03c4\u03c6\u03c4\u03d2\u03d3\u03ac", "\u05ee\u05bb\u05bc\u05bb\u05a6\u05ec\u05ee\u05ec\u05fa\u05fb\u0584", "\u0507\u0505\u0514\u0523\u050c\u0501\u0513\u0513\u055c\u055e\u0548\u0549\u052c\u050a\u0501\u0516\u0501\u054f\u050c\u0501\u050e\u0507\u054f\u0523\u050c\u0501\u0513\u0513\u055b", "\u058f\u0586\u0594\u058f\u05a4\u0588\u0583\u0582\u05db\u05d9\u05cf\u05ce\u05ae", "\u02de\u02ca\u02ce\u02da\u02d7\u02c8\u0287\u0285\u0293\u02f7\u02d1\u02da\u02cd\u02da\u0294\u02d7\u02da\u02d5\u02dc\u0294\u02f4\u02d9\u02d1\u02de\u02d8\u02cf\u0280\u0292\u02e1", "\u0792\u079d\u079e\u079f\u0794\u07cd\u07cf\u07d9\u07d8\u07bd\u079b\u0790\u0787\u0790\u07de\u079d\u0790\u079f\u0796\u07de\u07be\u0793\u079b\u0794\u0792\u0785\u07ca", "\u0171\u016a\u0156\u0171\u0177\u016c\u016b\u0162\u0139\u013b\u012d\u012c\u0149\u016f\u0164\u0173\u0164\u012a\u0169\u0164\u016b\u0162\u012a\u0156\u0171\u0177\u016c\u016b\u0162\u013e", "\u0410\u0411\u040a\u0417\u0418\u0407\u0442\u0440\u0456\u0457\u0428", "\u067f\u067e\u0665\u0678\u0677\u0668\u0650\u067d\u067d\u062d\u062f\u0639\u0638\u0647", "\u0419\u040f\u0407\u041a\u0452\u0450\u0446\u0447\u0438", "fpxe-/9[8G", "\u053a\u052c\u0524\u0539\u057d\u0571\u0573\u0565\u0507\u0564\u051b", "\u0094\u0082\u008a\u0097\u00df\u00dd\u00cb\u00a9\u00aa\u00ca\u00b5", "\u028f\u0280\u0287\u0288\u0285\u0280\u0293\u028c\u02d5\u02d7\u02c1\u02c0\u02bf"})
public final class Class1692 {
    public static double field6273 = Double.longBitsToDouble(4604054109330097103L);
    public static float field6274;
    public static float field6275 = 0.33430666f;

    static {
        bf\u200e = "SoftReload";
        bm\u200e = "RAINBOW";
        field6274 = Float.intBitsToFloat(1009011008);
    }

    private static String P937iQ76GJgjVbh7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 4O4rRoWV6BgTli(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1692.P937iQ76GJgjVbh7(k2, -1187856657));
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
                int a2 = Integer.parseInt(Class1692.P937iQ76GJgjVbh7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1692.P937iQ76GJgjVbh7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1692.P937iQ76GJgjVbh7(k2, -1187856657) + " " + l2 + " " + m2);
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

