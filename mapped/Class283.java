/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package mapped;

import mapped.Class1;
import mapped.Class116;
import mapped.Class120;
import mapped.Class1503;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3206;
import mapped.Class3336;
import mapped.Class3921;
import mapped.Class4146;
import mapped.Class489;
import mapped.Class556;
import mapped.Class5759;
import mapped.Class5923;
import net.minecraft.class_332;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class283
extends Class278 {
    Class248 field442;
    private static Class283 INSTANCE;
    Class3336 field443;
    Class248 field444;
    private static long[] field445;
    Class248 field446 = this.method450(new Class253("Animation", "", (boolean)field445[3]));

    public Class283() {
        super("BetterHotbar", "Some renders for hotbar", Class556.field2759);
        this.field444 = this.method450(new Class252("Length", "Timer for the animation", (int)field445[1], (int)field445[0], (int)field445[2]));
        this.field442 = this.method450(new Class260("Easing", "Animation easing", Class489.field2551, Class489.values()));
        this.field443 = new Class3336();
        INSTANCE = this;
    }

    private static class_332 method1437(Class120 class120) {
        return class120.method218();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method1438(Class120 b) {
        block1: {
            block2: {
                if (!((Boolean)this.field446.method507()).booleanValue()) break block2;
                v0 = 39333;
                ** GOTO lbl9
            }
            v0 = 39334;
            if (true) ** GOTO lbl9
            do {
                v0 = var2_2 = 39332;
lbl9:
                // 3 sources

                if (var2_2 == 39333) break block1;
            } while (var2_2 == 39334);
            Class1503.method14417(Class5923.field11742, 0.026747644f);
            return;
        }
        b.method10();
        a = this.field443.method17145(Class283.method1446(b), ((Integer)Class283.method1444(this.field444)).intValue(), (Class489)Class283.method1445(this.field442));
        Class283.method1437(b).method_52706(b.method212(), (int)a, Class283.method1441(b), b.method219(), b.method217());
    }

    private static int method1439(int n2, int n3, Class3921 class3921, Class248 class248) {
        return Class3206.method16014(n2, n3, class3921, class248);
    }

    private static int method1440(int n2, int n3, Class5759 class5759, Class116 class116) {
        return Class3206.method16011(n2, n3, class5759, class116);
    }

    private static int method1441(Class120 class120) {
        return class120.method216();
    }

    private static void method1442() {
        Class4146.method20697();
    }

    static {
        field445 = new long[4];
        Class283.method1448(-4106672156516807197L);
    }

    public static Class283 method1443() {
        return INSTANCE;
    }

    private static Object method1444(Class248 class248) {
        return class248.method507();
    }

    private static Object method1445(Class248 class248) {
        return class248.method507();
    }

    private static int method1446(Class120 class120) {
        return class120.method215();
    }

    private static void method1447() {
        Class298.method1924();
    }

    private static void method1448(long l2) {
        Class283.field445[2] = l2 ^ 0xC7022B6E85D40CBDL;
        Class283.field445[0] = l2 ^ 0xC7022B6E85D40CCFL;
        Class283.field445[3] = l2 ^ 0xC7022B6E85D40DE2L;
        Class283.field445[1] = l2 ^ 0xC7022B6E85D40DE3L;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

