/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_239
 *  net.minecraft.class_2596
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2879
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_4587
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 */
package mapped;

import mapped.Class1;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class298;
import mapped.Class34;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class455;
import mapped.Class457;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class619;
import mapped.Class63;
import mapped.Class6454;
import net.hachimi.client.mixin.bh;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2879;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_636;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class379
extends Class278 {
    private int field1264;
    private static long[] field1265 = new long[4];
    Class248 field1266;
    Class248 field1267 = this.method450(new Class253("Click", "Allow manual air place", (boolean)field1265[1]));
    private static Class379 INSTANCE;
    Class248 field1268;

    public static class_746 method5022(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_1268 method5023() {
        return class_1268.field_5808;
    }

    private static void method5024() {
        Class5836.method22897();
    }

    @Class1
    public void method5025(Class34 a2) {
        if (this.field1264 > 0 && ((Boolean)Class379.method5042(this).method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static void method5026() {
        Class4146.method20694();
    }

    private static void method5027() {
        Class6009.method23560();
    }

    private static void method5028() {
        Class3979.method19561();
    }

    public static Class5496 method5029() {
        return Class5723.field11048;
    }

    private static Object method5030(Class248 class248) {
        return class248.method507();
    }

    private static void method5031(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_239 method5032(class_310 class_3102) {
        return class_3102.field_1765;
    }

    public static Class5496 method5033() {
        return Class5723.field11048;
    }

    public static void method5034(Class379 class379, int n2) {
        class379.field1264 = n2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Class1
    public void method5035(Class59 c2) {
        void f2;
        class_3965 a2;
        if (Class379.field290.field_1724 == null) return;
        if ((Boolean)this.field1267.method507() == false) return;
        class_239 class_2392 = Class379.method5032(field290);
        if (class_2392 instanceof class_3965 && !Class379.field290.field_1687.method_22347((a2 = (class_3965)class_2392).method_17777())) {
            return;
        }
        class_1799 d2 = Class5723.field11058.method18908();
        if (!d2.method_7960()) {
            int n2 = 60547;
            Class1503.method14420();
            return;
        }
        int n3 = 60548;
        int n4 = n3;
        if (n4 != 60547) {
            if (n4 == 60548) return;
            return;
        }
        if (!(d2.method_7909() instanceof class_1747)) {
            return;
        }
        class_239 e2 = Class379.method5022(field290).method_5745((double)((Float)this.field1266.method507()).floatValue(), 1.0f, ((Boolean)Class379.method5044(this).method507()).booleanValue());
        if (!(e2 instanceof class_3965)) return;
        class_3965 b2 = (class_3965)e2;
        class_2338 g2 = class_2338.method_49638((class_2374)f2.method_17784());
        if (!Class379.field290.field_1687.method_22347(g2)) return;
        if (this.method5050(g2)) {
            return;
        }
        Class379.method5027();
        Class379.method5054(c2.method125(), g2, 1.5f, Class457.method10620().method10615((int)field1265[3]));
        Class6009.method23561();
    }

    public Class379() {
        super("AirPlace", "Allows you to place blocks in the air", Class556.field2754);
        this.field1266 = this.method450(new Class252("Range", "The range to air place", (Number)Float.valueOf(1.0f), (Number)Float.valueOf(4.0f), (Number)Float.valueOf(6.0f), Class619.field3013));
        this.field1268 = this.method450(new Class253("Fluids", "Place against fluids", (boolean)field1265[0]));
        INSTANCE = this;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method5036(Class63 d) {
        block13: {
            block14: {
                if (this.field1264 > 0) {
                    this.field1264 -= (int)Class379.field1265[1];
                }
                if (Class379.field290.field_1724 == null || Class379.field290.field_1761 == null || !((Boolean)this.field1267.method507()).booleanValue() || d.method128() != Class543.field2690) {
                    return;
                }
                var2_2 = Class379.field290.field_1765;
                if (var2_2 instanceof class_3965 && !Class379.field290.field_1687.method_22347((a = (class_3965)var2_2).method_17777())) {
                    return;
                }
                e = Class5723.field11058.method18908();
                if (e.method_7960() || !(e.method_7909() instanceof class_1747)) ** GOTO lbl-1000
                if (Class379.field290.field_1690.field_1904.method_1434()) break block13;
                if (Class379.field290.field_1690.field_1904.method_1436()) break block14;
                v0 = 7552;
                ** GOTO lbl19
            }
            v0 = 7553;
            if (true) ** GOTO lbl19
            block4: while (true) {
                v0 = 7551;
lbl19:
                // 3 sources

                switch (v0) {
                    case 7553: {
                        continue block4;
                    }
                    case 7552: lbl-1000:
                    // 2 sources

                    {
                        this.field1264 = (int)Class379.field1265[0];
                        return;
                    }
                }
                break;
            }
        }
        f = Class379.field290.field_1724.method_5745((double)((Float)Class379.method5030(this.field1266)).floatValue(), 1.0f, ((Boolean)this.field1268.method507()).booleanValue());
        if (Class379.method5055(this) == 0 && !Class379.method5041(Class379.field290).method_6115()) {
            if (f instanceof class_3965) {
                c = (class_3965)f;
                b = class_2338.method_49638((class_2374)c.method_17784());
                if (!Class379.field290.field_1687.method_22347(b) || this.method5050(b)) {
                    return;
                }
                ((bh)Class379.field290).hookSetItemUseCooldown((int)Class379.field1265[2]);
                this.field1264 = (int)Class379.field1265[2];
                if (Class379.method5048(Class455.method10581()).booleanValue()) {
                    Class379.method5033().method21341((class_2596)new class_2846(class_2846.class_2847.field_12969, Class379.method5040(), class_2350.field_11033));
                    Class379.method5049(Class379.field290).method_2896(Class379.method5047(Class379.field290), class_1268.field_5810, c);
                    Class379.field290.field_1724.method_23667(class_1268.field_5810, (boolean)Class379.field1265[0]);
                    Class379.method5029().method21341((class_2596)new class_2879(class_1268.field_5810));
                    Class5723.field11048.method21341((class_2596)new class_2846(class_2846.class_2847.field_12969, class_2338.field_10980, class_2350.field_11033));
                } else {
                    Class379.field290.field_1761.method_2896(Class379.field290.field_1724, class_1268.field_5808, c);
                    Class379.field290.field_1724.method_6104(Class379.method5023());
                }
            }
        }
    }

    private static void method5037(long l2) {
        Class379.field1265[0] = l2 ^ 0x8EA438C2BD6F6079L;
        Class379.field1265[3] = l2 ^ 0x8EA438C2BD6F60E8L;
        Class379.field1265[1] = l2 ^ 0x8EA438C2BD6F6078L;
        Class379.field1265[2] = l2 ^ 0x8EA438C2BD6F607DL;
    }

    @Override
    public void method1274() {
        Class379.method5034(this, (int)field1265[0]);
    }

    public static Class379 method5038() {
        return INSTANCE;
    }

    private static void method5039() {
        Class5836.method22890();
    }

    public static class_2338 method5040() {
        return class_2338.field_10980;
    }

    static {
        Class379.method5037(-8168341415090233223L);
    }

    public static class_746 method5041(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Class248 method5042(Class379 class379) {
        return Class379.method5043(class379);
    }

    public static Class248 method5043(Class379 class379) {
        return class379.field1267;
    }

    public static Class248 method5044(Class379 class379) {
        return class379.field1268;
    }

    private static void method5045(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5046() {
        Class298.method1924();
    }

    public static class_746 method5047(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Boolean method5048(Class455 class455) {
        return class455.method10598();
    }

    public static class_636 method5049(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private boolean method5050(class_2338 b2) {
        for (class_1297 a2 : Class379.field290.field_1687.method_18112()) {
            if (!a2.method_5829().method_994(new class_238(b2))) continue;
            return (int)field1265[1] != 0;
        }
        return (int)field1265[0] != 0;
    }

    private static void method5051() {
        Class1745.method15538();
    }

    private static void method5052() {
        Class5659.method22184();
    }

    private static void method5053(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5054(class_4587 class_45872, class_2338 class_23382, float f2, int n2) {
        Class6454.method24642(class_45872, class_23382, f2, n2);
    }

    public static int method5055(Class379 class379) {
        return class379.field1264;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

