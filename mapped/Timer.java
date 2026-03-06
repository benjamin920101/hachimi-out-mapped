/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.text.DecimalFormat;
import mapped.Class1;
import mapped.Class170;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Speed;
import mapped.Class3978;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class6100;
import mapped.Class63;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Timer
extends Class278 {
    Class248 field869;
    private float field870 = -1.0f;
    private float field871 = 1.0f;
    private static Timer INSTANCE;
    private static long[] field872;
    Class248 field873 = this.method450(new Class252("Ticks", "The game tick speed", Float.valueOf(0.1f), Float.valueOf(2.0f), Float.valueOf(50.0f)));

    static {
        field872 = new long[1];
        Timer.method3080(-8338019561889162758L);
    }

    public void method3074() {
        if (this.field870 > 0.0f) {
            this.field871 = this.field870;
            this.field870 = -1.0f;
        }
    }

    public float method3075() {
        return this.field871;
    }

    private static Speed method3076() {
        return Speed.method4109();
    }

    public static Timer method3077() {
        if (INSTANCE == null) {
            INSTANCE = new Timer();
        }
        return INSTANCE;
    }

    public static void method3078(Timer class335, float f2) {
        class335.field871 = f2;
    }

    public static void method3079(Timer class335, float f2) {
        class335.field870 = f2;
    }

    @Override
    public String method1248() {
        DecimalFormat a2 = new DecimalFormat("0.0#");
        return a2.format(this.field871);
    }

    @Override
    public void method1273() {
        Timer.method3076().method4104();
        if (Timer.method3081(Timer.method3090())) {
            return;
        }
        super.method1273();
    }

    private static void method3080(long l2) {
        Timer.method3088(l2);
    }

    private static boolean method3081(Speed class352) {
        return class352.method4058();
    }

    private static void method3082(Class3978 class3978, float f2) {
        class3978.method19512(f2);
    }

    private static void method3083(Timer class335, float f2) {
        Timer.method3078(class335, f2);
    }

    public void method3084(float a2) {
        Timer.method3079(this, this.field871);
        this.field871 = a2;
    }

    @Class1
    public void method3085(Class63 a2) {
        if (a2.method128() == Class543.field2690) {
            if (Timer.method3089().method4058()) {
                return;
            }
            if (((Boolean)this.field869.method507()).booleanValue()) {
                Timer.method3083(this, Math.max(Class5723.field11047.method19525() / Class6100.field12298, 0.1f));
                return;
            }
            this.field871 = ((Float)this.field873.method507()).floatValue();
        }
    }

    private static void method3086(Class170 class170, float f2) {
        class170.method327(f2);
    }

    @Class1
    public void method3087(Class170 a2) {
        if (this.field871 != 1.0f) {
            a2.method10();
            Timer.method3086(a2, this.field871);
        }
    }

    private static void method3088(long l2) {
        Timer.field872[0] = l2 ^ 0x8C4967629B5699FAL;
    }

    private static Speed method3089() {
        return Speed.method4109();
    }

    @Override
    public void method1279() {
        Timer.method3082(Class5723.field11047, 1.0f);
    }

    private static Speed method3090() {
        return Speed.method4109();
    }

    public Timer() {
        super("Timer", "Changes the client tick speed", Class556.field2756);
        this.field869 = this.method450(new Class253("TPSSync", "Syncs game tick speed to server tick speed", (boolean)field872[0]));
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

