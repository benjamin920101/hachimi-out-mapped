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
@HACHIMI_CLIENT(mv=100, d1={"\ucc2a\ucc21\ucc2c\ucc2b\ucc2f\ucc29\ucc2e\ucc28", "\u47d8\u47d7\u47dd\u47da\u47dc\u47d9\u47d8\u47dc", "\u9246\u9243\u9245\u9243\u9241\u9241\u9243", "\u4f93\u4f95\u4f97\u4f91\u4f90\u4f91\u4f94\u4f94", "\u2de2\u2de3\u2de4\u2de1\u2de7\u2de6\u2de2\u2de9", "\ua879\ua874\ua87a\ua87c\ua87e\ua87b\ua87f\ua87e", "\u83f3\u83f3\u83f1\u83fc\u83fc\u83f6\u83f1\u83f0", "\u28c4\u28c9\u28c4\u28c4\u28c2\u28c7\u28c9\u28c0", "\ud0ee\ud0ea\ud0eb\ud0e9\ud0ef\ud0e9\ud0e8\ud0ed", "\u73aa\u73aa\u73ae\u73a9\u73af\u73ab\u73a2\u73ad", "\u6ff9\u6ff8\u6ffc\u6ff7\u6ff8\u6ffa\u6ff6\u6fff", "\uaa65\uaa63\uaa66\uaa63\uaa60\uaa65\uaa69", "\ubddf\ubdd8\ubddc\ubddd\ubdd8\ubddf\ubdde\ubddc", "\u98d4\u98d5\u98db\u98d1\u98d6\u98d3\u98d3\u98da", "\uae2c\uae2c\uae2a\uae2e\uae2a\uae29\uae2f\uae26", "\u71dd\u71db\u71d9\u71d7\u71da\u71d8\u71d9\u71da", "\u0c4c\u0c4e\u0c4c\u0c4b\u0c48\u0c4f\u0c44\u0c49"}, d2={"\u07a6\u07b5\u079b\u27da\u07e8\u07ea\u07fc\u0798\u07be\u07b5\u07a2\u07b5\u07fb\u07b8\u07b5\u07ba\u07b3\u07fb\u0787\u07a0\u07a6\u07bd\u07ba\u07b3\u07ef\u07fd\u0798\u07be\u07b5\u07a2\u07b5\u07fb\u07b8\u07b5\u07ba\u07b3\u07fb\u0787\u07a0\u07a6\u07bd\u07ba\u07b3\u07ef", "\u00a0\u00b3\u0082\u20dc\u00ee\u00ec\u00fa\u009e\u00b8\u00b3\u00a4\u00b3\u00fd\u00be\u00b3\u00bc\u00b5\u00fd\u0081\u00a6\u00a0\u00bb\u00bc\u00b5\u00e9\u00fb\u009e\u00b8\u00b3\u00a4\u00b3\u00fd\u00be\u00b3\u00bc\u00b5\u00fd\u0081\u00a6\u00a0\u00bb\u00bc\u00b5\u00e9", "\u020b\u0218\u0228\u2277\u0245\u0247\u0251\u0235\u0213\u0218\u020f\u0218\u0256\u0215\u0218\u0217\u021e\u0256\u022a\u020d\u020b\u0210\u0217\u021e\u0242\u0250\u0235\u0213\u0218\u020f\u0218\u0256\u0215\u0218\u0217\u021e\u0256\u022a\u020d\u020b\u0210\u0217\u021e\u0242", "\u0613\u064c\u0643\u0646\u0641\u0646\u065b\u0611\u0613\u0611\u0607\u0606\u0679", "\u0607\u0652\u0655\u0652\u064f\u0605\u0607\u0605\u0613\u0612\u066d", "\u02fe\u02fc\u02ed\u02da\u02f5\u02f8\u02ea\u02ea\u02a5\u02a7\u02b1\u02b0\u02d5\u02f3\u02f8\u02ef\u02f8\u02b6\u02f5\u02f8\u02f7\u02fe\u02b6\u02da\u02f5\u02f8\u02ea\u02ea\u02a2", "\u031c\u0315\u0307\u031c\u0337\u031b\u0310\u0311\u0348\u034a\u035c\u035d\u033d", "\u05be\u05aa\u05ae\u05ba\u05b7\u05a8\u05e7\u05e5\u05f3\u0597\u05b1\u05ba\u05ad\u05ba\u05f4\u05b7\u05ba\u05b5\u05bc\u05f4\u0594\u05b9\u05b1\u05be\u05b8\u05af\u05e0\u05f2\u0581", "\u0729\u0726\u0725\u0724\u072f\u0776\u0774\u0762\u0763\u0706\u0720\u072b\u073c\u072b\u0765\u0726\u072b\u0724\u072d\u0765\u0705\u0728\u0720\u072f\u0729\u073e\u0771", "\u0480\u049b\u04a7\u0480\u0486\u049d\u049a\u0493\u04c8\u04ca\u04dc\u04dd\u04b8\u049e\u0495\u0482\u0495\u04db\u0498\u0495\u049a\u0493\u04db\u04a7\u0480\u0486\u049d\u049a\u0493\u04cf", "\u00e9\u00e8\u00f3\u00ee\u00e1\u00fe\u00bb\u00b9\u00af\u00ae\u00d1", "\u0523\u0522\u0539\u0524\u052b\u0534\u050c\u0521\u0521\u0571\u0573\u0565\u0564\u051b", "\u04c1\u04d7\u04df\u04c2\u048a\u0488\u049e\u049f\u04e0", "\u0211\u0207\u020f\u0212\u025a\u0258\u024e\u022c\u024f\u0230", "[MEX\u001c\u0010\u0012\u0004f\u0005z", "\u03f0\u03e6\u03ee\u03f3\u03bb\u03b9\u03af\u03cd\u03ce\u03ae\u03d1", "\u0550\u055f\u0558\u0557\u055a\u055f\u054c\u0553\u050a\u0508\u051e\u051f\u0560"})
public final class Class3434 {
    public static double field7482;
    public static float field7483;
    public static float field7484;
    public static float field7485;

    /*
     * Enabled aggressive block sorting
     */
    private static String Btj6VJtZHKtVnexl(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 839 : 840;
            block5: while (true) {
                switch (n2) {
                    case 840: {
                        n2 = 838;
                        continue block5;
                    }
                    case 839: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }

    static {
        field7485 = Float.intBitsToFloat(1064440589);
        M\u200e = "Merge";
        al\u200e = "Packets to release from storage every tick";
        field7484 = Float.intBitsToFloat(1059867484);
        field7482 = Double.longBitsToDouble(4599542959292446130L);
        field7483 = Float.intBitsToFloat(1037640872);
        br\u200e = "Time to fade";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 1aT0bMF2yJtebo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3434.Btj6VJtZHKtVnexl(k2, -819678046));
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
                int a2 = Integer.parseInt(Class3434.Btj6VJtZHKtVnexl(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3434.Btj6VJtZHKtVnexl(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3434.Btj6VJtZHKtVnexl(k2, -819678046) + " " + l2 + " " + m2);
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

