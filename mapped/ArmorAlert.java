/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ArmorItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.client.gui.DrawContext
 */
package mapped;

import java.awt.Color;
import java.util.Iterator;
import mapped.Class1;
import mapped.Class1365;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class233;
import mapped.Class240;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Chams;
import mapped.Class3285;
import mapped.AirPlace;
import mapped.Class3979;
import mapped.Class3989;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5602;
import mapped.Class5659;
import mapped.Class5778;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6394;
import mapped.Class6454;
import mapped.Class8;
import mapped.Class909;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.DrawContext;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ArmorAlert
extends Class278 {
    Class248 field1387 = this.method450(new Class252("Percent", "yes.", (int)field1390[1], (int)field1390[3], (int)field1390[7]));
    Class248 field1388;
    Class248 field1389;
    private static long[] field1390 = new long[10];
    int field1391;
    boolean[] field1392;
    Class248 field1393 = this.method450(new Class253("HUD", "Render warning on your screen", (boolean)field1390[1]));

    private static void method5841() {
        Class4146.method20697();
    }

    private static void method5842() {
        Chams.method1924();
    }

    private static int method5843(int n2, int n3, Class240 class240, Class3285 class3285) {
        return Class5602.method21949(n2, n3, class240, class3285);
    }

    public static boolean[] method5844(ArmorAlert class398) {
        return class398.field1392;
    }

    private static Object method5845(Class248 class248) {
        return class248.method507();
    }

    private static void method5846() {
        Class1807.method15744();
    }

    private static void method5847(long l2) {
        ArmorAlert.method5862(l2);
    }

    private static void method5848(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method5849(ArmorAlert class398) {
        return class398.field1393;
    }

    private static void method5850() {
        Class4146.method20697();
    }

    private static void method5851() {
        Class5659.method22184();
    }

    private static boolean[] method5852(ArmorAlert class398) {
        return ArmorAlert.method5859(class398);
    }

    private static void method5853() {
        Class3979.method19561();
    }

    static {
        ArmorAlert.method5847(-8021509519660511870L);
    }

    public static int method5854(ArmorAlert class398) {
        return class398.field1391;
    }

    @Override
    protected void method1274() {
        boolean[] blArray = new boolean[(int)field1390[5]];
        blArray[(int)ArmorAlert.field1390[4]] = (int)field1390[4];
        blArray[(int)ArmorAlert.field1390[1]] = (int)field1390[4];
        blArray[(int)ArmorAlert.field1390[0]] = (int)field1390[4];
        blArray[(int)ArmorAlert.field1390[2]] = (int)field1390[4];
        this.field1392 = blArray;
    }

    @Class1
    public void method5855(Class233 c2) {
        block1: {
            boolean[] blArray;
            int n2;
            int n3;
            if (!((Boolean)ArmorAlert.method5849(this).method507()).booleanValue() || (n3 = (int)field1390[4]) >= (n2 = (blArray = ArmorAlert.method5867(this)).length)) break block1;
            boolean b2 = blArray[n3];
            if (!b2) {
                Class4036.method20085(0.28684747f, 0.4037866f, 0.15778345f, 0.9107224f, 0.40137148f, 0.5677255f);
                return;
            }
            String a2 = "Low durability (" + this.field1391 + "%)";
            ArmorAlert.method5860(c2.method6(), a2, (float)field290.method_22683().method_4486() / 2.0f - (float)Class6454.method24719(a2) / 2.0f, (float)field290.method_22683().method_4502() / 2.0f + (float)Class6454.method24637() - (float)((Integer)ArmorAlert.method5845(this.field1389)).intValue(), ((Color)this.field1388.method507()).getRGB());
        }
    }

    private static void method5856() {
        Class5836.method22885();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5857(Class210 e2) {
        void b2;
        int c2;
        int f2 = (int)field1390[4];
        int g2 = (int)field1390[9];
        Iterator iterator = ArmorAlert.field290.field_1724.method_31548().field_7548.iterator();
        while (true) {
            block9: {
                block10: {
                    block8: {
                        class_1792 class_17922;
                        block7: {
                            int n2;
                            if (!iterator.hasNext()) {
                                int n3 = 51764;
                                Class5836.method22885();
                                return;
                            }
                            int n4 = 51763;
                            boolean bl2 = true;
                            do {
                                if (!bl2 || (bl2 = false) || !true) {
                                    n4 = n2 = 51762;
                                }
                                if (n2 == 51763) break block7;
                            } while (n2 == 51764);
                            Class5836.method22907(Class5778.field11221);
                            return;
                        }
                        class_1799 d2 = (class_1799)iterator.next();
                        if (++g2 >= (int)field1390[5]) {
                            return;
                        }
                        if (d2.method_7960() || !((class_17922 = d2.method_7909()) instanceof class_1738)) break block8;
                        class_1738 a2 = (class_1738)class_17922;
                        c2 = this.method5858(d2);
                        if (c2 < (Integer)this.field1387.method507()) break block9;
                        break block10;
                    }
                    this.field1392[g2] = (int)field1390[4];
                    continue;
                }
                ArmorAlert.method5844((ArmorAlert)this)[g2] = (int)field1390[4];
                continue;
            }
            if (f2 == 0) {
                Class1503.method14417(Class6394.field13242, 0.23796147f);
                return;
            }
            if (c2 < ArmorAlert.method5854(this)) {
                f2 = (int)field1390[1];
                this.field1391 = c2;
            }
            if (!ArmorAlert.method5852(this)[g2]) break;
        }
        Class1365.method13948("\u00a74Your " + b2.method_7685().method_5923() + " is at " + c2 + "%!", this.hashCode() + g2);
        this.field1392[g2] = (int)field1390[1];
        Class4146.method20697();
    }

    int method5858(class_1799 a2) {
        return (int)((double)(a2.method_7936() - a2.method_7919()) / Math.max(0.1, (double)a2.method_7936()) * 100.0);
    }

    public static boolean[] method5859(ArmorAlert class398) {
        return class398.field1392;
    }

    private static void method5860(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    private static void method5861() {
        Class6009.method23560();
    }

    private static void method5862(long l2) {
        ArmorAlert.field1390[1] = l2 ^ 0x90ADDF9776388D83L;
        ArmorAlert.field1390[6] = l2 ^ 0x90ADDF9776388D4AL;
        ArmorAlert.field1390[3] = l2 ^ 0x90ADDF9776388D96L;
        ArmorAlert.field1390[0] = l2 ^ 0x90ADDF9776388D80L;
        ArmorAlert.field1390[7] = l2 ^ 0x90ADDF9776388DE6L;
        ArmorAlert.field1390[2] = l2 ^ 0x90ADDF9776388D81L;
        ArmorAlert.field1390[9] = l2 ^ 0x6F52206889C7727DL;
        ArmorAlert.field1390[4] = l2 ^ 0x90ADDF9776388D82L;
        ArmorAlert.field1390[5] = l2 ^ 0x90ADDF9776388D86L;
        ArmorAlert.field1390[8] = l2 ^ 0x6F52206889C772BAL;
    }

    private static void method5863(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method5864(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static int method5865(int n2, int n3, Class909 class909, AirPlace class379) {
        return Class5602.method21970(n2, n3, class909, class379);
    }

    private static void method5866(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static boolean[] method5867(ArmorAlert class398) {
        return class398.field1392;
    }

    private static int method5868(int n2, int n3, Class3989 class3989, Class8 class8) {
        return Class5602.method21954(n2, n3, class3989, class8);
    }

    public ArmorAlert() {
        super("ArmorAlert", "", Class556.field2758);
        this.field1389 = this.method450(new Class252("Offset", "Indicator offset", (Number)((int)field1390[8]), (Number)((int)field1390[4]), (Number)((int)field1390[6]), this.field1393::method507));
        this.field1388 = this.method450(new Class251("Color", "Indicator color", Color.RED, this.field1393::method507));
        boolean[] blArray = new boolean[(int)field1390[5]];
        blArray[(int)ArmorAlert.field1390[4]] = (int)field1390[4];
        blArray[(int)ArmorAlert.field1390[1]] = (int)field1390[4];
        blArray[(int)ArmorAlert.field1390[0]] = (int)field1390[4];
        blArray[(int)ArmorAlert.field1390[2]] = (int)field1390[4];
        this.field1392 = blArray;
    }

    private static void method5869(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

