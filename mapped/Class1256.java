/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.inventory.Inventory
 *  net.minecraft.inventory.SimpleInventory
 *  net.minecraft.screen.ShulkerBoxScreenHandler
 *  net.minecraft.item.BlockItem
 *  net.minecraft.util.DyeColor
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Block
 *  net.minecraft.util.collection.DefaultedList
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtList
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.ingame.BookScreen
 *  net.minecraft.client.gui.screen.ingame.BookScreen$Contents
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen
 *  net.minecraft.registry.RegistryWrapper$WrapperLookup
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.component.type.NbtComponent
 *  net.minecraft.component.ComponentMap
 *  net.minecraft.component.ComponentType
 *  net.minecraft.component.DataComponentTypes
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Arrays;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class266;
import mapped.Class286;
import mapped.Class298;
import mapped.Class3687;
import mapped.Class3780;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4122;
import mapped.Class4196;
import mapped.Class447;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6322;
import net.hachimi.client.mixin.aB;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.item.BlockItem;
import net.minecraft.util.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.BookScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1256
extends class_495 {
    private final class_1799 field4914;
    private static long[] field4915 = new long[6];
    private final class_2960 field4916 = class_2960.method_60654((String)"textures/gui/container/shulker_box.png");
    private final class_1799[] field4917;

    private static int method13546(int n2, int n3, Class266 class266, Class286 class286) {
        return Class3780.method18322(n2, n3, class266, class286);
    }

    private static void method13547() {
        Class5836.method22897();
    }

    public boolean method_25406(double a2, double b2, int c2) {
        return (int)field4915[0] != 0;
    }

    private static boolean method13548(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    static {
        Class1256.method13564(-6155799597008153698L);
    }

    private static void method13549() {
        Class5836.method22897();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static boolean method13550(class_1799 b2, class_1799[] c2) {
        block4: {
            if (!Class1256.method13556(b2)) {
                int n2;
                class_1792 class_17922 = b2.method_7909();
                if (class_17922 instanceof class_1747) {
                    return Class5659.method22194();
                }
                int n3 = 54934;
                boolean bl2 = true;
                do {
                    if (!bl2 || (bl2 = false) || !true) {
                        n3 = n2 = 54932;
                    }
                    if (n2 != 54933) continue;
                    class_1747 a2 = (class_1747)class_17922;
                    if (!(a2.method_7711() instanceof class_2480)) return (int)field4915[0] != 0;
                    break block4;
                } while (n2 == 54934);
                return (int)field4915[0] != 0;
            }
        }
        Class1256.method13559(b2, c2);
        Class4122.field9561.method_1507((class_437)new Class1256(b2, c2));
        return (int)field4915[2] != 0;
    }

    public static Color method13551(class_1799 f2) {
        class_1747 e2;
        class_2248 d2;
        class_1792 class_17922 = f2.method_7909();
        if (class_17922 instanceof class_1747 && (d2 = (e2 = (class_1747)class_17922).method_7711()) instanceof class_2480) {
            class_2480 c2 = (class_2480)d2;
            class_1767 a2 = c2.method_10528();
            if (a2 == null) {
                return Color.WHITE;
            }
            int b2 = a2.method_7787();
            return new Color(b2);
        }
        return Color.WHITE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method_25402(double c2, double d2, int e2) {
        if (e2 != (int)field4915[4]) {
            return (int)field4915[2] != 0;
        }
        if (this.field_2787 == null) return (int)field4915[2] != 0;
        if (this.field_2787.method_7677().method_7960()) return (int)field4915[2] != 0;
        if (!Class1256.method13555((class_310)Class4122.field9561).field_7512.method_34255().method_7960()) return (int)field4915[2] != 0;
        class_1799 b2 = this.field_2787.method_7677();
        if (Class1256.method13556(b2)) return Class1256.method13550(this.field_2787.method_7677(), this.field4917);
        class_1792 class_17922 = b2.method_7909();
        int n2 = class_17922 instanceof class_1747 ? 14570 : 14571;
        while (true) {
            int n3;
            if ((n3 = n2) == 14570) {
                class_1747 a2 = (class_1747)class_17922;
                if (a2.method_7711() instanceof class_2480) {
                    return Class1256.method13550(this.field_2787.method_7677(), this.field4917);
                }
            } else if (n3 == 14571) {
                n2 = 14569;
                continue;
            }
            break;
        }
        int n4 = b2.method_57824(class_9334.field_49606) == null ? 7744 : 7745;
        block5: while (true) {
            switch (n4) {
                case 7745: {
                    n4 = 7743;
                    continue block5;
                }
                case 7744: {
                    if (b2.method_57824(class_9334.field_49653) == null) return (int)field4915[2] != 0;
                }
            }
            break;
        }
        this.method_25419();
        Class1256.method13565().method_1507((class_437)new class_3872(class_3872.class_3931.method_17562((class_1799)b2)));
        return (int)field4915[2] != 0;
    }

    protected void method_2389(class_332 a2, float b2, int c2, int d2) {
        Color e2 = Class1256.method13562(this.field4914);
        RenderSystem.setShader(class_757::method_34542);
        RenderSystem.setShaderColor((float)((float)e2.getRed() / 255.0f), (float)((float)e2.getGreen() / 255.0f), (float)((float)e2.getBlue() / 255.0f), (float)((float)e2.getAlpha() / 255.0f));
        int f2 = (this.field_22789 - this.field_2792) / (int)field4915[4];
        int g2 = (this.field_22790 - this.field_2779) / (int)field4915[4];
        a2.method_25302(this.field4916, f2, g2, (int)field4915[0], (int)field4915[0], this.field_2792, this.field_2779);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private static void method13552() {
        Class1503.method14420();
    }

    private static boolean method13553() {
        return Class1807.method15742();
    }

    public static class_9331 method13554() {
        return class_9334.field_49611;
    }

    private static class_746 method13555(class_310 class_3102) {
        return Class1256.method13560(class_3102);
    }

    public static boolean method13556(class_1799 a2) {
        aB b2 = (aB)a2.method_57824(class_9334.field_49622);
        if (b2 != null && !b2.getStacks().isEmpty()) {
            return (int)field4915[2] != 0;
        }
        class_2487 c2 = ((class_9279)a2.method_57825(Class1256.method13554(), (Object)class_9279.field_49302)).method_57463();
        return (c2 != null && c2.method_10573("Items", (int)field4915[3]) ? (int)field4915[2] : (int)field4915[0]) != 0;
    }

    private static boolean method13557() {
        return Class1807.method15742();
    }

    public Class1256(class_1799 a2, class_1799[] b2) {
        super(new class_1733(Class3979.method19544() ? (int)field4915[1] : (int)field4915[0], Class4122.field9561.field_1724.method_31548(), (class_1263)new class_1277(b2)), Class4122.field9561.field_1724.method_31548(), a2.method_7964());
        this.field4917 = b2;
        this.field4914 = a2;
    }

    public boolean method_16803(int a2, int b2, int c2) {
        if (a2 == (int)field4915[5]) {
            this.method_25419();
            return (int)field4915[2] != 0;
        }
        return (int)field4915[0] != 0;
    }

    private static void method13558() {
        Class298.method1924();
    }

    public static void method13559(class_1799 h2, class_1799[] i2) {
        block5: {
            class_9323 j2;
            block4: {
                Arrays.fill(i2, class_1799.field_8037);
                j2 = h2.method_57353();
                if (!j2.method_57832(class_9334.field_49622)) break block4;
                aB b2 = (aB)j2.method_57829(class_9334.field_49622);
                class_2371 c2 = b2.getStacks();
                for (int a2 = (int)field4915[0]; a2 < c2.size(); ++a2) {
                    if (a2 < 0 || a2 >= i2.length) continue;
                    i2[a2] = (class_1799)c2.get(a2);
                }
                break block5;
            }
            if (!j2.method_57832(class_9334.field_49611)) break block5;
            class_9279 g2 = (class_9279)j2.method_57829(class_9334.field_49611);
            if (!g2.method_57450("Items")) {
                Class6322.method24332(0.43430513f, 0.95237f);
                return;
            }
            class_2499 f2 = (class_2499)g2.method_57463().method_10580("Items");
            for (int e2 = (int)field4915[0]; e2 < f2.size(); ++e2) {
                byte d2 = f2.method_10602(e2).method_10571("Slot");
                if (d2 < 0) continue;
                if (d2 >= i2.length) {
                    Class4036.method20085(0.19370264f, 0.6427646f, 0.376666f, 0.38295656f, Class3687.field8268, 0.92564034f);
                    return;
                }
                i2[d2] = class_1799.method_57359((class_7225.class_7874)Class1256.method13567(Class4122.field9561).method_56673(), (class_2487)f2.method_10602(e2));
            }
        }
    }

    public static class_746 method13560(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method13561() {
        return Class4196.method20801();
    }

    private static Color method13562(class_1799 class_17992) {
        return Class1256.method13551(class_17992);
    }

    public static class_310 method13563() {
        return Class4122.field9561;
    }

    private static void method13564(long l2) {
        Class1256.field4915[0] = l2 ^ 0xAA9234E19FD6139EL;
        Class1256.field4915[5] = l2 ^ 0xAA9234E19FD6129EL;
        Class1256.field4915[1] = l2 ^ 0xAA9234E19FD61079L;
        Class1256.field4915[4] = l2 ^ 0xAA9234E19FD6139CL;
        Class1256.field4915[3] = l2 ^ 0xAA9234E19FD61397L;
        Class1256.field4915[2] = l2 ^ 0xAA9234E19FD6139FL;
    }

    public static class_310 method13565() {
        return Class4122.field9561;
    }

    private static boolean method13566() {
        return Class447.method10322();
    }

    public boolean method_25404(int a2, int b2, int c2) {
        if (a2 == (int)field4915[5]) {
            return Class447.method10322();
        }
        if (Class1256.method13563().field_1690.field_1822.method_1417(a2, b2)) {
            this.method_25419();
            return (int)field4915[2] != 0;
        }
        return (int)field4915[0] != 0;
    }

    public static class_746 method13567(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method13568() {
        return Class447.method10252();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

