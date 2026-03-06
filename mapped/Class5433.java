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
@HACHIMI_CLIENT(mv=100, d1={"\u61c5\u61ca\u61ca\u61c4\u61c7\u61cb\u61ca", "\ue1c0\ue1c1\ue1c6\ue1c2\ue1c6\ue1cd\ue1c7\ue1cc", "\ucb45\ucb40\ucb40\ucb45\ucb42\ucb42\ucb44\ucb47", "\ub07c\ub07d\ub07f\ub07d\ub071\ub078\ub07f", "\u51a4\u51a0\u51a5\u51a0\u51a9\u51a4\u51a6\u51a3", "\u0ab6\u0ab6\u0abb\u0ab3\u0ab4\u0ab5\u0ab3\u0ab3", "\u166d\u166e\u1668\u166c\u1660\u1660\u166d\u166f", "\ue288\ue28c\ue28d\ue284\ue285\ue28e\ue284\ue289", "\u6617\u6615\u6612\u6610\u6610\u6613\u661b\u6617", "\ua086\ua085\ua08e\ua081\ua082\ua087\ua086\ua085", "\u2db6\u2db1\u2db3\u2db2\u2db6\u2dbd\u2db7\u2db2", "\ub0bf\ub0bb\ub0b4\ub0bb\ub0b9\ub0b4\ub0bb\ub0bc", "\uba46\uba4d\uba43\uba42\uba42\uba42\uba43\uba41", "\ua5c6\ua5c4\ua5cd\ua5c0\ua5c2\ua5cd\ua5cd\ua5c5", "\u1cbe\u1cbf\u1cbc\u1cbb\u1cb5\u1cbd\u1cb5\u1cb4"}, d2={"\u03a0\u03b2\u0381\u23c6\u03f4\u03f6\u03e0\u0384\u03a2\u03a9\u03be\u03a9\u03e7\u03a4\u03a9\u03a6\u03af\u03e7\u039b\u03bc\u03ba\u03a1\u03a6\u03af\u03f3\u03e1\u0384\u03a2\u03a9\u03be\u03a9\u03e7\u03a4\u03a9\u03a6\u03af\u03e7\u039b\u03bc\u03ba\u03a1\u03a6\u03af\u03f3", "\u01fb\u01a4\u01ab\u01ae\u01a9\u01ae\u01b3\u01f9\u01fb\u01f9\u01ef\u01ee\u0191", "\u050c\u0559\u055e\u0559\u0544\u050e\u050c\u050e\u0518\u0519\u0566", "\u0505\u0507\u0516\u0521\u050e\u0503\u0511\u0511\u055e\u055c\u054a\u054b\u052e\u0508\u0503\u0514\u0503\u054d\u050e\u0503\u050c\u0505\u054d\u0521\u050e\u0503\u0511\u0511\u0559", "\u04a1\u04a8\u04ba\u04a1\u048a\u04a6\u04ad\u04ac\u04f5\u04f7\u04e1\u04e0\u0480", "\u04f2\u04e6\u04e2\u04f6\u04fb\u04e4\u04ab\u04a9\u04bf\u04db\u04fd\u04f6\u04e1\u04f6\u04b8\u04fb\u04f6\u04f9\u04f0\u04b8\u04d8\u04f5\u04fd\u04f2\u04f4\u04e3\u04ac\u04be\u04cd", "\u0777\u0778\u077b\u077a\u0771\u0728\u072a\u073c\u073d\u0758\u077e\u0775\u0762\u0775\u073b\u0778\u0775\u077a\u0773\u073b\u075b\u0776\u077e\u0771\u0777\u0760\u072f", "\u0399\u0382\u03be\u0399\u039f\u0384\u0383\u038a\u03d1\u03d3\u03c5\u03c4\u03a1\u0387\u038c\u039b\u038c\u03c2\u0381\u038c\u0383\u038a\u03c2\u03be\u0399\u039f\u0384\u0383\u038a\u03d6", "\u07b5\u07b4\u07af\u07b2\u07bd\u07a2\u07e7\u07e5\u07f3\u07f2\u078d", "\u02db\u02da\u02c1\u02dc\u02d3\u02cc\u02f4\u02d9\u02d9\u0289\u028b\u029d\u029c\u02e3", "\u00bf\u00a9\u00a1\u00bc\u00f4\u00f6\u00e0\u00e1\u009e", "\u0374\u0362\u036a\u0377\u033f\u033d\u032b\u0349\u032a\u0355", "\u0335\u0323\u032b\u0336\u0372\u037e\u037c\u036a\u0308\u036b\u0314", "\u030e\u0318\u0310\u030d\u0345\u0347\u0351\u0333\u0330\u0350\u032f", "\u0139\u0136\u0131\u013e\u0133\u0136\u0125\u013a\u0163\u0161\u0177\u0176\u0109"})
public final class Class5433 {
    public static float field10127 = 0.71956724f;
    public static double field10128 = 0.7355359371913955;
    public static double field10129;
    public static int field10130 = 928896556;
    public static float field10131;
    public static float field10132;
    public static double field10133;
    public static float field10134;
    public static float field10135 = 0.18496013f;

    static {
        field10132 = Float.intBitsToFloat(1058294281);
        az\u200e = "Queue";
        field10131 = Float.intBitsToFloat(1057257208);
        field10129 = Double.longBitsToDouble(4597886468476539224L);
        field10134 = Float.intBitsToFloat(1060911164);
        field10133 = Double.longBitsToDouble(4601768307440192156L);
    }

    private static String 3BZ2YLGl7ALoJ0yY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite r7i6jveGZlF4L2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5433.3BZ2YLGl7ALoJ0yY(k2, -2122304286));
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
                int a2 = Integer.parseInt(Class5433.3BZ2YLGl7ALoJ0yY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5433.3BZ2YLGl7ALoJ0yY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5433.3BZ2YLGl7ALoJ0yY(k2, -2122304286) + " " + l2 + " " + m2);
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

