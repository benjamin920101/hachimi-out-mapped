/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Direction$Axis
 */
package mapped;

import mapped.Class1108;
import mapped.Class1567;
import mapped.Class331;
import mapped.Class3431;
import mapped.Class3455;
import mapped.Class4146;
import mapped.Class5836;
import mapped.Class5940;
import mapped.Class6009;
import mapped.Class6454;
import mapped.Class98;
import net.minecraft.util.math.Direction;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5587 {
    private static long[] field10619 = new long[3];

    private static void method21916() {
        Class6009.method23561();
    }

    private static void method21917(boolean bl2) {
        Class1108.method12918(bl2);
    }

    private static void method21918(long l2) {
        Class5587.field10619[2] = l2 ^ 0xB1081D4293572817L;
        Class5587.field10619[0] = l2 ^ 0xB1081D4293572816L;
        Class5587.field10619[1] = l2 ^ 0xB1081D4293572814L;
    }

    static {
        Class5587.method21918(-5690265957405612010L);
    }

    public static String method21919(Enum a2) {
        String b2 = a2.name();
        return Class5587.method21926(b2);
    }

    private static void method21920(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static String method21921(class_2350.class_2351 a2) {
        return switch (Class3431.field7477[a2.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> "X";
            case 2 -> "Y";
            case 3 -> "Z";
        };
    }

    private static int method21922(int n2, int n3, Class331 class331, Class98 class98) {
        return Class5940.method23356(n2, n3, class331, class98);
    }

    private static int method21923(int n2, int n3, Class3455 class3455, Class1567 class1567) {
        return Class5940.method23357(n2, n3, class3455, class1567);
    }

    private static void method21924() {
        Class5836.method22890();
    }

    private static void method21925() {
        Class4146.method20694();
    }

    public static String method21926(String f2) {
        if (!f2.contains("_")) {
            char a2 = f2.charAt((int)field10619[0]);
            String b2 = f2.split(String.valueOf(a2), (int)field10619[1])[(int)field10619[2]];
            return String.valueOf(a2).toUpperCase() + b2.toLowerCase();
        }
        String[] g2 = f2.split("_");
        StringBuilder h2 = new StringBuilder();
        int n2 = (int)field10619[0];
        String[] stringArray = g2;
        int n3 = stringArray.length;
        if (n2 < n3) {
            String e2 = stringArray[n2];
            char c2 = e2.charAt((int)field10619[0]);
            String d2 = e2.split(String.valueOf(c2), (int)field10619[1])[(int)field10619[2]];
            h2.append(String.valueOf(c2).toUpperCase()).append(d2.toLowerCase());
            ++n2;
            while (true) {
                // Infinite loop
            }
        }
        return h2.toString();
    }

    private static void method21927() {
        Class6009.method23561();
    }

    public static String method21928(class_2350 a2) {
        String string;
        switch (Class3431.field7475[a2.ordinal()]) {
            default: {
                throw new MatchException(null, null);
            }
            case 1: {
                string = "Up";
                break;
            }
            case 2: {
                string = "Down";
                break;
            }
            case 3: {
                string = "North";
                break;
            }
            case 4: {
                string = "South";
                break;
            }
            case 5: {
                String string2 = "East";
                Class1108.method12918(true);
                return null;
            }
            case 6: {
                string = "West";
            }
        }
        return string;
    }

    private static void method21929(double d2, double d3, double d4, double d5) {
        Class6454.method24636(d2, d3, d4, d5);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

