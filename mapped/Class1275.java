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

@HACHIMI_CLIENT(mv=100, d1={"\u3785\u3781\u3787\u3780\u3786\u3782", "\u36a6\u36a8\u36a0\u36a2\u36a8\u36a0\u36a6\u36a2", "\u5861\u5865\u5867\u5864\u5865\u5865\u586c\u586d", "\u6f93\u6f98\u6f92\u6f96\u6f94\u6f91\u6f97\u6f90", "\u9ae3\u9ae8\u9ae0\u9ae3\u9ae6\u9ae9\u9ae9\u9ae8", "\u4dfb\u4df4\u4dfd\u4df9\u4dfb\u4df9\u4df5\u4dfd", "\u6cbd\u6cb7\u6cbb\u6cb9\u6cbd\u6cb8\u6cbd\u6cb6", "\ub730\ub731\ub730\ub737\ub736\ub732\ub736", "\u3a36\u3a3f\u3a34\u3a32\u3a3f\u3a33\u3a36\u3a36", "\ua2d9\ua2da\ua2dc\ua2d8\ua2d9\ua2d9\ua2d6", "\u576d\u5768\u576b\u576d\u576e\u5766\u576e\u5769", "\ue6eb\ue6eb\ue6ea\ue6eb\ue6ea\ue6eb\ue6ec\ue6ed", "\u6727\u6723\u6723\u672a\u6727\u672a\u6726\u672b", "\ud53e\ud533\ud53a\ud53c\ud533\ud533\ud53e\ud533", "\u5b18\u5b1a\u5b1d\u5b1e\u5b13\u5b1b\u5b1d\u5b1e", "\ubf2c\ubf2c\ubf23\ubf23\ubf2a\ubf23\ubf23\ubf2a", "\ud63c\ud639\ud63a\ud63e\ud630\ud63a\ud63b\ud63e"}, d2={"\u023e\u020e\u0204\u2252\u0260\u0262\u0274\u0210\u0236\u023d\u022a\u023d\u0273\u0230\u023d\u0232\u023b\u0273\u020f\u0228\u022e\u0235\u0232\u023b\u0267\u0275\u0210\u0236\u023d\u022a\u023d\u0273\u0230\u023d\u0232\u023b\u0273\u020f\u0228\u022e\u0235\u0232\u023b\u0267", "\u04b6\u0486\u048d\u24da\u04e8\u04ea\u04fc\u0498\u04be\u04b5\u04a2\u04b5\u04fb\u04b8\u04b5\u04ba\u04b3\u04fb\u0487\u04a0\u04a6\u04bd\u04ba\u04b3\u04ef\u04fd\u0498\u04be\u04b5\u04a2\u04b5\u04fb\u04b8\u04b5\u04ba\u04b3\u04fb\u0487\u04a0\u04a6\u04bd\u04ba\u04b3\u04ef", "\u06cd\u06fd\u06f5\u26a1\u0693\u0691\u0687\u06e3\u06c5\u06ce\u06d9\u06ce\u0680\u06c3\u06ce\u06c1\u06c8\u0680\u06fc\u06db\u06dd\u06c6\u06c1\u06c8\u0694\u0686\u06e3\u06c5\u06ce\u06d9\u06ce\u0680\u06c3\u06ce\u06c1\u06c8\u0680\u06fc\u06db\u06dd\u06c6\u06c1\u06c8\u0694", "\u05ca\u0595\u059a\u059f\u0598\u059f\u0582\u05c8\u05ca\u05c8\u05de\u05df\u05a0", "\u0561\u0534\u0533\u0534\u0529\u0563\u0561\u0563\u0575\u0574\u050b", "\u05a0\u05a2\u05b3\u0584\u05ab\u05a6\u05b4\u05b4\u05fb\u05f9\u05ef\u05ee\u058b\u05ad\u05a6\u05b1\u05a6\u05e8\u05ab\u05a6\u05a9\u05a0\u05e8\u0584\u05ab\u05a6\u05b4\u05b4\u05fc", "\u07f7\u07fe\u07ec\u07f7\u07dc\u07f0\u07fb\u07fa\u07a3\u07a1\u07b7\u07b6\u07d6", "\u05dd\u05c9\u05cd\u05d9\u05d4\u05cb\u0584\u0586\u0590\u05f4\u05d2\u05d9\u05ce\u05d9\u0597\u05d4\u05d9\u05d6\u05df\u0597\u05f7\u05da\u05d2\u05dd\u05db\u05cc\u0583\u0591\u05e2", "\u00bd\u00b2\u00b1\u00b0\u00bb\u00e2\u00e0\u00f6\u00f7\u0092\u00b4\u00bf\u00a8\u00bf\u00f1\u00b2\u00bf\u00b0\u00b9\u00f1\u0091\u00bc\u00b4\u00bb\u00bd\u00aa\u00e5", "\u0088\u0093\u00af\u0088\u008e\u0095\u0092\u009b\u00c0\u00c2\u00d4\u00d5\u00b0\u0096\u009d\u008a\u009d\u00d3\u0090\u009d\u0092\u009b\u00d3\u00af\u0088\u008e\u0095\u0092\u009b\u00c7", "\u02f3\u02f2\u02e9\u02f4\u02fb\u02e4\u02a1\u02a3\u02b5\u02b4\u02cb", "\u027b\u027a\u0261\u027c\u0273\u026c\u0254\u0279\u0279\u0229\u022b\u023d\u023c\u0243", "\u075d\u074b\u0743\u075e\u0716\u0714\u0702\u0703\u077c", "\u0663\u0675\u067d\u0660\u0628\u062a\u063c\u065e\u063d\u0642", "\u0593\u0585\u058d\u0590\u05d4\u05d8\u05da\u05cc\u05ae\u05cd\u05b2", "\u07fc\u07ea\u07e2\u07ff\u07b7\u07b5\u07a3\u07c1\u07c2\u07a2\u07dd", "\u040c\u0403\u0404\u040b\u0406\u0403\u0410\u040f\u0456\u0454\u0442\u0443\u043c"})
public final class Class1275 {
    public static double field4976;
    public static float field4977 = 0.21253628f;
    public static float field4978;
    public static double field4979;
    public static int field4980 = 1451991287;

    private static String KwcT4z31BZbbvnzg(String a2, int b2) {
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
    private static CallSite G1FjqywBuUDtnN(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1275.KwcT4z31BZbbvnzg(k2, 264268963));
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
                int a2 = Integer.parseInt(Class1275.KwcT4z31BZbbvnzg(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1275.KwcT4z31BZbbvnzg(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 40524 : 40525;
        block7: while (true) {
            switch (n3) {
                case 40525: {
                    n3 = 40523;
                    continue block7;
                }
                case 40524: {
                    throw new Exception("Can't find method in " + Class1275.KwcT4z31BZbbvnzg(k2, 264268963) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        t\u200e = "";
        field4979 = Double.longBitsToDouble(4591448378401969976L);
        I\u200e = "Use the 'bind' command to keybind modules!";
        field4976 = Double.longBitsToDouble(4602678819172646912L);
        field4978 = Float.intBitsToFloat(1003991680);
        aV\u200e = "MSAA sampling number";
    }
}

