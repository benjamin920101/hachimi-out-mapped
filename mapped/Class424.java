/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2338$class_2339
 *  net.minecraft.class_238
 *  net.minecraft.class_2399
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_310
 *  net.minecraft.class_5892
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package mapped;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class1321;
import mapped.Class133;
import mapped.Class141;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1734;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class274;
import mapped.Class298;
import mapped.Class3340;
import mapped.Class3442;
import mapped.Class3493;
import mapped.Class3730;
import mapped.Class376;
import mapped.Class3979;
import mapped.Class4032;
import mapped.Class4043;
import mapped.Class4051;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class4184;
import mapped.Class469;
import mapped.Class525;
import mapped.Class556;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6112;
import mapped.Class6159;
import mapped.Class628;
import mapped.Class6322;
import mapped.Class6416;
import mapped.Class7;
import mapped.Class79;
import mapped.Class803;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2399;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_5892;
import net.minecraft.class_638;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class424
extends Class414 {
    Class248 field1845;
    private static final Set field1846;
    Class248 field1847;
    Class248 field1848;
    Class248 field1849;
    private static final Set field1850;
    Class248 field1851;
    Class248 field1852;
    Class248 field1853;
    Class248 field1854;
    private static long[] field1855;
    Class248 field1856;
    Class248 field1857;
    Class248 field1858;
    Class248 field1859;
    private int field1860;
    Class248 field1861;
    Class248 field1862;
    private final class_243[] field1863;
    Class248 field1864;
    private static final Set field1865;
    Class248 field1866;
    Class248 field1867;
    Class248 field1868;
    Class248 field1869;
    Class248 field1870;
    private final List field1871 = new ArrayList();

    private static void method8247(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method8248() {
        Class5836.method22885();
    }

    private static void method8249(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_2248 method8250() {
        return class_2246.field_10343;
    }

    private static boolean method8251(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    public static Set method8252() {
        return field1850;
    }

    private static void method8253() {
        Class1807.method15744();
    }

    private static void method8254(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Set method8255() {
        return field1865;
    }

    public static Class248 method8256(Class424 class424) {
        return class424.field1853;
    }

    public static List method8257(Class424 class424) {
        return class424.field1871;
    }

    public static Class628 method8258() {
        return Class628.field3068;
    }

    public static int method8259(Class424 class424) {
        return class424.field1860;
    }

    private static int method8260(int n2, int n3, Class3730 class3730, Class141 class141) {
        return Class4032.method20010(n2, n3, class3730, class141);
    }

    private static void method8261() {
        Class6009.method23561();
    }

    private static void method8262() {
        Class3979.method19561();
    }

    private static void method8263() {
        Class298.method1924();
    }

    public static class_638 method8264(class_310 class_3102) {
        return class_3102.field_1687;
    }

    @Override
    protected void method1279() {
        this.field1871.clear();
    }

    private static void method8265() {
        Class3979.method19561();
    }

    private static Object method8266(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method8267(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    private void method8268(Class210 m2) {
        class_2338 k2;
        int n2;
        Class424.method8302().clear();
        field1846.clear();
        field1865.clear();
        Class424.method8294(this).clear();
        if (Class424.method8259(this) > 0) {
            this.field1860 -= (int)field1855[2];
            return;
        }
        this.field1860 = (Integer)Class424.method8291(this.field1856);
        if (((Boolean)this.field1867.method507()).booleanValue() && !Class424.field290.field_1724.method_24828() && !(Class424.method8264(field290).method_8320(Class424.field290.field_1724.method_24515()).method_26204() instanceof class_2399)) {
            return;
        }
        if (((Boolean)this.field1847.method507()).booleanValue() && Class424.field290.field_1724.method_6128()) {
            return;
        }
        int n3 = (Boolean)this.field1848.method507() != false ? 13437 : 13438;
        block12: while (true) {
            switch (n3) {
                case 13438: {
                    n3 = 13436;
                    continue block12;
                }
                case 13437: {
                    if (!Class424.field290.field_1724.method_52535()) {
                        int n4 = 45686;
                        Class298.method1924();
                        return;
                    }
                    int n5 = 45685;
                    block13: while (true) {
                        switch (n5) {
                            case 45686: {
                                n5 = 45684;
                                continue block13;
                            }
                            case 45685: {
                                return;
                            }
                        }
                        break;
                    }
                    break block12;
                }
            }
            break;
        }
        if (!((Boolean)this.field1536.method507()).booleanValue() && Class424.field290.field_1724.method_6115()) {
            return;
        }
        if (Class376.method4987()) {
            int n6 = 48445;
            while (true) {
                // Infinite loop
            }
        }
        int n7 = 48446;
        block15: while (true) {
            switch (n7) {
                case 48446: {
                    n7 = 48444;
                    continue block15;
                }
                case 48445: {
                    return;
                }
            }
            break;
        }
        Class424.method8281(this.field1871, this::method8269, (Class525)Class424.method8272(this).method507(), (int)field1855[2]);
        if (this.field1871.isEmpty()) {
            return;
        }
        class_1297 n8 = (class_1297)this.field1871.getFirst();
        int o2 = (int)field1855[1];
        class_243[] class_243Array = this.field1863;
        int n9 = class_243Array.length;
        for (int i2 = (int)field1855[1]; i2 < n9; ++i2) {
            class_243 c2 = class_243Array[i2];
            class_243 a2 = n8.method_19538().method_1019(c2).method_1019(Class469.method10718(n8, (Integer)Class424.method8293(this.field1852)));
            class_2338.class_2339 b2 = new class_2338.class_2339(a2.field_1352, a2.field_1351, a2.field_1350);
            if (((Boolean)this.field1858.method507()).booleanValue() && !Class1215.method13246(n8, new class_238(n8.method_19538().method_1031(-0.3, 0.0, -0.3), n8.method_19538().method_1031(Class6112.field12342, Class4051.field9349, Class4043.field9317)))) {
                field1846.add(b2.method_10074());
            }
            if (!((Boolean)this.field1862.method507()).booleanValue()) {
                Class1503.method14420();
                return;
            }
            field1850.add(b2);
            if (((Boolean)this.field1854.method507()).booleanValue()) {
                field1850.add(b2.method_10084());
            }
            if (!((Boolean)this.field1861.method507()).booleanValue() || ((Boolean)Class424.method8280(this.field1845)).booleanValue() && !n8.method_24828()) continue;
            field1865.add(b2.method_10086((int)field1855[3]));
        }
        if (!field1865.isEmpty()) {
            int f2 = (int)field1855[2];
            for (class_2338 d2 : Class424.method8255()) {
                if (!Class424.field290.field_1687.method_8320(d2).method_27852(class_2246.field_10343)) continue;
                f2 = (int)field1855[1];
                break;
            }
            if (f2 != 0) {
                for (class_2338 e2 : field1865) {
                    if (!Class424.method8303(new Class3442(e2, class_1802.field_8786, (boolean)((Boolean)this.field1869.method507()), (Class607)((Object)Class424.method8275(this.field1864))), (Double)this.field1866.method507(), (Boolean)this.field1857.method507(), (boolean)field1855[1], 3.0)) continue;
                    ++o2;
                    Class4146.method20697();
                    return;
                }
            }
        }
        if (!field1846.isEmpty()) {
            int i3 = (int)field1855[2];
            for (class_2338 g2 : field1846) {
                if (!Class424.field290.field_1687.method_8320(g2).method_27852(Class424.method8250())) continue;
                i3 = (int)field1855[1];
                break;
            }
            if (i3 != 0) {
                for (class_2338 h2 : field1846) {
                    if (!new Class3442(h2, class_1802.field_8786, (boolean)((Boolean)this.field1869.method507()), (Class607)((Object)this.field1864.method507())).method17369((Double)this.field1866.method507(), (Boolean)Class424.method8309(this.field1857), (boolean)field1855[1], 3.0)) continue;
                    ++o2;
                    break;
                }
            }
        }
        int n10 = !field1850.isEmpty() ? 12412 : 12413;
        while ((n2 = n10) != 12412) {
            if (n2 != 12413) return;
            n10 = 12411;
        }
        int l2 = (int)field1855[1];
        Iterator iterator = Class424.method8274().iterator();
        if (iterator.hasNext()) {
            class_2338 j2 = (class_2338)iterator.next();
            if (Class424.field290.field_1687.method_8320(j2).method_27852(class_2246.field_10343)) {
                ++l2;
            }
            Class1108.method12918(false);
            return;
        }
        if (l2 >= (Integer)Class424.method8266(this.field1851)) {
            return;
        }
        iterator = field1850.iterator();
        do {
            if (!iterator.hasNext()) return;
        } while (!new Class3442(k2 = (class_2338)iterator.next(), class_1802.field_8786, (boolean)((Boolean)Class424.method8301(this).method507()), (Class607)((Object)this.field1864.method507())).method17369((Double)this.field1866.method507(), (Boolean)this.field1857.method507(), (boolean)field1855[1], 3.0) || ++o2 < (Integer)this.field1870.method507());
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private boolean method8269(class_1297 b2) {
        int n2;
        class_1657 a2;
        block14: {
            int n3;
            int n4;
            block13: {
                if (!(b2 instanceof class_1657)) return (int)field1855[1] != 0;
                a2 = (class_1657)b2;
                if (b2.equals((Object)Class424.field290.field_1724)) return (int)field1855[1] != 0;
                if (b2.equals((Object)Class424.field290.field_1719)) {
                    return (int)field1855[1] != 0;
                }
                if (a2.method_29504()) {
                    return (int)field1855[1] != 0;
                }
                if (!b2.method_5805()) {
                    return (int)field1855[1] != 0;
                }
                if (this.field1868.method507() == Class424.method8290() && !b2.method_24828()) {
                    return (int)field1855[1] != 0;
                }
                if (this.field1868.method507() == Class424.method8258() && b2.method_24828()) {
                    return (int)field1855[1] != 0;
                }
                int n5 = (double)Class424.field290.field_1724.method_5739((class_1297)a2) > (Double)this.field1849.method507() ? 60677 : 60678;
                block4: while (true) {
                    switch (n5) {
                        case 60678: {
                            n5 = 60676;
                            continue block4;
                        }
                        case 60677: {
                            return (int)field1855[1] != 0;
                        }
                    }
                    break;
                }
                if (!a2.method_7337()) return Class3979.method19543();
                n4 = 5932;
                if (!true) break block13;
                n3 = n4;
                if (n3 == 5932) return (int)field1855[1] != 0;
                if (n3 != 5933) break block14;
            }
            do {
                n4 = 5931;
                n3 = n4;
                if (n3 == 5932) return (int)field1855[1] != 0;
            } while (n3 == 5933);
        }
        if (!Class5723.field11045.method21261(a2)) {
            n2 = (int)field1855[2];
            return n2 != 0;
        }
        n2 = (int)field1855[1];
        return n2 != 0;
    }

    private static void method8270() {
        Class6009.method23561();
    }

    private static int method8271(int n2, int n3, Class79 class79, Class274 class274) {
        return Class4032.method20034(n2, n3, class79, class274);
    }

    static {
        field1855 = new long[8];
        Class424.method8289(573111651756848186L);
        field1850 = new HashSet();
        field1846 = new HashSet();
        field1865 = new HashSet();
    }

    public static Class248 method8272(Class424 class424) {
        return class424.field1859;
    }

    private static void method8273(long l2) {
        Class424.field1855[5] = l2 ^ 0x7F41A02C39AB432L;
        Class424.field1855[1] = l2 ^ 0x7F41A02C39AB43AL;
        Class424.field1855[2] = l2 ^ 0x7F41A02C39AB43BL;
        Class424.field1855[0] = l2 ^ 0x7F41A02C39AB430L;
        Class424.field1855[7] = l2 ^ 0x7F41A02C39AB42EL;
        Class424.field1855[4] = l2 ^ 0x7F41A02C39AB439L;
        Class424.field1855[3] = l2 ^ 0x7F41A02C39AB438L;
        Class424.field1855[6] = l2 ^ 0x7F41A02C39AB43EL;
    }

    private static Set method8274() {
        return Class424.method8252();
    }

    private static Object method8275(Class248 class248) {
        return class248.method507();
    }

    private static void method8276() {
        Class1807.method15744();
    }

    private static void method8277() {
        Class1807.method15744();
    }

    private static int method8278(int n2, int n3, Class6159 class6159, Class7 class7) {
        return Class4032.method20030(n2, n3, class6159, class7);
    }

    private static boolean method8279(double d2) {
        return Class5659.method22193(d2);
    }

    private static Object method8280(Class248 class248) {
        return class248.method507();
    }

    private static void method8281(List list, Predicate predicate, Class525 class525, int n2) {
        Class3493.method17601(list, predicate, class525, n2);
    }

    private static void method8282() {
        Class5836.method22897();
    }

    private static boolean method8283(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    @Class1
    private void method8284(Class133 c2) {
        class_5892 b2;
        class_1297 a2;
        if (Class424.method8267(field290) == null || Class424.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_5892 && (a2 = Class424.field290.field_1687.method_8469((b2 = (class_5892)class_25962).comp_2275())) == Class424.field290.field_1724) {
            if (((Boolean)Class424.method8256(this).method507()).booleanValue()) {
                this.method1273();
            }
        }
    }

    private static void method8285() {
        Class1745.method15538();
    }

    private static boolean method8286(double d2) {
        return Class5659.method22193(d2);
    }

    private static void method8287() {
        Class1745.method15538();
    }

    @Override
    public void method1274() {
        this.field1860 = (int)field1855[1];
    }

    private static void method8288() {
        Class4146.method20694();
    }

    private static void method8289(long l2) {
        Class424.method8273(l2);
    }

    public static Class628 method8290() {
        return Class628.field3069;
    }

    private static Object method8291(Class248 class248) {
        return class248.method507();
    }

    private static void method8292() {
        Class4146.method20697();
    }

    public Class424() {
        super("AutoWeb", "Automatically traps nearby entities in webs", Class556.field2758);
        class_243[] class_243Array = new class_243[(int)field1855[6]];
        class_243Array[(int)Class424.field1855[1]] = new class_243(Class4184.field9768, Class3340.field7217, 0.3);
        class_243Array[(int)Class424.field1855[2]] = new class_243(0.3, 0.3, -0.3);
        class_243Array[(int)Class424.field1855[3]] = new class_243(-0.3, 0.3, 0.3);
        class_243Array[(int)Class424.field1855[4]] = new class_243(-0.3, 0.3, Class1734.field6514);
        this.field1863 = class_243Array;
        this.field1868 = this.method450(new Class260("Target", "Target selector", Class628.field3070, Class628.values()));
        this.field1849 = this.method450(new Class252("TargetRange", "The maximum range the entity can be to attack it", 0.0, Class6416.field13306, 8.0));
        this.field1859 = this.method450(new Class260("Sort", "How to filter targets within range", Class525.field2605, Class424.method8304()));
        this.field1862 = this.method450(new Class253("Feet", "Trap the enemy's feet", (boolean)field1855[2]));
        this.field1854 = this.method450(new Class253("Face", "Trap the enemy's face", (boolean)field1855[2]));
        this.field1861 = this.method450(new Class253("Head", "Trap the enemy's head", (boolean)field1855[2]));
        this.field1845 = this.method450(new Class253("HeadGroundOnly", "Only players on the ground", (boolean)field1855[2]));
        this.field1858 = this.method450(new Class253("Down", "Place webs beneath the enemy", (boolean)field1855[1]));
        this.field1856 = this.method450(new Class252("Delay", "Delay, in ticks, between placements", (int)field1855[1], (int)field1855[3], (int)field1855[7]));
        this.field1870 = this.method450(new Class252("BPT", "in places, number of blocks", (int)field1855[2], (int)field1855[2], (int)field1855[5]));
        this.field1851 = this.method450(new Class252("MaxPlacements", "Maximum placement of webs", (int)field1855[2], (int)field1855[2], (int)field1855[5]));
        this.field1864 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field1857 = this.method450(new Class253("Rotate", "Automatically faces towards the obsidian being placed", (boolean)field1855[2]));
        this.field1866 = this.method450(new Class252("PlaceRange", "The distance of your block reach", 0.0, Class1321.field5117, 6.0));
        this.field1869 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field1855[1]));
        this.field1852 = this.method450(new Class252("ExtrapolationTicks", "Accounts for motion when calculating enemy positions, not fully accurate.", (int)field1855[1], (int)field1855[1], (int)field1855[0]));
        this.field1867 = this.method450(new Class253("GroundOnly", "Works only when you are standing on blocks", (boolean)field1855[1]));
        this.field1847 = this.method450(new Class253("PauseOnFlying", "Pauses the current process while you are flying", (boolean)field1855[1]));
        this.field1848 = this.method450(new Class253("PauseInFluid", "Pauses the current process while you are swimming", (boolean)field1855[1]));
        this.field1853 = this.method450(new Class253("DisableOnDeath", "Toggles off when you die", (boolean)field1855[2]));
    }

    private static Object method8293(Class248 class248) {
        return class248.method507();
    }

    private static List method8294(Class424 class424) {
        return Class424.method8257(class424);
    }

    private static boolean method8295(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method8296(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method8297() {
        Class4146.method20697();
    }

    private static void method8298() {
        Class4146.method20694();
    }

    private static boolean method8299() {
        return Class5836.method22894();
    }

    private static void method8300() {
        Class1807.method15744();
    }

    public static Class248 method8301(Class424 class424) {
        return class424.field1869;
    }

    public static Set method8302() {
        return field1850;
    }

    private static boolean method8303(Class3442 class3442, double d2, boolean bl2, boolean bl3, double d3) {
        return class3442.method17369(d2, bl2, bl3, d3);
    }

    private static Class525[] method8304() {
        return Class525.values();
    }

    private static void method8305(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method8306() {
        Class5836.method22890();
    }

    private static void method8307() {
        Class4146.method20694();
    }

    private static void method8308(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static Object method8309(Class248 class248) {
        return class248.method507();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

