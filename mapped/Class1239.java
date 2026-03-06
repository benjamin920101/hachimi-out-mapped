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

@HACHIMI_CLIENT(mv=100, d1={"\u2f22\u2f23\u2f21\u2f2f\u2f22\u2f24\u2f2f\u2f26", "\u023e\u023b\u0235\u0235\u023e\u023f\u023d\u0238", "\u9968\u996c\u996b\u9963\u9968\u996c\u996a\u9968", "\u01a6\u01ab\u01a3\u01a5\u01ab\u01a7\u01a4\u01ab", "\uc3fd\uc3f8\uc3fa\uc3ff\uc3fa\uc3f6\uc3ff\uc3fb", "\u9529\u952a\u952d\u9525\u9525\u952f\u952d\u952e", "\u7f1e\u7f1f\u7f10\u7f10\u7f17\u7f16\u7f16", "\u6134\u6131\u6133\u6135\u6137\u6133\u6139\u6130", "\ud14f\ud141\ud149\ud14f\ud14e\ud14e\ud148\ud140", "\u0d02\u0d08\u0d00\u0d02\u0d03\u0d02\u0d03\u0d07", "\u048d\u048a\u048a\u048d\u048b\u048a\u048d\u0489", "\u760b\u760a\u7609\u7608\u760d\u760f\u760b\u760d", "\u0d74\u0d71\u0d75\u0d71\u0d74\u0d76\u0d72\u0d71", "\ue2a3\ue2a0\ue2a4\ue2a3\ue2a1\ue2a5\ue2a1\ue2a2", "\u4e44\u4e46\u4e40\u4e45\u4e47\u4e46\u4e44\u4e41", "\ua6f6\ua6fc\ua6f6\ua6f5\ua6f7\ua6f5\ua6f1\ua6f7", "\u4a79\u4a79\u4a73\u4a73\u4a73\u4a72\u4a7b\u4a7c", "\u6204\u6202\u6205\u6205\u6201\u6200\u6205\u620a", "\ue5e1\ue5e9\ue5e0\ue5e5\ue5e7\ue5e5\ue5e1\ue5e5"}, d2={"\u04e7\u04cc\u04e8\u2483\u04b1\u04b3\u04a5\u04c1\u04e7\u04ec\u04fb\u04ec\u04a2\u04e1\u04ec\u04e3\u04ea\u04a2\u04de\u04f9\u04ff\u04e4\u04e3\u04ea\u04b6\u04a4\u04c1\u04e7\u04ec\u04fb\u04ec\u04a2\u04e1\u04ec\u04e3\u04ea\u04a2\u04de\u04f9\u04ff\u04e4\u04e3\u04ea\u04b6", "\u04bf\u0494\u04b3\u24db\u04e9\u04eb\u04fd\u0499\u04bf\u04b4\u04a3\u04b4\u04fa\u04b9\u04b4\u04bb\u04b2\u04fa\u0486\u04a1\u04a7\u04bc\u04bb\u04b2\u04ee\u04fc\u0499\u04bf\u04b4\u04a3\u04b4\u04fa\u04b9\u04b4\u04bb\u04b2\u04fa\u0486\u04a1\u04a7\u04bc\u04bb\u04b2\u04ee", "\u0682\u06a9\u068f\u26e6\u06d4\u06d6\u06c0\u06a4\u0682\u0689\u069e\u0689\u06c7\u0684\u0689\u0686\u068f\u06c7\u06bb\u069c\u069a\u0681\u0686\u068f\u06d3\u06c1\u06a4\u0682\u0689\u069e\u0689\u06c7\u0684\u0689\u0686\u068f\u06c7\u06bb\u069c\u069a\u0681\u0686\u068f\u06d3", "\u048e\u04a5\u048c\u24ea\u04d8\u04da\u04cc\u04a8\u048e\u0485\u0492\u0485\u04cb\u0488\u0485\u048a\u0483\u04cb\u04b7\u0490\u0496\u048d\u048a\u0483\u04df\u04cd\u04a8\u048e\u0485\u0492\u0485\u04cb\u0488\u0485\u048a\u0483\u04cb\u04b7\u0490\u0496\u048d\u048a\u0483\u04df", "\u00e3\u00c8\u00e0\u2087\u00b5\u00b7\u00a1\u00c5\u00e3\u00e8\u00ff\u00e8\u00a6\u00e5\u00e8\u00e7\u00ee\u00a6\u00da\u00fd\u00fb\u00e0\u00e7\u00ee\u00b2\u00a0\u00c5\u00e3\u00e8\u00ff\u00e8\u00a6\u00e5\u00e8\u00e7\u00ee\u00a6\u00da\u00fd\u00fb\u00e0\u00e7\u00ee\u00b2", "\u0219\u0246\u0249\u024c\u024b\u024c\u0251\u021b\u0219\u021b\u020d\u020c\u0273", "\u01ea\u01bf\u01b8\u01bf\u01a2\u01e8\u01ea\u01e8\u01fe\u01ff\u0180", "\u03b2\u03b0\u03a1\u0396\u03b9\u03b4\u03a6\u03a6\u03e9\u03eb\u03fd\u03fc\u0399\u03bf\u03b4\u03a3\u03b4\u03fa\u03b9\u03b4\u03bb\u03b2\u03fa\u0396\u03b9\u03b4\u03a6\u03a6\u03ee", "\u039d\u0394\u0386\u039d\u03b6\u039a\u0391\u0390\u03c9\u03cb\u03dd\u03dc\u03bc", "\u0402\u0416\u0412\u0406\u040b\u0414\u045b\u0459\u044f\u042b\u040d\u0406\u0411\u0406\u0448\u040b\u0406\u0409\u0400\u0448\u0428\u0405\u040d\u0402\u0404\u0413\u045c\u044e\u043d", "\u041f\u0410\u0413\u0412\u0419\u0440\u0442\u0454\u0455\u0430\u0416\u041d\u040a\u041d\u0453\u0410\u041d\u0412\u041b\u0453\u0433\u041e\u0416\u0419\u041f\u0408\u0447", "\u023e\u0225\u0219\u023e\u0238\u0223\u0224\u022d\u0276\u0274\u0262\u0263\u0206\u0220\u022b\u023c\u022b\u0265\u0226\u022b\u0224\u022d\u0265\u0219\u023e\u0238\u0223\u0224\u022d\u0271", "\u070d\u070c\u0717\u070a\u0705\u071a\u075f\u075d\u074b\u074a\u0735", "\u0151\u0150\u014b\u0156\u0159\u0146\u017e\u0153\u0153\u0103\u0101\u0117\u0116\u0169", "\u0011\u0007\u000f\u0012ZXNO0", "\u0798\u078e\u0786\u079b\u07d3\u07d1\u07c7\u07a5\u07c6\u07b9", "\u0362\u0374\u037c\u0361\u0325\u0329\u032b\u033d\u035f\u033c\u0343", "\u0653\u0645\u064d\u0650\u0618\u061a\u060c\u066e\u066d\u060d\u0672", "\u01fa\u01f5\u01f2\u01fd\u01f0\u01f5\u01e6\u01f9\u01a0\u01a2\u01b4\u01b5\u01ca"})
public final class Class1239 {
    public static float field4862;
    public static float field4863;
    public static int field4864 = -1110941504;

    private static String hj6gFLtJa5QvQuCa(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite ytQ3YxkJY29LTb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1239.hj6gFLtJa5QvQuCa(k2, 1849689250));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block10: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1239.hj6gFLtJa5QvQuCa(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 4813 : 4812;
            block11: while (true) {
                switch (n3) {
                    case 4813: {
                        n3 = 4811;
                        continue block11;
                    }
                    case 4812: {
                        String c2 = Class1239.hj6gFLtJa5QvQuCa(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block10;
                    }
                    default: {
                        continue block10;
                    }
                }
                break;
            }
        }
        int n4 = !s2.isEmpty() ? 24165 : 24164;
        block12: while (true) {
            switch (n4) {
                case 24165: {
                    n4 = 24163;
                    continue block12;
                }
                case 24164: {
                    throw new Exception("Can't find method in " + Class1239.hj6gFLtJa5QvQuCa(k2, 1849689250) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        d\u200e = "Vehicles";
        B\u200e = "AirPlace";
        M\u200e = "Failed to replace totem! Possible reasons: %s";
        aD\u200e = "fontpath";
        field4863 = Float.intBitsToFloat(1037432352);
        bp\u200e = "The rendering mode for the chams";
        field4862 = Float.intBitsToFloat(1049099382);
    }
}

