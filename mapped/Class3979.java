/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  org.apache.logging.log4j.Logger
 *  skidonion.sAnhI.___.____
 */
package mapped;

import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import mapped.Class1156;
import mapped.Class1462;
import mapped.Class1600;
import mapped.Class1658;
import mapped.Class1668;
import mapped.Class209;
import mapped.Class258;
import mapped.PlaceEcho;
import mapped.Class3816;
import mapped.Class3878;
import mapped.Class3904;
import mapped.Class4028;
import mapped.Class4070;
import mapped.Class4971;
import mapped.Class525;
import mapped.Class5512;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class6009;
import mapped.Class618;
import mapped.Class6280;
import mapped.Class6322;
import mapped.Class634;
import mapped.Class681;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.Logger;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3979 {
    public static final String field9076;
    public static final String field9077;
    private static final Logger field9078;
    public static boolean field9079;
    public static ExecutorService field9080;
    private static long[] field9081;
    public static Class1600 field9082;
    public static Class1462 field9083;
    public static boolean field9084;
    public static boolean $skidonion$890408500;

    private static int method19532(int n2, int n3, Class5512 class5512, Class5693 class5693) {
        return Class1156.method13094(n2, n3, class5512, class5693);
    }

    static {
        ___.___(49, Class3979.class);
        ____.___49_10(Class3979.class);
    }

    public static void method19533(Class4070 class4070) {
        Class5723.field11046 = class4070;
    }

    private static void method19534(String string) {
        Class3979.method19567(string);
    }

    private static Logger method19535() {
        return Class3979.method19545();
    }

    public static void method19536(String a2, Object ... b2) {
        Object[] objectArray = new Object[(int)field9081[4]];
        objectArray[(int)Class3979.field9081[8]] = a2;
        field9078.error(String.format("[Hachimi] %s", objectArray), b2);
    }

    private static void method19537() {
        for (Class1658 a2 : Class3979.method19562(field9083)) {
            a2.method15040();
        }
        field9084 = (int)field9081[4];
        Class3979.method19567("Config loaded!");
    }

    private static int method19538(int n2, int n3, Class3904 class3904, Class3816 class3816) {
        return Class1156.method13092(n2, n3, class3904, class3816);
    }

    public static boolean method19539() {
        return FabricLoader.getInstance().getModContainer("baritone").isPresent();
    }

    private static void method19540(int n2, int n3, int n4, int n5) {
        Class1668.method15147(n2, n3, n4, n5);
    }

    public static void method19541(Class4971 class4971) {
        Class5723.field11042 = class4971;
    }

    private static void method19542(long l2) {
        Class3979.method19548(l2);
    }

    public static boolean method19543() {
        return FabricLoader.getInstance().getModContainer("immediatelyfast").isPresent();
    }

    public static boolean method19544() {
        return FabricLoader.getInstance().getModContainer("mousetweaks").isPresent();
    }

    public static Logger method19545() {
        return field9078;
    }

    public static void method19546(Class6280 class6280) {
        Class5723.field11050 = class6280;
    }

    public static Class1600 method19547() {
        return field9082;
    }

    private static void method19548(long l2) {
        Class3979.field9081[5] = l2 ^ 0x71537F79D190F911L;
        Class3979.field9081[10] = l2 ^ 0x71537F79D190F910L;
        Class3979.field9081[6] = l2 ^ 0x71537F79D190F91FL;
        Class3979.field9081[2] = l2 ^ 0x71537F79D190F91BL;
        Class3979.field9081[7] = l2 ^ 0x71537F79D190F91CL;
        Class3979.field9081[8] = l2 ^ 0x71537F79D190F919L;
        Class3979.field9081[9] = l2 ^ 0x71537F79D190F91AL;
        Class3979.field9081[0] = l2 ^ 0x71537F79D190F913L;
        Class3979.field9081[3] = l2 ^ 0x71537F79D190F91DL;
        Class3979.field9081[1] = l2 ^ 0x71537F79D190F91EL;
        Class3979.field9081[4] = l2 ^ 0x71537F79D190F918L;
    }

    private static void method19549(String string) {
        Class3979.method19567(string);
    }

    private static int method19550(int n2, int n3, Class258 class258, PlaceEcho class331) {
        return Class1156.method13097(n2, n3, class258, class331);
    }

    public static boolean method19551() {
        return FabricLoader.getInstance().getModContainer("ias").isPresent();
    }

    private static int method19552(int n2, int n3, Class525 class525, Class3878 class3878) {
        return Class1156.method13104(n2, n3, class525, class3878);
    }

    private static void method19553(Class6280 class6280) {
        Class3979.method19546(class6280);
    }

    public static void method19554(String a2) {
        field9078.error("[Hachimi] {}", (Object)a2);
    }

    private static void method19555() {
        Class6009.method23561();
    }

    public static void method19556(Class5693 class5693) {
        Class5723.field11041 = class5693;
    }

    public static void method19557(String a2, Object ... b2) {
        Object[] objectArray = new Object[(int)field9081[4]];
        objectArray[(int)Class3979.field9081[8]] = a2;
        field9078.info(String.format("[Hachimi] %s", objectArray), b2);
    }

    private static void method19558(String string) {
        Class3979.method19567(string);
    }

    private static void method19559(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    public static void method19560(Class4028 class4028) {
        Class5723.field11057 = class4028;
    }

    public static native void method19561();

    private static Set method19562(Class1462 class1462) {
        return class1462.method14355();
    }

    public static Logger method19563() {
        return field9078;
    }

    private static int method19564(int n2, int n3, Class209 class209, Class618 class618) {
        return Class1156.method13087(n2, n3, class209, class618);
    }

    private static void method19565(String string) {
        Class3979.method19567(string);
    }

    private static int method19566(int n2, int n3, Class681 class681, Class634 class634) {
        return Class1156.method13103(n2, n3, class681, class634);
    }

    public static void method19567(String a2) {
        Class3979.method19535().info("[Hachimi] {}", (Object)a2);
    }

    public static InputStream method19568(String a2) {
        return Class3979.class.getClassLoader().getResourceAsStream(a2);
    }

    private static void method19569(String string) {
        Class3979.method19567(string);
    }

    private static native Object 1(char var0);
}

