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

@HACHIMI_CLIENT(mv=100, d1={"\u63e0\u63e5\u63e4\u63e4\u63e7\u63ec\u63ec\u63e1", "\udc9b\udc9f\udc9e\udc9d\udc99\udc9c\udc96\udc98", "\ub2d8\ub2d9\ub2d3\ub2d8\ub2d2\ub2db\ub2df\ub2d3", "\ub204\ub206\ub206\ub20e\ub204\ub20e\ub204\ub203", "\u2375\u2371\u2373\u237e\u237f\u2372\u237f\u2371", "\u508d\u508e\u5089\u5082\u508e\u508a\u5088\u5082", "\u1450\u1451\u1454\u1455\u1452\u1456\u1455\u145a", "\ud85a\ud85a\ud851\ud85a\ud85d\ud85a\ud850\ud850", "\ucedd\uced8\uced6\uced7\uceda\ucedd\ucedf\uced7", "\u8bd0\u8bd6\u8bd3\u8bd6\u8bd6\u8bd0\u8bd1\u8bd4", "\u792d\u792b\u7920\u7928\u792b\u7929\u792d\u7928", "\u06a2\u06a7\u06a9\u06a1\u06a6\u06a8\u06a1\u06a6", "\uac30\uac31\uac30\uac3c\uac32\uac34\uac36\uac33", "\ue6b0\ue6b0\ue6b2\ue6b4\ue6b3\ue6b2\ue6b0\ue6bc", "\ubabd\ubabb\ubab8\ubabd\ubabb\ubabc\ubab0\ubaba", "\u2238\u223f\u223c\u223a\u2234\u2238\u223e\u223b", "\u53dd\u53d9\u53d6\u53da\u53de\u53df\u53d6\u53df", "\ue5b3\ue5bd\ue5b0\ue5b1\ue5bc\ue5b6\ue5b5\ue5b2", "\u6b52\u6b51\u6b50\u6b5f\u6b52\u6b54\u6b56\u6b51"}, d2={"\u0492\u04b9\u0493\u24fa\u04c8\u04ca\u04dc\u04b8\u049e\u0495\u0482\u0495\u04db\u0498\u0495\u049a\u0493\u04db\u04a7\u0480\u0486\u049d\u049a\u0493\u04cf\u04dd\u04b8\u049e\u0495\u0482\u0495\u04db\u0498\u0495\u049a\u0493\u04db\u04a7\u0480\u0486\u049d\u049a\u0493\u04cf", "\u0476\u045d\u0478\u241e\u042c\u042e\u0438\u045c\u047a\u0471\u0466\u0471\u043f\u047c\u0471\u047e\u0477\u043f\u0443\u0464\u0462\u0479\u047e\u0477\u042b\u0439\u045c\u047a\u0471\u0466\u0471\u043f\u047c\u0471\u047e\u0477\u043f\u0443\u0464\u0462\u0479\u047e\u0477\u042b", "\u06c4\u06ef\u06cb\u26ac\u069e\u069c\u068a\u06ee\u06c8\u06c3\u06d4\u06c3\u068d\u06ce\u06c3\u06cc\u06c5\u068d\u06f1\u06d6\u06d0\u06cb\u06cc\u06c5\u0699\u068b\u06ee\u06c8\u06c3\u06d4\u06c3\u068d\u06ce\u06c3\u06cc\u06c5\u068d\u06f1\u06d6\u06d0\u06cb\u06cc\u06c5\u0699", "\u04f0\u04db\u04fc\u2498\u04aa\u04a8\u04be\u04da\u04fc\u04f7\u04e0\u04f7\u04b9\u04fa\u04f7\u04f8\u04f1\u04b9\u04c5\u04e2\u04e4\u04ff\u04f8\u04f1\u04ad\u04bf\u04da\u04fc\u04f7\u04e0\u04f7\u04b9\u04fa\u04f7\u04f8\u04f1\u04b9\u04c5\u04e2\u04e4\u04ff\u04f8\u04f1\u04ad", "\u0331\u031a\u033c\u2359\u036b\u0369\u037f\u031b\u033d\u0336\u0321\u0336\u0378\u033b\u0336\u0339\u0330\u0378\u0304\u0323\u0325\u033e\u0339\u0330\u036c\u037e\u031b\u033d\u0336\u0321\u0336\u0378\u033b\u0336\u0339\u0330\u0378\u0304\u0323\u0325\u033e\u0339\u0330\u036c", "\u01fd\u01a2\u01ad\u01a8\u01af\u01a8\u01b5\u01ff\u01fd\u01ff\u01e9\u01e8\u0197", "X\r\n\r\u0010ZXZLM2", "\u0372\u0370\u0361\u0356\u0379\u0374\u0366\u0366\u0329\u032b\u033d\u033c\u0359\u037f\u0374\u0363\u0374\u033a\u0379\u0374\u037b\u0372\u033a\u0356\u0379\u0374\u0366\u0366\u032e", "\u01b3\u01ba\u01a8\u01b3\u0198\u01b4\u01bf\u01be\u01e7\u01e5\u01f3\u01f2\u0192", "\u06c8\u06dc\u06d8\u06cc\u06c1\u06de\u0691\u0693\u0685\u06e1\u06c7\u06cc\u06db\u06cc\u0682\u06c1\u06cc\u06c3\u06ca\u0682\u06e2\u06cf\u06c7\u06c8\u06ce\u06d9\u0696\u0684\u06f7", "\u054a\u0545\u0546\u0547\u054c\u0515\u0517\u0501\u0500\u0565\u0543\u0548\u055f\u0548\u0506\u0545\u0548\u0547\u054e\u0506\u0566\u054b\u0543\u054c\u054a\u055d\u0512", "\u01a7\u01bc\u0180\u01a7\u01a1\u01ba\u01bd\u01b4\u01ef\u01ed\u01fb\u01fa\u019f\u01b9\u01b2\u01a5\u01b2\u01fc\u01bf\u01b2\u01bd\u01b4\u01fc\u0180\u01a7\u01a1\u01ba\u01bd\u01b4\u01e8", "\u070a\u070b\u0710\u070d\u0702\u071d\u0758\u075a\u074c\u074d\u0732", "\u05de\u05df\u05c4\u05d9\u05d6\u05c9\u05f1\u05dc\u05dc\u058c\u058e\u0598\u0599\u05e6", "\u06cd\u06db\u06d3\u06ce\u0686\u0684\u0692\u0693\u06ec", "\u053a\u052c\u0524\u0539\u0571\u0573\u0565\u0507\u0564\u051b", "\u038d\u039b\u0393\u038e\u03ca\u03c6\u03c4\u03d2\u03b0\u03d3\u03ac", "\u051d\u050b\u0503\u051e\u0556\u0554\u0542\u0520\u0523\u0543\u053c", "\u0482\u048d\u048a\u0485\u0488\u048d\u049e\u0481\u04d8\u04da\u04cc\u04cd\u04b2"})
public final class Class4379 {
    public static double field9988 = Double.longBitsToDouble(4599514854011809490L);
    public static double field9989 = 0.5289581139404157;
    public static int field9990 = 519970985;
    public static float field9991 = Float.intBitsToFloat(1064089221);
    public static int field9992 = 489357182;
    public static double field9993;

    /*
     * WARNING - void declaration
     */
    private static CallSite sTk0tgYLAjHkiJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4379.wV7NRJY2OAvEZoJL(k2, 137429688));
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
                int a2 = Integer.parseInt(Class4379.wV7NRJY2OAvEZoJL(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4379.wV7NRJY2OAvEZoJL(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4379.wV7NRJY2OAvEZoJL(k2, 137429688) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String wV7NRJY2OAvEZoJL(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        B\u200e = "MISC";
        L\u200e = "Always";
        field9993 = Double.longBitsToDouble(4605147203680718639L);
        aQ\u200e = "Frostbite";
        bb\u200e = "OFF";
        bu\u200e = "Debug";
    }
}

