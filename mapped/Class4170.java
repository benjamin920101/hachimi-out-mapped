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

@HACHIMI_CLIENT(mv=100, d1={"\uba38\uba3e\uba3f\uba35\uba3e\uba3a\uba39\uba39", "\u994b\u994f\u9940\u994c\u9940\u9949\u994c\u994a", "\ud239\ud233\ud23e\ud232\ud23a\ud23f\ud23a\ud23e", "\u820d\u820d\u820f\u8209\u8201\u8209\u820b\u8209", "\u9f02\u9f00\u9f08\u9f02\u9f06\u9f01\u9f04\u9f05", "\u85cc\u85cc\u85ca\u85c6\u85c9\u85cc\u85c7\u85cf", "\u34ce\u34ca\u34c8\u34c6\u34c9\u34ce\u34c8\u34cd", "\u9791\u9791\u9790\u9796\u9792\u979c\u9797\u9794", "\u5e9e\u5e9d\u5e9e\u5e93\u5e9b\u5e9b\u5e9c\u5e99", "\ua264\ua26f\ua267\ua26e\ua26f\ua263\ua26f\ua265", "\u1536\u1534\u1535\u1537\u1535\u1534\u1530\u1531", "\u9037\u9038\u9035\u9033\u9031\u9036\u9036\u9031", "\u913c\u913f\u913d\u9138\u9132\u913f\u913a\u913b", "\u4a27\u4a27\u4a24\u4a26\u4a27\u4a20\u4a22\u4a22", "\u5d1e\u5d1f\u5d1a\u5d1f\u5d1d\u5d1b\u5d19\u5d1b"}, d2={"\u05e2\u05c4\u05fa\u2583\u05b1\u05b3\u05a5\u05c1\u05e7\u05ec\u05fb\u05ec\u05a2\u05e1\u05ec\u05e3\u05ea\u05a2\u05de\u05f9\u05ff\u05e4\u05e3\u05ea\u05b6\u05a4\u05c1\u05e7\u05ec\u05fb\u05ec\u05a2\u05e1\u05ec\u05e3\u05ea\u05a2\u05de\u05f9\u05ff\u05e4\u05e3\u05ea\u05b6", "\u0224\u027b\u0274\u0271\u0276\u0271\u026c\u0226\u0224\u0226\u0230\u0231\u024e", "\u06c7\u0692\u0695\u0692\u068f\u06c5\u06c7\u06c5\u06d3\u06d2\u06ad", "\u0005\u0007\u0016!\u000e\u0003\u0011\u0011^\\JK.\b\u0003\u0014\u0003M\u000e\u0003\f\u0005M!\u000e\u0003\u0011\u0011Y", "\u06ee\u06e7\u06f5\u06ee\u06c5\u06e9\u06e2\u06e3\u06ba\u06b8\u06ae\u06af\u06cf", "\u056e\u057a\u057e\u056a\u0567\u0578\u0537\u0535\u0523\u0547\u0561\u056a\u057d\u056a\u0524\u0567\u056a\u0565\u056c\u0524\u0544\u0569\u0561\u056e\u0568\u057f\u0530\u0522\u0551", "\u039c\u0393\u0390\u0391\u039a\u03c3\u03c1\u03d7\u03d6\u03b3\u0395\u039e\u0389\u039e\u03d0\u0393\u039e\u0391\u0398\u03d0\u03b0\u039d\u0395\u039a\u039c\u038b\u03c4", "\u05f1\u05ea\u05d6\u05f1\u05f7\u05ec\u05eb\u05e2\u05b9\u05bb\u05ad\u05ac\u05c9\u05ef\u05e4\u05f3\u05e4\u05aa\u05e9\u05e4\u05eb\u05e2\u05aa\u05d6\u05f1\u05f7\u05ec\u05eb\u05e2\u05be", "\u07f2\u07f3\u07e8\u07f5\u07fa\u07e5\u07a0\u07a2\u07b4\u07b5\u07ca", "\u054c\u054d\u0556\u054b\u0544\u055b\u0563\u054e\u054e\u051e\u051c\u050a\u050b\u0574", "OYQL\u0004\u0006\u0010\u0011n", "\u0640\u0656\u065e\u0643\u060b\u0609\u061f\u067d\u061e\u0661", "\u0313\u0305\u030d\u0310\u0354\u0358\u035a\u034c\u032e\u034d\u0332", "\u0419\u040f\u0407\u041a\u0452\u0450\u0446\u0424\u0427\u0447\u0438", "\u05de\u05d1\u05d6\u05d9\u05d4\u05d1\u05c2\u05dd\u0584\u0586\u0590\u0591\u05ee"})
public final class Class4170 {
    public static double field9714 = Double.longBitsToDouble(4604125372222411176L);
    public static double field9715;
    public static double field9716;

    static {
        R\u200e = "Interact block reach";
        field9716 = Double.longBitsToDouble(4605253001941173830L);
        field9715 = Double.longBitsToDouble(4603061223672947075L);
    }

    private static String c2Xgwg2lAFAg5V9i(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite rkFGBYTvzzi820(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4170.c2Xgwg2lAFAg5V9i(k2, 51487421));
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
                int a2 = Integer.parseInt(Class4170.c2Xgwg2lAFAg5V9i(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4170.c2Xgwg2lAFAg5V9i(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4170.c2Xgwg2lAFAg5V9i(k2, 51487421) + " " + l2 + " " + m2);
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

