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

@HACHIMI_CLIENT(mv=100, d1={"\u73da\u73d6\u73d6\u73db\u73d4\u73db\u73d4", "\u0510\u0512\u0517\u0517\u0512\u0512\u0512\u0516", "\u0836\u0836\u0838\u0838\u0834\u0835\u0835\u0839", "\u3946\u3940\u3945\u394f\u3941\u3945\u3943\u3946", "\u2906\u2905\u2901\u2907\u290a\u2901\u2904\u2903", "\u6bbc\u6bbe\u6bba\u6bb5\u6bb8\u6bbf\u6bbd\u6bbd", "\u6a7c\u6a7e\u6a7e\u6a7d\u6a76\u6a7d\u6a78\u6a78", "\u8553\u8554\u8554\u8550\u8553\u8550\u8555\u855f", "\u8a26\u8a25\u8a27\u8a22\u8a26\u8a27\u8a21\u8a25", "\u13ce\u13cc\u13c8\u13cc\u13cd\u13ca\u13ca\u13cd", "\u995a\u9958\u995c\u995c\u995f\u9958\u9955\u9958", "\ude4e\ude4d\ude4f\ude48\ude49\ude42\ude42\ude49", "\uddf4\uddf6\uddf0\uddf0\uddf5\uddf2\uddff\uddf0", "\u951e\u951b\u9516\u9517\u9519\u9516\u9516\u9517", "\u43bc\u43be\u43bb\u43bf\u43bc\u43b7\u43bc\u43bb", "\u417a\u4175\u417a\u4175\u417f\u4179\u417c"}, d2={"\u030e\u031d\u033b\u2371\u0343\u0341\u0357\u0333\u0315\u031e\u0309\u031e\u0350\u0313\u031e\u0311\u0318\u0350\u032c\u030b\u030d\u0316\u0311\u0318\u0344\u0356\u0333\u0315\u031e\u0309\u031e\u0350\u0313\u031e\u0311\u0318\u0350\u032c\u030b\u030d\u0316\u0311\u0318\u0344", "\u0655\u0646\u0661\u262a\u0618\u061a\u060c\u0668\u064e\u0645\u0652\u0645\u060b\u0648\u0645\u064a\u0643\u060b\u0677\u0650\u0656\u064d\u064a\u0643\u061f\u060d\u0668\u064e\u0645\u0652\u0645\u060b\u0648\u0645\u064a\u0643\u060b\u0677\u0650\u0656\u064d\u064a\u0643\u061f", "\u039a\u03c5\u03ca\u03cf\u03c8\u03cf\u03d2\u0398\u039a\u0398\u038e\u038f\u03f0", "\u039c\u03c9\u03ce\u03c9\u03d4\u039e\u039c\u039e\u0388\u0389\u03f6", "\u0657\u0655\u0644\u0673\u065c\u0651\u0643\u0643\u060c\u060e\u0618\u0619\u067c\u065a\u0651\u0646\u0651\u061f\u065c\u0651\u065e\u0657\u061f\u0673\u065c\u0651\u0643\u0643\u060b", "\u06cd\u06c4\u06d6\u06cd\u06e6\u06ca\u06c1\u06c0\u0699\u069b\u068d\u068c\u06ec", "\u0014\u0000\u0004\u0010\u001d\u0002MOY=\u001b\u0010\u0007\u0010^\u001d\u0010\u001f\u0016^>\u0013\u001b\u0014\u0012\u0005JX+", "\u0678\u0677\u0674\u0675\u067e\u0627\u0625\u0633\u0632\u0657\u0671\u067a\u066d\u067a\u0634\u0677\u067a\u0675\u067c\u0634\u0654\u0679\u0671\u067e\u0678\u066f\u0620", "\u0214\u020f\u0233\u0214\u0212\u0209\u020e\u0207\u025c\u025e\u0248\u0249\u022c\u020a\u0201\u0216\u0201\u024f\u020c\u0201\u020e\u0207\u024f\u0233\u0214\u0212\u0209\u020e\u0207\u025b", "\u07b9\u07b8\u07a3\u07be\u07b1\u07ae\u07eb\u07e9\u07ff\u07fe\u0781", "\u0230\u0231\u022a\u0237\u0238\u0227\u021f\u0232\u0232\u0262\u0260\u0276\u0277\u0208", "\u046c\u047a\u0472\u046f\u0427\u0425\u0433\u0432\u044d", "\u05d0\u05c6\u05ce\u05d3\u059b\u0599\u058f\u05ed\u058e\u05f1", "\u02c7\u02d1\u02d9\u02c4\u0280\u028c\u028e\u0298\u02fa\u0299\u02e6", "\u0091\u0087\u008f\u0092\u00da\u00d8\u00ce\u00ac\u00af\u00cf\u00b0", "\u05d4\u05db\u05dc\u05d3\u05de\u05db\u05c8\u05d7\u058e\u058c\u059a\u059b\u05e4"})
public final class Class3306 {
    public static double field7116 = Double.longBitsToDouble(4603790052773462563L);
    public static float field7117;
    public static double field7118;

    /*
     * WARNING - void declaration
     */
    private static CallSite B7jSwVa2a3rqeD(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3306.QGnKe6WOen717GTP(k2, -1277092222));
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
                int a2 = Integer.parseInt(Class3306.QGnKe6WOen717GTP(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3306.QGnKe6WOen717GTP(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3306.QGnKe6WOen717GTP(k2, -1277092222) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        w\u200e = "Scale of text";
        field7117 = Float.intBitsToFloat(1065336439);
        P\u200e = "add/del";
        field7118 = Double.longBitsToDouble(4578254755577021504L);
    }

    private static String QGnKe6WOen717GTP(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

