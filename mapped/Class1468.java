/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_1297
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_745
 */
package mapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import mapped.Class4122;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_745;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1468
extends class_745 {
    public static final AtomicInteger field5561;
    private static long[] field5562;
    private final class_1657 field5563;

    public boolean method_29504() {
        return (int)field5562[1] != 0;
    }

    private static void method14390(long l2) {
        Class1468.field5562[0] = l2 ^ 0x70E074D1FD37D5B9L;
        Class1468.field5562[1] = l2 ^ 0x70E074D1FD37D5DDL;
        Class1468.field5562[2] = l2 ^ 0x70E074D1FD38979DL;
    }

    public Class1468(class_1657 a2) {
        this(a2, a2.method_5477().getString());
    }

    public Class1468(class_1657 a2, String b2) {
        super(class_310.method_1551().field_1687, new GameProfile(UUID.fromString("8667ba71-b85a-4004-af54-457a9734eed7"), b2));
        this.field5563 = a2;
        this.method_5719((class_1297)a2);
        this.field_5982 = this.method_36454();
        this.field_6004 = this.method_36455();
        this.field_6259 = this.field_6241 = a2.field_6241;
        this.field_6220 = this.field_6283 = a2.field_6283;
        this.field_42108.field_42111 = a2.field_42108.method_48569();
        this.field_42108.method_48567(a2.field_42108.method_48566());
        Byte c2 = (Byte)a2.method_5841().method_12789(class_1657.field_7518);
        this.field_6011.method_12778(class_1657.field_7518, (Object)c2);
        this.method_6127().method_26846(a2.method_6127());
        this.method_5660(a2.method_5715());
        this.method_5796(a2.method_5681());
        this.method_18380(a2.method_18376());
        this.method_6033(a2.method_6032());
        this.method_6073(a2.method_6067());
        this.method_31548().method_7377(a2.method_31548());
        this.method_5838(field5561.incrementAndGet());
        this.field_6012 = (int)field5562[0];
    }

    public void method14391() {
        if (Class4122.field9561.field_1687 != null) {
            this.method_31482();
            Class4122.field9561.field_1687.method_53875((class_1297)this);
        }
    }

    static {
        field5562 = new long[3];
        Class1468.method14390(8133629372276397533L);
        field5561 = new AtomicInteger((int)field5562[2]);
    }

    public void method14392() {
        if (Class4122.field9561.field_1687 != null) {
            Class4122.field9561.field_1687.method_2945(this.method_5628(), class_1297.class_5529.field_26999);
            this.method_31745(class_1297.class_5529.field_26999);
        }
    }

    public class_1657 method14393() {
        return this.field5563;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

