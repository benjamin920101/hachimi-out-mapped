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

@HACHIMI_CLIENT(mv=100, d1={"\u51db\u51dc\u51d9\u51d7\u51d9\u51dc\u51d9", "\u6364\u6361\u6361\u6367\u636f\u6362\u6365\u6363", "\ue4dc\ue4da\ue4dc\ue4d7\ue4d6\ue4dd\ue4de\ue4db", "\u011e\u011a\u0118\u011f\u011c\u011f\u011c\u011c", "\ua397\ua39e\ua395\ua394\ua393\ua39e\ua39f\ua395", "\ud91c\ud91d\ud91f\ud916\ud919\ud918\ud91a", "\u5ddb\u5dd0\u5dda\u5ddb\u5ddf\u5dd9\u5dd1\u5ddc", "\uc1be\uc1ba\uc1b4\uc1b5\uc1ba\uc1be\uc1b8\uc1b5", "\ub6cf\ub6cf\ub6ca\ub6c5\ub6ca\ub6c9\ub6c8\ub6c5", "\u812a\u812b\u812b\u8127\u812a\u812f\u812b\u8127", "\u70fa\u70fd\u70f8\u70fc\u70fa\u70f8\u70fe\u70fc", "\ue2cb\ue2c8\ue2c3\ue2c2\ue2cb\ue2c3\ue2cd\ue2cf", "\u086f\u086e\u0864\u086b\u086b\u086a\u086c\u0868", "\ua035\ua032\ua035\ua03c\ua034\ua03d\ua035\ua035"}, d2={"\u0007XWRURO\u0005\u0007\u0005\u0013\u0012m", "\u00ce\u009b\u009c\u009b\u0086\u00cc\u00ce\u00cc\u00da\u00db\u00a4", "\u00fb\u00f9\u00e8\u00df\u00f0\u00fd\u00ef\u00ef\u00a0\u00a2\u00b4\u00b5\u00d0\u00f6\u00fd\u00ea\u00fd\u00b3\u00f0\u00fd\u00f2\u00fb\u00b3\u00df\u00f0\u00fd\u00ef\u00ef\u00a7", "\u057a\u0573\u0561\u057a\u0551\u057d\u0576\u0577\u052e\u052c\u053a\u053b\u055b", "\u05f8\u05ec\u05e8\u05fc\u05f1\u05ee\u05a1\u05a3\u05b5\u05d1\u05f7\u05fc\u05eb\u05fc\u05b2\u05f1\u05fc\u05f3\u05fa\u05b2\u05d2\u05ff\u05f7\u05f8\u05fe\u05e9\u05a6\u05b4\u05c7", "\u03de\u03d1\u03d2\u03d3\u03d8\u0381\u0383\u0395\u0394\u03f1\u03d7\u03dc\u03cb\u03dc\u0392\u03d1\u03dc\u03d3\u03da\u0392\u03f2\u03df\u03d7\u03d8\u03de\u03c9\u0386", "\u05d4\u05cf\u05f3\u05d4\u05d2\u05c9\u05ce\u05c7\u059c\u059e\u0588\u0589\u05ec\u05ca\u05c1\u05d6\u05c1\u058f\u05cc\u05c1\u05ce\u05c7\u058f\u05f3\u05d4\u05d2\u05c9\u05ce\u05c7\u059b", "\u0671\u0670\u066b\u0676\u0679\u0666\u0623\u0621\u0637\u0636\u0649", "\u02c8\u02c9\u02d2\u02cf\u02c0\u02df\u02e7\u02ca\u02ca\u029a\u0298\u028e\u028f\u02f0", "\u0451\u0447\u044f\u0452\u041a\u0418\u040e\u040f\u0470", "{mex02$F%Z", "\u067f\u0669\u0661\u067c\u0638\u0634\u0636\u0620\u0642\u0621\u065e", "\u0798\u078e\u0786\u079b\u07d3\u07d1\u07c7\u07a5\u07a6\u07c6\u07b9", "\u0514\u051b\u051c\u0513\u051e\u051b\u0508\u0517\u054e\u054c\u055a\u055b\u0524"})
public final class Class1349 {
    public static double field5210 = Double.longBitsToDouble(4579497454922880192L);
    public static float field5211 = 0.4838946f;

    private static String i9Q10Wb4yPdo4eYe(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite tdKKEQ3B99I0I4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1349.i9Q10Wb4yPdo4eYe(k2, 1916183800));
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
                int a2 = Integer.parseInt(Class1349.i9Q10Wb4yPdo4eYe(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1349.i9Q10Wb4yPdo4eYe(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1349.i9Q10Wb4yPdo4eYe(k2, 1916183800) + " " + l2 + " " + m2);
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

