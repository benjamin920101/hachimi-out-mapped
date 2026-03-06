/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2793
 *  net.minecraft.class_2813
 *  net.minecraft.class_2824
 *  net.minecraft.class_2827
 *  net.minecraft.class_2828
 *  net.minecraft.class_2838
 *  net.minecraft.class_2840
 *  net.minecraft.class_2851
 *  net.minecraft.class_2868
 *  net.minecraft.class_2873
 *  net.minecraft.class_2879
 *  net.minecraft.class_2885
 *  net.minecraft.class_2886
 *  net.minecraft.class_6374
 */
package mapped;

import mapped.Class1;
import mapped.Class1108;
import mapped.Class131;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class198;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class538;
import mapped.Class5478;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class5984;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class96;
import net.minecraft.class_2793;
import net.minecraft.class_2813;
import net.minecraft.class_2824;
import net.minecraft.class_2827;
import net.minecraft.class_2828;
import net.minecraft.class_2838;
import net.minecraft.class_2840;
import net.minecraft.class_2851;
import net.minecraft.class_2868;
import net.minecraft.class_2873;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_6374;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class294
extends Class278 {
    Class248 field524;
    Class248 field525 = this.method450(new Class253("PlayerMove", "Cancels the PlayerMoveC2SPacket packet", (boolean)field527[0]));
    Class248 field526 = this.method450(new Class253("PlayerInput", "Cancels the PlayerInputC2SPacket packet", (boolean)field527[0]));
    private static long[] field527 = new long[1];
    Class248 field528;
    Class248 field529;
    Class248 field530;
    Class248 field531;
    Class248 field532;
    Class248 field533;
    Class248 field534;
    Class248 field535;
    Class248 field536;
    Class248 field537 = this.method450(new Class253("PlayerInteractBlock", "Cancels the PlayerInteractBlockC2SPacket packet", (boolean)field527[0]));
    Class248 field538;

    private static void method1743() {
        Class5836.method22897();
    }

    private static void method1744() {
        Class5659.method22184();
    }

    private static void method1745(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method1746(float f2) {
        Class5836.method22907(f2);
    }

    private static void method1747(long l2) {
        Class294.field527[0] = l2 ^ 0x7DA847205834630AL;
    }

    private static Class248 method1748(Class294 class294) {
        return Class294.method1766(class294);
    }

    private static void method1749() {
        Class6454.method24594();
    }

    private static void method1750() {
        Class4146.method20697();
    }

    private static void method1751() {
        Class5836.method22885();
    }

    public static Class248 method1752(Class294 class294) {
        return class294.field538;
    }

    public Class294() {
        super("PacketCanceler", "Cancels packets when sending to server", Class556.field2755);
        this.field529 = this.method450(new Class253("PlayerInteractEntity", "Cancels the PlayerInteractEntityC2SPacket packet", (boolean)field527[0]));
        this.field531 = this.method450(new Class253("PlayerInteractItem", "Cancels the PlayerInteractItemC2SPacket packet", (boolean)field527[0]));
        this.field530 = this.method450(new Class253("CraftRequest", "Cancels the CraftRequestSlotC2SPacket packet", (boolean)field527[0]));
        this.field528 = this.method450(new Class253("UpdateSelectedSlot", "Cancels the UpdateSelectedSlotC2SPacket packet", (boolean)field527[0]));
        this.field532 = this.method450(new Class253("ClickSlot", "Cancels the ClickSlotC2SPacket packet", (boolean)field527[0]));
        this.field533 = this.method450(new Class253("PickFromInventory", "Cancels the PickFromInventoryC2SPacket packet", (boolean)field527[0]));
        this.field536 = this.method450(new Class253("CreativeInventoryAction", "Cancels the CreativeInventoryActionC2SPacket packet", (boolean)field527[0]));
        this.field524 = this.method450(new Class253("HandSwing", "Cancels the HandSwingC2SPacket packet", (boolean)field527[0]));
        this.field535 = this.method450(new Class253("TeleportConfirm", "Cancels the TeleportConfirmC2SPacket packet", (boolean)field527[0]));
        this.field538 = this.method450(new Class253("KeepAlive", "Cancels the KeepAliveC2SPacket packet", (boolean)field527[0]));
        this.field534 = this.method450(new Class253("CommonPong", "Cancels the CommonPongC2SPacket packet", (boolean)field527[0]));
    }

    private static void method1753() {
        Class3979.method19561();
    }

    private static void method1754() {
        Class6009.method23560();
    }

    private static void method1755(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method1756() {
        Class5836.method22897();
    }

    private static void method1757(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method1758() {
        Class5836.method22890();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method1759(Class131 a) {
        block19: {
            block26: {
                block25: {
                    block24: {
                        block23: {
                            block22: {
                                block21: {
                                    block20: {
                                        block18: {
                                            if (!(a.method251() instanceof class_2828) || !((Boolean)this.field525.method507()).booleanValue()) break block18;
                                            a.method10();
                                            break block19;
                                        }
                                        if (!(a.method251() instanceof class_2851) || !((Boolean)this.field526.method507()).booleanValue()) break block20;
                                        a.method10();
                                        break block19;
                                    }
                                    if (!(a.method251() instanceof class_2885)) break block21;
                                    if (!((Boolean)this.field537.method507()).booleanValue()) break block21;
                                    a.method10();
                                    break block19;
                                }
                                if (!(a.method251() instanceof class_2824)) break block22;
                                if (!((Boolean)this.field529.method507()).booleanValue()) break block22;
                                a.method10();
                                break block19;
                            }
                            if (!(a.method251() instanceof class_2886)) break block23;
                            if (!((Boolean)this.field531.method507()).booleanValue()) break block23;
                            a.method10();
                            break block19;
                        }
                        if (a.method251() instanceof class_2840 && ((Boolean)Class294.method1748(this).method507()).booleanValue()) {
                            a.method10();
                            Class294.method1755(false);
                            return;
                        }
                        if (a.method251() instanceof class_2868) {
                            if (!((Boolean)this.field528.method507()).booleanValue()) {
                                Class1503.method14420();
                                return;
                            }
                            a.method10();
                            Class298.method1924();
                            return;
                        }
                        if (!(a.method251() instanceof class_2813) || !((Boolean)this.field532.method507()).booleanValue()) break block24;
                        a.method10();
                        break block19;
                    }
                    if (!(a.method251() instanceof class_2838)) break block25;
                    if (!((Boolean)Class294.method1774(this.field533)).booleanValue()) break block25;
                    a.method10();
                    break block19;
                }
                if (!(a.method251() instanceof class_2873)) ** GOTO lbl-1000
                if (!((Boolean)Class294.method1764(Class294.method1761(this))).booleanValue()) break block26;
                v0 = 63131;
                ** GOTO lbl53
            }
            v0 = 63132;
            if (true) ** GOTO lbl53
            block8: while (true) {
                v0 = 63130;
lbl53:
                // 3 sources

                switch (v0) {
                    case 63132: {
                        continue block8;
                    }
                    case 63131: {
                        a.method10();
                        break block8;
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (!(a.method251() instanceof class_2879)) ** GOTO lbl76
                        if (!((Boolean)Class294.method1776(this.field524)).booleanValue()) ** GOTO lbl64
                        v1 = 47672;
                        ** GOTO lbl68
lbl64:
                        // 1 sources

                        v1 = 47673;
                        if (true) ** GOTO lbl68
                        block9: while (true) {
                            v1 = 47671;
lbl68:
                            // 3 sources

                            switch (v1) {
                                case 47673: {
                                    continue block9;
                                }
                                case 47672: {
                                    a.method10();
                                    break block8;
                                }
                                default: {
                                    if (a.method251() instanceof class_2793) ** GOTO lbl78
                                }
                            }
                            break;
                        }
lbl76:
                        // 1 sources

                        if (a.method251() instanceof class_2793) ** GOTO lbl78
                        ** GOTO lbl80
lbl78:
                        // 2 sources

                        v2 = 33749;
                        ** GOTO lbl84
lbl80:
                        // 1 sources

                        v2 = 33750;
                        if (true) ** GOTO lbl84
                        do {
                            v2 = var2_2 = 33748;
lbl84:
                            // 3 sources

                            if (var2_2 == 33749) ** GOTO lbl87
                        } while (var2_2 == 33750);
                        ** GOTO lbl90
lbl87:
                        // 1 sources

                        if (((Boolean)Class294.method1765(this.field535)).booleanValue()) {
                            a.method10();
                            break block8;
                        }
lbl90:
                        // 3 sources

                        if (!(a.method251() instanceof class_2827)) {
                            Class1108.method12918(true);
                            return;
                        }
                        if (((Boolean)Class294.method1768(this).method507()).booleanValue()) {
                            a.method10();
                            break block8;
                        }
                        if (!(a.method251() instanceof class_6374)) break block8;
                        if (!((Boolean)this.field534.method507()).booleanValue()) ** GOTO lbl100
                        v3 = 64263;
                        ** GOTO lbl104
lbl100:
                        // 1 sources

                        v3 = 64264;
                        if (true) ** GOTO lbl104
                        do {
                            v3 = var3_3 = 64262;
lbl104:
                            // 3 sources

                            if (var3_3 == 64263) ** GOTO lbl107
                        } while (var3_3 == 64264);
                        break block8;
lbl107:
                        // 1 sources

                        a.method10();
                    }
                }
                break;
            }
        }
    }

    private static void method1760() {
        Class5659.method22184();
    }

    private static Class248 method1761(Class294 class294) {
        return Class294.method1777(class294);
    }

    private static void method1762(float f2) {
        Class5836.method22907(f2);
    }

    private static void method1763(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static Object method1764(Class248 class248) {
        return class248.method507();
    }

    private static Object method1765(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method1766(Class294 class294) {
        return class294.field530;
    }

    private static void method1767(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    static {
        Class294.method1747(9054565255072736010L);
    }

    private static Class248 method1768(Class294 class294) {
        return Class294.method1752(class294);
    }

    private static void method1769() {
        Class4146.method20697();
    }

    private static void method1770() {
        Class6009.method23560();
    }

    private static int method1771(int n2, int n3, Class5478 class5478, Class198 class198) {
        return Class5984.method23418(n2, n3, class5478, class198);
    }

    private static void method1772() {
        Class6009.method23561();
    }

    private static void method1773(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object method1774(Class248 class248) {
        return class248.method507();
    }

    private static int method1775(int n2, int n3, Class96 class96, Class538 class538) {
        return Class5984.method23424(n2, n3, class96, class538);
    }

    private static Object method1776(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method1777(Class294 class294) {
        return class294.field536;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

