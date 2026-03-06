/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\ub73a\ub73a\ub73d\ub738\ub73c\ub73e\ub73d", "\u4209\u4209\u420c\u420d\u420c\u420c\u4209\u4202", "\u40b6\u40bb\u40b7\u40b7\u40b2\u40ba\u40b0\u40b1", "\ue6aa\ue6a6\ue6ab\ue6a6\ue6a9\ue6a6\ue6ad\ue6aa", "\u9024\u9024\u9027\u9026\u9024\u9021\u9028\u9027", "\u8396\u8398\u8398\u8392\u8392\u8390\u8393\u8391", "\u43ad\u43a9\u43ac\u43ab\u43ac\u43a2\u43a9", "\u0f25\u0f23\u0f21\u0f2f\u0f21\u0f20\u0f27\u0f2f", "\u07b6\u07b1\u07b7\u07b5\u07b7\u07b2\u07b0\u07bd", "\u4c8e\u4c84\u4c88\u4c8e\u4c84\u4c8f\u4c8f\u4c8f", "\u9f32\u9f35\u9f35\u9f31\u9f34\u9f31\u9f38\u9f35", "\ue17f\ue17e\ue175\ue17f\ue17f\ue17d\ue178\ue17c", "\u3505\u3509\u3508\u3507\u3508\u3505\u3506\u3500", "\uc2ad\uc2af\uc2a3\uc2aa\uc2a2\uc2ac\uc2ae", "\ud191\ud190\ud19a\ud194\ud19b\ud197\ud195\ud191", "\ub73d\ub734\ub73b\ub738\ub73b\ub73b\ub739\ub734"}, d2={"\u04af\u0483\u04ba\u24ce\u04fc\u04fe\u04e8\u048c\u04aa\u04a1\u04b6\u04a1\u04ef\u04ac\u04a1\u04ae\u04a7\u04ef\u0493\u04b4\u04b2\u04a9\u04ae\u04a7\u04fb\u04e9\u048c\u04aa\u04a1\u04b6\u04a1\u04ef\u04ac\u04a1\u04ae\u04a7\u04ef\u0493\u04b4\u04b2\u04a9\u04ae\u04a7\u04fb", "\u05b2\u059e\u059c\u25d3\u05e1\u05e3\u05f5\u0591\u05b7\u05bc\u05ab\u05bc\u05f2\u05b1\u05bc\u05b3\u05ba\u05f2\u058e\u05a9\u05af\u05b4\u05b3\u05ba\u05e6\u05f4\u0591\u05b7\u05bc\u05ab\u05bc\u05f2\u05b1\u05bc\u05b3\u05ba\u05f2\u058e\u05a9\u05af\u05b4\u05b3\u05ba\u05e6", "\u0677\u0628\u0627\u0622\u0625\u0622\u063f\u0675\u0677\u0675\u0663\u0662\u061d", "\u05f9\u05ac\u05ab\u05ac\u05b1\u05fb\u05f9\u05fb\u05ed\u05ec\u0593", "\u0718\u071a\u070b\u073c\u0713\u071e\u070c\u070c\u0743\u0741\u0757\u0756\u0733\u0715\u071e\u0709\u071e\u0750\u0713\u071e\u0711\u0718\u0750\u073c\u0713\u071e\u070c\u070c\u0744", "\u07e4\u07ed\u07ff\u07e4\u07cf\u07e3\u07e8\u07e9\u07b0\u07b2\u07a4\u07a5\u07c5", "\u0498\u048c\u0488\u049c\u0491\u048e\u04c1\u04c3\u04d5\u04b1\u0497\u049c\u048b\u049c\u04d2\u0491\u049c\u0493\u049a\u04d2\u04b2\u049f\u0497\u0498\u049e\u0489\u04c6\u04d4\u04a7", "\u0699\u0696\u0695\u0694\u069f\u06c6\u06c4\u06d2\u06d3\u06b6\u0690\u069b\u068c\u069b\u06d5\u0696\u069b\u0694\u069d\u06d5\u06b5\u0698\u0690\u069f\u0699\u068e\u06c1", "\u062a\u0631\u060d\u062a\u062c\u0637\u0630\u0639\u0662\u0660\u0676\u0677\u0612\u0634\u063f\u0628\u063f\u0671\u0632\u063f\u0630\u0639\u0671\u060d\u062a\u062c\u0637\u0630\u0639\u0665", "\u02fc\u02fd\u02e6\u02fb\u02f4\u02eb\u02ae\u02ac\u02ba\u02bb\u02c4", "\u05cc\u05cd\u05d6\u05cb\u05c4\u05db\u05e3\u05ce\u05ce\u059e\u059c\u058a\u058b\u05f4", "\u01bf\u01a9\u01a1\u01bc\u01f4\u01f6\u01e0\u01e1\u019e", "\u03a2\u03b4\u03bc\u03a1\u03e9\u03eb\u03fd\u039f\u03fc\u0383", "\u045b\u044d\u0445\u0458\u041c\u0410\u0412\u0404\u0466\u0405\u047a", "\u06eb\u06fd\u06f5\u06e8\u06a0\u06a2\u06b4\u06d6\u06d5\u06b5\u06ca", "\u072c\u0723\u0724\u072b\u0726\u0723\u0730\u072f\u0776\u0774\u0762\u0763\u071c"})
public final class Class1566 {
    public static double field5863;
    public static double field5864;
    public static float field5865;
    public static float field5866;

    /*
     * WARNING - void declaration
     */
    private static CallSite UyTFNFTD78OelZ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1566.bJ2Kx3D7g9urwgyP(k2, -2035016023));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1566.bJ2Kx3D7g9urwgyP(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1566.bJ2Kx3D7g9urwgyP(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1566.bJ2Kx3D7g9urwgyP(k2, -2035016023) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        i\u200e = "";
        o\u200e = "Firework";
        field5864 = Double.longBitsToDouble(4595066147808307352L);
        field5865 = Float.intBitsToFloat(1064790919);
        field5863 = Double.longBitsToDouble(4598597454003894726L);
        field5866 = Float.intBitsToFloat(1051008170);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String bJ2Kx3D7g9urwgyP(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 >= a2.length() ? 46155 : 46154;
            block5: while (true) {
                switch (n2) {
                    case 46155: {
                        n2 = 46153;
                        continue block5;
                    }
                    case 46154: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

