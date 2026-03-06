/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class556;
import mapped.Class80;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class375
extends Class278 {
    private static long[] field1237 = new long[1];
    Class248 field1238 = this.method450(new Class252("Spin", "The spin speed of crystals", Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(10.0f)));
    Class248 field1239 = this.method450(new Class253("Bounce", "The crystal bounce", (boolean)field1237[0]));
    Class248 field1240 = this.method450(new Class252("Scale", "The scale of crystals", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(1.5f)));
    private static Class375 INSTANCE;

    @Class1
    public void method4924(Class80 a2) {
        a2.method168(((Float)Class375.method4927(this.field1238)).floatValue());
        a2.method163((Boolean)Class375.method4925(this.field1239));
        a2.method167(((Float)Class375.method4935(this).method507()).floatValue());
    }

    private static Object method4925(Class248 class248) {
        return class248.method507();
    }

    public boolean method4926() {
        return (Boolean)this.field1239.method507();
    }

    private static Object method4927(Class248 class248) {
        return class248.method507();
    }

    private static void method4928(long l2) {
        Class375.method4931(l2);
    }

    private static Object method4929(Class248 class248) {
        return class248.method507();
    }

    public float method4930() {
        return ((Float)Class375.method4929(this.field1240)).floatValue();
    }

    private static void method4931(long l2) {
        Class375.field1237[0] = l2 ^ 0x3D7AB15FAA2B7D83L;
    }

    public static Class375 method4932() {
        return INSTANCE;
    }

    static {
        Class375.method4928(4430048207907290498L);
    }

    public static Class248 method4933(Class375 class375) {
        return class375.field1238;
    }

    public float method4934() {
        return ((Float)Class375.method4933(this).method507()).floatValue();
    }

    public static Class248 method4935(Class375 class375) {
        return class375.field1240;
    }

    public Class375() {
        super("CrystalModel", "Renders the crystal model", Class556.field2759);
        INSTANCE = this;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

