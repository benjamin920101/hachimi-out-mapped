/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1503;
import mapped.Class1736;
import mapped.Class489;
import mapped.Class5636;
import mapped.Class5659;
import mapped.Class6405;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3336 {
    public double field7204;
    private static long[] field7205 = new long[1];
    public double field7206;
    private final Class1736 field7207 = new Class1736(field7205[0]);

    private static double method17141(float f2, float f3) {
        return Class1503.method14426(f2, f3);
    }

    public static double method17142(Class3336 class3336) {
        return class3336.field7206;
    }

    static {
        Class3336.method17143(-3702527341041253550L);
    }

    private static String 6SmF25JGdLz0hGho(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x6907DEBF));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static CallSite E2LB7d6FLrgk7QlJ(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class3336.6SmF25JGdLz0hGho(string7), Class3336.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class3336.6SmF25JGdLz0hGho(string5)), Class3336.6SmF25JGdLz0hGho(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class3336.6SmF25JGdLz0hGho(string5)), Class3336.6SmF25JGdLz0hGho(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method17143(long l2) {
        Class3336.field7205[0] = l2 ^ 0xCC9DFB000A108352L;
    }

    private static double method17144(Class1736 class1736, Class489 class489) {
        return class1736.method15502(class489);
    }

    public double method17145(double a2, long b2, Class489 c2) {
        if (a2 == this.field7206) {
            return Class5659.method22102(0.36544295976803853, Class5636.field10777, Class6405.field13282);
        }
        this.field7204 += (Class3336.method17142(this) - this.field7204) * Class3336.method17144(this.field7207, c2);
        this.field7206 = a2;
        this.field7207.method15500();
        this.field7207.method15507(b2);
        return this.field7204 + (this.field7206 - this.field7204) * this.field7207.method15502(c2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

