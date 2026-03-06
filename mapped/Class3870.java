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

@HACHIMI_CLIENT(mv=100, d1={"\u0e6f\u0e6e\u0e6b\u0e65\u0e6f\u0e6d\u0e6d", "\u61e2\u61e7\u61e0\u61e1\u61e7\u61e6\u61e0\u61ed", "\u5908\u5909\u590d\u5906\u590f\u5906\u590f\u590d", "\u9440\u9446\u9440\u9448\u9441\u9445\u9440\u9446", "\u6f4c\u6f4a\u6f49\u6f4b\u6f4d\u6f4b\u6f4b\u6f4d", "\u959f\u959b\u959a\u959b\u9594\u959f\u9598\u959c", "\uab70\uab71\uab72\uab77\uab76\uab73\uab75\uab75", "\ucaff\ucafd\ucafa\ucafd\ucafb\ucafd\ucafe\ucafa", "\u836d\u8363\u8363\u8363\u836a\u836e\u836a\u8362", "\u6dfa\u6df2\u6df9\u6dfd\u6dfe\u6dfb\u6dfa\u6df3", "\uaa07\uaa05\uaa03\uaa0b\uaa02\uaa02\uaa00\uaa01", "\ub651\ub651\ub65b\ub656\ub654\ub653\ub651\ub651", "\ue748\ue747\ue745\ue744\ue745\ue747\ue740", "\u1a3d\u1a3c\u1a30\u1a3d\u1a30\u1a3e\u1a3e\u1a39", "\u04da\u04dc\u04dc\u04d6\u04d8\u04d9\u04dd\u04dc", "\u55e0\u55e4\u55ea\u55ea\u55e0\u55e3\u55e5\u55e5"}, d2={"\u044c\u044d\u0469\u2431\u0403\u0401\u0417\u0473\u0455\u045e\u0449\u045e\u0410\u0453\u045e\u0451\u0458\u0410\u046c\u044b\u044d\u0456\u0451\u0458\u0404\u0416\u0473\u0455\u045e\u0449\u045e\u0410\u0453\u045e\u0451\u0458\u0410\u046c\u044b\u044d\u0456\u0451\u0458\u0404", "\u0450\u0451\u0474\u242d\u041f\u041d\u040b\u046f\u0449\u0442\u0455\u0442\u040c\u044f\u0442\u044d\u0444\u040c\u0470\u0457\u0451\u044a\u044d\u0444\u0418\u040a\u046f\u0449\u0442\u0455\u0442\u040c\u044f\u0442\u044d\u0444\u040c\u0470\u0457\u0451\u044a\u044d\u0444\u0418", "\u008e\u00d1\u00de\u00db\u00dc\u00db\u00c6\u008c\u008e\u008c\u009a\u009b\u00e4", "\u0734\u0761\u0766\u0761\u077c\u0736\u0734\u0736\u0720\u0721\u075e", "\u0484\u0486\u0497\u04a0\u048f\u0482\u0490\u0490\u04df\u04dd\u04cb\u04ca\u04af\u0489\u0482\u0495\u0482\u04cc\u048f\u0482\u048d\u0484\u04cc\u04a0\u048f\u0482\u0490\u0490\u04d8", "\u01da\u01d3\u01c1\u01da\u01f1\u01dd\u01d6\u01d7\u018e\u018c\u019a\u019b\u01fb", "\u07c4\u07d0\u07d4\u07c0\u07cd\u07d2\u079d\u079f\u0789\u07ed\u07cb\u07c0\u07d7\u07c0\u078e\u07cd\u07c0\u07cf\u07c6\u078e\u07ee\u07c3\u07cb\u07c4\u07c2\u07d5\u079a\u0788\u07fb", "\u00b0\u00bf\u00bc\u00bd\u00b6\u00ef\u00ed\u00fb\u00fa\u009f\u00b9\u00b2\u00a5\u00b2\u00fc\u00bf\u00b2\u00bd\u00b4\u00fc\u009c\u00b1\u00b9\u00b6\u00b0\u00a7\u00e8", "\u01bf\u01a4\u0198\u01bf\u01b9\u01a2\u01a5\u01ac\u01f7\u01f5\u01e3\u01e2\u0187\u01a1\u01aa\u01bd\u01aa\u01e4\u01a7\u01aa\u01a5\u01ac\u01e4\u0198\u01bf\u01b9\u01a2\u01a5\u01ac\u01f0", "\u0293\u0292\u0289\u0294\u029b\u0284\u02c1\u02c3\u02d5\u02d4\u02ab", "\u0447\u0446\u045d\u0440\u044f\u0450\u0468\u0445\u0445\u0415\u0417\u0401\u0400\u047f", "\u00ce\u00d8\u00d0\u00cd\u0085\u0087\u0091\u0090\u00ef", "\u012b\u013d\u0135\u0128\u0160\u0162\u0174\u0116\u0175\u010a", "\u00a6\u00b0\u00b8\u00a5\u00e1\u00ed\u00ef\u00f9\u009b\u00f8\u0087", "\u050a\u051c\u0514\u0509\u0541\u0543\u0555\u0537\u0534\u0554\u052b", "\u05ca\u05c5\u05c2\u05cd\u05c0\u05c5\u05d6\u05c9\u0590\u0592\u0584\u0585\u05fa"})
public final class Class3870 {
    public static float field8795;
    public static float field8796;
    public static float field8797;

    static {
        t\u200e = "Increases riding entity speeds";
        field8795 = Float.intBitsToFloat(1058058767);
        aX\u200e = "Accelerate";
        field8797 = Float.intBitsToFloat(1061954779);
        field8796 = Float.intBitsToFloat(1132396544);
    }

    private static String JTTs4tkzMgnbeGV0(String a2, int b2) {
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
    private static CallSite Ga2uf6RtliS6uP(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3870.JTTs4tkzMgnbeGV0(k2, -782462433));
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
                int a2 = Integer.parseInt(Class3870.JTTs4tkzMgnbeGV0(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3870.JTTs4tkzMgnbeGV0(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 23931 : 23932;
        block7: while (true) {
            switch (n3) {
                case 23932: {
                    n3 = 23930;
                    continue block7;
                }
                case 23931: {
                    throw new Exception("Can't find method in " + Class3870.JTTs4tkzMgnbeGV0(k2, -782462433) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

