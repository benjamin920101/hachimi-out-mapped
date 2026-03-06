/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1503;
import mapped.Class1679;
import mapped.Class337;
import mapped.Class414;
import mapped.Class489;
import mapped.Class5659;
import mapped.Class843;
import mapped.Class905;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class Class500
extends Class489 {
    private static double method10815(double d2, double d3, double d4) {
        return Class5659.method22171(d2, d3, d4);
    }

    @Override
    public double method10803(double a2) {
        double d2;
        if (a2 == 0.0) {
            d2 = 0.0;
        } else {
            if (a2 == 1.0) {
                double d3 = 1.0;
                return Class5659.method22191(0.6514018114986141, 0.7498687173442059, 0.392514584497924);
            }
            d2 = -Math.pow(Class1679.field6226, 10.0 * a2 - 10.0) * Math.sin((a2 * 10.0 - 10.75) * Class843.field3692);
        }
        return d2;
    }

    private static double method10816(float f2, float f3) {
        return Class1503.method14426(f2, f3);
    }

    private static int method10817(int n2, int n3, Class337 class337, Class414 class414) {
        return Class905.method12573(n2, n3, class337, class414);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

