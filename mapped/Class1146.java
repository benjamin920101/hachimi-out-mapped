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

@HACHIMI_CLIENT(mv=100, d1={"\uc3e5\uc3e6\uc3e0\uc3ef\uc3ef\uc3e3\uc3e3\uc3e7", "\u046a\u046b\u0468\u046c\u0461\u046e\u046f\u0469", "\u6fe8\u6feb\u6feb\u6fed\u6fef\u6fe3\u6fee", "\u4a44\u4a4e\u4a4e\u4a42\u4a42\u4a40\u4a43\u4a46", "\udd20\udd22\udd22\udd22\udd26\udd29\udd21\udd25", "\u387b\u387c\u3878\u387e\u387d\u387c\u387a\u387b", "\uc837\uc833\uc833\uc835\uc830\uc836\uc834\uc830", "\u7260\u7269\u7264\u7264\u7260\u7265\u7268\u7263", "\u630d\u6306\u630f\u630a\u630f\u6306\u6306\u6308", "\u12be\u12bb\u12bb\u12b8\u12b8\u12be\u12bf\u12bd", "\u189f\u1899\u1896\u1899\u189d\u189a\u189f\u1896", "\u6ec8\u6ecf\u6ec8\u6ec2\u6ec9\u6ec3\u6ecb\u6ecb", "\u4e6f\u4e6f\u4e6c\u4e6f\u4e68\u4e69\u4e69\u4e66", "\ud120\ud123\ud127\ud124\ud120\ud122\ud122\ud123"}, d2={"\u001aEJOHOR\u0018\u001a\u0018\u000e\u000fp", "\u0577\u0522\u0525\u0522\u053f\u0575\u0577\u0575\u0563\u0562\u051d", "\u07ff\u07fd\u07ec\u07db\u07f4\u07f9\u07eb\u07eb\u07a4\u07a6\u07b0\u07b1\u07d4\u07f2\u07f9\u07ee\u07f9\u07b7\u07f4\u07f9\u07f6\u07ff\u07b7\u07db\u07f4\u07f9\u07eb\u07eb\u07a3", "\u02b9\u02b0\u02a2\u02b9\u0292\u02be\u02b5\u02b4\u02ed\u02ef\u02f9\u02f8\u0298", "\u01fb\u01ef\u01eb\u01ff\u01f2\u01ed\u01a2\u01a0\u01b6\u01d2\u01f4\u01ff\u01e8\u01ff\u01b1\u01f2\u01ff\u01f0\u01f9\u01b1\u01d1\u01fc\u01f4\u01fb\u01fd\u01ea\u01a5\u01b7\u01c4", "\u0684\u068b\u0688\u0689\u0682\u06db\u06d9\u06cf\u06ce\u06ab\u068d\u0686\u0691\u0686\u06c8\u068b\u0686\u0689\u0680\u06c8\u06a8\u0685\u068d\u0682\u0684\u0693\u06dc", "\u01b2\u01a9\u0195\u01b2\u01b4\u01af\u01a8\u01a1\u01fa\u01f8\u01ee\u01ef\u018a\u01ac\u01a7\u01b0\u01a7\u01e9\u01aa\u01a7\u01a8\u01a1\u01e9\u0195\u01b2\u01b4\u01af\u01a8\u01a1\u01fd", "\u01ba\u01bb\u01a0\u01bd\u01b2\u01ad\u01e8\u01ea\u01fc\u01fd\u0182", "\u0404\u0405\u041e\u0403\u040c\u0413\u042b\u0406\u0406\u0456\u0454\u0442\u0443\u043c", "\u03ae\u03b8\u03b0\u03ad\u03e5\u03e7\u03f1\u03f0\u038f", "\u0556\u0540\u0548\u0555\u051d\u051f\u0509\u056b\u0508\u0577", "\u07bf\u07a9\u07a1\u07bc\u07f8\u07f4\u07f6\u07e0\u0782\u07e1\u079e", "\u043f\u0429\u0421\u043c\u0474\u0476\u0460\u0402\u0401\u0461\u041e", "\u0559\u0556\u0551\u055e\u0553\u0556\u0545\u055a\u0503\u0501\u0517\u0516\u0569"})
public final class Class1146 {
    public static float field4595 = Float.intBitsToFloat(1059705029);

    private static String MCzkZj7vJovBB7sp(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite CqrgvBjVo7tbJT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1146.MCzkZj7vJovBB7sp(k2, 741432891));
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
                int a2 = Integer.parseInt(Class1146.MCzkZj7vJovBB7sp(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1146.MCzkZj7vJovBB7sp(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1146.MCzkZj7vJovBB7sp(k2, 741432891) + " " + l2 + " " + m2);
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

