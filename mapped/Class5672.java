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
@HACHIMI_CLIENT(mv=100, d1={"\u849a\u849b\u8498\u849a\u849a\u8491\u849e\u849a", "\u1f67\u1f6f\u1f62\u1f64\u1f65\u1f60\u1f66\u1f62", "\u8ebe\u8ebf\u8ebd\u8eb7\u8ebf\u8ebd\u8eb6\u8eb6", "\ubf83\ubf86\ubf84\ubf89\ubf87\ubf89\ubf85\ubf86", "\u6776\u6770\u6777\u6777\u6774\u6775\u6777\u6772", "\u59f5\u59f5\u59f4\u59f7\u59f1\u59fa\u59fa", "\u6159\u6156\u6157\u6157\u615a\u615c\u615f\u615b", "\ubc17\ubc19\ubc19\ubc12\ubc17\ubc15\ubc18\ubc17", "\u5fea\u5fed\u5fe6\u5feb\u5fe6\u5fea\u5fe7\u5fea", "\u439a\u4398\u439b\u4399\u4399\u439b\u4394\u439f", "\u94e1\u94e2\u94e1\u94e1\u94e3\u94e2\u94ed\u94e7", "\u6938\u6934\u6938\u693f\u6939\u693e\u693e\u693b", "\u1790\u1797\u1790\u1794\u1793\u1797\u1797\u1793", "\u317c\u3179\u317d\u317a\u3177\u317c\u3176\u317b", "\u499a\u4994\u499b\u4998\u499b\u499a\u499f\u4994"}, d2={"\u059c\u05a2\u05be\u25ff\u05cd\u05cf\u05d9\u05bd\u059b\u0590\u0587\u0590\u05de\u059d\u0590\u059f\u0596\u05de\u05a2\u0585\u0583\u0598\u059f\u0596\u05ca\u05d8\u05bd\u059b\u0590\u0587\u0590\u05de\u059d\u0590\u059f\u0596\u05de\u05a2\u0585\u0583\u0598\u059f\u0596\u05ca", "\u00b7\u00e8\u00e7\u00e2\u00e5\u00e2\u00ff\u00b5\u00b7\u00b5\u00a3\u00a2\u00dd", "\u047c\u0429\u042e\u0429\u0434\u047e\u047c\u047e\u0468\u0469\u0416", "\u07d2\u07d0\u07c1\u07f6\u07d9\u07d4\u07c6\u07c6\u0789\u078b\u079d\u079c\u07f9\u07df\u07d4\u07c3\u07d4\u079a\u07d9\u07d4\u07db\u07d2\u079a\u07f6\u07d9\u07d4\u07c6\u07c6\u078e", "\u0303\u030a\u0318\u0303\u0328\u0304\u030f\u030e\u0357\u0355\u0343\u0342\u0322", "\u057c\u0568\u056c\u0578\u0575\u056a\u0525\u0527\u0531\u0555\u0573\u0578\u056f\u0578\u0536\u0575\u0578\u0577\u057e\u0536\u0556\u057b\u0573\u057c\u057a\u056d\u0522\u0530\u0543", "\u05d5\u05da\u05d9\u05d8\u05d3\u058a\u0588\u059e\u059f\u05fa\u05dc\u05d7\u05c0\u05d7\u0599\u05da\u05d7\u05d8\u05d1\u0599\u05f9\u05d4\u05dc\u05d3\u05d5\u05c2\u058d", "\u0325\u033e\u0302\u0325\u0323\u0338\u033f\u0336\u036d\u036f\u0379\u0378\u031d\u033b\u0330\u0327\u0330\u037e\u033d\u0330\u033f\u0336\u037e\u0302\u0325\u0323\u0338\u033f\u0336\u036a", "\u0154\u0155\u014e\u0153\u015c\u0143\u0106\u0104\u0112\u0113\u016c", "\u047e\u047f\u0464\u0479\u0476\u0469\u0451\u047c\u047c\u042c\u042e\u0438\u0439\u0446", "\u05f7\u05e1\u05e9\u05f4\u05bc\u05be\u05a8\u05a9\u05d6", "\u022f\u0239\u0231\u022c\u0264\u0266\u0270\u0212\u0271\u020e", "\u04df\u04c9\u04c1\u04dc\u0498\u0494\u0496\u0480\u04e2\u0481\u04fe", "\u02fd\u02eb\u02e3\u02fe\u02b6\u02b4\u02a2\u02c0\u02c3\u02a3\u02dc", "\u0514\u051b\u051c\u0513\u051e\u051b\u0508\u0517\u054e\u054c\u055a\u055b\u0524"})
public final class Class5672 {
    public static float field10880;
    public static double field10881;
    public static double field10882;
    public static double field10883;

    /*
     * WARNING - void declaration
     */
    private static CallSite 7NDI86s4oMxVZo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5672.HSWQo3J3zNCoIvnr(k2, -1563496305));
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
                int a2 = Integer.parseInt(Class5672.HSWQo3J3zNCoIvnr(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5672.HSWQo3J3zNCoIvnr(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5672.HSWQo3J3zNCoIvnr(k2, -1563496305) + " " + l2 + " " + m2);
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
        field10883 = Double.longBitsToDouble(4602685925752142734L);
        field10880 = Float.intBitsToFloat(0x3F666666);
        field10882 = Double.longBitsToDouble(4599216702003344862L);
        field10881 = Double.longBitsToDouble(4594138179202185476L);
        bE\u200e = "Prioritizes existing elytras in the chestplate armor slot";
    }

    private static String HSWQo3J3zNCoIvnr(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

