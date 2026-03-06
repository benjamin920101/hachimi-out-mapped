/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.block.BlockState
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class3;
import mapped.Class8;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Class3
public class Class19
extends Class8 {
    private final class_2680 field18;
    private final int field19;
    private final class_2338 field20;

    public static class_2680 method36(Class19 class19) {
        return class19.field18;
    }

    public static CallSite 05h4BB0tegiAISFO(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class19.HNSFHC1L3rAD4oP5(string7), Class19.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class19.HNSFHC1L3rAD4oP5(string5)), Class19.HNSFHC1L3rAD4oP5(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class19.HNSFHC1L3rAD4oP5(string5)), Class19.HNSFHC1L3rAD4oP5(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public class_2338 method37() {
        return this.field20;
    }

    private static String HNSFHC1L3rAD4oP5(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x74EF1FFB));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public class_2680 method38() {
        return Class19.method36(this);
    }

    public int method39() {
        return this.field19;
    }

    public Class19(int a2, class_2338 b2, class_2680 c2) {
        this.field19 = a2;
        this.field20 = b2;
        this.field18 = c2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

