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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\u6781\u6786\u678d\u6785\u6785\u678c\u6781\u6781", "\u0973\u0972\u097c\u0971\u0976\u0976\u0971", "\ua550\ua552\ua554\ua556\ua554\ua557\ua550\ua550", "\uad79\uad72\uad7a\uad7d\uad7c\uad7c\uad78\uad7d", "\u5907\u5905\u590c\u590d\u5903\u590c\u5905\u5904", "\uba55\uba5f\uba51\uba5e\uba52\uba5e\uba56", "\udae4\udae4\udae1\udae2\udae8\udae1\udae9\udae6", "\u674e\u674e\u6748\u674d\u6745\u6745\u674e\u6748", "\ue47d\ue47f\ue479\ue47e\ue47b\ue47d\ue47d", "\u44c3\u44c5\u44c7\u44c6\u44c5\u44c3\u44c5\u44c6", "\u0762\u0763\u0764\u0766\u0760\u076f\u0761\u0764", "\u2a32\u2a31\u2a31\u2a3c\u2a37\u2a34\u2a35\u2a37", "\u1e1d\u1e1f\u1e1f\u1e1b\u1e18\u1e1e\u1e1d\u1e19", "\ue697\ue692\ue690\ue694\ue691\ue69d\ue697\ue697", "\u580e\u580f\u580b\u5804\u5809\u5804\u580f\u580d"}, d2={"\u0552\u0550\u057e\u253b\u0509\u050b\u051d\u0579\u055f\u0554\u0543\u0554\u051a\u0559\u0554\u055b\u0552\u051a\u0566\u0541\u0547\u055c\u055b\u0552\u050e\u051c\u0579\u055f\u0554\u0543\u0554\u051a\u0559\u0554\u055b\u0552\u051a\u0566\u0541\u0547\u055c\u055b\u0552\u050e", "q.!$#$9sqsed\u001b", "\u04df\u048a\u048d\u048a\u0497\u04dd\u04df\u04dd\u04cb\u04ca\u04b5", "\u07d7\u07d5\u07c4\u07f3\u07dc\u07d1\u07c3\u07c3\u078c\u078e\u0798\u0799\u07fc\u07da\u07d1\u07c6\u07d1\u079f\u07dc\u07d1\u07de\u07d7\u079f\u07f3\u07dc\u07d1\u07c3\u07c3\u078b", "\u07c3\u07ca\u07d8\u07c3\u07e8\u07c4\u07cf\u07ce\u0797\u0795\u0783\u0782\u07e2", "\u0544\u0550\u0554\u0540\u054d\u0552\u051d\u051f\u0509\u056d\u054b\u0540\u0557\u0540\u050e\u054d\u0540\u054f\u0546\u050e\u056e\u0543\u054b\u0544\u0542\u0555\u051a\u0508\u057b", "\u0544\u054b\u0548\u0549\u0542\u051b\u0519\u050f\u050e\u056b\u054d\u0546\u0551\u0546\u0508\u054b\u0546\u0549\u0540\u0508\u0568\u0545\u054d\u0542\u0544\u0553\u051c", "\u02a5\u02be\u0282\u02a5\u02a3\u02b8\u02bf\u02b6\u02ed\u02ef\u02f9\u02f8\u029d\u02bb\u02b0\u02a7\u02b0\u02fe\u02bd\u02b0\u02bf\u02b6\u02fe\u0282\u02a5\u02a3\u02b8\u02bf\u02b6\u02ea", "\u0511\u0510\u050b\u0516\u0519\u0506\u0543\u0541\u0557\u0556\u0529", "\u069e\u069f\u0684\u0699\u0696\u0689\u06b1\u069c\u069c\u06cc\u06ce\u06d8\u06d9\u06a6", "\u0756\u0740\u0748\u0755\u071d\u071f\u0709\u0708\u0777", "\u01d9\u01cf\u01c7\u01da\u0192\u0190\u0186\u01e4\u0187\u01f8", "\u0414\u0402\u040a\u0417\u0453\u045f\u045d\u044b\u0429\u044a\u0435", "drzg/-;YZ:E", "\u01e2\u01ed\u01ea\u01e5\u01e8\u01ed\u01fe\u01e1\u01b8\u01ba\u01ac\u01ad\u01d2"})
public final class Class1583 {
    public static float field5906 = Float.intBitsToFloat(1048702882);
    public static float field5907 = 0.63222545f;

    /*
     * WARNING - void declaration
     */
    private static CallSite 2qaD1F35ANdlJ0(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1583.C8ed2IT5TOFwYmKI(k2, 494504471));
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
                int a2 = Integer.parseInt(Class1583.C8ed2IT5TOFwYmKI(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1583.C8ed2IT5TOFwYmKI(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1583.C8ed2IT5TOFwYmKI(k2, 494504471) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String C8ed2IT5TOFwYmKI(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        bo\u200e = "Allows actions while using items";
    }
}

