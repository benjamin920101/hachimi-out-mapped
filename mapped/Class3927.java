/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class607;
import net.hachimi.HACHIMI_CLIENT;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u65d6\u65d1\u65d3\u65dd\u65dd\u65d7\u65d0\u65dc", "\uc084\uc089\uc088\uc089\uc088\uc085\uc083\uc087", "\u2e64\u2e6c\u2e65\u2e60\u2e66\u2e67", "\ub1c5\ub1cd\ub1cd\ub1c7\ub1c3\ub1c1\ub1cd\ub1c0", "\u2a44\u2a42\u2a40\u2a46\u2a41\u2a4f\u2a47\u2a47", "\u3659\u365d\u3658\u365d\u365d\u365a\u365e\u365f", "\u3828\u3827\u3826\u382f\u382b\u382f\u3829\u382e", "\uadef\uade9\uaded\uade9\uade8\uade4\uade5\uaded", "\u52c3\u52c9\u52c8\u52c7\u52c4\u52c8\u52c2\u52c4", "\uc339\uc332\uc33d\uc33c\uc33b\uc333\uc332\uc33a", "\u84d0\u84d6\u84d1\u84d1\u84d6\u84d6\u84d7\u84d3", "\u5d8d\u5d8b\u5d88\u5d80\u5d89\u5d8a\u5d8d\u5d80", "\u509b\u509b\u5096\u5097\u5099\u509e\u5096\u509f", "\uc7a8\uc7ac\uc7a9\uc7aa\uc7af\uc7ad\uc7ad\uc7ac", "\u5737\u5737\u5731\u573a\u5737\u573a\u5730"}, d2={"\u033c\u0363\u036c\u0369\u036e\u0369\u0374\u033e\u033c\u033e\u0328\u0329\u0356", "\u0562\u0571\u253c\u050e\u050c\u051a\u0578\u051b\u0564", "\u03e6\u03b3\u03b4\u03b3\u03ae\u03e4\u03e6\u03e4\u03f2\u03f3\u038c", "\u0487\u0485\u0494\u04a3\u048c\u0481\u0493\u0493\u04dc\u04de\u04c8\u04c9\u04ac\u048a\u0481\u0496\u0481\u04cf\u048c\u0481\u048e\u0487\u04cf\u04a3\u048c\u0481\u0493\u0493\u04db", "\u0233\u023a\u0228\u0233\u0218\u0234\u023f\u023e\u0267\u0265\u0273\u0272\u0212", "\u05cb\u05df\u05db\u05cf\u05c2\u05dd\u0592\u0590\u0586\u05e2\u05c4\u05cf\u05d8\u05cf\u0581\u05c2\u05cf\u05c0\u05c9\u0581\u05e1\u05cc\u05c4\u05cb\u05cd\u05da\u0595\u0587\u05f4", "\u06eb\u06e4\u06e7\u06e6\u06ed\u06b4\u06b6\u06a0\u06a1\u06c4\u06e2\u06e9\u06fe\u06e9\u06a7\u06e4\u06e9\u06e6\u06ef\u06a7\u06c7\u06ea\u06e2\u06ed\u06eb\u06fc\u06b3", "\u027b\u0260\u025c\u027b\u027d\u0266\u0261\u0268\u0233\u0231\u0227\u0226\u0243\u0265\u026e\u0279\u026e\u0220\u0263\u026e\u0261\u0268\u0220\u025c\u027b\u027d\u0266\u0261\u0268\u0234", "\u0759\u0758\u0743\u075e\u0751\u074e\u070b\u0709\u071f\u071e\u0761", "-,7*%:\u0002//\u007f}kj\u0015", "\u03c9\u03df\u03d7\u03ca\u0382\u0380\u0396\u0397\u03e8", "\u0322\u0334\u033c\u0321\u0369\u036b\u037d\u031f\u037c\u0303", "\u05d1\u05c7\u05cf\u05d2\u0596\u059a\u0598\u058e\u05ec\u058f\u05f0", "\u00c1\u00d7\u00df\u00c2\u008a\u0088\u009e\u00fc\u00ff\u009f\u00e0", "\u0278\u0277\u0270\u027f\u0272\u0277\u0264\u027b\u0222\u0220\u0236\u0237\u0248"})
class Class3927 {
    static final int[] field8937;
    private static long[] field8938;

    static {
        field8938 = new long[3];
        Class3927.method19326(-6136141566537758244L);
        field8937 = new int[Class607.values().length];
        try {
            Class3927.field8937[Class607.field2955.ordinal()] = (int)field8938[0];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class3927.field8937[Class607.field2953.ordinal()] = (int)field8938[2];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class3927.field8937[Class607.field2954.ordinal()] = (int)field8938[1];
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    private static void method19326(long l2) {
        Class3927.field8938[2] = l2 ^ 0xAAD80BC1830209DEL;
        Class3927.field8938[1] = l2 ^ 0xAAD80BC1830209DFL;
        Class3927.field8938[0] = l2 ^ 0xAAD80BC1830209DDL;
    }

    private static String lKr4wlpaJfuFNNSI(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x1901C403));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static CallSite Tf8P0xFSII69dSg6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class3927.lKr4wlpaJfuFNNSI(string7), Class3927.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class3927.lKr4wlpaJfuFNNSI(string5)), Class3927.lKr4wlpaJfuFNNSI(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class3927.lKr4wlpaJfuFNNSI(string5)), Class3927.lKr4wlpaJfuFNNSI(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

