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

@HACHIMI_CLIENT(mv=100, d1={"\u4afa\u4afe\u4afd\u4aff\u4afc\u4afb\u4afa", "\u1c16\u1c1e\u1c10\u1c1f\u1c17\u1c16\u1c14\u1c16", "\uab6d\uab6b\uab69\uab69\uab66\uab6e\uab69\uab6e", "\ucd07\ucd00\ucd00\ucd05\ucd02\ucd0d\ucd06\ucd05", "\u75ab\u75a8\u75ac\u75a1\u75a0\u75ae\u75aa\u75a0", "\ue390\ue395\ue39b\ue395\ue397\ue396\ue393\ue392", "\u3874\u3873\u3876\u3873\u3873\u3872\u3875\u3877", "\ubb11\ubb1c\ubb11\ubb17\ubb15\ubb13\ubb13\ubb17", "\u3573\u3577\u3575\u3573\u3574\u3575\u3574\u3572", "\u0cdd\u0cd8\u0cdb\u0cd0\u0cd0\u0cdd\u0cda\u0cde", "\u6fb9\u6fbb\u6fbc\u6fb4\u6fb8\u6fbd\u6fba\u6fbe", "\u7e8a\u7e84\u7e8e\u7e8e\u7e89\u7e8e\u7e8c\u7e85", "\u8fef\u8fe4\u8fee\u8feb\u8fee\u8fe8\u8fee\u8fee", "\uaf48\uaf45\uaf49\uaf4a\uaf4d\uaf4e\uaf49\uaf4f", "\u9d97\u9d90\u9d9e\u9d9f\u9d92\u9d9f\u9d9e\u9d9f"}, d2={"\u020a\u0238\u0233\u2267\u0255\u0257\u0241\u0225\u0203\u0208\u021f\u0208\u0246\u0205\u0208\u0207\u020e\u0246\u023a\u021d\u021b\u0200\u0207\u020e\u0252\u0240\u0225\u0203\u0208\u021f\u0208\u0246\u0205\u0208\u0207\u020e\u0246\u023a\u021d\u021b\u0200\u0207\u020e\u0252", "\u0596\u05c9\u05c6\u05c3\u05c4\u05c3\u05de\u0594\u0596\u0594\u0582\u0583\u05fc", "\u0405\u0450\u0457\u0450\u044d\u0407\u0405\u0407\u0411\u0410\u046f", "\u0105\u0107\u0116\u0121\u010e\u0103\u0111\u0111\u015e\u015c\u014a\u014b\u012e\u0108\u0103\u0114\u0103\u014d\u010e\u0103\u010c\u0105\u014d\u0121\u010e\u0103\u0111\u0111\u0159", "\u0088\u0081\u0093\u0088\u00a3\u008f\u0084\u0085\u00dc\u00de\u00c8\u00c9\u00a9", "\u04c6\u04d2\u04d6\u04c2\u04cf\u04d0\u049f\u049d\u048b\u04ef\u04c9\u04c2\u04d5\u04c2\u048c\u04cf\u04c2\u04cd\u04c4\u048c\u04ec\u04c1\u04c9\u04c6\u04c0\u04d7\u0498\u048a\u04f9", "\u045f\u0450\u0453\u0452\u0459\u0400\u0402\u0414\u0415\u0470\u0456\u045d\u044a\u045d\u0413\u0450\u045d\u0452\u045b\u0413\u0473\u045e\u0456\u0459\u045f\u0448\u0407", "\u07cc\u07d7\u07eb\u07cc\u07ca\u07d1\u07d6\u07df\u0784\u0786\u0790\u0791\u07f4\u07d2\u07d9\u07ce\u07d9\u0797\u07d4\u07d9\u07d6\u07df\u0797\u07eb\u07cc\u07ca\u07d1\u07d6\u07df\u0783", "\u04ab\u04aa\u04b1\u04ac\u04a3\u04bc\u04f9\u04fb\u04ed\u04ec\u0493", "\u02f0\u02f1\u02ea\u02f7\u02f8\u02e7\u02df\u02f2\u02f2\u02a2\u02a0\u02b6\u02b7\u02c8", "\u0751\u0747\u074f\u0752\u071a\u0718\u070e\u070f\u0770", "\u059e\u0588\u0580\u059d\u05d5\u05d7\u05c1\u05a3\u05c0\u05bf", "\u05f3\u05e5\u05ed\u05f0\u05b4\u05b8\u05ba\u05ac\u05ce\u05ad\u05d2", "\u0659\u064f\u0647\u065a\u0612\u0610\u0606\u0664\u0667\u0607\u0678", "\u03be\u03b1\u03b6\u03b9\u03b4\u03b1\u03a2\u03bd\u03e4\u03e6\u03f0\u03f1\u038e"})
public final class Class4042 {
    public static double field9315;
    public static int field9316 = 938880244;

    private static String FumGSKre9YZfyOPl(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        G\u200e = "TargetRange";
        field9315 = Double.longBitsToDouble(4605607378517108745L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite z2HyiXlc3qeImS(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4042.FumGSKre9YZfyOPl(k2, -2095069794));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) throw new Exception("Outdated metadata version");
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        block2: for (int f2 = 0; f2 < q2.length; ++f2) {
            int n3;
            void e2;
            try {
                int a2 = Integer.parseInt(Class4042.FumGSKre9YZfyOPl(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            int n4 = e2 % 59557 == m2.intValue() ? 60632 : 60633;
            while ((n3 = n4) != 60632) {
                if (n3 != 60633) continue block2;
                n4 = 60631;
            }
            String c2 = Class4042.FumGSKre9YZfyOPl(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4042.FumGSKre9YZfyOPl(k2, -2095069794) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }
}

