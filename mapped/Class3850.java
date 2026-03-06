/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.collection.DefaultedList
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket
 *  net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.packet.s2c.play.BundleS2CPacket
 */
package mapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mapped.Class1;
import mapped.Class10;
import mapped.Class1021;
import mapped.Class1044;
import mapped.Class106;
import mapped.Class1093;
import mapped.Class110;
import mapped.Class113;
import mapped.Class114;
import mapped.Class117;
import mapped.Class1198;
import mapped.Class121;
import mapped.Class1278;
import mapped.Class129;
import mapped.Class131;
import mapped.Class133;
import mapped.Class1340;
import mapped.Class135;
import mapped.Class136;
import mapped.Class1463;
import mapped.Class15;
import mapped.Class1503;
import mapped.Class1578;
import mapped.Class1621;
import mapped.Class1664;
import mapped.Class1668;
import mapped.Class167;
import mapped.Class1745;
import mapped.Class1792;
import mapped.Class1806;
import mapped.Class1807;
import mapped.Class181;
import mapped.Class192;
import mapped.Class194;
import mapped.Class221;
import mapped.Class230;
import mapped.Class231;
import mapped.Class246;
import mapped.Class265;
import mapped.Class27;
import mapped.Class287;
import mapped.Class291;
import mapped.Class298;
import mapped.Class3;
import mapped.Class302;
import mapped.Class306;
import mapped.Class308;
import mapped.Class313;
import mapped.Class319;
import mapped.Class3272;
import mapped.Class329;
import mapped.Class3323;
import mapped.Class3332;
import mapped.Class338;
import mapped.Class34;
import mapped.Class342;
import mapped.Class343;
import mapped.Class3442;
import mapped.Class3449;
import mapped.Class3455;
import mapped.Class3473;
import mapped.Class3481;
import mapped.Class35;
import mapped.Class3546;
import mapped.Class3571;
import mapped.Class358;
import mapped.Class368;
import mapped.Class370;
import mapped.Class3794;
import mapped.Class3815;
import mapped.Class3817;
import mapped.Class3860;
import mapped.Class39;
import mapped.Class390;
import mapped.Class3913;
import mapped.Class3933;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class4070;
import mapped.Class408;
import mapped.Class4084;
import mapped.Class4110;
import mapped.Class4122;
import mapped.Class413;
import mapped.Class414;
import mapped.Class4146;
import mapped.Class421;
import mapped.Class4218;
import mapped.Class4225;
import mapped.Class4244;
import mapped.Class425;
import mapped.Class4257;
import mapped.Class4259;
import mapped.Class434;
import mapped.Class435;
import mapped.Class452;
import mapped.Class455;
import mapped.Class475;
import mapped.Class480;
import mapped.Class5183;
import mapped.Class523;
import mapped.Class535;
import mapped.Class539;
import mapped.Class54;
import mapped.Class5434;
import mapped.Class5449;
import mapped.Class548;
import mapped.Class5496;
import mapped.Class5548;
import mapped.Class5582;
import mapped.Class5587;
import mapped.Class560;
import mapped.Class5648;
import mapped.Class5659;
import mapped.Class5677;
import mapped.Class5688;
import mapped.Class5710;
import mapped.Class5723;
import mapped.Class5740;
import mapped.Class5787;
import mapped.Class5806;
import mapped.Class5836;
import mapped.Class5843;
import mapped.Class586;
import mapped.Class5860;
import mapped.Class5861;
import mapped.Class597;
import mapped.Class6009;
import mapped.Class6011;
import mapped.Class609;
import mapped.Class6103;
import mapped.Class624;
import mapped.Class6242;
import mapped.Class6253;
import mapped.Class626;
import mapped.Class6286;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6343;
import mapped.Class635;
import mapped.Class64;
import mapped.Class6404;
import mapped.Class6408;
import mapped.Class6424;
import mapped.Class6435;
import mapped.Class6454;
import mapped.Class6461;
import mapped.Class67;
import mapped.Class693;
import mapped.Class696;
import mapped.Class697;
import mapped.Class712;
import mapped.Class713;
import mapped.Class73;
import mapped.Class79;
import mapped.Class804;
import mapped.Class840;
import mapped.Class899;
import mapped.Class90;
import mapped.Class947;
import mapped.Class955;
import net.hachimi.client.mixin.c;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.s2c.play.BundleS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3850 {
    private final List field8724 = new CopyOnWriteArrayList();
    private int field8725 = (int)field8726[0];
    private static long[] field8726 = new long[8];

    public static class_746 method18828(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method18829(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static class_746 method18830(class_310 class_3102) {
        return Class3850.method18950(class_3102);
    }

    public static void method18831(class_1661 class_16612, int n2) {
        class_16612.field_7545 = n2;
    }

    private static int method18832(int n2, int n3, Class6286 class6286, Class713 class713) {
        return Class6103.method23978(n2, n3, class6286, class713);
    }

    private static int method18833(int n2, int n3, Class230 class230, Class358 class358) {
        return Class6103.method23999(n2, n3, class230, class358);
    }

    private static int method18834(int n2, int n3, Class414 class414, Class1792 class1792) {
        return Class6103.method23997(n2, n3, class414, class1792);
    }

    public void method18835(int a2) {
        this.method18914(a2, (int)field8726[4], class_1713.field_7795);
    }

    private static int method18836(int n2) {
        return Class287.method1495(n2);
    }

    public static class_634 method18837(class_746 class_7462) {
        return class_7462.field_3944;
    }

    private static int method18838(int n2, int n3, Class113 class113, Class4110 class4110) {
        return Class6103.method24012(n2, n3, class113, class4110);
    }

    private static void method18839(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static class_746 method18840(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method18841(int n2, int n3, Class597 class597, Class4225 class4225) {
        return Class6103.method23959(n2, n3, class597, class4225);
    }

    private static int method18842(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    /*
     * Unable to fully structure code
     */
    @Class1(priority=-9999)
    public void method18843(Class131 c) {
        block3: {
            block4: {
                block2: {
                    block5: {
                        var2_2 = c.method251();
                        if (!(var2_2 instanceof class_2868)) break block3;
                        b = (class_2868)var2_2;
                        a = b.method_12442();
                        if (!class_1661.method_7380((int)a)) break block2;
                        if (Class3850.method18929(this) != a) break block4;
                        if (!Class455.method10581().method10559()) break block5;
                        v0 = 62734;
                        ** GOTO lbl16
                    }
                    v0 = 62735;
                    if (Class3850.method18991(593713087, -379454733, null, null) < 834456847) ** GOTO lbl16
                    Class5836.method22885();
                    return;
lbl-1000:
                    // 1 sources

                    {
                        v0 = var4_5 = 62733;
lbl16:
                        // 3 sources

                        if (var4_5 != 62734) continue;
                        if (Class3850.method18921(497727126, -1598446597, null, null) > 146920091) {
                            Class4146.method20697();
                            return;
                        }
                        break block2;
                        ** while (var4_5 == 62735)
                    }
lbl22:
                    // 1 sources

                    break block4;
                }
                c.method10();
                return;
            }
            this.field8725 = a;
        }
    }

    private static int method18844(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static int method18845(int n2, int n3, Class626 class626, Class5710 class5710) {
        return Class6103.method23981(n2, n3, class626, class5710);
    }

    public class_1799 method18846() {
        if (Class4122.field9561.field_1724 != null && this.method18969() != (int)field8726[0]) {
            return Class4122.field9561.field_1724.method_31548().method_5438(this.method18969());
        }
        return null;
    }

    static {
        Class3850.method18984(7749919364231569839L);
    }

    private static int method18847(int n2, int n3, Class265 class265, Class6461 class6461) {
        return Class6103.method23975(n2, n3, class265, class6461);
    }

    public static class_310 method18848() {
        return Class4122.field9561;
    }

    private static void method18849(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method18850() {
        Class4146.method20697();
    }

    @Class1
    public void method18851(Class63 a2) {
        this.field8724.removeIf(Class5860::method23130);
    }

    private static void method18852() {
        Class6009.method23560();
    }

    private static int method18853(int n2, int n3, Class136 class136, Class609 class609) {
        return Class6103.method23955(n2, n3, class136, class609);
    }

    private static void method18854() {
        Class6454.method24594();
    }

    @Class1
    public void method18855(Class221 a2) {
        if (a2.method412() == Class4122.field9561.field_1724) {
            this.method18916();
        }
    }

    private static int method18856(int n2, int n3, Class548 class548, Class308 class308) {
        return Class6103.method23958(n2, n3, class548, class308);
    }

    private static int method18857(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static int method18858(int n2, int n3, Class306 class306, Class63 class63) {
        return Class6103.method23991(n2, n3, class306, class63);
    }

    public void method18859(int a2) {
        this.method18914(a2, (int)field8726[4], class_1713.field_7794);
    }

    private static void method18860() {
        Class6009.method23561();
    }

    private static int method18861(int n2, int n3, Class6253 class6253, Class697 class697) {
        return Class6103.method23970(n2, n3, class6253, class697);
    }

    private static int method18862(int n2, int n3, Class4244 class4244, Class167 class167) {
        return Class6103.method24011(n2, n3, class4244, class167);
    }

    private static int method18863() {
        return Class6454.method24637();
    }

    public static class_310 method18864() {
        return Class4122.field9561;
    }

    public static class_746 method18865(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method18866() {
        Class5836.method22890();
    }

    private static void method18867(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    @Class1
    public void method18868(Class5688 a2) {
        if (Class425.method8407().method1265()) {
            if (Class425.method8407().method8500()) {
                return;
            }
        }
        if (Class4122.field9561.field_1724 == null) {
            return;
        }
        if (this.field8725 == Class3850.method18976((class_310)Class3850.method18963()).method_31548().field_7545) {
            if (Class3850.method18932(714340565, 41738710, null, null) != 34660544) {
                Class1503.method14420();
                return;
            }
        } else {
            Class3850.method18971(this, Class4122.field9561.field_1724.method_31548().field_7545);
            Class4122.field9561.field_1761.field_3721 = Class3850.method18869((class_310)Class4122.field9561).method_31548().field_7545;
        }
    }

    private static class_746 method18869(class_310 class_3102) {
        return Class3850.method18828(class_3102);
    }

    private static int method18870(int n2, int n3, Class342 class342, Class3913 class3913) {
        return Class6103.method23985(n2, n3, class342, class3913);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method18871(int a2) {
        int n2;
        if (class_1661.method_7380((int)a2)) {
            n2 = 16269;
            if (Class3850.method18985(394660324, -1578929462, null, null) != 436970998) {
                Class6322.method24332(Class1340.field5180, Class5806.field11305);
                return;
            }
        } else {
            n2 = 16270;
        }
        block4: while (true) {
            switch (n2) {
                case 16270: {
                    n2 = 16268;
                    continue block4;
                }
                case 16269: {
                    Class4122.field9561.field_1761.method_2906(Class3850.method18958((class_310)Class4122.field9561).field_7498.field_7763, a2 + (int)field8726[2], this.field8725, class_1713.field_7791, (class_1657)Class4122.field9561.field_1724);
                    return;
                }
            }
            break;
        }
    }

    private static int method18872(int n2, int n3, Class475 class475, Class4084 class4084) {
        return Class6103.method23987(n2, n3, class475, class4084);
    }

    private static int method18873(int n2, int n3, Class4257 class4257, Class4218 class4218) {
        return Class6103.method23944(n2, n3, class4257, class4218);
    }

    public void method18874(int a2) {
        Class3850.method18919(Class5723.field11048, (class_2596)new class_2868(a2));
    }

    private static void method18875(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method18876(int n2, int n3, Class6454 class6454, Class67 class67) {
        return Class6103.method23942(n2, n3, class6454, class67);
    }

    private static int method18877(int n2, int n3, Class3933 class3933, Class480 class480) {
        return Class6103.method23960(n2, n3, class3933, class480);
    }

    public void method18878() {
        Class3850.method18897(this, (int)field8726[0]);
    }

    private static int method18879(int n2) {
        return Class4045.method20095(n2);
    }

    private static void method18880() {
        Class1807.method15744();
    }

    private static int method18881(int n2, int n3, Class194 class194, Class54 class54) {
        return Class6103.method24006(n2, n3, class194, class54);
    }

    private static void method18882() {
        Class5836.method22890();
    }

    private static int method18883(int n2, int n3, Class434 class434, Class5587 class5587) {
        return Class6103.method23957(n2, n3, class434, class5587);
    }

    private static void method18884(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public Class3850() {
        Class3815.INSTANCE.method18546(this);
    }

    private static int method18885(int n2, int n3, Class135 class135, Class368 class368) {
        return Class6103.method23947(n2, n3, class135, class368);
    }

    private static int method18886(int n2, int n3, Class121 class121, Class5582 class5582) {
        return Class6103.method24003(n2, n3, class121, class5582);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method18887(int c2) {
        int n2;
        if (this.field8725 != c2) {
            n2 = 5226;
        } else {
            n2 = 5227;
            if (Class3850.method18912(1046768403, 1073282003, null, null) <= 832874202) {
                Class6322.method24332(0.08703512f, Class3481.field7642);
                return;
            }
        }
        block4: while (true) {
            switch (n2) {
                case 5227: {
                    n2 = 5225;
                    continue block4;
                }
                case 5226: {
                    if (!class_1661.method_7380((int)c2)) {
                        return;
                    }
                    this.method18874(c2);
                    class_1799[] b2 = new class_1799[(int)field8726[3]];
                    int a2 = (int)field8726[4];
                    while (true) {
                        if (a2 >= (int)field8726[3]) {
                            if (Class3850.method18972(1073269545, 493547069, null, null) >= 563143288) {
                                Class4036.method20085(0.3737703f, Class840.field3682, 0.03817743f, Class6242.field12758, 0.21260226f, Class5861.field11573);
                                return;
                            }
                            this.field8724.add(new Class5860(b2, this.field8725, c2));
                            return;
                        }
                        b2[a2] = Class4122.field9561.field_1724.method_31548().method_5438(a2);
                        ++a2;
                    }
                }
            }
            break;
        }
    }

    private static int method18888(int n2) {
        return Class4045.method20096(n2);
    }

    private static int method18889(int n2, int n3, Class3817 class3817, Class3323 class3323) {
        return Class6103.method23977(n2, n3, class3817, class3323);
    }

    private static void method18890(float f2) {
        Class5836.method22907(f2);
    }

    @Class1
    public void method18891(Class27 b2) {
        if (Class3850.method18830(Class3850.method18848()) == null) {
            return;
        }
        if (!this.method18956()) {
            if (Class3850.method18924(536658261, 573573842, null, null) < 106127793) {
                Class3850.method18939();
                return;
            }
        } else {
            class_1799 a2 = Class3850.method18902(this);
            if (a2 != null) {
                b2.method10();
                b2.method50(a2);
            }
        }
    }

    private static int method18892(int n2, int n3, Class413 class413, Class5740 class5740) {
        return Class6103.method24009(n2, n3, class413, class5740);
    }

    public int method18893() {
        int b2 = (int)field8726[3];
        while (true) {
            if (b2 >= (int)field8726[2]) {
                if (Class3850.method18883(736599615, 991763335, null, null) == 381289657) {
                    if (Class3850.method18876(134089396, -1737368122, null, null) != 228875245) break;
                    return Class3850.method18857(-1006660936, Class6424.field13334);
                }
                return Class3850.method18933(-1024313089, 0.46775293f);
            }
            class_1799 a2 = Class4122.field9561.field_1724.method_31548().method_5438(b2);
            if (a2.method_7960()) {
                return b2;
            }
            ++b2;
        }
        return (int)field8726[0];
    }

    private static int method18894(int n2, int n3, Class1621 class1621, Class34 class34) {
        return Class6103.method24000(n2, n3, class1621, class34);
    }

    private static int method18895(int n2, int n3, Class539 class539, Class560 class560) {
        return Class6103.method23934(n2, n3, class539, class560);
    }

    private static void method18896(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method18897(Class3850 class3850, int n2) {
        Class3850.method18909(class3850, n2);
    }

    private static void method18898(class_1661 class_16612, int n2) {
        Class3850.method18831(class_16612, n2);
    }

    private static int method18899(int n2, int n3, Class6253 class6253, Class110 class110) {
        return Class6103.method23962(n2, n3, class6253, class110);
    }

    @Class1
    public void method18900(Class90 a2) {
        if (Class425.method8407().method1265() && Class425.method8407().method8500()) {
            a2.method10();
        }
    }

    private static int method18901() {
        return Class6454.method24637();
    }

    private static class_1799 method18902(Class3850 class3850) {
        return class3850.method18846();
    }

    private static int method18903(int n2, int n3, Class27 class27, Class3442 class3442) {
        return Class6103.method23973(n2, n3, class27, class3442);
    }

    private static void method18904(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method18905() {
        Class5659.method22184();
    }

    public static class_2371 method18906(class_1703 class_17032) {
        return class_17032.field_7761;
    }

    private static int method18907(int n2, int n3, Class624 class624, Class291 class291) {
        return Class6103.method23967(n2, n3, class624, class291);
    }

    public class_1799 method18908() {
        if (Class4122.field9561.field_1724 != null) {
            if (this.method18969() == (int)field8726[0]) {
                if (Class3850.method18941(1070375017, 1843515927, null, null) <= 446289591) {
                    Class6009.method23559(true);
                    return null;
                }
            } else {
                return Class4122.field9561.field_1724.method_31548().method_5438(this.method18969());
            }
        }
        return Class4122.field9561.field_1724.method_6047();
    }

    public static void method18909(Class3850 class3850, int n2) {
        class3850.field8725 = n2;
    }

    public int method18910(int e2, int f2, class_1713 g2) {
        if (e2 < 0) {
            return (int)field8726[0];
        }
        class_1703 h2 = Class4122.field9561.field_1724.field_7512;
        class_2371 i2 = h2.field_7761;
        int j2 = i2.size();
        ArrayList k2 = Lists.newArrayListWithCapacity((int)j2);
        for (class_1735 a2 : i2) {
            k2.add(a2.method_7677().method_7972());
            if (Class3850.method18894(-1586777136, 308769006, null, null) != 341116171) continue;
            return Class4045.method20103(-610822259);
        }
        Int2ObjectOpenHashMap l2 = new Int2ObjectOpenHashMap();
        int d2 = (int)field8726[4];
        while (true) {
            class_1799 b2;
            if (d2 >= j2) {
                if (Class3850.method18966(1053190135, 1431922160, null, null) < 1044338865) break;
                return Class4045.method20090(958142519, 0.60975504f);
            }
            class_1799 c2 = (class_1799)k2.get(d2);
            if (!class_1799.method_7973((class_1799)c2, (class_1799)(b2 = ((class_1735)i2.get(d2)).method_7677()))) {
                l2.put(d2, (Object)b2.method_7972());
            }
            ++d2;
        }
        Class3850.method18837(Class4122.field9561.field_1724).method_52787((class_2596)new class_2813(h2.field_7763, h2.method_37421(), e2, f2, g2, h2.method_34255().method_7972(), (Int2ObjectMap)l2));
        return h2.method_37421();
    }

    public static int method18911(class_1703 class_17032) {
        return class_17032.field_7763;
    }

    private static int method18912(int n2, int n3, Class313 class313, Class3455 class3455) {
        return Class6103.method23971(n2, n3, class313, class3455);
    }

    private static int method18913(int n2, int n3, Class6435 class6435, Class181 class181) {
        return Class6103.method24004(n2, n3, class6435, class181);
    }

    public int method18914(int e2, int f2, class_1713 g2) {
        if (e2 < 0) {
            return (int)field8726[0];
        }
        class_1703 h2 = Class4122.field9561.field_1724.field_7512;
        class_2371 i2 = Class3850.method18906(h2);
        int j2 = i2.size();
        ArrayList k2 = Lists.newArrayListWithCapacity((int)j2);
        for (class_1735 a2 : i2) {
            k2.add(a2.method_7677().method_7972());
        }
        h2.method_7593(e2, f2, g2, (class_1657)Class4122.field9561.field_1724);
        Int2ObjectOpenHashMap l2 = new Int2ObjectOpenHashMap();
        for (int d2 = (int)field8726[4]; d2 < j2; ++d2) {
            class_1799 b2;
            class_1799 c2 = (class_1799)k2.get(d2);
            if (class_1799.method_7973((class_1799)c2, (class_1799)(b2 = ((class_1735)i2.get(d2)).method_7677()))) {
                if (Class3850.method18965(477974800, 1463988700, null, null) != 146837309) {
                    while (Class3850.method18918(-64244103, 813051219, null, null) < 187182453) {
                    }
                } else {
                    while (Class3850.method18853(1779811006, 979542908, null, null) <= 190275142) {
                    }
                    continue;
                }
                return Class4045.method20095(-1355708345);
            }
            l2.put(d2, (Object)b2.method_7972());
        }
        Class3850.method18865((class_310)Class4122.field9561).field_3944.method_52787((class_2596)new class_2813(h2.field_7763, h2.method_37421(), e2, f2, g2, h2.method_34255().method_7972(), (Int2ObjectMap)l2));
        return h2.method_37421();
    }

    private static int method18915(int n2, int n3, Class370 class370, Class696 class696) {
        return Class6103.method23993(n2, n3, class370, class696);
    }

    public void method18916() {
        if (this.method18956()) {
            this.method18987(Class3850.method18937(Class4122.field9561.field_1724.method_31548()));
        }
    }

    private static void method18917(float f2) {
        Class5836.method22907(f2);
    }

    private static int method18918(int n2, int n3, Class635 class635, Class6404 class6404) {
        return Class6103.method23933(n2, n3, class635, class6404);
    }

    private static void method18919(Class5496 class5496, class_2596 class_25962) {
        class5496.method21341(class_25962);
    }

    private static void method18920() {
        Class4146.method20694();
    }

    private static int method18921(int n2, int n3, Class535 class535, Class319 class319) {
        return Class6103.method23964(n2, n3, class535, class319);
    }

    private static void method18922() {
        Class1503.method14420();
    }

    public int method18923(int a2) {
        return this.method18914(a2, (int)field8726[4], class_1713.field_7790);
    }

    private static int method18924(int n2, int n3, Class3794 class3794, Class192 class192) {
        return Class6103.method23990(n2, n3, class3794, class192);
    }

    private static int method18925(int n2, int n3, Class39 class39, Class3913 class3913) {
        return Class6103.method23939(n2, n3, class39, class3913);
    }

    @Class1
    public void method18926(Class117 a2) {
        this.method18878();
    }

    private static void method18927() {
        Class1503.method14420();
    }

    private static class_1799 method18928(Class5860 class5860, int n2) {
        return class5860.method23131(n2);
    }

    public static int method18929(Class3850 class3850) {
        return class3850.field8725;
    }

    private static class_310 method18930() {
        return Class3850.method18948();
    }

    public void method18931(int a2) {
        if (Class4122.field9561.field_1724.method_31548().field_7545 == a2) {
            if (Class3850.method18892(536981946, -723793543, null, null) != 607369663) {
                Class6454.method24636(0.3278978804110252, 0.833714285797716, 0.8058149701001863, 0.6136186413728167);
                return;
            }
        } else if (class_1661.method_7380((int)a2)) {
            Class3850.method18898(Class4122.field9561.field_1724.method_31548(), a2);
            this.method18874(a2);
        }
    }

    private static int method18932(int n2, int n3, Class246 class246, Class3571 class3571) {
        return Class6103.method23935(n2, n3, class246, class3571);
    }

    private static int method18933(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    private static int method18934(int n2, int n3, Class1664 class1664, Class4070 class4070) {
        return Class6103.method23972(n2, n3, class1664, class4070);
    }

    private static int method18935(int n2, int n3, Class4259 class4259, Class523 class523) {
        return Class6103.method23950(n2, n3, class4259, class523);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method18936(Class133 h2) {
        Object b2;
        if (Class408.method6431()) return;
        if (!Class455.method10581().method10559()) {
            return;
        }
        class_2596 class_25962 = h2.method251();
        if (class_25962 instanceof class_8042) {
            class_8042 c2 = (class_8042)class_25962;
            b2 = new ArrayList();
            for (class_2596 a2 : c2.method_48324()) {
                if (a2 instanceof class_2653) {
                    while (Class3850.method18973(-2130567024, 164914541, null, null) < 761661465) {
                    }
                    continue;
                }
                b2.add(a2);
            }
            ((c)c2).setIterable((Iterable)b2);
        }
        if (Class3850.method18930().field_1724 == null) {
            return;
        }
        b2 = h2.method251();
        if (!(b2 instanceof class_2653)) return;
        class_2653 g2 = (class_2653)b2;
        if (Class4122.field9561.field_1724.field_7512.field_7763 != Class3850.method18989().field_1724.field_7498.field_7763) return;
        int f2 = g2.method_11450() - (int)field8726[2];
        if (f2 >= 0) {
            if (f2 > (int)field8726[1]) return;
            if (g2.method_11449().method_7960()) {
                return;
            }
        } else {
            if (Class3850.method18974(261156586, 1948133076, null, null) <= 559627689) {
                return;
            }
            Class5836.method22890();
            return;
        }
        Iterator<Object> iterator = Class3850.method18944(this).iterator();
        while (iterator.hasNext()) {
            int n2;
            block25: {
                block23: {
                    block24: {
                        Class5860 e2;
                        block22: {
                            class_1799 d2;
                            block21: {
                                e2 = (Class5860)iterator.next();
                                if (e2.method23128() != f2 && e2.method23127() != f2) continue;
                                d2 = Class3850.method18928(e2, f2);
                                if (!d2.method_7960()) break block21;
                                if (f2 != e2.method23127()) continue;
                                break block22;
                            }
                            if (Class3850.method18881(1030402121, -486006817, null, null) == 659719457) {
                                Class5836.method22885();
                                return;
                            }
                            while (Class3850.method18962(1564584970, 861585233, null, null) > 1045315821) {
                            }
                            if (this.method18970(d2, g2.method_11449())) break block23;
                            break block24;
                        }
                        if (this.method18970(g2.method_11449(), e2.method23131(e2.method23128()))) {
                            h2.method10();
                            return;
                        }
                        if (Class3850.method18886(442734180, 1380480613, null, null) != 125962868) continue;
                        Class6322.method24332(0.7750845f, Class1021.field4222);
                        return;
                    }
                    n2 = 29151;
                    if (Class3850.method18953(-1284950619, 191726824, null, null) > 580981292) {
                        Class1745.method15538();
                        return;
                    }
                    break block25;
                }
                n2 = 29152;
            }
            block8: while (true) {
                switch (n2) {
                    case 29152: {
                        n2 = 29150;
                        continue block8;
                    }
                    case 29151: {
                        h2.method10();
                        if (Class3850.method18873(532684513, 779689032, null, null) > 20780140) {
                            return;
                        }
                        Class6454.method24636(0.6177419050717498, 0.7916977869771504, 0.1876319459072595, Class955.field3998);
                        return;
                    }
                }
                break;
            }
        }
    }

    private static int method18937(class_1661 class_16612) {
        return Class3850.method18940(class_16612);
    }

    private static int method18938(int n2, int n3, Class181 class181, Class302 class302) {
        return Class6103.method23974(n2, n3, class181, class302);
    }

    private static void method18939() {
        Class298.method1924();
    }

    public static int method18940(class_1661 class_16612) {
        return class_16612.field_7545;
    }

    private static int method18941(int n2, int n3, Class79 class79, Class15 class15) {
        return Class6103.method23994(n2, n3, class79, class15);
    }

    private static int method18942(int n2, int n3, Class421 class421, Class1198 class1198) {
        return Class6103.method23961(n2, n3, class421, class1198);
    }

    private static int method18943(int n2, int n3, Class3546 class3546, Class6408 class6408) {
        return Class6103.method23989(n2, n3, class3546, class6408);
    }

    public static List method18944(Class3850 class3850) {
        return class3850.field8724;
    }

    private static int method18945(int n2, int n3, Class435 class435, Class35 class35) {
        return Class6103.method23995(n2, n3, class435, class35);
    }

    public void method18946() {
        Class5723.field11048.method21341((class_2596)new class_2815(Class3850.method18911(Class4122.field9561.field_1724.field_7512)));
    }

    private static int method18947(int n2, int n3, Class899 class899, Class434 class434) {
        return Class6103.method24010(n2, n3, class899, class434);
    }

    public static class_310 method18948() {
        return Class4122.field9561;
    }

    private static void method18949(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public static class_746 method18950(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public void method18951(int a2, int b2) {
        if (a2 < (int)field8726[3]) {
            a2 += 36;
        } else if (a2 != (int)field8726[6]) {
            if (Class3850.method18957(690685595, -353275561, null, null) == 570658291) {
                Class3850.method18896(0.4288835f, Class3860.field8774);
                return;
            }
        } else {
            a2 = (int)field8726[7];
        }
        Class4122.field9561.field_1761.method_2906((int)field8726[4], a2, b2, class_1713.field_7791, (class_1657)Class3850.method18840(Class4122.field9561));
    }

    private static void method18952() {
        Class298.method1924();
    }

    private static int method18953(int n2, int n3, Class231 class231, Class5183 class5183) {
        return Class6103.method23986(n2, n3, class231, class5183);
    }

    private static void method18954() {
        Class6009.method23560();
    }

    private static int method18955(int n2, int n3, Class435 class435, Class3272 class3272) {
        return Class6103.method23984(n2, n3, class435, class3272);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method18956() {
        int n2;
        int n3;
        if (Class4122.field9561.field_1724.method_31548().field_7545 != this.field8725) {
            n3 = 45110;
        } else {
            n3 = 45111;
            if (Class3850.method18925(1025304788, 2013896678, null, null) >= 702200726) {
                return Class5659.method22229(Class1093.field4434, Class5434.field10141, 0.15591993003936588, Class6011.field12006);
            }
        }
        block4: while (true) {
            switch (n3) {
                case 45111: {
                    n3 = 45109;
                    continue block4;
                }
                case 45110: {
                    n2 = (int)field8726[5];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field8726[4];
        return n2 != 0;
    }

    private static int method18957(int n2, int n3, Class106 class106, Class5843 class5843) {
        return Class6103.method23936(n2, n3, class106, class5843);
    }

    public static class_746 method18958(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method18959(int n2, int n3, Class452 class452, Class1463 class1463) {
        return Class6103.method24001(n2, n3, class452, class1463);
    }

    private static int method18960(int n2, int n3, Class1806 class1806, Class5548 class5548) {
        return Class6103.method23998(n2, n3, class1806, class5548);
    }

    private static void method18961() {
        Class5836.method22885();
    }

    private static int method18962(int n2, int n3, Class693 class693, Class3332 class3332) {
        return Class6103.method23956(n2, n3, class693, class3332);
    }

    private static class_310 method18963() {
        return Class3850.method18864();
    }

    private static boolean method18964() {
        return Class5659.method22194();
    }

    private static int method18965(int n2, int n3, Class6343 class6343, Class1044 class1044) {
        return Class6103.method23988(n2, n3, class6343, class1044);
    }

    private static int method18966(int n2, int n3, Class5648 class5648, Class10 class10) {
        return Class6103.method24002(n2, n3, class5648, class10);
    }

    private static int method18967(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    private static int method18968(int n2, int n3, Class3 class3, Class114 class114) {
        return Class6103.method24015(n2, n3, class3, class114);
    }

    public int method18969() {
        return this.field8725 != (int)field8726[0] ? this.field8725 : Class4122.field9561.field_1724.method_31548().field_7545;
    }

    private boolean method18970(class_1799 a2, class_1799 b2) {
        return class_1799.method_31577((class_1799)a2, (class_1799)b2);
    }

    private static void method18971(Class3850 class3850, int n2) {
        class3850.method18874(n2);
    }

    private static int method18972(int n2, int n3, Class343 class343, Class5449 class5449) {
        return Class6103.method23953(n2, n3, class343, class5449);
    }

    private static int method18973(int n2, int n3, Class434 class434, Class129 class129) {
        return Class6103.method23983(n2, n3, class434, class129);
    }

    private static int method18974(int n2, int n3, Class804 class804, Class3817 class3817) {
        return Class6103.method23963(n2, n3, class804, class3817);
    }

    private static int method18975(int n2, int n3, Class947 class947, Class560 class560) {
        return Class6103.method23980(n2, n3, class947, class560);
    }

    public static class_746 method18976(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method18977(int n2, int n3, Class586 class586, Class390 class390) {
        return Class6103.method23996(n2, n3, class586, class390);
    }

    private static int method18978(int n2, int n3, Class1 class1, Class3473 class3473) {
        return Class6103.method23945(n2, n3, class1, class3473);
    }

    private static int method18979(int n2, int n3, Class1578 class1578, Class5677 class5677) {
        return Class6103.method24013(n2, n3, class1578, class5677);
    }

    private static int method18980(int n2, int n3, Class5787 class5787, Class1278 class1278) {
        return Class6103.method23941(n2, n3, class5787, class1278);
    }

    private static void method18981(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method18982(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method18983(int n2, int n3, Class67 class67, Class5688 class5688) {
        return Class6103.method23976(n2, n3, class67, class5688);
    }

    private static void method18984(long l2) {
        Class3850.field8726[7] = l2 ^ 0x6B8D3E99D6F1A182L;
        Class3850.field8726[5] = l2 ^ 0x6B8D3E99D6F1A1AEL;
        Class3850.field8726[1] = l2 ^ 0x6B8D3E99D6F1A1A7L;
        Class3850.field8726[0] = l2 ^ 0x9472C166290E5E50L;
        Class3850.field8726[2] = l2 ^ 0x6B8D3E99D6F1A18BL;
        Class3850.field8726[6] = l2 ^ 0x6B8D3E99D6F1A187L;
        Class3850.field8726[3] = l2 ^ 0x6B8D3E99D6F1A1A6L;
        Class3850.field8726[4] = l2 ^ 0x6B8D3E99D6F1A1AFL;
    }

    private static int method18985(int n2, int n3, Class3449 class3449, Class73 class73) {
        return Class6103.method23946(n2, n3, class3449, class73);
    }

    private static int method18986(int n2, int n3, Class712 class712, Class64 class64) {
        return Class6103.method23949(n2, n3, class712, class64);
    }

    /*
     * Unable to fully structure code
     */
    public void method18987(int c) {
        block5: {
            d = this.method18969();
            if (d == c) break block5;
            this.method18874(c);
            b = new class_1799[(int)Class3850.field8726[3]];
            a = (int)Class3850.field8726[4];
            while (true) {
                block4: {
                    block6: {
                        if (a >= (int)Class3850.field8726[3]) break block6;
                        v0 = 37159;
                        ** GOTO lbl15
                    }
                    v0 = 37160;
                    if (true) ** GOTO lbl15
                    do {
                        v0 = var5_5 = 37158;
lbl15:
                        // 3 sources

                        if (var5_5 == 37159) break block4;
                    } while (var5_5 == 37160);
                    if (Class3850.method18960(1013549937, 1210735325, null, null) >= 513081795) {
                        while (Class3850.method18877(-43140234, 482930439, null, null) > 557915107) {
                        }
                        break;
                    }
                    Class3850.method18850();
                    return;
                }
                b[a] = Class4122.field9561.field_1724.method_31548().method_5438(a);
                ++a;
            }
            this.field8724.add(new Class5860(b, d, c));
        }
    }

    private static void method18988() {
        Class1745.method15538();
    }

    public static class_310 method18989() {
        return Class4122.field9561;
    }

    public int method18990() {
        return Class4122.field9561.field_1724.method_31548().field_7545;
    }

    private static int method18991(int n2, int n3, Class338 class338, Class329 class329) {
        return Class6103.method23938(n2, n3, class338, class329);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

