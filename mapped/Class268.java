/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package mapped;

import mapped.Class248;
import mapped.Class261;
import mapped.Class266;
import mapped.Class276;
import net.minecraft.class_332;

public abstract class Class268
extends Class266 {
    protected final Class276 field353;
    protected final Class248 field354;

    public abstract void method825(class_332 var1, float var2, float var3, float var4, float var5, float var6);

    @Override
    public void method707(class_332 a2, float b2, float c2, float d2) {
        this.method825(a2, this.field340, this.field337, b2, c2, d2);
    }

    public Class248 method826() {
        return this.field354;
    }

    public Class268(Class261 a2, Class276 b2, Class248 c2, float d2, float e2) {
        super(a2, d2, e2, 91.0f, 13.0f);
        this.field353 = b2;
        this.field354 = c2;
    }
}

