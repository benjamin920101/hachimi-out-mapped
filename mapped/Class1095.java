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
@HACHIMI_CLIENT(mv=100, d1={"\ue87f\ue87f\ue87e\ue87f\ue87e\ue87b\ue87d\ue87b", "\ud2d6\ud2d9\ud2db\ud2dd\ud2d9\ud2d8\ud2d9", "\u78ff\u78ff\u78f8\u78f3\u78f3\u78f2\u78fb\u78f2", "\u3ce7\u3ce3\u3ce0\u3cea\u3ce6\u3ce1\u3ce2\u3ce4", "\ub989\ub986\ub987\ub98b\ub987\ub98c\ub98a\ub98a", "\ua5fc\ua5f3\ua5fa\ua5fa\ua5f3\ua5fe\ua5fe\ua5f2", "\u3e89\u3e89\u3e87\u3e89\u3e8b\u3e8b\u3e88", "\u3348\u334b\u3349\u3348\u334a\u334f\u334f\u334e", "\u3215\u3217\u3215\u3210\u3211\u3212\u321b\u3213", "\u64e5\u64e7\u64e5\u64e5\u64e7\u64e8\u64e7\u64e0", "\u9448\u9448\u9446\u9448\u944e\u9447\u9448\u9446", "\u75f2\u75f3\u75f1\u75f2\u75f3\u75f3\u75fc\u75f2", "\u717d\u717d\u7172\u717c\u717a\u717b\u717c\u717a", "\u3808\u3809\u380c\u380f\u3805\u3808\u3804\u3804", "\ub942\ub944\ub944\ub946\ub945\ub947\ub943\ub941", "\u486a\u486f\u4869\u4869\u486e\u4861\u486d\u486d", "\u1f8a\u1f89\u1f8f\u1f8a\u1f8e\u1f8d\u1f89\u1f8b"}, d2={"\u0293\u02b0\u0299\u22ee\u02dc\u02de\u02c8\u02ac\u028a\u0281\u0296\u0281\u02cf\u028c\u0281\u028e\u0287\u02cf\u02b3\u0294\u0292\u0289\u028e\u0287\u02db\u02c9\u02ac\u028a\u0281\u0296\u0281\u02cf\u028c\u0281\u028e\u0287\u02cf\u02b3\u0294\u0292\u0289\u028e\u0287\u02db", "\u0413\u0430\u041a\u246e\u045c\u045e\u0448\u042c\u040a\u0401\u0416\u0401\u044f\u040c\u0401\u040e\u0407\u044f\u0433\u0414\u0412\u0409\u040e\u0407\u045b\u0449\u042c\u040a\u0401\u0416\u0401\u044f\u040c\u0401\u040e\u0407\u044f\u0433\u0414\u0412\u0409\u040e\u0407\u045b", "\u0268\u024b\u025a\u2215\u0227\u0225\u0233\u0257\u0271\u027a\u026d\u027a\u0234\u0277\u027a\u0275\u027c\u0234\u0248\u026f\u0269\u0272\u0275\u027c\u0220\u0232\u0257\u0271\u027a\u026d\u027a\u0234\u0277\u027a\u0275\u027c\u0234\u0248\u026f\u0269\u0272\u0275\u027c\u0220", "4kdafa|646 !^", "\u040c\u0459\u045e\u0459\u0444\u040e\u040c\u040e\u0418\u0419\u0466", "\u01ba\u01b8\u01a9\u019e\u01b1\u01bc\u01ae\u01ae\u01e1\u01e3\u01f5\u01f4\u0191\u01b7\u01bc\u01ab\u01bc\u01f2\u01b1\u01bc\u01b3\u01ba\u01f2\u019e\u01b1\u01bc\u01ae\u01ae\u01e6", "\u04eb\u04e2\u04f0\u04eb\u04c0\u04ec\u04e7\u04e6\u04bf\u04bd\u04ab\u04aa\u04ca", "\u0476\u0462\u0466\u0472\u047f\u0460\u042f\u042d\u043b\u045f\u0479\u0472\u0465\u0472\u043c\u047f\u0472\u047d\u0474\u043c\u045c\u0471\u0479\u0476\u0470\u0467\u0428\u043a\u0449", "\u0001\u000e\r\f\u0007^\\JK.\b\u0003\u0014\u0003M\u000e\u0003\f\u0005M-\u0000\b\u0007\u0001\u0016Y", "\u076f\u0774\u0748\u076f\u0769\u0772\u0775\u077c\u0727\u0725\u0733\u0732\u0757\u0771\u077a\u076d\u077a\u0734\u0777\u077a\u0775\u077c\u0734\u0748\u076f\u0769\u0772\u0775\u077c\u0720", "\u05b3\u05b2\u05a9\u05b4\u05bb\u05a4\u05e1\u05e3\u05f5\u05f4\u058b", "\u0157\u0156\u014d\u0150\u015f\u0140\u0178\u0155\u0155\u0105\u0107\u0111\u0110\u016f", " 6>#ki\u007f~\u0001", "\u04eb\u04fd\u04f5\u04e8\u04a0\u04a2\u04b4\u04d6\u04b5\u04ca", "\u027f\u0269\u0261\u027c\u0238\u0234\u0236\u0220\u0242\u0221\u025e", "\u03e8\u03fe\u03f6\u03eb\u03a3\u03a1\u03b7\u03d5\u03d6\u03b6\u03c9", "\u02c9\u02c6\u02c1\u02ce\u02c3\u02c6\u02d5\u02ca\u0293\u0291\u0287\u0286\u02f9"})
public final class Class1095 {
    public static String field4439;
    public static double field4440;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite 396bQj9QsJd8IJ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1095.70wHaWA4Rw2Iv5t1(k2, -626073032));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() >= 100 ? 34308 : 34307;
        while (true) {
            int n4;
            if ((n4 = n3) == 34307) {
                throw new Exception("Outdated metadata version");
            }
            if (n4 != 34308) break;
            n3 = 34306;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1095.70wHaWA4Rw2Iv5t1(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1095.70wHaWA4Rw2Iv5t1(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1095.70wHaWA4Rw2Iv5t1(k2, -626073032) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 70wHaWA4Rw2Iv5t1(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 42553 : 42552;
            block5: while (true) {
                switch (n2) {
                    case 42553: {
                        n2 = 42551;
                        continue block5;
                    }
                    case 42552: {
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
        field4440 = Double.longBitsToDouble(0x4034000000000000L);
        y\u200e = "QUART_IN_OUT";
        aC\u200e = "Automatically renames items in anvils.";
        field4439 = "Starting postInit ...";
    }
}

