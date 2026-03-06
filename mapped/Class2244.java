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

@HACHIMI_CLIENT(mv=100, d1={"\uab40\uab41\uab43\uab46\uab40\uab45\uab45\uab45", "\u96c7\u96c3\u96c7\u96c6\u96c0\u96c3\u96c0\u96c1", "\u398b\u398e\u398f\u398a\u3985\u398f\u398e", "\u1237\u123a\u1237\u123f\u1237\u123c\u123e", "\u129e\u1291\u1292\u1294\u1297\u1297\u129e", "\ua232\ua232\ua231\ua230\ua23b\ua232\ua23a\ua232", "\ua77f\ua776\ua77e\ua77c\ua777\ua77e\ua77a\ua77a", "\uaba5\uaba0\uaba5\uaba1\uabac\uabad\uaba7\uaba7", "\u401c\u401f\u401d\u401a\u401b\u401e\u4019", "\u1f48\u1f4b\u1f4a\u1f49\u1f4f\u1f4a\u1f4a\u1f4c", "\u3928\u392a\u392c\u3929\u3928\u3928\u392c\u392b", "\u8267\u8260\u8262\u8261\u8267\u8266\u826f\u826e", "\u46aa\u46ae\u46af\u46af\u46a8\u46a8\u46a8\u46a3", "\u5b0c\u5b08\u5b06\u5b09\u5b0e\u5b0e\u5b09\u5b07", "\ud7ae\ud7a8\ud7af\ud7ab\ud7a8\ud7ab\ud7aa"}, d2={"\u034e\u0368\u0374\u2329\u031b\u0319\u030f\u036b\u034d\u0346\u0351\u0346\u0308\u034b\u0346\u0349\u0340\u0308\u0374\u0353\u0355\u034e\u0349\u0340\u031c\u030e\u036b\u034d\u0346\u0351\u0346\u0308\u034b\u0346\u0349\u0340\u0308\u0374\u0353\u0355\u034e\u0349\u0340\u031c", "\u06d4\u068b\u0684\u0681\u0686\u0681\u069c\u06d6\u06d4\u06d6\u06c0\u06c1\u06be", "\u0276\u0223\u0224\u0223\u023e\u0274\u0276\u0274\u0262\u0263\u021c", "\u0673\u0671\u0660\u0657\u0678\u0675\u0667\u0667\u0628\u062a\u063c\u063d\u0658\u067e\u0675\u0662\u0675\u063b\u0678\u0675\u067a\u0673\u063b\u0657\u0678\u0675\u0667\u0667\u062f", "\u0631\u0638\u062a\u0631\u061a\u0636\u063d\u063c\u0665\u0667\u0671\u0670\u0610", "\u076a\u077e\u077a\u076e\u0763\u077c\u0733\u0731\u0727\u0743\u0765\u076e\u0779\u076e\u0720\u0763\u076e\u0761\u0768\u0720\u0740\u076d\u0765\u076a\u076c\u077b\u0734\u0726\u0755", "\u00b0\u00bf\u00bc\u00bd\u00b6\u00ef\u00ed\u00fb\u00fa\u009f\u00b9\u00b2\u00a5\u00b2\u00fc\u00bf\u00b2\u00bd\u00b4\u00fc\u009c\u00b1\u00b9\u00b6\u00b0\u00a7\u00e8", "\u070e\u0715\u0729\u070e\u0708\u0713\u0714\u071d\u0746\u0744\u0752\u0753\u0736\u0710\u071b\u070c\u071b\u0755\u0716\u071b\u0714\u071d\u0755\u0729\u070e\u0708\u0713\u0714\u071d\u0741", "\u06d4\u06d5\u06ce\u06d3\u06dc\u06c3\u0686\u0684\u0692\u0693\u06ec", "\u0527\u0526\u053d\u0520\u052f\u0530\u0508\u0525\u0525\u0575\u0577\u0561\u0560\u051f", "\u05f3\u05e5\u05ed\u05f0\u05b8\u05ba\u05ac\u05ad\u05d2", "\u0185\u0193\u019b\u0186\u01ce\u01cc\u01da\u01b8\u01db\u01a4", "\u0300\u0316\u031e\u0303\u0347\u034b\u0349\u035f\u033d\u035e\u0321", "\u0240\u0256\u025e\u0243\u020b\u0209\u021f\u027d\u027e\u021e\u0261", "\u011f\u0110\u0117\u0118\u0115\u0110\u0103\u011c\u0145\u0147\u0151\u0150\u012f"})
public final class Class2244 {
    public static float field6787 = 0.36219233f;
    public static double field6788 = Double.longBitsToDouble(0x4008000000000000L);

    /*
     * WARNING - void declaration
     */
    private static CallSite aMwJwIBLY7L3zz(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class2244.i2goYsihxIjTd1Ra(k2, 190457722));
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
                int a2 = Integer.parseInt(Class2244.i2goYsihxIjTd1Ra(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class2244.i2goYsihxIjTd1Ra(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class2244.i2goYsihxIjTd1Ra(k2, 190457722) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String i2goYsihxIjTd1Ra(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        G\u200e = "InAir";
    }
}

