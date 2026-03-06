/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1806
 *  net.minecraft.class_1937
 *  net.minecraft.class_22
 *  net.minecraft.class_2480
 *  net.minecraft.class_332
 *  net.minecraft.class_4597
 *  net.minecraft.class_9209
 *  net.minecraft.class_9334
 */
package mapped;

import mapped.Class1;
import mapped.Class1256;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3553;
import mapped.Class3811;
import mapped.Class4072;
import mapped.Class4109;
import mapped.Class457;
import mapped.Class5427;
import mapped.Class556;
import mapped.Class6195;
import mapped.Class64;
import mapped.Class6454;
import mapped.Class812;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1806;
import net.minecraft.class_1937;
import net.minecraft.class_22;
import net.minecraft.class_2480;
import net.minecraft.class_332;
import net.minecraft.class_4597;
import net.minecraft.class_9209;
import net.minecraft.class_9334;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class318
extends Class278 {
    Class248 field739;
    Class248 field740;
    private static long[] field741 = new long[9];
    private static final class_1799[] field742;
    Class248 field743;
    Class248 field744 = this.method450(new Class253("Shulkers", "Renders all the contents of shulkers in tooltips", (boolean)field741[0]));
    private static Class318 INSTANCE;

    private static void method2645(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2646(Class64 e2) {
        class_1747 a2;
        class_1792 class_17922;
        class_1799 f2 = e2.method131();
        int n2 = f2.method_7960() ? 26961 : 26962;
        block4: while (true) {
            switch (n2) {
                case 26962: {
                    n2 = 26960;
                    continue block4;
                }
                case 26961: {
                    return;
                }
            }
            break;
        }
        if (!(((Boolean)Class318.method2656(this.field744)).booleanValue() && (Class1256.method13556(f2) || (class_17922 = f2.method_7909()) instanceof class_1747 && (a2 = (class_1747)class_17922).method_7711() instanceof class_2480))) {
            if (!((Boolean)Class318.method2648(this.field743)).booleanValue()) {
                return;
            }
            if (!(f2.method_7909() instanceof class_1806)) return;
            e2.method10();
            e2.field96.method_51448().method_22903();
            e2.field96.method_51448().method_46416(0.0f, 0.0f, Class812.field3590);
            Class6454.method24667(e2.field96.method_51448(), (double)e2.method133() + 8.0, (double)e2.method132() - 21.0, 128.0, Class3811.field8623, Class457.method10620().method10615((int)field741[3]));
            Class6454.method24636((double)e2.method133() + 8.0, (double)e2.method132() - Class3553.field7883, (double)e2.method133() + 132.0, (double)e2.method132() - 8.0);
            Class6454.method24624(e2.method130(), f2.method_7964().getString(), (float)e2.method133() + Class4109.field9526, (float)e2.method132() - Class4072.field9416, (int)field741[2]);
            Class6454.method24594();
            e2.method130().method_51448().method_46416((float)e2.method133() + 8.0f, (float)e2.method132() - 8.0f, 0.0f);
            class_9209 c2 = (class_9209)f2.method_57824(class_9334.field_49646);
            class_22 d2 = class_1806.method_7997((class_9209)c2, (class_1937)Class318.field290.field_1687);
            if (d2 != null) {
                Class318.field290.field_1773.method_3194().method_1773(e2.method130().method_51448(), (class_4597)e2.method130().method_51450(), c2, d2, (boolean)field741[0], (int)field741[0]);
            }
            Class318.method2660(e2).method_51448().method_22909();
            return;
        }
        Class1256.method13559(f2, field742);
        e2.method10();
        e2.field96.method_51448().method_22903();
        Class318.method2655(e2).method_51448().method_46416(0.0f, 0.0f, 600.0f);
        Class6454.method24667(Class318.method2658(e2).method_51448(), (double)e2.method133() + 8.0, (double)e2.method132() - 21.0, 150.0, 13.0, Class457.method10620().method10615((int)field741[3]));
        Class318.method2645((double)e2.method133() + 8.0, (double)e2.method132() - 21.0, (double)e2.method133() + 158.0, (double)e2.method132() - Class5427.field10106);
        Class6454.method24624(Class318.method2654(e2), f2.method_7964().getString(), (float)e2.method133() + Class6195.field12587, (float)e2.method132() - 18.0f, (int)field741[2]);
        Class6454.method24594();
        Class6454.method24667(Class318.method2651(e2).method_51448(), (double)Class318.method2650(e2) + 8.0, (double)e2.method132() - 8.0, 150.0, 55.0, (int)field741[5]);
        int b2 = (int)field741[1];
        while (true) {
            if (b2 >= field742.length) {
                Class318.method2657(e2).method_51448().method_22909();
                return;
            }
            e2.field96.method_51427(field742[b2], e2.method133() + b2 % (int)field741[4] * (int)field741[7] + (int)field741[4], e2.method132() + b2 / (int)field741[4] * (int)field741[7] - (int)field741[6]);
            e2.field96.method_51431(Class318.field290.field_1772, field742[b2], e2.method133() + b2 % (int)field741[4] * (int)field741[7] + (int)field741[4], e2.method132() + b2 / (int)field741[4] * (int)field741[7] - (int)field741[6]);
            ++b2;
        }
    }

    public boolean method2647() {
        return (Boolean)this.field740.method507();
    }

    private static Object method2648(Class248 class248) {
        return class248.method507();
    }

    public boolean method2649() {
        return (Boolean)Class318.method2659(this.field739);
    }

    private static int method2650(Class64 class64) {
        return class64.method133();
    }

    public Class318() {
        super("Tooltips", "Renders detailed tooltips showing items", Class556.field2756);
        this.field740 = this.method450(new Class253("ShulkersIcon", "Draw the first item in the Shulker Box on the Shulker Box", (boolean)field741[0]));
        this.field739 = this.method450(new Class253("ShulkersPeek", "Peek the shulkerbox when you middle click", (boolean)field741[0]));
        this.field743 = this.method450(new Class253("Maps", "Renders a preview of maps in tooltips", (boolean)field741[1]));
        INSTANCE = this;
    }

    public static class_332 method2651(Class64 class64) {
        return class64.field96;
    }

    public static Class318 method2652() {
        return INSTANCE;
    }

    private static void method2653(long l2) {
        Class318.field741[1] = l2 ^ 0x5EAE0CB02C679608L;
        Class318.field741[3] = l2 ^ 0x5EAE0CB02C6796A2L;
        Class318.field741[5] = l2 ^ 0x5EAE0CB05B679608L;
        Class318.field741[0] = l2 ^ 0x5EAE0CB02C679609L;
        Class318.field741[2] = l2 ^ 0xA151F34FD39869F7L;
        Class318.field741[8] = l2 ^ 0x5EAE0CB02C679613L;
        Class318.field741[6] = l2 ^ 0x5EAE0CB02C67960DL;
        Class318.field741[7] = l2 ^ 0x5EAE0CB02C679618L;
        Class318.field741[4] = l2 ^ 0x5EAE0CB02C679601L;
    }

    static {
        Class318.method2653(6822404436311643656L);
        field742 = new class_1799[(int)field741[8]];
    }

    private static class_332 method2654(Class64 class64) {
        return class64.method130();
    }

    public static class_332 method2655(Class64 class64) {
        return class64.field96;
    }

    private static Object method2656(Class248 class248) {
        return class248.method507();
    }

    public static class_332 method2657(Class64 class64) {
        return class64.field96;
    }

    public static class_332 method2658(Class64 class64) {
        return class64.field96;
    }

    private static Object method2659(Class248 class248) {
        return class248.method507();
    }

    public static class_332 method2660(Class64 class64) {
        return class64.field96;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

