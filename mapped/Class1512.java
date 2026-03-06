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

@HACHIMI_CLIENT(mv=100, d1={"\u6432\u6435\u6435\u6432\u6430\u6437\u643e\u6431", "\u9023\u9024\u9023\u9020\u9020\u9027\u9020\u9026", "\u1b8d\u1b87\u1b86\u1b8a\u1b8e\u1b87\u1b8f\u1b8a", "\ub00f\ub00e\ub00e\ub004\ub00c\ub009\ub00b\ub00c", "\u6e01\u6e06\u6e0a\u6e00\u6e06\u6e06\u6e03\u6e05", "\u876d\u876d\u876c\u8768\u8763\u876f\u8762\u876a", "\ua51a\ua51f\ua51b\ua51f\ua519\ua51f\ua517", "\u8bc2\u8bc3\u8bc3\u8bc6\u8bc6\u8bc4\u8bc0\u8bc5", "\u6e33\u6e36\u6e37\u6e37\u6e34\u6e38\u6e32\u6e39", "\u4b50\u4b5a\u4b52\u4b55\u4b52\u4b54\u4b56\u4b57", "\u4528\u4525\u4528\u452d\u4528\u4524", "\u638b\u638d\u638a\u638f\u6382\u6382\u6389\u6388", "\u5078\u507e\u507a\u507e\u5072\u507a\u5073\u507e", "\u0d41\u0d44\u0d43\u0d46\u0d46\u0d42\u0d4d\u0d4d"}, d2={"\u0136\u0169\u0166\u0163\u0164\u0163\u017e\u0134\u0136\u0134\u0122\u0123\u015c", "\u0449\u041c\u041b\u041c\u0401\u044b\u0449\u044b\u045d\u045c\u0423", "\u0530\u0532\u0523\u0514\u053b\u0536\u0524\u0524\u056b\u0569\u057f\u057e\u051b\u053d\u0536\u0521\u0536\u0578\u053b\u0536\u0539\u0530\u0578\u0514\u053b\u0536\u0524\u0524\u056c", "\u0374\u037d\u036f\u0374\u035f\u0373\u0378\u0379\u0320\u0322\u0334\u0335\u0355", "\u02a9\u02bd\u02b9\u02ad\u02a0\u02bf\u02f0\u02f2\u02e4\u0280\u02a6\u02ad\u02ba\u02ad\u02e3\u02a0\u02ad\u02a2\u02ab\u02e3\u0283\u02ae\u02a6\u02a9\u02af\u02b8\u02f7\u02e5\u0296", "\u075f\u0750\u0753\u0752\u0759\u0700\u0702\u0714\u0715\u0770\u0756\u075d\u074a\u075d\u0713\u0750\u075d\u0752\u075b\u0713\u0773\u075e\u0756\u0759\u075f\u0748\u0707", "\u0777\u076c\u0750\u0777\u0771\u076a\u076d\u0764\u073f\u073d\u072b\u072a\u074f\u0769\u0762\u0775\u0762\u072c\u076f\u0762\u076d\u0764\u072c\u0750\u0777\u0771\u076a\u076d\u0764\u0738", "\u01b7\u01b6\u01ad\u01b0\u01bf\u01a0\u01e5\u01e7\u01f1\u01f0\u018f", "\u00ce\u00cf\u00d4\u00c9\u00c6\u00d9\u00e1\u00cc\u00cc\u009c\u009e\u0088\u0089\u00f6", "\u00fd\u00eb\u00e3\u00fe\u00b6\u00b4\u00a2\u00a3\u00dc", "\u03c8\u03de\u03d6\u03cb\u0383\u0381\u0397\u03f5\u0396\u03e9", "\u065b\u064d\u0645\u0658\u061c\u0610\u0612\u0604\u0666\u0605\u067a", "\u04f6\u04e0\u04e8\u04f5\u04bd\u04bf\u04a9\u04cb\u04c8\u04a8\u04d7", "\u00a7\u00a8\u00af\u00a0\u00ad\u00a8\u00bb\u00a4\u00fd\u00ff\u00e9\u00e8\u0097"})
public final class Class1512 {
    public static float field5702 = 0.7443885f;
    public static float field5703;
    public static float field5704;
    public static float field5705;
    public static int field5706 = 1;
    public static int field5707 = 1426922834;

    static {
        field5704 = Float.intBitsToFloat(1063578361);
        field5703 = Float.intBitsToFloat(1062642847);
        field5705 = Float.intBitsToFloat(1069547520);
    }

    private static String NAdv092u4ndptDld(String a2, int b2) {
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
    private static CallSite nwAYYVjh77g44b(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1512.NAdv092u4ndptDld(k2, -1008473522));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 64898 : 64897;
        while (true) {
            int n4;
            if ((n4 = n3) == 64897) {
                throw new Exception("Outdated metadata version");
            }
            if (n4 != 64898) break;
            n3 = 64896;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1512.NAdv092u4ndptDld(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1512.NAdv092u4ndptDld(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1512.NAdv092u4ndptDld(k2, -1008473522) + " " + l2 + " " + m2);
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

