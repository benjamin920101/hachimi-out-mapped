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

@HACHIMI_CLIENT(mv=100, d1={"\uc84c\uc847\uc848\uc847\uc848\uc84f\uc847", "\u64bc\u64bc\u64b2\u64be\u64b2\u64bc\u64b3\u64b8", "\u25ca\u25c6\u25ca\u25c6\u25c7\u25cf\u25cc\u25ca", "\ud577\ud571\ud577\ud572\ud571\ud572\ud573\ud571", "\u1842\u1848\u1842\u1849\u1845\u1848\u1843\u1841", "\u3a0b\u3a06\u3a0d\u3a06\u3a0e\u3a09\u3a09\u3a0e", "\ub6da\ub6df\ub6da\ub6de\ub6df\ub6dc\ub6d0\ub6dc", "\u39ac\u39a8\u39a9\u39ad\u39aa\u39a3\u39a8\u39af", "\u3853\u3852\u3859\u3858\u3857\u3856\u3858\u3851", "\ucdb9\ucdbf\ucdb0\ucdb8\ucdb8\ucdbe\ucdb8\ucdba", "\u8dd7\u8dd4\u8dd4\u8dd5\u8dd8\u8dd1\u8dd3\u8dd0", "\u7f76\u7f71\u7f71\u7f7b\u7f72\u7f72\u7f75\u7f76", "\u44c0\u44c9\u44c4\u44c2\u44c8\u44c9\u44c6\u44c7", "\uc899\uc89d\uc89c\uc894\uc89f\uc89a\uc894\uc89c", "\u61bf\u61bd\u61bc\u61bb\u61bc\u61bb\u61b9\u61b9"}, d2={"\u009c\u00ad\u0091\u20f1\u00c3\u00c1\u00d7\u00b3\u0095\u009e\u0089\u009e\u00d0\u0093\u009e\u0091\u0098\u00d0\u00ac\u008b\u008d\u0096\u0091\u0098\u00c4\u00d6\u00b3\u0095\u009e\u0089\u009e\u00d0\u0093\u009e\u0091\u0098\u00d0\u00ac\u008b\u008d\u0096\u0091\u0098\u00c4", "\u00ea\u00b5\u00ba\u00bf\u00b8\u00bf\u00a2\u00e8\u00ea\u00e8\u00fe\u00ff\u0080", "\u05d3\u0586\u0581\u0586\u059b\u05d1\u05d3\u05d1\u05c7\u05c6\u05b9", "\u07f5\u07f7\u07e6\u07d1\u07fe\u07f3\u07e1\u07e1\u07ae\u07ac\u07ba\u07bb\u07de\u07f8\u07f3\u07e4\u07f3\u07bd\u07fe\u07f3\u07fc\u07f5\u07bd\u07d1\u07fe\u07f3\u07e1\u07e1\u07a9", ";2 ;\u0010<76om{z\u001a", "\u0603\u0617\u0613\u0607\u060a\u0615\u065a\u0658\u064e\u062a\u060c\u0607\u0610\u0607\u0649\u060a\u0607\u0608\u0601\u0649\u0629\u0604\u060c\u0603\u0605\u0612\u065d\u064f\u063c", "JEFGL\u0015\u0017\u0001\u0000eCH_H\u0006EHGN\u0006fKCLJ]\u0012", "\u060e\u0615\u0629\u060e\u0608\u0613\u0614\u061d\u0646\u0644\u0652\u0653\u0636\u0610\u061b\u060c\u061b\u0655\u0616\u061b\u0614\u061d\u0655\u0629\u060e\u0608\u0613\u0614\u061d\u0641", "! ;&)6sqgf\u0019", "\u078e\u078f\u0794\u0789\u0786\u0799\u07a1\u078c\u078c\u07dc\u07de\u07c8\u07c9\u07b6", "\u074b\u075d\u0755\u0748\u0700\u0702\u0714\u0715\u076a", "\u06af\u06b9\u06b1\u06ac\u06e4\u06e6\u06f0\u0692\u06f1\u068e", "\u023d\u022b\u0223\u023e\u027a\u0276\u0274\u0262\u0200\u0263\u021c", "\n\u001c\u0014\tACU74T+", "\u0575\u057a\u057d\u0572\u057f\u057a\u0569\u0576\u052f\u052d\u053b\u053a\u0545"})
public final class Class5440 {
    public static float field10164;

    /*
     * WARNING - void declaration
     */
    private static CallSite mespcIweWD9nqT(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5440.LXcoKA2iy2wlji7X(k2, 516204604));
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
                int a2 = Integer.parseInt(Class5440.LXcoKA2iy2wlji7X(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5440.LXcoKA2iy2wlji7X(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class5440.LXcoKA2iy2wlji7X(k2, 516204604) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        s\u200e = "Not a number!";
        field10164 = Float.intBitsToFloat(1044644796);
    }

    private static String LXcoKA2iy2wlji7X(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

