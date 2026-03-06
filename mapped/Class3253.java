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

@HACHIMI_CLIENT(mv=100, d1={"\u9fa2\u9fa0\u9fa8\u9fa6\u9fa2\u9fa6\u9fa1", "\u19e2\u19e3\u19e5\u19e6\u19e3\u19e7\u19e1\u19e5", "\ua971\ua97b\ua972\ua976\ua976\ua97a", "\u2c27\u2c23\u2c2a\u2c2b\u2c25\u2c27\u2c2a\u2c2a", "\u588e\u588f\u588e\u5888\u5885\u5885\u5888\u588a", "\uc34e\uc34a\uc34d\uc342\uc34d\uc34a\uc349\uc34a", "\ua18d\ua180\ua18c\ua180\ua18b\ua181\ua18b\ua18c", "\u8b51\u8b52\u8b5d\u8b57\u8b51\u8b5d\u8b5d", "\ubb7c\ubb79\ubb78\ubb7a\ubb7b\ubb79\ubb7e\ubb78", "\ud085\ud081\ud080\ud086\ud083\ud083\ud087\ud08a", "\u6033\u6035\u6037\u6032\u603f\u6032\u6034\u6030", "\u87a0\u87a4\u87ae\u87a6\u87a1\u87a1\u87ae\u87ae", "\u9ea8\u9ea6\u9eaf\u9eaf\u9eaa\u9eac\u9eab\u9ea9", "\u0b01\u0b03\u0b07\u0b02\u0b0a\u0b07\u0b03\u0b0b"}, d2={"\u06af\u06f0\u06ff\u06fa\u06fd\u06fa\u06e7\u06ad\u06af\u06ad\u06bb\u06ba\u06c5", "\u07f7\u07a2\u07a5\u07a2\u07bf\u07f5\u07f7\u07f5\u07e3\u07e2\u079d", "\u01b2\u01b0\u01a1\u0196\u01b9\u01b4\u01a6\u01a6\u01e9\u01eb\u01fd\u01fc\u0199\u01bf\u01b4\u01a3\u01b4\u01fa\u01b9\u01b4\u01bb\u01b2\u01fa\u0196\u01b9\u01b4\u01a6\u01a6\u01ee", "\u0340\u0349\u035b\u0340\u036b\u0347\u034c\u034d\u0314\u0316\u0300\u0301\u0361", "\u0757\u0743\u0747\u0753\u075e\u0741\u070e\u070c\u071a\u077e\u0758\u0753\u0744\u0753\u071d\u075e\u0753\u075c\u0755\u071d\u077d\u0750\u0758\u0757\u0751\u0746\u0709\u071b\u0768", "\u0665\u066a\u0669\u0668\u0663\u063a\u0638\u062e\u062f\u064a\u066c\u0667\u0670\u0667\u0629\u066a\u0667\u0668\u0661\u0629\u0649\u0664\u066c\u0663\u0665\u0672\u063d", "8#\u001f8>%\"+prde\u0000&-:-c -\"+c\u001f8>%\"+w", "\u0579\u0578\u0563\u057e\u0571\u056e\u052b\u0529\u053f\u053e\u0541", "\u0498\u0499\u0482\u049f\u0490\u048f\u04b7\u049a\u049a\u04ca\u04c8\u04de\u04df\u04a0", "\u0407\u0411\u0419\u0404\u044c\u044e\u0458\u0459\u0426", "\u010c\u011a\u0112\u010f\u0147\u0145\u0153\u0131\u0152\u012d", "\u03e3\u03f5\u03fd\u03e0\u03a4\u03a8\u03aa\u03bc\u03de\u03bd\u03c2", "\u0612\u0604\u060c\u0611\u0659\u065b\u064d\u062f\u062c\u064c\u0633", "\u00c1\u00ce\u00c9\u00c6\u00cb\u00ce\u00dd\u00c2\u009b\u0099\u008f\u008e\u00f1"})
public final class Class3253 {
    public static double field6986 = Double.longBitsToDouble(4596134899174334092L);
    public static double field6987 = Double.longBitsToDouble(4598236980077329208L);

    /*
     * WARNING - void declaration
     */
    private static CallSite OCbDqDUOfGUg7F(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3253.zEeDnyTgr9J12LHF(k2, 1190529777));
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
                int a2 = Integer.parseInt(Class3253.zEeDnyTgr9J12LHF(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3253.zEeDnyTgr9J12LHF(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3253.zEeDnyTgr9J12LHF(k2, 1190529777) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String zEeDnyTgr9J12LHF(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

