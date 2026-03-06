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

@HACHIMI_CLIENT(mv=100, d1={"\ue337\ue331\ue33e\ue330\ue333\ue330\ue330\ue337", "\ue0e5\ue0e6\ue0e5\ue0eb\ue0ea\ue0e0\ue0e5\ue0ea", "\ua3c4\ua3c5\ua3c3\ua3c3\ua3c7\ua3ce\ua3cf\ua3c4", "\ue101\ue104\ue107\ue107\ue10e\ue103\ue107\ue103", "\u3f08\u3f0a\u3f0f\u3f0b\u3f09\u3f0c\u3f09\u3f0d", "\u2102\u2104\u2105\u2101\u2106\u2102\u210f", "\uad23\uad20\uad23\uad22\uad26\uad21\uad2f\uad24", "\u5ec5\u5ec5\u5ec5\u5ec1\u5ec0\u5ec4\u5ec5\u5ec6", "\ud178\ud17b\ud17f\ud17a\ud177\ud17d\ud176\ud17d", "\u64d3\u64d5\u64d1\u64d1\u64df\u64d1\u64d3\u64d4", "\u3271\u3274\u3271\u3275\u3273\u3276\u3274\u3270", "\u1805\u1802\u1807\u1801\u1800\u1808\u1800\u1806", "\u1ed9\u1edf\u1ed4\u1edb\u1edd\u1edf\u1edc", "\u0a32\u0a31\u0a30\u0a32\u0a3e\u0a37\u0a30\u0a30", "\u34dc\u34d8\u34dc\u34d9\u34dc\u34dd\u34df\u34da", "\u4c97\u4c94\u4c91\u4c97\u4c9b\u4c90\u4c91\u4c93", "\udca4\udca8\udca7\udca7\udca4\udca0\udca9\udca0"}, d2={"\u032d\u0337\u0305\u2353\u0361\u0363\u0375\u0311\u0337\u033c\u032b\u033c\u0372\u0331\u033c\u0333\u033a\u0372\u030e\u0329\u032f\u0334\u0333\u033a\u0366\u0374\u0311\u0337\u033c\u032b\u033c\u0372\u0331\u033c\u0333\u033a\u0372\u030e\u0329\u032f\u0334\u0333\u033a\u0366", "\u0757\u074d\u077e\u2729\u071b\u0719\u070f\u076b\u074d\u0746\u0751\u0746\u0708\u074b\u0746\u0749\u0740\u0708\u0774\u0753\u0755\u074e\u0749\u0740\u071c\u070e\u076b\u074d\u0746\u0751\u0746\u0708\u074b\u0746\u0749\u0740\u0708\u0774\u0753\u0755\u074e\u0749\u0740\u071c", "\u0103\u0119\u0129\u217d\u014f\u014d\u015b\u013f\u0119\u0112\u0105\u0112\u015c\u011f\u0112\u011d\u0114\u015c\u0120\u0107\u0101\u011a\u011d\u0114\u0148\u015a\u013f\u0119\u0112\u0105\u0112\u015c\u011f\u0112\u011d\u0114\u015c\u0120\u0107\u0101\u011a\u011d\u0114\u0148", "\u00a0\u00ff\u00f0\u00f5\u00f2\u00f5\u00e8\u00a2\u00a0\u00a2\u00b4\u00b5\u00ca", "\u00f5\u00a0\u00a7\u00a0\u00bd\u00f7\u00f5\u00f7\u00e1\u00e0\u009f", "\u013f\u013d\u012c\u011b\u0134\u0139\u012b\u012b\u0164\u0166\u0170\u0171\u0114\u0132\u0139\u012e\u0139\u0177\u0134\u0139\u0136\u013f\u0177\u011b\u0134\u0139\u012b\u012b\u0163", "u|nu^ryx!#54T", "\u02bf\u02ab\u02af\u02bb\u02b6\u02a9\u02e6\u02e4\u02f2\u0296\u02b0\u02bb\u02ac\u02bb\u02f5\u02b6\u02bb\u02b4\u02bd\u02f5\u0295\u02b8\u02b0\u02bf\u02b9\u02ae\u02e1\u02f3\u0280", "\u056c\u0563\u0560\u0561\u056a\u0533\u0531\u0527\u0526\u0543\u0565\u056e\u0579\u056e\u0520\u0563\u056e\u0561\u0568\u0520\u0540\u056d\u0565\u056a\u056c\u057b\u0534", "\u07e2\u07f9\u07c5\u07e2\u07e4\u07ff\u07f8\u07f1\u07aa\u07a8\u07be\u07bf\u07da\u07fc\u07f7\u07e0\u07f7\u07b9\u07fa\u07f7\u07f8\u07f1\u07b9\u07c5\u07e2\u07e4\u07ff\u07f8\u07f1\u07ad", "\u03ec\u03ed\u03f6\u03eb\u03e4\u03fb\u03be\u03bc\u03aa\u03ab\u03d4", "\u01af\u01ae\u01b5\u01a8\u01a7\u01b8\u0180\u01ad\u01ad\u01fd\u01ff\u01e9\u01e8\u0197", "QGOR\u001a\u0018\u000e\u000fp", "\u017b\u016d\u0165\u0178\u0130\u0132\u0124\u0146\u0125\u015a", "\u044d\u045b\u0453\u044e\u040a\u0406\u0404\u0412\u0470\u0413\u046c", "\u0415\u0403\u040b\u0416\u045e\u045c\u044a\u0428\u042b\u044b\u0434", "\u024b\u0244\u0243\u024c\u0241\u0244\u0257\u0248\u0211\u0213\u0205\u0204\u027b"})
public final class Class3588 {
    public static float field7983;
    public static float field7984;
    public static float field7985;
    public static double field7986;
    public static float field7987;
    public static float field7988;
    public static float field7989;
    public static double field7990;
    public static float field7991;
    public static double field7992;

    static {
        field7984 = Float.intBitsToFloat(1052088918);
        field7990 = Double.longBitsToDouble(4604446113717806003L);
        field7987 = Float.intBitsToFloat(1056981203);
        field7992 = Double.longBitsToDouble(4604673833802304004L);
        af\u200e = "offset * baseSpeed + (offset * speed - velocity) * factor";
        field7988 = Float.intBitsToFloat(1062053791);
        aG\u200e = "MOUSE6";
        field7986 = Double.longBitsToDouble(4607102359336484204L);
        field7989 = Float.intBitsToFloat(1046502828);
        aW\u200e = "Adds a shine effect to the chams";
        field7991 = Float.intBitsToFloat(1049314872);
        field7983 = Float.intBitsToFloat(0x3DCCCCCD);
        field7985 = Float.intBitsToFloat(1060653277);
    }

    private static String pt2ZOgHh4BfdqvbC(String a2, int b2) {
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
    private static CallSite AlLyj4g7G87w8l(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3588.pt2ZOgHh4BfdqvbC(k2, -1076451379));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 16132 : 16133;
        while (true) {
            int n4;
            if ((n4 = n3) == 16132) {
                throw new Exception("Outdated metadata version");
            }
            if (n4 != 16133) break;
            n3 = 16131;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3588.pt2ZOgHh4BfdqvbC(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3588.pt2ZOgHh4BfdqvbC(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3588.pt2ZOgHh4BfdqvbC(k2, -1076451379) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

