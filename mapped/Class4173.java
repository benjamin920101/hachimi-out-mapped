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

@HACHIMI_CLIENT(mv=100, d1={"\ub451\ub454\ub452\ub45e\ub454\ub452\ub457\ub455", "\ud49c\ud49b\ud49c\ud49a\ud496\ud49d\ud498\ud496", "\udc82\udc8f\udc83\udc82\udc8e\udc85\udc80\udc8f", "\u6e93\u6e93\u6e99\u6e97\u6e95\u6e98\u6e91\u6e90", "\u0137\u0130\u0137\u0132\u0130\u0132\u0130\u013d", "\u8686\u868d\u8681\u8681\u868d\u8682\u8680\u8685", "\u7085\u7081\u7084\u7083\u7087\u708f\u7081\u708f", "\u535f\u5359\u535c\u5353\u5358\u5359\u5353\u535a", "\ua48e\ua483\ua488\ua483\ua48f\ua482\ua48a\ua483", "\u2630\u2633\u2631\u2633\u263c\u2632\u2633\u263c", "\u8483\u8487\u8486\u8480\u8484\u8484\u8481\u8484", "\u4bd9\u4bdb\u4bd5\u4bde\u4bdc\u4bdf\u4bde\u4bd4", "\u53c3\u53c1\u53c4\u53c2\u53c1\u53cf\u53c3\u53c6", "\u4586\u4583\u4586\u458e\u4585\u4583\u4586\u4584", "\u3a8b\u3a8e\u3a8c\u3a89\u3a88\u3a89\u3a88\u3a8a"}, d2={"\u02bc\u02be\u0281\u22c2\u02f0\u02f2\u02e4\u0280\u02a6\u02ad\u02ba\u02ad\u02e3\u02a0\u02ad\u02a2\u02ab\u02e3\u029f\u02b8\u02be\u02a5\u02a2\u02ab\u02f7\u02e5\u0280\u02a6\u02ad\u02ba\u02ad\u02e3\u02a0\u02ad\u02a2\u02ab\u02e3\u029f\u02b8\u02be\u02a5\u02a2\u02ab\u02f7", "\u0436\u0469\u0466\u0463\u0464\u0463\u047e\u0434\u0436\u0434\u0422\u0423\u045c", "\u0548\u051d\u051a\u051d\u0500\u054a\u0548\u054a\u055c\u055d\u0522", "\u0674\u0676\u0667\u0650\u067f\u0672\u0660\u0660\u062f\u062d\u063b\u063a\u065f\u0679\u0672\u0665\u0672\u063c\u067f\u0672\u067d\u0674\u063c\u0650\u067f\u0672\u0660\u0660\u0628", "\u0175\u017c\u016e\u0175\u015e\u0172\u0179\u0178\u0121\u0123\u0135\u0134\u0154", "\u0250\u0244\u0240\u0254\u0259\u0246\u0209\u020b\u021d\u0279\u025f\u0254\u0243\u0254\u021a\u0259\u0254\u025b\u0252\u021a\u027a\u0257\u025f\u0250\u0256\u0241\u020e\u021c\u026f", "\u0188\u0187\u0184\u0185\u018e\u01d7\u01d5\u01c3\u01c2\u01a7\u0181\u018a\u019d\u018a\u01c4\u0187\u018a\u0185\u018c\u01c4\u01a4\u0189\u0181\u018e\u0188\u019f\u01d0", "\u0769\u0772\u074e\u0769\u076f\u0774\u0773\u077a\u0721\u0723\u0735\u0734\u0751\u0777\u077c\u076b\u077c\u0732\u0771\u077c\u0773\u077a\u0732\u074e\u0769\u076f\u0774\u0773\u077a\u0726", "\u0539\u0538\u0523\u053e\u0531\u052e\u056b\u0569\u057f\u057e\u0501", "\u05d4\u05d5\u05ce\u05d3\u05dc\u05c3\u05fb\u05d6\u05d6\u0586\u0584\u0592\u0593\u05ec", "\u0712\u0704\u070c\u0711\u0759\u075b\u074d\u074c\u0733", "\u045b\u044d\u0445\u0458\u0410\u0412\u0404\u0466\u0405\u047a", "\u076d\u077b\u0773\u076e\u072a\u0726\u0724\u0732\u0750\u0733\u074c", "\u074e\u0758\u0750\u074d\u0705\u0707\u0711\u0773\u0770\u0710\u076f", "\u06be\u06b1\u06b6\u06b9\u06b4\u06b1\u06a2\u06bd\u06e4\u06e6\u06f0\u06f1\u068e"})
public final class Class4173 {
    public static float field9724 = Float.intBitsToFloat(1050423350);
    public static float field9725;
    public static float field9726;

    /*
     * WARNING - void declaration
     */
    private static CallSite sjef7qEKRbGJ6W(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4173.q4lr8AzoTfS4BJ04(k2, -190584980));
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
                int a2 = Integer.parseInt(Class4173.q4lr8AzoTfS4BJ04(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4173.q4lr8AzoTfS4BJ04(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4173.q4lr8AzoTfS4BJ04(k2, -190584980) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String q4lr8AzoTfS4BJ04(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field9726 = Float.intBitsToFloat(1108869120);
        field9725 = Float.intBitsToFloat(1132396544);
        bd\u200e = "LEGIT";
    }
}

