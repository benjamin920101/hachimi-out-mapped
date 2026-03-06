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

@HACHIMI_CLIENT(mv=100, d1={"\u1e68\u1e63\u1e68\u1e6f\u1e6a\u1e68\u1e6f\u1e6d", "\u1f39\u1f3f\u1f31\u1f3b\u1f3c\u1f3e\u1f38\u1f39", "\u0aae\u0aa8\u0aaf\u0aab\u0aad\u0aa9\u0aab\u0aac", "\u53e3\u53e4\u53e0\u53e7\u53e6\u53e4\u53ef\u53e5", "\u94a0\u94a7\u94ac\u94a1\u94a2\u94ad\u94a3", "\u45bb\u45b6\u45b7\u45b9\u45b8\u45bf\u45be\u45b9", "\ubf3c\ubf3a\ubf3c\ubf3b\ubf38\ubf3d\ubf38", "\u9a85\u9a82\u9a85\u9a84\u9a87\u9a87\u9a84\u9a85", "\u28cf\u28ca\u28ca\u28cd\u28c9\u28c9\u28c4\u28c5", "\uce7a\uce78\uce77\uce76\uce7d\uce79\uce7d\uce7e", "\u7e78\u7e7d\u7e7a\u7e7d\u7e7b\u7e78\u7e7a\u7e72", "\u637f\u637a\u6373\u6378\u637f\u637f\u6378\u6378", "\u6290\u6297\u629a\u6295\u6290\u629b\u629a\u629a", "\u3b5a\u3b55\u3b5f\u3b55\u3b55\u3b5d\u3b5d\u3b5b", "\u828a\u8289\u828c\u828e\u828c\u8288\u828f\u828a", "\u69ad\u69a7\u69ab\u69ac\u69aa\u69a8\u69ad\u69a7", "\u8a52\u8a5f\u8a5e\u8a54\u8a50\u8a54\u8a57\u8a53"}, d2={"\u0514\u0503\u0512\u2574\u0546\u0544\u0552\u0536\u0510\u051b\u050c\u051b\u0555\u0516\u051b\u0514\u051d\u0555\u0529\u050e\u0508\u0513\u0514\u051d\u0541\u0553\u0536\u0510\u051b\u050c\u051b\u0555\u0516\u051b\u0514\u051d\u0555\u0529\u050e\u0508\u0513\u0514\u051d\u0541", "\u02f4\u02e3\u02f3\u2294\u02a6\u02a4\u02b2\u02d6\u02f0\u02fb\u02ec\u02fb\u02b5\u02f6\u02fb\u02f4\u02fd\u02b5\u02c9\u02ee\u02e8\u02f3\u02f4\u02fd\u02a1\u02b3\u02d6\u02f0\u02fb\u02ec\u02fb\u02b5\u02f6\u02fb\u02f4\u02fd\u02b5\u02c9\u02ee\u02e8\u02f3\u02f4\u02fd\u02a1", "\u0761\u0776\u0765\u2701\u0733\u0731\u0727\u0743\u0765\u076e\u0779\u076e\u0720\u0763\u076e\u0761\u0768\u0720\u075c\u077b\u077d\u0766\u0761\u0768\u0734\u0726\u0743\u0765\u076e\u0779\u076e\u0720\u0763\u076e\u0761\u0768\u0720\u075c\u077b\u077d\u0766\u0761\u0768\u0734", "\u047b\u0424\u042b\u042e\u0429\u042e\u0433\u0479\u047b\u0479\u046f\u046e\u0411", "\u0530\u0565\u0562\u0565\u0578\u0532\u0530\u0532\u0524\u0525\u055a", "\u039a\u0398\u0389\u03be\u0391\u039c\u038e\u038e\u03c1\u03c3\u03d5\u03d4\u03b1\u0397\u039c\u038b\u039c\u03d2\u0391\u039c\u0393\u039a\u03d2\u03be\u0391\u039c\u038e\u038e\u03c6", "\u0564\u056d\u057f\u0564\u054f\u0563\u0568\u0569\u0530\u0532\u0524\u0525\u0545", "\u01a4\u01b0\u01b4\u01a0\u01ad\u01b2\u01fd\u01ff\u01e9\u018d\u01ab\u01a0\u01b7\u01a0\u01ee\u01ad\u01a0\u01af\u01a6\u01ee\u018e\u01a3\u01ab\u01a4\u01a2\u01b5\u01fa\u01e8\u019b", "\u05e9\u05e6\u05e5\u05e4\u05ef\u05b6\u05b4\u05a2\u05a3\u05c6\u05e0\u05eb\u05fc\u05eb\u05a5\u05e6\u05eb\u05e4\u05ed\u05a5\u05c5\u05e8\u05e0\u05ef\u05e9\u05fe\u05b1", "\u0505\u051e\u0522\u0505\u0503\u0518\u051f\u0516\u054d\u054f\u0559\u0558\u053d\u051b\u0510\u0507\u0510\u055e\u051d\u0510\u051f\u0516\u055e\u0522\u0505\u0503\u0518\u051f\u0516\u054a", "CBYDKT\u0011\u0013\u0005\u0004{", "\u07ce\u07cf\u07d4\u07c9\u07c6\u07d9\u07e1\u07cc\u07cc\u079c\u079e\u0788\u0789\u07f6", "\u02b8\u02ae\u02a6\u02bb\u02f3\u02f1\u02e7\u02e6\u0299", "\u06b2\u06a4\u06ac\u06b1\u06f9\u06fb\u06ed\u068f\u06ec\u0693", "\u04bb\u04ad\u04a5\u04b8\u04fc\u04f0\u04f2\u04e4\u0486\u04e5\u049a", "\u02c6\u02d0\u02d8\u02c5\u028d\u028f\u0299\u02fb\u02f8\u0298\u02e7", "\u064f\u0640\u0647\u0648\u0645\u0640\u0653\u064c\u0615\u0617\u0601\u0600\u067f"})
public final class Class5494 {
    public static float field10310;
    public static float field10311 = 0.5932445f;
    public static float field10312;
    public static float field10313;
    public static float field10314;
    public static double field10315;
    public static double field10316;

    static {
        field10312 = Float.intBitsToFloat(1059326401);
        field10310 = Float.intBitsToFloat(1058853354);
        I\u200e = "Kill Count";
        field10313 = Float.intBitsToFloat(1097859072);
        field10316 = Double.longBitsToDouble(4594482643066162616L);
        ar\u200e = "Place a block at targets head";
        aA\u200e = "SwapAction";
        field10315 = Double.longBitsToDouble(4601824097184618068L);
        field10314 = Float.intBitsToFloat(1061834646);
    }

    private static String CjLRNr7QVe5ezJOD(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite RVJWprVG4o2DQi(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5494.CjLRNr7QVe5ezJOD(k2, 1664702037));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 9400 : 9401;
        block6: while (true) {
            switch (n3) {
                case 9401: {
                    n3 = 9399;
                    continue block6;
                }
                case 9400: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class5494.CjLRNr7QVe5ezJOD(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5494.CjLRNr7QVe5ezJOD(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class5494.CjLRNr7QVe5ezJOD(k2, 1664702037) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

