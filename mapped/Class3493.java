/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.GameMode
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.PlayerListEntry
 *  org.jetbrains.annotations.Nullable
 */
package mapped;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import mapped.Class1108;
import mapped.Class1468;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Chams;
import mapped.Blink;
import mapped.Class3979;
import mapped.Class4122;
import mapped.Class525;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class6009;
import mapped.Class6454;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.GameMode;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.PlayerListEntry;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3493 {
    private static long[] field7685 = new long[2];
    private static final List field7686;

    private static List method17597() {
        return Class3493.method17605();
    }

    private static void method17598(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_638 method17599(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method17600() {
        Chams.method1924();
    }

    static {
        Class3493.method17612(5497765911389385732L);
        field7686 = new ArrayList();
    }

    public static void method17601(List b2, Predicate c2, Class525 d2, int e2) {
        b2.clear();
        for (class_1297 a2 : Class3493.method17599(Class4122.field9561).method_18112()) {
            if (a2 == null || !c2.test(a2)) continue;
            b2.add(a2);
        }
        b2.sort(d2);
        if (b2.size() > e2) {
            b2.subList(e2, b2.size()).clear();
        }
    }

    public static class_1934 method17602(class_1657 a2) {
        if (a2 == null) {
            return null;
        }
        class_640 b2 = Class4122.field9561.method_1562().method_2871(a2.method_5667());
        if (b2 == null) {
            return null;
        }
        return b2.method_2958();
    }

    /*
     * Unable to fully structure code
     */
    public static boolean method17603(class_1657 a, double b) {
        block4: {
            block5: {
                if (a == null) {
                    return (boolean)((int)Class3493.field7685[0]);
                }
                if (!Class5659.method22185((class_1297)a, b)) ** GOTO lbl-1000
                if (!a.method_5805()) break block5;
                v0 = 52204;
                ** GOTO lbl12
            }
            v0 = 52205;
            if (true) ** GOTO lbl12
            do {
                v0 = var3_2 = 52203;
lbl12:
                // 3 sources

                if (var3_2 == 52204) break block4;
            } while (var3_2 == 52205);
            ** GOTO lbl-1000
        }
        if (a.method_29504() || a.method_6032() <= 0.0f) lbl-1000:
        // 3 sources

        {
            v1 = (int)Class3493.field7685[0];
        } else {
            v1 = (int)Class3493.field7685[1];
        }
        return (boolean)v1;
    }

    private static void method17604() {
        Class1807.method15744();
    }

    public static List method17605() {
        return field7686;
    }

    private static void method17606() {
        Class6009.method23560();
    }

    private static void method17607() {
        Class6009.method23561();
    }

    private static boolean method17608() {
        return Blink.method4987();
    }

    private static void method17609(boolean bl2) {
        Class1108.method12918(bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean method17610(double a2, class_1297 b2) {
        int n2;
        if (!(b2 instanceof class_1657)) return (int)field7685[1] != 0;
        if (b2 == Class4122.field9561.field_1724) {
            return (int)field7685[1] != 0;
        }
        if (((class_1657)b2).method_29504()) return (int)field7685[1] != 0;
        if (((class_1657)b2).method_6032() <= 0.0f) {
            return (int)field7685[1] != 0;
        }
        if (!Class5659.method22185(b2, a2)) {
            return (int)field7685[1] != 0;
        }
        int n3 = Class5723.field11045.method21261((class_1657)b2) ? 37433 : 37434;
        while (true) {
            int n4 = n3;
            if (n4 == 37433) return (int)field7685[1] != 0;
            if (n4 != 37434) break;
            n3 = 37432;
        }
        if (Class3493.method17602((class_1657)b2) != class_1934.field_9215 && !(b2 instanceof Class1468)) {
            n2 = (int)field7685[1];
            return n2 != 0;
        }
        n2 = (int)field7685[0];
        return n2 != 0;
    }

    public static List method17611() {
        return field7686;
    }

    private static void method17612(long l2) {
        Class3493.field7685[1] = l2 ^ 0x4C4BFCF7CE9DB404L;
        Class3493.field7685[0] = l2 ^ 0x4C4BFCF7CE9DB405L;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public static class_1657 method17613(double a2, Class525 b2) {
        if (Class4122.field9561.field_1724 == null) return null;
        if (Class4122.field9561.field_1687 == null) {
            int n2 = 20204;
            Class6454.method24594();
            return null;
        }
        int n3 = 20205;
        block4: while (true) {
            switch (n3) {
                case 20205: {
                    n3 = 20203;
                    continue block4;
                }
                case 20204: {
                    return null;
                }
            }
            break;
        }
        return (class_1657)Class3493.method17616(arg_0 -> Class3493.method17610(a2, arg_0), b2);
    }

    private static void method17614(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method17615() {
        return Class3979.method19543();
    }

    @Nullable
    public static class_1297 method17616(Predicate a2, Class525 b2) {
        field7686.clear();
        Class3493.method17601(Class3493.method17597(), a2, b2, (int)field7685[0]);
        if (!Class3493.method17611().isEmpty()) {
            return (class_1297)field7686.getFirst();
        }
        return null;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

