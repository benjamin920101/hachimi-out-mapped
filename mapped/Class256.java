/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1170;
import mapped.Class1503;
import mapped.Class253;
import mapped.Class3814;
import mapped.MainHand;
import mapped.Kit;

class Class256
extends Class253 {
    final Kit field317;
    private static long[] field318 = new long[1];

    @Override
    public void method505(Object object) {
        this.method583((Boolean)object);
    }

    private static int method594(int n2, int n3, MainHand class404, Class3814 class3814) {
        return Class1170.method13160(n2, n3, class404, class3814);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void method583(Boolean a2) {
        this.field305 = (boolean)field318[0];
        int n2 = a2 == false ? 41718 : 41719;
        block4: while (true) {
            switch (n2) {
                case 41719: {
                    n2 = 41717;
                    continue block4;
                }
                case 41718: {
                    Class256.method596(this.field317, (String)this.field317.field2384.method507());
                    return;
                }
            }
            break;
        }
    }

    private static void method595(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    Class256(Kit a2, String b2, String c2, Boolean d2) {
        this.field317 = a2;
        super(b2, c2, d2);
    }

    private static void method596(Kit class454, String string) {
        class454.method10548(string);
    }

    static {
        Class256.method598(8928175400997121206L);
    }

    private static void method597(long l2) {
        Class256.field318[0] = l2 ^ 0x7BE7403944D06CB7L;
    }

    private static void method598(long l2) {
        Class256.method597(l2);
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}

