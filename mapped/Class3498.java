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

@HACHIMI_CLIENT(mv=100, d1={"\u89df\u89d9\u89dc\u89d9\u89dc\u89df\u89db", "\ua802\ua802\ua805\ua805\ua805\ua806\ua800\ua802", "\ucbcb\ucbca\ucbcc\ucbca\ucbcf\ucbc4\ucbcb\ucbcd", "\u3233\u3231\u3237\u323b\u3233\u3235\u323b\u323a", "\u6f7d\u6f7b\u6f7c\u6f76\u6f78\u6f7c\u6f7d\u6f76", "\u462b\u462b\u462c\u4626\u4628\u4626\u462a\u4628", "\ubeec\ubee5\ubeec\ubee8\ubee9\ubeec\ubee5\ubee4", "\ud7f9\ud7f8\ud7fd\ud7ff\ud7ff\ud7fc\ud7fc\ud7fc", "\u4681\u4687\u4686\u4680\u4687\u4681\u4680\u4684", "\u7ae2\u7ae2\u7ae3\u7ae7\u7ae5\u7ae3\u7ae5\u7ae6", "\u8b3c\u8b36\u8b3b\u8b39\u8b3d\u8b3c\u8b3c\u8b3c", "\ucc57\ucc5d\ucc5c\ucc5c\ucc52\ucc55\ucc57\ucc52", "\udebb\udeb9\udebb\udebb\udeba\udebc\udeb9", "\ua50f\ua509\ua500\ua509\ua500\ua50c\ua50c\ua508", "\u9223\u922d\u9227\u9226\u9225\u9224\u9223\u9227", "\uc7ad\uc7ab\uc7af\uc7a9\uc7a9\uc7a1\uc7ad\uc7ab", "\uce56\uce54\uce53\uce57\uce54\uce53\uce59\uce52", "\u0b34\u0b3a\u0b30\u0b37\u0b37\u0b33\u0b36\u0b32"}, d2={"\u02d3\u02d7\u02e8\u22b7\u0285\u0287\u0291\u02f5\u02d3\u02d8\u02cf\u02d8\u0296\u02d5\u02d8\u02d7\u02de\u0296\u02ea\u02cd\u02cb\u02d0\u02d7\u02de\u0282\u0290\u02f5\u02d3\u02d8\u02cf\u02d8\u0296\u02d5\u02d8\u02d7\u02de\u0296\u02ea\u02cd\u02cb\u02d0\u02d7\u02de\u0282", "\u0512\u0516\u052a\u2576\u0544\u0546\u0550\u0534\u0512\u0519\u050e\u0519\u0557\u0514\u0519\u0516\u051f\u0557\u052b\u050c\u050a\u0511\u0516\u051f\u0543\u0551\u0534\u0512\u0519\u050e\u0519\u0557\u0514\u0519\u0516\u051f\u0557\u052b\u050c\u050a\u0511\u0516\u051f\u0543", "\u032d\u0329\u0314\u2349\u037b\u0379\u036f\u030b\u032d\u0326\u0331\u0326\u0368\u032b\u0326\u0329\u0320\u0368\u0314\u0333\u0335\u032e\u0329\u0320\u037c\u036e\u030b\u032d\u0326\u0331\u0326\u0368\u032b\u0326\u0329\u0320\u0368\u0314\u0333\u0335\u032e\u0329\u0320\u037c", "\u0619\u061d\u0627\u267d\u064f\u064d\u065b\u063f\u0619\u0612\u0605\u0612\u065c\u061f\u0612\u061d\u0614\u065c\u0620\u0607\u0601\u061a\u061d\u0614\u0648\u065a\u063f\u0619\u0612\u0605\u0612\u065c\u061f\u0612\u061d\u0614\u065c\u0620\u0607\u0601\u061a\u061d\u0614\u0648", "\u063b\u0664\u066b\u066e\u0669\u066e\u0673\u0639\u063b\u0639\u062f\u062e\u0651", "\u07ec\u07b9\u07be\u07b9\u07a4\u07ee\u07ec\u07ee\u07f8\u07f9\u0786", "\u023e\u023c\u022d\u021a\u0235\u0238\u022a\u022a\u0265\u0267\u0271\u0270\u0215\u0233\u0238\u022f\u0238\u0276\u0235\u0238\u0237\u023e\u0276\u021a\u0235\u0238\u022a\u022a\u0262", "\u048a\u0483\u0491\u048a\u04a1\u048d\u0486\u0487\u04de\u04dc\u04ca\u04cb\u04ab", "\u0753\u0747\u0743\u0757\u075a\u0745\u070a\u0708\u071e\u077a\u075c\u0757\u0740\u0757\u0719\u075a\u0757\u0758\u0751\u0719\u0779\u0754\u075c\u0753\u0755\u0742\u070d\u071f\u076c", "\u0104\u010b\u0108\u0109\u0102\u015b\u0159\u014f\u014e\u012b\u010d\u0106\u0111\u0106\u0148\u010b\u0106\u0109\u0100\u0148\u0128\u0105\u010d\u0102\u0104\u0113\u015c", "\u06b9\u06a2\u069e\u06b9\u06bf\u06a4\u06a3\u06aa\u06f1\u06f3\u06e5\u06e4\u0681\u06a7\u06ac\u06bb\u06ac\u06e2\u06a1\u06ac\u06a3\u06aa\u06e2\u069e\u06b9\u06bf\u06a4\u06a3\u06aa\u06f6", "\u0627\u0626\u063d\u0620\u062f\u0630\u0675\u0677\u0661\u0660\u061f", "\u041e\u041f\u0404\u0419\u0416\u0409\u0431\u041c\u041c\u044c\u044e\u0458\u0459\u0426", "\u063b\u062d\u0625\u0638\u0670\u0672\u0664\u0665\u061a", "\u0684\u0692\u069a\u0687\u06cf\u06cd\u06db\u06b9\u06da\u06a5", "\u02a2\u02b4\u02bc\u02a1\u02e5\u02e9\u02eb\u02fd\u029f\u02fc\u0283", "\u04fc\u04ea\u04e2\u04ff\u04b7\u04b5\u04a3\u04c1\u04c2\u04a2\u04dd", "\u01d6\u01d9\u01de\u01d1\u01dc\u01d9\u01ca\u01d5\u018c\u018e\u0198\u0199\u01e6"})
public final class Class3498 {
    public static double field7693;
    public static float field7694;
    public static double field7695;
    public static double field7696;

    /*
     * WARNING - void declaration
     */
    private static CallSite L35i8UQRDn3D0B(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3498.atzZOyjIg2RJ72Ie(k2, -1659706330));
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
                int a2 = Integer.parseInt(Class3498.atzZOyjIg2RJ72Ie(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3498.atzZOyjIg2RJ72Ie(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3498.atzZOyjIg2RJ72Ie(k2, -1659706330) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String atzZOyjIg2RJ72Ie(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        b\u200e = "Kit list";
        field7694 = Float.intBitsToFloat(1064863786);
        T\u200e = "Must provide waypoint name!";
        field7696 = Double.longBitsToDouble(4597408303203315308L);
        ag\u200e = "list";
        field7693 = Double.longBitsToDouble(4607175217098849251L);
        bC\u200e = "Highlights chunks that have been recently generated";
        field7695 = Double.longBitsToDouble(4606385907018400251L);
    }
}

