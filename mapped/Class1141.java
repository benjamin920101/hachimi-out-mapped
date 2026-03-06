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

@HACHIMI_CLIENT(mv=100, d1={"\ubdc3\ubdc2\ubdc0\ubdcf\ubdcf\ubdc3\ubdc7\ubdc0", "\u1a74\u1a76\u1a7b\u1a7a\u1a71\u1a76\u1a72\u1a7b", "\u700f\u700a\u7008\u7003\u700a\u700d\u700f", "\u282d\u282b\u2826\u2829\u282b\u2829\u282a\u282b", "\u28a9\u28a9\u28a9\u28a9\u28ae\u28aa\u28ae\u28ad", "\udaa2\udaa3\udaa2\udaa2\udaa3\udaa6\udaa2\udaa5", "\u3181\u3182\u3180\u3183\u3186\u3183\u3182\u3184", "\u7a2d\u7a2b\u7a2d\u7a29\u7a2b\u7a2c\u7a2c\u7a2a", "\uce18\uce1a\uce1a\uce1b\uce1e\uce18\uce1c\uce19", "\udab5\udab5\udab6\udab9\udab2\udab3\udab5\udab5", "\uc828\uc829\uc82a\uc82d\uc824\uc82c\uc82b", "\uddf3\uddf5\uddfd\uddf5\uddf1\uddfc\uddf4\uddf6", "\u41b7\u41bd\u41b2\u41b0\u41b0\u41b5\u41bc", "\u6d9a\u6d9d\u6d9e\u6d93\u6d9f\u6d92\u6d99\u6d9a", "\u7363\u7366\u7362\u7369\u7369\u7367\u7363\u7363", "\u1d35\u1d30\u1d35\u1d36\u1d36\u1d30\u1d37\u1d33", "\u51b2\u51b9\u51bf\u51b2\u51b2\u51bf\u51be"}, d2={"\u050e\u0502\u050b\u2566\u0554\u0556\u0540\u0524\u0502\u0509\u051e\u0509\u0547\u0504\u0509\u0506\u050f\u0547\u053b\u051c\u051a\u0501\u0506\u050f\u0553\u0541\u0524\u0502\u0509\u051e\u0509\u0547\u0504\u0509\u0506\u050f\u0547\u053b\u051c\u051a\u0501\u0506\u050f\u0553", "\u067e\u0672\u067c\u2616\u0624\u0626\u0630\u0654\u0672\u0679\u066e\u0679\u0637\u0674\u0679\u0676\u067f\u0637\u064b\u066c\u066a\u0671\u0676\u067f\u0623\u0631\u0654\u0672\u0679\u066e\u0679\u0637\u0674\u0679\u0676\u067f\u0637\u064b\u066c\u066a\u0671\u0676\u067f\u0623", "\u0242\u024e\u0241\u222a\u0218\u021a\u020c\u0268\u024e\u0245\u0252\u0245\u020b\u0248\u0245\u024a\u0243\u020b\u0277\u0250\u0256\u024d\u024a\u0243\u021f\u020d\u0268\u024e\u0245\u0252\u0245\u020b\u0248\u0245\u024a\u0243\u020b\u0277\u0250\u0256\u024d\u024a\u0243\u021f", "\u0527\u0578\u0577\u0572\u0575\u0572\u056f\u0525\u0527\u0525\u0533\u0532\u054d", "\u0392\u03c7\u03c0\u03c7\u03da\u0390\u0392\u0390\u0386\u0387\u03f8", "@BSdKFTT\u001b\u0019\u000f\u000ekMFQF\bKFI@\bdKFTT\u001c", "\u07f0\u07f9\u07eb\u07f0\u07db\u07f7\u07fc\u07fd\u07a4\u07a6\u07b0\u07b1\u07d1", "\u07b6\u07a2\u07a6\u07b2\u07bf\u07a0\u07ef\u07ed\u07fb\u079f\u07b9\u07b2\u07a5\u07b2\u07fc\u07bf\u07b2\u07bd\u07b4\u07fc\u079c\u07b1\u07b9\u07b6\u07b0\u07a7\u07e8\u07fa\u0789", "\u01bc\u01b3\u01b0\u01b1\u01ba\u01e3\u01e1\u01f7\u01f6\u0193\u01b5\u01be\u01a9\u01be\u01f0\u01b3\u01be\u01b1\u01b8\u01f0\u0190\u01bd\u01b5\u01ba\u01bc\u01ab\u01e4", "\u07ae\u07b5\u0789\u07ae\u07a8\u07b3\u07b4\u07bd\u07e6\u07e4\u07f2\u07f3\u0796\u07b0\u07bb\u07ac\u07bb\u07f5\u07b6\u07bb\u07b4\u07bd\u07f5\u0789\u07ae\u07a8\u07b3\u07b4\u07bd\u07e1", "\u06bc\u06bd\u06a6\u06bb\u06b4\u06ab\u06ee\u06ec\u06fa\u06fb\u0684", "\u01e2\u01e3\u01f8\u01e5\u01ea\u01f5\u01cd\u01e0\u01e0\u01b0\u01b2\u01a4\u01a5\u01da", "\u0570\u0566\u056e\u0573\u053b\u0539\u052f\u052e\u0551", "\u0335\u0323\u032b\u0336\u037e\u037c\u036a\u0308\u036b\u0314", "\u0659\u064f\u0647\u065a\u061e\u0612\u0610\u0606\u0664\u0607\u0678", "\u0692\u0684\u068c\u0691\u06d9\u06db\u06cd\u06af\u06ac\u06cc\u06b3", "\u0245\u024a\u024d\u0242\u024f\u024a\u0259\u0246\u021f\u021d\u020b\u020a\u0275"})
public final class Class1141 {
    public static float field4569;
    public static float field4570 = 0.7651995f;
    public static float field4571;
    public static int field4572 = 1507012215;

    /*
     * WARNING - void declaration
     */
    private static CallSite NN60qOM4DR4zeY(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1141.TRPEvLFAAnlqDC58(k2, 1447842318));
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
                int a2 = Integer.parseInt(Class1141.TRPEvLFAAnlqDC58(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1141.TRPEvLFAAnlqDC58(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1141.TRPEvLFAAnlqDC58(k2, 1447842318) + " " + l2 + " " + m2);
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
        d\u200e = "ESP";
        field4569 = Float.intBitsToFloat(1103626240);
        field4571 = Float.intBitsToFloat(1057500908);
        Y\u200e = "Leave Count";
        bx\u200e = "1.21+";
    }

    private static String TRPEvLFAAnlqDC58(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

