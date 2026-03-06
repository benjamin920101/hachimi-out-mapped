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
@HACHIMI_CLIENT(mv=100, d1={"\u390b\u390b\u390e\u390e\u3903\u390f\u3903\u390e", "\u3a3d\u3a3d\u3a3e\u3a3d\u3a3b\u3a38\u3a3f\u3a3d", "\ub29d\ub29b\ub298\ub295\ub299\ub295\ub298\ub29d", "\u8fb3\u8fbc\u8fb2\u8fb2\u8fb2\u8fbc\u8fbd\u8fbd", "\u882b\u882c\u882b\u882b\u882f\u8828\u8829\u8828", "\u3cf8\u3cfe\u3cfb\u3cfb\u3cfe\u3cfc\u3cfa\u3cfd", "\u6ba7\u6ba7\u6bab\u6ba2\u6ba7\u6ba7\u6ba3\u6ba0", "\u57b5\u57ba\u57b3\u57b7\u57bb\u57ba\u57b5\u57b5", "\uc2bb\uc2bb\uc2b8\uc2bc\uc2bc\uc2bb\uc2bf\uc2b0", "\u0825\u0824\u0827\u0821\u0823\u0826\u082a\u0822", "\u80bb\u80b1\u80b8\u80bc\u80b9\u80b8\u80b1", "\ua8f0\ua8fd\ua8f1\ua8f3\ua8fd\ua8f3\ua8f7\ua8f7", "\u126b\u1260\u126b\u1267\u126b\u126a", "\u64c9\u64cb\u64cf\u64cb\u64c6\u64c9\u64cc\u64cf", "\u7fd2\u7fd9\u7fd8\u7fd9\u7fd2\u7fd1\u7fd0\u7fd4", "\u6e72\u6e76\u6e71\u6e72\u6e77\u6e74\u6e73\u6e7c", "\u66e5\u66e3\u66e7\u66e4\u66e6\u66e7\u66e3\u66e4", "\u5587\u5582\u5583\u5584\u5580\u5583\u5586", "\u7e76\u7e77\u7e72\u7e77\u7e72\u7e71\u7e77\u7e73"}, d2={"\u05ad\u0597\u0597\u25c8\u05fa\u05f8\u05ee\u058a\u05ac\u05a7\u05b0\u05a7\u05e9\u05aa\u05a7\u05a8\u05a1\u05e9\u0595\u05b2\u05b4\u05af\u05a8\u05a1\u05fd\u05ef\u058a\u05ac\u05a7\u05b0\u05a7\u05e9\u05aa\u05a7\u05a8\u05a1\u05e9\u0595\u05b2\u05b4\u05af\u05a8\u05a1\u05fd", "\u06c8\u06f2\u06f1\u26ad\u069f\u069d\u068b\u06ef\u06c9\u06c2\u06d5\u06c2\u068c\u06cf\u06c2\u06cd\u06c4\u068c\u06f0\u06d7\u06d1\u06ca\u06cd\u06c4\u0698\u068a\u06ef\u06c9\u06c2\u06d5\u06c2\u068c\u06cf\u06c2\u06cd\u06c4\u068c\u06f0\u06d7\u06d1\u06ca\u06cd\u06c4\u0698", "\u0315\u032f\u032d\u2370\u0342\u0340\u0356\u0332\u0314\u031f\u0308\u031f\u0351\u0312\u031f\u0310\u0319\u0351\u032d\u030a\u030c\u0317\u0310\u0319\u0345\u0357\u0332\u0314\u031f\u0308\u031f\u0351\u0312\u031f\u0310\u0319\u0351\u032d\u030a\u030c\u0317\u0310\u0319\u0345", "\u0748\u0772\u0777\u272d\u071f\u071d\u070b\u076f\u0749\u0742\u0755\u0742\u070c\u074f\u0742\u074d\u0744\u070c\u0770\u0757\u0751\u074a\u074d\u0744\u0718\u070a\u076f\u0749\u0742\u0755\u0742\u070c\u074f\u0742\u074d\u0744\u070c\u0770\u0757\u0751\u074a\u074d\u0744\u0718", "\u0010*.\u2075GES7\u0011\u001a\r\u001aT\u0017\u001a\u0015\u001cT(\u000f\t\u0012\u0015\u001c@R7\u0011\u001a\r\u001aT\u0017\u001a\u0015\u001cT(\u000f\t\u0012\u0015\u001c@", "\u0606\u0659\u0656\u0653\u0654\u0653\u064e\u0604\u0606\u0604\u0612\u0613\u066c", "\u02f4\u02a1\u02a6\u02a1\u02bc\u02f6\u02f4\u02f6\u02e0\u02e1\u029e", "\u0002\u0000\u0011&\t\u0004\u0016\u0016Y[ML)\u000f\u0004\u0013\u0004J\t\u0004\u000b\u0002J&\t\u0004\u0016\u0016^", "\u067b\u0672\u0660\u067b\u0650\u067c\u0677\u0676\u062f\u062d\u063b\u063a\u065a", "\u0115\u0101\u0105\u0111\u011c\u0103\u014c\u014e\u0158\u013c\u011a\u0111\u0106\u0111\u015f\u011c\u0111\u011e\u0117\u015f\u013f\u0112\u011a\u0115\u0113\u0104\u014b\u0159\u012a", "\u00da\u00d5\u00d6\u00d7\u00dc\u0085\u0087\u0091\u0090\u00f5\u00d3\u00d8\u00cf\u00d8\u0096\u00d5\u00d8\u00d7\u00de\u0096\u00f6\u00db\u00d3\u00dc\u00da\u00cd\u0082", "\u0597\u058c\u05b0\u0597\u0591\u058a\u058d\u0584\u05df\u05dd\u05cb\u05ca\u05af\u0589\u0582\u0595\u0582\u05cc\u058f\u0582\u058d\u0584\u05cc\u05b0\u0597\u0591\u058a\u058d\u0584\u05d8", "\u0268\u0269\u0272\u026f\u0260\u027f\u023a\u0238\u022e\u022f\u0250", "\u0415\u0414\u040f\u0412\u041d\u0402\u043a\u0417\u0417\u0447\u0445\u0453\u0452\u042d", "\u0799\u078f\u0787\u079a\u07d2\u07d0\u07c6\u07c7\u07b8", "\u064a\u065c\u0654\u0649\u0601\u0603\u0615\u0677\u0614\u066b", "lzro+'%3Q2M", "\u0241\u0257\u025f\u0242\u020a\u0208\u021e\u027c\u027f\u021f\u0260", "\u05c2\u05cd\u05ca\u05c5\u05c8\u05cd\u05de\u05c1\u0598\u059a\u058c\u058d\u05f2"})
public final class Class4119 {
    public static long field9548 = 7489339255351411370L;
    public static float field9549;
    public static int field9550 = 1;
    public static float field9551;
    public static float field9552;
    public static float field9553;

    static {
        field9552 = Float.intBitsToFloat(1054517216);
        at\u200e = "SPHERE";
        ax\u200e = "The obstacles to destroy";
        field9549 = Float.intBitsToFloat(1054258268);
        aJ\u200e = "samples";
        aO\u200e = "Motion speed";
        field9551 = Float.intBitsToFloat(0x3DCCCCCD);
        field9553 = Float.intBitsToFloat(1112014848);
        bp\u200e = "";
    }

    private static String 2NGuFv4v7HJ4W9L4(String a2, int b2) {
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
    private static CallSite ftpIJLsvBOnq7d(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4119.2NGuFv4v7HJ4W9L4(k2, -1807043503));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 20215 : 20214;
        block6: while (true) {
            switch (n3) {
                case 20215: {
                    n3 = 20213;
                    continue block6;
                }
                case 20214: {
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
                int a2 = Integer.parseInt(Class4119.2NGuFv4v7HJ4W9L4(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4119.2NGuFv4v7HJ4W9L4(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class4119.2NGuFv4v7HJ4W9L4(k2, -1807043503) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

