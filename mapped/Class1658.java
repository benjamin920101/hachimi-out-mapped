/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import mapped.Class1503;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class6009;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

public abstract class Class1658 {
    private final Path field6156;
    protected static final Gson field6157;
    private static long[] field6158;
    private final String field6159;
    public static boolean $skidonion$998554517;

    protected void method15030(Path a2, String b2) throws IOException {
        OutputStream c2 = Files.newOutputStream(a2, new OpenOption[(int)field6158[0]]);
        byte[] d2 = b2.getBytes(StandardCharsets.UTF_8);
        c2.write(d2, (int)field6158[0], d2.length);
        c2.close();
    }

    public String method15031() {
        return this.field6159;
    }

    private static void method15032(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method15033(String string) {
        Class3979.method19554(string);
    }

    protected native Object method15034(String var1, Class var2);

    private static void method15035() {
        Class6009.method23560();
    }

    protected JsonArray method15036(String a2) {
        return (JsonArray)this.method15034(a2, JsonArray.class);
    }

    public abstract void method15037();

    public Class1658(Path b2, String c2) {
        if (!Files.exists(b2, new LinkOption[(int)field6158[0]])) {
            try {
                Files.createDirectory(b2, new FileAttribute[(int)field6158[0]]);
            }
            catch (IOException a2) {
                Object[] objectArray = new Object[(int)field6158[1]];
                objectArray[(int)Class1658.field6158[0]] = b2;
                Class3979.method19536("Could not create {} dir", objectArray);
                a2.printStackTrace();
            }
        }
        this.field6159 = b2.getFileName().toString();
        this.field6156 = b2.resolve(this.method15045(c2));
    }

    static {
        ___.___(27, Class1658.class);
        ____.___27_130(Class1658.class);
    }

    private static void method15038(long l2) {
        Class1658.field6158[0] = l2 ^ 0xA295357E5BB5872BL;
        Class1658.field6158[1] = l2 ^ 0xA295357E5BB5872AL;
    }

    public static Gson method15039() {
        return field6157;
    }

    public abstract void method15040();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected String method15041(Path c2) throws IOException {
        int n2;
        StringBuilder d2 = new StringBuilder();
        BufferedReader b2 = Files.newBufferedReader(c2, StandardCharsets.UTF_8);
        try {
            String a2;
            while ((a2 = b2.readLine()) != null) {
                d2.append(a2).append("\n");
            }
            n2 = b2 != null ? 15780 : 15781;
        }
        catch (Throwable throwable) {
            if (b2 == null) throw throwable;
            try {
                b2.close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
        block9: while (true) {
            switch (n2) {
                case 15781: {
                    n2 = 15779;
                    continue block9;
                }
                case 15780: {
                    b2.close();
                    return d2.toString();
                }
            }
            break;
        }
        return d2.toString();
    }

    protected JsonObject method15042(String a2) {
        return (JsonObject)this.method15034(a2, JsonObject.class);
    }

    private static void method15043() {
        Class4146.method20694();
    }

    protected String method15044(Object a2) {
        return field6157.toJson(a2);
    }

    private String method15045(String a2) {
        Object[] objectArray = new Object[(int)field6158[1]];
        objectArray[(int)Class1658.field6158[0]] = a2;
        return String.format("%s.json", objectArray).toLowerCase();
    }

    public Path method15046() {
        return this.field6156;
    }

    private static native Object I(char var0);
}

