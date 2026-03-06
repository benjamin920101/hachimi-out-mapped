/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2596
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package mapped;

import mapped.Class1;
import mapped.Class3815;
import mapped.Class4122;
import mapped.Class469;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class5723;
import mapped.Class63;
import mapped.Class85;
import net.minecraft.class_1297;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_310;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1387 {
    private boolean field5348;

    private static class_746 method13993(class_310 class_3102) {
        return Class1387.method13994(class_3102);
    }

    public static class_746 method13994(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method13995(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    @Class1(priority=1000)
    public void method13996(Class63 a2) {
        if (a2.method128() == Class543.field2690) {
            Class469.field2452.clear();
        }
    }

    public Class1387() {
        Class3815.INSTANCE.method18546(this);
    }

    public static class_310 method13997() {
        return Class4122.field9561;
    }

    public void method13998(double a2) {
        Class4122.field9561.field_1724.method_18800(Class4122.field9561.field_1724.method_18798().field_1352, Class1387.method14008().field_1724.method_18798().field_1351, a2);
    }

    @Class1
    public void method13999(Class85 a2) {
        a2.method14(this.field5348);
    }

    public void method14000(boolean a2) {
        Class1387.method14009(this, a2);
        if (a2) {
            Class1387.method14007(Class5723.field11048, (class_2596)new class_2848((class_1297)Class4122.field9561.field_1724, class_2848.class_2849.field_12979));
        } else {
            Class1387.method13995(Class5723.field11048, (class_2596)new class_2848((class_1297)Class1387.method13997().field_1724, class_2848.class_2849.field_12984));
        }
    }

    public static class_310 method14001() {
        return Class4122.field9561;
    }

    public void method14002(double a2) {
        Class1387.method13993(Class4122.field9561).method_18800(Class4122.field9561.field_1724.method_18798().method_10216(), a2, Class4122.field9561.field_1724.method_18798().method_10215());
    }

    public static class_746 method14003(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public void method14004(double a2, double b2, double c2) {
        Class1387.method14003(Class4122.field9561).method_18800(a2, b2, c2);
    }

    public void method14005(double a2, double b2) {
        Class4122.field9561.field_1724.method_18800(a2, Class4122.field9561.field_1724.method_18798().field_1351, b2);
    }

    public void method14006(double a2) {
        Class4122.field9561.field_1724.method_18800(a2, Class4122.field9561.field_1724.method_18798().field_1351, Class4122.field9561.field_1724.method_18798().field_1350);
    }

    private static void method14007(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static class_310 method14008() {
        return Class1387.method14001();
    }

    public static void method14009(Class1387 class1387, boolean bl2) {
        class1387.field5348 = bl2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

