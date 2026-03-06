/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2735
 *  net.minecraft.class_2868
 *  net.minecraft.class_310
 *  net.minecraft.class_634
 *  net.minecraft.class_746
 */
package mapped;

import mapped.Class1;
import mapped.Class117;
import mapped.Class133;
import mapped.Class1668;
import mapped.Class278;
import mapped.Class3348;
import mapped.Class3395;
import mapped.Class3850;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6454;
import mapped.Class926;
import net.minecraft.class_2596;
import net.minecraft.class_2735;
import net.minecraft.class_2868;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class323
extends Class278 {
    private static long[] field763 = new long[1];
    private final Class926 field764 = new Class926();

    private static void method2755() {
        Class6454.method24594();
    }

    private static void method2756(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method2757(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    public static Class3850 method2758() {
        return Class5723.field11058;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2759(Class133 b2) {
        int n2;
        int n3 = n2 = Class323.method2765(this).method12595((int)field763[0]) ? 40933 : 40934;
        if (n2 != 40933) {
            if (n2 != 40934) return;
            Class323.method2757(0.49051142f, Class3395.field7383, 0.7881761f, 0.9422802f, Class3348.field7242, 0.90815943f);
            return;
        }
        int n4 = Class323.field290.field_1724 == null ? 48692 : 48693;
        block4: while (true) {
            switch (n4) {
                case 48693: {
                    n4 = 48691;
                    continue block4;
                }
                case 48692: {
                    return;
                }
            }
            break;
        }
        class_2596 class_25962 = b2.method251();
        if (!(class_25962 instanceof class_2735)) return;
        class_2735 a2 = (class_2735)class_25962;
        b2.method10();
        Class5723.field11058.method18878();
        Class323.field290.field_1724.field_3944.method_52787((class_2596)new class_2868(a2.method_11803()));
        Class323.method2761(Class323.method2758());
        Class323.method2766(Class323.method2767(field290)).method_52787((class_2596)new class_2868(Class323.field290.field_1724.method_31548().field_7545));
    }

    static {
        Class323.method2760(-1990105283534618005L);
    }

    public Class323() {
        super("NoSlotSet", "Prevents server from forcing slot set", Class556.field2754);
    }

    private static void method2760(long l2) {
        Class323.field763[0] = l2 ^ 0xE461B9C9E54A839FL;
    }

    private static void method2761(Class3850 class3850) {
        class3850.method18878();
    }

    @Class1
    public void method2762(Class117 a2) {
        this.field764.method12593();
    }

    private static void method2763() {
        Class5836.method22897();
    }

    private static void method2764(float f2) {
        Class5836.method22907(f2);
    }

    public static Class926 method2765(Class323 class323) {
        return class323.field764;
    }

    public static class_634 method2766(class_746 class_7462) {
        return class_7462.field_3944;
    }

    public static class_746 method2767(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2768() {
        Class4146.method20697();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

