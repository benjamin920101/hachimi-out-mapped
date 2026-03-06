/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.ChestBlockEntity
 *  net.minecraft.block.entity.EnderChestBlockEntity
 *  net.minecraft.block.entity.HopperBlockEntity
 *  net.minecraft.block.entity.ShulkerBoxBlockEntity
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.enums.ChestType
 *  net.minecraft.state.property.Property
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.block.entity.FurnaceBlockEntity
 *  net.minecraft.client.util.math.MatrixStack
 */
package mapped;

import java.awt.Color;
import java.util.Iterator;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class1503;
import mapped.Class1585;
import mapped.Class1600;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3996;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4201;
import mapped.Class4246;
import mapped.Class5427;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5669;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class691;
import mapped.Class73;
import mapped.Class821;
import net.minecraft.block.ChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.ChestType;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.MathHelper;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.client.util.math.MatrixStack;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class369
extends Class278 {
    private static long[] field1199 = new long[7];
    Class248 field1200 = this.method450(new Class252("Range", "The ESP render range", Float.valueOf(10.0f), Float.valueOf(50.0f), Float.valueOf(200.0f)));
    Class248 field1201;
    Class248 field1202;
    Class248 field1203;
    Class248 field1204;
    private static Class369 INSTANCE;
    Class248 field1205;
    Class248 field1206 = this.method450(new Class253("Fill", "Fills in the highlight", (boolean)field1199[0]));
    Class248 field1207;
    Class248 field1208;
    Class248 field1209;
    Class248 field1210;
    Class248 field1211;
    Class248 field1212;

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4807(Class59 J2) {
        block26: {
            class_2338 H2;
            double G2;
            Color E2;
            block24: {
                block25: {
                    class_2586 I2;
                    block23: {
                        Class369.method4809();
                        Iterator iterator = Class1215.method13267().iterator();
                        block4: while (true) {
                            if (!iterator.hasNext()) {
                                Class6009.method23561();
                                return;
                            }
                            I2 = (class_2586)iterator.next();
                            double D2 = Class369.field290.field_1724.method_5707(I2.method_11016().method_46558());
                            int n2 = D2 > Class369.method4832((Class252)Class369.method4824(this)) ? 16527 : 16528;
                            block5: while (true) {
                                switch (n2) {
                                    case 16528: {
                                        n2 = 16526;
                                        continue block5;
                                    }
                                    case 16527: {
                                        continue block4;
                                    }
                                }
                                break;
                            }
                            E2 = this.method4813(I2);
                            if (E2 != null) break;
                        }
                        class_243 F2 = I2.method_11016().method_46558();
                        G2 = (100.0 - Class369.field290.field_1724.method_5707(F2)) / 100.0;
                        G2 = 1.0 - class_3532.method_15350((double)G2, (double)0.0, (double)1.0);
                        H2 = I2.method_11016();
                        if (I2 instanceof class_2595) break block23;
                        if (!(I2 instanceof class_2611)) break block24;
                        break block25;
                    }
                    double l2 = (double)H2.method_10263() + 0.06;
                    double m2 = H2.method_10264();
                    double n3 = (double)H2.method_10260() + 0.06;
                    double o2 = (double)H2.method_10263() + 0.94;
                    double p2 = (double)H2.method_10264() + 0.875;
                    double q2 = (double)H2.method_10260() + 0.94;
                    class_2680 r2 = I2.method_11010();
                    if (!r2.method_28498((class_2769)class_2281.field_10770)) break block26;
                    class_2350 j2 = (class_2350)r2.method_11654((class_2769)class_2281.field_10768);
                    class_2745 k2 = (class_2745)r2.method_11654((class_2769)class_2281.field_10770);
                    if (k2 == class_2745.field_12571) {
                        if ((j2 = j2.method_10160()).method_10148() < 0) {
                            l2 += (double)j2.method_10148();
                            Class5659.method22184();
                            return;
                        }
                        o2 += (double)j2.method_10148();
                        if (j2.method_10165() < 0) {
                            n3 += (double)j2.method_10165();
                        } else {
                            q2 += (double)j2.method_10165();
                        }
                        int a2 = new Color(E2.getRed(), E2.getGreen(), E2.getBlue(), (int)(30.0 * G2)).getRGB();
                        int b2 = new Color(E2.getRed(), E2.getGreen(), E2.getBlue(), (int)(72.0 * G2)).getRGB();
                        class_238 c2 = new class_238(l2, m2, n3, o2, p2, q2);
                        if (((Boolean)this.field1206.method507()).booleanValue()) {
                            Class6454.method24621(Class369.method4828(J2), c2, a2);
                        }
                        Class6454.method24605(J2.method125(), c2, ((Float)Class369.method4845(this).method507()).floatValue(), b2);
                        break block26;
                    } else {
                        if (k2 == class_2745.field_12574) {
                            if ((j2 = j2.method_10170()).method_10148() < 0) {
                                l2 += (double)j2.method_10148();
                            } else {
                                o2 += (double)j2.method_10148();
                            }
                            if (j2.method_10165() < 0) {
                                n3 += (double)j2.method_10165();
                            } else {
                                q2 += (double)j2.method_10165();
                            }
                            int d2 = new Color(E2.getRed(), E2.getGreen(), E2.getBlue(), (int)(30.0 * G2)).getRGB();
                            int e2 = new Color(E2.getRed(), E2.getGreen(), E2.getBlue(), (int)(72.0 * G2)).getRGB();
                            class_238 f2 = new class_238(l2, m2, n3, o2, p2, q2);
                            if (((Boolean)this.field1206.method507()).booleanValue()) {
                                Class6454.method24621(J2.method125(), f2, d2);
                            }
                            Class6454.method24605(J2.method125(), f2, ((Float)this.field1201.method507()).floatValue(), e2);
                            Class4036.method20085(0.089122236f, Class4246.field9918, Class821.field3611, 0.6117047f, Class4201.field9813, Class3996.field9148);
                            return;
                        }
                        if (k2 == class_2745.field_12569) {
                            int g2 = new Color(E2.getRed(), E2.getGreen(), E2.getBlue(), (int)(60.0 * G2)).getRGB();
                            int h2 = new Color(E2.getRed(), E2.getGreen(), E2.getBlue(), (int)(145.0 * G2)).getRGB();
                            class_238 i2 = new class_238(l2, m2, n3, o2, p2, q2);
                            if (((Boolean)Class369.method4839(this.field1206)).booleanValue()) {
                                Class6454.method24621(J2.method125(), i2, g2);
                            }
                            Class6454.method24605(J2.method125(), i2, ((Float)this.field1201.method507()).floatValue(), h2);
                        }
                    }
                    break block26;
                }
                Class1668.method15147(1787538413, -992536233, -1600399912, -1876045355);
                return;
            }
            int B2 = new Color(E2.getRed(), E2.getGreen(), E2.getBlue(), (int)(Class1585.field5922 * G2)).getRGB();
            int C2 = new Color(E2.getRed(), E2.getGreen(), E2.getBlue(), (int)(145.0 * G2)).getRGB();
            if (((Boolean)this.field1206.method507()).booleanValue()) {
                Class6454.method24734(J2.method125(), H2, B2);
            }
            Class6454.method24642(J2.method125(), H2, ((Float)Class369.method4826(Class369.method4836(this))).floatValue(), C2);
        }
        while (true) {
            // Infinite loop
        }
    }

    private static void method4808(long l2) {
        Class369.field1199[5] = l2 ^ 0xC73E6F4F1B7BB041L;
        Class369.field1199[0] = l2 ^ 0xC73E6F4F1B7BB024L;
        Class369.field1199[2] = l2 ^ 0xC73E6F4F1B7BB040L;
        Class369.field1199[4] = l2 ^ 0xC73E6F4F1B7BB0BFL;
        Class369.field1199[3] = l2 ^ 0xC73E6F4F1B7BB0ECL;
        Class369.field1199[1] = l2 ^ 0xC73E6F4F1B7BB025L;
        Class369.field1199[6] = l2 ^ 0xC73E6F4F1B7BB04EL;
    }

    private static void method4809() {
        Class6009.method23560();
    }

    public static Class369 method4810() {
        return INSTANCE;
    }

    private Boolean method4811() {
        return (Boolean)this.field1210.method507();
    }

    private static void method4812(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public Color method4813(class_2586 a2) {
        if (a2 instanceof class_2595) {
            return (Color)this.field1208.method507();
        }
        if (a2 instanceof class_2611) {
            return (Color)Class369.method4846(this).method507();
        }
        if (a2 instanceof class_2627) {
            return (Color)this.field1203.method507();
        }
        if (a2 instanceof class_2614) {
            return (Color)this.field1211.method507();
        }
        if (a2 instanceof class_3866) {
            return (Color)this.field1209.method507();
        }
        return null;
    }

    private static void method4814(float f2) {
        Class5836.method22907(f2);
    }

    private static int method4815(int n2, int n3, Class1600 class1600, Class691 class691) {
        return Class5669.method22268(n2, n3, class1600, class691);
    }

    private Boolean method4816() {
        return (Boolean)this.field1212.method507();
    }

    private static void method4817() {
        Class6009.method23560();
    }

    private static void method4818() {
        Class6009.method23560();
    }

    private static void method4819(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method4820() {
        Class1745.method15538();
    }

    private static class_4587 method4821(Class59 class59) {
        return class59.method125();
    }

    private static void method4822() {
        Class5836.method22885();
    }

    private static void method4823() {
        Class1503.method14420();
    }

    public static Class248 method4824(Class369 class369) {
        return class369.field1200;
    }

    private static void method4825(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method4826(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method4827(Class369 class369) {
        return class369.field1204;
    }

    private static class_4587 method4828(Class59 class59) {
        return class59.method125();
    }

    public Class369() {
        super("StorageESP", "Highlights containers in the world", Class556.field2759);
        this.field1201 = this.method450(new Class252("Width", "The line width of the highlight", Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(Class5427.field10104)));
        this.field1202 = this.method450(new Class253("Chests", "Render players through walls", (boolean)field1199[1]));
        this.field1208 = this.method450(new Class251("ChestsColor", "The render color for chests", new Color((int)field1199[3], (int)field1199[3], (int)field1199[5]), (boolean)field1199[0], (boolean)field1199[0], this::method1269));
        this.field1205 = this.method450(new Class253("EnderChests", "Render players through walls", (boolean)field1199[1]));
        this.field1207 = this.method450(new Class251("EnderChestsColor", "The render color for ender chests", new Color((int)field1199[4], (int)field1199[0], (int)field1199[3]), (boolean)field1199[0], (boolean)field1199[0], this::method1278));
        this.field1210 = this.method450(new Class253("Shulkers", "Render players through walls", (boolean)field1199[1]));
        this.field1203 = this.method450(new Class251("ShulkersColor", "The render color for shulkers", new Color((int)field1199[3], (int)field1199[0], (int)field1199[6]), (boolean)field1199[0], (boolean)field1199[0], this::method4811));
        this.field1212 = this.method450(new Class253("Hoppers", "Render players through walls", (boolean)field1199[0]));
        this.field1211 = this.method450(new Class251("HoppersColor", "The render color for hoppers", new Color((int)field1199[2], (int)field1199[2], (int)field1199[2]), (boolean)field1199[0], (boolean)field1199[0], this::method4816));
        this.field1204 = this.method450(new Class253("Furnaces", "Render players through walls", (boolean)field1199[0]));
        this.field1209 = this.method450(new Class251("FurnacesColor", "The render color for furnaces", new Color((int)field1199[2], (int)field1199[2], (int)field1199[2]), (boolean)field1199[0], (boolean)field1199[0], this::method4844));
        INSTANCE = this;
    }

    private static int method4829(int n2, int n3, Class4146 class4146, Class73 class73) {
        return Class5669.method22265(n2, n3, class4146, class73);
    }

    private static void method4830() {
        Class5836.method22890();
    }

    private static void method4831(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static double method4832(Class252 class252) {
        return class252.method564();
    }

    private static void method4833(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method4834(Class248 class248) {
        return class248.method507();
    }

    private static void method4835() {
        Class5836.method22885();
    }

    public static Class248 method4836(Class369 class369) {
        return class369.field1201;
    }

    private static void method4837(float f2) {
        Class5836.method22907(f2);
    }

    private static void method4838(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method4839(Class248 class248) {
        return class248.method507();
    }

    private static void method4840() {
        Class1503.method14420();
    }

    private static void method4841() {
        Class5836.method22890();
    }

    private Boolean method1278() {
        return (Boolean)Class369.method4851(this).method507();
    }

    private static void method4842() {
        Class1745.method15538();
    }

    private static Object method4843(Class248 class248) {
        return class248.method507();
    }

    private Boolean method4844() {
        return (Boolean)Class369.method4847(this).method507();
    }

    public static Class248 method4845(Class369 class369) {
        return class369.field1201;
    }

    public static Class248 method4846(Class369 class369) {
        return class369.field1207;
    }

    private Boolean method1269() {
        return (Boolean)Class369.method4843(this.field1202);
    }

    private static Class248 method4847(Class369 class369) {
        return Class369.method4827(class369);
    }

    static {
        Class369.method4808(-4089709026051641308L);
    }

    private static void method4848(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method4849() {
        Class6009.method23560();
    }

    private static void method4850() {
        Class1503.method14420();
    }

    public static Class248 method4851(Class369 class369) {
        return class369.field1205;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

