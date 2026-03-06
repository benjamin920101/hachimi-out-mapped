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

@HACHIMI_CLIENT(mv=100, d1={"\u4d49\u4d4c\u4d4c\u4d4d\u4d47\u4d46\u4d4c\u4d4f", "\u1fe0\u1fe1\u1fe3\u1fe7\u1fe4\u1fec\u1fe4\u1fed", "\ud1f3\ud1f5\ud1f6\ud1fd\ud1f1\ud1fc\ud1f1\ud1f7", "\u38b4\u38b1\u38b2\u38bf\u38b5\u38b3\u38b1\u38be", "\u5b4c\u5b4a\u5b48\u5b49\u5b4f\u5b4f\u5b4e\u5b4f", "\u4d3e\u4d38\u4d3e\u4d3e\u4d3d\u4d3a\u4d37\u4d39", "\u5dcf\u5dc8\u5dcc\u5dcc\u5dcd\u5dcb\u5dc8\u5dc8", "\u4365\u4366\u4366\u4366\u4362\u4360\u4366\u4365", "\u5abb\u5abb\u5ab4\u5abb\u5ab8\u5abf\u5ab9\u5ab4", "\u7c62\u7c60\u7c69\u7c62\u7c64\u7c63\u7c67\u7c62", "\ue344\ue347\ue340\ue344\ue348\ue346\ue349\ue347", "\u889c\u889b\u889c\u8896\u8896\u889c\u8897\u889f", "\u8bce\u8bcc\u8bce\u8bc6\u8bc8\u8bc6\u8bcc\u8bc9", "\u81d5\u81d0\u81dd\u81dc\u81d6\u81d4\u81d1\u81dd", "\udac7\udac0\udac1\udac5\udac3\udac5\udac0\udac6", "\ud788\ud78b\ud78b\ud78e\ud786\ud78d\ud789\ud78d"}, d2={"\u0607\u062c\u0616\u266f\u065d\u065f\u0649\u062d\u060b\u0600\u0617\u0600\u064e\u060d\u0600\u060f\u0606\u064e\u0632\u0615\u0613\u0608\u060f\u0606\u065a\u0648\u062d\u060b\u0600\u0617\u0600\u064e\u060d\u0600\u060f\u0606\u064e\u0632\u0615\u0613\u0608\u060f\u0606\u065a", "\u0594\u05bf\u058a\u25fc\u05ce\u05cc\u05da\u05be\u0598\u0593\u0584\u0593\u05dd\u059e\u0593\u059c\u0595\u05dd\u05a1\u0586\u0580\u059b\u059c\u0595\u05c9\u05db\u05be\u0598\u0593\u0584\u0593\u05dd\u059e\u0593\u059c\u0595\u05dd\u05a1\u0586\u0580\u059b\u059c\u0595\u05c9", "\u0340\u031f\u0310\u0315\u0312\u0315\u0308\u0342\u0340\u0342\u0354\u0355\u032a", "\u0379\u032c\u032b\u032c\u0331\u037b\u0379\u037b\u036d\u036c\u0313", "\u0497\u0495\u0484\u04b3\u049c\u0491\u0483\u0483\u04cc\u04ce\u04d8\u04d9\u04bc\u049a\u0491\u0486\u0491\u04df\u049c\u0491\u049e\u0497\u04df\u04b3\u049c\u0491\u0483\u0483\u04cb", "\u011e\u0117\u0105\u011e\u0135\u0119\u0112\u0113\u014a\u0148\u015e\u015f\u013f", "\u05fa\u05ee\u05ea\u05fe\u05f3\u05ec\u05a3\u05a1\u05b7\u05d3\u05f5\u05fe\u05e9\u05fe\u05b0\u05f3\u05fe\u05f1\u05f8\u05b0\u05d0\u05fd\u05f5\u05fa\u05fc\u05eb\u05a4\u05b6\u05c5", "\u06e9\u06e6\u06e5\u06e4\u06ef\u06b6\u06b4\u06a2\u06a3\u06c6\u06e0\u06eb\u06fc\u06eb\u06a5\u06e6\u06eb\u06e4\u06ed\u06a5\u06c5\u06e8\u06e0\u06ef\u06e9\u06fe\u06b1", "\u00f3\u00e8\u00d4\u00f3\u00f5\u00ee\u00e9\u00e0\u00bb\u00b9\u00af\u00ae\u00cb\u00ed\u00e6\u00f1\u00e6\u00a8\u00eb\u00e6\u00e9\u00e0\u00a8\u00d4\u00f3\u00f5\u00ee\u00e9\u00e0\u00bc", "\u0291\u0290\u028b\u0296\u0299\u0286\u02c3\u02c1\u02d7\u02d6\u02a9", "\u01c8\u01c9\u01d2\u01cf\u01c0\u01df\u01e7\u01ca\u01ca\u019a\u0198\u018e\u018f\u01f0", "\u0209\u021f\u0217\u020a\u0242\u0240\u0256\u0257\u0228", "\u06dd\u06cb\u06c3\u06de\u0696\u0694\u0682\u06e0\u0683\u06fc", "\u0496\u0480\u0488\u0495\u04d1\u04dd\u04df\u04c9\u04ab\u04c8\u04b7", "\u0537\u0521\u0529\u0534\u057c\u057e\u0568\u050a\u0509\u0569\u0516", "\u05db\u05d4\u05d3\u05dc\u05d1\u05d4\u05c7\u05d8\u0581\u0583\u0595\u0594\u05eb"})
public final class Class1209 {
    public static float field4762 = Float.intBitsToFloat(1049729070);
    public static String field4763 = "Could not read file for waypoints.json!";
    public static double field4764 = Double.longBitsToDouble(4581877479834374656L);

    private static String SJeI3dYBrklGADPo(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        be\u200e = "The mode to prevent fall damage";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite DrYyPntv4n3yyn(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1209.SJeI3dYBrklGADPo(k2, -1779532183));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1209.SJeI3dYBrklGADPo(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1209.SJeI3dYBrklGADPo(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 37689 : 37690;
        block7: while (true) {
            switch (n3) {
                case 37690: {
                    n3 = 37688;
                    continue block7;
                }
                case 37689: {
                    throw new Exception("Can't find method in " + Class1209.SJeI3dYBrklGADPo(k2, -1779532183) + " " + l2 + " " + m2);
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

