/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.item.Item
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
import java.util.Iterator;
import java.util.List;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class3791;
import mapped.Class3814;
import mapped.Class3815;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class455;
import mapped.Class543;
import mapped.Class5736;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class68;
import mapped.Class778;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class249
extends Class248 {
    private static long[] field306;
    public static boolean $skidonion$998554805;

    public void method518(class_1792 a2) {
        Class68 b2 = new Class68(this);
        b2.method127(Class543.field2690);
        Class3815.INSTANCE.method18539(b2);
        ((List)this.method507()).add(a2);
        b2.method127(Class543.field2691);
        Class3815.INSTANCE.method18539(b2);
    }

    private static void method519(long l2) {
        Class249.field306[0] = l2 ^ 0xBFD8B58CD4664527L;
    }

    private static void method520() {
        Class1745.method15538();
    }

    public Class249(String a2, String b2, class_1792 ... c2) {
        super(a2, b2, new ArrayList<class_1792>(Arrays.asList(c2)));
    }

    static {
        ___.___(53, Class249.class);
        ____.___53_60(Class249.class);
    }

    @Override
    public native Object method482(JsonObject var1);

    private static int method521(int n2, int n3, Class543 class543, Class455 class455) {
        return Class3791.method18337(n2, n3, class543, class455);
    }

    public boolean method522(Object a2) {
        if (a2 instanceof class_1792) {
            return ((List)this.field305).contains(a2);
        }
        return (int)field306[0] != 0;
    }

    public static Class3814 method523() {
        return Class3815.INSTANCE;
    }

    public native List method524(JsonObject var1);

    private static boolean method525() {
        return Class5836.method22894();
    }

    private static Class3814 method526() {
        return Class249.method523();
    }

    public void method527(class_1792 a2) {
        Class68 b2 = new Class68(this);
        b2.method127(Class543.field2690);
        Class3815.INSTANCE.method18539(b2);
        ((List)this.method507()).remove(a2);
        b2.method127(Class543.field2691);
        Class3815.INSTANCE.method18539(b2);
    }

    private static void method528() {
        Class3979.method19561();
    }

    private static int method529(int n2, int n3, Class778 class778, Class5736 class5736) {
        return Class3791.method18348(n2, n3, class778, class5736);
    }

    public void method530() {
        Class68 a2 = new Class68(this);
        a2.method127(Class543.field2690);
        Class3815.INSTANCE.method18539(a2);
        ((List)this.method507()).clear();
        a2.method127(Class543.field2691);
        Class249.method526().method18539(a2);
    }

    private static void method531(long l2) {
        Class249.method519(l2);
    }

    private static void method532(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method533() {
        Class5836.method22890();
    }

    @Override
    public JsonObject method438() {
        JsonObject c2 = super.method438();
        JsonArray d2 = new JsonArray();
        Iterator iterator = ((List)this.method507()).iterator();
        if (iterator.hasNext()) {
            class_1792 b2 = (class_1792)iterator.next();
            class_2960 a2 = class_7923.field_41178.method_10221((Object)b2);
            d2.add(a2.toString());
            Class4146.method20697();
            return null;
        }
        c2.add("value", (JsonElement)d2);
        return c2;
    }

    public Class249(String a2, String b2, List c2) {
        super(a2, b2, c2);
    }

    private static native Object 1(char var0);
}

