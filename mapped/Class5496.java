/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.listener.ClientLoginPacketListener
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientLoginNetworkHandler
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ServerAddress
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.client.network.ServerInfo
 *  net.minecraft.client.network.PendingUpdateManager
 *  net.minecraft.client.network.SequencedPacketCreator
 */
package mapped;

import java.util.HashSet;
import java.util.Set;
import mapped.Class1;
import mapped.Class131;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class1610;
import mapped.Class1668;
import mapped.Class225;
import mapped.Class229;
import mapped.Class3293;
import mapped.Class3815;
import mapped.Class4045;
import mapped.Class4122;
import mapped.Class6009;
import mapped.Class6454;
import net.hachimi.client.mixin.bm;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.listener.ClientLoginPacketListener;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientLoginNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.network.PendingUpdateManager;
import net.minecraft.client.network.SequencedPacketCreator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5496 {
    private static final Set field10318;
    private final Class3293 field10319 = new Class3293();
    private class_639 field10320;
    private final Class3293 field10321 = new Class3293();
    private static long[] field10322;
    private class_642 field10323;

    public int method21337() {
        return Class5496.method21338(this.field10321);
    }

    private static int method21338(Class3293 class3293) {
        return class3293.method16841();
    }

    public void method21339(class_7204 f2) {
        if (Class5496.method21367(Class4122.field9561) != null) {
            class_7202 e2 = ((bm)Class5496.method21340().field_1687).hookGetPendingUpdateManager().method_41937();
            try {
                int a2 = e2.method_41942();
                class_2596 b2 = f2.predict(a2);
                this.method21342(b2);
            }
            catch (Throwable d2) {
                d2.printStackTrace();
                if (e2 != null) {
                    try {
                        e2.close();
                    }
                    catch (Throwable c2) {
                        c2.printStackTrace();
                        d2.addSuppressed(c2);
                    }
                }
                throw d2;
            }
            if (e2 != null) {
                e2.close();
            }
        }
    }

    public static class_310 method21340() {
        return Class4122.field9561;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void method21341(class_2596 a2) {
        int n2 = Class5496.method21360().method_1562() != null ? 5008 : 5009;
        block4: while (true) {
            switch (n2) {
                case 5009: {
                    n2 = 5007;
                    continue block4;
                }
                case 5008: {
                    field10318.add(a2);
                    Class4122.field9561.method_1562().method_52787(a2);
                    return;
                }
            }
            break;
        }
    }

    public void method21342(class_2596 a2) {
        if (Class4122.field9561.method_1562() != null) {
            field10318.add(a2);
            ((Class1610)Class4122.field9561.method_1562()).method14761(a2);
        }
    }

    public boolean method21343(class_2596 a2) {
        return field10318.contains(a2);
    }

    private static void method21344(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public Class5496() {
        Class3815.INSTANCE.method18546(this);
    }

    @Class1
    public void method21345(Class131 a2) {
        this.field10319.method16848();
    }

    public boolean method21346() {
        return Class5496.method21348(this).contains("2b2t.org");
    }

    public int method21347() {
        return this.field10319.method16841();
    }

    private static String method21348(Class5496 class5496) {
        return class5496.method21362();
    }

    private static void method21349(long l2) {
        Class5496.field10322[0] = l2 ^ 0xD8A6081475A39305L;
    }

    @Class1
    public void method21350(Class225 a2) {
        this.field10320 = a2.method420();
        this.field10323 = a2.method418();
    }

    public void method21351(class_642 a2) {
        this.field10323 = a2;
    }

    public class_642 method21352() {
        return this.field10323;
    }

    public void method21353(class_7204 f2) {
        if (Class4122.field9561.field_1687 != null) {
            class_7202 e2 = ((bm)Class5496.method21358(Class5496.method21369())).hookGetPendingUpdateManager().method_41937();
            try {
                int a2 = e2.method_41942();
                class_2596 b2 = f2.predict(a2);
                this.method21341(b2);
            }
            catch (Throwable d2) {
                d2.printStackTrace();
                if (e2 != null) {
                    try {
                        e2.close();
                    }
                    catch (Throwable c2) {
                        c2.printStackTrace();
                        d2.addSuppressed(c2);
                    }
                }
                throw d2;
            }
            if (e2 != null) {
                e2.close();
            }
        }
    }

    private static int method21354(int n2, int n3) {
        return Class4045.method20093(n2, n3);
    }

    @Class1
    public void method21355(Class229 a2) {
        field10318.clear();
    }

    private static void method21356(boolean bl2) {
        Class6009.method23559(bl2);
    }

    static {
        field10322 = new long[1];
        Class5496.method21349(-2835570031417126139L);
        field10318 = new HashSet();
    }

    public static class_310 method21357() {
        return Class4122.field9561;
    }

    public static class_638 method21358(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method21359(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public static class_310 method21360() {
        return Class4122.field9561;
    }

    private static void method21361() {
        Class1503.method14420();
    }

    public String method21362() {
        if (this.field10323 != null) {
            return this.field10323.field_3761;
        }
        return "Singleplayer";
    }

    public boolean method21363() {
        return this.method21362().contains("crystalpvp.cc");
    }

    public void method21364(class_639 a2) {
        this.field10320 = a2;
    }

    public static class_310 method21365() {
        return Class4122.field9561;
    }

    @Class1
    public void method21366(Class133 a2) {
        this.field10321.method16848();
    }

    public static class_638 method21367(class_310 class_3102) {
        return class_3102.field_1687;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int method21368() {
        if (Class4122.field9561.method_1562() != null) {
            class_640 a2 = Class4122.field9561.method_1562().method_2871(Class4122.field9561.field_1724.method_7334().getId());
            if (a2 != null) {
                return Class4045.method20105(1203769656);
            }
            int n2 = 36087;
            block4: while (true) {
                switch (n2) {
                    case 36087: {
                        n2 = 36085;
                        continue block4;
                    }
                    case 36086: {
                        return a2.method_2959();
                    }
                }
                break;
            }
        }
        return (int)field10322[0];
    }

    public static class_310 method21369() {
        return Class4122.field9561;
    }

    public void method21370(class_639 a2, class_642 b2) {
        if (Class4122.field9561.method_1562() == null) {
            return;
        }
        Class4122.field9561.method_1562().method_48296().method_52902(a2.method_2952(), a2.method_2954(), (class_2896)new class_635(Class5496.method21365().method_1562().method_48296(), Class5496.method21357(), b2, null, (boolean)field10322[0], null, null, null));
    }

    public class_639 method21371() {
        return this.field10320;
    }

    private static void method21372() {
        Class6454.method24594();
    }

    private static int method21373(int n2) {
        return Class4045.method20096(n2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

