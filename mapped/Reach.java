/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1;
import mapped.Class1143;
import mapped.Class1678;
import mapped.Class192;
import mapped.Class193;
import mapped.Class198;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class3349;
import mapped.Class3600;
import mapped.Class556;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Reach
extends Class278 {
    Class248 field520;
    private static long[] field521 = new long[1];
    Class248 field522 = this.method450(new Class252("BlockReach", "The extended block reach distance", Float.valueOf(Class1678.field6221), Float.valueOf(Class3349.field7246), Float.valueOf(Class1143.field4579)));
    Class248 field523;

    private static void method1738(long l2) {
        Reach.field521[0] = l2 ^ 0x8CFBF72897BEE575L;
    }

    public static Class248 method1739(Reach class293) {
        return class293.field522;
    }

    @Override
    public String method1248() {
        return Float.toString(((Float)this.field520.method507()).floatValue());
    }

    @Class1
    public void method1740(Class198 a2) {
        a2.method14((Boolean)this.field523.method507());
    }

    @Class1
    public void method1741(Class193 a2) {
        a2.method10();
        a2.method373(((Float)this.field520.method507()).floatValue());
    }

    public Reach() {
        super("Reach", "Extends player reach", Class556.field2754);
        this.field520 = this.method450(new Class252("EntityReach", "The extended entity reach distance", Float.valueOf(Class3600.field8029), Float.valueOf(3.0f), Float.valueOf(6.0f)));
        this.field523 = this.method450(new Class253("NoHitbox", "Ignores hitboxes allowing player to interact through entities", (boolean)field521[0]));
    }

    static {
        Reach.method1738(-8287758935528643211L);
    }

    @Class1
    public void method1742(Class192 a2) {
        a2.method10();
        a2.method373(((Float)Reach.method1739(this).method507()).floatValue());
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

