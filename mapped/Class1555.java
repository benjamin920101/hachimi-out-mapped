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

@HACHIMI_CLIENT(mv=100, d1={"\u5db1\u5db9\u5db9\u5db1\u5db5\u5db9\u5db7\u5db4", "\u87a5\u87a3\u87ab\u87a7\u87a1\u87a7\u87a3\u87a7", "\u1fd0\u1fd8\u1fdb\u1fd9\u1fda\u1fd0\u1fd9", "\ud363\ud36b\ud364\ud366\ud36a\ud361\ud367\ud363", "\u012a\u0128\u012b\u0128\u012d\u0128\u0126\u012d", "\ud8a0\ud8ad\ud8a1\ud8a7\ud8a4\ud8a6\ud8a5\ud8a0", "\ubc7b\ubc7c\ubc78\ubc7c\ubc7c\ubc7d\ubc7f\ubc74", "\u6f15\u6f11\u6f17\u6f17\u6f10\u6f12\u6f14\u6f15", "\u2e29\u2e28\u2e25\u2e24\u2e2e\u2e25\u2e2d\u2e29", "\u7dcd\u7dca\u7dc9\u7dcb\u7dcf\u7dc8\u7dcf", "\u3fdb\u3fd4\u3fdc\u3fdd\u3fdf\u3fd9\u3fd5\u3fd8", "\u80cb\u80c3\u80c3\u80c8\u80cf\u80ca\u80cf\u80cc", "\u25b4\u25bb\u25b1\u25b1\u25b1\u25bb\u25b7\u25b2", "\u7bb1\u7bbb\u7bb0\u7bb3\u7bb4\u7bba\u7bbb", "\ua511\ua512\ua513\ua513\ua514\ua511\ua512", "\udf69\udf6d\udf68\udf62\udf6a\udf69\udf6a\udf69"}, d2={"\u06cc\u06cd\u06f8\u26b1\u0683\u0681\u0697\u06f3\u06d5\u06de\u06c9\u06de\u0690\u06d3\u06de\u06d1\u06d8\u0690\u06ec\u06cb\u06cd\u06d6\u06d1\u06d8\u0684\u0696\u06f3\u06d5\u06de\u06c9\u06de\u0690\u06d3\u06de\u06d1\u06d8\u0690\u06ec\u06cb\u06cd\u06d6\u06d1\u06d8\u0684", "\u0440\u0441\u047b\u243d\u040f\u040d\u041b\u047f\u0459\u0452\u0445\u0452\u041c\u045f\u0452\u045d\u0454\u041c\u0460\u0447\u0441\u045a\u045d\u0454\u0408\u041a\u047f\u0459\u0452\u0445\u0452\u041c\u045f\u0452\u045d\u0454\u041c\u0460\u0447\u0441\u045a\u045d\u0454\u0408", "\u04bf\u04e0\u04ef\u04ea\u04ed\u04ea\u04f7\u04bd\u04bf\u04bd\u04ab\u04aa\u04d5", "\u044d\u0418\u041f\u0418\u0405\u044f\u044d\u044f\u0459\u0458\u0427", "\u066d\u066f\u067e\u0649\u0666\u066b\u0679\u0679\u0636\u0634\u0622\u0623\u0646\u0660\u066b\u067c\u066b\u0625\u0666\u066b\u0664\u066d\u0625\u0649\u0666\u066b\u0679\u0679\u0631", "\u00bb\u00b2\u00a0\u00bb\u0090\u00bc\u00b7\u00b6\u00ef\u00ed\u00fb\u00fa\u009a", "\u04c3\u04d7\u04d3\u04c7\u04ca\u04d5\u049a\u0498\u048e\u04ea\u04cc\u04c7\u04d0\u04c7\u0489\u04ca\u04c7\u04c8\u04c1\u0489\u04e9\u04c4\u04cc\u04c3\u04c5\u04d2\u049d\u048f\u04fc", "\u0559\u0556\u0555\u0554\u055f\u0506\u0504\u0512\u0513\u0576\u0550\u055b\u054c\u055b\u0515\u0556\u055b\u0554\u055d\u0515\u0575\u0558\u0550\u055f\u0559\u054e\u0501", "\u05a9\u05b2\u058e\u05a9\u05af\u05b4\u05b3\u05ba\u05e1\u05e3\u05f5\u05f4\u0591\u05b7\u05bc\u05ab\u05bc\u05f2\u05b1\u05bc\u05b3\u05ba\u05f2\u058e\u05a9\u05af\u05b4\u05b3\u05ba\u05e6", "\u046b\u046a\u0471\u046c\u0463\u047c\u0439\u043b\u042d\u042c\u0453", "\u04a4\u04a5\u04be\u04a3\u04ac\u04b3\u048b\u04a6\u04a6\u04f6\u04f4\u04e2\u04e3\u049c", "\u00db\u00cd\u00c5\u00d8\u0090\u0092\u0084\u0085\u00fa", "1'/2zxn\fo\u0010", "\u00fc\u00ea\u00e2\u00ff\u00bb\u00b7\u00b5\u00a3\u00c1\u00a2\u00dd", "\u0314\u0302\u030a\u0317\u035f\u035d\u034b\u0329\u032a\u034a\u0335", "\u061b\u0614\u0613\u061c\u0611\u0614\u0607\u0618\u0641\u0643\u0655\u0654\u062b"})
public final class Class1555 {
    public static float field5831 = 0.54972374f;
    public static float field5832 = Float.intBitsToFloat(1060496171);
    public static double field5833 = 0.06797713076546874;
    public static int field5834 = 707496585;

    private static String y6OiNO8ci5zxe51N(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ESSh8HhSyaRn2N(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1555.y6OiNO8ci5zxe51N(k2, -2001562442));
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
                int a2 = Integer.parseInt(Class1555.y6OiNO8ci5zxe51N(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1555.y6OiNO8ci5zxe51N(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1555.y6OiNO8ci5zxe51N(k2, -2001562442) + " " + l2 + " " + m2);
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
        bg\u200e = "DotRadius";
        bp\u200e = "AirPlace";
    }
}

