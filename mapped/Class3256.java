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

@HACHIMI_CLIENT(mv=100, d1={"\ucb1a\ucb18\ucb18\ucb15\ucb1e\ucb1a\ucb14\ucb1a", "\u9288\u9283\u9282\u928d\u928f\u928c\u928b\u9283", "\ub847\ub84a\ub846\ub84a\ub84b\ub845\ub847\ub840", "\ua098\ua09f\ua09d\ua098\ua090\ua09a\ua099\ua09d", "\ub9ee\ub9ee\ub9e2\ub9ec\ub9ea\ub9ed\ub9eb\ub9e9", "\u08bf\u08bc\u08bf\u08bb\u08ba\u08be\u08b9\u08b4", "\u6775\u6774\u6770\u6776\u6771\u6777\u6772\u6778", "\u198a\u198e\u198e\u198e\u198b\u198d\u1982", "\u6772\u6772\u6771\u6773\u6775\u6771\u6772\u6773", "\ud078\ud07a\ud07b\ud07b\ud07d\ud07b\ud07b\ud079", "\u8414\u8411\u8417\u8413\u8412\u841c\u8410\u8417", "\udaec\udaee\udae8\udae1\udaeb\udaed\udae0\udaed", "\ue52a\ue52a\ue521\ue520\ue520\ue528\ue521\ue52b", "\u774f\u7748\u774f\u7745\u7748\u7745\u774b\u774b", "\ud167\ud166\ud166\ud160\ud161\ud162\ud162\ud166", "\u7095\u7091\u709f\u7090\u7090\u7090\u7092\u7091", "\u0f98\u0f93\u0f9a\u0f9a\u0f92\u0f98\u0f9c\u0f93"}, d2={"\u016e\u0176\u015a\u210e\u013c\u013e\u0128\u014c\u016a\u0161\u0176\u0161\u012f\u016c\u0161\u016e\u0167\u012f\u0153\u0174\u0172\u0169\u016e\u0167\u013b\u0129\u014c\u016a\u0161\u0176\u0161\u012f\u016c\u0161\u016e\u0167\u012f\u0153\u0174\u0172\u0169\u016e\u0167\u013b", "\u07eb\u07f2\u07e4\u278b\u07b9\u07bb\u07ad\u07c9\u07ef\u07e4\u07f3\u07e4\u07aa\u07e9\u07e4\u07eb\u07e2\u07aa\u07d6\u07f1\u07f7\u07ec\u07eb\u07e2\u07be\u07ac\u07c9\u07ef\u07e4\u07f3\u07e4\u07aa\u07e9\u07e4\u07eb\u07e2\u07aa\u07d6\u07f1\u07f7\u07ec\u07eb\u07e2\u07be", "\u0381\u0398\u038d\u23e1\u03d3\u03d1\u03c7\u03a3\u0385\u038e\u0399\u038e\u03c0\u0383\u038e\u0381\u0388\u03c0\u03bc\u039b\u039d\u0386\u0381\u0388\u03d4\u03c6\u03a3\u0385\u038e\u0399\u038e\u03c0\u0383\u038e\u0381\u0388\u03c0\u03bc\u039b\u039d\u0386\u0381\u0388\u03d4", "\u066f\u0630\u063f\u063a\u063d\u063a\u0627\u066d\u066f\u066d\u067b\u067a\u0605", "\u00ef\u00ba\u00bd\u00ba\u00a7\u00ed\u00ef\u00ed\u00fb\u00fa\u0085", "\u07e1\u07e3\u07f2\u07c5\u07ea\u07e7\u07f5\u07f5\u07ba\u07b8\u07ae\u07af\u07ca\u07ec\u07e7\u07f0\u07e7\u07a9\u07ea\u07e7\u07e8\u07e1\u07a9\u07c5\u07ea\u07e7\u07f5\u07f5\u07bd", "\u04dd\u04d4\u04c6\u04dd\u04f6\u04da\u04d1\u04d0\u0489\u048b\u049d\u049c\u04fc", "\u00bf\u00ab\u00af\u00bb\u00b6\u00a9\u00e6\u00e4\u00f2\u0096\u00b0\u00bb\u00ac\u00bb\u00f5\u00b6\u00bb\u00b4\u00bd\u00f5\u0095\u00b8\u00b0\u00bf\u00b9\u00ae\u00e1\u00f3\u0080", "\u07be\u07b1\u07b2\u07b3\u07b8\u07e1\u07e3\u07f5\u07f4\u0791\u07b7\u07bc\u07ab\u07bc\u07f2\u07b1\u07bc\u07b3\u07ba\u07f2\u0792\u07bf\u07b7\u07b8\u07be\u07a9\u07e6", "\u07bf\u07a4\u0798\u07bf\u07b9\u07a2\u07a5\u07ac\u07f7\u07f5\u07e3\u07e2\u0787\u07a1\u07aa\u07bd\u07aa\u07e4\u07a7\u07aa\u07a5\u07ac\u07e4\u0798\u07bf\u07b9\u07a2\u07a5\u07ac\u07f0", "\u0242\u0243\u0258\u0245\u024a\u0255\u0210\u0212\u0204\u0205\u027a", "\u03d4\u03d5\u03ce\u03d3\u03dc\u03c3\u03fb\u03d6\u03d6\u0386\u0384\u0392\u0393\u03ec", "~h`}57! _", "\u03f0\u03e6\u03ee\u03f3\u03bb\u03b9\u03af\u03cd\u03ae\u03d1", "\u0587\u0591\u0599\u0584\u05c0\u05cc\u05ce\u05d8\u05ba\u05d9\u05a6", "\u0620\u0636\u063e\u0623\u066b\u0669\u067f\u061d\u061e\u067e\u0601", "\u013f\u0130\u0137\u0138\u0135\u0130\u0123\u013c\u0165\u0167\u0171\u0170\u010f"})
public final class Class3256 {
    public static float field6993;
    public static float field6994;
    public static float field6995;

    /*
     * WARNING - void declaration
     */
    private static CallSite dzCrjg1qI2nBBh(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3256.G719okdhvDiS0nQn(k2, -1302401782));
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
                int a2 = Integer.parseInt(Class3256.G719okdhvDiS0nQn(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3256.G719okdhvDiS0nQn(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3256.G719okdhvDiS0nQn(k2, -1302401782) + " " + l2 + " " + m2);
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
        w\u200e = "BreakCrystal";
        field6995 = Float.intBitsToFloat(1062395073);
        aq\u200e = "Modifications for the chat";
        aJ\u200e = "Combat the problems of aliasing in a sampled signal such as a digital image";
        field6994 = Float.intBitsToFloat(1065079684);
        field6993 = Float.intBitsToFloat(1048163912);
    }

    private static String G719okdhvDiS0nQn(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

