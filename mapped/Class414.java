/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.Comparator;
import java.util.function.Predicate;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class253;
import mapped.Class3510;
import mapped.Class408;
import mapped.Class411;
import mapped.Class4196;
import mapped.Class443;
import mapped.Class5478;
import mapped.Class556;
import mapped.Class5678;
import mapped.Class5723;
import mapped.Class598;
import mapped.Class6090;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;

public class Class414
extends Class411 {
    protected Class248 field1536 = this.method450(new Class253("Multitask", "Allows actions while using items", (boolean)field1537[0]));
    private static long[] field1537 = new long[2];

    private static double method6607(class_742 a2) {
        return Class414.method6608(field290).method_5858((class_1297)a2);
    }

    private static class_746 method6608(class_310 class_3102) {
        return Class414.method6610(class_3102);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean method6609(class_742 a2) {
        int n2;
        if (!(a2 instanceof class_746) && !a2.method_7325()) {
            n2 = (int)field1537[1];
            return n2 != 0;
        }
        n2 = (int)field1537[0];
        return n2 != 0;
    }

    public static class_746 method6610(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class5478 method6611() {
        return Class5723.field11045;
    }

    private static void method6612(long l2) {
        Class414.field1537[1] = l2 ^ 0xD0031D62A88636C1L;
        Class414.field1537[0] = l2 ^ 0xD0031D62A88636C0L;
    }

    private static boolean method6613(double a2, class_742 b2) {
        return (Class414.field290.field_1724.method_5858((class_1297)b2) <= a2 * a2 ? (int)field1537[1] : (int)field1537[0]) != 0;
    }

    public class_1657 method6614(Predicate a2, double b2) {
        return Class414.field290.field_1687.method_18456().stream().filter(Class414::method6624).filter(a2).filter(arg_0 -> Class414.method6613(b2, arg_0)).filter(Class414::method6628).min(Comparator.comparingDouble(Class414::method6607)).orElse(null);
    }

    public class_1657 method6615(double a2) {
        return Class414.field290.field_1687.method_18456().stream().filter(Class414::method6609).filter(arg_0 -> Class414.method6617(a2, arg_0)).filter(Class414::method6627).min(Comparator.comparingDouble(Class414::method6618)).orElse(null);
    }

    private static int method6616(int n2, int n3, Class598 class598, Class443 class443) {
        return Class5678.method22374(n2, n3, class598, class443);
    }

    /*
     * Unable to fully structure code
     */
    private static boolean method6617(double a, class_742 b) {
        block3: {
            block1: {
                block2: {
                    if (!(Class414.field290.field_1724.method_5858((class_1297)b) <= a * a)) break block2;
                    v0 = 11703;
                    ** GOTO lbl9
                }
                v0 = 11704;
                if (true) ** GOTO lbl9
                do {
                    v0 = var3_2 = 11702;
lbl9:
                    // 3 sources

                    if (var3_2 == 11703) break block1;
                } while (var3_2 == 11704);
                break block3;
            }
            v1 = (int)Class414.field1537[1];
            return Class4196.method20801();
        }
        return (boolean)((int)Class414.field1537[0]);
    }

    private static double method6618(class_742 a2) {
        return Class414.field290.field_1724.method_5858((class_1297)a2);
    }

    public boolean method6619(boolean a2) {
        if (a2 && Class414.field290.field_1724.method_6058() != class_1268.field_5808) {
            return (int)field1537[0] != 0;
        }
        return Class414.method6625(field290).method_6115();
    }

    private static int method6620(int n2, int n3, Class6090 class6090, Class3510 class3510) {
        return Class5678.method22372(n2, n3, class6090, class3510);
    }

    private static boolean method6621() {
        return Class408.method6431();
    }

    private static boolean method6622(Class5478 class5478, String string) {
        return class5478.method21233(string);
    }

    private static boolean method6623() {
        return Class1807.method15742();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean method6624(class_742 a2) {
        int n2;
        if (!(a2 instanceof class_746) && !a2.method_7325()) {
            n2 = (int)field1537[1];
            return n2 != 0;
        }
        n2 = (int)field1537[0];
        return n2 != 0;
    }

    public static class_746 method6625(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public boolean method6626() {
        return this.method6619((boolean)field1537[0]);
    }

    public Class414(String a2, String b2, Class556 c2, int d2) {
        super(a2, b2, c2, d2);
    }

    private static boolean method6627(class_742 a2) {
        return (!Class5723.field11045.method21233(a2.method_5477().getString()) ? (int)field1537[1] : (int)field1537[0]) != 0;
    }

    private static boolean method6628(class_742 a2) {
        return (!Class414.method6622(Class414.method6611(), a2.method_5477().getString()) ? (int)field1537[1] : (int)field1537[0]) != 0;
    }

    static {
        Class414.method6612(-3457887779319040320L);
    }

    public Class414(String a2, String b2, Class556 c2) {
        super(a2, b2, c2);
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}

