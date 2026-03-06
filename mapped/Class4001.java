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

@HACHIMI_CLIENT(mv=100, d1={"\u0812\u081d\u081e\u081b\u0818\u0819\u081e", "\uc37d\uc370\uc378\uc371\uc37d\uc37c\uc378\uc371", "\u53f2\u53f0\u53ff\u53f2\u53f6\u53f5\u53fe\u53f3", "\u46f3\u46fe\u46ff\u46f1\u46ff\u46f3\u46f2\u46fe", "\u3644\u3642\u3643\u3644\u3646\u3649\u3648\u3644", "\uc194\uc194\uc19c\uc195\uc194\uc191\uc194\uc193", "\ubccd\ubcca\ubcc6\ubcca\ubcca\ubcc9\ubcc8\ubcc7", "\u124d\u1248\u124d\u1249\u1249\u124f\u124f", "\ue875\ue871\ue875\ue877\ue873\ue876\ue873", "\u3bd6\u3bd5\u3bd1\u3bd1\u3bd2\u3bd8\u3bd6", "\u79f6\u79f4\u79f7\u79f0\u79f3\u79f6\u79f2\u79ff", "\u3a25\u3a25\u3a25\u3a26\u3a21\u3a24\u3a25\u3a25", "\ub7ac\ub7a3\ub7a9\ub7ad\ub7ab\ub7a9\ub7af\ub7aa", "\u1dd6\u1dd9\u1dd1\u1dd8\u1dd7\u1dd0\u1dd7", "\uac08\uac0a\uac07\uac08\uac0f\uac0c\uac0c\uac0a", "\u0e90\u0e93\u0e90\u0e94\u0e97\u0e97\u0e9b\u0e97", "\u0e2f\u0e2e\u0e2e\u0e2b\u0e2e\u0e2a\u0e2e\u0e22", "\u4894\u4894\u4890\u4896\u4897\u489b\u4895\u489a"}, d2={"\u06d6\u06f1\u06d2\u26ba\u0688\u068a\u069c\u06f8\u06de\u06d5\u06c2\u06d5\u069b\u06d8\u06d5\u06da\u06d3\u069b\u06e7\u06c0\u06c6\u06dd\u06da\u06d3\u068f\u069d\u06f8\u06de\u06d5\u06c2\u06d5\u069b\u06d8\u06d5\u06da\u06d3\u069b\u06e7\u06c0\u06c6\u06dd\u06da\u06d3\u068f", "\u02e0\u02c7\u02e5\u228c\u02be\u02bc\u02aa\u02ce\u02e8\u02e3\u02f4\u02e3\u02ad\u02ee\u02e3\u02ec\u02e5\u02ad\u02d1\u02f6\u02f0\u02eb\u02ec\u02e5\u02b9\u02ab\u02ce\u02e8\u02e3\u02f4\u02e3\u02ad\u02ee\u02e3\u02ec\u02e5\u02ad\u02d1\u02f6\u02f0\u02eb\u02ec\u02e5\u02b9", "\u0141\u0166\u014b\u212d\u011f\u011d\u010b\u016f\u0149\u0142\u0155\u0142\u010c\u014f\u0142\u014d\u0144\u010c\u0170\u0157\u0151\u014a\u014d\u0144\u0118\u010a\u016f\u0149\u0142\u0155\u0142\u010c\u014f\u0142\u014d\u0144\u010c\u0170\u0157\u0151\u014a\u014d\u0144\u0118", "'\u0000,\u204by{m\t/$3$j)$+\"j\u001617,+\"~l\t/$3$j)$+\"j\u001617,+\"~", "\u03a1\u03fe\u03f1\u03f4\u03f3\u03f4\u03e9\u03a3\u03a1\u03a3\u03b5\u03b4\u03cb", "\u0381\u03d4\u03d3\u03d4\u03c9\u0383\u0381\u0383\u0395\u0394\u03eb", "\u0583\u0581\u0590\u05a7\u0588\u0585\u0597\u0597\u05d8\u05da\u05cc\u05cd\u05a8\u058e\u0585\u0592\u0585\u05cb\u0588\u0585\u058a\u0583\u05cb\u05a7\u0588\u0585\u0597\u0597\u05df", "\u058f\u0586\u0594\u058f\u05a4\u0588\u0583\u0582\u05db\u05d9\u05cf\u05ce\u05ae", "\u0712\u0706\u0702\u0716\u071b\u0704\u074b\u0749\u075f\u073b\u071d\u0716\u0701\u0716\u0758\u071b\u0716\u0719\u0710\u0758\u0738\u0715\u071d\u0712\u0714\u0703\u074c\u075e\u072d", "\u061a\u0615\u0616\u0617\u061c\u0645\u0647\u0651\u0650\u0635\u0613\u0618\u060f\u0618\u0656\u0615\u0618\u0617\u061e\u0656\u0636\u061b\u0613\u061c\u061a\u060d\u0642", "\u0184\u019f\u01a3\u0184\u0182\u0199\u019e\u0197\u01cc\u01ce\u01d8\u01d9\u01bc\u019a\u0191\u0186\u0191\u01df\u019c\u0191\u019e\u0197\u01df\u01a3\u0184\u0182\u0199\u019e\u0197\u01cb", "\u03ae\u03af\u03b4\u03a9\u03a6\u03b9\u03fc\u03fe\u03e8\u03e9\u0396", "\u00f5\u00f4\u00ef\u00f2\u00fd\u00e2\u00da\u00f7\u00f7\u00a7\u00a5\u00b3\u00b2\u00cd", "\u02c1\u02d7\u02df\u02c2\u028a\u0288\u029e\u029f\u02e0", "\u00c8\u00de\u00d6\u00cb\u0083\u0081\u0097\u00f5\u0096\u00e9", "\u0301\u0317\u031f\u0302\u0346\u034a\u0348\u035e\u033c\u035f\u0320", "\u0147\u0151\u0159\u0144\u010c\u010e\u0118\u017a\u0179\u0119\u0166", "\u0613\u061c\u061b\u0614\u0619\u061c\u060f\u0610\u0649\u064b\u065d\u065c\u0623"})
public final class Class4001 {
    public static int field9169 = 866158544;
    public static int field9170 = -2032090551;
    public static float field9171 = 0.018635154f;
    public static int field9172 = 692074141;
    public static float field9173;
    public static float field9174 = 0.026840389f;
    public static float field9175;

    private static String vSBIdb0y4TZJnuwW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        y\u200e = "Height";
        field9173 = Float.intBitsToFloat(1051383270);
        field9175 = Float.intBitsToFloat(1062358387);
        bb\u200e = "Selection";
        bg\u200e = "EnderChestsColor";
        bR\u200e = "CollisionDistance";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite NZY6WbbfH7B1wn(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4001.vSBIdb0y4TZJnuwW(k2, 1610617197));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4001.vSBIdb0y4TZJnuwW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4001.vSBIdb0y4TZJnuwW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4001.vSBIdb0y4TZJnuwW(k2, 1610617197) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 15948 : 15949;
        block7: while (true) {
            switch (n3) {
                case 15949: {
                    n3 = 15947;
                    continue block7;
                }
                case 15948: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

