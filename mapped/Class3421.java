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

@HACHIMI_CLIENT(mv=100, d1={"\ua291\ua29c\ua293\ua290\ua297\ua293\ua294\ua29d", "\u8a51\u8a56\u8a57\u8a55\u8a56\u8a50\u8a5e\u8a5e", "\u6f8b\u6f89\u6f89\u6f80\u6f80\u6f8a\u6f88\u6f89", "\u2c23\u2c2c\u2c27\u2c24\u2c23\u2c20\u2c24\u2c2c", "\u6744\u674f\u674c\u6748\u6745\u674d\u6749", "\u33c9\u33c8\u33c8\u33ca\u33c9\u33c9\u33cc\u33c9", "\uc35b\uc35b\uc355\uc35c\uc35e\uc359\uc35f\uc35b", "\u8e05\u8e0e\u8e0c\u8e04\u8e0d\u8e05\u8e0c", "\ua188\ua18f\ua18b\ua18d\ua189\ua180\ua189\ua18c", "\ub7f1\ub7f3\ub7f4\ub7f0\ub7f7\ub7f4\ub7fd\ub7f7", "\uadbb\uadbf\uadba\uadb9\uadb0\uadb9\uadbf\uadbb", "\uc2c7\uc2c7\uc2c2\uc2c1\uc2c4\uc2c4\uc2c7\uc2c3", "\ubc55\ubc56\ubc5f\ubc53\ubc5e\ubc55\ubc57\ubc55", "\u33a4\u33a4\u33a2\u33a0\u33a0\u33a7\u33af\u33a3", "\u7ddc\u7dd8\u7ddc\u7ddd\u7dd9\u7ddd\u7ddf\u7dd6", "\u9010\u9012\u9013\u9015\u9015\u9013\u901a\u9015", "\ucb16\ucb10\ucb12\ucb11\ucb1b\ucb14\ucb1a\ucb15"}, d2={"\u023a\u0231\u021a\u2257\u0265\u0267\u0271\u0215\u0233\u0238\u022f\u0238\u0276\u0235\u0238\u0237\u023e\u0276\u020a\u022d\u022b\u0230\u0237\u023e\u0262\u0270\u0215\u0233\u0238\u022f\u0238\u0276\u0235\u0238\u0237\u023e\u0276\u020a\u022d\u022b\u0230\u0237\u023e\u0262", "\u032b\u0320\u030c\u2346\u0374\u0376\u0360\u0304\u0322\u0329\u033e\u0329\u0367\u0324\u0329\u0326\u032f\u0367\u031b\u033c\u033a\u0321\u0326\u032f\u0373\u0361\u0304\u0322\u0329\u033e\u0329\u0367\u0324\u0329\u0326\u032f\u0367\u031b\u033c\u033a\u0321\u0326\u032f\u0373", "\u04ca\u04c1\u04ec\u24a7\u0495\u0497\u0481\u04e5\u04c3\u04c8\u04df\u04c8\u0486\u04c5\u04c8\u04c7\u04ce\u0486\u04fa\u04dd\u04db\u04c0\u04c7\u04ce\u0492\u0480\u04e5\u04c3\u04c8\u04df\u04c8\u0486\u04c5\u04c8\u04c7\u04ce\u0486\u04fa\u04dd\u04db\u04c0\u04c7\u04ce\u0492", "\u0574\u052b\u0524\u0521\u0526\u0521\u053c\u0576\u0574\u0576\u0560\u0561\u051e", "\u03b0\u03e5\u03e2\u03e5\u03f8\u03b2\u03b0\u03b2\u03a4\u03a5\u03da", "\u04e4\u04e6\u04f7\u04c0\u04ef\u04e2\u04f0\u04f0\u04bf\u04bd\u04ab\u04aa\u04cf\u04e9\u04e2\u04f5\u04e2\u04ac\u04ef\u04e2\u04ed\u04e4\u04ac\u04c0\u04ef\u04e2\u04f0\u04f0\u04b8", "gn|gL`kj31'&F", "\u02fb\u02ef\u02eb\u02ff\u02f2\u02ed\u02a2\u02a0\u02b6\u02d2\u02f4\u02ff\u02e8\u02ff\u02b1\u02f2\u02ff\u02f0\u02f9\u02b1\u02d1\u02fc\u02f4\u02fb\u02fd\u02ea\u02a5\u02b7\u02c4", "\u05a1\u05ae\u05ad\u05ac\u05a7\u05fe\u05fc\u05ea\u05eb\u058e\u05a8\u05a3\u05b4\u05a3\u05ed\u05ae\u05a3\u05ac\u05a5\u05ed\u058d\u05a0\u05a8\u05a7\u05a1\u05b6\u05f9", "\u0402\u0419\u0425\u0402\u0404\u041f\u0418\u0411\u044a\u0448\u045e\u045f\u043a\u041c\u0417\u0400\u0417\u0459\u041a\u0417\u0418\u0411\u0459\u0425\u0402\u0404\u041f\u0418\u0411\u044d", "qpkvyf#!76I", "\u0793\u0792\u0789\u0794\u079b\u0784\u07bc\u0791\u0791\u07c1\u07c3\u07d5\u07d4\u07ab", "\u053d\u052b\u0523\u053e\u0576\u0574\u0562\u0563\u051c", "\u0013\u0005\r\u0010XZL.M2", "\u07b7\u07a1\u07a9\u07b4\u07f0\u07fc\u07fe\u07e8\u078a\u07e9\u0796", "\u077d\u076b\u0763\u077e\u0736\u0734\u0722\u0740\u0743\u0723\u075c", "\u027b\u0274\u0273\u027c\u0271\u0274\u0267\u0278\u0221\u0223\u0235\u0234\u024b"})
public final class Class3421 {
    public static float field7453;

    private static String DS3dvaGFM0txcNIF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        y\u200e = "Crapple";
        A\u200e = "Must provide a module to keybind!";
        ac\u200e = "Removes the animation when switching items";
        field7453 = Float.intBitsToFloat(1060069674);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite vQET7yoqbeWQCD(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3421.DS3dvaGFM0txcNIF(k2, 945149269));
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
                int a2 = Integer.parseInt(Class3421.DS3dvaGFM0txcNIF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3421.DS3dvaGFM0txcNIF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3421.DS3dvaGFM0txcNIF(k2, 945149269) + " " + l2 + " " + m2);
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

