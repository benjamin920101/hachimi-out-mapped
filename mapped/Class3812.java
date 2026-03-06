/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.function.Predicate;
import mapped.Class1278;
import mapped.Class1504;
import mapped.Class1807;
import mapped.Class230;
import mapped.Class287;
import mapped.Class376;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class607;
import mapped.Class6454;
import mapped.Class704;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3812 {
    int field8626;
    Class607 field8627;
    int field8628 = (int)field8633[0];
    Predicate field8629;
    public class_1799 field8630;
    class_1735 field8631;
    class_1792 field8632;
    private static long[] field8633 = new long[5];

    private static boolean method18500() {
        return Class5836.method22894();
    }

    private static boolean method18501() {
        return Class1807.method15753();
    }

    public Class3812 method18502() {
        block5: {
            block7: {
                block6: {
                    switch (Class1504.field5675[this.field8627.ordinal()] ^ 0xEAEC9FF8) {
                        default: {
                            break block5;
                        }
                        case -353591303: {
                            break;
                        }
                        case -353591302: {
                            break block6;
                        }
                        case -353591301: {
                            break block7;
                        }
                    }
                    Class3812.method18513(this, this.method18535());
                    break block5;
                }
                this.field8628 = this.method18509();
                break block5;
            }
            this.field8631 = this.method18520();
        }
        return this;
    }

    private static int method18503(int n2) {
        return Class4045.method20103(n2);
    }

    private static boolean method18504(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static boolean method18505() {
        return Class5659.method22111();
    }

    private static boolean method18506() {
        return Class4196.method20801();
    }

    public static class_1792 method18507(Class3812 class3812) {
        return class3812.field8632;
    }

    private static int method18508(int n2, int n3, Class704 class704, Class230 class230) {
        return Class1278.method13600(n2, n3, class704, class230);
    }

    public int method18509() {
        for (int b2 = (int)field8633[1]; b2 < (int)field8633[4]; ++b2) {
            class_1799 a2 = Class3812.method18536().field_1724.method_31548().method_5438(b2);
            if (Class3812.method18528(this) == null) {
                if (!a2.method_7909().equals(Class3812.method18507(this))) continue;
                this.field8630 = a2;
                return b2;
            }
            if (!this.field8629.test(a2)) continue;
            this.field8630 = a2;
            return b2;
        }
        return (int)field8633[0];
    }

    private static boolean method18510() {
        return Class1807.method15753();
    }

    private static void method18511() {
        Class4146.method20694();
    }

    public static Class607 method18512(Class3812 class3812) {
        return class3812.field8627;
    }

    public static void method18513(Class3812 class3812, int n2) {
        class3812.field8626 = n2;
    }

    private static boolean method18514() {
        return Class1807.method15742();
    }

    static {
        Class3812.method18532(8776213600880158935L);
    }

    public int method18515() {
        int a2 = this.method18530();
        if (a2 >= (int)field8633[4]) {
            return Class4045.method20093(-62770157, -1064751006);
        }
        return this.field8627 != Class3812.method18517() ? a2 + (int)field8633[3] : a2;
    }

    private static int method18516() {
        return Class6454.method24637();
    }

    public static Class607 method18517() {
        return Class607.field2954;
    }

    public Class3812(Predicate a2, Class607 b2) {
        this.field8626 = (int)field8633[0];
        this.field8627 = b2;
        this.field8629 = a2;
    }

    private static Class607 method18518(Class3812 class3812) {
        return Class3812.method18512(class3812);
    }

    public Class3812(class_1792 a2, Class607 b2) {
        this.field8626 = (int)field8633[0];
        this.field8632 = a2;
        this.field8627 = b2;
    }

    private static int method18519(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    public class_1735 method18520() {
        for (class_1735 b2 : Class3812.method18521((class_310)Class4122.field9561).field_7512.field_7761) {
            class_1799 a2 = b2.method_7677();
            if (this.field8629 == null) {
                if (!a2.method_7909().equals(this.field8632)) continue;
                this.field8630 = a2;
                return b2;
            }
            if (!Class3812.method18526(this).test(a2)) continue;
            this.field8630 = a2;
            return b2;
        }
        return null;
    }

    public static class_746 method18521(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method18522() {
        return Class376.method4987();
    }

    public boolean method18523() {
        block8: {
            block9: {
                switch (Class1504.field5675[this.field8627.ordinal()] ^ 0x6E6CD12A) {
                    default: {
                        break block8;
                    }
                    case 1852625192: {
                        break;
                    }
                    case 1852625193: {
                        break block9;
                    }
                    case 1852625195: {
                        if (this.field8626 != (int)field8633[0]) {
                            int n2 = (int)field8633[2];
                            while (true) {
                                // Infinite loop
                            }
                        }
                        return (int)field8633[1] != 0;
                    }
                }
                return (this.field8628 != (int)field8633[0] ? (int)field8633[2] : (int)field8633[1]) != 0;
            }
            if (this.field8631 != null) {
                int n3 = (int)field8633[2];
                return Class5659.method22229(0.0513641515337796, 0.5179442592550048, 0.5554248721667573, 0.13996676478357772);
            }
            return (int)field8633[1] != 0;
        }
        return (int)field8633[1] != 0;
    }

    private static void method18524() {
        Class5836.method22885();
    }

    private static int method18525(int n2) {
        return Class287.method1495(n2);
    }

    public static Predicate method18526(Class3812 class3812) {
        return class3812.field8629;
    }

    private static void method18527() {
        Class4146.method20694();
    }

    public static Predicate method18528(Class3812 class3812) {
        return class3812.field8629;
    }

    private static void method18529(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public int method18530() {
        int n2;
        block8: {
            block6: {
                block7: {
                    block5: {
                        switch (Class1504.field5675[this.field8627.ordinal()] ^ 0x91B90661) {
                            default: {
                                break;
                            }
                            case -1850145184: {
                                break block5;
                            }
                            case -1850145182: {
                                break block6;
                            }
                            case -1850145181: {
                                break block7;
                            }
                        }
                        throw new MatchException(null, null);
                    }
                    n2 = this.field8626;
                    break block8;
                }
                n2 = this.field8628;
                break block8;
            }
            n2 = this.field8631.field_7874;
        }
        return n2;
    }

    public void method18531(int a2) {
        int b2 = this.method18530();
        if (b2 != (int)field8633[0]) {
            Class3812.method18518(this).method11279().method11126(b2, a2);
        }
    }

    private static void method18532(long l2) {
        Class3812.field8633[0] = l2 ^ 0x8634A03A76961728L;
        Class3812.field8633[1] = l2 ^ 0x79CB5FC58969E8D7L;
        Class3812.field8633[3] = l2 ^ 0x79CB5FC58969E8F3L;
        Class3812.field8633[2] = l2 ^ 0x79CB5FC58969E8D6L;
        Class3812.field8633[4] = l2 ^ 0x79CB5FC58969E8DEL;
    }

    public static Predicate method18533(Class3812 class3812) {
        return class3812.field8629;
    }

    public void method18534(int a2) {
        int b2 = this.method18530();
        if (b2 != (int)field8633[0]) {
            this.field8627.method11279().method11125(b2, a2);
        }
    }

    public int method18535() {
        for (int b2 = (int)field8633[1]; b2 < (int)field8633[3]; ++b2) {
            class_1799 a2 = Class4122.field9561.field_1724.method_31548().method_5438(b2);
            if (Class3812.method18533(this) == null) {
                if (!a2.method_7909().equals(this.field8632)) continue;
                this.field8630 = a2;
                return b2;
            }
            if (!this.field8629.test(a2)) continue;
            this.field8630 = a2;
            return b2;
        }
        return (int)field8633[0];
    }

    public static class_310 method18536() {
        return Class4122.field9561;
    }

    private static int method18537(int n2) {
        return Class287.method1495(n2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

