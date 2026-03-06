/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.Text
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.Screen
 */
package mapped;

import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mapped.Class1185;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class261;
import mapped.Class267;
import mapped.Class268;
import mapped.Class269;
import mapped.Class270;
import mapped.Class273;
import mapped.Class274;
import mapped.Class276;
import mapped.Class277;
import mapped.Chams;
import mapped.ClickGui;
import mapped.Blink;
import mapped.Class3810;
import mapped.Class3979;
import mapped.Class4034;
import mapped.Class4045;
import mapped.Replenish;
import mapped.Zoom;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Velocity;
import mapped.Class489;
import mapped.Class5473;
import mapped.Class556;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class601;
import mapped.Class6283;
import mapped.Class6435;
import mapped.Class6454;
import mapped.Class8;
import mapped.Class803;
import mapped.Class830;
import mapped.Class99;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1450
extends class_437 {
    private final ClickGui field5514;
    public static boolean field5515;
    public static int field5516;
    public static boolean field5517;
    private final List field5518 = new CopyOnWriteArrayList();
    private String field5519;
    public static final Class5473 field5520;
    public static boolean field5521;
    public static boolean field5522;
    private final Class6283 field5523 = new Class6283((boolean)field5525[1], Class1185.field4699, Class489.field2543);
    private boolean field5524 = (int)field5525[0];
    private static long[] field5525;
    public static boolean field5526;
    public static int field5527;

    public boolean method_16803(int a2, int b2, int c2) {
        if (a2 == (int)field5525[5]) {
            Class1450.method14282((boolean)field5525[1]);
        }
        return super.method_16803(a2, b2, c2);
    }

    public static ClickGui method14278(Class1450 class1450) {
        return class1450.field5514;
    }

    private static boolean method14279(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static boolean method14280() {
        return Velocity.method10252();
    }

    private static boolean method14281() {
        return Blink.method4987();
    }

    public boolean method_25406(double b2, double c2, int d2) {
        if (d2 == 0) {
            field5522 = (int)field5525[1];
            return Class5659.method22111();
        }
        if (d2 == (int)field5525[0]) {
            field5526 = (int)field5525[1];
        }
        for (Class261 a2 : this.field5518) {
            a2.method722(b2, c2, d2);
        }
        return super.method_25406(b2, c2, d2);
    }

    public static void method14282(boolean bl2) {
        field5515 = bl2;
    }

    private static boolean method14283(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static boolean method14284() {
        return Blink.method4987();
    }

    private static int method14285(int n2, int n3, Class8 class8, Class99 class99) {
        return Class6435.method24556(n2, n3, class8, class99);
    }

    public static void method14286(Class1450 class1450, boolean bl2) {
        class1450.field5524 = bl2;
    }

    private static boolean method14287() {
        return Velocity.method10322();
    }

    public static float method14288() {
        return 1.0f;
    }

    private static boolean method14289(ClickGui class333) {
        return class333.method3003();
    }

    private static boolean method14290() {
        return Class1807.method15769();
    }

    private static boolean method14291(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    public static ClickGui method14292(Class1450 class1450) {
        return class1450.field5514;
    }

    public static void method14293(boolean bl2) {
        field5517 = bl2;
    }

    /*
     * Unable to fully structure code
     */
    public boolean method_25404(int i, int j, int k) {
        if (i == (int)Class1450.field5525[5]) {
            Class1450.field5515 = (int)Class1450.field5525[0];
        }
        if (i == (int)Class1450.field5525[4]) {
            if (Class1450.field5515) {
                ClickGui.field838 = new Class1450(this.field5514);
                Class1450.method14278(this).method1268();
                Class1450.method14292(this).method1264();
            }
        }
        this.field5524 = (int)Class1450.field5525[0];
        for (Class261 g : this.field5518) {
            if (g.method713() != null && g.method713().method796()) {
                this.field5524 = (int)Class1450.field5525[1];
                continue;
            }
            block5: for (Class276 f : g.method663()) {
                for (Class268 e : f.method1164()) {
                    block20: {
                        block21: {
                            if (!(e instanceof Class269)) {
                                while (true) {
                                    // Infinite loop
                                }
                            }
                            a = (Class269)e;
                            if (a.method834()) break block20;
                            if (!(e instanceof Class270)) {
                                return Velocity.method10322();
                            }
                            b = (Class270)e;
                            if (b.method882()) break block20;
                            if (!(e instanceof Class273)) break block21;
                            c = (Class273)e;
                            if (c.method1037()) break block20;
                        }
                        if (!(e instanceof Class274) || !(d = (Class274)e).method1074()) continue;
                    }
                    Class1450.method14313(this, (boolean)Class1450.field5525[1]);
                    continue block5;
                }
            }
        }
        var4_4 = this.field5518.iterator();
        block8: while (true) {
            if (var4_4.hasNext()) {
                v0 = 30933;
                return Class1450.method14290();
            }
            v1 = 30934;
            if (true) ** GOTO lbl44
            block9: while (true) {
                v1 = 30932;
lbl44:
                // 2 sources

                switch (v1) {
                    case 30934: {
                        continue block9;
                    }
                    case 30933: {
                        h = (Class261)var4_4.next();
                        h.method646(i, j, k);
                        continue block8;
                    }
                }
                break;
            }
            break;
        }
        return super.method_25404(i, j, k);
    }

    public boolean method_25401(double d2, double e2, double f2, double g2) {
        for (Class261 c2 : this.field5518) {
            if (field5515) {
                float a2 = (float)((double)c2.method782() + g2 * (double)Class1450.method14295().method3017());
                c2.method759(a2, c2.method762());
                continue;
            }
            float b2 = (float)((double)c2.method762() + g2 * (double)ClickGui.method2989().method3017());
            c2.method759(c2.method782(), b2);
        }
        return super.method_25401(d2, e2, f2, g2);
    }

    private static void method14294() {
        Class5836.method22897();
    }

    private static ClickGui method14295() {
        return ClickGui.method2989();
    }

    private static void method14296() {
        Class4146.method20697();
    }

    private static boolean method14297() {
        return Class3979.method19543();
    }

    public static String method14298() {
        return Class267.field350;
    }

    public Class1450(ClickGui c2) {
        super((class_2561)class_2561.method_43470((String)"ClickGui"));
        this.field5514 = c2;
        float d2 = Class830.field3644;
        Class556[] class556Array = Class556.values();
        int n2 = class556Array.length;
        for (int i2 = (int)field5525[1]; i2 < n2; ++i2) {
            Class556 b2 = class556Array[i2];
            Class261 a2 = new Class261(b2, d2, 15.0f);
            this.field5518.add(a2);
            d2 += a2.method788() + 2.0f;
        }
    }

    private static boolean method14299() {
        return Class1807.method15753();
    }

    private static boolean method14300(double d2, double d3, double d4) {
        return Class5659.method22150(d2, d3, d4);
    }

    private static boolean method14301(Class248 class248) {
        return class248.method503();
    }

    public List method14302() {
        return Class1450.method14320(this);
    }

    public static Class6283 method14303(Class1450 class1450) {
        return class1450.field5523;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method_25402(double b2, double c2, int d2) {
        block4: {
            block5: {
                block3: {
                    if (d2 == 0) break block3;
                    if (d2 != (int)field5525[0]) break block4;
                    break block5;
                }
                field5521 = (int)field5525[0];
                field5522 = (int)field5525[0];
                break block4;
            }
            field5517 = (int)field5525[0];
            field5526 = (int)field5525[0];
        }
        Iterator iterator = this.field5518.iterator();
        int n2 = iterator.hasNext() ? 61660 : 61661;
        while (true) {
            int n3;
            if ((n3 = n2) == 61660) {
                Class261 a2 = (Class261)iterator.next();
                a2.method649(b2, c2, d2);
                return Class4196.method20801();
            }
            if (n3 != 61661) {
                return super.method_25402(b2, c2, d2);
            }
            n2 = 61659;
        }
    }

    private static boolean method14304() {
        return Class1807.method15753();
    }

    public boolean method_25422() {
        return this.field5524;
    }

    private static float method14305() {
        return Class1450.method14288();
    }

    private static boolean method14306() {
        return Replenish.method6431();
    }

    private static boolean method14307(double d2) {
        return Class5659.method22193(d2);
    }

    private static ClickGui method14308() {
        return ClickGui.method2989();
    }

    private static boolean method14309() {
        return Class3979.method19544();
    }

    private void method14310(class_332 a2) {
        int b2 = ClickGui.method2989().method2990((int)field5525[6]);
        Class6454.method24667(a2.method_51448(), 0.0, 0.0, a2.method_51421(), a2.method_51443(), b2);
        float c2 = ClickGui.method2989().method2985();
        if (c2 == 1.0f) {
            return;
        }
        a2.method_51448().method_46416((float)a2.method_51443(), (float)a2.method_51443() / 2.0f, 0.0f);
        float d2 = c2 * 0.2f;
        a2.method_51448().method_22905(0.8f + d2, Class4034.field9290 + d2, 0.0f);
        a2.method_51448().method_46416((float)(~(a2.method_51443() - 1)), (float)(~a2.method_51443() + 1) / 2.0f, 0.0f);
    }

    private static boolean method14311(double d2) {
        return Class5659.method22193(d2);
    }

    private static boolean method14312() {
        return Velocity.method10322();
    }

    private static void method14313(Class1450 class1450, boolean bl2) {
        Class1450.method14286(class1450, bl2);
    }

    public void method_25394(class_332 h2, int i2, int j2, float k2) {
        if (Class1450.method14308().method3005()) {
            Class4122.field9561.field_1773.method_57796(k2);
            Class4122.field9561.method_1522().method_1235((boolean)field5525[1]);
        }
        h2.method_51448().method_22903();
        this.method14310(h2);
        int l2 = (int)field5525[1];
        block0: for (Class261 c2 : this.field5518) {
            if (c2.method740(i2, j2)) {
                if (field5522 && Class1450.method14331(this)) {
                    c2.method729((boolean)field5525[0]);
                }
            }
            c2.method707(h2, i2, j2, k2);
            for (Class276 b2 : c2.method663()) {
                if (ClickGui.method2989().method3019() && Class1450.method14298() != null && !Class1450.method14316(b2).method446().toLowerCase().contains(Class1450.method14323().toLowerCase())) continue;
                if (b2.method740(i2, j2) && !b2.method1228().method1253().isEmpty()) {
                    this.field5519 = b2.method1228().method1253();
                    l2 = (int)field5525[0];
                    continue block0;
                }
                if (!Class1450.method14324(b2)) continue;
                for (Class268 a2 : b2.method1164()) {
                    if (!Class1450.method14301(a2.method826()) || a2.method826().method504().isEmpty()) continue;
                    Chams.method1924();
                    return;
                }
                Class6009.method23560();
                return;
            }
        }
        h2.method_51448().method_22909();
        if (Class1450.method14289(ClickGui.method2989())) {
            Class1450.method14326(this.field5523, l2 != 0);
            if (this.field5523.method24281() > Class3810.field8619) {
                h2.method_51448().method_22905(1.0f, 1.0f, 0.0f);
                float d2 = 1.0f / Class1450.method14305();
                int e2 = Class6454.method24719(Class1450.method14322(this));
                int f2 = (int)(60.0 * Class1450.method14303(this).method24281());
                int g2 = ClickGui.method2989().method2990(new Color((int)field5525[1], (int)field5525[1], (int)field5525[1], (int)field5525[2] + f2).getRGB());
                Class6454.method24667(h2.method_51448(), ((float)i2 + 10.0f) * d2, ((float)j2 - 8.0f) * d2, (float)e2 + 4.0f, ((float)Class1450.method14329() + 2.0f) * d2, g2);
                Class6454.method24624(h2, this.field5519, ((float)i2 + 12.0f) * d2, ((float)j2 - 6.0f) * d2, Class1450.method14340((int)field5525[3], (float)this.field5523.method24281()));
                h2.method_51448().method_22905(d2, d2, 0.0f);
            }
        }
        field5521 = (int)field5525[1];
        Class1450.method14293((boolean)field5525[1]);
        field5516 = i2;
        field5527 = j2;
    }

    private static boolean method14314(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Class803.method12224(d2, d3, d4, d5, d6, d7);
    }

    private static boolean method14315() {
        return Class3979.method19551();
    }

    private static Class277 method14316(Class276 class276) {
        return class276.method1228();
    }

    private static void method14317(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method14318() {
        Class5836.method22885();
    }

    public static String method14319() {
        return Class267.field350;
    }

    public static List method14320(Class1450 class1450) {
        return class1450.field5518;
    }

    private static int method14321(int n2, int n3, Class601 class601, Zoom class409) {
        return Class6435.method24552(n2, n3, class601, class409);
    }

    public static String method14322(Class1450 class1450) {
        return class1450.field5519;
    }

    private static String method14323() {
        return Class1450.method14319();
    }

    private static boolean method14324(Class276 class276) {
        return class276.method1169();
    }

    private static boolean method14325(int n2) {
        return Class4196.method20803(n2);
    }

    public boolean method_25421() {
        return (int)field5525[1] != 0;
    }

    private static void method14326(Class6283 class6283, boolean bl2) {
        class6283.method24284(bl2);
    }

    private static void method14327(long l2) {
        Class1450.field5525[0] = l2 ^ 0x8C29F4534B2D8CA5L;
        Class1450.field5525[4] = l2 ^ 0x8C29F4534B2D8D86L;
        Class1450.field5525[6] = l2 ^ 0x8C29F4532D2D8CA4L;
        Class1450.field5525[3] = l2 ^ 0x73D60BACB4D2735BL;
        Class1450.field5525[2] = l2 ^ 0x8C29F4534B2D8C96L;
        Class1450.field5525[5] = l2 ^ 0x8C29F4534B2D8DF0L;
        Class1450.field5525[1] = l2 ^ 0x8C29F4534B2D8CA4L;
    }

    private static void method14328() {
        Class4146.method20697();
    }

    private static int method14329() {
        return Class6454.method24637();
    }

    public boolean method_25400(char b2, int c2) {
        for (Class261 a2 : this.field5518) {
            a2.method727(b2, c2);
        }
        return super.method_25400(b2, c2);
    }

    private static boolean method14330(int n2) {
        return Class4196.method20803(n2);
    }

    private static boolean method14331(Class1450 class1450) {
        return class1450.method14334();
    }

    private static boolean method14332(double d2) {
        return Class5659.method22193(d2);
    }

    public static void method14333(boolean bl2) {
        field5517 = bl2;
    }

    private boolean method14334() {
        for (Class261 a2 : this.field5518) {
            if (!a2.method668()) continue;
            return (int)field5525[1] != 0;
        }
        return (int)field5525[0] != 0;
    }

    private static boolean method14335() {
        return Class3979.method19539();
    }

    private static boolean method14336() {
        return Class4196.method20801();
    }

    private static boolean method14337() {
        return Class1807.method15742();
    }

    private static boolean method14338() {
        return Velocity.method10322();
    }

    static {
        field5525 = new long[7];
        Class1450.method14327(-8346871795773764444L);
        field5520 = new Class5473();
    }

    private static boolean method14339() {
        return Velocity.method10322();
    }

    public void method_25419() {
        this.field5514.method1268();
        field5521 = (int)field5525[1];
        field5522 = (int)field5525[1];
        Class1450.method14333((boolean)field5525[1]);
        field5526 = (int)field5525[1];
        super.method_25419();
    }

    private static int method14340(int n2, float f2) {
        return Class4045.method20090(n2, f2);
    }

    private static boolean method14341() {
        return Class3979.method19544();
    }

    private static void method14342() {
        Class1745.method15538();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

