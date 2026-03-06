/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_2399
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_310
 *  net.minecraft.class_5892
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 */
package mapped;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class133;
import mapped.Class1392;
import mapped.Class1503;
import mapped.Class1665;
import mapped.Class1668;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class260;
import mapped.Class298;
import mapped.Class3205;
import mapped.Class3408;
import mapped.Class3442;
import mapped.Class376;
import mapped.Class414;
import mapped.Class447;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5711;
import mapped.Class5723;
import mapped.Class5792;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6161;
import mapped.Class6322;
import net.minecraft.class_1297;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2399;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_5892;
import net.minecraft.class_744;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class426
extends Class414 {
    Class248 field1930;
    Class248 field1931;
    Class248 field1932;
    Class248 field1933;
    Class248 field1934;
    Class248 field1935;
    Class248 field1936;
    Class248 field1937;
    Class248 field1938;
    Class248 field1939;
    Class248 field1940;
    Class248 field1941;
    Class248 field1942;
    Class248 field1943;
    Class248 field1944;
    Class248 field1945;
    private int field1946;
    private static final Set field1947;
    Class248 field1948;
    Class248 field1949;
    private static long[] field1950;
    Class248 field1951;

    private static Class6161 method8564(Class5711 class5711, class_2338 class_23382) {
        return class5711.method22525(class_23382);
    }

    static {
        field1950 = new long[6];
        Class426.method8578(4916600860289975438L);
        field1947 = new HashSet();
    }

    @Override
    public void method1274() {
        this.field1946 = (int)field1950[0];
    }

    private static Object method8565(Class248 class248) {
        return class248.method507();
    }

    private static void method8566() {
        Class6009.method23561();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method8567(class_2338 a2) {
        boolean bl2;
        Class3442 b2 = new Class3442(a2, (List)this.field1942.method507(), (boolean)((Boolean)this.field1938.method507()), (Class607)((Object)this.field1940.method507()));
        Class6161 c2 = Class426.method8564(Class426.method8583(), a2);
        if (((Boolean)Class426.method8571(this).method507()).booleanValue() && c2 != null && (c2.field12485.method12595((Double)Class426.method8580(this.field1943) * 1000.0) || Class426.method8573(c2))) {
            bl2 = b2.method17378((Double)this.field1936.method507(), (Boolean)this.field1937.method507(), (Boolean)this.field1941.method507(), (Double)this.field1935.method507());
            return bl2;
        }
        bl2 = b2.method17369((Double)this.field1936.method507(), (Boolean)this.field1937.method507(), (Boolean)this.field1941.method507(), (Double)this.field1935.method507());
        return bl2;
    }

    public static class_746 method8568(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method8569(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method8570(Class426 class426) {
        return class426.field1945;
    }

    public static Class248 method8571(Class426 class426) {
        return class426.field1931;
    }

    private static void method8572(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static boolean method8573(Class6161 class6161) {
        return class6161.field12483;
    }

    private static List method8574(class_243 class_2432) {
        return Class5659.method22141(class_2432);
    }

    private static int method8575(int n2, int n3, Class1665 class1665, Class3408 class3408) {
        return Class1392.method14121(n2, n3, class1665, class3408);
    }

    @Class1
    private void method8576(Class210 d2) {
        field1947.clear();
        if (((Boolean)this.field1944.method507()).booleanValue()) {
            if (Class426.method8577((class_746)Class426.field290.field_1724).field_3904) {
                this.method1273();
                return;
            }
        }
        if (this.field1946 > 0) {
            this.field1946 -= (int)field1950[1];
            return;
        }
        Class426.method8586(this, (Integer)Class426.method8590(this).method507());
        if (((Boolean)Class426.method8570(this).method507()).booleanValue()) {
            if (!Class426.method8568(field290).method_24828() && !(Class426.field290.field_1687.method_8320(Class426.field290.field_1724.method_24515()).method_26204() instanceof class_2399)) {
                return;
            }
        }
        if (((Boolean)Class426.method8591(this.field1934)).booleanValue() && !Class447.method10252()) {
            return;
        }
        if (((Boolean)Class426.method8565(this.field1949)).booleanValue() && Class426.field290.field_1724.method_6128()) {
            return;
        }
        if (((Boolean)this.field1932.method507()).booleanValue() && Class426.field290.field_1724.method_52535()) {
            return;
        }
        if (!((Boolean)this.field1536.method507()).booleanValue() && Class426.field290.field_1724.method_6115()) {
            return;
        }
        if (Class376.method4987()) {
            return;
        }
        if (((Boolean)this.field1948.method507()).booleanValue()) {
            List b2 = Class426.method8574(Class426.field290.field_1724.method_19538());
            Iterator iterator = b2.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    Class6322.method24332(0.6064417f, 0.77600014f);
                    return;
                }
                class_2338 a2 = (class_2338)iterator.next();
                if (b2.contains(a2.method_10074()) || ((Boolean)this.field1951.method507()).booleanValue() && !Class1215.method13246((class_1297)Class426.field290.field_1724, new class_238(a2))) continue;
                field1947.add(a2.method_10074());
            }
        }
        if (!((Boolean)this.field1951.method507()).booleanValue() || Class1215.method13246((class_1297)Class426.field290.field_1724, new class_238(Class426.field290.field_1724.method_24515()))) {
            field1947.add(Class426.field290.field_1724.method_24515().method_10074());
        }
        int e2 = (int)field1950[0];
        for (class_2338 c2 : Class426.method8585()) {
            if (this.method8567(c2)) {
                ++e2;
            }
            if (e2 < (Integer)this.field1930.method507()) continue;
            return;
        }
    }

    public static class_744 method8577(class_746 class_7462) {
        return class_7462.field_3913;
    }

    @Override
    protected void method1279() {
        field1947.clear();
    }

    private static void method8578(long l2) {
        Class426.field1950[0] = l2 ^ 0x443B466EE3F6C48EL;
        Class426.field1950[2] = l2 ^ 0x443B466EE3F6C486L;
        Class426.field1950[5] = l2 ^ 0x443B466EE3F6C738L;
        Class426.field1950[4] = l2 ^ 0x443B466EE3F6C49AL;
        Class426.field1950[1] = l2 ^ 0x443B466EE3F6C48FL;
        Class426.field1950[3] = l2 ^ 0x443B466EE3F6C48CL;
    }

    @Class1
    private void method8579(Class133 c2) {
        class_5892 b2;
        class_1297 a2;
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_5892 && (a2 = Class426.field290.field_1687.method_8469((b2 = (class_5892)class_25962).comp_2275())) == Class426.field290.field_1724 && ((Boolean)Class426.method8589(this).method507()).booleanValue()) {
            this.method1273();
        }
    }

    private static Object method8580(Class248 class248) {
        return class248.method507();
    }

    private static void method8581() {
        Class298.method1924();
    }

    private static boolean method8582(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public static Class5711 method8583() {
        return Class5723.field11054;
    }

    public static void method8584(Class426 class426, int n2) {
        class426.field1946 = n2;
    }

    public static Set method8585() {
        return field1947;
    }

    private static void method8586(Class426 class426, int n2) {
        Class426.method8584(class426, n2);
    }

    private static void method8587(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private Boolean method1269() {
        return (Boolean)this.field1931.method507();
    }

    public Class426() {
        super("Flatten", "Flatten your ground", Class556.field2758, (int)field1950[5]);
        class_2248[] class_2248Array = new class_2248[(int)field1950[1]];
        class_2248Array[(int)Class426.field1950[0]] = class_2246.field_10540;
        this.field1942 = this.method450(new Class257("Blocks", "What blocks to use for surround", class_2248Array));
        this.field1933 = this.method450(new Class252("Delay", "Delay, in ticks, between placements", (int)field1950[0], (int)field1950[3], (int)field1950[4]));
        this.field1930 = this.method450(new Class252("BPT", "in places, number of blocks", (int)field1950[1], (int)field1950[1], (int)field1950[2]));
        this.field1940 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field1951 = this.method450(new Class253("Cover", "Only place covered blocks", (boolean)field1950[0]));
        this.field1937 = this.method450(new Class253("Rotate", "Automatically faces towards the obsidian being placed", (boolean)field1950[1]));
        this.field1936 = this.method450(new Class252("PlaceRange", "The distance of your block reach", 0.0, 4.5, 6.0));
        this.field1941 = this.method450(new Class253("BreakCrystal", "Break crystals when placing blocks", (boolean)field1950[1]));
        this.field1935 = this.method450(new Class252("BreakRange", "The distance of your entity reach", 0.0, Class3205.field6878, 6.0));
        this.field1931 = this.method450(new Class253("AssumeBreak", "Assuming it has been broken", (boolean)field1950[1]));
        this.field1943 = this.method450(new Class252("BreakTime", "Break time", (Number)0.0, (Number)Class5792.field11255, (Number)2.0, this::method1269));
        this.field1938 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field1950[0]));
        this.field1948 = this.method450(new Class253("Multi", "Not only place one block", (boolean)field1950[1]));
        this.field1945 = this.method450(new Class253("GroundOnly", "Works only when you are standing on blocks", (boolean)field1950[0]));
        this.field1934 = this.method450(new Class253("PhasedOnly", "Works only when you are phasing", (boolean)field1950[0]));
        this.field1949 = this.method450(new Class253("PauseOnFlying", "Pauses the current process while you are flying", (boolean)field1950[0]));
        this.field1932 = this.method450(new Class253("PauseInFluid", "Pauses the current process while you are swimming", (boolean)field1950[0]));
        this.field1944 = this.method450(new Class253("DisableOnJump", "Automatically disables when you jumping", (boolean)field1950[0]));
        this.field1939 = this.method450(new Class253("DisableOnDeath", "Toggles off when you die", (boolean)field1950[1]));
    }

    private static boolean method8588(double d2) {
        return Class5659.method22193(d2);
    }

    public static Class248 method8589(Class426 class426) {
        return class426.field1939;
    }

    public static Class248 method8590(Class426 class426) {
        return class426.field1933;
    }

    private static Object method8591(Class248 class248) {
        return class248.method507();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

