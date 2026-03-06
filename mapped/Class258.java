/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.class_1299
 *  net.minecraft.class_2960
 *  net.minecraft.class_7923
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
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class3814;
import mapped.Class3815;
import mapped.Class543;
import mapped.Class5659;
import mapped.Class68;
import net.minecraft.class_1299;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class258
extends Class248 {
    private static long[] field320;
    public static boolean $skidonion$890408969;

    @Override
    public JsonObject method438() {
        JsonObject c2 = super.method438();
        JsonArray d2 = new JsonArray();
        Iterator iterator = ((List)this.method507()).iterator();
        if (iterator.hasNext()) {
            class_1299 b2 = (class_1299)iterator.next();
            class_2960 a2 = class_7923.field_41177.method_10221((Object)b2);
            d2.add(a2.toString());
            Class1668.method15147(146312698, -532509789, 1162388006, 1263558484);
            return null;
        }
        c2.add("value", (JsonElement)d2);
        return c2;
    }

    @Override
    public native Object method482(JsonObject var1);

    public Class258(String a2, String b2, class_1299 ... c2) {
        super(a2, b2, new ArrayList<class_1299>(Arrays.asList(c2)));
    }

    private static void method612(long l2) {
        Class258.field320[0] = l2 ^ 0xEAD3F55A7FBD5C0DL;
    }

    public void method613(class_1299 a2) {
        Class68 b2 = new Class68(this);
        b2.method127(Class543.field2690);
        Class3815.INSTANCE.method18539(b2);
        ((List)this.method507()).remove(a2);
        b2.method127(Class543.field2691);
        Class258.method620().method18539(b2);
    }

    private static void method614() {
        Class5659.method22184();
    }

    private static void method615() {
        Class1745.method15538();
    }

    public static Class3814 method616() {
        return Class3815.INSTANCE;
    }

    public native List method617(JsonObject var1);

    public boolean method618(Object a2) {
        if (a2 instanceof class_1299) {
            return ((List)this.field305).contains(a2);
        }
        return (int)field320[0] != 0;
    }

    static {
        ___.___(11, Class258.class);
        ____.___11_160(Class258.class);
    }

    public static Class3814 method619() {
        return Class3815.INSTANCE;
    }

    private static Class3814 method620() {
        return Class258.method616();
    }

    public static Class543 method621() {
        return Class543.field2690;
    }

    public void method622() {
        Class68 a2 = new Class68(this);
        a2.method127(Class543.field2690);
        Class258.method619().method18539(a2);
        ((List)this.method507()).clear();
        a2.method127(Class543.field2691);
        Class3815.INSTANCE.method18539(a2);
    }

    public void method623(class_1299 a2) {
        Class68 b2 = new Class68(this);
        b2.method127(Class258.method621());
        Class3815.INSTANCE.method18539(b2);
        ((List)this.method507()).add(a2);
        b2.method127(Class543.field2691);
        Class3815.INSTANCE.method18539(b2);
    }

    private static native Object 1(char var0);
}

