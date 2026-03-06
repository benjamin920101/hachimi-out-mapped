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
import java.util.function.Predicate;
import mapped.Class1658;
import mapped.Class246;
import mapped.Chams;
import mapped.XRay;
import mapped.Class3979;
import mapped.Class4089;
import mapped.Class4146;
import mapped.Class4655;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6257;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1664
extends Class1658 {
    private static long[] field6167;
    public static boolean $skidonion$998554011;

    private static Class246 method15098(Class6257 class6257, Predicate predicate) {
        return class6257.method24166(predicate);
    }

    private static void method15099() {
        Class4146.method20694();
    }

    @Override
    public native void method15040();

    private static void method15100(String string) {
        Class3979.method19554(string);
    }

    @Override
    public void method15037() {
        try {
            Path b2 = this.method15046();
            if (!Files.exists(b2, new LinkOption[(int)field6167[0]])) {
                Files.createFile(b2, new FileAttribute[(int)field6167[0]]);
            }
            JsonArray c2 = new JsonArray();
            for (Class246 a2 : Class5723.field11059.method24206()) {
                c2.add((JsonElement)Class1664.method15105(a2));
            }
            this.method15030(b2, this.method15044(c2));
        }
        catch (IOException d2) {
            Class1664.method15100("Could not save macro file!");
            d2.printStackTrace();
        }
    }

    public Class1664(Path a2) {
        super(a2, "macros");
    }

    static {
        ___.___(0, Class1664.class);
        ____.___0_80(Class1664.class);
    }

    public static Class6257 method15101() {
        return Class5723.field11059;
    }

    private static int method15102(int n2, int n3, Class4089 class4089, XRay class329) {
        return Class4655.method20953(n2, n3, class4089, class329);
    }

    private static void method15103() {
        Class5836.method22890();
    }

    private static void method15104() {
        Chams.method1924();
    }

    private static JsonObject method15105(Class246 class246) {
        return class246.method438();
    }

    private static void method15106(long l2) {
        Class1664.field6167[0] = l2 ^ 0xBED598F0B848FC41L;
        Class1664.field6167[1] = l2 ^ 0xBED598F0B848FC47L;
    }

    private static boolean method15107(String a2, Class246 b2) {
        return Integer.valueOf(a2.hashCode()).equals(b2.method472().hashCode());
    }

    private static void method15108(String string) {
        Class3979.method19554(string);
    }

    public Class1664(Path a2, String b2) {
        super(a2, b2);
    }

    private static native Object 1(char var0);
}

