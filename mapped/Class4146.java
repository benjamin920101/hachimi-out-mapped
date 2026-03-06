/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JWindow;
import mapped.Class3979;
import mapped.Class531;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class4146 {
    public static JWindow field9638;
    private static long[] field9639;

    public static void method20694() {
        try {
            field9638 = new JWindow();
            Class4146.method20698().setAlwaysOnTop((boolean)field9639[4]);
            field9638.setSize((int)field9639[0], (int)field9639[1]);
            Class4146.method20695().setLocationRelativeTo(null);
            field9638.setBackground(new Color((int)field9639[2], (int)field9639[2], (int)field9639[2], (int)field9639[2]));
            InputStream a2 = Class3979.method19568("assets/hachimi/textures/logo.png");
            BufferedImage b2 = ImageIO.read(a2);
            a2.close();
            int c2 = b2.getWidth() / (int)field9639[3];
            int d2 = b2.getHeight() / (int)field9639[3];
            BufferedImage e2 = new BufferedImage(c2, d2, b2.getType());
            Graphics2D f2 = e2.createGraphics();
            f2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            f2.drawImage(b2, (int)field9639[2], (int)field9639[2], c2, d2, null);
            f2.dispose();
            Class531 g2 = new Class531(e2);
            field9638.add(g2);
            field9638.setVisible((boolean)field9639[4]);
        }
        catch (Exception h2) {
            h2.printStackTrace();
        }
    }

    public static JWindow method20695() {
        return field9638;
    }

    static {
        field9639 = new long[5];
        Class4146.method20696(-54029051288484685L);
    }

    private static void method20696(long l2) {
        Class4146.field9639[2] = l2 ^ 0xFF400CDD366604B3L;
        Class4146.field9639[4] = l2 ^ 0xFF400CDD366604B2L;
        Class4146.field9639[1] = l2 ^ 0xFF400CDD366604D3L;
        Class4146.field9639[0] = l2 ^ 0xFF400CDD366605BBL;
        Class4146.field9639[3] = l2 ^ 0xFF400CDD366604B7L;
    }

    public static void method20697() {
        if (field9638 != null) {
            field9638.setVisible((boolean)field9639[2]);
            field9638.dispose();
            field9638 = null;
        }
    }

    public static JWindow method20698() {
        return field9638;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

