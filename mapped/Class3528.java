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
@HACHIMI_CLIENT(mv=100, d1={"\u46b9\u46b9\u46b9\u46b8\u46b9\u46b3\u46b9\u46bb", "\ud1e3\ud1e0\ud1e4\ud1e7\ud1e3\ud1ef\ud1e0\ud1ef", "\uae97\uae97\uae91\uae90\uae94\uae9f\uae95", "\u2770\u2770\u2774\u277c\u2776\u2776\u2777\u2776", "\ucb90\ucb91\ucb96\ucb91\ucb91\ucb9c\ucb9d\ucb91", "\u140a\u1400\u140f\u140e\u1409\u1408\u140a\u1400", "\u7318\u731e\u7319\u731f\u731b\u731e\u7311\u731a", "\ubc70\ubc75\ubc74\ubc7a\ubc70\ubc74\ubc76\ubc70", "\ue63a\ue639\ue63e\ue63a\ue639\ue63e\ue63d\ue63d", "\ud521\ud52a\ud527\ud524\ud526\ud524\ud523\ud526", "\u079e\u079f\u079b\u0798\u0799\u079b\u079f\u0798", "\u4c4f\u4c42\u4c42\u4c4a\u4c48\u4c49\u4c49\u4c4d", "\u39fc\u39fd\u39fb\u39fa\u39f8\u39f8\u39fd\u39fd", "\u8e55\u8e57\u8e5e\u8e53\u8e57\u8e5e\u8e51\u8e55", "\u06a2\u06a3\u06a7\u06a5\u06a2\u06a6\u06a1"}, d2={"\u048d\u0493\u04a2\u24ee\u04dc\u04de\u04c8\u04ac\u048a\u0481\u0496\u0481\u04cf\u048c\u0481\u048e\u0487\u04cf\u04b3\u0494\u0492\u0489\u048e\u0487\u04db\u04c9\u04ac\u048a\u0481\u0496\u0481\u04cf\u048c\u0481\u048e\u0487\u04cf\u04b3\u0494\u0492\u0489\u048e\u0487\u04db", "\u0017HGBEB_\u0015\u0017\u0015\u0003\u0002}", "+~y~c)+)?>A", "\u0000\u0002\u0013$\u000b\u0006\u0014\u0014[YON+\r\u0006\u0011\u0006H\u000b\u0006\t\u0000H$\u000b\u0006\u0014\u0014\\", "\u06e3\u06ea\u06f8\u06e3\u06c8\u06e4\u06ef\u06ee\u06b7\u06b5\u06a3\u06a2\u06c2", "\u05d0\u05c4\u05c0\u05d4\u05d9\u05c6\u0589\u058b\u059d\u05f9\u05df\u05d4\u05c3\u05d4\u059a\u05d9\u05d4\u05db\u05d2\u059a\u05fa\u05d7\u05df\u05d0\u05d6\u05c1\u058e\u059c\u05ef", "\u01d2\u01dd\u01de\u01df\u01d4\u018d\u018f\u0199\u0198\u01fd\u01db\u01d0\u01c7\u01d0\u019e\u01dd\u01d0\u01df\u01d6\u019e\u01fe\u01d3\u01db\u01d4\u01d2\u01c5\u018a", "\u02e4\u02ff\u02c3\u02e4\u02e2\u02f9\u02fe\u02f7\u02ac\u02ae\u02b8\u02b9\u02dc\u02fa\u02f1\u02e6\u02f1\u02bf\u02fc\u02f1\u02fe\u02f7\u02bf\u02c3\u02e4\u02e2\u02f9\u02fe\u02f7\u02ab", "\u040f\u040e\u0415\u0408\u0407\u0418\u045d\u045f\u0449\u0448\u0437", "\u01b7\u01b6\u01ad\u01b0\u01bf\u01a0\u0198\u01b5\u01b5\u01e5\u01e7\u01f1\u01f0\u018f", "\u0576\u0560\u0568\u0575\u053d\u053f\u0529\u0528\u0557", "\u00a8\u00be\u00b6\u00ab\u00e3\u00e1\u00f7\u0095\u00f6\u0089", "\u063e\u0628\u0620\u063d\u0679\u0675\u0677\u0661\u0603\u0660\u061f", "\u07a8\u07be\u07b6\u07ab\u07e3\u07e1\u07f7\u0795\u0796\u07f6\u0789", "\u0420\u042f\u0428\u0427\u042a\u042f\u043c\u0423\u047a\u0478\u046e\u046f\u0410"})
public final class Class3528 {
    public static double field7808 = 0.06112481050569063;
    public static int field7809 = 571489203;

    /*
     * WARNING - void declaration
     */
    private static CallSite BjTA7dct6LFYyB(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3528.7oM8nStNAODTTSXD(k2, 1911080395));
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
                int a2 = Integer.parseInt(Class3528.7oM8nStNAODTTSXD(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3528.7oM8nStNAODTTSXD(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3528.7oM8nStNAODTTSXD(k2, 1911080395) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String 7oM8nStNAODTTSXD(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        bz\u200e = "RAIN";
    }
}

