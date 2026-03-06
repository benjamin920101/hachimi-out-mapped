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

@HACHIMI_CLIENT(mv=100, d1={"\u514e\u5143\u5149\u514b\u5143\u514b\u514f\u5143", "\u9be5\u9be4\u9be9\u9be2\u9be8\u9be3\u9be3\u9be3", "\u8d9c\u8d96\u8d9b\u8d9e\u8d9a\u8d9b\u8d9f\u8d98", "\u9749\u9744\u974f\u9748\u9749\u974c\u9744\u974f", "\u28b3\u28b3\u28bd\u28b5\u28b2\u28b0\u28b2", "\u7b96\u7b93\u7b95\u7b93\u7b96\u7b93\u7b96\u7b9d", "\u6bfe\u6bfb\u6bf9\u6bfd\u6bfa\u6bf8\u6bfd", "\u1e70\u1e7a\u1e72\u1e74\u1e7b\u1e70\u1e77", "\u8dd3\u8dd1\u8dd9\u8dd9\u8dd0\u8dd3\u8dd6\u8dd0", "\u0f18\u0f1d\u0f1a\u0f1a\u0f1d", "\ubdd5\ubddd\ubdd6\ubddc\ubdd1\ubdd1\ubdd6\ubdd7", "\ud765\ud761\ud767\ud767\ud760\ud762\ud762", "\u8ee5\u8ee6\u8ee3\u8ee4\u8ee1\u8eeb\u8ee3\u8ee4", "\uda90\uda93\uda92\uda91\uda90\uda9e\uda91"}, d2={"\u010e\u0151\u015e\u015b\u015c\u015b\u0146\u010c\u010e\u010c\u011a\u011b\u0164", "\u05b7\u05e2\u05e5\u05e2\u05ff\u05b5\u05b7\u05b5\u05a3\u05a2\u05dd", "\u0384\u0386\u0397\u03a0\u038f\u0382\u0390\u0390\u03df\u03dd\u03cb\u03ca\u03af\u0389\u0382\u0395\u0382\u03cc\u038f\u0382\u038d\u0384\u03cc\u03a0\u038f\u0382\u0390\u0390\u03d8", "\u00d4\u00dd\u00cf\u00d4\u00ff\u00d3\u00d8\u00d9\u0080\u0082\u0094\u0095\u00f5", "\u07c2\u07d6\u07d2\u07c6\u07cb\u07d4\u079b\u0799\u078f\u07eb\u07cd\u07c6\u07d1\u07c6\u0788\u07cb\u07c6\u07c9\u07c0\u0788\u07e8\u07c5\u07cd\u07c2\u07c4\u07d3\u079c\u078e\u07fd", "\u064f\u0640\u0643\u0642\u0649\u0610\u0612\u0604\u0605\u0660\u0646\u064d\u065a\u064d\u0603\u0640\u064d\u0642\u064b\u0603\u0663\u064e\u0646\u0649\u064f\u0658\u0617", "\u07bd\u07a6\u079a\u07bd\u07bb\u07a0\u07a7\u07ae\u07f5\u07f7\u07e1\u07e0\u0785\u07a3\u07a8\u07bf\u07a8\u07e6\u07a5\u07a8\u07a7\u07ae\u07e6\u079a\u07bd\u07bb\u07a0\u07a7\u07ae\u07f2", "\u0275\u0274\u026f\u0272\u027d\u0262\u0227\u0225\u0233\u0232\u024d", "\u036a\u036b\u0370\u036d\u0362\u037d\u0345\u0368\u0368\u0338\u033a\u032c\u032d\u0352", "\u01a8\u01be\u01b6\u01ab\u01e3\u01e1\u01f7\u01f6\u0189", "H^VK\u0003\u0001\u0017u\u0016i", "\u024d\u025b\u0253\u024e\u020a\u0206\u0204\u0212\u0270\u0213\u026c", "`v~c+)?]^>A", "\u05cc\u05c3\u05c4\u05cb\u05c6\u05c3\u05d0\u05cf\u0596\u0594\u0582\u0583\u05fc"})
public final class Class3920 {
    public static double field8915;
    public static float field8916;

    /*
     * WARNING - void declaration
     */
    private static CallSite OLKNbLYSYdrVIJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3920.b4TtFWB0rrmktgLv(k2, -530461342));
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
                int a2 = Integer.parseInt(Class3920.b4TtFWB0rrmktgLv(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3920.b4TtFWB0rrmktgLv(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3920.b4TtFWB0rrmktgLv(k2, -530461342) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String b4TtFWB0rrmktgLv(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8916 = Float.intBitsToFloat(1054900554);
        field8915 = Double.longBitsToDouble(4589168020290535424L);
    }
}

