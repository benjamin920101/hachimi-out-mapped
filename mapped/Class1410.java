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

@HACHIMI_CLIENT(mv=100, d1={"\u409c\u409c\u4098\u409e\u4099\u4093\u4099\u4092", "\ud034\ud033\ud036\ud037\ud034\ud037\ud033\ud035", "\ua1c1\ua1c4\ua1c0\ua1c6\ua1c2\ua1c2\ua1cc\ua1c6", "\u32d5\u32d6\u32d6\u32d1\u32d6\u32d4\u32d1\u32d4", "\uaa4c\uaa4b\uaa4e\uaa4e\uaa4c\uaa43\uaa4a\uaa43", "\u1dc8\u1dcb\u1dc8\u1dc9\u1dc9\u1dca\u1dc3\u1dc3", "\u82d3\u82d6\u82d2\u82d0\u82db\u82d6\u82d2\u82d3", "\ue82f\ue820\ue82e\ue829\ue82b\ue820\ue82b", "\uc4a9\uc4af\uc4ab\uc4ab\uc4ae\uc4ae\uc4ac\uc4ac", "\u0103\u0107\u0105\u010f\u010e\u0106\u0106\u0107", "\ucfea\ucfee\ucfef\ucfec\ucfeb\ucfef\ucfef\ucfe8", "\ud170\ud17c\ud17c\ud175\ud17d\ud176\ud170\ud17d", "\u931c\u9319\u931d\u9314\u931e\u931c\u931f\u9314", "\u202a\u202d\u2029\u202d\u202c\u2029\u2023\u202b", "\ub2be\ub2b5\ub2b8\ub2bc\ub2b4\ub2b8\ub2be\ub2bc"}, d2={"\u0323\u0335\u0328\u234c\u037e\u037c\u036a\u030e\u0328\u0323\u0334\u0323\u036d\u032e\u0323\u032c\u0325\u036d\u0311\u0336\u0330\u032b\u032c\u0325\u0379\u036b\u030e\u0328\u0323\u0334\u0323\u036d\u032e\u0323\u032c\u0325\u036d\u0311\u0336\u0330\u032b\u032c\u0325\u0379", "\u042a\u0475\u047a\u047f\u0478\u047f\u0462\u0428\u042a\u0428\u043e\u043f\u0440", "\u04e5\u04b0\u04b7\u04b0\u04ad\u04e7\u04e5\u04e7\u04f1\u04f0\u048f", "\u02d0\u02d2\u02c3\u02f4\u02db\u02d6\u02c4\u02c4\u028b\u0289\u029f\u029e\u02fb\u02dd\u02d6\u02c1\u02d6\u0298\u02db\u02d6\u02d9\u02d0\u0298\u02f4\u02db\u02d6\u02c4\u02c4\u028c", "\u01eb\u01e2\u01f0\u01eb\u01c0\u01ec\u01e7\u01e6\u01bf\u01bd\u01ab\u01aa\u01ca", "\u0701\u0715\u0711\u0705\u0708\u0717\u0758\u075a\u074c\u0728\u070e\u0705\u0712\u0705\u074b\u0708\u0705\u070a\u0703\u074b\u072b\u0706\u070e\u0701\u0707\u0710\u075f\u074d\u073e", "\u00ad\u00a2\u00a1\u00a0\u00ab\u00f2\u00f0\u00e6\u00e7\u0082\u00a4\u00af\u00b8\u00af\u00e1\u00a2\u00af\u00a0\u00a9\u00e1\u0081\u00ac\u00a4\u00ab\u00ad\u00ba\u00f5", "\u05e7\u05fc\u05c0\u05e7\u05e1\u05fa\u05fd\u05f4\u05af\u05ad\u05bb\u05ba\u05df\u05f9\u05f2\u05e5\u05f2\u05bc\u05ff\u05f2\u05fd\u05f4\u05bc\u05c0\u05e7\u05e1\u05fa\u05fd\u05f4\u05a8", "\u01ec\u01ed\u01f6\u01eb\u01e4\u01fb\u01be\u01bc\u01aa\u01ab\u01d4", "\u0303\u0302\u0319\u0304\u030b\u0314\u032c\u0301\u0301\u0351\u0353\u0345\u0344\u033b", "\u03ea\u03fc\u03f4\u03e9\u03a1\u03a3\u03b5\u03b4\u03cb", "\u0274\u0262\u026a\u0277\u023f\u023d\u022b\u0249\u022a\u0255", "\u04f8\u04ee\u04e6\u04fb\u04bf\u04b3\u04b1\u04a7\u04c5\u04a6\u04d9", "\u0349\u035f\u0357\u034a\u0302\u0300\u0316\u0374\u0377\u0317\u0368", "/ '(% 3,uwa`\u001f"})
public final class Class1410 {
    public static int field5423 = -1378471969;
    public static double field5424;
    public static int field5425 = -46273620;
    public static int field5426 = 1489719141;
    public static float field5427;
    public static float field5428;

    private static String rY8paZ6lSIFVbjmQ(String a2, int b2) {
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
    private static CallSite ulgHT6SfYA0uw2(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1410.rY8paZ6lSIFVbjmQ(k2, -1697372513));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1410.rY8paZ6lSIFVbjmQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 65085 : 65084;
            block7: while (true) {
                switch (n3) {
                    case 65085: {
                        n3 = 65083;
                        continue block7;
                    }
                    case 65084: {
                        String c2 = Class1410.rY8paZ6lSIFVbjmQ(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1410.rY8paZ6lSIFVbjmQ(k2, -1697372513) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        aJ\u200e = "The color for the world skybox";
        field5424 = Double.longBitsToDouble(4605681146742476954L);
        field5428 = Float.intBitsToFloat(1050413732);
        field5427 = Float.intBitsToFloat(1062250985);
    }
}

