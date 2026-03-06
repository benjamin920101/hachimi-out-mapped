/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.effect.StatusEffectUtil
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class142;
import mapped.Class1456;
import mapped.Class1503;
import mapped.Class1731;
import mapped.Class248;
import mapped.Class260;
import mapped.Class278;
import mapped.Class287;
import mapped.Class298;
import mapped.Class556;
import mapped.Class5726;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class622;
import mapped.Class6454;
import mapped.Class79;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class309
extends Class278 {
    Class248 field655 = this.method450(new Class260("Hand", "The player swinging hand", Class622.field3038, Class309.method2408()));
    private class_1268 field656;
    private static long[] field657 = new long[4];
    private static Class309 INSTANCE;
    private class_1268 field658;

    static {
        Class309.method2404(-8717282300588390475L);
    }

    private static void method2387(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static class_746 method2388(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2389() {
        Class6009.method23561();
    }

    public static class_1268 method2390(Class309 class309) {
        return class309.field656;
    }

    private static class_1268 method2391() {
        return Class309.method2396();
    }

    private static void method2392(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method2393(int n2) {
        return Class287.method1495(n2);
    }

    public int method2394() {
        if (class_1292.method_5576((class_1309)Class309.field290.field_1724)) {
            return (int)field657[3] - ((int)field657[2] + class_1292.method_5575((class_1309)Class309.field290.field_1724));
        }
        return Class309.field290.field_1724.method_6059(class_1294.field_5901) ? (int)field657[3] + ((int)field657[2] + Class309.field290.field_1724.method_6112(class_1294.field_5901).method_5578()) * (int)field657[1] : (int)field657[3];
    }

    public static class_746 method2395(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_1268 method2396() {
        return class_1268.field_5810;
    }

    public class_1268 method2397() {
        return this.field658;
    }

    public Class309() {
        super("Swing", "Modifies the swinging hand", Class556.field2754);
        INSTANCE = this;
    }

    public static Class309 method2398() {
        return INSTANCE;
    }

    private static void method2399() {
        Class6454.method24594();
    }

    private static void method2400() {
        Class6009.method23560();
    }

    private static class_746 method2401(class_310 class_3102) {
        return Class309.method2388(class_3102);
    }

    private static void method2402() {
        Class298.method1924();
    }

    public static class_1268 method2403(Class309 class309) {
        return class309.field658;
    }

    private static void method2404(long l2) {
        Class309.field657[2] = l2 ^ 0x8705FDEF0AA107B4L;
        Class309.field657[0] = l2 ^ 0x8705FDEF0AA107B5L;
        Class309.field657[1] = l2 ^ 0x8705FDEF0AA107B7L;
        Class309.field657[3] = l2 ^ 0x8705FDEF0AA107B3L;
    }

    public static Class248 method2405(Class309 class309) {
        return class309.field655;
    }

    public static class_746 method2406(class_310 class_3102) {
        return class_3102.field_1724;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method1279() {
        int n2 = Class309.method2401(field290) != null ? 51858 : 51859;
        block4: while (true) {
            switch (n2) {
                case 51859: {
                    n2 = 51857;
                    continue block4;
                }
                case 51858: {
                    Class309.field290.field_1724.field_6266 = this.field656;
                    return;
                }
            }
            break;
        }
    }

    private static void method2407(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Class622[] method2408() {
        return Class622.values();
    }

    @Override
    public void method1274() {
        if (Class309.field290.field_1724 != null) {
            this.field656 = Class309.field290.field_1724.field_6266;
            if (this.field655.method507() != Class622.field3040) {
                this.method2415((Class622)((Object)Class309.method2405(this).method507()));
            }
        }
    }

    private static void method2409() {
        Class5836.method22897();
    }

    public static Class309 method2410() {
        return Class309.method2398();
    }

    public class_1268 method2411() {
        return Class309.method2390(this);
    }

    private static int method2412(int n2, int n3, Class142 class142, Class5726 class5726) {
        return Class1731.method15494(n2, n3, class142, class5726);
    }

    private static void method2413(boolean bl2) {
        Class1108.method12918(bl2);
    }

    @Class1
    public void method2414(Class79 a2) {
        this.method2415((Class622)((Object)this.field655.method507()));
    }

    private void method2415(Class622 a2) {
        block11: {
            class_1268 class_12682;
            block8: {
                block9: {
                    block10: {
                        block7: {
                            switch (a2.ordinal() ^ 0x1B761C3B) {
                                default: {
                                    break block7;
                                }
                                case 460725304: {
                                    break block8;
                                }
                                case 460725305: {
                                    Class309.method2407(Class1456.field5540, 0.31164652f);
                                    return;
                                }
                                case 460725306: {
                                    break block9;
                                }
                                case 460725307: {
                                    break;
                                }
                            }
                            break block10;
                        }
                        throw new MatchException(null, null);
                    }
                    class_12682 = class_1268.field_5808;
                    break block11;
                }
                class_12682 = Class309.method2391();
                break block11;
            }
            Class309.method2406((class_310)Class309.field290).field_6279 = (int)field657[0];
            Class309.field290.field_1724.field_6252 = (int)field657[0];
            class_12682 = this.field658 = null;
        }
        if (this.field658 != null) {
            Class309.field290.field_1724.field_6266 = this.field658;
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

