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

@HACHIMI_CLIENT(mv=100, d1={"\ud299\ud29d\ud29f\ud297\ud296\ud296\ud296", "\u4094\u409b\u409a\u4096\u4095\u4093\u4097", "\u4f70\u4f70\u4f77\u4f71\u4f70\u4f7a\u4f71\u4f74", "\u4e5e\u4e54\u4e5d\u4e55\u4e5e\u4e59\u4e59", "\u1e7e\u1e79\u1e7d\u1e70\u1e71\u1e7e\u1e71\u1e78", "\u42c6\u42c3\u42c6\u42c2\u42cb\u42c0\u42c7\u42c1", "\ub5c8\ub5cf\ub5cd\ub5c1\ub5cd\ub5ca\ub5c8\ub5ce", "\u4e74\u4e72\u4e76\u4e74\u4e77\u4e73\u4e76\u4e7f", "\ub24b\ub246\ub24a\ub24f\ub24f\ub24b\ub24b\ub24a", "\u0546\u0541\u0549\u0549\u0547\u0546\u0547", "\ua3ce\ua3ce\ua3cf\ua3c9\ua3cf\ua3cf\ua3cd\ua3c7", "\u368b\u368c\u3689\u3689\u3686\u368d\u3686\u3689", "\u572f\u572f\u572d\u572c\u572d\u572c\u572f\u572a", "\u4d12\u4d11\u4d15\u4d17\u4d16\u4d1b\u4d10\u4d12", "\u291a\u291c\u291e\u291e\u291e\u291a\u291a\u291b"}, d2={"\u03c9\u03fe\u03d4\u23a2\u0390\u0392\u0384\u03e0\u03c6\u03cd\u03da\u03cd\u0383\u03c0\u03cd\u03c2\u03cb\u0383\u03ff\u03d8\u03de\u03c5\u03c2\u03cb\u0397\u0385\u03e0\u03c6\u03cd\u03da\u03cd\u0383\u03c0\u03cd\u03c2\u03cb\u0383\u03ff\u03d8\u03de\u03c5\u03c2\u03cb\u0397", "\u06ef\u06b0\u06bf\u06ba\u06bd\u06ba\u06a7\u06ed\u06ef\u06ed\u06fb\u06fa\u0685", "\u077f\u072a\u072d\u072a\u0737\u077d\u077f\u077d\u076b\u076a\u0715", "\u0755\u0757\u0746\u0771\u075e\u0753\u0741\u0741\u070e\u070c\u071a\u071b\u077e\u0758\u0753\u0744\u0753\u071d\u075e\u0753\u075c\u0755\u071d\u0771\u075e\u0753\u0741\u0741\u0709", "\u033a\u0333\u0321\u033a\u0311\u033d\u0336\u0337\u036e\u036c\u037a\u037b\u031b", "\u06e9\u06fd\u06f9\u06ed\u06e0\u06ff\u06b0\u06b2\u06a4\u06c0\u06e6\u06ed\u06fa\u06ed\u06a3\u06e0\u06ed\u06e2\u06eb\u06a3\u06c3\u06ee\u06e6\u06e9\u06ef\u06f8\u06b7\u06a5\u06d6", "/ #\")prde\u0000&-:-c -\"+c\u0003.&)/8w", "\u015c\u0147\u017b\u015c\u015a\u0141\u0146\u014f\u0114\u0116\u0100\u0101\u0164\u0142\u0149\u015e\u0149\u0107\u0144\u0149\u0146\u014f\u0107\u017b\u015c\u015a\u0141\u0146\u014f\u0113", "\u02c0\u02c1\u02da\u02c7\u02c8\u02d7\u0292\u0290\u0286\u0287\u02f8", "\u01e4\u01e5\u01fe\u01e3\u01ec\u01f3\u01cb\u01e6\u01e6\u01b6\u01b4\u01a2\u01a3\u01dc", "\u07b0\u07a6\u07ae\u07b3\u07fb\u07f9\u07ef\u07ee\u0791", "\u01a9\u01bf\u01b7\u01aa\u01e2\u01e0\u01f6\u0194\u01f7\u0188", "\u0598\u058e\u0586\u059b\u05df\u05d3\u05d1\u05c7\u05a5\u05c6\u05b9", "\u05c8\u05de\u05d6\u05cb\u0583\u0581\u0597\u05f5\u05f6\u0596\u05e9", "\u0507\u0508\u050f\u0500\u050d\u0508\u051b\u0504\u055d\u055f\u0549\u0548\u0537"})
public final class Class4005 {
    public static float field9190 = Float.intBitsToFloat(1054300838);
    public static long field9191 = 0xFFFFFFFFL;
    public static float field9192 = Float.intBitsToFloat(1054660566);
    public static double field9193;

    private static String ndukX8hl97Awg1vi(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite kyAwgmtEovQh2J(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4005.ndukX8hl97Awg1vi(k2, 617729010));
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
                int a2 = Integer.parseInt(Class4005.ndukX8hl97Awg1vi(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4005.ndukX8hl97Awg1vi(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4005.ndukX8hl97Awg1vi(k2, 617729010) + " " + l2 + " " + m2);
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
        aQ\u200e = "Peek the shulkerbox when you middle click";
        field9193 = Double.longBitsToDouble(4605855024862962439L);
    }
}

