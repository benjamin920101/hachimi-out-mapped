/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  skidonion.sAnhI.___.____
 */
package mapped;

import mapped.Class1365;
import mapped.Class1503;
import mapped.Class246;
import mapped.Class248;
import mapped.Class253;
import mapped.Class255;
import mapped.Class259;
import mapped.Class277;
import mapped.Class374;
import mapped.Notification;
import mapped.Class489;
import mapped.Class556;
import mapped.Class6283;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

public class Class278
extends Class277
implements Class374 {
    Class248 field397;
    private final Class6283 field398 = new Class6283((boolean)field403[2], 300.0f, Class489.field2533);
    Class248 field399;
    Class248 field400;
    Class248 field401;
    Class248 field402 = this.method450(new Class255("Enabled", "The module enabled state", (boolean)field403[2]));
    private static long[] field403;
    public static boolean $skidonion$998554687;

    private static void method1256(Class248 class248, Object object) {
        class248.method505(object);
    }

    public static Class248 method1257(Class278 class278) {
        return class278.field397;
    }

    public Class246 method1258() {
        return (Class246)this.field397.method507();
    }

    static {
        ___.___(28, Class278.class);
        ____.___28_50(Class278.class);
    }

    public Class248 method1259() {
        return this.field399;
    }

    @Override
    public void method1260(boolean a2) {
        Class278.method1256(this.field400, a2);
    }

    private boolean method1261() {
        return (Boolean)this.field399.method507();
    }

    private static void method1262(long l2) {
        Class278.field403[2] = l2 ^ 0x3F6F9CA58424B876L;
        Class278.field403[1] = l2 ^ 0xC090635A7BDB4789L;
        Class278.field403[0] = l2 ^ 0x3F6F9CA58424B877L;
    }

    private static Object method1263(Class248 class248) {
        return class248.method507();
    }

    public Class278(String a2, String b2, Class556 c2) {
        super(a2, b2, c2);
        this.field399 = this.method450(new Class253("ToggleOnRelease", "Toggle the module when you released the keybind", (boolean)field403[2], Class278::method1269));
        this.field400 = this.method450(new Class253("Hidden", "The hidden state of the module in the arraylist", (boolean)field403[2]));
        this.field401 = this.method450(new Class253("Notify", "Notifies you when the module is toggled in chat", (boolean)field403[0], Class278::method1278));
        this.field397 = this.method450(new Class259("Keybind", "The keybind to toggle the module", new Class246(this.method472(), (int)field403[1], this::method1273, this::method1261)));
    }

    public void method1264() {
        this.field402.method505((boolean)field403[0]);
        this.method1274();
        if (((Boolean)this.field401.method507()).booleanValue()) {
            if (Class278.field290.field_1687 != null && Notification.INSTANCE.method1265()) {
                Class1365.method13948("\u00a72[+] \u00a7f" + this.method446(), this.hashCode());
            }
        }
    }

    public boolean method1265() {
        return (Boolean)this.field402.method507();
    }

    public static Class248 method1266(Class278 class278) {
        return class278.field401;
    }

    public void method1267(boolean a2) {
        Class278.method1276(this).method505(a2);
    }

    public void method1268() {
        this.field402.method505((boolean)field403[2]);
        this.method1279();
        if (((Boolean)Class278.method1266(this).method507()).booleanValue() && Class278.field290.field_1687 != null) {
            Class1365.method13948("\u00a74[-] \u00a7f" + this.method446(), this.hashCode());
        }
    }

    private static Boolean method1269() {
        return (boolean)field403[2];
    }

    public void method1270(int a2) {
        this.field397.method511(this);
        ((Class259)Class278.method1257(this)).method628(a2);
    }

    private static void method1271(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public boolean method1272() {
        return (Boolean)Class278.method1263(this.field401);
    }

    public Class278(String a2, String b2, Class556 c2, Integer d2) {
        this(a2, b2, c2);
        this.method1270(d2);
    }

    public void method1273() {
        if (this.method1265()) {
            this.method1268();
            Class278.method1271(0.858607f, 0.6331944f);
            return;
        }
        this.method1264();
    }

    protected native void method1274();

    public Class6283 method1275() {
        return this.field398;
    }

    public static Class248 method1276(Class278 class278) {
        return class278.field401;
    }

    private static Object method1277(Class248 class248) {
        return class248.method507();
    }

    private static Boolean method1278() {
        return (boolean)field403[2];
    }

    protected native void method1279();

    @Override
    public boolean method1280() {
        return (Boolean)Class278.method1277(this.field400);
    }

    private static native Object I(char var0);
}

