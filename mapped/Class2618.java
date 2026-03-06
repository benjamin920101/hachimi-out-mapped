/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\u44ef\u44e8\u44ef\u44eb\u44e9\u44eb\u44e9\u44e9", "\u561e\u5615\u5614\u561e\u561f\u561b\u561b", "\uc71a\uc718\uc71b\uc71d\uc711\uc711\uc71a\uc719", "\u4b9f\u4b9b\u4b98\u4b9a\u4b9e\u4b9a\u4b9b\u4b99", "\u620a\u6205\u6204\u6200\u6200\u6204\u6200", "\ud906\ud905\ud90d\ud90d\ud902\ud901\ud902", "\u187f\u1874\u187c\u187a\u187f\u187d\u1878\u187f", "\u1cbc\u1cba\u1cbc\u1cbf\u1cb9\u1cbc\u1cbc\u1cbd", "\u0682\u0687\u0686\u068a\u0680\u0682\u068b\u0683", "\u5ccc\u5cc4\u5ccb\u5ccc\u5cc5\u5ccd\u5cc8\u5cc5", "\u20e6\u20e6\u20e4\u20ed\u20e4\u20e3\u20e0\u20e1", "\uc8e2\uc8e7\uc8e8\uc8e0\uc8e6\uc8e0\uc8e8\uc8e3", "\u954b\u9548\u954c\u9547\u9549\u954f\u9547\u9549", "\u6b40\u6b46\u6b42\u6b44\u6b49\u6b44\u6b48\u6b43", "\uc19f\uc198\uc194\uc195\uc19c\uc198\uc19e\uc199", "\u1b69\u1b6e\u1b6d\u1b68\u1b6c\u1b6a\u1b60\u1b61", "\u356f\u3565\u356e\u356a\u356d\u356b\u356e\u356f"}, d2={"\u06a8\u069d\u068f\u26c0\u06f2\u06f0\u06e6\u0682\u06a4\u06af\u06b8\u06af\u06e1\u06a2\u06af\u06a0\u06a9\u06e1\u069d\u06ba\u06bc\u06a7\u06a0\u06a9\u06f5\u06e7\u0682\u06a4\u06af\u06b8\u06af\u06e1\u06a2\u06af\u06a0\u06a9\u06e1\u069d\u06ba\u06bc\u06a7\u06a0\u06a9\u06f5", "\u00b1\u0084\u0095\u20d9\u00eb\u00e9\u00ff\u009b\u00bd\u00b6\u00a1\u00b6\u00f8\u00bb\u00b6\u00b9\u00b0\u00f8\u0084\u00a3\u00a5\u00be\u00b9\u00b0\u00ec\u00fe\u009b\u00bd\u00b6\u00a1\u00b6\u00f8\u00bb\u00b6\u00b9\u00b0\u00f8\u0084\u00a3\u00a5\u00be\u00b9\u00b0\u00ec", "\u0580\u05b5\u05a5\u25e8\u05da\u05d8\u05ce\u05aa\u058c\u0587\u0590\u0587\u05c9\u058a\u0587\u0588\u0581\u05c9\u05b5\u0592\u0594\u058f\u0588\u0581\u05dd\u05cf\u05aa\u058c\u0587\u0590\u0587\u05c9\u058a\u0587\u0588\u0581\u05c9\u05b5\u0592\u0594\u058f\u0588\u0581\u05dd", "\u06db\u0684\u068b\u068e\u0689\u068e\u0693\u06d9\u06db\u06d9\u06cf\u06ce\u06b1", "\u0567\u0532\u0535\u0532\u052f\u0565\u0567\u0565\u0573\u0572\u050d", "\u03ca\u03c8\u03d9\u03ee\u03c1\u03cc\u03de\u03de\u0391\u0393\u0385\u0384\u03e1\u03c7\u03cc\u03db\u03cc\u0382\u03c1\u03cc\u03c3\u03ca\u0382\u03ee\u03c1\u03cc\u03de\u03de\u0396", "\u078c\u0785\u0797\u078c\u07a7\u078b\u0780\u0781\u07d8\u07da\u07cc\u07cd\u07ad", "\u06a4\u06b0\u06b4\u06a0\u06ad\u06b2\u06fd\u06ff\u06e9\u068d\u06ab\u06a0\u06b7\u06a0\u06ee\u06ad\u06a0\u06af\u06a6\u06ee\u068e\u06a3\u06ab\u06a4\u06a2\u06b5\u06fa\u06e8\u069b", "\u01d7\u01d8\u01db\u01da\u01d1\u0188\u018a\u019c\u019d\u01f8\u01de\u01d5\u01c2\u01d5\u019b\u01d8\u01d5\u01da\u01d3\u019b\u01fb\u01d6\u01de\u01d1\u01d7\u01c0\u018f", "\u07f7\u07ec\u07d0\u07f7\u07f1\u07ea\u07ed\u07e4\u07bf\u07bd\u07ab\u07aa\u07cf\u07e9\u07e2\u07f5\u07e2\u07ac\u07ef\u07e2\u07ed\u07e4\u07ac\u07d0\u07f7\u07f1\u07ea\u07ed\u07e4\u07b8", "\u0097\u0096\u008d\u0090\u009f\u0080\u00c5\u00c7\u00d1\u00d0\u00af", "\u0700\u0701\u071a\u0707\u0708\u0717\u072f\u0702\u0702\u0752\u0750\u0746\u0747\u0738", "\u045d\u044b\u0443\u045e\u0416\u0414\u0402\u0403\u047c", "\u052a\u053c\u0534\u0529\u0561\u0563\u0575\u0517\u0574\u050b", "\u05b8\u05ae\u05a6\u05bb\u05ff\u05f3\u05f1\u05e7\u0585\u05e6\u0599", "\u03a3\u03b5\u03bd\u03a0\u03e8\u03ea\u03fc\u039e\u039d\u03fd\u0382", "\u0498\u0497\u0490\u049f\u0492\u0497\u0484\u049b\u04c2\u04c0\u04d6\u04d7\u04a8"})
public final class Class2618 {
    public static double field6813;
    public static double field6814;
    public static int field6815 = 336748452;
    public static int field6816 = 0;
    public static float field6817;
    public static float field6818;
    public static float field6819;

    private static String uRsrycTeOg921AFr(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite iWatQHOQXOkIOP(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class2618.uRsrycTeOg921AFr(k, -356949073));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        for (f = 0; f < q.length; ++f) {
            block8: {
                block9: {
                    try {
                        a = Integer.parseInt(Class2618.uRsrycTeOg921AFr(q[f], m));
                    }
                    catch (NumberFormatException b) {
                        continue;
                    }
                    if (e % 59557 != m.intValue()) break block9;
                    v0 = 44554;
                    ** GOTO lbl23
                }
                v0 = 44555;
                if (true) ** GOTO lbl23
                do {
                    v0 = var16_19 = 44553;
lbl23:
                    // 3 sources

                    if (var16_19 == 44554) break block8;
                } while (var16_19 == 44555);
                continue;
            }
            c = Class2618.uRsrycTeOg921AFr(r[f], l);
            d = c.split("<>");
            s = d[0];
            t = d[1];
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class2618.uRsrycTeOg921AFr(k, -356949073) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        field6817 = Float.intBitsToFloat(1040449180);
        field6813 = Double.longBitsToDouble(4603565312047974342L);
        field6814 = Double.longBitsToDouble(4589708452245819884L);
        field6818 = Float.intBitsToFloat(1061925191);
        ar\u200e = "PAGE_UP";
        field6819 = Float.intBitsToFloat(1059736326);
        aW\u200e = "Allows you to see through solid blocks";
        bw\u200e = "Auto place of crystal base(obsidian)";
    }
}

