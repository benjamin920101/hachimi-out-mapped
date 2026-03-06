/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package mapped;

import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import mapped.Class1503;
import mapped.Class1658;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class5836;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1662
extends Class1658 {
    private static long[] field6164 = new long[1];

    @Override
    public void method15037() {
        try {
            Path a2 = this.method15046();
            if (!Files.exists(a2, new LinkOption[(int)field6164[0]])) {
                Files.createFile(a2, new FileAttribute[(int)field6164[0]]);
            }
            JsonObject b2 = new JsonObject();
            b2.addProperty("fontpath", Class5836.field11401);
            this.method15030(this.method15046(), this.method15044(b2));
        }
        catch (IOException c2) {
            c2.printStackTrace();
        }
    }

    private static void method15089(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void method15040() {
        try {
            Path c2 = this.method15046();
            int n2 = Files.exists(c2, new LinkOption[(int)field6164[0]]) ? 23044 : 23045;
            block6: while (true) {
                switch (n2) {
                    case 23045: {
                        n2 = 23043;
                        continue block6;
                    }
                    case 23044: {
                        String a2 = this.method15041(c2);
                        JsonObject b2 = this.method15042(a2);
                        Class5836.field11401 = b2.get("fontpath").getAsString();
                        return;
                    }
                }
                break;
            }
            return;
        }
        catch (IOException d2) {
            d2.printStackTrace();
        }
    }

    private static void method15090() {
        Class3979.method19561();
    }

    private static void method15091() {
        Class4146.method20697();
    }

    public Class1662(Path a2) {
        super(a2, "fonts");
    }

    private static void method15092() {
        Class1503.method14420();
    }

    static {
        Class1662.method15093(7263139373338749387L);
    }

    private static void method15093(long l2) {
        Class1662.field6164[0] = l2 ^ 0x64CBDAC73E0269CBL;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

