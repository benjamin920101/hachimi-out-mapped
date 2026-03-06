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
@HACHIMI_CLIENT(mv=100, d1={"\u9b2b\u9b28\u9b2a\u9b24\u9b2d\u9b2b\u9b2e\u9b2a", "\u90af\u90a8\u90ac\u90a7\u90a8\u90ae\u90a6\u90ad", "\u3577\u3572\u3574\u3571\u3575\u3572\u357a\u3576", "\u239e\u239b\u239f\u239f\u239a\u239f\u239c\u239f", "\u9e0a\u9e01\u9e00\u9e09\u9e01\u9e08\u9e08\u9e0c", "\u816f\u8168\u816f\u816c\u8168\u8169\u8162\u8162", "\ua4ac\ua4ac\ua4ac\ua4a1\ua4ab\ua4ad\ua4ac", "\u4bcb\u4bc4\u4bc5\u4bca\u4bc4\u4bc5\u4bcc\u4bc9", "\u40e0\u40e4\u40e1\u40e4\u40e4\u40e0\u40e9", "\u1964\u1966\u1960\u1964\u1964\u1960\u1964\u1961", "\ud0d1\ud0d0\ud0d7\ud0d0\ud0d2\ud0d7\ud0d1\ud0d5", "\uce31\uce37\uce31\uce3f\uce37\uce37\uce37", "\u1e62\u1e67\u1e67\u1e61\u1e67\u1e6f\u1e6f", "\uaf1d\uaf19\uaf19\uaf1f\uaf1e\uaf18\uaf1d\uaf1c", "\ud1fa\ud1f8\ud1fb\ud1fe\ud1f6\ud1ff\ud1f9\ud1fe"}, d2={"\u02db\u02d0\u02c0\u22bd\u028f\u028d\u029b\u02ff\u02d9\u02d2\u02c5\u02d2\u029c\u02df\u02d2\u02dd\u02d4\u029c\u02e0\u02c7\u02c1\u02da\u02dd\u02d4\u0288\u029a\u02ff\u02d9\u02d2\u02c5\u02d2\u029c\u02df\u02d2\u02dd\u02d4\u029c\u02e0\u02c7\u02c1\u02da\u02dd\u02d4\u0288", "\u0621\u067e\u0671\u0674\u0673\u0674\u0669\u0623\u0621\u0623\u0635\u0634\u064b", "\u012f\u017a\u017d\u017a\u0167\u012d\u012f\u012d\u013b\u013a\u0145", "\u0765\u0767\u0776\u0741\u076e\u0763\u0771\u0771\u073e\u073c\u072a\u072b\u074e\u0768\u0763\u0774\u0763\u072d\u076e\u0763\u076c\u0765\u072d\u0741\u076e\u0763\u0771\u0771\u0739", "\u05a7\u05ae\u05bc\u05a7\u058c\u05a0\u05ab\u05aa\u05f3\u05f1\u05e7\u05e6\u0586", "\u0745\u0751\u0755\u0741\u074c\u0753\u071c\u071e\u0708\u076c\u074a\u0741\u0756\u0741\u070f\u074c\u0741\u074e\u0747\u070f\u076f\u0742\u074a\u0745\u0743\u0754\u071b\u0709\u077a", "uzyxs*(>?Z|w`w9zwxq9Yt|sub-", "\u06d5\u06ce\u06f2\u06d5\u06d3\u06c8\u06cf\u06c6\u069d\u069f\u0689\u0688\u06ed\u06cb\u06c0\u06d7\u06c0\u068e\u06cd\u06c0\u06cf\u06c6\u068e\u06f2\u06d5\u06d3\u06c8\u06cf\u06c6\u069a", "\u074a\u074b\u0750\u074d\u0742\u075d\u0718\u071a\u070c\u070d\u0772", "\u045c\u045d\u0446\u045b\u0454\u044b\u0473\u045e\u045e\u040e\u040c\u041a\u041b\u0464", "\u044d\u045b\u0453\u044e\u0406\u0404\u0412\u0413\u046c", "\u05a7\u05b1\u05b9\u05a4\u05ec\u05ee\u05f8\u059a\u05f9\u0586", "\u00ec\u00fa\u00f2\u00ef\u00ab\u00a7\u00a5\u00b3\u00d1\u00b2\u00cd", "\u0651\u0647\u064f\u0652\u061a\u0618\u060e\u066c\u066f\u060f\u0670", "\u04bf\u04b0\u04b7\u04b8\u04b5\u04b0\u04a3\u04bc\u04e5\u04e7\u04f1\u04f0\u048f"})
public final class Class3829 {
    public static float field8675;
    public static float field8676;
    public static double field8677 = 0.6162353209692186;
    public static float field8678;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 3ThEvEJWeNB42Y(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3829.oQwYmgqJ9561YBSr(k2, 1105286456));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 44190 : 44191;
        block6: while (true) {
            switch (n3) {
                case 44191: {
                    n3 = 44189;
                    continue block6;
                }
                case 44190: {
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
                int a2 = Integer.parseInt(Class3829.oQwYmgqJ9561YBSr(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3829.oQwYmgqJ9561YBSr(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3829.oQwYmgqJ9561YBSr(k2, 1105286456) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        T\u200e = "AntiKick";
        field8675 = Float.intBitsToFloat(1054376782);
        field8676 = Float.intBitsToFloat(1057092444);
        field8678 = Float.intBitsToFloat(1060549928);
    }

    private static String oQwYmgqJ9561YBSr(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

