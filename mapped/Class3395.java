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
@HACHIMI_CLIENT(mv=100, d1={"\u0e5c\u0e5c\u0e59\u0e5b\u0e5d\u0e5c\u0e5a\u0e5d", "\u5c77\u5c73\u5c73\u5c70\u5c71\u5c77\u5c70\u5c76", "\u0a40\u0a46\u0a47\u0a40\u0a4a\u0a43\u0a4a\u0a43", "\u9fa2\u9fae\u9fa7\u9fa0\u9fa4\u9faf\u9fa7\u9fa6", "\u08f2\u08fb\u08f7\u08f5\u08f7\u08fa\u08f2\u08f0", "\u5309\u5305\u530b\u530c\u5304\u5305\u530f\u530c", "\u2584\u2584\u2583\u258e\u2587\u2581\u2583\u2581", "\u090c\u0909\u090b\u090a\u090e\u090d\u090a\u090e", "\u9153\u9150\u9154\u9152\u9151\u9155\u9156\u9157", "\u6ace\u6ac5\u6acd\u6ac5\u6ac9\u6ace\u6acc\u6acf", "\u511f\u5112\u5118\u511c\u511d\u511f\u5118\u511e", "\ue42b\ue42f\ue42c\ue429\ue428\ue42e\ue429\ue428", "\u228a\u228e\u228a\u228f\u228b\u228d\u228a\u228d", "\ud338\ud33b\ud33c\ud336\ud33f\ud336\ud336", "\u4bfe\u4bf2\u4bfa\u4bf2\u4bfb\u4bf3\u4bfa\u4bfb", "\u22dc\u22dc\u22dc\u22d9\u22df\u22d7\u22d9\u22dc", "\u9e97\u9e91\u9e9e\u9e92\u9e9e\u9e97\u9e93\u9e91"}, d2={"\u04de\u04f4\u04d8\u24bb\u0489\u048b\u049d\u04f9\u04df\u04d4\u04c3\u04d4\u049a\u04d9\u04d4\u04db\u04d2\u049a\u04e6\u04c1\u04c7\u04dc\u04db\u04d2\u048e\u049c\u04f9\u04df\u04d4\u04c3\u04d4\u049a\u04d9\u04d4\u04db\u04d2\u049a\u04e6\u04c1\u04c7\u04dc\u04db\u04d2\u048e", "\u0391\u03bb\u0394\u23f4\u03c6\u03c4\u03d2\u03b6\u0390\u039b\u038c\u039b\u03d5\u0396\u039b\u0394\u039d\u03d5\u03a9\u038e\u0388\u0393\u0394\u039d\u03c1\u03d3\u03b6\u0390\u039b\u038c\u039b\u03d5\u0396\u039b\u0394\u039d\u03d5\u03a9\u038e\u0388\u0393\u0394\u039d\u03c1", "\u034a\u0360\u034e\u232f\u031d\u031f\u0309\u036d\u034b\u0340\u0357\u0340\u030e\u034d\u0340\u034f\u0346\u030e\u0372\u0355\u0353\u0348\u034f\u0346\u031a\u0308\u036d\u034b\u0340\u0357\u0340\u030e\u034d\u0340\u034f\u0346\u030e\u0372\u0355\u0353\u0348\u034f\u0346\u031a", "\u0402\u045d\u0452\u0457\u0450\u0457\u044a\u0400\u0402\u0400\u0416\u0417\u0468", "\u0643\u0616\u0611\u0616\u060b\u0641\u0643\u0641\u0657\u0656\u0629", "\u0165\u0167\u0176\u0141\u016e\u0163\u0171\u0171\u013e\u013c\u012a\u012b\u014e\u0168\u0163\u0174\u0163\u012d\u016e\u0163\u016c\u0165\u012d\u0141\u016e\u0163\u0171\u0171\u0139", "\u01ba\u01b3\u01a1\u01ba\u0191\u01bd\u01b6\u01b7\u01ee\u01ec\u01fa\u01fb\u019b", "\u06ed\u06f9\u06fd\u06e9\u06e4\u06fb\u06b4\u06b6\u06a0\u06c4\u06e2\u06e9\u06fe\u06e9\u06a7\u06e4\u06e9\u06e6\u06ef\u06a7\u06c7\u06ea\u06e2\u06ed\u06eb\u06fc\u06b3\u06a1\u06d2", "\u052b\u0524\u0527\u0526\u052d\u0574\u0576\u0560\u0561\u0504\u0522\u0529\u053e\u0529\u0567\u0524\u0529\u0526\u052f\u0567\u0507\u052a\u0522\u052d\u052b\u053c\u0573", "\u07ab\u07b0\u078c\u07ab\u07ad\u07b6\u07b1\u07b8\u07e3\u07e1\u07f7\u07f6\u0793\u07b5\u07be\u07a9\u07be\u07f0\u07b3\u07be\u07b1\u07b8\u07f0\u078c\u07ab\u07ad\u07b6\u07b1\u07b8\u07e4", "67,1>!dfpq\u000e", "\u05da\u05db\u05c0\u05dd\u05d2\u05cd\u05f5\u05d8\u05d8\u0588\u058a\u059c\u059d\u05e2", "\u0560\u0576\u057e\u0563\u052b\u0529\u053f\u053e\u0541", "\u0422\u0434\u043c\u0421\u0469\u046b\u047d\u041f\u047c\u0403", "\u0600\u0616\u061e\u0603\u0647\u064b\u0649\u065f\u063d\u065e\u0621", "\u07e1\u07f7\u07ff\u07e2\u07aa\u07a8\u07be\u07dc\u07df\u07bf\u07c0", "\u054a\u0545\u0542\u054d\u0540\u0545\u0556\u0549\u0510\u0512\u0504\u0505\u057a"})
public final class Class3395 {
    public static float field7383;
    public static int field7384 = 2127289754;
    public static int field7385 = 233144185;
    public static double field7386;

    private static String 10wNA4JmIlcVIYAj(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7386 = Double.longBitsToDouble(4603519831939727763L);
        field7383 = Float.intBitsToFloat(1058510277);
        aS\u200e = "NORMAL";
        bf\u200e = "Configs";
        bu\u200e = "";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite jMOrEYDGUSGW2Y(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3395.10wNA4JmIlcVIYAj(k2, 1161833241));
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
                int a2 = Integer.parseInt(Class3395.10wNA4JmIlcVIYAj(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3395.10wNA4JmIlcVIYAj(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3395.10wNA4JmIlcVIYAj(k2, 1161833241) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

