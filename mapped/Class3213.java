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

@HACHIMI_CLIENT(mv=100, d1={"\u0b22\u0b2b\u0b2b\u0b21\u0b21\u0b2b\u0b27\u0b24", "\u102b\u1027\u102a\u102a\u102c\u102e\u102f\u102c", "\u45f7\u45f8\u45f5\u45f7\u45f0\u45f2\u45f0\u45f8", "\u76ef\u76ec\u76ed\u76e8\u76e2\u76ec\u76e3\u76ea", "\u8920\u892c\u8921\u8922\u8927\u892c\u8922\u892c", "\u7f47\u7f48\u7f4c\u7f4f\u7f4d\u7f4f\u7f4b", "\u8f4c\u8f48\u8f4c\u8f4b\u8f49\u8f4f\u8f4c\u8f4c", "\u68c9\u68cf\u68c8\u68c8\u68c9\u68cf\u68c9", "\u68d6\u68d6\u68d4\u68d2\u68d1\u68d5\u68d7\u68d5", "\u88ef\u88ef\u88e6\u88ec\u88e9\u88ed\u88ec\u88ea", "\u47e4\u47e0\u47e8\u47e4\u47e3\u47e1\u47e9\u47e8", "\u3eb4\u3eb1\u3eb3\u3eb3\u3eb0\u3eb4\u3ebe", "\u0fff\u0ffe\u0ffe\u0ffe\u0ff0\u0ff0\u0ff9\u0ffe", "\u3880\u3882\u3885\u3886\u3885\u3882\u3888\u3884", "\u5b06\u5b07\u5b05\u5b0a\u5b05\u5b05\u5b04\u5b00", "\u1b72\u1b7f\u1b73\u1b7e\u1b76\u1b7e\u1b72\u1b70"}, d2={"\u03ea\u03e4\u03e2\u2382\u03b0\u03b2\u03a4\u03c0\u03e6\u03ed\u03fa\u03ed\u03a3\u03e0\u03ed\u03e2\u03eb\u03a3\u03df\u03f8\u03fe\u03e5\u03e2\u03eb\u03b7\u03a5\u03c0\u03e6\u03ed\u03fa\u03ed\u03a3\u03e0\u03ed\u03e2\u03eb\u03a3\u03df\u03f8\u03fe\u03e5\u03e2\u03eb\u03b7", "\u0656\u0658\u065f\u263e\u060c\u060e\u0618\u067c\u065a\u0651\u0646\u0651\u061f\u065c\u0651\u065e\u0657\u061f\u0663\u0644\u0642\u0659\u065e\u0657\u060b\u0619\u067c\u065a\u0651\u0646\u0651\u061f\u065c\u0651\u065e\u0657\u061f\u0663\u0644\u0642\u0659\u065e\u0657\u060b", "\u02e3\u02bc\u02b3\u02b6\u02b1\u02b6\u02ab\u02e1\u02e3\u02e1\u02f7\u02f6\u0289", "\u043a\u046f\u0468\u046f\u0472\u0438\u043a\u0438\u042e\u042f\u0450", "\u0666\u0664\u0675\u0642\u066d\u0660\u0672\u0672\u063d\u063f\u0629\u0628\u064d\u066b\u0660\u0677\u0660\u062e\u066d\u0660\u066f\u0666\u062e\u0642\u066d\u0660\u0672\u0672\u063a", "\u0541\u0548\u055a\u0541\u056a\u0546\u054d\u054c\u0515\u0517\u0501\u0500\u0560", "\u048a\u049e\u049a\u048e\u0483\u049c\u04d3\u04d1\u04c7\u04a3\u0485\u048e\u0499\u048e\u04c0\u0483\u048e\u0481\u0488\u04c0\u04a0\u048d\u0485\u048a\u048c\u049b\u04d4\u04c6\u04b5", "\u0690\u069f\u069c\u069d\u0696\u06cf\u06cd\u06db\u06da\u06bf\u0699\u0692\u0685\u0692\u06dc\u069f\u0692\u069d\u0694\u06dc\u06bc\u0691\u0699\u0696\u0690\u0687\u06c8", "\u0697\u068c\u06b0\u0697\u0691\u068a\u068d\u0684\u06df\u06dd\u06cb\u06ca\u06af\u0689\u0682\u0695\u0682\u06cc\u068f\u0682\u068d\u0684\u06cc\u06b0\u0697\u0691\u068a\u068d\u0684\u06d8", "\u03f1\u03f0\u03eb\u03f6\u03f9\u03e6\u03a3\u03a1\u03b7\u03b6\u03c9", "\u0188\u0189\u0192\u018f\u0180\u019f\u01a7\u018a\u018a\u01da\u01d8\u01ce\u01cf\u01b0", "\u02d8\u02ce\u02c6\u02db\u0293\u0291\u0287\u0286\u02f9", "\u0098\u008e\u0086\u009b\u00d3\u00d1\u00c7\u00a5\u00c6\u00b9", "\u06c8\u06de\u06d6\u06cb\u068f\u0683\u0681\u0697\u06f5\u0696\u06e9", "\u0186\u0190\u0198\u0185\u01cd\u01cf\u01d9\u01bb\u01b8\u01d8\u01a7", "\u0185\u018a\u018d\u0182\u018f\u018a\u0199\u0186\u01df\u01dd\u01cb\u01ca\u01b5"})
public final class Class3213 {
    public static int field6894 = -244325450;
    public static int field6895 = -11380844;
    public static double field6896;

    /*
     * WARNING - void declaration
     */
    private static CallSite z8e9AtdY7ISk0G(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3213.DSWSvGDMVMQLUABS(k2, 2095709935));
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
                int a2 = Integer.parseInt(Class3213.DSWSvGDMVMQLUABS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3213.DSWSvGDMVMQLUABS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3213.DSWSvGDMVMQLUABS(k2, 2095709935) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        P\u200e = "BreakCrystal";
        field6896 = Double.longBitsToDouble(4600222534085501874L);
        aS\u200e = "Friends";
    }

    private static String DSWSvGDMVMQLUABS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

