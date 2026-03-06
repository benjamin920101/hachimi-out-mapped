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

@HACHIMI_CLIENT(mv=100, d1={"\u7d81\u7d85\u7d84\u7d82\u7d86\u7d80\u7d8c\u7d8c", "\u5d52\u5d57\u5d57\u5d5a\u5d55\u5d51\u5d56\u5d5b", "\u7c71\u7c73\u7c78\u7c74\u7c79\u7c70\u7c73\u7c72", "\ub38b\ub38c\ub38d\ub38d\ub38b\ub387\ub38b\ub38f", "\u8a88\u8a8b\u8a86\u8a88\u8a89\u8a86\u8a86", "\u7773\u7777\u7777\u7775\u777d\u7775\u7771\u7774", "\u6e80\u6e84\u6e8c\u6e8c\u6e80\u6e80\u6e80\u6e86", "\u897d\u8978\u8978\u897d\u8976\u897e\u897a\u8979", "\u1ade\u1adb\u1ad2\u1ad9\u1ad3\u1ada\u1ad9\u1add", "\u01e3\u01e1\u01e4\u01e4\u01e2\u01ef\u01e6\u01e0", "\u483c\u483e\u4837\u483d\u483e\u4837\u4837\u483a", "\u4638\u4638\u4638\u4633\u4638\u4638\u463e\u4632", "\u601f\u601e\u601e\u601c\u601c\u6019\u601d\u6015", "\u2dce\u2dcd\u2dc9\u2dc4\u2dcc\u2dc5\u2dcd", "\u7d6d\u7d6e\u7d60\u7d68\u7d6c\u7d60\u7d68\u7d6e", "\u63a9\u63ae\u63af\u63ab\u63ae\u63a5\u63a5\u63ae"}, d2={"\u00c1\u00ff\u00db\u20a4\u0096\u0094\u0082\u00e6\u00c0\u00cb\u00dc\u00cb\u0085\u00c6\u00cb\u00c4\u00cd\u0085\u00f9\u00de\u00d8\u00c3\u00c4\u00cd\u0091\u0083\u00e6\u00c0\u00cb\u00dc\u00cb\u0085\u00c6\u00cb\u00c4\u00cd\u0085\u00f9\u00de\u00d8\u00c3\u00c4\u00cd\u0091", "\u02a3\u029d\u02ba\u22c6\u02f4\u02f6\u02e0\u0284\u02a2\u02a9\u02be\u02a9\u02e7\u02a4\u02a9\u02a6\u02af\u02e7\u029b\u02bc\u02ba\u02a1\u02a6\u02af\u02f3\u02e1\u0284\u02a2\u02a9\u02be\u02a9\u02e7\u02a4\u02a9\u02a6\u02af\u02e7\u029b\u02bc\u02ba\u02a1\u02a6\u02af\u02f3", "\u05dd\u0582\u058d\u0588\u058f\u0588\u0595\u05df\u05dd\u05df\u05c9\u05c8\u05b7", "`525(b`btu\n", "\u04e8\u04ea\u04fb\u04cc\u04e3\u04ee\u04fc\u04fc\u04b3\u04b1\u04a7\u04a6\u04c3\u04e5\u04ee\u04f9\u04ee\u04a0\u04e3\u04ee\u04e1\u04e8\u04a0\u04cc\u04e3\u04ee\u04fc\u04fc\u04b4", "\u037b\u0372\u0360\u037b\u0350\u037c\u0377\u0376\u032f\u032d\u033b\u033a\u035a", "\u03c0\u03d4\u03d0\u03c4\u03c9\u03d6\u0399\u039b\u038d\u03e9\u03cf\u03c4\u03d3\u03c4\u038a\u03c9\u03c4\u03cb\u03c2\u038a\u03ea\u03c7\u03cf\u03c0\u03c6\u03d1\u039e\u038c\u03ff", "\u02f0\u02ff\u02fc\u02fd\u02f6\u02af\u02ad\u02bb\u02ba\u02df\u02f9\u02f2\u02e5\u02f2\u02bc\u02ff\u02f2\u02fd\u02f4\u02bc\u02dc\u02f1\u02f9\u02f6\u02f0\u02e7\u02a8", "\u033b\u0320\u031c\u033b\u033d\u0326\u0321\u0328\u0373\u0371\u0367\u0366\u0303\u0325\u032e\u0339\u032e\u0360\u0323\u032e\u0321\u0328\u0360\u031c\u033b\u033d\u0326\u0321\u0328\u0374", "\u04f1\u04f0\u04eb\u04f6\u04f9\u04e6\u04a3\u04a1\u04b7\u04b6\u04c9", "\u0587\u0586\u059d\u0580\u058f\u0590\u05a8\u0585\u0585\u05d5\u05d7\u05c1\u05c0\u05bf", "\u056d\u057b\u0573\u056e\u0526\u0524\u0532\u0533\u054c", "\u05bb\u05ad\u05a5\u05b8\u05f0\u05f2\u05e4\u0586\u05e5\u059a", "\u01e3\u01f5\u01fd\u01e0\u01a4\u01a8\u01aa\u01bc\u01de\u01bd\u01c2", "\u0403\u0415\u041d\u0400\u0448\u044a\u045c\u043e\u043d\u045d\u0422", "\u02fa\u02f5\u02f2\u02fd\u02f0\u02f5\u02e6\u02f9\u02a0\u02a2\u02b4\u02b5\u02ca"})
public final class Class1368 {
    public static float field5268;
    public static float field5269 = 0.7264591f;
    public static double field5270;
    public static double field5271;
    public static float field5272 = 0.5820296f;
    public static float field5273;
    public static int field5274 = 129090025;
    public static double field5275;
    public static double field5276;

    /*
     * WARNING - void declaration
     */
    private static CallSite M5Wu7PSTaD165j(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1368.ct9dNzWOgSp3AJNS(k2, -1616162175));
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
                int a2 = Integer.parseInt(Class1368.ct9dNzWOgSp3AJNS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1368.ct9dNzWOgSp3AJNS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1368.ct9dNzWOgSp3AJNS(k2, -1616162175) + " " + l2 + " " + m2);
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
        field5271 = Double.longBitsToDouble(0x4000000000000000L);
        field5275 = Double.longBitsToDouble(4607126029836152410L);
        n\u200e = "weakness";
        field5270 = Double.longBitsToDouble(4605568580441628954L);
        J\u200e = "Strict NCP bypass for air slowdowns";
        field5268 = Float.intBitsToFloat(1063321672);
        field5276 = Double.longBitsToDouble(4587584035919036640L);
        field5273 = Float.intBitsToFloat(1051531532);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ct9dNzWOgSp3AJNS(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 38887 : 38888;
            block5: while (true) {
                switch (n2) {
                    case 38888: {
                        n2 = 38886;
                        continue block5;
                    }
                    case 38887: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

