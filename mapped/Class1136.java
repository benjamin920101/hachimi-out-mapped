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

@HACHIMI_CLIENT(mv=100, d1={"\ua8d4\ua8d8\ua8d8\ua8d2\ua8d0\ua8d4\ua8d1\ua8d5", "\u56bb\u56bd\u56ba\u56ba\u56b8\u56bb\u56bb\u56b1", "\u240b\u2409\u2407\u2407\u240f\u2409\u240c\u2407", "\ucf65\ucf61\ucf61\ucf66\ucf64\ucf62\ucf66\ucf66", "\ue102\ue107\ue101\ue105\ue106\ue100\ue108\ue103", "\u48b7\u48bd\u48b6\u48b9\u48b6\u48b6\u48b7", "\u970b\u970f\u9700\u970d\u970f\u970c\u9708\u970f", "\u4241\u424b\u4243\u4245\u424b\u4240\u4246\u424b", "\ubf57\ubf50\ubf57\ubf52\ubf51\ubf58\ubf52\ubf50", "\u497e\u4978\u497c\u497d\u497c\u4978\u4978", "\u4b9e\u4b9d\u4b9c\u4b99\u4b9a\u4b91\u4b9d\u4b9c", "\u4653\u4650\u4654\u4654\u4656\u465d\u4657\u4657", "\u301c\u301b\u301f\u301e\u3016\u301c\u3017\u301d", "\u3ae6\u3ae1\u3ae7\u3aeb\u3ae7\u3ae4\u3ae4\u3ae5", "\u5ae0\u5aef\u5ae9\u5ae0\u5aed\u5aef\u5ae0", "\u07c3\u07ca\u07ca\u07ca\u07c3\u07c4\u07c2\u07c1"}, d2={"\u0499\u0485\u0498\u24e7\u04d5\u04d7\u04c1\u04a5\u0483\u0488\u049f\u0488\u04c6\u0485\u0488\u0487\u048e\u04c6\u04ba\u049d\u049b\u0480\u0487\u048e\u04d2\u04c0\u04a5\u0483\u0488\u049f\u0488\u04c6\u0485\u0488\u0487\u048e\u04c6\u04ba\u049d\u049b\u0480\u0487\u048e\u04d2", "\u05de\u05c2\u05dc\u25a0\u0592\u0590\u0586\u05e2\u05c4\u05cf\u05d8\u05cf\u0581\u05c2\u05cf\u05c0\u05c9\u0581\u05fd\u05da\u05dc\u05c7\u05c0\u05c9\u0595\u0587\u05e2\u05c4\u05cf\u05d8\u05cf\u0581\u05c2\u05cf\u05c0\u05c9\u0581\u05fd\u05da\u05dc\u05c7\u05c0\u05c9\u0595", "\u07dd\u0782\u078d\u0788\u078f\u0788\u0795\u07df\u07dd\u07df\u07c9\u07c8\u07b7", "\u0728\u077d\u077a\u077d\u0760\u072a\u0728\u072a\u073c\u073d\u0742", "\u0745\u0747\u0756\u0761\u074e\u0743\u0751\u0751\u071e\u071c\u070a\u070b\u076e\u0748\u0743\u0754\u0743\u070d\u074e\u0743\u074c\u0745\u070d\u0761\u074e\u0743\u0751\u0751\u0719", "\u060f\u0606\u0614\u060f\u0624\u0608\u0603\u0602\u065b\u0659\u064f\u064e\u062e", "\u0478\u046c\u0468\u047c\u0471\u046e\u0421\u0423\u0435\u0451\u0477\u047c\u046b\u047c\u0432\u0471\u047c\u0473\u047a\u0432\u0452\u047f\u0477\u0478\u047e\u0469\u0426\u0434\u0447", "\u069c\u0693\u0690\u0691\u069a\u06c3\u06c1\u06d7\u06d6\u06b3\u0695\u069e\u0689\u069e\u06d0\u0693\u069e\u0691\u0698\u06d0\u06b0\u069d\u0695\u069a\u069c\u068b\u06c4", "\u0629\u0632\u060e\u0629\u062f\u0634\u0633\u063a\u0661\u0663\u0675\u0674\u0611\u0637\u063c\u062b\u063c\u0672\u0631\u063c\u0633\u063a\u0672\u060e\u0629\u062f\u0634\u0633\u063a\u0666", "\u05d6\u05d7\u05cc\u05d1\u05de\u05c1\u0584\u0586\u0590\u0591\u05ee", "\u02e5\u02e4\u02ff\u02e2\u02ed\u02f2\u02ca\u02e7\u02e7\u02b7\u02b5\u02a3\u02a2\u02dd", "\u059d\u058b\u0583\u059e\u05d6\u05d4\u05c2\u05c3\u05bc", "\u00da\u00cc\u00c4\u00d9\u0091\u0093\u0085\u00e7\u0084\u00fb", "\u04ff\u04e9\u04e1\u04fc\u04b8\u04b4\u04b6\u04a0\u04c2\u04a1\u04de", "\u05f2\u05e4\u05ec\u05f1\u05b9\u05bb\u05ad\u05cf\u05cc\u05ac\u05d3", "\u02d9\u02d6\u02d1\u02de\u02d3\u02d6\u02c5\u02da\u0283\u0281\u0297\u0296\u02e9"})
public final class Class1136 {
    public static float field4555 = 0.070730984f;
    public static float field4556;
    public static float field4557;
    public static float field4558;

    static {
        field4557 = Float.intBitsToFloat(969705472);
        J\u200e = "add";
        field4556 = Float.intBitsToFloat(1062272567);
        field4558 = Float.intBitsToFloat(1061997642);
        bB\u200e = "ru.vidtu.ias.screen.AccountScreen";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite qFjabD6GRw8gql(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1136.rNeoUBjElxnAOXe7(k2, 743782013));
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
                int a2 = Integer.parseInt(Class1136.rNeoUBjElxnAOXe7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 38090 : 38089;
            block7: while (true) {
                switch (n3) {
                    case 38090: {
                        n3 = 38088;
                        continue block7;
                    }
                    case 38089: {
                        String c2 = Class1136.rNeoUBjElxnAOXe7(r2[f2], l2);
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
            throw new Exception("Can't find method in " + Class1136.rNeoUBjElxnAOXe7(k2, 743782013) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String rNeoUBjElxnAOXe7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

