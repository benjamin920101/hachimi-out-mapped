/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1667
 *  net.minecraft.class_1683
 *  net.minecraft.class_1684
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_638
 */
package mapped;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class298;
import mapped.Class376;
import mapped.Class3979;
import mapped.Class4196;
import mapped.Class4218;
import mapped.Class447;
import mapped.Class457;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6023;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class658;
import mapped.Class78;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1667;
import net.minecraft.class_1683;
import net.minecraft.class_1684;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_638;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class405
extends Class278 {
    Class248 field1483;
    private final Map field1484 = new ConcurrentHashMap();
    private static long[] field1485 = new long[4];
    Class248 field1486;
    Class248 field1487;
    Class248 field1488;
    Class248 field1489;
    Class248 field1490;
    Class248 field1491;
    Class248 field1492;
    Class248 field1493 = this.method450(new Class253("Infinite", "Renders breadcrumbs for all positions since toggle", (boolean)field1485[3]));

    @Class1
    public void method6338(Class59 h2) {
        h2.method125().method_22903();
        Class6009.method23560();
        RenderSystem.lineWidth((float)((Float)this.field1489.method507()).floatValue());
        Class6009.field11998.method20891(h2.method125());
        Iterator iterator = Class405.method6374(this).entrySet().iterator();
        if (iterator.hasNext()) {
            Map.Entry g2 = iterator.next();
            List f2 = (List)g2.getValue();
            for (int e2 = (int)field1485[1]; e2 < f2.size(); ++e2) {
                Class658 d2 = (Class658)f2.get(e2);
                if (!((Boolean)this.field1493.method507()).booleanValue()) {
                    float a2 = 1.0f - class_3532.method_15363((float)((float)(System.currentTimeMillis() - d2.method11474()) / (float)((Integer)Class405.method6348(this.field1487)).intValue()), (float)0.0f, (float)1.0f);
                    Class6009.field11998.method20881(Class405.method6370(Class457.method10620(), (int)(a2 * 255.0f)));
                } else {
                    Class405.method6360().method20881(Class457.method10620().method10621());
                }
                if (e2 <= (int)field1485[3]) continue;
                class_243 b2 = ((Class658)f2.get(e2 - (int)field1485[3])).method11473();
                class_243 c2 = d2.method11473();
                Class405.method6341(Class405.method6371(), b2.field_1352, b2.field_1351, Class405.method6359(b2), c2.field_1352, c2.field_1351, c2.field_1350);
            }
            Class405.method6364(0.9429272f, 0.07293111f);
            return;
        }
        Class6009.field11998.method20865();
        Class6009.method23561();
        Class405.method6340(h2).method_22909();
    }

    @Class1
    public void method6339(Class210 f2) {
        for (class_1297 class_12972 : Class405.method6356(field290).method_18112()) {
            if (!this.method6361(class_12972)) continue;
            class_243 b2 = Class6023.method23740(class_12972, field290.method_60646().method_60637((boolean)field1485[3]));
            if (this.field1484.containsKey(class_12972.method_5628())) {
                ((List)Class405.method6355(this).get(class_12972.method_5628())).add(new Class658(b2, System.currentTimeMillis()));
                continue;
            }
            CopyOnWriteArrayList<Class658> a2 = new CopyOnWriteArrayList<Class658>();
            a2.add(new Class658(b2, System.currentTimeMillis()));
            this.field1484.put(class_12972.method_5628(), a2);
        }
        if (!((Boolean)this.field1493.method507()).booleanValue()) {
            for (Map.Entry entry : this.field1484.entrySet()) {
                for (Class658 d2 : (List)entry.getValue()) {
                    if (!((float)(System.currentTimeMillis() - d2.method11474()) > ((Float)this.field1488.method507()).floatValue() * 1000.0f)) continue;
                    ((List)this.field1484.get(entry.getKey())).remove(d2);
                }
            }
        }
    }

    private static class_4587 method6340(Class59 class59) {
        return class59.method125();
    }

    private static Class4218 method6341(Class4218 class4218, double d2, double d3, double d4, double d5, double d6, double d7) {
        return class4218.method20883(d2, d3, d4, d5, d6, d7);
    }

    private static void method6342(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method6343() {
        Class6454.method24594();
    }

    public static Map method6344(Class405 class405) {
        return class405.field1484;
    }

    private static void method6345() {
        Class298.method1924();
    }

    @Class1
    public void method6346(Class78 a2) {
        if (((Boolean)Class405.method6367(this).method507()).booleanValue()) {
            Class405.method6357(this).remove(a2.method159().method_5628());
        }
    }

    private static boolean method6347() {
        return Class447.method10322();
    }

    private static Object method6348(Class248 class248) {
        return class248.method507();
    }

    private static void method6349() {
        Class6009.method23560();
    }

    private static void method6350(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class248 method6351(Class405 class405) {
        return class405.field1483;
    }

    private static void method6352() {
        Class1503.method14420();
    }

    private static boolean method6353() {
        return Class3979.method19543();
    }

    public static Class248 method6354(Class405 class405) {
        return class405.field1492;
    }

    private static Map method6355(Class405 class405) {
        return Class405.method6344(class405);
    }

    public static class_638 method6356(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public static Map method6357(Class405 class405) {
        return class405.field1484;
    }

    private static void method6358(long l2) {
        Class405.field1485[0] = l2 ^ 0x9B9FB0ED6E5B75D0L;
        Class405.field1485[1] = l2 ^ 0x9B9FB0ED6E5B6658L;
        Class405.field1485[3] = l2 ^ 0x9B9FB0ED6E5B6659L;
        Class405.field1485[2] = l2 ^ 0x9B9FB0ED6E5B65B0L;
    }

    public static double method6359(class_243 class_2432) {
        return class_2432.field_1350;
    }

    public static Class4218 method6360() {
        return Class6009.field11998;
    }

    /*
     * Unable to fully structure code
     */
    public boolean method6361(class_1297 a) {
        block2: {
            block3: {
                if (a instanceof class_1657) {
                    return (boolean)(((Boolean)Class405.method6351(this).method507()).booleanValue() || a == Class405.field290.field_1724 && ((Boolean)Class405.method6362(this.field1491)).booleanValue() ? (int)Class405.field1485[3] : (int)Class405.field1485[1]);
                }
                if (!(a instanceof class_1684)) break block2;
                if (((Boolean)Class405.method6366(this).method507()).booleanValue()) break block3;
                v0 = 49865;
                ** GOTO lbl12
            }
            v0 = 49866;
            if (true) ** GOTO lbl12
            do {
                v0 = var2_2 = 49864;
lbl12:
                // 3 sources

                if (var2_2 == 49865) break block2;
            } while (var2_2 == 49866);
            return Class376.method4987();
        }
        return (boolean)(a instanceof class_1667 != false && (Boolean)Class405.method6363(this).method507() != false || a instanceof class_1683 != false && (Boolean)this.field1490.method507() != false ? (int)Class405.field1485[3] : (int)Class405.field1485[1]);
    }

    private static Object method6362(Class248 class248) {
        return class248.method507();
    }

    public Class405() {
        super("Breadcrumbs", "Renders a line connecting all previous positions", Class556.field2759);
        this.field1488 = this.method450(new Class252("MaxPosition", "The maximum time for a given position", Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(100.0f)));
        this.field1487 = this.method450(new Class252("Fade-Time", "Timer for the fade", (int)field1485[1], (int)field1485[2], (int)field1485[0]));
        this.field1489 = this.method450(new Class252("Width", "The line width of the path", Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(5.0f)));
        this.field1491 = this.method450(new Class253("Self", "Renders breadcrumbs on player", (boolean)field1485[3]));
        this.field1483 = this.method450(new Class253("Players", "Renders breadcrumbs on other players", (boolean)field1485[1]));
        this.field1486 = this.method450(new Class253("Pearls", "Renders breadcrumbs on thrown pearls", (boolean)field1485[1]));
        this.field1492 = this.method450(new Class253("Arrows", "Renders breadcrumbs on arrows", (boolean)field1485[1]));
        this.field1490 = this.method450(new Class253("XPBottles", "Renders breadcrumbs on thrown experience bottles", (boolean)field1485[1]));
    }

    static {
        Class405.method6358(-7232867942728505768L);
    }

    private static Class248 method6363(Class405 class405) {
        return Class405.method6354(class405);
    }

    @Override
    public void method1279() {
        this.field1484.clear();
    }

    private static void method6364(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method6365(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method6366(Class405 class405) {
        return class405.field1486;
    }

    public static Class248 method6367(Class405 class405) {
        return class405.field1493;
    }

    private static boolean method6368() {
        return Class4196.method20801();
    }

    private static void method6369(float f2) {
        Class5836.method22907(f2);
    }

    private static int method6370(Class457 class457, int n2) {
        return class457.method10615(n2);
    }

    private static Class4218 method6371() {
        return Class405.method6373();
    }

    private static void method6372() {
        Class5836.method22897();
    }

    public static Class4218 method6373() {
        return Class6009.field11998;
    }

    public static Map method6374(Class405 class405) {
        return class405.field1484;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

