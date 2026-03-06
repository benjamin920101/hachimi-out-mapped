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
@HACHIMI_CLIENT(mv=100, d1={"\u7b29\u7b2a\u7b2a\u7b23\u7b29\u7b2c\u7b2e", "\ub114\ub116\ub116\ub114\ub113\ub116\ub117\ub112", "\u815f\u8155\u8158\u815b\u815d\u8154\u815e\u815b", "\u6630\u6636\u6631\u663b\u6630\u663b\u6636\u663a", "\u8e32\u8e34\u8e34\u8e30\u8e34\u8e34\u8e31\u8e37", "\u1a1f\u1a18\u1a19\u1a1e\u1a1a\u1a18\u1a19\u1a1d", "\u260b\u260a\u260b\u260b\u260b\u2608\u2609\u260c", "\u9e76\u9e78\u9e77\u9e70\u9e79\u9e77\u9e73\u9e73", "\u7b4f\u7b4e\u7b4f\u7b48\u7b4c\u7b48\u7b4c\u7b4f", "\u5a8b\u5a84\u5a8b\u5a89\u5a88\u5a8e\u5a8b\u5a8f", "\u077a\u077f\u0777\u077c\u0777\u0777\u0777\u0776", "\ue20d\ue208\ue204\ue204\ue20b\ue20a\ue20c\ue205", "\ubf25\ubf22\ubf20\ubf24\ubf24\ubf24\ubf23\ubf25", "\u3db4\u3db4\u3db7\u3db5\u3db0\u3db8\u3db9\u3db2", "\u1ab3\u1ab6\u1ab1\u1ab6\u1ab1\u1abc\u1abc\u1ab1", "\u0e5b\u0e57\u0e59\u0e57\u0e56\u0e57\u0e5c\u0e5c", "\u8e72\u8e77\u8e71\u8e74\u8e73\u8e76\u8e77\u8e71"}, d2={"<\u00061\u2059ki\u007f\u001b=6!6x;690x\u0004#%>90l~\u001b=6!6x;690x\u0004#%>90l", "\u0580\u05ba\u058c\u25e5\u05d7\u05d5\u05c3\u05a7\u0581\u058a\u059d\u058a\u05c4\u0587\u058a\u0585\u058c\u05c4\u05b8\u059f\u0599\u0582\u0585\u058c\u05d0\u05c2\u05a7\u0581\u058a\u059d\u058a\u05c4\u0587\u058a\u0585\u058c\u05c4\u05b8\u059f\u0599\u0582\u0585\u058c\u05d0", "\u0776\u074c\u0775\u2713\u0721\u0723\u0735\u0751\u0777\u077c\u076b\u077c\u0732\u0771\u077c\u0773\u077a\u0732\u074e\u0769\u076f\u0774\u0773\u077a\u0726\u0734\u0751\u0777\u077c\u076b\u077c\u0732\u0771\u077c\u0773\u077a\u0732\u074e\u0769\u076f\u0774\u0773\u077a\u0726", "\u0315\u034a\u0345\u0340\u0347\u0340\u035d\u0317\u0315\u0317\u0301\u0300\u037f", "\u0779\u072c\u072b\u072c\u0731\u077b\u0779\u077b\u076d\u076c\u0713", "\u042c\u042e\u043f\u0408\u0427\u042a\u0438\u0438\u0477\u0475\u0463\u0462\u0407\u0421\u042a\u043d\u042a\u0464\u0427\u042a\u0425\u042c\u0464\u0408\u0427\u042a\u0438\u0438\u0470", "\u0308\u0301\u0313\u0308\u0323\u030f\u0304\u0305\u035c\u035e\u0348\u0349\u0329", "\u0392\u0386\u0382\u0396\u039b\u0384\u03cb\u03c9\u03df\u03bb\u039d\u0396\u0381\u0396\u03d8\u039b\u0396\u0399\u0390\u03d8\u03b8\u0395\u039d\u0392\u0394\u0383\u03cc\u03de\u03ad", "\u0776\u0779\u077a\u077b\u0770\u0729\u072b\u073d\u073c\u0759\u077f\u0774\u0763\u0774\u073a\u0779\u0774\u077b\u0772\u073a\u075a\u0777\u077f\u0770\u0776\u0761\u072e", "\u06ef\u06f4\u06c8\u06ef\u06e9\u06f2\u06f5\u06fc\u06a7\u06a5\u06b3\u06b2\u06d7\u06f1\u06fa\u06ed\u06fa\u06b4\u06f7\u06fa\u06f5\u06fc\u06b4\u06c8\u06ef\u06e9\u06f2\u06f5\u06fc\u06a0", "\u03f9\u03f8\u03e3\u03fe\u03f1\u03ee\u03ab\u03a9\u03bf\u03be\u03c1", "\u03b7\u03b6\u03ad\u03b0\u03bf\u03a0\u0398\u03b5\u03b5\u03e5\u03e7\u03f1\u03f0\u038f", "\u01a2\u01b4\u01bc\u01a1\u01e9\u01eb\u01fd\u01fc\u0183", "\u0445\u0453\u045b\u0446\u040e\u040c\u041a\u0478\u041b\u0464", "\u0328\u033e\u0336\u032b\u036f\u0363\u0361\u0377\u0315\u0376\u0309", "\u06d2\u06c4\u06cc\u06d1\u0699\u069b\u068d\u06ef\u06ec\u068c\u06f3", "\u036c\u0363\u0364\u036b\u0366\u0363\u0370\u036f\u0336\u0334\u0322\u0323\u035c"})
public final class Class472 {
    public static float field2459 = 0.32301527f;
    public static double field2460;
    public static float field2461;
    public static float field2462;
    public static float field2463;
    public static double field2464 = 0.1975275618871718;
    public static double field2465;

    static {
        field2463 = Float.intBitsToFloat(0x41100000);
        N\u200e = "Applies to ender pearls";
        O\u200e = "OutOfBlock";
        field2462 = Float.intBitsToFloat(1059667604);
        field2461 = Float.intBitsToFloat(1058094890);
        field2465 = Double.longBitsToDouble(4596102029065467612L);
        field2460 = Double.longBitsToDouble(4585069419755972272L);
        bH\u200e = "";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 4UZ9DQa5DS6N4j(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class472.gJmog0OAXjoCNFIB(k2, -693195373));
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
            block9: {
                void e2;
                int n3 = f2 < q2.length ? 44093 : 44094;
                while (true) {
                    int n4;
                    if ((n4 = n3) == 44093) {
                        try {
                            int a2 = Integer.parseInt(Class472.gJmog0OAXjoCNFIB(q2[f2], m2));
                            break;
                        }
                        catch (NumberFormatException b2) {
                            break block9;
                        }
                    }
                    if (n4 != 44094) break block2;
                    n3 = 44092;
                }
                if (e2 % 59557 == m2.intValue()) {
                    String c2 = Class472.gJmog0OAXjoCNFIB(r2[f2], l2);
                    String[] d2 = c2.split("<>");
                    s2 = d2[0];
                    t2 = d2[1];
                    break;
                }
            }
            ++f2;
        }
        int n5 = s2.isEmpty() ? 51095 : 51096;
        while (true) {
            int n6 = n5;
            if (n6 == 51095) throw new Exception("Can't find method in " + Class472.gJmog0OAXjoCNFIB(k2, -693195373) + " " + l2 + " " + m2);
            if (n6 != 51096) break;
            n5 = 51094;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String gJmog0OAXjoCNFIB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

