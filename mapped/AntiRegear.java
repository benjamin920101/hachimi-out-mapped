/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Items
 *  net.minecraft.block.Block
 *  net.minecraft.block.FacingBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.ShulkerBoxBlockEntity
 *  net.minecraft.state.property.Property
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.ArrayList;
import java.util.List;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class1380;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Chams;
import mapped.Class3442;
import mapped.Blink;
import mapped.Class4104;
import mapped.Class414;
import mapped.Class4146;
import mapped.SpeedMine;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class574;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6322;
import mapped.Class6454;
import net.minecraft.item.Items;
import net.minecraft.block.Block;
import net.minecraft.block.FacingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.state.property.Property;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AntiRegear
extends Class414 {
    Class248 field2167;
    Class248 field2168;
    private final List field2169 = new ArrayList();
    Class248 field2170;
    Class248 field2171;
    private static AntiRegear INSTANCE;
    Class248 field2172;
    Class248 field2173;
    Class248 field2174;
    private static long[] field2175;
    Class248 field2176;
    Class248 field2177;

    private Boolean method9397() {
        return (this.field2168.method507() == Class574.field2807 ? (int)field2175[2] : (int)field2175[0]) != 0;
    }

    private static boolean method9398(class_2338 a2) {
        return (!(AntiRegear.field290.field_1687.method_8320(a2).method_26204() instanceof class_2480) ? (int)field2175[2] : (int)field2175[0]) != 0;
    }

    private Boolean method9399() {
        if (this.field2168.method507() != Class574.field2807) {
            Chams.method1924();
            return null;
        }
        return (boolean)field2175[2];
    }

    private void method9400() {
        for (class_2586 d2 : AntiRegear.method9414()) {
            class_2627 c2;
            if (!(d2 instanceof class_2627) || this.field2169.contains((c2 = (class_2627)d2).method_11016()) || !((double)class_3532.method_15355((float)((float)AntiRegear.field290.field_1724.method_5707(c2.method_11016().method_46558()))) <= (Double)AntiRegear.method9418(AntiRegear.method9433(this)))) continue;
            Class3442 a2 = new Class3442(c2.method_11016().method_10093((class_2350)c2.method_11010().method_11654((class_2769)class_2318.field_10927)), class_1802.field_8281, (boolean)((Boolean)this.field2174.method507()), (Class607)((Object)this.field2172.method507()));
            boolean b2 = a2.method17369((Double)AntiRegear.method9415(this.field2177), (Boolean)this.field2176.method507(), (Boolean)AntiRegear.method9410(this.field2173), (Double)this.field2171.method507());
            if (!b2) continue;
            return;
        }
    }

    @Class1
    public void method9401(Class4104 a2) {
        if (AntiRegear.method9432(a2) instanceof class_2480) {
            this.field2169.add(a2.field9517);
        }
    }

    private static SpeedMine method9402() {
        return SpeedMine.method8407();
    }

    private static void method9403(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method9404() {
        Chams.method1924();
    }

    private static void method9405() {
        Class6009.method23560();
    }

    private static class_746 method9406(class_310 class_3102) {
        return AntiRegear.method9426(class_3102);
    }

    private static void method9407() {
        Class5836.method22885();
    }

    public static AntiRegear method9408() {
        return INSTANCE;
    }

    private Boolean method9409() {
        return (this.field2168.method507() == Class574.field2807 ? (int)field2175[2] : (int)field2175[0]) != 0;
    }

    private static Object method9410(Class248 class248) {
        return class248.method507();
    }

    private static void method9411() {
        Class4146.method20697();
    }

    private static void method9412(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method9413(long l2) {
        AntiRegear.method9423(l2);
    }

    private static List method9414() {
        return Class1215.method13267();
    }

    private static Object method9415(Class248 class248) {
        return class248.method507();
    }

    private static Object method9416(Class248 class248) {
        return class248.method507();
    }

    private static Class607[] method9417() {
        return Class607.values();
    }

    private static Object method9418(Class248 class248) {
        return class248.method507();
    }

    public static AntiRegear method9419() {
        return AntiRegear.method9408();
    }

    private static void method9420() {
        Class6454.method24594();
    }

    private static void method9421(float f2) {
        Class5836.method22907(f2);
    }

    private static Object method9422(Class248 class248) {
        return class248.method507();
    }

    private static void method9423(long l2) {
        AntiRegear.field2175[3] = l2 ^ 0x3FCD4ABEACE152A2L;
        AntiRegear.field2175[0] = l2 ^ 0x3FCD4ABEACE152A8L;
        AntiRegear.field2175[1] = l2 ^ 0x3FCD4ABEACE152A1L;
        AntiRegear.field2175[2] = l2 ^ 0x3FCD4ABEACE152A9L;
    }

    private static void method9424() {
        Class5836.method22890();
    }

    public static Class248 method9425(AntiRegear class437) {
        return class437.field2168;
    }

    public static class_746 method9426(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method1278() {
        return (this.field2168.method507() == AntiRegear.method9434() ? (int)field2175[2] : (int)field2175[0]) != 0;
    }

    public static Class248 method9427(AntiRegear class437) {
        return class437.field2170;
    }

    public static Class248 method9428(AntiRegear class437) {
        return class437.field2170;
    }

    private static void method9429(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    static {
        field2175 = new long[4];
        AntiRegear.method9413(4597412977419834024L);
    }

    @Override
    protected void method1279() {
        this.field2169.clear();
    }

    @Class1
    public void method9430(Class210 a2) {
        if (Blink.method4987()) {
            return;
        }
        if (!((Boolean)this.field1536.method507()).booleanValue() && AntiRegear.method9406(field290).method_6115()) {
            return;
        }
        this.field2169.removeIf(AntiRegear::method9398);
        int n2 = ((Class574)((Object)AntiRegear.method9422(AntiRegear.method9425(this)))).ordinal() ^ 0x20724F6A;
        if (n2 != 544362344) {
            if (n2 == 544362346) {
                this.method9400();
            } else {
                if (n2 != 544362347) {
                    Class6009.method23559(false);
                    return;
                }
                this.method9436();
            }
        } else {
            this.method9400();
            this.method9436();
        }
    }

    private static void method9431() {
        Class5659.method22184();
    }

    public static class_2248 method9432(Class4104 class4104) {
        return class4104.field9516;
    }

    public AntiRegear() {
        super("AntiRegear", "Lets go to fuck enemy shulkers", Class556.field2758);
        this.field2168 = this.method450(new Class260("Mode", "mode", Class574.field2811, Class574.values()));
        this.field2170 = this.method450(new Class252("ShulkerRange", "The maximum range the shulker box can be to destory it", 0.0, 4.0, 6.0));
        this.field2167 = this.method450(new Class252("MinePriority", "Priority of mining shulker", (int)field2175[0], (int)field2175[1], (int)field2175[3]));
        this.field2176 = this.method450(new Class253("Rotate", "Automatically faces towards the obsidian being placed", (boolean)field2175[2], this::method1269));
        this.field2177 = this.method450(new Class252("PlaceRange", "The distance of your block reach", (Number)0.0, (Number)4.5, (Number)6.0, this::method1278));
        this.field2173 = this.method450(new Class253("BreakCrystal", "Break crystals when placing blocks", (boolean)field2175[2], this::method9399));
        this.field2171 = this.method450(new Class252("BreakRange", "The distance of your entity reach", (Number)0.0, (Number)Class1380.field5329, (Number)6.0, this::method9440));
        this.field2174 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field2175[0], this::method9397));
        this.field2172 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, AntiRegear.method9417(), this::method9409));
        INSTANCE = this;
    }

    private static Class248 method9433(AntiRegear class437) {
        return AntiRegear.method9428(class437);
    }

    public static Class574 method9434() {
        return Class574.field2807;
    }

    private static void method9435(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private void method9436() {
        SpeedMine c2 = AntiRegear.method9402();
        for (class_2586 b2 : AntiRegear.method9441()) {
            class_2627 a2;
            if (!(b2 instanceof class_2627) || this.field2169.contains((a2 = (class_2627)b2).method_11016()) || !((double)class_3532.method_15355((float)((float)AntiRegear.field290.field_1724.method_5707(a2.method_11016().method_46558()))) <= (Double)AntiRegear.method9416(AntiRegear.method9427(this)))) continue;
            if (!c2.method8537(a2.method_11016(), (Integer)this.field2167.method507())) continue;
            return;
        }
    }

    private static void method9437() {
        Class5659.method22184();
    }

    private static void method9438() {
        Class4146.method20694();
    }

    private static void method9439() {
        Class1807.method15744();
    }

    private Boolean method9440() {
        return (this.field2168.method507() == Class574.field2807 ? (int)field2175[2] : (int)field2175[0]) != 0;
    }

    private static List method9441() {
        return Class1215.method13267();
    }

    private static void method9442() {
        Class6009.method23561();
    }

    private static void method9443() {
        Class4146.method20694();
    }

    private static void method9444() {
        Chams.method1924();
    }

    private Boolean method1269() {
        if (this.field2168.method507() == Class574.field2807) {
            int n2 = (int)field2175[2];
            Class6009.method23561();
            return null;
        }
        return (boolean)field2175[0];
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

