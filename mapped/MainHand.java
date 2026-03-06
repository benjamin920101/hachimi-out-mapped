/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import mapped.Class1;
import mapped.Class107;
import mapped.Class1108;
import mapped.Class1503;
import mapped.Class1608;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class1811;
import mapped.Class246;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class259;
import mapped.Class278;
import mapped.Class3472;
import mapped.Class3753;
import mapped.PhaseESP;
import mapped.Class3850;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Velocity;
import mapped.Class534;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5828;
import mapped.Class5836;
import mapped.Class5905;
import mapped.Class6009;
import mapped.Class6257;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.hit.HitResult;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class MainHand
extends Class278 {
    Class248 field1464;
    Class248 field1465;
    boolean field1466;
    Class248 field1467;
    Class248 field1468;
    private boolean field1469;
    Class248 field1470;
    Class248 field1471;
    private static long[] field1472 = new long[6];
    int field1473;
    Class248 field1474;
    private class_1792 field1475;
    Class248 field1476;
    public final Class248 field1477 = this.method450(new Class253("Totem", "Swaps to a totem in your mainhand", (boolean)field1472[0]));
    private static MainHand INSTANCE;
    Class248 field1478;
    Class248 field1479;
    private final Class925 field1480 = new Class926();
    Class248 field1481;
    Class248 field1482;

    private static void method6253() {
        Class5659.method22184();
    }

    private static void method6254() {
        Class5836.method22897();
    }

    private static void method6255(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method6256(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class248 method6257(MainHand class404) {
        return class404.field1477;
    }

    private static void method6258(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6259(Class6257 class6257, Class246 class246) {
        class6257.method24187(class246);
    }

    private static void method6260() {
        Class4146.method20694();
    }

    public static Class248 method6261(MainHand class404) {
        return class404.field1477;
    }

    public static Class3850 method6262() {
        return Class5723.field11058;
    }

    private static Object method6263(Class248 class248) {
        return class248.method507();
    }

    private static int method6264(int n2, int n3, PhaseESP class384, Class107 class107) {
        return Class3753.method18276(n2, n3, class384, class107);
    }

    private static class_1799 method6265(Class3850 class3850) {
        return class3850.method18908();
    }

    private static void method6266() {
        Class1807.method15744();
    }

    private static void method6267(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method6268(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static class_6880 method6269() {
        return MainHand.method6276();
    }

    public static Class248 method6270(MainHand class404) {
        return class404.field1477;
    }

    private static boolean method6271() {
        return Class4196.method20801();
    }

    private static void method6272(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method6273() {
        Class3979.method19561();
    }

    public static void method6274(MainHand class404, class_1792 class_17922) {
        class404.field1475 = class_17922;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method6275() {
        int n2;
        float a2 = Class5659.method22208();
        if (a2 <= ((Float)this.field1479.method507()).floatValue() || (Boolean)MainHand.method6301(this.field1467) != false && MainHand.method6326(this, a2) || (float)Class5659.method22205(MainHand.field290.field_1724.field_6017, 1.0f) + 0.5f > MainHand.field290.field_1724.method_6032() && (Boolean)this.field1478.method507() != false) {
            n2 = (int)field1472[2];
            return n2 != 0;
        }
        n2 = (int)field1472[0];
        return n2 != 0;
    }

    public static class_6880 method6276() {
        return class_1294.field_5898;
    }

    public static class_746 method6277(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method6278(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static MainHand method6279() {
        return INSTANCE;
    }

    private static boolean method6280(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static void method6281() {
        Class6009.method23560();
    }

    private static boolean method6282() {
        return Velocity.method10252();
    }

    private static void method6283() {
        Class3979.method19561();
    }

    private Boolean method1269() {
        return (Boolean)MainHand.method6261(this).method507();
    }

    private static void method6284(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private boolean method6285(float d2) {
        ArrayList e2 = Lists.newArrayList((Iterable)MainHand.field290.field_1687.method_18112());
        for (class_1297 c2 : e2) {
            if (c2 == null || !c2.method_5805() || !(c2 instanceof class_1511)) continue;
            class_1511 a2 = (class_1511)c2;
            if (MainHand.method6294(field290).method_5858(c2) > 144.0) {
                return Class5659.method22229(0.2865774726985787, Class3472.field7607, 0.6606970827623971, Class1811.field6749);
            }
            double b2 = Class5905.method23257((class_1297)MainHand.field290.field_1724, a2.method_19538(), (boolean)field1472[0]);
            if ((double)d2 - b2 > (double)((Float)this.field1479.method507()).floatValue()) continue;
            return (int)field1472[2] != 0;
        }
        return (int)field1472[0] != 0;
    }

    public static Class248 method6286(MainHand class404) {
        return class404.field1481;
    }

    private static void method6287(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private class_1792 method6288() {
        if (!((Boolean)this.field1471.method507()).booleanValue()) {
            int n2 = 40628;
            Class5836.method22897();
            return null;
        }
        int n3 = 40627;
        if (!Class4196.method20811(class_1802.field_8463, (boolean)field1472[2])) return class_1802.field_8367;
        if (MainHand.field290.field_1724.method_6059(MainHand.method6269())) return class_1802.field_8463;
        int n4 = !Class4196.method20811(class_1802.field_8367, (boolean)field1472[2]) ? 49086 : 49087;
        block4: while (true) {
            switch (n4) {
                case 49087: {
                    n4 = 49085;
                    continue block4;
                }
                case 49086: {
                    return class_1802.field_8463;
                }
            }
            break;
        }
        return class_1802.field_8367;
    }

    private static void method6289() {
        Class5659.method22184();
    }

    private static boolean method6290(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static void method6291() {
        Class5836.method22890();
    }

    private static void method6292() {
        Class1745.method15538();
    }

    private static void method6293() {
        Class4146.method20694();
    }

    private static class_746 method6294(class_310 class_3102) {
        return MainHand.method6314(class_3102);
    }

    static {
        MainHand.method6300(-572894482387327773L);
    }

    private Boolean method1278() {
        return (Boolean)this.field1477.method507();
    }

    private static void method6295(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class543 method6296() {
        return Class543.field2690;
    }

    private static void method6297() {
        Class6454.method24594();
    }

    private static void method6298(MainHand class404, class_1792 class_17922) {
        MainHand.method6323(class404, class_17922);
    }

    private static Object method6299(Class248 class248) {
        return class248.method507();
    }

    private static void method6300(long l2) {
        MainHand.field1472[4] = l2 ^ 0xF80CAB80EB85A4C7L;
        MainHand.field1472[2] = l2 ^ 0xF80CAB80EB85A4E2L;
        MainHand.field1472[3] = l2 ^ 0xF80CAB80EB85A4EAL;
        MainHand.field1472[0] = l2 ^ 0xF80CAB80EB85A4E3L;
        MainHand.field1472[5] = l2 ^ 0xF80CAB80EB85A4C0L;
        MainHand.field1472[1] = l2 ^ 0x7F3547F147A5B1CL;
    }

    private static Object method6301(Class248 class248) {
        return class248.method507();
    }

    public static class_239 method6302(class_310 class_3102) {
        return class_3102.field_1765;
    }

    public static void method6303(class_1661 class_16612, int n2) {
        class_16612.field_7545 = n2;
    }

    private static void method6304() {
        Class5659.method22184();
    }

    private static void method6305() {
        Class1745.method15538();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method6306() {
        int n2;
        if (this.method1265() && this.method6275() && ((Boolean)MainHand.method6331(this).method507()).booleanValue()) {
            n2 = (int)field1472[2];
            return n2 != 0;
        }
        n2 = (int)field1472[0];
        return n2 != 0;
    }

    @Override
    public void method1279() {
        this.field1475 = null;
    }

    private static void method6307() {
        Class1807.method15744();
    }

    @Class1(priority=0x7FFFFFFE)
    public void method6308(Class63 j2) {
        if (MainHand.field290.field_1724 != null && j2.method128() == MainHand.method6296()) {
            MainHand.method6268(0.91489685f, 0.41945708f, Class1608.field6011, 0.046194494f, 0.77365047f, 0.41075945f);
            return;
        }
    }

    private static Object method6309(Class248 class248) {
        return class248.method507();
    }

    private static void method6310() {
        Class6009.method23560();
    }

    private static void method6311(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6312() {
        Class5836.method22897();
    }

    private static void method6313() {
        Class5836.method22885();
    }

    public static class_746 method6314(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method6315() {
        Class1807.method15744();
    }

    public static class_746 method6316(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static int method6317(int n2, int n3, Class5828 class5828, Class534 class534) {
        return Class3753.method18240(n2, n3, class5828, class534);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method6318() {
        int n2;
        block2: {
            block3: {
                int n3;
                block1: {
                    int n4 = n3 = (Boolean)this.field1477.method507() != false ? 36542 : 36543;
                    if (n3 != 36542) break block1;
                    if (!((Boolean)MainHand.method6299(this.field1481)).booleanValue()) break block2;
                    break block3;
                }
                if (n3 == 36543) {
                    Class5836.method22897();
                    return null;
                }
                break block2;
            }
            n2 = (int)field1472[2];
            return n2 != 0;
        }
        n2 = (int)field1472[0];
        return n2 != 0;
    }

    private static void method6319(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method6320(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method6321() {
        Class1807.method15744();
    }

    private static boolean method6322() {
        return Velocity.method10252();
    }

    public static void method6323(MainHand class404, class_1792 class_17922) {
        class404.field1475 = class_17922;
    }

    private static void method6324(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public MainHand() {
        super("MainHand", "Automatically replenishes the item in your main hand", Class556.field2758);
        this.field1479 = this.method450(new Class252("Health", "The health required to fall below before swapping to a totem", Float.valueOf(0.0f), Float.valueOf(14.0f), Float.valueOf(36.0f)));
        this.field1471 = this.method450(new Class253("Crapple", "Uses a normal golden apple if Absorption is present", (boolean)field1472[2]));
        this.field1464 = this.method450(new Class253("SwordGap", "Equips a golden apple if holding down the item use button", (boolean)field1472[0]));
        this.field1465 = this.method450(new Class253("PickaxeGap", "Equips a golden apple if holding down the item use button", (boolean)field1472[0]));
        this.field1468 = this.method450(new Class253("SwitchBack", "Switch to old slot", (boolean)field1472[2]));
        this.field1467 = this.method450(new Class253("Lethal", "Calculates lethal damage sources", (boolean)field1472[0]));
        this.field1478 = this.method450(new Class253("Fall", "Calculates fall damage sources", (boolean)field1472[0]));
        this.field1476 = this.method450(new Class252("TotemSlot", "Slot to use for mainhand totem", (Number)((int)field1472[2]), (Number)((int)field1472[2]), (Number)((int)field1472[3]), this::method1269));
        this.field1481 = this.method450(new Class253("TotemGap", "Equips a golden apple if holding down the item use button", (boolean)field1472[2], this::method1278));
        this.field1474 = this.method450(new Class253("Always", "Always equips a golden apple if holding down the item use button", (boolean)field1472[2], this::method6318));
        this.field1470 = this.method450(new Class252("Delay", "The item steal delay", Float.valueOf(0.0f), Float.valueOf(0.15f), Float.valueOf(2.0f)));
        this.field1482 = this.method450(new Class259("Chorus", "Swaps chorus item when click", new Class246(this.method472() + "-chorusswap", (int)field1472[1], this::method6325)));
        INSTANCE = this;
        MainHand.method6259(Class5723.field11059, (Class246)this.field1482.method507());
    }

    private void method6325() {
        if (this.method1265()) {
            this.field1469 = !this.field1469 ? (int)field1472[2] : (int)field1472[0];
        }
    }

    private static boolean method6326(MainHand class404, float f2) {
        return class404.method6285(f2);
    }

    public static Class248 method6327(MainHand class404) {
        return class404.field1464;
    }

    private static void method6328() {
        Class3979.method19561();
    }

    private static void method6329(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static int method6330(class_1661 class_16612) {
        return class_16612.field_7545;
    }

    private static Class248 method6331(MainHand class404) {
        return MainHand.method6257(class404);
    }

    public static Class248 method6332(MainHand class404) {
        return class404.field1465;
    }

    private static void method6333() {
        Class1745.method15538();
    }

    public static Class925 method6334(MainHand class404) {
        return class404.field1480;
    }

    public static Class3850 method6335() {
        return Class5723.field11058;
    }

    private static void method6336() {
        Class6009.method23561();
    }

    private static Class248 method6337(MainHand class404) {
        return MainHand.method6327(class404);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

