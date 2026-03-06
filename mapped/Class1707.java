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

@HACHIMI_CLIENT(mv=100, d1={"\u3a3e\u3a3c\u3a37\u3a3b\u3a39\u3a38\u3a3b", "\u5260\u5261\u526d\u5264\u5266\u5260\u5264\u5262", "\ua1bc\ua1be\ua1b1\ua1be\ua1b8\ua1bb\ua1b9\ua1b9", "\ua00c\ua00b\ua00f\ua00d\ua00d\ua000\ua00d\ua00c", "\u14ae\u14a7\u14a7\u14ad\u14aa\u14ad\u14a6\u14ae", "\ucde7\ucde6\ucde4\ucded\ucde0\ucde7\ucde1\ucdec", "\u0ceb\u0ce4\u0ced\u0ce5\u0ce4\u0ce9\u0cec\u0cee", "\u4aac\u4aab\u4aaf\u4aaa\u4aae\u4aaf\u4aac\u4aa8", "\uce2b\uce20\uce2a\uce2c\uce2d\uce21\uce29\uce2c", "\u78e3\u78eb\u78e7\u78e4\u78e7\u78e4\u78e0\u78e4", "\u89c8\u89cc\u89c1\u89ca\u89c1\u89c9\u89ca", "\u20c6\u20c6\u20c0\u20c4\u20c5\u20cc\u20c2\u20cc", "\u57e4\u57e5\u57e7\u57e4\u57e2\u57e3\u57e0\u57e2", "\u1721\u1721\u1721\u1726\u1720\u1721\u1726\u1724", "\u0d23\u0d26\u0d2c\u0d23\u0d22\u0d20\u0d23\u0d22", "\u0f63\u0f64\u0f62\u0f64\u0f69\u0f61\u0f69\u0f65"}, d2={"\u04b8\u0485\u049e\u24da\u04e8\u04ea\u04fc\u0498\u04be\u04b5\u04a2\u04b5\u04fb\u04b8\u04b5\u04ba\u04b3\u04fb\u0487\u04a0\u04a6\u04bd\u04ba\u04b3\u04ef\u04fd\u0498\u04be\u04b5\u04a2\u04b5\u04fb\u04b8\u04b5\u04ba\u04b3\u04fb\u0487\u04a0\u04a6\u04bd\u04ba\u04b3\u04ef", "\u00ed\u00d0\u00ca\u208f\u00bd\u00bf\u00a9\u00cd\u00eb\u00e0\u00f7\u00e0\u00ae\u00ed\u00e0\u00ef\u00e6\u00ae\u00d2\u00f5\u00f3\u00e8\u00ef\u00e6\u00ba\u00a8\u00cd\u00eb\u00e0\u00f7\u00e0\u00ae\u00ed\u00e0\u00ef\u00e6\u00ae\u00d2\u00f5\u00f3\u00e8\u00ef\u00e6\u00ba", "\u023d\u0262\u026d\u0268\u026f\u0268\u0275\u023f\u023d\u023f\u0229\u0228\u0257", "\u0655\u0600\u0607\u0600\u061d\u0657\u0655\u0657\u0641\u0640\u063f", "\u0485\u0487\u0496\u04a1\u048e\u0483\u0491\u0491\u04de\u04dc\u04ca\u04cb\u04ae\u0488\u0483\u0494\u0483\u04cd\u048e\u0483\u048c\u0485\u04cd\u04a1\u048e\u0483\u0491\u0491\u04d9", "\u038b\u0382\u0390\u038b\u03a0\u038c\u0387\u0386\u03df\u03dd\u03cb\u03ca\u03aa", "\u0723\u0737\u0733\u0727\u072a\u0735\u077a\u0778\u076e\u070a\u072c\u0727\u0730\u0727\u0769\u072a\u0727\u0728\u0721\u0769\u0709\u0724\u072c\u0723\u0725\u0732\u077d\u076f\u071c", "\u05fb\u05f4\u05f7\u05f6\u05fd\u05a4\u05a6\u05b0\u05b1\u05d4\u05f2\u05f9\u05ee\u05f9\u05b7\u05f4\u05f9\u05f6\u05ff\u05b7\u05d7\u05fa\u05f2\u05fd\u05fb\u05ec\u05a3", "\u07a8\u07b3\u078f\u07a8\u07ae\u07b5\u07b2\u07bb\u07e0\u07e2\u07f4\u07f5\u0790\u07b6\u07bd\u07aa\u07bd\u07f3\u07b0\u07bd\u07b2\u07bb\u07f3\u078f\u07a8\u07ae\u07b5\u07b2\u07bb\u07e7", "\u025b\u025a\u0241\u025c\u0253\u024c\u0209\u020b\u021d\u021c\u0263", "\u0393\u0392\u0389\u0394\u039b\u0384\u03bc\u0391\u0391\u03c1\u03c3\u03d5\u03d4\u03ab", "\u02c6\u02d0\u02d8\u02c5\u028d\u028f\u0299\u0298\u02e7", "\u06ce\u06d8\u06d0\u06cd\u0685\u0687\u0691\u06f3\u0690\u06ef", "\u019e\u0188\u0180\u019d\u01d9\u01d5\u01d7\u01c1\u01a3\u01c0\u01bf", "\u0262\u0274\u027c\u0261\u0229\u022b\u023d\u025f\u025c\u023c\u0243", "\u055d\u0552\u0555\u055a\u0557\u0552\u0541\u055e\u0507\u0505\u0513\u0512\u056d"})
public final class Class1707 {
    public static float field6324;

    private static String ITidE3HxYjz5pvGE(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        I\u200e = "Failed to replace totem in %sms!";
        field6324 = Float.intBitsToFloat(1062620213);
        bC\u200e = "Range to search for potential enemies";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite aTIyzlMgmZ4nEQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        Class<?> o2 = Class.forName(Class1707.ITidE3HxYjz5pvGE(k2, 1759052291));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block2: for (int f2 = 0; f2 < q2.length; ++f2) {
            int n3;
            void e2;
            try {
                int a2 = Integer.parseInt(Class1707.ITidE3HxYjz5pvGE(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n4 = e2 % 59557 != m2.intValue() ? 58304 : 58303;
            while ((n3 = n4) != 58303) {
                if (n3 != 58304) continue block2;
                n4 = 58302;
            }
            String c2 = Class1707.ITidE3HxYjz5pvGE(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class1707.ITidE3HxYjz5pvGE(k2, 1759052291) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n5 = n2 == 1 ? 61952 : 61953;
        while (true) {
            MethodHandle v2;
            int n6;
            if ((n6 = n5) == 61952) {
                MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            if (n6 != 61953) {
                v2 = h2.findStatic(o2, s2, u2);
                return new ConstantCallSite(v2.asType(j2));
            }
            n5 = 61951;
        }
    }
}

