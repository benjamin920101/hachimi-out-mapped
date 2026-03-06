/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class1;
import mapped.Class1503;
import mapped.Class248;
import mapped.Class260;
import mapped.Class278;
import mapped.Class42;
import mapped.Class556;
import mapped.Class5693;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class630;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class370
extends Class278 {
    Class248 field1213 = this.method450(new Class260("Sounds", "The sound to play for PM", Class630.field3080, Class370.method4857()));
    private static Class370 INSTANCE;

    public static Class370 method4852() {
        return INSTANCE;
    }

    public Class630 method4853() {
        return (Class630)((Object)this.field1213.method507());
    }

    @Class1
    public void method4854(Class42 a2) {
        String b2 = a2.method81().getString();
        if (!b2.startsWith("<")) {
            if (b2.contains("whispers:") || b2.contains("says:")) {
                Class5723.field11041.method22448(switch (((Class630)((Object)this.field1213.method507())).ordinal()) {
                    default -> throw new MatchException(null, null);
                    case 0 -> Class5693.field10944;
                    case 1 -> Class5693.field10947;
                    case 2 -> Class5693.field10945;
                    case 3 -> Class5693.field10949;
                });
            }
        }
    }

    private static void method4855() {
        Class1503.method14420();
    }

    private static void method4856(float f2) {
        Class5836.method22907(f2);
    }

    private static Class630[] method4857() {
        return Class630.values();
    }

    public Class370() {
        super("PMSound", "Plays a sound for private messages", Class556.field2756);
        INSTANCE = this;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

