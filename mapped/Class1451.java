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

@HACHIMI_CLIENT(mv=100, d1={"\u7fee\u7fea\u7fec\u7fee\u7feb\u7fea\u7fe9\u7fe9", "\u04e6\u04e0\u04ee\u04e5\u04e0\u04ef\u04ee\u04e1", "\u213d\u213b\u2139\u2139\u213b\u213e\u2133\u213d", "\u6b80\u6b8e\u6b8e\u6b87\u6b83\u6b8f\u6b86\u6b8f", "\u9ca3\u9ca4\u9ca0\u9cab\u9cab\u9ca3\u9ca6\u9ca1", "\u239b\u2396\u239f\u2397\u239b\u239e\u239f\u239c", "\u2287\u2282\u2286\u2286\u2282\u2281\u228e\u2287", "\u8652\u8655\u8657\u8654\u8651\u8652\u8650\u8656", "\u8c42\u8c45\u8c47\u8c43\u8c43\u8c44\u8c44\u8c40", "\ud4ac\ud4ae\ud4a8\ud4ae\ud4af\ud4ab\ud4a7\ud4ab", "\u0c6e\u0c6d\u0c63\u0c6e\u0c6c\u0c6f\u0c6e\u0c6d", "\ucd43\ucd44\ucd40\ucd43\ucd47\ucd41\ucd48\ucd41", "\ue459\ue45e\ue45b\ue459\ue45e\ue458\ue45b\ue459", "\u3fbb\u3fb9\u3fbc\u3fbb\u3fbe\u3fbb\u3fba\u3fb9", "\u6d72\u6d73\u6d74\u6d76\u6d74\u6d75", "\u4eb0\u4eb2\u4eb2\u4ebb\u4eb2\u4eba\u4eb2\u4eb5"}, d2={"\u01eb\u01d6\u01d4\u2189\u01bb\u01b9\u01af\u01cb\u01ed\u01e6\u01f1\u01e6\u01a8\u01eb\u01e6\u01e9\u01e0\u01a8\u01d4\u01f3\u01f5\u01ee\u01e9\u01e0\u01bc\u01ae\u01cb\u01ed\u01e6\u01f1\u01e6\u01a8\u01eb\u01e6\u01e9\u01e0\u01a8\u01d4\u01f3\u01f5\u01ee\u01e9\u01e0\u01bc", "\u0764\u0759\u075c\u2706\u0734\u0736\u0720\u0744\u0762\u0769\u077e\u0769\u0727\u0764\u0769\u0766\u076f\u0727\u075b\u077c\u077a\u0761\u0766\u076f\u0733\u0721\u0744\u0762\u0769\u077e\u0769\u0727\u0764\u0769\u0766\u076f\u0727\u075b\u077c\u077a\u0761\u0766\u076f\u0733", "\u02fc\u02a3\u02ac\u02a9\u02ae\u02a9\u02b4\u02fe\u02fc\u02fe\u02e8\u02e9\u0296", "\u051a\u054f\u0548\u054f\u0552\u0518\u051a\u0518\u050e\u050f\u0570", "\u04be\u04bc\u04ad\u049a\u04b5\u04b8\u04aa\u04aa\u04e5\u04e7\u04f1\u04f0\u0495\u04b3\u04b8\u04af\u04b8\u04f6\u04b5\u04b8\u04b7\u04be\u04f6\u049a\u04b5\u04b8\u04aa\u04aa\u04e2", "\u03e1\u03e8\u03fa\u03e1\u03ca\u03e6\u03ed\u03ec\u03b5\u03b7\u03a1\u03a0\u03c0", "\u03d9\u03cd\u03c9\u03dd\u03d0\u03cf\u0380\u0382\u0394\u03f0\u03d6\u03dd\u03ca\u03dd\u0393\u03d0\u03dd\u03d2\u03db\u0393\u03f3\u03de\u03d6\u03d9\u03df\u03c8\u0387\u0395\u03e6", "\u0371\u037e\u037d\u037c\u0377\u032e\u032c\u033a\u033b\u035e\u0378\u0373\u0364\u0373\u033d\u037e\u0373\u037c\u0375\u033d\u035d\u0370\u0378\u0377\u0371\u0366\u0329", "\u00be\u00a5\u0099\u00be\u00b8\u00a3\u00a4\u00ad\u00f6\u00f4\u00e2\u00e3\u0086\u00a0\u00ab\u00bc\u00ab\u00e5\u00a6\u00ab\u00a4\u00ad\u00e5\u0099\u00be\u00b8\u00a3\u00a4\u00ad\u00f1", "\u04c6\u04c7\u04dc\u04c1\u04ce\u04d1\u0494\u0496\u0480\u0481\u04fe", "\u0738\u0739\u0722\u073f\u0730\u072f\u0717\u073a\u073a\u076a\u0768\u077e\u077f\u0700", "\u02f9\u02ef\u02e7\u02fa\u02b2\u02b0\u02a6\u02a7\u02d8", "\u00b7\u00a1\u00a9\u00b4\u00fc\u00fe\u00e8\u008a\u00e9\u0096", "\u0540\u0556\u055e\u0543\u0507\u050b\u0509\u051f\u057d\u051e\u0561", "\u07eb\u07fd\u07f5\u07e8\u07a0\u07a2\u07b4\u07d6\u07d5\u07b5\u07ca", "\u07af\u07a0\u07a7\u07a8\u07a5\u07a0\u07b3\u07ac\u07f5\u07f7\u07e1\u07e0\u079f"})
public final class Class1451 {
    public static double field5528;
    public static float field5529;
    public static double field5530;

    private static String C3QWb0Ixc5TxFaRO(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        a\u200e = "remove";
        w\u200e = "AntiAlias";
        field5530 = Double.longBitsToDouble(4603131574930419045L);
        field5529 = Float.intBitsToFloat(1064220330);
        field5528 = Double.longBitsToDouble(4603259871926006373L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite r5WsLyZ2I1GWPo(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1451.C3QWb0Ixc5TxFaRO(k2, 907495491));
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
                int a2 = Integer.parseInt(Class1451.C3QWb0Ixc5TxFaRO(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1451.C3QWb0Ixc5TxFaRO(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1451.C3QWb0Ixc5TxFaRO(k2, 907495491) + " " + l2 + " " + m2);
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

