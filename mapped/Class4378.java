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

@HACHIMI_CLIENT(mv=100, d1={"\u6528\u652d\u652f\u6524\u652c\u6524\u6524\u652e", "\u6410\u6416\u641a\u6412\u6413\u6411\u6416\u6414", "\ue08e\ue08e\ue08f\ue08f\ue08d\ue084\ue089\ue08c", "\u85fb\u85f6\u85fe\u85fa\u85fc\u85f9\u85f9\u85fc", "\u64ae\u64ae\u64a8\u64ab\u64ad\u64aa\u64ae\u64a2", "\u397a\u3979\u397e\u3979\u397a\u397d\u3978\u397c", "\u5ece\u5ecc\u5ec8\u5ec5\u5ec4\u5ec8\u5ecf\u5eca", "\udc0d\udc05\udc04\udc0d\udc04\udc07\udc02", "\u0213\u0214\u0216\u0210\u0213\u0211\u0216\u0211", "\u59f5\u59f6\u59f4\u59f5\u59f4\u59f2\u59f1", "\u94aa\u94aa\u94a6\u94ac\u94aa\u94a7\u94af\u94ae", "\u772e\u7729\u7724\u7724\u772d\u7729\u7728\u772f", "\u8e53\u8e58\u8e54\u8e50\u8e56\u8e50\u8e57\u8e55", "\ue7a2\ue7a7\ue7a5\ue7ac\ue7ad\ue7a3\ue7a4\ue7a0", "\u89b9\u89bd\u89b8\u89be\u89b2\u89bf\u89bb\u89be", "\u9905\u9906\u9902\u990a\u9907\u9906\u9904\u9904", "\u459f\u4599\u459c\u459b\u459e\u459e\u459d\u459c"}, d2={"\u0775\u0741\u0753\u2717\u0725\u0727\u0731\u0755\u0773\u0778\u076f\u0778\u0736\u0775\u0778\u0777\u077e\u0736\u074a\u076d\u076b\u0770\u0777\u077e\u0722\u0730\u0755\u0773\u0778\u076f\u0778\u0736\u0775\u0778\u0777\u077e\u0736\u074a\u076d\u076b\u0770\u0777\u077e\u0722", "\u06da\u06ee\u06fd\u26b8\u068a\u0688\u069e\u06fa\u06dc\u06d7\u06c0\u06d7\u0699\u06da\u06d7\u06d8\u06d1\u0699\u06e5\u06c2\u06c4\u06df\u06d8\u06d1\u068d\u069f\u06fa\u06dc\u06d7\u06c0\u06d7\u0699\u06da\u06d7\u06d8\u06d1\u0699\u06e5\u06c2\u06c4\u06df\u06d8\u06d1\u068d", "\u00ff\u00cb\u00df\u209d\u00af\u00ad\u00bb\u00df\u00f9\u00f2\u00e5\u00f2\u00bc\u00ff\u00f2\u00fd\u00f4\u00bc\u00c0\u00e7\u00e1\u00fa\u00fd\u00f4\u00a8\u00ba\u00df\u00f9\u00f2\u00e5\u00f2\u00bc\u00ff\u00f2\u00fd\u00f4\u00bc\u00c0\u00e7\u00e1\u00fa\u00fd\u00f4\u00a8", "\u0687\u06d8\u06d7\u06d2\u06d5\u06d2\u06cf\u0685\u0687\u0685\u0693\u0692\u06ed", "\u041c\u0449\u044e\u0449\u0454\u041e\u041c\u041e\u0408\u0409\u0476", "\u0788\u078a\u079b\u07ac\u0783\u078e\u079c\u079c\u07d3\u07d1\u07c7\u07c6\u07a3\u0785\u078e\u0799\u078e\u07c0\u0783\u078e\u0781\u0788\u07c0\u07ac\u0783\u078e\u079c\u079c\u07d4", "\u0692\u069b\u0689\u0692\u06b9\u0695\u069e\u069f\u06c6\u06c4\u06d2\u06d3\u06b3", "&26\"/0\u007f}k\u000f)\"5\"l/\"-$l\f!)& 7xj\u0019", "\u05b9\u05b6\u05b5\u05b4\u05bf\u05e6\u05e4\u05f2\u05f3\u0596\u05b0\u05bb\u05ac\u05bb\u05f5\u05b6\u05bb\u05b4\u05bd\u05f5\u0595\u05b8\u05b0\u05bf\u05b9\u05ae\u05e1", "\u0101\u011a\u0126\u0101\u0107\u011c\u011b\u0112\u0149\u014b\u015d\u015c\u0139\u011f\u0114\u0103\u0114\u015a\u0119\u0114\u011b\u0112\u015a\u0126\u0101\u0107\u011c\u011b\u0112\u014e", "\u014d\u014c\u0157\u014a\u0145\u015a\u011f\u011d\u010b\u010a\u0175", "\u05b4\u05b5\u05ae\u05b3\u05bc\u05a3\u059b\u05b6\u05b6\u05e6\u05e4\u05f2\u05f3\u058c", "\u043d\u042b\u0423\u043e\u0476\u0474\u0462\u0463\u041c", "\u03cc\u03da\u03d2\u03cf\u0387\u0385\u0393\u03f1\u0392\u03ed", "\u0180\u0196\u019e\u0183\u01c7\u01cb\u01c9\u01df\u01bd\u01de\u01a1", "\u03dc\u03ca\u03c2\u03df\u0397\u0395\u0383\u03e1\u03e2\u0382\u03fd", "\u01d4\u01db\u01dc\u01d3\u01de\u01db\u01c8\u01d7\u018e\u018c\u019a\u019b\u01e4"})
public final class Class4378 {
    public static double field9985;
    public static int field9986 = 1374526425;
    public static float field9987;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite STe79dNbk5ANBH(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4378.E6HJDj9nF4NNkaQW(k2, -1684210893));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 26114 : 26115;
        block10: while (true) {
            switch (n3) {
                case 26115: {
                    n3 = 26113;
                    continue block10;
                }
                case 26114: {
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
                int a2 = Integer.parseInt(Class4378.E6HJDj9nF4NNkaQW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4378.E6HJDj9nF4NNkaQW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4378.E6HJDj9nF4NNkaQW(k2, -1684210893) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n4 = n2 == 1 ? 36527 : 36528;
        block12: while (true) {
            switch (n4) {
                case 36528: {
                    n4 = 36526;
                    continue block12;
                }
                case 36527: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String E6HJDj9nF4NNkaQW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        l\u200e = "InventoryManager";
        field9985 = Double.longBitsToDouble(0x3FE3333333333333L);
        r\u200e = "Prevents player from entering chunks that haven't been loaded";
        ar\u200e = "GrimV3";
        field9987 = Float.intBitsToFloat(1051198196);
    }
}

