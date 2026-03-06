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
@HACHIMI_CLIENT(mv=100, d1={"\u4b7c\u4b73\u4b75\u4b72\u4b7c\u4b71\u4b73", "\u20ba\u20ba\u20b6\u20bc\u20bd\u20bc\u20ba\u20b7", "\u941c\u941e\u941c\u941f\u941d\u9418\u941d\u941f", "\u73e5\u73e3\u73e9\u73e4\u73e0\u73e0\u73e2\u73e3", "\u7930\u7932\u7933\u793d\u7937\u7934\u7930\u7932", "\ud337\ud33a\ud331\ud337\ud33b\ud332\ud333\ud332", "\u8a69\u8a64\u8a6a\u8a6f\u8a65\u8a69\u8a6c\u8a64", "\u4b87\u4b80\u4b82\u4b83\u4b81\u4b87\u4b87\u4b82", "\ucf42\ucf4e\ucf4e\ucf47\ucf40\ucf4f\ucf4e\ucf41", "\u83a7\u83a0\u83aa\u83a1\u83a4\u83a2\u83aa\u83a1", "\uc57e\uc579\uc57a\uc57a\uc57c\uc57c\uc57d\uc574", "\u6597\u6594\u6592\u6595\u6595\u6592\u6596", "\ubb6e\ubb64\ubb69\ubb6b\ubb69\ubb6b\ubb6a\ubb6b", "\ue756\ue75f\ue754\ue753\ue754\ue755\ue754\ue75f", "\u6d08\u6d0e\u6d08\u6d0a\u6d02\u6d0b\u6d0a\u6d0e", "\u2b83\u2b80\u2b82\u2b85\u2b87\u2b80\u2b83\u2b85"}, d2={"\u0280\u028a\u0291\u22fd\u02cf\u02cd\u02db\u02bf\u0299\u0292\u0285\u0292\u02dc\u029f\u0292\u029d\u0294\u02dc\u02a0\u0287\u0281\u029a\u029d\u0294\u02c8\u02da\u02bf\u0299\u0292\u0285\u0292\u02dc\u029f\u0292\u029d\u0294\u02dc\u02a0\u0287\u0281\u029a\u029d\u0294\u02c8", "\u0229\u0223\u0239\u2254\u0266\u0264\u0272\u0216\u0230\u023b\u022c\u023b\u0275\u0236\u023b\u0234\u023d\u0275\u0209\u022e\u0228\u0233\u0234\u023d\u0261\u0273\u0216\u0230\u023b\u022c\u023b\u0275\u0236\u023b\u0234\u023d\u0275\u0209\u022e\u0228\u0233\u0234\u023d\u0261", "\u0486\u04d9\u04d6\u04d3\u04d4\u04d3\u04ce\u0484\u0486\u0484\u0492\u0493\u04ec", "\u001eKLKV\u001c\u001e\u001c\n\u000bt", "\u06fa\u06f8\u06e9\u06de\u06f1\u06fc\u06ee\u06ee\u06a1\u06a3\u06b5\u06b4\u06d1\u06f7\u06fc\u06eb\u06fc\u06b2\u06f1\u06fc\u06f3\u06fa\u06b2\u06de\u06f1\u06fc\u06ee\u06ee\u06a6", "\u032a\u0323\u0331\u032a\u0301\u032d\u0326\u0327\u037e\u037c\u036a\u036b\u030b", "\u047d\u0469\u046d\u0479\u0474\u046b\u0424\u0426\u0430\u0454\u0472\u0479\u046e\u0479\u0437\u0474\u0479\u0476\u047f\u0437\u0457\u047a\u0472\u047d\u047b\u046c\u0423\u0431\u0442", "\u04af\u04a0\u04a3\u04a2\u04a9\u04f0\u04f2\u04e4\u04e5\u0480\u04a6\u04ad\u04ba\u04ad\u04e3\u04a0\u04ad\u04a2\u04ab\u04e3\u0483\u04ae\u04a6\u04a9\u04af\u04b8\u04f7", "\u01c7\u01dc\u01e0\u01c7\u01c1\u01da\u01dd\u01d4\u018f\u018d\u019b\u019a\u01ff\u01d9\u01d2\u01c5\u01d2\u019c\u01df\u01d2\u01dd\u01d4\u019c\u01e0\u01c7\u01c1\u01da\u01dd\u01d4\u0188", "\u07b2\u07b3\u07a8\u07b5\u07ba\u07a5\u07e0\u07e2\u07f4\u07f5\u078a", "\u0640\u0641\u065a\u0647\u0648\u0657\u066f\u0642\u0642\u0612\u0610\u0606\u0607\u0678", "\u04a5\u04b3\u04bb\u04a6\u04ee\u04ec\u04fa\u04fb\u0484", "\u0312\u0304\u030c\u0311\u0359\u035b\u034d\u032f\u034c\u0333", "\u0331\u0327\u032f\u0332\u0376\u037a\u0378\u036e\u030c\u036f\u0310", "\u01ff\u01e9\u01e1\u01fc\u01b4\u01b6\u01a0\u01c2\u01c1\u01a1\u01de", "\u0482\u048d\u048a\u0485\u0488\u048d\u049e\u0481\u04d8\u04da\u04cc\u04cd\u04b2"})
public final class Class3474 {
    public static float field7612 = Float.intBitsToFloat(1063449065);
    public static double field7613 = Double.longBitsToDouble(4604602818666106909L);

    private static String kvv3LnBbQe5LWfdg(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        ak\u200e = "OnlyPhased";
        bn\u200e = "sobel";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 2JsCnkL2M7yHVt(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3474.kvv3LnBbQe5LWfdg(k2, -721627822));
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
                int a2 = Integer.parseInt(Class3474.kvv3LnBbQe5LWfdg(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3474.kvv3LnBbQe5LWfdg(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3474.kvv3LnBbQe5LWfdg(k2, -721627822) + " " + l2 + " " + m2);
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

