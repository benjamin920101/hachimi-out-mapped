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

@HACHIMI_CLIENT(mv=100, d1={"\u85a0\u85a4\u85af\u85ae\u85a3\u85af\u85a2\u85a1", "\u2d00\u2d03\u2d0c\u2d01\u2d0d\u2d05\u2d03\u2d00", "\u7246\u724c\u724c\u7241\u7240\u724c\u724c\u724c", "\u314f\u314a\u314b\u314f\u3143\u314c\u314c\u314a", "\u5af2\u5afe\u5afe\u5af9\u5af8\u5afd\u5af8", "\u632d\u632c\u6320\u632d\u632c\u6324\u6320", "\u2d3b\u2d38\u2d39\u2d3a\u2d3c\u2d38\u2d3c\u2d39", "\u1165\u1163\u1164\u1166\u1161\u1166\u1164\u1166", "\ua980\ua980\ua988\ua984\ua985\ua989\ua985\ua980", "\u98b5\u98b2\u98ba\u98b4\u98bb\u98b0\u98b1\u98b0", "\u11f7\u11f4\u11f2\u11f6\u11f5\u11f4\u11fa\u11f1", "\ua4a2\ua4a2\ua4a0\ua4a7\ua4a9\ua4a9", "\uc195\uc194\uc19f\uc190\uc195\uc194\uc190\uc192", "\u9bbb\u9bbf\u9bbd\u9bb8\u9bb9\u9bb9\u9bbe\u9bb1", "\u5956\u5955\u5952\u5953\u5951\u5951\u5957\u5957"}, d2={"\u049d\u049e\u049e\u24e6\u04d4\u04d6\u04c0\u04a4\u0482\u0489\u049e\u0489\u04c7\u0484\u0489\u0486\u048f\u04c7\u04bb\u049c\u049a\u0481\u0486\u048f\u04d3\u04c1\u04a4\u0482\u0489\u049e\u0489\u04c7\u0484\u0489\u0486\u048f\u04c7\u04bb\u049c\u049a\u0481\u0486\u048f\u04d3", "\u03cf\u0390\u039f\u039a\u039d\u039a\u0387\u03cd\u03cf\u03cd\u03db\u03da\u03a5", "\u06f9\u06ac\u06ab\u06ac\u06b1\u06fb\u06f9\u06fb\u06ed\u06ec\u0693", "\u043a\u0438\u0429\u041e\u0431\u043c\u042e\u042e\u0461\u0463\u0475\u0474\u0411\u0437\u043c\u042b\u043c\u0472\u0431\u043c\u0433\u043a\u0472\u041e\u0431\u043c\u042e\u042e\u0466", "\u01f5\u01fc\u01ee\u01f5\u01de\u01f2\u01f9\u01f8\u01a1\u01a3\u01b5\u01b4\u01d4", "\u0002\u0016\u0012\u0006\u000b\u0014[YO+\r\u0006\u0011\u0006H\u000b\u0006\t\u0000H(\u0005\r\u0002\u0004\u0013\\N=", "\u04f6\u04f9\u04fa\u04fb\u04f0\u04a9\u04ab\u04bd\u04bc\u04d9\u04ff\u04f4\u04e3\u04f4\u04ba\u04f9\u04f4\u04fb\u04f2\u04ba\u04da\u04f7\u04ff\u04f0\u04f6\u04e1\u04ae", "\u05bd\u05a6\u059a\u05bd\u05bb\u05a0\u05a7\u05ae\u05f5\u05f7\u05e1\u05e0\u0585\u05a3\u05a8\u05bf\u05a8\u05e6\u05a5\u05a8\u05a7\u05ae\u05e6\u059a\u05bd\u05bb\u05a0\u05a7\u05ae\u05f2", "\u05a2\u05a3\u05b8\u05a5\u05aa\u05b5\u05f0\u05f2\u05e4\u05e5\u059a", "\u0525\u0524\u053f\u0522\u052d\u0532\u050a\u0527\u0527\u0577\u0575\u0563\u0562\u051d", "\u0341\u0357\u035f\u0342\u030a\u0308\u031e\u031f\u0360", "\u019e\u0188\u0180\u019d\u01d5\u01d7\u01c1\u01a3\u01c0\u01bf", "\u0503\u0515\u051d\u0500\u0544\u0548\u054a\u055c\u053e\u055d\u0522", "\u06c5\u06d3\u06db\u06c6\u068e\u068c\u069a\u06f8\u06fb\u069b\u06e4", "\u0403\u040c\u040b\u0404\u0409\u040c\u041f\u0400\u0459\u045b\u044d\u044c\u0433"})
public final class Class4130 {
    public static int field9590 = -656312386;
    public static int field9591 = 1785634109;
    public static double field9592;

    /*
     * WARNING - void declaration
     */
    private static CallSite vRyQhxbJwSeXon(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4130.jtFPYHl4nFtqNrBY(k2, -1421696635));
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
                int a2 = Integer.parseInt(Class4130.jtFPYHl4nFtqNrBY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4130.jtFPYHl4nFtqNrBY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4130.jtFPYHl4nFtqNrBY(k2, -1421696635) + " " + l2 + " " + m2);
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
        aj\u200e = "Range";
        field9592 = Double.longBitsToDouble(4603458981582626740L);
    }

    private static String jtFPYHl4nFtqNrBY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

