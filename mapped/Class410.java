/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1;
import mapped.Class169;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class556;
import mapped.Class73;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class410
extends Class278 {
    private static long[] field1516 = new long[2];
    Class248 field1517;
    Class248 field1518 = this.method450(new Class253("Break", "Allows you break when using", (boolean)field1516[0]));

    private static void method6461(long l2) {
        Class410.field1516[0] = l2 ^ 0x5EF0C5FBC7314E43L;
        Class410.field1516[1] = l2 ^ 0x5EF0C5FBC7314E42L;
    }

    @Class1
    public void method6462(Class73 a2) {
        if (((Boolean)this.field1518.method507()).booleanValue()) {
            a2.method10();
        }
    }

    public Class410() {
        super("MultiTask", "Allows you to mine and use items simultaneously", Class556.field2754);
        this.field1517 = this.method450(new Class253("Attack", "Allows you attack when using", (boolean)field1516[1]));
    }

    static {
        Class410.method6461(6841185519145143874L);
    }

    @Class1
    public void method6463(Class169 a2) {
        if (((Boolean)this.field1517.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

