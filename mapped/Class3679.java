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
@HACHIMI_CLIENT(mv=100, d1={"\uca02\uca09\uca01\uca00\uca04\uca09\uca06", "\u069d\u0698\u069c\u0696\u0698\u0696\u069c\u069e", "\u261c\u261c\u261f\u2611\u261e\u261e\u261b\u261a", "\u4386\u4382\u4387\u4385\u4382\u4381\u438e\u438e", "\ucec0\ucec0\ucec0\ucec8\ucec1\ucec0\ucec2\ucec7", "\uc4e0\uc4e5\uc4e5\uc4e3\uc4ef\uc4e2\uc4ee\uc4e7", "\u2f02\u2f04\u2f03\u2f0f\u2f03\u2f05\u2f02\u2f07", "\u00ac\u00a0\u00a1\u00a3\u00a6\u00a0\u00a6", "\u9507\u9507\u9501\u950c\u9504\u9504\u950d\u9503", "\u56ef\u56ea\u56eb\u56e8\u56eb\u56eb\u56e5\u56e8", "\u9e55\u9e52\u9e55\u9e5e\u9e55\u9e50\u9e56\u9e5e", "\u3105\u3106\u3106\u3106\u3106\u3102\u3101\u3106", "\ue067\ue065\ue060\ue061\ue060\ue065\ue066\ue062", "\ucb0b\ucb0e\ucb05\ucb04\ucb0a\ucb0c\ucb0e\ucb0e", "\u87f8\u87fb\u87f4\u87f9\u87f5\u87fc\u87ff\u87f9"}, d2={"\u07c7\u07ec\u279a\u07a8\u07aa\u07bc\u07d8\u07fe\u07f5\u07e2\u07f5\u07bb\u07f8\u07f5\u07fa\u07f3\u07bb\u07c7\u07e0\u07e6\u07fd\u07fa\u07f3\u07af\u07bd\u07d8\u07fe\u07f5\u07e2\u07f5\u07bb\u07f8\u07f5\u07fa\u07f3\u07bb\u07c7\u07e0\u07e6\u07fd\u07fa\u07f3\u07af", "\u019f\u01c0\u01cf\u01ca\u01cd\u01ca\u01d7\u019d\u019f\u019d\u018b\u018a\u01f5", "\u071e\u074b\u074c\u074b\u0756\u071c\u071e\u071c\u070a\u070b\u0774", "\u02e6\u02e4\u02f5\u02c2\u02ed\u02e0\u02f2\u02f2\u02bd\u02bf\u02a9\u02a8\u02cd\u02eb\u02e0\u02f7\u02e0\u02ae\u02ed\u02e0\u02ef\u02e6\u02ae\u02c2\u02ed\u02e0\u02f2\u02f2\u02ba", "\u0747\u074e\u075c\u0747\u076c\u0740\u074b\u074a\u0713\u0711\u0707\u0706\u0766", "\u0542\u0556\u0552\u0546\u054b\u0554\u051b\u0519\u050f\u056b\u054d\u0546\u0551\u0546\u0508\u054b\u0546\u0549\u0540\u0508\u0568\u0545\u054d\u0542\u0544\u0553\u051c\u050e\u057d", "\u00b7\u00b8\u00bb\u00ba\u00b1\u00e8\u00ea\u00fc\u00fd\u0098\u00be\u00b5\u00a2\u00b5\u00fb\u00b8\u00b5\u00ba\u00b3\u00fb\u009b\u00b6\u00be\u00b1\u00b7\u00a0\u00ef", "\u06b2\u06a9\u0695\u06b2\u06b4\u06af\u06a8\u06a1\u06fa\u06f8\u06ee\u06ef\u068a\u06ac\u06a7\u06b0\u06a7\u06e9\u06aa\u06a7\u06a8\u06a1\u06e9\u0695\u06b2\u06b4\u06af\u06a8\u06a1\u06fd", "\u0014\u0015\u000e\u0013\u001c\u0003FDRS,", "\u03f8\u03f9\u03e2\u03ff\u03f0\u03ef\u03d7\u03fa\u03fa\u03aa\u03a8\u03be\u03bf\u03c0", "\u0396\u0380\u0388\u0395\u03dd\u03df\u03c9\u03c8\u03b7", "\u0509\u051f\u0517\u050a\u0542\u0540\u0556\u0534\u0557\u0528", "\u023f\u0229\u0221\u023c\u0278\u0274\u0276\u0260\u0202\u0261\u021e", "\u021f\u0209\u0201\u021c\u0254\u0256\u0240\u0222\u0221\u0241\u023e", "\u039f\u0390\u0397\u0398\u0395\u0390\u0383\u039c\u03c5\u03c7\u03d1\u03d0\u03af"})
public final class Class3679 {
    public static float field8246;
    public static float field8247;
    public static double field8248;
    public static float field8249;

    /*
     * WARNING - void declaration
     */
    private static CallSite cJnh2PIKHU0OSA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3679.4C8TvbnMgGVyBVJ7(k2, -1791096100));
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
                int a2 = Integer.parseInt(Class3679.4C8TvbnMgGVyBVJ7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3679.4C8TvbnMgGVyBVJ7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3679.4C8TvbnMgGVyBVJ7(k2, -1791096100) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 4C8TvbnMgGVyBVJ7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8249 = Float.intBitsToFloat(1063728466);
        field8248 = Double.longBitsToDouble(4597516884114321172L);
        ao\u200e = "reloadsound";
        field8246 = Float.intBitsToFloat(1065145504);
        field8247 = Float.intBitsToFloat(1050535670);
    }
}

