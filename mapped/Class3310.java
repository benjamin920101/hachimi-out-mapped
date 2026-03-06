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

@HACHIMI_CLIENT(mv=100, d1={"\u1bde\u1bd0\u1bd8\u1bda\u1bd9\u1bda\u1bdb\u1bd0", "\u1152\u1151\u1150\u1153\u1156\u1156\u1153\u1152", "\u887f\u8879\u887c\u8879\u8878\u887d\u887f", "\u7e97\u7e9f\u7e9f\u7e9e\u7e92\u7e96\u7e97\u7e91", "\u8506\u8503\u8502\u8507\u8501\u8503\u8502\u8503", "\u2f7d\u2f7c\u2f71\u2f78\u2f78\u2f7d\u2f7a\u2f71", "\ue581\ue581\ue580\ue587\ue586\ue588\ue584\ue585", "\u8ba7\u8ba5\u8ba2\u8ba4\u8ba4\u8bad\u8ba0\u8ba6", "\ud8d2\ud8d0\ud8d2\ud8d3\ud8d6\ud8d2\ud8d4\ud8df", "\u8d7f\u8d74\u8d7f\u8d7a\u8d75\u8d7b\u8d7b\u8d7d", "\u6325\u6324\u6323\u6323\u6328\u6320\u6323\u6325", "\u9796\u979d\u9795\u9792\u9796\u9795\u979d\u9797", "\ub298\ub29c\ub29b\ub29f\ub29f\ub29c\ub29d\ub29e", "\ube14\ube10\ube14\ube11\ube14\ube18\ube13\ube10", "\ud9f8\ud9fc\ud9fa\ud9f2\ud9f8\ud9fb\ud9fc\ud9f9", "\u8d89\u8d8b\u8d89\u8d8b\u8d80\u8d80\u8d8a\u8d88", "\ud514\ud511\ud512\ud511\ud514\ud517\ud517\ud51f", "\u9d29\u9d2e\u9d2d\u9d2c\u9d2b\u9d23\u9d2e\u9d23"}, d2={"\u0442\u046b\u044d\u2421\u0413\u0411\u0407\u0463\u0445\u044e\u0459\u044e\u0400\u0443\u044e\u0441\u0448\u0400\u047c\u045b\u045d\u0446\u0441\u0448\u0414\u0406\u0463\u0445\u044e\u0459\u044e\u0400\u0443\u044e\u0441\u0448\u0400\u047c\u045b\u045d\u0446\u0441\u0448\u0414", "\u0148\u0161\u0146\u212b\u0119\u011b\u010d\u0169\u014f\u0144\u0153\u0144\u010a\u0149\u0144\u014b\u0142\u010a\u0176\u0151\u0157\u014c\u014b\u0142\u011e\u010c\u0169\u014f\u0144\u0153\u0144\u010a\u0149\u0144\u014b\u0142\u010a\u0176\u0151\u0157\u014c\u014b\u0142\u011e", "\u0799\u07b0\u0790\u27fa\u07c8\u07ca\u07dc\u07b8\u079e\u0795\u0782\u0795\u07db\u0798\u0795\u079a\u0793\u07db\u07a7\u0780\u0786\u079d\u079a\u0793\u07cf\u07dd\u07b8\u079e\u0795\u0782\u0795\u07db\u0798\u0795\u079a\u0793\u07db\u07a7\u0780\u0786\u079d\u079a\u0793\u07cf", "\u0482\u04ab\u048a\u24e1\u04d3\u04d1\u04c7\u04a3\u0485\u048e\u0499\u048e\u04c0\u0483\u048e\u0481\u0488\u04c0\u04bc\u049b\u049d\u0486\u0481\u0488\u04d4\u04c6\u04a3\u0485\u048e\u0499\u048e\u04c0\u0483\u048e\u0481\u0488\u04c0\u04bc\u049b\u049d\u0486\u0481\u0488\u04d4", "\u0456\u0409\u0406\u0403\u0404\u0403\u041e\u0454\u0456\u0454\u0442\u0443\u043c", "\u010b\u015e\u0159\u015e\u0143\u0109\u010b\u0109\u011f\u011e\u0161", "\u0296\u0294\u0285\u02b2\u029d\u0290\u0282\u0282\u02cd\u02cf\u02d9\u02d8\u02bd\u029b\u0290\u0287\u0290\u02de\u029d\u0290\u029f\u0296\u02de\u02b2\u029d\u0290\u0282\u0282\u02ca", "\u03ae\u03a7\u03b5\u03ae\u0385\u03a9\u03a2\u03a3\u03fa\u03f8\u03ee\u03ef\u038f", "\u01b8\u01ac\u01a8\u01bc\u01b1\u01ae\u01e1\u01e3\u01f5\u0191\u01b7\u01bc\u01ab\u01bc\u01f2\u01b1\u01bc\u01b3\u01ba\u01f2\u0192\u01bf\u01b7\u01b8\u01be\u01a9\u01e6\u01f4\u0187", "\u05b8\u05b7\u05b4\u05b5\u05be\u05e7\u05e5\u05f3\u05f2\u0597\u05b1\u05ba\u05ad\u05ba\u05f4\u05b7\u05ba\u05b5\u05bc\u05f4\u0594\u05b9\u05b1\u05be\u05b8\u05af\u05e0", "\u00e9\u00f2\u00ce\u00e9\u00ef\u00f4\u00f3\u00fa\u00a1\u00a3\u00b5\u00b4\u00d1\u00f7\u00fc\u00eb\u00fc\u00b2\u00f1\u00fc\u00f3\u00fa\u00b2\u00ce\u00e9\u00ef\u00f4\u00f3\u00fa\u00a6", "\u00fb\u00fa\u00e1\u00fc\u00f3\u00ec\u00a9\u00ab\u00bd\u00bc\u00c3", "\u0739\u0738\u0723\u073e\u0731\u072e\u0716\u073b\u073b\u076b\u0769\u077f\u077e\u0701", "\u033e\u0328\u0320\u033d\u0375\u0377\u0361\u0360\u031f", "\u05cf\u05d9\u05d1\u05cc\u0584\u0586\u0590\u05f2\u0591\u05ee", "\u0454\u0442\u044a\u0457\u0413\u041f\u041d\u040b\u0469\u040a\u0475", "\u0221\u0237\u023f\u0222\u026a\u0268\u027e\u021c\u021f\u027f\u0200", "\u07e4\u07eb\u07ec\u07e3\u07ee\u07eb\u07f8\u07e7\u07be\u07bc\u07aa\u07ab\u07d4"})
public final class Class3310 {
    public static float field7126;
    public static double field7127;
    public static float field7128;
    public static double field7129;

    /*
     * WARNING - void declaration
     */
    private static CallSite np49melWKeICT4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3310.oIguQFveMuI08Btg(k2, -293757287));
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
                int a2 = Integer.parseInt(Class3310.oIguQFveMuI08Btg(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3310.oIguQFveMuI08Btg(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3310.oIguQFveMuI08Btg(k2, -293757287) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String oIguQFveMuI08Btg(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7128 = Float.intBitsToFloat(0x3DCCCCCD);
        V\u200e = "Spoofs the ground state to prevent the server from knowing when the player jumps";
        field7127 = Double.longBitsToDouble(4605972198943136959L);
        aH\u200e = "DELETE";
        field7126 = Float.intBitsToFloat(-1082130432);
        bf\u200e = "MaxPlacements";
        bn\u200e = "Assuming it has been broken";
        field7129 = Double.longBitsToDouble(4604658776521065553L);
    }
}

