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

@HACHIMI_CLIENT(mv=100, d1={"\ub9d8\ub9dd\ub9d8\ub9dd\ub9de\ub9d5\ub9d8", "\u664f\u664b\u6649\u6648\u664b\u664d\u6648\u664a", "\u9e0d\u9e01\u9e0c\u9e02\u9e00\u9e0c\u9e00", "\u6714\u6711\u671d\u6710\u6713\u6715\u671c\u671d", "\u72e9\u72e2\u72ec\u72ed\u72ee\u72ee", "\u97dd\u97dc\u97da\u97d1\u97dd\u97db\u97d9\u97dd", "\u4fef\u4fea\u4fed\u4fef\u4fea\u4fef\u4fec\u4fe8", "\u568e\u5680\u568b\u5681\u568b\u568e\u568b\u568e", "\ucc86\ucc86\ucc86\ucc81\ucc81\ucc82\ucc83\ucc8d", "\u8047\u8045\u8047\u8041\u8044\u8044\u804b\u8045", "\ud7b7\ud7b6\ud7b4\ud7bd\ud7b2\ud7bc\ud7b7\ud7bc", "\u4af8\u4afc\u4af8\u4af9\u4af4\u4aff\u4af9\u4afd", "\u410e\u4108\u410d\u4105\u410a\u4104\u4108\u410e", "\uac2a\uac2a\uac28\uac2e\uac22\uac23\uac23\uac22", "\u1831\u183a\u1831\u1837\u183b\u1835\u1830\u1837", "\u7a97\u7a9c\u7a97\u7a96\u7a92\u7a91\u7a90\u7a93", "\ucd34\ucd31\ucd30\ucd32\ucd33\ucd35\ucd36"}, d2={"\u04f9\u04c2\u04df\u2498\u04aa\u04a8\u04be\u04da\u04fc\u04f7\u04e0\u04f7\u04b9\u04fa\u04f7\u04f8\u04f1\u04b9\u04c5\u04e2\u04e4\u04ff\u04f8\u04f1\u04ad\u04bf\u04da\u04fc\u04f7\u04e0\u04f7\u04b9\u04fa\u04f7\u04f8\u04f1\u04b9\u04c5\u04e2\u04e4\u04ff\u04f8\u04f1\u04ad", "\u013e\u0105\u011b\u215f\u016d\u016f\u0179\u011d\u013b\u0130\u0127\u0130\u017e\u013d\u0130\u013f\u0136\u017e\u0102\u0125\u0123\u0138\u013f\u0136\u016a\u0178\u011d\u013b\u0130\u0127\u0130\u017e\u013d\u0130\u013f\u0136\u017e\u0102\u0125\u0123\u0138\u013f\u0136\u016a", "\u055a\u0561\u057e\u253b\u0509\u050b\u051d\u0579\u055f\u0554\u0543\u0554\u051a\u0559\u0554\u055b\u0552\u051a\u0566\u0541\u0547\u055c\u055b\u0552\u050e\u051c\u0579\u055f\u0554\u0543\u0554\u051a\u0559\u0554\u055b\u0552\u051a\u0566\u0541\u0547\u055c\u055b\u0552\u050e", "\u0153\u010c\u0103\u0106\u0101\u0106\u011b\u0151\u0153\u0151\u0147\u0146\u0139", "\u0250\u0205\u0202\u0205\u0218\u0252\u0250\u0252\u0244\u0245\u023a", "\u075a\u0758\u0749\u077e\u0751\u075c\u074e\u074e\u0701\u0703\u0715\u0714\u0771\u0757\u075c\u074b\u075c\u0712\u0751\u075c\u0753\u075a\u0712\u077e\u0751\u075c\u074e\u074e\u0706", "\u0639\u0630\u0622\u0639\u0612\u063e\u0635\u0634\u066d\u066f\u0679\u0678\u0618", "\u029f\u028b\u028f\u029b\u0296\u0289\u02c6\u02c4\u02d2\u02b6\u0290\u029b\u028c\u029b\u02d5\u0296\u029b\u0294\u029d\u02d5\u02b5\u0298\u0290\u029f\u0299\u028e\u02c1\u02d3\u02a0", "\u01b5\u01ba\u01b9\u01b8\u01b3\u01ea\u01e8\u01fe\u01ff\u019a\u01bc\u01b7\u01a0\u01b7\u01f9\u01ba\u01b7\u01b8\u01b1\u01f9\u0199\u01b4\u01bc\u01b3\u01b5\u01a2\u01ed", "\u0650\u064b\u0677\u0650\u0656\u064d\u064a\u0643\u0618\u061a\u060c\u060d\u0668\u064e\u0645\u0652\u0645\u060b\u0648\u0645\u064a\u0643\u060b\u0677\u0650\u0656\u064d\u064a\u0643\u061f", "SRIT[D\u0001\u0003\u0015\u0014k", "\u061a\u061b\u0600\u061d\u0612\u060d\u0635\u0618\u0618\u0648\u064a\u065c\u065d\u0622", "\u06c1\u06d7\u06df\u06c2\u068a\u0688\u069e\u069f\u06e0", "\u034d\u035b\u0353\u034e\u0306\u0304\u0312\u0370\u0313\u036c", "\u009e\u0088\u0080\u009d\u00d9\u00d5\u00d7\u00c1\u00a3\u00c0\u00bf", "\u063c\u062a\u0622\u063f\u0677\u0675\u0663\u0601\u0602\u0662\u061d", "\u06ac\u06a3\u06a4\u06ab\u06a6\u06a3\u06b0\u06af\u06f6\u06f4\u06e2\u06e3\u069c"})
public final class Class3268 {
    public static double field7011;
    public static int field7012 = 461025150;
    public static float field7013;
    public static double field7014;

    private static String oiXroaFAOQVbO4Wr(String a2, int b2) {
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
    private static CallSite Q7ONc3wN3T4XNd(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3268.oiXroaFAOQVbO4Wr(k2, 1394071779));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class3268.oiXroaFAOQVbO4Wr(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3268.oiXroaFAOQVbO4Wr(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 27344 : 27345;
        block7: while (true) {
            switch (n3) {
                case 27345: {
                    n3 = 27343;
                    continue block7;
                }
                case 27344: {
                    throw new Exception("Can't find method in " + Class3268.oiXroaFAOQVbO4Wr(k2, 1394071779) + " " + l2 + " " + m2);
                }
            }
            break;
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        I\u200e = "Push the enemy out of the burrow";
        field7014 = Double.longBitsToDouble(4605203115953377610L);
        aE\u200e = "ENTER";
        aK\u200e = "MultiActionsC";
        field7011 = Double.longBitsToDouble(4600285782976709732L);
        field7013 = Float.intBitsToFloat(1032831000);
    }
}

