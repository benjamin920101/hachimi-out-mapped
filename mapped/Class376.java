/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2664
 *  net.minecraft.class_2743
 *  net.minecraft.class_2824
 *  net.minecraft.class_2828
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2848
 *  net.minecraft.class_2879
 *  net.minecraft.class_2885
 *  net.minecraft.class_2886
 *  net.minecraft.class_310
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_638
 *  net.minecraft.class_6880$class_6883
 *  net.minecraft.class_746
 *  net.minecraft.class_8042
 *  net.minecraft.class_9331
 *  net.minecraft.class_9334
 */
package mapped;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class131;
import mapped.Class133;
import mapped.Class1468;
import mapped.Class1480;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class169;
import mapped.Class1807;
import mapped.Class229;
import mapped.Class233;
import mapped.Class246;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class259;
import mapped.Class278;
import mapped.Class3224;
import mapped.Class3341;
import mapped.Class3888;
import mapped.Class4146;
import mapped.Class543;
import mapped.Class5496;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5929;
import mapped.Class6009;
import mapped.Class63;
import mapped.Class6322;
import mapped.Class6454;
import net.hachimi.client.mixin.bm;
import net.hachimi.client.mixin.c;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2664;
import net.minecraft.class_2743;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_638;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_8042;
import net.minecraft.class_9331;
import net.minecraft.class_9334;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class376
extends Class278 {
    private class_243 field1241;
    Class248 field1242;
    private final Queue field1243 = new LinkedBlockingQueue();
    private float field1244;
    private boolean field1245;
    Class248 field1246;
    private Class1468 field1247;
    private static Class376 INSTANCE;
    Class248 field1248;
    Class248 field1249;
    Class248 field1250;
    private float field1251;
    Class248 field1252;
    private static long[] field1253;
    Class248 field1254;
    Class248 field1255 = this.method450(new Class253("Pulse", "Releases packets at intervals", (boolean)field1253[1]));
    Class248 field1256;

    private static void method4936(class_2664 a2) {
        ((bm)Class376.method4956(field290)).hookPlaySound(a2.method_11475(), a2.method_11477(), a2.method_11478(), (class_3414)class_3417.field_15152.comp_349(), class_3419.field_15245, Class3888.field8840, (1.0f + (field289.nextFloat() - field289.nextFloat()) * 0.2f) * 0.7f, (boolean)field1253[1], field289.nextLong());
    }

    static {
        field1253 = new long[6];
        Class376.method4967(1616117952775727183L);
    }

    private static void method4937(Class376 class376, boolean bl2) {
        Class376.method4992(class376, bl2);
    }

    @Class1
    public void method4938(Class63 b2) {
        if (b2.method128() == Class376.method4988()) {
            if (((Boolean)this.field1255.method507()).booleanValue()) {
                int n2 = 53045;
                Class1668.method15147(540386001, -56262516, -675424697, 1158877476);
                return;
            }
            int n3 = 53046;
            Class6009.method23561();
            return;
        }
    }

    private static void method4939() {
        Class4146.method20697();
    }

    private static void method4940(float f2) {
        Class5836.method22907(f2);
    }

    private static void method4941() {
        Class5836.method22885();
    }

    public static class_3419 method4942() {
        return class_3419.field_15245;
    }

    public static void method4943(Class376 class376, boolean bl2) {
        class376.field1245 = bl2;
    }

    private static Object method4944(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method4945(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_9331 method4946() {
        return Class376.method4961();
    }

    private static void method4947() {
        Class1503.method14420();
    }

    private static boolean method4948() {
        return Class1807.method15753();
    }

    private static void method4949() {
        Class1807.method15744();
    }

    private static void method4950(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method4951(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4952(Class233 b2) {
        if (Class376.field290.field_1690.field_1842) {
            return;
        }
        int n2 = (Boolean)Class376.method4964(this).method507() != false ? 17708 : 17709;
        block4: while (true) {
            switch (n2) {
                case 17709: {
                    n2 = 17707;
                    continue block4;
                }
                case 17708: {
                    String a2 = "Blinking.. (" + this.field1243.size() + ")";
                    Class6454.method24624(b2.method6(), a2, (float)field290.method_22683().method_4486() / 2.0f - (float)Class6454.method24719(a2) / 2.0f + (float)((Integer)this.field1254.method507()).intValue(), (float)field290.method_22683().method_4502() / 2.0f + (float)Class6454.method24637() - (float)((Integer)this.field1248.method507()).intValue(), ((Color)this.field1256.method507()).getRGB());
                    return;
                }
            }
            break;
        }
    }

    private static int method4953(int n2, int n3, Class3224 class3224, Class169 class169) {
        return Class3341.method17166(n2, n3, class3224, class169);
    }

    @Class1
    public void method4954(Class133 g2) {
        if (Class376.method4976(field290) == null || Class376.field290.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = g2.method251();
        if (class_25962 instanceof class_2743) {
            class_2743 a2 = (class_2743)class_25962;
            if (a2.method_11818() != Class376.method4955(field290).method_5628()) {
                return;
            }
            g2.method10();
        } else {
            class_25962 = g2.method251();
            if (class_25962 instanceof class_2664) {
                class_2664 b2 = (class_2664)class_25962;
                g2.method10();
                field290.method_40000(() -> Class376.method4936(b2));
                Class5659.method22184();
                return;
            }
            class_25962 = g2.method251();
            if (class_25962 instanceof class_8042) {
                class_8042 f2 = (class_8042)class_25962;
                ArrayList<class_2596> e2 = new ArrayList<class_2596>();
                for (class_2596 d2 : f2.method_48324()) {
                    if (d2 instanceof class_2664) {
                        class_2664 c2 = (class_2664)d2;
                        field290.method_40000(() -> Class376.method4971(c2));
                        continue;
                    }
                    if (d2 instanceof class_2743) continue;
                    e2.add(d2);
                }
                ((c)f2).setIterable(e2);
            }
        }
    }

    public static class_746 method4955(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_638 method4956(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private Boolean method1269() {
        return (Boolean)this.field1255.method507();
    }

    public static Queue method4957(Class376 class376) {
        return class376.field1243;
    }

    public static Class1468 method4958(Class376 class376) {
        return class376.field1247;
    }

    public Class376() {
        super("Blink", "Withholds packets from the server, creating clientside lag", Class556.field2755);
        this.field1242 = this.method450(new Class252("Factor", "The factor for packet intervals", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(1.0f), (Number)Float.valueOf(Class5929.field11772), this::method1269));
        this.field1250 = this.method450(new Class253("Render", "Renders the serverside player position", (boolean)field1253[2]));
        this.field1252 = this.method450(new Class253("PauseModules", "Pause all modules", (boolean)field1253[2]));
        this.field1246 = this.method450(new Class253("Indicator", "Just add a indicator on your screen", (boolean)field1253[2]));
        this.field1256 = this.method450(new Class251("Color", "The color of indicator", new Color((int)field1253[3], (int)field1253[3], (int)field1253[3]), (boolean)field1253[2], (boolean)field1253[2], this.field1246::method507));
        this.field1248 = this.method450(new Class252("YOffset", "", (Number)((int)field1253[0]), (Number)((int)field1253[1]), (Number)((int)field1253[4]), this.field1246::method507));
        this.field1254 = this.method450(new Class252("XOffset", "", (Number)((int)field1253[0]), (Number)((int)field1253[1]), (Number)((int)field1253[4]), this.field1246::method507));
        this.field1249 = this.method450(new Class259("Cancel", "Cancel the blink", new Class246(this.method472() + "-cancel", (int)field1253[5], this::method4978)));
        INSTANCE = this;
        Class5723.field11059.method24187((Class246)Class376.method4944(this.field1249));
    }

    public static Class5496 method4959() {
        return Class5723.field11048;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method1274() {
        if (Class376.method4945(field290) == null) return;
        int n2 = (Boolean)Class376.method4970(this.field1250) != false ? 58736 : 58737;
        block4: while (true) {
            switch (n2) {
                case 58737: {
                    n2 = 58735;
                    continue block4;
                }
                case 58736: {
                    this.field1241 = Class376.field290.field_1724.method_19538();
                    this.field1251 = Class376.field290.field_1724.method_36454();
                    this.field1244 = Class376.field290.field_1724.method_36455();
                    this.field1247 = new Class1468((class_1657)Class376.field290.field_1724);
                    Class376.method4958(this).method14391();
                    return;
                }
            }
            break;
        }
    }

    private static Class376 method4960() {
        return Class376.method4986();
    }

    public static class_9331 method4961() {
        return class_9334.field_50075;
    }

    public static class_6880.class_6883 method4962() {
        return class_3417.field_15152;
    }

    public static Class376 method4963() {
        return INSTANCE;
    }

    public static Class248 method4964(Class376 class376) {
        return class376.field1246;
    }

    public static Queue method4965(Class376 class376) {
        return class376.field1243;
    }

    private static void method4966(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method4967(long l2) {
        Class376.method4975(l2);
    }

    private static void method4968() {
        Class5659.method22184();
    }

    private static void method4969() {
        Class5836.method22890();
    }

    private static Object method4970(Class248 class248) {
        return class248.method507();
    }

    private static void method4971(class_2664 a2) {
        ((bm)Class376.field290.field_1687).hookPlaySound(a2.method_11475(), a2.method_11477(), a2.method_11478(), (class_3414)Class376.method4962().comp_349(), Class376.method4942(), Class1480.field5603, (1.0f + (field289.nextFloat() - field289.nextFloat()) * 0.2f) * 0.7f, (boolean)field1253[1], field289.nextLong());
    }

    private static void method4972() {
        Class1503.method14420();
    }

    public static Queue method4973(Class376 class376) {
        return class376.field1243;
    }

    public static class_746 method4974(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4975(long l2) {
        Class376.field1253[1] = l2 ^ 0x166D9AB72A54284FL;
        Class376.field1253[2] = l2 ^ 0x166D9AB72A54284EL;
        Class376.field1253[4] = l2 ^ 0x166D9AB72A542887L;
        Class376.field1253[3] = l2 ^ 0x166D9AB72A5428B0L;
        Class376.field1253[0] = l2 ^ 0xE9926548D5ABD777L;
        Class376.field1253[5] = l2 ^ 0xE9926548D5ABD7B0L;
    }

    public static class_746 method4976(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4977() {
        Class1503.method14420();
    }

    public void method4978() {
        if (this.method1265() && this.field1241 != null) {
            this.field1243.clear();
            Class376.field290.field_1724.method_33574(this.field1241);
            Class376.field290.field_1724.method_36456(this.field1251);
            Class376.field290.field_1724.method_36457(this.field1244);
            this.method1268();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4979(Class131 e2) {
        class_1799 c2;
        class_2886 d2;
        block9: {
            block10: {
                class_2596 class_25962;
                block8: {
                    if (Class376.field290.field_1724 == null) return;
                    if (Class376.method4980(field290).method_3144()) return;
                    if (this.field1245) {
                        return;
                    }
                    int n2 = !(e2.method251() instanceof class_2828) ? 20085 : 20086;
                    block4: while (true) {
                        switch (n2) {
                            case 20086: {
                                n2 = 20084;
                                continue block4;
                            }
                            case 20085: {
                                if (!(e2.method251() instanceof class_2848) && !(e2.method251() instanceof class_2879) && !(e2.method251() instanceof class_2824) && !(e2.method251() instanceof class_2885)) break block4;
                            }
                            default: {
                                e2.method10();
                                Class376.method4973(this).add(e2.method251());
                                return;
                            }
                        }
                        break;
                    }
                    class_25962 = e2.method251();
                    if (class_25962 instanceof class_2846) break block8;
                    class_25962 = e2.method251();
                    if (!(class_25962 instanceof class_2886)) return;
                    d2 = (class_2886)class_25962;
                    if (d2.method_12551() != Class376.method4983()) break block9;
                    break block10;
                }
                class_2846 a2 = (class_2846)class_25962;
                if (a2.method_12363() == class_2846.class_2847.field_12974) {
                    return;
                }
                e2.method10();
                Class376.method4985(this).add(e2.method251());
                Class376.method4984();
                return;
            }
            class_1799 b2 = Class5723.field11058.method18908();
            if (b2.method_57353().method_57832(Class376.method4946())) return;
            Class1108.method12918(true);
            return;
        }
        if (d2.method_12551() == class_1268.field_5810 && (c2 = Class376.field290.field_1724.method_6079()).method_57353().method_57832(class_9334.field_50075)) {
            return;
        }
        e2.method10();
        this.field1243.add(e2.method251());
    }

    public static class_746 method4980(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Queue method4981(Class376 class376) {
        return Class376.method4957(class376);
    }

    @Class1
    public void method4982(Class229 a2) {
        this.method1268();
    }

    public static class_1268 method4983() {
        return class_1268.field_5808;
    }

    private static void method4984() {
        Class6009.method23560();
    }

    public static Queue method4985(Class376 class376) {
        return class376.field1243;
    }

    public static Class376 method4986() {
        return Class376.method4963();
    }

    public static boolean method4987() {
        if (Class376.method4960().method1265() && ((Boolean)Class376.method4986().field1252.method507()).booleanValue()) {
            int n2 = (int)field1253[2];
            return Class1807.method15742();
        }
        return (int)field1253[1] != 0;
    }

    public static Class543 method4988() {
        return Class543.field2690;
    }

    private static void method4989() {
        Class1503.method14420();
    }

    public static Class1468 method4990(Class376 class376) {
        return class376.field1247;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method1279() {
        if (Class376.field290.field_1724 == null) {
            return;
        }
        int n2 = !Class376.method4995(this).isEmpty() ? 22321 : 22322;
        block4: while (true) {
            switch (n2) {
                case 22322: {
                    n2 = 22320;
                    continue block4;
                }
                case 22321: {
                    for (class_2596 a2 : this.field1243) {
                        Class5723.field11048.method21341(a2);
                    }
                    this.field1243.clear();
                    break block4;
                }
            }
            break;
        }
        if (this.field1247 != null) {
            Class376.method4990(this).method_5826(UUID.fromString("8667ba71-b85a-4004-af54-457a9734eed7"));
            this.field1247.method14392();
        }
    }

    private static void method4991() {
        Class6009.method23560();
    }

    public static void method4992(Class376 class376, boolean bl2) {
        class376.field1245 = bl2;
    }

    private static void method4993() {
        Class6009.method23561();
    }

    private static void method4994() {
        Class1807.method15744();
    }

    private static Queue method4995(Class376 class376) {
        return Class376.method4965(class376);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

