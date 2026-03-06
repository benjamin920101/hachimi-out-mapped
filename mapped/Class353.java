/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket
 *  net.minecraft.network.packet.s2c.play.BundleS2CPacket
 */
package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import mapped.Class1;
import mapped.Class106;
import mapped.Class122;
import mapped.Class124;
import mapped.Class133;
import mapped.Class1503;
import mapped.Class167;
import mapped.Class208;
import mapped.Class21;
import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class278;
import mapped.Class4146;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6322;
import net.hachimi.client.mixin.c;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.BundleS2CPacket;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Class353
extends Class278 {
    private static long[] field1056 = new long[5];
    Class248 field1057;
    Class248 field1058;
    Class248 field1059;
    Class248 field1060 = this.method450(new Class253("NoSwitchAnimation", "Removes the animation when switching items", (boolean)field1056[1]));
    Class248 field1061;
    Class248 field1062 = this.method450(new Class253("OldSwingAnimation", "Reverts to the 1.8 swinging animations", (boolean)field1056[1]));
    Class248 field1063;
    Class248 field1064;
    Class248 field1065;

    private static Object method4272(Class248 class248) {
        return class248.method507();
    }

    private static void method4273(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    @Class1
    public void method4274(Class167 a2) {
        if (((Boolean)this.field1062.method507()).booleanValue()) {
            a2.method10();
        }
    }

    @Class1
    public void method4275(Class106 a2) {
        if (((Boolean)Class353.method4278(Class353.method4288(this))).booleanValue()) {
            a2.method10();
            Class353.method4277(a2, 0.0f);
        }
    }

    private static void method4276(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method4277(Class106 class106, float f2) {
        class106.method191(f2);
    }

    private static Object method4278(Class248 class248) {
        return class248.method507();
    }

    private static Object method4279(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method4280(Class208 a2) {
        if (((Boolean)this.field1060.method507()).booleanValue()) {
            a2.method10();
        }
    }

    private Boolean method1269() {
        return (Boolean)this.field1059.method507();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Class1
    public void method4281(Class133 f2) {
        int n2;
        class_2616 e2;
        if (Class353.field290.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = f2.method251();
        if (!(class_25962 instanceof class_8042)) {
            class_25962 = f2.method251();
            if (!(class_25962 instanceof class_2616)) return;
            e2 = (class_2616)class_25962;
            n2 = ((Boolean)Class353.method4272(this.field1062)).booleanValue() ? 1476 : 1477;
        } else {
            class_8042 d2 = (class_8042)class_25962;
            ArrayList<class_2596> c2 = new ArrayList<class_2596>();
            Iterator iterator = d2.method_48324().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    ((c)d2).setIterable(c2);
                    Class4146.method20694();
                    return;
                }
                class_2596 b2 = (class_2596)iterator.next();
                if (b2 instanceof class_2616) {
                    class_2616 a2 = (class_2616)b2;
                    if (((Boolean)Class353.method4292(this).method507()).booleanValue() && a2.method_11269() == Class353.field290.field_1724.method_5628() && (a2.method_11267() == 0 || a2.method_11267() == (int)field1056[4])) continue;
                }
                c2.add(b2);
            }
        }
        block5: while (true) {
            switch (n2) {
                case 1477: {
                    n2 = 1475;
                    continue block5;
                }
                case 1476: {
                    if (e2.method_11269() != Class353.field290.field_1724.method_5628() || e2.method_11267() != 0 && e2.method_11267() != (int)field1056[4]) return;
                    f2.method10();
                    return;
                }
            }
            break;
        }
    }

    private static void method4282() {
        Class5836.method22890();
    }

    private static void method4283() {
        Class5836.method22890();
    }

    private static void method4284() {
        Class5836.method22897();
    }

    static {
        Class353.method4287(-8175834399936236313L);
    }

    @Class1
    public void method4285(Class124 a2) {
        if (((Boolean)this.field1061.method507()).booleanValue()) {
            a2.method10();
            a2.method234(((Float)this.field1058.method507()).floatValue());
        }
    }

    public static Class248 method4286(Class353 class353) {
        return class353.field1057;
    }

    private static void method4287(long l2) {
        Class353.field1056[1] = l2 ^ 0x8E8999EE4161B4E7L;
        Class353.field1056[2] = l2 ^ 0x8E8999EE4161B4F3L;
        Class353.field1056[0] = l2 ^ 0x8E8999EE4161B4E1L;
        Class353.field1056[3] = l2 ^ 0x8E8999EE4161B4E6L;
        Class353.field1056[4] = l2 ^ 0x8E8999EE4161B4E4L;
    }

    private static Class248 method4288(Class353 class353) {
        return Class353.method4286(class353);
    }

    @Class1
    public void method4289(Class122 a2) {
        if (((Boolean)Class353.method4294(this).method507()).booleanValue() && ((Boolean)this.field1064.method507()).booleanValue()) {
            a2.method226().method_23327(a2.method228(), a2.method225(), a2.method227());
            a2.method226().method_36456(a2.method229());
            a2.method226().method_36457(a2.method224());
        }
    }

    private Boolean method4290() {
        return (Boolean)this.field1057.method507();
    }

    private static void method4291() {
        Class6009.method23560();
    }

    public static Class248 method4292(Class353 class353) {
        return class353.field1062;
    }

    public Class353() {
        super("Animations", "Allows you to modify vanilla animations", Class556.field2759);
        this.field1059 = this.method450(new Class253("SwingSpeed", "Allows you to modify your swing speed.", (boolean)field1056[1]));
        this.field1065 = this.method450(new Class252("SwingFactor", "The speed of your swing.", (Number)((int)field1056[3]), (Number)((int)field1056[0]), (Number)((int)field1056[2]), this::method1269));
        this.field1063 = this.method450(new Class253("SelfOnly", "Make the module only affect yourself", (boolean)field1056[3]));
        this.field1061 = this.method450(new Class253("EatTransform", "Transforms the first person eating animation", (boolean)field1056[1]));
        this.field1058 = this.method450(new Class252("EatTransform-Factor", "Factor for the first person eating animation", (Number)Float.valueOf(0.0f), (Number)Float.valueOf(0.99f), (Number)Float.valueOf(4.0f), this::method1278));
        this.field1057 = this.method450(new Class253("NoLimbSwing", "Allows you to cancel limb swing animations", (boolean)field1056[1]));
        this.field1064 = this.method450(new Class253("NoInterpolation", "Entities will be rendered at their server positions", (boolean)field1056[1], this::method4290));
    }

    private static void method4293(boolean bl2) {
        Class6009.method23559(bl2);
    }

    public static Class248 method4294(Class353 class353) {
        return class353.field1057;
    }

    private static void method4295(Class21 class21, boolean bl2) {
        class21.method41(bl2);
    }

    private static void method4296(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    @Class1
    public void method4297(Class21 a2) {
        if (((Boolean)this.field1059.method507()).booleanValue()) {
            a2.method10();
            a2.method44((Integer)this.field1065.method507());
            Class353.method4295(a2, (Boolean)this.field1063.method507());
        }
    }

    private Boolean method1278() {
        return (Boolean)Class353.method4279(this.field1061);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

