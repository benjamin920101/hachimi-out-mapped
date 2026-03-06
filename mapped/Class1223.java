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
@HACHIMI_CLIENT(mv=100, d1={"\u7c00\u7c01\u7c05\u7c0f\u7c06\u7c01\u7c00\u7c03", "\u2da4\u2da5\u2da4\u2dac\u2da0\u2dac\u2da4\u2da3", "\u37ff\u37ff\u37fb\u37f9\u37fd\u37f2\u37fb\u37fd", "\u50e1\u50ed\u50e1\u50e3\u50e3\u50e2\u50ed\u50e6", "\u2358\u235f\u235a\u235c\u2358\u235b\u2355\u235e", "\u68e6\u68e3\u68e7\u68ef\u68e5\u68e5\u68ee\u68e6", "\u09b1\u09b7\u09b0\u09b4\u09b2\u09b3\u09b5\u09ba", "\u85fe\u85f4\u85fb\u85f8\u85fd\u85fc\u85f8", "\ubfcd\ubfc0\ubfcd\ubfc9\ubfcd\ubfcf", "\u3b90\u3b92\u3b9c\u3b95\u3b91\u3b93\u3b92\u3b96", "\u6166\u6164\u6164\u6166\u6165\u6165\u6168\u6166", "\ubacc\ubac3\ubac6\ubac3\ubac0\ubac6\ubacd", "\u6bfd\u6bf9\u6bfa\u6bff\u6bfd\u6bf9\u6bff\u6bfc", "\ud229\ud229\ud22b\ud22f\ud225\ud229\ud224\ud22f", "\u32fd\u32f7\u32f9\u32fd\u32f9\u32fb\u32fc\u32fb", "\ud925\ud921\ud920\ud92f\ud923\ud923\ud92f\ud92e"}, d2={"\u0730\u0706\u0716\u275d\u076f\u076d\u077b\u071f\u0739\u0732\u0725\u0732\u077c\u073f\u0732\u073d\u0734\u077c\u0700\u0727\u0721\u073a\u073d\u0734\u0768\u077a\u071f\u0739\u0732\u0725\u0732\u077c\u073f\u0732\u073d\u0734\u077c\u0700\u0727\u0721\u073a\u073d\u0734\u0768", "\u0475\u0443\u0450\u2418\u042a\u0428\u043e\u045a\u047c\u0477\u0460\u0477\u0439\u047a\u0477\u0478\u0471\u0439\u0445\u0462\u0464\u047f\u0478\u0471\u042d\u043f\u045a\u047c\u0477\u0460\u0477\u0439\u047a\u0477\u0478\u0471\u0439\u0445\u0462\u0464\u047f\u0478\u0471\u042d", "\u0440\u041f\u0410\u0415\u0412\u0415\u0408\u0442\u0440\u0442\u0454\u0455\u042a", "\u05a4\u05f1\u05f6\u05f1\u05ec\u05a6\u05a4\u05a6\u05b0\u05b1\u05ce", "\u041f\u041d\u040c\u043b\u0414\u0419\u040b\u040b\u0444\u0446\u0450\u0451\u0434\u0412\u0419\u040e\u0419\u0457\u0414\u0419\u0416\u041f\u0457\u043b\u0414\u0419\u040b\u040b\u0443", "\u0507\u050e\u051c\u0507\u052c\u0500\u050b\u050a\u0553\u0551\u0547\u0546\u0526", "\u011e\u010a\u010e\u011a\u0117\u0108\u0147\u0145\u0153\u0137\u0111\u011a\u010d\u011a\u0154\u0117\u011a\u0115\u011c\u0154\u0134\u0119\u0111\u011e\u0118\u010f\u0140\u0152\u0121", "\u02c5\u02ca\u02c9\u02c8\u02c3\u029a\u0298\u028e\u028f\u02ea\u02cc\u02c7\u02d0\u02c7\u0289\u02ca\u02c7\u02c8\u02c1\u0289\u02e9\u02c4\u02cc\u02c3\u02c5\u02d2\u029d", "\u0290\u028b\u02b7\u0290\u0296\u028d\u028a\u0283\u02d8\u02da\u02cc\u02cd\u02a8\u028e\u0285\u0292\u0285\u02cb\u0288\u0285\u028a\u0283\u02cb\u02b7\u0290\u0296\u028d\u028a\u0283\u02df", "\u03f9\u03f8\u03e3\u03fe\u03f1\u03ee\u03ab\u03a9\u03bf\u03be\u03c1", "\u06e3\u06e2\u06f9\u06e4\u06eb\u06f4\u06cc\u06e1\u06e1\u06b1\u06b3\u06a5\u06a4\u06db", "\u00a7\u00b1\u00b9\u00a4\u00ec\u00ee\u00f8\u00f9\u0086", "\u01b5\u01a3\u01ab\u01b6\u01fe\u01fc\u01ea\u0188\u01eb\u0194", "\u0386\u0390\u0398\u0385\u03c1\u03cd\u03cf\u03d9\u03bb\u03d8\u03a7", "\u0366\u0370\u0378\u0365\u032d\u032f\u0339\u035b\u0358\u0338\u0347", "\u06a4\u06ab\u06ac\u06a3\u06ae\u06ab\u06b8\u06a7\u06fe\u06fc\u06ea\u06eb\u0694"})
public final class Class1223 {
    public static float field4799 = Float.intBitsToFloat(1058642330);
    public static double field4800;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite DnTTFQLSUr29gO(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1223.1LnFjj7I6gSdyKMs(k2, 1850084670));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 17476 : 17475;
        block6: while (true) {
            switch (n3) {
                case 17476: {
                    n3 = 17474;
                    continue block6;
                }
                case 17475: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1223.1LnFjj7I6gSdyKMs(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1223.1LnFjj7I6gSdyKMs(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1223.1LnFjj7I6gSdyKMs(k2, 1850084670) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 1LnFjj7I6gSdyKMs(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        T\u200e = "firstSeen";
        bb\u200e = "FurnacesColor";
        field4800 = Double.longBitsToDouble(4590214791715864112L);
    }
}

