/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.shape.VoxelShapes
 */
package mapped;

import mapped.Class1;
import mapped.Class1215;
import mapped.Class1668;
import mapped.Class178;
import mapped.Class197;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class63;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShapes;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class302
extends Class278 {
    private static long[] field587 = new long[2];
    Class248 field588 = this.method450(new Class253("Void", "Prevents player from falling into the void", (boolean)field587[0]));
    Class248 field589;
    Class248 field590;
    Class248 field591;
    Class248 field592;
    Class248 field593 = this.method450(new Class253("Fire", "Prevents player from walking into fire", (boolean)field587[1]));

    static {
        Class302.method2053(-8020297743476490369L);
    }

    private static void method2053(long l2) {
        Class302.field587[1] = l2 ^ 0x90B22DB217377F7FL;
        Class302.field587[0] = l2 ^ 0x90B22DB217377F7EL;
    }

    private static void method2054(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_2248 method2055() {
        return class_2246.field_16999;
    }

    @Class1
    public void method2056(Class178 a2) {
        class_2338 b2 = a2.method346();
        if ((Boolean)this.field593.method507() != false && a2.method350() == class_2246.field_10036 && Class302.field290.field_1724.method_23318() < (double)b2.method_10264() + 1.0 || (Boolean)this.field589.method507() != false && a2.method350() == class_2246.field_10029 || (Boolean)this.field590.method507() != false && a2.method350() == Class302.method2055() || ((Boolean)this.field592.method507()).booleanValue() && !Class1215.method13261(b2.method_10263(), b2.method_10260())) {
            a2.method10();
            a2.method349(class_259.method_1077());
        }
    }

    private static void method2057(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method2058() {
        Class4146.method20697();
    }

    private static Object method2059(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method2060(Class197 a2) {
        if (((Boolean)this.field591.method507()).booleanValue()) {
            a2.method10();
        }
    }

    public Class302() {
        super("Avoid", "Prevents player from entering harmful areas", Class556.field2752);
        this.field590 = this.method450(new Class253("BerryBush", "Prevents player from walking into sweet berry bushes", (boolean)field587[1]));
        this.field589 = this.method450(new Class253("Cactus", "Prevents player from walking into cacti", (boolean)field587[1]));
        this.field592 = this.method450(new Class253("Unloaded", "Prevents player from entering chunks that haven't been loaded", (boolean)field587[1]));
        this.field591 = this.method450(new Class253("Climb", "Prevents player from climbing up blocks", (boolean)field587[1]));
    }

    private static void method2061() {
        Class5659.method22184();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2062(Class63 a2) {
        if (a2.method128() != Class543.field2690) return;
        int n2 = (Boolean)Class302.method2059(this.field588) != false ? 6833 : 6834;
        block4: while (true) {
            switch (n2) {
                case 6834: {
                    n2 = 6832;
                    continue block4;
                }
                case 6833: {
                    if (Class302.field290.field_1724.method_7325()) return;
                    if (!(Class302.field290.field_1724.method_23318() < (double)Class302.field290.field_1687.method_31607())) {
                        return;
                    }
                    Class5723.field11052.method14002(0.0);
                    return;
                }
            }
            break;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

