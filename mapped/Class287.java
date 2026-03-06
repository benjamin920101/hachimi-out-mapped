/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  net.minecraft.util.Formatting
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.TameableEntity
 *  net.minecraft.entity.passive.AbstractHorseEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.thrown.EnderPearlEntity
 *  net.minecraft.item.ArmorItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.world.World
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.text.Text
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.font.TextRenderer$TextLayerType
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.render.OverlayTexture
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.client.render.model.json.ModelTransformationMode
 *  org.lwjgl.opengl.GL11
 */
package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.lang.runtime.SwitchBootstraps;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import mapped.Class1;
import mapped.Class101;
import mapped.Class1017;
import mapped.Class12;
import mapped.Class1381;
import mapped.Class1391;
import mapped.Class143;
import mapped.Class1443;
import mapped.Class1468;
import mapped.Class1489;
import mapped.Class1503;
import mapped.Class156;
import mapped.Class1668;
import mapped.Class168;
import mapped.Class1745;
import mapped.Class1767;
import mapped.Class1790;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class296;
import mapped.Class298;
import mapped.Class3346;
import mapped.Class3362;
import mapped.Class3449;
import mapped.Class3512;
import mapped.Class352;
import mapped.Class3629;
import mapped.Class365;
import mapped.Class3700;
import mapped.Class377;
import mapped.Class3895;
import mapped.Class3979;
import mapped.Class3997;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class4064;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class431;
import mapped.Class457;
import mapped.Class458;
import mapped.Class471;
import mapped.Class472;
import mapped.Class526;
import mapped.Class5478;
import mapped.Class5512;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5829;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class591;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class6081;
import mapped.Class6307;
import mapped.Class6322;
import mapped.Class6332;
import mapped.Class6454;
import mapped.Class647;
import mapped.Class674;
import mapped.Class70;
import mapped.Class730;
import mapped.Class736;
import mapped.Class821;
import mapped.Class999;
import net.hachimi.client.mixin.bC;
import net.minecraft.util.Formatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.sound.SoundEvent;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import org.lwjgl.opengl.GL11;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class287
extends Class278 {
    Class248 field460;
    Class248 field461;
    Class248 field462;
    Class248 field463;
    Class248 field464;
    private final Map field465 = new HashMap();
    Class248 field466;
    Class248 field467;
    Class248 field468;
    Class248 field469;
    Class248 field470;
    Class248 field471;
    Class248 field472;
    private static long[] field473 = new long[21];
    Class248 field474;
    Class248 field475;
    Class248 field476;
    Class248 field477;
    Class248 field478;
    private static Class287 INSTANCE;
    Class248 field479;
    Class248 field480;
    Class248 field481 = this.method450(new Class253("Armor", "Displays the player's armor", (boolean)field473[1]));
    Class248 field482;
    Class248 field483;
    Class248 field484;
    Class248 field485;
    Class248 field486;
    Class248 field487;

    public static int method1495(int a2) {
        int n2 = a2;
        if (((int)field473[3] | ~n2) - ~n2 != 0) {
            return Class287.method1535();
        }
        return a2 | (int)field473[2];
    }

    private static Class458 method1496() {
        return Class458.method10623();
    }

    public static Class248 method1497(Class287 class287) {
        return class287.field466;
    }

    private static class_746 method1498(class_310 class_3102) {
        return Class287.method1612(class_3102);
    }

    public static Class248 method1499(Class287 class287) {
        return class287.field477;
    }

    private static void method1500() {
        Class6009.method23561();
    }

    private static void method1501() {
        Class3979.method19561();
    }

    private static void method1502() {
        Class1745.method15538();
    }

    private static void method1503(boolean bl2) {
        Class6009.method23559(bl2);
    }

    @Override
    public void method1279() {
        this.field465.clear();
    }

    private static float method1504() {
        return Class6322.method24324();
    }

    private static Object method1505(Class248 class248) {
        return class248.method507();
    }

    private static void method1506() {
        Class6009.method23561();
    }

    private static Object method1507(Class248 class248) {
        return class248.method507();
    }

    public static class_124 method1508() {
        return class_124.field_1065;
    }

    private static Class248 method1509(Class287 class287) {
        return Class287.method1542(class287);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float method1510(int a2) {
        if (((Boolean)this.field472.method507()).booleanValue()) {
            if (a2 > (int)field473[11]) return b -= (float)(a2 - (int)field473[11]) * Class730.field3341;
        }
        int n2 = (Boolean)Class287.method1547(this).method507() != false ? 41183 : 41184;
        block4: while (true) {
            switch (n2) {
                case 41184: {
                    n2 = 41182;
                    continue block4;
                }
                case 41183: {
                    return -18.0f;
                }
            }
            break;
        }
        return -3.5f;
    }

    private static class_124 method1511() {
        return Class287.method1508();
    }

    private static int method1512(int n2, int n3, Class1790 class1790, Class5512 class5512) {
        return Class3449.method17521(n2, n3, class1790, class5512);
    }

    public static Class248 method1513(Class287 class287) {
        return class287.field481;
    }

    private static void method1514() {
        Class5836.method22885();
    }

    private static void method1515() {
        Class298.method1924();
    }

    public static Class1391 method1516() {
        return Class5836.field11394;
    }

    public Float method1517() {
        return (Float)Class287.method1571(this.field470);
    }

    private static void method1518(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method1519() {
        Class6009.method23561();
    }

    public static Class248 method1520(Class287 class287) {
        return class287.field485;
    }

    private static void method1521() {
        Class6009.method23561();
    }

    private static void method1522(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method1523(int n2) {
        return Class287.method1495(n2);
    }

    private static void method1524(Class287 class287, class_4587 class_45872, String string, float f2, float f3, int n2) {
        class287.method1609(class_45872, string, f2, f3, n2);
    }

    private static void method1525(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object method1526(Class248 class248) {
        return class248.method507();
    }

    private static void method1527() {
        Class6009.method23560();
    }

    private static void method1528(class_4587 class_45872, double d2, double d3, double d4, double d5, double d6, int n2) {
        Class6454.method24733(class_45872, d2, d3, d4, d5, d6, n2);
    }

    private void method1529(class_4587 g2, class_1799 h2, int i2, int j2) {
        g2.method_22903();
        if (h2.method_7947() != (int)field473[1]) {
            String a2 = String.valueOf(h2.method_7947());
            class_4597.class_4598 b2 = field290.method_22940().method_23000();
            ((bC)Class287.method1539(field290)).hookDrawLayer(a2, i2 + (int)field473[16] - Class287.field290.field_1772.method_1727(a2), (float)j2 + Class472.field2463, Class287.method1578((int)field473[4]), (boolean)field473[1], g2.method_23760().method_23761(), (class_4597)b2, class_327.class_6415.field_33994, (int)field473[0], (int)field473[13]);
            b2.method_22993();
            ((bC)Class287.field290.field_1772).hookDrawLayer(a2, i2 + (int)field473[16] - Class287.field290.field_1772.method_1727(a2), (float)j2 + 9.0f, Class287.method1495((int)field473[4]), (boolean)field473[0], g2.method_23760().method_23761(), (class_4597)b2, class_327.class_6415.field_33994, (int)field473[0], (int)field473[13]);
            b2.method_22993();
        }
        if (h2.method_31578()) {
            int c2 = h2.method_31579();
            int d2 = h2.method_31580();
            float e2 = i2 + (int)field473[9];
            float f2 = j2 + (int)field473[15];
            Class287.method1621(g2, e2, f2, 13.0, 2.0, (int)field473[2]);
            int n2 = (int)field473[2];
            Class6454.method24667(g2, e2, f2, c2, 1.0, n2 + (d2 & ~n2));
        }
        g2.method_22909();
    }

    private static void method1530(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static class_327 method1531(class_310 class_3102) {
        return Class287.method1623(class_3102);
    }

    public static Class248 method1532(Class287 class287) {
        return class287.field460;
    }

    private static void method1533() {
        Class5836.method22885();
    }

    public Class287() {
        super("Nametags", "Renders info on player nametags", Class556.field2759);
        this.field476 = this.method450(new Class253("Items", "Displays the player's held items", (boolean)field473[1]));
        this.field472 = this.method450(new Class253("Enchantments", "Displays a list of the item's enchantments", (boolean)field473[1]));
        this.field474 = this.method450(new Class253("Durability", "Displays item durability", (boolean)field473[1]));
        this.field478 = this.method450(new Class253("ItemName", "Displays the player's current held item name", (boolean)field473[0]));
        this.field464 = this.method450(new Class253("EntityId", "Displays the player's entity id", (boolean)field473[0]));
        this.field471 = this.method450(new Class253("Gamemode", "Displays the player's gamemode", (boolean)field473[0]));
        this.field462 = this.method450(new Class253("Ping", "Displays the player's server connection ping", (boolean)field473[1]));
        this.field483 = this.method450(new Class253("Health", "Displays the player's current health", (boolean)field473[1]));
        this.field484 = this.method450(new Class253("Totems", "Displays the player's popped totem count", (boolean)field473[0]));
        this.field468 = this.method450(new Class253("Invisibles", "Renders nametags on invisible players", (boolean)field473[1]));
        this.field463 = this.method450(new Class253("Background", "Renders a background behind the nametag", (boolean)field473[1]));
        this.field482 = this.method450(new Class253("Border", "Renders a border around the nametag", (boolean)field473[0]));
        this.field475 = this.method450(new Class253("MobOwner", "Renders nametags on tamed mobs", (boolean)field473[0]));
        this.field479 = this.method450(new Class253("Pearls", "Renders nametags on thrown ender pearls", (boolean)field473[0]));
        this.field469 = this.method450(new Class253("DroppedItems", "Renders nametags on dropped items", (boolean)field473[0]));
        this.field487 = this.method450(new Class260("ItemsTag", "Dropped items tag", Class591.field2889, Class591.values(), this.field469::method507));
        this.field467 = this.method450(new Class252("ItemsRange", "Render nametags on items in range", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(100.0f), (Number)Float.valueOf(Class6332.field13039), this::method1269));
        this.field460 = this.method450(new Class252("FadeStart", "Fade start range", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(90.0f), (Number)Float.valueOf(500.0f), this::method1278));
        this.field477 = this.method450(new Class253("Sounds", "Renders nametags on sounds", (boolean)field473[0]));
        this.field486 = this.method450(new Class252("Scale", "Scale of text", Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(3.0f)));
        this.field461 = this.method450(new Class252("Height", "Nametag offset", Float.valueOf(-3.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.field480 = this.method450(new Class252("WorldTextScale", "Scale of text", Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(3.0f)));
        this.field485 = this.method450(new Class253("Factor", "scale + (factor && pos.distanceTo(x, eyeY, z) > distance ? (pos.distanceTo(x, eyeY, z) - distance) * 0.1 * scaling : 0)", (boolean)field473[1]));
        this.field466 = this.method450(new Class252("Scaling", "scale + (factor && pos.distanceTo(x, eyeY, z) > distance ? (pos.distanceTo(x, eyeY, z) - distance) * 0.1 * scaling : 0)", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(3.0f), this.field485::method507));
        this.field470 = this.method450(new Class252("Distance", "scale + (factor && pos.distanceTo(x, eyeY, z) > distance ? (pos.distanceTo(x, eyeY, z) - distance) * 0.1 * scaling : 0)", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(6.0f), (Number)Float.valueOf(20.0f), this.field485::method507));
        INSTANCE = this;
    }

    public Float method1534() {
        return (Float)this.field466.method507();
    }

    private static int method1535() {
        return Class5659.method22101();
    }

    private static void method1536() {
        Class1745.method15538();
    }

    private static boolean method1537(Class5478 class5478, class_2561 class_25612) {
        return class5478.method21243(class_25612);
    }

    private static void method1538(long l2) {
        Class287.method1544(l2);
    }

    private static class_327 method1539(class_310 class_3102) {
        return Class287.method1618(class_3102);
    }

    private Boolean method1278() {
        return (Boolean)this.field469.method507();
    }

    public static class_124 method1540() {
        return class_124.field_1060;
    }

    private static int method1541(int n2, int n3, Class377 class377, Class156 class156) {
        return Class3449.method17511(n2, n3, class377, class156);
    }

    public static Class248 method1542(Class287 class287) {
        return class287.field470;
    }

    private static void method1543() {
        Class298.method1924();
    }

    private static void method1544(long l2) {
        Class287.field473[3] = l2 ^ 0xE58CA47CBE4BB9BFL;
        Class287.field473[7] = l2 ^ 0x1A735B83424BBBB8L;
        Class287.field473[10] = l2 ^ 0x1A735B83424BBBBCL;
        Class287.field473[12] = l2 ^ 0x1A735B83174BBDBFL;
        Class287.field473[16] = l2 ^ 0x1A735B83424BB9AEL;
        Class287.field473[17] = l2 ^ 0xE58CA47CBDA4B8F8L;
        Class287.field473[0] = l2 ^ 0x1A735B83424BB9BFL;
        Class287.field473[5] = l2 ^ 0x1A735B83424BB9BAL;
        Class287.field473[11] = l2 ^ 0x1A735B83424BB9BCL;
        Class287.field473[19] = l2 ^ 0xE58CA47CBDB420BFL;
        Class287.field473[1] = l2 ^ 0x1A735B83424BB9BEL;
        Class287.field473[8] = l2 ^ 0x1A735B83424BB9BBL;
        Class287.field473[2] = l2 ^ 0xE58CA47CBD4BB9BFL;
        Class287.field473[4] = l2 ^ 0xE58CA47CBDB44640L;
        Class287.field473[9] = l2 ^ 0x1A735B83424BB9BDL;
        Class287.field473[18] = l2 ^ 0xE58CA47CBDB49CBFL;
        Class287.field473[15] = l2 ^ 0x1A735B83424BB9B2L;
        Class287.field473[6] = l2 ^ 0x1A735B83424BB940L;
        Class287.field473[14] = l2 ^ 0xE58CA47CBD88F7FEL;
        Class287.field473[13] = l2 ^ 0x1A735B8342BBB94FL;
        Class287.field473[20] = l2 ^ 0x1A735B83424BBA57L;
    }

    private Boolean method1269() {
        return (Boolean)this.field469.method507();
    }

    private static Object method1545(Class248 class248) {
        return class248.method507();
    }

    private static int method1546(int n2, int n3, Class431 class431, Class70 class70) {
        return Class3449.method17550(n2, n3, class431, class70);
    }

    public static Class248 method1547(Class287 class287) {
        return class287.field481;
    }

    private static void method1548() {
        Class5836.method22897();
    }

    private static void method1549() {
        Class5836.method22897();
    }

    private static class_124 method1550(int a2) {
        class_124 b2 = Class287.method1540();
        if (a2 > (int)field473[1]) {
            b2 = Class287.method1588();
        }
        if (a2 > (int)field473[9]) {
            b2 = class_124.field_1054;
        }
        if (a2 > (int)field473[11]) {
            b2 = Class287.method1511();
        }
        if (a2 > (int)field473[8]) {
            b2 = class_124.field_1061;
        }
        if (a2 > (int)field473[5]) {
            b2 = Class287.method1624();
        }
        return b2;
    }

    private static void method1551() {
        Class298.method1924();
    }

    private static RoundingMode method1552() {
        return Class287.method1563();
    }

    private static void method1553() {
        Class3979.method19561();
    }

    public static Class287 method1554() {
        return INSTANCE;
    }

    static {
        Class287.method1538(1905967686618954175L);
    }

    private static boolean method1555() {
        return Class4196.method20801();
    }

    private static void method1556() {
        Class298.method1924();
    }

    public static class_124 method1557() {
        return class_124.field_1060;
    }

    public static class_746 method1558(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method1559(class_4587 f2, class_1799 g2, float h2, float i2) {
        if (!g2.method_7942()) return;
        Set j2 = class_1890.method_57532((class_1799)g2).method_57539();
        float k2 = 0.0f;
        Iterator iterator = j2.iterator();
        while (iterator.hasNext()) {
            Object2IntMap.Entry e2 = (Object2IntMap.Entry)iterator.next();
            int b2 = e2.getIntValue();
            StringBuilder c2 = new StringBuilder();
            String d2 = class_1887.method_8179((class_6880)((class_6880)e2.getKey()), (int)b2).getString();
            if (d2.contains("Vanish")) {
                c2.append("Van");
            } else {
                int n2 = d2.contains("Bind") ? 57478 : 57479;
                block5: while (true) {
                    switch (n2) {
                        case 57479: {
                            n2 = 57477;
                            continue block5;
                        }
                        case 57478: {
                            c2.append("Bind");
                            break block5;
                        }
                        default: {
                            int a2;
                            int n3 = a2 = b2 > (int)field473[1] ? (int)field473[9] : (int)field473[11];
                            if (d2.length() > a2) {
                                d2 = d2.substring((int)field473[0], a2);
                            }
                            c2.append(d2);
                            c2.append(b2);
                        }
                    }
                    break;
                }
            }
            this.method1609(f2, c2.toString(), h2 * 2.0f, (i2 + k2) * 2.0f, (int)field473[4]);
            k2 += 4.5f;
        }
        return;
    }

    private void method1560(class_4587 a2, class_1799 b2, float c2, float d2) {
        if (!b2.method_7963()) {
            return;
        }
        int e2 = b2.method_7936();
        int f2 = b2.method_7919();
        int g2 = (int)((float)(e2 - f2) / (float)e2 * 100.0f);
        this.method1609(a2, g2 + "%", c2 * 2.0f, d2 * 2.0f, Class4045.method20104((float)(e2 - f2) / (float)e2 * 120.0f, 100.0f, 50.0f, 1.0f).getRGB());
    }

    private static void method1561() {
        Class1745.method15538();
    }

    @Class1
    public void method1562(Class143 a2) {
        if (((Boolean)Class287.method1499(this).method507()).booleanValue()) {
            Class287.method1587(this).put(new Class647(a2.method281(), a2.method279()), System.currentTimeMillis());
        }
    }

    public static RoundingMode method1563() {
        return RoundingMode.HALF_UP;
    }

    private static int method1564(int n2, int n3, Class1017 class1017, Class12 class12) {
        return Class3449.method17559(n2, n3, class1017, class12);
    }

    private static Object method1565(Class248 class248) {
        return class248.method507();
    }

    private static void method1566(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private String method1567(class_1657 l2) {
        int n2;
        StringBuilder m2;
        block16: {
            class_124 g2;
            double i2;
            block18: {
                block20: {
                    block21: {
                        block19: {
                            block17: {
                                class_640 a2;
                                m2 = new StringBuilder(l2.method_5477().getString());
                                m2.append(" ");
                                int n3 = (Boolean)this.field464.method507() != false ? 20168 : 20169;
                                block4: while (true) {
                                    switch (n3) {
                                        case 20169: {
                                            n3 = 20167;
                                            continue block4;
                                        }
                                        case 20168: {
                                            m2.append("ID: ");
                                            m2.append(l2.method_5628());
                                            m2.append(" ");
                                            break block4;
                                        }
                                    }
                                    break;
                                }
                                if (((Boolean)this.field471.method507()).booleanValue()) {
                                    if (l2.method_7337()) {
                                        m2.append("[C] ");
                                    } else if (l2.method_7325()) {
                                        m2.append("[I] ");
                                    } else {
                                        m2.append("[S] ");
                                    }
                                }
                                if (((Boolean)this.field462.method507()).booleanValue() && field290.method_1562() != null && (a2 = field290.method_1562().method_2871(l2.method_7334().getId())) != null) {
                                    m2.append(a2.method_2959());
                                    m2.append("ms ");
                                }
                                if (!((Boolean)this.field483.method507()).booleanValue() || Double.isNaN(i2 = (double)(l2.method_6032() + l2.method_6067())) || Double.isInfinite(i2)) break block16;
                                if (!(i2 > 18.0)) break block17;
                                class_124 b2 = Class287.method1557();
                                break block18;
                            }
                            if (i2 > Class3512.field7741) break block19;
                            if (!(i2 > 12.0)) break block20;
                            break block21;
                        }
                        class_124 c2 = class_124.field_1077;
                        break block18;
                    }
                    class_124 d2 = class_124.field_1054;
                    break block18;
                }
                if (i2 > 8.0) {
                    class_124 e2 = class_124.field_1065;
                } else {
                    if (i2 > 4.0) {
                        class_124 f2 = class_124.field_1061;
                        Class5836.method22890();
                        return null;
                    }
                    g2 = class_124.field_1079;
                }
            }
            BigDecimal h2 = new BigDecimal(i2);
            h2 = h2.setScale((int)field473[1], Class287.method1552());
            m2.append(g2);
            m2.append(h2.doubleValue());
            m2.append(" ");
        }
        int n4 = (Boolean)Class287.method1565(Class287.method1614(this)) == false ? 63954 : 63953;
        while ((n2 = n4) != 63953) {
            if (n2 != 63954) return m2.toString().trim();
            n4 = 63952;
        }
        if (l2 == Class287.field290.field_1724) {
            return m2.toString().trim();
        }
        int k2 = Class5723.field11040.method11905((class_1297)l2);
        if (k2 <= 0) return m2.toString().trim();
        class_124 j2 = Class287.method1550(k2);
        m2.append(j2);
        m2.append(-k2);
        m2.append(" ");
        return m2.toString().trim();
    }

    private static Object method1568(Class248 class248) {
        return class248.method507();
    }

    private static void method1569() {
        Class1503.method14420();
    }

    private static void method1570(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Object method1571(Class248 class248) {
        return class248.method507();
    }

    private static void method1572() {
        Class5659.method22184();
    }

    private static void method1573(List a2, class_1799 b2) {
        if (!b2.method_7960()) {
            a2.add(b2);
        }
    }

    public static Class248 method1574(Class287 class287) {
        return class287.field479;
    }

    @Class1
    public void method1575(Class168 a2) {
        if (a2.method325() instanceof class_1657 && a2.method325() != Class287.method1581(field290)) {
            a2.method10();
        }
    }

    private static int method1576(int n2, int n3, Class526 class526, Class101 class101) {
        return Class3449.method17568(n2, n3, class526, class101);
    }

    private static void method1577() {
        Class6009.method23560();
    }

    private static int method1578(int n2) {
        return Class287.method1495(n2);
    }

    private static void method1579() {
        Class6009.method23561();
    }

    private static void method1580(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static class_746 method1581(class_310 class_3102) {
        return Class287.method1558(class_3102);
    }

    public static Class248 method1582(Class287 class287) {
        return class287.field477;
    }

    private static void method1583() {
        Class4146.method20694();
    }

    /*
     * Unable to fully structure code
     */
    private void method1584(class_4587 g, class_1657 h) {
        block22: {
            block23: {
                block24: {
                    block21: {
                        i = new CopyOnWriteArrayList<class_1799>();
                        if (!h.method_6079().method_7960()) {
                            i.add(h.method_6079());
                        }
                        h.method_31548().field_7548.forEach((Consumer<class_1799>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, method1573(java.util.List net.minecraft.item.ItemStack ), (Lnet/minecraft/class_1799;)V)(i));
                        if (h.method_6047().method_7960()) break block21;
                        v0 = 44253;
                        ** GOTO lbl14
                    }
                    v0 = 44254;
                    if (true) ** GOTO lbl14
                    block8: while (true) {
                        v0 = 44252;
lbl14:
                        // 3 sources

                        switch (v0) {
                            case 44254: {
                                continue block8;
                            }
                            case 44253: {
                                i.add(h.method_6047());
                            }
                        }
                        break;
                    }
                    Collections.reverse(i);
                    j = 0.0f;
                    k = (int)Class287.field473[0];
                    l = (int)Class287.field473[1];
                    var7_7 = i.iterator();
                    if (var7_7.hasNext()) {
                        a = (class_1799)var7_7.next();
                        j -= l != 0 ? 9.0f : 8.0f;
                        l = (int)Class287.field473[0];
                        if (a.method_58657().method_57534().size() > k) {
                            while (true) {
                                // Infinite loop
                            }
                        }
                        Class4036.method20085(0.17446387f, 0.04399699f, 0.5579121f, 0.37052393f, 0.043578684f, 0.92152315f);
                        return;
                    }
                    m = this.method1510(k);
                    a = i.iterator();
                    if (!a.hasNext()) break block22;
                    f = (class_1799)a.next();
                    e = f.method_7909() instanceof class_1738;
                    if ((!((Boolean)Class287.method1625(this).method507()).booleanValue() || !e) && (!((Boolean)Class287.method1568(this.field476)).booleanValue() || e)) break block23;
                    if (e) ** GOTO lbl-1000
                    if (((Boolean)this.field472.method507()).booleanValue()) break block24;
                    v1 = 57180;
                    ** GOTO lbl50
                }
                v1 = 57181;
                if (true) ** GOTO lbl50
                block10: while (true) {
                    v1 = 57179;
lbl50:
                    // 3 sources

                    switch (v1) {
                        case 57181: {
                            continue block10;
                        }
                        case 57180: {
                            v2 = -18.5f;
                            break block10;
                        }
                        default: lbl-1000:
                        // 2 sources

                        {
                            v2 = m;
                        }
                    }
                    break;
                }
                c = v2;
                g.method_22903();
                g.method_46416(j, c, 0.0f);
                g.method_46416(8.0f, Class3700.field8324, 0.0f);
                g.method_22905(Class4064.field9387, -16.0f, 0.1f);
                d = Class287.field290.method_1480().method_4019(f, (class_1937)Class287.field290.field_1687, null, (int)Class287.field473[0]);
                Class287.field290.method_1480().method_23179(f, class_811.field_4319, (boolean)Class287.field473[0], g, (class_4597)Class287.field290.method_22940().method_23000(), (int)Class287.field473[13], class_4608.field_21444, d);
                Class287.field290.method_22940().method_23000().method_22993();
                g.method_22909();
                this.method1529(g, f, 0, (int)c);
                g.method_22905(0.5f, 0.5f, Class1443.field5495);
                if (f.method_7909() == class_1802.field_8367) {
                    if (((Boolean)Class287.method1513(this).method507()).booleanValue()) {
                        v3 = 1.0f;
                        Class6322.method24332(0.8698739f, 0.74084914f);
                        return;
                    }
                    b = (m + -13.5f) * 2.0f;
                    Class287.method1524(this, g, "God", 4.0f, b, (int)Class287.field473[14]);
                } else if (((Boolean)this.field472.method507()).booleanValue()) {
                    this.method1559(g, f, 2.0f, m);
                }
                g.method_22905(2.0f, 2.0f, 2.0f);
            }
            g.method_22905(0.5f, 0.5f, 0.5f);
            if (((Boolean)this.field474.method507()).booleanValue()) {
                this.method1560(g, f, 2.0f, m - Class1489.field5628);
            }
            g.method_22905(2.0f, 2.0f, 2.0f);
            j = 16.0f;
            Class5836.method22885();
            return;
        }
        n = h.method_6047();
        if (n.method_7960()) {
            return;
        }
        g.method_22905(Class3346.field7226, 0.5f, Class3629.field8110);
        if (((Boolean)this.field478.method507()).booleanValue()) {
            v4 = 40271;
            Class287.method1561();
            return;
        }
        v5 = 40272;
        Class287.method1620(0.71535873f, 0.37510014f);
    }

    public static Class248 method1585(Class287 class287) {
        return class287.field470;
    }

    private static void method1586(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Map method1587(Class287 class287) {
        return class287.field465;
    }

    public static class_124 method1588() {
        return class_124.field_1077;
    }

    private static void method1589(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static class_7833 method1590() {
        return Class287.method1595();
    }

    private static void method1591() {
        Class4146.method20694();
    }

    private static int method1592(int n2, int n3, Class352 class352, Class5829 class5829) {
        return Class3449.method17564(n2, n3, class352, class5829);
    }

    private void method1593(class_4587 a2, class_1799 b2, float c2, float d2) {
        String e2 = b2.method_7964().getString();
        float f2 = (Class296.method1855().method1265() ? Class5836.field11394.method14084(e2) / 2.0f : (float)Class287.method1611(field290).method_1727(e2)) / 4.0f;
        this.method1609(a2, e2, (c2 - f2) * 2.0f, d2 * 2.0f, (int)field473[4]);
    }

    private static Class457 method1594() {
        return Class457.method10620();
    }

    public static class_7833 method1595() {
        return class_7833.field_40716;
    }

    private static void method1596() {
        Class298.method1924();
    }

    private static void method1597() {
        Class5836.method22897();
    }

    private static void method1598() {
        Class5659.method22184();
    }

    private static void method1599(float f2) {
        Class5836.method22907(f2);
    }

    private static void method1600(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1601() {
        Class298.method1924();
    }

    private static void method1602() {
        Class6009.method23560();
    }

    public Float method1603() {
        return (Float)this.field480.method507();
    }

    private static void method1604(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method1605(Class59 O2) {
        block38: {
            if (Class287.field290.field_1773 == null || Class287.field290.field_1687 == null || field290.method_1560() == null) {
                return;
            }
            Class287.method1622();
            GL11.glDepthFunc((int)((int)field473[7]));
            class_4184 P2 = Class287.field290.field_1773.method_19418();
            Iterator<Object> iterator = Class287.field290.field_1687.method_18112().iterator();
            block23: while (true) {
                class_1297 class_12972;
                if (iterator.hasNext()) {
                    class_12972 = (class_1297)iterator.next();
                    if (!Class6454.method24660(class_12972.method_5829().method_1012(0.0, Class3997.field9156, 0.0))) continue;
                } else {
                    if (((Boolean)Class287.method1582(this).method507()).booleanValue()) {
                        this.field465.entrySet().removeIf(Class287::method1613);
                        iterator = this.field465.entrySet().iterator();
                        break;
                    }
                    break block38;
                }
                Objects.requireNonNull(class_12972);
                int n2 = (int)field473[0];
                block24: while (true) {
                    class_1297 class_12973;
                    switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class_1657.class, class_1496.class, class_1321.class, class_1542.class, class_1684.class}, (Object)class_12973, n2)) {
                        case 0: {
                            class_1657 h2 = (class_1657)class_12973;
                            if (h2 == Class287.field290.field_1724 && !Class365.method4718().method1265() || !h2.method_5805()) continue block23;
                            int n3 = (Boolean)this.field468.method507() != false ? 52406 : 52405;
                            block25: while (true) {
                                switch (n3) {
                                    case 52406: {
                                        n3 = 52404;
                                        continue block25;
                                    }
                                    case 52405: {
                                        if (!h2.method_5767()) break block25;
                                        continue block23;
                                    }
                                }
                                break;
                            }
                            String a2 = this.method1567(h2);
                            class_243 b2 = Class6023.method23746((class_1297)h2, field290.method_60646().method_60637((boolean)field473[1]));
                            double c2 = h2.method_23317() - b2.method_10216();
                            double d2 = h2.method_23318() - b2.method_10214();
                            double e2 = h2.method_23321() - b2.method_10215();
                            float f2 = Class296.method1855().method1265() ? Class287.method1516().method14084(a2) / 2.0f : (float)Class287.field290.field_1772.method_1727(a2);
                            float g2 = f2 / 2.0f;
                            this.method1631(a2, g2, h2, c2, d2, e2, P2);
                            continue block23;
                        }
                        case 1: {
                            class_1496 n4 = (class_1496)class_12973;
                            if (n4.method_6139() != null) {
                                int n5 = 26089;
                                Class287.method1597();
                                return;
                            }
                            int n6 = 26090;
                            block26: while (true) {
                                switch (n6) {
                                    case 26090: {
                                        n6 = 26088;
                                        continue block26;
                                    }
                                    case 26089: {
                                        if (!((Boolean)Class287.method1526(this.field475)).booleanValue()) break block26;
                                        Class6454.method24636(Class674.field3240, Class471.field2457, Class6307.field12956, 0.2639460874325239);
                                        return;
                                    }
                                }
                                break;
                            }
                            n2 = (int)field473[9];
                            continue block24;
                        }
                        case 2: {
                            class_1321 t2 = (class_1321)class_12973;
                            if (t2.method_6139() == null || !((Boolean)this.field475.method507()).booleanValue()) {
                                n2 = (int)field473[11];
                                continue block24;
                            }
                            String s2 = Class5723.field11043.method16770(t2.method_6139());
                            int n7 = s2 != null ? 51049 : 51050;
                            block27: while (true) {
                                switch (n7) {
                                    case 51050: {
                                        n7 = 51048;
                                        continue block27;
                                    }
                                    case 51049: {
                                        class_243 o2 = Class6023.method23746(class_12972, field290.method_60646().method_60637((boolean)field473[1]));
                                        double p2 = class_12972.method_23317() - o2.method_10216();
                                        double q2 = class_12972.method_23318() + (double)class_12972.method_17682() + (double)0.43f - o2.method_10214();
                                        double r2 = class_12972.method_23321() - o2.method_10215();
                                        Class6454.method24616("Owner: " + s2, p2, q2, r2, (int)field473[4]);
                                        continue block23;
                                    }
                                }
                                break;
                            }
                            continue block23;
                        }
                        case 3: {
                            Object object;
                            class_1542 C2 = (class_1542)class_12973;
                            if (!((Boolean)Class287.method1545(this.field469)).booleanValue()) {
                                n2 = (int)field473[8];
                                continue block24;
                            }
                            double u2 = Class287.field290.field_1724.method_5739((class_1297)C2);
                            if (u2 > (double)((Float)this.field467.method507()).floatValue()) continue block23;
                            double v2 = u2 > (double)((Float)this.field460.method507()).floatValue() ? 1.0 - (u2 - (double)((Float)Class287.method1532(this).method507()).floatValue()) / (double)(((Float)this.field467.method507()).floatValue() - ((Float)this.field460.method507()).floatValue()) : 1.0;
                            class_243 w2 = Class6023.method23746((class_1297)C2, field290.method_60646().method_60637((boolean)field473[1]));
                            double x2 = C2.method_23317() - w2.method_10216();
                            double y2 = C2.method_23318() - w2.method_10214();
                            double z2 = C2.method_23321() - w2.method_10215();
                            class_1799 A2 = C2.method_6983();
                            String string = A2.method_7964().getString();
                            Object object2 = ((Class591)((Object)this.field487.method507())).method11200() && A2.method_7947() > (int)field473[1] ? " x" + A2.method_7947() : "";
                            int n8 = ((Class591)((Object)this.field487.method507())).method11206() ? 12522 : 12523;
                            block28: while (true) {
                                switch (n8) {
                                    case 12523: {
                                        n8 = 12521;
                                        continue block28;
                                    }
                                    case 12522: {
                                        object = " " + field395.format(Class287.field290.field_1724.method_5739((class_1297)C2)) + "m";
                                        break block28;
                                    }
                                    default: {
                                        object = "";
                                    }
                                }
                                break;
                            }
                            String B2 = string + (String)object2 + (String)object;
                            Class6454.method24616(B2, x2, y2, z2, new Color((int)field473[6], (int)field473[6], (int)field473[6], (int)(255.0 * v2)).getRGB());
                            continue block23;
                        }
                        case 4: {
                            class_1684 J2 = (class_1684)class_12973;
                            if (!((Boolean)Class287.method1574(this).method507()).booleanValue()) {
                                n2 = (int)field473[5];
                                continue block24;
                            }
                            if (J2.method_24921() == null) continue block23;
                            class_243 E2 = Class6023.method23746((class_1297)J2, field290.method_60646().method_60637((boolean)field473[1]));
                            double F2 = J2.method_23317() - E2.method_10216();
                            double G2 = J2.method_23318() - E2.method_10214();
                            double H2 = J2.method_23321() - E2.method_10215();
                            class_1297 I2 = J2.method_24921();
                            if (!(I2 instanceof class_1657)) continue block23;
                            class_1657 D2 = (class_1657)I2;
                            Class6454.method24616(D2.method_5477().getString(), F2, G2, H2, this.method1617(D2));
                            continue block23;
                        }
                    }
                    break;
                }
            }
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                class_3414 L2 = ((Class647)entry.getKey()).method11437();
                class_243 M2 = ((Class647)entry.getKey()).method11436();
                Class6454.method24616(L2.method_14833().method_43903(), M2.field_1352, M2.field_1351, M2.field_1350, (int)field473[4]);
            }
        }
        GL11.glDepthFunc((int)((int)field473[10]));
        Class287.method1627();
    }

    private static Object method1606(Class248 class248) {
        return class248.method507();
    }

    public Boolean method1607() {
        return (Boolean)Class287.method1520(this).method507();
    }

    private static void method1608() {
        Class5836.method22890();
    }

    private void method1609(class_4587 b2, String c2, float d2, float e2, int f2) {
        if (Class296.method1855().method1265()) {
            b2.method_22903();
            b2.method_46416(d2, e2, 0.0f);
            b2.method_22905(Class821.field3610, Class1767.field6622, 0.5f);
            Class5836.field11394.method14108(b2, c2, 0.0, 0.0, f2);
            b2.method_22909();
        } else {
            class_4597.class_4598 a2 = field290.method_22940().method_23000();
            ((bC)Class287.field290.field_1772).hookDrawLayer(c2, d2, e2, Class287.method1495(f2), (boolean)field473[1], b2.method_23760().method_23761(), (class_4597)a2, class_327.class_6415.field_33994, (int)field473[0], (int)field473[13]);
            a2.method_22993();
            ((bC)Class287.method1531(field290)).hookDrawLayer(c2, d2, e2, Class287.method1523(f2), (boolean)field473[0], b2.method_23760().method_23761(), (class_4597)a2, class_327.class_6415.field_33994, (int)field473[0], (int)field473[13]);
            a2.method_22993();
        }
    }

    private static void method1610(float f2) {
        Class5836.method22907(f2);
    }

    public static class_327 method1611(class_310 class_3102) {
        return class_3102.field_1772;
    }

    public static class_746 method1612(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method1613(Map.Entry a2) {
        return (System.currentTimeMillis() - (Long)a2.getValue() > field473[20] ? (int)field473[1] : (int)field473[0]) != 0;
    }

    public static Class248 method1614(Class287 class287) {
        return class287.field484;
    }

    private static void method1615() {
        Class3979.method19561();
    }

    private static void method1616() {
        Class5659.method22184();
    }

    private int method1617(class_1657 a2) {
        if (a2 == Class287.field290.field_1724) {
            return Class287.method1594().method10615((int)field473[6]);
        }
        if (Class287.method1537(Class5723.field11045, a2.method_5477())) {
            return Class458.method10623().method10627();
        }
        if (a2.method_5767()) {
            return (int)field473[18];
        }
        if (a2 instanceof Class1468) {
            return (int)field473[17];
        }
        if (a2.method_5715()) {
            return (int)field473[19];
        }
        return (int)field473[4];
    }

    public static class_327 method1618(class_310 class_3102) {
        return class_3102.field_1772;
    }

    private static void method1619() {
        Class4146.method20694();
    }

    private static void method1620(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method1621(class_4587 class_45872, double d2, double d3, double d4, double d5, int n2) {
        Class6454.method24667(class_45872, d2, d3, d4, d5, n2);
    }

    private static void method1622() {
        Class6009.method23560();
    }

    public static class_327 method1623(class_310 class_3102) {
        return class_3102.field_1772;
    }

    public static class_124 method1624() {
        return class_124.field_1079;
    }

    public static Class248 method1625(Class287 class287) {
        return class287.field481;
    }

    private static void method1626(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method1627() {
        Class6009.method23561();
    }

    private static void method1628() {
        Class6009.method23560();
    }

    private static void method1629() {
        Class5659.method22184();
    }

    private static void method1630() {
        Class6009.method23560();
    }

    private void method1631(String a2, float b2, class_1657 c2, double d2, double e2, double f2, class_4184 g2) {
        class_243 h2 = g2.method_19326();
        class_4587 i2 = new class_4587();
        double j2 = e2 + (double)c2.method_17682() + (double)(c2.method_5715() ? 0.4f : 0.43f) + (double)((Float)this.field461.method507()).floatValue();
        float k2 = (float)((double)(Class3895.field8868 * ((Float)this.field486.method507()).floatValue()) + ((Boolean)Class287.method1507(this.field485) != false && h2.method_1028(d2, j2, f2) > (double)(((Float)Class287.method1505(this.field470)).floatValue() * ((Float)Class287.method1585(this).method507()).floatValue()) ? (Math.sqrt(h2.method_1028(d2, j2, f2)) - (double)((Float)Class287.method1509(this).method507()).floatValue()) * (double)-0.0025f * (double)((Float)Class287.method1497(this).method507()).floatValue() : 0.0));
        i2.method_22907(class_7833.field_40714.rotationDegrees(g2.method_19329()));
        i2.method_22907(Class287.method1590().rotationDegrees(g2.method_19330() + Class1381.field5335));
        i2.method_22904(d2 - h2.method_10216(), j2 - h2.method_10214() + (double)((k2 / Class999.field4151 - 1.0f) / 4.0f), f2 - h2.method_10215());
        i2.method_22907(class_7833.field_40716.rotationDegrees(-g2.method_19330()));
        i2.method_22907(class_7833.field_40714.rotationDegrees(g2.method_19329()));
        i2.method_22905(k2, k2, 1.0f);
        if (((Boolean)this.field463.method507()).booleanValue()) {
            double d3 = -b2 - 1.0f;
            double d4 = b2 * 2.0f + Class736.field3360;
            Objects.requireNonNull(Class287.field290.field_1772);
            Class287.method1528(i2, d3, Class6081.field12248, d4, 10.0, 0.0, (int)field473[12]);
        }
        if (((Boolean)this.field482.method507()).booleanValue()) {
            double d5 = -b2 - 1.0f;
            double d6 = b2 * 2.0f + 2.5f;
            Objects.requireNonNull(Class287.field290.field_1772);
            Class6454.method24591(i2, d5, -1.0, d6, Class3362.field7293 + 1.0f, c2 != Class287.method1498(field290) && Class5723.field11045.method21233(c2.method_5476().getString()) ? Class287.method1496().method10627() : Class457.method10620().method10621().intValue());
        }
        int l2 = this.method1617(c2);
        this.method1584(i2, c2);
        this.method1609(i2, a2, -b2, 0.0f, l2);
    }

    private static void method1632() {
        Class6009.method23561();
    }

    private static void method1633() {
        Class6009.method23560();
    }

    private static void method1634(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

