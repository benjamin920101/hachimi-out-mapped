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

@HACHIMI_CLIENT(mv=100, d1={"\uc9b2\uc9b8\uc9bb\uc9ba\uc9b3\uc9ba\uc9b9", "\u7b64\u7b69\u7b64\u7b66\u7b63\u7b68\u7b67\u7b68", "\u5f0d\u5f0c\u5f09\u5f0c\u5f0f\u5f0f\u5f09\u5f0b", "\ue468\ue46f\ue46b\ue46c\ue46e\ue460\ue46f\ue468", "\u70fb\u70fc\u70fd\u70fa\u70fe\u70f2\u70f9\u70fe", "\u8938\u893d\u893f\u893d\u893d\u893d\u8930", "\u89aa\u89a9\u89a8\u89ae\u89a4\u89a4\u89ad\u89a8", "\ubd3d\ubd30\ubd3a\ubd3b\ubd39\ubd3f\ubd3e", "\u16c6\u16c1\u16c4\u16c0\u16c2\u16c4\u16c3", "\ud65a\ud65a\ud65a\ud654\ud65a\ud652", "\u6db6\u6db0\u6db1\u6db4\u6db1\u6dbd\u6db2\u6db7", "\uce3a\uce3b\uce39\uce38\uce3d\uce32\uce32\uce3f", "\udc8c\udc89\udc88\udc8d\udc8f\udc8a\udc8e\udc8f", "\u5989\u5989\u598a\u598c\u5983\u598a\u598c\u598e"}, d2={"\u018c\u01d3\u01dc\u01d9\u01de\u01d9\u01c4\u018e\u018c\u018e\u0198\u0199\u01e6", "\u02a3\u02f6\u02f1\u02f6\u02eb\u02a1\u02a3\u02a1\u02b7\u02b6\u02c9", "\u03a0\u03a2\u03b3\u0384\u03ab\u03a6\u03b4\u03b4\u03fb\u03f9\u03ef\u03ee\u038b\u03ad\u03a6\u03b1\u03a6\u03e8\u03ab\u03a6\u03a9\u03a0\u03e8\u0384\u03ab\u03a6\u03b4\u03b4\u03fc", "\u071f\u0716\u0704\u071f\u0734\u0718\u0713\u0712\u074b\u0749\u075f\u075e\u073e", "\u02bd\u02a9\u02ad\u02b9\u02b4\u02ab\u02e4\u02e6\u02f0\u0294\u02b2\u02b9\u02ae\u02b9\u02f7\u02b4\u02b9\u02b6\u02bf\u02f7\u0297\u02ba\u02b2\u02bd\u02bb\u02ac\u02e3\u02f1\u0282", "\u02be\u02b1\u02b2\u02b3\u02b8\u02e1\u02e3\u02f5\u02f4\u0291\u02b7\u02bc\u02ab\u02bc\u02f2\u02b1\u02bc\u02b3\u02ba\u02f2\u0292\u02bf\u02b7\u02b8\u02be\u02a9\u02e6", "\u066e\u0675\u0649\u066e\u0668\u0673\u0674\u067d\u0626\u0624\u0632\u0633\u0656\u0670\u067b\u066c\u067b\u0635\u0676\u067b\u0674\u067d\u0635\u0649\u066e\u0668\u0673\u0674\u067d\u0621", "\u025f\u025e\u0245\u0258\u0257\u0248\u020d\u020f\u0219\u0218\u0267", "\u030c\u030d\u0316\u030b\u0304\u031b\u0323\u030e\u030e\u035e\u035c\u034a\u034b\u0334", "nxpm%'10O", "\u0644\u0652\u065a\u0647\u060f\u060d\u061b\u0679\u061a\u0665", "\u03f8\u03ee\u03e6\u03fb\u03bf\u03b3\u03b1\u03a7\u03c5\u03a6\u03d9", "\u053e\u0528\u0520\u053d\u0575\u0577\u0561\u0503\u0500\u0560\u051f", "\u069c\u0693\u0694\u069b\u0696\u0693\u0680\u069f\u06c6\u06c4\u06d2\u06d3\u06ac"})
public final class Class3240 {
    public static double field6947;
    public static float field6948;
    public static double field6949;
    public static double field6950;
    public static float field6951;
    public static double field6952;

    /*
     * WARNING - void declaration
     */
    private static CallSite o2fn00jljIEnCa(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3240.MY8DLZzIFxDEJivw(k2, 1523690697));
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
                int a2 = Integer.parseInt(Class3240.MY8DLZzIFxDEJivw(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3240.MY8DLZzIFxDEJivw(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3240.MY8DLZzIFxDEJivw(k2, 1523690697) + " " + l2 + " " + m2);
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
        field6949 = Double.longBitsToDouble(4603121680568856930L);
        field6948 = Float.intBitsToFloat(1059037676);
        field6950 = Double.longBitsToDouble(0x3FC3333333333333L);
        field6951 = Float.intBitsToFloat(1046177708);
        field6947 = Double.longBitsToDouble(4600271449289219694L);
        field6952 = Double.longBitsToDouble(4590429028186199163L);
    }

    private static String MY8DLZzIFxDEJivw(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

