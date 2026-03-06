/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1738
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1893
 *  net.minecraft.class_310
 *  net.minecraft.class_490
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_746
 *  net.minecraft.class_9304
 *  net.minecraft.class_9334
 */
package mapped;

import java.util.PriorityQueue;
import java.util.Queue;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1718;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3850;
import mapped.Class3878;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class447;
import mapped.Class478;
import mapped.Class4971;
import mapped.Class529;
import mapped.Class5448;
import mapped.Class5532;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class619;
import mapped.Class6322;
import mapped.Class64;
import mapped.Class6417;
import mapped.Class6454;
import net.minecraft.class_1738;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1893;
import net.minecraft.class_310;
import net.minecraft.class_490;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class279
extends Class278 {
    Class248 field404;
    private final Queue field405 = new PriorityQueue();
    Class248 field406;
    private final Queue field407;
    Class248 field408;
    Class248 field409;
    Class248 field410;
    private final Queue field411 = new PriorityQueue();
    private static long[] field412 = new long[6];
    Class248 field413;
    private final Queue field414;

    private static boolean method1281(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static void method1282() {
        Class6454.method24594();
    }

    private static void method1283() {
        Class1807.method15744();
    }

    private static Queue method1284(Class279 class279) {
        return Class279.method1293(class279);
    }

    @Class1
    public void method1285(Class210 n2) {
        if (!(Class279.field290.field_1755 == null || Class279.field290.field_1755 instanceof class_490 && ((Boolean)Class279.method1314(this.field406)).booleanValue())) {
            return;
        }
        this.field405.clear();
        this.field411.clear();
        Class279.method1308(this).clear();
        this.field414.clear();
        block6: for (int f2 = (int)field412[1]; f2 < (int)field412[2]; ++f2) {
            Class478 e2;
            block16: {
                block17: {
                    block15: {
                        class_1792 class_17922;
                        class_1799 a2 = Class279.method1309(field290).method_31548().method_5438(f2);
                        if (a2.method_7960() || !((class_17922 = a2.method_7909()) instanceof class_1738)) continue;
                        class_1738 b2 = (class_1738)class_17922;
                        if (((Boolean)this.field413.method507()).booleanValue() && this.method1302(a2, class_1893.field_9113)) continue;
                        int c2 = b2.method_7685().method_5927();
                        float d2 = (float)(a2.method_7936() - a2.method_7919()) / (float)a2.method_7936();
                        if (d2 < ((Float)this.field408.method507()).floatValue()) continue;
                        e2 = new Class478(this, c2, f2, a2);
                        switch (c2 ^ 0x46FA9845) {
                            default: {
                                continue block6;
                            }
                            case 1190828100: {
                                break block15;
                            }
                            case 1190828101: {
                                break;
                            }
                            case 1190828102: {
                                break block16;
                            }
                            case 1190828103: {
                                break block17;
                            }
                        }
                        Class279.method1284(this).add(e2);
                        continue;
                    }
                    this.field411.add(e2);
                    continue;
                }
                this.field407.add(e2);
                continue;
            }
            this.field414.add(e2);
        }
        for (int m2 = (int)field412[1]; m2 < (int)field412[3]; ++m2) {
            class_1799 k2 = Class279.field290.field_1724.method_31548().method_7372(m2);
            if (((Boolean)this.field409.method507()).booleanValue() && k2.method_7909() == class_1802.field_8833) continue;
            float l2 = (float)(k2.method_7936() - k2.method_7919()) / (float)k2.method_7936();
            if (!k2.method_7960()) {
                Class6009.method23559(true);
                return;
            }
            if (l2 >= ((Float)this.field408.method507()).floatValue()) {
                Class6454.method24594();
                return;
            }
            int n3 = m2 ^ 0xEF3477F6;
            if (n3 != -281774092) {
                if (n3 != -281774091) {
                    while (true) {
                        // Infinite loop
                    }
                }
            } else {
                if (this.field407.isEmpty()) continue;
                Class478 i2 = (Class478)this.field407.poll();
                this.method1311(i2.method10761(), i2.method10770());
                continue;
            }
            if (this.field414.isEmpty()) continue;
            Class478 j2 = (Class478)this.field414.poll();
            this.method1311(j2.method10761(), j2.method10770());
        }
    }

    private static void method1286() {
        Class3979.method19561();
    }

    private static void method1287() {
        Class1807.method15744();
    }

    public Class279() {
        super("AutoArmor", "Automatically replaces armor pieces", Class556.field2754);
        this.field407 = new PriorityQueue();
        this.field414 = new PriorityQueue();
        this.field410 = this.method450(new Class260("Priority", "Armor enchantment priority", Class529.field2624, Class529.values()));
        this.field408 = this.method450(new Class252("MinDurability", "Durability percent to replace armor", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.0f), (Number)Float.valueOf(20.0f), Class619.field3012));
        this.field409 = this.method450(new Class253("ElytraPriority", "Prioritizes existing elytras in the chestplate armor slot", (boolean)field412[0]));
        this.field404 = this.method450(new Class253("Leggings-BlastPriority", "Prioritizes Blast Protection leggings", (boolean)field412[0]));
        this.field413 = this.method450(new Class253("NoBinding", "Avoids armor with the Curse of Binding enchantment", (boolean)field412[0]));
        this.field406 = this.method450(new Class253("AllowInventory", "Allows armor to be swapped while in the inventory menu", (boolean)field412[1]));
    }

    private static void method1288() {
        Class6009.method23561();
    }

    private static void method1289(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method1290(int n2, int n3, Class5448 class5448, Class4971 class4971) {
        return Class6417.method24478(n2, n3, class5448, class4971);
    }

    private static void method1291() {
        Class298.method1924();
    }

    private static void method1292() {
        Class4146.method20697();
    }

    public static Queue method1293(Class279 class279) {
        return class279.field405;
    }

    private static void method1294() {
        Class6009.method23560();
    }

    private static void method1295(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method1296() {
        return Class447.method10322();
    }

    private static void method1297() {
        Class6454.method24594();
    }

    private static int method1298(int n2, int n3, Class3878 class3878, Class1718 class1718) {
        return Class6417.method24490(n2, n3, class3878, class1718);
    }

    private static void method1299(long l2) {
        Class279.field412[2] = l2 ^ 0x7F4AFAA94143719DL;
        Class279.field412[5] = l2 ^ 0x7F4AFAA9414371B0L;
        Class279.field412[4] = l2 ^ 0x7F4AFAA9414371B1L;
        Class279.field412[0] = l2 ^ 0x7F4AFAA9414371B8L;
        Class279.field412[3] = l2 ^ 0x7F4AFAA9414371BDL;
        Class279.field412[1] = l2 ^ 0x7F4AFAA9414371B9L;
    }

    private static void method1300() {
        Class298.method1924();
    }

    private static void method1301(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public boolean method1302(class_1799 b2, class_5321 c2) {
        if (b2.method_57353().method_57832(class_9334.field_49633)) {
            for (class_6880 a2 : ((class_9304)b2.method_57353().method_57829(class_9334.field_49633)).method_57534()) {
                if (!a2.method_40230().isPresent() || !((class_5321)a2.method_40230().get()).equals(c2)) continue;
                return (int)field412[0] != 0;
            }
        }
        return (int)field412[1] != 0;
    }

    private static void method1303(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method1304() {
        Class1503.method14420();
    }

    public static Queue method1305(Class279 class279) {
        return class279.field411;
    }

    private static void method1306() {
        Class6009.method23560();
    }

    private static void method1307(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    static {
        Class279.method1299(9172419195944792505L);
    }

    public static Queue method1308(Class279 class279) {
        return class279.field407;
    }

    public static class_746 method1309(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method1310() {
        Class1807.method15744();
    }

    public void method1311(int a2, int b2) {
        class_1799 c2 = Class279.field290.field_1724.method_31548().method_7372(a2);
        a2 = (int)field412[4] - a2;
        Class5723.field11058.method18923(b2 < (int)field412[5] ? b2 + (int)field412[2] : b2);
        int d2 = !c2.method_7960() ? (int)field412[0] : (int)field412[1];
        Class279.method1313(Class5723.field11058, a2);
        if (d2 != 0) {
            Class5723.field11058.method18923(b2 < (int)field412[5] ? b2 + (int)field412[2] : b2);
        }
    }

    private static int method1312(int n2, int n3, Class64 class64, Class5532 class5532) {
        return Class6417.method24485(n2, n3, class64, class5532);
    }

    private static int method1313(Class3850 class3850, int n2) {
        return class3850.method18923(n2);
    }

    private static Object method1314(Class248 class248) {
        return class248.method507();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

