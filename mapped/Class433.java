/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1511
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import mapped.Class1;
import mapped.Class1083;
import mapped.Class1215;
import mapped.Class1251;
import mapped.Class1503;
import mapped.Class1610;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class260;
import mapped.Class298;
import mapped.Class3442;
import mapped.Class3478;
import mapped.Class360;
import mapped.Class376;
import mapped.Class386;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class408;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class416;
import mapped.Class4196;
import mapped.Class432;
import mapped.Class5449;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5921;
import mapped.Class6009;
import mapped.Class607;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class653;
import mapped.Class691;
import mapped.Class924;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_746;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class433
extends Class414 {
    Class248 field2050;
    Class248 field2051;
    Class248 field2052;
    Class248 field2053;
    private static final List field2054;
    private final Class924 field2055 = new Class924();
    Class248 field2056;
    Class248 field2057;
    Class248 field2058;
    Class248 field2059;
    Class248 field2060;
    Class248 field2061;
    Class248 field2062;
    private static final Set field2063;
    private static long[] field2064;
    Class248 field2065;
    Class248 field2066;
    private int field2067;
    private static final Set field2068;
    Class248 field2069;
    Class248 field2070;
    int field2071;
    Class248 field2072;
    Class248 field2073;
    public static boolean $skidonion$998554717;

    private static void method8993() {
        Class5836.method22890();
    }

    public static class_638 method8994(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private boolean method8995(class_2338 a2) {
        Class3442 b2 = new Class3442(a2, (List)this.field2059.method507(), (boolean)((Boolean)Class433.method9020(this.field2070)), (Class607)((Object)this.field2069.method507()));
        return b2.method17369((Double)Class433.method9069(this.field2062), (Boolean)this.field2073.method507(), (Boolean)this.field2072.method507(), (Double)Class433.method9035(this).method507());
    }

    public static Class248 method8996(Class433 class433) {
        return class433.field2052;
    }

    private static boolean method8997() {
        return Class408.method6431();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method8998() {
        Class433.method9068(this);
        List n2 = Class5659.method22141(Class433.field290.field_1724.method_19538());
        Iterator iterator = n2.iterator();
        block28: while (true) {
            if (!iterator.hasNext()) {
                this.method9066();
                this.field2067 = this.field2067 > 0 ? Class433.method9000(this) - (int)field2064[1] : (Integer)Class433.method9015(this.field2066);
                return;
            }
            class_2338 m2 = (class_2338)iterator.next();
            class_2350[] class_2350Array = Class5449.field10187;
            int n3 = class_2350Array.length;
            int n4 = (int)field2064[0];
            while (true) {
                int n5 = n4 < n3 ? 53534 : 53535;
                block30: while (true) {
                    switch (n5) {
                        case 53535: {
                            n5 = 53533;
                            continue block30;
                        }
                        case 53534: {
                            int n6;
                            class_2350[] c2;
                            class_2350 i2 = class_2350Array[n4];
                            class_2338 h2 = m2.method_10093(i2);
                            int n7 = (Boolean)this.field2053.method507() != false ? 57890 : 57891;
                            block31: while (true) {
                                switch (n7) {
                                    case 57891: {
                                        n7 = 57889;
                                        continue block31;
                                    }
                                    case 57890: {
                                        c2 = m2.method_10084();
                                        class_2350[] class_2350Array2 = Class5449.field10187;
                                        n6 = class_2350Array2.length;
                                        int n8 = (int)field2064[0];
                                        block32: while (true) {
                                            int n9 = n8 < n6 ? 53662 : 53663;
                                            block33: while (true) {
                                                switch (n9) {
                                                    case 53663: {
                                                        n9 = 53661;
                                                        continue block33;
                                                    }
                                                    case 53662: {
                                                        class_2350 b2 = class_2350Array2[n8];
                                                        class_2338 a2 = c2.method_10093(b2);
                                                        if (this.method9047((class_2338)c2)) {
                                                            this.method9051(a2);
                                                        }
                                                        ++n8;
                                                        continue block32;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break block31;
                                    }
                                }
                                break;
                            }
                            if (((Boolean)this.field2065.method507()).booleanValue()) {
                                int n10 = Class433.field290.field_1687.method_8320(h2).method_45474() ? 27760 : 27761;
                                block34: while (true) {
                                    switch (n10) {
                                        case 27761: {
                                            n10 = 27759;
                                            continue block34;
                                        }
                                        case 27760: {
                                            if (!this.method9047(m2)) break block34;
                                            Class433.method9043(this, h2);
                                            break block34;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (!n2.contains(h2)) {
                                int n11 = 16098;
                                Class5659.method22184();
                                return;
                            }
                            int n12 = 16099;
                            block35: while (true) {
                                switch (n12) {
                                    case 16099: {
                                        n12 = 16097;
                                        continue block35;
                                    }
                                    case 16098: {
                                        int n13;
                                        if (this.method9011(h2) || (n6 = (int)field2064[0]) >= (n13 = (c2 = Class5449.field10186).length)) break block35;
                                        class_2350 e2 = c2[n6];
                                        class_2338 d2 = h2.method_10093(e2);
                                        if (this.method9062(d2.method_10074()) && ((Boolean)this.field2050.method507()).booleanValue()) {
                                            int n14 = !this.method9047(h2) ? 49881 : 49882;
                                            block36: while (true) {
                                                switch (n14) {
                                                    case 49882: {
                                                        n14 = 49880;
                                                        continue block36;
                                                    }
                                                    case 49881: {
                                                        if (!((Boolean)this.field2061.method507()).booleanValue()) break block36;
                                                    }
                                                    default: {
                                                        this.method9051(d2);
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        ++n6;
                                        Class5659.method22184();
                                        return;
                                    }
                                }
                                break;
                            }
                            if (n2.contains(h2) || Class433.method9018(this, h2)) break block30;
                            c2 = Class5449.field10190;
                            int n15 = c2.length;
                            block37: for (n6 = (int)field2064[0]; n6 < n15; ++n6) {
                                class_2350 g2 = c2[n6];
                                class_2338 f2 = h2.method_10093(g2);
                                if (!this.method9062(f2.method_10074())) continue;
                                int n16 = (Boolean)this.field2057.method507() == false ? 16987 : 16986;
                                block38: while (true) {
                                    switch (n16) {
                                        case 16987: {
                                            n16 = 16985;
                                            continue block38;
                                        }
                                        case 16986: {
                                            if (!this.method9047(h2)) continue block37;
                                            this.method9051(f2);
                                            continue block37;
                                        }
                                    }
                                    break;
                                }
                            }
                            break block30;
                        }
                        default: {
                            class_2338 l2 = m2.method_10074();
                            if (n2.contains(l2)) continue block28;
                            class_2350[] class_2350Array3 = Class5449.field10190;
                            n4 = class_2350Array3.length;
                            int n17 = (int)field2064[0];
                            while (true) {
                                if (n17 >= n4) {
                                    Class1503.method14417(0.77119917f, Class5921.field11737);
                                    return;
                                }
                                class_2350 k2 = class_2350Array3[n17];
                                class_2338 j2 = l2.method_10093(k2);
                                if (this.method9047(l2)) {
                                    this.method9051(j2);
                                }
                                ++n17;
                            }
                        }
                    }
                    break;
                }
                ++n4;
            }
            break;
        }
    }

    private static void method8999() {
        Class1807.method15744();
    }

    public static int method9000(Class433 class433) {
        return class433.field2067;
    }

    private static void method9001(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method9002() {
        Class1807.method15744();
    }

    private static void method9003() {
        Class5659.method22184();
    }

    private static void method9004(float f2) {
        Class5836.method22907(f2);
    }

    private static void method9005(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method9006() {
        int n2;
        int n3 = this.field2067 <= 0 ? 35734 : 35735;
        block4: while (true) {
            switch (n3) {
                case 35735: {
                    n3 = 35733;
                    continue block4;
                }
                case 35734: {
                    if ((Integer)this.field2051.method507() <= 0) break block4;
                    n2 = (int)field2064[1];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field2064[0];
        return n2 != 0;
    }

    private static void method9007() {
        Class1807.method15744();
    }

    private static void method9008(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method9009() {
        Class5659.method22184();
    }

    public static Class248 method9010(Class433 class433) {
        return class433.field2051;
    }

    private boolean method9011(class_2338 a2) {
        return Class433.field290.field_1687.method_8320(a2).method_27852(Class433.method9026());
    }

    private static Class416 method9012() {
        return Class416.method6779();
    }

    private void method9013() {
        field2068.clear();
        field2063.clear();
        if (this.field2067 <= 0) {
            field2054.clear();
        }
    }

    private static native boolean method9014(class_1297 var0);

    private static Object method9015(Class248 class248) {
        return class248.method507();
    }

    private static void method9016(Class433 class433, class_2338 class_23382) {
        class433.method9050(class_23382);
    }

    private static void method9017() {
        Class6009.method23561();
    }

    private static boolean method9018(Class433 class433, class_2338 class_23382) {
        return class433.method9011(class_23382);
    }

    private static void method9019(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object method9020(Class248 class248) {
        return class248.method507();
    }

    private Boolean method1278() {
        return ((Integer)this.field2051.method507() > 0 ? (int)field2064[1] : (int)field2064[0]) != 0;
    }

    private static void method9021() {
        Class6454.method24594();
    }

    public static class_2248 method9022() {
        return class_2246.field_9987;
    }

    private static void method9023(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method9024() {
        Class3979.method19561();
    }

    private static void method9025() {
        Class298.method1924();
    }

    private static class_2248 method9026() {
        return Class433.method9022();
    }

    private boolean method9027() {
        return (Class433.method9012().method1265() || Class432.method8968().method1265() ? (int)field2064[1] : (int)field2064[0]) != 0;
    }

    private static void method9028() {
        Class1503.method14420();
    }

    private static void method9029() {
        Class5836.method22897();
    }

    private static boolean method9030() {
        return Class4196.method20801();
    }

    private static void method9031(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Set method9032() {
        return field2063;
    }

    private static int method9033(int n2, int n3, Class386 class386, Class691 class691) {
        return Class1251.method13361(n2, n3, class386, class691);
    }

    private boolean method9034(List a2) {
        return (!a2.isEmpty() && Class1215.method13257(((Class653)a2.getLast()).method11461()) ? (int)field2064[1] : (int)field2064[0]) != 0;
    }

    public static Class248 method9035(Class433 class433) {
        return class433.field2060;
    }

    private static void method9036(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method9037() {
        Class298.method1924();
    }

    public Class433() {
        super("Blocker", "Places blocks to stop enemies from placing crystals", Class556.field2758);
        class_2248[] class_2248Array = new class_2248[(int)field2064[3]];
        class_2248Array[(int)Class433.field2064[0]] = class_2246.field_10540;
        class_2248Array[(int)Class433.field2064[1]] = class_2246.field_10443;
        this.field2059 = this.method450(new Class257("Blocks", "What blocks to use for surround", class_2248Array));
        this.field2056 = this.method450(new Class252("Delay", "Delay, in ticks, between loops", (int)field2064[0], (int)field2064[1], (int)field2064[2]));
        this.field2058 = this.method450(new Class252("BPT", "in places, number of blocks", (int)field2064[1], (int)field2064[1], (int)field2064[4]));
        this.field2069 = this.method450(new Class260("SwapAction", "Decide which swap mode to use", Class607.field2953, Class607.values()));
        this.field2073 = this.method450(new Class253("Rotate", "Automatically faces towards the obsidian being placed", (boolean)field2064[1]));
        this.field2062 = this.method450(new Class252("PlaceRange", "The distance of your block reach", 0.0, Class1083.field4400, Class3478.field7627));
        this.field2072 = this.method450(new Class253("BreakCrystal", "Break crystals when placing blocks", (boolean)field2064[1]));
        this.field2060 = this.method450(new Class252("BreakRange", "The distance of your entity reach", 0.0, 3.0, 6.0));
        this.field2070 = this.method450(new Class253("AirPlace", "Replace block exploit allow you place block at air", (boolean)field2064[0]));
        this.field2051 = this.method450(new Class252("Support", "The maximum number of blocks for helper can place", (int)field2064[0], (int)field2064[3], (int)field2064[4]));
        this.field2066 = this.method450(new Class252("CalcDelay", "Delay, in ticks, between support calculations", (Number)((int)field2064[0]), (Number)((int)field2064[5]), (Number)((int)field2064[2]), this::method1269));
        this.field2052 = this.method450(new Class253("Multi", "Allow multiple assignblocks", (boolean)field2064[0], this::method1278));
        this.field2065 = this.method450(new Class253("Burrow", "", (boolean)field2064[1]));
        this.field2057 = this.method450(new Class253("MineExtend", "", (boolean)field2064[1]));
        this.field2050 = this.method450(new Class253("Extend", "", (boolean)field2064[1]));
        this.field2061 = this.method450(new Class253("Always", "", (boolean)field2064[0]));
        this.field2053 = this.method450(new Class253("Face", "", (boolean)field2064[1]));
        this.field2071 = (int)field2064[0];
    }

    private static void method9038(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method9039() {
        Class1745.method15538();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method9040(Class210 d2) {
        Iterator iterator;
        block22: {
            if (Class433.field290.field_1724 == null) return;
            if (Class433.method8994(field290) == null) {
                return;
            }
            this.method8998();
            if (((Boolean)this.field1536.method507()).booleanValue()) {
                Class433.method9001(0.9450699f, 0.07982212f, 0.59128845f, 0.9490435f, 0.11744833f, 0.44879562f);
                return;
            }
            if (this.method6626()) {
                return;
            }
            if (Class376.method4987()) {
                return;
            }
            if (!this.field2055.method12595((Number)this.field2056.method507())) return;
            Class433.method9053(this.field2055);
            this.field2071 = (int)field2064[0];
            for (class_2338 a2 : field2068) {
                if (this.method8995(a2)) {
                    this.field2071 += (int)field2064[1];
                }
                if (this.field2071 < (Integer)this.field2058.method507()) continue;
                return;
            }
            if (Class433.method9032().isEmpty()) return;
            iterator = field2063.iterator();
            do {
                if (!iterator.hasNext()) break block22;
                class_2338 b2 = (class_2338)iterator.next();
                if (!this.method8995(b2)) {
                    Class3979.method19561();
                    return;
                }
                this.field2071 += (int)field2064[1];
            } while (this.field2071 < (Integer)this.field2058.method507());
            return;
        }
        iterator = field2068.iterator();
        block10: while (true) {
            if (iterator.hasNext()) {
                int n2 = 47790;
                Class6454.method24594();
                return;
            }
            int n3 = 47791;
            block11: while (true) {
                switch (n3) {
                    case 47791: {
                        n3 = 47789;
                        continue block11;
                    }
                    case 47790: {
                        class_2338 c2 = (class_2338)iterator.next();
                        if (this.method8995(c2)) {
                            this.field2071 += (int)field2064[1];
                        }
                        if (this.field2071 >= (Integer)Class433.method9067(this).method507()) {
                            int n4 = 1900;
                            Class4146.method20697();
                            return;
                        }
                        int n5 = 1901;
                        block12: while (true) {
                            switch (n5) {
                                case 1901: {
                                    n5 = 1899;
                                    continue block12;
                                }
                                case 1900: {
                                    return;
                                }
                            }
                            break;
                        }
                        continue block10;
                    }
                }
                break;
            }
            break;
        }
    }

    private static void method9041() {
        Class6454.method24594();
    }

    private static boolean method9042() {
        return Class3979.method19543();
    }

    private static void method9043(Class433 class433, class_2338 class_23382) {
        class433.method9051(class_23382);
    }

    private static void method9044(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method9045(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static void method9046(long l2) {
        Class433.field2064[2] = l2 ^ 0x3542DD67B8D14208L;
        Class433.field2064[3] = l2 ^ 0x3542DD67B8D1421EL;
        Class433.field2064[1] = l2 ^ 0x3542DD67B8D1421DL;
        Class433.field2064[5] = l2 ^ 0x3542DD67B8D1421FL;
        Class433.field2064[0] = l2 ^ 0x3542DD67B8D1421CL;
        Class433.field2064[4] = l2 ^ 0x3542DD67B8D14214L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method9047(class_2338 a2) {
        int n2;
        if (!Class5723.field11054.method22514(a2) && this.method9059(a2) == null) {
            n2 = (int)field2064[0];
            return n2 != 0;
        }
        n2 = (int)field2064[1];
        return n2 != 0;
    }

    private static Object method9048(Class248 class248) {
        return class248.method507();
    }

    private static int method9049(int n2, int n3, Class1610 class1610, Class360 class360) {
        return Class1251.method13362(n2, n3, class1610, class360);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method9050(class_2338 a2) {
        class_2680 b2 = Class433.field290.field_1687.method_8320(a2);
        if (b2.method_26204() == class_2246.field_9987) {
            int n2 = 50179;
            Class5836.method22885();
            return;
        }
        int n3 = 50180;
        block4: while (true) {
            switch (n3) {
                case 50180: {
                    n3 = 50178;
                    continue block4;
                }
                case 50179: {
                    return;
                }
            }
            break;
        }
        class_2350 c2 = Class1745.method15668(a2, (Double)Class433.method9048(this.field2062));
        if (c2 != null) {
            return;
        }
        List d2 = Class1745.method15597(a2, (Double)this.field2062.method507(), (Integer)this.field2051.method507());
        if (this.method9034(d2)) {
            field2054.add(d2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method9051(class_2338 a2) {
        if (!this.method9027()) return;
        int n2 = !Class5723.field11054.method22514(a2) ? 14673 : 14674;
        block4: while (true) {
            switch (n2) {
                case 14674: {
                    n2 = 14672;
                    continue block4;
                }
                case 14673: {
                    Class433.method9063().add(a2);
                    if (!this.method9006()) return;
                    Class433.method9016(this, a2);
                    return;
                }
            }
            break;
        }
    }

    private static void method9052() {
        Class6009.method23560();
    }

    private static void method9053(Class924 class924) {
        class924.method12593();
    }

    private static void method9054(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method9055() {
        Class5659.method22184();
    }

    private static void method9056(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    @Override
    public String method1248() {
        return String.valueOf(this.field2071);
    }

    private static void method9057(float f2) {
        Class5836.method22907(f2);
    }

    public static class_746 method9058(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private class_1511 method9059(class_2338 a2) {
        return Class433.field290.field_1687.method_8335(null, new class_238(a2)).stream().filter(Class433::method9014).min(Comparator.comparingDouble(Class433::method9061)).orElse(null);
    }

    public static Set method9060() {
        return field2068;
    }

    private static double method9061(class_1297 a2) {
        return Class433.method9058(field290).method_5739(a2);
    }

    private boolean method9062(class_2338 a2) {
        class_2680 b2 = Class433.field290.field_1687.method_8320(a2);
        if (!b2.method_27852(class_2246.field_10540)) {
            return Class3979.method19544();
        }
        return (int)field2064[1] != 0;
    }

    private static Set method9063() {
        return Class433.method9060();
    }

    private static void method9064() {
        Class298.method1924();
    }

    private static void method9065(List a2) {
        field2063.addAll(a2.stream().map(Class653::method11461).collect(Collectors.toCollection(HashSet::new)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method9066() {
        int n2 = !field2054.isEmpty() ? 7775 : 7774;
        block4: while (true) {
            switch (n2) {
                case 7775: {
                    n2 = 7773;
                    continue block4;
                }
                case 7774: {
                    return;
                }
            }
            break;
        }
        if (((Boolean)Class433.method8996(this).method507()).booleanValue()) {
            for (List a2 : field2054) {
                field2063.addAll(a2.stream().map(Class653::method11461).collect(Collectors.toCollection(HashSet::new)));
            }
            return;
        } else {
            Optional<List> b2 = field2054.stream().min(Comparator.comparingInt(List::size));
            b2.ifPresent(Class433::method9065);
        }
    }

    public static Class248 method9067(Class433 class433) {
        return class433.field2058;
    }

    private static void method9068(Class433 class433) {
        class433.method9013();
    }

    private static Object method9069(Class248 class248) {
        return class248.method507();
    }

    static {
        ___.___(15, Class433.class);
        ____.___15_1250(Class433.class);
    }

    private Boolean method1269() {
        return ((Integer)Class433.method9010(this).method507() > 0 ? (int)field2064[1] : (int)field2064[0]) != 0;
    }

    private static void method9070() {
        Class4146.method20697();
    }

    private static native Object 1(char var0);
}

