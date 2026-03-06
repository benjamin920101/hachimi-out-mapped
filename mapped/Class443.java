/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import mapped.Class1;
import mapped.Class117;
import mapped.Class133;
import mapped.Class1365;
import mapped.Class1745;
import mapped.Class210;
import mapped.Class248;
import mapped.Class250;
import mapped.Class252;
import mapped.Class253;
import mapped.Class298;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class411;
import mapped.Class4146;
import mapped.Class5542;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.network.packet.Packet;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class443
extends Class411 {
    private static long[] field2219 = new long[2];
    Class248 field2220;
    Class248 field2221;
    private final Class925 field2222;
    Class248 field2223;
    Class248 field2224;
    Class248 field2225;
    Class248 field2226;
    private final Class925 field2227 = new Class926();
    Class248 field2228;
    Class248 field2229;

    private static void method9651() {
        Class5836.method22890();
    }

    @Class1
    public void method9652(Class117 a2) {
        this.field2227.method12593();
    }

    @Class1
    public void method9653(Class210 b2) {
        class_304[] class_304Array = Class443.method9665((class_310)Class443.field290).field_1839;
        int n2 = class_304Array.length;
        for (int i2 = (int)field2219[1]; i2 < n2; ++i2) {
            class_304 a2 = class_304Array[i2];
            if (!a2.method_1434()) continue;
            this.field2227.method12593();
            break;
        }
        if (this.field2227.method12595(Float.valueOf(((Float)this.field2226.method507()).floatValue() * 1000.0f)) && Class443.method9667(this).method12595((Number)this.field2221.method507())) {
            if (((Boolean)this.field2229.method507()).booleanValue() && Class443.method9669(field290).method_24828()) {
                Class443.field290.field_1724.method_6043();
            }
            if (((Boolean)this.field2225.method507()).booleanValue()) {
                this.method6468(Class443.field290.field_1724.method_36454() + field289.nextFloat(90.0f) * (field289.nextBoolean() ? 1.0f : -1.0f), Class443.field290.field_1724.method_36455() + field289.nextFloat(90.0f) * (field289.nextBoolean() ? 1.0f : Class5542.field10486));
            }
            this.field2222.method12593();
        }
    }

    private static void method9654() {
        Class298.method1924();
    }

    private static void method9655(long l2) {
        Class443.method9662(l2);
    }

    private static void method9656(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private Boolean method1269() {
        return (Boolean)this.field2228.method507();
    }

    private static void method9657() {
        Class5659.method22184();
    }

    private static void method9658() {
        Class4146.method20697();
    }

    private static void method9659(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method9660() {
        Class5836.method22885();
    }

    private static Object method9661(Class248 class248) {
        return class248.method507();
    }

    private static void method9662(long l2) {
        Class443.field2219[0] = l2 ^ 0xDAEB2433AA16F28DL;
        Class443.field2219[1] = l2 ^ 0xDAEB2433AA16F28CL;
    }

    private static void method9663() {
        Class3979.method19561();
    }

    private static void method9664() {
        Class1745.method15538();
    }

    public static class_315 method9665(class_310 class_3102) {
        return class_3102.field_1690;
    }

    public Class443() {
        super("AntiAFK", "Prevents the player from being kicked for AFK", Class556.field2756);
        this.field2222 = new Class926();
        this.field2226 = this.method450(new Class252("AFKTime", "The time before attempting actions", Float.valueOf(5.0f), Float.valueOf(20.0f), Float.valueOf(120.0f)));
        this.field2223 = this.method450(new Class253("Message", "Messages in chat to prevent AFK kick", (boolean)field2219[0]));
        this.field2224 = this.method450(new Class253("TabComplete", "Uses tab complete in chat to prevent AFK kick", (boolean)field2219[0]));
        this.field2225 = this.method450(new Class253("Rotate", "Rotates the player to prevent AFK kick", (boolean)field2219[0]));
        this.field2229 = this.method450(new Class253("Jump", "Jumps to prevent AFK kick", (boolean)field2219[0]));
        this.field2228 = this.method450(new Class253("AutoReply", "Replies to players messaging you in chat", (boolean)field2219[1]));
        this.field2220 = this.method450(new Class250("Reply", "The reply message for AutoReply", "I am currently AFK.", this::method1269));
        this.field2221 = this.method450(new Class252("Delay", "The delay between actions", Float.valueOf(5.0f), Float.valueOf(100.0f), Float.valueOf(1000.0f)));
    }

    static {
        Class443.method9655(-2672002149598694772L);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method9666(Class133 c2) {
        class_2596 class_25962 = c2.method251();
        int n2 = class_25962 instanceof class_7438 ? 28771 : 28772;
        block4: while (true) {
            switch (n2) {
                case 28772: {
                    n2 = 28770;
                    continue block4;
                }
                case 28771: {
                    class_7438 b2 = (class_7438)class_25962;
                    if ((Boolean)this.field2228.method507() == false) return;
                    String[] a2 = b2.comp_1102().comp_1090().split(" ");
                    if (!a2[(int)field2219[0]].startsWith("whispers:")) {
                        return;
                    }
                    Class1365.method13926("r [Hachimi] " + (String)Class443.method9661(this.field2220));
                    return;
                }
            }
            break;
        }
    }

    @Override
    public void method1274() {
        this.field2227.method12593();
    }

    public static Class925 method9667(Class443 class443) {
        return class443.field2222;
    }

    private static void method9668() {
        Class298.method1924();
    }

    public static class_746 method9669(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

