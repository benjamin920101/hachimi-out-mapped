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
@HACHIMI_CLIENT(mv=100, d1={"\uc3f0\uc3f0\uc3f1\uc3f6\uc3f4\uc3f6\uc3f3", "\u5ae0\u5ae1\u5aec\u5aec\u5ae6\u5ae5\u5ae0\u5ae6", "\u101c\u1018\u101d\u101e\u101a\u101c\u101d\u101b", "\u037e\u037d\u037a\u037b\u0375\u0379\u0375\u037e", "\u3cef\u3ceb\u3ce3\u3ced\u3cea\u3ce9\u3ced", "\u17bf\u17bc\u17bf\u17b0\u17be\u17ba\u17b0\u17bf", "\u2059\u2058\u205b\u2057\u2059\u205c\u2057\u205b", "\u84bd\u84b9\u84ba\u84bb\u84bb\u84bb\u84bc", "\u14f7\u14f7\u14f9\u14f3\u14f9\u14f3\u14f7\u14f6", "\u45a0\u45a6\u45a4\u45a4\u45af\u45af\u45a2\u45a7", "\u5603\u560d\u5606\u560c\u5606\u5600\u5605\u5600", "\u1fc9\u1fca\u1fcc\u1fca\u1fc9\u1fc8\u1fca", "\uc599\uc596\uc59b\uc59c\uc59b\uc59a\uc59e\uc59d", "\ua148\ua14b\ua142\ua143\ua142\ua14d\ua14f\ua14d", "\u5722\u5725\u5724\u5725\u5723\u5721\u5722\u5727", "\u302b\u302d\u3029\u302a\u302a\u302e\u302c\u302e", "\uc047\uc04d\uc04f\uc047\uc04a\uc047\uc047"}, d2={"\u0432\u0409\u0418\u245f\u046d\u046f\u0479\u041d\u043b\u0430\u0427\u0430\u047e\u043d\u0430\u043f\u0436\u047e\u0402\u0425\u0423\u0438\u043f\u0436\u046a\u0478\u041d\u043b\u0430\u0427\u0430\u047e\u043d\u0430\u043f\u0436\u047e\u0402\u0425\u0423\u0438\u043f\u0436\u046a", "\u064b\u0670\u0662\u2626\u0614\u0616\u0600\u0664\u0642\u0649\u065e\u0649\u0607\u0644\u0649\u0646\u064f\u0607\u067b\u065c\u065a\u0641\u0646\u064f\u0613\u0601\u0664\u0642\u0649\u065e\u0649\u0607\u0644\u0649\u0646\u064f\u0607\u067b\u065c\u065a\u0641\u0646\u064f\u0613", "\u0742\u0779\u076a\u272f\u071d\u071f\u0709\u076d\u074b\u0740\u0757\u0740\u070e\u074d\u0740\u074f\u0746\u070e\u0772\u0755\u0753\u0748\u074f\u0746\u071a\u0708\u076d\u074b\u0740\u0757\u0740\u070e\u074d\u0740\u074f\u0746\u070e\u0772\u0755\u0753\u0748\u074f\u0746\u071a", "\u01f8\u01a7\u01a8\u01ad\u01aa\u01ad\u01b0\u01fa\u01f8\u01fa\u01ec\u01ed\u0192", "\u017d\u0128\u012f\u0128\u0135\u017f\u017d\u017f\u0169\u0168\u0117", "\u063a\u0638\u0629\u061e\u0631\u063c\u062e\u062e\u0661\u0663\u0675\u0674\u0611\u0637\u063c\u062b\u063c\u0672\u0631\u063c\u0633\u063a\u0672\u061e\u0631\u063c\u062e\u062e\u0666", "\u01fd\u01f4\u01e6\u01fd\u01d6\u01fa\u01f1\u01f0\u01a9\u01ab\u01bd\u01bc\u01dc", "\u036e\u037a\u037e\u036a\u0367\u0378\u0337\u0335\u0323\u0347\u0361\u036a\u037d\u036a\u0324\u0367\u036a\u0365\u036c\u0324\u0344\u0369\u0361\u036e\u0368\u037f\u0330\u0322\u0351", "^QRSX\u0001\u0003\u0015\u0014qW\\K\\\u0012Q\\SZ\u0012r_WX^I\u0006", "\u0273\u0268\u0254\u0273\u0275\u026e\u0269\u0260\u023b\u0239\u022f\u022e\u024b\u026d\u0266\u0271\u0266\u0228\u026b\u0266\u0269\u0260\u0228\u0254\u0273\u0275\u026e\u0269\u0260\u023c", "\u02c5\u02c4\u02df\u02c2\u02cd\u02d2\u0297\u0295\u0283\u0282\u02fd", "\u0456\u0457\u044c\u0451\u045e\u0441\u0479\u0454\u0454\u0404\u0406\u0410\u0411\u046e", "\u0285\u0293\u029b\u0286\u02ce\u02cc\u02da\u02db\u02a4", "\u06dc\u06ca\u06c2\u06df\u0697\u0695\u0683\u06e1\u0682\u06fd", "\u073d\u072b\u0723\u073e\u077a\u0776\u0774\u0762\u0700\u0763\u071c", "\u078a\u079c\u0794\u0789\u07c1\u07c3\u07d5\u07b7\u07b4\u07d4\u07ab", "\u0526\u0529\u052e\u0521\u052c\u0529\u053a\u0525\u057c\u057e\u0568\u0569\u0516"})
public final class Class3775 {
    public static float field8550;
    public static int field8551 = -1315336384;
    public static long field8552 = 8731558053848479139L;
    public static float field8553;
    public static double field8554;
    public static float field8555;

    static {
        n\u200e = "";
        field8553 = Float.intBitsToFloat(1057255732);
        field8555 = Float.intBitsToFloat(1050749150);
        field8550 = Float.intBitsToFloat(1054105492);
        bo\u200e = "Break crystals when placing blocks";
        field8554 = Double.longBitsToDouble(4601506202378360126L);
        bK\u200e = "Monsters";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite jfQa6GWvs1JScD(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3775.6Iv2bYcESi1DcftE(k2, -304251820));
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
                int a2 = Integer.parseInt(Class3775.6Iv2bYcESi1DcftE(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3775.6Iv2bYcESi1DcftE(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3775.6Iv2bYcESi1DcftE(k2, -304251820) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 6Iv2bYcESi1DcftE(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

