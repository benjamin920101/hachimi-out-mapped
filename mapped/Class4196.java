/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.enchantment.Enchantments
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1215;
import mapped.Class1308;
import mapped.Blink;
import mapped.Class3979;
import mapped.Class4045;
import mapped.Class411;
import mapped.Class4122;
import mapped.Velocity;
import mapped.Class5550;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6339;
import mapped.Class6454;
import mapped.Class804;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.RegistryKey;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class4196 {
    private static long[] field9799 = new long[5];

    private static class_746 method20800(class_310 class_3102) {
        return Class4196.method20816(class_3102);
    }

    public static boolean method20801() {
        return Class4196.method20803((int)field9799[0]);
    }

    public static class_310 method20802() {
        return Class4122.field9561;
    }

    public static boolean method20803(int a2) {
        class_1799 b2 = Class4196.method20800(Class4196.method20817()).method_6047();
        return (Class1308.method13621(b2, Class4196.method20804()) >= a2 ? (int)field9799[1] : (int)field9799[2]) != 0;
    }

    public static class_5321 method20804() {
        return class_1893.field_9118;
    }

    private static int method20805(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static void method20806(long l2) {
        Class4196.field9799[2] = l2 ^ 0x395AC0A84D2341E8L;
        Class4196.field9799[4] = l2 ^ 0x395AC0A84D2341E1L;
        Class4196.field9799[3] = l2 ^ 0x395AC0A84D2341CCL;
        Class4196.field9799[1] = l2 ^ 0x395AC0A84D2341E9L;
        Class4196.field9799[0] = l2 ^ 0x395AC0A84D234200L;
    }

    private static int method20807() {
        return Class6454.method24637();
    }

    private static boolean method20808(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static int method20809(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static boolean method20810() {
        return Class3979.method19551();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method20811(class_1792 c2, boolean d2) {
        int e2;
        int n2;
        int n3 = !d2 ? 517 : 516;
        block8: while (true) {
            switch (n3) {
                case 517: {
                    n3 = 515;
                    continue block8;
                }
                case 516: {
                    n2 = (int)field9799[2];
                    break block8;
                }
                default: {
                    n2 = (int)field9799[4];
                }
            }
            break;
        }
        int b2 = e2 = n2;
        if (b2 >= (int)field9799[3]) {
            return (int)field9799[2] != 0;
        }
        class_1799 a2 = Class4196.method20802().field_1724.method_31548().method_5438(b2);
        if (!a2.method_7960()) {
            int n4 = a2.method_7909() == c2 ? 21517 : 21518;
            block9: while (true) {
                switch (n4) {
                    case 21518: {
                        n4 = 21516;
                        continue block9;
                    }
                    case 21517: {
                        return (int)field9799[1] != 0;
                    }
                }
                break;
            }
        }
        ++b2;
        return Velocity.method10322();
    }

    private static boolean method20812() {
        return Velocity.method10252();
    }

    public static int method20813(class_1792 c2) {
        if (Class4122.field9561.field_1724 == null) {
            return (int)field9799[2];
        }
        class_1799 d2 = Class4122.field9561.field_1724.method_6079();
        if (d2.method_7909() != c2) {
            return Class5550.method21885();
        }
        int e2 = d2.method_7947();
        for (int b2 = (int)field9799[2]; b2 < (int)field9799[3]; ++b2) {
            class_1799 a2 = Class4196.method20825(Class4122.field9561).method_31548().method_5438(b2);
            if (a2.method_7909() != c2) continue;
            e2 += a2.method_7947();
        }
        return e2;
    }

    private static boolean method20814() {
        return Class5659.method22111();
    }

    private static boolean method20815() {
        return Class3979.method19543();
    }

    public static class_746 method20816(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_310 method20817() {
        return Class4122.field9561;
    }

    private static boolean method20818(double d2) {
        return Class5659.method22193(d2);
    }

    private static class_746 method20819(class_310 class_3102) {
        return Class4196.method20826(class_3102);
    }

    private static int method20820(int n2, int n3, Class804 class804, Class411 class411) {
        return Class6339.method24346(n2, n3, class804, class411);
    }

    private static boolean method20821() {
        return Class3979.method19543();
    }

    private static int method20822() {
        return Class6454.method24637();
    }

    private static boolean method20823() {
        return Blink.method4987();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method20824(class_1792 c2) {
        int b2 = (int)field9799[2];
        block4: while (true) {
            int n2 = b2 < (int)field9799[4] ? 10554 : 10555;
            block5: while (true) {
                switch (n2) {
                    case 10555: {
                        n2 = 10553;
                        continue block5;
                    }
                    case 10554: {
                        class_1799 a2 = Class4196.method20819(Class4122.field9561).method_31548().method_5438(b2);
                        if (!a2.method_7960()) {
                            if (a2.method_7909() != c2) {
                                return Class4196.method20810();
                            }
                            return (int)field9799[1] != 0;
                        }
                        ++b2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return (int)field9799[2] != 0;
    }

    public static class_746 method20825(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method20826(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static boolean method20827(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static boolean method20828() {
        return Class5836.method22894();
    }

    static {
        Class4196.method20806(4132827437147046376L);
    }

    private static boolean method20829() {
        return Class3979.method19544();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

