/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.client.world.ClientWorld
 *  org.jetbrains.annotations.Nullable
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1503;
import mapped.Class2299;
import mapped.Class2300;
import mapped.Class4122;
import mapped.Class487;
import mapped.Class657;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.client.world.ClientWorld;
import org.jetbrains.annotations.Nullable;

public abstract class Class2298 {
    @Nullable
    public class_2350 method15860(class_2338 a2) {
        return this.method15859(a2, (class_1657)Class4122.field9561.field_1724, Class4122.field9561.field_1687);
    }

    private static void method15861(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public abstract boolean method15828(class_2338 var1, class_2350 var2, class_638 var3, class_1657 var4, Class657 var5);

    public abstract boolean method15846(class_2338 var1, class_2350 var2, class_638 var3, class_1657 var4);

    private static String rHJgTVhp0Cq4mj1t(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xAF1238D8));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public boolean method15862(class_2338 a2, class_2350 b2) {
        return this.method15846(a2, b2, Class4122.field9561.field_1687, (class_1657)Class4122.field9561.field_1724);
    }

    @Nullable
    public abstract class_2350 method15859(class_2338 var1, class_1657 var2, class_638 var3);

    public static Class2298 method15863(Class487 a2) {
        int n2 = a2.ordinal();
        if (n2 == 1) {
            Class1503.method14420();
            return null;
        }
        if (n2 == 2) {
            return Class2299.INSTANCE;
        }
        return Class2298.method15864();
    }

    public static CallSite A7dq0Q17Tsdav5nw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class2298.rHJgTVhp0Cq4mj1t(string7), Class2298.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class2298.rHJgTVhp0Cq4mj1t(string5)), Class2298.rHJgTVhp0Cq4mj1t(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class2298.rHJgTVhp0Cq4mj1t(string5)), Class2298.rHJgTVhp0Cq4mj1t(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static Class2300 method15864() {
        return Class2300.INSTANCE;
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}

