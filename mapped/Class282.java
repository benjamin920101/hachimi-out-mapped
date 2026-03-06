/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.MovementType
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class204;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class280;
import mapped.Class298;
import mapped.Class352;
import mapped.Class3560;
import mapped.Class3979;
import mapped.Class4028;
import mapped.Class520;
import mapped.Class556;
import mapped.Class5808;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class954;
import net.hachimi.client.mixin.bc;
import net.hachimi.client.mixin.j;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.MovementType;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class282
extends Class278 {
    Class248 field431 = this.method450(new Class253("AirStatic", "Static when you are not moving", (boolean)field435[0]));
    Class248 field432;
    Class248 field433;
    Class248 field434 = this.method450(new Class253("Air", "Removes acceleration while in the air", (boolean)field435[0]));
    private static long[] field435 = new long[2];
    Class248 field436;
    double field437;
    Class248 field438;
    Class248 field439;
    Class248 field440;
    Class248 field441;

    private static void method1403() {
        Class1503.method14420();
    }

    private static void method1404(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static float method1405(class_241 class_2412) {
        return class_2412.field_1343;
    }

    private static void method1406() {
        Class298.method1924();
    }

    private static void method1407() {
        Class298.method1924();
    }

    public static class_746 method1408(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method1409() {
        Class6454.method24594();
    }

    public static class_746 method1410(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method1411(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class352 method1412() {
        return Class352.method4109();
    }

    private static void method1413() {
        Class6009.method23561();
    }

    public static double method1414(class_243 class_2432) {
        return class_2432.field_1351;
    }

    private static void method1415() {
        Class5836.method22890();
    }

    private static void method1416(Class204 class204, double d2) {
        class204.method386(d2);
    }

    private static void method1417() {
        Class5836.method22885();
    }

    private static void method1418(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method1419() {
        Class298.method1924();
    }

    private static void method1420(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method1421(float f2) {
        Class5836.method22907(f2);
    }

    static {
        Class282.method1424(-6481786793092716587L);
    }

    private static void method1422() {
        Class1807.method15744();
    }

    @Class1
    public void method1423(Class210 a2) {
        class_243 b2 = Class282.field290.field_1724.method_18798();
        this.field437 = Math.sqrt(b2.method_10216() * b2.method_10216() + b2.method_10215() * b2.method_10215());
    }

    private static void method1424(long l2) {
        Class282.field435[0] = l2 ^ 0xA60C1140EFE3E7D4L;
        Class282.field435[1] = l2 ^ 0xA60C1140EFE3E7D5L;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method1425(Class204 d) {
        block20: {
            block21: {
                block19: {
                    block15: {
                        block18: {
                            block14: {
                                block16: {
                                    block17: {
                                        if (Class352.method4109().method1265()) break block16;
                                        if (Class280.method1355().method1265()) break block16;
                                        if (d.method384() == class_1313.field_6308) break block17;
                                        v0 = 11515;
                                        ** GOTO lbl11
                                    }
                                    v0 = 11516;
                                    if (true) ** GOTO lbl11
                                    while (true) {
                                        v0 = var2_2 = 11514;
lbl11:
                                        // 3 sources

                                        if (var2_2 == 11515) break;
                                        if (var2_2 == 11516) {
                                            continue;
                                        }
                                        break block14;
                                        break;
                                    }
                                }
                                return;
                            }
                            if (Class1807.method15742()) break block18;
                            v1 = 21309;
                            ** GOTO lbl26
                        }
                        v1 = 21310;
                        if (true) ** GOTO lbl26
                        do {
                            v1 = var3_3 = 21308;
lbl26:
                            // 3 sources

                            if (var3_3 == 21309) break block15;
                        } while (var3_3 == 21310);
                        break block19;
                    }
                    if (((Boolean)this.field431.method507()).booleanValue()) {
                        d.method10();
                        Class282.method1416(d, 0.0);
                        d.method389(0.0);
                    }
                    return;
                }
                if (!Class282.method1408(Class282.field290).method_24828() && !((Boolean)this.field434.method507()).booleanValue() || Class282.method1414(Class282.field290.field_1724.method_18798()) < 0.0 && !((Boolean)this.field433.method507()).booleanValue()) {
                    return;
                }
                e = 1.0;
                f = 1.0;
                if (!((Boolean)this.field438.method507()).booleanValue()) break block20;
                if (!Class282.method1430(Class282.field290).method_6059(class_1294.field_5904)) break block21;
                v2 = 27537;
                if (true) ** GOTO lbl50
            }
            v3 = 27538;
            Class1503.method14417(0.16674906f, 0.4601056f);
            return;
            block6: while (true) {
                v2 = 27536;
lbl50:
                // 2 sources

                switch (v2) {
                    case 27538: {
                        continue block6;
                    }
                    case 27537: {
                        a = Class282.field290.field_1724.method_6112(class_1294.field_5904).method_5578();
                        e = 1.0 + Class3560.field7903 * (a + 1.0);
                    }
                }
                break;
            }
        }
        if (((Boolean)Class282.method1429(this).method507()).booleanValue()) {
            if (Class282.method1411(Class282.field290).method_6059(class_1294.field_5909)) {
                b = Class282.field290.field_1724.method_6112(class_1294.field_5909).method_5578();
                f = 1.0 + 0.2 * (b + 1.0);
            }
        }
        g = 0.2872999906539917 * e / f;
        if (((Boolean)this.field440.method507()).booleanValue()) {
            c = Math.sqrt(d.method383() * d.method383() + d.method390() * d.method390());
            g = Math.max(g, c);
        }
        if (((Boolean)Class282.method1435(this).method507()).booleanValue()) {
            g = Math.max(g, this.field437);
        }
        h = Class352.method4109().method3980((float)g);
        d.method10();
        d.method386(h.field_1343);
        d.method389(h.field_1342);
    }

    private static void method1426() {
        Class6009.method23561();
    }

    private static int method1427(int n2, int n3, Class4028 class4028, Class520 class520) {
        return Class5808.method22763(n2, n3, class4028, class520);
    }

    public static class_746 method1428(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method1429(Class282 class282) {
        return class282.field432;
    }

    public Class282() {
        super("Strafe", "Removes sprint acceleration", Class556.field2752);
        this.field433 = this.method450(new Class253("Downwards", "Removes acceleration while descending", (boolean)field435[0]));
        this.field438 = this.method450(new Class253("Speed", "Apply speed effect", (boolean)field435[0]));
        this.field432 = this.method450(new Class253("Slow", "Apply slow effect", (boolean)field435[0]));
        this.field440 = this.method450(new Class253("MotionSync", "Apply motion", (boolean)field435[0]));
        this.field436 = this.method450(new Class253("VelocitySync", "Apply velocity", (boolean)field435[0]));
        this.field439 = this.method450(new Class253("VelocityBoost", "Velocity Boost", (boolean)field435[1]));
        this.field441 = this.method450(new Class252("Amplifier", "Amplifier for velocity", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(5.0f), this.field439::method507));
    }

    private static class_746 method1430(class_310 class_3102) {
        return Class282.method1410(class_3102);
    }

    private static void method1431() {
        Class5836.method22885();
    }

    private static Object method1432(Class248 class248) {
        return class248.method507();
    }

    private static void method1433(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method1434() {
        Class3979.method19561();
    }

    public static Class248 method1435(Class282 class282) {
        return class282.field436;
    }

    @Class1
    public void method1436(Class133 i2) {
        if (Class282.field290.field_1724 == null || Class282.field290.field_1687 == null) {
            return;
        }
        if (((Boolean)this.field439.method507()).booleanValue()) {
            class_2596 class_25962 = i2.method251();
            if (class_25962 instanceof class_2743) {
                class_2743 d2 = (class_2743)class_25962;
                if (d2.method_11818() != Class282.method1428(field290).method_5628()) {
                    return;
                }
                double a2 = Math.sqrt(d2.method_11815() * d2.method_11815() + d2.method_11819() * d2.method_11819());
                class_241 b2 = Class282.method1412().method3980((float)a2);
                bc c2 = (bc)d2;
                c2.setVelocityX((int)((double)(Class282.method1405(b2) * ((Float)this.field441.method507()).floatValue()) * 8000.0));
                c2.setVelocityZ((int)((double)(b2.field_1342 * ((Float)this.field441.method507()).floatValue()) * Class954.field3994));
            } else {
                class_25962 = i2.method251();
                if (class_25962 instanceof class_2664) {
                    class_2664 h2 = (class_2664)class_25962;
                    double e2 = Math.sqrt(h2.method_11472() * h2.method_11472() + h2.method_11474() * h2.method_11474());
                    class_241 f2 = Class352.method4109().method3980((float)e2);
                    j g2 = (j)h2;
                    g2.setPlayerVelocityX(f2.field_1343 * ((Float)this.field441.method507()).floatValue());
                    g2.setPlayerVelocityZ(f2.field_1342 * ((Float)Class282.method1432(this.field441)).floatValue());
                }
            }
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

