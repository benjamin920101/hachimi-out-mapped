/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 */
package mapped;

import com.mojang.brigadier.CommandDispatcher;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import mapped.Class1;
import mapped.Class117;
import mapped.Class1277;
import mapped.Class1365;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class4146;
import mapped.FakePlayer;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5643;
import mapped.Class5723;
import mapped.Class5808;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6074;
import mapped.Class63;
import mapped.Class925;
import mapped.Class926;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Spammer
extends Class278 {
    Class248 field1494;
    private int field1495;
    private final Class925 field1496;
    private final List field1497 = new ArrayList();
    Class248 field1498;
    private static long[] field1499 = new long[4];
    Class248 field1500;

    private static void method6375(Spammer class406, String string) {
        class406.method6376(string);
    }

    private void method6376(String b2) {
        if (b2.charAt((int)field1499[0]) == (int)field1499[3]) {
            b2 = b2.substring((int)field1499[2]);
            Spammer.field290.field_1724.field_3944.method_45731(b2);
            return;
        }
        if (b2.startsWith(Class5723.field11060.method23820())) {
            String a2 = b2.substring((int)field1499[2]);
            Spammer.field290.field_1705.method_1743().method_1803(b2);
            try {
                Spammer.method6393(Class5723.field11060).execute(Class5723.field11060.method23832().parse(a2, (Object)Class5723.field11060.method23821()));
            }
            catch (Exception exception) {
                // empty catch block
            }
            return;
        }
        if (field290.method_1542()) {
            Spammer.method6386(b2);
        } else {
            Class1365.method13930(b2);
        }
    }

    private static void method6377(long l2) {
        Spammer.field1499[2] = l2 ^ 0xC9FB30DA8E94F778L;
        Spammer.field1499[3] = l2 ^ 0xC9FB30DA8E94F756L;
        Spammer.field1499[1] = l2 ^ 0xC9FB30DA8E94F77BL;
        Spammer.field1499[0] = l2 ^ 0xC9FB30DA8E94F779L;
    }

    private static Object method6378(Class248 class248) {
        return class248.method507();
    }

    private void method6379() {
        File e2 = Class3979.field9083.method14363().resolve("spammer.txt").toFile();
        if (!e2.exists()) {
            this.method1251("The spammer.txt file does not exist! Please create one to enable this module");
            this.method1268();
            return;
        }
        this.field1497.clear();
        try {
            for (String c2 : Files.readAllLines(Path.of(e2.getAbsolutePath(), new String[(int)field1499[0]]), StandardCharsets.UTF_8)) {
                String[] b2;
                String[] stringArray = b2 = c2.split(",");
                int n2 = stringArray.length;
                for (int i2 = (int)field1499[0]; i2 < n2; ++i2) {
                    String a2 = stringArray[i2];
                    this.field1497.add(a2.trim());
                }
            }
        }
        catch (IOException d2) {
            d2.printStackTrace();
        }
    }

    private static void method6380(boolean bl2) {
        Class6009.method23559(bl2);
    }

    @Class1
    public void method6381(Class63 a2) {
        if (a2.method128() != Spammer.method6385()) {
            return;
        }
        if (this.field1496.method12595(Float.valueOf(((Float)this.field1500.method507()).floatValue() * 1000.0f))) {
            Spammer.method6375(this, this.method6392());
            this.field1496.method12593();
        }
    }

    public static Class248 method6382(Spammer class406) {
        return class406.field1498;
    }

    private static void method6383() {
        Class5836.method22890();
    }

    private static void method6384() {
        Class4146.method20694();
    }

    static {
        Spammer.method6377(-3892463737678530695L);
    }

    private static Class543 method6385() {
        return Spammer.method6389();
    }

    public Spammer() {
        super("Spammer", "Spams messages in the chat", Class556.field2756);
        this.field1496 = new Class926();
        this.field1500 = this.method450(new Class252("Delay", "The chat message delay", Float.valueOf(0.0f), Float.valueOf(1.5f), Float.valueOf(10.0f)));
        this.field1494 = this.method450(new Class253("Random", "Randomizes the spammed messages", (boolean)field1499[0]));
        this.field1498 = this.method450(new Class253("AntiKick", "Adds a random suffix to end of messages to prevent kicks", (boolean)field1499[0]));
    }

    private static void method6386(String string) {
        Class1365.method13936(string);
    }

    public static Class248 method6387(Spammer class406) {
        return class406.field1494;
    }

    private static void method6388() {
        Class4146.method20697();
    }

    public static Class543 method6389() {
        return Class543.field2690;
    }

    private static void method6390(boolean bl2) {
        Class6009.method23559(bl2);
    }

    @Class1
    public void method6391(Class117 a2) {
        this.method1274();
    }

    private String method6392() {
        String c2 = "Hachimi victory!";
        if (this.field1497.isEmpty()) {
            return c2;
        }
        if (((Boolean)Spammer.method6387(this).method507()).booleanValue()) {
            Object a2 = (String)this.field1497.get(field289.nextInt(this.field1497.size()));
            if (a2 != null) {
                if (((Boolean)Spammer.method6378(Spammer.method6382(this))).booleanValue()) {
                    a2 = (String)a2 + " " + Class5643.method22064((int)field1499[1]);
                }
                return a2;
            }
        } else {
            Object b2 = (String)this.field1497.get(this.field1495);
            this.field1495 += (int)field1499[2];
            if (this.field1495 >= this.field1497.size()) {
                this.field1495 = (int)field1499[0];
            }
            if (b2 != null) {
                if (((Boolean)this.field1498.method507()).booleanValue()) {
                    b2 = (String)b2 + " " + Class5643.method22064((int)field1499[1]);
                }
                return b2;
            }
        }
        return c2;
    }

    @Override
    public void method1274() {
        this.method6379();
        this.field1495 = (int)field1499[0];
    }

    private static CommandDispatcher method6393(Class6074 class6074) {
        return class6074.method23832();
    }

    private static int method6394(int n2, int n3, Class5808 class5808, FakePlayer class449) {
        return Class1277.method13574(n2, n3, class5808, class449);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

