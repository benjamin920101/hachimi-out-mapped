/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.ItemStack
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.ingame.GenericContainerScreen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mapped.Class1;
import mapped.Class1215;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class211;
import mapped.Class221;
import mapped.Class229;
import mapped.Class248;
import mapped.Class252;
import mapped.Class278;
import mapped.Parkour;
import mapped.Class4036;
import mapped.Class4047;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class5840;
import mapped.Class6053;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ItemStack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Replenish
extends Class278 {
    private final Class925 field1504;
    Class248 field1505;
    private static Replenish INSTANCE;
    private static long[] field1506;
    private final Map field1507 = new ConcurrentHashMap();

    private static boolean method6406() {
        return Class1807.method15769();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method6407(int c2, class_1799 d2) {
        int e2 = (int)field1506[7];
        int b2 = (int)field1506[5];
        block0: while (true) {
            int n2;
            int n3 = b2 < (int)field1506[6] ? 11230 : 11231;
            while ((n2 = n3) != 11230) {
                if (n2 != 11231) break block0;
                n3 = 11229;
            }
            class_1799 a2 = Replenish.method6411(field290).method_31548().method_5438(b2);
            if (a2.method_7960()) {
                return Class1215.method13261(0.05288799631235752, Class5840.field11410);
            }
            if (Replenish.method6439(this, d2, a2) && a2.method_7946()) {
                e2 = b2;
            }
            ++b2;
        }
        if (e2 == (int)field1506[7]) {
            return (int)field1506[3] != 0;
        }
        Replenish.method6441(field290).method_2906((int)field1506[3], e2, (int)field1506[3], class_1713.field_7790, (class_1657)Replenish.field290.field_1724);
        Replenish.field290.field_1761.method_2906((int)field1506[3], c2 + (int)field1506[6], (int)field1506[3], Replenish.method6420(), (class_1657)Replenish.field290.field_1724);
        if (Replenish.method6437((class_310)Replenish.field290).field_7512.method_34255().method_7960()) {
            return (int)field1506[0] != 0;
        }
        Replenish.field290.field_1761.method_2906((int)field1506[3], e2, (int)field1506[3], class_1713.field_7790, (class_1657)Replenish.field290.field_1724);
        return (int)field1506[0] != 0;
    }

    private static boolean method6408() {
        return Class5659.method22194();
    }

    private static void method6409(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Map method6410(Replenish class408) {
        return class408.field1507;
    }

    public static class_746 method6411(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Map method6412(Replenish class408) {
        return class408.field1507;
    }

    private static void method6413() {
        Class5659.method22184();
    }

    static {
        field1506 = new long[8];
        Replenish.method6433(-6815923984742473231L);
    }

    private static Object method6414(Class248 class248) {
        return class248.method507();
    }

    public static Map method6415(Replenish class408) {
        return class408.field1507;
    }

    @Override
    public void method1279() {
        Replenish.method6412(this).clear();
    }

    private static boolean method6416() {
        return Class1807.method15742();
    }

    private static int method6417(int n2, int n3, Parkour class377, Class211 class211) {
        return Class6053.method23754(n2, n3, class377, class211);
    }

    private static Map method6418(Replenish class408) {
        return Replenish.method6419(class408);
    }

    public static Map method6419(Replenish class408) {
        return class408.field1507;
    }

    public static class_1713 method6420() {
        return class_1713.field_7790;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method6421(Class210 g2) {
        int h2;
        if (Replenish.field290.field_1690.field_1869.method_1434()) {
            this.field1504.method12593();
        }
        int n2 = h2 = Replenish.method6431() || !Replenish.method6422(this).method12595((int)field1506[4]) ? (int)field1506[0] : (int)field1506[3];
        if (h2 == 0) {
            for (int d2 = (int)field1506[3]; d2 < (int)field1506[5]; ++d2) {
                double c2;
                class_1799 b2 = Replenish.field290.field_1724.method_31548().method_5438(d2);
                if (b2.method_7960()) {
                    class_1799 a2 = Replenish.method6418(this).getOrDefault(d2, null);
                    if (a2 == null || a2.method_7960() || !this.method6407(d2, a2)) continue;
                    break;
                }
                if (!b2.method_7946() || !((c2 = (double)b2.method_7947() / (double)b2.method_7914() * 100.0) <= (double)((Integer)Replenish.method6414(this.field1505)).intValue()) || !this.method6407(d2, b2)) continue;
                Class4146.method20694();
                return;
            }
        }
        int f2 = (int)field1506[3];
        while (f2 < (int)field1506[5]) {
            class_1799 e2 = Replenish.field290.field_1724.method_31548().method_5438(f2);
            if (!e2.method_7960()) {
                Replenish.method6436(0.76919866f, 0.18097132f, 0.9820497f, 0.62117666f, 0.4944688f, Class4047.field9331);
                return;
            }
            if (h2 != 0) {
                if (Replenish.method6415(this).containsKey(f2)) {
                    this.field1507.replace(f2, e2.method_7972());
                } else {
                    Replenish.method6410(this).put(f2, e2.method_7972());
                }
            }
            ++f2;
        }
        return;
    }

    private static Class925 method6422(Replenish class408) {
        return Replenish.method6428(class408);
    }

    @Class1
    public void method6423(Class221 a2) {
        if (a2.method412() instanceof class_746) {
            Replenish.method6430(this).clear();
        }
    }

    public boolean method6424(class_1799 a2, class_1799 b2) {
        return class_1799.method_31577((class_1799)a2, (class_1799)b2);
    }

    private static void method6425() {
        Class5836.method22890();
    }

    private static boolean method6426(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static boolean method6427() {
        return Replenish.method6431();
    }

    public static Class925 method6428(Replenish class408) {
        return class408.field1504;
    }

    private static boolean method6429(double d2) {
        return Class5659.method22193(d2);
    }

    public static Map method6430(Replenish class408) {
        return class408.field1507;
    }

    public static boolean method6431() {
        if (Replenish.field290.field_1755 instanceof class_476) {
            return Replenish.method6427();
        }
        return (Replenish.field290.field_1755 instanceof class_495 || Replenish.field290.field_1755 instanceof class_490 ? (int)field1506[0] : (int)field1506[3]) != 0;
    }

    @Class1
    public void method6432(Class229 a2) {
        this.field1507.clear();
    }

    public Replenish() {
        super("Replenish", "Automatically replaces items in your hotbar", Class556.field2758);
        this.field1504 = new Class926();
        this.field1505 = this.method450(new Class252("Percent", "The minimum percent of total stack before replenishing", (int)field1506[0], (int)field1506[2], (int)field1506[1]));
        INSTANCE = this;
    }

    private static void method6433(long l2) {
        Replenish.field1506[2] = l2 ^ 0xA168F93F895C21E8L;
        Replenish.field1506[6] = l2 ^ 0xA168F93F895C21D5L;
        Replenish.field1506[4] = l2 ^ 0xA168F93F895C2195L;
        Replenish.field1506[0] = l2 ^ 0xA168F93F895C21F0L;
        Replenish.field1506[1] = l2 ^ 0xA168F93F895C21A1L;
        Replenish.field1506[5] = l2 ^ 0xA168F93F895C21F8L;
        Replenish.field1506[3] = l2 ^ 0xA168F93F895C21F1L;
        Replenish.field1506[7] = l2 ^ 0x5E9706C076A3DE0EL;
    }

    private static void method6434(float f2) {
        Class5836.method22907(f2);
    }

    public static Replenish method6435() {
        return INSTANCE;
    }

    private static void method6436(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static class_746 method6437(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method6438() {
        Class5836.method22885();
    }

    private static boolean method6439(Replenish class408, class_1799 class_17992, class_1799 class_17993) {
        return class408.method6424(class_17992, class_17993);
    }

    private static boolean method6440(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    public static class_636 method6441(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static void method6442() {
        Class5836.method22897();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

