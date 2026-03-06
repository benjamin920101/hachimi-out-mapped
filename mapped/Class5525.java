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
@HACHIMI_CLIENT(mv=100, d1={"\u9227\u9228\u9222\u9227\u9220\u9226\u9225\u9220", "\u76fc\u76f9\u76fc\u76f3\u76fc\u76f2\u76fe\u76f9", "\u166d\u1669\u166f\u166b\u166d\u1668\u166f\u166c", "\u8d21\u8d2c\u8d20\u8d27\u8d22\u8d2c\u8d2d\u8d21", "\ue6ed\ue6ee\ue6e8\ue6e9\ue6ef\ue6ea\ue6ee\ue6ee", "\u0338\u0339\u033a\u0334\u033c\u0335\u0335\u0335", "\ubdf5\ubdf3\ubdf6\ubdf4\ubdf4\ubdfd\ubdfd\ubdf2", "\u3e3a\u3e3e\u3e34\u3e38\u3e34\u3e39\u3e3d\u3e35", "\u1b70\u1b71\u1b71\u1b74\u1b75\u1b74\u1b7f\u1b77", "\u4509\u450b\u450c\u4506\u4507\u4507\u450b\u450b", "\u5e7b\u5e7d\u5e7f\u5e7d\u5e70\u5e7b\u5e7b\u5e7e", "\u4692\u4690\u4694\u4699\u4692\u4693\u4698\u4690", "\u8871\u8872\u8872\u887c\u887c\u8870\u887c\u887c", "\uaefd\uaefc\uaefb\uaefc\uaef9\uaef8\uaef9\uaefd", "\u0222\u0222\u0220\u0220\u022e\u0224\u022e\u0222", "\ua987\ua984\ua98e\ua982\ua98e\ua984\ua986\ua987", "\u629c\u6299\u629b\u629e\u629b\u629a\u6296\u629f", "\u8a7e\u8a7f\u8a7c\u8a76\u8a77\u8a7c\u8a7d\u8a7a", "\u6533\u653e\u653f\u6530\u6532\u6537\u6530\u6535", "\u473d\u473e\u4737\u473c\u4736\u473c\u4739\u473d"}, d2={"\u064b\u067d\u065d\u2636\u0604\u0606\u0610\u0674\u0652\u0659\u064e\u0659\u0617\u0654\u0659\u0656\u065f\u0617\u066b\u064c\u064a\u0651\u0656\u065f\u0603\u0611\u0674\u0652\u0659\u064e\u0659\u0617\u0654\u0659\u0656\u065f\u0617\u066b\u064c\u064a\u0651\u0656\u065f\u0603", "\u0092\u00a4\u0087\u20ef\u00dd\u00df\u00c9\u00ad\u008b\u0080\u0097\u0080\u00ce\u008d\u0080\u008f\u0086\u00ce\u00b2\u0095\u0093\u0088\u008f\u0086\u00da\u00c8\u00ad\u008b\u0080\u0097\u0080\u00ce\u008d\u0080\u008f\u0086\u00ce\u00b2\u0095\u0093\u0088\u008f\u0086\u00da", "\u0377\u0341\u0363\u230a\u0338\u033a\u032c\u0348\u036e\u0365\u0372\u0365\u032b\u0368\u0365\u036a\u0363\u032b\u0357\u0370\u0376\u036d\u036a\u0363\u033f\u032d\u0348\u036e\u0365\u0372\u0365\u032b\u0368\u0365\u036a\u0363\u032b\u0357\u0370\u0376\u036d\u036a\u0363\u033f", "\u034a\u037c\u0351\u2337\u0305\u0307\u0311\u0375\u0353\u0358\u034f\u0358\u0316\u0355\u0358\u0357\u035e\u0316\u036a\u034d\u034b\u0350\u0357\u035e\u0302\u0310\u0375\u0353\u0358\u034f\u0358\u0316\u0355\u0358\u0357\u035e\u0316\u036a\u034d\u034b\u0350\u0357\u035e\u0302", "\u00c9\u00ff\u00d3\u20b4\u0086\u0084\u0092\u00f6\u00d0\u00db\u00cc\u00db\u0095\u00d6\u00db\u00d4\u00dd\u0095\u00e9\u00ce\u00c8\u00d3\u00d4\u00dd\u0081\u0093\u00f6\u00d0\u00db\u00cc\u00db\u0095\u00d6\u00db\u00d4\u00dd\u0095\u00e9\u00ce\u00c8\u00d3\u00d4\u00dd\u0081", "\u0488\u04be\u0491\u24f5\u04c7\u04c5\u04d3\u04b7\u0491\u049a\u048d\u049a\u04d4\u0497\u049a\u0495\u049c\u04d4\u04a8\u048f\u0489\u0492\u0495\u049c\u04c0\u04d2\u04b7\u0491\u049a\u048d\u049a\u04d4\u0497\u049a\u0495\u049c\u04d4\u04a8\u048f\u0489\u0492\u0495\u049c\u04c0", "\u0508\u0557\u0558\u055d\u055a\u055d\u0540\u050a\u0508\u050a\u051c\u051d\u0562", "\u077a\u072f\u0728\u072f\u0732\u0778\u077a\u0778\u076e\u076f\u0710", "\u04d2\u04d0\u04c1\u04f6\u04d9\u04d4\u04c6\u04c6\u0489\u048b\u049d\u049c\u04f9\u04df\u04d4\u04c3\u04d4\u049a\u04d9\u04d4\u04db\u04d2\u049a\u04f6\u04d9\u04d4\u04c6\u04c6\u048e", "\u02c5\u02cc\u02de\u02c5\u02ee\u02c2\u02c9\u02c8\u0291\u0293\u0285\u0284\u02e4", "\u0518\u050c\u0508\u051c\u0511\u050e\u0541\u0543\u0555\u0531\u0517\u051c\u050b\u051c\u0552\u0511\u051c\u0513\u051a\u0552\u0532\u051f\u0517\u0518\u051e\u0509\u0546\u0554\u0527", "\u06db\u06d4\u06d7\u06d6\u06dd\u0684\u0686\u0690\u0691\u06f4\u06d2\u06d9\u06ce\u06d9\u0697\u06d4\u06d9\u06d6\u06df\u0697\u06f7\u06da\u06d2\u06dd\u06db\u06cc\u0683", "\u00fc\u00e7\u00db\u00fc\u00fa\u00e1\u00e6\u00ef\u00b4\u00b6\u00a0\u00a1\u00c4\u00e2\u00e9\u00fe\u00e9\u00a7\u00e4\u00e9\u00e6\u00ef\u00a7\u00db\u00fc\u00fa\u00e1\u00e6\u00ef\u00b3", "*+0-\"=xzlm\u0012", "\u064e\u064f\u0654\u0649\u0646\u0659\u0661\u064c\u064c\u061c\u061e\u0608\u0609\u0676", "\u04e3\u04f5\u04fd\u04e0\u04a8\u04aa\u04bc\u04bd\u04c2", "\u012b\u013d\u0135\u0128\u0160\u0162\u0174\u0116\u0175\u010a", "\u02f3\u02e5\u02ed\u02f0\u02b4\u02b8\u02ba\u02ac\u02ce\u02ad\u02d2", "\u0785\u0793\u079b\u0786\u07ce\u07cc\u07da\u07b8\u07bb\u07db\u07a4", "\u01e8\u01e7\u01e0\u01ef\u01e2\u01e7\u01f4\u01eb\u01b2\u01b0\u01a6\u01a7\u01d8"})
public final class Class5525 {
    public static float field10444;
    public static double field10445;
    public static float field10446;
    public static float field10447;

    static {
        field10445 = Double.longBitsToDouble(4595041978257439552L);
        field10447 = Float.intBitsToFloat(1062926001);
        I\u200e = "\u00a77%s\u00a7f was set to \u00a7s%s";
        P\u200e = "Delay, in ticks, between loops";
        field10446 = Float.intBitsToFloat(1045915924);
        av\u200e = "Couldn't parse Json for {}!";
        aw\u200e = "w ";
        field10444 = Float.intBitsToFloat(1059522678);
        bl\u200e = "AutoDisable";
        bo\u200e = "Target selector";
    }

    private static String 3qZmnR0VqA70gOFS(String a2, int b2) {
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
    private static CallSite IT8rDWzV9JOftg(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class5525.3qZmnR0VqA70gOFS(k2, -1353516152));
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
                int a2 = Integer.parseInt(Class5525.3qZmnR0VqA70gOFS(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class5525.3qZmnR0VqA70gOFS(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        int n3 = s2.isEmpty() ? 24603 : 24604;
        while (true) {
            int n4 = n3;
            if (n4 == 24603) throw new Exception("Can't find method in " + Class5525.3qZmnR0VqA70gOFS(k2, -1353516152) + " " + l2 + " " + m2);
            if (n4 != 24604) break;
            n3 = 24602;
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

