/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 */
package mapped;

import mapped.Class3;
import mapped.Class8;
import net.minecraft.class_1297;

@Class3
public class Class209
extends Class8 {
    private final double field252;
    private final class_1297 field253;
    private final double field254;

    public Class209(class_1297 a2, double b2, double c2) {
        this.field253 = a2;
        this.field252 = b2;
        this.field254 = c2;
    }

    public static double method392(Class209 class209) {
        return class209.field252;
    }

    public double method393() {
        return Class209.method392(this);
    }

    public class_1297 method394() {
        return this.field253;
    }

    public double method395() {
        return this.field254;
    }
}

