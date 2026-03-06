/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket
 *  net.minecraft.network.packet.s2c.play.GameMessageS2CPacket
 */
package mapped;

import java.awt.Color;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mapped.Class1;
import mapped.Class1057;
import mapped.Class110;
import mapped.Class1108;
import mapped.Class1197;
import mapped.Class133;
import mapped.Class1365;
import mapped.Class1503;
import mapped.Class17;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class191;
import mapped.Class246;
import mapped.Class248;
import mapped.Class250;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class259;
import mapped.Class278;
import mapped.Class298;
import mapped.Class3270;
import mapped.Class331;
import mapped.Class3318;
import mapped.Class3596;
import mapped.Class3663;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class445;
import mapped.Class521;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5739;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class5915;
import mapped.Class6001;
import mapped.Class6009;
import mapped.Class6127;
import mapped.Class6203;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6374;
import mapped.Class6402;
import mapped.Class6454;
import mapped.Class648;
import mapped.Class926;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.network.packet.Packet;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.network.packet.s2c.play.ChatMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class359
extends Class278 {
    private static long[] field1130 = new long[9];
    Class248 field1131 = this.method450(new Class253("Sound", "When someone ping play sound", (boolean)field1130[0]));
    Class248 field1132 = this.method450(new Class252("ExistTime", "Existence time for mark", Float.valueOf(0.0f), Float.valueOf(Class6203.field12629), Float.valueOf(100.0f)));
    ConcurrentHashMap field1133;
    Class248 field1134 = this.method450(new Class251("Color", "color", new Color((int)field1130[2], (int)field1130[2], (int)field1130[2], (int)field1130[3])));
    Class248 field1135 = this.method450(new Class250("EncryptKey", "Dont leak your key", "IDKWTFTHIS"));

    public static SecretKeySpec method4483(String d2) {
        try {
            byte[] a2 = d2.getBytes(Class359.method4527());
            MessageDigest b2 = MessageDigest.getInstance("SHA-256");
            a2 = b2.digest(a2);
            a2 = Arrays.copyOf(a2, (int)field1130[4]);
            return new SecretKeySpec(a2, "AES");
        }
        catch (Exception c2) {
            return null;
        }
    }

    private static int method4484(int n2, int n3, Class6127 class6127, Class445 class445) {
        return Class6374.method24393(n2, n3, class6127, class445);
    }

    private boolean method4485(Class648 a2) {
        return Class359.method4500(a2.field3151, Float.valueOf(((Float)this.field1132.method507()).floatValue() * Class1057.field4337));
    }

    static {
        Class359.method4486(3134137825319075310L);
    }

    private static void method4486(long l2) {
        Class359.field1130[0] = l2 ^ 0x2B7EB1BF2B423DEFL;
        Class359.field1130[1] = l2 ^ 0xD4814E40D4BDC211L;
        Class359.field1130[7] = l2 ^ 0x2B7EB1BF2B423DECL;
        Class359.field1130[2] = l2 ^ 0x2B7EB1BF2B423D11L;
        Class359.field1130[4] = l2 ^ 0x2B7EB1BF2B423DFEL;
        Class359.field1130[5] = l2 ^ 0x2B7EB1BF2B423DEEL;
        Class359.field1130[6] = l2 ^ 0x2B7EB1BF2B423DEDL;
        Class359.field1130[8] = l2 ^ 0x2B7EB1BF2B423DEAL;
        Class359.field1130[3] = l2 ^ 0x2B7EB1BF2B423D8AL;
    }

    private static void method4487() {
        Class1745.method15538();
    }

    private static void method4488(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method4489() {
        Class6009.method23561();
    }

    private static void method4490() {
        Class1745.method15538();
    }

    private static void method4491(String string) {
        Class1365.method13919(string);
    }

    private void method4492() {
        this.method4528();
    }

    @Class1
    private void method4493(Class133 c2) {
        if (Class359.field290.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = c2.method251();
        if (class_25962 instanceof class_7439) {
            class_7439 a2 = (class_7439)class_25962;
            if (a2.comp_763() != null) {
                field290.execute(() -> this.method4508(a2));
            }
        }
        if ((class_25962 = c2.method251()) instanceof class_7438) {
            class_7438 b2 = (class_7438)class_25962;
            if (b2.comp_1103() != null) {
                field290.execute(() -> this.method4514(b2));
            } else {
                field290.execute(() -> this.method4530(b2));
            }
        }
    }

    private static void method4494() {
        Class298.method1924();
    }

    private boolean method4495(String a2) {
        return a2.matches("-?\\d+(\\.\\d+)?");
    }

    public static Class543 method4496() {
        return Class543.field2690;
    }

    private static void method4497(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method4498() {
        Class6009.method23561();
    }

    private static void method4499() {
        Class3979.method19561();
    }

    private static boolean method4500(Class926 class926, Number number) {
        return class926.method12595(number);
    }

    private static void method4501() {
        Class6009.method23561();
    }

    public static ConcurrentHashMap method4502(Class359 class359) {
        return class359.field1133;
    }

    private static Object method4503(Class248 class248) {
        return class248.method507();
    }

    private static void method4504(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method4505() {
        Class6009.method23561();
    }

    private static void method4506() {
        Class6454.method24594();
    }

    public static ConcurrentHashMap method4507(Class359 class359) {
        return class359.field1133;
    }

    private void method4508(class_7439 a2) {
        this.method4535(a2.comp_763().getString());
    }

    private static void method4509(Class359 class359, String string) {
        class359.method4535(string);
    }

    private static int method4510(int n2, int n3, Class5693 class5693, Class521 class521) {
        return Class6374.method24372(n2, n3, class5693, class521);
    }

    private static void method4511() {
        Class1807.method15744();
    }

    @Override
    public void method1279() {
        this.field1133.clear();
    }

    private static void method4512() {
        Class6454.method24594();
    }

    private static void method4513() {
        Class6454.method24594();
    }

    private void method4514(class_7438 a2) {
        this.method4535(a2.comp_1103().getString());
    }

    private static void method4515() {
        Class6009.method23561();
    }

    @Class1
    public void method4516(Class59 b2) {
        Class6009.method23560();
        for (Class648 a2 : Class359.method4502(this).values()) {
            Class6454.method24621(b2.method125(), new class_238((double)a2.field3154.method_10263() + 0.25, Class5915.field11717, (double)a2.field3154.method_10260() + 0.25, (double)a2.field3154.method_10263() + Class3663.field8196, Class3318.field7148, (double)a2.field3154.method_10260() + Class3270.field7024), Class359.method4526(a2).getRGB());
        }
        Class359.method4489();
    }

    private static void method4517() {
        Class3979.method19561();
    }

    private static void method4518() {
        Class4146.method20697();
    }

    private static void method4519() {
        Class5836.method22885();
    }

    private static Class248 method4520(Class359 class359) {
        return Class359.method4521(class359);
    }

    public Class359() {
        super("Ping", "Mark points for your friends", Class556.field2756);
        this.field1133 = new ConcurrentHashMap();
        Class248 a2 = this.method450(new Class259("Ping", "Ping key", new Class246(this.method472() + "-ping", (int)field1130[1], this::method4492)));
        Class5723.field11059.method24187((Class246)a2.method507());
    }

    public static Class248 method4521(Class359 class359) {
        return class359.field1134;
    }

    @Class1
    public void method4522(Class63 a2) {
        if (a2.method128() != Class359.method4496()) {
            return;
        }
        this.field1133.values().removeIf(this::method4485);
    }

    private static int method4523(int n2, int n3, Class331 class331, Class3596 class3596) {
        return Class6374.method24396(n2, n3, class331, class3596);
    }

    private static int method4524(int n2, int n3, Class6402 class6402, Class17 class17) {
        return Class6374.method24379(n2, n3, class6402, class17);
    }

    public String method4525(String f2) {
        try {
            Cipher a2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec b2 = Class359.method4483((String)this.field1135.method507());
            byte[] c2 = new byte[(int)field1130[4]];
            IvParameterSpec d2 = new IvParameterSpec(c2);
            a2.init((int)field1130[0], (Key)b2, d2);
            return Base64.getEncoder().encodeToString(a2.doFinal(f2.getBytes(StandardCharsets.UTF_8)));
        }
        catch (Exception e2) {
            return null;
        }
    }

    public static Color method4526(Class648 class648) {
        return class648.field3152;
    }

    public static Charset method4527() {
        return StandardCharsets.UTF_8;
    }

    public void method4528() {
        class_239 c2;
        if (this.method1265() && (c2 = field290.method_1560().method_5745(256.0, 0.0f, (boolean)field1130[5])) instanceof class_3965) {
            class_3965 b2 = (class_3965)c2;
            class_2338 a2 = b2.method_17777();
            field290.method_1562().method_45729(this.method4525("EnemyHere{" + a2.method_10263() + "," + a2.method_10264() + "," + a2.method_10260() + "," + ((Color)Class359.method4520(this).method507()).getRGB() + "}"));
        }
    }

    private static void method4529() {
        Class1745.method15538();
    }

    private void method4530(class_7438 a2) {
        Class359.method4509(this, a2.comp_1102().comp_1090());
    }

    private static int method4531(int n2, int n3, Class191 class191, Class110 class110) {
        return Class6374.method24377(n2, n3, class191, class110);
    }

    private static void method4532(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    public String method4533(String g2) {
        try {
            Cipher a2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec b2 = Class359.method4483((String)this.field1135.method507());
            byte[] c2 = new byte[(int)field1130[4]];
            IvParameterSpec d2 = new IvParameterSpec(c2);
            a2.init((int)field1130[7], (Key)b2, d2);
            byte[] e2 = a2.doFinal(Base64.getDecoder().decode(g2));
            return new String(e2, StandardCharsets.UTF_8);
        }
        catch (Exception f2) {
            return null;
        }
    }

    private static void method4534() {
        Class5836.method22885();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void method4535(String D2) {
        try {
            void w2;
            void v2;
            void u2;
            void t2;
            if (D2 == null) {
                return;
            }
            String B2 = this.method4533(Class1197.method13222(D2).replaceAll("<[^>]*> ", ""));
            if (B2 == null) {
                return;
            }
            if (!B2.contains("EnemyHere")) return;
            Pattern z2 = Pattern.compile("\\{(.*?)}");
            Matcher A2 = z2.matcher(B2);
            if (!A2.find()) return;
            String x2 = A2.group((int)field1130[0]);
            String[] y2 = x2.split(",");
            if (y2.length == (int)field1130[6]) {
                if (((Boolean)Class359.method4503(this.field1131)).booleanValue()) {
                    Class359.field290.field_1687.method_8396((class_1657)Class359.field290.field_1724, Class359.field290.field_1724.method_24515(), class_3417.field_14627, class_3419.field_15248, 100.0f, Class5739.field11102);
                }
                String e2 = y2[(int)field1130[5]];
                String f2 = y2[(int)field1130[0]];
                String g2 = y2[(int)field1130[7]];
                z2 = Pattern.compile("<(.*?)>");
                A2 = z2.matcher(D2);
                if (!this.method4495(e2)) {
                    Class1108.method12918(true);
                    return;
                }
                double a2 = Double.parseDouble(e2);
                if (!this.method4495(f2)) return;
                double b2 = Double.parseDouble(f2);
                if (!this.method4495(g2)) return;
                double c2 = Double.parseDouble(g2);
                if (!A2.find()) {
                    void j2;
                    void i2;
                    void h2;
                    this.field1133.put(UUID.randomUUID().toString(), new Class648("Unknown", (class_2338)new class_2338.class_2339((double)h2, (double)i2, (double)j2), (Color)this.field1134.method507(), new Class926()));
                    Class359.method4491("Unknown marked at \u00a7r(" + e2 + ", " + f2 + ", " + g2 + ")");
                    return;
                }
                Class6322.method24332(0.5064845f, 0.10614556f);
                return;
            }
            if (y2.length != (int)field1130[8]) {
                return;
            }
            if (!((Boolean)this.field1131.method507()).booleanValue()) {
                int n2 = 14585;
                Class359.method4534();
                return;
            }
            int n3 = 14584;
            while (true) {
                int n4;
                if ((n4 = n3) == 14584) {
                    Class359.field290.field_1687.method_8396((class_1657)Class359.field290.field_1724, Class359.field290.field_1724.method_24515(), class_3417.field_14627, class_3419.field_15248, 100.0f, Class6001.field11974);
                    break;
                }
                if (n4 != 14585) break;
                n3 = 14583;
            }
            String p2 = y2[(int)field1130[5]];
            String q2 = y2[(int)field1130[0]];
            String r2 = y2[(int)field1130[7]];
            String s2 = y2[(int)field1130[6]];
            z2 = Pattern.compile("<(.*?)>");
            A2 = z2.matcher(D2);
            if (!this.method4495(p2)) return;
            double k2 = Double.parseDouble(p2);
            if (!this.method4495(q2)) return;
            double l2 = Double.parseDouble(q2);
            if (!this.method4495(r2)) return;
            double m2 = Double.parseDouble(r2);
            if (!this.method4495(s2)) {
                return;
            }
            double n5 = Double.parseDouble(s2);
            if (A2.find()) {
                String o2 = A2.group((int)field1130[0]);
                Class359.method4507(this).put(o2, new Class648(o2, (class_2338)new class_2338.class_2339((double)t2, (double)u2, (double)v2), new Color((int)w2, (boolean)field1130[0]), new Class926()));
                Class1365.method13919(o2 + " marked at \u00a7r(" + p2 + ", " + q2 + ", " + r2 + ")");
                return;
            }
            this.field1133.put(UUID.randomUUID().toString(), new Class648("Unknown", (class_2338)new class_2338.class_2339((double)t2, (double)u2, (double)v2), new Color((int)w2, (boolean)field1130[0]), new Class926()));
            Class1365.method13919("Unknown marked at \u00a7r(" + p2 + ", " + q2 + ", " + r2 + ")");
            return;
        }
        catch (Exception C2) {
            C2.printStackTrace();
        }
    }

    private static void method4536() {
        Class6009.method23561();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

