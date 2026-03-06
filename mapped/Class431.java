/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package mapped;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import mapped.Class1;
import mapped.Class1011;
import mapped.Class116;
import mapped.Class121;
import mapped.Class148;
import mapped.Class1498;
import mapped.Class1503;
import mapped.Class152;
import mapped.Class1639;
import mapped.Class1668;
import mapped.Class1689;
import mapped.Class174;
import mapped.Class178;
import mapped.Class1807;
import mapped.Class210;
import mapped.Class222;
import mapped.Class242;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class260;
import mapped.Class298;
import mapped.Class319;
import mapped.Class3691;
import mapped.Class3850;
import mapped.Class3876;
import mapped.Class3923;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class408;
import mapped.Class4146;
import mapped.Class4196;
import mapped.Class427;
import mapped.Class443;
import mapped.Class447;
import mapped.Class457;
import mapped.Class486;
import mapped.Class544;
import mapped.Class5550;
import mapped.Class556;
import mapped.Class557;
import mapped.Class5659;
import mapped.Class572;
import mapped.Class5723;
import mapped.Class5760;
import mapped.Class5836;
import mapped.Class587;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6134;
import mapped.Class6259;
import mapped.Class6283;
import mapped.Class6286;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class894;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class431
extends Class427 {
    Class248 field1992;
    Class248 field1993;
    Class248 field1994;
    private Class3691 field1995;
    Class248 field1996;
    Class248 field1997;
    Class248 field1998;
    private final Map field1999 = new HashMap();
    private static long[] field2000 = new long[8];
    Class248 field2001;
    private int field2002;
    private float[] field2003;
    Class248 field2004;
    private Class3691 field2005;
    Class248 field2006;
    Class248 field2007 = this.method450(new Class253("RotateHold", "Holds rotations to scaffold blocks", (boolean)field2000[2], this::method1269));
    Class248 field2008 = this.method450(new Class253("Grim", "Uses grim interactions", (boolean)field2000[2]));

    private static void method8754(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static class_746 method8755(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method8756() {
        Class6009.method23560();
    }

    private static void method8757(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method8758() {
        Class5659.method22184();
    }

    private boolean method8759(class_2248 a2) {
        int n2;
        block5: {
            block4: {
                block3: {
                    block2: {
                        int n3 = ((Class544)((Object)Class431.method8804(this.field1993))).ordinal();
                        if (n3 == 0) break block2;
                        if (n3 == 1) break block3;
                        if (n3 != 2) {
                            throw new MatchException(null, null);
                        }
                        break block4;
                    }
                    n2 = Class431.method8787((Class257)this.field2006, a2);
                    break block5;
                }
                if (Class431.method8769((Class257)this.field1996, a2)) {
                    return Class408.method6431();
                }
                int n3 = (int)field2000[0];
                return Class447.method10252();
            }
            n2 = (int)field2000[0];
        }
        return n2 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method8760() {
        int n2;
        if (!((Boolean)this.field2008.method507()).booleanValue() && !((Boolean)this.field1994.method507()).booleanValue()) {
            n2 = (int)field2000[2];
            return n2 != 0;
        }
        n2 = (int)field2000[0];
        return n2 != 0;
    }

    private static void method8761() {
        Class5836.method22890();
    }

    public static class_315 method8762(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static Color method8763(Class457 class457, int n2) {
        return class457.method10618(n2);
    }

    private static Map method8764(Class431 class431) {
        return Class431.method8788(class431);
    }

    public static class_315 method8765(class_310 class_3102) {
        return class_3102.field_1690;
    }

    public static Class3850 method8766() {
        return Class5723.field11058;
    }

    public static class_304 method8767(class_315 class_3152) {
        return class_3152.field_1849;
    }

    private static void method8768() {
        Class6009.method23560();
    }

    @Override
    protected void method1279() {
        if (Class431.method8755(field290) != null) {
            Class5723.field11058.method18916();
        }
        this.field2002 = (int)field2000[6];
        this.field2003 = null;
        this.field1995 = null;
        this.field2005 = null;
        this.field1999.clear();
    }

    static {
        Class431.method8828(-8885340399454484030L);
    }

    private static boolean method8769(Class257 class257, Object object) {
        return class257.method600(object);
    }

    public static void method8770(Class431 class431, Class3691 class3691) {
        class431.field1995 = class3691;
    }

    private static void method8771() {
        Class6454.method24594();
    }

    private static int method8772(int n2, int n3, Class178 class178, Class121 class121) {
        return Class3876.method19128(n2, n3, class178, class121);
    }

    private static int method8773(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static Class457 method8774() {
        return Class457.method10620();
    }

    public static Class3850 method8775() {
        return Class5723.field11058;
    }

    private static Object method8776(Class248 class248) {
        return class248.method507();
    }

    private static void method8777(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static boolean method8778() {
        return Class5659.method22194();
    }

    private static void method8779() {
        Class298.method1924();
    }

    private void method8780(boolean b2, float[] c2) {
        if (((Boolean)Class431.method8776(this.field1954)).booleanValue()) {
            float[] a2 = this.field1995.method18156();
            if (a2 == null) {
                return;
            }
            this.field2003 = a2;
            if (b2) {
                if (((Boolean)Class431.method8824(this.field2008)).booleanValue()) {
                    Class1503.method14417(a2[(int)field2000[2]], a2[(int)field2000[0]]);
                } else {
                    this.method6465(a2[(int)field2000[2]], a2[(int)field2000[0]]);
                }
            } else {
                Class1503.method14420();
            }
        }
    }

    private static int method8781(int n2, int n3, Class116 class116, Class587 class587) {
        return Class3876.method19167(n2, n3, class116, class587);
    }

    public static class_315 method8782(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static void method8783() {
        Class298.method1924();
    }

    private static class_4587 method8784(Class59 class59) {
        return class59.method125();
    }

    private static void method8785() {
        Class4146.method20694();
    }

    private static int method8786(int n2, int n3, Class894 class894, Class319 class319) {
        return Class3876.method19134(n2, n3, class894, class319);
    }

    private static boolean method8787(Class257 class257, Object object) {
        return class257.method600(object);
    }

    public static Map method8788(Class431 class431) {
        return class431.field1999;
    }

    private Boolean method1269() {
        return (Boolean)this.field1954.method507();
    }

    private static boolean method8789() {
        return Class1807.method15753();
    }

    private static class_315 method8790(class_310 class_3102) {
        return Class431.method8782(class_3102);
    }

    private static int method8791(int n2, int n3, Class6259 class6259, Class5760 class5760) {
        return Class3876.method19088(n2, n3, class6259, class5760);
    }

    public static Map method8792(Class431 class431) {
        return class431.field1999;
    }

    private static void method8793() {
        Class6009.method23561();
    }

    public static class_638 method8794(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static void method8795() {
        Class3979.method19561();
    }

    private void method8796(Class3691 a2) {
        class_2338 b2 = a2.method18157().method_17777();
        class_2350 c2 = a2.method18157().method_17780();
        class_243 d2 = b2.method_46558().method_1031((double)((float)c2.method_10148() * Class1689.field6266), (double)((float)c2.method_10164() * 0.5f), (double)((float)c2.method_10165() * 0.5f));
        a2.method18153(Class1503.method14416(Class431.field290.field_1724.method_33571(), d2));
        a2.method18151(new class_3965(d2, c2, b2, (boolean)field2000[2]));
    }

    /*
     * Exception decompiling
     */
    @Class1
    public void method8797(Class210 d) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static int method8798(int n2, int n3, Class242 class242, Class222 class222) {
        return Class3876.method19160(n2, n3, class242, class222);
    }

    private static float[] method8799(Class3691 class3691) {
        return class3691.method18156();
    }

    private static void method8800() {
        Class5836.method22885();
    }

    public static class_746 method8801(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object method8802(Class248 class248) {
        return class248.method507();
    }

    private static void method8803(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    private static Object method8804(Class248 class248) {
        return class248.method507();
    }

    private static double method8805(class_243 class_2432) {
        return Class431.method8848(class_2432);
    }

    private static int method8806(int n2, int n3, Class174 class174, Class5659 class5659) {
        return Class3876.method19150(n2, n3, class174, class5659);
    }

    private static int method8807(int n2, int n3, Class148 class148, Class572 class572) {
        return Class3876.method19127(n2, n3, class148, class572);
    }

    private static boolean method8808(Class1011 class1011, class_2338 class_23382, int n2, boolean bl2, boolean bl3, boolean bl4, Class6134 class6134) {
        return class1011.method12794(class_23382, n2, bl2, bl3, bl4, class6134);
    }

    private Boolean method1278() {
        return ((Boolean)Class431.method8820(this.field1994) == false ? (int)field2000[0] : (int)field2000[2]) != 0;
    }

    private static int method8809(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static int method8810(int n2, int n3, Class443 class443, Class152 class152) {
        return Class3876.method19123(n2, n3, class443, class152);
    }

    public class_2338 method8811(double a2, double b2, double c2) {
        int d2 = class_3532.method_15357((double)a2);
        int e2 = (int)Math.round(b2);
        int f2 = class_3532.method_15357((double)c2);
        return new class_2338(d2, e2, f2);
    }

    private static void method8812() {
        Class1503.method14420();
    }

    public static class_304 method8813(class_315 class_3152) {
        return class_3152.field_1881;
    }

    private static Object method8814(Class248 class248) {
        return class248.method507();
    }

    private static int method8815() {
        return Class5550.method21885();
    }

    private static Object method8816(Class248 class248) {
        return class248.method507();
    }

    private static void method8817() {
        Class4146.method20697();
    }

    private static void method8818() {
        Class298.method1924();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Class3691 method8819(boolean g2) {
        int n2;
        int h2 = (int)Math.round(Class431.method8801(field290).method_23318()) - (int)field2000[0];
        if (((Boolean)Class431.method8814(this.field2004)).booleanValue() && Class1807.method15742()) {
            int n3 = !Class431.method8850(field290).method_24828() ? 48204 : 48205;
            block4: while (true) {
                switch (n3) {
                    case 48205: {
                        n3 = 48203;
                        continue block4;
                    }
                    case 48204: {
                        if (this.field2002 != (int)field2000[6]) break block4;
                    }
                    default: {
                        this.field2002 = (int)Math.floor(Class431.field290.field_1724.method_23318()) - (int)field2000[0];
                    }
                }
                break;
            }
            h2 = this.field2002;
        }
        class_2338 i2 = this.method8811(Class431.field290.field_1724.method_23317(), h2, Class431.field290.field_1724.method_23321());
        if (!g2) {
            if (!Class431.field290.field_1687.method_8320(i2).method_45474()) return null;
        }
        class_2350[] class_2350Array = class_2350.values();
        int n4 = class_2350Array.length;
        for (n2 = (int)field2000[2]; n2 < n4; ++n2) {
            class_2350 b2 = class_2350Array[n2];
            class_2338 a2 = i2.method_10093(b2);
            if (Class431.method8794(field290).method_8320(a2).method_45474()) continue;
            return Class3691.method18152(a2, b2.method_10153());
        }
        class_2350Array = class_2350.values();
        n4 = class_2350Array.length;
        n2 = (int)field2000[2];
        while (n2 < n4) {
            class_2350[] class_2350Array2;
            int n5;
            int n6;
            class_2350 f2 = class_2350Array[n2];
            class_2338 e2 = i2.method_10093(f2);
            if (Class431.field290.field_1687.method_8320(e2).method_45474() && (n6 = (int)field2000[2]) < (n5 = (class_2350Array2 = class_2350.values()).length)) {
                class_2350 d2 = class_2350Array2[n6];
                class_2338 c2 = e2.method_10093(d2);
                if (!Class431.field290.field_1687.method_8320(c2).method_45474()) {
                    return Class3691.method18152(c2, d2.method_10153());
                }
                Class431.method8758();
                return null;
            }
            ++n2;
        }
        return null;
    }

    private static Object method8820(Class248 class248) {
        return class248.method507();
    }

    public static class_304 method8821(class_315 class_3152) {
        return class_3152.field_1913;
    }

    private static int method8822(int n2, int n3, Class6286 class6286, Class1011 class1011) {
        return Class3876.method19133(n2, n3, class6286, class1011);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method8823(Class59 g2) {
        if (((Boolean)this.field2001.method507()).booleanValue()) {
            int n2;
            Class6009.method23560();
            for (Map.Entry e2 : Class431.method8792(this).entrySet()) {
                ((Class6283)e2.getValue()).method24284((boolean)field2000[2]);
                int a2 = (int)(Class1498.field5648 * ((Class6283)e2.getValue()).method24281());
                int b2 = (int)(Class1639.field6095 * ((Class6283)e2.getValue()).method24281());
                Color c2 = Class431.method8763(Class457.method10620(), a2);
                Color d2 = Class431.method8774().method10618(b2);
                Class6454.method24734(g2.method125(), (class_2338)e2.getKey(), c2.getRGB());
                Class6454.method24642(Class431.method8784(g2), (class_2338)e2.getKey(), 1.5f, d2.getRGB());
            }
            Class6009.method23561();
            if (Class431.method8834(this) == null || this.field2005.method18157() == null) {
                return;
            }
            if (((Boolean)this.field2001.method507()).booleanValue()) {
                int n3 = 35445;
                Class1807.method15744();
                return;
            }
            int n4 = 35446;
            while ((n2 = n4) != 35445) {
                if (n2 != 35446) {
                    Class5659.method22184();
                    return;
                }
                n4 = 35444;
            }
            Class6283 f2 = new Class6283((boolean)field2000[0], ((Integer)this.field1992.method507()).intValue());
            Class431.method8764(this).put(this.field2005.method18154(), f2);
            this.field1999.entrySet().removeIf(Class431::method8836);
        }
    }

    private static Object method8824(Class248 class248) {
        return class248.method507();
    }

    private static void method8825() {
        Class6454.method24594();
    }

    private static int method8826(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    public static class_304 method8827(class_315 class_3152) {
        return class_3152.field_1849;
    }

    private static void method8828(long l2) {
        Class431.field2000[3] = l2 ^ 0x84B0EDFBB6168938L;
        Class431.field2000[5] = l2 ^ 0x84B0EDFBB61689C0L;
        Class431.field2000[7] = l2 ^ 0x84B0EDFBB61689CBL;
        Class431.field2000[0] = l2 ^ 0x84B0EDFBB61689C3L;
        Class431.field2000[1] = l2 ^ 0x84B0EDFBB6168AD4L;
        Class431.field2000[4] = l2 ^ 0x84B0EDFBB6168A2AL;
        Class431.field2000[6] = l2 ^ 0x7B4F120449E9763DL;
        Class431.field2000[2] = l2 ^ 0x84B0EDFBB61689C2L;
    }

    private static void method8829(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static class_746 method8830(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method8831(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static class_304 method8832(class_315 class_3152) {
        return Class431.method8767(class_3152);
    }

    private static void method8833(float f2) {
        Class5836.method22907(f2);
    }

    public static Class3691 method8834(Class431 class431) {
        return class431.field2005;
    }

    private static void method8835(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static boolean method8836(Map.Entry a2) {
        return (Class431.method8849((Class6283)a2.getValue()) == 0.0 ? (int)field2000[0] : (int)field2000[2]) != 0;
    }

    private static int method8837(int n2, int n3, Class486 class486, Class3923 class3923) {
        return Class3876.method19126(n2, n3, class486, class3923);
    }

    private int method8838() {
        class_1747 a2;
        class_1792 class_17922;
        class_1799 e2 = Class5723.field11058.method18846();
        if (!e2.method_7960() && (class_17922 = e2.method_7909()) instanceof class_1747 && this.method8759((a2 = (class_1747)class_17922).method_7711())) {
            return Class431.method8775().method18969();
        }
        int f2 = (int)field2000[6];
        int g2 = (int)field2000[2];
        for (int d2 = (int)field2000[2]; d2 < (int)field2000[7]; ++d2) {
            class_1799 c2 = Class431.field290.field_1724.method_31548().method_5438(d2);
            if (c2.method_7960()) continue;
            class_1792 class_17923 = c2.method_7909();
            if (!(class_17923 instanceof class_1747)) continue;
            class_1747 b2 = (class_1747)class_17923;
            if (!this.method8759(b2.method_7711())) continue;
            if (this.field1998.method507() == Class557.field2763) {
                return d2;
            }
            if (f2 != (int)field2000[6]) {
                if (c2.method_7947() <= g2) continue;
            }
            f2 = d2;
            g2 = c2.method_7947();
        }
        return f2;
    }

    private static void method8839() {
        Class6454.method24594();
    }

    public static class_304 method8840(class_315 class_3152) {
        return class_3152.field_1913;
    }

    private static void method8841() {
        Class6009.method23561();
    }

    private static void method8842() {
        Class5836.method22885();
    }

    public static class_315 method8843(class_310 class_3102) {
        return class_3102.field_1690;
    }

    private static boolean method8844() {
        return Class5836.method22894();
    }

    private static boolean method8845(int n2) {
        return Class4196.method20803(n2);
    }

    private static void method8846() {
        Class1503.method14420();
    }

    private static boolean method8847() {
        return Class447.method10252();
    }

    public static double method8848(class_243 class_2432) {
        return class_2432.field_1352;
    }

    public Class431() {
        super("Scaffold", "Places blocks at the players feet", Class556.field2754, (int)field2000[1]);
        this.field1994 = this.method450(new Class253("GrimV3", "Uses grim new interactions", (boolean)field2000[2]));
        this.field1993 = this.method450(new Class260("Selection", "The selection of blocks to use for scaffold", Class544.field2693, Class544.values()));
        class_2248[] class_2248Array = new class_2248[(int)field2000[5]];
        class_2248Array[(int)Class431.field2000[2]] = class_2246.field_10566;
        class_2248Array[(int)Class431.field2000[0]] = class_2246.field_10540;
        this.field2006 = this.method450(new Class257("Whitelist", "Valid block whitelist", class_2248Array));
        class_2248[] class_2248Array2 = new class_2248[(int)field2000[0]];
        class_2248Array2[(int)Class431.field2000[2]] = class_2246.field_10603;
        this.field1996 = this.method450(new Class257("Blacklist", "Valid block blacklist", class_2248Array2));
        this.field2004 = this.method450(new Class253("KeepY", "Keeps the same y-level", (boolean)field2000[2]));
        this.field1997 = this.method450(new Class253("Tower", "Goes up faster when holding down space", (boolean)field2000[0], this::method1278));
        this.field1998 = this.method450(new Class260("BlockSelection", "How to pick a block from the hotbar", Class557.field2763, Class557.values()));
        this.field2001 = this.method450(new Class253("Render", "Renders where scaffold is placing blocks", (boolean)field2000[2]));
        this.field1992 = this.method450(new Class252("Fade-Time", "Timer for the fade", (int)field2000[2], (int)field2000[3], (int)field2000[4]));
    }

    private static double method8849(Class6283 class6283) {
        return class6283.method24281();
    }

    public static class_746 method8850(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

