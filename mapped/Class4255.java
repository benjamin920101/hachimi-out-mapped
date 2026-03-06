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

@HACHIMI_CLIENT(mv=100, d1={"\u67bf\u67b8\u67b4\u67ba\u67bb\u67bf\u67b9\u67bf", "\u8fe4\u8fe2\u8fe3\u8fe5\u8fe3\u8fe4\u8fe6\u8fe3", "\uc05d\uc05d\uc056\uc058\uc057\uc058\uc05f\uc057", "\u5c2b\u5c29\u5c29\u5c2c\u5c2e\u5c29\u5c2e\u5c2c", "\u9cd1\u9cd1\u9cd3\u9cd7\u9cd5\u9cdb\u9cd5", "\u24ee\u24e4\u24ec\u24e4\u24ea\u24ed\u24e9", "\u0d10\u0d13\u0d11\u0d1a\u0d16\u0d11\u0d10\u0d17", "\u72a7\u72a8\u72a2\u72a4\u72a2\u72a7\u72a6\u72a6", "\u6f12\u6f12\u6f17\u6f10\u6f11\u6f1e\u6f1e", "\u3b06\u3b00\u3b05\u3b06\u3b01\u3b03\u3b02\u3b06", "\ua17a\ua17a\ua179\ua172\ua17c\ua17e\ua17d\ua17f", "\u1362\u1362\u1360\u1365\u1365\u1364\u1364\u1367", "\u510f\u510a\u5108\u510c\u5108\u510b\u5108\u510a", "\u1254\u1254\u1251\u1252\u1254\u1252\u1256\u1252", "\u710c\u710a\u7103\u710f\u710f\u710d\u7103\u710d", "\u9f23\u9f27\u9f23\u9f22\u9f2a\u9f24\u9f26\u9f21", "\u94ad\u94ad\u94a9\u94ae\u94af\u94ae\u94aa\u94af"}, d2={"\u017e\u016c\u016f\u211b\u0129\u012b\u013d\u0159\u017f\u0174\u0163\u0174\u013a\u0179\u0174\u017b\u0172\u013a\u0146\u0161\u0167\u017c\u017b\u0172\u012e\u013c\u0159\u017f\u0174\u0163\u0174\u013a\u0179\u0174\u017b\u0172\u013a\u0146\u0161\u0167\u017c\u017b\u0172\u012e", "\u07bd\u07af\u0797\u27d8\u07ea\u07e8\u07fe\u079a\u07bc\u07b7\u07a0\u07b7\u07f9\u07ba\u07b7\u07b8\u07b1\u07f9\u0785\u07a2\u07a4\u07bf\u07b8\u07b1\u07ed\u07ff\u079a\u07bc\u07b7\u07a0\u07b7\u07f9\u07ba\u07b7\u07b8\u07b1\u07f9\u0785\u07a2\u07a4\u07bf\u07b8\u07b1\u07ed", "\u05cd\u05df\u05e4\u25a8\u059a\u0598\u058e\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05f5\u05d2\u05d4\u05cf\u05c8\u05c1\u059d\u058f\u05ea\u05cc\u05c7\u05d0\u05c7\u0589\u05ca\u05c7\u05c8\u05c1\u0589\u05f5\u05d2\u05d4\u05cf\u05c8\u05c1\u059d", "\u0670\u062f\u0620\u0625\u0622\u0625\u0638\u0672\u0670\u0672\u0664\u0665\u061a", "\u009c\u00c9\u00ce\u00c9\u00d4\u009e\u009c\u009e\u0088\u0089\u00f6", "\u038b\u0389\u0398\u03af\u0380\u038d\u039f\u039f\u03d0\u03d2\u03c4\u03c5\u03a0\u0386\u038d\u039a\u038d\u03c3\u0380\u038d\u0382\u038b\u03c3\u03af\u0380\u038d\u039f\u039f\u03d7", "\u0524\u052d\u053f\u0524\u050f\u0523\u0528\u0529\u0570\u0572\u0564\u0565\u0505", "\u0122\u0136\u0132\u0126\u012b\u0134\u017b\u0179\u016f\u010b\u012d\u0126\u0131\u0126\u0168\u012b\u0126\u0129\u0120\u0168\u0108\u0125\u012d\u0122\u0124\u0133\u017c\u016e\u011d", "ifedo64\"#F`k|k%fkdm%Eh`oi~1", "\u0404\u041f\u0423\u0404\u0402\u0419\u041e\u0417\u044c\u044e\u0458\u0459\u043c\u041a\u0411\u0406\u0411\u045f\u041c\u0411\u041e\u0417\u045f\u0423\u0404\u0402\u0419\u041e\u0417\u044b", "\u06d2\u06d3\u06c8\u06d5\u06da\u06c5\u0680\u0682\u0694\u0695\u06ea", "\u05de\u05df\u05c4\u05d9\u05d6\u05c9\u05f1\u05dc\u05dc\u058c\u058e\u0598\u0599\u05e6", "\u05e3\u05f5\u05fd\u05e0\u05a8\u05aa\u05bc\u05bd\u05c2", "\u05eb\u05fd\u05f5\u05e8\u05a0\u05a2\u05b4\u05d6\u05b5\u05ca", "\u0650\u0646\u064e\u0653\u0617\u061b\u0619\u060f\u066d\u060e\u0671", "\u068e\u0698\u0690\u068d\u06c5\u06c7\u06d1\u06b3\u06b0\u06d0\u06af", "\u0616\u0619\u061e\u0611\u061c\u0619\u060a\u0615\u064c\u064e\u0658\u0659\u0626"})
public final class Class4255 {
    public static double field9938;
    public static float field9939;

    static {
        c\u200e = "Priority of anti crawl mining";
        J\u200e = "Logs ClientStatusC2SPacket";
        M\u200e = "AutoXP";
        field9938 = Double.longBitsToDouble(4581666635655154496L);
        field9939 = Float.intBitsToFloat(1098907648);
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite Bhmcn0b6inIcIv(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4255.mzdv4dLHyU9bDZ7v(k2, -1747233337));
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
                int a2 = Integer.parseInt(Class4255.mzdv4dLHyU9bDZ7v(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4255.mzdv4dLHyU9bDZ7v(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4255.mzdv4dLHyU9bDZ7v(k2, -1747233337) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String mzdv4dLHyU9bDZ7v(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

