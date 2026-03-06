/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_315
 */
package mapped;

import mapped.Class1;
import mapped.Class210;
import mapped.Class278;
import mapped.Class298;
import mapped.Class556;
import mapped.Class6188;
import net.minecraft.class_310;
import net.minecraft.class_315;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class377
extends Class278 {
    private static long[] field1257 = new long[2];
    private boolean field1258;

    private static boolean method4996(Class377 class377) {
        return Class377.method5001(class377);
    }

    public static class_315 method4997(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method4998(long l2) {
        Class377.method5000(l2);
    }

    @Override
    protected void method1279() {
        super.method1279();
        if (this.field1258) {
            this.field1258 = (int)field1257[0];
            ((Class6188)Class377.field290.field_1690.field_1903).method24106();
        }
    }

    @Class1
    public void method4999(Class210 a2) {
        if (Class377.field290.field_1724.method_24828() && !Class377.field290.field_1724.method_5715() && Class377.field290.field_1687.method_18026(Class377.field290.field_1724.method_5829().method_989(0.0, -0.5, 0.0).method_1009(-0.001, 0.0, -0.001))) {
            Class377.method4997((class_310)Class377.field290).field_1903.method_23481((boolean)field1257[1]);
            this.field1258 = (int)field1257[1];
        } else if (Class377.method4996(this)) {
            this.field1258 = (int)field1257[0];
            ((Class6188)Class377.method5002((class_310)Class377.field290).field_1903).method24106();
        }
    }

    private static void method5000(long l2) {
        Class377.field1257[1] = l2 ^ 0x431660CDF815633AL;
        Class377.field1257[0] = l2 ^ 0x431660CDF815633BL;
    }

    public static boolean method5001(Class377 class377) {
        return class377.field1258;
    }

    public static class_315 method5002(class_310 class_3102) {
        return class_3102.field_1690;
    }

    public Class377() {
        super("Parkour", "Automatically jumps at the edge of blocks", Class556.field2752);
    }

    static {
        Class377.method4998(4834157687775519547L);
    }

    private static void method5003() {
        Class298.method1924();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

