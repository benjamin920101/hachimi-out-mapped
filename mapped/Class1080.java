/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u38d9\u38da\u38d4\u38d5\u38dd\u38d9\u38dc\u38db", "\u1521\u1520\u1523\u152d\u1523\u152c\u1527\u1522", "\u083f\u0838\u083a\u083f\u0831\u083b\u0839\u083e", "\u85a9\u85ab\u85a2\u85a2\u85a3\u85a9\u85ad\u85ac", "\uce16\uce11\uce1a\uce10\uce14\uce1b\uce14", "\u6fce\u6fc4\u6fc9\u6fc9\u6fca\u6fc8\u6fcb\u6fcd", "\ud1fd\ud1fd\ud1fd\ud1f8\ud1f3\ud1ff\ud1f8\ud1f8", "\u537f\u537b\u537d\u5370\u537f\u537f\u5378\u537d", "\u064d\u064f\u064a\u064b\u064d\u0641\u064b\u064b", "\u3f1c\u3f14\u3f1f\u3f1c\u3f14\u3f14\u3f1a", "\ubfc0\ubfc3\ubfcb\ubfc5\ubfc6\ubfc7\ubfc5", "\u806e\u806f\u806d\u806d\u8068\u806c\u8069\u806e", "\u3c22\u3c23\u3c26\u3c26\u3c20\u3c26\u3c23\u3c26", "\u8bf2\u8bf2\u8bf3\u8bf1\u8bf0\u8bf0\u8bf9\u8bf4", "\udafe\udafe\udaff\udaff\udaff\udafb\udaf9\udafa"}, d2={"\u05fc\u05c5\u05ef\u2599\u05ab\u05a9\u05bf\u05db\u05fd\u05f6\u05e1\u05f6\u05b8\u05fb\u05f6\u05f9\u05f0\u05b8\u05c4\u05e3\u05e5\u05fe\u05f9\u05f0\u05ac\u05be\u05db\u05fd\u05f6\u05e1\u05f6\u05b8\u05fb\u05f6\u05f9\u05f0\u05b8\u05c4\u05e3\u05e5\u05fe\u05f9\u05f0\u05ac", "\u070d\u0752\u075d\u0758\u075f\u0758\u0745\u070f\u070d\u070f\u0719\u0718\u0767", "\u0470\u0425\u0422\u0425\u0438\u0472\u0470\u0472\u0464\u0465\u041a", "\u05cc\u05ce\u05df\u05e8\u05c7\u05ca\u05d8\u05d8\u0597\u0595\u0583\u0582\u05e7\u05c1\u05ca\u05dd\u05ca\u0584\u05c7\u05ca\u05c5\u05cc\u0584\u05e8\u05c7\u05ca\u05d8\u05d8\u0590", "\u0487\u048e\u049c\u0487\u04ac\u0480\u048b\u048a\u04d3\u04d1\u04c7\u04c6\u04a6", "\u04a7\u04b3\u04b7\u04a3\u04ae\u04b1\u04fe\u04fc\u04ea\u048e\u04a8\u04a3\u04b4\u04a3\u04ed\u04ae\u04a3\u04ac\u04a5\u04ed\u048d\u04a0\u04a8\u04a7\u04a1\u04b6\u04f9\u04eb\u0498", "\u07b3\u07bc\u07bf\u07be\u07b5\u07ec\u07ee\u07f8\u07f9\u079c\u07ba\u07b1\u07a6\u07b1\u07ff\u07bc\u07b1\u07be\u07b7\u07ff\u079f\u07b2\u07ba\u07b5\u07b3\u07a4\u07eb", "\u00e5\u00fe\u00c2\u00e5\u00e3\u00f8\u00ff\u00f6\u00ad\u00af\u00b9\u00b8\u00dd\u00fb\u00f0\u00e7\u00f0\u00be\u00fd\u00f0\u00ff\u00f6\u00be\u00c2\u00e5\u00e3\u00f8\u00ff\u00f6\u00aa", "\u00c1\u00c0\u00db\u00c6\u00c9\u00d6\u0093\u0091\u0087\u0086\u00f9", "\u071c\u071d\u0706\u071b\u0714\u070b\u0733\u071e\u071e\u074e\u074c\u075a\u075b\u0724", "\u0658\u064e\u0646\u065b\u0613\u0611\u0607\u0606\u0679", "\u01aa\u01bc\u01b4\u01a9\u01e1\u01e3\u01f5\u0197\u01f4\u018b", "\u06d4\u06c2\u06ca\u06d7\u0693\u069f\u069d\u068b\u06e9\u068a\u06f5", "\u07ee\u07f8\u07f0\u07ed\u07a5\u07a7\u07b1\u07d3\u07d0\u07b0\u07cf", "\u0596\u0599\u059e\u0591\u059c\u0599\u058a\u0595\u05cc\u05ce\u05d8\u05d9\u05a6"})
public final class Class1080 {
    public static double field4388;
    public static double field4389 = 0.8837833538103889;
    public static float field4390;
    public static float field4391;

    private static String Hamd6N1HLpBdXQJB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field4390 = Float.intBitsToFloat(1055256934);
        field4388 = Double.longBitsToDouble(4634626229029306368L);
        field4391 = Float.intBitsToFloat(1059774919);
        aP\u200e = "Notification";
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite yYmrWda4aL29W9(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class1080.Hamd6N1HLpBdXQJB(k, -1417763627));
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
                v0 = 19651;
                ** GOTO lbl19
            }
            v0 = 19652;
            if (true) ** GOTO lbl19
            block7: while (true) {
                v0 = 19650;
lbl19:
                // 3 sources

                switch (v0) {
                    case 19652: {
                        continue block7;
                    }
                    case 19651: {
                        try {
                            a = Integer.parseInt(Class1080.Hamd6N1HLpBdXQJB(q[f], m));
                        }
                        catch (NumberFormatException b) {
                            ** GOTO lbl34
                        }
                        if (e % 59557 == m.intValue()) {
                            c = Class1080.Hamd6N1HLpBdXQJB(r[f], l);
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
            throw new Exception("Can't find method in " + Class1080.Hamd6N1HLpBdXQJB(k, -1417763627) + " " + l + " " + m);
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

