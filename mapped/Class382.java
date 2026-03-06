/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.DrawContext
 */
package mapped;

import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1281;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class233;
import mapped.Class248;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class308;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4196;
import mapped.Class447;
import mapped.Class489;
import mapped.Class5540;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class5876;
import mapped.Class5965;
import mapped.Class6009;
import mapped.Class616;
import mapped.Class6252;
import mapped.Class6322;
import mapped.Class6454;
import net.minecraft.client.gui.DrawContext;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class382
extends Class278 {
    double field1283 = 300.0;
    double field1284;
    private final List field1285 = new CopyOnWriteArrayList();
    double field1286 = 200.0;
    Class248 field1287 = this.method450(new Class260("Type", "Notify type", Class616.field3000, Class616.values()));
    Class489 field1288;
    public static Class382 INSTANCE;
    private static long[] field1289;

    private static void method5101() {
        Class6009.method23560();
    }

    public static void method5102(Class5876 class5876, double d2) {
        class5876.field11611 = d2;
    }

    public void method5103(String b2, int c2) {
        if (this.method1265() && Class382.method5110(this).method507() != Class616.field2999) {
            if (c2 != 0) {
                for (Class5876 a2 : this.field1285) {
                    if (Class382.method5117(a2) != c2) continue;
                    a2.field11612 = (int)field1289[2];
                }
            }
            Class382.method5104(this).add(new Class5876(b2, c2));
        }
    }

    public static List method5104(Class382 class382) {
        return class382.field1285;
    }

    public boolean method5105() {
        return (this.method1265() && this.field1287.method507() != Class616.field3001 ? (int)field1289[2] : (int)field1289[3]) != 0;
    }

    private static void method5106(long l2) {
        Class382.field1289[1] = l2 ^ 0xFC34A74BBF3FDB4AL;
        Class382.field1289[0] = l2 ^ 0xFC34A74BBF3FDBB7L;
        Class382.field1289[2] = l2 ^ 0xFC34A74BBF3FDB49L;
        Class382.field1289[3] = l2 ^ 0xFC34A74BBF3FDB48L;
    }

    private static int method5107(int n2, int n3, Class308 class308, Class5540 class5540) {
        return Class6252.method24127(n2, n3, class308, class5540);
    }

    private static void method5108(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static boolean method5109() {
        return Class447.method10252();
    }

    public static Class248 method5110(Class382 class382) {
        return class382.field1287;
    }

    public static void method5111(Class5876 class5876, boolean bl2) {
        class5876.field11615 = bl2;
    }

    public static double method5112(Class382 class382) {
        return class382.field1283;
    }

    private static void method5113(class_332 class_3322, String string, float f2, float f3, int n2) {
        Class6454.method24624(class_3322, string, f2, f3, n2);
    }

    private static void method5114(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method5115() {
        Class298.method1924();
    }

    public static List method5116(Class382 class382) {
        return class382.field1285;
    }

    public static int method5117(Class5876 class5876) {
        return class5876.field11614;
    }

    public Class382() {
        super("Notification", "Notification", Class556.field2757);
        this.field1284 = Class1281.field4991;
        this.field1288 = Class489.field2533;
        INSTANCE = this;
        this.method1264();
    }

    private static void method5118(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static boolean method5119() {
        return Class3979.method19539();
    }

    private static boolean method5120(Class5876 a2) {
        if (a2.field11611 != 0.0) {
            return Class5836.method22894();
        }
        return (a2.field11615 ? (int)field1289[2] : (int)field1289[3]) != 0;
    }

    private static boolean method5121() {
        return Class5836.method22894();
    }

    @Override
    protected void method1279() {
        Class382.method5116(this).clear();
    }

    static {
        field1289 = new long[4];
        Class382.method5106(-273409733589738680L);
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method5122(Class233 c) {
        d = (int)((float)Class382.field290.method_22683().method_4486() / 2.0f);
        e = Class6454.method24637() + (int)Class382.field1289[1];
        f = ~(e - 1) + (int)Class382.field1289[1];
        this.field1285.removeIf((Predicate<Class5876>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, method5120(mapped.Class5876 ), (Lmapped/Class5876;)Z)());
        for (Class5876 b : this.field1285) {
            block9: {
                block8: {
                    block6: {
                        block7: {
                            if (b.field11613.method12595(this.field1284)) break block7;
                            v0 = 53365;
                            ** GOTO lbl15
                        }
                        v0 = 53366;
                        if (true) ** GOTO lbl15
                        do {
                            v0 = var7_7 = 53364;
lbl15:
                            // 3 sources

                            if (var7_7 == 53365) break block6;
                        } while (var7_7 == 53366);
                        break block8;
                    }
                    if (!b.field11615) {
                        if (!b.field11612) {
                            Class1807.method15744();
                            return;
                        } else {
                            ** GOTO lbl24
                        }
                    }
                    break block9;
                }
                Class382.method5111(b, (boolean)Class382.field1289[2]);
                b.field11613.method12593();
            }
            if (b.field11615) {
                Class382.method5102(b, 1.0 - this.field1288.method10803(Math.min((double)b.field11613.method12592() / this.field1286, 1.0)));
            } else {
                b.field11611 = this.field1288.method10803(Math.min((double)b.field11613.method12592() / Class382.method5112(this), 1.0));
            }
            if (b.field11611 < 0.04) continue;
            a = Class6454.method24719(b.field11616);
            c.method6().method_51448().method_22903();
            c.method6().method_51448().method_46416(0.0f, f += (float)(b.field11611 * (double)e), 0.0f);
            Class382.method5113(c.method6(), b.field11616, (float)d - (float)a / 2.0f, 0.0f, new Color((int)Class382.field1289[0], (int)Class382.field1289[0], (int)Class382.field1289[0], (int)(Class5965.field11862 * b.field11611)).getRGB());
            c.method6().method_51448().method_22909();
        }
    }

    private static void method5123() {
        Class1807.method15744();
    }

    private static void method5124() {
        Class1745.method15538();
    }

    private static void method5125() {
        Class298.method1924();
    }

    private static boolean method5126() {
        return Class4196.method20801();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

