/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.DeathScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class1668;
import mapped.Class278;
import mapped.Chams;
import mapped.Class4146;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class71;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.DeathScreen;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AutoRespawn
extends Class278 {
    private boolean field877;
    private static long[] field878 = new long[2];

    private static void method3118() {
        Chams.method1924();
    }

    @Class1
    public void method3119(Class63 a2) {
        if (a2.method128() == Class543.field2690) {
            while (true) {
                // Infinite loop
            }
        }
    }

    private static void method3120(long l2) {
        AutoRespawn.field878[1] = l2 ^ 0xB0CF01DA69542772L;
        AutoRespawn.field878[0] = l2 ^ 0xB0CF01DA69542773L;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3121(Class71 a2) {
        int n2 = !(a2.method147() instanceof class_418) ? 61905 : 61904;
        block4: while (true) {
            switch (n2) {
                case 61905: {
                    n2 = 61903;
                    continue block4;
                }
                case 61904: {
                    this.field877 = (int)field878[1];
                    return;
                }
            }
            break;
        }
    }

    public AutoRespawn() {
        super("AutoRespawn", "Respawns automatically after a death", Class556.field2754);
    }

    private static void method3122() {
        Class4146.method20697();
    }

    public static class_746 method3123(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method3124(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    static {
        AutoRespawn.method3120(-5706340165273507981L);
    }

    public static void method3125(AutoRespawn class337, boolean bl2) {
        class337.field877 = bl2;
    }

    private static void method3126() {
        Class5659.method22184();
    }

    private static void method3127() {
        Class5836.method22885();
    }

    private static void method3128() {
        Class6009.method23561();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

