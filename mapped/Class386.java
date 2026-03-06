/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.concurrent.TimeUnit;
import mapped.Class1;
import mapped.Class131;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class1822;
import mapped.Class248;
import mapped.Class249;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class451;
import mapped.Class486;
import mapped.Class520;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5852;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class926;
import net.hachimi.client.mixin.bh;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class386
extends Class278 {
    Class248 field1313;
    Class248 field1314;
    Class248 field1315;
    private static long[] field1316 = new long[5];
    Class248 field1317;
    Class248 field1318;
    Class248 field1319;
    private final Class926 field1320 = new Class926();

    private static class_2596 method5361(int a2) {
        return new class_2886(Class386.field290.field_1724.method_6058(), a2, Class386.field290.field_1724.method_36454(), Class386.field290.field_1724.method_36455());
    }

    private static void method5362(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method5363() {
        Class1807.method15744();
    }

    private static void method5364(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5365(Class63 a2) {
        if (a2.method128() != Class543.field2690) {
            return;
        }
        if (!Class386.field290.field_1690.field_1904.method_1434()) {
            Class386.method5368(this).method12593();
            return;
        }
        if (!this.field1320.method12601((Number)this.field1319.method507(), TimeUnit.SECONDS)) {
            return;
        }
        if (((bh)field290).hookGetItemUseCooldown() <= (Integer)Class386.method5371(this.field1315)) return;
        int n2 = this.method5370(Class386.field290.field_1724.method_6047()) ? 64240 : 64241;
        block4: while (true) {
            switch (n2) {
                case 64241: {
                    n2 = 64239;
                    continue block4;
                }
                case 64240: {
                    if (((Boolean)Class386.method5381(this).method507()).booleanValue()) {
                        Class386.method5377().method21353(Class386::method5361);
                    }
                    ((bh)field290).hookSetItemUseCooldown((Integer)Class386.method5369(this.field1315));
                    return;
                }
            }
            break;
        }
    }

    private static class_746 method5366(class_310 class_3102) {
        return Class386.method5373(class_3102);
    }

    private static void method5367(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class926 method5368(Class386 class386) {
        return class386.field1320;
    }

    private static Object method5369(Class248 class248) {
        return class248.method507();
    }

    static {
        Class386.method5384(5628064618298026047L);
    }

    private boolean method5370(class_1799 a2) {
        int n2 = ((Class486)((Object)this.field1314.method507())).ordinal();
        return Class1807.method15753();
    }

    private static Object method5371(Class248 class248) {
        return class248.method507();
    }

    private static void method5372() {
        Class4146.method20697();
    }

    public static class_746 method5373(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method5374(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static int method5375(int n2, int n3, Class451 class451, Class520 class520) {
        return Class1822.method15814(n2, n3, class451, class520);
    }

    private static boolean method5376(int n2) {
        return Class4196.method20803(n2);
    }

    public static Class5496 method5377() {
        return Class5723.field11048;
    }

    private static boolean method5378() {
        return Class1807.method15753();
    }

    public Class386() {
        super("FastPlace", "Place items and blocks faster", Class556.field2754);
        this.field1314 = this.method450(new Class260("Selection", "The selection of items to apply fast placements", Class486.field2521, Class486.values()));
        this.field1315 = this.method450(new Class252("Delay", "Fast place click delay", (int)field1316[2], (int)field1316[0], (int)field1316[4]));
        this.field1319 = this.method450(new Class252("StartDelay", "Fast place start delay", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)));
        this.field1317 = this.method450(new Class253("GhostFix", "Fixes item ghosting issue on some servers", (boolean)field1316[2]));
        class_1792[] class_1792Array = new class_1792[(int)field1316[3]];
        class_1792Array[(int)Class386.field1316[2]] = class_1802.field_8287;
        class_1792Array[(int)Class386.field1316[0]] = class_1802.field_8543;
        class_1792Array[(int)Class386.field1316[1]] = class_1802.field_8803;
        this.field1318 = this.method450(new Class249("Whitelist", "Valid item whitelist", class_1792Array));
        class_1792[] class_1792Array2 = new class_1792[(int)field1316[1]];
        class_1792Array2[(int)Class386.field1316[2]] = class_1802.field_8634;
        class_1792Array2[(int)Class386.field1316[0]] = class_1802.field_8449;
        this.field1313 = this.method450(new Class249("Blacklist", "Valid item blacklist", class_1792Array2));
    }

    private static void method5379() {
        Class1503.method14420();
    }

    private static boolean method5380(Class249 class249, Object object) {
        return class249.method522(object);
    }

    public static Class248 method5381(Class386 class386) {
        return class386.field1317;
    }

    private static boolean method5382(int n2) {
        return Class4196.method20803(n2);
    }

    @Class1
    public void method5383(Class131 c2) {
        if (Class386.field290.field_1724 == null || Class386.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_2885) {
            class_2885 b2 = (class_2885)class_25962;
            if (((Boolean)this.field1317.method507()).booleanValue() && !c2.method252()) {
                if (!this.method5370(Class386.method5366(field290).method_5998(b2.method_12546()))) {
                    Class6009.method23560();
                    return;
                }
                class_2680 a2 = Class386.field290.field_1687.method_8320(b2.method_12543().method_17777());
                if (!Class5852.method22958(a2)) {
                    c2.method10();
                }
            }
        }
    }

    private static void method5384(long l2) {
        Class386.field1316[2] = l2 ^ 0x4E1AE6F39A99283FL;
        Class386.field1316[1] = l2 ^ 0x4E1AE6F39A99283DL;
        Class386.field1316[0] = l2 ^ 0x4E1AE6F39A99283EL;
        Class386.field1316[4] = l2 ^ 0x4E1AE6F39A99283BL;
        Class386.field1316[3] = l2 ^ 0x4E1AE6F39A99283CL;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

