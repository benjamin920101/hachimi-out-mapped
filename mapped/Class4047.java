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
@HACHIMI_CLIENT(mv=100, d1={"\ue639\ue639\ue634\ue63a\ue63f\ue634\ue63c\ue63d", "\ud208\ud20d\ud204\ud20a\ud20e\ud204\ud20f\ud208", "\u3fbc\u3fbf\u3fb0\u3fb8\u3fb0\u3fba\u3fbc", "\ud976\ud972\ud976\ud97c\ud972\ud97d\ud973\ud975", "\u44b6\u44be\u44b4\u44b0\u44b4\u44b2\u44b1\u44bf", "\u2587\u2587\u2583\u2585\u258c\u258d\u2585\u2580", "\u3ea3\u3ea7\u3ea5\u3ea4\u3ea8\u3ea2\u3ea3\u3ea4", "\ue0a7\ue0a6\ue0a3\ue0a1\ue0a7\ue0a0\ue0a6\ue0a4", "\ud9c4\ud9c0\ud9c2\ud9c7\ud9c6\ud9c4\ud9c1\ud9c3", "\u97e7\u97e5\u97e5\u97e1\u97ef\u97e0\u97e5\u97ee", "\u0891\u0892\u0896\u0898\u0897\u0898\u0894\u0899", "\u3519\u3519\u351b\u3518\u351e\u351c\u351a", "\u7faf\u7faf\u7fa8\u7fa2\u7fa3\u7fa3\u7fae", "\u2ff0\u2ffa\u2ff6\u2ff0\u2ff2\u2ffb\u2ff3\u2ff7", "\u61ea\u61e2\u61e2\u61eb\u61ef\u61e8\u61e9", "\uafba\uafb8\uafb9\uafbc\uafb9\uafba\uafb9\uafbd", "\u1de8\u1de8\u1de2\u1de2\u1de0\u1de6\u1de8", "\u9025\u9022\u9023\u9021\u902f\u902f\u9022\u9020"}, d2={"\u031e\u0337\u0311\u2376\u0344\u0346\u0350\u0334\u0312\u0319\u030e\u0319\u0357\u0314\u0319\u0316\u031f\u0357\u032b\u030c\u030a\u0311\u0316\u031f\u0343\u0351\u0334\u0312\u0319\u030e\u0319\u0357\u0314\u0319\u0316\u031f\u0357\u032b\u030c\u030a\u0311\u0316\u031f\u0343", "\u0402\u042b\u040e\u246a\u0458\u045a\u044c\u0428\u040e\u0405\u0412\u0405\u044b\u0408\u0405\u040a\u0403\u044b\u0437\u0410\u0416\u040d\u040a\u0403\u045f\u044d\u0428\u040e\u0405\u0412\u0405\u044b\u0408\u0405\u040a\u0403\u044b\u0437\u0410\u0416\u040d\u040a\u0403\u045f", "\u07ab\u0782\u07a6\u27c3\u07f1\u07f3\u07e5\u0781\u07a7\u07ac\u07bb\u07ac\u07e2\u07a1\u07ac\u07a3\u07aa\u07e2\u079e\u07b9\u07bf\u07a4\u07a3\u07aa\u07f6\u07e4\u0781\u07a7\u07ac\u07bb\u07ac\u07e2\u07a1\u07ac\u07a3\u07aa\u07e2\u079e\u07b9\u07bf\u07a4\u07a3\u07aa\u07f6", "\u0211\u0238\u021b\u2279\u024b\u0249\u025f\u023b\u021d\u0216\u0201\u0216\u0258\u021b\u0216\u0219\u0210\u0258\u0224\u0203\u0205\u021e\u0219\u0210\u024c\u025e\u023b\u021d\u0216\u0201\u0216\u0258\u021b\u0216\u0219\u0210\u0258\u0224\u0203\u0205\u021e\u0219\u0210\u024c", "\u009a\u00c5\u00ca\u00cf\u00c8\u00cf\u00d2\u0098\u009a\u0098\u008e\u008f\u00f0", "\u0193\u01c6\u01c1\u01c6\u01db\u0191\u0193\u0191\u0187\u0186\u01f9", "\u02b3\u02b1\u02a0\u0297\u02b8\u02b5\u02a7\u02a7\u02e8\u02ea\u02fc\u02fd\u0298\u02be\u02b5\u02a2\u02b5\u02fb\u02b8\u02b5\u02ba\u02b3\u02fb\u0297\u02b8\u02b5\u02a7\u02a7\u02ef", "\u07fb\u07f2\u07e0\u07fb\u07d0\u07fc\u07f7\u07f6\u07af\u07ad\u07bb\u07ba\u07da", "\u0590\u0584\u0580\u0594\u0599\u0586\u05c9\u05cb\u05dd\u05b9\u059f\u0594\u0583\u0594\u05da\u0599\u0594\u059b\u0592\u05da\u05ba\u0597\u059f\u0590\u0596\u0581\u05ce\u05dc\u05af", "\u019e\u0191\u0192\u0193\u0198\u01c1\u01c3\u01d5\u01d4\u01b1\u0197\u019c\u018b\u019c\u01d2\u0191\u019c\u0193\u019a\u01d2\u01b2\u019f\u0197\u0198\u019e\u0189\u01c6", "\u01db\u01c0\u01fc\u01db\u01dd\u01c6\u01c1\u01c8\u0193\u0191\u0187\u0186\u01e3\u01c5\u01ce\u01d9\u01ce\u0180\u01c3\u01ce\u01c1\u01c8\u0180\u01fc\u01db\u01dd\u01c6\u01c1\u01c8\u0194", "\u055a\u055b\u0540\u055d\u0552\u054d\u0508\u050a\u051c\u051d\u0562", "\u05d9\u05d8\u05c3\u05de\u05d1\u05ce\u05f6\u05db\u05db\u058b\u0589\u059f\u059e\u05e1", "\u02b2\u02a4\u02ac\u02b1\u02f9\u02fb\u02ed\u02ec\u0293", "\u076a\u077c\u0774\u0769\u0721\u0723\u0735\u0757\u0734\u074b", "\u007fia|846 B!^", "\u0518\u050e\u0506\u051b\u0553\u0551\u0547\u0525\u0526\u0546\u0539", "\u0213\u021c\u021b\u0214\u0219\u021c\u020f\u0210\u0249\u024b\u025d\u025c\u0223"})
public final class Class4047 {
    public static double field9329;
    public static long field9330 = 0xFFFFFFFFL;
    public static float field9331;
    public static int field9332 = 380769554;

    /*
     * WARNING - void declaration
     */
    private static CallSite geLGAYLS1Vxy2Q(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4047.2b1o1xDG8gVjBBAl(k2, 1017935341));
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
                int a2 = Integer.parseInt(Class4047.2b1o1xDG8gVjBBAl(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4047.2b1o1xDG8gVjBBAl(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4047.2b1o1xDG8gVjBBAl(k2, 1017935341) + " " + l2 + " " + m2);
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
        F\u200e = "It's empty here yet";
        P\u200e = "Decide which swap mode to use";
        af\u200e = "UnsafeColor";
        field9329 = Double.longBitsToDouble(4603272221971663633L);
        aX\u200e = "Changes rendering of world";
        field9331 = Float.intBitsToFloat(1053555366);
    }

    private static String 2b1o1xDG8gVjBBAl(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

