/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mapped.Class1;
import mapped.Class133;
import mapped.Class136;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Chams;
import mapped.Class3708;
import mapped.Class3980;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import net.minecraft.network.packet.Packet;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AntiSpam
extends Class278 {
    private static long[] field736 = new long[2];
    private final Map field737 = new HashMap();
    Class248 field738 = this.method450(new Class253("Unicode", "Prevents unicode characters from being rendered in chat", (boolean)field736[0]));

    private static void method2628(long l2) {
        AntiSpam.field736[0] = l2 ^ 0x75684A6CEA8E8AC0L;
        AntiSpam.field736[1] = l2 ^ 0x75684A6CEA8E8AC2L;
    }

    public static Map method2629(AntiSpam class317) {
        return class317.field737;
    }

    private static void method2630(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method2631() {
        Class1745.method15538();
    }

    private static void method2632() {
        Class6009.method23561();
    }

    public AntiSpam() {
        super("AntiSpam", "Prevents players from spamming the game chat", Class556.field2756);
    }

    private static void method2633() {
        Class6009.method23560();
    }

    private static Map method2634(AntiSpam class317) {
        return AntiSpam.method2629(class317);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2635(Class133 h2) {
        if (AntiSpam.method2640(field290) == null) {
            return;
        }
        class_2596 class_25962 = h2.method251();
        int n2 = class_25962 instanceof class_7438 ? 51361 : 51362;
        block8: while (true) {
            switch (n2) {
                case 51362: {
                    n2 = 51360;
                    continue block8;
                }
                case 51361: {
                    class_7438 g2 = (class_7438)class_25962;
                    int n3 = (Boolean)AntiSpam.method2644(this).method507() != false ? 7500 : 7501;
                    block9: while (true) {
                        switch (n3) {
                            case 7501: {
                                n3 = 7499;
                                continue block9;
                            }
                            case 7500: {
                                String a2 = g2.comp_1102().comp_1090();
                                Pattern b2 = Pattern.compile("[^\\x00-\\x7F\\u0400-\\u04FF]+", (int)field736[1]);
                                Matcher c2 = b2.matcher(a2);
                                if (!c2.find()) {
                                    Class5659.method22184();
                                    return;
                                }
                                h2.method10();
                                return;
                            }
                        }
                        break;
                    }
                    UUID d2 = g2.comp_1099();
                    String e2 = g2.comp_1102().comp_1090();
                    String f2 = (String)AntiSpam.method2634(this).get(d2);
                    if (Integer.valueOf(f2.toUpperCase().hashCode()).equals(e2.toUpperCase().hashCode())) {
                        int n4 = 35876;
                        Class5836.method22885();
                        return;
                    }
                    int n5 = 35877;
                    while (true) {
                        // Infinite loop
                    }
                }
            }
            break;
        }
    }

    private static void method2636() {
        Class1745.method15538();
    }

    private static void method2637() {
        Class1745.method15538();
    }

    private static void method2638() {
        Class6009.method23561();
    }

    private static void method2639() {
        Class1745.method15538();
    }

    public static class_746 method2640(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method2641(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static int method2642(int n2, int n3, Class136 class136, Class3980 class3980) {
        return Class3708.method18165(n2, n3, class136, class3980);
    }

    static {
        AntiSpam.method2628(8460093731667610304L);
    }

    private static void method2643() {
        Chams.method1924();
    }

    public static Class248 method2644(AntiSpam class317) {
        return class317.field738;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

