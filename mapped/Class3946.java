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
@HACHIMI_CLIENT(mv=100, d1={"\u6298\u6291\u6298\u629a\u6299\u629c\u6291\u629c", "\u27a2\u27ac\u27a6\u27a2\u27a6\u27a0\u27a1\u27a0", "\u8f7e\u8f7e\u8f7b\u8f74\u8f7b\u8f78\u8f79\u8f74", "\u000e\u000b\u000e\r\b\u0002\u000e\t", "\ucf82\ucf85\ucf87\ucf87\ucf84\ucf8e\ucf8e\ucf83", "\u0a5b\u0a5c\u0a58\u0a5a\u0a58\u0a5b\u0a5d\u0a5a", "\ucba4\ucbae\ucbaa\ucbaf\ucbaa\ucba9", "\u316a\u316f\u3160\u3160\u316d\u316b\u3168\u3160", "\ue71f\ue71b\ue71c\ue718\ue71d\ue71d\ue71a\ue71b", "\u23da\u23d6\u23d7\u23d8\u23db\u23de\u23db\u23dc", "\u1fac\u1fae\u1fa1\u1fac\u1fa8\u1fa8\u1fa1", "\ue6ef\ue6ea\ue6ee\ue6e4\ue6ec\ue6eb\ue6eb", "\ud9f3\ud9f3\ud9f5\ud9f1\ud9f1\ud9fc\ud9f5\ud9f0", "\u8d88\u8d89\u8d8b\u8d8b\u8d8a\u8d8c\u8d8a\u8d8c"}, d2={"\u02aa\u02f5\u02fa\u02ff\u02f8\u02ff\u02e2\u02a8\u02aa\u02a8\u02be\u02bf\u02c0", "\u07d6\u0783\u0784\u0783\u079e\u07d4\u07d6\u07d4\u07c2\u07c3\u07bc", "\u0294\u0296\u0287\u02b0\u029f\u0292\u0280\u0280\u02cf\u02cd\u02db\u02da\u02bf\u0299\u0292\u0285\u0292\u02dc\u029f\u0292\u029d\u0294\u02dc\u02b0\u029f\u0292\u0280\u0280\u02c8", "\u068b\u0682\u0690\u068b\u06a0\u068c\u0687\u0686\u06df\u06dd\u06cb\u06ca\u06aa", "\u0002\u0016\u0012\u0006\u000b\u0014[YO+\r\u0006\u0011\u0006H\u000b\u0006\t\u0000H(\u0005\r\u0002\u0004\u0013\\N=", "\u03c0\u03cf\u03cc\u03cd\u03c6\u039f\u039d\u038b\u038a\u03ef\u03c9\u03c2\u03d5\u03c2\u038c\u03cf\u03c2\u03cd\u03c4\u038c\u03ec\u03c1\u03c9\u03c6\u03c0\u03d7\u0398", "\u055e\u0545\u0579\u055e\u0558\u0543\u0544\u054d\u0516\u0514\u0502\u0503\u0566\u0540\u054b\u055c\u054b\u0505\u0546\u054b\u0544\u054d\u0505\u0579\u055e\u0558\u0543\u0544\u054d\u0511", "\u06b4\u06b5\u06ae\u06b3\u06bc\u06a3\u06e6\u06e4\u06f2\u06f3\u068c", "\u0647\u0646\u065d\u0640\u064f\u0650\u0668\u0645\u0645\u0615\u0617\u0601\u0600\u067f", "\u0714\u0702\u070a\u0717\u075f\u075d\u074b\u074a\u0735", "\u0439\u042f\u0427\u043a\u0472\u0470\u0466\u0404\u0467\u0418", "\u01d1\u01c7\u01cf\u01d2\u0196\u019a\u0198\u018e\u01ec\u018f\u01f0", "\u04c5\u04d3\u04db\u04c6\u048e\u048c\u049a\u04f8\u04fb\u049b\u04e4", "\u0734\u073b\u073c\u0733\u073e\u073b\u0728\u0737\u076e\u076c\u077a\u077b\u0704"})
public final class Class3946 {
    public static int field8980 = 765859537;
    public static float field8981;
    public static double field8982;

    /*
     * WARNING - void declaration
     */
    private static CallSite 5gYSQWsdnJ4TNR(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3946.mhGJB21HSYR7wT9n(k2, -21119215));
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
                int a2 = Integer.parseInt(Class3946.mhGJB21HSYR7wT9n(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3946.mhGJB21HSYR7wT9n(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3946.mhGJB21HSYR7wT9n(k2, -21119215) + " " + l2 + " " + m2);
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
        field8982 = Double.longBitsToDouble(4605048480652577367L);
        field8981 = Float.intBitsToFloat(1057907736);
    }

    private static String mhGJB21HSYR7wT9n(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

