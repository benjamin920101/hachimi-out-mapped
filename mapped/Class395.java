/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class117;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class251;
import mapped.Class260;
import mapped.Class278;
import mapped.Class3478;
import mapped.Class4146;
import mapped.Class527;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class68;
import mapped.Class81;
import mapped.Class95;
import net.minecraft.class_1293;
import net.minecraft.class_1294;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class395
extends Class278 {
    private static long[] field1370 = new long[3];
    Class248 field1371 = this.method450(new Class260("Mode", "Mode for world brightness", Class527.field2616, Class527.values()));
    Class248 field1372 = this.method450(new Class251("LightColor", "The color of the light", Color.WHITE, (boolean)field1370[0], (boolean)field1370[0], this::method1269));

    private static void method5712() {
        Class1807.method15744();
    }

    private Boolean method1269() {
        if (Class395.method5727(this.field1371) != Class527.field2615) {
            Class6009.method23559(true);
            return null;
        }
        return (boolean)field1370[2];
    }

    private static void method5713(Class395 class395) {
        class395.method1274();
    }

    @Override
    public void method1274() {
        if (Class395.field290.field_1724 != null && Class395.field290.field_1687 != null) {
            if (Class395.method5731(Class395.method5724(this)) != Class395.method5729()) {
                Class4146.method20697();
                return;
            }
            Class395.field290.field_1724.method_6092(new class_1293(class_1294.field_5925, (int)field1370[1], (int)field1370[0]));
        }
    }

    private static void method5714(Class395 class395) {
        class395.method1279();
    }

    @Class1
    public void method5715(Class95 b2) {
        if (this.field1371.method507() == Class527.field2615) {
            b2.method10();
            Color a2 = (Color)this.field1372.method507();
            b2.method187(new Color(a2.getBlue(), a2.getGreen(), a2.getRed()));
        }
    }

    private static void method5716(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method5717(long l2) {
        Class395.field1370[2] = l2 ^ 0xBFC426537FF8B7F2L;
        Class395.field1370[1] = l2 ^ 0x403BD9AC8007480CL;
        Class395.field1370[0] = l2 ^ 0xBFC426537FF8B7F3L;
    }

    public static Class527 method5718() {
        return Class527.field2617;
    }

    private static void method5719() {
        Class5836.method22890();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5720(Class68 a2) {
        if (Class395.field290.field_1724 == null) {
            int n2 = 37980;
            Class395.method5716(Class3478.field7631, 0.57975245f);
            return;
        }
        int n3 = 37979;
        block4: while (true) {
            switch (n3) {
                case 37980: {
                    n3 = 37978;
                    continue block4;
                }
                case 37979: {
                    if (this.field1371 != a2.method140()) {
                        return;
                    }
                    if (a2.method128() != Class543.field2691) return;
                    if (this.field1371.method507() == Class527.field2617) return;
                    Class395.field290.field_1724.method_6016(class_1294.field_5925);
                    return;
                }
            }
            break;
        }
    }

    @Override
    public void method1279() {
        if (Class395.field290.field_1724 != null && Class395.field290.field_1687 != null && this.field1371.method507() == Class527.field2617) {
            Class395.field290.field_1724.method_6016(class_1294.field_5925);
        }
    }

    public static Class248 method5721(Class395 class395) {
        return class395.field1371;
    }

    private static void method5722() {
        Class6009.method23560();
    }

    @Class1
    public void method5723(Class81 a2) {
        if (this.field1371.method507() == Class527.field2616) {
            a2.method10();
            a2.method170((int)field1370[1]);
        }
    }

    private static Class248 method5724(Class395 class395) {
        return Class395.method5721(class395);
    }

    private static void method5725() {
        Class4146.method20694();
    }

    static {
        Class395.method5717(-4628532376958879757L);
    }

    private static void method5726(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object method5727(Class248 class248) {
        return class248.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5728(Class63 a2) {
        int n2 = this.field1371.method507() != Class395.method5718() ? 22357 : 22356;
        block4: while (true) {
            switch (n2) {
                case 22357: {
                    n2 = 22355;
                    continue block4;
                }
                case 22356: {
                    if (Class395.field290.field_1724.method_6059(class_1294.field_5925)) return;
                    Class395.field290.field_1724.method_6092(new class_1293(class_1294.field_5925, (int)field1370[1], (int)field1370[0]));
                    return;
                }
            }
            break;
        }
    }

    public static Class527 method5729() {
        return Class527.field2617;
    }

    public Class395() {
        super("Fullbright", "Brightens the world", Class556.field2759);
    }

    @Class1
    public void method5730(Class117 a2) {
        Class395.method5714(this);
        Class395.method5713(this);
    }

    private static Object method5731(Class248 class248) {
        return class248.method507();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

