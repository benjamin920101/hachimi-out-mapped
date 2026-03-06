/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package mapped;

import mapped.Class1503;
import mapped.Class244;
import mapped.Class3404;
import mapped.Class3979;
import mapped.Scaffold;
import mapped.Class5432;
import mapped.Class5455;
import mapped.Class560;
import mapped.Class5735;
import mapped.Class5836;
import mapped.Class6316;
import mapped.Class6322;
import net.minecraft.util.math.Vec3d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class Class563
extends Class560 {
    private static int method11064(int n2, int n3, Class6316 class6316, Scaffold class431) {
        return Class3404.method17212(n2, n3, class6316, class431);
    }

    private static void method11065() {
        Class1503.method14420();
    }

    private static void method11066() {
        Class3979.method19561();
    }

    private static void method11067() {
        Class5836.method22885();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public class_243 method11056(class_243 a) {
        block4: {
            block3: {
                block1: {
                    block2: {
                        v0 = Class244.field289.nextDouble(-10.0, 10.0);
                        v1 = Class244.field289.nextDouble(80.0, 100.0);
                        if (!Class244.field289.nextBoolean()) break block2;
                        v2 = 61972;
                        ** GOTO lbl11
                    }
                    v2 = 61973;
                    if (true) ** GOTO lbl11
                    do {
                        v2 = var2_2 = 61971;
lbl11:
                        // 3 sources

                        if (var2_2 == 61972) break block1;
                    } while (var2_2 == 61973);
                    break block3;
                }
                v3 = 1.0;
                break block4;
            }
            v3 = Class5432.field10126;
        }
        return a.method_1031(v0, v1 * v3, Class244.field289.nextDouble(Class5735.field11089, Class5455.field10206));
    }

    private static void method11068(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

