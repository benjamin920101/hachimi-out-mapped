/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.CommandSuggestionsS2CPacket
 *  net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket
 */
package mapped;

import mapped.Class1;
import mapped.Class133;
import mapped.Class1807;
import mapped.Class229;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class63;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.CommandSuggestionsS2CPacket;
import net.minecraft.network.packet.c2s.play.RequestCommandCompletionsC2SPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FastLatency
extends Class278 {
    private long field1010;
    private final Class925 field1011;
    private final Class925 field1012 = new Class926();
    private static FastLatency INSTANCE;
    private long field1013;
    private static long[] field1014;

    public FastLatency() {
        super("FastLatency", "Calculates server ping", Class556.field2755);
        this.field1011 = new Class926();
        INSTANCE = this;
    }

    @Class1
    public void method3872(Class229 a2) {
        FastLatency.method3877(this, field1014[0]);
        this.field1013 = field1014[0];
    }

    public static FastLatency method3873() {
        return INSTANCE;
    }

    public static Class5496 method3874() {
        return Class5723.field11048;
    }

    @Class1
    public void method3875(Class133 b2) {
        class_2639 a2;
        class_2596 class_25962 = b2.method251();
        if (class_25962 instanceof class_2639 && (a2 = (class_2639)class_25962).comp_2262() == (int)field1014[2]) {
            this.field1010 = System.currentTimeMillis() - this.field1013;
            this.field1012.method12591(field1014[5]);
        }
    }

    static {
        field1014 = new long[6];
        FastLatency.method3884(7681689260981971297L);
    }

    public static Class925 method3876(FastLatency class350) {
        return class350.field1012;
    }

    private static void method3877(FastLatency class350, long l2) {
        FastLatency.method3882(class350, l2);
    }

    private static void method3878() {
        Class1807.method15744();
    }

    @Override
    public String method1248() {
        Object[] objectArray = new Object[(int)field1014[1]];
        objectArray[(int)FastLatency.field1014[0]] = this.field1010;
        return String.format("%dms", objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method3879(Class63 a2) {
        if (FastLatency.method3876(this).method12595((int)field1014[4])) {
            int n2 = 35089;
            Class5836.method22885();
            return;
        }
        int n3 = 35090;
        block4: while (true) {
            switch (n3) {
                case 35090: {
                    n3 = 35088;
                    continue block4;
                }
                case 35089: {
                    if (!this.field1011.method12595((int)field1014[3])) {
                        return;
                    }
                    FastLatency.method3874().method21341((class_2596)new class_2805((int)field1014[2], "w "));
                    FastLatency.method3881(this).method12593();
                    this.field1012.method12593();
                    this.field1013 = System.currentTimeMillis();
                    return;
                }
            }
            break;
        }
    }

    public long method3880() {
        return this.field1010;
    }

    public static Class925 method3881(FastLatency class350) {
        return class350.field1011;
    }

    public static void method3882(FastLatency class350, long l2) {
        class350.field1010 = l2;
    }

    private static void method3883() {
        Class3979.method19561();
    }

    private static void method3884(long l2) {
        FastLatency.field1014[2] = l2 ^ 0x6A9AD7AEFBC36A89L;
        FastLatency.field1014[1] = l2 ^ 0x6A9AD7AEFBC36960L;
        FastLatency.field1014[4] = l2 ^ 0x6A9AD7AEFBC37AE9L;
        FastLatency.field1014[5] = l2 ^ 0x95652851043C9660L;
        FastLatency.field1014[0] = l2 ^ 0x6A9AD7AEFBC36961L;
        FastLatency.field1014[3] = l2 ^ 0x6A9AD7AEFBC36895L;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

