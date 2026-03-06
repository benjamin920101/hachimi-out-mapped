/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import mapped.Class1108;
import mapped.Class12;
import mapped.Class1348;
import mapped.Class1658;
import mapped.Class1668;
import mapped.Class242;
import mapped.Class277;
import mapped.Class3392;
import mapped.Class3804;
import mapped.Class3979;
import mapped.Class4132;
import mapped.Class5659;
import mapped.Class5677;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class937;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1665
extends Class1658 {
    private static long[] field6168;
    public static boolean $skidonion$890408990;

    @Override
    public native void method15040();

    private static void method15109() {
        Class3979.method19561();
    }

    private static void method15110() {
        Class6454.method24594();
    }

    private static void method15111(String string, Object[] objectArray) {
        Class3979.method19536(string, objectArray);
    }

    static {
        ___.___(42, Class1665.class);
        ____.___42_70(Class1665.class);
    }

    private static void method15112(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public Class1665(Path a2, String b2) {
        super(a2, b2);
    }

    private static int method15113(int n2, int n3, Class3804 class3804, Class5677 class5677) {
        return Class937.method12662(n2, n3, class3804, class5677);
    }

    public static Class4132 method15114() {
        return Class5723.field11055;
    }

    private static void method15115(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method15116() {
        Class3979.method19561();
    }

    @Override
    public void method15037() {
        try {
            Path b2 = this.method15046();
            if (Files.exists(b2, new LinkOption[(int)field6168[2]])) {
                Class5836.method22890();
                return;
            }
            Files.createFile(b2, new FileAttribute[(int)field6168[2]]);
            JsonObject c2 = new JsonObject();
            Object[] objectArray = new Object[(int)field6168[1]];
            objectArray[(int)Class1665.field6168[2]] = "Hachimi";
            objectArray[(int)Class1665.field6168[0]] = "1.2.2.1";
            c2.addProperty("version", String.format("%s %s", objectArray));
            JsonArray d2 = new JsonArray();
            for (Class277 a2 : Class1665.method15114().method20679()) {
                d2.add((JsonElement)a2.method438());
            }
            c2.add("configs", (JsonElement)d2);
            this.method15030(b2, this.method15044(c2));
        }
        catch (IOException e2) {
            Object[] objectArray = new Object[(int)field6168[0]];
            objectArray[(int)Class1665.field6168[2]] = this.method15046();
            Class3979.method19536("Could not save file for {}!", objectArray);
            e2.printStackTrace();
        }
    }

    private static void method15117(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static int method15118(int n2, int n3, Class12 class12, Class3392 class3392) {
        return Class937.method12651(n2, n3, class12, class3392);
    }

    private static void method15119(long l2) {
        Class1665.field6168[2] = l2 ^ 0x7120B9498716E423L;
        Class1665.field6168[0] = l2 ^ 0x7120B9498716E422L;
        Class1665.field6168[1] = l2 ^ 0x7120B9498716E421L;
    }

    private static int method15120(int n2, int n3, Class242 class242, Class1348 class1348) {
        return Class937.method12649(n2, n3, class242, class1348);
    }

    private static void method15121() {
        Class5659.method22184();
    }

    private static void method15122() {
        Class5836.method22885();
    }

    private static void method15123() {
        Class6009.method23560();
    }

    private static native Object 1(char var0);
}

