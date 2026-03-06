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
public class Class253
extends Class248 {
    public static boolean $skidonion$998553684;

    public native Boolean method582(JsonObject var1);

    public Class253(String a2, String b2, Boolean c2) {
        super(a2, b2, c2);
    }

    @Override
    public void method505(Object object) {
        this.method583((Boolean)object);
    }

    public Class253(String a2, String b2, Boolean c2, Supplier d2) {
        super(a2, b2, c2, d2);
        this.field302.method24284(c2);
    }

    @Override
    public native Object method482(JsonObject var1);

    public void method583(Boolean a2) {
        super.method505(a2);
        if (a2.booleanValue() != this.field302.method24288()) {
            this.field302.method24284(a2);
        }
    }

    @Override
    public JsonObject method438() {
        JsonObject a2 = super.method438();
        a2.addProperty("value", (Boolean)this.method507());
        return a2;
    }

    static {
        ___.___(5, Class253.class);
        ____.___5_110(Class253.class);
    }

    private static native Object 1(char var0);
}

