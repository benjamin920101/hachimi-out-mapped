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

@HACHIMI_CLIENT(mv=100, d1={"\u7e26\u7e21\u7e26\u7e25\u7e22\u7e26\u7e27\u7e2a", "\u7594\u7597\u7596\u7590\u759d\u7591\u7594\u7593", "\ue792\ue793\ue793\ue793\ue791\ue792\ue794\ue79d", "\u704e\u7049\u7043\u704e\u704e\u7043\u704e\u704f", "\u0859\u085d\u085d\u085a\u085d\u085a\u085d\u0855", "\u90b4\u90b6\u90b7\u90b0\u90b1\u90b4\u90b0\u90b2", "\u7a96\u7a90\u7a96\u7a95\u7a93\u7a95\u7a92\u7a9f", "\u2775\u2773\u2771\u2779\u2774\u2774\u2774\u2779", "\uc268\uc265\uc26f\uc26c\uc26f\uc26f\uc265\uc269", "\ue59a\ue599\ue59d\ue599\ue598\ue599\ue595\ue59b", "\u6bef\u6bed\u6bee\u6bef\u6bef\u6bee\u6bea\u6bee", "\ub871\ub87b\ub87a\ub87b\ub872\ub87a\ub872\ub871", "\u0f29\u0f28\u0f2f\u0f29\u0f2a\u0f2f\u0f2a\u0f2c", "\u79fc\u79f2\u79f2\u79fb\u79f3\u79ff\u79fb\u79f9"}, d2={"\u0700\u075f\u0750\u0755\u0752\u0755\u0748\u0702\u0700\u0702\u0714\u0715\u076a", "\u0331\u0364\u0363\u0364\u0379\u0333\u0331\u0333\u0325\u0324\u035b", "\u050b\u0509\u0518\u052f\u0500\u050d\u051f\u051f\u0550\u0552\u0544\u0545\u0520\u0506\u050d\u051a\u050d\u0543\u0500\u050d\u0502\u050b\u0543\u052f\u0500\u050d\u051f\u051f\u0557", "\u0671\u0678\u066a\u0671\u065a\u0676\u067d\u067c\u0625\u0627\u0631\u0630\u0650", "\u00c7\u00d3\u00d7\u00c3\u00ce\u00d1\u009e\u009c\u008a\u00ee\u00c8\u00c3\u00d4\u00c3\u008d\u00ce\u00c3\u00cc\u00c5\u008d\u00ed\u00c0\u00c8\u00c7\u00c1\u00d6\u0099\u008b\u00f8", "\u0663\u066c\u066f\u066e\u0665\u063c\u063e\u0628\u0629\u064c\u066a\u0661\u0676\u0661\u062f\u066c\u0661\u066e\u0667\u062f\u064f\u0662\u066a\u0665\u0663\u0674\u063b", "\u07f7\u07ec\u07d0\u07f7\u07f1\u07ea\u07ed\u07e4\u07bf\u07bd\u07ab\u07aa\u07cf\u07e9\u07e2\u07f5\u07e2\u07ac\u07ef\u07e2\u07ed\u07e4\u07ac\u07d0\u07f7\u07f1\u07ea\u07ed\u07e4\u07b8", "\u05fe\u05ff\u05e4\u05f9\u05f6\u05e9\u05ac\u05ae\u05b8\u05b9\u05c6", "\u057b\u057a\u0561\u057c\u0573\u056c\u0554\u0579\u0579\u0529\u052b\u053d\u053c\u0543", "\u00d6\u00c0\u00c8\u00d5\u009d\u009f\u0089\u0088\u00f7", "\n\u001c\u0014\tACU7T+", "\u0526\u0530\u0538\u0525\u0561\u056d\u056f\u0579\u051b\u0578\u0507", "\u04f3\u04e5\u04ed\u04f0\u04b8\u04ba\u04ac\u04ce\u04cd\u04ad\u04d2", "\u060a\u0605\u0602\u060d\u0600\u0605\u0616\u0609\u0650\u0652\u0644\u0645\u063a"})
public final class Class1646 {
    public static double field6118 = 0.32213988868722987;
    public static float field6119 = Float.intBitsToFloat(1050911664);
    public static int field6120 = 1009958973;
    public static int field6121 = 5;
    public static double field6122 = Double.longBitsToDouble(4582837460507465568L);

    private static String aOFhJWqPFA1uMwOz(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite qZgpZEE2AZrOtN(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1646.aOFhJWqPFA1uMwOz(k2, -1272696245));
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
                int a2 = Integer.parseInt(Class1646.aOFhJWqPFA1uMwOz(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1646.aOFhJWqPFA1uMwOz(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1646.aOFhJWqPFA1uMwOz(k2, -1272696245) + " " + l2 + " " + m2);
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

