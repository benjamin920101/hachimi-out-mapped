/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u97c9\u97c8\u97ce\u97c9\u97cd\u97c3\u97cb\u97ce", "\u2fdc\u2fdc\u2fd0\u2fdd\u2fd0\u2fde\u2fd0\u2fdd", "\u4413\u4412\u4416\u4415\u4413\u4410\u4412\u4413", "\u03ab\u03ab\u03ad\u03a7\u03a9\u03ac\u03a9", "\u68df\u68d9\u68d9\u68d2\u68d3\u68d3\u68d9\u68da", "\u113e\u1132\u113e\u1132\u1139\u113d\u113c\u113a", "\u920e\u9209\u920f\u9209\u9200\u9208\u920b", "\uaf4d\uaf4c\uaf4a\uaf4e\uaf4f\uaf4c\uaf47\uaf4a", "\ue805\ue80c\ue80c\ue803\ue80d\ue800\ue801\ue802", "\udef3\udef0\udef1\udef3\udef3\udef3\udef0\udef9", "\ua879\ua87a\ua87c\ua878\ua87f\ua87b\ua87a\ua87f", "\u707c\u707e\u707e\u707d\u7077\u7077\u707e\u707c", "\u64f7\u64f1\u64f5\u64f0\u64f1\u64f4\u64f1", "\u8e80\u8e83\u8e83\u8e86\u8e87\u8e87\u8e88", "\uc02e\uc025\uc02a\uc02d\uc02c\uc02b\uc02a\uc029", "\ub0da\ub0da\ub0d9\ub0de\ub0de\ub0d6\ub0d8\ub0d9", "\ua31a\ua31f\ua317\ua31b\ua31c\ua317\ua316\ua319", "\ua749\ua74a\ua74b\ua74d\ua74d\ua74f\ua742\ua74d"}, d2={"\u06aa\u06a8\u0681\u26d7\u06e5\u06e7\u06f1\u0695\u06b3\u06b8\u06af\u06b8\u06f6\u06b5\u06b8\u06b7\u06be\u06f6\u068a\u06ad\u06ab\u06b0\u06b7\u06be\u06e2\u06f0\u0695\u06b3\u06b8\u06af\u06b8\u06f6\u06b5\u06b8\u06b7\u06be\u06f6\u068a\u06ad\u06ab\u06b0\u06b7\u06be\u06e2", "\u05d5\u05d7\u05ff\u25a8\u059a\u0598\u058e\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05f5\u05d2\u05d4\u05cf\u05c8\u05c1\u059d\u058f\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05f5\u05d2\u05d4\u05cf\u05c8\u05c1\u059d", "\u078c\u078e\u07a5\u27f1\u07c3\u07c1\u07d7\u07b3\u0795\u079e\u0789\u079e\u07d0\u0793\u079e\u0791\u0798\u07d0\u07ac\u078b\u078d\u0796\u0791\u0798\u07c4\u07d6\u07b3\u0795\u079e\u0789\u079e\u07d0\u0793\u079e\u0791\u0798\u07d0\u07ac\u078b\u078d\u0796\u0791\u0798\u07c4", "\u0795\u0794\u0787\u27e8\u07da\u07d8\u07ce\u07aa\u078c\u0787\u0790\u0787\u07c9\u078a\u0787\u0788\u0781\u07c9\u07b5\u0792\u0794\u078f\u0788\u0781\u07dd\u07cf\u07aa\u078c\u0787\u0790\u0787\u07c9\u078a\u0787\u0788\u0781\u07c9\u07b5\u0792\u0794\u078f\u0788\u0781\u07dd", "\u0213\u024c\u0243\u0246\u0241\u0246\u025b\u0211\u0213\u0211\u0207\u0206\u0279", "\u078f\u07da\u07dd\u07da\u07c7\u078d\u078f\u078d\u079b\u079a\u07e5", "\u0349\u034b\u035a\u036d\u0342\u034f\u035d\u035d\u0312\u0310\u0306\u0307\u0362\u0344\u034f\u0358\u034f\u0301\u0342\u034f\u0340\u0349\u0301\u036d\u0342\u034f\u035d\u035d\u0315", "\u00b6\u00bf\u00ad\u00b6\u009d\u00b1\u00ba\u00bb\u00e2\u00e0\u00f6\u00f7\u0097", "\u068a\u069e\u069a\u068e\u0683\u069c\u06d3\u06d1\u06c7\u06a3\u0685\u068e\u0699\u068e\u06c0\u0683\u068e\u0681\u0688\u06c0\u06a0\u068d\u0685\u068a\u068c\u069b\u06d4\u06c6\u06b5", "\u03b5\u03ba\u03b9\u03b8\u03b3\u03ea\u03e8\u03fe\u03ff\u039a\u03bc\u03b7\u03a0\u03b7\u03f9\u03ba\u03b7\u03b8\u03b1\u03f9\u0399\u03b4\u03bc\u03b3\u03b5\u03a2\u03ed", "\u0532\u0529\u0515\u0532\u0534\u052f\u0528\u0521\u057a\u0578\u056e\u056f\u050a\u052c\u0527\u0530\u0527\u0569\u052a\u0527\u0528\u0521\u0569\u0515\u0532\u0534\u052f\u0528\u0521\u057d", "\u0197\u0196\u018d\u0190\u019f\u0180\u01c5\u01c7\u01d1\u01d0\u01af", "\u019b\u019a\u0181\u019c\u0193\u018c\u01b4\u0199\u0199\u01c9\u01cb\u01dd\u01dc\u01a3", "\u07a3\u07b5\u07bd\u07a0\u07e8\u07ea\u07fc\u07fd\u0782", "\u06d7\u06c1\u06c9\u06d4\u069c\u069e\u0688\u06ea\u0689\u06f6", "\u074f\u0759\u0751\u074c\u0708\u0704\u0706\u0710\u0772\u0711\u076e", "\u0311\u0307\u030f\u0312\u035a\u0358\u034e\u032c\u032f\u034f\u0330", "\u06ee\u06e1\u06e6\u06e9\u06e4\u06e1\u06f2\u06ed\u06b4\u06b6\u06a0\u06a1\u06de"})
public final class Class1129 {
    public static double field4534;
    public static int field4535 = 1818976029;

    static {
        e\u200e = "Valid block blacklist";
        N\u200e = "Playtime";
        O\u200e = "The number of blocks to place per tick";
        field4534 = Double.longBitsToDouble(4606120643567531039L);
        ay\u200e = "NoCollision";
    }

    private static String uTjrBnDb7GsJN8Ay(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite nQFqAvcYBQLXq1(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1129.uTjrBnDb7GsJN8Ay(k, -172916598));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block6: while (true) {
            block13: {
                if (f >= q.length) break block13;
                v0 = 41157;
                ** GOTO lbl19
            }
            v0 = 41158;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 41156;
lbl19:
                // 3 sources

                switch (v0) {
                    case 41158: {
                        continue block7;
                    }
                    case 41157: {
                        try {
                            a = Integer.parseInt(Class1129.uTjrBnDb7GsJN8Ay(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class1129.uTjrBnDb7GsJN8Ay(r[f], l);
                            d = c.split("<>");
                            s = d[0];
                            t = d[1];
                            break block6;
                        }
lbl34:
                        // 3 sources

                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class1129.uTjrBnDb7GsJN8Ay(k, -172916598) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }
}

