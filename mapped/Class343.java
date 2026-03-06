/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class248;
import mapped.Class252;
import mapped.Class278;
import mapped.Class556;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class343
extends Class278 {
    Class248 field986 = this.method450(new Class252("Delay", "The delay between reconnects to a server", (int)field987[0], (int)field987[1], (int)field987[2]));
    private static long[] field987 = new long[3];

    public static CallSite JJ5Mjb6ChKb0BPw9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class343.S94Yr9YLJobOj7F7(string7), Class343.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class343.S94Yr9YLJobOj7F7(string5)), Class343.S94Yr9YLJobOj7F7(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class343.S94Yr9YLJobOj7F7(string5)), Class343.S94Yr9YLJobOj7F7(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String S94Yr9YLJobOj7F7(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x56D722C3));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public Class343() {
        super("AutoReconnect", "Automatically reconnects to a server immediately after disconnecting", Class556.field2756);
    }

    public int method3774() {
        return (Integer)this.field986.method507();
    }

    static {
        Class343.method3775(-1093305282285533573L);
    }

    private static void method3775(long l2) {
        Class343.field987[1] = l2 ^ 0xF0D3CCA36A50067EL;
        Class343.field987[2] = l2 ^ 0xF0D3CCA36A50061FL;
        Class343.field987[0] = l2 ^ 0xF0D3CCA36A50067BL;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

