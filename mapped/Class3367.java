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
@HACHIMI_CLIENT(mv=100, d1={"\u7f7f\u7f74\u7f74\u7f75\u7f74\u7f7a\u7f7b\u7f7d", "\u7153\u7156\u7152\u7151\u7157\u7150\u7152\u7150", "\u7542\u7544\u7542\u7540\u7546\u754f\u7546\u7543", "\u1465\u1465\u1466\u1461\u1467\u1463\u1466\u1466", "\ud3f0\ud3f1\ud3f6\ud3f4\ud3f5\ud3f3\ud3f1\ud3f5", "\u4669\u466d\u466f\u4665\u4665\u466d\u4668", "\u06f9\u06ff\u06fe\u06f8\u06ff\u06ff\u06ff", "\u2ed7\u2ed4\u2ed5\u2ed6\u2ed0\u2ed3\u2ed7\u2ed3", "\u2e89\u2e83\u2e88\u2e8a\u2e8a\u2e8e\u2e8c\u2e82", "\uaff7\uaff2\uaffa\uaff4\uaff0\uaff2\uaff1\uaff0", "\u603b\u6039\u6039\u603d\u6038\u603a\u603d\u603b", "\uacba\uacb6\uacb9\uacbe\uacbc\uacbc\uacba\uacbd", "\ucb0e\ucb03\ucb0b\ucb0d\ucb0b\ucb0e\ucb0f\ucb0e", "\uba43\uba47\uba44\uba46\uba41\uba47\uba4f\uba41", "\u249d\u249a\u249d\u249b\u2498\u249e\u249b", "\ud8bc\ud8b9\ud8b9\ud8bb\ud8ba\ud8be\ud8bc\ud8bf", "\ucfd4\ucfd6\ucfdb\ucfd3\ucfd2\ucfd5\ucfdb\ucfd3", "\u5b31\u5b35\u5b33\u5b34\u5b3e\u5b37\u5b34\u5b3e"}, d2={"\u04dc\u04f4\u04c7\u24bf\u048d\u048f\u0499\u04fd\u04db\u04d0\u04c7\u04d0\u049e\u04dd\u04d0\u04df\u04d6\u049e\u04e2\u04c5\u04c3\u04d8\u04df\u04d6\u048a\u0498\u04fd\u04db\u04d0\u04c7\u04d0\u049e\u04dd\u04d0\u04df\u04d6\u049e\u04e2\u04c5\u04c3\u04d8\u04df\u04d6\u048a", "\u0268\u0240\u0272\u220b\u0239\u023b\u022d\u0249\u026f\u0264\u0273\u0264\u022a\u0269\u0264\u026b\u0262\u022a\u0256\u0271\u0277\u026c\u026b\u0262\u023e\u022c\u0249\u026f\u0264\u0273\u0264\u022a\u0269\u0264\u026b\u0262\u022a\u0256\u0271\u0277\u026c\u026b\u0262\u023e", "\u078c\u07a4\u0799\u27ef\u07dd\u07df\u07c9\u07ad\u078b\u0780\u0797\u0780\u07ce\u078d\u0780\u078f\u0786\u07ce\u07b2\u0795\u0793\u0788\u078f\u0786\u07da\u07c8\u07ad\u078b\u0780\u0797\u0780\u07ce\u078d\u0780\u078f\u0786\u07ce\u07b2\u0795\u0793\u0788\u078f\u0786\u07da", "\u0113\u013b\u0107\u2170\u0142\u0140\u0156\u0132\u0114\u011f\u0108\u011f\u0151\u0112\u011f\u0110\u0119\u0151\u012d\u010a\u010c\u0117\u0110\u0119\u0145\u0157\u0132\u0114\u011f\u0108\u011f\u0151\u0112\u011f\u0110\u0119\u0151\u012d\u010a\u010c\u0117\u0110\u0119\u0145", "\u000bT[^Y^C\t\u000b\t\u001f\u001ea", "\u00fa\u00af\u00a8\u00af\u00b2\u00f8\u00fa\u00f8\u00ee\u00ef\u0090", "\u0188\u018a\u019b\u01ac\u0183\u018e\u019c\u019c\u01d3\u01d1\u01c7\u01c6\u01a3\u0185\u018e\u0199\u018e\u01c0\u0183\u018e\u0181\u0188\u01c0\u01ac\u0183\u018e\u019c\u019c\u01d4", "\u062d\u0624\u0636\u062d\u0606\u062a\u0621\u0620\u0679\u067b\u066d\u066c\u060c", "\u051b\u050f\u050b\u051f\u0512\u050d\u0542\u0540\u0556\u0532\u0514\u051f\u0508\u051f\u0551\u0512\u051f\u0510\u0519\u0551\u0531\u051c\u0514\u051b\u051d\u050a\u0545\u0557\u0524", "\u0785\u078a\u0789\u0788\u0783\u07da\u07d8\u07ce\u07cf\u07aa\u078c\u0787\u0790\u0787\u07c9\u078a\u0787\u0788\u0781\u07c9\u07a9\u0784\u078c\u0783\u0785\u0792\u07dd", "\u010b\u0110\u012c\u010b\u010d\u0116\u0111\u0118\u0143\u0141\u0157\u0156\u0133\u0115\u011e\u0109\u011e\u0150\u0113\u011e\u0111\u0118\u0150\u012c\u010b\u010d\u0116\u0111\u0118\u0144", "\u01a2\u01a3\u01b8\u01a5\u01aa\u01b5\u01f0\u01f2\u01e4\u01e5\u019a", "\u05ec\u05ed\u05f6\u05eb\u05e4\u05fb\u05c3\u05ee\u05ee\u05be\u05bc\u05aa\u05ab\u05d4", "\u073e\u0728\u0720\u073d\u0775\u0777\u0761\u0760\u071f", "\u02bb\u02ad\u02a5\u02b8\u02f0\u02f2\u02e4\u0286\u02e5\u029a", "\u06a2\u06b4\u06bc\u06a1\u06e5\u06e9\u06eb\u06fd\u069f\u06fc\u0683", "<*\"?wuc\u0001\u0002b\u001d", "\u034a\u0345\u0342\u034d\u0340\u0345\u0356\u0349\u0310\u0312\u0304\u0305\u037a"})
public final class Class3367 {
    public static double field7303;

    private static String 1qFLvxt8A0iMmGwO(String a2, int b2) {
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
    private static CallSite UQulIoRZhs66Vj(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3367.1qFLvxt8A0iMmGwO(k2, 1316858295));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3367.1qFLvxt8A0iMmGwO(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3367.1qFLvxt8A0iMmGwO(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3367.1qFLvxt8A0iMmGwO(k2, 1316858295) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 == 1 ? 33316 : 33317;
        block7: while (true) {
            switch (n3) {
                case 33317: {
                    n3 = 33315;
                    continue block7;
                }
                case 33316: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        f\u200e = "VehiclesBox";
        J\u200e = "module";
        L\u200e = "ClientCommand";
        field7303 = Double.longBitsToDouble(-4631501856787818086L);
        bQ\u200e = "TargetDamage";
    }
}

