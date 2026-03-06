/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.block.Block
 *  net.minecraft.util.Identifier
 *  net.minecraft.registry.Registries
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import mapped.Class248;
import mapped.Class3392;
import mapped.Class3814;
import mapped.Class3815;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4082;
import mapped.Class4146;
import mapped.Class446;
import mapped.Class543;
import mapped.Class6259;
import mapped.Class6454;
import mapped.Class68;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class257
extends Class248 {
    private static long[] field319;
    public static boolean $skidonion$998554751;

    public static Class3814 method599() {
        return Class3815.INSTANCE;
    }

    public boolean method600(Object b2) {
        if (b2 instanceof class_2248) {
            class_2248 a2 = (class_2248)b2;
            return ((List)this.field305).contains(a2);
        }
        return (int)field319[0] != 0;
    }

    @Override
    public JsonObject method438() {
        JsonObject c2 = super.method438();
        JsonArray d2 = new JsonArray();
        for (class_2248 b2 : (List)this.method507()) {
            class_2960 a2 = class_7923.field_41175.method_10221((Object)b2);
            d2.add(a2.toString());
        }
        c2.add("value", (JsonElement)d2);
        return c2;
    }

    public void method601(class_2248 a2) {
        Class68 b2 = new Class68(this);
        b2.method127(Class543.field2690);
        Class257.method599().method18539(b2);
        ((List)this.method507()).remove(a2);
        b2.method127(Class543.field2691);
        Class3815.INSTANCE.method18539(b2);
    }

    public Class257(String a2, String b2, class_2248 ... c2) {
        super(a2, b2, new ArrayList<class_2248>(Arrays.asList(c2)));
    }

    @Override
    public native Object method482(JsonObject var1);

    static {
        ___.___(48, Class257.class);
        ____.___48_110(Class257.class);
    }

    public Class257(String a2, String b2, Supplier c2, class_2248 ... d2) {
        super(a2, b2, new ArrayList<class_2248>(Arrays.asList(d2)), c2);
    }

    private static int method602(int n2, int n3, Class4146 class4146, Class446 class446) {
        return Class4082.method20347(n2, n3, class4146, class446);
    }

    private static boolean method603() {
        return Class3979.method19539();
    }

    private static void method604(long l2) {
        Class257.field319[0] = l2 ^ 0x47541F70EDB1EC14L;
    }

    private static int method605(int n2, int n3, Class3392 class3392, Class6259 class6259) {
        return Class4082.method20355(n2, n3, class3392, class6259);
    }

    public void method606(class_2248 a2) {
        Class68 b2 = new Class68(this);
        b2.method127(Class543.field2690);
        Class3815.INSTANCE.method18539(b2);
        ((List)this.method507()).add(a2);
        b2.method127(Class543.field2691);
        Class3815.INSTANCE.method18539(b2);
    }

    public void method607() {
        Class68 a2 = new Class68(this);
        a2.method127(Class543.field2690);
        Class3815.INSTANCE.method18539(a2);
        ((List)this.method507()).clear();
        a2.method127(Class543.field2691);
        Class3815.INSTANCE.method18539(a2);
    }

    private static void method608(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method609() {
        Class3979.method19561();
    }

    public native List method610(JsonObject var1);

    private static void method611(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static native Object 1(char var0);
}

