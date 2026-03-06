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

@HACHIMI_CLIENT(mv=100, d1={"\ue3a6\ue3a5\ue3a3\ue3a2\ue3aa\ue3a0\ue3aa\ue3aa", "\u0081\u008c\u0086\u0080\u0082\u008d\u0086\u0082", "\uc7de\uc7d9\uc7d2\uc7d8\uc7df\uc7df\uc7dd\uc7d9", "\u485e\u485c\u4858\u485a\u4859\u4858\u485c\u4858", "\u6699\u6692\u6693\u669d\u669e\u6692\u669d", "\u8a65\u8a66\u8a66\u8a6e\u8a6e\u8a66\u8a67", "\u10b3\u10b4\u10b0\u10b2\u10b4\u10b5\u10b1\u10bd", "\u5dcb\u5dcb\u5dce\u5dcf\u5dcb\u5dcf\u5dce\u5dc9", "\ucf51\ucf57\ucf57\ucf5f\ucf50\ucf5e\ucf52", "\u9802\u9804\u9808\u9804\u9800\u9809\u9802\u9803", "\u4612\u4610\u4614\u4610\u4616\u4614\u4612\u4617", "\u6a79\u6a7a\u6a7a\u6a7a\u6a79\u6a75\u6a7d\u6a75", "\ucfc4\ucfc5\ucfc4\ucfce\ucfc6\ucfc2\ucfc0\ucfce", "\uce76\uce73\uce7a\uce72\uce70\uce70\uce77\uce7b", "\ud3cd\ud3c9\ud3cc\ud3c9\ud3c9\ud3cd\ud3c7\ud3cb", "\u7c01\u7c02\u7c00\u7c06\u7c00\u7c01\u7c03\u7c02"}, d2={"\u05e9\u05fc\u05f7\u258a\u05b8\u05ba\u05ac\u05c8\u05ee\u05e5\u05f2\u05e5\u05ab\u05e8\u05e5\u05ea\u05e3\u05ab\u05d7\u05f0\u05f6\u05ed\u05ea\u05e3\u05bf\u05ad\u05c8\u05ee\u05e5\u05f2\u05e5\u05ab\u05e8\u05e5\u05ea\u05e3\u05ab\u05d7\u05f0\u05f6\u05ed\u05ea\u05e3\u05bf", "\u019e\u018b\u0187\u21fd\u01cf\u01cd\u01db\u01bf\u0199\u0192\u0185\u0192\u01dc\u019f\u0192\u019d\u0194\u01dc\u01a0\u0187\u0181\u019a\u019d\u0194\u01c8\u01da\u01bf\u0199\u0192\u0185\u0192\u01dc\u019f\u0192\u019d\u0194\u01dc\u01a0\u0187\u0181\u019a\u019d\u0194\u01c8", "\u02a5\u02fa\u02f5\u02f0\u02f7\u02f0\u02ed\u02a7\u02a5\u02a7\u02b1\u02b0\u02cf", "\u0468\u043d\u043a\u043d\u0420\u046a\u0468\u046a\u047c\u047d\u0402", "\u07e3\u07e1\u07f0\u07c7\u07e8\u07e5\u07f7\u07f7\u07b8\u07ba\u07ac\u07ad\u07c8\u07ee\u07e5\u07f2\u07e5\u07ab\u07e8\u07e5\u07ea\u07e3\u07ab\u07c7\u07e8\u07e5\u07f7\u07f7\u07bf", "\u06d3\u06da\u06c8\u06d3\u06f8\u06d4\u06df\u06de\u0687\u0685\u0693\u0692\u06f2", "\u0119\u010d\u0109\u011d\u0110\u010f\u0140\u0142\u0154\u0130\u0116\u011d\u010a\u011d\u0153\u0110\u011d\u0112\u011b\u0153\u0133\u011e\u0116\u0119\u011f\u0108\u0147\u0155\u0126", "\u0196\u0199\u019a\u019b\u0190\u01c9\u01cb\u01dd\u01dc\u01b9\u019f\u0194\u0183\u0194\u01da\u0199\u0194\u019b\u0192\u01da\u01ba\u0197\u019f\u0190\u0196\u0181\u01ce", "\u02f4\u02ef\u02d3\u02f4\u02f2\u02e9\u02ee\u02e7\u02bc\u02be\u02a8\u02a9\u02cc\u02ea\u02e1\u02f6\u02e1\u02af\u02ec\u02e1\u02ee\u02e7\u02af\u02d3\u02f4\u02f2\u02e9\u02ee\u02e7\u02bb", "z{`}rm(*<=B", "\u0680\u0681\u069a\u0687\u0688\u0697\u06af\u0682\u0682\u06d2\u06d0\u06c6\u06c7\u06b8", "\u0391\u0387\u038f\u0392\u03da\u03d8\u03ce\u03cf\u03b0", "\u0771\u0767\u076f\u0772\u073a\u0738\u072e\u074c\u072f\u0750", "\u0196\u0180\u0188\u0195\u01d1\u01dd\u01df\u01c9\u01ab\u01c8\u01b7", "\u0778\u076e\u0766\u077b\u0733\u0731\u0727\u0745\u0746\u0726\u0759", "\u061b\u0614\u0613\u061c\u0611\u0614\u0607\u0618\u0641\u0643\u0655\u0654\u062b"})
public final class Class4034 {
    public static float field9286;
    public static int field9287 = 1349815123;
    public static double field9288;
    public static float field9289;
    public static float field9290;
    public static double field9291;
    public static float field9292;
    public static double field9293;
    public static float field9294;
    public static int field9295 = -762648645;

    private static String yY2UIGCAirbSOtw5(String a2, int b2) {
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
    private static CallSite VHVmgIrlftpnmJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4034.yY2UIGCAirbSOtw5(k2, -1670657175));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 64352 : 64353;
        block6: while (true) {
            switch (n3) {
                case 64353: {
                    n3 = 64351;
                    continue block6;
                }
                case 64352: {
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
                int a2 = Integer.parseInt(Class4034.yY2UIGCAirbSOtw5(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4034.yY2UIGCAirbSOtw5(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class4034.yY2UIGCAirbSOtw5(k2, -1670657175) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field9288 = Double.longBitsToDouble(4601627975905515848L);
        field9291 = Double.longBitsToDouble(4605541611965928999L);
        field9294 = Float.intBitsToFloat(1064253867);
        t\u200e = "Strict";
        field9290 = Float.intBitsToFloat(1061997773);
        au\u200e = "Pause";
        field9289 = Float.intBitsToFloat(1040853620);
        field9293 = Double.longBitsToDouble(4618441417868443648L);
        field9292 = Float.intBitsToFloat(1060561689);
        field9286 = Float.intBitsToFloat(1061868068);
    }
}

