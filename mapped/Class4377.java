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
@HACHIMI_CLIENT(mv=100, d1={"\u162e\u1621\u1628\u1621\u1629\u162f\u162f\u162e", "\u2415\u2413\u241d\u2417\u2411\u241d\u2414\u241d", "\u3219\u3214\u3215\u321d\u3218\u321b\u321d\u321b", "\u7ed7\u7ed4\u7ed3\u7ed1\u7ed1\u7eda\u7ed6\u7ed5", "\ucf7a\ucf7e\ucf7a\ucf78\ucf7b\ucf78\ucf7b\ucf79", "\u882c\u882d\u882c\u8829\u8828\u882a\u8829\u882d", "\u2a9f\u2a9a\u2a9c\u2a98\u2a9e\u2a95\u2a9c\u2a95", "\u0b49\u0b4f\u0b4b\u0b4e\u0b4b\u0b4f\u0b4c\u0b42", "\ucd40\ucd41\ucd43\ucd47\ucd46\ucd4c\ucd45\ucd41", "\u92ae\u92a3\u92ac\u92af\u92aa\u92aa\u92ac", "\u1d6d\u1d6d\u1d61\u1d6c\u1d6a\u1d60\u1d6a\u1d6d", "\u75f4\u75f5\u75f5\u75f3\u75f1\u75f6\u75f9\u75f2", "\u5d36\u5d35\u5d36\u5d3b\u5d32\u5d35\u5d31\u5d3b", "\u283d\u2833\u283b\u2839\u283f\u2838\u283f\u283e", "\ua42b\ua426\ua429\ua426\ua428\ua42e\ua42e", "\u0973\u0979\u0970\u0970\u0972\u0973\u0976\u0972"}, d2={"\u0763\u0770\u075c\u271f\u072d\u072f\u0739\u075d\u077b\u0770\u0767\u0770\u073e\u077d\u0770\u077f\u0776\u073e\u0742\u0765\u0763\u0778\u077f\u0776\u072a\u0738\u075d\u077b\u0770\u0767\u0770\u073e\u077d\u0770\u077f\u0776\u073e\u0742\u0765\u0763\u0778\u077f\u0776\u072a", "\u00f6\u00e5\u00ca\u208a\u00b8\u00ba\u00ac\u00c8\u00ee\u00e5\u00f2\u00e5\u00ab\u00e8\u00e5\u00ea\u00e3\u00ab\u00d7\u00f0\u00f6\u00ed\u00ea\u00e3\u00bf\u00ad\u00c8\u00ee\u00e5\u00f2\u00e5\u00ab\u00e8\u00e5\u00ea\u00e3\u00ab\u00d7\u00f0\u00f6\u00ed\u00ea\u00e3\u00bf", "\u064c\u0613\u061c\u0619\u061e\u0619\u0604\u064e\u064c\u064e\u0658\u0659\u0626", "\u052d\u0578\u057f\u0578\u0565\u052f\u052d\u052f\u0539\u0538\u0547", "\u021a\u0218\u0209\u023e\u0211\u021c\u020e\u020e\u0241\u0243\u0255\u0254\u0231\u0217\u021c\u020b\u021c\u0252\u0211\u021c\u0213\u021a\u0252\u023e\u0211\u021c\u020e\u020e\u0246", "\u06bf\u06b6\u06a4\u06bf\u0694\u06b8\u06b3\u06b2\u06eb\u06e9\u06ff\u06fe\u069e", "\u0699\u068d\u0689\u069d\u0690\u068f\u06c0\u06c2\u06d4\u06b0\u0696\u069d\u068a\u069d\u06d3\u0690\u069d\u0692\u069b\u06d3\u06b3\u069e\u0696\u0699\u069f\u0688\u06c7\u06d5\u06a6", "kdgfm46 !Dbi~i'difo'Gjbmk|3", "\u0359\u0342\u037e\u0359\u035f\u0344\u0343\u034a\u0311\u0313\u0305\u0304\u0361\u0347\u034c\u035b\u034c\u0302\u0341\u034c\u0343\u034a\u0302\u037e\u0359\u035f\u0344\u0343\u034a\u0316", "\u00b3\u00b2\u00a9\u00b4\u00bb\u00a4\u00e1\u00e3\u00f5\u00f4\u008b", "\u0568\u0569\u0572\u056f\u0560\u057f\u0547\u056a\u056a\u053a\u0538\u052e\u052f\u0550", "\u03b4\u03a2\u03aa\u03b7\u03ff\u03fd\u03eb\u03ea\u0395", "\u03bb\u03ad\u03a5\u03b8\u03f0\u03f2\u03e4\u0386\u03e5\u039a", "\u05d9\u05cf\u05c7\u05da\u059e\u0592\u0590\u0586\u05e4\u0587\u05f8", "\u022f\u0239\u0231\u022c\u0264\u0266\u0270\u0212\u0211\u0271\u020e", "\u0480\u048f\u0488\u0487\u048a\u048f\u049c\u0483\u04da\u04d8\u04ce\u04cf\u04b0"})
public final class Class4377 {
    public static double field9980 = Double.longBitsToDouble(4589510481824338544L);
    public static double field9981 = Double.longBitsToDouble(4622945017495814144L);
    public static float field9982 = Float.intBitsToFloat(1063495868);
    public static int field9983 = 303493789;
    public static double field9984;

    private static String 6nyBvgDHumoaRgxz(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite EMnSKJ9g6Doj83(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4377.6nyBvgDHumoaRgxz(k2, -1246730825));
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
                int a2 = Integer.parseInt(Class4377.6nyBvgDHumoaRgxz(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4377.6nyBvgDHumoaRgxz(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4377.6nyBvgDHumoaRgxz(k2, -1246730825) + " " + l2 + " " + m2);
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
        W\u200e = "Removes crawl slowdown";
        field9984 = Double.longBitsToDouble(4593337256946715608L);
        ax\u200e = "Reloaded the SoundSystem";
    }
}

