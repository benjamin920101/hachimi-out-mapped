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

@HACHIMI_CLIENT(mv=100, d1={"\u70d5\u70d2\u70d0\u70df\u70d7\u70d6\u70d1\u70d0", "\u0127\u0128\u012a\u0126\u012b\u012c\u012e", "\ue189\ue18f\ue18f\ue18c\ue18e\ue189\ue186\ue18f", "\uaf3d\uaf3d\uaf3d\uaf3d\uaf39\uaf3f\uaf39\uaf39", "\u5936\u5932\u5931\u5936\u5930\u593a\u5935\u5937", "\ue67a\ue67f\ue67a\ue67c\ue67a\ue67e\ue67b\ue679", "\ue04f\ue04b\ue044\ue04a\ue04a\ue04f\ue04e\ue04e", "\u70b9\u70b3\u70bd\u70bf\u70b9\u70b9\u70b8\u70b3", "\u3b22\u3b24\u3b26\u3b22\u3b20\u3b27\u3b27", "\u8359\u8358\u835f\u8352\u8352\u835a\u835b\u835a", "\u2349\u2342\u2342\u234e\u234a\u2348\u234e\u234c", "\ub890\ub892\ub891\ub896\ub896\ub892\ub890\ub896", "\u95f1\u95f5\u95f0\u95f2\u95f3\u95fb\u95f2\u95f4", "\u1b95\u1b95\u1b95\u1b90\u1b90\u1b96\u1b97\u1b91", "\u479d\u4791\u4790\u4798\u479d\u479f\u479d\u479b", "\u6cba\u6cbf\u6cbe\u6cbb\u6cbb\u6cbf\u6cbe\u6cbe"}, d2={"\u0760\u076f\u0773\u270f\u073d\u073f\u0729\u074d\u076b\u0760\u0777\u0760\u072e\u076d\u0760\u076f\u0766\u072e\u0752\u0775\u0773\u0768\u076f\u0766\u073a\u0728\u074d\u076b\u0760\u0777\u0760\u072e\u076d\u0760\u076f\u0766\u072e\u0752\u0775\u0773\u0768\u076f\u0766\u073a", "\u0142\u014d\u0150\u212d\u011f\u011d\u010b\u016f\u0149\u0142\u0155\u0142\u010c\u014f\u0142\u014d\u0144\u010c\u0170\u0157\u0151\u014a\u014d\u0144\u0118\u010a\u016f\u0149\u0142\u0155\u0142\u010c\u014f\u0142\u014d\u0144\u010c\u0170\u0157\u0151\u014a\u014d\u0144\u0118", "\u0380\u03df\u03d0\u03d5\u03d2\u03d5\u03c8\u0382\u0380\u0382\u0394\u0395\u03ea", "\u07f6\u07a3\u07a4\u07a3\u07be\u07f4\u07f6\u07f4\u07e2\u07e3\u079c", "\u01dc\u01de\u01cf\u01f8\u01d7\u01da\u01c8\u01c8\u0187\u0185\u0193\u0192\u01f7\u01d1\u01da\u01cd\u01da\u0194\u01d7\u01da\u01d5\u01dc\u0194\u01f8\u01d7\u01da\u01c8\u01c8\u0180", "\u0640\u0649\u065b\u0640\u066b\u0647\u064c\u064d\u0614\u0616\u0600\u0601\u0661", "\u0223\u0237\u0233\u0227\u022a\u0235\u027a\u0278\u026e\u020a\u022c\u0227\u0230\u0227\u0269\u022a\u0227\u0228\u0221\u0269\u0209\u0224\u022c\u0223\u0225\u0232\u027d\u026f\u021c", "\u069d\u0692\u0691\u0690\u069b\u06c2\u06c0\u06d6\u06d7\u06b2\u0694\u069f\u0688\u069f\u06d1\u0692\u069f\u0690\u0699\u06d1\u06b1\u069c\u0694\u069b\u069d\u068a\u06c5", "\u0196\u018d\u01b1\u0196\u0190\u018b\u018c\u0185\u01de\u01dc\u01ca\u01cb\u01ae\u0188\u0183\u0194\u0183\u01cd\u018e\u0183\u018c\u0185\u01cd\u01b1\u0196\u0190\u018b\u018c\u0185\u01d9", "\u023c\u023d\u0226\u023b\u0234\u022b\u026e\u026c\u027a\u027b\u0204", "\u03dc\u03dd\u03c6\u03db\u03d4\u03cb\u03f3\u03de\u03de\u038e\u038c\u039a\u039b\u03e4", "\u04ed\u04fb\u04f3\u04ee\u04a6\u04a4\u04b2\u04b3\u04cc", "\u009c\u008a\u0082\u009f\u00d7\u00d5\u00c3\u00a1\u00c2\u00bd", "\u05d4\u05c2\u05ca\u05d7\u0593\u059f\u059d\u058b\u05e9\u058a\u05f5", "\u04ba\u04ac\u04a4\u04b9\u04f1\u04f3\u04e5\u0487\u0484\u04e4\u049b", "\u02f3\u02fc\u02fb\u02f4\u02f9\u02fc\u02ef\u02f0\u02a9\u02ab\u02bd\u02bc\u02c3"})
public final class Class1724 {
    public static long field6373 = 0xFFFFFFFFL;
    public static double field6374;
    public static int field6375 = 0;
    public static double field6376;

    static {
        b\u200e = "Releases packets at intervals";
        field6374 = Double.longBitsToDouble(4599964868141166576L);
        field6376 = Double.longBitsToDouble(4606242301242488820L);
        bI\u200e = "SelfDamage";
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite iIwraWrnjGXwll(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1724.PSWb5aej7vMri0XR(k2, -1482502131));
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
                int a2 = Integer.parseInt(Class1724.PSWb5aej7vMri0XR(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1724.PSWb5aej7vMri0XR(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1724.PSWb5aej7vMri0XR(k2, -1482502131) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String PSWb5aej7vMri0XR(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

