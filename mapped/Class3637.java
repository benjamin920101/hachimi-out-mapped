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
@HACHIMI_CLIENT(mv=100, d1={"\ua972\ua973\ua979\ua978\ua975\ua972\ua974\ua972", "\uab58\uab5b\uab50\uab5f\uab5e\uab5e\uab5c\uab59", "\u7ac0\u7ac2\u7ac9\u7ac5\u7ac9\u7ac7\u7ac8\u7ac6", "\ub642\ub640\ub641\ub640\ub647\ub642\ub645\ub644", "\u2c81\u2c8c\u2c80\u2c89\u2c88\u2c89\u2c89", "\udf19\udf18\udf1d\udf1f\udf19\udf13\udf18\udf19", "\ua122\ua123\ua124\ua123\ua122\ua12a\ua120\ua12b", "\u07a2\u07a0\u07a4\u07a1\u07a1\u07a1\u07a5\u07a7", "\u1aa1\u1aa3\u1aa4\u1aa0\u1aa7\u1aa1\u1aa2\u1aa5", "\u73dc\u73df\u73d6\u73d6\u73d6\u73dc\u73de\u73d6", "\u44e5\u44ea\u44eb\u44e2\u44eb\u44e7\u44e1\u44e0", "\u2293\u2296\u2295\u2297\u2295\u2294\u2292\u2290", "\u2dbd\u2db9\u2db1\u2dbb\u2db9\u2db9\u2dbd", "\uac1b\uac1e\uac1b\uac1f\uac13\uac1a\uac12\uac19"}, d2={"\u0722\u077d\u0772\u0777\u0770\u0777\u076a\u0720\u0722\u0720\u0736\u0737\u0748", "\u0591\u05c4\u05c3\u05c4\u05d9\u0593\u0591\u0593\u0585\u0584\u05fb", "\u0699\u069b\u068a\u06bd\u0692\u069f\u068d\u068d\u06c2\u06c0\u06d6\u06d7\u06b2\u0694\u069f\u0688\u069f\u06d1\u0692\u069f\u0690\u0699\u06d1\u06bd\u0692\u069f\u068d\u068d\u06c5", "\u059e\u0597\u0585\u059e\u05b5\u0599\u0592\u0593\u05ca\u05c8\u05de\u05df\u05bf", "\u0701\u0715\u0711\u0705\u0708\u0717\u0758\u075a\u074c\u0728\u070e\u0705\u0712\u0705\u074b\u0708\u0705\u070a\u0703\u074b\u072b\u0706\u070e\u0701\u0707\u0710\u075f\u074d\u073e", "\u034b\u0344\u0347\u0346\u034d\u0314\u0316\u0300\u0301\u0364\u0342\u0349\u035e\u0349\u0307\u0344\u0349\u0346\u034f\u0307\u0367\u034a\u0342\u034d\u034b\u035c\u0313", "\u049a\u0481\u04bd\u049a\u049c\u0487\u0480\u0489\u04d2\u04d0\u04c6\u04c7\u04a2\u0484\u048f\u0498\u048f\u04c1\u0482\u048f\u0480\u0489\u04c1\u04bd\u049a\u049c\u0487\u0480\u0489\u04d5", "01*78'b`vw\b", "\u043f\u043e\u0425\u0438\u0437\u0428\u0410\u043d\u043d\u046d\u046f\u0479\u0478\u0407", "\u0754\u0742\u074a\u0757\u071f\u071d\u070b\u070a\u0775", "\u0696\u0680\u0688\u0695\u06dd\u06df\u06c9\u06ab\u06c8\u06b7", "\u0212\u0204\u020c\u0211\u0255\u0259\u025b\u024d\u022f\u024c\u0233", "\u0289\u029f\u0297\u028a\u02c2\u02c0\u02d6\u02b4\u02b7\u02d7\u02a8", "\u01dc\u01d3\u01d4\u01db\u01d6\u01d3\u01c0\u01df\u0186\u0184\u0192\u0193\u01ec"})
public final class Class3637 {
    public static float field8129 = Float.intBitsToFloat(1057751276);
    public static float field8130 = Float.intBitsToFloat(1056151236);

    private static String YukbOWJztIQV6Tpb(String a2, int b2) {
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
    private static CallSite 5vXUdtpDC99dkD(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3637.YukbOWJztIQV6Tpb(k2, 441209140));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 13837 : 13838;
        block6: while (true) {
            switch (n3) {
                case 13838: {
                    n3 = 13836;
                    continue block6;
                }
                case 13837: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3637.YukbOWJztIQV6Tpb(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3637.YukbOWJztIQV6Tpb(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3637.YukbOWJztIQV6Tpb(k2, 441209140) + " " + l2 + " " + m2);
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

