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

@HACHIMI_CLIENT(mv=100, d1={"\ud48f\ud480\ud489\ud48a\ud48c\ud488\ud48b", "\u78b4\u78b7\u78b6\u78b7\u78b6\u78b4\u78b4\u78b8", "\u79a2\u79ad\u79a2\u79a1\u79a7\u79a6\u79a1\u79a3", "\u6964\u6967\u6961\u6964\u6961\u696d\u6967\u6964", "\ua653\ua652\ua656\ua657\ua659\ua658\ua652\ua658", "\u6cdb\u6cdc\u6cdc\u6cdb\u6cd7\u6cdd\u6cd9\u6cdb", "\u5174\u5173\u5177\u5173\u5175\u517e\u5170\u5176", "\u0a5b\u0a57\u0a5c\u0a5f\u0a5c\u0a5c\u0a56\u0a57", "\u339d\u339b\u339d\u339f\u3399\u3399\u339e\u3398", "\u4ed5\u4edb\u4ed5\u4ed1\u4eda\u4edb\u4ed6\u4eda", "\uaeb2\uaeb7\uaeb6\uaeb7\uaebf\uaebe\uaebf\uaeb2", "\ue61b\ue61c\ue61e\ue611\ue61e\ue61c\ue61d\ue61c", "\u73db\u73d8\u73dd\u73dd\u73db\u73de\u73db\u73d9", "\udc67\udc6c\udc6c\udc66\udc6f\udc67\udc6c", "\u8599\u859e\u859b\u8598\u859e\u859d\u859a\u8599"}, d2={"b\\@\u200757!Ech\u007fh&ehgn&Z}{`gn2 Ech\u007fh&ehgn&Z}{`gn2", "\u04f3\u04ac\u04a3\u04a6\u04a1\u04a6\u04bb\u04f1\u04f3\u04f1\u04e7\u04e6\u0499", "\u0678\u062d\u062a\u062d\u0630\u067a\u0678\u067a\u066c\u066d\u0612", "\u0380\u0382\u0393\u03a4\u038b\u0386\u0394\u0394\u03db\u03d9\u03cf\u03ce\u03ab\u038d\u0386\u0391\u0386\u03c8\u038b\u0386\u0389\u0380\u03c8\u03a4\u038b\u0386\u0394\u0394\u03dc", "\u01ee\u01e7\u01f5\u01ee\u01c5\u01e9\u01e2\u01e3\u01ba\u01b8\u01ae\u01af\u01cf", "\u0728\u073c\u0738\u072c\u0721\u073e\u0771\u0773\u0765\u0701\u0727\u072c\u073b\u072c\u0762\u0721\u072c\u0723\u072a\u0762\u0702\u072f\u0727\u0728\u072e\u0739\u0776\u0764\u0717", "\u013c\u0133\u0130\u0131\u013a\u0163\u0161\u0177\u0176\u0113\u0135\u013e\u0129\u013e\u0170\u0133\u013e\u0131\u0138\u0170\u0110\u013d\u0135\u013a\u013c\u012b\u0164", "\u01ad\u01b6\u018a\u01ad\u01ab\u01b0\u01b7\u01be\u01e5\u01e7\u01f1\u01f0\u0195\u01b3\u01b8\u01af\u01b8\u01f6\u01b5\u01b8\u01b7\u01be\u01f6\u018a\u01ad\u01ab\u01b0\u01b7\u01be\u01e2", "\u0421\u0420\u043b\u0426\u0429\u0436\u0473\u0471\u0467\u0466\u0419", "\u06fd\u06fc\u06e7\u06fa\u06f5\u06ea\u06d2\u06ff\u06ff\u06af\u06ad\u06bb\u06ba\u06c5", "\u047e\u0468\u0460\u047d\u0435\u0437\u0421\u0420\u045f", "\u07fc\u07ea\u07e2\u07ff\u07b7\u07b5\u07a3\u07c1\u07a2\u07dd", "\u05ec\u05fa\u05f2\u05ef\u05ab\u05a7\u05a5\u05b3\u05d1\u05b2\u05cd", "\u02d6\u02c0\u02c8\u02d5\u029d\u029f\u0289\u02eb\u02e8\u0288\u02f7", "\u02f4\u02fb\u02fc\u02f3\u02fe\u02fb\u02e8\u02f7\u02ae\u02ac\u02ba\u02bb\u02c4"})
public final class Class3450 {
    public static int field7548 = 1464654190;

    private static String AKnTZTjAOnlSbbP9(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite OD0KU8xTY40rdy(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3450.AKnTZTjAOnlSbbP9(k2, 1000926714));
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
                int a2 = Integer.parseInt(Class3450.AKnTZTjAOnlSbbP9(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3450.AKnTZTjAOnlSbbP9(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3450.AKnTZTjAOnlSbbP9(k2, 1000926714) + " " + l2 + " " + m2);
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
        O\u200e = "Failed to parse key!";
    }
}

