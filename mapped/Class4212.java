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

@HACHIMI_CLIENT(mv=100, d1={"\u879b\u879a\u8792\u879d\u879e\u879b\u879a\u879e", "\u2ba3\u2bae\u2ba0\u2ba1\u2ba2\u2bae\u2ba6\u2ba5", "\ue020\ue020\ue020\ue022\ue024\ue026\ue02f\ue024", "\u85b9\u85b8\u85b8\u85b1\u85b1\u85bb\u85b9\u85bf", "\u435a\u4357\u4357\u435a\u4356\u435a\u4358\u4356", "\u9cf9\u9cfc\u9cfa\u9cfd\u9cf8\u9cfb\u9cf8\u9cf9", "\u9e7c\u9e79\u9e7c\u9e7e\u9e7f\u9e78\u9e7b\u9e7f", "\u2d82\u2d88\u2d85\u2d83\u2d89\u2d84\u2d89\u2d89", "\u2f6b\u2f6d\u2f66\u2f6f\u2f6d\u2f69", "\u5392\u5394\u5392\u5394\u5393\u539f\u539f\u539e", "\u5aa6\u5aaa\u5aa7\u5aa4\u5aa0\u5aa3\u5aa6\u5aa3", "\u321a\u3210\u3210\u3218\u321f\u3219\u321a\u3218", "\uc270\uc273\uc276\uc273\uc27c\uc270\uc277\uc277", "\u8dac\u8daa\u8dae\u8dac\u8daf\u8daf\u8daf\u8daa", "\u4764\u4764\u4760\u4763\u4760\u4768\u4767\u4769", "\u6325\u6321\u6321\u6323\u6321\u632b\u6324\u6322"}, d2={"\u0544\u0561\u0562\u2523\u0511\u0513\u0505\u0561\u0547\u054c\u055b\u054c\u0502\u0541\u054c\u0543\u054a\u0502\u057e\u0559\u055f\u0544\u0543\u054a\u0516\u0504\u0561\u0547\u054c\u055b\u054c\u0502\u0541\u054c\u0543\u054a\u0502\u057e\u0559\u055f\u0544\u0543\u054a\u0516", "\u03db\u03fe\u03e2\u23bc\u038e\u038c\u039a\u03fe\u03d8\u03d3\u03c4\u03d3\u039d\u03de\u03d3\u03dc\u03d5\u039d\u03e1\u03c6\u03c0\u03db\u03dc\u03d5\u0389\u039b\u03fe\u03d8\u03d3\u03c4\u03d3\u039d\u03de\u03d3\u03dc\u03d5\u039d\u03e1\u03c6\u03c0\u03db\u03dc\u03d5\u0389", "\u0656\u0609\u0606\u0603\u0604\u0603\u061e\u0654\u0656\u0654\u0642\u0643\u063c", "\u034c\u0319\u031e\u0319\u0304\u034e\u034c\u034e\u0358\u0359\u0326", "\u02d6\u02d4\u02c5\u02f2\u02dd\u02d0\u02c2\u02c2\u028d\u028f\u0299\u0298\u02fd\u02db\u02d0\u02c7\u02d0\u029e\u02dd\u02d0\u02df\u02d6\u029e\u02f2\u02dd\u02d0\u02c2\u02c2\u028a", "\u02d6\u02df\u02cd\u02d6\u02fd\u02d1\u02da\u02db\u0282\u0280\u0296\u0297\u02f7", "\u042e\u043a\u043e\u042a\u0427\u0438\u0477\u0475\u0463\u0407\u0421\u042a\u043d\u042a\u0464\u0427\u042a\u0425\u042c\u0464\u0404\u0429\u0421\u042e\u0428\u043f\u0470\u0462\u0411", "\u05ec\u05e3\u05e0\u05e1\u05ea\u05b3\u05b1\u05a7\u05a6\u05c3\u05e5\u05ee\u05f9\u05ee\u05a0\u05e3\u05ee\u05e1\u05e8\u05a0\u05c0\u05ed\u05e5\u05ea\u05ec\u05fb\u05b4", "\u01fb\u01e0\u01dc\u01fb\u01fd\u01e6\u01e1\u01e8\u01b3\u01b1\u01a7\u01a6\u01c3\u01e5\u01ee\u01f9\u01ee\u01a0\u01e3\u01ee\u01e1\u01e8\u01a0\u01dc\u01fb\u01fd\u01e6\u01e1\u01e8\u01b4", "\u03df\u03de\u03c5\u03d8\u03d7\u03c8\u038d\u038f\u0399\u0398\u03e7", "\u0502\u0503\u0518\u0505\u050a\u0515\u052d\u0500\u0500\u0550\u0552\u0544\u0545\u053a", "\u02d2\u02c4\u02cc\u02d1\u0299\u029b\u028d\u028c\u02f3", "\u0709\u071f\u0717\u070a\u0742\u0740\u0756\u0734\u0757\u0728", "\u03ce\u03d8\u03d0\u03cd\u0389\u0385\u0387\u0391\u03f3\u0390\u03ef", "\u02c7\u02d1\u02d9\u02c4\u028c\u028e\u0298\u02fa\u02f9\u0299\u02e6", "\u02d2\u02dd\u02da\u02d5\u02d8\u02dd\u02ce\u02d1\u0288\u028a\u029c\u029d\u02e2"})
public final class Class4212 {
    public static float field9851;
    public static int field9852 = 1496188273;
    public static int field9853 = 2139680754;
    public static double field9854;

    private static String Z8H2Neixnp4pnYsO(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        t\u200e = "[I] ";
        field9854 = Double.longBitsToDouble(4577502388693922304L);
        field9851 = Float.intBitsToFloat(1057325498);
        bw\u200e = "Steals items from chests";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ZAKJjah7QOFI0s(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4212.Z8H2Neixnp4pnYsO(k2, -1424631669));
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
                int a2 = Integer.parseInt(Class4212.Z8H2Neixnp4pnYsO(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4212.Z8H2Neixnp4pnYsO(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4212.Z8H2Neixnp4pnYsO(k2, -1424631669) + " " + l2 + " " + m2);
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

