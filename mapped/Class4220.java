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
@HACHIMI_CLIENT(mv=100, d1={"\u866a\u866a\u866a\u866b\u866e\u866a\u866d\u866c", "\uaa72\uaa78\uaa7a\uaa78\uaa73\uaa7a\uaa79", "\ue0b0\ue0b2\ue0bd\ue0bd\ue0b2\ue0b6\ue0b7\ue0b1", "\u6e4a\u6e43\u6e4b\u6e4c\u6e4f\u6e4b\u6e4e\u6e4f", "\u4478\u4478\u4470\u447b\u4471\u4471\u4471\u4478", "\u9a68\u9a6d\u9a6b\u9a6a\u9a66\u9a6e\u9a69", "\u7860\u7860\u7866\u7860\u7866\u7860\u7861\u7866", "\u5da6\u5da8\u5da7\u5da5\u5da2\u5da7\u5da3\u5da0", "\u0323\u0326\u0320\u032e\u0325\u0321\u032f\u0321", "\ua121\ua12c\ua125\ua122\ua12c\ua12c\ua122\ua12c", "\u3686\u3682\u3684\u3685\u3687\u3686\u3682\u3681", "\ud3f3\ud3f4\ud3f5\ud3f2\ud3f3\ud3f4\ud3f0\ud3f6", "\ub6ba\ub6bd\ub6b5\ub6b4\ub6ba\ub6bc\ub6bd\ub6be", "\u82f5\u82f9\u82f0\u82f4\u82f4\u82f4\u82f3\u82f8", "\u586b\u586b\u586a\u586c\u586f\u586d\u5860\u586b", "\u2688\u268f\u2680\u2681\u268a\u268f\u268c\u2681"}, d2={"\u01a7\u01ac\u019a\u21c3\u01f1\u01f3\u01e5\u0181\u01a7\u01ac\u01bb\u01ac\u01e2\u01a1\u01ac\u01a3\u01aa\u01e2\u019e\u01b9\u01bf\u01a4\u01a3\u01aa\u01f6\u01e4\u0181\u01a7\u01ac\u01bb\u01ac\u01e2\u01a1\u01ac\u01a3\u01aa\u01e2\u019e\u01b9\u01bf\u01a4\u01a3\u01aa\u01f6", "\u0607\u060c\u0635\u2663\u0651\u0653\u0645\u0621\u0607\u060c\u061b\u060c\u0642\u0601\u060c\u0603\u060a\u0642\u063e\u0619\u061f\u0604\u0603\u060a\u0656\u0644\u0621\u0607\u060c\u061b\u060c\u0642\u0601\u060c\u0603\u060a\u0642\u063e\u0619\u061f\u0604\u0603\u060a\u0656", "\u0432\u046d\u0462\u0467\u0460\u0467\u047a\u0430\u0432\u0430\u0426\u0427\u0458", "\u053b\u056e\u0569\u056e\u0573\u0539\u053b\u0539\u052f\u052e\u0551", "\u0144\u0146\u0157\u0160\u014f\u0142\u0150\u0150\u011f\u011d\u010b\u010a\u016f\u0149\u0142\u0155\u0142\u010c\u014f\u0142\u014d\u0144\u010c\u0160\u014f\u0142\u0150\u0150\u0118", "dm\u007fdOchi02$%E", "\u07f5\u07e1\u07e5\u07f1\u07fc\u07e3\u07ac\u07ae\u07b8\u07dc\u07fa\u07f1\u07e6\u07f1\u07bf\u07fc\u07f1\u07fe\u07f7\u07bf\u07df\u07f2\u07fa\u07f5\u07f3\u07e4\u07ab\u07b9\u07ca", "\u0615\u061a\u0619\u0618\u0613\u064a\u0648\u065e\u065f\u063a\u061c\u0617\u0600\u0617\u0659\u061a\u0617\u0618\u0611\u0659\u0639\u0614\u061c\u0613\u0615\u0602\u064d", "\u04ce\u04d5\u04e9\u04ce\u04c8\u04d3\u04d4\u04dd\u0486\u0484\u0492\u0493\u04f6\u04d0\u04db\u04cc\u04db\u0495\u04d6\u04db\u04d4\u04dd\u0495\u04e9\u04ce\u04c8\u04d3\u04d4\u04dd\u0481", "\u02f3\u02f2\u02e9\u02f4\u02fb\u02e4\u02a1\u02a3\u02b5\u02b4\u02cb", "\u042b\u042a\u0431\u042c\u0423\u043c\u0404\u0429\u0429\u0479\u047b\u046d\u046c\u0413", "\u00f1\u00e7\u00ef\u00f2\u00ba\u00b8\u00ae\u00af\u00d0", "\u03b8\u03ae\u03a6\u03bb\u03f3\u03f1\u03e7\u0385\u03e6\u0399", "\u05f9\u05ef\u05e7\u05fa\u05be\u05b2\u05b0\u05a6\u05c4\u05a7\u05d8", "\u051a\u050c\u0504\u0519\u0551\u0553\u0545\u0527\u0524\u0544\u053b", "\u015a\u0155\u0152\u015d\u0150\u0155\u0146\u0159\u0100\u0102\u0114\u0115\u016a"})
public final class Class4220 {
    public static int field9887 = -1368085920;
    public static float field9888;
    public static float field9889;
    public static double field9890;

    private static String ijR8YdmjNUesfdrv(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 2UbQvrdcBpFkLt(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4220.ijR8YdmjNUesfdrv(k2, -179261975));
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
                int a2 = Integer.parseInt(Class4220.ijR8YdmjNUesfdrv(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4220.ijR8YdmjNUesfdrv(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4220.ijR8YdmjNUesfdrv(k2, -179261975) + " " + l2 + " " + m2);
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
        field9890 = Double.longBitsToDouble(4604197193737139665L);
        field9889 = Float.intBitsToFloat(1063895012);
        field9888 = Float.intBitsToFloat(1035141432);
        bF\u200e = "Valid block blacklist";
        bG\u200e = "Max totem particle ticks";
    }
}

