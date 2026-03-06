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

@HACHIMI_CLIENT(mv=100, d1={"\ubaa6\ubaad\ubaa2\ubaa0\ubaa3\ubaa1\ubaad\ubaa7", "\ud7bb\ud7bc\ud7b8\ud7be\ud7ba\ud7ba\ud7ba\ud7bb", "\u64dc\u64dd\u64df\u64df\u64dd\u64dd\u64df", "\ucd0b\ucd02\ucd09\ucd03\ucd08\ucd0e\ucd02", "\u821c\u821a\u821f\u821e\u8219\u8218\u8219\u821e", "\u4b43\u4b4c\u4b46\u4b45\u4b46\u4b4c\u4b47", "\ucb2b\ucb2b\ucb21\ucb29\ucb2b\ucb2e\ucb2f\ucb2e", "\ud08b\ud08a\ud08c\ud088\ud089\ud08c\ud08e\ud089", "\uc0ea\uc0e8\uc0ee\uc0ea\uc0ea\uc0ef\uc0e0\uc0ea", "\uabea\uabe9\uabe3\uabef\uabe3\uabec\uabee\uabeb", "\ub41c\ub411\ub41e\ub41f\ub410\ub41a\ub41b\ub41a", "\u2ab4\u2ab4\u2ab5\u2ab3\u2ab4\u2ab1\u2abe\u2ab4", "\u5cee\u5ce2\u5ced\u5ce2\u5ce2\u5ce3\u5ce3\u5cee", "\u3670\u3677\u3677\u3672\u3671\u3673\u3678\u3673", "\u4f41\u4f4b\u4f42\u4f41\u4f42\u4f43\u4f45\u4f41", "\u3ba9\u3bab\u3baf\u3ba9\u3bab\u3bab\u3bae\u3bae", "\ua157\ua154\ua156\ua15d\ua152\ua156\ua153\ua156"}, d2={"\u0285\u028c\u0295\u22e8\u02da\u02d8\u02ce\u02aa\u028c\u0287\u0290\u0287\u02c9\u028a\u0287\u0288\u0281\u02c9\u02b5\u0292\u0294\u028f\u0288\u0281\u02dd\u02cf\u02aa\u028c\u0287\u0290\u0287\u02c9\u028a\u0287\u0288\u0281\u02c9\u02b5\u0292\u0294\u028f\u0288\u0281\u02dd", "\u0604\u060d\u0613\u2669\u065b\u0659\u064f\u062b\u060d\u0606\u0611\u0606\u0648\u060b\u0606\u0609\u0600\u0648\u0634\u0613\u0615\u060e\u0609\u0600\u065c\u064e\u062b\u060d\u0606\u0611\u0606\u0648\u060b\u0606\u0609\u0600\u0648\u0634\u0613\u0615\u060e\u0609\u0600\u065c", "\u0226\u022f\u0230\u224b\u0279\u027b\u026d\u0209\u022f\u0224\u0233\u0224\u026a\u0229\u0224\u022b\u0222\u026a\u0216\u0231\u0237\u022c\u022b\u0222\u027e\u026c\u0209\u022f\u0224\u0233\u0224\u026a\u0229\u0224\u022b\u0222\u026a\u0216\u0231\u0237\u022c\u022b\u0222\u027e", "\u077d\u0722\u072d\u0728\u072f\u0728\u0735\u077f\u077d\u077f\u0769\u0768\u0717", "\u04be\u04eb\u04ec\u04eb\u04f6\u04bc\u04be\u04bc\u04aa\u04ab\u04d4", "\u01f4\u01f6\u01e7\u01d0\u01ff\u01f2\u01e0\u01e0\u01af\u01ad\u01bb\u01ba\u01df\u01f9\u01f2\u01e5\u01f2\u01bc\u01ff\u01f2\u01fd\u01f4\u01bc\u01d0\u01ff\u01f2\u01e0\u01e0\u01a8", "\u00da\u00d3\u00c1\u00da\u00f1\u00dd\u00d6\u00d7\u008e\u008c\u009a\u009b\u00fb", "\u0184\u0190\u0194\u0180\u018d\u0192\u01dd\u01df\u01c9\u01ad\u018b\u0180\u0197\u0180\u01ce\u018d\u0180\u018f\u0186\u01ce\u01ae\u0183\u018b\u0184\u0182\u0195\u01da\u01c8\u01bb", "\u04f7\u04f8\u04fb\u04fa\u04f1\u04a8\u04aa\u04bc\u04bd\u04d8\u04fe\u04f5\u04e2\u04f5\u04bb\u04f8\u04f5\u04fa\u04f3\u04bb\u04db\u04f6\u04fe\u04f1\u04f7\u04e0\u04af", "\u038d\u0396\u03aa\u038d\u038b\u0390\u0397\u039e\u03c5\u03c7\u03d1\u03d0\u03b5\u0393\u0398\u038f\u0398\u03d6\u0395\u0398\u0397\u039e\u03d6\u03aa\u038d\u038b\u0390\u0397\u039e\u03c2", "\u01f2\u01f3\u01e8\u01f5\u01fa\u01e5\u01a0\u01a2\u01b4\u01b5\u01ca", "\u050d\u050c\u0517\u050a\u0505\u051a\u0522\u050f\u050f\u055f\u055d\u054b\u054a\u0535", "\u02dd\u02cb\u02c3\u02de\u0296\u0294\u0282\u0283\u02fc", "\u0244\u0252\u025a\u0247\u020f\u020d\u021b\u0279\u021a\u0265", "\u020d\u021b\u0213\u020e\u024a\u0246\u0244\u0252\u0230\u0253\u022c", "\u01e9\u01ff\u01f7\u01ea\u01a2\u01a0\u01b6\u01d4\u01d7\u01b7\u01c8", "\u0748\u0747\u0740\u074f\u0742\u0747\u0754\u074b\u0712\u0710\u0706\u0707\u0778"})
public final class Class4318 {
    public static double field9965 = 0.9920178239218677;

    /*
     * WARNING - void declaration
     */
    private static CallSite WrbQaTu7e3AwcF(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4318.dBIkTgasI7LIdS7c(k2, -1521191381));
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
                int a2 = Integer.parseInt(Class4318.dBIkTgasI7LIdS7c(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4318.dBIkTgasI7LIdS7c(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4318.dBIkTgasI7LIdS7c(k2, -1521191381) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String dBIkTgasI7LIdS7c(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        aK\u200e = "SidesOfItems";
        aZ\u200e = "Highlights containers in the world";
        be\u200e = "RainbowSaturation";
    }
}

