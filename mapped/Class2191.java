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
@HACHIMI_CLIENT(mv=100, d1={"\u7a4c\u7a4e\u7a4f\u7a40\u7a4b\u7a4d\u7a41\u7a4f", "\ucac0\ucac2\ucac7\ucac8\ucac1\ucac4\ucac1\ucac7", "\u13bd\u13bb\u13ba\u13ba\u13bf\u13ba\u13bc\u13bf", "\ude6a\ude68\ude61\ude6e\ude69\ude6c\ude6a\ude6f", "\u0f12\u0f1e\u0f1f\u0f16\u0f16\u0f17\u0f11\u0f13", "\ua4b5\ua4b7\ua4b3\ua4b4\ua4b9\ua4b2\ua4b5\ua4b4", "\u03c5\u03c6\u03c7\u03cf\u03c0\u03c2\u03c7\u03c5", "\ubbb8\ubbbd\ubbbe\ubbbc\ubbb1\ubbbc\ubbb1\ubbb1", "\ub0cd\ub0ca\ub0c9\ub0cf\ub0cf\ub0c8\ub0cb", "\ucdea\ucde9\ucde8\ucde1\ucde1\ucdec\ucdea\ucde0", "\u8fc7\u8fc7\u8fc7\u8fc3\u8fc0\u8fc4\u8fc6\u8fc4", "\ub97f\ub97d\ub97f\ub978\ub978\ub97f", "\ua347\ua344\ua348\ua346\ua344\ua346\ua345", "\ue2ea\ue2ed\ue2ee\ue2ee\ue2ef\ue2ed\ue2e0\ue2ea", "\u69d2\u69de\u69d2\u69d5\u69d3\u69d2\u69d2\u69d3", "\u48b5\u48b5\u48b7\u48b7\u48b0\u48b7\u48bd\u48b0", "\u250c\u250f\u250d\u2509\u250b\u250b\u2506\u250e"}, d2={"\u05f9\u05dd\u05e3\u2586\u05b4\u05b6\u05a0\u05c4\u05e2\u05e9\u05fe\u05e9\u05a7\u05e4\u05e9\u05e6\u05ef\u05a7\u05db\u05fc\u05fa\u05e1\u05e6\u05ef\u05b3\u05a1\u05c4\u05e2\u05e9\u05fe\u05e9\u05a7\u05e4\u05e9\u05e6\u05ef\u05a7\u05db\u05fc\u05fa\u05e1\u05e6\u05ef\u05b3", "\u064f\u066b\u0652\u2630\u0602\u0600\u0616\u0672\u0654\u065f\u0648\u065f\u0611\u0652\u065f\u0650\u0659\u0611\u066d\u064a\u064c\u0657\u0650\u0659\u0605\u0617\u0672\u0654\u065f\u0648\u065f\u0611\u0652\u065f\u0650\u0659\u0611\u066d\u064a\u064c\u0657\u0650\u0659\u0605", "\u067f\u065b\u0663\u2600\u0632\u0630\u0626\u0642\u0664\u066f\u0678\u066f\u0621\u0662\u066f\u0660\u0669\u0621\u065d\u067a\u067c\u0667\u0660\u0669\u0635\u0627\u0642\u0664\u066f\u0678\u066f\u0621\u0662\u066f\u0660\u0669\u0621\u065d\u067a\u067c\u0667\u0660\u0669\u0635", "\u0347\u0318\u0317\u0312\u0315\u0312\u030f\u0345\u0347\u0345\u0353\u0352\u032d", "\u01f5\u01a0\u01a7\u01a0\u01bd\u01f7\u01f5\u01f7\u01e1\u01e0\u019f", "\u0471\u0473\u0462\u0455\u047a\u0477\u0465\u0465\u042a\u0428\u043e\u043f\u045a\u047c\u0477\u0460\u0477\u0439\u047a\u0477\u0478\u0471\u0439\u0455\u047a\u0477\u0465\u0465\u042d", "\u008c\u0085\u0097\u008c\u00a7\u008b\u0080\u0081\u00d8\u00da\u00cc\u00cd\u00ad", "\u06ac\u06b8\u06bc\u06a8\u06a5\u06ba\u06f5\u06f7\u06e1\u0685\u06a3\u06a8\u06bf\u06a8\u06e6\u06a5\u06a8\u06a7\u06ae\u06e6\u0686\u06ab\u06a3\u06ac\u06aa\u06bd\u06f2\u06e0\u0693", "\u04f2\u04fd\u04fe\u04ff\u04f4\u04ad\u04af\u04b9\u04b8\u04dd\u04fb\u04f0\u04e7\u04f0\u04be\u04fd\u04f0\u04ff\u04f6\u04be\u04de\u04f3\u04fb\u04f4\u04f2\u04e5\u04aa", "\u0201\u021a\u0226\u0201\u0207\u021c\u021b\u0212\u0249\u024b\u025d\u025c\u0239\u021f\u0214\u0203\u0214\u025a\u0219\u0214\u021b\u0212\u025a\u0226\u0201\u0207\u021c\u021b\u0212\u024e", "\u0342\u0343\u0358\u0345\u034a\u0355\u0310\u0312\u0304\u0305\u037a", "\u07d1\u07d0\u07cb\u07d6\u07d9\u07c6\u07fe\u07d3\u07d3\u0783\u0781\u0797\u0796\u07e9", "\u0562\u0574\u057c\u0561\u0529\u052b\u053d\u053c\u0543", "\u01fe\u01e8\u01e0\u01fd\u01b5\u01b7\u01a1\u01c3\u01a0\u01df", "\u04fb\u04ed\u04e5\u04f8\u04bc\u04b0\u04b2\u04a4\u04c6\u04a5\u04da", "yogz20&DG'X", "\u027c\u0273\u0274\u027b\u0276\u0273\u0260\u027f\u0226\u0224\u0232\u0233\u024c"})
public final class Class2191 {
    public static float field6784;
    public static int field6785 = 5828789;
    public static int field6786 = 103878276;

    static {
        af\u200e = "STEAM";
        aj\u200e = "Shows chat timestamps";
        aL\u200e = "AnvilRename";
        field6784 = Float.intBitsToFloat(1045220557);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite qd4Jd7YdYTVFiu(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class2191.1nKWhJDNgf9b4LAo(k2, 241798563));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class2191.1nKWhJDNgf9b4LAo(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class2191.1nKWhJDNgf9b4LAo(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class2191.1nKWhJDNgf9b4LAo(k2, 241798563) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 60497 : 60498;
        block7: while (true) {
            switch (n3) {
                case 60498: {
                    n3 = 60496;
                    continue block7;
                }
                case 60497: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 1nKWhJDNgf9b4LAo(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

