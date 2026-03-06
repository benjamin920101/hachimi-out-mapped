/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2596
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package mapped;

import mapped.Class1;
import mapped.Class131;
import mapped.Class132;
import mapped.Class144;
import mapped.Class1503;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3419;
import mapped.Class3815;
import mapped.Class390;
import mapped.Class41;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class63;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_310;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class363
extends Class278 {
    private static long[] field1172 = new long[4];
    Class248 field1173;
    Class248 field1174;
    Class248 field1175 = this.method450(new Class253("Dupe", "Dupe exploit", (boolean)field1172[2]));
    Class248 field1176;
    Class248 field1177;

    @Class1(priority=-1000)
    private void method4661(Class131 b2) {
        class_2596 class_25962;
        if (((Boolean)Class363.method4674(this.field1175)).booleanValue() && (class_25962 = b2.method251()) instanceof class_2846) {
            class_2846 a2 = (class_2846)class_25962;
            if (a2.method_12363() != class_2846.class_2847.field_12974) {
                Class5836.method22897();
                return;
            }
            Class363.field290.field_1761.method_2906(Class363.method4662((class_310)Class363.field290).field_7512.field_7763, (int)field1172[0], Class363.field290.field_1724.method_31548().field_7545, class_1713.field_7791, (class_1657)Class363.field290.field_1724);
        }
    }

    private static class_746 method4662(class_310 class_3102) {
        return Class363.method4664(class_3102);
    }

    @Class1
    public void method4663(Class144 a2) {
        if (((Boolean)Class363.method4675(this).method507()).booleanValue()) {
            a2.method10();
        }
    }

    public static class_746 method4664(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_2846.class_2847 method4665() {
        return Class363.method4668();
    }

    private static void method4666(long l2) {
        Class363.field1172[2] = l2 ^ 0xBDEDA4368CBF1385L;
        Class363.field1172[0] = l2 ^ 0xBDEDA4368CBF1386L;
        Class363.field1172[3] = l2 ^ 0xBDEDA4368CBF1391L;
        Class363.field1172[1] = l2 ^ 0xBDEDA4368CBF1384L;
    }

    public static Class248 method4667(Class363 class363) {
        return class363.field1173;
    }

    public static class_2846.class_2847 method4668() {
        return class_2846.class_2847.field_12974;
    }

    static {
        Class363.method4666(-4760968676864224379L);
    }

    private static Object method4669(Class248 class248) {
        return class248.method507();
    }

    public Class363() {
        super("TridentTweaks", "Tridents util", Class556.field2755);
        this.field1174 = this.method450(new Class253("AllowNoWater", "Allows you to fly using tridents even without water", (boolean)field1172[1]));
        this.field1177 = this.method450(new Class253("Instant", "Removes the pullback of the trident", (boolean)field1172[1]));
        this.field1173 = this.method450(new Class253("Spam", "Automatically uses riptide", (boolean)field1172[2]));
        this.field1176 = this.method450(new Class252("Ticks", "The ticks between riptide boost", (Number)((int)field1172[2]), (Number)((int)field1172[0]), (Number)((int)field1172[3]), this::method1269));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4670(Class63 a2) {
        int n2 = a2.method128() != Class543.field2690 ? 36840 : 36841;
        block4: while (true) {
            switch (n2) {
                case 36841: {
                    n2 = 36839;
                    continue block4;
                }
                case 36840: {
                    if (((Boolean)this.field1173.method507()).booleanValue()) break block4;
                }
                default: {
                    return;
                }
            }
            break;
        }
        if (Class363.field290.field_1724.method_6047().method_7909() == class_1802.field_8547 && Class363.field290.field_1724.method_6048() >= (Integer)this.field1176.method507()) {
            Class5723.field11048.method21341((class_2596)new class_2846(Class363.method4665(), class_2338.field_10980, Class363.method4677()));
            Class363.field290.field_1724.method_6075();
        }
    }

    private static void method4671(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    @Class1(priority=1000)
    private void method4672(Class132 b2) {
        if (((Boolean)this.field1175.method507()).booleanValue()) {
            class_2596 class_25962 = b2.method251();
            if (class_25962 instanceof class_2846) {
                class_2846 a2 = (class_2846)class_25962;
                if (a2.method_12363() == class_2846.class_2847.field_12974) {
                    Class363.field290.field_1761.method_2906(Class363.field290.field_1724.field_7512.field_7763, (int)field1172[0], Class363.field290.field_1724.method_31548().field_7545, class_1713.field_7791, (class_1657)Class363.field290.field_1724);
                }
            }
        }
    }

    @Class1
    public void method4673(Class41 a2) {
        if (((Boolean)this.field1174.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static Object method4674(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method4675(Class363 class363) {
        return class363.field1177;
    }

    private static int method4676(int n2, int n3, Class3815 class3815, Class390 class390) {
        return Class3419.method17243(n2, n3, class3815, class390);
    }

    private Boolean method1269() {
        return (Boolean)Class363.method4669(Class363.method4667(this));
    }

    public static class_2350 method4677() {
        return class_2350.field_11033;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

