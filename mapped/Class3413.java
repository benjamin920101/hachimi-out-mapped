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

@HACHIMI_CLIENT(mv=100, d1={"\u71b6\u71b0\u71b6\u71b4\u71b3\u71bb\u71b3\u71b1", "\u92dc\u92d9\u92d9\u92d9\u92da\u92de\u92d8\u92df", "\uc01d\uc01d\uc019\uc018\uc01f\uc01a\uc015\uc01b", "\u3f02\u3f01\u3f09\u3f01\u3f06\u3f00\u3f05\u3f07", "\u2930\u2933\u2937\u2931\u293c\u2937\u2935\u2931", "\ub681\ub684\ub682\ub68e\ub683\ub687\ub68e\ub683", "\udb5f\udb5c\udb56\udb58\udb5e\udb57\udb5c\udb57", "\u8a1a\u8a11\u8a1b\u8a11\u8a1e\u8a11\u8a1e\u8a11", "\u9a74\u9a74\u9a71\u9a74\u9a71\u9a7d\u9a7d\u9a75", "\udc7b\udc76\udc77\udc7b\udc76\udc7c\udc79\udc7f", "\u2a00\u2a00\u2a04\u2a05\u2a0e\u2a07\u2a0f\u2a06", "\u3b31\u3b34\u3b3f\u3b31\u3b37\u3b35\u3b36\u3b32", "\u18b1\u18b5\u18b1\u18b3\u18b3\u18b7\u18b5\u18b0", "\u88db\u88d9\u88dd\u88d8\u88d5\u88d5\u88df\u88d5", "\ue6bb\ue6b3\ue6ba\ue6bf\ue6b8\ue6b2\ue6bf", "\u7e0c\u7e06\u7e0a\u7e08\u7e07\u7e0e\u7e09\u7e08"}, d2={"\u047e\u0446\u0464\u241b\u0429\u042b\u043d\u0459\u047f\u0474\u0463\u0474\u043a\u0479\u0474\u047b\u0472\u043a\u0446\u0461\u0467\u047c\u047b\u0472\u042e\u043c\u0459\u047f\u0474\u0463\u0474\u043a\u0479\u0474\u047b\u0472\u043a\u0446\u0461\u0467\u047c\u047b\u0472\u042e", "\u05f8\u05c0\u05e1\u259d\u05af\u05ad\u05bb\u05df\u05f9\u05f2\u05e5\u05f2\u05bc\u05ff\u05f2\u05fd\u05f4\u05bc\u05c0\u05e7\u05e1\u05fa\u05fd\u05f4\u05a8\u05ba\u05df\u05f9\u05f2\u05e5\u05f2\u05bc\u05ff\u05f2\u05fd\u05f4\u05bc\u05c0\u05e7\u05e1\u05fa\u05fd\u05f4\u05a8", "\u036a\u0335\u033a\u033f\u0338\u033f\u0322\u0368\u036a\u0368\u037e\u037f\u0300", "\u07ef\u07ba\u07bd\u07ba\u07a7\u07ed\u07ef\u07ed\u07fb\u07fa\u0785", "\u065a\u0658\u0649\u067e\u0651\u065c\u064e\u064e\u0601\u0603\u0615\u0614\u0671\u0657\u065c\u064b\u065c\u0612\u0651\u065c\u0653\u065a\u0612\u067e\u0651\u065c\u064e\u064e\u0606", "\u0289\u0280\u0292\u0289\u02a2\u028e\u0285\u0284\u02dd\u02df\u02c9\u02c8\u02a8", "\u045f\u044b\u044f\u045b\u0456\u0449\u0406\u0404\u0412\u0476\u0450\u045b\u044c\u045b\u0415\u0456\u045b\u0454\u045d\u0415\u0475\u0458\u0450\u045f\u0459\u044e\u0401\u0413\u0460", "\u0723\u072c\u072f\u072e\u0725\u077c\u077e\u0768\u0769\u070c\u072a\u0721\u0736\u0721\u076f\u072c\u0721\u072e\u0727\u076f\u070f\u0722\u072a\u0725\u0723\u0734\u077b", "\u034e\u0355\u0369\u034e\u0348\u0353\u0354\u035d\u0306\u0304\u0312\u0313\u0376\u0350\u035b\u034c\u035b\u0315\u0356\u035b\u0354\u035d\u0315\u0369\u034e\u0348\u0353\u0354\u035d\u0301", "\u03df\u03de\u03c5\u03d8\u03d7\u03c8\u038d\u038f\u0399\u0398\u03e7", "\u0460\u0461\u047a\u0467\u0468\u0477\u044f\u0462\u0462\u0432\u0430\u0426\u0427\u0458", "\u0310\u0306\u030e\u0313\u035b\u0359\u034f\u034e\u0331", "\u06e6\u06f0\u06f8\u06e5\u06ad\u06af\u06b9\u06db\u06b8\u06c7", "\u0754\u0742\u074a\u0757\u0713\u071f\u071d\u070b\u0769\u070a\u0775", "\u0270\u0266\u026e\u0273\u023b\u0239\u022f\u024d\u024e\u022e\u0251", "\u0557\u0558\u055f\u0550\u055d\u0558\u054b\u0554\u050d\u050f\u0519\u0518\u0567"})
public final class Class3413 {
    static {
        O\u200e = "Using a piston to push the crystal to damage player";
        bh\u200e = "PlaceRange";
    }

    private static String r6AaPb5B52AE6UEV(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite RvgATQweqanjbg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3413.r6AaPb5B52AE6UEV(k2, -1143200097));
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
                int a2 = Integer.parseInt(Class3413.r6AaPb5B52AE6UEV(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3413.r6AaPb5B52AE6UEV(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3413.r6AaPb5B52AE6UEV(k2, -1143200097) + " " + l2 + " " + m2);
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

