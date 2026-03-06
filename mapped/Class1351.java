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

@HACHIMI_CLIENT(mv=100, d1={"\u9165\u916c\u9166\u9162\u9165\u9162\u9160\u9162", "\u3019\u301c\u3017\u301a\u3018\u301b\u301c\u3016", "\ucec4\uceca\ucec7\ucec6\ucec1\ucec7\ucec0\uceca", "\u2cd0\u2cd6\u2cd0\u2cd0\u2cd6\u2cd7\u2cd6\u2cd3", "\u1704\u1704\u1705\u1702\u170b\u1705\u1705\u170a", "\u7dcd\u7dca\u7dc7\u7dcd\u7dcc\u7dc8\u7dcb\u7dc8", "\u36bc\u36bd\u36b0\u36b9\u36bb\u36ba\u36b1\u36bb", "\u4cb8\u4cb0\u4cbc\u4cbc\u4cbd\u4cbb\u4cb1\u4cb0", "\u1912\u191b\u191b\u1911\u1915\u1917\u1917\u1914", "\u00c0\u00c5\u00c4\u00cd\u00c2\u00c3\u00c3", "\u3463\u346a\u3460\u3461\u3465\u346a\u3461\u3464", "\u3cc1\u3cc1\u3cc8\u3cca\u3cc8\u3ccf\u3cc8", "\ub840\ub846\ub845\ub848\ub846\ub845\ub840\ub849", "\u9131\u9135\u9132\u9130\u9136\u913e\u9130\u9130"}, d2={"\u01d5\u018a\u0185\u0180\u0187\u0180\u019d\u01d7\u01d5\u01d7\u01c1\u01c0\u01bf", "\u07a7\u07f2\u07f5\u07f2\u07ef\u07a5\u07a7\u07a5\u07b3\u07b2\u07cd", "\u04b4\u04b6\u04a7\u0490\u04bf\u04b2\u04a0\u04a0\u04ef\u04ed\u04fb\u04fa\u049f\u04b9\u04b2\u04a5\u04b2\u04fc\u04bf\u04b2\u04bd\u04b4\u04fc\u0490\u04bf\u04b2\u04a0\u04a0\u04e8", "\u0722\u072b\u0739\u0722\u0709\u0725\u072e\u072f\u0776\u0774\u0762\u0763\u0703", "\u027d\u0269\u026d\u0279\u0274\u026b\u0224\u0226\u0230\u0254\u0272\u0279\u026e\u0279\u0237\u0274\u0279\u0276\u027f\u0237\u0257\u027a\u0272\u027d\u027b\u026c\u0223\u0231\u0242", "\u0492\u049d\u049e\u049f\u0494\u04cd\u04cf\u04d9\u04d8\u04bd\u049b\u0490\u0487\u0490\u04de\u049d\u0490\u049f\u0496\u04de\u04be\u0493\u049b\u0494\u0492\u0485\u04ca", "\u0226\u023d\u0201\u0226\u0220\u023b\u023c\u0235\u026e\u026c\u027a\u027b\u021e\u0238\u0233\u0224\u0233\u027d\u023e\u0233\u023c\u0235\u027d\u0201\u0226\u0220\u023b\u023c\u0235\u0269", "\u008c\u008d\u0096\u008b\u0084\u009b\u00de\u00dc\u00ca\u00cb\u00b4", "\u053b\u053a\u0521\u053c\u0533\u052c\u0514\u0539\u0539\u0569\u056b\u057d\u057c\u0503", "\u05db\u05cd\u05c5\u05d8\u0590\u0592\u0584\u0585\u05fa", "\u02d9\u02cf\u02c7\u02da\u0292\u0290\u0286\u02e4\u0287\u02f8", "\u019a\u018c\u0184\u0199\u01dd\u01d1\u01d3\u01c5\u01a7\u01c4\u01bb", "\u0601\u0617\u061f\u0602\u064a\u0648\u065e\u063c\u063f\u065f\u0620", "\u03b1\u03be\u03b9\u03b6\u03bb\u03be\u03ad\u03b2\u03eb\u03e9\u03ff\u03fe\u0381"})
public final class Class1351 {
    public static double field5219 = Double.longBitsToDouble(4597930349445958088L);
    public static float field5220;
    public static float field5221;

    static {
        field5221 = Float.intBitsToFloat(1057146465);
        field5220 = Float.intBitsToFloat(1034652240);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite REuLYth11yQnHa(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1351.W72zsmBJyL9ap9yy(k2, -768323374));
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
                int a2 = Integer.parseInt(Class1351.W72zsmBJyL9ap9yy(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1351.W72zsmBJyL9ap9yy(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1351.W72zsmBJyL9ap9yy(k2, -768323374) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String W72zsmBJyL9ap9yy(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

