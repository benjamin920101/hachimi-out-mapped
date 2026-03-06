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
@HACHIMI_CLIENT(mv=100, d1={"\u337a\u3379\u3379\u3371\u3370\u337d\u3378\u337d", "\ua370\ua377\ua376\ua37c\ua374\ua375\ua373\ua37c", "\ue35f\ue35b\ue35b\ue359\ue35b\ue352\ue35d\ue35d", "\u9b60\u9b67\u9b64\u9b66\u9b60\u9b67\u9b65\u9b60", "\u83d8\u83de\u83db\u83d5\u83d9\u83da\u83d5\u83d4", "\u0699\u0698\u0693\u0699\u069c\u069d\u0698\u069d", "\u6441\u6447\u6440\u6441\u6447\u644a\u6444\u6442", "\u109e\u1092\u109a\u109c\u109c\u109d\u109c\u109f", "\u6df1\u6df6\u6df2\u6df5\u6df2\u6df2\u6df6\u6df0", "\uadc7\uadc5\uadcc\uadc0\uadc3\uadcd\uadc3\uadc4", "\u0e07\u0e02\u0e0b\u0e04\u0e01\u0e01\u0e03\u0e05", "\u450f\u450e\u4505\u450f\u450f\u4509\u4505", "\u6e1b\u6e1c\u6e1e\u6e1c\u6e1f\u6e11\u6e1b\u6e1c", "\u2ae4\u2ae4\u2ae7\u2ae2\u2ae6\u2ae0\u2ae8\u2ae8", "\u680c\u6808\u6808\u6807\u6808\u6808\u6807"}, d2={"\u0094\u00a2\u00ba\u20ee\u00dc\u00de\u00c8\u00ac\u008a\u0081\u0096\u0081\u00cf\u008c\u0081\u008e\u0087\u00cf\u00b3\u0094\u0092\u0089\u008e\u0087\u00db\u00c9\u00ac\u008a\u0081\u0096\u0081\u00cf\u008c\u0081\u008e\u0087\u00cf\u00b3\u0094\u0092\u0089\u008e\u0087\u00db", "\u06a6\u06f9\u06f6\u06f3\u06f4\u06f3\u06ee\u06a4\u06a6\u06a4\u06b2\u06b3\u06cc", "\u0648\u061d\u061a\u061d\u0600\u064a\u0648\u064a\u065c\u065d\u0622", "\u00b2\u00b0\u00a1\u0096\u00b9\u00b4\u00a6\u00a6\u00e9\u00eb\u00fd\u00fc\u0099\u00bf\u00b4\u00a3\u00b4\u00fa\u00b9\u00b4\u00bb\u00b2\u00fa\u0096\u00b9\u00b4\u00a6\u00a6\u00ee", "\u01fe\u01f7\u01e5\u01fe\u01d5\u01f9\u01f2\u01f3\u01aa\u01a8\u01be\u01bf\u01df", "\u00b2\u00a6\u00a2\u00b6\u00bb\u00a4\u00eb\u00e9\u00ff\u009b\u00bd\u00b6\u00a1\u00b6\u00f8\u00bb\u00b6\u00b9\u00b0\u00f8\u0098\u00b5\u00bd\u00b2\u00b4\u00a3\u00ec\u00fe\u008d", "\u0743\u074c\u074f\u074e\u0745\u071c\u071e\u0708\u0709\u076c\u074a\u0741\u0756\u0741\u070f\u074c\u0741\u074e\u0747\u070f\u076f\u0742\u074a\u0745\u0743\u0754\u071b", "\u05c7\u05dc\u05e0\u05c7\u05c1\u05da\u05dd\u05d4\u058f\u058d\u059b\u059a\u05ff\u05d9\u05d2\u05c5\u05d2\u059c\u05df\u05d2\u05dd\u05d4\u059c\u05e0\u05c7\u05c1\u05da\u05dd\u05d4\u0588", "\u0259\u0258\u0243\u025e\u0251\u024e\u020b\u0209\u021f\u021e\u0261", "\u0625\u0624\u063f\u0622\u062d\u0632\u060a\u0627\u0627\u0677\u0675\u0663\u0662\u061d", "\u073f\u0729\u0721\u073c\u0774\u0776\u0760\u0761\u071e", "\u03ce\u03d8\u03d0\u03cd\u0385\u0387\u0391\u03f3\u0390\u03ef", "\u02ce\u02d8\u02d0\u02cd\u0289\u0285\u0287\u0291\u02f3\u0290\u02ef", "\u044e\u0458\u0450\u044d\u0405\u0407\u0411\u0473\u0470\u0410\u046f", "\u05e8\u05e7\u05e0\u05ef\u05e2\u05e7\u05f4\u05eb\u05b2\u05b0\u05a6\u05a7\u05d8"})
public final class Class4153 {
    public static float field9657;
    public static float field9658;

    static {
        A\u200e = "LimitJitter";
        field9658 = Float.intBitsToFloat(0x40A00000);
        field9657 = Float.intBitsToFloat(1051495860);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String YDP7jEjsAKsDw1lW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        while (true) {
            int n2;
            int n3 = d2 < a2.length() ? 9399 : 9400;
            while ((n2 = n3) != 9399) {
                if (n2 != 9400) {
                    return c2.toString();
                }
                n3 = 9398;
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
    private static CallSite 0WklTnExgBKA5J(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4153.YDP7jEjsAKsDw1lW(k2, -675986248));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 39181 : 39180;
        while (true) {
            int n4;
            if ((n4 = n3) == 39180) {
                throw new Exception("Outdated metadata version");
            }
            if (n4 != 39181) break;
            n3 = 39179;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4153.YDP7jEjsAKsDw1lW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4153.YDP7jEjsAKsDw1lW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4153.YDP7jEjsAKsDw1lW(k2, -675986248) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

