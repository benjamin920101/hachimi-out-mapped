/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import mapped.Class1;
import mapped.Class1034;
import mapped.Class1405;
import mapped.Class3511;
import mapped.Class522;
import mapped.Class690;
import net.hachimi.HACHIMI_CLIENT;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\uc77a\uc77f\uc770\uc77e\uc77c\uc779\uc77b\uc77d", "\u20b3\u20b2\u20b6\u20b4\u20b5\u20b5\u20b5\u20b6", "\uc83a\uc83d\uc839\uc839\uc83a\uc838\uc835\uc83a", "\u3096\u3092\u3092\u3091\u3096\u3095\u3097\u3096", "\u2d1c\u2d18\u2d18\u2d19\u2d10\u2d1f\u2d11", "\u32af\u32aa\u32a9\u32a6\u32ad\u32ae\u32a7\u32aa", "\u02b0\u02b0\u02b4\u02b1\u02b0\u02b1\u02b2\u02b0", "\u0c7d\u0c7a\u0c7e\u0c7a\u0c7e\u0c7e\u0c7c\u0c75", "\u39f2\u39f6\u39f7\u39f5\u39f5\u39f8\u39f7\u39f7", "\u7357\u7351\u735d\u7350\u7356\u7350\u7355\u7355", "\u9154\u9155\u9157\u9155\u9156\u915a\u9157\u9154", "\ua028\ua02f\ua02f\ua027\ua02f\ua02f\ua02d\ua02c", "\ue7ca\ue7cc\ue7c9\ue7c8\ue7cf\ue7c9\ue7cb\ue7c7", "\u6d7d\u6d77\u6d7b\u6d76\u6d79\u6d7d\u6d7d\u6d76", "\u26c2\u26c0\u26c5\u26c1\u26c6\u26cc\u26c2\u26c5", "\u09eb\u09ea\u09e6\u09ed\u09ef\u09e6\u09e8\u09eb", "\u6cc7\u6cc0\u6cc6\u6cc3\u6cc9\u6cc8\u6cc5\u6cc0", "\uc1c1\uc1c7\uc1ca\uc1c2\uc1c7\uc1cb\uc1cb", "\u5ed4\u5ed4\u5edf\u5ed4\u5edb\u5edf\u5eda", "\u3f72\u3f74\u3f72\u3f71\u3f71\u3f74\u3f77", "\ubb58\ubb5f\ubb5a\ubb5c\ubb5f\ubb5a\ubb5f\ubb5b", "\u400e\u4006\u400a\u400a\u400e\u400e\u400b\u400c", "\ud4a3\ud4a0\ud4a9\ud4a0\ud4a4\ud4a9\ud4a4\ud4a2", "\u5105\u5102\u5108\u5104\u5107\u5108\u5104\u5103", "\u9208\u920e\u920d\u920b\u9201\u9209\u920e\u920e", "\ua233\ua233\ua23f\ua235\ua23f\ua234\ua233\ua234", "\u761f\u761a\u7611\u7618\u761c\u761e\u7610\u761f", "\ud8d6\ud8d5\ud8df\ud8d7\ud8d7\ud8d0\ud8d5\ud8d2", "\u5446\u5441\u5446\u5447\u5444\u5445\u5440", "\u395b\u3951\u3950\u395c\u3950\u395a\u3950\u3950", "\ue68b\ue688\ue688\ue68d\ue686\ue68c\ue68c\ue68e"}, d2={"\u0005PWPM\u0007\u0005\u0007\u0011uW\\M\u0016QXZQPTP\u0016ZUP\\WM\u00169QXZQPTPZUP\\WM\u001dhP\u0002uSXOX\u0016UXW^\u0016zUXJJ\u0002uSXOX\u0016UXW^\u0016v[S\\ZM\u0002uSXOX\u0016UXW^\u0016K\\_U\\ZM\u0016t\\MQV]\u0002\u0010o", "\u0725\u0727\u0715\u274c\u077e\u077c\u076a\u070e\u0728\u0723\u0734\u0723\u076d\u072e\u0723\u072c\u0725\u076d\u070d\u0720\u0728\u0727\u0721\u0736\u0779\u076b\u0714", "\u052d\u052f\u0512\u2544\u0576\u0574\u0562\u0563\u0506\u0520\u052b\u053c\u052b\u0565\u0526\u052b\u0524\u052d\u0565\u0509\u0526\u052b\u0539\u0539\u0571", "\u0673\u0671\u064d\u261a\u0628\u062a\u063c\u063d\u065d", "\u02cd\u02cf\u02f0\u22a4\u0296\u0294\u0282\u0283\u02f0", "\u012f\u0170\u017f\u017a\u017d\u017a\u0167\u012d\u012f\u012d\u013b\u013a\u0145", "\u078e\u07bd\u07a4\u27e5\u07d7\u07d5\u07c3\u07a1\u07c2\u07bd", "\u0515\u0526\u0520\u257e\u054c\u054e\u0558\u053c\u051e\u0515\u0504\u055f\u0518\u0511\u0513\u0518\u0519\u051d\u0519\u055f\u0513\u051c\u0519\u0515\u051e\u0504\u055f\u0570\u0518\u0511\u0513\u0518\u0519\u051d\u0519\u0513\u051c\u0519\u0515\u051e\u0504\u0554\u0511\u0518\u0535\u054b\u0559\u053c\u051a\u0511\u0506\u0511\u055f\u051c\u0511\u051e\u0517\u055f\u0533\u051c\u0511\u0503\u0503\u054b", "\u028e\u02bd\u02ba\u22e5\u02d7\u02d5\u02c3\u02a7\u0285\u028e\u029f\u02c4\u0283\u028a\u0288\u0283\u0282\u0286\u0282\u02c4\u0288\u0287\u0282\u028e\u0285\u029f\u02c4\u02eb\u0283\u028a\u0288\u0283\u0282\u0286\u0282\u0288\u0287\u0282\u028e\u0285\u029f\u02cf\u028a\u0283\u02ae\u02d0\u02c2\u02a2", "\u00f9\u00ca\u00ce\u2092\u00a0\u00a2\u00b4\u00d5\u00d5\u00d0\u00f2\u00f9\u00e8\u00b3\u00f4\u00fd\u00ff\u00f4\u00f5\u00f1\u00f5\u00b3\u00ff\u00f0\u00f5\u00f9\u00f2\u00e8\u00b3\u009c\u00f4\u00fd\u00ff\u00f4\u00f5\u00f1\u00f5\u00ff\u00f0\u00f5\u00f9\u00f2\u00e8\u00b8\u00fd\u00f8\u00db\u00a7\u00d0\u00f2\u00f9\u00e8\u00b3\u00f4\u00fd\u00ff\u00f4\u00f5\u00f1\u00f5\u00b3\u00ff\u00f0\u00f5\u00f9\u00f2\u00e8\u00b3\u009c\u00f4\u00fd\u00ff\u00f4\u00f5\u00f1\u00f5\u00ff\u00f0\u00f5\u00f9\u00f2\u00e8\u00b8\u00d2\u00f7\u00a7\u00b5\u00d5", "\u041c\u042f\u042a\u2477\u0445\u0447\u0451\u0430\u0430\u0435\u0417\u041c\u040d\u0456\u0411\u0418\u041a\u0411\u0410\u0414\u0410\u0456\u041a\u0415\u0410\u041c\u0417\u040d\u0456\u0479\u0411\u0418\u041a\u0411\u0410\u0414\u0410\u041a\u0415\u0410\u041c\u0417\u040d\u045d\u0438\u0433\u0442\u0435\u0417\u041c\u040d\u0456\u0411\u0418\u041a\u0411\u0410\u0414\u0410\u0456\u041a\u0415\u0410\u041c\u0417\u040d\u0456\u0479\u0411\u0418\u041a\u0411\u0410\u0414\u0410\u041a\u0415\u0410\u041c\u0417\u040d\u045d\u0437\u0412\u0442\u0450\u0430", "\u035a\u0369\u036b\u2331\u0303\u0301\u0317\u0376\u0376\u0373\u0351\u035a\u034b\u0310\u0357\u035e\u035c\u0357\u0356\u0352\u0356\u0310\u035c\u0353\u0356\u035a\u0351\u034b\u0310\u033f\u0357\u035e\u035c\u0357\u0356\u0352\u0356\u035c\u0353\u0356\u035a\u0351\u034b\u031b\u0365\u036d\u0304\u0373\u0351\u035a\u034b\u0310\u0357\u035e\u035c\u0357\u0356\u0352\u0356\u0310\u035c\u0353\u0356\u035a\u0351\u034b\u0310\u033f\u0357\u035e\u035c\u0357\u0356\u0352\u0356\u035c\u0353\u0356\u035a\u0351\u034b\u031b\u037c\u0376\u0304\u0316\u0376", "\u0356\u0365\u0366\u233d\u030f\u030d\u031b\u037f\u035d\u0356\u0347\u031c\u035b\u0352\u0350\u035b\u035a\u035e\u035a\u031c\u0350\u035f\u035a\u0356\u035d\u0347\u031c\u0333\u035b\u0352\u0350\u035b\u035a\u035e\u035a\u0350\u035f\u035a\u0356\u035d\u0347\u0317\u0352\u035b\u0376\u0308\u031a\u037a", "\u0433\u0400\u0400\u2458\u046a\u0468\u047e\u041f\u041f\u041a\u0438\u0433\u0422\u0479\u043e\u0437\u0435\u043e\u043f\u043b\u043f\u0479\u0435\u043a\u043f\u0433\u0438\u0422\u0479\u0456\u043e\u0437\u0435\u043e\u043f\u043b\u043f\u0435\u043a\u043f\u0433\u0438\u0422\u0472\u040c\u0439\u046d\u041a\u0438\u0433\u0422\u0479\u043e\u0437\u0435\u043e\u043f\u043b\u043f\u0479\u0435\u043a\u043f\u0433\u0438\u0422\u0479\u0456\u043e\u0437\u0435\u043e\u043f\u043b\u043f\u0435\u043a\u043f\u0433\u0438\u0422\u0472\u0424\u041d\u046d\u047f\u041f", "\u0134\u0161\u0166\u0161\u017c\u0136\u0134\u0136\u0120\u0121\u015e", "\u0395\u0397\u0386\u03b1\u039e\u0393\u0381\u0381\u03ce\u03cc\u03da\u03db\u03be\u0398\u0393\u0384\u0393\u03dd\u039e\u0393\u039c\u0395\u03dd\u03b1\u039e\u0393\u0381\u0381\u03c9", "\u05e0\u05e9\u05fb\u05e0\u05cb\u05e7\u05ec\u05ed\u05b4\u05b6\u05a0\u05a1\u05c1", "\u00a5\u00b1\u00b5\u00a1\u00ac\u00b3\u00fc\u00fe\u00e8\u008c\u00aa\u00a1\u00b6\u00a1\u00ef\u00ac\u00a1\u00ae\u00a7\u00ef\u008f\u00a2\u00aa\u00a5\u00a3\u00b4\u00fb\u00e9\u009a", "\u0757\u0758\u075b\u075a\u0751\u0708\u070a\u071c\u071d\u0778\u075e\u0755\u0742\u0755\u071b\u0758\u0755\u075a\u0753\u071b\u077b\u0756\u075e\u0751\u0757\u0740\u070f", "\u0140\u015b\u0167\u0140\u0146\u015d\u015a\u0153\u0108\u010a\u011c\u011d\u0178\u015e\u0155\u0142\u0155\u011b\u0158\u0155\u015a\u0153\u011b\u0167\u0140\u0146\u015d\u015a\u0153\u010f", "\u0585\u0584\u059f\u0582\u058d\u0592\u05d7\u05d5\u05c3\u05c2\u05bd", "#\"9$+4\f!!qsed\u001b", "\u063d\u062b\u0623\u063e\u0676\u0674\u0662\u0663\u061c", "\u0527\u0531\u0539\u0524\u056c\u056e\u0578\u051a\u0579\u0506", "\u0092\u0084\u008c\u0091\u00d5\u00d9\u00db\u00cd\u00af\u00cc\u00b3", "\u034e\u0358\u0350\u034d\u0305\u0307\u0311\u0373\u0370\u0310\u036f", "\u05c3\u05cc\u05cb\u05c4\u05c9\u05cc\u05df\u05c0\u0599\u059b\u058d\u058c\u05f3", "\u06e1\u06e3\u06d1\u2688\u06ba\u06b8\u06ae\u06ca\u06ec\u06e7\u06f0\u06e7\u06a9\u06ea\u06e7\u06e8\u06e1\u06a9\u06c9\u06e4\u06ec\u06e3\u06e5\u06f2\u06bd\u06af\u06d0", "\u00db\u00d9\u00e4\u20b2\u0080\u0082\u0094\u0095\u00f0\u00d6\u00dd\u00ca\u00dd\u0093\u00d0\u00dd\u00d2\u00db\u0093\u00ff\u00d0\u00dd\u00cf\u00cf\u0087", "\u02bb\u02b9\u0285\u22d2\u02e0\u02e2\u02f4\u02f5\u0295", "\u037e\u037c\u0343\u2317\u0325\u0327\u0331\u0330\u0343"})
public class Class3510
implements Class3511 {
    private final boolean field7731;
    private Consumer field7732;
    private final Class field7733;
    private final int field7734;
    private static long[] field7735 = new long[3];
    private static Method field7736;

    private static int method17723(Class3510 class3510) {
        return Class3510.method17724(class3510);
    }

    public static int method17724(Class3510 class3510) {
        return class3510.field7734;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Class3510(Class1405 j2, Class k2, Object l2, Method m2) {
        this.field7733 = m2.getParameters()[(int)field7735[0]].getType();
        this.field7731 = Modifier.isStatic(m2.getModifiers());
        this.field7734 = m2.getAnnotation(Class1.class).priority();
        try {
            MethodType g2;
            MethodHandle f2;
            String c2 = m2.getName();
            MethodHandles.Lookup d2 = j2.create(field7736, k2);
            MethodType e2 = MethodType.methodType(Void.TYPE, m2.getParameters()[(int)field7735[0]].getType());
            if (this.field7731) {
                MethodHandle a2 = d2.findStatic(k2, c2, e2);
                MethodType b2 = MethodType.methodType(Consumer.class);
            } else {
                f2 = d2.findVirtual(k2, c2, e2);
                g2 = MethodType.methodType(Consumer.class, k2);
            }
            MethodHandle h2 = LambdaMetafactory.metafactory(d2, "accept", g2, MethodType.methodType(Void.TYPE, Object.class), f2, e2).getTarget();
            if (this.field7731) {
                throw null;
            }
            int n2 = 52159;
            block6: while (true) {
                switch (n2) {
                    case 52159: {
                        n2 = 52157;
                        continue block6;
                    }
                    case 52158: {
                        this.field7732 = h2.invoke();
                        return;
                    }
                }
                break;
            }
            this.field7732 = h2.invoke(l2);
            return;
        }
        catch (Throwable i2) {
            i2.printStackTrace();
        }
    }

    static {
        Class3510.method17728(-1717415498225399039L);
        try {
            Class[] classArray = new Class[(int)field7735[2]];
            classArray[(int)Class3510.field7735[0]] = Class.class;
            classArray[(int)Class3510.field7735[1]] = MethodHandles.Lookup.class;
            field7736 = MethodHandles.class.getDeclaredMethod("privateLookupIn", classArray);
        }
        catch (NoSuchMethodException a2) {
            a2.printStackTrace();
        }
    }

    public static Class method17725(Class3510 class3510) {
        return class3510.field7733;
    }

    @Override
    public Class method17726() {
        return Class3510.method17725(this);
    }

    private static int method17727(int n2, int n3, Class690 class690, Class522 class522) {
        return Class1034.method12844(n2, n3, class690, class522);
    }

    private static void method17728(long l2) {
        Class3510.field7735[2] = l2 ^ 0xE82A83B420864B03L;
        Class3510.field7735[1] = l2 ^ 0xE82A83B420864B00L;
        Class3510.field7735[0] = l2 ^ 0xE82A83B420864B01L;
    }

    @Override
    public boolean method17729() {
        return this.field7731;
    }

    @Override
    public void method17730(Object a2) {
        this.field7732.accept(a2);
    }

    @Override
    public int method17731() {
        return Class3510.method17723(this);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

