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

@HACHIMI_CLIENT(mv=100, d1={"\ube2c\ube23\ube2f\ube2f\ube2b\ube2c\ube22\ube2f", "\u2d84\u2d86\u2d85\u2d84\u2d86\u2d80\u2d85\u2d8f", "\u3e0e\u3e0d\u3e0d\u3e04\u3e0f\u3e0f\u3e0c\u3e05", "\u342d\u342f\u3421\u342b\u342c\u3428\u342a\u3420", "\u02a4\u02a4\u02af\u02af\u02af\u02a2\u02ae\u02a1", "\u22ad\u22a8\u22ad\u22a9\u22a9\u22a0\u22ae\u22ab", "\uc711\uc712\uc714\uc712\uc711\uc711\uc716", "\u2caa\u2cae\u2cae\u2ca8\u2ca9\u2ca0\u2ca0\u2ca1", "\uc89e\uc899\uc893\uc89c\uc893\uc89f\uc898\uc89b", "\u9bf7\u9bf2\u9bfd\u9bf4\u9bf5\u9bf0", "\u029b\u029d\u029b\u0295\u0294\u029f\u029b\u0295", "\u1aaf\u1aad\u1aaa\u1aa5\u1aad\u1aad\u1aaf\u1aaa", "\uaa58\uaa50\uaa5f\uaa5a\uaa5e\uaa51\uaa5e\uaa51", "\u949a\u949c\u9492\u949d\u949f\u949c\u949a\u949d", "\u4d78\u4d7c\u4d72\u4d7e\u4d7c\u4d7e\u4d72\u4d7d", "\u41e8\u41e2\u41e3\u41ed\u41eb\u41ef\u41e2\u41e9", "\u053b\u053e\u0538\u0539\u053f\u053e\u053b\u0539"}, d2={"\u04b7\u04bc\u04b9\u24d1\u04e3\u04e1\u04f7\u0493\u04b5\u04be\u04a9\u04be\u04f0\u04b3\u04be\u04b1\u04b8\u04f0\u048c\u04ab\u04ad\u04b6\u04b1\u04b8\u04e4\u04f6\u0493\u04b5\u04be\u04a9\u04be\u04f0\u04b3\u04be\u04b1\u04b8\u04f0\u048c\u04ab\u04ad\u04b6\u04b1\u04b8\u04e4", "\u0548\u0543\u0547\u252e\u051c\u051e\u0508\u056c\u054a\u0541\u0556\u0541\u050f\u054c\u0541\u054e\u0547\u050f\u0573\u0554\u0552\u0549\u054e\u0547\u051b\u0509\u056c\u054a\u0541\u0556\u0541\u050f\u054c\u0541\u054e\u0547\u050f\u0573\u0554\u0552\u0549\u054e\u0547\u051b", "\u0153\u0158\u0153\u2135\u0107\u0105\u0113\u0177\u0151\u015a\u014d\u015a\u0114\u0157\u015a\u0155\u015c\u0114\u0168\u014f\u0149\u0152\u0155\u015c\u0100\u0112\u0177\u0151\u015a\u014d\u015a\u0114\u0157\u015a\u0155\u015c\u0114\u0168\u014f\u0149\u0152\u0155\u015c\u0100", "\u0705\u075a\u0755\u0750\u0757\u0750\u074d\u0707\u0705\u0707\u0711\u0710\u076f", "\u0536\u0563\u0564\u0563\u057e\u0534\u0536\u0534\u0522\u0523\u055c", "\u04aa\u04a8\u04b9\u048e\u04a1\u04ac\u04be\u04be\u04f1\u04f3\u04e5\u04e4\u0481\u04a7\u04ac\u04bb\u04ac\u04e2\u04a1\u04ac\u04a3\u04aa\u04e2\u048e\u04a1\u04ac\u04be\u04be\u04f6", "\u021a\u0213\u0201\u021a\u0231\u021d\u0216\u0217\u024e\u024c\u025a\u025b\u023b", "\u073b\u072f\u072b\u073f\u0732\u072d\u0762\u0760\u0776\u0712\u0734\u073f\u0728\u073f\u0771\u0732\u073f\u0730\u0739\u0771\u0711\u073c\u0734\u073b\u073d\u072a\u0765\u0777\u0704", "\u0641\u064e\u064d\u064c\u0647\u061e\u061c\u060a\u060b\u066e\u0648\u0643\u0654\u0643\u060d\u064e\u0643\u064c\u0645\u060d\u066d\u0640\u0648\u0647\u0641\u0656\u0619", "\u00ea\u00f1\u00cd\u00ea\u00ec\u00f7\u00f0\u00f9\u00a2\u00a0\u00b6\u00b7\u00d2\u00f4\u00ff\u00e8\u00ff\u00b1\u00f2\u00ff\u00f0\u00f9\u00b1\u00cd\u00ea\u00ec\u00f7\u00f0\u00f9\u00a5", "\u056c\u056d\u0576\u056b\u0564\u057b\u053e\u053c\u052a\u052b\u0554", "\u026b\u026a\u0271\u026c\u0263\u027c\u0244\u0269\u0269\u0239\u023b\u022d\u022c\u0253", "\u013e\u0128\u0120\u013d\u0175\u0177\u0161\u0160\u011f", "\u016f\u0179\u0171\u016c\u0124\u0126\u0130\u0152\u0131\u014e", "\u050b\u051d\u0515\u0508\u054c\u0540\u0542\u0554\u0536\u0555\u052a", "\u06bc\u06aa\u06a2\u06bf\u06f7\u06f5\u06e3\u0681\u0682\u06e2\u069d", "\u0667\u0668\u066f\u0660\u066d\u0668\u067b\u0664\u063d\u063f\u0629\u0628\u0657"})
public final class Class3893 {
    public static double field8859 = Double.longBitsToDouble(4594665674426680820L);
    public static float field8860 = 0.4642793f;
    public static double field8861;
    public static float field8862;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite JeKDMhmRLq02nY(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3893.NtLwQO8rQTOJcdPW(k2, -2015230585));
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
                int a2 = Integer.parseInt(Class3893.NtLwQO8rQTOJcdPW(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3893.NtLwQO8rQTOJcdPW(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3893.NtLwQO8rQTOJcdPW(k2, -2015230585) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 != 1 ? 34192 : 34191;
        block7: while (true) {
            switch (n3) {
                case 34192: {
                    n3 = 34190;
                    continue block7;
                }
                case 34191: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String NtLwQO8rQTOJcdPW(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field8862 = Float.intBitsToFloat(1063688599);
        bv\u200e = "SpawnerColor";
        field8861 = Double.longBitsToDouble(4594998817274528028L);
        bQ\u200e = "Priority";
        bV\u200e = "Loaded client config!";
    }
}

