/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Box
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.awt.Color;
import java.util.Iterator;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1158;
import mapped.Class1468;
import mapped.Class1503;
import mapped.Class1505;
import mapped.Class1706;
import mapped.Class1745;
import mapped.Class190;
import mapped.Class197;
import mapped.Class223;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Crosshair;
import mapped.FastProjectile;
import mapped.Font;
import mapped.Chams;
import mapped.TextRadar;
import mapped.ElytraTweaks;
import mapped.Class3723;
import mapped.Class3736;
import mapped.Class3979;
import mapped.Class40;
import mapped.Replenish;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Socials;
import mapped.Class548;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class570;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class601;
import mapped.Class6019;
import mapped.Class626;
import mapped.Class6322;
import mapped.Class635;
import mapped.Class6454;
import mapped.Class685;
import mapped.Class692;
import mapped.Class701;
import mapped.Class804;
import mapped.Class807;
import mapped.Class89;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ESP
extends Class278 {
    Class248 field1136;
    Class248 field1137;
    Class248 field1138;
    Class248 field1139;
    Class248 field1140 = this.method450(new Class252("Range", "The ESP render range", Float.valueOf(10.0f), Float.valueOf(50.0f), Float.valueOf(200.0f)));
    Class248 field1141;
    Class248 field1142;
    Class248 field1143;
    Class248 field1144;
    Class248 field1145;
    Class248 field1146;
    private static long[] field1147 = new long[5];
    Class248 field1148;
    Class248 field1149;
    Class248 field1150 = this.method450(new Class260("Mode", "ESP rendering mode", Class635.field3104, Class635.values()));
    Class248 field1151;
    Class248 field1152;
    private static ESP INSTANCE;
    Class248 field1153;
    Class248 field1154;
    Class248 field1155;
    Class248 field1156 = this.method450(new Class260("BoxMode", "Box rendering mode", Class570.field2791, Class570.values()));
    Class248 field1157;
    Class248 field1158;
    Class248 field1159;

    /*
     * Enabled aggressive block sorting
     */
    private Boolean method4537() {
        int n2;
        if (!((Boolean)this.field1159.method507()).booleanValue() && !((Boolean)this.field1143.method507()).booleanValue()) {
            n2 = (int)field1147[1];
            return n2 != 0;
        }
        n2 = (int)field1147[0];
        return n2 != 0;
    }

    private static Class248 method4538(ESP class360) {
        return ESP.method4547(class360);
    }

    private static boolean method4539(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    public Color method4540(class_1297 b2) {
        if (b2 instanceof class_1657) {
            class_1657 a2 = (class_1657)b2;
            if (Class5723.field11045.method21243(a2.method_5477())) {
                return ESP.method4555(Socials.method10623());
            }
            return (Color)this.field1146.method507();
        }
        if (Class1158.method13133(b2)) {
            return (Color)this.field1157.method507();
        }
        if (Class1158.method13121(b2) || Class1158.method13110(b2)) {
            return (Color)this.field1153.method507();
        }
        if (ESP.method4551(b2)) {
            return (Color)ESP.method4571(this.field1148);
        }
        if (b2 instanceof class_1511) {
            return (Color)this.field1139.method507();
        }
        if (b2 instanceof class_1542) {
            return (Color)this.field1137.method507();
        }
        return null;
    }

    private static int method4541(int n2, int n3, Class626 class626, Class1505 class1505) {
        return Class1706.method15417(n2, n3, class626, class1505);
    }

    public static Class248 method4542(ESP class360) {
        return class360.field1149;
    }

    private static void method4543() {
        Class1745.method15538();
    }

    private static Object method4544(Class248 class248) {
        return class248.method507();
    }

    private static void method4545() {
        Class5836.method22885();
    }

    private Boolean method4546() {
        return (Boolean)this.field1149.method507();
    }

    public static Class248 method4547(ESP class360) {
        return class360.field1140;
    }

    private static int method4548(int n2, int n3, Class40 class40, Class548 class548) {
        return Class1706.method15456(n2, n3, class40, class548);
    }

    private static void method4549(class_4587 class_45872, class_238 class_2383, int n2) {
        Class6454.method24621(class_45872, class_2383, n2);
    }

    @Class1
    public void method4550(Class223 a2) {
        if (ESP.field290.field_1724 != null && this.field1150.method507() == Class635.field3107 && this.method4612(a2.method416())) {
            if (ESP.method4584(field290).method_5858(a2.method416()) > ((Class252)ESP.method4574(this)).method564()) {
                return;
            }
            a2.method10();
        }
    }

    private static boolean method4551(class_1297 class_12972) {
        return Class1158.method13114(class_12972);
    }

    private static class_746 method4552(class_310 class_3102) {
        return ESP.method4567(class_3102);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4553(Class59 e2) {
        if (this.field1150.method507() != Class635.field3104) {
            return;
        }
        ESP.method4565();
        Iterator iterator = ESP.field290.field_1687.method_18112().iterator();
        block4: while (true) {
            if (!iterator.hasNext()) {
                Class6009.method23561();
                return;
            }
            class_1297 d2 = (class_1297)iterator.next();
            int n2 = d2 == ESP.method4552(field290) ? 36995 : 36996;
            block5: while (true) {
                switch (n2) {
                    case 36996: {
                        n2 = 36994;
                        continue block5;
                    }
                    case 36995: {
                        continue block4;
                    }
                }
                break;
            }
            if (!(ESP.field290.field_1724.method_5858(d2) > ((Class252)this.field1140).method564())) break;
        }
        Class6009.method23560();
    }

    private static int method4554(int n2, int n3, Class685 class685, TextRadar class325) {
        return Class1706.method15454(n2, n3, class685, class325);
    }

    private static Color method4555(Socials class458) {
        return class458.method10630();
    }

    private static void method4556(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method4557(float f2) {
        Class5836.method22907(f2);
    }

    static {
        ESP.method4610(191451798417938327L);
    }

    public static Class248 method4558(ESP class360) {
        return class360.field1152;
    }

    private static void method4559() {
        Class5836.method22885();
    }

    public static ESP method4560() {
        return INSTANCE;
    }

    private static void method4561() {
        Class5659.method22184();
    }

    private static void method4562(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object method4563(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method4564(ESP class360) {
        return class360.field1155;
    }

    private static void method4565() {
        Class6009.method23560();
    }

    private Boolean method4566() {
        return (Boolean)this.field1151.method507();
    }

    public static class_746 method4567(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method1278() {
        return (((Boolean)this.field1159.method507()).booleanValue() || ((Boolean)this.field1143.method507()).booleanValue() ? (int)field1147[0] : (int)field1147[1]) != 0;
    }

    private static Object method4568(Class248 class248) {
        return class248.method507();
    }

    private static int method4569(int n2, int n3, FastProjectile class291, Class804 class804) {
        return Class1706.method15455(n2, n3, class291, class804);
    }

    private Boolean method4570() {
        return (Boolean)this.field1154.method507();
    }

    private static Object method4571(Class248 class248) {
        return class248.method507();
    }

    private static void method4572(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static boolean method4573(Class570 class570) {
        return class570.method11087();
    }

    public static Class248 method4574(ESP class360) {
        return class360.field1140;
    }

    private static void method4575() {
        Class6454.method24594();
    }

    private Boolean method4576() {
        return (Boolean)this.field1145.method507();
    }

    private static boolean method4577() {
        return Class3979.method19551();
    }

    private static void method4578() {
        Class5836.method22885();
    }

    private static int method4579(int n2, int n3, Font class296, Class190 class190) {
        return Class1706.method15445(n2, n3, class296, class190);
    }

    private Boolean method4580() {
        return (Boolean)ESP.method4558(this).method507();
    }

    private static int method4581(int n2, int n3, Class197 class197, Crosshair class285) {
        return Class1706.method15446(n2, n3, class197, class285);
    }

    private static Object method4582(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method4583(ESP class360) {
        return class360.field1141;
    }

    private Boolean method1269() {
        if (this.field1150.method507() != Class635.field3104) {
            Class1503.method14417(0.16375053f, 7.857084E-4f);
            return null;
        }
        return (boolean)field1147[0];
    }

    public static class_746 method4584(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private Boolean method4585() {
        return (Boolean)this.field1154.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color method4586(class_1297 b2) {
        int n2 = b2 instanceof class_1657 ? 58218 : 58219;
        while (true) {
            int n3;
            if ((n3 = n2) == 58218) {
                class_1657 a2 = (class_1657)b2;
                if (Class5723.field11045.method21243(a2.method_5477())) return Socials.method10623().method10630();
                return (Color)ESP.method4564(this).method507();
            }
            if (n3 != 58219) break;
            n2 = 58217;
        }
        if (!Class1158.method13133(b2)) {
            Class6454.method24594();
            return null;
        }
        int n4 = 45206;
        Class6454.method24636(0.020111182399251137, Class6019.field12035, Class3736.field8440, 0.9061803338862544);
        return null;
    }

    private static void method4587(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Class248 method4588(ESP class360) {
        return class360.field1159;
    }

    private static int method4589(int n2, int n3, Class692 class692, Class601 class601) {
        return Class1706.method15462(n2, n3, class692, class601);
    }

    private Boolean method4590() {
        return (Boolean)ESP.method4563(this.field1151);
    }

    private static void method4591() {
        Chams.method1924();
    }

    private static boolean method4592() {
        return Class3979.method19539();
    }

    private static boolean method4593(class_1297 class_12972) {
        return Class1158.method13110(class_12972);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4594(Class89 a2) {
        int n2 = ESP.field290.field_1724 != null ? 46880 : 46881;
        block4: while (true) {
            switch (n2) {
                case 46881: {
                    n2 = 46879;
                    continue block4;
                }
                case 46880: {
                    if (this.field1150.method507() != Class635.field3107 || !this.method4612(a2.method177())) return;
                    if (ESP.method4614(field290).method_5858(a2.method177()) > ((Class252)ESP.method4538(this)).method564()) {
                        return;
                    }
                    a2.method10();
                    a2.method179(this.method4586(a2.method177()).getRGB());
                    return;
                }
            }
            break;
        }
    }

    private static void method4595() {
        Class6009.method23560();
    }

    private static int method4596(int n2, int n3, Class701 class701, Class1468 class1468) {
        return Class1706.method15448(n2, n3, class701, class1468);
    }

    private static void method4597(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method4598(int n2, int n3, Class807 class807, ElytraTweaks class354) {
        return Class1706.method15432(n2, n3, class807, class354);
    }

    private static void method4599() {
        Chams.method1924();
    }

    private static boolean method4600() {
        return Replenish.method6431();
    }

    private Boolean method4601() {
        return (Boolean)ESP.method4582(this.field1152);
    }

    private static Object method4602(Class248 class248) {
        return class248.method507();
    }

    private static void method4603(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static Object method4604(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method4605(ESP class360) {
        return class360.field1145;
    }

    private static void method4606() {
        Class6009.method23560();
    }

    private static void method4607(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private Boolean method4608() {
        return (Boolean)ESP.method4544(this.field1145);
    }

    public static Class248 method4609(ESP class360) {
        return class360.field1152;
    }

    private static void method4610(long l2) {
        ESP.field1147[3] = l2 ^ 0x2A82C65744F975FL;
        ESP.field1147[0] = l2 ^ 0x2A82C65744F9796L;
        ESP.field1147[4] = l2 ^ 0x2A82C65744F97ABL;
        ESP.field1147[2] = l2 ^ 0x2A82C65744F97F3L;
        ESP.field1147[1] = l2 ^ 0x2A82C65744F9797L;
    }

    private Boolean method4611() {
        return (Boolean)ESP.method4542(this).method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method4612(class_1297 a2) {
        int n2;
        block10: {
            if (a2 instanceof class_1657 && ((Boolean)ESP.method4588(this).method507()).booleanValue()) {
                if (!((Boolean)ESP.method4568(this.field1143)).booleanValue()) {
                    if (a2 == ESP.field290.field_1724) return (int)field1147[1] != 0;
                }
                int n3 = (int)field1147[0];
                return ESP.method4592();
            }
            if (!Class1158.method13133(a2) || !((Boolean)ESP.method4609(this).method507()).booleanValue()) {
                if ((Class1158.method13121(a2) || Class1158.method13110(a2)) && ((Boolean)ESP.method4602(ESP.method4613(this))).booleanValue()) {
                    return Replenish.method6431();
                }
                if (!Class1158.method13114(a2) || !((Boolean)this.field1149.method507()).booleanValue()) {
                    int n4 = a2 instanceof class_1511 ? 50131 : 50132;
                    block4: while (true) {
                        switch (n4) {
                            case 50132: {
                                n4 = 50130;
                                continue block4;
                            }
                            case 50131: {
                                if (((Boolean)this.field1151.method507()).booleanValue()) break block4;
                            }
                            default: {
                                if (!(a2 instanceof class_1542) || !((Boolean)ESP.method4605(this).method507()).booleanValue()) break block10;
                            }
                        }
                        break;
                    }
                }
            }
            n2 = (int)field1147[0];
            return n2 != 0;
        }
        n2 = (int)field1147[1];
        return n2 != 0;
    }

    public static Class248 method4613(ESP class360) {
        return class360.field1154;
    }

    public static class_746 method4614(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4615() {
        Class4146.method20697();
    }

    private static void method4616() {
        Chams.method1924();
    }

    private static boolean method4617(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    public ESP() {
        super("ESP", "See entities and objects through walls", Class556.field2759);
        this.field1142 = this.method450(new Class252("Width", "ESP rendering line width", (Number)Float.valueOf(0.1f), (Number)Float.valueOf(2.0f), (Number)Float.valueOf(Class3723.field8395), this::method1269));
        this.field1159 = this.method450(new Class253("Players", "Render players through walls", (boolean)field1147[0]));
        this.field1143 = this.method450(new Class253("Self", "Render self through walls", (boolean)field1147[0]));
        this.field1155 = this.method450(new Class251("PlayersBox", "The render color for players", new Color((int)field1147[3], (int)field1147[4], (int)field1147[4]), (boolean)field1147[0], this::method1278));
        this.field1146 = this.method450(new Class251("PlayersFill", "The render color for players", new Color((int)field1147[3], (int)field1147[4], (int)field1147[4]), (boolean)field1147[0], this::method4537));
        this.field1152 = this.method450(new Class253("Monsters", "Render monsters through walls", (boolean)field1147[0]));
        this.field1158 = this.method450(new Class251("MonstersBox", "The render color for monsters", new Color((int)field1147[3], (int)field1147[4], (int)field1147[4]), (boolean)field1147[0], this::method4580));
        this.field1157 = this.method450(new Class251("MonstersFill", "The render color for monsters", new Color((int)field1147[3], (int)field1147[4], (int)field1147[4]), (boolean)field1147[0], this::method4601));
        this.field1154 = this.method450(new Class253("Animals", "Render animals through walls", (boolean)field1147[0]));
        this.field1136 = this.method450(new Class251("AnimalsBox", "The render color for animals", new Color((int)field1147[1], (int)field1147[3], (int)field1147[1]), (boolean)field1147[0], this::method4570));
        this.field1153 = this.method450(new Class251("AnimalsFill", "The render color for animals", new Color((int)field1147[1], (int)field1147[3], (int)field1147[1]), (boolean)field1147[0], this::method4585));
        this.field1149 = this.method450(new Class253("Vehicles", "Render vehicles through walls", (boolean)field1147[1]));
        this.field1138 = this.method450(new Class251("VehiclesBox", "The render color for vehicles", new Color((int)field1147[3], (int)field1147[2], (int)field1147[1]), (boolean)field1147[0], this::method4611));
        this.field1148 = this.method450(new Class251("VehiclesFill", "The render color for vehicles", new Color((int)field1147[3], (int)field1147[2], (int)field1147[1]), (boolean)field1147[0], this::method4546));
        this.field1145 = this.method450(new Class253("Items", "Render dropped items through walls", (boolean)field1147[1]));
        this.field1141 = this.method450(new Class251("ItemsBox", "The render color for items", new Color((int)field1147[3], (int)field1147[2], (int)field1147[1]), (boolean)field1147[0], this::method4608));
        this.field1137 = this.method450(new Class251("ItemsFill", "The render color for items", new Color((int)field1147[3], (int)field1147[2], (int)field1147[1]), (boolean)field1147[0], this::method4576));
        this.field1151 = this.method450(new Class253("EndCrystals", "Render end crystals through walls", (boolean)field1147[1]));
        this.field1144 = this.method450(new Class251("EndCrystalsBox", "The render color for end crystals", new Color((int)field1147[3], (int)field1147[2], (int)field1147[3]), (boolean)field1147[0], this::method4590));
        this.field1139 = this.method450(new Class251("EndCrystalsFill", "The render color for end crystals", new Color((int)field1147[3], (int)field1147[2], (int)field1147[3]), (boolean)field1147[0], this::method4566));
        INSTANCE = this;
    }

    private static void method4618(float f2) {
        Class5836.method22907(f2);
    }

    private static boolean method4619(class_1297 class_12972) {
        return Class1158.method13114(class_12972);
    }

    private static boolean method4620() {
        return Class4196.method20801();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

