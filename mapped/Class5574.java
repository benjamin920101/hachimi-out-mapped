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

@HACHIMI_CLIENT(mv=100, d1={"\ue5a2\ue5a5\ue5a3\ue5a5\ue5a3\ue5a5\ue5ae\ue5a2", "\ub6ff\ub6f2\ub6f1\ub6f4\ub6f3\ub6f3\ub6f5", "\u3a10\u3a17\u3a12\u3a11\u3a11\u3a11\u3a17\u3a16", "\u5a9b\u5a99\u5a90\u5a91\u5a9e\u5a9b\u5a9e\u5a9a", "\u5555\u5553\u5557\u5557\u5555\u5557\u5557\u5558", "\ud75f\ud759\ud75f\ud753\ud75c\ud752\ud752\ud753", "\ub25d\ub25c\ub251\ub25d\ub25f\ub25a\ub25a\ub25e", "\u9625\u9627\u9621\u9620\u9627\u9625\u9623\u9620", "\u04d1\u04d6\u04d4\u04d4\u04d1\u04d6\u04d0\u04d6", "\u9e81\u9e8d\u9e82\u9e81\u9e83\u9e85\u9e8c\u9e81", "\u8344\u8348\u8347\u8344\u8341\u8343\u8341\u8347", "\u88ed\u88ea\u88e1\u88ef\u88e1\u88e0\u88e1\u88ec", "\uc7c0\uc7c5\uc7c4\uc7cc\uc7cd\uc7c4\uc7cd\uc7c6", "\u148d\u1488\u1485\u1488\u148e\u148f\u148f", "\u4cfd\u4cfc\u4cfc\u4cf9\u4cf9\u4cff\u4cff\u4cf8", "\u4e7d\u4e78\u4e7d\u4e7c\u4e78\u4e7a\u4e76\u4e79"}, d2={"\u03ec\u03f0\u03f7\u2393\u03a1\u03a3\u03b5\u03d1\u03f7\u03fc\u03eb\u03fc\u03b2\u03f1\u03fc\u03f3\u03fa\u03b2\u03ce\u03e9\u03ef\u03f4\u03f3\u03fa\u03a6\u03b4\u03d1\u03f7\u03fc\u03eb\u03fc\u03b2\u03f1\u03fc\u03f3\u03fa\u03b2\u03ce\u03e9\u03ef\u03f4\u03f3\u03fa\u03a6", "\u04b5\u04a9\u04af\u24ca\u04f8\u04fa\u04ec\u0488\u04ae\u04a5\u04b2\u04a5\u04eb\u04a8\u04a5\u04aa\u04a3\u04eb\u0497\u04b0\u04b6\u04ad\u04aa\u04a3\u04ff\u04ed\u0488\u04ae\u04a5\u04b2\u04a5\u04eb\u04a8\u04a5\u04aa\u04a3\u04eb\u0497\u04b0\u04b6\u04ad\u04aa\u04a3\u04ff", "\u065f\u0600\u060f\u060a\u060d\u060a\u0617\u065d\u065f\u065d\u064b\u064a\u0635", "\u075c\u0709\u070e\u0709\u0714\u075e\u075c\u075e\u0748\u0749\u0736", "\u0551\u0553\u0542\u0575\u055a\u0557\u0545\u0545\u050a\u0508\u051e\u051f\u057a\u055c\u0557\u0540\u0557\u0519\u055a\u0557\u0558\u0551\u0519\u0575\u055a\u0557\u0545\u0545\u050d", "\u00cc\u00c5\u00d7\u00cc\u00e7\u00cb\u00c0\u00c1\u0098\u009a\u008c\u008d\u00ed", "\u01fa\u01ee\u01ea\u01fe\u01f3\u01ec\u01a3\u01a1\u01b7\u01d3\u01f5\u01fe\u01e9\u01fe\u01b0\u01f3\u01fe\u01f1\u01f8\u01b0\u01d0\u01fd\u01f5\u01fa\u01fc\u01eb\u01a4\u01b6\u01c5", "\u0688\u0687\u0684\u0685\u068e\u06d7\u06d5\u06c3\u06c2\u06a7\u0681\u068a\u069d\u068a\u06c4\u0687\u068a\u0685\u068c\u06c4\u06a4\u0689\u0681\u068e\u0688\u069f\u06d0", "\u02d7\u02cc\u02f0\u02d7\u02d1\u02ca\u02cd\u02c4\u029f\u029d\u028b\u028a\u02ef\u02c9\u02c2\u02d5\u02c2\u028c\u02cf\u02c2\u02cd\u02c4\u028c\u02f0\u02d7\u02d1\u02ca\u02cd\u02c4\u0298", "\u07be\u07bf\u07a4\u07b9\u07b6\u07a9\u07ec\u07ee\u07f8\u07f9\u0786", "\u02d3\u02d2\u02c9\u02d4\u02db\u02c4\u02fc\u02d1\u02d1\u0281\u0283\u0295\u0294\u02eb", "\u07a8\u07be\u07b6\u07ab\u07e3\u07e1\u07f7\u07f6\u0789", "\u0454\u0442\u044a\u0457\u041f\u041d\u040b\u0469\u040a\u0475", "\u03cc\u03da\u03d2\u03cf\u038b\u0387\u0385\u0393\u03f1\u0392\u03ed", "\u009d\u008b\u0083\u009e\u00d6\u00d4\u00c2\u00a0\u00a3\u00c3\u00bc", "\u01ac\u01a3\u01a4\u01ab\u01a6\u01a3\u01b0\u01af\u01f6\u01f4\u01e2\u01e3\u019c"})
public final class Class5574 {
    public static double field10576;
    public static float field10577;
    public static float field10578;
    public static double field10579;
    public static double field10580;
    public static float field10581;

    private static String jXY2d5aDyweFu4Dz(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite ureBg0MUWAL26w(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5574.jXY2d5aDyweFu4Dz(k2, 68777239));
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
                int a2 = Integer.parseInt(Class5574.jXY2d5aDyweFu4Dz(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5574.jXY2d5aDyweFu4Dz(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5574.jXY2d5aDyweFu4Dz(k2, 68777239) + " " + l2 + " " + m2);
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
        field10580 = Double.longBitsToDouble(4602678819172646912L);
        field10579 = Double.longBitsToDouble(4588808803930728096L);
        field10578 = Float.intBitsToFloat(1063601536);
        field10577 = Float.intBitsToFloat(1051813504);
        aB\u200e = "Overlay-Fire";
        field10581 = Float.intBitsToFloat(1047829508);
        field10576 = Double.longBitsToDouble(4595416866486328064L);
        bq\u200e = "The number of attacks before considering a crystal unbreakable";
    }
}

