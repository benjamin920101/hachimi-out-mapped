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

@HACHIMI_CLIENT(mv=100, d1={"\u275a\u2758\u275c\u2758\u275c\u275e\u275d\u275b", "\u5032\u5039\u5035\u5036\u5030\u5037\u5035\u5032", "\u6178\u617a\u617a\u617c\u6178\u6179\u617a\u6173", "\udde0\udde3\udde4\uddeb\uddeb\udde2\uddea\uddea", "\u1809\u180d\u180d\u180f\u1809\u180f\u1809", "\u3c33\u3c37\u3c36\u3c33\u3c33\u3c31\u3c37\u3c33", "\u65e8\u65ee\u65e8\u65eb\u65ea\u65e5\u65ef\u65ed", "\ue128\ue128\ue12c\ue12d\ue12c\ue12a\ue125\ue128", "\u0964\u0960\u096f\u0964\u0964\u0967\u0963\u0962", "\udcfa\udcfd\udcf4\udcfd\udcfb\udcfd\udcff\udcff", "\u3b28\u3b27\u3b2c\u3b2d\u3b29\u3b2a\u3b28", "\ud1ed\ud1e9\ud1ea\ud1e9\ud1eb\ud1ea\ud1e9\ud1e4", "\ubbc5\ubbc5\ubbc6\ubbc7\ubbc4\ubbc3\ubbc5\ubbc0", "\u0968\u096b\u096c\u096a\u0969\u0960\u0969", "\ua532\ua534\ua531\ua533\ua531\ua534\ua535", "\u8fca\u8fcb\u8fcc\u8fcc\u8fcd\u8fc0\u8fce\u8fc0", "\uced0\uced2\uced2\uced8\uced2\uced6\uced3\uced8", "\u6524\u6525\u6524\u6521\u6522\u6524\u6524\u6527", "\u9d73\u9d72\u9d70\u9d73\u9d72\u9d76\u9d75\u9d77"}, d2={"\u06cc\u06d8\u06ca\u26a0\u0692\u0690\u0686\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695\u0687\u06e2\u06c4\u06cf\u06d8\u06cf\u0681\u06c2\u06cf\u06c0\u06c9\u0681\u06fd\u06da\u06dc\u06c7\u06c0\u06c9\u0695", "\u0018\f\u001f\u2074FDR6\u0010\u001b\f\u001bU\u0016\u001b\u0014\u001dU)\u000e\b\u0013\u0014\u001dAS6\u0010\u001b\f\u001bU\u0016\u001b\u0014\u001dU)\u000e\b\u0013\u0014\u001dA", "\u0137\u0123\u0133\u215b\u0169\u016b\u017d\u0119\u013f\u0134\u0123\u0134\u017a\u0139\u0134\u013b\u0132\u017a\u0106\u0121\u0127\u013c\u013b\u0132\u016e\u017c\u0119\u013f\u0134\u0123\u0134\u017a\u0139\u0134\u013b\u0132\u017a\u0106\u0121\u0127\u013c\u013b\u0132\u016e", "\u0385\u0391\u0380\u23e9\u03db\u03d9\u03cf\u03ab\u038d\u0386\u0391\u0386\u03c8\u038b\u0386\u0389\u0380\u03c8\u03b4\u0393\u0395\u038e\u0389\u0380\u03dc\u03ce\u03ab\u038d\u0386\u0391\u0386\u03c8\u038b\u0386\u0389\u0380\u03c8\u03b4\u0393\u0395\u038e\u0389\u0380\u03dc", "\u0482\u0496\u0488\u24ee\u04dc\u04de\u04c8\u04ac\u048a\u0481\u0496\u0481\u04cf\u048c\u0481\u048e\u0487\u04cf\u04b3\u0494\u0492\u0489\u048e\u0487\u04db\u04c9\u04ac\u048a\u0481\u0496\u0481\u04cf\u048c\u0481\u048e\u0487\u04cf\u04b3\u0494\u0492\u0489\u048e\u0487\u04db", "\u0157\u0108\u0107\u0102\u0105\u0102\u011f\u0155\u0157\u0155\u0143\u0142\u013d", "\u0366\u0333\u0334\u0333\u032e\u0364\u0366\u0364\u0372\u0373\u030c", "\u020f\u020d\u021c\u022b\u0204\u0209\u021b\u021b\u0254\u0256\u0240\u0241\u0224\u0202\u0209\u021e\u0209\u0247\u0204\u0209\u0206\u020f\u0247\u022b\u0204\u0209\u021b\u021b\u0253", "\u00ac\u00a5\u00b7\u00ac\u0087\u00ab\u00a0\u00a1\u00f8\u00fa\u00ec\u00ed\u008d", "\u07e8\u07fc\u07f8\u07ec\u07e1\u07fe\u07b1\u07b3\u07a5\u07c1\u07e7\u07ec\u07fb\u07ec\u07a2\u07e1\u07ec\u07e3\u07ea\u07a2\u07c2\u07ef\u07e7\u07e8\u07ee\u07f9\u07b6\u07a4\u07d7", "\u04d2\u04dd\u04de\u04df\u04d4\u048d\u048f\u0499\u0498\u04fd\u04db\u04d0\u04c7\u04d0\u049e\u04dd\u04d0\u04df\u04d6\u049e\u04fe\u04d3\u04db\u04d4\u04d2\u04c5\u048a", "\u0634\u062f\u0613\u0634\u0632\u0629\u062e\u0627\u067c\u067e\u0668\u0669\u060c\u062a\u0621\u0636\u0621\u066f\u062c\u0621\u062e\u0627\u066f\u0613\u0634\u0632\u0629\u062e\u0627\u067b", "\u04c2\u04c3\u04d8\u04c5\u04ca\u04d5\u0490\u0492\u0484\u0485\u04fa", "\u073c\u073d\u0726\u073b\u0734\u072b\u0713\u073e\u073e\u076e\u076c\u077a\u077b\u0704", "\u054f\u0559\u0551\u054c\u0504\u0506\u0510\u0511\u056e", "\u02b3\u02a5\u02ad\u02b0\u02f8\u02fa\u02ec\u028e\u02ed\u0292", "\u037c\u036a\u0362\u037f\u033b\u0337\u0335\u0323\u0341\u0322\u035d", "oyql$&0RQ1N", "\u053e\u0531\u0536\u0539\u0534\u0531\u0522\u053d\u0564\u0566\u0570\u0571\u050e"})
public final class Class1474 {
    public static double field5583;
    public static float field5584;
    public static int field5585 = -586646048;
    public static double field5586;
    public static float field5587 = 0.06406093f;

    private static String I27kQoYWwwUCyPdJ(String a2, int b2) {
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
    private static CallSite FXTxHSwnIARXat(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1474.I27kQoYWwwUCyPdJ(k2, -1768012903));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 47943 : 47944;
        block6: while (true) {
            switch (n3) {
                case 47944: {
                    n3 = 47942;
                    continue block6;
                }
                case 47943: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1474.I27kQoYWwwUCyPdJ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1474.I27kQoYWwwUCyPdJ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1474.I27kQoYWwwUCyPdJ(k2, -1768012903) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        b\u200e = "Cancels the PickFromInventoryC2SPacket packet";
        field5584 = Float.intBitsToFloat(1049105112);
        ae\u200e = "Debug";
        aV\u200e = "The render color for furnaces";
        field5583 = Double.longBitsToDouble(4591512111197064472L);
        bA\u200e = "Monsters";
        cf\u200e = "Mode for world brightness";
        field5586 = Double.longBitsToDouble(4598470301144443656L);
    }
}

