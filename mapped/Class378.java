/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package mapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class248;
import mapped.Class252;
import mapped.Class278;
import mapped.Class298;
import mapped.Class4036;
import mapped.Class457;
import mapped.Class469;
import mapped.Class543;
import mapped.Class556;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6190;
import mapped.Class63;
import mapped.Class6332;
import mapped.Class6454;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class378
extends Class278 {
    private static final HashMap field1259;
    private static long[] field1260;
    private static final HashMap field1261;
    Class248 field1262 = this.method450(new Class252("v", "", (int)field1260[1], (int)field1260[0], (int)field1260[2]));
    private static final HashMap field1263;

    public static HashMap method5004() {
        return field1259;
    }

    static {
        field1260 = new long[4];
        Class378.method5009(6630429727677193158L);
        field1263 = new HashMap();
        field1259 = new HashMap();
        field1261 = new HashMap();
    }

    @Class1
    public void method5005(Class63 f2) {
        if (f2.method128() == Class543.field2691) {
            Iterator iterator = Class378.field290.field_1687.method_18456().iterator();
            if (iterator.hasNext()) {
                class_1657 e2 = (class_1657)iterator.next();
                List a2 = Class378.method5017().getOrDefault(e2, new ArrayList());
                a2.clear();
                field1261.put(e2, a2);
                class_243 b2 = Class469.method10724((class_1297)e2, (Integer)this.field1262.method507(), a2);
                class_243 c2 = e2.method_19538().method_1019(b2);
                class_243 d2 = field1259.getOrDefault(e2, c2);
                field1259.put(e2, e2.method_19538().method_1019(b2));
                Class378.method5007().put(e2, d2);
                while (true) {
                    // Infinite loop
                }
            }
        }
    }

    private static void method5006() {
        Class6009.method23560();
    }

    public static HashMap method5007() {
        return field1263;
    }

    public Class378() {
        super("PredictPath", "", Class556.field2759);
    }

    private static void method5008(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5009(long l2) {
        Class378.method5011(l2);
    }

    private static void method5010(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method5011(long l2) {
        Class378.field1260[1] = l2 ^ 0x5C0404B532639BC6L;
        Class378.field1260[0] = l2 ^ 0x5C0404B532639BC2L;
        Class378.field1260[2] = l2 ^ 0x5C0404B532639BCCL;
        Class378.field1260[3] = l2 ^ 0x5C0404B532639BA2L;
    }

    @Class1
    public void method5012(Class59 i2) {
        Class378.method5006();
        for (class_1657 h2 : Class378.field290.field_1687.method_18456()) {
            class_243 b2 = (class_243)Class378.method5015().get(h2);
            class_243 c2 = (class_243)field1263.get(h2);
            if (b2 == null) continue;
            if (c2 == null) {
                Class6009.method23559(false);
                return;
            }
            float d2 = i2.method124();
            class_243 e2 = new class_243(h2.field_6014 + (h2.method_23317() - h2.field_6014) * (double)d2, h2.field_6036 + (h2.method_23318() - h2.field_6036) * (double)d2, h2.field_5969 + (h2.method_23321() - h2.field_5969) * (double)d2);
            class_243 f2 = new class_243(c2.method_10216() + (b2.method_10216() - c2.method_10216()) * (double)d2, c2.method_10214() + (b2.method_10214() - c2.method_10214()) * (double)d2, c2.method_10215() + (b2.method_10215() - c2.method_10215()) * (double)d2);
            Class6454.method24621(i2.method125(), new class_238(f2.method_10216() - 0.1, f2.method_10214() + Class6190.field12575, f2.method_10215() - 0.1, f2.method_10216() + 0.1, f2.method_10214(), f2.method_10215() + 0.1), Class457.method10620().method10615((int)field1260[3]));
            class_243 g2 = e2;
            for (class_243 a2 : (List)field1261.get(h2)) {
                Class6454.method24682(i2.method125(), g2, a2, Class6332.field13040, Color.red.getRGB());
                g2 = a2;
            }
        }
        Class6009.method23561();
    }

    private static void method5013(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method5014(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static HashMap method5015() {
        return Class378.method5004();
    }

    @Override
    protected void method1279() {
        field1263.clear();
        field1259.clear();
        Class378.method5018().clear();
    }

    public static HashMap method5016() {
        return field1261;
    }

    public static HashMap method5017() {
        return field1261;
    }

    private static HashMap method5018() {
        return Class378.method5016();
    }

    private static void method5019() {
        Class1503.method14420();
    }

    private static void method5020() {
        Class298.method1924();
    }

    private static void method5021() {
        Class6009.method23561();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

