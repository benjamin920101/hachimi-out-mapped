/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 */
package mapped;

import mapped.Class1;
import mapped.Class1151;
import mapped.Class1568;
import mapped.Class248;
import mapped.Class252;
import mapped.Class278;
import mapped.Class3563;
import mapped.Class556;
import mapped.Class5836;
import mapped.Class6062;
import mapped.Class97;
import net.minecraft.class_1268;
import net.minecraft.class_4587;
import net.minecraft.class_7833;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class306
extends Class278 {
    Class248 field620;
    Class248 field621;
    Class248 field622;
    Class248 field623 = this.method450(new Class252("X", "Translation in x-direction", Float.valueOf(-3.0f), Float.valueOf(0.0f), Float.valueOf(Class6062.field12180)));
    Class248 field624;
    Class248 field625;
    Class248 field626;
    Class248 field627;
    Class248 field628;

    public static class_7833 method2212() {
        return class_7833.field_40716;
    }

    private static Object method2213(Class248 class248) {
        return class248.method507();
    }

    public Class306() {
        super("ViewModel", "Changes the first-person viewmodel", Class556.field2759);
        this.field620 = this.method450(new Class252("Y", "Translation in y-direction", Float.valueOf(Class3563.field7913), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.field625 = this.method450(new Class252("Z", "Translation in z-direction", Float.valueOf(Class1568.field5874), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.field627 = this.method450(new Class252("ScaleX", "Scaling in x-direction", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(2.0f)));
        this.field622 = this.method450(new Class252("ScaleY", "Scaling in y-direction", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(2.0f)));
        this.field624 = this.method450(new Class252("ScaleZ", "Scaling in z-direction", Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(2.0f)));
        this.field621 = this.method450(new Class252("RotateX", "Rotation in x-direction", Float.valueOf(-180.0f), Float.valueOf(0.0f), Float.valueOf(180.0f)));
        this.field626 = this.method450(new Class252("RotateY", "Rotation in y-direction", Float.valueOf(-180.0f), Float.valueOf(0.0f), Float.valueOf(180.0f)));
        this.field628 = this.method450(new Class252("RotateZ", "Rotation in z-direction", Float.valueOf(-180.0f), Float.valueOf(0.0f), Float.valueOf(Class1151.field4604)));
    }

    private static Object method2214(Class248 class248) {
        return class248.method507();
    }

    public static class_4587 method2215(Class97 class97) {
        return class97.field135;
    }

    public static class_7833 method2216() {
        return class_7833.field_40714;
    }

    private static void method2217() {
        Class5836.method22885();
    }

    private static class_7833 method2218() {
        return Class306.method2216();
    }

    @Class1
    public void method2219(Class97 a2) {
        a2.field135.method_22905(((Float)Class306.method2213(this.field627)).floatValue(), ((Float)this.field622.method507()).floatValue(), ((Float)this.field624.method507()).floatValue());
        a2.field135.method_22907(Class306.method2218().rotationDegrees(((Float)this.field621.method507()).floatValue()));
        if (a2.field134 == Class306.method2220()) {
            Class306.method2215(a2).method_46416(((Float)this.field623.method507()).floatValue(), ((Float)this.field620.method507()).floatValue(), ((Float)this.field625.method507()).floatValue());
            a2.field135.method_22907(Class306.method2212().rotationDegrees(((Float)this.field626.method507()).floatValue()));
            a2.field135.method_22907(class_7833.field_40718.rotationDegrees(((Float)this.field628.method507()).floatValue()));
        } else {
            a2.field135.method_46416(-((Float)Class306.method2214(this.field623)).floatValue(), ((Float)this.field620.method507()).floatValue(), ((Float)this.field625.method507()).floatValue());
            a2.field135.method_22907(class_7833.field_40716.rotationDegrees(-((Float)this.field626.method507()).floatValue()));
            Class306.method2221(a2).method_22907(class_7833.field_40718.rotationDegrees(-((Float)this.field628.method507()).floatValue()));
        }
    }

    public static class_1268 method2220() {
        return class_1268.field_5808;
    }

    public static class_4587 method2221(Class97 class97) {
        return class97.field135;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

