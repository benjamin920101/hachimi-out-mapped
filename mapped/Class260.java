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
import mapped.Class248;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class260
extends Class248 {
    private static long[] field321;
    private final Enum[] field322;
    private int field323;
    public static boolean $skidonion$2045998542;

    public static int method635(Class260 class260) {
        return class260.field323;
    }

    public Class260(String a2, String b2, Enum c2, Enum[] d2) {
        super(a2, b2, c2);
        this.field322 = d2;
    }

    public static int method636(Class260 class260) {
        return class260.field323;
    }

    public Enum method637() {
        this.field323 = this.field323 + (int)field321[1] > this.field322.length - (int)field321[1] ? (int)field321[0] : this.field323 + (int)field321[1];
        return this.field322[Class260.method641(this)];
    }

    private static void method638(long l2) {
        Class260.field321[1] = l2 ^ 0x6B9811986A3F92FBL;
        Class260.field321[0] = l2 ^ 0x6B9811986A3F92FAL;
    }

    public Enum[] method639() {
        return this.field322;
    }

    @Override
    public JsonObject method438() {
        JsonObject a2 = super.method438();
        a2.addProperty("value", this.method640());
        return a2;
    }

    public String method640() {
        return ((Enum)this.method507()).name();
    }

    public Class260(String a2, String b2, Enum c2, Enum[] d2, Supplier e2) {
        super(a2, b2, c2, e2);
        this.field322 = d2;
    }

    static {
        ___.___(3, Class260.class);
        ____.___3_110(Class260.class);
    }

    private static int method641(Class260 class260) {
        return Class260.method645(class260);
    }

    @Override
    public native Object method482(JsonObject var1);

    private static Enum method642(Class260 class260, JsonObject jsonObject) {
        return class260.method643(jsonObject);
    }

    public native Enum method643(JsonObject var1);

    public Enum method644() {
        this.field323 = Class260.method636(this) - (int)field321[1] < 0 ? this.field322.length - (int)field321[1] : Class260.method635(this) - (int)field321[1];
        return this.field322[this.field323];
    }

    public static int method645(Class260 class260) {
        return class260.field323;
    }

    private static native Object 1(char var0);
}

