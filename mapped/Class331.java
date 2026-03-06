/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 */
package mapped;

import java.awt.Color;
import java.util.HashMap;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class275;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class485;
import mapped.Class489;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class601;
import mapped.Class6181;
import mapped.Class6454;
import mapped.Class807;
import net.minecraft.class_2338;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class331
extends Class278 {
    Class248 field812;
    Class248 field813;
    Class248 field814;
    private static long[] field815 = new long[8];
    HashMap field816;
    private static Class331 INSTANCE;
    Class248 field817;
    Class248 field818;
    Class248 field819;
    Class248 field820;
    Class248 field821 = this.method450(new Class252("Fade-Time", "Time to fade", (int)field815[1], (int)field815[5], (int)field815[3]));
    Class248 field822;
    Class248 field823 = this.method450(new Class253("NoFail", "Do not wait for server response", (boolean)field815[1]));
    Class248 field824;

    static {
        Class331.method2921(176924078269811815L);
    }

    private static HashMap method2906(Class331 class331) {
        return Class331.method2911(class331);
    }

    private static void method2907(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method2908(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class331 method2909() {
        return INSTANCE;
    }

    private static Object method2910(Class248 class248) {
        return class248.method507();
    }

    public static HashMap method2911(Class331 class331) {
        return class331.field816;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2912(Class59 a2) {
        if (!Class331.method2915(this).isEmpty()) {
            int n2 = 45880;
            Class1745.method15538();
            return;
        }
        int n3 = 45879;
        block4: while (true) {
            switch (n3) {
                case 45880: {
                    n3 = 45878;
                    continue block4;
                }
                case 45879: {
                    return;
                }
            }
            break;
        }
        Class6009.method23560();
        this.field816.values().removeIf(arg_0 -> Class331.method2914(a2, arg_0));
        Class6009.method23561();
    }

    private static void method2913() {
        Class5836.method22897();
    }

    private Boolean method1269() {
        return ((Boolean)Class331.method2910(this.field823) == false ? (int)field815[4] : (int)field815[1]) != 0;
    }

    private static boolean method2914(Class59 a2, Class807 b2) {
        return b2.method12390(a2.method125());
    }

    public static HashMap method2915(Class331 class331) {
        return class331.field816;
    }

    public Class331() {
        super("PlaceEcho", "Render for your placement", Class556.field2759);
        this.field813 = this.method450(new Class252("TimeOut", "Waiting time for server response", (Number)((int)field815[1]), (Number)((int)field815[6]), (Number)((int)field815[3]), this::method1269));
        this.field818 = this.method450(new Class253("Box", "Render outline", (boolean)field815[4]));
        this.field824 = this.method450(new Class253("Fill", "Render fill", (boolean)field815[4]));
        this.field812 = this.method450(new Class251("BoxColor", "Outline color", new Color((int)field815[2], (int)field815[2], (int)field815[2], (int)field815[2])));
        this.field822 = this.method450(new Class251("FillColor", "Fill color", new Color((int)field815[2], (int)field815[2], (int)field815[2], (int)field815[7])));
        this.field820 = this.method450(new Class251("WaitingBoxColor", "Outline color of waiting for server response", new Color((int)field815[0], (int)field815[1], (int)field815[1], (int)field815[7]), (boolean)field815[4], (boolean)field815[1]));
        this.field814 = this.method450(new Class251("WaitingFillColor", "Fill color of waiting for server response", new Color((int)field815[0], (int)field815[1], (int)field815[1], (int)field815[7]), (boolean)field815[4], (boolean)field815[1]));
        this.field817 = this.method450(new Class260("Easing", "Easing", Class489.field2543, Class489.values()));
        this.field819 = this.method450(new Class260("Mode", "Echo mode", Class485.field2517, Class485.values()));
        this.field816 = new HashMap();
        INSTANCE = this;
    }

    public void method2916(class_2338 a2) {
        if (this.method1265()) {
            Class5659.method22184();
            return;
        }
    }

    private static void method2917() {
        Class4146.method20697();
    }

    private static void method2918() {
        Class3979.method19561();
    }

    private static int method2919(int n2, int n3, Class601 class601, Class275 class275) {
        return Class6181.method24099(n2, n3, class601, class275);
    }

    private static void method2920() {
        Class6454.method24594();
    }

    private static void method2921(long l2) {
        Class331.field815[5] = l2 ^ 0x2748F83057C4C9DL;
        Class331.field815[6] = l2 ^ 0x2748F83057C4D93L;
        Class331.field815[4] = l2 ^ 0x2748F83057C4C66L;
        Class331.field815[1] = l2 ^ 0x2748F83057C4C67L;
        Class331.field815[7] = l2 ^ 0x2748F83057C4C03L;
        Class331.field815[0] = l2 ^ 0x2748F83057C4CC7L;
        Class331.field815[3] = l2 ^ 0x2748F83057C47DFL;
        Class331.field815[2] = l2 ^ 0x2748F83057C4C98L;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

