/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 */
package mapped;

import java.awt.Color;
import java.util.Map;
import mapped.Class1;
import mapped.Class1004;
import mapped.Class1011;
import mapped.Class1108;
import mapped.Class111;
import mapped.Class1503;
import mapped.Class1668;
import mapped.Class1745;
import mapped.Class215;
import mapped.Class248;
import mapped.Class294;
import mapped.Class298;
import mapped.Class3539;
import mapped.Class396;
import mapped.Class3979;
import mapped.Class4045;
import mapped.Class4146;
import mapped.Class419;
import mapped.Class553;
import mapped.Class5659;
import mapped.Class5836;
import mapped.Class59;
import mapped.Class6009;
import mapped.Class6060;
import mapped.Class613;
import mapped.Class6159;
import mapped.Class6283;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class711;
import mapped.Class925;
import net.minecraft.class_2338;
import net.minecraft.class_243;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5460 {
    public double field10220 = 0.0;
    private static long[] field10221 = new long[3];
    public class_243 field10222;
    public class_243 field10223;

    private static void method21145() {
        Class6009.method23560();
    }

    private static int method21146(int n2, int n3, Class711 class711, Class396 class396) {
        return Class6060.method23786(n2, n3, class711, class396);
    }

    private static Object method21147(Class248 class248) {
        return class248.method507();
    }

    private static int method21148(int n2, int n3, Class215 class215, Class111 class111) {
        return Class6060.method23781(n2, n3, class215, class111);
    }

    public static class_243 method21149(Class5460 class5460) {
        return class5460.field10223;
    }

    private static Object method21150(Class248 class248) {
        return class248.method507();
    }

    public static class_243 method21151(Class5460 class5460) {
        return class5460.field10223;
    }

    private static void method21152(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static Map method21153(Class419 class419) {
        return class419.field1750;
    }

    public static class_2338 method21154(Class419 class419) {
        return class419.field1706;
    }

    private static Object method21155(Class248 class248) {
        return class248.method507();
    }

    private static Object method21156(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method21157(Class419 class419) {
        return class419.field1663;
    }

    private static double method21158(Class6283 class6283) {
        return class6283.method24281();
    }

    public static double method21159(class_243 class_2432) {
        return class_2432.field_1350;
    }

    private static Object method21160(Class248 class248) {
        return class248.method507();
    }

    public static class_243 method21161(Class5460 class5460) {
        return class5460.field10223;
    }

    public static Class248 method21162(Class419 class419) {
        return class419.field1663;
    }

    public static double method21163(Class5460 class5460) {
        return class5460.field10220;
    }

    private static void method21164() {
        Class5836.method22897();
    }

    private static void method21165() {
        Class5836.method22890();
    }

    private static Object method21166(Class248 class248) {
        return class248.method507();
    }

    public static double method21167(Class5460 class5460) {
        return class5460.field10220;
    }

    public static class_243 method21168(Class5460 class5460) {
        return class5460.field10222;
    }

    private static int method21169(int n2, int n3, Class6159 class6159, Class294 class294) {
        return Class6060.method23771(n2, n3, class6159, class294);
    }

    public static class_243 method21170(Class5460 class5460) {
        return class5460.field10223;
    }

    private static Class248 method21171(Class419 class419) {
        return Class5460.method21162(class419);
    }

    private static int method21172(int n2, int n3, Class553 class553, Class1011 class1011) {
        return Class6060.method23784(n2, n3, class553, class1011);
    }

    private static void method21173(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method21174() {
        Class4146.method20697();
    }

    private static void method21175() {
        Class298.method1924();
    }

    private static boolean method21176(Class613 class613) {
        return class613.method11306();
    }

    private static void method21177() {
        Class6454.method24594();
    }

    private static void method21178() {
        Class1745.method15538();
    }

    private static Color method21179(Color color, int n2) {
        return Class4045.method20088(color, n2);
    }

    private static Color method21180(Color color, int n2) {
        return Class4045.method20088(color, n2);
    }

    private static boolean method21181(Map.Entry a2) {
        return (((Class6283)a2.getValue()).method24281() == 0.0 ? (int)field10221[1] : (int)field10221[2]) != 0;
    }

    private static void method21182() {
        Class298.method1924();
    }

    private static void method21183() {
        Class1745.method15538();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method21184(Class59 m2) {
        Class419 n2 = Class419.method7217();
        if (((Class613)((Object)n2.field1732.method507())).method11313()) {
            Class6009.method23560();
            StringBuilder k2 = new StringBuilder();
            if (((Boolean)n2.field1737.method507()).booleanValue()) {
                if (((Boolean)n2.field1691.method507()).booleanValue()) {
                    k2.append(Class1004.method12743(n2.field1719, (int)field10221[1]));
                }
                if (((Boolean)n2.field1691.method507()).booleanValue() && ((Boolean)n2.field1673.method507()).booleanValue()) {
                    k2.append("/");
                }
                if (((Boolean)n2.field1673.method507()).booleanValue()) {
                    k2.append(Class1004.method12743(n2.field1740, (int)field10221[1]));
                }
            }
            if (Class5460.method21176((Class613)((Object)Class5460.method21210(n2).method507()))) {
                int n3 = 1218;
                Class1503.method14420();
                return;
            }
            int n4 = 1219;
            Class1503.method14417(Class3539.field7835, 0.013989747f);
            return;
        }
        Class6009.method23561();
        int n5 = ((Class613)((Object)n2.field1732.method507())).method11306() ? 56224 : 56225;
        block4: while (true) {
            switch (n5) {
                case 56225: {
                    n5 = 56223;
                    continue block4;
                }
                case 56224: {
                    n2.field1750.entrySet().removeIf(Class5460::method21181);
                    if (n2.field1706 == null || !n2.method7328()) return;
                    Class6283 l2 = new Class6283((boolean)field10221[1], ((Integer)Class5460.method21206(n2).method507()).intValue());
                    Class5460.method21153(n2).put(n2.field1706, l2);
                    return;
                }
            }
            break;
        }
    }

    private static void method21185(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static void method21186(float f2) {
        Class5836.method22907(f2);
    }

    private static void method21187() {
        Class5836.method22897();
    }

    public static double method21188(Class5460 class5460) {
        return class5460.field10220;
    }

    private static void method21189(long l2) {
        Class5460.field10221[0] = l2 ^ 0x8D3236FD0EAC8B7AL;
        Class5460.field10221[1] = l2 ^ 0x8D3236FD0EAC8B84L;
        Class5460.field10221[2] = l2 ^ 0x8D3236FD0EAC8B85L;
    }

    private static void method21190(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method21191() {
        Class3979.method19561();
    }

    private static double method21192(Class5460 class5460) {
        return Class5460.method21167(class5460);
    }

    private static double method21193(double d2, double d3, double d4) {
        return Class396.method5737(d2, d3, d4);
    }

    public static Class925 method21194(Class419 class419) {
        return class419.field1760;
    }

    private static Object method21195(Class248 class248) {
        return class248.method507();
    }

    private static void method21196() {
        Class5659.method22184();
    }

    private static Color method21197(Color color, int n2) {
        return Class4045.method20088(color, n2);
    }

    private static void method21198(Class6283 class6283, boolean bl2) {
        class6283.method24284(bl2);
    }

    public static Class248 method21199(Class419 class419) {
        return class419.field1703;
    }

    public static Class925 method21200(Class419 class419) {
        return class419.field1760;
    }

    private static Color method21201(Color color, int n2) {
        return Class4045.method20088(color, n2);
    }

    public static void method21202(Class5460 class5460, class_243 class_2432) {
        class5460.field10222 = class_2432;
    }

    private static void method21203(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static Object method21204(Class248 class248) {
        return class248.method507();
    }

    private static void method21205(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static Class248 method21206(Class419 class419) {
        return class419.field1698;
    }

    private static Object method21207(Class248 class248) {
        return class248.method507();
    }

    public static Class248 method21208(Class419 class419) {
        return class419.field1731;
    }

    public static Class248 method21209(Class419 class419) {
        return class419.field1663;
    }

    static {
        Class5460.method21189(-8272489105025365115L);
    }

    public static Class248 method21210(Class419 class419) {
        return class419.field1732;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

