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

@HACHIMI_CLIENT(mv=100, d1={"\u1238\u1238\u123b\u123e\u1233\u123c\u123e\u123f", "\ub2dc\ub2d3\ub2db\ub2d3\ub2db\ub2de\ub2dd\ub2d3", "\u6bb7\u6bb0\u6bb6\u6bb3\u6bb6\u6bb3\u6bbd\u6bbd", "\u91d5\u91d7\u91d7\u91d5\u91d0\u91d4\u91d5", "\u0423\u0420\u0420\u0424\u042b\u0425\u042a\u0426", "\u64ce\u64cb\u64c9\u64c3\u64cd\u64c8\u64c2", "\ua9bf\ua9bf\ua9b2\ua9b0\ua9bf\ua9b4\ua9b2", "\ucf0f\ucf0f\ucf0e\ucf0f\ucf0f\ucf0b\ucf0a\ucf0c", "\u9830\u9831\u9837\u9834\u9831\u983b\u9830\u983b", "\u15ad\u15a8\u15ac\u15aa\u15ac\u15a5\u15a4\u15a8", "\udde2\udde9\udde7\udde5\udde8\udde6\udde3\udde0", "\u3966\u3960\u3963\u3964\u3965\u3969\u3961\u3963", "\u36c1\u36cc\u36c0\u36c9\u36cb\u36c1\u36c8", "\u211d\u211b\u2119\u2119\u211a\u211f\u2116\u211c", "\u417b\u417b\u4174\u4178\u4175\u417a\u4175\u4178", "\u9489\u9489\u948b\u948a\u948f\u948d\u948b\u9483", "\u93d3\u93d5\u93d3\u93d6\u93d6\u93d4\u93d4\u93d7", "\u1440\u1444\u1444\u1445\u1448\u1447\u1440\u1441"}, d2={"\u02a2\u028c\u02bf\u22c1\u02f3\u02f1\u02e7\u0283\u02a5\u02ae\u02b9\u02ae\u02e0\u02a3\u02ae\u02a1\u02a8\u02e0\u029c\u02bb\u02bd\u02a6\u02a1\u02a8\u02f4\u02e6\u0283\u02a5\u02ae\u02b9\u02ae\u02e0\u02a3\u02ae\u02a1\u02a8\u02e0\u029c\u02bb\u02bd\u02a6\u02a1\u02a8\u02f4", "\u0557\u0579\u054b\u2534\u0506\u0504\u0512\u0576\u0550\u055b\u054c\u055b\u0515\u0556\u055b\u0554\u055d\u0515\u0569\u054e\u0548\u0553\u0554\u055d\u0501\u0513\u0576\u0550\u055b\u054c\u055b\u0515\u0556\u055b\u0554\u055d\u0515\u0569\u054e\u0548\u0553\u0554\u055d\u0501", "FhY\u2025\u0017\u0015\u0003gAJ]J\u0004GJEL\u0004x_YBEL\u0010\u0002gAJ]J\u0004GJEL\u0004x_YBEL\u0010", "\u0530\u051e\u052e\u2553\u0561\u0563\u0575\u0511\u0537\u053c\u052b\u053c\u0572\u0531\u053c\u0533\u053a\u0572\u050e\u0529\u052f\u0534\u0533\u053a\u0566\u0574\u0511\u0537\u053c\u052b\u053c\u0572\u0531\u053c\u0533\u053a\u0572\u050e\u0529\u052f\u0534\u0533\u053a\u0566", "\"}rwpwj \" 67H", "\u05b7\u05e2\u05e5\u05e2\u05ff\u05b5\u05b7\u05b5\u05a3\u05a2\u05dd", "\u012e\u012c\u013d\u010a\u0125\u0128\u013a\u013a\u0175\u0177\u0161\u0160\u0105\u0123\u0128\u013f\u0128\u0166\u0125\u0128\u0127\u012e\u0166\u010a\u0125\u0128\u013a\u013a\u0172", "\u01a5\u01ac\u01be\u01a5\u018e\u01a2\u01a9\u01a8\u01f1\u01f3\u01e5\u01e4\u0184", "\u039e\u038a\u038e\u039a\u0397\u0388\u03c7\u03c5\u03d3\u03b7\u0391\u039a\u038d\u039a\u03d4\u0397\u039a\u0395\u039c\u03d4\u03b4\u0399\u0391\u039e\u0398\u038f\u03c0\u03d2\u03a1", "\u0733\u073c\u073f\u073e\u0735\u076c\u076e\u0778\u0779\u071c\u073a\u0731\u0726\u0731\u077f\u073c\u0731\u073e\u0737\u077f\u071f\u0732\u073a\u0735\u0733\u0724\u076b", "\u07ab\u07b0\u078c\u07ab\u07ad\u07b6\u07b1\u07b8\u07e3\u07e1\u07f7\u07f6\u0793\u07b5\u07be\u07a9\u07be\u07f0\u07b3\u07be\u07b1\u07b8\u07f0\u078c\u07ab\u07ad\u07b6\u07b1\u07b8\u07e4", "\u04cf\u04ce\u04d5\u04c8\u04c7\u04d8\u049d\u049f\u0489\u0488\u04f7", "\u0618\u0619\u0602\u061f\u0610\u060f\u0637\u061a\u061a\u064a\u0648\u065e\u065f\u0620", "\u0172\u0164\u016c\u0171\u0139\u013b\u012d\u012c\u0153", "\u036e\u0378\u0370\u036d\u0325\u0327\u0331\u0353\u0330\u034f", "\u0625\u0633\u063b\u0626\u0662\u066e\u066c\u067a\u0618\u067b\u0604", "\u0370\u0366\u036e\u0373\u033b\u0339\u032f\u034d\u034e\u032e\u0351", "\u010e\u0101\u0106\u0109\u0104\u0101\u0112\u010d\u0154\u0156\u0140\u0141\u013e"})
public final class Class1389 {
    public static float field5354;
    public static long field5355 = 2827797887959144453L;
    public static int field5356 = 188161312;
    public static float field5357;
    public static float field5358;

    private static String dtryLWt5X5bIiYS7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Q6jjrjDZ98BOaG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1389.dtryLWt5X5bIiYS7(k2, -2120524723));
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
                int a2 = Integer.parseInt(Class1389.dtryLWt5X5bIiYS7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1389.dtryLWt5X5bIiYS7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1389.dtryLWt5X5bIiYS7(k2, -2120524723) + " " + l2 + " " + m2);
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
        a\u200e = "Disable";
        i\u200e = "wither";
        field5357 = Float.intBitsToFloat(1023275958);
        K\u200e = "PacketLogger";
        field5358 = Float.intBitsToFloat(1038727376);
        bn\u200e = "Lv.";
        field5354 = Float.intBitsToFloat(1050760878);
    }
}

