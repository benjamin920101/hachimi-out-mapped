/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.List;
import mapped.Class1108;
import mapped.Class1450;
import mapped.Class1503;
import mapped.Class1658;
import mapped.Class1664;
import mapped.Class1745;
import mapped.Class176;
import mapped.Class2297;
import mapped.Class243;
import mapped.Class246;
import mapped.Class253;
import mapped.Class26;
import mapped.Class261;
import mapped.Chams;
import mapped.Class3224;
import mapped.ClickGui;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class6090;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class767;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1661
extends Class1658 {
    private static long[] field6163;
    public static boolean $skidonion$890408998;

    private static void method15065() {
        Class3979.method19561();
    }

    private static void method15066(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method15067() {
        Class1745.method15538();
    }

    private static List method15068(Class1450 class1450) {
        return class1450.method14302();
    }

    private static int method15069(int n2, int n3, Class176 class176, Class243 class243) {
        return Class767.method12095(n2, n3, class176, class243);
    }

    private static void method15070(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method15071(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method15072() {
        Class5836.method22885();
    }

    private static void method15073() {
        Class6454.method24594();
    }

    static {
        ___.___(41, Class1661.class);
        ____.___41_90(Class1661.class);
    }

    private static void method15074() {
        Class5836.method22885();
    }

    private static void method15075(String string) {
        Class3979.method19554(string);
    }

    public Class1661(Path a2) {
        super(a2, "clickgui");
    }

    private static int method15076(int n2, int n3, Class1664 class1664, Class6090 class6090) {
        return Class767.method12114(n2, n3, class1664, class6090);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void method15037() {
        try {
            Path b2 = this.method15046();
            if (!Files.exists(b2, new LinkOption[(int)field6163[0]])) {
                Files.createFile(b2, new FileAttribute[(int)field6163[0]]);
            }
            JsonArray c2 = new JsonArray();
            Iterator iterator = Class1661.method15087().method14302().iterator();
            block6: while (true) {
                int n2 = iterator.hasNext() ? 64900 : 64901;
                block7: while (true) {
                    switch (n2) {
                        case 64901: {
                            n2 = 64899;
                            continue block7;
                        }
                        case 64900: {
                            Class261 a2 = (Class261)iterator.next();
                            c2.add((JsonElement)a2.method438());
                            continue block6;
                        }
                    }
                    break;
                }
                break;
            }
            this.method15030(b2, this.method15044(c2));
            return;
        }
        catch (IOException d2) {
            Class1661.method15075("Could not save clickgui file!");
            d2.printStackTrace();
        }
    }

    private static void method15077() {
        Class4146.method20697();
    }

    private static void method15078() {
        Class4146.method20697();
    }

    public static Class1450 method15079() {
        return ClickGui.field838;
    }

    @Override
    public native void method15040();

    private static int method15080(int n2, int n3, Class246 class246, Class4196 class4196) {
        return Class767.method12096(n2, n3, class246, class4196);
    }

    private static void method15081() {
        Chams.method1924();
    }

    private static int method15082(int n2, int n3, Class253 class253, Class3224 class3224) {
        return Class767.method12109(n2, n3, class253, class3224);
    }

    private static void method15083(long l2) {
        Class1661.field6163[0] = l2 ^ 0xD56D992F33B8A2EL;
    }

    public Class261 method15084(Class556 b2) {
        for (Class261 a2 : Class1661.method15068(ClickGui.field838)) {
            if (!Class1661.method15088(a2).equals((Object)b2)) continue;
            return a2;
        }
        return null;
    }

    private static void method15085() {
        Class5836.method22897();
    }

    private static int method15086(int n2, int n3, Class26 class26, Class2297 class2297) {
        return Class767.method12113(n2, n3, class26, class2297);
    }

    private static Class1450 method15087() {
        return Class1661.method15079();
    }

    private static Class556 method15088(Class261 class261) {
        return class261.method704();
    }

    private static native Object 1(char var0);
}

