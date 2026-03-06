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

@HACHIMI_CLIENT(mv=100, d1={"\uc92f\uc92e\uc92f\uc92c\uc924\uc92c\uc928\uc925", "\ub636\ub631\ub635\ub634\ub633\ub636\ub631\ub630", "\u9a34\u9a32\u9a39\u9a36\u9a39\u9a38\u9a34\u9a32", "\u9a5b\u9a5a\u9a5b\u9a57\u9a5c\u9a5c\u9a5f", "\u8dad\u8daf\u8daf\u8dab\u8da8\u8dab\u8daf\u8da8", "\u5188\u5188\u5183\u5185\u5183\u5184\u5188", "\u5cc2\u5cc4\u5cc4\u5cc4\u5cc2\u5cc4\u5ccb\u5cc2", "\ud9b0\ud9b5\ud9b3\ud9b7\ud9b6\ud9b3\ud9b3\ud9b5", "\ue0af\ue0a9\ue0a2\ue0a9\ue0ad\ue0ae\ue0ac\ue0a3", "\ubdf3\ubdf7\ubdf1\ubdf3\ubdf1\ubdf6\ubdf4\ubdf2", "\ud4f1\ud4fa\ud4f2\ud4f0\ud4f1\ud4f3\ud4f0", "\u8efd\u8efa\u8ef8\u8efb\u8ef8\u8efe\u8ef4\u8ef4", "\u2de3\u2de1\u2de5\u2de0\u2de3\u2de7\u2de4\u2de3", "\uaa8e\uaa89\uaa81\uaa8a\uaa8b\uaa8c\uaa8a\uaa8f", "\ubb76\ubb71\ubb77\ubb74\ubb74\ubb75\ubb74\ubb7c", "\u66d0\u66db\u66d1\u66d0\u66da\u66d1\u66da\u66d0", "\u846e\u8468\u8468\u846f\u846f\u846e\u846d"}, d2={"\u07eb\u07e7\u07e7\u2786\u07b4\u07b6\u07a0\u07c4\u07e2\u07e9\u07fe\u07e9\u07a7\u07e4\u07e9\u07e6\u07ef\u07a7\u07db\u07fc\u07fa\u07e1\u07e6\u07ef\u07b3\u07a1\u07c4\u07e2\u07e9\u07fe\u07e9\u07a7\u07e4\u07e9\u07e6\u07ef\u07a7\u07db\u07fc\u07fa\u07e1\u07e6\u07ef\u07b3", "\u00f9\u00f5\u00ea\u2094\u00a6\u00a4\u00b2\u00d6\u00f0\u00fb\u00ec\u00fb\u00b5\u00f6\u00fb\u00f4\u00fd\u00b5\u00c9\u00ee\u00e8\u00f3\u00f4\u00fd\u00a1\u00b3\u00d6\u00f0\u00fb\u00ec\u00fb\u00b5\u00f6\u00fb\u00f4\u00fd\u00b5\u00c9\u00ee\u00e8\u00f3\u00f4\u00fd\u00a1", "\u06ba\u06b6\u06a8\u26d7\u06e5\u06e7\u06f1\u0695\u06b3\u06b8\u06af\u06b8\u06f6\u06b5\u06b8\u06b7\u06be\u06f6\u068a\u06ad\u06ab\u06b0\u06b7\u06be\u06e2\u06f0\u0695\u06b3\u06b8\u06af\u06b8\u06f6\u06b5\u06b8\u06b7\u06be\u06f6\u068a\u06ad\u06ab\u06b0\u06b7\u06be\u06e2", "\u0270\u022f\u0220\u0225\u0222\u0225\u0238\u0272\u0270\u0272\u0264\u0265\u021a", "\u06cd\u0698\u069f\u0698\u0685\u06cf\u06cd\u06cf\u06d9\u06d8\u06a7", "\u02dc\u02de\u02cf\u02f8\u02d7\u02da\u02c8\u02c8\u0287\u0285\u0293\u0292\u02f7\u02d1\u02da\u02cd\u02da\u0294\u02d7\u02da\u02d5\u02dc\u0294\u02f8\u02d7\u02da\u02c8\u02c8\u0280", "\u00e4\u00ed\u00ff\u00e4\u00cf\u00e3\u00e8\u00e9\u00b0\u00b2\u00a4\u00a5\u00c5", "\u0621\u0635\u0631\u0625\u0628\u0637\u0678\u067a\u066c\u0608\u062e\u0625\u0632\u0625\u066b\u0628\u0625\u062a\u0623\u066b\u060b\u0626\u062e\u0621\u0627\u0630\u067f\u066d\u061e", "\u0360\u036f\u036c\u036d\u0366\u033f\u033d\u032b\u032a\u034f\u0369\u0362\u0375\u0362\u032c\u036f\u0362\u036d\u0364\u032c\u034c\u0361\u0369\u0366\u0360\u0377\u0338", "\u068a\u0691\u06ad\u068a\u068c\u0697\u0690\u0699\u06c2\u06c0\u06d6\u06d7\u06b2\u0694\u069f\u0688\u069f\u06d1\u0692\u069f\u0690\u0699\u06d1\u06ad\u068a\u068c\u0697\u0690\u0699\u06c5", "\u032c\u032d\u0336\u032b\u0324\u033b\u037e\u037c\u036a\u036b\u0314", "\u01f3\u01f2\u01e9\u01f4\u01fb\u01e4\u01dc\u01f1\u01f1\u01a1\u01a3\u01b5\u01b4\u01cb", "\u06fe\u06e8\u06e0\u06fd\u06b5\u06b7\u06a1\u06a0\u06df", "\u026c\u027a\u0272\u026f\u0227\u0225\u0233\u0251\u0232\u024d", "\u03c2\u03d4\u03dc\u03c1\u0385\u0389\u038b\u039d\u03ff\u039c\u03e3", "\u037b\u036d\u0365\u0378\u0330\u0332\u0324\u0346\u0345\u0325\u035a", "\u022b\u0224\u0223\u022c\u0221\u0224\u0237\u0228\u0271\u0273\u0265\u0264\u021b"})
public final class Class2034 {
    public static float field6781 = Float.intBitsToFloat(1060132691);
    public static float field6782;
    public static String field6783;

    /*
     * Enabled aggressive block sorting
     */
    private static String eDxNA6UFB6QhAXWE(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        while (true) {
            int n2;
            int n3 = d2 >= a2.length() ? 23933 : 23932;
            while ((n2 = n3) != 23932) {
                if (n2 != 23933) {
                    return c2.toString();
                }
                n3 = 23931;
            }
            c2.append((char)(a2.charAt(d2) ^ b2));
            ++d2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite fYGQwA6DP12ZtH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class2034.eDxNA6UFB6QhAXWE(k2, -997148742));
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
                int a2 = Integer.parseInt(Class2034.eDxNA6UFB6QhAXWE(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class2034.eDxNA6UFB6QhAXWE(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = !s2.isEmpty() ? 57412 : 57411;
        block7: while (true) {
            switch (n3) {
                case 57412: {
                    n3 = 57410;
                    continue block7;
                }
                case 57411: {
                    throw new Exception("Can't find method in " + Class2034.eDxNA6UFB6QhAXWE(k2, -997148742) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        ac\u200e = ",";
        ae\u200e = "Disconnects when a player enters render distance";
        field6783 = "Could not read file for {}!";
        field6782 = Float.intBitsToFloat(0x3F000000);
    }
}

