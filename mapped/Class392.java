/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  io.netty.buffer.Unpooled
 *  net.minecraft.block.spawner.MobSpawnerLogic
 *  net.minecraft.util.math.ChunkPos
 *  net.minecraft.world.World
 *  net.minecraft.block.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.network.PacketByteBuf
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.MobSpawnerBlockEntity
 *  net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket
 *  net.minecraft.block.BlockState
 *  net.minecraft.world.chunk.WorldChunk
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.client.world.ClientWorld
 */
package mapped;

import com.google.common.collect.Sets;
import io.netty.buffer.Unpooled;
import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class113;
import mapped.Class115;
import mapped.Class1150;
import mapped.Class117;
import mapped.Class1215;
import mapped.Class1226;
import mapped.Class1251;
import mapped.Class133;
import mapped.Class1338;
import mapped.Class1365;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class180;
import mapped.Class1807;
import mapped.Class232;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class271;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3336;
import mapped.Class334;
import mapped.Class3666;
import mapped.Class3734;
import mapped.Class3796;
import mapped.Class3804;
import mapped.Class3880;
import mapped.Class3979;
import mapped.Class3992;
import mapped.Class403;
import mapped.Class4036;
import mapped.Class4045;
import mapped.Class4146;
import mapped.Class4248;
import mapped.Class451;
import mapped.Class454;
import mapped.Class4602;
import mapped.Class543;
import mapped.Class5454;
import mapped.Class5504;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class576;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6158;
import mapped.Class618;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class689;
import mapped.Class70;
import mapped.Class702;
import mapped.Class727;
import net.minecraft.block.spawner.MobSpawnerLogic;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.MobSpawnerBlockEntity;
import net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket;
import net.minecraft.block.BlockState;
import net.minecraft.world.chunk.WorldChunk;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.client.world.ClientWorld;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class392
extends Class278 {
    Class248 field401;
    private final Set field1354;
    Class248 field1355;
    Class248 field1356;
    Class248 field1357;
    Class248 field1358;
    private static long[] field1359 = new long[23];
    Class248 field1360;
    Class248 field1361;
    Class248 field1362;
    private final List field1363;
    private final Set field1364 = Sets.newConcurrentHashSet();
    Class248 field1365;

    private static int method5571(int n2, int n3, Class1251 class1251, Class689 class689) {
        return Class3666.method18000(n2, n3, class1251, class689);
    }

    public static class_5321 method5572() {
        return class_1937.field_25181;
    }

    public static Set method5573(Class392 class392) {
        return class392.field1354;
    }

    private static void method5574() {
        Class3979.method19561();
    }

    private static void method5575(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5576() {
        Class1807.method15744();
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method5577(Class133 N) {
        block75: {
            block74: {
                if (Class392.field290.field_1687 == null) {
                    return;
                }
                var2_2 = N.method251();
                if (!(var2_2 instanceof class_2672)) break block75;
                M = (class_2672)var2_2;
                C = new class_1923(M.method_11523(), M.method_11524());
                D = new class_2818((class_1937)Class392.field290.field_1687, C);
                E = M.method_38598().method_38586();
                F = (int)Class392.field1359[1];
                G = (int)Class392.field1359[1];
                H = new class_2540(Unpooled.copiedBuffer((ByteBuffer)E.nioBuffer()));
                if (E.readableBytes() < (int)Class392.field1359[17]) {
                    return;
                }
                E.readShort();
                I = E.readUnsignedByte();
                if (I >= (int)Class392.field1359[11] && I <= (int)Class392.field1359[12]) {
                    a = E.method_10816();
                    if (a == 0 && Class392.field290.field_1687.method_27983() != class_1937.field_25181) {
                        G = (int)Class392.field1359[0];
                    }
                }
                if (H.readableBytes() < (int)Class392.field1359[8]) {
                    return;
                }
                K = (int)Class392.field1359[1];
                L = (int)Class392.field1359[1];
                try {
                    for (J = (int)Class392.field1359[1]; H.readableBytes() > 0 && J < (int)Class392.field1359[12] && H.readableBytes() >= (int)Class392.field1359[0]; ++J) {
                        block76: {
                            block85: {
                                block73: {
                                    block84: {
                                        block77: {
                                            block78: {
                                                v = H.readUnsignedByte();
                                                if (v == 0) break block76;
                                                if (v < (int)Class392.field1359[11]) break block77;
                                                if (v > (int)Class392.field1359[12]) break block77;
                                                g = D.method_12006()[J];
                                                h = g.method_12265();
                                                i = new HashSet<class_2680>();
                                                for (d = (int)Class392.field1359[1]; d < (int)Class392.field1359[6]; ++d) {
                                                    for (c = (int)Class392.field1359[1]; c < (int)Class392.field1359[6]; ++c) {
                                                        for (b = (int)Class392.field1359[1]; b < (int)Class392.field1359[6]; ++b) {
                                                            i.add((class_2680)h.method_12321(d, c, b));
                                                        }
                                                    }
                                                }
                                                j = H.method_10816();
                                                k = (int)Class392.field1359[1];
                                                l = (int)Class392.field1359[1];
                                                m = i.size();
                                                if (m > (int)Class392.field1359[0]) break block78;
                                                v0 = 39095;
                                                ** GOTO lbl54
                                            }
                                            v0 = 39096;
                                            if (true) ** GOTO lbl54
                                            block22: while (true) {
                                                v0 = 39094;
lbl54:
                                                // 3 sources

                                                switch (v0) {
                                                    case 39096: {
                                                        continue block22;
                                                    }
                                                    case 39095: {
                                                        m = j;
                                                    }
                                                }
                                                break;
                                            }
                                            if (m < j) {
                                                k = (int)Class392.field1359[8];
                                                ++K;
                                            }
                                            for (f = (int)Class392.field1359[1]; f < j; ++f) {
                                                block83: {
                                                    block81: {
                                                        block82: {
                                                            block79: {
                                                                block80: {
                                                                    e = H.method_10816();
                                                                    if (f == 0 && e == 0 && Class392.field290.field_1687.method_27983() == class_1937.field_25179) {
                                                                        ++k;
                                                                    }
                                                                    if (f != (int)Class392.field1359[0]) break block79;
                                                                    if (e == (int)Class392.field1359[22]) break block80;
                                                                    if (e == (int)Class392.field1359[0]) break block80;
                                                                    if (e != (int)Class392.field1359[20] && e != (int)Class392.field1359[18]) break block79;
                                                                }
                                                                if (Class392.field290.field_1687.method_27983() != class_1937.field_25179) {
                                                                    Class392.method5604();
                                                                    return;
                                                                }
                                                                ++k;
                                                            }
                                                            if (f != (int)Class392.field1359[8]) break block81;
                                                            if (e == (int)Class392.field1359[18]) break block82;
                                                            if (e == (int)Class392.field1359[19]) break block82;
                                                            if (e != (int)Class392.field1359[13]) break block81;
                                                        }
                                                        if (Class392.field290.field_1687.method_27983() == class_1937.field_25179) {
                                                            ++k;
                                                        }
                                                    }
                                                    if (J != (int)Class392.field1359[11]) break block83;
                                                    v1 = 17957;
                                                    ** GOTO lbl92
                                                }
                                                v1 = 17958;
                                                if (true) ** GOTO lbl92
                                                block24: while (true) {
                                                    v1 = 17956;
lbl92:
                                                    // 3 sources

                                                    switch (v1) {
                                                        case 17958: {
                                                            continue block24;
                                                        }
                                                        case 17957: {
                                                            if (e != (int)Class392.field1359[15]) break block24;
                                                            if (Class392.field290.field_1687.method_27983() != Class392.method5588()) break block24;
                                                            if (this.field1354.contains(C)) break block24;
                                                            if (this.field1364.contains(C)) break block24;
                                                            Class392.method5621(this).add(C);
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                }
                                                if (e != 0) continue;
                                                if (((Class392.field290.field_1687.method_27983() == class_1937.field_25180 ? (int)Class392.field1359[0] : (int)Class392.field1359[1]) | (Class392.field290.field_1687.method_27983() == class_1937.field_25181 ? (int)Class392.field1359[0] : (int)Class392.field1359[1])) == 0) continue;
                                                ++l;
                                            }
                                            if (l >= (int)Class392.field1359[8]) {
                                                ++L;
                                            }
                                            if (k >= (int)Class392.field1359[8]) {
                                                ++K;
                                            }
                                            n = H.method_10816();
                                            if (H.readableBytes() < n * (int)Class392.field1359[12]) {
                                                H.method_52994(H.readableBytes());
                                                break;
                                            }
                                            H.method_52994(n * (int)Class392.field1359[12]);
                                            Class392.method5664();
                                            return;
                                        }
                                        if (v != (int)Class392.field1359[16]) break;
                                        o = H.method_10816();
                                        if (H.readableBytes() < o * (int)Class392.field1359[12]) break block84;
                                        v2 = 21910;
                                        if (true) ** GOTO lbl132
                                    }
                                    v3 = 21911;
                                    Class1807.method15744();
                                    return;
                                    do {
                                        v2 = var23_29 = 21909;
lbl132:
                                        // 2 sources

                                        if (var23_29 == 21910) break block73;
                                    } while (var23_29 == 21911);
                                    break block85;
                                }
                                H.method_52994(o * (int)Class392.field1359[12]);
                                Class5836.method22907(0.89710015f);
                                return;
                            }
                            H.method_52994(H.readableBytes());
                            break;
                        }
                        if (H.readableBytes() < (int)Class392.field1359[0]) break;
                        w = H.readUnsignedByte();
                        if (w == 0) {
                            p = H.method_10816();
                            if (p != (int)Class392.field1359[14]) {
                                Class1668.method15147(2059780144, 596590147, -531938624, -513060707);
                                return;
                            }
                            if (Class392.field290.field_1687.method_27983() != class_1937.field_25181) continue;
                            F = (int)Class392.field1359[0];
                            continue;
                        }
                        if (w >= (int)Class392.field1359[0]) {
                            if (w <= (int)Class392.field1359[17]) {
                                t = H.method_10816();
                                r = (int)Class392.field1359[1];
                                while (true) {
                                    if (r >= t) {
                                        Class4146.method20694();
                                        return;
                                    }
                                    if (H.readableBytes() < (int)Class392.field1359[0]) break;
                                    q = H.method_10816();
                                    if (r == 0 && q == (int)Class392.field1359[14] && Class392.field290.field_1687.method_27983() == class_1937.field_25181) {
                                        F = (int)Class392.field1359[0];
                                    }
                                    ++r;
                                }
                                if (H.readableBytes() < (int)Class392.field1359[0]) break;
                                s = H.method_10816();
                                if (H.readableBytes() >= s * (int)Class392.field1359[12]) {
                                    H.method_52994(s * (int)Class392.field1359[12]);
                                    continue;
                                }
                                H.method_52994(H.readableBytes());
                                break;
                            }
                        }
                        if (w != (int)Class392.field1359[21]) break;
                        u = H.method_10816();
                        if (H.readableBytes() >= u * (int)Class392.field1359[12]) {
                            H.method_52994(u * (int)Class392.field1359[12]);
                            Class5836.method22897();
                            return;
                        }
                        H.method_52994(H.readableBytes());
                        break;
                    }
                    if (J > 0) {
                        if (Class392.field290.field_1687.method_27983() != class_1937.field_25180) {
                            Class6009.method23559(true);
                            return;
                        }
                        x = (double)L / (double)J * 100.0;
                        if (x >= 25.0) {
                            F = (int)Class392.field1359[1];
                            if (!this.field1354.contains(C) && !this.field1364.contains(C)) {
                                this.field1354.add(C);
                                return;
                            }
                        }
                        if (Class392.field290.field_1687.method_27983() == class_1937.field_25179 && (y = (double)K / (double)J * 100.0) >= 65.0) {
                            F = (int)Class392.field1359[0];
                        }
                    }
                    break block74;
                }
                catch (Exception B) {
                    block86: {
                        B.printStackTrace();
                        if (Class392.field290.field_1687.method_27983() == class_1937.field_25180 || Class392.method5637(Class392.field290).method_27983() == class_1937.field_25181) {
                            z = (double)L / (double)J * 100.0;
                            if (!(z >= Class4248.field9922)) {
                                Class1668.method15147(-677307363, -885386329, -199703291, 1942819952);
                                return;
                            }
                            F = (int)Class392.field1359[1];
                            if (!Class392.method5645(this).contains(C) && !this.field1364.contains(C)) {
                                Class392.method5619(this).add(C);
                                return;
                            }
                        }
                        if (Class392.field290.field_1687.method_27983() != class_1937.field_25179) break block74;
                        A = (double)K / (double)J * 100.0;
                        if (!(A >= 65.0)) break block86;
                        v4 = 53254;
                        ** GOTO lbl224
                    }
                    v4 = 53255;
                    if (true) ** GOTO lbl224
                }
                block27: while (true) {
                    v4 = 53253;
lbl224:
                    // 3 sources

                    switch (v4) {
                        case 53255: {
                            continue block27;
                        }
                        case 53254: {
                            F = (int)Class392.field1359[0];
                        }
                    }
                    break;
                }
            }
            if (G != 0) {
                F = (int)Class392.field1359[0];
            }
            if (F == 0) {
                try {
                    if (!Class392.method5603(this).contains(C) && !this.field1364.contains(C)) {
                        Class392.method5573(this).add(C);
                    }
                }
                catch (Exception var13_15) {}
            } else {
                try {
                    if (!this.field1354.contains(C)) {
                        this.field1364.add(C);
                    }
                }
                catch (Exception var13_16) {
                    // empty catch block
                }
            }
        }
    }

    public static Class248 method5578(Class392 class392) {
        return class392.field1356;
    }

    private static void method5579(boolean bl2) {
        Class6009.method23559(bl2);
    }

    @Override
    public void method1279() {
        Class392.method5620(this).clear();
    }

    private static void method5580(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method5581() {
        Class4146.method20697();
    }

    private static void method5582() {
        Class1745.method15538();
    }

    private static void method5583(boolean bl2) {
        Class1108.method12918(bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method5584(Class59 d2) {
        Class6009.method23560();
        if (((Boolean)Class392.method5633(this).method507()).booleanValue()) {
            for (class_1923 a2 : this.field1364) {
                Class6454.method24605(d2.method125(), new class_238((double)a2.method_8326(), (double)((Integer)this.field1362.method507()).intValue(), (double)a2.method_8328(), (double)a2.method_8327() + 1.0, (double)((Integer)Class392.method5618(this).method507()).intValue(), (double)a2.method_8329() + 1.0), 1.5f, ((Color)this.field1361.method507()).getRGB());
            }
        }
        if (((Boolean)Class392.method5602(this.field1358)).booleanValue()) {
            for (class_1923 b2 : this.field1354) {
                Class392.method5644(Class392.method5623(d2), new class_238((double)b2.method_8326(), (double)((Integer)this.field1362.method507()).intValue(), (double)b2.method_8328(), (double)b2.method_8327() + 1.0, (double)((Integer)this.field1362.method507()).intValue(), (double)b2.method_8329() + 1.0), Class3734.field8429, ((Color)this.field1365.method507()).getRGB());
            }
        }
        if (!((Boolean)this.field1360.method507()).booleanValue()) {
            Class1668.method15147(564584407, -1730988893, -1568605166, 931968707);
            return;
        }
        int n2 = 1986;
        block6: while (true) {
            switch (n2) {
                case 1987: {
                    n2 = 1985;
                    continue block6;
                }
                case 1986: {
                    for (class_2338 c2 : Class392.method5648(this)) {
                        Class6454.method24734(d2.method125(), c2, Class4045.method20093(((Color)Class392.method5625(this).method507()).getRGB(), (int)field1359[10]));
                        Class6454.method24642(d2.method125(), c2, 1.5f, Class4045.method20093(((Color)this.field1357.method507()).getRGB(), (int)field1359[9]));
                        if (!((Boolean)Class392.method5578(this).method507()).booleanValue()) continue;
                        Class6454.method24605(d2.method125(), new class_238(c2).method_1014(4.0), 1.5f, ((Color)this.field1357.method507()).getRGB());
                    }
                    break block6;
                }
            }
            break;
        }
        Class6009.method23561();
    }

    public static Set method5585(Class392 class392) {
        return class392.field1354;
    }

    private static void method5586() {
        Class6009.method23561();
    }

    public Class392() {
        super("NewChunks", "Highlights chunks that have been recently generated", Class556.field2755);
        this.field1354 = Sets.newConcurrentHashSet();
        this.field1363 = new ArrayList();
        this.field1355 = this.method450(new Class253("NewChunks", "Shows new chunks", (boolean)field1359[0]));
        this.field1358 = this.method450(new Class253("OldChunks", "Shows old chunks", (boolean)field1359[1]));
        this.field1362 = this.method450(new Class252("YLevel", "The rendering y level", (int)field1359[3], (int)field1359[1], (int)field1359[2]));
        this.field1361 = this.method450(new Class251("NewChunksColor", "The color for rendering new chunks", Color.GREEN, (boolean)field1359[1], (boolean)field1359[0], this::method1269));
        this.field1365 = this.method450(new Class251("OldChunksColor", "The color for rendering old chunks", Color.RED, (boolean)field1359[1], (boolean)field1359[1], this::method1278));
        this.field1360 = this.method450(new Class253("SpawnerDetector", "Shows activated spawners", (boolean)field1359[1]));
        this.field1356 = this.method450(new Class253("SpawnerRange", "Show spawner range", (boolean)field1359[0]));
        this.field401 = this.method450(new Class253("Notify", "Notify in chat when an activated spawner is found", (boolean)field1359[0]));
        this.field1357 = this.method450(new Class251("SpawnerColor", "The color of the tracked spawners", Color.MAGENTA, (boolean)field1359[1], (boolean)field1359[1]));
    }

    private static int method5587(int n2, int n3, Class727 class727, Class6158 class6158) {
        return Class3666.method18023(n2, n3, class727, class6158);
    }

    public static class_5321 method5588() {
        return class_1937.field_25179;
    }

    private static void method5589(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method5590() {
        Class4146.method20697();
    }

    private static void method5591(float f2) {
        Class5836.method22907(f2);
    }

    private static int method5592(int n2, int n3, Class115 class115, Class334 class334) {
        return Class3666.method18128(n2, n3, class115, class334);
    }

    private static void method5593() {
        Class1807.method15744();
    }

    private static void method5594(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method5595() {
        Class6009.method23560();
    }

    private static void method5596(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5597(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method5598(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private Boolean method1269() {
        return (Boolean)this.field1355.method507();
    }

    private static void method5599(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method5600(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5601() {
        Class4146.method20694();
    }

    private static Object method5602(Class248 class248) {
        return class248.method507();
    }

    public static Set method5603(Class392 class392) {
        return class392.field1354;
    }

    private static void method5604() {
        Class6009.method23561();
    }

    private static void method5605() {
        Class298.method1924();
    }

    private static int method5606(int n2, int n3, Class70 class70, Class454 class454) {
        return Class3666.method18009(n2, n3, class70, class454);
    }

    private static void method5607() {
        Class6009.method23561();
    }

    private static int method5608(int n2, int n3, Class3880 class3880, Class3804 class3804) {
        return Class3666.method18106(n2, n3, class3880, class3804);
    }

    public static class_638 method5609(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static int method5610(int n2, int n3, Class1338 class1338, Class618 class618) {
        return Class3666.method18005(n2, n3, class1338, class618);
    }

    /*
     * Unable to fully structure code
     */
    @Class1
    public void method5611(Class63 h) {
        if (h.method128() != Class543.field2690) {
            return;
        }
        var2_2 = Class1215.method13267().iterator();
        block4: while (true) {
            if (!var2_2.hasNext()) {
                Class5836.method22907(0.7462099f);
                return;
            }
            g = (class_2586)var2_2.next();
            if (!(g instanceof class_2636)) continue;
            e = (class_2636)g;
            if (Class392.method5643(e.method_11390()) == (int)Class392.field1359[7] || Class392.field290.field_1687.method_27983() == class_1937.field_25180 && e.method_11390().field_9154 == 0) continue;
            f = e.method_11016();
            if (!this.field1363.contains(f)) {
                Class392.method5590();
                return;
            }
            v0 = 15812;
            if (true) ** GOTO lbl20
            block5: while (true) {
                v0 = 15811;
lbl20:
                // 2 sources

                switch (v0) {
                    case 15813: {
                        continue block5;
                    }
                    case 15812: {
                        continue block4;
                    }
                }
                break;
            }
            d = (int)Class392.field1359[5];
            while (true) {
                if (d < (int)Class392.field1359[4]) ** break;
                continue block4;
                block7: for (c = (int)Class392.field1359[5]; c < (int)Class392.field1359[4]; ++c) {
                    for (b = (int)Class392.field1359[5]; b < (int)Class392.field1359[4]; ++b) {
                        a = new class_2338(f.method_10263() + d, f.method_10264() + c, f.method_10260() + b);
                        if (Class392.method5676(Class392.field290).method_8320(a).method_26204() != class_2246.field_10034) continue;
                        this.field1363.add(f);
                        if (!((Boolean)Class392.method5631(this).method507()).booleanValue()) continue block7;
                        v1 = new Object[(int)Class392.field1359[8]];
                        v1[(int)Class392.field1359[1]] = this.field291;
                        v1[(int)Class392.field1359[0]] = f.method_23854();
                        Class1365.method13931(String.format("\u00a7s[%s]\u00a7f Located activated spawner at %s!", v1), f.hashCode());
                        continue block7;
                    }
                }
                ++d;
            }
            break;
        }
    }

    private static void method5612() {
        Class5836.method22890();
    }

    private static void method5613(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5614() {
        Class1503.method14420();
    }

    private static void method5615() {
        Class1503.method14420();
    }

    private static void method5616() {
        Class4146.method20694();
    }

    private static void method5617(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method5618(Class392 class392) {
        return class392.field1362;
    }

    public static Set method5619(Class392 class392) {
        return class392.field1354;
    }

    public static List method5620(Class392 class392) {
        return class392.field1363;
    }

    public static Set method5621(Class392 class392) {
        return class392.field1354;
    }

    private static int method5622(int n2, int n3, Class180 class180, Class113 class113) {
        return Class3666.method18108(n2, n3, class180, class113);
    }

    private static class_4587 method5623(Class59 class59) {
        return class59.method125();
    }

    private static int method5624(int n2, int n3, Class702 class702, Class576 class576) {
        return Class3666.method18098(n2, n3, class702, class576);
    }

    public static Class248 method5625(Class392 class392) {
        return class392.field1357;
    }

    private Boolean method1278() {
        return (Boolean)this.field1358.method507();
    }

    private static void method5626() {
        Class6009.method23560();
    }

    private static void method5627() {
        Class6009.method23561();
    }

    private static void method5628() {
        Class6009.method23561();
    }

    private static void method5629() {
        Class6009.method23561();
    }

    private static void method5630(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static Class248 method5631(Class392 class392) {
        return class392.field401;
    }

    private static void method5632() {
        Class5836.method22885();
    }

    public static Class248 method5633(Class392 class392) {
        return class392.field1355;
    }

    private static void method5634() {
        Class298.method1924();
    }

    private static void method5635(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static int method5636(int n2, int n3, Class451 class451, Class3992 class3992) {
        return Class3666.method17999(n2, n3, class451, class3992);
    }

    public static class_638 method5637(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method5638() {
        Class6009.method23561();
    }

    private static void method5639() {
        Class4146.method20697();
    }

    private static int method5640(int n2, int n3, Class271 class271, Class5504 class5504) {
        return Class3666.method18080(n2, n3, class271, class5504);
    }

    private static void method5641() {
        Class1503.method14420();
    }

    private static void method5642() {
        Class298.method1924();
    }

    public static int method5643(class_1917 class_19172) {
        return class_19172.field_9154;
    }

    private static void method5644(class_4587 class_45872, class_238 class_2383, float f2, int n2) {
        Class6454.method24605(class_45872, class_2383, f2, n2);
    }

    public static Set method5645(Class392 class392) {
        return class392.field1354;
    }

    private static void method5646() {
        Class298.method1924();
    }

    private static int method5647(int n2, int n3, Class4602 class4602, Class232 class232) {
        return Class3666.method18033(n2, n3, class4602, class232);
    }

    public static List method5648(Class392 class392) {
        return class392.field1363;
    }

    private static void method5649() {
        Class5659.method22184();
    }

    private static int method5650(int n2, int n3, Class1150 class1150, Class3796 class3796) {
        return Class3666.method18099(n2, n3, class1150, class3796);
    }

    private static void method5651() {
        Class1503.method14420();
    }

    private static void method5652(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method5653(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5654() {
        Class6009.method23561();
    }

    private static void method5655(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    static {
        Class392.method5660(4122013719330392031L);
    }

    private static void method5656(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method5657() {
        Class6454.method24594();
    }

    private static void method5658() {
        Class1503.method14420();
    }

    private static void method5659() {
        Class5836.method22897();
    }

    private static void method5660(long l2) {
        Class392.field1359[6] = l2 ^ 0x393455A36BF987CFL;
        Class392.field1359[3] = l2 ^ 0xC6CBAA5C9406781FL;
        Class392.field1359[15] = l2 ^ 0x393455A36BF98790L;
        Class392.field1359[19] = l2 ^ 0x393455A36BF987D5L;
        Class392.field1359[9] = l2 ^ 0x393455A36BF9874EL;
        Class392.field1359[12] = l2 ^ 0x393455A36BF987D7L;
        Class392.field1359[2] = l2 ^ 0x393455A36BF986DFL;
        Class392.field1359[1] = l2 ^ 0x393455A36BF987DFL;
        Class392.field1359[4] = l2 ^ 0x393455A36BF987CEL;
        Class392.field1359[21] = l2 ^ 0x393455A36BF987D9L;
        Class392.field1359[8] = l2 ^ 0x393455A36BF987DDL;
        Class392.field1359[20] = l2 ^ 0x393455A36BF987D6L;
        Class392.field1359[16] = l2 ^ 0x393455A36BF987D0L;
        Class392.field1359[10] = l2 ^ 0x393455A36BF98799L;
        Class392.field1359[13] = l2 ^ 0x393455A36BF9D0F1L;
        Class392.field1359[0] = l2 ^ 0x393455A36BF987DEL;
        Class392.field1359[7] = l2 ^ 0x393455A36BF987CBL;
        Class392.field1359[18] = l2 ^ 0x393455A36BF9914AL;
        Class392.field1359[22] = l2 ^ 0x393455A36BF9878FL;
        Class392.field1359[5] = l2 ^ 0xC6CBAA5C9406782FL;
        Class392.field1359[17] = l2 ^ 0x393455A36BF987DCL;
        Class392.field1359[14] = l2 ^ 0x393455A36BF987F8L;
        Class392.field1359[11] = l2 ^ 0x393455A36BF987DBL;
    }

    private static void method5661(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static int method5662(int n2, int n3, Class5454 class5454, Class3336 class3336) {
        return Class3666.method18071(n2, n3, class5454, class3336);
    }

    private static void method5663(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method5664() {
        Class1503.method14420();
    }

    private static void method5665() {
        Class6009.method23560();
    }

    private static void method5666(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method5667() {
        Class6009.method23561();
    }

    public static List method5668(Class392 class392) {
        return class392.field1363;
    }

    private static void method5669() {
        Class4146.method20694();
    }

    private static void method5670(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method5671() {
        Class6454.method24594();
    }

    private static void method5672(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    @Class1
    public void method5673(Class117 a2) {
        this.field1364.clear();
        Class392.method5585(this).clear();
    }

    private static void method5674(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method5675(class_2338 a2, double b2, class_2338 c2) {
        return (!a2.method_19771((class_2382)c2, b2) ? (int)field1359[0] : (int)field1359[1]) != 0;
    }

    public static class_638 method5676(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static int method5677(int n2, int n3, Class403 class403, Class1226 class1226) {
        return Class3666.method18056(n2, n3, class403, class1226);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

