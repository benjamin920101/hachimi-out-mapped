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

@HACHIMI_CLIENT(mv=100, d1={"\ucf4b\ucf44\ucf4e\ucf4a\ucf4a\ucf49\ucf4b\ucf48", "\ube24\ube24\ube2a\ube25\ube23\ube24\ube23\ube20", "\u56b7\u56bd\u56b7\u56b4\u56b6\u56b7\u56bd", "\u23dc\u23dd\u23de\u23d0\u23d1\u23dc\u23d9\u23d9", "\uc99e\uc99c\uc992\uc99f\uc998\uc99f", "\u47fa\u47f8\u47fb\u47f9\u47fa\u47f4\u47ff\u47f5", "\u9d5f\u9d5c\u9d5d\u9d59\u9d5d\u9d58\u9d5f\u9d59", "\ub365\ub36e\ub364\ub364\ub367\ub36f\ub362\ub361", "\u5aa7\u5aa7\u5aaa\u5aab\u5aab\u5aa4\u5aa1\u5aa1", "\u979b\u979b\u9796\u979b\u979b\u9797\u979f\u9796", "\u32ff\u32fb\u32f8\u32f8\u32f8\u32fb\u32f2\u32f9", "\u3152\u3156\u3152\u3155\u315e\u3153\u3152\u3155", "\u0508\u050e\u050a\u0505\u050c\u050e\u050c\u050f", "\u61d5\u61d5\u61d6\u61df\u61d7\u61d5\u61d1\u61d0", "\ud19e\ud19c\ud198\ud199\ud19f\ud190\ud191\ud198", "\u4676\u4674\u4679\u4670\u4676\u4673\u4675", "\u95a7\u95a7\u95a6\u95ab\u95a5\u95aa\u95a1\u95a4"}, d2={"\u07e5\u07e7\u07c4\u2799\u07ab\u07a9\u07bf\u07db\u07fd\u07f6\u07e1\u07f6\u07b8\u07fb\u07f6\u07f9\u07f0\u07b8\u07c4\u07e3\u07e5\u07fe\u07f9\u07f0\u07ac\u07be\u07db\u07fd\u07f6\u07e1\u07f6\u07b8\u07fb\u07f6\u07f9\u07f0\u07b8\u07c4\u07e3\u07e5\u07fe\u07f9\u07f0\u07ac", "\u028a\u0288\u02ac\u22f6\u02c4\u02c6\u02d0\u02b4\u0292\u0299\u028e\u0299\u02d7\u0294\u0299\u0296\u029f\u02d7\u02ab\u028c\u028a\u0291\u0296\u029f\u02c3\u02d1\u02b4\u0292\u0299\u028e\u0299\u02d7\u0294\u0299\u0296\u029f\u02d7\u02ab\u028c\u028a\u0291\u0296\u029f\u02c3", "\u02b9\u02bb\u029e\u22c5\u02f7\u02f5\u02e3\u0287\u02a1\u02aa\u02bd\u02aa\u02e4\u02a7\u02aa\u02a5\u02ac\u02e4\u0298\u02bf\u02b9\u02a2\u02a5\u02ac\u02f0\u02e2\u0287\u02a1\u02aa\u02bd\u02aa\u02e4\u02a7\u02aa\u02a5\u02ac\u02e4\u0298\u02bf\u02b9\u02a2\u02a5\u02ac\u02f0", "\u01d2\u018d\u0182\u0187\u0180\u0187\u019a\u01d0\u01d2\u01d0\u01c6\u01c7\u01b8", "\u0799\u07cc\u07cb\u07cc\u07d1\u079b\u0799\u079b\u078d\u078c\u07f3", "\u0366\u0364\u0375\u0342\u036d\u0360\u0372\u0372\u033d\u033f\u0329\u0328\u034d\u036b\u0360\u0377\u0360\u032e\u036d\u0360\u036f\u0366\u032e\u0342\u036d\u0360\u0372\u0372\u033a", "\u0220\u0229\u023b\u0220\u020b\u0227\u022c\u022d\u0274\u0276\u0260\u0261\u0201", "\u02a4\u02b0\u02b4\u02a0\u02ad\u02b2\u02fd\u02ff\u02e9\u028d\u02ab\u02a0\u02b7\u02a0\u02ee\u02ad\u02a0\u02af\u02a6\u02ee\u028e\u02a3\u02ab\u02a4\u02a2\u02b5\u02fa\u02e8\u029b", "\u012c\u0123\u0120\u0121\u012a\u0173\u0171\u0167\u0166\u0103\u0125\u012e\u0139\u012e\u0160\u0123\u012e\u0121\u0128\u0160\u0100\u012d\u0125\u012a\u012c\u013b\u0174", "\u0582\u0599\u05a5\u0582\u0584\u059f\u0598\u0591\u05ca\u05c8\u05de\u05df\u05ba\u059c\u0597\u0580\u0597\u05d9\u059a\u0597\u0598\u0591\u05d9\u05a5\u0582\u0584\u059f\u0598\u0591\u05cd", "\u04e6\u04e7\u04fc\u04e1\u04ee\u04f1\u04b4\u04b6\u04a0\u04a1\u04de", "\u00c8\u00c9\u00d2\u00cf\u00c0\u00df\u00e7\u00ca\u00ca\u009a\u0098\u008e\u008f\u00f0", "\u054f\u0559\u0551\u054c\u0504\u0506\u0510\u0511\u056e", "\u0482\u0494\u049c\u0481\u04c9\u04cb\u04dd\u04bf\u04dc\u04a3", "\u063b\u062d\u0625\u0638\u067c\u0670\u0672\u0664\u0606\u0665\u061a", "\u01e0\u01f6\u01fe\u01e3\u01ab\u01a9\u01bf\u01dd\u01de\u01be\u01c1", "\u06cb\u06c4\u06c3\u06cc\u06c1\u06c4\u06d7\u06c8\u0691\u0693\u0685\u0684\u06fb"})
public final class Class3258 {
    public static float field6996;

    private static String bqGAc7mFROOlUy9B(String a2, int b2) {
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
    private static CallSite ITKvvILTLwmCvd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        Class<?> o2 = Class.forName(Class3258.bqGAc7mFROOlUy9B(k2, 1388638275));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        int f2 = 0;
        block2: while (true) {
            block11: {
                void e2;
                int n3 = f2 < q2.length ? 42846 : 42847;
                while (true) {
                    int n4;
                    if ((n4 = n3) == 42846) {
                        try {
                            int a2 = Integer.parseInt(Class3258.bqGAc7mFROOlUy9B(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block11;
                        }
                    }
                    if (n4 != 42847) break block2;
                    n3 = 42845;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class3258.bqGAc7mFROOlUy9B(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3258.bqGAc7mFROOlUy9B(k2, 1388638275) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n5 = n2 == 1 ? 13551 : 13552;
        while (true) {
            MethodHandle v2;
            int n6;
            if ((n6 = n5) == 13551) {
                MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            if (n6 != 13552) {
                v2 = h2.findStatic(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            n5 = 13550;
        }
    }

    static {
        o\u200e = "Chests";
        aV\u200e = "The yaw to add during each rotation";
        bi\u200e = "WHITELIST";
        field6996 = Float.intBitsToFloat(1041752760);
    }
}

