/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.item.ElytraItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.registry.tag.FluidTags
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.tag.TagKey
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class1308;
import mapped.Class1387;
import mapped.Class204;
import mapped.Class2353;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Chams;
import mapped.Speed;
import mapped.Class3979;
import mapped.Class556;
import mapped.Class558;
import mapped.Class5723;
import mapped.Class6070;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class830;
import mapped.Class871;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.util.math.Vec2f;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FastSwim
extends Class278 {
    Class248 field1394;
    Class248 field1395;
    Class248 field1396 = this.method450(new Class260("Mode", "The mode for swimming", Class558.field2766, Class558.values()));
    Class248 field1397;
    Class248 field1398 = this.method450(new Class252("WaterSpeed", "Base speed for moving through water", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(10.0f)));
    Class248 field1399 = this.method450(new Class252("LavaSpeed", "Base speed for moving through lava", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(Class6070.field12207)));
    Class248 field1400 = this.method450(new Class253("Vertical", "Allows moving vertically", (boolean)field1401[0]));
    private static long[] field1401 = new long[2];

    public static class_6862 method5870() {
        return class_3486.field_15517;
    }

    private static class_746 method5871(class_310 class_3102) {
        return FastSwim.method5896(class_3102);
    }

    public static class_746 method5872(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method5873(Class248 class248) {
        return class248.method507();
    }

    private static int method5874(class_1799 class_17992, class_5321 class_53212) {
        return Class1308.method13621(class_17992, class_53212);
    }

    @Class1
    public void method5875(Class204 b2) {
        if (!((Boolean)this.field1395.method507()).booleanValue()) {
            if (FastSwim.method5874(FastSwim.field290.field_1724.method_6118(class_1304.field_6166), FastSwim.method5892()) > 0) {
                return;
            }
        }
        if (!FastSwim.field290.field_1724.method_5777(FastSwim.method5891()) && !FastSwim.field290.field_1724.method_5777(class_3486.field_15518)) {
            return;
        }
        b2.method10();
        if (FastSwim.method5872(field290).method_6118(class_1304.field_6174).method_7909() instanceof class_1770) {
            if (((Boolean)this.field1397.method507()).booleanValue()) {
                FastSwim.method5890(b2, b2.method383() * (double)((Float)FastSwim.method5881(this).method507()).floatValue());
                FastSwim.method5887(b2, FastSwim.method5885(b2) * (double)((Float)this.field1394.method507()).floatValue());
                if (((Boolean)this.field1400.method507()).booleanValue()) {
                    if (!FastSwim.field290.field_1690.field_1903.method_1434()) {
                        Class3979.method19561();
                        return;
                    }
                    b2.method391(b2.method381() + 0.16);
                    FastSwim.method5884(Class5723.field11052, b2.method381() + Class830.field3643);
                }
                return;
            }
        }
        float c2 = (FastSwim.method5871(field290).method_5777(FastSwim.method5870()) ? (Float)FastSwim.method5893(this.field1398) : (Float)FastSwim.method5873(this.field1399)).floatValue();
        switch (((Class558)((Object)this.field1396.method507())).ordinal()) {
            case 0: {
                b2.method386(b2.method383() * (double)c2);
                b2.method389(b2.method390() * (double)c2);
                break;
            }
            case 1: {
                class_241 a2 = Speed.method4109().method4197(c2 / 10.0f);
                b2.method386(a2.field_1343);
                FastSwim.method5879(b2, a2.field_1342);
            }
        }
        if (((Boolean)this.field1400.method507()).booleanValue()) {
            if (FastSwim.field290.field_1690.field_1903.method_1434()) {
                b2.method391(b2.method381() + 0.16);
                Class5723.field11052.method14002(b2.method381() + 0.16);
            } else if (FastSwim.field290.field_1690.field_1832.method_1434()) {
                b2.method391(FastSwim.method5876(b2) - Class871.field3769);
                Class5723.field11052.method14002(b2.method381() - 0.12);
            }
        }
    }

    private Boolean method1269() {
        return (Boolean)FastSwim.method5888(this).method507();
    }

    static {
        FastSwim.method5895(-2363880201602454376L);
    }

    private static double method5876(Class204 class204) {
        return class204.method381();
    }

    private static void method5877(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    private static void method5878(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method5879(Class204 class204, double d2) {
        class204.method389(d2);
    }

    private static void method5880(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static Class248 method5881(FastSwim class399) {
        return class399.field1394;
    }

    private static void method5882() {
        Class6454.method24594();
    }

    private static void method5883(Class204 class204, double d2) {
        class204.method391(d2);
    }

    private static void method5884(Class1387 class1387, double d2) {
        class1387.method14002(d2);
    }

    private static double method5885(Class204 class204) {
        return class204.method390();
    }

    private static void method5886(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method5887(Class204 class204, double d2) {
        class204.method389(d2);
    }

    public static Class248 method5888(FastSwim class399) {
        return class399.field1397;
    }

    private static void method5889() {
        Chams.method1924();
    }

    private static void method5890(Class204 class204, double d2) {
        class204.method386(d2);
    }

    public static class_6862 method5891() {
        return class_3486.field_15517;
    }

    public static class_5321 method5892() {
        return class_1893.field_9128;
    }

    private static Object method5893(Class248 class248) {
        return class248.method507();
    }

    private static void method5894() {
        Chams.method1924();
    }

    private static void method5895(long l2) {
        FastSwim.field1401[0] = l2 ^ 0xDF31CF7B23E82C99L;
        FastSwim.field1401[1] = l2 ^ 0xDF31CF7B23E82C98L;
    }

    public static class_746 method5896(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public FastSwim() {
        super("FastSwim", "Move faster in liquids", Class556.field2752);
        this.field1397 = this.method450(new Class253("Elytra", "Applies elytra speed when moving through liquids", (boolean)field1401[1]));
        this.field1394 = this.method450(new Class252("ElytraSpeed", "Base speed for moving through lava", (Number)Float.valueOf(Class2353.field6798), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(10.0f), this::method1269));
        this.field1395 = this.method450(new Class253("DepthStrider", "Prefers depth strider", (boolean)field1401[1]));
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

