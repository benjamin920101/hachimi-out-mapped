/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class160;
import mapped.Class1668;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5677;
import mapped.Class5836;
import mapped.Class6286;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ElytraTweaks
extends Class278 {
    private static long[] field1066 = new long[3];
    Class248 field1067 = this.method450(new Class253("InfiniteDura", "Make your elytra unbreakable", (boolean)field1066[0]));

    public static class_746 method4298(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_636 method4299(class_310 class_3102) {
        return class_3102.field_1761;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4300(Class210 a2) {
        if (!((Boolean)ElytraTweaks.method4301(this.field1067)).booleanValue()) {
            ElytraTweaks.method4306(0.26249212f);
            return;
        }
        int n2 = 57449;
        block4: while (true) {
            switch (n2) {
                case 57450: {
                    n2 = 57448;
                    continue block4;
                }
                case 57449: {
                    if (!ElytraTweaks.field290.field_1724.method_24828()) {
                        int n3 = 20392;
                        Class1108.method12918(true);
                        return;
                    }
                    int n4 = 20393;
                    ElytraTweaks.method4312();
                    return;
                }
            }
            break;
        }
    }

    private static Object method4301(Class248 class248) {
        return class248.method507();
    }

    public static class_1304 method4302() {
        return class_1304.field_6174;
    }

    public ElytraTweaks() {
        super("ElytraTweaks", "Elytra utils", Class556.field2754);
    }

    public static class_1792 method4303() {
        return class_1802.field_8833;
    }

    public static class_746 method4304(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static int method4305(class_1703 class_17032) {
        return class_17032.field_7763;
    }

    private static void method4306(float f2) {
        Class5836.method22907(f2);
    }

    private static void method4307() {
        Class5836.method22890();
    }

    private static int method4308(class_1703 class_17032) {
        return ElytraTweaks.method4305(class_17032);
    }

    private static class_1304 method4309() {
        return ElytraTweaks.method4302();
    }

    private static int method4310(int n2, int n3, Class160 class160, Class5677 class5677) {
        return Class6286.method24311(n2, n3, class160, class5677);
    }

    private static void method4311(long l2) {
        ElytraTweaks.field1066[1] = l2 ^ 0xAF6601394D1B85F6L;
        ElytraTweaks.field1066[2] = l2 ^ 0xAF6601394D1B85F7L;
        ElytraTweaks.field1066[0] = l2 ^ 0xAF6601394D1B85F1L;
    }

    private static void method4312() {
        Class4146.method20694();
    }

    public static class_746 method4313(class_310 class_3102) {
        return class_3102.field_1724;
    }

    static {
        ElytraTweaks.method4311(-5807953323829262864L);
    }

    private static void method4314(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method4315() {
        Class1503.method14420();
    }

    private static void method4316() {
        Class1807.method15744();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

