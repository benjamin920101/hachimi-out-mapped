/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.BlockState
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class244;
import mapped.Class347;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.BlockState;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1017 {
    private float field4201;
    private final class_2338 field4202;
    private float field4203;
    private int field4204;
    private final class_2350 field4205;
    private static long[] field4206 = new long[2];

    public Class1017(class_2338 a2, class_2350 b2) {
        this.field4202 = a2;
        this.field4205 = b2;
    }

    public int method12824() {
        return Class347.method3834(this.method12829());
    }

    private static String 2dn9I9qojtLFILaC(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xCD46B03));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public void method12825() {
        this.field4204 = (int)field4206[1];
    }

    public int method12826() {
        return this.field4204;
    }

    public void method12827() {
        this.field4204 += (int)field4206[0];
    }

    public class_2338 method12828() {
        return this.field4202;
    }

    static {
        Class1017.method12833(6572665633161430528L);
    }

    public class_2680 method12829() {
        return Class244.field290.field_1687.method_8320(this.field4202);
    }

    public void method12830(float a2, float b2) {
        this.field4201 = a2;
        this.field4203 = b2;
    }

    public float method12831() {
        return this.field4201;
    }

    public void method12832(float a2) {
        this.field4203 = this.field4201;
        this.field4201 += a2;
    }

    private static void method12833(long l2) {
        Class1017.field4206[0] = l2 ^ 0x5B36CC91E4014601L;
        Class1017.field4206[1] = l2 ^ 0x5B36CC91E4014600L;
    }

    public Class1017 method12834() {
        Class1017 a2 = new Class1017(this.field4202, this.field4205);
        a2.method12830(this.field4201, this.field4203);
        return a2;
    }

    public class_2350 method12835() {
        return Class1017.method12838(this);
    }

    public static class_2350 method12836(Class1017 class1017) {
        return class1017.field4205;
    }

    public static CallSite QWZCpqQL4zLFGaN9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class1017.2dn9I9qojtLFILaC(string7), Class1017.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class1017.2dn9I9qojtLFILaC(string5)), Class1017.2dn9I9qojtLFILaC(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class1017.2dn9I9qojtLFILaC(string5)), Class1017.2dn9I9qojtLFILaC(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static class_2338 method12837(Class1017 class1017) {
        return class1017.field4202;
    }

    public boolean equals(Object b2) {
        Class1017 a2;
        return (b2 instanceof Class1017 && (a2 = (Class1017)b2).method12828().equals((Object)Class1017.method12837(this)) ? (int)field4206[0] : (int)field4206[1]) != 0;
    }

    private static class_2350 method12838(Class1017 class1017) {
        return Class1017.method12836(class1017);
    }

    public static Class1017 method12839() {
        return new Class1017(class_2338.field_10980, class_2350.field_11036);
    }

    public float method12840() {
        return this.field4203;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

