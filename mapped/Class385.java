/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1671
 *  net.minecraft.class_2596
 *  net.minecraft.class_2708
 *  net.minecraft.class_2716
 *  net.minecraft.class_310
 *  net.minecraft.class_6374
 *  net.minecraft.class_638
 */
package mapped;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mapped.Class1;
import mapped.Class117;
import mapped.Class131;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class1665;
import mapped.Class1748;
import mapped.Class1805;
import mapped.Class1807;
import mapped.Class278;
import mapped.Class3555;
import mapped.Class390;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class541;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6396;
import mapped.Class6454;
import mapped.Class84;
import mapped.Class925;
import mapped.Class926;
import net.hachimi.client.mixin.au;
import net.minecraft.class_1297;
import net.minecraft.class_1671;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_2716;
import net.minecraft.class_310;
import net.minecraft.class_6374;
import net.minecraft.class_638;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class385
extends Class278 {
    private static long[] field1308 = new long[3];
    private static Class385 INSTANCE;
    private class_1671 field1309;
    private boolean field1310;
    private final List field1311 = new CopyOnWriteArrayList();
    private final Class925 field1312 = new Class926();

    public static void method5326(Class385 class385, class_1671 class_16712) {
        class385.field1309 = class_16712;
    }

    private static void method5327() {
        Class1807.method15744();
    }

    private static boolean method5328(Class385 class385) {
        return Class385.method5330(class385);
    }

    private static void method5329() {
        Class6454.method24594();
    }

    public static boolean method5330(Class385 class385) {
        return class385.field1310;
    }

    static {
        Class385.method5336(6119346525133812197L);
    }

    public static boolean method5331(Class385 class385) {
        return class385.field1310;
    }

    private static int method5332(int n2, int n3, Class541 class541, Class84 class84) {
        return Class1748.method15688(n2, n3, class541, class84);
    }

    private static void method5333() {
        Class3979.method19561();
    }

    private static boolean method5334(Class385 class385) {
        return Class385.method5331(class385);
    }

    @Class1
    public void method5335(Class133 c2) {
        if (Class385.field290.field_1724 == null || Class385.method5354(field290) == null) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (!(class_25962 instanceof class_2716)) {
            Class1503.method14417(Class6396.field13248, Class3555.field7889);
            return;
        }
        class_2716 b2 = (class_2716)class_25962;
        if (this.field1309 != null) {
            class_25962 = b2.method_36548().iterator();
            while (class_25962.hasNext()) {
                int a2 = (Integer)class_25962.next();
                if (a2 != this.field1309.method_5628()) continue;
                c2.method10();
                this.field1310 = (int)field1308[2];
                this.field1312.method12593();
                return;
            }
        }
        if (c2.method251() instanceof class_2708 && this.field1310) {
            this.field1310 = (int)field1308[0];
            if (this.field1309 != null) {
                ((au)this.field1309).hookExplodeAndRemove();
                this.field1309 = null;
            }
            this.method5337();
        }
    }

    private static void method5336(long l2) {
        Class385.method5343(l2);
    }

    /*
     * Unable to fully structure code
     */
    private void method5337() {
        var1_1 = Class385.method5356(this).iterator();
        while (true) {
            block2: {
                block3: {
                    if (!var1_1.hasNext()) break block3;
                    v0 = 53248;
                    ** GOTO lbl11
                }
                v0 = 53249;
                if (true) ** GOTO lbl11
                do {
                    v0 = var2_2 = 53247;
lbl11:
                    // 3 sources

                    if (var2_2 == 53248) break block2;
                } while (var2_2 == 53249);
                Class5659.method22184();
                return;
            }
            a = (class_6374)var1_1.next();
            Class5723.field11048.method21341((class_2596)a);
        }
    }

    public static Class385 method5338() {
        return INSTANCE;
    }

    public Class385() {
        super("RocketExtend", "Extends firework boost duration", Class556.field2755);
        INSTANCE = this;
    }

    private static void method5339(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5340() {
        Class6009.method23561();
    }

    private static void method5341() {
        Class4146.method20694();
    }

    @Class1
    public void method5342(Class117 a2) {
        if (this.field1309 != null) {
            ((au)this.field1309).hookExplodeAndRemove();
            this.field1309 = null;
        }
        this.field1310 = (int)field1308[0];
        this.field1312.method12593();
    }

    private static void method5343(long l2) {
        Class385.field1308[1] = l2 ^ 0x54EC493E301F9A05L;
        Class385.field1308[0] = l2 ^ 0x54EC493E301F31E5L;
        Class385.field1308[2] = l2 ^ 0x54EC493E301F31E4L;
    }

    public static class_638 method5344(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static int method5345(int n2, int n3, Class3979 class3979, Class1665 class1665) {
        return Class1748.method15676(n2, n3, class3979, class1665);
    }

    private static void method5346() {
        Class4146.method20697();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5347(Class131 b2) {
        int n2;
        if (Class385.field290.field_1724 == null) return;
        if (Class385.field290.field_1687 == null) {
            return;
        }
        int n3 = 34724;
        boolean bl2 = true;
        do {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = n2 = 34722;
            }
            if (n2 != 34723) continue;
            return;
        } while (n2 == 34724);
        class_2596 class_25962 = b2.method251();
        int n4 = class_25962 instanceof class_6374 ? 3821 : 3822;
        while (true) {
            int n5;
            if ((n5 = n4) == 3821) {
                class_6374 a2 = (class_6374)class_25962;
                if (!Class385.method5328(this)) return;
                b2.method10();
                this.field1311.add(a2);
                return;
            }
            if (n5 != 3822) return;
            n4 = 3820;
        }
    }

    public static class_1671 method5348(Class385 class385) {
        return class385.field1309;
    }

    public static void method5349(Class385 class385, boolean bl2) {
        class385.field1310 = bl2;
    }

    private static void method5350(Class385 class385) {
        class385.method5337();
    }

    public boolean method5351() {
        return this.field1310;
    }

    private static void method5352() {
        Class5836.method22897();
    }

    private static void method5353(Class385 class385, class_1671 class_16712) {
        Class385.method5355(class385, class_16712);
    }

    private static class_638 method5354(class_310 class_3102) {
        return Class385.method5344(class_3102);
    }

    @Override
    public void method1279() {
        if (this.field1309 != null) {
            ((au)this.field1309).hookExplodeAndRemove();
            Class385.method5353(this, null);
        }
        Class385.method5349(this, (boolean)field1308[0]);
        this.field1312.method12593();
        this.method5337();
    }

    public static void method5355(Class385 class385, class_1671 class_16712) {
        class385.field1309 = class_16712;
    }

    public static List method5356(Class385 class385) {
        return class385.field1311;
    }

    @Override
    public String method1248() {
        if (!Class385.method5334(this)) {
            this.field1312.method12593();
        }
        return new DecimalFormat("0.0").format((float)this.field1312.method12592() / Class1805.field6740) + "s";
    }

    private static void method5357(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5358() {
        Class3979.method19561();
    }

    private static void method5359(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5360(Class63 c2) {
        block14: {
            int n2;
            block15: {
                Iterator iterator;
                block13: {
                    block12: {
                        if (c2.method128() == Class543.field2690) {
                            int n3 = 56641;
                            Class385.method5359(0.8267002f, 0.77328753f);
                            return;
                        }
                        int n4 = 56640;
                        block8: while (true) {
                            switch (n4) {
                                case 56641: {
                                    n4 = 56639;
                                    continue block8;
                                }
                                case 56640: {
                                    return;
                                }
                            }
                            break;
                        }
                        if (this.field1310) break block12;
                        iterator = Class385.field290.field_1687.method_18112().iterator();
                        break block13;
                    }
                    if ((Class390.method5496().method5458() || !Class385.field290.field_1724.method_24828()) && !this.field1312.method12595((int)field1308[1])) break block14;
                    this.field1310 = (int)field1308[0];
                    n2 = this.field1309 != null ? 10915 : 10916;
                    break block15;
                }
                while (iterator.hasNext()) {
                    class_1671 a2;
                    class_1297 b2 = (class_1297)iterator.next();
                    if (!(b2 instanceof class_1671) || !((au)(a2 = (class_1671)b2)).hookWasShotByEntity() || ((au)a2).hookGetShooter() != Class385.field290.field_1724) continue;
                    this.field1309 = a2;
                    break;
                }
                this.field1312.method12593();
                return;
            }
            block10: while (true) {
                switch (n2) {
                    case 10916: {
                        n2 = 10914;
                        continue block10;
                    }
                    case 10915: {
                        ((au)Class385.method5348(this)).hookExplodeAndRemove();
                        Class385.method5326(this, null);
                        break block10;
                    }
                }
                break;
            }
            Class385.method5350(this);
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

