/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.PickaxeItem
 *  net.minecraft.item.SwordItem
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class1215;
import mapped.Class1308;
import mapped.Class131;
import mapped.Class1503;
import mapped.Class1779;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class252;
import mapped.Class260;
import mapped.Class278;
import mapped.Class376;
import mapped.Class3812;
import mapped.Class3833;
import mapped.Class3850;
import mapped.Class408;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class447;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class6009;
import mapped.Class606;
import mapped.Class607;
import mapped.Class926;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.network.packet.Packet;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class297
extends Class278 {
    private static long[] field554 = new long[2];
    Class926 field555;
    boolean field556;
    public static Class297 INSTANCE;
    Class248 field557;
    Class248 field558 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));

    /*
     * Enabled aggressive block sorting
     */
    public boolean method1857() {
        class_1792 a2 = Class297.method1878(Class5723.field11058).method_7909();
        if (a2 instanceof class_1829) return (int)field554[1] != 0;
        if (a2 instanceof class_1810) {
            return (int)field554[1] != 0;
        }
        class_1293 b2 = Class297.method1863(field290).method_6112(class_1294.field_5911);
        class_1293 c2 = Class297.field290.field_1724.method_6112(class_1294.field_5910);
        if (b2 == null) return (int)field554[1] != 0;
        if (c2 == null) return Class4196.method20803(771450177);
        int n2 = 63924;
        block4: while (true) {
            switch (n2) {
                case 63925: {
                    n2 = 63923;
                    continue block4;
                }
                case 63924: {
                    int n3 = b2.method_5578() >= c2.method_5578() ? 58018 : 58017;
                    int n4;
                    while ((n4 = n3) != 58017) {
                        if (n4 != 58018) break block4;
                        n3 = 58016;
                    }
                    return (int)field554[1] != 0;
                }
            }
            break;
        }
        if (!INSTANCE.method1265()) {
            return (int)field554[0] != 0;
        }
        Class3812 d2 = new Class3812(Class297::method1869, (Class607)((Object)this.field558.method507())).method18502();
        return d2.method18523();
    }

    private static boolean method1858() {
        return Class5659.method22111();
    }

    public static Class248 method1859(Class297 class297) {
        return class297.field558;
    }

    static {
        Class297.method1870(-5748649816544614985L);
    }

    private static boolean method1860(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static Object method1861(Class248 class248) {
        return class248.method507();
    }

    private static boolean method1862(class_1799 a2) {
        int b2 = Class1308.method13621(a2, class_1893.field_9118);
        return (b2 > 0 ? (int)field554[1] : (int)field554[0]) != 0;
    }

    public static class_746 method1863(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method1864(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method1865() {
        Class4146.method20694();
    }

    private static boolean method1866() {
        return Class408.method6431();
    }

    private static boolean method1867(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static void method1868() {
        Class4146.method20694();
    }

    private static boolean method1869(class_1799 a2) {
        return a2.method_7909() instanceof class_1829;
    }

    private static void method1870(long l2) {
        Class297.field554[1] = l2 ^ 0xB038B17312BE65B6L;
        Class297.field554[0] = l2 ^ 0xB038B17312BE65B7L;
    }

    private static void method1871(Class5496 class5496, class_2596 class_25962) {
        class5496.method21342(class_25962);
    }

    public Class297() {
        super("AntiWeakness", "Prevent weakness inability to attack", Class556.field2758);
        this.field557 = this.method450(new Class252("Delay", "anti weak switch delay", Float.valueOf(0.0f), Float.valueOf(5.0f), Float.valueOf(Class1779.field6663)));
        this.field555 = new Class926();
        INSTANCE = this;
    }

    private static void method1872(Class3812 class3812, int n2) {
        class3812.method18531(n2);
    }

    private static void method1873(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method1874() {
        return Class447.method10252();
    }

    public static void method1875(Class297 class297, boolean bl2) {
        class297.field556 = bl2;
    }

    private static boolean method1876() {
        return Class447.method10252();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    @Class1(priority=99)
    public void method1877(Class131 g2) {
        block8: {
            int n2;
            int n3;
            block7: {
                block6: {
                    if (Class297.field290.field_1724 == null) return;
                    if (Class297.field290.field_1687 == null) return;
                    if (this.field556) {
                        return;
                    }
                    if (!this.field555.method12595(Float.valueOf(((Float)this.field557.method507()).floatValue() * 1000.0f))) {
                        return;
                    }
                    class_2596 class_25962 = g2.method251();
                    if (!(class_25962 instanceof Class3833)) {
                        return;
                    }
                    Class3833 f2 = (Class3833)class_25962;
                    if (f2.method18777() != Class606.field2947) return;
                    class_1799 b2 = Class5723.field11058.method18908();
                    if (b2.method_7909() instanceof class_1810) return;
                    if (b2.method_7909() instanceof class_1829) return;
                    if (b2.method_7909() instanceof class_1743) break block6;
                    n3 = 58917;
                    n2 = n3;
                    if (n2 == 58916) return;
                    if (n2 == 58917) break block7;
                    break block8;
                }
                n3 = 58916;
                if (!true) break block7;
                n2 = n3;
                if (n2 == 58916) return;
                if (n2 != 58917) break block8;
            }
            do {
                n3 = 58915;
                n2 = n3;
                if (n2 == 58916) return;
            } while (n2 == 58917);
        }
        class_1293 c2 = Class297.field290.field_1724.method_6112(class_1294.field_5911);
        class_1293 d2 = Class297.field290.field_1724.method_6112(class_1294.field_5910);
        if (c2 == null) return;
        if (d2 != null && c2.method_5578() < d2.method_5578()) {
            return;
        }
        Class3812 e2 = new Class3812(Class297::method1862, (Class607)((Object)Class297.method1861(Class297.method1859(this)))).method18502();
        if (!e2.method18523()) return;
        int a2 = Class5723.field11058.method18969();
        this.field556 = (int)field554[1];
        Class297.method1872(e2, a2);
        Class297.method1871(Class5723.field11048, g2.method251());
        e2.method18534(a2);
        Class297.method1875(this, (boolean)field554[0]);
        this.field555.method12593();
        g2.method10();
    }

    private static class_1799 method1878(Class3850 class3850) {
        return class3850.method18908();
    }

    private static boolean method1879(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static boolean method1880() {
        return Class376.method4987();
    }

    private static boolean method1881() {
        return Class1807.method15742();
    }

    private static boolean method1882() {
        return Class5659.method22111();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

