/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.client.world.ClientWorld
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1234;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class2298;
import mapped.Class3398;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class6455;
import mapped.Class657;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.client.world.ClientWorld;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class2300
extends Class2298 {
    private static long[] field6794 = new long[2];
    public static final Class2300 INSTANCE;

    private static void method15897(boolean bl2) {
        Class6009.method23559(bl2);
    }

    @Override
    public class_2350 method15859(class_2338 e2, class_1657 f2, class_638 g2) {
        if (Class1745.field6554) {
            Class6454.method24636(Class3398.field7394, 0.3273459785386773, Class6455.field13416, Class1234.field4841);
            return null;
        }
        Class4146.method20694();
        return null;
    }

    private static void method15898(long l2) {
        Class2300.field6794[1] = l2 ^ 0x7DCFD480FDF4448AL;
        Class2300.field6794[0] = l2 ^ 0x7DCFD480FDF4448BL;
    }

    static {
        Class2300.method15898(9065698225401644171L);
        INSTANCE = new Class2300();
    }

    private static void method15899() {
        Class3979.method19561();
    }

    @Override
    public boolean method15846(class_2338 a2, class_2350 b2, class_638 c2, class_1657 d2) {
        return (int)field6794[1] != 0;
    }

    public static CallSite B4RebdFq1LtX1Y4V(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class2300.Jt5kOJTiOjgQE5Tp(string7), Class2300.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class2300.Jt5kOJTiOjgQE5Tp(string5)), Class2300.Jt5kOJTiOjgQE5Tp(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class2300.Jt5kOJTiOjgQE5Tp(string5)), Class2300.Jt5kOJTiOjgQE5Tp(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method15900() {
        Class4146.method20694();
    }

    private static void method15901(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method15902() {
        Class1807.method15744();
    }

    private static void method15903() {
        Class6009.method23561();
    }

    @Override
    public boolean method15828(class_2338 a2, class_2350 b2, class_638 c2, class_1657 d2, Class657 e2) {
        return this.method15846(a2, b2, c2, d2);
    }

    public static class_2350 method15904() {
        return class_2350.field_11033;
    }

    private static String Jt5kOJTiOjgQE5Tp(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xC8E606CB));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

