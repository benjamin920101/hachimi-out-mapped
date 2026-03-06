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
@HACHIMI_CLIENT(mv=100, d1={"\ud7ec\ud7e5\ud7ea\ud7e8\ud7eb\ud7ec\ud7e8\ud7e4", "\u158f\u158f\u158d\u1589\u158c\u158b\u1588\u1588", "\u4b58\u4b58\u4b58\u4b59\u4b5e\u4b5a\u4b5c\u4b5d", "\u6728\u672d\u6727\u6727\u672e\u6728\u672f\u6728", "\u0cd4\u0cd3\u0cd7\u0cd1\u0cde\u0cde\u0cd7\u0cd0", "\uaa39\uaa32\uaa39\uaa33\uaa32\uaa38\uaa39\uaa32", "\u162f\u162d\u162c\u162e\u162a\u162e\u1628", "\uba98\uba98\uba99\uba95\uba9a\uba98\uba9e\uba98", "\u4940\u4947\u4942\u494d\u4943\u4946\u4945\u4942", "\u6457\u6457\u6451\u6454\u645c\u6454\u6456\u6456", "\uc125\uc125\uc125\uc121\uc123\uc126\uc12e\uc125", "\u5af6\u5afb\u5af2\u5af6\u5af3\u5afb\u5af5\u5af4", "\u032c\u032a\u032d\u032a\u032c\u032c\u0321\u0328", "\u4887\u4881\u4886\u4881\u4886\u4880\u4888\u4883", "\u7544\u7540\u7549\u7544\u7545\u7547\u7542\u7543", "\u3213\u3214\u321e\u3215\u321f\u321e\u321f\u3211"}, d2={"\u05d2\u05c9\u05fd\u25b1\u0583\u0581\u0597\u05f3\u05d5\u05de\u05c9\u05de\u0590\u05d3\u05de\u05d1\u05d8\u0590\u05ec\u05cb\u05cd\u05d6\u05d1\u05d8\u0584\u0596\u05f3\u05d5\u05de\u05c9\u05de\u0590\u05d3\u05de\u05d1\u05d8\u0590\u05ec\u05cb\u05cd\u05d6\u05d1\u05d8\u0584", "\u0155\u014e\u017b\u2136\u0104\u0106\u0110\u0174\u0152\u0159\u014e\u0159\u0117\u0154\u0159\u0156\u015f\u0117\u016b\u014c\u014a\u0151\u0156\u015f\u0103\u0111\u0174\u0152\u0159\u014e\u0159\u0117\u0154\u0159\u0156\u015f\u0117\u016b\u014c\u014a\u0151\u0156\u015f\u0103", "\u0425\u047a\u0475\u0470\u0477\u0470\u046d\u0427\u0425\u0427\u0431\u0430\u044f", "\u0691\u06c4\u06c3\u06c4\u06d9\u0693\u0691\u0693\u0685\u0684\u06fb", "\u0149\u014b\u015a\u016d\u0142\u014f\u015d\u015d\u0112\u0110\u0106\u0107\u0162\u0144\u014f\u0158\u014f\u0101\u0142\u014f\u0140\u0149\u0101\u016d\u0142\u014f\u015d\u015d\u0115", "\u06b8\u06b1\u06a3\u06b8\u0693\u06bf\u06b4\u06b5\u06ec\u06ee\u06f8\u06f9\u0699", "\u02ad\u02b9\u02bd\u02a9\u02a4\u02bb\u02f4\u02f6\u02e0\u0284\u02a2\u02a9\u02be\u02a9\u02e7\u02a4\u02a9\u02a6\u02af\u02e7\u0287\u02aa\u02a2\u02ad\u02ab\u02bc\u02f3\u02e1\u0292", "\u0088\u0087\u0084\u0085\u008e\u00d7\u00d5\u00c3\u00c2\u00a7\u0081\u008a\u009d\u008a\u00c4\u0087\u008a\u0085\u008c\u00c4\u00a4\u0089\u0081\u008e\u0088\u009f\u00d0", "\u0434\u042f\u0413\u0434\u0432\u0429\u042e\u0427\u047c\u047e\u0468\u0469\u040c\u042a\u0421\u0436\u0421\u046f\u042c\u0421\u042e\u0427\u046f\u0413\u0434\u0432\u0429\u042e\u0427\u047b", "\u0247\u0246\u025d\u0240\u024f\u0250\u0215\u0217\u0201\u0200\u027f", "\u07dc\u07dd\u07c6\u07db\u07d4\u07cb\u07f3\u07de\u07de\u078e\u078c\u079a\u079b\u07e4", "\u0010\u0006\u000e\u0013[YON1", "\u0751\u0747\u074f\u0752\u071a\u0718\u070e\u076c\u070f\u0770", "\u03bc\u03aa\u03a2\u03bf\u03fb\u03f7\u03f5\u03e3\u0381\u03e2\u039d", "\u042e\u0438\u0430\u042d\u0465\u0467\u0471\u0413\u0410\u0470\u040f", "\u00bb\u00b4\u00b3\u00bc\u00b1\u00b4\u00a7\u00b8\u00e1\u00e3\u00f5\u00f4\u008b"})
public final class Class1821 {
    public static float field6770;
    public static float field6771;
    public static int field6772 = -2045425936;
    public static float field6773;
    public static double field6774;
    public static float field6775;

    /*
     * Handled impossible loop by duplicating code
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 0IGgNYUMLUgYxz(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        String t2;
        String s2;
        Class<?> o2;
        block9: {
            int n3;
            int n4;
            block8: {
                block7: {
                    o2 = Class.forName(Class1821.54bWDeoXqvZIViT2(k2, 78604565));
                    HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
                    if (p2.mv() < 100) {
                        throw new Exception("Outdated metadata version");
                    }
                    String[] q2 = p2.d1();
                    String[] r2 = p2.d2();
                    s2 = "";
                    t2 = "";
                    for (int f2 = 0; f2 < q2.length; ++f2) {
                        void e2;
                        try {
                            int a2 = Integer.parseInt(Class1821.54bWDeoXqvZIViT2(q2[f2], m2));
                        }
                        catch (NumberFormatException b2) {
                            continue;
                        }
                        if (e2 % 59557 != m2.intValue()) continue;
                        String c2 = Class1821.54bWDeoXqvZIViT2(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break;
                    }
                    if (!s2.isEmpty()) break block7;
                    n4 = 11114;
                    n3 = n4;
                    if (n3 == 11114) throw new Exception("Can't find method in " + Class1821.54bWDeoXqvZIViT2(k2, 78604565) + " " + l2 + " " + m2);
                    if (n3 == 11115) break block8;
                    break block9;
                }
                n4 = 11115;
                if (!true) break block8;
                n3 = n4;
                if (n3 == 11114) throw new Exception("Can't find method in " + Class1821.54bWDeoXqvZIViT2(k2, 78604565) + " " + l2 + " " + m2);
                if (n3 != 11115) break block9;
            }
            do {
                n4 = 11113;
                n3 = n4;
                if (n3 == 11114) throw new Exception("Can't find method in " + Class1821.54bWDeoXqvZIViT2(k2, 78604565) + " " + l2 + " " + m2);
            } while (n3 == 11115);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 54bWDeoXqvZIViT2(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        m\u200e = "Cleans the hotbar inventory slots";
        field6773 = Float.intBitsToFloat(1051733468);
        ad\u200e = "Uses a normal golden apple if Absorption is present";
        field6771 = Float.intBitsToFloat(1064813921);
        field6775 = Float.intBitsToFloat(1064288379);
        field6774 = Double.longBitsToDouble(4584639171567958080L);
        field6770 = Float.intBitsToFloat(1048690824);
    }
}

