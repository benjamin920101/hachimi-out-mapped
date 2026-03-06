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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u5192\u5199\u5192\u5196\u5193\u5193\u5198\u5193", "\ud196\ud19a\ud190\ud194\ud191\ud197\ud190\ud19a", "\ud4e5\ud4ea\ud4e7\ud4ea\ud4e4\ud4ea\ud4e7\ud4e6", "\ubefd\ubef7\ubef5\ubefd\ubef4\ubef1\ubef3", "\u2ae0\u2ae2\u2ae6\u2ae1\u2aeb\u2ae2\u2ae3\u2ae1", "\u91f5\u91f1\u91f4\u91f3\u91f5\u91f0\u91f0\u91f3", "\u1da4\u1da9\u1dae\u1da8\u1dae\u1daf\u1dad", "\ua31d\ua317\ua31f\ua31f\ua31f\ua31c", "\u0f2a\u0f20\u0f2a\u0f21\u0f2b\u0f2c\u0f2b\u0f21", "\u265b\u265a\u265a\u265a\u265a\u2657\u265d\u2658", "\u0496\u0490\u0490\u0493\u0494\u0496\u0494\u0490", "\u7d0c\u7d0a\u7d0d\u7d02\u7d0a\u7d0b\u7d03\u7d02", "\u51f1\u51f1\u51f4\u51f7\u51f0\u51ff\u51f0\u51f1", "\u2403\u2404\u240a\u2404\u2401\u240a\u240b\u2405", "\u9fcd\u9fc5\u9fc5\u9fc5\u9fce\u9fc9\u9fc9\u9fcd", "\uced6\uced6\uced3\uced5\ucedf\uced4\uced2\uced3", "\u04b6\u04b4\u04b4\u04b1\u04b6\u04b0\u04ba\u04b7"}, d2={"\u017b\u017a\u016c\u2101\u0133\u0131\u0127\u0143\u0165\u016e\u0179\u016e\u0120\u0163\u016e\u0161\u0168\u0120\u015c\u017b\u017d\u0166\u0161\u0168\u0134\u0126\u0143\u0165\u016e\u0179\u016e\u0120\u0163\u016e\u0161\u0168\u0120\u015c\u017b\u017d\u0166\u0161\u0168\u0134", "45$\u204e|~h\f*!6!o,!.'o\u001342).'{i\f*!6!o,!.'o\u001342).'{", "\u064e\u064f\u065f\u2634\u0606\u0604\u0612\u0676\u0650\u065b\u064c\u065b\u0615\u0656\u065b\u0654\u065d\u0615\u0669\u064e\u0648\u0653\u0654\u065d\u0601\u0613\u0676\u0650\u065b\u064c\u065b\u0615\u0656\u065b\u0654\u065d\u0615\u0669\u064e\u0648\u0653\u0654\u065d\u0601", "\u01ff\u01a0\u01af\u01aa\u01ad\u01aa\u01b7\u01fd\u01ff\u01fd\u01eb\u01ea\u0195", "\u05f0\u05a5\u05a2\u05a5\u05b8\u05f2\u05f0\u05f2\u05e4\u05e5\u059a", "\u078d\u078f\u079e\u07a9\u0786\u078b\u0799\u0799\u07d6\u07d4\u07c2\u07c3\u07a6\u0780\u078b\u079c\u078b\u07c5\u0786\u078b\u0784\u078d\u07c5\u07a9\u0786\u078b\u0799\u0799\u07d1", "\u0715\u071c\u070e\u0715\u073e\u0712\u0719\u0718\u0741\u0743\u0755\u0754\u0734", "\u00f0\u00e4\u00e0\u00f4\u00f9\u00e6\u00a9\u00ab\u00bd\u00d9\u00ff\u00f4\u00e3\u00f4\u00ba\u00f9\u00f4\u00fb\u00f2\u00ba\u00da\u00f7\u00ff\u00f0\u00f6\u00e1\u00ae\u00bc\u00cf", "\u076d\u0762\u0761\u0760\u076b\u0732\u0730\u0726\u0727\u0742\u0764\u076f\u0778\u076f\u0721\u0762\u076f\u0760\u0769\u0721\u0741\u076c\u0764\u076b\u076d\u077a\u0735", "\u04ab\u04b0\u048c\u04ab\u04ad\u04b6\u04b1\u04b8\u04e3\u04e1\u04f7\u04f6\u0493\u04b5\u04be\u04a9\u04be\u04f0\u04b3\u04be\u04b1\u04b8\u04f0\u048c\u04ab\u04ad\u04b6\u04b1\u04b8\u04e4", "\u027c\u027d\u0266\u027b\u0274\u026b\u022e\u022c\u023a\u023b\u0244", "\u05d0\u05d1\u05ca\u05d7\u05d8\u05c7\u05ff\u05d2\u05d2\u0582\u0580\u0596\u0597\u05e8", "\u02c8\u02de\u02d6\u02cb\u0283\u0281\u0297\u0296\u02e9", "\u0676\u0660\u0668\u0675\u063d\u063f\u0629\u064b\u0628\u0657", "\u04b3\u04a5\u04ad\u04b0\u04f4\u04f8\u04fa\u04ec\u048e\u04ed\u0492", "\u02f4\u02e2\u02ea\u02f7\u02bf\u02bd\u02ab\u02c9\u02ca\u02aa\u02d5", "1>96;>-2ki\u007f~\u0001"})
public final class Class1678 {
    public static int field6217 = -1508641861;
    public static float field6218;
    public static float field6219;
    public static float field6220;
    public static float field6221;
    public static double field6222;
    public static float field6223;
    public static float field6224;

    /*
     * WARNING - void declaration
     */
    private static CallSite 4tvFEMEI4Iown8(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1678.mGpEya3lmDAwoxIc(k2, -328436568));
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
                int a2 = Integer.parseInt(Class1678.mGpEya3lmDAwoxIc(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1678.mGpEya3lmDAwoxIc(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1678.mGpEya3lmDAwoxIc(k2, -328436568) + " " + l2 + " " + m2);
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
        field6223 = Float.intBitsToFloat(1052499770);
        field6220 = Float.intBitsToFloat(1059482254);
        C\u200e = "Render";
        field6218 = Float.intBitsToFloat(0x3F000000);
        field6224 = Float.intBitsToFloat(1057545936);
        af\u200e = "AutoFly";
        field6221 = Float.intBitsToFloat(0x40800000);
        aW\u200e = "BreakRange";
        field6219 = Float.intBitsToFloat(1032025000);
        field6222 = Double.longBitsToDouble(4604093768115418344L);
    }

    private static String mGpEya3lmDAwoxIc(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

