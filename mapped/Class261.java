/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.minecraft.client.gui.DrawContext
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mapped.Class1074;
import mapped.Class1110;
import mapped.Class1197;
import mapped.Class124;
import mapped.Class1415;
import mapped.Class1450;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class245;
import mapped.Class262;
import mapped.Class267;
import mapped.Class268;
import mapped.Class271;
import mapped.Class273;
import mapped.Class276;
import mapped.Class277;
import mapped.AutoArmor;
import mapped.Chams;
import mapped.PacketFly;
import mapped.Swing;
import mapped.ClickGui;
import mapped.Class3432;
import mapped.Class3471;
import mapped.Class3549;
import mapped.Blink;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4244;
import mapped.Class489;
import mapped.Class5497;
import mapped.Class5545;
import mapped.Class556;
import mapped.Class5587;
import mapped.Class5659;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class5859;
import mapped.Class6009;
import mapped.Class6044;
import mapped.Class6126;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6344;
import mapped.Class6418;
import mapped.Class6454;
import mapped.Class694;
import mapped.Class749;
import net.minecraft.client.gui.DrawContext;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class261
extends Class262
implements Class245 {
    private boolean field324;
    private float field325;
    private final Class556 field326;
    private float field327;
    private final String field328;
    private boolean field329;
    private final List field330 = new CopyOnWriteArrayList();
    private Class267 field331;
    private static long[] field332;
    private final Class6283 field333 = new Class6283((boolean)field332[0], 200.0f, Class489.field2551);
    public static boolean $skidonion$998554961;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method646(int b2, int c2, int d2) {
        super.method646(b2, c2, d2);
        if (this.method682()) {
            for (Class276 a2 : this.field330) {
                int n2 = ClickGui.method2989().method3019() ? 31013 : 31014;
                block9: while (true) {
                    switch (n2) {
                        case 31014: {
                            n2 = 31012;
                            continue block9;
                        }
                        case 31013: {
                            if (Class267.field350 != null) {
                                int n3 = 6609;
                                Class1668.method15147(1784090748, 1092298214, -1048623468, 1550374134);
                                return;
                            }
                            int n4 = 6610;
                            block10: while (true) {
                                switch (n4) {
                                    case 6610: {
                                        n4 = 6608;
                                        continue block10;
                                    }
                                    case 6609: {
                                        if (a2.method1228().method446().toLowerCase().contains(Class267.field350.toLowerCase())) break block10;
                                        while (true) {
                                            // Infinite loop
                                        }
                                    }
                                }
                                break;
                            }
                            break block9;
                        }
                    }
                    break;
                }
                a2.method646(b2, c2, d2);
            }
        }
        if (this.field331 != null) {
            this.field331.method646(b2, c2, d2);
        }
    }

    private static int method647(int n2, int n3, Class124 class124, Class694 class694) {
        return Class1110.method12923(n2, n3, class124, class694);
    }

    private static boolean method648(double d2) {
        return Class5659.method22193(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method649(double b2, double c2, int d2) {
        block10: {
            Iterator iterator;
            block11: {
                int n2;
                block9: {
                    block8: {
                        super.method649(b2, c2, d2);
                        if (d2 != (int)field332[1] || !this.method744(b2, c2)) break block8;
                        if (!Class261.method706(this)) {
                            int n3 = 17647;
                            Class1745.method15538();
                            return;
                        }
                        break block9;
                    }
                    if (!this.method682()) break block10;
                    iterator = this.field330.iterator();
                    break block11;
                }
                int n4 = 17648;
                block4: while (true) {
                    switch (n4) {
                        case 17648: {
                            n4 = 17646;
                            continue block4;
                        }
                        case 17647: {
                            n2 = (int)field332[1];
                            break block4;
                        }
                        default: {
                            n2 = (int)field332[0];
                        }
                    }
                    break;
                }
                this.field324 = n2;
                Class261.method695(this.field333, this.field324);
                if (!ClickGui.method2989().method3011()) break block10;
                Class5723.field11041.method22448(Class5693.field10948);
                break block10;
            }
            while (iterator.hasNext()) {
                Class276 a2 = (Class276)iterator.next();
                if (Class261.method708(ClickGui.method2989()) && Class267.field350 != null && !a2.method1228().method446().toLowerCase().contains(Class261.method716().toLowerCase())) continue;
                a2.method649(b2, c2, d2);
            }
        }
        if (this.field331 != null) {
            this.field331.method649(b2, c2, d2);
        }
    }

    private static float method650(Class271 class271) {
        return class271.method901();
    }

    private static void method651(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method652() {
        Class1503.method14420();
    }

    public boolean method653(float a2, float b2) {
        return this.method750(a2, b2, this.field340, this.field337, this.field341 * 1.0f, this.method691());
    }

    public Class261(Class556 a2, float b2, float c2) {
        this(a2, b2, c2, 97.0f, 15.0f);
    }

    public void method654(float a2) {
        this.field325 += a2;
        this.field327 = Class261.method723(this) + a2;
    }

    public static Class267 method655(Class261 class261) {
        return class261.field331;
    }

    private static void method656(Class6283 class6283, boolean bl2) {
        class6283.method24284(bl2);
    }

    private static int method657(int n2, int n3, Swing class309, Class4244 class4244) {
        return Class1110.method12948(n2, n3, class309, class4244);
    }

    private static ClickGui method658() {
        return ClickGui.method2989();
    }

    public static String method659() {
        return Class267.field350;
    }

    private static void method660() {
        Chams.method1924();
    }

    private static void method661() {
        Class4146.method20697();
    }

    private static boolean method662() {
        return Class5659.method22194();
    }

    public List method663() {
        return this.field330;
    }

    public static void method664(Class261 class261, boolean bl2) {
        class261.field324 = bl2;
    }

    private static int method665(int n2, int n3, Class5723 class5723, Class3432 class3432) {
        return Class1110.method12921(n2, n3, class5723, class3432);
    }

    private static void method666(Class261 class261, boolean bl2) {
        Class261.method664(class261, bl2);
    }

    public static float method667() {
        return 1.0f;
    }

    public boolean method668() {
        return Class261.method674(this);
    }

    private static void method669(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static void method670() {
        Class1503.method14420();
    }

    private static void method671(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public native Class261 method672(JsonObject var1);

    private static void method673(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static boolean method674(Class261 class261) {
        return class261.field329;
    }

    private static double method675(Class6283 class6283) {
        return class6283.method24281();
    }

    private static void method676() {
        Class6009.method23561();
    }

    private static float method677(Class271 class271) {
        return class271.method911();
    }

    public static float method678() {
        return 1.0f;
    }

    private static float method679(Class276 class276) {
        return class276.method1176();
    }

    private static int method680(int n2, int n3, Class1197 class1197, Class5859 class5859) {
        return Class1110.method12959(n2, n3, class1197, class5859);
    }

    private static boolean method681() {
        return Class3979.method19539();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method682() {
        int n2;
        int n3 = this.field324 ? 58765 : 58766;
        block4: while (true) {
            switch (n3) {
                case 58766: {
                    n3 = 58764;
                    continue block4;
                }
                case 58765: {
                    if (!(this.field333.method24281() > (double)0.1f)) break block4;
                    n2 = (int)field332[1];
                    return n2 != 0;
                }
            }
            break;
        }
        n2 = (int)field332[0];
        return n2 != 0;
    }

    public static int method683() {
        return Class1450.field5516;
    }

    private static void method684(long l2) {
        Class261.field332[0] = l2 ^ 0xB6022B2635EACAADL;
        Class261.field332[1] = l2 ^ 0xB6022B2635EACAACL;
        Class261.field332[2] = l2 ^ 0x49FDD4D9CA153552L;
    }

    private static void method685() {
        Chams.method1924();
    }

    static {
        ___.___(46, Class261.class);
        ____.___46_570(Class261.class);
    }

    private static void method686() {
        Class1503.method14420();
    }

    public static float method687() {
        return 1.0f;
    }

    private static void method688() {
        Chams.method1924();
    }

    private static void method689(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method690(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public float method691() {
        return this.field339 * 1.0f + this.field334;
    }

    private static void method692(Class267 class267, char c2, int n2) {
        class267.method727(c2, n2);
    }

    public static Class267 method693(Class261 class261) {
        return class261.field331;
    }

    public static void method694(Class261 class261, float f2) {
        class261.field327 = f2;
    }

    private static void method695(Class6283 class6283, boolean bl2) {
        class6283.method24284(bl2);
    }

    public static String method696() {
        return Class267.field350;
    }

    public static float method697() {
        return 1.0f;
    }

    public void method698(boolean a2) {
        Class261.method666(this, a2);
        Class261.method656(this.field333, a2);
    }

    private static void method699(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method700() {
        Class5659.method22184();
    }

    public static String method701() {
        return Class267.field350;
    }

    private static void method702(Class261 class261, float f2) {
        Class261.method694(class261, f2);
    }

    private static String method703() {
        return Class261.method659();
    }

    public Class556 method704() {
        return this.field326;
    }

    private static void method705() {
        Class5836.method22897();
    }

    public static boolean method706(Class261 class261) {
        return class261.field324;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void method707(class_332 k, float l, float m, float n) {
        block26: {
            block27: {
                this.method753((float)Class261.method709() + 6.0f);
                if (this.field329) {
                    this.field340 += (float)Class261.method683() - this.field336;
                    this.field337 += (float)Class1450.field5527 - this.field335;
                }
                this.field334 = 1.0f;
                if (this.field331 != null) {
                    this.field334 += this.field331.method778() + ClickGui.method2989().method3018() * Class261.method697();
                }
                for (Class276 d : this.field330) {
                    if (ClickGui.method2989().method3019() && Class267.field350 != null && !d.method1228().method446().toLowerCase().contains(Class267.field350.toLowerCase())) continue;
                    this.field334 += d.method778() + 0.5f;
                    if (d.method1176() < 0.01f) continue;
                    this.field334 += 2.0f * Class261.method687() * d.method1176();
                    for (Class268 c : d.method1164()) {
                        block25: {
                            if (!c.method826().method503()) continue;
                            this.field334 += c.method778() * Class261.method679(d);
                            if (c instanceof Class273 && (a = (Class273)c).method1064() > 0.01f) {
                                this.field334 += a.method1067() * Class261.method720(a) * d.method1176();
                                continue;
                            }
                            if (!(c instanceof Class271)) break block25;
                            v0 = 48823;
                            ** GOTO lbl27
                        }
                        v0 = 48824;
                        if (true) ** GOTO lbl27
                        block14: while (true) {
                            v0 = 48822;
lbl27:
                            // 3 sources

                            switch (v0) {
                                case 48824: {
                                    continue block14;
                                }
                                case 48823: {
                                    b = (Class271)c;
                                    if (!(b.method911() > 0.01f)) ** GOTO lbl35
                                    v1 = 26355;
                                    ** GOTO lbl39
lbl35:
                                    // 1 sources

                                    v1 = 26356;
                                    if (true) ** GOTO lbl39
                                    block15: while (true) {
                                        v1 = 26354;
lbl39:
                                        // 3 sources

                                        switch (v1) {
                                            case 26356: {
                                                continue block15;
                                            }
                                            case 26355: {
                                                this.field334 += Class261.method650(b) * Class261.method677(b) * d.method1176();
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                o = Class261.method658().method2997(1.7f);
                this.method742(k, o);
                p = (int)Class261.field332[2];
                this.method771(k, this.field328, this.field340 + 3.0f, this.field337 + Class6126.field12387 * 1.0f, p);
                if (!(Class261.method715(this).method24281() > Class749.field3389)) break block26;
                f = ClickGui.method2989().method2998();
                g = this.field337;
                if (this.field331 != null) {
                    g += Class261.method693(this).method778() + ClickGui.method2989().method3018() * 1.0f;
                }
                if (f) {
                    this.method737(this.field340, this.field337 + this.field339 * 1.0f, this.field340 + this.field341 * 1.0f, (double)(this.field337 + 1.0f * this.field339) + (double)this.field334 * Class261.method675(this.field333));
                }
                h = ClickGui.method2989().method2990(ClickGui.method2989().method3004().getRGB());
                i = Class261.method726() * this.field339;
                j = this.field341 * 1.0f;
                this.method763(k, this.field340, (double)this.field337 + i, this.field341 * Class261.method678(), this.field334, h);
                this.method763(k, (double)this.field340 + j - 0.5, (double)this.field337 + i, Class5497.field10325, this.field334, o);
                this.method763(k, this.field340, (double)this.field337 + i, 0.5, this.field334, o);
                this.method763(k, (double)this.field340 + 0.5, (double)this.field337 + i + (double)this.field334 - 0.5, j - 1.0, Class1415.field5439, o);
                if (this.field331 != null) {
                    this.field331.method798(k, this.field340 + 1.0f, this.field337 + this.field339 * 1.0f + 2.0f, l, m, n);
                }
                this.field327 = this.field325 = g + this.field339 * 1.0f - Class5545.field10496;
                for (Class276 e : this.field330) {
                    if (Class261.method725(ClickGui.method2989())) {
                        if (Class267.field350 != null && !e.method1228().method446().toLowerCase().contains(Class261.method731().toLowerCase())) continue;
                    }
                    e.method1209(k, this.field340 + 1.0f, this.field327 + 1.0f, l, m, n);
                    this.field325 += (float)((double)(e.method778() + 0.5f) * this.field333.method24281());
                    v2 = this;
                    Class261.method702(v2, v2.field327 + (e.method778() + Class6344.field13074));
                }
                if (!f) break block27;
                v3 = 31066;
                if (true) ** GOTO lbl84
            }
            v4 = 31067;
            Chams.method1924();
            return;
            block17: while (true) {
                v3 = 31065;
lbl84:
                // 2 sources

                switch (v3) {
                    case 31067: {
                        continue block17;
                    }
                    case 31066: {
                        this.method758();
                    }
                }
                break;
            }
        }
        this.field336 = Class1450.field5516;
        this.field335 = Class1450.field5527;
    }

    private static boolean method708(ClickGui class333) {
        return class333.method3019();
    }

    public Class261(Class556 b2, float c2, float d2, float e2, float f2) {
        super(c2, d2, e2, f2);
        this.field326 = b2;
        this.field328 = Class5587.method21919(b2);
        for (Class277 a2 : Class5723.field11055.method20679()) {
            if (a2.method1247() != b2) continue;
            this.field330.add(new Class276(a2, this, c2, d2));
        }
        if (b2 == Class556.field2757) {
            this.field331 = new Class267(this, c2, d2);
        }
        this.method698((boolean)field332[1]);
    }

    private static int method709() {
        return Class6454.method24637();
    }

    private static boolean method710() {
        return Class1807.method15753();
    }

    private static boolean method711() {
        return Blink.method4987();
    }

    private static void method712(long l2) {
        Class261.method684(l2);
    }

    public Class267 method713() {
        return this.field331;
    }

    private static void method714() {
        Class1807.method15744();
    }

    public static Class6283 method715(Class261 class261) {
        return class261.field333;
    }

    public static String method716() {
        return Class267.field350;
    }

    private static int method717(int n2, int n3, PacketFly class305, Class694 class694) {
        return Class1110.method12954(n2, n3, class305, class694);
    }

    private static ClickGui method718() {
        return ClickGui.method2989();
    }

    private static void method719() {
        Class1745.method15538();
    }

    private static float method720(Class273 class273) {
        return class273.method1064();
    }

    private static void method721() {
        Class1807.method15744();
    }

    @Override
    public void method722(double b2, double c2, int d2) {
        super.method722(b2, c2, d2);
        this.field329 = (int)field332[0];
        if (this.method682()) {
            for (Class276 a2 : this.field330) {
                if (Class261.method718().method3019()) {
                    if (Class267.field350 != null) {
                        if (!a2.method1228().method446().toLowerCase().contains(Class261.method703().toLowerCase())) continue;
                        Class5659.method22184();
                        return;
                    }
                }
                a2.method722(b2, c2, d2);
            }
        }
        if (this.field331 != null) {
            this.field331.method722(b2, c2, d2);
        }
    }

    public static float method723(Class261 class261) {
        return class261.field327;
    }

    public static String method724() {
        return Class267.field350;
    }

    private static boolean method725(ClickGui class333) {
        return class333.method3019();
    }

    private static float method726() {
        return Class261.method667();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method727(char b2, int c2) {
        super.method727(b2, c2);
        if (this.method682()) {
            for (Class276 a2 : this.field330) {
                if (ClickGui.method2989().method3019() && Class261.method696() != null) {
                    if (a2.method1228().method446().toLowerCase().contains(Class261.method724().toLowerCase())) {
                        int n2 = 47698;
                        Class5836.method22907(0.55431694f);
                        return;
                    }
                    int n3 = 47697;
                    block5: while (true) {
                        switch (n3) {
                            case 47698: {
                                n3 = 47696;
                                continue block5;
                            }
                            case 47697: {
                                Class4036.method20085(0.38782477f, Class1074.field4377, Class3549.field7863, 0.7361631f, Class3471.field7603, Class6044.field12139);
                                return;
                            }
                        }
                        break;
                    }
                }
                a2.method727(b2, c2);
            }
        }
        if (this.field331 != null) {
            Class261.method692(Class261.method655(this), b2, c2);
        }
    }

    private static void method728(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    public void method729(boolean a2) {
        this.field329 = a2;
    }

    @Override
    public native Object method482(JsonObject var1);

    @Override
    public JsonObject method438() {
        JsonObject a2 = new JsonObject();
        a2.addProperty("category", Class261.method730(this).name());
        a2.addProperty("x", (Number)Float.valueOf(this.method782()));
        a2.addProperty("y", (Number)Float.valueOf(this.method762()));
        a2.addProperty("open", Boolean.valueOf(this.method682()));
        return a2;
    }

    public static Class556 method730(Class261 class261) {
        return class261.field326;
    }

    private static String method731() {
        return Class261.method701();
    }

    private static int method732(int n2, int n3, AutoArmor class279, Class6418 class6418) {
        return Class1110.method12932(n2, n3, class279, class6418);
    }

    private static void method733() {
        Class6454.method24594();
    }

    private static native Object 1(char var0);
}

