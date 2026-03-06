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
@HACHIMI_CLIENT(mv=100, d1={"\ub999\ub994\ub99a\ub99a\ub99a\ub99b\ub99f\ub995", "\ua5f1\ua5f4\ua5f2\ua5f6\ua5f7\ua5f6\ua5f6\ua5f2", "\uc593\uc59e\uc594\uc59f\uc591\uc595\uc592\uc592", "\uc37d\uc37b\uc373\uc37e\uc37c\uc37d\uc372\uc379", "\u1db0\u1dbc\u1db2\u1db1\u1db6\u1db7\u1db7\u1dbd", "\u041f\u0418\u0418\u0416\u0418\u0418\u0418", "\u9284\u9286\u9283\u9286\u9280\u9289\u9282\u9281", "\u9995\u9993\u9997\u9995\u9999\u9997\u9994\u9992", "\u1887\u1886\u188c\u1886\u1887\u1887\u188a", "\u7de3\u7de9\u7de1\u7de6\u7de1\u7de1\u7de5\u7de7", "\u3b77\u3b71\u3b7d\u3b70\u3b75\u3b71\u3b71\u3b77", "\uceba\ucebc\uceb9\ucebe\ucebb\uceba\uceb1\uceb0", "\u7ee1\u7ee3\u7ee0\u7ee0\u7ee7\u7eee\u7ee4\u7ee7", "\u5fb7\u5fbf\u5fb0\u5fb1\u5fbe\u5fb4\u5fb0\u5fb2", "\u01a1\u01a8\u01a4\u01a0\u01a3\u01a5\u01a1\u01a3"}, d2={"\u040e\u0429\u0424\u246f\u045d\u045f\u0449\u042d\u040b\u0400\u0417\u0400\u044e\u040d\u0400\u040f\u0406\u044e\u0432\u0415\u0413\u0408\u040f\u0406\u045a\u0448\u042d\u040b\u0400\u0417\u0400\u044e\u040d\u0400\u040f\u0406\u044e\u0432\u0415\u0413\u0408\u040f\u0406\u045a", "\u0537\u0568\u0567\u0562\u0565\u0562\u057f\u0535\u0537\u0535\u0523\u0522\u055d", "\u07c5\u0790\u0797\u0790\u078d\u07c7\u07c5\u07c7\u07d1\u07d0\u07af", "\u03cb\u03c9\u03d8\u03ef\u03c0\u03cd\u03df\u03df\u0390\u0392\u0384\u0385\u03e0\u03c6\u03cd\u03da\u03cd\u0383\u03c0\u03cd\u03c2\u03cb\u0383\u03ef\u03c0\u03cd\u03df\u03df\u0397", "\u02ad\u02a4\u02b6\u02ad\u0286\u02aa\u02a1\u02a0\u02f9\u02fb\u02ed\u02ec\u028c", "\u03d0\u03c4\u03c0\u03d4\u03d9\u03c6\u0389\u038b\u039d\u03f9\u03df\u03d4\u03c3\u03d4\u039a\u03d9\u03d4\u03db\u03d2\u039a\u03fa\u03d7\u03df\u03d0\u03d6\u03c1\u038e\u039c\u03ef", "\u05fe\u05f1\u05f2\u05f3\u05f8\u05a1\u05a3\u05b5\u05b4\u05d1\u05f7\u05fc\u05eb\u05fc\u05b2\u05f1\u05fc\u05f3\u05fa\u05b2\u05d2\u05ff\u05f7\u05f8\u05fe\u05e9\u05a6", "\u01d4\u01cf\u01f3\u01d4\u01d2\u01c9\u01ce\u01c7\u019c\u019e\u0188\u0189\u01ec\u01ca\u01c1\u01d6\u01c1\u018f\u01cc\u01c1\u01ce\u01c7\u018f\u01f3\u01d4\u01d2\u01c9\u01ce\u01c7\u019b", "\u0013\u0012\t\u0014\u001b\u0004ACUT+", "\u05e4\u05e5\u05fe\u05e3\u05ec\u05f3\u05cb\u05e6\u05e6\u05b6\u05b4\u05a2\u05a3\u05dc", "\u040c\u041a\u0412\u040f\u0447\u0445\u0453\u0452\u042d", "\u0489\u049f\u0497\u048a\u04c2\u04c0\u04d6\u04b4\u04d7\u04a8", "\u00c7\u00d1\u00d9\u00c4\u0080\u008c\u008e\u0098\u00fa\u0099\u00e6", "\u07e8\u07fe\u07f6\u07eb\u07a3\u07a1\u07b7\u07d5\u07d6\u07b6\u07c9", "\u079e\u0791\u0796\u0799\u0794\u0791\u0782\u079d\u07c4\u07c6\u07d0\u07d1\u07ae"})
public final class Class3847 {
    public static float field8717;

    static {
        a\u200e = "Factor";
        field8717 = Float.intBitsToFloat(1049279114);
    }

    private static String rNBLqQ2W4d3tPIua(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 2WrKLAOEyIbnVD(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3847.rNBLqQ2W4d3tPIua(k2, 1873427248));
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
                int a2 = Integer.parseInt(Class3847.rNBLqQ2W4d3tPIua(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3847.rNBLqQ2W4d3tPIua(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3847.rNBLqQ2W4d3tPIua(k2, 1873427248) + " " + l2 + " " + m2);
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

