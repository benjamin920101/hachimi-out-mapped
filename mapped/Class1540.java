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

@HACHIMI_CLIENT(mv=100, d1={"\u22b0\u22be\u22be\u22bf\u22b8\u22b1\u22b0", "\u0437\u0436\u0439\u0432\u0437\u0435\u0435\u0439", "\u172a\u172f\u172e\u172c\u1728\u172b\u172e\u1728", "\ub293\ub295\ub295\ub292\ub29c\ub294\ub29d\ub29c", "\u2390\u2397\u2396\u2393\u2393\u2396\u2393\u2397", "\u0673\u0671\u0672\u0670\u0679\u0674\u0676\u0678", "\u9472\u9472\u9476\u9476\u9479\u9476\u9471\u9472", "\uc027\uc022\uc021\uc025\uc021\uc025\uc022\uc026", "\uadd2\uadd4\uadd7\uadd2\uadd7\uadd5\uadd3\uadde", "\u289c\u289d\u289a\u2899\u289b\u2896\u2899\u289c", "\ud7b5\ud7b7\ud7b1\ud7b6\ud7b4\ud7b5\ud7b2\ud7b4", "\u3187\u3180\u3180\u3185\u3181\u3187\u3185\u3182", "\uc2ef\uc2ef\uc2ee\uc2ec\uc2ea\uc2eb\uc2ea", "\ue3a0\ue3ab\ue3a5\ue3a5\ue3a5\ue3a0\ue3a2\ue3a3", "\u4dbf\u4dba\u4dbc\u4dbd\u4db2\u4db8\u4dbb\u4db3", "\u828f\u8289\u828a\u8286\u828d\u8288\u8289\u828f", "\u156d\u1568\u156b\u156a\u156f\u1566\u156c"}, d2={"\u07f7\u07d5\u07ff\u279d\u07af\u07ad\u07bb\u07df\u07f9\u07f2\u07e5\u07f2\u07bc\u07ff\u07f2\u07fd\u07f4\u07bc\u07c0\u07e7\u07e1\u07fa\u07fd\u07f4\u07a8\u07ba\u07df\u07f9\u07f2\u07e5\u07f2\u07bc\u07ff\u07f2\u07fd\u07f4\u07bc\u07c0\u07e7\u07e1\u07fa\u07fd\u07f4\u07a8", "\u0593\u05b1\u059a\u25f9\u05cb\u05c9\u05df\u05bb\u059d\u0596\u0581\u0596\u05d8\u059b\u0596\u0599\u0590\u05d8\u05a4\u0583\u0585\u059e\u0599\u0590\u05cc\u05de\u05bb\u059d\u0596\u0581\u0596\u05d8\u059b\u0596\u0599\u0590\u05d8\u05a4\u0583\u0585\u059e\u0599\u0590\u05cc", "\u0124\u0106\u012e\u214e\u017c\u017e\u0168\u010c\u012a\u0121\u0136\u0121\u016f\u012c\u0121\u012e\u0127\u016f\u0113\u0134\u0132\u0129\u012e\u0127\u017b\u0169\u010c\u012a\u0121\u0136\u0121\u016f\u012c\u0121\u012e\u0127\u016f\u0113\u0134\u0132\u0129\u012e\u0127\u017b", "\u020b\u0254\u025b\u025e\u0259\u025e\u0243\u0209\u020b\u0209\u021f\u021e\u0261", "\u074f\u071a\u071d\u071a\u0707\u074d\u074f\u074d\u075b\u075a\u0725", "\u0149\u014b\u015a\u016d\u0142\u014f\u015d\u015d\u0112\u0110\u0106\u0107\u0162\u0144\u014f\u0158\u014f\u0101\u0142\u014f\u0140\u0149\u0101\u016d\u0142\u014f\u015d\u015d\u0115", "\u0197\u019e\u018c\u0197\u01bc\u0190\u019b\u019a\u01c3\u01c1\u01d7\u01d6\u01b6", "\u06b2\u06a6\u06a2\u06b6\u06bb\u06a4\u06eb\u06e9\u06ff\u069b\u06bd\u06b6\u06a1\u06b6\u06f8\u06bb\u06b6\u06b9\u06b0\u06f8\u0698\u06b5\u06bd\u06b2\u06b4\u06a3\u06ec\u06fe\u068d", "\u0778\u0777\u0774\u0775\u077e\u0727\u0725\u0733\u0732\u0757\u0771\u077a\u076d\u077a\u0734\u0777\u077a\u0775\u077c\u0734\u0754\u0779\u0771\u077e\u0778\u076f\u0720", "\u07a5\u07be\u0782\u07a5\u07a3\u07b8\u07bf\u07b6\u07ed\u07ef\u07f9\u07f8\u079d\u07bb\u07b0\u07a7\u07b0\u07fe\u07bd\u07b0\u07bf\u07b6\u07fe\u0782\u07a5\u07a3\u07b8\u07bf\u07b6\u07ea", "\u05d1\u05d0\u05cb\u05d6\u05d9\u05c6\u0583\u0581\u0597\u0596\u05e9", "\u07fd\u07fc\u07e7\u07fa\u07f5\u07ea\u07d2\u07ff\u07ff\u07af\u07ad\u07bb\u07ba\u07c5", "\u0363\u0375\u037d\u0360\u0328\u032a\u033c\u033d\u0342", "\u0488\u049e\u0496\u048b\u04c3\u04c1\u04d7\u04b5\u04d6\u04a9", "\u024e\u0258\u0250\u024d\u0209\u0205\u0207\u0211\u0273\u0210\u026f", "\u0192\u0184\u018c\u0191\u01d9\u01db\u01cd\u01af\u01ac\u01cc\u01b3", "\u0419\u0416\u0411\u041e\u0413\u0416\u0405\u041a\u0443\u0441\u0457\u0456\u0429"})
public final class Class1540 {
    public static double field5782;
    public static float field5783;
    public static double field5784;
    public static float field5785;

    private static String d7jvsapDCj4OC2Ie(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field5784 = Double.longBitsToDouble(0x4000000000000000L);
        field5782 = Double.longBitsToDouble(4605941107682701739L);
        aq\u200e = "No elytra fly animation";
        field5785 = Float.intBitsToFloat(1058405265);
        aF\u200e = "SignText";
        field5783 = Float.intBitsToFloat(1061384877);
        bJ\u200e = "Accounts for motion when calculating self damage";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite nWV2wVwGqA4uL3(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1540.d7jvsapDCj4OC2Ie(k2, 235127616));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1540.d7jvsapDCj4OC2Ie(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1540.d7jvsapDCj4OC2Ie(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 58986 : 58987;
        block7: while (true) {
            switch (n3) {
                case 58987: {
                    n3 = 58985;
                    continue block7;
                }
                case 58986: {
                    throw new Exception("Can't find method in " + Class1540.d7jvsapDCj4OC2Ie(k2, 235127616) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

