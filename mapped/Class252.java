/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonObject;
import java.util.function.Supplier;
import mapped.Class1668;
import mapped.Class248;
import mapped.Blink;
import mapped.Class3979;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class619;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class252
extends Class248 {
    private final Number field310;
    private final Class619 field311;
    private final Number field312;
    private final int field313;
    private static long[] field314;
    public static boolean $skidonion$998555091;

    static {
        ___.___(31, Class252.class);
        ____.___31_00(Class252.class);
    }

    private static void method561(long l2) {
        Class252.field314[1] = l2 ^ 0xB6A2C20E62FD47B6L;
        Class252.field314[0] = l2 ^ 0xB6A2C20E62FD47B7L;
    }

    private static void method562() {
        Class3979.method19561();
    }

    public static Number method563(Class252 class252) {
        return class252.field312;
    }

    public double method564() {
        Number a2 = (Number)this.method507();
        return a2.doubleValue() * a2.doubleValue();
    }

    public Class252(String a2, String b2, Number c2, Number d2, Number e2, Class619 f2, int g2) {
        super(a2, b2, d2);
        this.field312 = c2;
        this.field310 = e2;
        this.field311 = f2;
        this.field313 = g2;
    }

    private static void method565() {
        Class5836.method22897();
    }

    public Class619 method566() {
        return this.field311;
    }

    public Class252(String a2, String b2, Number c2, Number d2, Number e2) {
        this(a2, b2, c2, d2, e2, Class619.field3013);
    }

    public Number method567() {
        return this.field310;
    }

    public boolean method568() {
        return (this.field310.doubleValue() == ((Number)this.method507()).doubleValue() ? (int)field314[0] : (int)field314[1]) != 0;
    }

    public Number method569() {
        return Class252.method563(this);
    }

    public Class252(String a2, String b2, Number c2, Number d2, Number e2, Class619 f2) {
        super(a2, b2, d2);
        this.field312 = c2;
        this.field310 = e2;
        this.field311 = f2;
        String g2 = String.valueOf(d2);
        this.field313 = g2.substring(g2.indexOf(".") + (int)field314[0]).length();
    }

    private static boolean method570() {
        return Blink.method4987();
    }

    public native Number method571(JsonObject var1);

    private static void method572(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method573() {
        Class5659.method22184();
    }

    private static void method574(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public Class252(String a2, String b2, Number c2, Number d2, Number e2, Supplier f2) {
        this(a2, b2, c2, d2, e2, Class619.field3013, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method575(Number a2) {
        if (a2.doubleValue() < this.field312.doubleValue()) {
            super.method505(this.field312);
            return;
        }
        int n2 = a2.doubleValue() > this.field310.doubleValue() ? 31114 : 31115;
        block4: while (true) {
            switch (n2) {
                case 31115: {
                    n2 = 31113;
                    continue block4;
                }
                case 31114: {
                    super.method505(this.field310);
                    return;
                }
            }
            break;
        }
        super.method505(a2);
    }

    @Override
    public void method505(Object object) {
        this.method575((Number)object);
    }

    private static boolean method576() {
        return Class5659.method22111();
    }

    @Override
    public native Object method482(JsonObject var1);

    public int method577() {
        return this.field313;
    }

    public Class252(String a2, String b2, Number c2, Number d2, Number e2, Class619 f2, Supplier g2) {
        super(a2, b2, d2, g2);
        this.field312 = c2;
        this.field310 = e2;
        this.field311 = f2;
        String h2 = String.valueOf(d2);
        this.field313 = h2.substring(h2.indexOf(".") + (int)field314[0]).length();
    }

    private static void method578(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method579() {
        Class5836.method22890();
    }

    @Override
    public JsonObject method438() {
        JsonObject a2 = super.method438();
        if (this.method507() instanceof Integer) {
            a2.addProperty("value", (Number)this.method507());
        } else if (this.method507() instanceof Float) {
            a2.addProperty("value", (Number)this.method507());
        } else {
            if (!(this.method507() instanceof Double)) {
                Class6009.method23561();
                return null;
            }
            a2.addProperty("value", (Number)this.method507());
        }
        return a2;
    }

    public boolean method580() {
        return (this.field312.doubleValue() == ((Number)this.method507()).doubleValue() ? (int)field314[0] : (int)field314[1]) != 0;
    }

    private static Number method581(Class252 class252, JsonObject jsonObject) {
        return class252.method571(jsonObject);
    }

    private static native Object 1(char var0);
}

