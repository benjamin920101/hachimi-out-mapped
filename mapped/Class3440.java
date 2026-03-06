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
@HACHIMI_CLIENT(mv=100, d1={"\u4a02\u4a0f\u4a01\u4a0f\u4a05\u4a01\u4a03\u4a03", "\u4af9\u4afe\u4afb\u4afd\u4af9\u4af5", "\u4288\u428a\u4289\u428b\u428b\u428b\u428a\u428b", "\u491b\u491f\u491c\u4910\u4918\u4918\u4910\u4919", "\u38bd\u38bc\u38b6\u38ba\u38b9\u38bc\u38b6\u38bc", "\ue7b5\ue7b5\ue7b6\ue7b9\ue7b7\ue7b4\ue7b6\ue7b3", "\u79f1\u79f0\u79f7\u79f0\u79f3\u79f5\u79f1\u79f2", "\u1caa\u1caf\u1cab\u1caf\u1caf\u1caf\u1cad\u1ca8", "\u86ff\u86fd\u86fa\u86fd\u86fd\u86fa\u86f5\u86f5", "\ue835\ue837\ue831\ue832\ue835\ue831\ue834\ue834", "\u8251\u8251\u8255\u825c\u8257\u8255\u8252\u8256", "\u5e2e\u5e2e\u5e24\u5e25\u5e2f\u5e25\u5e24\u5e2c", "\ucfe4\ucfe8\ucfef\ucfef\ucfea\ucfea\ucfeb", "\ua62a\ua629\ua629\ua627\ua62e\ua62d\ua62c\ua62b", "\ucfd3\ucfd7\ucfd7\ucfd5\ucfd2\ucfd7\ucfd9\ucfd7"}, d2={"\u01f8\u01e3\u01c2\u219b\u01a9\u01ab\u01bd\u01d9\u01ff\u01f4\u01e3\u01f4\u01ba\u01f9\u01f4\u01fb\u01f2\u01ba\u01c6\u01e1\u01e7\u01fc\u01fb\u01f2\u01ae\u01bc\u01d9\u01ff\u01f4\u01e3\u01f4\u01ba\u01f9\u01f4\u01fb\u01f2\u01ba\u01c6\u01e1\u01e7\u01fc\u01fb\u01f2\u01ae", "\u07cf\u0790\u079f\u079a\u079d\u079a\u0787\u07cd\u07cf\u07cd\u07db\u07da\u07a5", "\u0437\u0462\u0465\u0462\u047f\u0435\u0437\u0435\u0423\u0422\u045d", "\u0444\u0446\u0457\u0460\u044f\u0442\u0450\u0450\u041f\u041d\u040b\u040a\u046f\u0449\u0442\u0455\u0442\u040c\u044f\u0442\u044d\u0444\u040c\u0460\u044f\u0442\u0450\u0450\u0418", "\u05c9\u05c0\u05d2\u05c9\u05e2\u05ce\u05c5\u05c4\u059d\u059f\u0589\u0588\u05e8", "\u045e\u044a\u044e\u045a\u0457\u0448\u0407\u0405\u0413\u0477\u0451\u045a\u044d\u045a\u0414\u0457\u045a\u0455\u045c\u0414\u0474\u0459\u0451\u045e\u0458\u044f\u0400\u0412\u0461", "\u01ed\u01e2\u01e1\u01e0\u01eb\u01b2\u01b0\u01a6\u01a7\u01c2\u01e4\u01ef\u01f8\u01ef\u01a1\u01e2\u01ef\u01e0\u01e9\u01a1\u01c1\u01ec\u01e4\u01eb\u01ed\u01fa\u01b5", "\u0082\u0099\u00a5\u0082\u0084\u009f\u0098\u0091\u00ca\u00c8\u00de\u00df\u00ba\u009c\u0097\u0080\u0097\u00d9\u009a\u0097\u0098\u0091\u00d9\u00a5\u0082\u0084\u009f\u0098\u0091\u00cd", "\u0532\u0533\u0528\u0535\u053a\u0525\u0560\u0562\u0574\u0575\u050a", "\u042f\u042e\u0435\u0428\u0427\u0438\u0400\u042d\u042d\u047d\u047f\u0469\u0468\u0417", "\u064f\u0659\u0651\u064c\u0604\u0606\u0610\u0611\u066e", "\u02ed\u02fb\u02f3\u02ee\u02a6\u02a4\u02b2\u02d0\u02b3\u02cc", "\u065e\u0648\u0640\u065d\u0619\u0615\u0617\u0601\u0663\u0600\u067f", "\u07e8\u07fe\u07f6\u07eb\u07a3\u07a1\u07b7\u07d5\u07d6\u07b6\u07c9", "\u0425\u042a\u042d\u0422\u042f\u042a\u0439\u0426\u047f\u047d\u046b\u046a\u0415"})
public final class Class3440 {
    public static double field7501;
    public static double field7502 = 0.6485907841533428;
    public static int field7503 = 1010683914;
    public static double field7504 = 0.5879476137716181;
    public static float field7505;
    public static double field7506;
    public static double field7507;
    public static float field7508;

    static {
        field7506 = Double.longBitsToDouble(4588831892845004384L);
        field7501 = Double.longBitsToDouble(4603432399681186552L);
        field7508 = Float.intBitsToFloat(1016003125);
        K\u200e = "Bind";
        field7505 = Float.intBitsToFloat(1053068124);
        field7507 = Double.longBitsToDouble(4599327971384909916L);
    }

    private static String eJJMNWRyWTA6KPZj(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 1jzZzFgO41y5m7(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3440.eJJMNWRyWTA6KPZj(k2, -474432794));
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
                int a2 = Integer.parseInt(Class3440.eJJMNWRyWTA6KPZj(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3440.eJJMNWRyWTA6KPZj(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3440.eJJMNWRyWTA6KPZj(k2, -474432794) + " " + l2 + " " + m2);
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

