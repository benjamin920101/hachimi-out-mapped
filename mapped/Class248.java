/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.ApiStatus$Internal
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonObject;
import java.util.function.Supplier;
import mapped.Class244;
import mapped.Class245;
import mapped.Class247;
import mapped.Class3815;
import mapped.Class489;
import mapped.Class543;
import mapped.Class6283;
import mapped.Class68;
import org.jetbrains.annotations.ApiStatus;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

public abstract class Class248
implements Class247,
Class245 {
    private final String field298;
    private final String field299;
    private Class244 field300;
    private final Object field301;
    protected final Class6283 field302 = new Class6283((boolean)field304[0], 300.0f, Class489.field2533);
    private Supplier field303;
    private static long[] field304;
    protected Object field305;
    public static boolean $skidonion$890408397;

    public Class244 method502() {
        return this.field300;
    }

    public boolean method503() {
        if (this.field303 != null) {
            return (Boolean)this.field303.get();
        }
        return (int)field304[2] != 0;
    }

    public String method504() {
        return Class248.method513(this);
    }

    public void method505(Object a2) {
        if (a2 == null) {
            throw new NullPointerException("Null values not supported!");
        }
        Class68 b2 = new Class68(this);
        b2.method127(Class543.field2690);
        Class3815.INSTANCE.method18539(b2);
        this.field305 = a2;
        b2.method127(Class543.field2691);
        Class3815.INSTANCE.method18539(b2);
    }

    public static Class6283 method506(Class248 class248) {
        return class248.field302;
    }

    public Object method507() {
        return this.field305;
    }

    private static void method508(long l2) {
        Class248.field304[0] = l2 ^ 0x9B3F5CB9B0440441L;
        Class248.field304[2] = l2 ^ 0x9B3F5CB9B0440440L;
        Class248.field304[1] = l2 ^ 0x9B3F5CB9B0440443L;
    }

    private static Boolean method509(boolean a2) {
        return a2;
    }

    public void method510() {
        this.method505(Class248.method517(this));
    }

    public void method511(Class244 a2) {
        this.field300 = a2;
    }

    public String method512() {
        return this.field298;
    }

    @Override
    public JsonObject method438() {
        JsonObject a2 = new JsonObject();
        a2.addProperty("name", this.method512());
        a2.addProperty("id", this.method472());
        return a2;
    }

    public static String method513(Class248 class248) {
        return class248.field299;
    }

    private static void method514(long l2) {
        Class248.method508(l2);
    }

    public Class248(String a2, String b2, Object c2, Supplier d2) {
        this(a2, b2, c2);
        this.field303 = d2;
    }

    static {
        ___.___(29, Class248.class);
        ____.___29_160(Class248.class);
    }

    @Override
    public native Object method482(JsonObject var1);

    public void method515(boolean a2) {
        this.field303 = () -> Class248.method509(a2);
    }

    @ApiStatus.Internal
    public Class248(String a2, String b2) {
        this.field298 = a2;
        this.field299 = b2;
        this.field301 = null;
    }

    @Override
    public String method472() {
        Object[] objectArray = new Object[(int)field304[1]];
        objectArray[(int)Class248.field304[0]] = this.field300.method446().toLowerCase();
        objectArray[(int)Class248.field304[2]] = this.field298.toLowerCase();
        return String.format("%s-%s-config", objectArray);
    }

    public Class6283 method516() {
        return Class248.method506(this);
    }

    public Class248(String a2, String b2, Object c2) {
        if (c2 == null) {
            throw new NullPointerException("Null values not supported");
        }
        this.field298 = a2;
        this.field299 = b2;
        this.field305 = c2;
        this.field301 = c2;
    }

    public static Object method517(Class248 class248) {
        return class248.field301;
    }

    private static native Object I(char var0);
}

