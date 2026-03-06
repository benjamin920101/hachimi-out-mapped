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

@HACHIMI_CLIENT(mv=100, d1={"\u0a9f\u0a94\u0a9b\u0a9d\u0a98\u0a9b\u0a94\u0a9e", "\u380c\u3808\u3806\u380f\u380b\u380e\u380a\u3806", "\ua7e8\ua7e8\ua7ed\ua7ea\ua7e7\ua7ed\ua7e7", "\u9a2e\u9a2e\u9a28\u9a2a\u9a20\u9a2e\u9a28\u9a2c", "\u8543\u8542\u8545\u8547\u8546\u8546\u8540\u8540", "\ue40d\ue401\ue401\ue409\ue40b\ue40a\ue408\ue401", "\u1df7\u1df1\u1df5\u1df2\u1df1\u1df1\u1df3", "\ubf9d\ubf9a\ubf91\ubf98\ubf98\ubf90\ubf98", "\u4cd7\u4cd4\u4cd4\u4cd1\u4cd7\u4cdb\u4cd7\u4cd3", "\u3260\u3265\u3265\u3262\u3262\u3263\u3263\u3265", "\udf9d\udf9a\udf94\udf99\udf9e\udf9f\udf9f\udf98", "\ud4e3\ud4e0\ud4e6\ud4e6\ud4e0\ud4e1\ud4e1\ud4ea", "\u9e46\u9e45\u9e47\u9e4c\u9e40\u9e40\u9e47\u9e44", "\u997a\u997c\u997b\u997a\u9979\u9972\u9973\u9973", "\u2e8f\u2e81\u2e8a\u2e81\u2e8a\u2e8a\u2e80\u2e8e"}, d2={"\u069d\u068c\u0691\u26f8\u06ca\u06c8\u06de\u06ba\u069c\u0697\u0680\u0697\u06d9\u069a\u0697\u0698\u0691\u06d9\u06a5\u0682\u0684\u069f\u0698\u0691\u06cd\u06df\u06ba\u069c\u0697\u0680\u0697\u06d9\u069a\u0697\u0698\u0691\u06d9\u06a5\u0682\u0684\u069f\u0698\u0691\u06cd", "\u0563\u053c\u0533\u0536\u0531\u0536\u052b\u0561\u0563\u0561\u0577\u0576\u0509", "\u05be\u05eb\u05ec\u05eb\u05f6\u05bc\u05be\u05bc\u05aa\u05ab\u05d4", "\u042f\u042d\u043c\u040b\u0424\u0429\u043b\u043b\u0474\u0476\u0460\u0461\u0404\u0422\u0429\u043e\u0429\u0467\u0424\u0429\u0426\u042f\u0467\u040b\u0424\u0429\u043b\u043b\u0473", "\u02b5\u02bc\u02ae\u02b5\u029e\u02b2\u02b9\u02b8\u02e1\u02e3\u02f5\u02f4\u0294", "\u0087\u0093\u0097\u0083\u008e\u0091\u00de\u00dc\u00ca\u00ae\u0088\u0083\u0094\u0083\u00cd\u008e\u0083\u008c\u0085\u00cd\u00ad\u0080\u0088\u0087\u0081\u0096\u00d9\u00cb\u00b8", "\u00d6\u00d9\u00da\u00db\u00d0\u0089\u008b\u009d\u009c\u00f9\u00df\u00d4\u00c3\u00d4\u009a\u00d9\u00d4\u00db\u00d2\u009a\u00fa\u00d7\u00df\u00d0\u00d6\u00c1\u008e", "\u0117\u010c\u0130\u0117\u0111\u010a\u010d\u0104\u015f\u015d\u014b\u014a\u012f\u0109\u0102\u0115\u0102\u014c\u010f\u0102\u010d\u0104\u014c\u0130\u0117\u0111\u010a\u010d\u0104\u0158", "\u0397\u0396\u038d\u0390\u039f\u0380\u03c5\u03c7\u03d1\u03d0\u03af", "\u034a\u034b\u0350\u034d\u0342\u035d\u0365\u0348\u0348\u0318\u031a\u030c\u030d\u0372", "\u0659\u064f\u0647\u065a\u0612\u0610\u0606\u0607\u0678", "\u019f\u0189\u0181\u019c\u01d4\u01d6\u01c0\u01a2\u01c1\u01be", "\u05c4\u05d2\u05da\u05c7\u0583\u058f\u058d\u059b\u05f9\u059a\u05e5", "\u06c1\u06d7\u06df\u06c2\u068a\u0688\u069e\u06fc\u06ff\u069f\u06e0", "\u07ae\u07a1\u07a6\u07a9\u07a4\u07a1\u07b2\u07ad\u07f4\u07f6\u07e0\u07e1\u079e"})
public final class Class3765 {
    public static double field8523;
    public static float field8524 = 0.39889395f;
    public static double field8525;
    public static double field8526;

    /*
     * WARNING - void declaration
     */
    private static CallSite I8E0Qa442gFbTr(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3765.KAyGq6vnKjW86wdX(k2, 1806254353));
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
                int a2 = Integer.parseInt(Class3765.KAyGq6vnKjW86wdX(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3765.KAyGq6vnKjW86wdX(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3765.KAyGq6vnKjW86wdX(k2, 1806254353) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String KAyGq6vnKjW86wdX(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8526 = Double.longBitsToDouble(4587691342023604320L);
        bu\u200e = "OFF";
        field8523 = Double.longBitsToDouble(4600938064819801742L);
        field8525 = Double.longBitsToDouble(4602831586168328457L);
    }
}

