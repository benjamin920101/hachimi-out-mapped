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

@HACHIMI_CLIENT(mv=100, d1={"\uba31\uba36\uba30\uba30\uba38\uba38\uba39\uba32", "\ua43b\ua43d\ua438\ua43f\ua43a\ua43b\ua439", "\u666d\u666d\u666a\u6663\u666a\u666f\u666f", "\u34b0\u34b7\u34b3\u34b6\u34b3\u34b4\u34b1\u34b3", "\u2884\u2883\u288e\u2880\u2887\u2884\u288f\u2885", "\u5252\u5257\u5257\u5257\u5254\u5255\u525c\u5257", "\u987f\u9874\u987a\u9875\u987d\u9878\u9874\u987d", "\u75ec\u75ed\u75ea\u75e3\u75eb\u75e9\u75ef\u75e8", "\ua854\ua854\ua856\ua856\ua85b\ua853\ua854\ua853", "\uc72f\uc72e\uc72b\uc72a\uc72d\uc72e\uc72b\uc72d", "\u4dbd\u4dbe\u4db7\u4db6\u4db7\u4dba\u4db7\u4dba", "\ubd75\ubd77\ubd76\ubd70\ubd7f\ubd70\ubd75\ubd76", "\u5335\u5336\u5336\u5330\u5330\u5333\u5339\u5338", "\u802d\u8029\u802d\u8026\u8028\u802b\u802c\u8029"}, d2={"^\u0001\u000e\u000b\f\u000b\u0016\\^\\JK4", "\u057a\u052f\u0528\u052f\u0532\u0578\u057a\u0578\u056e\u056f\u0510", "\u0227\u0225\u0234\u0203\u022c\u0221\u0233\u0233\u027c\u027e\u0268\u0269\u020c\u022a\u0221\u0236\u0221\u026f\u022c\u0221\u022e\u0227\u026f\u0203\u022c\u0221\u0233\u0233\u027b", "\u00fd\u00f4\u00e6\u00fd\u00d6\u00fa\u00f1\u00f0\u00a9\u00ab\u00bd\u00bc\u00dc", "\u04c9\u04dd\u04d9\u04cd\u04c0\u04df\u0490\u0492\u0484\u04e0\u04c6\u04cd\u04da\u04cd\u0483\u04c0\u04cd\u04c2\u04cb\u0483\u04e3\u04ce\u04c6\u04c9\u04cf\u04d8\u0497\u0485\u04f6", "\u0004\u000b\b\t\u0002[YON+\r\u0006\u0011\u0006H\u000b\u0006\t\u0000H(\u0005\r\u0002\u0004\u0013\\", "\u07da\u07c1\u07fd\u07da\u07dc\u07c7\u07c0\u07c9\u0792\u0790\u0786\u0787\u07e2\u07c4\u07cf\u07d8\u07cf\u0781\u07c2\u07cf\u07c0\u07c9\u0781\u07fd\u07da\u07dc\u07c7\u07c0\u07c9\u0795", "\u05aa\u05ab\u05b0\u05ad\u05a2\u05bd\u05f8\u05fa\u05ec\u05ed\u0592", "\u034e\u034f\u0354\u0349\u0346\u0359\u0361\u034c\u034c\u031c\u031e\u0308\u0309\u0376", "\u00b4\u00a2\u00aa\u00b7\u00ff\u00fd\u00eb\u00ea\u0095", "\u0246\u0250\u0258\u0245\u020d\u020f\u0219\u027b\u0218\u0267", "\u029e\u0288\u0280\u029d\u02d9\u02d5\u02d7\u02c1\u02a3\u02c0\u02bf", "\u05e0\u05f6\u05fe\u05e3\u05ab\u05a9\u05bf\u05dd\u05de\u05be\u05c1", "\u07a5\u07aa\u07ad\u07a2\u07af\u07aa\u07b9\u07a6\u07ff\u07fd\u07eb\u07ea\u0795"})
public final class Class3551 {
    public static double field7869 = Double.longBitsToDouble(4599159424174064552L);
    public static long field7870 = 8266214314240448162L;
    public static double field7871 = 0.2663788681199536;
    public static double field7872 = 0.07121399750152446;
    public static double field7873 = Double.longBitsToDouble(4604612349797557708L);
    public static int field7874 = 1;

    /*
     * WARNING - void declaration
     */
    private static CallSite kDrTVDuGTzZJmb(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3551.FSAsVh41U4IHTjJl(k2, 1856322964));
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
                int a2 = Integer.parseInt(Class3551.FSAsVh41U4IHTjJl(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3551.FSAsVh41U4IHTjJl(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3551.FSAsVh41U4IHTjJl(k2, 1856322964) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String FSAsVh41U4IHTjJl(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

