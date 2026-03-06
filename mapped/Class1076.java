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
@HACHIMI_CLIENT(mv=100, d1={"\u8341\u8342\u834c\u8341\u8345\u8344\u8347\u8344", "\u4e18\u4e1f\u4e1b\u4e1e\u4e10\u4e19\u4e1e\u4e19", "\uaf32\uaf36\uaf36\uaf35\uaf33\uaf30\uaf38", "\u29dc\u29df\u29dd\u29d1\u29de\u29df\u29df\u29d9", "\u5c89\u5c8c\u5c82\u5c82\u5c83\u5c8f\u5c88\u5c8b", "\u31e7\u31e0\u31e0\u31ed\u31e2\u31e6\u31e1\u31ed", "\u5871\u5871\u5878\u5871\u5878\u587e\u587a", "\u1d1d\u1d1b\u1d1e\u1d1e\u1d10\u1d1b\u1d1a\u1d19", "\u9c1d\u9c17\u9c1c\u9c1d\u9c16\u9c1a\u9c1a\u9c17", "\ud22b\ud22e\ud227\ud229\ud22d\ud227\ud22f\ud22a", "\u459d\u459a\u4598\u459a\u459e\u4598\u4599\u4598", "\u2718\u271f\u271b\u271c\u271d\u271d\u2718\u271a", "\u0200\u0200\u020a\u0207\u020b\u0203\u0206\u0200", "\u9a77\u9a71\u9a76\u9a71\u9a74\u9a71\u9a7f\u9a70", "\uc9a7\uc9a1\uc9a9\uc9a4\uc9a8\uc9a3\uc9a8\uc9a9", "\ub870\ub870\ub87e\ub879\ub87e\ub879\ub87a", "\u2ace\u2acd\u2ac9\u2ac8\u2ace\u2ac0\u2ac8\u2ac9", "\u3c3b\u3c3c\u3c38\u3c3c\u3c3f\u3c3d\u3c3e\u3c3c"}, d2={"\u07da\u07f8\u07cb\u27bd\u078f\u078d\u079b\u07ff\u07d9\u07d2\u07c5\u07d2\u079c\u07df\u07d2\u07dd\u07d4\u079c\u07e0\u07c7\u07c1\u07da\u07dd\u07d4\u0788\u079a\u07ff\u07d9\u07d2\u07c5\u07d2\u079c\u07df\u07d2\u07dd\u07d4\u079c\u07e0\u07c7\u07c1\u07da\u07dd\u07d4\u0788", "\u06e0\u06c2\u06f0\u2687\u06b5\u06b7\u06a1\u06c5\u06e3\u06e8\u06ff\u06e8\u06a6\u06e5\u06e8\u06e7\u06ee\u06a6\u06da\u06fd\u06fb\u06e0\u06e7\u06ee\u06b2\u06a0\u06c5\u06e3\u06e8\u06ff\u06e8\u06a6\u06e5\u06e8\u06e7\u06ee\u06a6\u06da\u06fd\u06fb\u06e0\u06e7\u06ee\u06b2", "\u0667\u0645\u0674\u2600\u0632\u0630\u0626\u0642\u0664\u066f\u0678\u066f\u0621\u0662\u066f\u0660\u0669\u0621\u065d\u067a\u067c\u0667\u0660\u0669\u0635\u0627\u0642\u0664\u066f\u0678\u066f\u0621\u0662\u066f\u0660\u0669\u0621\u065d\u067a\u067c\u0667\u0660\u0669\u0635", "\u0726\u0704\u070e\u2741\u0773\u0771\u0767\u0703\u0725\u072e\u0739\u072e\u0760\u0723\u072e\u0721\u0728\u0760\u071c\u073b\u073d\u0726\u0721\u0728\u0774\u0766\u0703\u0725\u072e\u0739\u072e\u0760\u0723\u072e\u0721\u0728\u0760\u071c\u073b\u073d\u0726\u0721\u0728\u0774", "\u03b9\u03e6\u03e9\u03ec\u03eb\u03ec\u03f1\u03bb\u03b9\u03bb\u03ad\u03ac\u03d3", "\u0554\u0501\u0506\u0501\u051c\u0556\u0554\u0556\u0540\u0541\u053e", "\u0221\u0223\u0232\u0205\u022a\u0227\u0235\u0235\u027a\u0278\u026e\u026f\u020a\u022c\u0227\u0230\u0227\u0269\u022a\u0227\u0228\u0221\u0269\u0205\u022a\u0227\u0235\u0235\u027d", "\u0297\u029e\u028c\u0297\u02bc\u0290\u029b\u029a\u02c3\u02c1\u02d7\u02d6\u02b6", "\u0710\u0704\u0700\u0714\u0719\u0706\u0749\u074b\u075d\u0739\u071f\u0714\u0703\u0714\u075a\u0719\u0714\u071b\u0712\u075a\u073a\u0717\u071f\u0710\u0716\u0701\u074e\u075c\u072f", "\u0213\u021c\u021f\u021e\u0215\u024c\u024e\u0258\u0259\u023c\u021a\u0211\u0206\u0211\u025f\u021c\u0211\u021e\u0217\u025f\u023f\u0212\u021a\u0215\u0213\u0204\u024b", "\u039a\u0381\u03bd\u039a\u039c\u0387\u0380\u0389\u03d2\u03d0\u03c6\u03c7\u03a2\u0384\u038f\u0398\u038f\u03c1\u0382\u038f\u0380\u0389\u03c1\u03bd\u039a\u039c\u0387\u0380\u0389\u03d5", "\u06fd\u06fc\u06e7\u06fa\u06f5\u06ea\u06af\u06ad\u06bb\u06ba\u06c5", "\u0143\u0142\u0159\u0144\u014b\u0154\u016c\u0141\u0141\u0111\u0113\u0105\u0104\u017b", "\u0245\u0253\u025b\u0246\u020e\u020c\u021a\u021b\u0264", "\u0423\u0435\u043d\u0420\u0468\u046a\u047c\u041e\u047d\u0402", "\u07d0\u07c6\u07ce\u07d3\u0797\u079b\u0799\u078f\u07ed\u078e\u07f1", "\u0517\u0501\u0509\u0514\u055c\u055e\u0548\u052a\u0529\u0549\u0536", "\u02b1\u02be\u02b9\u02b6\u02bb\u02be\u02ad\u02b2\u02eb\u02e9\u02ff\u02fe\u0281"})
public final class Class1076 {
    public static int field4383 = 1736932693;
    public static float field4384;

    static {
        aE\u200e = "F4";
        field4384 = Float.intBitsToFloat(1055103452);
        bb\u200e = "Speed";
        be\u200e = "SwapAlternative";
        bw\u200e = "The vertical flight speed";
    }

    /*
     * Unable to fully structure code
     */
    private static String 6nqTvSJBWxylYMgq(String a, int b) {
        c = new StringBuilder();
        d = 0;
        while (true) {
            block2: {
                block3: {
                    if (d >= a.length()) break block3;
                    v0 = 15239;
                    ** GOTO lbl12
                }
                v0 = 15240;
                if (true) ** GOTO lbl12
                do {
                    v0 = var4_4 = 15238;
lbl12:
                    // 3 sources

                    if (var4_4 == 15239) break block2;
                } while (var4_4 == 15240);
                break;
            }
            c.append((char)(a.charAt(d) ^ b));
            ++d;
        }
        return c.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ea2oWGuUWiU7Br(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1076.6nqTvSJBWxylYMgq(k2, -832647571));
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
                int a2 = Integer.parseInt(Class1076.6nqTvSJBWxylYMgq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1076.6nqTvSJBWxylYMgq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1076.6nqTvSJBWxylYMgq(k2, -832647571) + " " + l2 + " " + m2);
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

