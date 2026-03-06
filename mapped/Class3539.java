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

@HACHIMI_CLIENT(mv=100, d1={"\u0118\u0118\u011f\u011d\u0114\u011b\u0119\u011d", "\ub5a9\ub5a9\ub5ac\ub5a8\ub5ac\ub5ac\ub5ab\ub5a3", "\u2315\u2313\u2314\u2319\u2311\u2311\u2317\u2318", "\u1c90\u1c94\u1c92\u1c9b\u1c91\u1c90\u1c9b\u1c94", "\ue3d4\ue3d5\ue3d7\ue3d6\ue3d3\ue3d0\ue3d1\ue3d7", "\u6e20\u6e24\u6e23\u6e20\u6e24\u6e23\u6e20\u6e23", "\u55c7\u55c7\u55ca\u55c0\u55c4\u55cb\u55c3\u55c3", "\u7c17\u7c14\u7c15\u7c16\u7c16\u7c13\u7c14\u7c12", "\ud76d\ud76c\ud76a\ud769\ud76a\ud76e\ud76b\ud764", "\u4c79\u4c7d\u4c7b\u4c7a\u4c7d\u4c7e\u4c7f\u4c7f", "\u29ed\u29ee\u29ef\u29ef\u29e5\u29ec\u29ed\u29e9", "\u9a2a\u9a29\u9a2e\u9a2b\u9a2d\u9a2e\u9a2b\u9a26", "\u0823\u082b\u0823\u0825\u082b\u0826\u0820\u0822", "\u5505\u5501\u5502\u5504\u5500\u5508\u5502\u5508", "\udaa7\udaa3\udaa1\udaa4\udaa5\udaa6\udaa8\udaa1", "\u8ad5\u8ad8\u8ad5\u8ad1\u8ad9\u8ad2\u8ad1\u8ad7", "\u6dea\u6de5\u6ded\u6deb\u6def\u6de4\u6dec\u6ded", "\u95a2\u95af\u95a0\u95a7\u95a6\u95ae\u95a3\u95a7"}, d2={"\u00e5\u00c7\u2099\u00ab\u00a9\u00bf\u00db\u00fd\u00f6\u00e1\u00f6\u00b8\u00fb\u00f6\u00f9\u00f0\u00b8\u00c4\u00e3\u00e5\u00fe\u00f9\u00f0\u00ac\u00be\u00db\u00fd\u00f6\u00e1\u00f6\u00b8\u00fb\u00f6\u00f9\u00f0\u00b8\u00c4\u00e3\u00e5\u00fe\u00f9\u00f0\u00ac", "\u04d3\u04f0\u24af\u049d\u049f\u0489\u04ed\u04cb\u04c0\u04d7\u04c0\u048e\u04cd\u04c0\u04cf\u04c6\u048e\u04f2\u04d5\u04d3\u04c8\u04cf\u04c6\u049a\u0488\u04ed\u04cb\u04c0\u04d7\u04c0\u048e\u04cd\u04c0\u04cf\u04c6\u048e\u04f2\u04d5\u04d3\u04c8\u04cf\u04c6\u049a", "\u0209\u0229\u2275\u0247\u0245\u0253\u0237\u0211\u021a\u020d\u021a\u0254\u0217\u021a\u0215\u021c\u0254\u0228\u020f\u0209\u0212\u0215\u021c\u0240\u0252\u0237\u0211\u021a\u020d\u021a\u0254\u0217\u021a\u0215\u021c\u0254\u0228\u020f\u0209\u0212\u0215\u021c\u0240", "Bc\u203e\f\u000e\u0018|ZQFQ\u001f\\Q^W\u001fcDBY^W\u000b\u0019|ZQFQ\u001f\\Q^W\u001fcDBY^W\u000b", "\u04b0\u04ef\u04e0\u04e5\u04e2\u04e5\u04f8\u04b2\u04b0\u04b2\u04a4\u04a5\u04da", "\u056e\u053b\u053c\u053b\u0526\u056c\u056e\u056c\u057a\u057b\u0504", "\u0593\u0591\u0580\u05b7\u0598\u0595\u0587\u0587\u05c8\u05ca\u05dc\u05dd\u05b8\u059e\u0595\u0582\u0595\u05db\u0598\u0595\u059a\u0593\u05db\u05b7\u0598\u0595\u0587\u0587\u05cf", "\u077e\u0777\u0765\u077e\u0755\u0779\u0772\u0773\u072a\u0728\u073e\u073f\u075f", "_KO[VI\u0006\u0004\u0012vP[L[\u0015V[T]\u0015uXP_YN\u0001\u0013`", "\u0556\u0559\u055a\u055b\u0550\u0509\u050b\u051d\u051c\u0579\u055f\u0554\u0543\u0554\u051a\u0559\u0554\u055b\u0552\u051a\u057a\u0557\u055f\u0550\u0556\u0541\u050e", "\u0441\u045a\u0466\u0441\u0447\u045c\u045b\u0452\u0409\u040b\u041d\u041c\u0479\u045f\u0454\u0443\u0454\u041a\u0459\u0454\u045b\u0452\u041a\u0466\u0441\u0447\u045c\u045b\u0452\u040e", "\u024e\u024f\u0254\u0249\u0246\u0259\u021c\u021e\u0208\u0209\u0276", "\u06f2\u06f3\u06e8\u06f5\u06fa\u06e5\u06dd\u06f0\u06f0\u06a0\u06a2\u06b4\u06b5\u06ca", "\u05c4\u05d2\u05da\u05c7\u058f\u058d\u059b\u059a\u05e5", "\u0655\u0643\u064b\u0656\u061e\u061c\u060a\u0668\u060b\u0674", "\u04dc\u04ca\u04c2\u04df\u049b\u0497\u0495\u0483\u04e1\u0482\u04fd", "\u02f9\u02ef\u02e7\u02fa\u02b2\u02b0\u02a6\u02c4\u02c7\u02a7\u02d8", "\u017a\u0175\u0172\u017d\u0170\u0175\u0166\u0179\u0120\u0122\u0134\u0135\u014a"})
public final class Class3539 {
    public static double field7833;
    public static float field7834;
    public static float field7835;

    private static String FVIFbGVneKia8nY7(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7834 = Float.intBitsToFloat(1062623237);
        field7833 = Double.longBitsToDouble(4603087110069229700L);
        L\u200e = "ArrowMove";
        field7835 = Float.intBitsToFloat(1062493514);
        aS\u200e = "Hachimi";
        bh\u200e = "Timer for the fade";
        bH\u200e = "Works only when you are phasing";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite NXKHjSTqj2hAZA(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3539.FVIFbGVneKia8nY7(k2, -509244784));
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
                int a2 = Integer.parseInt(Class3539.FVIFbGVneKia8nY7(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3539.FVIFbGVneKia8nY7(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3539.FVIFbGVneKia8nY7(k2, -509244784) + " " + l2 + " " + m2);
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

