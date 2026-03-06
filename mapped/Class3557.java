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

@HACHIMI_CLIENT(mv=100, d1={"\ua4b0\ua4b7\ua4b0\ua4b7\ua4b5\ua4ba\ua4b7\ua4b4", "\ucaf5\ucaf2\ucaf1\ucaf0\ucafd\ucaf5\ucafd\ucaf3", "\u740c\u740b\u740b\u7409\u7408\u740f\u7401\u740c", "\u35e5\u35e2\u35e7\u35e7\u35e8\u35e1\u35e4\u35e9", "\ue0ce\ue0ca\ue0cc\ue0c9\ue0cb\ue0cf\ue0cf\ue0c9", "\uaf15\uaf16\uaf18\uaf13\uaf19\uaf17\uaf17\uaf10", "\udf21\udf21\udf2b\udf25\udf24\udf27\udf20\udf2b", "\u568a\u568f\u5686\u5687\u568e\u5689\u5689\u5689", "\u0ebe\u0ebb\u0ebb\u0eb9\u0ebb\u0ebe\u0eb4\u0eba", "\ua0d6\ua0d4\ua0d2\ua0d4\ua0d3\ua0d6\ua0d3\ua0d0", "\u7736\u7732\u7735\u7736\u7730\u7732\u7737\u7731", "\u2a9b\u2a9f\u2a9c\u2a9c\u2a97\u2a97\u2a9a\u2a98", "\ubc11\ubc10\ubc11\ubc16\ubc15\ubc10\ubc1c\ubc1c", "\u94be\u94bf\u94bc\u94bc\u94bb\u94b2\u94ba\u94bb", "\u9e1b\u9e15\u9e15\u9e15\u9e15\u9e1e\u9e15\u9e18", "\u224c\u2244\u224d\u224b\u224a\u224d\u224b\u2244", "\u5e90\u5e90\u5e92\u5e9d\u5e95\u5e9d\u5e93\u5e9c"}, d2={"3/?\u2056dfp\u001429.9w496?w\u000b,*16?cq\u001429.9w496?w\u000b,*16?c", "\u06c0\u06dc\u06c3\u26a5\u0697\u0695\u0683\u06e7\u06c1\u06ca\u06dd\u06ca\u0684\u06c7\u06ca\u06c5\u06cc\u0684\u06f8\u06df\u06d9\u06c2\u06c5\u06cc\u0690\u0682\u06e7\u06c1\u06ca\u06dd\u06ca\u0684\u06c7\u06ca\u06c5\u06cc\u0684\u06f8\u06df\u06d9\u06c2\u06c5\u06cc\u0690", "\u0082\u009e\u0080\u20e7\u00d5\u00d7\u00c1\u00a5\u0083\u0088\u009f\u0088\u00c6\u0085\u0088\u0087\u008e\u00c6\u00ba\u009d\u009b\u0080\u0087\u008e\u00d2\u00c0\u00a5\u0083\u0088\u009f\u0088\u00c6\u0085\u0088\u0087\u008e\u00c6\u00ba\u009d\u009b\u0080\u0087\u008e\u00d2", "\u053e\u0561\u056e\u056b\u056c\u056b\u0576\u053c\u053e\u053c\u052a\u052b\u0554", "\u02e5\u02b0\u02b7\u02b0\u02ad\u02e7\u02e5\u02e7\u02f1\u02f0\u028f", "RPAvYTFF\t\u000b\u001d\u001cy_TCT\u001aYT[R\u001avYTFF\u000e", "\u0272\u027b\u0269\u0272\u0259\u0275\u027e\u027f\u0226\u0224\u0232\u0233\u0253", "\u0564\u0570\u0574\u0560\u056d\u0572\u053d\u053f\u0529\u054d\u056b\u0560\u0577\u0560\u052e\u056d\u0560\u056f\u0566\u052e\u054e\u0563\u056b\u0564\u0562\u0575\u053a\u0528\u055b", "\u012e\u0121\u0122\u0123\u0128\u0171\u0173\u0165\u0164\u0101\u0127\u012c\u013b\u012c\u0162\u0121\u012c\u0123\u012a\u0162\u0102\u012f\u0127\u0128\u012e\u0139\u0176", "\u0328\u0333\u030f\u0328\u032e\u0335\u0332\u033b\u0360\u0362\u0374\u0375\u0310\u0336\u033d\u032a\u033d\u0373\u0330\u033d\u0332\u033b\u0373\u030f\u0328\u032e\u0335\u0332\u033b\u0367", "\u02b0\u02b1\u02aa\u02b7\u02b8\u02a7\u02e2\u02e0\u02f6\u02f7\u0288", "\u0327\u0326\u033d\u0320\u032f\u0330\u0308\u0325\u0325\u0375\u0377\u0361\u0360\u031f", "\u058b\u059d\u0595\u0588\u05c0\u05c2\u05d4\u05d5\u05aa", "\u0532\u0524\u052c\u0531\u0579\u057b\u056d\u050f\u056c\u0513", "\u050b\u051d\u0515\u0508\u054c\u0540\u0542\u0554\u0536\u0555\u052a", "UCKV\u001e\u001c\nhk\u000bt", "\u061b\u0614\u0613\u061c\u0611\u0614\u0607\u0618\u0641\u0643\u0655\u0654\u062b"})
public final class Class3557 {
    public static double field7892;
    public static double field7893;

    static {
        f\u200e = "AVERAGE";
        field7893 = Double.longBitsToDouble(4601714827863704396L);
        W\u200e = "OUT_OF_BOUNDS";
        aX\u200e = "The obstacles to destroy";
        field7892 = Double.longBitsToDouble(4603155480812694495L);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite aekv9oR225Nb1P(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3557.gqIwoJy9cnPPyGxq(k2, -1873601094));
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
                int a2 = Integer.parseInt(Class3557.gqIwoJy9cnPPyGxq(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3557.gqIwoJy9cnPPyGxq(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3557.gqIwoJy9cnPPyGxq(k2, -1873601094) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String gqIwoJy9cnPPyGxq(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

