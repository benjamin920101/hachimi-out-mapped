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
@HACHIMI_CLIENT(mv=100, d1={"\ub4e0\ub4eb\ub4e7\ub4e0\ub4e5\ub4e2\ub4e2\ub4e7", "\ud8a5\ud8a7\ud8a6\ud8a6\ud8a6\ud8a5\ud8a4\ud8a7", "\ubb22\ubb24\ubb21\ubb20\ubb22\ubb22\ubb27", "\u4767\u4765\u4762\u4762\u4768\u4769\u4760\u4766", "\u8ede\u8edf\u8edf\u8ed8\u8edb\u8ed4\u8edf\u8edb", "\ue82f\ue82a\ue82d\ue823\ue823\ue82e\ue829", "\u170a\u170d\u1708\u170f\u170b\u170b\u1700", "\uaa5c\uaa5b\uaa53\uaa58\uaa59\uaa59\uaa5e\uaa53", "\u9096\u9093\u9094\u9094\u9095\u9091\u9094\u909b", "\u1add\u1ade\u1ad7\u1adf\u1ad8\u1ad7\u1ad9\u1ad9", "\u7380\u7384\u738b\u7386\u738b\u7381\u738a\u7380", "\u83d9\u83d3\u83db\u83da\u83d9\u83db\u83dc\u83d8", "\u69b3\u69bf\u69be\u69b4\u69b1\u69b7\u69b2", "\uc138\uc138\uc133\uc13f\uc13d\uc13a\uc13a", "\u6892\u6895\u6898\u6891\u6894\u6899\u6896\u6895", "\u8198\u8194\u8199\u819c\u819c\u8198\u819f\u819b", "\ubae4\ubae7\ubae9\ubae9\ubae1\ubae2\ubae0\ubae9", "\u3265\u326e\u3267\u3266\u3260\u3266\u3263\u3261", "\u0819\u081e\u081c\u0818\u081b\u081c\u081a\u081e"}, d2={"UAA\u203d\u000f\r\u001b\u007fYRER\u001c_R]T\u001c`GAZ]T\b\u001a\u007fYRER\u001c_R]T\u001c`GAZ]T\b", "\u0132\u0126\u0127\u215a\u0168\u016a\u017c\u0118\u013e\u0135\u0122\u0135\u017b\u0138\u0135\u013a\u0133\u017b\u0107\u0120\u0126\u013d\u013a\u0133\u016f\u017d\u0118\u013e\u0135\u0122\u0135\u017b\u0138\u0135\u013a\u0133\u017b\u0107\u0120\u0126\u013d\u013a\u0133\u016f", "\u0412\u0406\u0400\u247a\u0448\u044a\u045c\u0438\u041e\u0415\u0402\u0415\u045b\u0418\u0415\u041a\u0413\u045b\u0427\u0400\u0406\u041d\u041a\u0413\u044f\u045d\u0438\u041e\u0415\u0402\u0415\u045b\u0418\u0415\u041a\u0413\u045b\u0427\u0400\u0406\u041d\u041a\u0413\u044f", "\u0331\u0325\u0322\u2359\u036b\u0369\u037f\u031b\u033d\u0336\u0321\u0336\u0378\u033b\u0336\u0339\u0330\u0378\u0304\u0323\u0325\u033e\u0339\u0330\u036c\u037e\u031b\u033d\u0336\u0321\u0336\u0378\u033b\u0336\u0339\u0330\u0378\u0304\u0323\u0325\u033e\u0339\u0330\u036c", "\u06cb\u06df\u06db\u26a3\u0691\u0693\u0685\u06e1\u06c7\u06cc\u06db\u06cc\u0682\u06c1\u06cc\u06c3\u06ca\u0682\u06fe\u06d9\u06df\u06c4\u06c3\u06ca\u0696\u0684\u06e1\u06c7\u06cc\u06db\u06cc\u0682\u06c1\u06cc\u06c3\u06ca\u0682\u06fe\u06d9\u06df\u06c4\u06c3\u06ca\u0696", "\u050a\u0555\u055a\u055f\u0558\u055f\u0542\u0508\u050a\u0508\u051e\u051f\u0560", "\u06f1\u06a4\u06a3\u06a4\u06b9\u06f3\u06f1\u06f3\u06e5\u06e4\u069b", "\u06d2\u06d0\u06c1\u06f6\u06d9\u06d4\u06c6\u06c6\u0689\u068b\u069d\u069c\u06f9\u06df\u06d4\u06c3\u06d4\u069a\u06d9\u06d4\u06db\u06d2\u069a\u06f6\u06d9\u06d4\u06c6\u06c6\u068e", "\u0720\u0729\u073b\u0720\u070b\u0727\u072c\u072d\u0774\u0776\u0760\u0761\u0701", "\u0193\u0187\u0183\u0197\u019a\u0185\u01ca\u01c8\u01de\u01ba\u019c\u0197\u0180\u0197\u01d9\u019a\u0197\u0198\u0191\u01d9\u01b9\u0194\u019c\u0193\u0195\u0182\u01cd\u01df\u01ac", "\u00e6\u00e9\u00ea\u00eb\u00e0\u00b9\u00bb\u00ad\u00ac\u00c9\u00ef\u00e4\u00f3\u00e4\u00aa\u00e9\u00e4\u00eb\u00e2\u00aa\u00ca\u00e7\u00ef\u00e0\u00e6\u00f1\u00be", "\u0383\u0398\u03a4\u0383\u0385\u039e\u0399\u0390\u03cb\u03c9\u03df\u03de\u03bb\u039d\u0396\u0381\u0396\u03d8\u039b\u0396\u0399\u0390\u03d8\u03a4\u0383\u0385\u039e\u0399\u0390\u03cc", "\u07f1\u07f0\u07eb\u07f6\u07f9\u07e6\u07a3\u07a1\u07b7\u07b6\u07c9", "\u061f\u061e\u0605\u0618\u0617\u0608\u0630\u061d\u061d\u064d\u064f\u0659\u0658\u0627", "\u0603\u0615\u061d\u0600\u0648\u064a\u065c\u065d\u0622", "\u0101\u0117\u011f\u0102\u014a\u0148\u015e\u013c\u015f\u0120", "\u05b8\u05ae\u05a6\u05bb\u05ff\u05f3\u05f1\u05e7\u0585\u05e6\u0599", "\u0252\u0244\u024c\u0251\u0219\u021b\u020d\u026f\u026c\u020c\u0273", "\u0130\u013f\u0138\u0137\u013a\u013f\u012c\u0133\u016a\u0168\u017e\u017f\u0100"})
public final class Class1652 {
    public static float field6138;
    public static float field6139;
    public static double field6140 = 0.39210440962506565;
    public static int field6141 = 1;
    public static double field6142;
    public static int field6143 = 514709038;

    static {
        field6142 = Double.longBitsToDouble(4604301877903196149L);
        field6139 = Float.intBitsToFloat(1057136579);
        t\u200e = "Toggles the drawn state of the module";
        D\u200e = "value";
        ak\u200e = "GrimAirplace";
        field6138 = Float.intBitsToFloat(1047862608);
        aH\u200e = "HEAD";
        bb\u200e = "o";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 1wAN5RbnLfr1GB(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1652.8I3nq4NlnA9wBSTS(k2, 441320759));
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
                int a2 = Integer.parseInt(Class1652.8I3nq4NlnA9wBSTS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1652.8I3nq4NlnA9wBSTS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1652.8I3nq4NlnA9wBSTS(k2, 441320759) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 8I3nq4NlnA9wBSTS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

