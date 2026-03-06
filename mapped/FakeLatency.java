/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket
 *  net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket
 *  net.minecraft.network.packet.c2s.common.CommonPongC2SPacket
 */
package mapped;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import mapped.Class1;
import mapped.Class131;
import mapped.Class1668;
import mapped.Class205;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3830;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class556;
import mapped.Class5629;
import mapped.Class5659;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class792;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FakeLatency
extends Class278 {
    Class248 field1118;
    private static long[] field1119 = new long[1];
    Class248 field1120;
    private final ConcurrentMap field1121 = new ConcurrentHashMap();

    private static void method4436() {
        Class5659.method22184();
    }

    private static void method4437(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method4438() {
        Class3979.method19561();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4439(Class131 a2) {
        if (FakeLatency.field290.field_1724 == null) {
            return;
        }
        if (field290.method_1542()) {
            return;
        }
        if (!(a2.method251() instanceof class_2827)) {
            if (!(a2.method251() instanceof class_2856)) {
                if (!(a2.method251() instanceof class_6374)) return;
            }
            if ((Boolean)this.field1118.method507() == false) return;
        }
        int n2 = this.field1121.containsKey(a2.method251()) ? 42306 : 42307;
        block4: while (true) {
            switch (n2) {
                case 42307: {
                    n2 = 42305;
                    continue block4;
                }
                case 42306: {
                    this.field1121.remove(a2.method251());
                    return;
                }
            }
            break;
        }
        this.field1121.put(a2.method251(), System.currentTimeMillis());
        a2.method10();
    }

    public static ConcurrentMap method4440(FakeLatency class357) {
        return class357.field1121;
    }

    public FakeLatency() {
        super("FakeLatency", "Spoofs packet delays to make it appear that you have a higher latency", Class556.field2755);
        this.field1120 = this.method450(new Class252("Latency", "Delay in ms to add to the client ping", Float.valueOf(Class792.field3514), Float.valueOf(Class3830.field8681), Float.valueOf(Class5629.field10761)));
        this.field1118 = this.method450(new Class253("Transactions", "Handle server transaction packets", (boolean)field1119[0]));
    }

    @Class1
    public void method4441(Class205 a2) {
        if (FakeLatency.field290.field_1724 == null) {
            return;
        }
        this.field1121.forEach(this::method4442);
    }

    private void method4442(class_2596 a2, Long b2) {
        long c2 = System.currentTimeMillis() - b2;
        if ((float)c2 > ((Float)this.field1120.method507()).floatValue()) {
            FakeLatency.field290.field_1724.field_3944.method_52787(a2);
            this.field1121.remove(a2);
        }
    }

    private static void method4443() {
        Class6454.method24594();
    }

    static {
        FakeLatency.method4448(2047238709616732913L);
    }

    private static void method4444(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static ConcurrentMap method4445(FakeLatency class357) {
        return FakeLatency.method4440(class357);
    }

    @Override
    public void method1279() {
        if (FakeLatency.field290.field_1724 == null) {
            return;
        }
        if (!FakeLatency.method4447(this).isEmpty()) {
            FakeLatency.method4445(this).forEach(FakeLatency::method4446);
            this.field1121.clear();
        }
    }

    private static void method4446(class_2596 a2, Long b2) {
        FakeLatency.field290.field_1724.field_3944.method_52787(a2);
    }

    public static ConcurrentMap method4447(FakeLatency class357) {
        return class357.field1121;
    }

    private static void method4448(long l2) {
        FakeLatency.field1119[0] = l2 ^ 0x1C6940C279226AF1L;
    }

    private static void method4449() {
        Class6009.method23561();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

