/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.s2c.common.CommonPingS2CPacket
 */
package mapped;

import java.util.Arrays;
import mapped.Class1;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class229;
import mapped.Class3815;
import mapped.Class3979;
import mapped.AntiCheat;
import mapped.Class6322;
import mapped.Class659;
import mapped.Class926;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.common.CommonPingS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class1447 {
    private int field5504;
    private boolean field5505;
    private final int[] field5506;
    public final Class926 field5507 = new Class926();
    private Class659 field5508;
    private static long[] field5509 = new long[5];

    private static boolean method14257() {
        return Class3979.method19544();
    }

    private static void method14258(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static int method14259(Class1447 class1447) {
        return class1447.field5504;
    }

    public Class1447() {
        this.field5506 = new int[(int)field5509[1]];
        Class3815.INSTANCE.method18546(this);
        Arrays.fill(this.field5506, (int)field5509[0]);
    }

    @Class1
    public void method14260(Class229 a2) {
        Arrays.fill(this.field5506, (int)field5509[0]);
        this.field5504 = (int)field5509[4];
        this.field5505 = (int)field5509[4];
    }

    @Class1
    public void method14261(Class133 d2) {
        class_2596 class_25962 = d2.method251();
        if (class_25962 instanceof class_6373) {
            int a2;
            class_6373 b2 = (class_6373)class_25962;
            if (this.field5504 > (int)field5509[2]) {
                return;
            }
            this.field5506[Class1447.method14259((Class1447)this)] = a2 = b2.method_36950();
            this.field5504 += (int)field5509[3];
            if (this.field5504 == (int)field5509[1]) {
                this.method14266();
            }
        } else {
            class_25962 = d2.method251();
            if (class_25962 instanceof class_2708) {
                class_2708 c2 = (class_2708)class_25962;
                this.field5508 = new Class659(new class_243(c2.method_11734(), c2.method_11735(), c2.method_11738()), System.currentTimeMillis(), c2.method_11737());
            }
        }
    }

    public boolean method14262() {
        return this.field5507.method12595(Float.valueOf(AntiCheat.method10581().method10573().floatValue() * 50.0f));
    }

    private static void method14263(long l2) {
        Class1447.field5509[3] = l2 ^ 0xA04974C62DFC87FEL;
        Class1447.field5509[2] = l2 ^ 0xA04974C62DFC87FCL;
        Class1447.field5509[4] = l2 ^ 0xA04974C62DFC87FFL;
        Class1447.field5509[1] = l2 ^ 0xA04974C62DFC87FBL;
        Class1447.field5509[0] = l2 ^ 0x5FB68B39D2037800L;
    }

    private static void method14264(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method14265() {
        Class1503.method14420();
    }

    private void method14266() {
        for (int a2 = (int)field5509[4]; a2 < (int)field5509[1] && this.field5506[a2] == ~a2 + 1; ++a2) {
        }
        this.field5505 = (int)field5509[3];
        Class3979.method19567("Server is running GrimAC.");
    }

    public boolean method14267() {
        return this.field5505;
    }

    public boolean method14268(long a2) {
        return (Class1447.method14269(this) != null && this.field5508.method11477() >= a2 ? (int)field5509[3] : (int)field5509[4]) != 0;
    }

    public static Class659 method14269(Class1447 class1447) {
        return class1447.field5508;
    }

    static {
        Class1447.method14263(-6896852959817332737L);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

