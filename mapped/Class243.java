/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.minecraft.util.math.Vec3d
 */
package mapped;

import com.google.gson.JsonObject;
import mapped.Class244;
import mapped.Class925;
import mapped.Class926;
import net.minecraft.util.math.Vec3d;

public class Class243
extends Class244 {
    private final int field280;
    double field281;
    double field282;
    private final Class925 field283;
    private final String field284;
    double field285;

    public Class243(String a2, String b2, int c2, double d2, double e2, double f2) {
        super(a2);
        this.field284 = b2;
        this.field280 = c2;
        this.field285 = d2;
        this.field282 = e2;
        this.field281 = f2;
        this.field283 = new Class926();
    }

    private static double method436(Class243 class243) {
        return class243.method440();
    }

    public int method437() {
        return this.field280;
    }

    @Override
    public JsonObject method438() {
        JsonObject a2 = new JsonObject();
        a2.addProperty("tag", this.method446());
        a2.addProperty("ip", this.method445());
        a2.addProperty("dimension", (Number)this.method437());
        a2.addProperty("x", (Number)this.method444());
        a2.addProperty("y", (Number)this.method439());
        a2.addProperty("z", (Number)this.method440());
        return a2;
    }

    public double method439() {
        return Class243.method442(this);
    }

    public double method440() {
        return this.field281;
    }

    private boolean method441(long a2) {
        return this.field283.method12595(a2);
    }

    public static double method442(Class243 class243) {
        return class243.field282;
    }

    public class_243 method443() {
        return new class_243(this.method444(), this.method439(), Class243.method436(this));
    }

    public double method444() {
        return this.field285;
    }

    public String method445() {
        return this.field284;
    }

    private static Object I(char c2) {
        return ((Object[])I)[c2];
    }
}

