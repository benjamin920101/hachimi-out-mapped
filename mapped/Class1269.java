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

@HACHIMI_CLIENT(mv=100, d1={"\ub36f\ub364\ub367\ub361\ub360\ub36e\ub36e", "\u49bd\u49b8\u49be\u49bf\u49b1\u49bb\u49b1\u49bb", "\ucbcb\ucbcc\ucbcc\ucbcc\ucbc2\ucbcc\ucbc8\ucbcb", "\ud419\ud415\ud415\ud41e\ud41c\ud418\ud41d\ud41d", "\u3f0d\u3f01\u3f0a\u3f08\u3f0f\u3f00\u3f08\u3f0b", "\u605f\u6052\u6055\u6052\u6050\u605e\u6052", "\ud206\ud205\ud20b\ud201\ud205\ud204\ud201\ud20a", "\u1d0a\u1d09\u1d0b\u1d0d\u1d0d\u1d07\u1d09\u1d0c", "\ud814\ud810\ud818\ud813\ud818\ud815\ud816\ud817", "\u5abc\u5abb\u5abd\u5ab7\u5aba\u5aba\u5ab8\u5aba", "\ucfcc\ucfc9\ucfcf\ucfce\ucfcf\ucfcf\ucfc0\ucfc8", "\u7281\u7280\u7280\u7282\u7285\u7282\u7286\u7283", "\ue487\ue484\ue48f\ue484\ue484\ue48e\ue480\ue484", "\ua25d\ua259\ua25f\ua251\ua25e\ua25e\ua258\ua251"}, d2={"\u0581\u05de\u05d1\u05d4\u05d3\u05d4\u05c9\u0583\u0581\u0583\u0595\u0594\u05eb", "\t\\[\\A\u000b\t\u000b\u001d\u001cc", "\u0783\u0781\u0790\u07a7\u0788\u0785\u0797\u0797\u07d8\u07da\u07cc\u07cd\u07a8\u078e\u0785\u0792\u0785\u07cb\u0788\u0785\u078a\u0783\u07cb\u07a7\u0788\u0785\u0797\u0797\u07df", "\u001f\u0016\u0004\u001f4\u0018\u0013\u0012KI_^>", "\u0458\u044c\u0448\u045c\u0451\u044e\u0401\u0403\u0415\u0471\u0457\u045c\u044b\u045c\u0412\u0451\u045c\u0453\u045a\u0412\u0472\u045f\u0457\u0458\u045e\u0449\u0406\u0414\u0467", "\u03d2\u03dd\u03de\u03df\u03d4\u038d\u038f\u0399\u0398\u03fd\u03db\u03d0\u03c7\u03d0\u039e\u03dd\u03d0\u03df\u03d6\u039e\u03fe\u03d3\u03db\u03d4\u03d2\u03c5\u038a", "\t\u0012.\t\u000f\u0014\u0013\u001aACUT1\u0017\u001c\u000b\u001cR\u0011\u001c\u0013\u001aR.\t\u000f\u0014\u0013\u001aF", "\u00ed\u00ec\u00f7\u00ea\u00e5\u00fa\u00bf\u00bd\u00ab\u00aa\u00d5", "\u0209\u0208\u0213\u020e\u0201\u021e\u0226\u020b\u020b\u025b\u0259\u024f\u024e\u0231", "\u07fe\u07e8\u07e0\u07fd\u07b5\u07b7\u07a1\u07a0\u07df", "\u06b4\u06a2\u06aa\u06b7\u06ff\u06fd\u06eb\u0689\u06ea\u0695", "\u02ca\u02dc\u02d4\u02c9\u028d\u0281\u0283\u0295\u02f7\u0294\u02eb", "\u0197\u0181\u0189\u0194\u01dc\u01de\u01c8\u01aa\u01a9\u01c9\u01b6", "\u0213\u021c\u021b\u0214\u0219\u021c\u020f\u0210\u0249\u024b\u025d\u025c\u0223"})
public final class Class1269 {
    public static double field4961;
    public static float field4962;
    public static double field4963;

    static {
        field4962 = Float.intBitsToFloat(1041718720);
        field4963 = Double.longBitsToDouble(4604550892990760142L);
        field4961 = Double.longBitsToDouble(0x4000000000000000L);
    }

    private static String Dsg1tZftdenMFUj1(String a2, int b2) {
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
    private static CallSite FDwAnh8yniYFeG(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1269.Dsg1tZftdenMFUj1(k2, 381870595));
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
                int a2 = Integer.parseInt(Class1269.Dsg1tZftdenMFUj1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1269.Dsg1tZftdenMFUj1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 56495 : 56496;
        block7: while (true) {
            switch (n3) {
                case 56496: {
                    n3 = 56494;
                    continue block7;
                }
                case 56495: {
                    throw new Exception("Can't find method in " + Class1269.Dsg1tZftdenMFUj1(k2, 381870595) + " " + l2 + " " + m2);
                }
            }
            break;
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

