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

@HACHIMI_CLIENT(mv=100, d1={"\u33db\u33d7\u33de\u33d7\u33da\u33dd\u33d9", "\u667b\u667a\u667f\u667a\u667e\u667d\u6677\u667c", "\u9731\u9731\u973b\u9737\u973b\u973a\u973a\u9733", "\ub14d\ub14d\ub14a\ub14d\ub14c\ub14f\ub14f\ub149", "\u701d\u7010\u7011\u7011\u7018\u7019\u701c\u701a", "\ue48f\ue48e\ue48b\ue489\ue48f\ue48b\ue482\ue48b", "\ubfb5\ubfb5\ubfb0\ubfba\ubfb6\ubfb6\ubfb1\ubfb6", "\u6d57\u6d57\u6d50\u6d5b\u6d54\u6d5a\u6d5b\u6d5a", "\u487b\u487d\u487d\u487c\u487c\u487e\u4873\u4878", "\u7160\u7160\u7165\u716d\u7167\u7160\u7162", "\uadd3\uadd9\uadd4\uadd7\uadd1\uadd2\uadd4\uadd6", "\u8abb\u8ab0\u8ab1\u8aba\u8abe\u8ab9\u8ab0\u8abd", "\u3d13\u3d11\u3d11\u3d13\u3d1f\u3d10\u3d1f\u3d11", "\u09f8\u09f4\u09fe\u09f5\u09fd\u09f5\u09fe\u09f5", "\u2203\u2208\u2205\u2204\u2202\u2201\u2203\u2201"}, d2={"\u023e\u0214\u0220\u225c\u026e\u026c\u027a\u021e\u0238\u0233\u0224\u0233\u027d\u023e\u0233\u023c\u0235\u027d\u0201\u0226\u0220\u023b\u023c\u0235\u0269\u027b\u021e\u0238\u0233\u0224\u0233\u027d\u023e\u0233\u023c\u0235\u027d\u0201\u0226\u0220\u023b\u023c\u0235\u0269", "\u0319\u0346\u0349\u034c\u034b\u034c\u0351\u031b\u0319\u031b\u030d\u030c\u0373", "\u0368\u033d\u033a\u033d\u0320\u036a\u0368\u036a\u037c\u037d\u0302", "\u03f3\u03f1\u03e0\u03d7\u03f8\u03f5\u03e7\u03e7\u03a8\u03aa\u03bc\u03bd\u03d8\u03fe\u03f5\u03e2\u03f5\u03bb\u03f8\u03f5\u03fa\u03f3\u03bb\u03d7\u03f8\u03f5\u03e7\u03e7\u03af", "\u055b\u0552\u0540\u055b\u0570\u055c\u0557\u0556\u050f\u050d\u051b\u051a\u057a", "\u024d\u0259\u025d\u0249\u0244\u025b\u0214\u0216\u0200\u0264\u0242\u0249\u025e\u0249\u0207\u0244\u0249\u0246\u024f\u0207\u0267\u024a\u0242\u024d\u024b\u025c\u0213\u0201\u0272", "\u0593\u059c\u059f\u059e\u0595\u05cc\u05ce\u05d8\u05d9\u05bc\u059a\u0591\u0586\u0591\u05df\u059c\u0591\u059e\u0597\u05df\u05bf\u0592\u059a\u0595\u0593\u0584\u05cb", "\u010a\u0111\u012d\u010a\u010c\u0117\u0110\u0119\u0142\u0140\u0156\u0157\u0132\u0114\u011f\u0108\u011f\u0151\u0112\u011f\u0110\u0119\u0151\u012d\u010a\u010c\u0117\u0110\u0119\u0145", "\u0472\u0473\u0468\u0475\u047a\u0465\u0420\u0422\u0434\u0435\u044a", "\u07ef\u07ee\u07f5\u07e8\u07e7\u07f8\u07c0\u07ed\u07ed\u07bd\u07bf\u07a9\u07a8\u07d7", "\u05db\u05cd\u05c5\u05d8\u0590\u0592\u0584\u0585\u05fa", "\u0703\u0715\u071d\u0700\u0748\u074a\u075c\u073e\u075d\u0722", "\u0425\u0433\u043b\u0426\u0462\u046e\u046c\u047a\u0418\u047b\u0404", "GQYD\f\u000e\u0018zy\u0019f", "\u0786\u0789\u078e\u0781\u078c\u0789\u079a\u0785\u07dc\u07de\u07c8\u07c9\u07b6"})
public final class Class1111 {
    public static double field4480;
    public static double field4481;
    public static double field4482;
    public static float field4483;

    /*
     * WARNING - void declaration
     */
    private static CallSite Inwrr5t6T7vyHY(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1111.aGaIDz1fyTrgjHry(k2, 177770855));
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
                int a2 = Integer.parseInt(Class1111.aGaIDz1fyTrgjHry(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1111.aGaIDz1fyTrgjHry(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1111.aGaIDz1fyTrgjHry(k2, 177770855) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String aGaIDz1fyTrgjHry(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field4482 = Double.longBitsToDouble(4605005529345508364L);
        field4483 = Float.intBitsToFloat(1040974080);
        aA\u200e = "OnlyOnGround";
        field4480 = Double.longBitsToDouble(4603292505436917661L);
        field4481 = Double.longBitsToDouble(4605926087167990910L);
    }
}

