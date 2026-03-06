/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1;
import mapped.Class1350;
import mapped.Class1406;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3374;
import mapped.Class3468;
import mapped.Class3778;
import mapped.Class4146;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class626;
import mapped.Class63;
import mapped.Class68;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class296
extends Class278 {
    private static long[] field546 = new long[5];
    Class248 field547 = this.method450(new Class260("Shadow", "Shadow mode", Class626.field3059, Class626.values()));
    Class248 field548;
    Class248 field549 = this.method450(new Class253("AntiAlias", "Applies antialiasing to font", (boolean)field546[4]));
    Class248 field550;
    Class248 field551;
    Class248 field552 = this.method450(new Class253("FractionalMetrics", "Applies fractional metrics to font", (boolean)field546[1]));
    Class248 field553 = this.method450(new Class252("Size", "The font size", (int)field546[3], (int)field546[0], (int)field546[2]));
    private static Class296 INSTANCE;

    public float method1836() {
        return ((Float)this.field551.method507()).floatValue();
    }

    public boolean method1837() {
        return (Boolean)Class296.method1845(this.field549);
    }

    public Class626 method1838() {
        return (Class626)((Object)Class296.method1854(this.field547));
    }

    private static void method1839(long l2) {
        Class296.field546[4] = l2 ^ 0x4B82BA0399B6A124L;
        Class296.field546[1] = l2 ^ 0x4B82BA0399B6A125L;
        Class296.field546[2] = l2 ^ 0x4B82BA0399B6A129L;
        Class296.field546[3] = l2 ^ 0x4B82BA0399B6A120L;
        Class296.field546[0] = l2 ^ 0x4B82BA0399B6A12CL;
    }

    private static void method1840() {
        Class298.method1924();
    }

    public static Class248 method1841(Class296 class296) {
        return class296.field553;
    }

    private static void method1842(long l2) {
        Class296.method1839(l2);
    }

    public float method1843() {
        return ((Float)this.field550.method507()).floatValue();
    }

    @Class1
    public void method1844(Class63 a2) {
        if (a2.method128() == Class543.field2690) {
            if (Class5836.field11397 != (float)((Integer)Class296.method1841(this).method507()).intValue()) {
                Class5836.method22907(((Integer)Class296.method1848(this.field553)).intValue());
            }
        }
    }

    public Class296() {
        super("Font", "Changes the client text to custom font rendering", Class556.field2757);
        this.field548 = this.method450(new Class252("VanillaShadow", "The vanilla shadow offset", Float.valueOf(Class1350.field5213), Float.valueOf(1.0f), Float.valueOf(Class1406.field5413)));
        this.field551 = this.method450(new Class252("ShadowOffset", "The font shadow offset", Float.valueOf(Class3468.field7597), Float.valueOf(0.8f), Float.valueOf(Class3778.field8566)));
        this.field550 = this.method450(new Class252("ShadowBrightness", "The font shadow brightness", Float.valueOf(0.0f), Float.valueOf(Class3374.field7330), Float.valueOf(0.7f)));
        INSTANCE = this;
        this.method1264();
    }

    private static Object method1845(Class248 class248) {
        return class248.method507();
    }

    private static void method1846() {
        Class1807.method15744();
    }

    private static void method1847() {
        Class5836.method22885();
    }

    private static Object method1848(Class248 class248) {
        return class248.method507();
    }

    public boolean method1849() {
        return (Boolean)this.field552.method507();
    }

    public float method1850() {
        return ((Float)this.field548.method507()).floatValue();
    }

    private static void method1851() {
        Class4146.method20697();
    }

    public static Class248 method1852(Class296 class296) {
        return class296.field552;
    }

    private static void method1853() {
        Class5659.method22184();
    }

    private static Object method1854(Class248 class248) {
        return class248.method507();
    }

    static {
        Class296.method1842(5441115824443531557L);
    }

    public static Class296 method1855() {
        return INSTANCE;
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method1856(Class68 a) {
        block6: {
            block7: {
                if (!Class5836.method22894()) {
                    return;
                }
                if (a.method128() != Class543.field2691) break block6;
                if (a.method140() == this.field549) ** GOTO lbl-1000
                if (a.method140() != Class296.method1852(this)) break block7;
                v0 = 50910;
                ** GOTO lbl13
            }
            v0 = 50911;
            if (true) ** GOTO lbl13
            block4: while (true) {
                v0 = 50909;
lbl13:
                // 3 sources

                switch (v0) {
                    case 50911: {
                        continue block4;
                    }
                    case 50910: lbl-1000:
                    // 2 sources

                    {
                        Class5836.method22885();
                    }
                }
                break;
            }
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

