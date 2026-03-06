/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import net.hachimi.HACHIMI_CLIENT;
import net.minecraft.client.MinecraftClient;

@HACHIMI_CLIENT(mv=100, d1={"\udb80\udb81\udb82\udb81\udb81\udb81\udb85\udb84", "\ua486\ua484\ua481\ua484\ua487\ua485\ua489", "\u15e9\u15ed\u15ed\u15eb\u15ed\u15e9\u15e9\u15eb", "\u9414\u9414\u9414\u9416\u9417\u9414\u9414\u9412", "\uba03\uba05\uba00\uba00\uba07\uba06\uba02\uba03", "\u1a4e\u1a4f\u1a4f\u1a4e", "\u4c10\u4c10\u4c14\u4c1d\u4c15\u4c12\u4c13\u4c16", "\u7d00\u7d03\u7d03\u7d02\u7d05\u7d02\u7d03\u7d05", "\u190f\u190c\u190e\u190c\u190e\u190a\u1901\u190c", "\ub711\ub714\ub71c\ub712\ub710\ub715\ub714\ub716", "\u02a7\u02a6\u02a1\u02ae\u02a6\u02a2\u02a1\u02af", "\u3668\u3665\u3669\u3664\u3665\u3665\u3664\u366c", "\u3b23\u3b2f\u3b24\u3b20\u3b22\u3b23\u3b26\u3b26", "\u9da6\u9da1\u9dad\u9da7\u9da4\u9da3\u9da7\u9dac", "\u60a7\u60a4\u60a4\u60a2\u60a6\u60a5\u60a3\u60a0"}, d2={"\u03c7\u0392\u0395\u0392\u038f\u03c5\u03c7\u03c5\u03d3\u03d2\u03ad", "\u06a5\u06fa\u06f5\u06f0\u06f7\u06f0\u06ed\u06a7\u06a5\u06a7\u06b1\u06b0\u06cf", "\u00c3\u0096\u0091\u0096\u008b\u00c1\u00c3\u00c1\u00d7\u00d6\u00a9", "\u0010\u0012\u00034\u001b\u0016\u0004\u0004KI_^;\u001d\u0016\u0001\u0016X\u001b\u0016\u0019\u0010X4\u001b\u0016\u0004\u0004L", "\u0572\u057b\u0569\u0572\u0559\u0575\u057e\u057f\u0526\u0524\u0532\u0533\u0553", "\u065a\u064e\u064a\u065e\u0653\u064c\u0603\u0601\u0617\u0673\u0655\u065e\u0649\u065e\u0610\u0653\u065e\u0651\u0658\u0610\u0670\u065d\u0655\u065a\u065c\u064b\u0604\u0616\u0665", "\u0293\u029c\u029f\u029e\u0295\u02cc\u02ce\u02d8\u02d9\u02bc\u029a\u0291\u0286\u0291\u02df\u029c\u0291\u029e\u0297\u02df\u02bf\u0292\u029a\u0295\u0293\u0284\u02cb", "\u06d9\u06c2\u06fe\u06d9\u06df\u06c4\u06c3\u06ca\u0691\u0693\u0685\u0684\u06e1\u06c7\u06cc\u06db\u06cc\u0682\u06c1\u06cc\u06c3\u06ca\u0682\u06fe\u06d9\u06df\u06c4\u06c3\u06ca\u0696", "\u0599\u0598\u0583\u059e\u0591\u058e\u05cb\u05c9\u05df\u05de\u05a1", "\u07ae\u07af\u07b4\u07a9\u07a6\u07b9\u0781\u07ac\u07ac\u07fc\u07fe\u07e8\u07e9\u0796", "\u03b6\u03a0\u03a8\u03b5\u03fd\u03ff\u03e9\u03e8\u0397", "\u0697\u0681\u0689\u0694\u06dc\u06de\u06c8\u06aa\u06c9\u06b6", "\u028b\u029d\u0295\u0288\u02cc\u02c0\u02c2\u02d4\u02b6\u02d5\u02aa", "\u062c\u063a\u0632\u062f\u0667\u0665\u0673\u0611\u0612\u0672\u060d", "\u0568\u0567\u0560\u056f\u0562\u0567\u0574\u056b\u0532\u0530\u0526\u0527\u0558"})
public class Class4122 {
    public static final Random field9560 = ThreadLocalRandom.current();
    public static class_310 field9561;

    /*
     * WARNING - void declaration
     */
    private static CallSite lpW6IMqtM19zVb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4122.Ljwt2f1i7vEDPS2v(k2, -57233264));
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
                int a2 = Integer.parseInt(Class4122.Ljwt2f1i7vEDPS2v(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4122.Ljwt2f1i7vEDPS2v(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4122.Ljwt2f1i7vEDPS2v(k2, -57233264) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String Ljwt2f1i7vEDPS2v(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

