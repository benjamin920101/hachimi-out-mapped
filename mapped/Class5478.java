/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.text.Text
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import mapped.Class1063;
import mapped.Class1365;
import mapped.Class1503;
import mapped.Class376;
import mapped.Class4122;
import mapped.Class4196;
import mapped.Class453;
import mapped.Class454;
import mapped.Class458;
import mapped.Class546;
import mapped.Class5540;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class797;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5478 {
    private static long[] field10265 = new long[2];
    private final ConcurrentMap field10266 = new ConcurrentHashMap();

    /*
     * Enabled aggressive block sorting
     */
    public boolean method21233(String a2) {
        if (Class458.method10623().method10622()) {
            return Class5659.method22111();
        }
        int n2 = 17860;
        block4: while (true) {
            switch (n2) {
                case 17861: {
                    n2 = 17859;
                    continue block4;
                }
                case 17860: {
                    if (Class453.field2377) break block4;
                    return (int)field10265[0] != 0;
                }
            }
            break;
        }
        return this.method21238(a2, Class5478.method21252());
    }

    private static void method21234() {
        Class1503.method14420();
    }

    public static Class546 method21235() {
        return Class546.field2704;
    }

    public Class546 method21236(class_2561 a2) {
        return (Class546)((Object)this.field10266.remove(a2.getString()));
    }

    public static class_746 method21237(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public boolean method21238(String a2, Class546 b2) {
        return (this.field10266.get(a2) == b2 ? (int)field10265[1] : (int)field10265[0]) != 0;
    }

    public void method21239(class_2561 a2) {
        this.method21255(a2.getString());
    }

    public static ConcurrentMap method21240(Class5478 class5478) {
        return class5478.field10266;
    }

    public static class_310 method21241() {
        return Class4122.field9561;
    }

    public static class_310 method21242() {
        return Class4122.field9561;
    }

    public boolean method21243(class_2561 a2) {
        if (!Class458.method10623().method10622() && !Class453.field2377) {
            return (int)field10265[0] != 0;
        }
        if (a2 != null && this.method21238(a2.getString(), Class546.field2704)) {
            int n2 = (int)field10265[1];
            return Class376.method4987();
        }
        return (int)field10265[0] != 0;
    }

    private static void method21244(long l2) {
        Class5478.field10265[1] = l2 ^ 0x9E9519879ACC24B3L;
        Class5478.field10265[0] = l2 ^ 0x9E9519879ACC24B2L;
    }

    public Collection method21245(Class546 b2) {
        ArrayList<String> c2 = new ArrayList<String>();
        for (Map.Entry a2 : this.field10266.entrySet()) {
            if (a2.getValue() != b2) continue;
            c2.add((String)a2.getKey());
        }
        return c2;
    }

    public static ConcurrentMap method21246(Class5478 class5478) {
        return class5478.field10266;
    }

    private static void method21247(long l2) {
        Class5478.method21244(l2);
    }

    public boolean method21248(String a2) {
        return this.method21238(a2, Class546.field2704);
    }

    private static boolean method21249(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static ConcurrentMap method21250(Class5478 class5478) {
        return Class5478.method21240(class5478);
    }

    private static boolean method21251(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class5649.method22085(d2, d3, d4, d5, d6, d7);
    }

    public static Class546 method21252() {
        return Class546.field2704;
    }

    private static int method21253(int n2, int n3, Class454 class454, Class1063 class1063) {
        return Class5540.method21771(n2, n3, class454, class1063);
    }

    static {
        Class5478.method21247(-7019676373978700622L);
    }

    private static class_310 method21254() {
        return Class5478.method21241();
    }

    public void method21255(String f2) {
        this.method21258(f2, Class5478.method21235());
        if (Class458.method10623().method10624()) {
            Collection e2;
            Iterator iterator;
            if (Class5478.method21242().field_1687 != null && (iterator = (e2 = Class5478.method21254().field_1724.field_3944.method_2880()).iterator()).hasNext()) {
                String[] c2;
                class_640 d2 = (class_640)iterator.next();
                String b2 = d2.method_2966().getName();
                String[] stringArray = c2 = b2.split(" ");
                int n2 = stringArray.length;
                for (int i2 = (int)field10265[0]; i2 < n2; ++i2) {
                    String a2 = stringArray[i2];
                    if (!Integer.valueOf(f2.hashCode()).equals(a2.hashCode())) continue;
                    Class1365.method13926("msg " + f2 + " I just added you as a friend on Hachimi!");
                    break;
                }
                Class5836.method22907(Class797.field3533);
                return;
            }
        }
    }

    public Collection method21256() {
        return this.method21245(Class546.field2704);
    }

    private static boolean method21257(int n2) {
        return Class4196.method20803(n2);
    }

    public void method21258(String a2, Class546 b2) {
        if (Class4122.field9561.field_1724 != null && Integer.valueOf(Class5478.method21237(Class4122.field9561).method_5476().getString().hashCode()).equals(a2.hashCode())) {
            return;
        }
        Class546 c2 = (Class546)((Object)Class5478.method21246(this).get(a2));
        if (c2 != null) {
            this.field10266.replace(a2, b2);
            return;
        }
        Class5478.method21263(this).put(a2, b2);
    }

    private static void method21259() {
        Class5659.method22184();
    }

    private static void method21260() {
        Class5659.method22184();
    }

    public boolean method21261(class_1657 a2) {
        if (!Class458.method10623().method10622() && !Class453.field2377) {
            return (int)field10265[0] != 0;
        }
        return this.method21238(a2.method_7334().getName(), Class546.field2704);
    }

    public Class546 method21262(String a2) {
        return (Class546)((Object)Class5478.method21250(this).remove(a2));
    }

    public static ConcurrentMap method21263(Class5478 class5478) {
        return class5478.field10266;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

