/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import baritone.api.BaritoneAPI;
import java.util.ArrayList;
import java.util.List;
import mapped.Class1;
import mapped.Class1167;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class3493;
import mapped.Class376;
import mapped.Class3979;
import mapped.Class414;
import mapped.Class4196;
import mapped.Class444;
import mapped.Class456;
import mapped.Class525;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class572;
import mapped.Class6257;
import mapped.Class69;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class423
extends Class414 {
    private static Class423 INSTANCE;
    private static long[] field1839;
    Class248 field1840;
    Class248 field1841;
    private final List field1842 = new ArrayList();
    Class248 field1843;
    Class248 field1844 = this.method450(new Class260("SortPriority", "How to filter targets within range", Class525.field2605, Class525.values()));

    private static boolean method8222() {
        return Class4196.method20801();
    }

    private static boolean method8223(Class456 class456) {
        return class456.method10607();
    }

    @Class1
    public void method8224(Class210 b2) {
        this.field1842.clear();
        if (((Boolean)this.field1841.method507()).booleanValue() && !Class423.method8238(Class423.method8230())) {
            return;
        }
        Class3493.method17601(this.field1842, this::method8243, (Class525)this.field1844.method507(), (int)field1839[2]);
        if (this.field1842.isEmpty()) {
            return;
        }
        if (Class423.method8237(Class456.method10602())) {
            float[] a2 = Class1503.method14416(Class423.field290.field_1724.method_33571(), ((class_1297)this.field1842.getFirst()).method_33571());
            this.method6465(a2[(int)field1839[1]], a2[(int)field1839[2]]);
        }
    }

    public static class_746 method8225(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method8226() {
        int n2;
        if (this.method1265() && !Class423.method8233(this).isEmpty()) {
            n2 = (int)field1839[2];
            return n2 != 0;
        }
        n2 = (int)field1839[1];
        return n2 != 0;
    }

    @Class1(priority=-99)
    public void method8227(Class69 a2) {
        if (!Class3979.method19539()) {
            Class423.method8242(-1033638430, -1691740758, 1921735346, -1906427349);
            return;
        }
        if (BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
            return;
        }
        if (Class423.method8223(Class456.method10602()) && !this.field1842.isEmpty()) {
            Class423.method8235(Class423.field290.field_1724.field_3913, 1.0f);
            Class423.field290.field_1724.field_3913.field_3907 = 0.0f;
        }
    }

    private static void method8228() {
        Class3979.method19561();
    }

    public Class423() {
        super("Follower", "Follow your enemy", Class556.field2752, (int)field1839[0]);
        this.field1840 = this.method450(new Class252("Range", "The maximum range the entity can be to attack it", 0.0, 40.0, 300.0));
        this.field1843 = this.method450(new Class253("Friend", "Follow your friend", (boolean)field1839[1]));
        this.field1841 = this.method450(new Class253("OnlyFlying", "Only working when you fly", (boolean)field1839[1]));
        INSTANCE = this;
    }

    private static boolean method8229() {
        return Class3979.method19544();
    }

    private static Class444 method8230() {
        return Class444.method9765();
    }

    private static boolean method8231() {
        return Class3979.method19539();
    }

    private static void method8232(long l2) {
        Class423.method8236(l2);
    }

    public static List method8233(Class423 class423) {
        return class423.field1842;
    }

    private static boolean method8234() {
        return Class3979.method19544();
    }

    public static void method8235(class_744 class_7442, float f2) {
        class_7442.field_3905 = f2;
    }

    private static void method8236(long l2) {
        Class423.field1839[0] = l2 ^ 0x18490E7DF63F6CDEL;
        Class423.field1839[2] = l2 ^ 0x18490E7DF63F637FL;
        Class423.field1839[1] = l2 ^ 0x18490E7DF63F637EL;
    }

    private static boolean method8237(Class456 class456) {
        return class456.method10607();
    }

    private static boolean method8238(Class444 class444) {
        return class444.method9866();
    }

    static {
        field1839 = new long[3];
        Class423.method8232(1749945864375198590L);
    }

    private static void method8239(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method8240(int n2, int n3, Class572 class572, Class6257 class6257) {
        return Class1167.method13149(n2, n3, class572, class6257);
    }

    private static boolean method8241(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    @Override
    protected void method1279() {
        this.field1842.clear();
    }

    private static void method8242(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private boolean method8243(class_1297 b2) {
        if (b2.equals((Object)Class423.field290.field_1724)) {
            return Class3979.method19551();
        }
        if (b2.equals((Object)Class423.field290.field_1719)) {
            return (int)field1839[1] != 0;
        }
        if (b2 instanceof class_1657) {
            class_1657 a2 = (class_1657)b2;
            if (a2.method_29504()) {
                return (int)field1839[1] != 0;
            }
            if (a2.method_5709()) {
                return Class423.method8229();
            }
            return (int)field1839[1] != 0;
        }
        return (int)field1839[1] != 0;
    }

    private static boolean method8244() {
        return Class376.method4987();
    }

    public static Class248 method8245(Class423 class423) {
        return class423.field1840;
    }

    public static Class423 method8246() {
        return INSTANCE;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

