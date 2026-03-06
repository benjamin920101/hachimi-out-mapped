/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonObject;
import java.util.function.BooleanSupplier;
import mapped.Class245;
import mapped.Class247;
import mapped.Class4146;
import mapped.Class5843;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class246
implements Class247,
Class245 {
    private int field292;
    private final Runnable field293;
    private final String field294;
    public boolean field295;
    private static long[] field296;
    public BooleanSupplier field297;
    public static boolean $skidonion$890408531;

    private static String method485(Class246 class246) {
        return class246.method472();
    }

    public Class246(String a2, int b2, Runnable c2, BooleanSupplier d2) {
        this(a2, b2, c2);
        this.field297 = d2;
    }

    @Override
    public JsonObject method438() {
        JsonObject a2 = new JsonObject();
        a2.addProperty("id", this.method472());
        a2.addProperty("value", (Number)this.method500());
        return a2;
    }

    private static void method486(long l2) {
        Class246.field296[2] = l2 ^ 0x33D27720CDBB5567L;
        Class246.field296[0] = l2 ^ 0xCC2D88DF3244AA99L;
        Class246.field296[1] = l2 ^ 0xCC2D88DF3244AA98L;
    }

    private static Class246 method487(Class246 class246, JsonObject jsonObject) {
        return class246.method492(jsonObject);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String method488() {
        int n2 = this.field292 != (int)field296[2] ? 19904 : 19905;
        int n3 = n2;
        if (n3 != 19904) {
            if (n3 != 19905) return "NONE";
            return "NONE";
        }
        String a2 = Class5843.method22921(this.field292);
        if (a2 == null) return "NONE";
        String string = a2.toUpperCase();
        return string;
    }

    public static String method489(Class246 class246) {
        return class246.field294;
    }

    public Class246(String a2, int b2, Runnable c2) {
        this.field294 = a2;
        this.field292 = b2;
        this.field293 = c2;
    }

    static {
        ___.___(9, Class246.class);
        ____.___9_150(Class246.class);
    }

    public void method490() {
        this.field295 = (int)field296[0];
    }

    public static String method491(Class246 class246) {
        return class246.field294;
    }

    public native Class246 method492(JsonObject var1);

    @Override
    public native Object method482(JsonObject var1);

    public void method493(int a2) {
        this.field292 = a2;
    }

    public void method494() {
        Class246.method501(this).run();
    }

    private static void method495() {
        Class4146.method20697();
    }

    @Override
    public String method472() {
        Object[] objectArray = new Object[(int)field296[0]];
        objectArray[(int)Class246.field296[1]] = Class246.method496(this).toLowerCase();
        return String.format("%s-macro", objectArray);
    }

    private static String method496(Class246 class246) {
        return Class246.method491(class246);
    }

    public void method497() {
        this.field295 = (int)field296[1];
    }

    public Runnable method498() {
        return this.field293;
    }

    public String method499() {
        return Class246.method489(this);
    }

    public int method500() {
        return this.field292;
    }

    public static Runnable method501(Class246 class246) {
        return class246.field293;
    }

    private static native Object 1(char var0);
}

