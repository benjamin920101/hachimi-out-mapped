/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 */
package mapped;

import mapped.Class248;
import mapped.Class252;
import mapped.Class253;
import mapped.Class257;
import mapped.Class278;
import mapped.Class556;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class XRay
extends Class278 {
    Class248 field801;
    private static long[] field802 = new long[31];
    Class248 field803 = this.method450(new Class252("Opacity", "The opacity of the blocks in wallhack", (int)field802[20], (int)field802[0], (int)field802[16]));
    Class248 field804;

    static {
        XRay.method2893(-5413350879947592732L);
    }

    private static void method2893(long l2) {
        XRay.field802[14] = l2 ^ 0xB4DFEA0E4C2CEBF2L;
        XRay.field802[19] = l2 ^ 0xB4DFEA0E4C2CEBFCL;
        XRay.field802[17] = l2 ^ 0xB4DFEA0E4C2CEBE0L;
        XRay.field802[21] = l2 ^ 0xB4DFEA0E4C2CEBF5L;
        XRay.field802[22] = l2 ^ 0xB4DFEA0E4C2CEBEBL;
        XRay.field802[16] = l2 ^ 0xB4DFEA0E4C2CEB1BL;
        XRay.field802[28] = l2 ^ 0xB4DFEA0E4C2CEBF7L;
        XRay.field802[23] = l2 ^ 0xB4DFEA0E4C2CEBF0L;
        XRay.field802[18] = l2 ^ 0xB4DFEA0E4C2CEBEDL;
        XRay.field802[26] = l2 ^ 0xB4DFEA0E4C2CEBE9L;
        XRay.field802[1] = l2 ^ 0xB4DFEA0E4C2CEBFFL;
        XRay.field802[9] = l2 ^ 0xB4DFEA0E4C2CEBECL;
        XRay.field802[25] = l2 ^ 0xB4DFEA0E4C2CEBF8L;
        XRay.field802[5] = l2 ^ 0xB4DFEA0E4C2CEBEFL;
        XRay.field802[10] = l2 ^ 0xB4DFEA0E4C2CEBF4L;
        XRay.field802[7] = l2 ^ 0xB4DFEA0E4C2CEBEAL;
        XRay.field802[29] = l2 ^ 0xB4DFEA0E4C2CEBE8L;
        XRay.field802[8] = l2 ^ 0xB4DFEA0E4C2CEBE3L;
        XRay.field802[4] = l2 ^ 0xB4DFEA0E4C2CEBEEL;
        XRay.field802[20] = l2 ^ 0xB4DFEA0E4C2CEBE4L;
        XRay.field802[0] = l2 ^ 0xB4DFEA0E4C2CEB9CL;
        XRay.field802[3] = l2 ^ 0xB4DFEA0E4C2CEBE7L;
        XRay.field802[27] = l2 ^ 0xB4DFEA0E4C2CEBE6L;
        XRay.field802[12] = l2 ^ 0xB4DFEA0E4C2CEBF1L;
        XRay.field802[30] = l2 ^ 0xB4DFEA0E4C2CEBE1L;
        XRay.field802[6] = l2 ^ 0xB4DFEA0E4C2CEBE2L;
        XRay.field802[11] = l2 ^ 0xB4DFEA0E4C2CEBFEL;
        XRay.field802[13] = l2 ^ 0xB4DFEA0E4C2CEBF6L;
        XRay.field802[15] = l2 ^ 0xB4DFEA0E4C2CEBF3L;
        XRay.field802[2] = l2 ^ 0xB4DFEA0E4C2CEBE5L;
        XRay.field802[24] = l2 ^ 0xB4DFEA0E4C2CEBFDL;
    }

    public XRay() {
        super("XRay", "Allows you to see through solid blocks", Class556.field2759);
        this.field801 = this.method450(new Class253("SoftReload", "Reloads world renders without causing game interruption", (boolean)field802[2]));
        class_2248[] class_2248Array = new class_2248[(int)field802[25]];
        class_2248Array[(int)XRay.field802[20]] = class_2246.field_10013;
        class_2248Array[(int)XRay.field802[2]] = class_2246.field_10442;
        class_2248Array[(int)XRay.field802[27]] = class_2246.field_10212;
        class_2248Array[(int)XRay.field802[3]] = class_2246.field_10571;
        class_2248Array[(int)XRay.field802[17]] = class_2246.field_10418;
        class_2248Array[(int)XRay.field802[30]] = class_2246.field_10090;
        class_2248Array[(int)XRay.field802[6]] = class_2246.field_10080;
        class_2248Array[(int)XRay.field802[8]] = class_2246.field_27120;
        class_2248Array[(int)XRay.field802[9]] = class_2246.field_29220;
        class_2248Array[(int)XRay.field802[18]] = class_2246.field_29029;
        class_2248Array[(int)XRay.field802[4]] = class_2246.field_29027;
        class_2248Array[(int)XRay.field802[5]] = class_2246.field_29026;
        class_2248Array[(int)XRay.field802[29]] = class_2246.field_29219;
        class_2248Array[(int)XRay.field802[26]] = class_2246.field_29028;
        class_2248Array[(int)XRay.field802[7]] = class_2246.field_29030;
        class_2248Array[(int)XRay.field802[22]] = class_2246.field_29221;
        class_2248Array[(int)XRay.field802[10]] = class_2246.field_10375;
        class_2248Array[(int)XRay.field802[21]] = class_2246.field_10181;
        class_2248Array[(int)XRay.field802[13]] = class_2246.field_22108;
        class_2248Array[(int)XRay.field802[28]] = class_2246.field_10234;
        class_2248Array[(int)XRay.field802[23]] = class_2246.field_10201;
        class_2248Array[(int)XRay.field802[12]] = class_2246.field_10085;
        class_2248Array[(int)XRay.field802[14]] = class_2246.field_10205;
        class_2248Array[(int)XRay.field802[15]] = class_2246.field_27119;
        class_2248Array[(int)XRay.field802[19]] = class_2246.field_10327;
        class_2248Array[(int)XRay.field802[24]] = class_2246.field_10260;
        class_2248Array[(int)XRay.field802[11]] = class_2246.field_22109;
        class_2248Array[(int)XRay.field802[1]] = class_2246.field_23077;
        this.field804 = this.method450(new Class257("Blocks", "Valid block whitelist for wallhack", class_2248Array));
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

