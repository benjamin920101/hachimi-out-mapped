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

@HACHIMI_CLIENT(mv=100, d1={"\u0201\u0202\u020e\u020f\u020e\u0200\u0205\u0204", "\u70ba\u70bb\u70b9\u70bc\u70b9\u70bd\u70ba\u70be", "\u179d\u179b\u1798\u1798\u179c\u1798\u179b\u179b", "\u7838\u783f\u783a\u783b\u7839\u783d\u783d\u783c", "\ua326\ua328\ua329\ua324\ua329\ua321\ua329\ua323", "\u1e8b\u1e8d\u1e83\u1e8e\u1e8f\u1e8d\u1e8c", "\u52eb\u52e0\u52e9\u52e1\u52ec\u52e9\u52eb\u52ec", "\u9ff2\u9ff1\u9ff5\u9ff5\u9ff5\u9ffa\u9ffb\u9ff0", "\u5c1f\u5c18\u5c1b\u5c14\u5c1f\u5c1b\u5c1b\u5c19", "\u3d3e\u3d3a\u3d3d\u3d3d\u3d3d\u3d38\u3d3f\u3d3b", "\u40c2\u40c0\u40ce\u40c4\u40ce\u40c2\u40c5\u40c4", "\u46dd\u46df\u46df\u46de\u46d8\u46d7\u46df\u46dc", "\u7a6e\u7a6f\u7a69\u7a6a\u7a69\u7a6d\u7a6e", "\u321f\u3219\u321b\u3216\u321c\u321f\u3218\u321f"}, d2={"\u02a4\u02fb\u02f4\u02f1\u02f6\u02f1\u02ec\u02a6\u02a4\u02a6\u02b0\u02b1\u02ce", "\u05a4\u05f1\u05f6\u05f1\u05ec\u05a6\u05a4\u05a6\u05b0\u05b1\u05ce", "\u061c\u061e\u060f\u0638\u0617\u061a\u0608\u0608\u0647\u0645\u0653\u0652\u0637\u0611\u061a\u060d\u061a\u0654\u0617\u061a\u0615\u061c\u0654\u0638\u0617\u061a\u0608\u0608\u0640", "\u02d3\u02da\u02c8\u02d3\u02f8\u02d4\u02df\u02de\u0287\u0285\u0293\u0292\u02f2", "\u04bf\u04ab\u04af\u04bb\u04b6\u04a9\u04e6\u04e4\u04f2\u0496\u04b0\u04bb\u04ac\u04bb\u04f5\u04b6\u04bb\u04b4\u04bd\u04f5\u0495\u04b8\u04b0\u04bf\u04b9\u04ae\u04e1\u04f3\u0480", "\u0336\u0339\u033a\u033b\u0330\u0369\u036b\u037d\u037c\u0319\u033f\u0334\u0323\u0334\u037a\u0339\u0334\u033b\u0332\u037a\u031a\u0337\u033f\u0330\u0336\u0321\u036e", "\u0774\u076f\u0753\u0774\u0772\u0769\u076e\u0767\u073c\u073e\u0728\u0729\u074c\u076a\u0761\u0776\u0761\u072f\u076c\u0761\u076e\u0767\u072f\u0753\u0774\u0772\u0769\u076e\u0767\u073b", "\b\t\u0012\u000f\u0000\u001fZXNO0", "'&= /0\b%%uwa`\u001f", "yogz20&'X", "\u02ab\u02bd\u02b5\u02a8\u02e0\u02e2\u02f4\u0296\u02f5\u028a", "WAIT\u0010\u001c\u001e\bj\tv", "\u04af\u04b9\u04b1\u04ac\u04e4\u04e6\u04f0\u0492\u0491\u04f1\u048e", "\u0404\u040b\u040c\u0403\u040e\u040b\u0418\u0407\u045e\u045c\u044a\u044b\u0434"})
public final class Class3458 {
    public static float field7566 = Float.intBitsToFloat(1044436044);

    /*
     * Unable to fully structure code
     */
    private static String NWiFF3LbYFbqBFbV(String a, int b) {
        c = new StringBuilder();
        d = 0;
        while (true) {
            block2: {
                block3: {
                    if (d >= a.length()) break block3;
                    v0 = 11655;
                    ** GOTO lbl12
                }
                v0 = 11656;
                if (true) ** GOTO lbl12
                do {
                    v0 = var4_4 = 11654;
lbl12:
                    // 3 sources

                    if (var4_4 == 11655) break block2;
                } while (var4_4 == 11656);
                break;
            }
            c.append((char)(a.charAt(d) ^ b));
            ++d;
        }
        return c.toString();
    }

    /*
     * WARNING - void declaration
     */
    private static CallSite gy6qSkcF9LitPC(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class3458.NWiFF3LbYFbqBFbV(k2, -1802292500));
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
                int a2 = Integer.parseInt(Class3458.NWiFF3LbYFbqBFbV(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class3458.NWiFF3LbYFbqBFbV(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class3458.NWiFF3LbYFbqBFbV(k2, -1802292500) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }
}

