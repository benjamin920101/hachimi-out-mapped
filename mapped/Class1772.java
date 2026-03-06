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
@HACHIMI_CLIENT(mv=100, d1={"\u6a06\u6a03\u6a09\u6a09\u6a07\u6a08\u6a03", "\u4045\u4044\u4040\u4042\u4046\u404a\u4043\u404a", "\u6d58\u6d53\u6d5f\u6d5f\u6d59\u6d59\u6d5c\u6d5d", "\u5237\u5234\u5237\u523b\u5234\u523a\u5231\u5237", "\u680c\u6805\u680d\u680c\u680f\u6805\u6804\u6804", "\u6715\u6710\u671e\u6712\u671f\u6711\u6713\u6717", "\ud3d6\ud3d7\ud3d5\ud3dc\ud3d0\ud3dc\ud3d4\ud3d4", "\u2dac\u2da1\u2dab\u2daa\u2dac\u2da0\u2dae\u2da0", "\ub3cd\ub3cc\ub3c0\ub3cb\ub3c0\ub3cd\ub3c9\ub3ca", "\ub73f\ub73f\ub734\ub73d\ub739\ub73a\ub73b\ub735", "\u958b\u9580\u958a\u958d\u9589\u958a\u958e\u958a", "\u0e90\u0e91\u0e93\u0e94\u0e92\u0e90\u0e94\u0e9d", "\u897e\u897e\u897c\u897d\u897a\u8975\u8979", "\ue82b\ue82c\ue821\ue82d\ue821\ue820\ue829\ue820", "\u2fae\u2fae\u2fae\u2fae\u2fab\u2fad\u2faa\u2fa2", "\u9ecf\u9ece\u9ec8\u9ecd\u9ec8\u9ece\u9ecc\u9ecd"}, d2={"\u02bf\u0284\u0298\u22d0\u02e2\u02e0\u02f6\u0292\u02b4\u02bf\u02a8\u02bf\u02f1\u02b2\u02bf\u02b0\u02b9\u02f1\u028d\u02aa\u02ac\u02b7\u02b0\u02b9\u02e5\u02f7\u0292\u02b4\u02bf\u02a8\u02bf\u02f1\u02b2\u02bf\u02b0\u02b9\u02f1\u028d\u02aa\u02ac\u02b7\u02b0\u02b9\u02e5", "\u00c9\u00f2\u00ef\u20a6\u0094\u0096\u0080\u00e4\u00c2\u00c9\u00de\u00c9\u0087\u00c4\u00c9\u00c6\u00cf\u0087\u00fb\u00dc\u00da\u00c1\u00c6\u00cf\u0093\u0081\u00e4\u00c2\u00c9\u00de\u00c9\u0087\u00c4\u00c9\u00c6\u00cf\u0087\u00fb\u00dc\u00da\u00c1\u00c6\u00cf\u0093", "\u02fc\u02a3\u02ac\u02a9\u02ae\u02a9\u02b4\u02fe\u02fc\u02fe\u02e8\u02e9\u0296", "\u07f4\u07a1\u07a6\u07a1\u07bc\u07f6\u07f4\u07f6\u07e0\u07e1\u079e", "\u04e3\u04e1\u04f0\u04c7\u04e8\u04e5\u04f7\u04f7\u04b8\u04ba\u04ac\u04ad\u04c8\u04ee\u04e5\u04f2\u04e5\u04ab\u04e8\u04e5\u04ea\u04e3\u04ab\u04c7\u04e8\u04e5\u04f7\u04f7\u04bf", "\u0548\u0541\u0553\u0548\u0563\u054f\u0544\u0545\u051c\u051e\u0508\u0509\u0569", "\u04ed\u04f9\u04fd\u04e9\u04e4\u04fb\u04b4\u04b6\u04a0\u04c4\u04e2\u04e9\u04fe\u04e9\u04a7\u04e4\u04e9\u04e6\u04ef\u04a7\u04c7\u04ea\u04e2\u04ed\u04eb\u04fc\u04b3\u04a1\u04d2", "\u058c\u0583\u0580\u0581\u058a\u05d3\u05d1\u05c7\u05c6\u05a3\u0585\u058e\u0599\u058e\u05c0\u0583\u058e\u0581\u0588\u05c0\u05a0\u058d\u0585\u058a\u058c\u059b\u05d4", "\u05b2\u05a9\u0595\u05b2\u05b4\u05af\u05a8\u05a1\u05fa\u05f8\u05ee\u05ef\u058a\u05ac\u05a7\u05b0\u05a7\u05e9\u05aa\u05a7\u05a8\u05a1\u05e9\u0595\u05b2\u05b4\u05af\u05a8\u05a1\u05fd", "\u042e\u042f\u0434\u0429\u0426\u0439\u047c\u047e\u0468\u0469\u0416", "\u0170\u0171\u016a\u0177\u0178\u0167\u015f\u0172\u0172\u0122\u0120\u0136\u0137\u0148", "\u02f2\u02e4\u02ec\u02f1\u02b9\u02bb\u02ad\u02ac\u02d3", "CU]@\b\n\u001c~\u001db", "\u06b1\u06a7\u06af\u06b2\u06f6\u06fa\u06f8\u06ee\u068c\u06ef\u0690", "\u0313\u0305\u030d\u0310\u0358\u035a\u034c\u032e\u032d\u034d\u0332", "\u05f1\u05fe\u05f9\u05f6\u05fb\u05fe\u05ed\u05f2\u05ab\u05a9\u05bf\u05be\u05c1"})
public final class Class1772 {
    public static float field6640;
    public static double field6641;
    public static float field6642;

    /*
     * WARNING - void declaration
     */
    private static CallSite 4vqITdBdqBwlB6(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1772.P19rGgH8aZXDvj6E(k2, -1866400487));
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
                int a2 = Integer.parseInt(Class1772.P19rGgH8aZXDvj6E(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1772.P19rGgH8aZXDvj6E(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1772.P19rGgH8aZXDvj6E(k2, -1866400487) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String P19rGgH8aZXDvj6E(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field6642 = Float.intBitsToFloat(1063335159);
        an\u200e = "VANILLA";
        field6640 = Float.intBitsToFloat(1101004800);
        bC\u200e = "Valid block blacklist";
        field6641 = Double.longBitsToDouble(4598195134026782054L);
    }
}

