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
@HACHIMI_CLIENT(mv=100, d1={"\u45cf\u45cb\u45cb\u45cb\u45cd\u45c2\u45c8\u45ca", "\u5c60\u5c66\u5c65\u5c6e\u5c6e\u5c6f\u5c63", "\u294e\u294a\u294d\u2949\u294a\u294d\u2948\u294f", "\ue755\ue755\ue756\ue759\ue757\ue754\ue755\ue751", "\uae5a\uae58\uae59\uae5c\uae59\uae5d\uae58\uae5b", "\ua127\ua120\ua126\ua120\ua127\ua12c\ua123\ua127", "\uc786\uc785\uc781\uc78d\uc781\uc782\uc780\uc787", "\u3913\u3910\u3917\u3917\u3911\u3915\u3914\u3912", "\u74c9\u74c8\u74c8\u74c4\u74cc\u74cd\u74c8\u74c9", "\uc470\uc474\uc474\uc475\uc476\uc47d\uc47d\uc475", "\u9dfb\u9dfb\u9dfd\u9dfb\u9df9\u9dff\u9dfc\u9dfc", "\u5a00\u5a00\u5a03\u5a00\u5a08\u5a09\u5a01\u5a04", "\u1705\u1706\u1701\u1705\u1701\u1705\u1703\u1702", "\u9c1c\u9c11\u9c10\u9c10\u9c11\u9c19\u9c10\u9c1d", "\uda1d\uda1e\uda16\uda16\uda16\uda1f\uda18", "\u2142\u2143\u2140\u2141\u2148\u2146\u2149\u2145", "\ue4ea\ue4ea\ue4e9\ue4e6\ue4eb\ue4e6\ue4e7\ue4e9"}, d2={"\u0286\u02a1\u02a0\u22e0\u02d2\u02d0\u02c6\u02a2\u0284\u028f\u0298\u028f\u02c1\u0282\u028f\u0280\u0289\u02c1\u02bd\u029a\u029c\u0287\u0280\u0289\u02d5\u02c7\u02a2\u0284\u028f\u0298\u028f\u02c1\u0282\u028f\u0280\u0289\u02c1\u02bd\u029a\u029c\u0287\u0280\u0289\u02d5", "_xx\u2039\u000b\t\u001f{]VAV\u0018[VYP\u0018dCE^YP\f\u001e{]VAV\u0018[VYP\u0018dCE^YP\f", "\u01b0\u0197\u0188\u21d6\u01e4\u01e6\u01f0\u0194\u01b2\u01b9\u01ae\u01b9\u01f7\u01b4\u01b9\u01b6\u01bf\u01f7\u018b\u01ac\u01aa\u01b1\u01b6\u01bf\u01e3\u01f1\u0194\u01b2\u01b9\u01ae\u01b9\u01f7\u01b4\u01b9\u01b6\u01bf\u01f7\u018b\u01ac\u01aa\u01b1\u01b6\u01bf\u01e3", "\u0322\u037d\u0372\u0377\u0370\u0377\u036a\u0320\u0322\u0320\u0336\u0337\u0348", "\u05b8\u05ed\u05ea\u05ed\u05f0\u05ba\u05b8\u05ba\u05ac\u05ad\u05d2", "\u0692\u0690\u0681\u06b6\u0699\u0694\u0686\u0686\u06c9\u06cb\u06dd\u06dc\u06b9\u069f\u0694\u0683\u0694\u06da\u0699\u0694\u069b\u0692\u06da\u06b6\u0699\u0694\u0686\u0686\u06ce", "\u063d\u0634\u0626\u063d\u0616\u063a\u0631\u0630\u0669\u066b\u067d\u067c\u061c", "\u05f5\u05e1\u05e5\u05f1\u05fc\u05e3\u05ac\u05ae\u05b8\u05dc\u05fa\u05f1\u05e6\u05f1\u05bf\u05fc\u05f1\u05fe\u05f7\u05bf\u05df\u05f2\u05fa\u05f5\u05f3\u05e4\u05ab\u05b9\u05ca", "\u06b3\u06bc\u06bf\u06be\u06b5\u06ec\u06ee\u06f8\u06f9\u069c\u06ba\u06b1\u06a6\u06b1\u06ff\u06bc\u06b1\u06be\u06b7\u06ff\u069f\u06b2\u06ba\u06b5\u06b3\u06a4\u06eb", "\u042d\u0436\u040a\u042d\u042b\u0430\u0437\u043e\u0465\u0467\u0471\u0470\u0415\u0433\u0438\u042f\u0438\u0476\u0435\u0438\u0437\u043e\u0476\u040a\u042d\u042b\u0430\u0437\u043e\u0462", "\u0517\u0516\u050d\u0510\u051f\u0500\u0545\u0547\u0551\u0550\u052f", "\u034a\u034b\u0350\u034d\u0342\u035d\u0365\u0348\u0348\u0318\u031a\u030c\u030d\u0372", "\u0237\u0221\u0229\u0234\u027c\u027e\u0268\u0269\u0216", "\u0286\u0290\u0298\u0285\u02cd\u02cf\u02d9\u02bb\u02d8\u02a7", "\u05af\u05b9\u05b1\u05ac\u05e8\u05e4\u05e6\u05f0\u0592\u05f1\u058e", "\u0305\u0313\u031b\u0306\u034e\u034c\u035a\u0338\u033b\u035b\u0324", "\u03d8\u03d7\u03d0\u03df\u03d2\u03d7\u03c4\u03db\u0382\u0380\u0396\u0397\u03e8"})
public final class Class3501 {
    public static double field7707;
    public static float field7708;
    public static double field7709;
    public static String field7710;

    /*
     * WARNING - void declaration
     */
    private static CallSite HaFttc8pMOleQv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3501.74OidctMmTyElO12(k2, -1333476400));
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
                int a2 = Integer.parseInt(Class3501.74OidctMmTyElO12(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3501.74OidctMmTyElO12(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3501.74OidctMmTyElO12(k2, -1333476400) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 74OidctMmTyElO12(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field7708 = Float.intBitsToFloat(1056821578);
        field7707 = Double.longBitsToDouble(4600031272453915316L);
        bj\u200e = "The rendering y level";
        br\u200e = "Displays all client modules";
        field7710 = "textures/unhappy.png";
        field7709 = Double.longBitsToDouble(-4620152785726844436L);
    }
}

