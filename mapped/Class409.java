/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  skidonion.sAnhI.___.____
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class1745;
import mapped.Class246;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class259;
import mapped.Class278;
import mapped.Class298;
import mapped.Class36;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6454;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class409
extends Class278 {
    private boolean field1508;
    private boolean field1509;
    private int field1510;
    private boolean field1511;
    Class248 field1512 = this.method450(new Class252("Zoom", "The zoom value", (int)field1515[1], (int)field1515[5], (int)field1515[0]));
    Class248 field1513 = this.method450(new Class253("SmoothCamera", "Adds motion reduction to the camera", (boolean)field1515[2]));
    Class248 field1514 = this.method450(new Class259("ZoomKey", "The zoom key bind", new Class246(this.method472() + "-zoomkey", (int)field1515[4], Class409::method6454)));
    private static long[] field1515;
    public static boolean $skidonion$998553718;

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method6443(Class63 a2) {
        int n2 = a2.method128() == Class543.field2690 ? 16678 : 16679;
        block8: while (true) {
            switch (n2) {
                case 16679: {
                    n2 = 16677;
                    continue block8;
                }
                case 16678: {
                    if (Class409.field290.field_1755 != null) return;
                    int n3 = this.field1509 ? 23398 : 23399;
                    block9: while (true) {
                        switch (n3) {
                            case 23399: {
                                n3 = 23397;
                                continue block9;
                            }
                            case 23398: {
                                if (this.field1511) {
                                    this.field1510 = (Integer)Class409.field290.field_1690.method_41808().method_41753();
                                    this.field1511 = (int)field1515[7];
                                }
                                Class409.field290.field_1690.field_1914 = (Boolean)Class409.method6458(this).method507();
                                Class409.method6448(Class409.field290.field_1690, (boolean)field1515[2]);
                                Class409.field290.field_1690.method_41808().method_41748((Object)((Integer)this.field1512.method507()));
                                this.field1508 = (int)field1515[2];
                                return;
                            }
                        }
                        break;
                    }
                    if (!this.field1508) return;
                    Class409.field290.field_1690.field_1914 = (int)field1515[7];
                    Class409.method6450(Class409.method6449(field290), (boolean)field1515[7]);
                    Class409.field290.field_1690.method_41808().method_41748((Object)Class409.method6460(this));
                    this.field1508 = (int)field1515[7];
                    this.field1511 = (int)field1515[2];
                    return;
                }
            }
            break;
        }
    }

    @Class1
    public void method6444(Class36 a2) {
        if (a2.method70() != (int)field1515[6]) {
            if (a2.method68() == Class409.method6451((Class246)this.field1514.method507())) {
                this.field1509 = a2.method70() == (int)field1515[2] ? (int)field1515[2] : (int)field1515[7];
            }
        }
    }

    private static void method6445(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6446(long l2) {
        Class409.method6456(l2);
    }

    private static void method6447() {
        Class298.method1924();
    }

    private static void method6448(class_315 class_3152, boolean bl2) {
        Class409.method6455(class_3152, bl2);
    }

    public static class_315 method6449(class_310 class_3102) {
        return class_3102.field_1690;
    }

    static {
        ___.___(37, Class409.class);
        ____.___37_110(Class409.class);
    }

    public static void method6450(class_315 class_3152, boolean bl2) {
        class_3152.field_1842 = bl2;
    }

    private static int method6451(Class246 class246) {
        return class246.method500();
    }

    private static void method6452() {
        Class6454.method24594();
    }

    private static void method6453(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static native void method6454();

    public static void method6455(class_315 class_3152, boolean bl2) {
        class_3152.field_1842 = bl2;
    }

    private static void method6456(long l2) {
        Class409.field1515[2] = l2 ^ 0x11F70788EED350E0L;
        Class409.field1515[0] = l2 ^ 0x11F70788EED350D3L;
        Class409.field1515[3] = l2 ^ 0x11F70788EED35085L;
        Class409.field1515[1] = l2 ^ 0x11F70788EED350EBL;
        Class409.field1515[6] = l2 ^ 0x11F70788EED350E3L;
        Class409.field1515[4] = l2 ^ 0x11F70788EED350A2L;
        Class409.field1515[5] = l2 ^ 0x11F70788EED350FFL;
        Class409.field1515[7] = l2 ^ 0x11F70788EED350E1L;
    }

    private static void method6457() {
        Class1745.method15538();
    }

    public static Class248 method6458(Class409 class409) {
        return class409.field1513;
    }

    public Class409() {
        super("Zoom", "Zooms in the camera perspective", Class556.field2759);
        this.field1511 = (int)field1515[2];
        this.field1510 = (int)field1515[3];
    }

    private static void method6459(float f2) {
        Class5836.method22907(f2);
    }

    public static int method6460(Class409 class409) {
        return class409.field1510;
    }

    private static native Object 1(char var0);
}

