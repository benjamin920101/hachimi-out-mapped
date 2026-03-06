/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ConcurrentSet
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import io.netty.util.internal.ConcurrentSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class279;
import mapped.Class298;
import mapped.Class315;
import mapped.Class3323;
import mapped.Class3815;
import mapped.Class3979;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class4244;
import mapped.Class429;
import mapped.Class537;
import mapped.Class543;
import mapped.Class5595;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6259;
import mapped.Class628;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class4971 {
    private final ExecutorService field10048 = Executors.newFixedThreadPool((int)field10049[0]);
    private static long[] field10049 = new long[9];
    private Future field10050;
    private Set field10051 = new ConcurrentSet();

    private static void method20958(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method20959() {
        Class5659.method22184();
    }

    private static void method20960() {
        Class4146.method20697();
    }

    public static Class537 method20961() {
        return Class537.field2659;
    }

    private static void method20962(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method20963() {
        Class1745.method15538();
    }

    private static boolean method20964(class_2338 class_23382) {
        return Class5595.method21942(class_23382);
    }

    public static class_746 method20965(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method20966(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Class6259 method20967(class_2338 q2) {
        int n2 = q2.method_10264() != Class4122.field9561.field_1687.method_31607() ? 47939 : 47938;
        block4: while (true) {
            switch (n2) {
                case 47939: {
                    n2 = 47937;
                    continue block4;
                }
                case 47938: {
                    if (Class5595.method21942(q2)) break block4;
                    return new Class6259(q2, Class537.field2656, new class_2338[(int)field10049[4]]);
                }
            }
            break;
        }
        int r2 = (int)field10049[4];
        int s2 = (int)field10049[4];
        if (Class1215.method13258(q2)) {
            Class4971.method20975();
            return null;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public List method20968(class_243 f2) {
        ArrayList<class_2338> g2 = new ArrayList<class_2338>();
        double h2 = Math.ceil(Math.max(5.0, Class315.method2586().method2593()));
        double e2 = -h2;
        while (e2 <= h2) {
            double d2 = -h2;
            block9: while (true) {
                if (!(d2 <= h2)) {
                    int n2 = 55783;
                    Class6454.method24594();
                    return null;
                }
                int n3 = 55782;
                block10: while (true) {
                    switch (n3) {
                        case 55783: {
                            n3 = 55781;
                            continue block10;
                        }
                        case 55782: {
                            double c2 = -h2;
                            if (!(c2 <= h2)) {
                                int n4 = 27126;
                                Class298.method1924();
                                return null;
                            }
                            int n5 = 27125;
                            block11: while (true) {
                                switch (n5) {
                                    case 27126: {
                                        n5 = 27124;
                                        continue block11;
                                    }
                                    case 27125: {
                                        class_2382 a2 = new class_2382((int)(f2.method_10216() + e2), (int)(f2.method_10214() + d2), (int)(f2.method_10215() + c2));
                                        class_2338 b2 = new class_2338(a2);
                                        g2.add(b2);
                                        c2 += 1.0;
                                        Class4146.method20697();
                                        return null;
                                    }
                                }
                                break;
                            }
                            d2 += 1.0;
                            continue block9;
                        }
                    }
                    break;
                }
                break;
            }
            e2 += 1.0;
        }
        return g2;
    }

    public Set method20969() {
        if (this.field10050 != null) {
            try {
                this.field10051 = (Set)this.field10050.get();
            }
            catch (InterruptedException | ExecutionException exception) {
                // empty catch block
            }
            Class6454.method24594();
            return null;
        }
        return this.field10051;
    }

    private static void method20970() {
        Class1503.method14420();
    }

    private static void method20971() {
        Class5836.method22885();
    }

    private static void method20972(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method20973(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Class1
    public void method20974(Class63 b2) {
        int n2;
        if (b2.method128() != Class543.field2690) {
            return;
        }
        int n3 = 56511;
        boolean bl2 = true;
        do {
            if (!bl2 || (bl2 = false) || !true) {
                n3 = n2 = 56509;
            }
            if (n2 != 56510) continue;
            return;
        } while (n2 == 56511);
        if (!Class315.method2586().method1265() && !Class4971.method20992().method1265()) {
            return;
        }
        Class4244 a2 = new Class4244(this, this.method20968(Class4971.method20965(Class4122.field9561).method_19538()));
        this.field10050 = Class4971.method20985(this).submit(a2);
    }

    private static void method20975() {
        Class5836.method22897();
    }

    private static void method20976() {
        Class5836.method22897();
    }

    private static void method20977() {
        Class6009.method23561();
    }

    private static void method20978() {
        Class1745.method15538();
    }

    private static void method20979(float f2) {
        Class5836.method22907(f2);
    }

    private static void method20980() {
        Class1503.method14420();
    }

    private static void method20981() {
        Class5836.method22890();
    }

    private static void method20982() {
        Class3979.method19561();
    }

    private static int method20983(int n2, int n3, Class628 class628, Class279 class279) {
        return Class3323.method16972(n2, n3, class628, class279);
    }

    public Class4971() {
        Class3815.INSTANCE.method18546(this);
    }

    private static void method20984() {
        Class5836.method22890();
    }

    public static ExecutorService method20985(Class4971 class4971) {
        return class4971.field10048;
    }

    private static void method20986(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method20987(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method20988() {
        Class1503.method14420();
    }

    private static void method20989() {
        Class6009.method23561();
    }

    private static void method20990() {
        Class5659.method22184();
    }

    private static void method20991() {
        Class5836.method22890();
    }

    private static Class429 method20992() {
        return Class429.method8657();
    }

    private static void method20993() {
        Class1503.method14420();
    }

    private static void method20994(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method20995(long l2) {
        Class4971.field10049[3] = l2 ^ 0x7E7E7C90749E53A2L;
        Class4971.field10049[6] = l2 ^ 0x7E7E7C90749E53A3L;
        Class4971.field10049[8] = l2 ^ 0x7E7E7C90749E53A4L;
        Class4971.field10049[2] = l2 ^ 0x7E7E7C90749E53AFL;
        Class4971.field10049[7] = l2 ^ 0x8181836F8B61AC58L;
        Class4971.field10049[5] = l2 ^ 0x7E7E7C90749E53A5L;
        Class4971.field10049[0] = l2 ^ 0x7E7E7C90749E53A6L;
        Class4971.field10049[4] = l2 ^ 0x7E7E7C90749E53A7L;
        Class4971.field10049[1] = l2 ^ 0x7E7E7C90749E53A1L;
    }

    private static boolean method20996(class_2338 class_23382) {
        return Class5595.method21932(class_23382);
    }

    private static void method20997() {
        Class5659.method22184();
    }

    private static void method20998() {
        Class3979.method19561();
    }

    private static void method20999(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method21000() {
        Class6009.method23561();
    }

    static {
        Class4971.method20995(9114859655718130599L);
    }

    private static void method21001() {
        Class1807.method15744();
    }

    private static void method21002() {
        Class1503.method14420();
    }

    private static void method21003() {
        Class1807.method15744();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

