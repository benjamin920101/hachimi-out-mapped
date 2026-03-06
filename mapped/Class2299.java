/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.World
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.client.world.ClientWorld
 *  org.jetbrains.annotations.Nullable
 */
package mapped;

import mapped.Class1195;
import mapped.Class1215;
import mapped.Class13;
import mapped.Class1350;
import mapped.Class1414;
import mapped.Class1503;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class2298;
import mapped.TrueSight;
import mapped.Class3684;
import mapped.Class3720;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4196;
import mapped.ClickTweaks;
import mapped.Velocity;
import mapped.Class520;
import mapped.Class5530;
import mapped.Class5659;
import mapped.Class6039;
import mapped.Class6132;
import mapped.Class6454;
import mapped.Class657;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.client.world.ClientWorld;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class2299
extends Class2298 {
    private static long[] field6790 = new long[2];
    private static final double field6791 = 2.0E-4;
    public static final Class2299 INSTANCE;
    private static final double field6792 = 0.4;
    private static final double field6793 = 1.62;

    private static int method15865(int n2, int n3, Class520 class520, Class3684 class3684) {
        return Class1195.method13189(n2, n3, class520, class3684);
    }

    private static void method15866(long l2) {
        Class2299.field6790[1] = l2 ^ 0x4C3EFFCF653F84EL;
        Class2299.field6790[0] = l2 ^ 0x4C3EFFCF653F84FL;
    }

    private static boolean method15867() {
        return Class3979.method19543();
    }

    private static boolean method15868(double d2, double d3) {
        return Class1215.method13261(d2, d3);
    }

    private static boolean method15869() {
        return Class4196.method20801();
    }

    private static int method15870(int n2, int n3, ClickTweaks class440, TrueSight class341) {
        return Class1195.method13172(n2, n3, class440, class341);
    }

    private static class_238 method15871(Class2299 class2299, class_2338 class_23382, class_1937 class_19372) {
        return class2299.method15887(class_23382, class_19372);
    }

    private static boolean method15872() {
        return Class5659.method22194();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean method15873(class_238 a2, class_238 b2) {
        int n2;
        if (!(Class2299.method15885(b2) - 1.0E-7 > a2.field_1323) || !(Class2299.method15888(b2) + 1.0E-7 < Class2299.method15893(a2)) || !(b2.field_1325 - 1.0E-7 > a2.field_1322)) return (int)field6790[1] != 0;
        int n3 = b2.field_1322 + Class3720.field8386 < a2.field_1325 ? 41454 : 41455;
        while ((n2 = n3) != 41454) {
            if (n2 != 41455) return (int)field6790[1] != 0;
            n3 = 41453;
        }
        if (!(b2.field_1324 - 1.0E-7 > a2.field_1321) || !(b2.field_1321 + 1.0E-7 < a2.field_1324)) return (int)field6790[1] != 0;
        int n4 = (int)field6790[0];
        return Class2299.method15891(Class5530.field10459, 0.6903532614920901, 0.6485699804676996, 0.3835246850890439);
    }

    private static boolean method15874(int n2) {
        return Class4196.method20803(n2);
    }

    public static double method15875(class_238 class_2383) {
        return class_2383.field_1323;
    }

    private static boolean method15876(double d2, double d3, double d4, double d5) {
        return Class5659.method22229(d2, d3, d4, d5);
    }

    private static boolean method15877() {
        return Velocity.method10252();
    }

    private static void method15878(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static void method15879(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static boolean method15880(Class2299 class2299, class_2338 class_23382, class_2350 class_23502, class_638 class_6383, class_1657 class_16572) {
        return class2299.method15846(class_23382, class_23502, class_6383, class_16572);
    }

    static {
        Class2299.method15866(343381866353784910L);
        INSTANCE = new Class2299();
    }

    public static double method15881(class_238 class_2383) {
        return class_2383.field_1323;
    }

    public static int[] method15882() {
        return Class1414.field5435;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean method15846(class_2338 a, class_2350 b, class_638 c, class_1657 d) {
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

    private static boolean method15883() {
        return Class1807.method15753();
    }

    public static double method15884(class_238 class_2383) {
        return class_2383.field_1325;
    }

    public static double method15885(class_238 class_2383) {
        return class_2383.field_1320;
    }

    private static void method15886() {
        Class1503.method14420();
    }

    private class_238 method15887(class_2338 h2, class_1937 i2) {
        class_265 j2 = i2.method_8320(h2).method_26220((class_1922)i2, h2).method_1096((double)h2.method_10263(), (double)h2.method_10264(), (double)h2.method_10260());
        class_238 k2 = new class_238(h2);
        for (class_238 g2 : j2.method_1090()) {
            double a2 = Math.max(g2.field_1323, k2.field_1323);
            double b2 = Math.max(g2.field_1322, k2.field_1322);
            double c2 = Math.max(g2.field_1321, k2.field_1321);
            double d2 = Math.min(g2.field_1320, k2.field_1320);
            double e2 = Math.min(g2.field_1325, k2.field_1325);
            double f2 = Math.min(g2.field_1324, k2.field_1324);
            k2 = new class_238(a2, b2, c2, d2, e2, f2);
        }
        return k2;
    }

    @Override
    public boolean method15828(class_2338 a2, class_2350 b2, class_638 c2, class_1657 d2, Class657 e2) {
        return this.method15846(a2, b2, c2, d2);
    }

    private static double method15888(class_238 class_2383) {
        return Class2299.method15881(class_2383);
    }

    public static double method15889(class_238 class_2383) {
        return class_2383.field_1320;
    }

    @Override
    @Nullable
    public class_2350 method15859(class_2338 f2, class_1657 g2, class_638 h2) {
        if (!Class1745.field6554) {
            Class4146.method20694();
            return null;
        }
        class_2350 c2 = null;
        double d2 = Double.MAX_VALUE;
        class_2350[] class_2350Array = class_2350.values();
        int n2 = class_2350Array.length;
        for (int i2 = (int)field6790[1]; i2 < n2; ++i2) {
            class_2350 b2 = class_2350Array[i2];
            double a2 = g2.method_33571().method_1022(f2.method_46558().method_43206(b2, 0.5));
            if (!(a2 < d2)) continue;
            if (Class2299.method15880(this, f2, b2, h2, g2)) {
                int n3 = 28190;
                Class4036.method20085(Class6039.field12115, 0.113725305f, 0.23756409f, 0.023230314f, 0.9987929f, 0.7496038f);
                return null;
            }
            int n4 = 28191;
            Class2299.method15878(Class1350.field5215, 0.6715650759318049, 0.18134083227373177, 0.7328463758879645);
            return null;
        }
        return c2;
    }

    private static boolean method15890() {
        return Class3979.method19543();
    }

    private static boolean method15891(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static boolean method15892() {
        return Class3979.method19543();
    }

    public static double method15893(class_238 class_2383) {
        return class_2383.field_1320;
    }

    private static boolean method15894() {
        return Velocity.method10322();
    }

    private static int method15895(int n2, int n3, Class6132 class6132, Class13 class13) {
        return Class1195.method13182(n2, n3, class6132, class13);
    }

    private static boolean method15896() {
        return Class5659.method22194();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

