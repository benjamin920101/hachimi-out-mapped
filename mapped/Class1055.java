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

@HACHIMI_CLIENT(mv=100, d1={"\u026f\u0269\u026c\u026e\u0269\u0269\u026e\u0269", "\u05be\u05bf\u05ba\u05ba\u05bd\u05b8\u05bb", "\u2e17\u2e13\u2e1a\u2e10\u2e14\u2e16\u2e12\u2e12", "\u7785\u7782\u7781\u7782\u7781\u7786\u7788\u7784", "\u9bf1\u9bf7\u9bf0\u9bf1\u9bfa\u9bf2\u9bf4\u9bf3", "\u891b\u891c\u8912\u8912\u8913\u891d\u891e\u891f", "\u5a71\u5a74\u5a7f\u5a71\u5a7f\u5a75\u5a76\u5a72", "\u5d9e\u5d9e\u5d98\u5d98\u5d99\u5d98\u5d9a\u5d9f", "\u0db5\u0db5\u0db1\u0db4\u0db2\u0db6\u0db5\u0db4", "\u4974\u4977\u4973\u4977\u497e\u497e\u4975\u4973", "\ua80a\ua80b\ua807\ua808\ua80f\ua80b\ua80f\ua809", "\u404d\u404a\u4048\u404b\u404a\u404e\u404c\u404a", "\u7b2d\u7b28\u7b28\u7b2d\u7b2a\u7b2a\u7b2d\u7b2b", "\u83cf\u83c8\u83cb\u83cc\u83c1\u83ca\u83c1\u83c8", "\u3bc2\u3bc0\u3bcb\u3bc6\u3bc2\u3bc6\u3bcb", "\uc215\uc217\uc216\uc212\uc217\uc21f\uc213", "\u6850\u6857\u6851\u6854\u6851\u6851\u6851\u685e"}, d2={"\u04e4\u04c1\u04ed\u2499\u04ab\u04a9\u04bf\u04db\u04fd\u04f6\u04e1\u04f6\u04b8\u04fb\u04f6\u04f9\u04f0\u04b8\u04c4\u04e3\u04e5\u04fe\u04f9\u04f0\u04ac\u04be\u04db\u04fd\u04f6\u04e1\u04f6\u04b8\u04fb\u04f6\u04f9\u04f0\u04b8\u04c4\u04e3\u04e5\u04fe\u04f9\u04f0\u04ac", "\u063c\u0619\u060e\u2641\u0673\u0671\u0667\u0603\u0625\u062e\u0639\u062e\u0660\u0623\u062e\u0621\u0628\u0660\u061c\u063b\u063d\u0626\u0621\u0628\u0674\u0666\u0603\u0625\u062e\u0639\u062e\u0660\u0623\u062e\u0621\u0628\u0660\u061c\u063b\u063d\u0626\u0621\u0628\u0674", "\u05ba\u059f\u058b\u25c7\u05f5\u05f7\u05e1\u0585\u05a3\u05a8\u05bf\u05a8\u05e6\u05a5\u05a8\u05a7\u05ae\u05e6\u059a\u05bd\u05bb\u05a0\u05a7\u05ae\u05f2\u05e0\u0585\u05a3\u05a8\u05bf\u05a8\u05e6\u05a5\u05a8\u05a7\u05ae\u05e6\u059a\u05bd\u05bb\u05a0\u05a7\u05ae\u05f2", "\u03c0\u039f\u0390\u0395\u0392\u0395\u0388\u03c2\u03c0\u03c2\u03d4\u03d5\u03aa", "\u0601\u0654\u0653\u0654\u0649\u0603\u0601\u0603\u0615\u0614\u066b", "\u0597\u0595\u0584\u05b3\u059c\u0591\u0583\u0583\u05cc\u05ce\u05d8\u05d9\u05bc\u059a\u0591\u0586\u0591\u05df\u059c\u0591\u059e\u0597\u05df\u05b3\u059c\u0591\u0583\u0583\u05cb", "\u0555\u055c\u054e\u0555\u057e\u0552\u0559\u0558\u0501\u0503\u0515\u0514\u0574", "\u0011\u0005\u0001\u0015\u0018\u0007HJ\\8\u001e\u0015\u0002\u0015[\u0018\u0015\u001a\u0013[;\u0016\u001e\u0011\u0017\u0000O].", "LC@AJ\u0013\u0011\u0007\u0006cENYN\u0000CNAH\u0000`MEJL[\u0014", "\u0340\u035b\u0367\u0340\u0346\u035d\u035a\u0353\u0308\u030a\u031c\u031d\u0378\u035e\u0355\u0342\u0355\u031b\u0358\u0355\u035a\u0353\u031b\u0367\u0340\u0346\u035d\u035a\u0353\u030f", "\u0245\u0244\u025f\u0242\u024d\u0252\u0217\u0215\u0203\u0202\u027d", "\u0790\u0791\u078a\u0797\u0798\u0787\u07bf\u0792\u0792\u07c2\u07c0\u07d6\u07d7\u07a8", "\u07e2\u07f4\u07fc\u07e1\u07a9\u07ab\u07bd\u07bc\u07c3", "\u0648\u065e\u0656\u064b\u0603\u0601\u0617\u0675\u0616\u0669", "\u0666\u0670\u0678\u0665\u0621\u062d\u062f\u0639\u065b\u0638\u0647", "\u01f4\u01e2\u01ea\u01f7\u01bf\u01bd\u01ab\u01c9\u01ca\u01aa\u01d5", "\u0520\u052f\u0528\u0527\u052a\u052f\u053c\u0523\u057a\u0578\u056e\u056f\u0510"})
public final class Class1055 {
    public static double field4325;
    public static int field4326 = 1013877076;
    public static double field4327 = 0.31572410659758565;
    public static double field4328;
    public static double field4329 = 0.5677303847488717;
    public static float field4330;

    /*
     * WARNING - void declaration
     */
    private static CallSite A9n420ScSW5bqH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1055.t8xJZDvJ9oY1MF0U(k2, 880970));
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
                int a2 = Integer.parseInt(Class1055.t8xJZDvJ9oY1MF0U(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1055.t8xJZDvJ9oY1MF0U(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1055.t8xJZDvJ9oY1MF0U(k2, 880970) + " " + l2 + " " + m2);
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
        field4330 = Float.intBitsToFloat(1060748303);
        aF\u200e = "Wait";
        field4325 = Double.longBitsToDouble(4603187445820405993L);
        aV\u200e = "LineColor";
        aW\u200e = "The color of the chams";
        field4328 = Double.longBitsToDouble(4603240919880876378L);
    }

    private static String t8xJZDvJ9oY1MF0U(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

