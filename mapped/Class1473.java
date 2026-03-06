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

@HACHIMI_CLIENT(mv=100, d1={"\ue6ea\ue6ef\ue6ec\ue6ed\ue6ec\ue6e4\ue6e8\ue6e5", "\u9e13\u9e13\u9e12\u9e16\u9e15\u9e12\u9e14\u9e17", "\u4dce\u4dc8\u4dc9\u4dc9\u4dca\u4dc1\u4dcf\u4dcb", "\u66be\u66bf\u66bc\u66b7\u66b8\u66bd\u66bb", "\u8f95\u8f97\u8f93\u8f91\u8f93\u8f9f\u8f95\u8f91", "\ud2cf\ud2cc\ud2cc\ud2c4\ud2cb\ud2ca\ud2c9\ud2c5", "\u440a\u4409\u440d\u440c\u4406\u440d\u4408\u4406", "\u5c25\u5c26\u5c24\u5c22\u5c27\u5c2a\u5c27\u5c21", "\u9766\u9766\u9762\u9764\u9764\u9765\u9763\u9763", "\udc76\udc71\udc73\udc7e\udc73\udc76\udc75\udc74", "\u4a4d\u4a4f\u4a4b\u4a40\u4a4d\u4a41\u4a4c\u4a4d", "\ubb08\ubb0d\ubb0c\ubb07\ubb09\ubb0a\ubb08\ubb06", "\u5795\u5795\u5799\u5791\u5798\u5793\u5798\u5796", "\u25e1\u25e0\u25e0\u25e4\u25e4\u25e7\u25e6\u25e6", "\u263c\u263b\u2638\u2636\u263e\u263f\u263c\u263e", "\u66e0\u66e5\u66ee\u66e5\u66e5\u66ef\u66e6", "\u01c9\u01cb\u01ca\u01c8\u01cf\u01ca\u01c8\u01c9"}, d2={"\u01a8\u01be\u01a1\u21c9\u01fb\u01f9\u01ef\u018b\u01ad\u01a6\u01b1\u01a6\u01e8\u01ab\u01a6\u01a9\u01a0\u01e8\u0194\u01b3\u01b5\u01ae\u01a9\u01a0\u01fc\u01ee\u018b\u01ad\u01a6\u01b1\u01a6\u01e8\u01ab\u01a6\u01a9\u01a0\u01e8\u0194\u01b3\u01b5\u01ae\u01a9\u01a0\u01fc", "\f\u001a\u0004\u206d_]K/\t\u0002\u0015\u0002L\u000f\u0002\r\u0004L0\u0017\u0011\n\r\u0004XJ/\t\u0002\u0015\u0002L\u000f\u0002\r\u0004L0\u0017\u0011\n\r\u0004X", "\u001e\b\u0019\u207fMOY=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^\"\u0005\u0003\u0018\u001f\u0016JX=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^\"\u0005\u0003\u0018\u001f\u0016J", "\u0222\u027d\u0272\u0277\u0270\u0277\u026a\u0220\u0222\u0220\u0236\u0237\u0248", "K\u001e\u0019\u001e\u0003IKI_^!", "\u0273\u0271\u0260\u0257\u0278\u0275\u0267\u0267\u0228\u022a\u023c\u023d\u0258\u027e\u0275\u0262\u0275\u023b\u0278\u0275\u027a\u0273\u023b\u0257\u0278\u0275\u0267\u0267\u022f", "\u0497\u049e\u048c\u0497\u04bc\u0490\u049b\u049a\u04c3\u04c1\u04d7\u04d6\u04b6", "\u04e1\u04f5\u04f1\u04e5\u04e8\u04f7\u04b8\u04ba\u04ac\u04c8\u04ee\u04e5\u04f2\u04e5\u04ab\u04e8\u04e5\u04ea\u04e3\u04ab\u04cb\u04e6\u04ee\u04e1\u04e7\u04f0\u04bf\u04ad\u04de", "\u0613\u061c\u061f\u061e\u0615\u064c\u064e\u0658\u0659\u063c\u061a\u0611\u0606\u0611\u065f\u061c\u0611\u061e\u0617\u065f\u063f\u0612\u061a\u0615\u0613\u0604\u064b", "\u06e0\u06fb\u06c7\u06e0\u06e6\u06fd\u06fa\u06f3\u06a8\u06aa\u06bc\u06bd\u06d8\u06fe\u06f5\u06e2\u06f5\u06bb\u06f8\u06f5\u06fa\u06f3\u06bb\u06c7\u06e0\u06e6\u06fd\u06fa\u06f3\u06af", "\u01cb\u01ca\u01d1\u01cc\u01c3\u01dc\u0199\u019b\u018d\u018c\u01f3", "\u0125\u0124\u013f\u0122\u012d\u0132\u010a\u0127\u0127\u0177\u0175\u0163\u0162\u011d", "\u0798\u078e\u0786\u079b\u07d3\u07d1\u07c7\u07c6\u07b9", "\u0139\u012f\u0127\u013a\u0172\u0170\u0166\u0104\u0167\u0118", "\u06c1\u06d7\u06df\u06c2\u0686\u068a\u0688\u069e\u06fc\u069f\u06e0", "\u0267\u0271\u0279\u0264\u022c\u022e\u0238\u025a\u0259\u0239\u0246", "\u00f7\u00f8\u00ff\u00f0\u00fd\u00f8\u00eb\u00f4\u00ad\u00af\u00b9\u00b8\u00c7"})
public final class Class1473 {
    public static float field5579 = Float.intBitsToFloat(-1028390912);
    public static double field5580;
    public static float field5581;
    public static int field5582 = 951222006;

    /*
     * WARNING - void declaration
     */
    private static CallSite ituKjb4vNnrVTa(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1473.tzbG8FBndXo8VDjS(k2, -1754616431));
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
                int a2 = Integer.parseInt(Class1473.tzbG8FBndXo8VDjS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1473.tzbG8FBndXo8VDjS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1473.tzbG8FBndXo8VDjS(k2, -1754616431) + " " + l2 + " " + m2);
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
        B\u200e = "On";
        field5580 = Double.longBitsToDouble(4603802947077733595L);
        ac\u200e = "Totems";
        bH\u200e = "Range to place crystals";
        field5581 = Float.intBitsToFloat(1058464520);
    }

    private static String tzbG8FBndXo8VDjS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

