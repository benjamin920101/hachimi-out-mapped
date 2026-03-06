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
@HACHIMI_CLIENT(mv=100, d1={"\uce31\uce30\uce3f\uce31\uce3e\uce3c\uce31", "\uc9bb\uc9b7\uc9bb\uc9ba\uc9b7\uc9be\uc9ba\uc9bf", "\udac4\udac2\udac6\udac4\udac2\udac6\udac5\udacf", "\ud015\ud011\ud010\ud019\ud013\ud016\ud012\ud019", "\u1e81\u1e8d\u1e83\u1e83\u1e80\u1e8c\u1e86\u1e85", "\ue26b\ue26d\ue26a\ue269\ue26b\ue268\ue26e\ue26f", "\ue0ef\ue0e8\ue0e0\ue0e0\ue0ef\ue0e1\ue0ed\ue0e8", "\ua2eb\ua2e2\ua2e8\ua2ec\ua2ec\ua2eb\ua2e9\ua2e8", "\ub933\ub930\ub936\ub931\ub937\ub930\ub933\ub93a", "\u1bf0\u1bf3\u1bf4\u1bf0\u1bf4\u1bf0\u1bfb\u1bf5", "\u6c7f\u6c78\u6c79\u6c7b\u6c7c\u6c7b\u6c74\u6c78", "\ub4aa\ub4ac\ub4a4\ub4ae\ub4ad\ub4aa\ub4aa", "\u6674\u6676\u667c\u6673\u6677\u6670\u6674\u667c", "\ud4ca\ud4cd\ud4ca\ud4cc\ud4c8\ud4cd\ud4ce", "\udbd4\udbda\udbd5\udbd0\udbd7\udbd7\udbd3\udbd3", "\udd1a\udd18\udd1b\udd19\udd16\udd1a\udd18\udd1e", "\u37dc\u37dd\u37d3\u37da\u37d3\u37d8\u37d3\u37de", "\u5cdd\u5cd2\u5cda\u5cdd\u5cd2\u5cdf\u5cdd\u5cdf", "\uc784\uc784\uc785\uc784\uc780\uc781\uc789\uc789"}, d2={"\u035f\u0342\u0375\u2338\u030a\u0308\u031e\u037a\u035c\u0357\u0340\u0357\u0319\u035a\u0357\u0358\u0351\u0319\u0365\u0342\u0344\u035f\u0358\u0351\u030d\u031f\u037a\u035c\u0357\u0340\u0357\u0319\u035a\u0357\u0358\u0351\u0319\u0365\u0342\u0344\u035f\u0358\u0351\u030d", "\u054e\u0553\u0563\u2529\u051b\u0519\u050f\u056b\u054d\u0546\u0551\u0546\u0508\u054b\u0546\u0549\u0540\u0508\u0574\u0553\u0555\u054e\u0549\u0540\u051c\u050e\u056b\u054d\u0546\u0551\u0546\u0508\u054b\u0546\u0549\u0540\u0508\u0574\u0553\u0555\u054e\u0549\u0540\u051c", "\u0362\u037f\u034e\u2305\u0337\u0335\u0323\u0347\u0361\u036a\u037d\u036a\u0324\u0367\u036a\u0365\u036c\u0324\u0358\u037f\u0379\u0362\u0365\u036c\u0330\u0322\u0347\u0361\u036a\u037d\u036a\u0324\u0367\u036a\u0365\u036c\u0324\u0358\u037f\u0379\u0362\u0365\u036c\u0330", "\u01b5\u01a8\u019a\u21d2\u01e0\u01e2\u01f4\u0190\u01b6\u01bd\u01aa\u01bd\u01f3\u01b0\u01bd\u01b2\u01bb\u01f3\u018f\u01a8\u01ae\u01b5\u01b2\u01bb\u01e7\u01f5\u0190\u01b6\u01bd\u01aa\u01bd\u01f3\u01b0\u01bd\u01b2\u01bb\u01f3\u018f\u01a8\u01ae\u01b5\u01b2\u01bb\u01e7", "\u0365\u0378\u034b\u2302\u0330\u0332\u0324\u0340\u0366\u036d\u037a\u036d\u0323\u0360\u036d\u0362\u036b\u0323\u035f\u0378\u037e\u0365\u0362\u036b\u0337\u0325\u0340\u0366\u036d\u037a\u036d\u0323\u0360\u036d\u0362\u036b\u0323\u035f\u0378\u037e\u0365\u0362\u036b\u0337", "\u07cb\u0794\u079b\u079e\u0799\u079e\u0783\u07c9\u07cb\u07c9\u07df\u07de\u07a1", "\t\\[\\A\u000b\t\u000b\u001d\u001cc", "\u028b\u0289\u0298\u02af\u0280\u028d\u029f\u029f\u02d0\u02d2\u02c4\u02c5\u02a0\u0286\u028d\u029a\u028d\u02c3\u0280\u028d\u0282\u028b\u02c3\u02af\u0280\u028d\u029f\u029f\u02d7", "\u0499\u0490\u0482\u0499\u04b2\u049e\u0495\u0494\u04cd\u04cf\u04d9\u04d8\u04b8", "\u0617\u0603\u0607\u0613\u061e\u0601\u064e\u064c\u065a\u063e\u0618\u0613\u0604\u0613\u065d\u061e\u0613\u061c\u0615\u065d\u063d\u0610\u0618\u0617\u0611\u0606\u0649\u065b\u0628", "\u0343\u034c\u034f\u034e\u0345\u031c\u031e\u0308\u0309\u036c\u034a\u0341\u0356\u0341\u030f\u034c\u0341\u034e\u0347\u030f\u036f\u0342\u034a\u0345\u0343\u0354\u031b", "\u06a4\u06bf\u0683\u06a4\u06a2\u06b9\u06be\u06b7\u06ec\u06ee\u06f8\u06f9\u069c\u06ba\u06b1\u06a6\u06b1\u06ff\u06bc\u06b1\u06be\u06b7\u06ff\u0683\u06a4\u06a2\u06b9\u06be\u06b7\u06eb", "\u06d5\u06d4\u06cf\u06d2\u06dd\u06c2\u0687\u0685\u0693\u0692\u06ed", "\u077c\u077d\u0766\u077b\u0774\u076b\u0753\u077e\u077e\u072e\u072c\u073a\u073b\u0744", "\u0262\u0274\u027c\u0261\u0229\u022b\u023d\u023c\u0243", "\u07ad\u07bb\u07b3\u07ae\u07e6\u07e4\u07f2\u0790\u07f3\u078c", "\u05f6\u05e0\u05e8\u05f5\u05b1\u05bd\u05bf\u05a9\u05cb\u05a8\u05d7", "\u0632\u0624\u062c\u0631\u0679\u067b\u066d\u060f\u060c\u066c\u0613", "\u019c\u0193\u0194\u019b\u0196\u0193\u0180\u019f\u01c6\u01c4\u01d2\u01d3\u01ac"})
public final class Class1509 {
    public static float field5694 = 0.9841607f;
    public static int field5695 = 971711351;

    /*
     * Enabled aggressive block sorting
     */
    private static String x7sWLGUofreRPRAB(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 34355 : 34356;
            block5: while (true) {
                switch (n2) {
                    case 34356: {
                        n2 = 34354;
                        continue block5;
                    }
                    case 34355: {
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

    static {
        e\u200e = "Translation in z-direction";
        q\u200e = "Mode";
        aY\u200e = "I am currently AFK.";
        bf\u200e = "Always";
        bJ\u200e = "Draws a tracer to all entities in render distance";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite 4h7vw6FO0TnQp4(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1509.x7sWLGUofreRPRAB(k2, -2016642495));
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
                int a2 = Integer.parseInt(Class1509.x7sWLGUofreRPRAB(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1509.x7sWLGUofreRPRAB(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1509.x7sWLGUofreRPRAB(k2, -2016642495) + " " + l2 + " " + m2);
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

