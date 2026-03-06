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

@HACHIMI_CLIENT(mv=100, d1={"\ua27e\ua27a\ua27f\ua27b\ua279\ua27b\ua27a\ua279", "\u432b\u432c\u4329\u4329\u432f\u432d\u4323\u432c", "\u4e2b\u4e27\u4e2b\u4e2b\u4e2e\u4e2e\u4e29", "\ua71f\ua71f\ua714\ua71f\ua714\ua713\ua714", "\u0dcf\u0dcb\u0dca\u0dc9\u0dc9\u0dcb\u0dca\u0dc9", "\u2830\u2835\u283b\u2834\u2835\u2833\u2831\u2835", "\u500b\u5009\u500d\u500d\u5002\u5008\u500a\u500f", "\ud13d\ud133\ud13d\ud13e\ud13f\ud133\ud13f", "\u432e\u4320\u432c\u432c\u4320\u4329\u432e\u4321", "\uc211\uc213\uc215\uc211\uc216\uc212\uc210\uc210", "\u9a90\u9a91\u9a92\u9a90\u9a9a\u9a97\u9a9a\u9a9a", "\u5b71\u5b7a\u5b7a\u5b71\u5b73\u5b7a\u5b74\u5b74", "\u9e83\u9e84\u9e82\u9e88\u9e85\u9e88\u9e89\u9e89", "\u9c16\u9c1e\u9c11\u9c1e\u9c14\u9c10\u9c1f\u9c12"}, d2={"\u0685\u06da\u06d5\u06d0\u06d7\u06d0\u06cd\u0687\u0685\u0687\u0691\u0690\u06ef", "\u0711\u0744\u0743\u0744\u0759\u0713\u0711\u0713\u0705\u0704\u077b", "\u00bd\u00bf\u00ae\u0099\u00b6\u00bb\u00a9\u00a9\u00e6\u00e4\u00f2\u00f3\u0096\u00b0\u00bb\u00ac\u00bb\u00f5\u00b6\u00bb\u00b4\u00bd\u00f5\u0099\u00b6\u00bb\u00a9\u00a9\u00e1", "\u00ee\u00e7\u00f5\u00ee\u00c5\u00e9\u00e2\u00e3\u00ba\u00b8\u00ae\u00af\u00cf", "\u04d1\u04c5\u04c1\u04d5\u04d8\u04c7\u0488\u048a\u049c\u04f8\u04de\u04d5\u04c2\u04d5\u049b\u04d8\u04d5\u04da\u04d3\u049b\u04fb\u04d6\u04de\u04d1\u04d7\u04c0\u048f\u049d\u04ee", "\u030f\u0300\u0303\u0302\u0309\u0350\u0352\u0344\u0345\u0320\u0306\u030d\u031a\u030d\u0343\u0300\u030d\u0302\u030b\u0343\u0323\u030e\u0306\u0309\u030f\u0318\u0357", "\u00cf\u00d4\u00e8\u00cf\u00c9\u00d2\u00d5\u00dc\u0087\u0085\u0093\u0092\u00f7\u00d1\u00da\u00cd\u00da\u0094\u00d7\u00da\u00d5\u00dc\u0094\u00e8\u00cf\u00c9\u00d2\u00d5\u00dc\u0080", "\u03df\u03de\u03c5\u03d8\u03d7\u03c8\u038d\u038f\u0399\u0398\u03e7", "\u00ac\u00ad\u00b6\u00ab\u00a4\u00bb\u0083\u00ae\u00ae\u00fe\u00fc\u00ea\u00eb\u0094", "\u0381\u0397\u039f\u0382\u03ca\u03c8\u03de\u03df\u03a0", "\u0537\u0521\u0529\u0534\u057c\u057e\u0568\u050a\u0569\u0516", "\u0741\u0757\u075f\u0742\u0706\u070a\u0708\u071e\u077c\u071f\u0760", "\u0530\u0526\u052e\u0533\u057b\u0579\u056f\u050d\u050e\u056e\u0511", "\u049a\u0495\u0492\u049d\u0490\u0495\u0486\u0499\u04c0\u04c2\u04d4\u04d5\u04aa"})
public final class Class1274 {
    public static int field4973 = 0;
    public static float field4974;
    public static float field4975;

    static {
        field4975 = Float.intBitsToFloat(1065251325);
        field4974 = Float.intBitsToFloat(1062817073);
    }

    private static String i8NCohBHapAiqg1f(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Dvbm1n9g0yvJy4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1274.i8NCohBHapAiqg1f(k2, 2011143327));
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
                int a2 = Integer.parseInt(Class1274.i8NCohBHapAiqg1f(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1274.i8NCohBHapAiqg1f(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1274.i8NCohBHapAiqg1f(k2, 2011143327) + " " + l2 + " " + m2);
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

