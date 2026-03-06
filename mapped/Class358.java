/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1706
 *  net.minecraft.class_1713
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 *  net.minecraft.class_471
 *  net.minecraft.class_636
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 *  net.minecraft.class_9334
 */
package mapped;

import java.util.List;
import mapped.Class1;
import mapped.Class1108;
import mapped.Class1215;
import mapped.Class210;
import mapped.Class248;
import mapped.Class249;
import mapped.Class250;
import mapped.Class252;
import mapped.Class253;
import mapped.Class260;
import mapped.Class278;
import mapped.Class359;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class4257;
import mapped.Class45;
import mapped.Class528;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class924;
import net.minecraft.class_1657;
import net.minecraft.class_1706;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_471;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9334;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class358
extends Class278 {
    Class248 field1122;
    Class248 field1123;
    private final Class924 field1124;
    Class248 field1125;
    Class248 field1126;
    Class248 field1127 = this.method450(new Class260("Selection", "The selection of items to rename", Class528.field2619, Class528.values()));
    Class248 field1128;
    private static long[] field1129 = new long[7];

    private boolean method4450(class_1799 a2, String b2) {
        if (b2.trim().isEmpty()) {
            if (a2.method_57824(class_9334.field_49631) == null) {
                int n2 = (int)field1129[1];
                return Class1215.method13261(0.4584801335816102, 0.1666969119388999);
            }
            return (int)field1129[3] != 0;
        }
        return Integer.valueOf(b2.hashCode()).equals(a2.method_7964().getString().hashCode());
    }

    public static class_638 method4451(class_310 class_3102) {
        return class_3102.field_1687;
    }

    private static Class248 method4452(Class358 class358) {
        return Class358.method4465(class358);
    }

    private static void method4453(float f2) {
        Class5836.method22907(f2);
    }

    private static void method4454(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method4455(Class924 class924) {
        class924.method12593();
    }

    private static int method4456(int n2, int n3, Class45 class45, Class359 class359) {
        return Class4257.method20923(n2, n3, class45, class359);
    }

    private static void method4457() {
        Class6009.method23560();
    }

    static {
        Class358.method4461(5457029353613871877L);
    }

    public Class358() {
        super("AnvilRename", "Automatically renames items in anvils.", Class556.field2756);
        class_1792[] class_1792Array = new class_1792[(int)field1129[4]];
        class_1792Array[(int)Class358.field1129[3]] = class_1802.field_8463;
        class_1792Array[(int)Class358.field1129[1]] = class_1802.field_8367;
        this.field1123 = this.method450(new Class249("Whitelist", "The items to rename.", class_1792Array));
        class_1792[] class_1792Array2 = new class_1792[(int)field1129[1]];
        class_1792Array2[(int)Class358.field1129[3]] = class_1802.field_8287;
        this.field1125 = this.method450(new Class249("Blacklist", "The items to not rename.", class_1792Array2));
        this.field1128 = this.method450(new Class250("Text", "The text to rename the items to.", "Hachimi"));
        this.field1122 = this.method450(new Class252("Delay", "The delay between renaming items.", (int)field1129[3], (int)field1129[2], (int)field1129[0]));
        this.field1126 = this.method450(new Class253("Debug", "Prints debug information to chat.", (boolean)field1129[3]));
        this.field1124 = new Class924();
    }

    private static class_1713 method4458() {
        return Class358.method4482();
    }

    public static class_746 method4459(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method4460(Class358 class358) {
        return class358.field1125;
    }

    private static void method4461(long l2) {
        Class358.field1129[3] = l2 ^ 0x4BBB4348D708CB05L;
        Class358.field1129[6] = l2 ^ 0x4BBB4348D708CB06L;
        Class358.field1129[2] = l2 ^ 0x4BBB4348D708CB0FL;
        Class358.field1129[5] = l2 ^ 0x4BBB4348D708CB22L;
        Class358.field1129[1] = l2 ^ 0x4BBB4348D708CB04L;
        Class358.field1129[4] = l2 ^ 0x4BBB4348D708CB07L;
        Class358.field1129[0] = l2 ^ 0x4BBB4348D708CB61L;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4462(Class210 e2) {
        String c2;
        void f2;
        if (Class358.field290.field_1724 == null) return;
        if (Class358.method4451(field290) == null) return;
        if (Class358.field290.field_1761 == null) return;
        class_437 class_4372 = Class358.field290.field_1755;
        if (!(class_4372 instanceof class_471)) {
            Class6322.method24332(0.20222795f, 0.09145838f);
            return;
        }
        class_471 a2 = (class_471)class_4372;
        int n2 = !this.field1124.method12595((Number)this.field1122.method507()) ? 58593 : 58594;
        block12: while (true) {
            switch (n2) {
                case 58594: {
                    n2 = 58592;
                    continue block12;
                }
                case 58593: {
                    return;
                }
            }
            break;
        }
        Class358.method4455(this.field1124);
        if (Class358.method4478((class_310)Class358.field290).field_7520 <= 0 && !Class358.field290.field_1724.method_7337()) {
            if (!((Boolean)this.field1126.method507()).booleanValue()) {
                return;
            }
            this.method1250("Not enough experience levels.");
            return;
        }
        class_1706 g2 = (class_1706)f2.method_17577();
        if (!g2.method_7611((int)field1129[1]).method_7677().method_7960()) {
            this.method4472(g2, (int)field1129[1]);
            return;
        }
        int n3 = !g2.method_7611((int)field1129[3]).method_7677().method_7960() ? 14306 : 14307;
        block13: while (true) {
            switch (n3) {
                case 14307: {
                    n3 = 14305;
                    continue block13;
                }
                case 14306: {
                    this.method4472(g2, (int)field1129[3]);
                    return;
                }
            }
            break;
        }
        if (!g2.method_7611((int)field1129[4]).method_7677().method_7960()) {
            this.method4472(g2, (int)field1129[4]);
            return;
        }
        int d2 = (int)field1129[6];
        if (d2 >= (int)field1129[5]) return;
        class_1799 b2 = g2.method_7611(d2).method_7677();
        String string = c2 = !((String)Class358.method4477(this.field1128)).trim().isEmpty() ? (String)Class358.method4473(this).method507() : "";
        if (!b2.method_7960()) {
            int n4 = !Class358.method4481(this, b2, c2) ? 20410 : 20411;
            block14: while (true) {
                switch (n4) {
                    case 20411: {
                        n4 = 20409;
                        continue block14;
                    }
                    case 20410: {
                        if (this.field1127.method507() == Class528.field2618 && ((List)Class358.method4460(this).method507()).contains(b2.method_7909()) || this.field1127.method507() == Class528.field2621 && !((List)Class358.method4452(this).method507()).contains(b2.method_7909())) break block14;
                        Class358.field290.field_1761.method_2906(g2.field_7763, d2, (int)field1129[3], class_1713.field_7790, (class_1657)Class358.method4471(field290));
                        Class358.field290.field_1761.method_2906(g2.field_7763, g2.method_7611((int)((int)Class358.field1129[3])).field_7874, (int)field1129[3], class_1713.field_7790, (class_1657)Class358.method4459(field290));
                        ((class_471)Class358.field290.field_1755).field_2821.method_1852(c2);
                        if (((Boolean)this.field1126.method507()).booleanValue()) {
                            this.method1250("Successfully renamed item in slot: " + d2 + ".");
                        }
                        Class358.field290.field_1761.method_2906(g2.field_7763, g2.method_7611((int)((int)Class358.field1129[4])).field_7874, (int)field1129[3], Class358.method4480(), (class_1657)Class358.field290.field_1724);
                        Class358.field290.field_1761.method_2906(g2.field_7763, d2, (int)field1129[3], class_1713.field_7790, (class_1657)Class358.method4463(field290));
                        return;
                    }
                }
                break;
            }
        }
        ++d2;
        Class1108.method12918(true);
    }

    public static class_746 method4463(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static class_746 method4464(class_310 class_3102) {
        return class_3102.field_1724;
    }

    public static Class248 method4465(Class358 class358) {
        return class358.field1123;
    }

    public static class_746 method4466(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4467(float f2) {
        Class5836.method22907(f2);
    }

    public static class_636 method4468(class_310 class_3102) {
        return class_3102.field_1761;
    }

    public static class_636 method4469(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static void method4470() {
        Class5836.method22897();
    }

    private static class_746 method4471(class_310 class_3102) {
        return Class358.method4464(class_3102);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void method4472(class_1706 c2, int d2) {
        if (Class358.method4468(field290) == null) {
            return;
        }
        int b2 = (int)field1129[6];
        int n2 = b2 < (int)field1129[5] ? 55093 : 55094;
        while (true) {
            int n3;
            if ((n3 = n2) == 55093) {
                class_1799 a2 = c2.method_7611(b2).method_7677();
                if (!a2.method_7960()) break;
                Class358.method4469(field290).method_2906(c2.field_7763, c2.method_7611((int)d2).field_7874, (int)field1129[3], Class358.method4458(), (class_1657)Class358.field290.field_1724);
                Class358.method4474(field290).method_2906(c2.field_7763, b2, (int)field1129[3], class_1713.field_7790, (class_1657)Class358.field290.field_1724);
                return;
            }
            if (n3 != 55094) {
                Class358.field290.field_1761.method_2906(c2.field_7763, c2.method_7611((int)d2).field_7874, (int)field1129[3], class_1713.field_7795, (class_1657)Class358.method4466(field290));
                return;
            }
            n2 = 55092;
        }
        Class358.method4453(0.5389593f);
    }

    public static Class248 method4473(Class358 class358) {
        return class358.field1128;
    }

    public static class_636 method4474(class_310 class_3102) {
        return class_3102.field_1761;
    }

    private static void method4475() {
        Class6454.method24594();
    }

    private static void method4476() {
        Class4146.method20697();
    }

    private static Object method4477(Class248 class248) {
        return class248.method507();
    }

    public static class_746 method4478(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static void method4479(float f2) {
        Class5836.method22907(f2);
    }

    public static class_1713 method4480() {
        return class_1713.field_7790;
    }

    private static boolean method4481(Class358 class358, class_1799 class_17992, String string) {
        return class358.method4450(class_17992, string);
    }

    public static class_1713 method4482() {
        return class_1713.field_7790;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

