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

@HACHIMI_CLIENT(mv=100, d1={"\ua99d\ua999\ua993\ua99c\ua99d\ua99b\ua99c\ua99b", "\u2ef9\u2ef9\u2ef9\u2efa\u2efe\u2ef9\u2efe\u2efb", "\u20e0\u20ed\u20e4\u20e6\u20e7\u20ec\u20e5\u20e1", "\ubae5\ubae0\ubae6\ubae1\ubae1\ubae7\ubae1\ubae7", "\u13a4\u13a7\u13a7\u13a4\u13a0\u13aa\u13a2", "\ue761\ue764\ue764\ue760\ue765\ue760\ue763\ue764", "\u322e\u3226\u322c\u322f\u3226\u322d\u3226\u3226", "\u9c47\u9c4b\u9c47\u9c4b\u9c45\u9c42\u9c47\u9c42", "\u83b0\u83b2\u83b5\u83b6\u83bb\u83b7\u83b0\u83b7", "\ud48f\ud488\ud488\ud48c\ud480\ud480\ud48a\ud480", "\ua76f\ua76e\ua76a\ua76e\ua76c\ua769\ua76e\ua76f", "\u36b8\u36ba\u36bf\u36bc\u36bb\u36bb\u36b8\u36bd", "\u74ce\u74c8\u74cb\u74c8\u74ce\u74cd\u74cc\u74cc", "\u4531\u453b\u4531\u4530\u4537\u4530\u453a\u4534"}, d2={"\u05ea\u05b5\u05ba\u05bf\u05b8\u05bf\u05a2\u05e8\u05ea\u05e8\u05fe\u05ff\u0580", "\u0421\u0474\u0473\u0474\u0469\u0423\u0421\u0423\u0435\u0434\u044b", "\u00da\u00d8\u00c9\u00fe\u00d1\u00dc\u00ce\u00ce\u0081\u0083\u0095\u0094\u00f1\u00d7\u00dc\u00cb\u00dc\u0092\u00d1\u00dc\u00d3\u00da\u0092\u00fe\u00d1\u00dc\u00ce\u00ce\u0086", "\u071f\u0716\u0704\u071f\u0734\u0718\u0713\u0712\u074b\u0749\u075f\u075e\u073e", "\u051f\u050b\u050f\u051b\u0516\u0509\u0546\u0544\u0552\u0536\u0510\u051b\u050c\u051b\u0555\u0516\u051b\u0514\u051d\u0555\u0535\u0518\u0510\u051f\u0519\u050e\u0541\u0553\u0520", "\u03ad\u03a2\u03a1\u03a0\u03ab\u03f2\u03f0\u03e6\u03e7\u0382\u03a4\u03af\u03b8\u03af\u03e1\u03a2\u03af\u03a0\u03a9\u03e1\u0381\u03ac\u03a4\u03ab\u03ad\u03ba\u03f5", "\u05ff\u05e4\u05d8\u05ff\u05f9\u05e2\u05e5\u05ec\u05b7\u05b5\u05a3\u05a2\u05c7\u05e1\u05ea\u05fd\u05ea\u05a4\u05e7\u05ea\u05e5\u05ec\u05a4\u05d8\u05ff\u05f9\u05e2\u05e5\u05ec\u05b0", "IHSNA^\u001b\u0019\u000f\u000eq", "\u0764\u0765\u077e\u0763\u076c\u0773\u074b\u0766\u0766\u0736\u0734\u0722\u0723\u075c", "\u024c\u025a\u0252\u024f\u0207\u0205\u0213\u0212\u026d", "\u041a\u040c\u0404\u0419\u0451\u0453\u0445\u0427\u0444\u043b", "\u0310\u0306\u030e\u0313\u0357\u035b\u0359\u034f\u032d\u034e\u0331", "\u063d\u062b\u0623\u063e\u0676\u0674\u0662\u0600\u0603\u0663\u061c", "\u01af\u01a0\u01a7\u01a8\u01a5\u01a0\u01b3\u01ac\u01f5\u01f7\u01e1\u01e0\u019f"})
public final class Class3262 {
    public static double field6999 = Double.longBitsToDouble(4598884777587430738L);

    /*
     * WARNING - void declaration
     */
    private static CallSite OdnjqIoWoqMPJq(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3262.RD4rrJU69mDr0HyA(k2, 1095235166));
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
                int a2 = Integer.parseInt(Class3262.RD4rrJU69mDr0HyA(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3262.RD4rrJU69mDr0HyA(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3262.RD4rrJU69mDr0HyA(k2, 1095235166) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String RD4rrJU69mDr0HyA(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

