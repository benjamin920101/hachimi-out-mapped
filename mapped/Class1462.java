/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import mapped.Class1108;
import mapped.Class1365;
import mapped.Class1658;
import mapped.Class1659;
import mapped.Class1660;
import mapped.Class1661;
import mapped.Class1662;
import mapped.Class1663;
import mapped.Class1664;
import mapped.Class1665;
import mapped.Class1745;
import mapped.Class277;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4122;
import mapped.Class4196;
import mapped.Class546;
import mapped.Class5659;
import mapped.Class5723;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1462 {
    public final Path field5545;
    private Class1664 field5546;
    private static long[] field5547 = new long[2];
    public final Class1662 field5548;
    public final Class1661 field5549;
    private final Set field5550 = new HashSet();
    public final File field5551;
    private Class1665 field5552;

    private static void method14346() {
        Class3979.method19561();
    }

    private static void method14347(String string) {
        Class1365.method13946(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method14348(String a2) {
        Path b2 = this.field5545.resolve("Configs");
        Class1462.method14374(this, new Class1665(b2, a2));
        int n2 = Files.exists(b2.resolve(a2 + ".json"), new LinkOption[(int)field5547[0]]) ? 3428 : 3427;
        block4: while (true) {
            switch (n2) {
                case 3428: {
                    n2 = 3426;
                    continue block4;
                }
                case 3427: {
                    Class1462.method14347("Could not find config file: " + a2);
                    return (int)field5547[0] != 0;
                }
            }
            break;
        }
        Class1462.method14367().submit(this::method14353);
        return (int)field5547[1] != 0;
    }

    private void method14349() {
        this.field5546.method15040();
    }

    public static ExecutorService method14350() {
        return Class3979.field9080;
    }

    public void method14351() {
        for (Class1658 a2 : this.field5550) {
            a2.method15037();
        }
    }

    public static Class1661 method14352(Class1462 class1462) {
        return class1462.field5549;
    }

    private void method14353() {
        this.field5552.method15040();
    }

    public void method14354() {
        Class3979.field9080.submit(this.field5548::method15040);
    }

    public Set method14355() {
        return this.field5550;
    }

    public void method14356(Class1658 a2) {
        this.field5550.remove(a2);
    }

    private static boolean method14357(double d2) {
        return Class5659.method22193(d2);
    }

    private static void method14358(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Path method14359(Class1462 class1462) {
        return class1462.field5545;
    }

    public static Class1661 method14360(Class1462 class1462) {
        return class1462.field5549;
    }

    public void method14361() {
        Class3979.field9080.submit(Class1462.method14352(this)::method15040);
    }

    public static Set method14362(Class1462 class1462) {
        return class1462.field5550;
    }

    public Path method14363() {
        return Class1462.method14359(this);
    }

    public static Set method14364(Class1462 class1462) {
        return class1462.field5550;
    }

    private static boolean method14365() {
        return Class4196.method20801();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Class1462() {
        Path h2;
        this.field5545 = Class4122.field9561.field_1697.toPath().resolve("Hachimi");
        int n2 = !Files.exists(this.field5545, new LinkOption[(int)field5547[0]]) ? 20578 : 20579;
        block10: while (true) {
            switch (n2) {
                case 20579: {
                    n2 = 20577;
                    continue block10;
                }
                case 20578: {
                    try {
                        Files.createDirectory(this.field5545, new FileAttribute[(int)field5547[0]]);
                    }
                    catch (IOException a2) {
                        Class3979.method19554("Could not create client dir");
                        a2.printStackTrace();
                    }
                    break block10;
                }
            }
            break;
        }
        Path f2 = this.field5545.resolve("Configs");
        Path g2 = this.field5545.resolve("Macros");
        if (!Files.exists(f2, new LinkOption[(int)field5547[0]])) {
            try {
                Files.createDirectory(f2, new FileAttribute[(int)field5547[0]]);
                Files.createDirectory(g2, new FileAttribute[(int)field5547[0]]);
            }
            catch (IOException b2) {
                Class3979.method19554("Could not create config/macro dir");
                b2.printStackTrace();
            }
        }
        if (!Files.exists(h2 = this.field5545.resolve("Kits"), new LinkOption[(int)field5547[0]])) {
            try {
                Files.createDirectory(h2, new FileAttribute[(int)field5547[0]]);
            }
            catch (IOException c2) {
                Class3979.method19554("Could not create kit dir");
                c2.printStackTrace();
            }
        }
        Set i2 = this.method14355();
        i2.add(new Class1664(this.field5545));
        for (Class277 d2 : Class5723.field11055.method20679()) {
            i2.add(new Class1663(this.field5545.resolve("Modules"), d2));
        }
        i2.add(new Class1660(this.field5545));
        Class546[] class546Array = Class546.values();
        int n3 = class546Array.length;
        int n4 = (int)field5547[0];
        while (true) {
            if (n4 >= n3) {
                this.field5551 = h2.toFile();
                this.field5549 = new Class1661(this.field5545);
                this.field5548 = new Class1662(this.field5545);
                return;
            }
            Class546 e2 = class546Array[n4];
            i2.add(new Class1659(this.field5545, e2));
            ++n4;
        }
    }

    private void method14366() {
        for (Class1658 a2 : this.field5550) {
            if (!(a2 instanceof Class1663)) continue;
            a2.method15040();
        }
    }

    private static ExecutorService method14367() {
        return Class1462.method14370();
    }

    private static void method14368(long l2) {
        Class1462.field5547[1] = l2 ^ 0xE1CD6C0ED86D6ABDL;
        Class1462.field5547[0] = l2 ^ 0xE1CD6C0ED86D6ABCL;
    }

    public boolean method14369(String a2) {
        Path b2 = Class1462.method14378(this).resolve("Macros");
        this.field5546 = new Class1664(b2, a2);
        if (!Files.exists(b2.resolve(a2 + ".json"), new LinkOption[(int)field5547[0]])) {
            Class1365.method13946("Could not find config file: " + a2);
            return (int)field5547[0] != 0;
        }
        Class3979.field9080.submit(this::method14349);
        return (int)field5547[1] != 0;
    }

    public static ExecutorService method14370() {
        return Class3979.field9080;
    }

    public void method14371(String a2) {
        this.field5546 = new Class1664(this.field5545.resolve("Macros"), a2);
        this.field5546.method15037();
    }

    public void method14372() {
        Class1462.method14360(this).method15037();
    }

    public void method14373() {
        Class1462.method14350().submit(this::method14366);
    }

    public static void method14374(Class1462 class1462, Class1665 class1665) {
        class1462.field5552 = class1665;
    }

    private static void method14375(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method14376() {
        Class5659.method22184();
    }

    public void method14377(String a2) {
        this.field5552 = new Class1665(this.field5545.resolve("Configs"), a2);
        this.field5552.method15037();
    }

    static {
        Class1462.method14368(-2175964233933690180L);
    }

    public static Path method14378(Class1462 class1462) {
        return class1462.field5545;
    }

    private static boolean method14379(double d2) {
        return Class5659.method22193(d2);
    }

    private static void method14380(Class1662 class1662) {
        class1662.method15037();
    }

    public void method14381(Class1658 a2) {
        Class1462.method14364(this).add(a2);
    }

    public void method14382() {
        Class1462.method14380(this.field5548);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method14383() {
        Iterator iterator = Class1462.method14362(this).iterator();
        if (!iterator.hasNext()) {
            Class1745.method15538();
            return;
        }
        Class1658 a2 = (Class1658)iterator.next();
        int n2 = !(a2 instanceof Class1663) ? 31492 : 31491;
        block4: while (true) {
            switch (n2) {
                case 31492: {
                    n2 = 31490;
                    continue block4;
                }
                case 31491: {
                    a2.method15037();
                    break block4;
                }
            }
            break;
        }
        while (true) {
            // Infinite loop
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

