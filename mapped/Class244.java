/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.lang.runtime.SwitchBootstraps;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import mapped.Class1038;
import mapped.Class1108;
import mapped.Class118;
import mapped.Class120;
import mapped.Class124;
import mapped.Class1280;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class196;
import mapped.Class245;
import mapped.Class246;
import mapped.Class247;
import mapped.Class248;
import mapped.Class249;
import mapped.Class250;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class255;
import mapped.Class257;
import mapped.Class259;
import mapped.Class260;
import mapped.Class346;
import mapped.Class36;
import mapped.Class3833;
import mapped.Class3979;
import mapped.Class398;
import mapped.Class4036;
import mapped.Class4138;
import mapped.Class4146;
import mapped.Class421;
import mapped.Class469;
import mapped.Class574;
import mapped.Class5836;
import mapped.Class696;
import mapped.Class717;
import mapped.Class947;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class244
implements Class247,
Class245 {
    private final Map field286 = Collections.synchronizedMap(new LinkedHashMap());
    private static long[] field287;
    public static boolean field288;
    public static Random field289;
    public static class_310 field290;
    protected final String field291;
    public static boolean $skidonion$998553887;

    public String method446() {
        return this.field291;
    }

    protected void method447(Class248 a2) {
        this.field286.remove(a2.method472());
    }

    private static void method448() {
        Class4146.method20694();
    }

    private static void method449(Class255 class255, Boolean bl2) {
        class255.method583(bl2);
    }

    protected native Class248 method450(Class248 var1);

    protected void method451(Class248 ... b2) {
        Class248[] class248Array = b2;
        int n2 = class248Array.length;
        for (int i2 = (int)field287[0]; i2 < n2; ++i2) {
            Class248 a2 = class248Array[i2];
            this.method450(a2);
        }
    }

    private static void method452(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static int method453(int n2, int n3, Class118 class118, Class421 class421) {
        return Class947.method12692(n2, n3, class118, class421);
    }

    public Class244(String a2) {
        this.field291 = a2;
    }

    private static void method454(long l2) {
        Class244.method475(l2);
    }

    private static void method455(Class255 class255) {
        class255.method593();
    }

    private static void method456() {
        Class5836.method22885();
    }

    private static void method457() {
        Class1503.method14420();
    }

    private static void method458() {
        Class5836.method22890();
    }

    private static void method459(Class248 class248, Class244 class244) {
        class248.method511(class244);
    }

    private static int method460(int n2, int n3, Class196 class196, Class260 class260) {
        return Class947.method12696(n2, n3, class196, class260);
    }

    private static int method461(int n2, int n3, Class346 class346, Class696 class696) {
        return Class947.method12702(n2, n3, class346, class696);
    }

    private static void method462() {
        Class1503.method14420();
    }

    private static void method463(Class248 w2, JsonObject x2) {
        try {
            Class248 class248 = w2;
            Objects.requireNonNull(class248);
            Class248 t2 = class248;
            int u2 = (int)field287[0];
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{Class255.class, Class253.class, Class251.class, Class260.class, Class249.class, Class257.class, Class252.class, Class250.class, Class259.class}, (Object)t2, u2)) {
                case 0: {
                    int b2;
                    Class255 c2 = (Class255)t2;
                    Boolean a2 = c2.method582(x2);
                    int n2 = b2 = a2 == c2.method507() ? (int)field287[1] : (int)field287[0];
                    if (b2 == 0) {
                        if (Class244.method474(Class244.method484()) != null && Class244.field290.field_1724 != null) {
                            if (!a2.booleanValue()) {
                                Class4036.method20085(Class1280.field4988, 0.034924865f, Class1038.field4268, Class4138.field9614, 0.8232518f, 0.52089757f);
                                return;
                            }
                            c2.method587();
                            break;
                        }
                        Class244.method449(c2, a2);
                    }
                    break;
                }
                case 1: {
                    Class253 e2 = (Class253)t2;
                    Boolean d2 = e2.method582(x2);
                    e2.method583(d2);
                    break;
                }
                case 2: {
                    Class251 g2 = (Class251)t2;
                    Color f2 = Class244.method479(g2, x2);
                    g2.method505(f2);
                    break;
                }
                case 3: {
                    Class260 i2 = (Class260)t2;
                    Enum h2 = Class244.method464(i2, x2);
                    if (h2 != null) {
                        i2.method505(h2);
                    }
                    break;
                }
                case 4: {
                    Class249 k2 = (Class249)t2;
                    List j2 = k2.method524(x2);
                    k2.method505(j2);
                    break;
                }
                case 5: {
                    Class257 m2 = (Class257)t2;
                    List l2 = m2.method610(x2);
                    m2.method505(l2);
                    Class4146.method20694();
                    return;
                }
                case 6: {
                    Class252 o2 = (Class252)t2;
                    Number n3 = o2.method571(x2);
                    Class244.method473(o2, n3);
                    break;
                }
                case 7: {
                    Class250 q2 = (Class250)t2;
                    String p2 = q2.method534(x2);
                    q2.method505(p2);
                    break;
                }
                case 8: {
                    Class259 s2 = (Class259)t2;
                    Class246 r2 = s2.method632(x2);
                    s2.method628(r2.method500());
                    break;
                }
            }
        }
        catch (Exception v2) {
            Object[] objectArray = new Object[(int)field287[1]];
            objectArray[(int)Class244.field287[0]] = w2.method512();
            Class3979.method19536("Couldn't parse Json for {}!", objectArray);
            v2.printStackTrace();
        }
    }

    private static Enum method464(Class260 class260, JsonObject jsonObject) {
        return class260.method643(jsonObject);
    }

    private static int method465(int n2, int n3, Class3833 class3833, Class36 class36) {
        return Class947.method12677(n2, n3, class3833, class36);
    }

    private static int method466(int n2, int n3, Class124 class124, Class120 class120) {
        return Class947.method12684(n2, n3, class124, class120);
    }

    private static void method467() {
        Class4146.method20697();
    }

    private static void method468(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static int method469(int n2, int n3, Class717 class717, Class574 class574) {
        return Class947.method12687(n2, n3, class717, class574);
    }

    private static int method470(int n2, int n3, Class398 class398, Class469 class469) {
        return Class947.method12691(n2, n3, class398, class469);
    }

    public Collection method471() {
        return this.field286.values();
    }

    @Override
    public String method472() {
        Object[] objectArray = new Object[(int)field287[1]];
        objectArray[(int)Class244.field287[0]] = this.field291.toLowerCase();
        return String.format("%s-container", objectArray);
    }

    private static void method473(Class252 class252, Number number) {
        class252.method575(number);
    }

    public static class_638 method474(class_310 class_3102) {
        return class_3102.field_1687;
    }

    static {
        ___.___(4, Class244.class);
        ____.___4_350(Class244.class);
    }

    private static void method475(long l2) {
        Class244.field287[1] = l2 ^ 0xABA868E81EDBDAF5L;
        Class244.field287[0] = l2 ^ 0xABA868E81EDBDAF4L;
    }

    @Override
    public JsonObject method438() {
        JsonObject b2 = new JsonObject();
        b2.addProperty("name", this.method446());
        b2.addProperty("id", this.method472());
        JsonArray c2 = new JsonArray();
        for (Class248 a2 : this.method471()) {
            if (Integer.valueOf("Keybind".toUpperCase().hashCode()).equals(a2.method512().toUpperCase().hashCode())) continue;
            c2.add((JsonElement)a2.method438());
        }
        b2.add("configs", (JsonElement)c2);
        return b2;
    }

    private static void method476(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public native Class248 method477(JsonObject var1);

    private static void method478(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Color method479(Class251 class251, JsonObject jsonObject) {
        return class251.method549(jsonObject);
    }

    protected void method480(Class248 ... b2) {
        Class248[] class248Array = b2;
        int n2 = class248Array.length;
        for (int i2 = (int)field287[0]; i2 < n2; ++i2) {
            Class248 a2 = class248Array[i2];
            this.method447(a2);
        }
    }

    private static void method481() {
        Class4146.method20694();
    }

    @Override
    public native Object method482(JsonObject var1);

    public Class248 method483(String a2) {
        return (Class248)this.field286.get(a2);
    }

    public static class_310 method484() {
        return field290;
    }

    private static native Object 1(char var0);
}

