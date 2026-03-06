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
@HACHIMI_CLIENT(mv=100, d1={"\u519e\u519f\u519a\u519e\u519f\u5193\u5193\u5192", "\u4f38\u4f3d\u4f3d\u4f39\u4f35\u4f3c\u4f3c\u4f3a", "\u8752\u8751\u8752\u8759\u8756\u8755\u8750\u8755", "\u6839\u6839\u683c\u683b\u683c\u683d\u6832\u6838", "\u52ea\u52ee\u52ed\u52e1\u52eb\u52ec\u52ef\u52eb", "\u0c53\u0c56\u0c53\u0c53\u0c51\u0c56\u0c50\u0c59", "\u4df1\u4df0\u4df3\u4df1\u4df5\u4df0\u4df2\u4df4", "\u2591\u2594\u259c\u259c\u2592\u2596\u2597\u2597", "\u0383\u0386\u0382\u038d\u0383\u0381\u038c\u0383", "\ua041\ua041\ua043\ua041\ua04c\ua047\ua042\ua045", "\u22cc\u22c6\u22c6\u22c8\u22ce\u22c8\u22cf\u22c9", "\u73ed\u73eb\u73ea\u73e8\u73ec\u73e8\u73eb\u73ee", "\udf09\udf08\udf09\udf03\udf0c\udf0f\udf03\udf0d", "\u60ff\u60fd\u60fc\u60ff\u60f0\u60fa\u60fa", "\u09e7\u09e7\u09e3\u09e3\u09e0\u09e3\u09e1\u09e0", "\u595c\u5959\u595e\u595e\u595b\u595b\u595c\u5958", "\u1660\u166e\u166f\u1661\u1664\u1661\u1664\u1662", "\u4077\u4076\u4072\u4071\u4076\u4074\u4076\u407b"}, d2={"\u0658\u065b\u0668\u2624\u0616\u0614\u0602\u0666\u0640\u064b\u065c\u064b\u0605\u0646\u064b\u0644\u064d\u0605\u0679\u065e\u0658\u0643\u0644\u064d\u0611\u0603\u0666\u0640\u064b\u065c\u064b\u0605\u0646\u064b\u0644\u064d\u0605\u0679\u065e\u0658\u0643\u0644\u064d\u0611", "\u07ec\u07ef\u07dd\u2790\u07a2\u07a0\u07b6\u07d2\u07f4\u07ff\u07e8\u07ff\u07b1\u07f2\u07ff\u07f0\u07f9\u07b1\u07cd\u07ea\u07ec\u07f7\u07f0\u07f9\u07a5\u07b7\u07d2\u07f4\u07ff\u07e8\u07ff\u07b1\u07f2\u07ff\u07f0\u07f9\u07b1\u07cd\u07ea\u07ec\u07f7\u07f0\u07f9\u07a5", "\u03fc\u03ff\u03ca\u2380\u03b2\u03b0\u03a6\u03c2\u03e4\u03ef\u03f8\u03ef\u03a1\u03e2\u03ef\u03e0\u03e9\u03a1\u03dd\u03fa\u03fc\u03e7\u03e0\u03e9\u03b5\u03a7\u03c2\u03e4\u03ef\u03f8\u03ef\u03a1\u03e2\u03ef\u03e0\u03e9\u03a1\u03dd\u03fa\u03fc\u03e7\u03e0\u03e9\u03b5", "\u0643\u0640\u0674\u263f\u060d\u060f\u0619\u067d\u065b\u0650\u0647\u0650\u061e\u065d\u0650\u065f\u0656\u061e\u0662\u0645\u0643\u0658\u065f\u0656\u060a\u0618\u067d\u065b\u0650\u0647\u0650\u061e\u065d\u0650\u065f\u0656\u061e\u0662\u0645\u0643\u0658\u065f\u0656\u060a", "\u0143\u011c\u0113\u0116\u0111\u0116\u010b\u0141\u0143\u0141\u0157\u0156\u0129", "\u0137\u0162\u0165\u0162\u017f\u0135\u0137\u0135\u0123\u0122\u015d", "\u03d0\u03d2\u03c3\u03f4\u03db\u03d6\u03c4\u03c4\u038b\u0389\u039f\u039e\u03fb\u03dd\u03d6\u03c1\u03d6\u0398\u03db\u03d6\u03d9\u03d0\u0398\u03f4\u03db\u03d6\u03c4\u03c4\u038c", "\u0733\u073a\u0728\u0733\u0718\u0734\u073f\u073e\u0767\u0765\u0773\u0772\u0712", "\u05b3\u05a7\u05a3\u05b7\u05ba\u05a5\u05ea\u05e8\u05fe\u059a\u05bc\u05b7\u05a0\u05b7\u05f9\u05ba\u05b7\u05b8\u05b1\u05f9\u0599\u05b4\u05bc\u05b3\u05b5\u05a2\u05ed\u05ff\u058c", "\u07b0\u07bf\u07bc\u07bd\u07b6\u07ef\u07ed\u07fb\u07fa\u079f\u07b9\u07b2\u07a5\u07b2\u07fc\u07bf\u07b2\u07bd\u07b4\u07fc\u079c\u07b1\u07b9\u07b6\u07b0\u07a7\u07e8", "\u033d\u0326\u031a\u033d\u033b\u0320\u0327\u032e\u0375\u0377\u0361\u0360\u0305\u0323\u0328\u033f\u0328\u0366\u0325\u0328\u0327\u032e\u0366\u031a\u033d\u033b\u0320\u0327\u032e\u0372", "\u0740\u0741\u075a\u0747\u0748\u0757\u0712\u0710\u0706\u0707\u0778", ":; =2-\u001588hj|}\u0002", "\u0455\u0443\u044b\u0456\u041e\u041c\u040a\u040b\u0474", "\u0442\u0454\u045c\u0441\u0409\u040b\u041d\u047f\u041c\u0463", "\u07e9\u07ff\u07f7\u07ea\u07ae\u07a2\u07a0\u07b6\u07d4\u07b7\u07c8", "\u06dc\u06ca\u06c2\u06df\u0697\u0695\u0683\u06e1\u06e2\u0682\u06fd", "\u032c\u0323\u0324\u032b\u0326\u0323\u0330\u032f\u0376\u0374\u0362\u0363\u031c"})
public final class Class4223 {
    public static float field9896;

    /*
     * WARNING - void declaration
     */
    private static CallSite wno1Dv88pZT6Jo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4223.2mk52tAgL2QeYBqQ(k2, 243239966));
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
                int a2 = Integer.parseInt(Class4223.2mk52tAgL2QeYBqQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4223.2mk52tAgL2QeYBqQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4223.2mk52tAgL2QeYBqQ(k2, 243239966) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 2mk52tAgL2QeYBqQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        F\u200e = "Fall";
        field9896 = Float.intBitsToFloat(1063524799);
        bk\u200e = "Range";
        bA\u200e = "Width";
        bX\u200e = "SliderSpeed";
    }
}

