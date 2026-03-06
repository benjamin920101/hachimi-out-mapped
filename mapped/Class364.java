/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1702
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_304
 *  net.minecraft.class_315
 *  net.minecraft.class_4174
 *  net.minecraft.class_9334
 */
package mapped;

import mapped.Class1;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class252;
import mapped.Class278;
import mapped.Class287;
import mapped.Class324;
import mapped.Class3293;
import mapped.Class3408;
import mapped.Class3432;
import mapped.Class3978;
import mapped.Class4045;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class6188;
import mapped.Class63;
import net.minecraft.class_1268;
import net.minecraft.class_1702;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_304;
import net.minecraft.class_315;
import net.minecraft.class_4174;
import net.minecraft.class_9334;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class364
extends Class278 {
    private static long[] field1178 = new long[5];
    Class248 field1179 = this.method450(new Class252("Hunger", "The minimum hunger level before eating", Float.valueOf(1.0f), Float.valueOf(19.0f), Float.valueOf(20.0f)));

    private static int method4678(int n2) {
        return Class287.method1495(n2);
    }

    public static class_304 method4679(class_315 class_3152) {
        return class_3152.field_1904;
    }

    private static void method4680() {
        Class1745.method15538();
    }

    private static int method4681(int n2, int n3, Class324 class324, Class3432 class3432) {
        return Class3408.method17224(n2, n3, class324, class3432);
    }

    private static Object method4682(Class248 class248) {
        return class248.method507();
    }

    @Override
    public void method1279() {
        ((Class6188)Class364.method4694(Class364.field290.field_1690)).method24106();
    }

    public static class_1268 method4683() {
        return class_1268.field_5810;
    }

    private static void method4684(long l2) {
        Class364.field1178[1] = l2 ^ 0x6BA9646758C051EBL;
        Class364.field1178[0] = l2 ^ 0x94569B98A73FAE15L;
        Class364.field1178[3] = l2 ^ 0x94569B98A73FAE1DL;
        Class364.field1178[2] = l2 ^ 0x94569B98A73FAE39L;
        Class364.field1178[4] = l2 ^ 0x94569B98A73FAE14L;
    }

    static {
        Class364.method4692(-7757842228155797996L);
    }

    private static int method4685(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    @Class1
    public void method4686(Class63 b2) {
        class_1702 c2 = Class364.field290.field_1724.method_7344();
        if ((float)c2.method_7586() <= ((Float)Class364.method4682(this.field1179)).floatValue()) {
            int a2 = this.method4689();
            if (a2 == (int)field1178[1]) {
                return;
            }
            if (a2 == (int)field1178[2]) {
                Class364.field290.field_1724.method_6019(Class364.method4683());
            } else {
                Class5723.field11058.method18931(a2);
            }
            Class364.method4679(Class364.field290.field_1690).method_23481((boolean)field1178[0]);
        } else {
            ((Class6188)Class364.field290.field_1690.field_1904).method24106();
        }
    }

    private static int method4687(int n2) {
        return Class4045.method20103(n2);
    }

    private static int method4688(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int method4689() {
        int e2 = (int)field1178[1];
        int f2 = (int)field1178[1];
        int c2 = (int)field1178[4];
        block8: while (true) {
            int n2 = c2 >= (int)field1178[3] ? 18597 : 18596;
            block9: while (true) {
                switch (n2) {
                    case 18597: {
                        n2 = 18595;
                        continue block9;
                    }
                    case 18596: {
                        class_1799 b2 = Class364.field290.field_1724.method_31548().method_5438(c2);
                        if (!b2.method_7909().method_57347().method_57832(class_9334.field_50075)) return Class4045.method20100(677748073, 0.12668514f);
                        int n3 = b2.method_7909() != class_1802.field_8323 ? 58671 : 58672;
                        block10: while (true) {
                            switch (n3) {
                                case 58672: {
                                    n3 = 58670;
                                    continue block10;
                                }
                                case 58671: {
                                    int a2;
                                    if (b2.method_7909() == class_1802.field_8233 || (a2 = ((class_4174)b2.method_7909().method_57347().method_57829(class_9334.field_50075)).comp_2491()) <= e2) break block10;
                                    f2 = c2;
                                    e2 = a2;
                                    break block10;
                                }
                            }
                            break;
                        }
                        ++c2;
                        continue block8;
                    }
                }
                break;
            }
            break;
        }
        class_1799 g2 = Class364.field290.field_1724.method_6079();
        if (!g2.method_7909().method_57347().method_57832(class_9334.field_50075)) return f2;
        if (g2.method_7909() == class_1802.field_8323) return f2;
        if (g2.method_7909() == class_1802.field_8233) {
            return f2;
        }
        int d2 = ((class_4174)g2.method_7909().method_57347().method_57829(class_9334.field_50075)).comp_2491();
        if (d2 <= e2) return f2;
        return (int)field1178[2];
    }

    private static int method4690(int n2, int n3, Class3293 class3293, Class3978 class3978) {
        return Class3408.method17230(n2, n3, class3293, class3978);
    }

    private static int method4691() {
        return Class5659.method22101();
    }

    public Class364() {
        super("AutoEat", "Automatically eats when losing hunger", Class556.field2754);
    }

    private static void method4692(long l2) {
        Class364.method4684(l2);
    }

    private static void method4693(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static class_304 method4694(class_315 class_3152) {
        return class_3152.field_1904;
    }

    private static int method4695(int n2) {
        return Class4045.method20105(n2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

