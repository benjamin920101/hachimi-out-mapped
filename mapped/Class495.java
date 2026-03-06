/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class489;
import mapped.Class5526;
import mapped.Class5659;
import mapped.Class6214;
import mapped.Class6284;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class Class495
extends Class489 {
    private static double method10814(double d2, double d3, double d4) {
        return Class5659.method22191(d2, d3, d4);
    }

    @Override
    public double method10803(double a2) {
        return a2 < 0.5 ? Math.pow(2.0 * a2, 2.0) * (7.189819 * a2 - Class6284.field12876) / 2.0 : (Math.pow(2.0 * a2 - 2.0, 2.0) * (3.5949095 * (a2 * 2.0 - Class5526.field10450) + Class6214.field12657) + 2.0) / 2.0;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

