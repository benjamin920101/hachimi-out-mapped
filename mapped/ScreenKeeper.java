/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket
 *  net.minecraft.network.packet.s2c.play.BundleS2CPacket
 */
package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import mapped.Class1;
import mapped.Class133;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class224;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3979;
import mapped.Class4146;
import mapped.Class43;
import mapped.Class537;
import mapped.Class556;
import mapped.Class5648;
import net.hachimi.client.mixin.c;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.CloseScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.BundleS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ScreenKeeper
extends Class278 {
    Class248 field584 = this.method450(new Class253("Portal", "Prevent portal close your screen", (boolean)field585[1]));
    private static long[] field585 = new long[2];
    Class248 field586 = this.method450(new Class253("Server", "Cancels the S2CCloseScreen packet", (boolean)field585[0]));

    private static void method2044() {
        Class1807.method15744();
    }

    private static void method2045() {
        Class4146.method20697();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method2046(Class133 d2) {
        if (ScreenKeeper.field290.field_1724 == null) {
            return;
        }
        if ((Boolean)this.field586.method507() == false) return;
        if (ScreenKeeper.field290.field_1724.field_7512.field_7763 != ScreenKeeper.field290.field_1724.field_7498.field_7763) {
            return;
        }
        if (d2.method251() instanceof class_2645) {
            d2.method10();
            return;
        }
        class_2596 class_25962 = d2.method251();
        if (!(class_25962 instanceof class_8042)) return;
        class_8042 c2 = (class_8042)class_25962;
        ArrayList<class_2596> b2 = new ArrayList<class_2596>();
        Iterator iterator = c2.method_48324().iterator();
        block4: while (true) {
            int n2 = !iterator.hasNext() ? 6452 : 6451;
            block5: while (true) {
                switch (n2) {
                    case 6452: {
                        n2 = 6450;
                        continue block5;
                    }
                    case 6451: {
                        class_2596 a2 = (class_2596)iterator.next();
                        if (a2 instanceof class_2645) continue block4;
                        b2.add(a2);
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        ((c)c2).setIterable(b2);
    }

    private static void method2047() {
        Class3979.method19561();
    }

    private static int method2048(int n2, int n3, Class43 class43, Class537 class537) {
        return Class5648.method22073(n2, n3, class43, class537);
    }

    private static void method2049(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    static {
        ScreenKeeper.method2052(-2423190933403109366L);
    }

    private static void method2050() {
        Class1745.method15538();
    }

    @Class1
    public void method2051(Class224 a2) {
        if (((Boolean)this.field584.method507()).booleanValue()) {
            a2.method10();
        }
    }

    public ScreenKeeper() {
        super("ScreenKeeper", "Prevent close your screen", Class556.field2755);
    }

    private static void method2052(long l2) {
        ScreenKeeper.field585[0] = l2 ^ 0xDE5F18AF478F780AL;
        ScreenKeeper.field585[1] = l2 ^ 0xDE5F18AF478F780BL;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

