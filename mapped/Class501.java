/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1513;
import mapped.Class1540;
import mapped.Class489;
import mapped.Class5546;
import mapped.Class5659;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class Class501
extends Class489 {
    private static double method10818(double d2, double d3, double d4) {
        return Class5659.method22191(d2, d3, d4);
    }

    @Override
    public double method10803(double a2) {
        return a2 < 0.5 ? Class1513.field5710 * Math.pow(a2, 4.0) : 1.0 - Math.pow(Class5546.field10497 * a2 + 2.0, 4.0) / Class1540.field5784;
    }

    private static double method10819(double d2, double d3, double d4) {
        return Class5659.method22171(d2, d3, d4);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

