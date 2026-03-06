/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.Text
 *  net.minecraft.client.gui.hud.ChatHudLine$Visible
 */
package mapped;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import mapped.Class1;
import mapped.Class115;
import mapped.Class1197;
import mapped.Class1503;
import mapped.Class188;
import mapped.Class189;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Chams;
import mapped.Class32;
import mapped.Class35;
import mapped.BreakESP;
import mapped.Class4036;
import mapped.Class4057;
import mapped.Class4146;
import mapped.Class42;
import mapped.Class477;
import mapped.Class489;
import mapped.Class5183;
import mapped.Class520;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5694;
import mapped.Class583;
import mapped.Class600;
import mapped.Class6253;
import mapped.Class72;
import mapped.Class74;
import net.minecraft.text.Text;
import net.minecraft.client.gui.hud.ChatHudLine;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BetterChat
extends Class278 {
    Class248 field1163;
    Class248 field1164;
    Class248 field1165;
    Class248 field1166;
    Class248 field1167;
    private static long[] field1168 = new long[4];
    Class248 field1169;
    Class248 field1170;
    public final Map field1171 = new HashMap();

    @Class1
    public void method4635(Class115 a2) {
        if (((Boolean)this.field1169.method507()).booleanValue()) {
            a2.method10();
        }
    }

    public static Class248 method4636(BetterChat class362) {
        return class362.field1166;
    }

    private static void method4637(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method4638() {
        Chams.method1924();
    }

    public static Class248 method4639(BetterChat class362) {
        return class362.field1166;
    }

    private static void method4640(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static class_303.class_7590 method4641(Class35 class35) {
        return class35.method65();
    }

    @Class1
    public void method4642(Class189 b2) {
        Class6253 a2;
        if (this.field1166.method507() != Class600.field2916 && BetterChat.method4645(b2) != null && (a2 = (Class6253)this.field1171.getOrDefault(b2.method367(), null)) != null) {
            b2.method10();
            if (BetterChat.method4636(this).method507() == Class600.field2919) {
                b2.method365(a2.method24146());
            } else {
                b2.method365(a2.method24139());
            }
            b2.method366((BetterChat.method4639(this).method507() == Class600.field2919 ? (int)field1168[3] : (int)field1168[0]) != 0);
        }
    }

    private static void method4643() {
        Chams.method1924();
    }

    @Class1
    public void method4644(Class188 a2) {
        if (((Boolean)this.field1164.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static class_303.class_7590 method4645(Class189 class189) {
        return class189.method367();
    }

    private static void method4646() {
        Class4146.method20694();
    }

    private static void method4647(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    @Class1
    public void method4648(Class32 a2) {
        if (((Boolean)this.field1167.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static int method4649(int n2, int n3, Class5694 class5694, Class72 class72) {
        return Class4057.method20149(n2, n3, class5694, class72);
    }

    private static void method4650() {
        Class5659.method22184();
    }

    @Class1
    public void method4651(Class35 a2) {
        Class6253 b2 = new Class6253((boolean)field1168[0], a2.method67(), 0.0, ((Integer)this.field1165.method507()).intValue(), Class489.field2533);
        this.field1171.put(BetterChat.method4641(a2), b2);
        b2.method24140((boolean)field1168[3]);
    }

    public static Class248 method4652(BetterChat class362) {
        return class362.field1170;
    }

    private static void method4653(long l2) {
        BetterChat.method4655(l2);
    }

    @Class1
    public void method4654(Class42 d2) {
        block2: {
            Object object;
            String a2;
            block7: {
                block6: {
                    String b2;
                    block5: {
                        block4: {
                            block3: {
                                if (BetterChat.method4652(this).method507() == Class477.field2494) break block2;
                                a2 = Class1197.method13212(d2.method81());
                                if (a2.contains("\u00a7s[Hachimi] \u00a7r")) {
                                    return;
                                }
                                b2 = new SimpleDateFormat("k:mm").format(new Date());
                                int n2 = ((Class477)((Object)this.field1170.method507())).ordinal();
                                if (n2 == 0) break block3;
                                if (n2 == 1) break block4;
                                if (n2 == 2) break block5;
                                if (n2 != 3) {
                                    throw new MatchException(null, null);
                                }
                                break block6;
                            }
                            object = "<" + b2 + ">\u00a7r ";
                            break block7;
                        }
                        object = "\u00a78<\u00a77" + b2 + "\u00a78>\u00a7r ";
                        break block7;
                    }
                    object = "\u00a7s<" + b2 + ">\u00a7r ";
                    break block7;
                }
                object = "";
            }
            String c2 = object;
            d2.method10();
            d2.method82(class_2561.method_30163((String)(c2 + a2)));
        }
    }

    private static void method4655(long l2) {
        BetterChat.field1168[2] = l2 ^ 0xEDF57414CA73FFF0L;
        BetterChat.field1168[1] = l2 ^ 0xEDF57414CA73FCD0L;
        BetterChat.field1168[3] = l2 ^ 0xEDF57414CA73FF39L;
        BetterChat.field1168[0] = l2 ^ 0xEDF57414CA73FF38L;
    }

    private static void method4656() {
        Class4146.method20697();
    }

    private static int method4657(int n2, int n3, BreakESP class380, Class520 class520) {
        return Class4057.method20144(n2, n3, class380, class520);
    }

    private static int method4658(int n2, int n3, Class583 class583, Class5183 class5183) {
        return Class4057.method20137(n2, n3, class583, class5183);
    }

    private static void method4659() {
        Chams.method1924();
    }

    public BetterChat() {
        super("BetterChat", "Modifications for the chat", Class556.field2756);
        this.field1164 = this.method450(new Class253("ChatFont", "Uses custom font for chat text", (boolean)field1168[0]));
        this.field1170 = this.method450(new Class260("Timestamp", "Shows chat timestamps", Class477.field2494, Class477.values()));
        this.field1166 = this.method450(new Class260("Animation", "Animates the chat", Class600.field2916, Class600.values()));
        this.field1165 = this.method450(new Class252("Anim-Time", "Time for the animation", (int)field1168[0], (int)field1168[2], (int)field1168[1]));
        this.field1169 = this.method450(new Class253("NoSignatureIndicator", "Removes the message signature indicator", (boolean)field1168[0]));
        this.field1163 = this.method450(new Class253("Infinite", "Makes chat length infinite", (boolean)field1168[0]));
        this.field1167 = this.method450(new Class253("KeepChat", "Maintains chat history", (boolean)field1168[0]));
    }

    static {
        BetterChat.method4653(-1300005284781752520L);
    }

    @Class1
    public void method4660(Class74 a2) {
        if (((Boolean)this.field1163.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

