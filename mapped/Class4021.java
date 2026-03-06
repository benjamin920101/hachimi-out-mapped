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
@HACHIMI_CLIENT(mv=100, d1={"\u7e69\u7e61\u7e67\u7e64\u7e66\u7e69", "\u02da\u02db\u02d9\u02d8\u02d0\u02d0\u02de\u02d8", "\u86e4\u86e2\u86e0\u86e7\u86ee\u86e6\u86e1\u86e5", "\ud62d\ud62c\ud62a\ud62c\ud62e\ud62e\ud62e\ud62b", "\u815a\u8156\u815a\u815b\u815c\u8157\u8159\u815b", "\u09ec\u09eb\u09ef\u09ed\u09ef\u09ed\u09ef\u09e4", "\u415d\u4152\u415a\u415b\u4159\u4153\u415d\u415c", "\u479f\u4799\u479c\u479e\u4795\u4794\u479e\u4799", "\ub4c6\ub4c0\ub4c6\ub4ce\ub4cf\ub4c0\ub4c3\ub4c4", "\ud028\ud028\ud027\ud027\ud02b\ud02d\ud02a\ud028", "\u355a\u355d\u355f\u355e\u355c\u3551\u355d\u355e", "\u8ab9\u8abc\u8ab3\u8abf\u8ab3\u8abe\u8ab3\u8abd", "\u193b\u193c\u193a\u193b\u193f\u1938\u1939", "\ue6d5\ue6d2\ue6dd\ue6d3\ue6d7\ue6d6\ue6dd\ue6d2", "\ud4f2\ud4f1\ud4f7\ud4f6\ud4f2\ud4f3\ud4f6\ud4f6"}, d2={"QnY\u2036\u0004\u0006\u0010tRYNY\u0017TYV_\u0017kLJQV_\u0003\u0011tRYNY\u0017TYV_\u0017kLJQV_\u0003", "\u0150\u010f\u0100\u0105\u0102\u0105\u0118\u0152\u0150\u0152\u0144\u0145\u013a", "\u0460\u0435\u0432\u0435\u0428\u0462\u0460\u0462\u0474\u0475\u040a", "\u032d\u032f\u033e\u0309\u0326\u032b\u0339\u0339\u0376\u0374\u0362\u0363\u0306\u0320\u032b\u033c\u032b\u0365\u0326\u032b\u0324\u032d\u0365\u0309\u0326\u032b\u0339\u0339\u0371", "HASHcODE\u001c\u001e\b\ti", "\u0673\u0667\u0663\u0677\u067a\u0665\u062a\u0628\u063e\u065a\u067c\u0677\u0660\u0677\u0639\u067a\u0677\u0678\u0671\u0639\u0659\u0674\u067c\u0673\u0675\u0662\u062d\u063f\u064c", "\u06fe\u06f1\u06f2\u06f3\u06f8\u06a1\u06a3\u06b5\u06b4\u06d1\u06f7\u06fc\u06eb\u06fc\u06b2\u06f1\u06fc\u06f3\u06fa\u06b2\u06d2\u06ff\u06f7\u06f8\u06fe\u06e9\u06a6", "@[g@F]ZS\b\n\u001c\u001dx^UBU\u001bXUZS\u001bg@F]ZS\u000f", "\u0742\u0743\u0758\u0745\u074a\u0755\u0710\u0712\u0704\u0705\u077a", "\u015a\u015b\u0140\u015d\u0152\u014d\u0175\u0158\u0158\u0108\u010a\u011c\u011d\u0162", "\u055c\u054a\u0542\u055f\u0517\u0515\u0503\u0502\u057d", "\u02cd\u02db\u02d3\u02ce\u0286\u0284\u0292\u02f0\u0293\u02ec", "\u01d8\u01ce\u01c6\u01db\u019f\u0193\u0191\u0187\u01e5\u0186\u01f9", "\u012c\u013a\u0132\u012f\u0167\u0165\u0173\u0111\u0112\u0172\u010d", ":52=05&9`btu\n"})
public final class Class4021 {
    public static float field9255;
    public static float field9256;
    public static float field9257;
    public static float field9258 = 0.5941004f;
    public static double field9259;
    public static long field9260 = 3837873305559319068L;

    /*
     * Unable to fully structure code
     */
    private static String bXCjIwYNLTlFVVPS(String a, int b) {
        c = new StringBuilder();
        d = 0;
        while (true) {
            block2: {
                block3: {
                    if (d >= a.length()) break block3;
                    v0 = 30036;
                    ** GOTO lbl12
                }
                v0 = 30037;
                if (true) ** GOTO lbl12
                do {
                    v0 = var4_4 = 30035;
lbl12:
                    // 3 sources

                    if (var4_4 == 30036) break block2;
                } while (var4_4 == 30037);
                break;
            }
            c.append((char)(a.charAt(d) ^ b));
            ++d;
        }
        return c.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 8wVa7SDBQVLnxN(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4021.bXCjIwYNLTlFVVPS(k2, 766395804));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 53002 : 53001;
        while (true) {
            int n4;
            if ((n4 = n3) == 53001) {
                throw new Exception("Outdated metadata version");
            }
            if (n4 != 53002) break;
            n3 = 53000;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4021.bXCjIwYNLTlFVVPS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4021.bXCjIwYNLTlFVVPS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) throw new Exception("Can't find method in " + Class4021.bXCjIwYNLTlFVVPS(k2, 766395804) + " " + l2 + " " + m2);
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n5 = n2 == 1 ? 41268 : 41269;
        block8: while (true) {
            switch (n5) {
                case 41269: {
                    n5 = 41267;
                    continue block8;
                }
                case 41268: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field9257 = Float.intBitsToFloat(1049043348);
        af\u200e = "Safety";
        field9259 = Double.longBitsToDouble(-4625723777011608064L);
        field9255 = Float.intBitsToFloat(1063460147);
        field9256 = Float.intBitsToFloat(1054426248);
    }
}

