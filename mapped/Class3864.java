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
@HACHIMI_CLIENT(mv=100, d1={"\uceba\uceb7\ucebc\uceba\uceb6\ucebe\uceb7\ucebd", "\u7083\u7084\u7082\u7081\u7083\u7085\u7082", "\ue5f5\ue5f2\ue5f2\ue5f4\ue5f7\ue5f6\ue5f4\ue5f7", "\ubb08\ubb0b\ubb07\ubb0f\ubb09\ubb07\ubb09\ubb08", "\u7c16\u7c13\u7c11\u7c17\u7c14\u7c14\u7c15\u7c1d", "\u14f0\u14f6\u14f1\u14f2\u14f6\u14f7\u14f5\u14f2", "\u5ee3\u5eea\u5ee2\u5ee5\u5ee2\u5ee2\u5ee6\u5ee7", "\u8116\u811b\u8117\u8116\u811b\u8117\u8114\u8115", "\ucfaf\ucfa8\ucfa9\ucfae\ucfae\ucfab\ucfa3\ucfa8", "\ucf5e\ucf55\ucf59\ucf5f\ucf5f\ucf54\ucf5d\ucf59", "\u6d8d\u6d80\u6d88\u6d88\u6d8e\u6d8f\u6d8a", "\u481e\u4819\u4818\u4818\u4815\u481f\u481d\u4819", "\uc08b\uc085\uc089\uc085\uc08d\uc08e\uc08e\uc089", "\u365b\u3651\u365a\u365e\u3659\u3651\u3651\u3659", "\ucce2\ucce4\ucce3\ucce0\ucce5\ucce4\ucce5\ucced", "\u91c2\u91c7\u91c3\u91c4\u91c2\u91c4\u91c7", "\u18aa\u18a9\u18af\u18a8\u18a1\u18ac\u18a0\u18ac"}, d2={"\u02ab\u028f\u0297\u22d4\u02e6\u02e4\u02f2\u0296\u02b0\u02bb\u02ac\u02bb\u02f5\u02b6\u02bb\u02b4\u02bd\u02f5\u0289\u02ae\u02a8\u02b3\u02b4\u02bd\u02e1\u02f3\u0296\u02b0\u02bb\u02ac\u02bb\u02f5\u02b6\u02bb\u02b4\u02bd\u02f5\u0289\u02ae\u02a8\u02b3\u02b4\u02bd\u02e1", "\u02d9\u02fd\u02e6\u22a6\u0294\u0296\u0280\u02e4\u02c2\u02c9\u02de\u02c9\u0287\u02c4\u02c9\u02c6\u02cf\u0287\u02fb\u02dc\u02da\u02c1\u02c6\u02cf\u0293\u0281\u02e4\u02c2\u02c9\u02de\u02c9\u0287\u02c4\u02c9\u02c6\u02cf\u0287\u02fb\u02dc\u02da\u02c1\u02c6\u02cf\u0293", "\u04c6\u04e2\u04f8\u24b9\u048b\u0489\u049f\u04fb\u04dd\u04d6\u04c1\u04d6\u0498\u04db\u04d6\u04d9\u04d0\u0498\u04e4\u04c3\u04c5\u04de\u04d9\u04d0\u048c\u049e\u04fb\u04dd\u04d6\u04c1\u04d6\u0498\u04db\u04d6\u04d9\u04d0\u0498\u04e4\u04c3\u04c5\u04de\u04d9\u04d0\u048c", "\u0413\u044c\u0443\u0446\u0441\u0446\u045b\u0411\u0413\u0411\u0407\u0406\u0479", "\u0798\u07cd\u07ca\u07cd\u07d0\u079a\u0798\u079a\u078c\u078d\u07f2", "\u06a2\u06a0\u06b1\u0686\u06a9\u06a4\u06b6\u06b6\u06f9\u06fb\u06ed\u06ec\u0689\u06af\u06a4\u06b3\u06a4\u06ea\u06a9\u06a4\u06ab\u06a2\u06ea\u0686\u06a9\u06a4\u06b6\u06b6\u06fe", "\u0307\u030e\u031c\u0307\u032c\u0300\u030b\u030a\u0353\u0351\u0347\u0346\u0326", "\u0705\u0711\u0715\u0701\u070c\u0713\u075c\u075e\u0748\u072c\u070a\u0701\u0716\u0701\u074f\u070c\u0701\u070e\u0707\u074f\u072f\u0702\u070a\u0705\u0703\u0714\u075b\u0749\u073a", "\u02af\u02a0\u02a3\u02a2\u02a9\u02f0\u02f2\u02e4\u02e5\u0280\u02a6\u02ad\u02ba\u02ad\u02e3\u02a0\u02ad\u02a2\u02ab\u02e3\u0283\u02ae\u02a6\u02a9\u02af\u02b8\u02f7", "\u027b\u0260\u025c\u027b\u027d\u0266\u0261\u0268\u0233\u0231\u0227\u0226\u0243\u0265\u026e\u0279\u026e\u0220\u0263\u026e\u0261\u0268\u0220\u025c\u027b\u027d\u0266\u0261\u0268\u0234", "\u05e4\u05e5\u05fe\u05e3\u05ec\u05f3\u05b6\u05b4\u05a2\u05a3\u05dc", "\u040c\u040d\u0416\u040b\u0404\u041b\u0423\u040e\u040e\u045e\u045c\u044a\u044b\u0434", "\u07c4\u07d2\u07da\u07c7\u078f\u078d\u079b\u079a\u07e5", "YOGZ\u0012\u0010\u0006d\u0007x", "\u0087\u0091\u0099\u0084\u00c0\u00cc\u00ce\u00d8\u00ba\u00d9\u00a6", "\u0363\u0375\u037d\u0360\u0328\u032a\u033c\u035e\u035d\u033d\u0342", "\u0660\u066f\u0668\u0667\u066a\u066f\u067c\u0663\u063a\u0638\u062e\u062f\u0650"})
public final class Class3864 {
    public static float field8791;

    /*
     * WARNING - void declaration
     */
    private static CallSite 7NV5u68yWHjwjS(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3864.TQ1tvuhoSvVLXt2K(k2, 254896363));
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
                int a2 = Integer.parseInt(Class3864.TQ1tvuhoSvVLXt2K(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3864.TQ1tvuhoSvVLXt2K(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3864.TQ1tvuhoSvVLXt2K(k2, 254896363) + " " + l2 + " " + m2);
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
        l\u200e = "HACHIMI_THROW_ARMOR_Dfi3s1";
        Y\u200e = "global";
        aR\u200e = "FoliageColor";
        field8791 = Float.intBitsToFloat(1056694220);
    }

    private static String TQ1tvuhoSvVLXt2K(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

