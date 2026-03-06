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

@HACHIMI_CLIENT(mv=100, d1={"\ub532\ub532\ub531\ub535\ub531\ub538\ub530\ub534", "\u880e\u8803\u8803\u8807\u8803\u8804\u8807", "\u918b\u9188\u918c\u918d\u918a\u918a\u9189\u9186", "\u72b1\u72b2\u72b4\u72b3\u72bb\u72b3\u72b5\u72b0", "\uac5f\uac5a\uac5d\uac55\uac59\uac5e\uac5f\uac55", "\u23d8\u23dd\u23de\u23da\u23dc\u23dd\u23d8\u23dd", "\u2434\u2430\u2437\u2436\u2430\u2432\u2430", "\ud333\ud330\ud336\ud332\ud333\ud336\ud337\ud334", "\u8067\u806c\u8068\u806c\u806f\u8069", "\u4157\u4151\u415f\u4152\u4155\u4155\u415f\u415f", "\ud167\ud169\ud166\ud169\ud163\ud162\ud167\ud162", "\ue1f5\ue1f6\ue1f5\ue1fb\ue1fa\ue1f5\ue1f3\ue1fa", "\u18d5\u18dc\u18d5\u18d5\u18d5\u18d3\u18d4\u18d4", "\udad0\udad7\udad0\udad6\udada\udad4\udad6\udad7", "\u6a17\u6a1f\u6a15\u6a1e\u6a15\u6a17\u6a1f\u6a1f"}, d2={"\u068e\u06ad\u0689\u26f3\u06c1\u06c3\u06d5\u06b1\u0697\u069c\u068b\u069c\u06d2\u0691\u069c\u0693\u069a\u06d2\u06ae\u0689\u068f\u0694\u0693\u069a\u06c6\u06d4\u06b1\u0697\u069c\u068b\u069c\u06d2\u0691\u069c\u0693\u069a\u06d2\u06ae\u0689\u068f\u0694\u0693\u069a\u06c6", "\u03b3\u03ec\u03e3\u03e6\u03e1\u03e6\u03fb\u03b1\u03b3\u03b1\u03a7\u03a6\u03d9", "\u070a\u075f\u0758\u075f\u0742\u0708\u070a\u0708\u071e\u071f\u0760", "\u0568\u056a\u057b\u054c\u0563\u056e\u057c\u057c\u0533\u0531\u0527\u0526\u0543\u0565\u056e\u0579\u056e\u0520\u0563\u056e\u0561\u0568\u0520\u054c\u0563\u056e\u057c\u057c\u0534", "\u0714\u071d\u070f\u0714\u073f\u0713\u0718\u0719\u0740\u0742\u0754\u0755\u0735", "\u0702\u0716\u0712\u0706\u070b\u0714\u075b\u0759\u074f\u072b\u070d\u0706\u0711\u0706\u0748\u070b\u0706\u0709\u0700\u0748\u0728\u0705\u070d\u0702\u0704\u0713\u075c\u074e\u073d", "\u00aa\u00a5\u00a6\u00a7\u00ac\u00f5\u00f7\u00e1\u00e0\u0085\u00a3\u00a8\u00bf\u00a8\u00e6\u00a5\u00a8\u00a7\u00ae\u00e6\u0086\u00ab\u00a3\u00ac\u00aa\u00bd\u00f2", "\u00a4\u00bf\u0083\u00a4\u00a2\u00b9\u00be\u00b7\u00ec\u00ee\u00f8\u00f9\u009c\u00ba\u00b1\u00a6\u00b1\u00ff\u00bc\u00b1\u00be\u00b7\u00ff\u0083\u00a4\u00a2\u00b9\u00be\u00b7\u00eb", "\u0659\u0658\u0643\u065e\u0651\u064e\u060b\u0609\u061f\u061e\u0661", "\u057c\u057d\u0566\u057b\u0574\u056b\u0553\u057e\u057e\u052e\u052c\u053a\u053b\u0544", "\u07c2\u07d4\u07dc\u07c1\u0789\u078b\u079d\u079c\u07e3", "\u023d\u022b\u0223\u023e\u0276\u0274\u0262\u0200\u0263\u021c", "\u00be\u00a8\u00a0\u00bd\u00f9\u00f5\u00f7\u00e1\u0083\u00e0\u009f", "\u05c8\u05de\u05d6\u05cb\u0583\u0581\u0597\u05f5\u05f6\u0596\u05e9", "\u0715\u071a\u071d\u0712\u071f\u071a\u0709\u0716\u074f\u074d\u075b\u075a\u0725"})
public final class Class3564 {
    public static int field7916 = 153749822;
    public static float field7917;
    public static float field7918;
    public static double field7919;

    private static String cbq3t1ifNbQSSjDS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7918 = Float.intBitsToFloat(993148672);
        field7917 = Float.intBitsToFloat(1060746915);
        field7919 = Double.longBitsToDouble(4588620204765409728L);
        aW\u200e = "distance";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ITlDNPOLgvOjGr(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3564.cbq3t1ifNbQSSjDS(k2, 1744718003));
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
                int a2 = Integer.parseInt(Class3564.cbq3t1ifNbQSSjDS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3564.cbq3t1ifNbQSSjDS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3564.cbq3t1ifNbQSSjDS(k2, 1744718003) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

