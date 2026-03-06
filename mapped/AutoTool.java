/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1;
import mapped.Class1308;
import mapped.Class18;
import mapped.Class278;
import mapped.Class4045;
import mapped.Class556;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class AutoTool
extends Class278 {
    private static long[] field999 = new long[3];
    private static AutoTool INSTANCE;

    public static AutoTool method3833() {
        return INSTANCE;
    }

    public AutoTool() {
        super("AutoTool", "Automatically switches to a tool before mining", Class556.field2754);
        INSTANCE = this;
    }

    public static int method3834(class_2680 e2) {
        float f2 = Float.MIN_VALUE;
        int g2 = (int)field999[0];
        for (int d2 = (int)field999[2]; d2 < (int)field999[1]; ++d2) {
            float c2;
            class_1799 a2 = AutoTool.method3838(field290).method_31548().method_5438(d2);
            if (a2.method_7960()) {
                return AutoTool.method3836(-619683849);
            }
            int b2 = Class1308.method13621(a2, class_1893.field_9131);
            if (!((float)b2 + (c2 = a2.method_7924(e2)) > f2) || !(c2 > 1.0f)) continue;
            f2 = (float)b2 + c2;
            g2 = d2;
        }
        return g2;
    }

    private static int method3835(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static String gerBcd7dTrF7DMG4(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x61C9AF6));
            ++n2;
        }
        return stringBuilder.toString();
    }

    static {
        AutoTool.method3839(5447949643713676629L);
    }

    public static CallSite S1Wu10wkamZFUHZr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(AutoTool.gerBcd7dTrF7DMG4(string7), AutoTool.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(AutoTool.gerBcd7dTrF7DMG4(string5)), AutoTool.gerBcd7dTrF7DMG4(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(AutoTool.gerBcd7dTrF7DMG4(string5)), AutoTool.gerBcd7dTrF7DMG4(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static int method3836(int n2) {
        return Class4045.method20095(n2);
    }

    public static class_746 method3837(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method3838(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3839(long l2) {
        AutoTool.field999[0] = l2 ^ 0xB464FEA9DC3AFAAAL;
        AutoTool.field999[1] = l2 ^ 0x4B9B015623C5055CL;
        AutoTool.field999[2] = l2 ^ 0x4B9B015623C50555L;
    }

    public static int method3840(class_2680 a2) {
        int b2 = AutoTool.method3834(a2);
        if (b2 != (int)field999[0]) {
            return b2;
        }
        return AutoTool.field290.field_1724.method_31548().field_7545;
    }

    @Class1
    public void method3841(Class18 a2) {
        class_2680 b2 = AutoTool.field290.field_1687.method_8320(a2.method34());
        int c2 = AutoTool.method3840(b2);
        if (c2 != (int)field999[0]) {
            AutoTool.method3837((class_310)AutoTool.field290).method_31548().field_7545 = c2;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

