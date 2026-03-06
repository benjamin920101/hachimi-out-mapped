/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class3979;
import mapped.Class489;
import mapped.Class5659;
import net.hachimi.HACHIMI_CLIENT;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u0286\u0286\u028f\u0282\u0285\u0282\u0284\u028f", "\u3216\u321e\u321f\u3213\u3212\u3214\u3215\u3217", "\ubcc9\ubccf\ubcc2\ubccb\ubcc9\ubcca\ubccd", "\u5e8e\u5e8b\u5e81\u5e8e\u5e80\u5e8c\u5e8f", "\ub4a7\ub4a3\ub4a7\ub4ac\ub4ac\ub4a0\ub4a2\ub4a3", "\u05de\u05d5\u05d5\u05df\u05d2\u05df\u05d6", "\u7752\u7750\u7759\u7756\u7751\u7759\u7753", "\uc3c5\uc3c6\uc3c0\uc3cf\uc3cf\uc3c3\uc3c0\uc3c5", "\ucac6\ucac7\ucac4\ucacb\ucac7\ucacb\ucac0\ucacb", "\u036f\u0364\u0365\u0364\u0365\u0369\u036a\u0368", "\ubd5f\ubd5a\ubd5f\ubd5b\ubd5b\ubd5d\ubd59\ubd5f", "\u8dbe\u8dbc\u8dba\u8db8\u8dbe\u8db5\u8db9\u8db4", "\ue3bc\ue3be\ue3be\ue3be\ue3b7\ue3b6\ue3ba\ue3b7", "\u566f\u566d\u566d\u5668\u566c\u5666\u5669\u5666", "\u0de8\u0de2\u0de3\u0def\u0dec\u0dea\u0de3\u0deb", "\u3772\u3777\u3771\u377e\u3770\u3776\u3772\u377f", "\u0b50\u0b50\u0b52\u0b50\u0b59\u0b56\u0b55\u0b52", "\ue521\ue52f\ue527\ue520\ue525\ue520\ue523\ue526", "\u1cc7\u1cce\u1cc4\u1ccf\u1cc7\u1cc2\u1cc7\u1cc5", "\u2a8c\u2a88\u2a89\u2a8c\u2a8d\u2a8b\u2a8b\u2a8d", "\u338b\u338a\u3383\u338d\u338b\u338d\u3389\u338a", "\u9175\u9177\u9171\u9176\u9175\u9176\u9175\u9177", "\u9df0\u9df2\u9df0\u9df3\u9dff\u9df1\u9df5\u9df3", "\u97f1\u97f2\u97f1\u97f1\u97fc\u97f0\u97f0\u97f1", "\u07cc\u07ca\u07cf\u07c9\u07ca\u07ca\u07cd\u07c8", "\u0cbb\u0cbd\u0cbe\u0cbf\u0cbf\u0cb0\u0cbd\u0cb9", "\u347f\u3479\u3478\u347a\u347c\u347c\u3478\u347c"}, d2={"\u019b\u01ce\u01c9\u01ce\u01d3\u0199\u019b\u0199\u018f\u01ed\u018e\u01f1", "Gy[\u2022\u0010\u0012\u0004\u0005z", "\u0773\u074d\u0760\u2716\u0724\u0726\u0730\u0731\u0742", "\u04ae\u0490\u04bc\u24cb\u04f9\u04fb\u04ed\u04ec\u048f", "\u05ec\u05d2\u05fd\u2589\u05bb\u05b9\u05af\u05cd\u05ae\u05d1", "`^J\u200575#\"O", "\u0329\u0317\u0300\u234c\u037e\u037c\u036a\u030e\u032c\u0327\u0336\u036d\u032a\u0323\u0321\u032a\u032b\u032f\u032b\u036d\u0321\u032e\u032b\u0327\u032c\u0336\u036d\u0342\u032a\u0323\u0321\u032a\u032b\u032f\u032b\u0321\u032e\u032b\u0327\u032c\u0336\u0366\u0323\u0326\u0306\u0379\u036b\u0306", "\u0673\u064d\u065b\u2616\u0624\u0626\u0630\u0652\u0631\u064e", "F\u0019\u0016\u0013\u0014\u0013\u000eDFDRS,", "\u0529\u0517\u0506\u254c\u057e\u057c\u056a\u056b\u0518", "\u06d5\u06eb\u06fb\u26b0\u0682\u0680\u0696\u06f7\u06f7\u06f2\u06d0\u06db\u06ca\u0691\u06d6\u06df\u06dd\u06d6\u06d7\u06d3\u06d7\u0691\u06dd\u06d2\u06d7\u06db\u06d0\u06ca\u0691\u06be\u06d6\u06df\u06dd\u06d6\u06d7\u06d3\u06d7\u06dd\u06d2\u06d7\u06db\u06d0\u06ca\u069a\u06ef\u06ea\u0685\u06f2\u06d0\u06db\u06ca\u0691\u06d6\u06df\u06dd\u06d6\u06d7\u06d3\u06d7\u0691\u06dd\u06d2\u06d7\u06db\u06d0\u06ca\u0691\u06be\u06d6\u06df\u06dd\u06d6\u06d7\u06d3\u06d7\u06dd\u06d2\u06d7\u06db\u06d0\u06ca\u069a\u06df\u06c6\u06d1\u0685\u0697\u06f7", "\u0184\u01ba\u01a9\u21e1\u01d3\u01d1\u01c7\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01c6\u01ab", "\u01fb\u01c5\u01d7\u219e\u01ac\u01ae\u01b8\u01d9\u01d9\u01dc\u01fe\u01f5\u01e4\u01bf\u01f8\u01f1\u01f3\u01f8\u01f9\u01fd\u01f9\u01bf\u01f3\u01fc\u01f9\u01f5\u01fe\u01e4\u01bf\u0190\u01f8\u01f1\u01f3\u01f8\u01f9\u01fd\u01f9\u01f3\u01fc\u01f9\u01f5\u01fe\u01e4\u01b4\u01d2\u01fe\u01ab\u01dc\u01fe\u01f5\u01e4\u01bf\u01f8\u01f1\u01f3\u01f8\u01f9\u01fd\u01f9\u01bf\u01f3\u01fc\u01f9\u01f5\u01fe\u01e4\u01bf\u0190\u01f8\u01f1\u01f3\u01f8\u01f9\u01fd\u01f9\u01f3\u01fc\u01f9\u01f5\u01fe\u01e4\u01b4\u01c8\u01c8\u01ab\u01b9\u01d9", "\u077c\u0742\u075f\u2719\u072b\u0729\u073f\u075b\u0779\u0772\u0763\u0738\u077f\u0776\u0774\u077f\u077e\u077a\u077e\u0738\u0774\u077b\u077e\u0772\u0779\u0763\u0738\u0717\u077f\u0776\u0774\u077f\u077e\u077a\u077e\u0774\u077b\u077e\u0772\u0779\u0763\u0733\u0776\u0773\u0753\u072c\u0753\u073e\u0753", "\u00a8\u00fd\u00fa\u00fd\u00e0\u00aa\u00a8\u00aa\u00bc\u00bd\u00c2", "\u0362\u0360\u0371\u0346\u0369\u0364\u0376\u0376\u0339\u033b\u032d\u032c\u0349\u036f\u0364\u0373\u0364\u032a\u0369\u0364\u036b\u0362\u032a\u0346\u0369\u0364\u0376\u0376\u033e", "\u075c\u0755\u0747\u075c\u0777\u075b\u0750\u0751\u0708\u070a\u071c\u071d\u077d", "\u0404\u0410\u0414\u0400\u040d\u0412\u045d\u045f\u0449\u042d\u040b\u0400\u0417\u0400\u044e\u040d\u0400\u040f\u0406\u044e\u042e\u0403\u040b\u0404\u0402\u0415\u045a\u0448\u043b", "\u031d\u0312\u0311\u0310\u031b\u0342\u0340\u0356\u0357\u0332\u0314\u031f\u0308\u031f\u0351\u0312\u031f\u0310\u0319\u0351\u0331\u031c\u0314\u031b\u031d\u030a\u0345", "\u039e\u0385\u03b9\u039e\u0398\u0383\u0384\u038d\u03d6\u03d4\u03c2\u03c3\u03a6\u0380\u038b\u039c\u038b\u03c5\u0386\u038b\u0384\u038d\u03c5\u03b9\u039e\u0398\u0383\u0384\u038d\u03d1", "\u0345\u0344\u035f\u0342\u034d\u0352\u0317\u0315\u0303\u0302\u037d", "\u013e\u013f\u0124\u0139\u0136\u0129\u0111\u013c\u013c\u016c\u016e\u0178\u0179\u0106", "\u05b3\u05a5\u05ad\u05b0\u05f8\u05fa\u05ec\u05ed\u0592", "\u05cf\u05d9\u05d1\u05cc\u0584\u0586\u0590\u05f2\u0591\u05ee", "\u039b\u038d\u0385\u0398\u03dc\u03d0\u03d2\u03c4\u03a6\u03c5\u03ba", "\u077c\u076a\u0762\u077f\u0737\u0735\u0723\u0741\u0742\u0722\u075d", "\u013b\u0134\u0133\u013c\u0131\u0134\u0127\u0138\u0161\u0163\u0175\u0174\u010b"})
public class Class1736 {
    public long field6521;
    private static long[] field6522 = new long[2];
    private long field6523;

    public static CallSite G141h7LhR7oSvXXG(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class1736.gsKtbHNBb001CWCg(string7), Class1736.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class1736.gsKtbHNBb001CWCg(string5)), Class1736.gsKtbHNBb001CWCg(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class1736.gsKtbHNBb001CWCg(string5)), Class1736.gsKtbHNBb001CWCg(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    protected long method15499() {
        return System.currentTimeMillis() - this.field6523;
    }

    public void method15500() {
        this.field6523 = System.currentTimeMillis();
    }

    static {
        Class1736.method15506(-4057291652580607755L);
    }

    private static double method15501(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5659.method22181(d2, d3, d4, d5, d6, d7);
    }

    public Class1736(long a2) {
        this.field6521 = a2;
        this.method15500();
    }

    public double method15502(Class489 a2) {
        return Class1736.method15508(a2, this.method15505());
    }

    private static String gsKtbHNBb001CWCg(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xC208786D));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static boolean method15503() {
        return Class3979.method19543();
    }

    public boolean method15504() {
        return (this.method15499() >= this.field6521 ? (int)field6522[1] : (int)field6522[0]) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public double method15505() {
        int n2 = this.method15504() ? 2799 : 2800;
        block4: while (true) {
            switch (n2) {
                case 2800: {
                    n2 = 2798;
                    continue block4;
                }
                case 2799: {
                    return 1.0;
                }
            }
            break;
        }
        double d2 = (double)this.method15499() / (double)this.field6521;
        return d2;
    }

    private static void method15506(long l2) {
        Class1736.field6522[0] = l2 ^ 0xC7B19ABD09C678F5L;
        Class1736.field6522[1] = l2 ^ 0xC7B19ABD09C678F4L;
    }

    public void method15507(long a2) {
        this.field6521 = a2;
    }

    private static double method15508(Class489 class489, double d2) {
        return class489.method10803(d2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

