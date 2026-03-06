/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  net.minecraft.class_2189
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 */
package mapped;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import mapped.Class1807;
import mapped.Class4122;
import net.minecraft.class_2189;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_638;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5595 {
    private static long[] field10647 = new long[2];
    private static final Set field10648;
    private static final Set field10649;

    public static boolean method21930(class_2680 a2) {
        return Class5595.method21936(a2.method_26204());
    }

    public static boolean method21931(class_2680 a2) {
        class_2248 b2 = a2.method_26204();
        return Class5595.method21935(b2);
    }

    public static boolean method21932(class_2338 a2) {
        if (Class4122.field9561.field_1687 == null) {
            return (int)field10647[0] != 0;
        }
        return Class5595.method21936(Class4122.field9561.field_1687.method_8320(a2).method_26204());
    }

    public static class_310 method21933() {
        return Class4122.field9561;
    }

    private static void method21934(long l2) {
        Class5595.field10647[1] = l2 ^ 0x7058F6A58C0A4A64L;
        Class5595.field10647[0] = l2 ^ 0x7058F6A58C0A4A65L;
    }

    private static boolean method21935(class_2248 class_22482) {
        return Class5595.method21937(class_22482);
    }

    public static boolean method21936(class_2248 a2) {
        return field10648.contains(a2);
    }

    static {
        Class5595.method21934(8095491521077987941L);
        field10648 = new ReferenceOpenHashSet(Set.of(class_2246.field_10540, class_2246.field_22423, class_2246.field_22109, class_2246.field_22108, class_2246.field_23152, class_2246.field_10535, class_2246.field_10485, class_2246.field_10443, class_2246.field_10327));
        field10649 = new ReferenceOpenHashSet(Set.of(class_2246.field_9987, class_2246.field_10525, class_2246.field_10395, class_2246.field_10398, class_2246.field_10499));
    }

    public static boolean method21937(class_2248 a2) {
        return (!(a2 instanceof class_2189 || a2.method_36555() != -1.0f && a2.method_36555() != 100.0f) ? (int)field10647[1] : (int)field10647[0]) != 0;
    }

    public static class_310 method21938() {
        return Class4122.field9561;
    }

    public static boolean method21939(class_2338 a2) {
        if (Class4122.field9561.field_1687 == null) {
            return (int)field10647[0] != 0;
        }
        return Class5595.method21944(Class5595.method21938().field_1687.method_8320(a2).method_26204());
    }

    public static class_638 method21940(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static boolean method21941() {
        return Class1807.method15742();
    }

    public static boolean method21942(class_2338 a2) {
        class_2248 b2 = Class5595.method21940(Class5595.method21943()).method_8320(a2).method_26204();
        return Class5595.method21937(b2);
    }

    private static class_310 method21943() {
        return Class5595.method21933();
    }

    public static boolean method21944(class_2248 a2) {
        return (!field10649.contains(a2) ? (int)field10647[1] : (int)field10647[0]) != 0;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

