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
@HACHIMI_CLIENT(mv=100, d1={"\u285f\u285b\u285a\u285f\u285f\u285c\u285b\u285d", "\uca99\uca99\uca9e\uca9c\uca99\uca99\uca9f\uca93", "\u081d\u081b\u081c\u081b\u0817\u0816\u081d\u0816", "\u64b1\u64ba\u64b1\u64b0\u64b2\u64ba\u64ba\u64b3", "\ucfbc\ucfb3\ucfbc\ucfbb\ucfbd\ucfbe\ucfb8", "\ubf0b\ubf0a\ubf0a\ubf05\ubf05\ubf04\ubf05", "\ud3d7\ud3d2\ud3d0\ud3db\ud3d5\ud3db\ud3d3\ud3d2", "\u3ee6\u3ee6\u3ee3\u3ee0\u3ee3\u3ee0\u3ee2\u3ee1", "\uac41\uac40\uac43\uac4a\uac41\uac44\uac43\uac45", "\u3873\u3870\u3878\u3870\u3875\u3873\u3876\u3879", "\u0433\u0433\u0431\u0430\u043f\u0437\u0431", "\ucf78\ucf72\ucf78\ucf72\ucf79\ucf7a\ucf72\ucf7e", "\u6289\u628d\u6280\u628e\u628f\u628c\u628b\u628c", "\u6f42\u6f44\u6f43\u6f42\u6f47\u6f47\u6f48\u6f44"}, d2={"\u03d0\u038f\u0380\u0385\u0382\u0385\u0398\u03d2\u03d0\u03d2\u03c4\u03c5\u03ba", "\u07a5\u07f0\u07f7\u07f0\u07ed\u07a7\u07a5\u07a7\u07b1\u07b0\u07cf", "\u05c3\u05c1\u05d0\u05e7\u05c8\u05c5\u05d7\u05d7\u0598\u059a\u058c\u058d\u05e8\u05ce\u05c5\u05d2\u05c5\u058b\u05c8\u05c5\u05ca\u05c3\u058b\u05e7\u05c8\u05c5\u05d7\u05d7\u059f", "\u0123\u012a\u0138\u0123\u0108\u0124\u012f\u012e\u0177\u0175\u0163\u0162\u0102", "\u03e8\u03fc\u03f8\u03ec\u03e1\u03fe\u03b1\u03b3\u03a5\u03c1\u03e7\u03ec\u03fb\u03ec\u03a2\u03e1\u03ec\u03e3\u03ea\u03a2\u03c2\u03ef\u03e7\u03e8\u03ee\u03f9\u03b6\u03a4\u03d7", "\u02c3\u02cc\u02cf\u02ce\u02c5\u029c\u029e\u0288\u0289\u02ec\u02ca\u02c1\u02d6\u02c1\u028f\u02cc\u02c1\u02ce\u02c7\u028f\u02ef\u02c2\u02ca\u02c5\u02c3\u02d4\u029b", "\u0214\u020f\u0233\u0214\u0212\u0209\u020e\u0207\u025c\u025e\u0248\u0249\u022c\u020a\u0201\u0216\u0201\u024f\u020c\u0201\u020e\u0207\u024f\u0233\u0214\u0212\u0209\u020e\u0207\u025b", "\u05bb\u05ba\u05a1\u05bc\u05b3\u05ac\u05e9\u05eb\u05fd\u05fc\u0583", "\u012d\u012c\u0137\u012a\u0125\u013a\u0102\u012f\u012f\u017f\u017d\u016b\u016a\u0115", "\u01d0\u01c6\u01ce\u01d3\u019b\u0199\u018f\u018e\u01f1", "\u02fe\u02e8\u02e0\u02fd\u02b5\u02b7\u02a1\u02c3\u02a0\u02df", "\u01eb\u01fd\u01f5\u01e8\u01ac\u01a0\u01a2\u01b4\u01d6\u01b5\u01ca", "\u025b\u024d\u0245\u0258\u0210\u0212\u0204\u0266\u0265\u0205\u027a", "\u021e\u0211\u0216\u0219\u0214\u0211\u0202\u021d\u0244\u0246\u0250\u0251\u022e"})
public final class Class4174 {
    public static float field9727;
    public static float field9728 = 0.48932034f;
    public static int field9729 = 444937971;
    public static double field9730;

    static {
        field9730 = Double.longBitsToDouble(4603641840450116623L);
        field9727 = Float.intBitsToFloat(1056707548);
    }

    private static String 64f74SSYbn2wQjfJ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite zLSoJy9wwtvMVI(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4174.64f74SSYbn2wQjfJ(k2, 1063060437));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block6: for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4174.64f74SSYbn2wQjfJ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n3 = e2 % 59557 != m2.intValue() ? 21802 : 21801;
            block7: while (true) {
                switch (n3) {
                    case 21802: {
                        n3 = 21800;
                        continue block7;
                    }
                    case 21801: {
                        String c2 = Class4174.64f74SSYbn2wQjfJ(r2[f2], l2);
                        String[] d2 = c2.split("<>");
                        s2 = d2[0];
                        t2 = d2[1];
                        break block6;
                    }
                    default: {
                        continue block6;
                    }
                }
                break;
            }
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4174.64f74SSYbn2wQjfJ(k2, 1063060437) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

