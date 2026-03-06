/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ExperienceOrbEntity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.ArrowEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.block.ShapeContext
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.network.packet.s2c.play.BundleS2CPacket
 */
package mapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mapped.Class1;
import mapped.Class1011;
import mapped.Class1108;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class1557;
import mapped.Class1650;
import mapped.Class1667;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class298;
import mapped.Class3588;
import mapped.Class376;
import mapped.Class3804;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4129;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class428;
import mapped.Class457;
import mapped.Class541;
import mapped.Class556;
import mapped.Class5595;
import mapped.Class5649;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5793;
import mapped.Class583;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6280;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class803;
import mapped.Class827;
import mapped.Class890;
import mapped.Class914;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.network.packet.s2c.play.BundleS2CPacket;

public class Class430
extends Class428 {
    private List field1975;
    private static Class430 INSTANCE;
    private List field1976;
    private final Map field1977 = new HashMap();
    Class248 field1978;
    Class248 field1979;
    Class248 field1980;
    private int field1981;
    private class_1657 field1982;
    Class248 field1983;
    Class248 field1984;
    private final Map field1985 = new HashMap();
    Class248 field1986;
    Class248 field1987 = this.method450(new Class252("PlaceRange", "The range to trap enemies", Float.valueOf(Class3588.field7983), Float.valueOf(4.0f), Float.valueOf(6.0f)));
    Class248 field1988;
    Class248 field1989;
    Class248 field1990;
    private static long[] field1991;

    public static Class430 method8679() {
        return INSTANCE;
    }

    private void method8680(class_2338 a2, int b2) {
        Class430.method8694().method12794(a2, b2, (Boolean)this.field1952.method507(), (boolean)field1991[0], (boolean)field1991[4], this::method8722);
        this.field1977.put(a2, System.currentTimeMillis());
        this.field1981 = Class430.method8701(this) + (int)field1991[4];
    }

    public static List method8681(Class430 class430) {
        return class430.field1976;
    }

    private static void method8682() {
        Class1807.method15744();
    }

    public static int method8683(Class430 class430) {
        return class430.field1981;
    }

    private static void method8684(long l2) {
        Class430.field1991[2] = l2 ^ 0x502914DC9A8D6FD6L;
        Class430.field1991[5] = l2 ^ 0x502914DC9A8D6F26L;
        Class430.field1991[1] = l2 ^ 0x502914DC9A8D6C34L;
        Class430.field1991[4] = l2 ^ 0x502914DC9A8D6FDDL;
        Class430.field1991[0] = l2 ^ 0x502914DC9A8D6FDCL;
        Class430.field1991[6] = l2 ^ 0xAFD6EB2365729023L;
        Class430.field1991[3] = l2 ^ 0x502914DC9A8D6FDEL;
    }

    private static void method8685(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static class_746 method8686(class_310 class_3102) {
        return Class430.method8741(class_3102);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method8687(Class59 h2) {
        if (!((Boolean)this.field1979.method507()).booleanValue()) {
            Class6322.method24332(0.86202574f, 0.8862737f);
            return;
        }
        int n2 = 2687;
        block4: while (true) {
            switch (n2) {
                case 2688: {
                    n2 = 2686;
                    continue block4;
                }
                case 2687: {
                    Class6009.method23560();
                    Iterator iterator = this.field1985.entrySet().iterator();
                    while (true) {
                        if (!iterator.hasNext()) {
                            Class6009.method23561();
                            if (!Class430.method8696(this).isEmpty()) break;
                            return;
                        }
                        Map.Entry e2 = iterator.next();
                        Class430.method8737((Class6283)e2.getValue(), (boolean)field1991[0]);
                        int a2 = (int)(40.0 * Class430.method8710((Class6283)e2.getValue()));
                        int b2 = (int)(100.0 * Class430.method8745((Class6283)e2.getValue()));
                        Color c2 = Class457.method10620().method10618(a2);
                        Color d2 = Class457.method10620().method10618(b2);
                        Class6454.method24734(h2.method125(), (class_2338)e2.getKey(), c2.getRGB());
                        Class6454.method24642(h2.method125(), (class_2338)e2.getKey(), 1.5f, d2.getRGB());
                    }
                    for (class_2338 g2 : this.field1975) {
                        Class6283 f2 = new Class6283((boolean)field1991[4], ((Integer)Class430.method8739(this.field1988)).intValue());
                        this.field1985.put(g2, f2);
                    }
                    break block4;
                }
            }
            break;
        }
        this.field1985.entrySet().removeIf(Class430::method8744);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean method8688(class_1657 a2, class_2338 b2) {
        int n2;
        if (!a2.method_24828() && Class430.method8693(field290).method_8320(b2.method_10084()).method_45474() && Class430.method8689(field290).method_8320(b2.method_10086((int)field1991[3])).method_45474()) {
            n2 = (int)field1991[0];
            return n2 != 0;
        }
        n2 = (int)field1991[4];
        return n2 != 0;
    }

    public static class_638 method8689(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method8690() {
        Class1503.method14420();
    }

    private static void method8691(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method8692(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static class_638 method8693(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Class1011 method8694() {
        return Class430.method8712();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean method8695(class_238 a2, class_1297 b2) {
        int n2;
        if (Class430.method8733().method24270(b2) && Class430.method8709(Class5723.field11050, b2).method_994(a2)) {
            n2 = (int)field1991[4];
            return n2 != 0;
        }
        n2 = (int)field1991[0];
        return n2 != 0;
    }

    public static List method8696(Class430 class430) {
        return class430.field1975;
    }

    private static int method8697(int n2, int n3, Class583 class583, Class541 class541) {
        return Class3804.method18443(n2, n3, class583, class541);
    }

    private static boolean method8698(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static Object method8699(Class248 class248) {
        return class248.method507();
    }

    public static class_638 method8700(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static int method8701(Class430 class430) {
        return Class430.method8683(class430);
    }

    private static void method8702() {
        Class4146.method20694();
    }

    private static void method8703() {
        Class6009.method23561();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method8704(class_2596 e2) {
        if (!(e2 instanceof class_2626)) return;
        class_2626 d2 = (class_2626)e2;
        class_2680 b2 = d2.method_11308();
        class_2338 c2 = d2.method_11309();
        if (!this.field1976.contains(c2)) {
            return;
        }
        if (b2.method_45474() && Class430.field290.field_1687.method_8628(field1956, c2, class_3726.method_16194())) {
            int a2 = this.method8599();
            if (a2 == (int)field1991[6]) {
                return;
            }
            this.method8680(c2, a2);
            return;
        }
        if (!Class5595.method21930(b2)) return;
        this.field1977.remove(c2);
    }

    private static void method8705() {
        Class1807.method15744();
    }

    @Override
    public void method1279() {
        this.field1976.clear();
        this.field1975.clear();
        Class430.method8708(this).clear();
        this.field1982 = null;
    }

    private static void method8706(float f2) {
        Class5836.method22907(f2);
    }

    public static Class248 method8707(Class430 class430) {
        return class430.field1978;
    }

    public static Map method8708(Class430 class430) {
        return class430.field1985;
    }

    private static class_238 method8709(Class6280 class6280, class_1297 class_12972) {
        return class6280.method24275(class_12972);
    }

    private static double method8710(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method8711() {
        Class6454.method24594();
    }

    public static Class1011 method8712() {
        return Class5723.field11051;
    }

    private static void method8713() {
        Class298.method1924();
    }

    private static void method8714() {
        Class3979.method19561();
    }

    /*
     * Enabled aggressive block sorting
     */
    public List method8715(List g2) {
        ArrayList<class_2338> h2 = new ArrayList<class_2338>();
        Iterator iterator = g2.iterator();
        block4: while (iterator.hasNext()) {
            double e2;
            class_2338 f2 = (class_2338)iterator.next();
            Long a2 = (Long)Class430.method8747(this).get(f2);
            if (((Float)Class430.method8707(this).method507()).floatValue() > 0.0f && a2 != null && (float)(System.currentTimeMillis() - a2) < ((Float)this.field1978.method507()).floatValue() * 50.0f) continue;
            class_238 b2 = new class_238(f2);
            List<class_1297> c2 = Class430.field290.field_1687.method_8335(null, b2).stream().filter(this::method8720).toList();
            boolean d2 = c2.stream().allMatch(arg_0 -> Class430.method8695(b2, arg_0));
            if (!Class430.field290.field_1687.method_8320(f2).method_45474()) {
                if (!d2) {
                    Class4036.method20085(0.45202726f, 0.07110947f, 0.8535577f, 0.055339873f, 0.8473641f, Class1650.field6132);
                    return null;
                }
                int n2 = (Boolean)this.field1986.method507() == false ? 63418 : 63419;
                block5: while (true) {
                    switch (n2) {
                        case 63419: {
                            n2 = 63417;
                            continue block5;
                        }
                        case 63418: {
                            if (Class5723.field11054.method22542(f2, Class827.field3627) && ((Boolean)Class430.method8728(this).method507()).booleanValue()) break block5;
                            continue block4;
                        }
                    }
                    break;
                }
            }
            if ((e2 = Class430.field290.field_1724.method_5707(f2.method_46558())) > ((Class252)this.field1987).method564() || !Class430.field290.field_1687.method_8628(field1956, f2, class_3726.method_16194())) continue;
            h2.add(f2);
        }
        return h2;
    }

    private static void method8716(Class430 class430, class_2596 class_25962) {
        class430.method8704(class_25962);
    }

    private static boolean method8717(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method8718(int n2) {
        return Class4196.method20803(n2);
    }

    public static List method8719(Class430 class430) {
        return class430.field1976;
    }

    private boolean method8720(class_1297 a2) {
        return Class430.method8753(this, a2);
    }

    public static void method8721(Class430 class430, List list) {
        class430.field1975 = list;
    }

    private void method8722(boolean a2, float[] b2) {
        if (((Boolean)this.field1954.method507()).booleanValue()) {
            if (a2) {
                Class1503.method14417(b2[(int)field1991[0]], b2[(int)field1991[4]]);
            } else {
                Class430.method8690();
            }
        }
    }

    private static void method8723() {
        Class6454.method24594();
    }

    private static void method8724() {
        Class6454.method24594();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public boolean method8725(class_1297 a2) {
        int n2;
        if (a2 instanceof class_1542) {
            return Class5649.method22085(0.5806800705186306, Class890.field3823, Class1667.field6175, 0.27475966765476134, 0.7872772208935781, Class5793.field11263);
        }
        int n3 = 22993;
        block8: while (true) {
            switch (n3) {
                case 22994: {
                    n3 = 22992;
                    continue block8;
                }
                case 22993: {
                    if (a2 instanceof class_1303) break block8;
                    int n4 = !(a2 instanceof class_1667) ? 26763 : 26764;
                    block9: while (true) {
                        switch (n4) {
                            case 26764: {
                                n4 = 26762;
                                continue block9;
                            }
                            case 26763: {
                                n2 = (int)field1991[4];
                                return n2 != 0;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
        n2 = (int)field1991[0];
        return n2 != 0;
    }

    private static void method8726() {
        Class4146.method20694();
    }

    private static void method8727(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static Class248 method8728(Class430 class430) {
        return class430.field1983;
    }

    private static void method8729() {
        Class1807.method15744();
    }

    private static void method8730() {
        Class5836.method22885();
    }

    public boolean method8731() {
        return (!this.field1975.isEmpty() ? (int)field1991[4] : (int)field1991[0]) != 0;
    }

    private static boolean method8732(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    public static Class6280 method8733() {
        return Class5723.field11050;
    }

    private static void method8734(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public List method8735(class_1657 d2, class_2338 e2) {
        ArrayList<class_2338> f2 = new ArrayList<class_2338>();
        f2.add(e2.method_10084());
        if (((Boolean)this.field1980.method507()).booleanValue()) {
            f2.add(e2.method_10074());
        }
        double g2 = d2.method_23317();
        double h2 = d2.method_23318();
        double i2 = d2.method_23321();
        int j2 = (int)field1991[0];
        while (true) {
            if (j2 > (Integer)this.field1990.method507()) {
                Class430.method8713();
                return null;
            }
            double a2 = (g2 - d2.field_6014) * (double)j2;
            double b2 = (i2 - d2.field_5969) * (double)j2;
            class_2338 c2 = class_2338.method_49637((double)(g2 + a2), (double)h2, (double)(i2 + b2));
            if (!f2.contains(c2.method_10084())) {
                f2.add(c2.method_10084());
            }
            if (((Boolean)this.field1980.method507()).booleanValue() && !f2.contains(c2.method_10074())) {
                f2.add(c2.method_10074());
            }
            ++j2;
        }
    }

    public static class_1657 method8736(Class430 class430) {
        return class430.field1982;
    }

    public Class430() {
        super("AutoCrawlTrap", "Automatically places blocks to keep enemies in crawl", Class556.field2758);
        this.field1984 = this.method450(new Class252("EnemyRange", "The maximum range of targets", Float.valueOf(Class4129.field9589), Float.valueOf(Class1557.field5836), Float.valueOf(15.0f)));
        this.field1980 = this.method450(new Class253("PreventDownwards", "Prevents digging downwards", (boolean)field1991[4]));
        this.field1986 = this.method450(new Class253("HitboxSync", "Places on serverside crawling hitboxes", (boolean)field1991[0]));
        this.field1983 = this.method450(new Class253("PreventMine", "Prevents enemies from mining the trap", (boolean)field1991[0]));
        this.field1989 = this.method450(new Class252("ShiftTicks", "The number of blocks to place per tick", (int)field1991[4], (int)field1991[3], (int)field1991[2]));
        this.field1978 = this.method450(new Class252("ShiftDelay", "The delay between each block placement interval", Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(Class914.field3882)));
        this.field1990 = this.method450(new Class252("ExtrapolationTicks", "Accounts for motion when calculating enemy positions, not fully accurate.", (int)field1991[0], (int)field1991[0], (int)field1991[2]));
        this.field1979 = this.method450(new Class253("Render", "Renders trap placements", (boolean)field1991[0]));
        this.field1988 = this.method450(new Class252("Fade-Time", "Time to fade", (int)field1991[0], (int)field1991[5], (int)field1991[1]));
        this.field1976 = new ArrayList();
        this.field1975 = new ArrayList();
        INSTANCE = this;
    }

    private static void method8737(Class6283 class6283, boolean bl2) {
        class6283.method24284(bl2);
    }

    public static class_1657 method8738(Class430 class430) {
        return class430.field1982;
    }

    private static Object method8739(Class248 class248) {
        return class248.method507();
    }

    public static Map method8740(Class430 class430) {
        return class430.field1977;
    }

    public static class_746 method8741(class_310 class_3102) {
        return class_3102.field_1724;
    }

    @Class1
    public void method8742(Class210 b2) {
        this.field1981 = (int)field1991[0];
        if (Class376.method4987()) {
            this.field1976.clear();
            this.field1975.clear();
            return;
        }
        if (!((Boolean)this.field1536.method507()).booleanValue() && this.method6626()) {
            this.field1976.clear();
            this.field1975.clear();
            return;
        }
        int c2 = this.method8599();
        if (c2 == (int)field1991[6]) {
            Class430.method8681(this).clear();
            this.field1975.clear();
            return;
        }
        this.field1982 = this.method6615(((Float)this.field1984.method507()).floatValue());
        if (Class430.method8736(this) == null) {
            this.field1976.clear();
            this.field1975.clear();
            return;
        }
        class_2338 d2 = Class5659.method22153(Class430.method8738(this), (boolean)field1991[0]);
        this.field1976 = this.method8735(this.field1982, d2);
        if (!this.method8688(this.field1982, d2) || Class430.method8719(this).isEmpty()) {
            return;
        }
        Class430.method8721(this, this.method8715(this.field1976));
        if (this.field1975.isEmpty()) {
            return;
        }
        this.field1975.sort(Comparator.comparingInt(class_2382::method_10264));
        while (this.field1981 < (Integer)Class430.method8699(this.field1989)) {
            if (this.field1981 >= this.field1975.size()) break;
            class_2338 a2 = (class_2338)this.field1975.get(this.field1981);
            this.method8680(a2, c2);
        }
        if (((Boolean)this.field1954.method507()).booleanValue()) {
            Class430.method8748();
        }
    }

    private static void method8743() {
        Class6454.method24594();
    }

    private static boolean method8744(Map.Entry a2) {
        return (((Class6283)a2.getValue()).method24281() == 0.0 ? (int)field1991[4] : (int)field1991[0]) != 0;
    }

    private static double method8745(Class6283 class6283) {
        return class6283.method24281();
    }

    static {
        field1991 = new long[7];
        Class430.method8684(5776170934797692892L);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method8746(Class133 c2) {
        if (Class430.method8686(field290) == null || Class430.method8700(field290) == null) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        int n2 = class_25962 instanceof class_8042 ? 49967 : 49968;
        block4: while (true) {
            switch (n2) {
                case 49968: {
                    n2 = 49966;
                    continue block4;
                }
                case 49967: {
                    class_8042 b2 = (class_8042)class_25962;
                    for (class_2596 a2 : b2.method_48324()) {
                        this.method8704(a2);
                    }
                    return;
                }
                default: {
                    Class430.method8716(this, c2.method251());
                }
            }
            break;
        }
    }

    private static Map method8747(Class430 class430) {
        return Class430.method8740(class430);
    }

    private static void method8748() {
        Class1503.method14420();
    }

    private static void method8749() {
        Class1503.method14420();
    }

    private static void method8750() {
        Class5836.method22885();
    }

    private static void method8751() {
        Class5659.method22184();
    }

    private static void method8752(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static boolean method8753(Class430 class430, class_1297 class_12972) {
        return class430.method8725(class_12972);
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}

