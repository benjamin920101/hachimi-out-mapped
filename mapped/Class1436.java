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

@HACHIMI_CLIENT(mv=100, d1={"\u32c6\u32c1\u32cf\u32c7\u32cf\u32c6\u32c5\u32c6", "\u933d\u9339\u9338\u9338\u9337\u9338\u933b\u933f", "\u4aea\u4ae5\u4aed\u4aea\u4ae8\u4ae4\u4ae8\u4aed", "\u9436\u9437\u9435\u9433\u943a\u9433\u9432\u943b", "\u9c08\u9c02\u9c0a\u9c09\u9c0b\u9c0d\u9c02\u9c0e", "\u065a\u0659\u065a\u0658\u065b\u0651\u065b\u065a", "\u443f\u443e\u443e\u443c\u4433\u443e\u4439\u443f", "\u8849\u8848\u8849\u884a\u884b\u8844\u884e\u884f", "\u8a86\u8a8a\u8a8a\u8a85\u8a80\u8a80\u8a86\u8a84", "\u8d4a\u8d4c\u8d4d\u8d4b\u8d4e\u8d4e\u8d48\u8d4f", "\u1284\u1281\u1281\u1283\u1281\u128a\u1285\u1285", "\u9525\u952e\u9523\u9522\u952e\u9524\u9525\u9522", "\u96a7\u96a0\u96a2\u96a7\u96a0\u96a1\u96a4\u96a3", "\u1be7\u1be0\u1be5\u1be8\u1be2\u1be1\u1be6\u1be5", "\u025a\u0256\u0259\u025f\u0256\u025c\u025a\u0256", "\u374b\u3747\u374c\u3747\u374c\u374d\u374b", "\u5f05\u5f05\u5f05\u5f07\u5f00\u5f01\u5f05\u5f01", "\u44a9\u44ae\u44aa\u44a8\u44ae\u44ac\u44aa\u44a3"}, d2={"\u02bc\u0299\u02b9\u22c1\u02f3\u02f1\u02e7\u0283\u02a5\u02ae\u02b9\u02ae\u02e0\u02a3\u02ae\u02a1\u02a8\u02e0\u029c\u02bb\u02bd\u02a6\u02a1\u02a8\u02f4\u02e6\u0283\u02a5\u02ae\u02b9\u02ae\u02e0\u02a3\u02ae\u02a1\u02a8\u02e0\u029c\u02bb\u02bd\u02a6\u02a1\u02a8\u02f4", "\u01d9\u01fc\u01dd\u21a4\u0196\u0194\u0182\u01e6\u01c0\u01cb\u01dc\u01cb\u0185\u01c6\u01cb\u01c4\u01cd\u0185\u01f9\u01de\u01d8\u01c3\u01c4\u01cd\u0191\u0183\u01e6\u01c0\u01cb\u01dc\u01cb\u0185\u01c6\u01cb\u01c4\u01cd\u0185\u01f9\u01de\u01d8\u01c3\u01c4\u01cd\u0191", "\u07ac\u0789\u07a7\u27d1\u07e3\u07e1\u07f7\u0793\u07b5\u07be\u07a9\u07be\u07f0\u07b3\u07be\u07b1\u07b8\u07f0\u078c\u07ab\u07ad\u07b6\u07b1\u07b8\u07e4\u07f6\u0793\u07b5\u07be\u07a9\u07be\u07f0\u07b3\u07be\u07b1\u07b8\u07f0\u078c\u07ab\u07ad\u07b6\u07b1\u07b8\u07e4", "\u065c\u0679\u0656\u2621\u0613\u0611\u0607\u0663\u0645\u064e\u0659\u064e\u0600\u0643\u064e\u0641\u0648\u0600\u067c\u065b\u065d\u0646\u0641\u0648\u0614\u0606\u0663\u0645\u064e\u0659\u064e\u0600\u0643\u064e\u0641\u0648\u0600\u067c\u065b\u065d\u0646\u0641\u0648\u0614", "\u0794\u07cb\u07c4\u07c1\u07c6\u07c1\u07dc\u0796\u0794\u0796\u0780\u0781\u07fe", "\u03cf\u039a\u039d\u039a\u0387\u03cd\u03cf\u03cd\u03db\u03da\u03a5", "\u0107\u0105\u0114\u0123\u010c\u0101\u0113\u0113\u015c\u015e\u0148\u0149\u012c\u010a\u0101\u0116\u0101\u014f\u010c\u0101\u010e\u0107\u014f\u0123\u010c\u0101\u0113\u0113\u015b", "\u033b\u0332\u0320\u033b\u0310\u033c\u0337\u0336\u036f\u036d\u037b\u037a\u031a", "\u0163\u0177\u0173\u0167\u016a\u0175\u013a\u0138\u012e\u014a\u016c\u0167\u0170\u0167\u0129\u016a\u0167\u0168\u0161\u0129\u0149\u0164\u016c\u0163\u0165\u0172\u013d\u012f\u015c", "\u0293\u029c\u029f\u029e\u0295\u02cc\u02ce\u02d8\u02d9\u02bc\u029a\u0291\u0286\u0291\u02df\u029c\u0291\u029e\u0297\u02df\u02bf\u0292\u029a\u0295\u0293\u0284\u02cb", "\u0515\u050e\u0532\u0515\u0513\u0508\u050f\u0506\u055d\u055f\u0549\u0548\u052d\u050b\u0500\u0517\u0500\u054e\u050d\u0500\u050f\u0506\u054e\u0532\u0515\u0513\u0508\u050f\u0506\u055a", "\u0012\u0013\b\u0015\u001a\u0005@BTU*", "\u018d\u018c\u0197\u018a\u0185\u019a\u01a2\u018f\u018f\u01df\u01dd\u01cb\u01ca\u01b5", "\u06ac\u06ba\u06b2\u06af\u06e7\u06e5\u06f3\u06f2\u068d", "\u069c\u068a\u0682\u069f\u06d7\u06d5\u06c3\u06a1\u06c2\u06bd", "\u0406\u0410\u0418\u0405\u0441\u044d\u044f\u0459\u043b\u0458\u0427", "\u05c4\u05d2\u05da\u05c7\u058f\u058d\u059b\u05f9\u05fa\u059a\u05e5", "\u0405\u040a\u040d\u0402\u040f\u040a\u0419\u0406\u045f\u045d\u044b\u044a\u0435"})
public final class Class1436 {
    public static float field5486;
    public static float field5487;
    public static float field5488 = 0.37745577f;

    /*
     * WARNING - void declaration
     */
    private static CallSite mSTQzOYGFqolE9(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1436.T7sicDYmQMrAktFi(k2, 1351832045));
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
                int a2 = Integer.parseInt(Class1436.T7sicDYmQMrAktFi(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1436.T7sicDYmQMrAktFi(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1436.T7sicDYmQMrAktFi(k2, 1351832045) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String T7sicDYmQMrAktFi(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        S\u200e = "Speed";
        ak\u200e = "GRIM";
        field5486 = Float.intBitsToFloat(1060498479);
        field5487 = Float.intBitsToFloat(1048233896);
        aT\u200e = "The distance of your block reach";
        bd\u200e = "factor";
    }
}

