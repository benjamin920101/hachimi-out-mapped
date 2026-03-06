/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1934
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_746
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class1393;
import mapped.Class161;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class326;
import mapped.Class35;
import mapped.Class3593;
import mapped.Class4045;
import mapped.Class4197;
import mapped.Class489;
import mapped.Class556;
import mapped.Class6283;
import mapped.Class6454;
import net.minecraft.class_1934;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class285
extends Class278 {
    Class248 field447;
    Class248 field448;
    private static long[] field449 = new long[4];
    private final Class6283 field450 = new Class6283((boolean)field449[0], 100.0f, Class489.field2543);
    Class248 field451;
    Class248 field452 = this.method450(new Class252("Length", "The crosshair length", Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(2.5f)));
    Class248 field453;
    Class248 field454;
    Class248 field455;
    Class248 field456;

    private static Object method1449(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method1450(Class285 class285) {
        return class285.field448;
    }

    private static Class248 method1451(Class285 class285) {
        return Class285.method1474(class285);
    }

    private static int method1452(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static Class248 method1453(Class285 class285) {
        return Class285.method1465(class285);
    }

    private static void method1454(long l2) {
        Class285.field449[1] = l2 ^ 0xC9150035E49E4124L;
        Class285.field449[3] = l2 ^ 0xC9150035E49E4120L;
        Class285.field449[0] = l2 ^ 0xC9150035E49E4125L;
        Class285.field449[2] = l2 ^ 0xC9150035E49E4127L;
    }

    public static class_746 method1455(class_310 class_3102) {
        return class_3102.field_1724;
    }

    static {
        Class285.method1454(-3957256466106269403L);
    }

    private static Object method1456(Class248 class248) {
        return class248.method507();
    }

    private static int method1457(int n2, int n3, Class35 class35, Class326 class326) {
        return Class3593.method17854(n2, n3, class35, class326);
    }

    public static Class248 method1458(Class285 class285) {
        return class285.field451;
    }

    private static Object method1459(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method1460(Class285 class285) {
        return class285.field451;
    }

    private static Object method1461(Class248 class248) {
        return class248.method507();
    }

    private static int method1462(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static Object method1463(Class248 class248) {
        return class248.method507();
    }

    private static void method1464() {
        Class1745.method15538();
    }

    public static Class248 method1465(Class285 class285) {
        return class285.field451;
    }

    private static Object method1466(Class248 class248) {
        return class248.method507();
    }

    private static void method1467(class_4587 class_45872, double d2, double d3, double d4, double d5, int n2) {
        Class6454.method24667(class_45872, d2, d3, d4, d5, n2);
    }

    private static Object method1468(Class248 class248) {
        return class248.method507();
    }

    private static Object method1469(Class248 class248) {
        return class248.method507();
    }

    private Boolean method1269() {
        return (Boolean)this.field453.method507();
    }

    public static class_746 method1470(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public Class285() {
        super("Crosshair", "Custom crosshairs", Class556.field2759);
        this.field451 = this.method450(new Class252("Thickness", "The crosshair thickness", Float.valueOf(0.1f), Float.valueOf(0.5f), Float.valueOf(2.0f)));
        this.field455 = this.method450(new Class252("Gap", "The gap between the lines", (int)field449[0], (int)field449[2], (int)field449[3]));
        this.field447 = this.method450(new Class253("Dynamic", "Indicates when the player is moving", (boolean)field449[0]));
        this.field453 = this.method450(new Class253("Outline", "Outlines the crosshair", (boolean)field449[1]));
        this.field448 = this.method450(new Class252("OutlineThickness", "The width of the outline", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(0.3f), (Number)Float.valueOf(0.5f), this::method1269));
        this.field456 = this.method450(new Class252("Opacity", "The crosshair opacity", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(1.0f)));
        this.field454 = this.method450(new Class251("Color", "The crosshair color", Color.WHITE));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Class1
    public void method1471(Class161 a) {
        block9: {
            block10: {
                a.method10();
                if (!Class285.field290.field_1690.method_31044().method_31034() || Class285.field290.field_1761.method_2920() == class_1934.field_9219) {
                    return;
                }
                b = a.method321();
                c = (float)b.method_51421() / 2.0f - Class1393.field5372;
                d = (float)b.method_51443() / 2.0f - 0.5f;
                e = ((Float)this.field452.method507()).floatValue() * 10.0f / 2.0f;
                f = ((Float)Class285.method1450(this).method507()).floatValue();
                g = f * 2.0f;
                h = f * 3.0f;
                if (Class1807.method15753() || Class285.method1470(Class285.field290).method_5715()) ** GOTO lbl-1000
                if (Class285.field290.field_1724.method_6101()) break block10;
                v0 = 44618;
                ** GOTO lbl20
            }
            v0 = 44619;
            if (true) ** GOTO lbl20
            block4: while (true) {
                v0 = 44617;
lbl20:
                // 3 sources

                switch (v0) {
                    case 44619: {
                        continue block4;
                    }
                    case 44618: {
                        if (Class285.method1455(Class285.field290).method_24828()) break block4;
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        v1 = (int)Class285.field449[1];
                        break block9;
                    }
                }
                break;
            }
            v1 = (int)Class285.field449[0];
        }
        i = v1;
        j = ((Integer)this.field455.method507()).intValue();
        if (((Boolean)Class285.method1469(this.field447)).booleanValue()) {
            this.field450.method24284(i);
            j += Class4197.field9802 * this.field450.method24281();
        }
        if (((Boolean)this.field453.method507()).booleanValue()) {
            Class6454.method24667(b.method_51448(), (double)(c - e) - j - (double)g, d - ((Float)Class285.method1460(this).method507()).floatValue() - f, e + h, ((Float)Class285.method1456(this.field451)).floatValue() * 2.0f + g, Class4045.method20100(Color.BLACK.getRGB(), ((Float)this.field456.method507()).floatValue()));
            Class6454.method24667(b.method_51448(), (double)c + j - (double)g, d - ((Float)Class285.method1453(this).method507()).floatValue() - f, e + h, ((Float)this.field451.method507()).floatValue() * 2.0f + g, Class285.method1472(Color.BLACK.getRGB(), ((Float)this.field456.method507()).floatValue()));
        }
        if (((Boolean)this.field453.method507()).booleanValue()) {
            Class6454.method24667(b.method_51448(), c - ((Float)Class285.method1451(this).method507()).floatValue() - f, (double)(d - e) - j - (double)f, ((Float)this.field451.method507()).floatValue() * 2.0f + g, e + h, Class4045.method20100(Color.BLACK.getRGB(), ((Float)this.field456.method507()).floatValue()));
            Class6454.method24667(b.method_51448(), c - ((Float)Class285.method1461(this.field451)).floatValue() - f, (double)d + j - (double)f, ((Float)this.field451.method507()).floatValue() * 2.0f + g, e + h, Class4045.method20100(Color.BLACK.getRGB(), ((Float)this.field456.method507()).floatValue()));
        }
        Class285.method1467(b.method_51448(), (double)(c - e) - j, d - ((Float)this.field451.method507()).floatValue(), e, ((Float)this.field451.method507()).floatValue() * 2.0f, Class4045.method20100(((Color)Class285.method1463(this.field454)).getRGB(), ((Float)this.field456.method507()).floatValue()));
        Class6454.method24667(b.method_51448(), (double)c + j, d - ((Float)this.field451.method507()).floatValue(), e, ((Float)this.field451.method507()).floatValue() * 2.0f, Class285.method1452(((Color)Class285.method1466(this.field454)).getRGB(), ((Float)this.field456.method507()).floatValue()));
        Class6454.method24667(b.method_51448(), c - ((Float)Class285.method1473(this.field451)).floatValue(), (double)(d - e) - j, ((Float)Class285.method1468(Class285.method1458(this))).floatValue() * 2.0f, e, Class285.method1462(((Color)Class285.method1449(this.field454)).getRGB(), ((Float)this.field456.method507()).floatValue()));
        Class6454.method24667(b.method_51448(), c - ((Float)this.field451.method507()).floatValue(), (double)d + j, ((Float)this.field451.method507()).floatValue() * 2.0f, e, Class4045.method20100(((Color)Class285.method1459(this.field454)).getRGB(), ((Float)this.field456.method507()).floatValue()));
    }

    private static int method1472(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static Object method1473(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method1474(Class285 class285) {
        return class285.field451;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

