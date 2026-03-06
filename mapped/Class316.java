/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 */
package mapped;

import mapped.Class1;
import mapped.Class10;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class219;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class298;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class458;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6322;
import mapped.Class6454;
import mapped.Class77;
import net.minecraft.class_2561;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class316
extends Class278 {
    Class248 field731;
    Class248 field732;
    private static long[] field733 = new long[8];
    Class248 field734;
    Class248 field735 = this.method450(new Class252("Size", "The number of players to show", (int)field733[1], (int)field733[3], (int)field733[4]));

    private static String method2610(Class316 class316, String string) {
        return class316.method2614(string);
    }

    private static void method2611(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    @Class1
    public void method2612(Class219 a2) {
        a2.method10();
        a2.method409((Integer)Class316.method2619(this.field734));
    }

    private static void method2613() {
        Class5836.method22897();
    }

    /*
     * Enabled aggressive block sorting
     */
    private String method2614(String b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = (int)field733[6];
        char[] cArray = b2.toCharArray();
        int n2 = cArray.length;
        int n3 = (int)field733[6];
        while (n3 < n2) {
            char a2 = cArray[n3];
            if (a2 != (int)field733[7]) {
                Class316.method2625();
                return null;
            }
            int n4 = 60450;
            block5: while (true) {
                switch (n4) {
                    case 60451: {
                        n4 = 60449;
                        continue block5;
                    }
                    case 60450: {
                        d2 = (int)field733[0];
                        break block5;
                    }
                    default: {
                        if (d2 != 0) {
                            d2 = (int)field733[6];
                            break block5;
                        }
                        c2.append(a2);
                    }
                }
                break;
            }
            ++n3;
        }
        return c2.toString();
    }

    static {
        Class316.method2627(-5930131986350071357L);
    }

    private static void method2615() {
        Class4146.method20694();
    }

    private static void method2616() {
        Class1503.method14420();
    }

    private static boolean method2617(Class458 class458) {
        return class458.method10622();
    }

    @Class1
    public void method2618(Class10 a2) {
        a2.method10();
        a2.method18((Integer)Class316.method2623(this.field735));
    }

    private static Object method2619(Class248 class248) {
        return class248.method507();
    }

    private static class_2561 method2620(Class77 class77) {
        return class77.method157();
    }

    public Class316() {
        super("ExtraTab", "Expands the tab list size to allow for more players", Class556.field2756);
        this.field734 = this.method450(new Class252("Columns", "The number columns to show.", (int)field733[0], (int)field733[5], (int)field733[2]));
        this.field731 = this.method450(new Class253("Self", "Highlights yourself in the tab list.", (boolean)field733[6]));
        this.field732 = this.method450(new Class253("Friends", "Highlights friends in the tab list.", (boolean)field733[0]));
    }

    private static void method2621(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method2622(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Object method2623(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method2624(Class77 e2) {
        String[] stringArray;
        int n2;
        int n3;
        String[] f2 = Class316.method2620(e2).getString().split(" ");
        if (((Boolean)this.field731.method507()).booleanValue() && (n3 = (int)field733[6]) < (n2 = (stringArray = f2).length)) {
            String b2 = stringArray[n3];
            String a2 = this.method2614(b2);
            if (Integer.valueOf(field290.method_53462().getName().hashCode()).equals(a2.hashCode())) {
                e2.method10();
                e2.method156(class_2561.method_30163((String)("\u00a7s" + e2.method157().getString())));
                return;
            }
            ++n3;
            Class1807.method15744();
            return;
        }
        if (((Boolean)this.field732.method507()).booleanValue() && Class316.method2617(Class458.method10623())) {
            stringArray = f2;
            n2 = stringArray.length;
            for (n3 = (int)field733[6]; n3 < n2; ++n3) {
                String d2 = stringArray[n3];
                String c2 = Class316.method2610(this, d2);
                if (!Class5723.field11045.method21233(c2)) continue;
                e2.method10();
                e2.method156(class_2561.method_30163((String)("\u00a7g" + e2.method157().getString())));
                break;
            }
        }
    }

    private static void method2625() {
        Class298.method1924();
    }

    private static void method2626() {
        Class1503.method14420();
    }

    private static void method2627(long l2) {
        Class316.field733[4] = l2 ^ 0xADB3F060AA6C222BL;
        Class316.field733[2] = l2 ^ 0xADB3F060AA6C21A7L;
        Class316.field733[7] = l2 ^ 0xADB3F060AA6C2164L;
        Class316.field733[1] = l2 ^ 0xADB3F060AA6C2193L;
        Class316.field733[0] = l2 ^ 0xADB3F060AA6C21C2L;
        Class316.field733[6] = l2 ^ 0xADB3F060AA6C21C3L;
        Class316.field733[5] = l2 ^ 0xADB3F060AA6C21D7L;
        Class316.field733[3] = l2 ^ 0xADB3F060AA6C210BL;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

