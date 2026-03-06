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

@HACHIMI_CLIENT(mv=100, d1={"\u84dc\u84da\u84dd\u84dc\u84df\u84df\u84dc\u84dd", "\uacc8\uaccf\uaccb\uaccb\uaccd\uaccd\uaccd\uacc3", "\u4d1b\u4d1e\u4d1b\u4d1e\u4d1e\u4d17\u4d18\u4d1b", "\u057f\u0570\u057e\u057d\u057b\u057f\u0579\u0579", "\ue194\ue19b\ue197\ue194\ue192\ue195\ue19a\ue193", "\u5b29\u5b2b\u5b28\u5b2e\u5b2a\u5b2e\u5b29\u5b2f", "\ud5b4\ud5b7\ud5bc\ud5b2\ud5bd\ud5b0\ud5b6\ud5b5", "\u36ca\u36cc\u36cd\u36cc\u36cb\u36cc\u36c4\u36c5", "\ud4d2\ud4d2\ud4d3\ud4d2\ud4d5\ud4d3\ud4de\ud4d7", "\u45cc\u45cc\u45cc\u45c9\u45c6\u45c7\u45cc\u45c6", "\u7dbe\u7dbc\u7dbf\u7dbf\u7db8\u7dbd\u7db1\u7dbd", "\ua50b\ua50a\ua50f\ua50c\ua50e\ua50e\ua50b\ua506", "\u5486\u5481\u5487\u5487\u5485\u548a\u5486\u548b", "\u106a\u106b\u106a\u106b\u1069\u106c\u1069\u106c", "\ud847\ud845\ud844\ud847\ud843\ud844\ud847\ud847", "\u82e1\u82e3\u82ea\u82e1\u82e4\u82eb\u82e0\u82ea", "\ud015\ud014\ud015\ud014\ud017\ud019\ud013\ud015"}, d2={"\u0602\u0621\u0621\u2661\u0653\u0651\u0647\u0623\u0605\u060e\u0619\u060e\u0640\u0603\u060e\u0601\u0608\u0640\u063c\u061b\u061d\u0606\u0601\u0608\u0654\u0646\u0623\u0605\u060e\u0619\u060e\u0640\u0603\u060e\u0601\u0608\u0640\u063c\u061b\u061d\u0606\u0601\u0608\u0654", "\u05b7\u0594\u0595\u25d4\u05e6\u05e4\u05f2\u0596\u05b0\u05bb\u05ac\u05bb\u05f5\u05b6\u05bb\u05b4\u05bd\u05f5\u0589\u05ae\u05a8\u05b3\u05b4\u05bd\u05e1\u05f3\u0596\u05b0\u05bb\u05ac\u05bb\u05f5\u05b6\u05bb\u05b4\u05bd\u05f5\u0589\u05ae\u05a8\u05b3\u05b4\u05bd\u05e1", "C`~\u2020\u0012\u0010\u0006bDOXO\u0001BO@I\u0001}Z\\G@I\u0015\u0007bDOXO\u0001BO@I\u0001}Z\\G@I\u0015", "\u06db\u0684\u068b\u068e\u0689\u068e\u0693\u06d9\u06db\u06d9\u06cf\u06ce\u06b1", "\u0188\u01dd\u01da\u01dd\u01c0\u018a\u0188\u018a\u019c\u019d\u01e2", "\u05ae\u05ac\u05bd\u058a\u05a5\u05a8\u05ba\u05ba\u05f5\u05f7\u05e1\u05e0\u0585\u05a3\u05a8\u05bf\u05a8\u05e6\u05a5\u05a8\u05a7\u05ae\u05e6\u058a\u05a5\u05a8\u05ba\u05ba\u05f2", "\u01aa\u01a3\u01b1\u01aa\u0181\u01ad\u01a6\u01a7\u01fe\u01fc\u01ea\u01eb\u018b", "\u0396\u0382\u0386\u0392\u039f\u0380\u03cf\u03cd\u03db\u03bf\u0399\u0392\u0385\u0392\u03dc\u039f\u0392\u039d\u0394\u03dc\u03bc\u0391\u0399\u0396\u0390\u0387\u03c8\u03da\u03a9", "\u024d\u0242\u0241\u0240\u024b\u0212\u0210\u0206\u0207\u0262\u0244\u024f\u0258\u024f\u0201\u0242\u024f\u0240\u0249\u0201\u0261\u024c\u0244\u024b\u024d\u025a\u0215", "\u00a7\u00bc\u0080\u00a7\u00a1\u00ba\u00bd\u00b4\u00ef\u00ed\u00fb\u00fa\u009f\u00b9\u00b2\u00a5\u00b2\u00fc\u00bf\u00b2\u00bd\u00b4\u00fc\u0080\u00a7\u00a1\u00ba\u00bd\u00b4\u00e8", "\u076e\u076f\u0774\u0769\u0766\u0779\u073c\u073e\u0728\u0729\u0756", "\u074a\u074b\u0750\u074d\u0742\u075d\u0765\u0748\u0748\u0718\u071a\u070c\u070d\u0772", "\u0508\u051e\u0516\u050b\u0543\u0541\u0557\u0556\u0529", "\u0542\u0554\u055c\u0541\u0509\u050b\u051d\u057f\u051c\u0563", "\u04dc\u04ca\u04c2\u04df\u049b\u0497\u0495\u0483\u04e1\u0482\u04fd", "\u0681\u0697\u069f\u0682\u06ca\u06c8\u06de\u06bc\u06bf\u06df\u06a0", "\u04d3\u04dc\u04db\u04d4\u04d9\u04dc\u04cf\u04d0\u0489\u048b\u049d\u049c\u04e3"})
public final class Class1579 {
    public static double field5893 = 0.700940058510293;
    public static double field5894;
    public static float field5895;
    public static int field5896 = 926610767;
    public static float field5897;

    private static String jwxN1NJNNNxAbtol(String a2, int b2) {
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
    private static CallSite lBXOTy0Pse1GVI(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1579.jwxN1NJNNNxAbtol(k2, 722560567));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1579.jwxN1NJNNNxAbtol(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 == m2.intValue() ? 61656 : 61657;
            block7: while (true) {
                switch (n3) {
                    case 61657: {
                        n3 = 61655;
                        continue block7;
                    }
                    case 61656: {
                        String c2 = Class1579.jwxN1NJNNNxAbtol(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1579.jwxN1NJNNNxAbtol(k2, 722560567) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        aV\u200e = "Both";
        field5895 = Float.intBitsToFloat(1064837326);
        field5897 = Float.intBitsToFloat(1034152824);
        bx\u200e = "Prevents player from interacting with certain objects";
        bK\u200e = "1.2.2.1";
        field5894 = Double.longBitsToDouble(4591452771140018104L);
    }
}

