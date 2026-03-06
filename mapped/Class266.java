/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class262;
import mapped.Class263;
import mapped.Class265;
import mapped.Class489;
import mapped.Class5815;
import mapped.Class6283;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class Class266
extends Class263
implements Class265 {
    private static long[] field343 = new long[1];
    protected final Class262 field344;
    protected final Class6283 field345;

    public Class262 method792() {
        return this.field344;
    }

    public static CallSite FG6gnz3DPJ9SN3W4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class266.Dl7qQDUBmuxDAg61(string7), Class266.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class266.Dl7qQDUBmuxDAg61(string5)), Class266.Dl7qQDUBmuxDAg61(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class266.Dl7qQDUBmuxDAg61(string5)), Class266.Dl7qQDUBmuxDAg61(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Class266(Class262 a2, float b2, float c2, float d2, float e2) {
        this.field345 = new Class6283((boolean)field343[0], Class5815.field11335, Class489.field2543);
        this.field344 = a2;
        this.field340 = b2;
        this.field337 = c2;
        this.field341 = d2;
        this.field339 = e2;
    }

    @Override
    public abstract void method722(double var1, double var3, int var5);

    @Override
    public abstract void method646(int var1, int var2, int var3);

    @Override
    public abstract void method649(double var1, double var3, int var5);

    private static String Dl7qQDUBmuxDAg61(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xCFA4E215));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static void method793(long l2) {
        Class266.field343[0] = l2 ^ 0x290D9B4A32DE5B6DL;
    }

    static {
        Class266.method793(2958191273235602285L);
    }

    public Class266(Class262 a2) {
        this.field345 = new Class6283((boolean)field343[0], 150.0f, Class489.field2543);
        this.field344 = a2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

