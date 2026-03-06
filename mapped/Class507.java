/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1004;
import mapped.Class1095;
import mapped.Class126;
import mapped.Class1368;
import mapped.Class1402;
import mapped.Class1503;
import mapped.Class1682;
import mapped.Class21;
import mapped.Class3245;
import mapped.Class489;
import mapped.Class5534;
import mapped.Class5659;
import mapped.Class6023;
import mapped.Class6389;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class Class507
extends Class489 {
    private static double method10821(double d2, double d3, double d4) {
        return Class5659.method22171(d2, d3, d4);
    }

    private static int method10822(int n2, int n3, Class126 class126, Class21 class21) {
        return Class5534.method21757(n2, n3, class126, class21);
    }

    private static double method10823(double d2, double d3, double d4) {
        return Class6023.method23738(d2, d3, d4);
    }

    private static double method10824(double d2, int n2) {
        return Class1004.method12743(d2, n2);
    }

    @Override
    public double method10803(double a2) {
        if (a2 == 0.0) {
            double d2 = 0.0;
            return Class1503.method14414(Class1682.field6236, 0.73322976f);
        }
        if (a2 == 1.0) {
            double d3 = 1.0;
            return Class507.method10824(Class3245.field6966, -380382335);
        }
        return a2 < 0.5 ? Math.pow(Class6389.field13222, Class1095.field4440 * a2 - Class1402.field5405) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * a2 + 10.0)) / Class1368.field5271;
    }

    private static double method10825(double d2, double d3, double d4) {
        return Class5659.method22191(d2, d3, d4);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

