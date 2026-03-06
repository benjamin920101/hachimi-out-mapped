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

@HACHIMI_CLIENT(mv=100, d1={"\uca65\uca61\uca61\uca60\uca65\uca64\uca65\uca61", "\ud26b\ud269\ud26c\ud269\ud268\ud262\ud26e\ud26c", "\u68ff\u68ff\u68f5\u68fd\u68f8\u68fb\u68fa\u68fd", "\u846d\u8460\u8468\u8469\u8461\u8461\u846d\u8460", "\u43f0\u43fc\u43fd\u43f4\u43f7\u43f0\u43f2\u43f2", "\uc1c2\uc1c9\uc1c3\uc1c5\uc1c1\uc1c6\uc1c9\uc1c2", "\u31e1\u31e7\u31e1\u31e1\u31e2\u31e2\u31e7\u31e7", "\ue394\ue393\ue390\ue395\ue397\ue393\ue392\ue394", "\u9002\u9001\u9002\u9002\u9002\u9004\u900f\u9006", "\u43c6\u43c5\u43c4\u43c7\u43c0\u43c5\u43c3\u43c5", "\u5f7f\u5f7f\u5f7d\u5f7d\u5f7d\u5f74\u5f7e\u5f7d", "\u865d\u865a\u865f\u865e\u8653\u8652\u8653\u8652", "\u7640\u7646\u7645\u7647\u7646\u7647\u7643\u764a", "\ub03b\ub030\ub031\ub03b\ub03a\ub03c\ub03f\ub03c"}, d2={"\u05f7\u05a8\u05a7\u05a2\u05a5\u05a2\u05bf\u05f5\u05f7\u05f5\u05e3\u05e2\u059d", "\u01e9\u01bc\u01bb\u01bc\u01a1\u01eb\u01e9\u01eb\u01fd\u01fc\u0183", "\u031a\u0318\u0309\u033e\u0311\u031c\u030e\u030e\u0341\u0343\u0355\u0354\u0331\u0317\u031c\u030b\u031c\u0352\u0311\u031c\u0313\u031a\u0352\u033e\u0311\u031c\u030e\u030e\u0346", "\u0630\u0639\u062b\u0630\u061b\u0637\u063c\u063d\u0664\u0666\u0670\u0671\u0611", "\u0318\u030c\u0308\u031c\u0311\u030e\u0341\u0343\u0355\u0331\u0317\u031c\u030b\u031c\u0352\u0311\u031c\u0313\u031a\u0352\u0332\u031f\u0317\u0318\u031e\u0309\u0346\u0354\u0327", "\u0141\u014e\u014d\u014c\u0147\u011e\u011c\u010a\u010b\u016e\u0148\u0143\u0154\u0143\u010d\u014e\u0143\u014c\u0145\u010d\u016d\u0140\u0148\u0147\u0141\u0156\u0119", "\u02a7\u02bc\u0280\u02a7\u02a1\u02ba\u02bd\u02b4\u02ef\u02ed\u02fb\u02fa\u029f\u02b9\u02b2\u02a5\u02b2\u02fc\u02bf\u02b2\u02bd\u02b4\u02fc\u0280\u02a7\u02a1\u02ba\u02bd\u02b4\u02e8", "\u0536\u0537\u052c\u0531\u053e\u0521\u0564\u0566\u0570\u0571\u050e", "-,7*%:\u0002//\u007f}kj\u0015", "\u02c4\u02d2\u02da\u02c7\u028f\u028d\u029b\u029a\u02e5", "\u0354\u0342\u034a\u0357\u031f\u031d\u030b\u0369\u030a\u0375", "\u054c\u055a\u0552\u054f\u050b\u0507\u0505\u0513\u0571\u0512\u056d", "\u0092\u0084\u008c\u0091\u00d9\u00db\u00cd\u00af\u00ac\u00cc\u00b3", "\u0774\u077b\u077c\u0773\u077e\u077b\u0768\u0777\u072e\u072c\u073a\u073b\u0744"})
public final class Class4760 {
    public static double field10040 = Double.longBitsToDouble(4592187878816928000L);
    public static int field10041 = 82152537;
    public static double field10042 = 0.4282286427085782;

    private static String S9gDBJNmlGgVJFV8(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite sEkidrJjVmrbxq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4760.S9gDBJNmlGgVJFV8(k2, -1311994621));
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
                int a2 = Integer.parseInt(Class4760.S9gDBJNmlGgVJFV8(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4760.S9gDBJNmlGgVJFV8(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4760.S9gDBJNmlGgVJFV8(k2, -1311994621) + " " + l2 + " " + m2);
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

