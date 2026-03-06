/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class248;
import mapped.Class251;
import mapped.Class253;
import mapped.Class451;
import mapped.Class556;
import mapped.Class87;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Socials
extends Class451 {
    private static long[] field2413 = new long[3];
    Class248 field2414 = this.method450(new Class253("Friends", "Allows friend system to function", (boolean)field2413[2]));
    Class248 field2415 = this.method450(new Class253("AddNotify", "Notifies players when you add them as a friend", (boolean)field2413[0], this::method10629));
    Class248 field2416 = this.method450(new Class251("FriendsColor", "The color for friends in the client", new Color((int)field2413[1]), (boolean)field2413[0], (boolean)field2413[0], this::method10628));
    private static Socials INSTANCE;

    public boolean method10622() {
        return (Boolean)this.field2414.method507();
    }

    public Socials() {
        super("Socials", "The client socials system", Class556.field2757);
        INSTANCE = this;
    }

    public static Socials method10623() {
        return INSTANCE;
    }

    public boolean method10624() {
        return (Boolean)this.field2415.method507();
    }

    public static Class248 method10625(Socials class458) {
        return class458.field2414;
    }

    private static void method10626(long l2) {
        Socials.field2413[1] = l2 ^ 0x347CBF3FE5396A33L;
        Socials.field2413[0] = l2 ^ 0xCB8340C01A5F95CCL;
        Socials.field2413[2] = l2 ^ 0xCB8340C01A5F95CDL;
    }

    public int method10627() {
        return this.method10630().getRGB();
    }

    private Boolean method10628() {
        return (Boolean)this.field2414.method507();
    }

    private Boolean method10629() {
        return (Boolean)Socials.method10625(this).method507();
    }

    public Color method10630() {
        return (Color)this.field2416.method507();
    }

    static {
        Socials.method10626(-3782108068240714292L);
    }

    @Class1
    public void method10631(Class87 a2) {
        a2.method175(this.method10627());
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

