/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.chunk.WorldChunk
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Velocity;
import mapped.Class8;
import net.hachimi.HACHIMI_CLIENT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.WorldChunk;

@HACHIMI_CLIENT(mv=100, d1={"\u4c82\u4c80\u4c86\u4c8c\u4c85\u4c82\u4c87\u4c8d", "\u27f7\u27fb\u27ff\u27f8\u27f8\u27fd\u27f7", "\u9865\u9865\u9866\u9863\u9867\u9865\u9863\u9864", "\ubc96\ubc96\ubc94\ubc97\ubc94\ubc96\ubc9a\ubc91", "\ua827\ua827\ua822\ua822\ua826\ua821\ua823\ua824", "\ud962\ud963\ud964\ud963\ud96f\ud962\ud966\ud967", "\u9c16\u9c1f\u9c17\u9c15\u9c11\u9c16\u9c1f\u9c1e", "\u9322\u9321\u9322\u9324\u932d\u932d\u9324\u932d", "\ude84\ude8c\ude85\ude8b\ude8e\ude8d\ude89", "\ue84e\ue843\ue84e\ue849\ue848\ue848\ue84c\ue84d", "\u9529\u9527\u952b\u952f\u9526\u9529\u952e\u952e", "\u84ea\u84ea\u84eb\u84ef\u84ef\u84e1\u84e8\u84ec", "\ua2ef\ua2ec\ua2eb\ua2ec\ua2ef\ua2ef\ua2e9\ua2ed", "\u9238\u923d\u923c\u923f\u9239\u9235\u923f\u923b", "\ua2f2\ua2f8\ua2fa\ua2fa\ua2f3\ua2f2\ua2f9", "\u4adb\u4add\u4add\u4ad0\u4ade\u4ad8\u4ad9\u4add", "\uc2ac\uc2ad\uc2ac\uc2ac\uc2a9\uc2a4\uc2a8\uc2a9", "\uc7a8\uc7ab\uc7ab\uc7a9\uc7aa\uc7ae\uc7a9\uc7ab", "\u49d9\u49dc\u49de\u49dc\u49dd\u49d2\u49da\u49dc", "\u1585\u1584\u1582\u1586\u1582\u1583\u1580\u1580", "\u5851\u5853\u585d\u5856\u5851\u5851\u5856\u5854", "\u5435\u5438\u5432\u5438\u5435\u5433\u5434\u5439", "\u2b20\u2b25\u2b27\u2b24\u2b22\u2b20\u2b2d\u2b25", "\uc7cc\uc7c8\uc7c8\uc7c0\uc7ca", "\u1811\u1819\u1817\u1817\u1819\u1811\u1810\u1810", "\u57ee\u57e9\u57ea\u57e2\u57e8\u57e8\u57ea\u57eb", "\u04d4\u04d7\u04d7\u04d6\u04d0\u04de\u04df\u04d4", "\u8a07\u8a05\u8a05\u8a01\u8a00\u8a07\u8a03\u8a06", "\u3d71\u3d76\u3d77\u3d77\u3d7a\u3d75\u3d76\u3d70", "\u4d52\u4d57\u4d55\u4d55\u4d51\u4d54\u4d51\u4d51", "\u87f2\u87f4\u87f6\u87f4\u87f4\u87f2\u87f2\u87f5", "\ubb03\ubb09\ubb07\ubb01\ubb02\ubb08\ubb08\ubb02"}, d2={"\u0224\u0271\u0276\u0271\u026c\u0226\u0224\u0226\u0230\u0254\u0276\u027d\u026c\u0237\u0275\u0271\u0276\u027d\u027b\u026a\u0279\u027e\u026c\u0237\u027b\u0274\u0279\u026b\u026b\u0247\u022a\u0220\u0229\u0220\u0223\u0231\u024e", "\u0763\u075e\u2725\u0717\u0715\u0703\u0767\u0745\u074e\u075f\u0704\u0746\u0742\u0745\u074e\u0748\u0759\u074a\u074d\u075f\u0704\u0748\u0747\u074a\u0758\u0758\u0774\u0719\u0718\u0718\u0713\u0710\u0702\u0771", "\u0744\u077a\u2702\u0730\u0732\u0724\u0746\u0725\u075a", "\u0507\u0558\u0557\u0552\u0555\u0552\u054f\u0505\u0507\u0505\u0513\u0512\u056d", "\u07ab\u0794\u27ed\u07df\u07dd\u07cb\u07aa\u07aa\u07af\u078d\u0786\u0797\u07cc\u078b\u0782\u0780\u078b\u078a\u078e\u078a\u07cc\u0780\u078f\u078a\u0786\u078d\u0797\u07cc\u07e3\u078b\u0782\u0780\u078b\u078a\u078e\u078a\u0780\u078f\u078a\u0786\u078d\u0797\u07c7\u07b0\u07ab\u07d8\u07af\u078d\u0786\u0797\u07cc\u078b\u0782\u0780\u078b\u078a\u078e\u078a\u07cc\u0780\u078f\u078a\u0786\u078d\u0797\u07cc\u07e3\u078b\u0782\u0780\u078b\u078a\u078e\u078a\u0780\u078f\u078a\u0786\u078d\u0797\u07c7\u0788\u07ae\u07d8\u07ca\u07aa", "\u065f\u066f\u2619\u062b\u0629\u063f\u065e\u065e\u065b\u0679\u0672\u0663\u0638\u067f\u0676\u0674\u067f\u067e\u067a\u067e\u0638\u0674\u067b\u067e\u0672\u0679\u0663\u0638\u0617\u067f\u0676\u0674\u067f\u067e\u067a\u067e\u0674\u067b\u067e\u0672\u0679\u0663\u0633\u0676\u0670\u0674\u062c\u065b\u0679\u0672\u0663\u0638\u067f\u0676\u0674\u067f\u067e\u067a\u067e\u0638\u0674\u067b\u067e\u0672\u0679\u0663\u0638\u0617\u067f\u0676\u0674\u067f\u067e\u067a\u067e\u0674\u067b\u067e\u0672\u0679\u0663\u0633\u0678\u064f\u062c\u063e\u065e", "\u0312\u0347\u0340\u0347\u035a\u0310\u0312\u0310\u0306\u0307\u0378", "\u0130\u012e\u0133\u2153\u0161\u0163\u0175\u0174\u0107", "\u079a\u0784\u0798\u27f9\u07cb\u07c9\u07df\u07de\u07ad", "\u04db\u04c5\u04c6\u24b8\u048a\u0488\u049e\u04ec\u049f\u04e0", "\u01d0\u01ce\u01cc\u21b3\u0181\u0183\u0195\u0194\u01eb", "\u03e6\u03f8\u03f9\u2385\u03b7\u03b5\u03a3\u03c1\u03a2\u03dd", "\u0707\u0758\u0757\u0752\u0755\u0752\u074f\u0705\u0707\u0705\u0713\u0712\u076d", "\u01c7\u01d9\u01d9\u21a4\u0196\u0194\u0182\u01e6\u01c4\u01cf\u01de\u0185\u01c2\u01cb\u01c9\u01c2\u01c3\u01c7\u01c3\u0185\u01c9\u01c6\u01c3\u01cf\u01c4\u01de\u0185\u01aa\u01c2\u01cb\u01c9\u01c2\u01c3\u01c7\u01c3\u01c9\u01c6\u01c3\u01cf\u01c4\u01de\u018e\u01f0\u01e7\u0191\u0183\u01f0", "win\u2014&$2Vt\u007fn5r{yrsws5yvs\u007ftn5\u001ar{yrswsyvs\u007ftn>@W!3@", "\u04ca\u04d4\u04d2\u24a9\u049b\u0499\u048f\u04eb\u04c9\u04c2\u04d3\u0488\u04cf\u04c6\u04c4\u04cf\u04ce\u04ca\u04ce\u0488\u04c4\u04cb\u04ce\u04c2\u04c9\u04d3\u0488\u04a7\u04cf\u04c6\u04c4\u04cf\u04ce\u04ca\u04ce\u04c4\u04cb\u04ce\u04c2\u04c9\u04d3\u0483\u04fd\u04ea\u049c\u048e\u04fd", "\u06eb\u06f5\u06f0\u2688\u06ba\u06b8\u06ae\u06c2\u06c2\u06c2\u06c2\u06af\u06d0", "\u050c\u0512\u0516\u256f\u055d\u055f\u0549\u0528\u0528\u052d\u050f\u0504\u0515\u054e\u0509\u0500\u0502\u0509\u0508\u050c\u0508\u054e\u0502\u050d\u0508\u0504\u050f\u0515\u054e\u0561\u0509\u0500\u0502\u0509\u0508\u050c\u0508\u0502\u050d\u0508\u0504\u050f\u0515\u0545\u0513\u0529\u055a\u052d\u050f\u0504\u0515\u054e\u0509\u0500\u0502\u0509\u0508\u050c\u0508\u054e\u0502\u050d\u0508\u0504\u050f\u0515\u054e\u0561\u0509\u0500\u0502\u0509\u0508\u050c\u0508\u0502\u050d\u0508\u0504\u050f\u0515\u0545\u0538\u0525\u055a\u0548\u0528", "\u01a7\u01b9\u01b2\u21c4\u01f6\u01f4\u01e2\u01e3\u019c", "\u06b6\u06e3\u06e4\u06e3\u06fe\u06b4\u06b6\u06b4\u06a2\u06a3\u06dc", "\u00b6\u00b4\u00a5\u0092\u00bd\u00b0\u00a2\u00a2\u00ed\u00ef\u00f9\u00f8\u009d\u00bb\u00b0\u00a7\u00b0\u00fe\u00bd\u00b0\u00bf\u00b6\u00fe\u0092\u00bd\u00b0\u00a2\u00a2\u00ea", "\u07fe\u07f7\u07e5\u07fe\u07d5\u07f9\u07f2\u07f3\u07aa\u07a8\u07be\u07bf\u07df", "\u0242\u0256\u0252\u0246\u024b\u0254\u021b\u0219\u020f\u026b\u024d\u0246\u0251\u0246\u0208\u024b\u0246\u0249\u0240\u0208\u0268\u0245\u024d\u0242\u0244\u0253\u021c\u020e\u027d", "\u0210\u021f\u021c\u021d\u0216\u024f\u024d\u025b\u025a\u023f\u0219\u0212\u0205\u0212\u025c\u021f\u0212\u021d\u0214\u025c\u023c\u0211\u0219\u0216\u0210\u0207\u0248", "\u0365\u037e\u0342\u0365\u0363\u0378\u037f\u0376\u032d\u032f\u0339\u0338\u035d\u037b\u0370\u0367\u0370\u033e\u037d\u0370\u037f\u0376\u033e\u0342\u0365\u0363\u0378\u037f\u0376\u032a", "\u00c2\u00c3\u00d8\u00c5\u00ca\u00d5\u0090\u0092\u0084\u0085\u00fa", "\u045c\u045d\u0446\u045b\u0454\u044b\u0473\u045e\u045e\u040e\u040c\u041a\u041b\u0464", "\u04a7\u04b1\u04b9\u04a4\u04ec\u04ee\u04f8\u04f9\u0486", "\u00be\u00a8\u00a0\u00bd\u00f5\u00f7\u00e1\u0083\u00e0\u009f", "\u04f1\u04e7\u04ef\u04f2\u04b6\u04ba\u04b8\u04ae\u04cc\u04af\u04d0", "\u01f6\u01e0\u01e8\u01f5\u01bd\u01bf\u01a9\u01cb\u01c8\u01a8\u01d7", "\u079d\u0792\u0795\u079a\u0797\u0792\u0781\u079e\u07c7\u07c5\u07d3\u07d2\u07ad"})
public class Class146
extends Class8 {
    private static long[] field190 = new long[3];
    private final class_2818 field191;

    public boolean method282(class_2338 a2) {
        int n2;
        int b2 = a2.method_10263() >> (int)field190[0];
        int c2 = a2.method_10260() >> (int)field190[0];
        if (b2 == this.field191.method_12004().field_9181) {
            if (c2 != this.field191.method_12004().field_9180) {
                return Velocity.method10252();
            }
            n2 = (int)field190[1];
        } else {
            n2 = (int)field190[2];
        }
        return n2 != 0;
    }

    private static String IXfv2AqqaO8keGX3(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    private static void method283(long l2) {
        Class146.field190[1] = l2 ^ 0x9DFE2B05F2EAD664L;
        Class146.field190[0] = l2 ^ 0x9DFE2B05F2EAD661L;
        Class146.field190[2] = l2 ^ 0x9DFE2B05F2EAD665L;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite ziOjnyF7eJrNVL(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class146.IXfv2AqqaO8keGX3(k2, -1364036857));
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
                int a2 = Integer.parseInt(Class146.IXfv2AqqaO8keGX3(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class146.IXfv2AqqaO8keGX3(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class146.IXfv2AqqaO8keGX3(k2, -1364036857) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n3 = n2 != 1 ? 47531 : 47530;
        block7: while (true) {
            switch (n3) {
                case 47531: {
                    n3 = 47529;
                    continue block7;
                }
                case 47530: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        Class146.method283(-7062159861120051611L);
    }

    public Class146(class_2818 a2) {
        this.field191 = a2;
    }
}

