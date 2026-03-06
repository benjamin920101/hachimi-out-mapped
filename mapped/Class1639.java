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

@HACHIMI_CLIENT(mv=100, d1={"\u822a\u822e\u822a\u822e\u822b\u822b\u822d\u8229", "\u24a2\u24a2\u24a3\u24a3\u24a6\u24a3\u24a2\u24a5", "\u9226\u9222\u9227\u9222\u9225\u9221\u922d\u9224", "\u5d01\u5d0d\u5d03\u5d07\u5d07\u5d06\u5d02\u5d06", "\u7b2c\u7b26\u7b2f\u7b2d\u7b28\u7b2d\u7b2b", "\u799c\u799f\u799e\u799b\u799a\u7999\u7999\u799f", "\u5bc0\u5bc3\u5bcc\u5bc5\u5bc5\u5bc1\u5bc2\u5bc3", "\u3ca8\u3cac\u3cae\u3caf\u3caa\u3cad\u3cab\u3cab", "\u6a93\u6a9d\u6a9d\u6a92\u6a90\u6a94\u6a9c\u6a96", "\u6e1d\u6e14\u6e18\u6e15\u6e1c\u6e14\u6e1b\u6e18", "\ue34e\ue348\ue34b\ue34d\ue348\ue344\ue34f\ue348", "\u27e4\u27e7\u27ef\u27e4\u27e1\u27e7\u27e1\u27e2", "\u3310\u3317\u3319\u3311\u3317\u3319\u3314", "\u0e7c\u0e7f\u0e7d\u0e7f\u0e7e\u0e7f\u0e72\u0e7c", "\u716a\u7169\u716a\u7161\u7168\u7160\u716e\u716d", "\uda89\uda8b\uda8a\uda89\uda85\uda8b\uda85\uda88"}, d2={"\u0160\u0161\u0165\u2109\u013b\u0139\u012f\u014b\u016d\u0166\u0171\u0166\u0128\u016b\u0166\u0169\u0160\u0128\u0154\u0173\u0175\u016e\u0169\u0160\u013c\u012e\u014b\u016d\u0166\u0171\u0166\u0128\u016b\u0166\u0169\u0160\u0128\u0154\u0173\u0175\u016e\u0169\u0160\u013c", "\u06b8\u06b9\u06bc\u26d1\u06e3\u06e1\u06f7\u0693\u06b5\u06be\u06a9\u06be\u06f0\u06b3\u06be\u06b1\u06b8\u06f0\u068c\u06ab\u06ad\u06b6\u06b1\u06b8\u06e4\u06f6\u0693\u06b5\u06be\u06a9\u06be\u06f0\u06b3\u06be\u06b1\u06b8\u06f0\u068c\u06ab\u06ad\u06b6\u06b1\u06b8\u06e4", "\u01df\u0180\u018f\u018a\u018d\u018a\u0197\u01dd\u01df\u01dd\u01cb\u01ca\u01b5", "\u04f8\u04ad\u04aa\u04ad\u04b0\u04fa\u04f8\u04fa\u04ec\u04ed\u0492", "\u0483\u0481\u0490\u04a7\u0488\u0485\u0497\u0497\u04d8\u04da\u04cc\u04cd\u04a8\u048e\u0485\u0492\u0485\u04cb\u0488\u0485\u048a\u0483\u04cb\u04a7\u0488\u0485\u0497\u0497\u04df", "\u025d\u0254\u0246\u025d\u0276\u025a\u0251\u0250\u0209\u020b\u021d\u021c\u027c", "\u0304\u0310\u0314\u0300\u030d\u0312\u035d\u035f\u0349\u032d\u030b\u0300\u0317\u0300\u034e\u030d\u0300\u030f\u0306\u034e\u032e\u0303\u030b\u0304\u0302\u0315\u035a\u0348\u033b", "\u04cd\u04c2\u04c1\u04c0\u04cb\u0492\u0490\u0486\u0487\u04e2\u04c4\u04cf\u04d8\u04cf\u0481\u04c2\u04cf\u04c0\u04c9\u0481\u04e1\u04cc\u04c4\u04cb\u04cd\u04da\u0495", "\u0398\u0383\u03bf\u0398\u039e\u0385\u0382\u038b\u03d0\u03d2\u03c4\u03c5\u03a0\u0386\u038d\u039a\u038d\u03c3\u0380\u038d\u0382\u038b\u03c3\u03bf\u0398\u039e\u0385\u0382\u038b\u03d7", "\u02c3\u02c2\u02d9\u02c4\u02cb\u02d4\u0291\u0293\u0285\u0284\u02fb", "\u04f8\u04f9\u04e2\u04ff\u04f0\u04ef\u04d7\u04fa\u04fa\u04aa\u04a8\u04be\u04bf\u04c0", "\u05c9\u05df\u05d7\u05ca\u0582\u0580\u0596\u0597\u05e8", "\u009d\u008b\u0083\u009e\u00d6\u00d4\u00c2\u00a0\u00c3\u00bc", "\u03ee\u03f8\u03f0\u03ed\u03a9\u03a5\u03a7\u03b1\u03d3\u03b0\u03cf", "BT\\A\t\u000b\u001d\u007f|\u001cc", "\u0688\u0687\u0680\u068f\u0682\u0687\u0694\u068b\u06d2\u06d0\u06c6\u06c7\u06b8"})
public final class Class1639 {
    public static double field6095;
    public static float field6096;
    public static double field6097 = 0.04007332602764346;
    public static double field6098;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite Fk98lAr8pu4Bgs(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1639.JBotOVbBLVSBva2n(k2, 1592346790));
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
                int a2 = Integer.parseInt(Class1639.JBotOVbBLVSBva2n(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1639.JBotOVbBLVSBva2n(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1639.JBotOVbBLVSBva2n(k2, 1592346790) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 != 1 ? 9467 : 9466;
        block7: while (true) {
            switch (n3) {
                case 9467: {
                    n3 = 9465;
                    continue block7;
                }
                case 9466: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field6096 = Float.intBitsToFloat(1062305145);
        aq\u200e = "MinBps";
        field6098 = Double.longBitsToDouble(4598723097411643214L);
        field6095 = Double.longBitsToDouble(4636737291354636288L);
        bG\u200e = "Could not find player 2b2t stats!";
    }

    private static String JBotOVbBLVSBva2n(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

