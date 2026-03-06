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

@HACHIMI_CLIENT(mv=100, d1={"\uce27\uce2d\uce21\uce27\uce2d\uce24\uce20\uce23", "\u83dc\u83da\u83d8\u83df\u83d7\u83db\u83de\u83d7", "\ua7ed\ua7e8\ua7ec\ua7eb\ua7e2\ua7ef\ua7eb\ua7ef", "\u0b53\u0b56\u0b52\u0b57\u0b5d\u0b5c\u0b55\u0b52", "\u0615\u0614\u0610\u0615\u0614\u0616\u0616\u0614", "\uce70\uce74\uce76\uce7c\uce75\uce7c\uce76\uce7c", "\u6fe6\u6fe2\u6fe3\u6fe2\u6fed\u6fe3\u6fe6\u6fe5", "\ue686\ue685\ue685\ue685\ue680\ue683\ue684", "\u85fb\u85fd\u85f8\u85f6\u85f9\u85fe\u85f7\u85fe", "\u866b\u8669\u866f\u866e\u866b\u8665\u8669\u866e", "\u1df4\u1df1\u1df0\u1df4\u1df2\u1df3\u1df8\u1df9", "\ue75f\ue75c\ue759\ue75a\ue75a\ue756\ue756\ue759", "\u7dd8\u7ddd\u7ddd\u7ddb\u7dd2\u7ddf\u7ddc", "\ud3b7\ud3b9\ud3b4\ud3b5\ud3b5\ud3b7\ud3b8\ud3b4", "\ue649\ue646\ue64c\ue647\ue64c\ue64c\ue64a\ue64a", "\u6ba1\u6bac\u6ba3\u6ba1\u6ba4\u6ba3\u6ba0\u6ba6", "\u7c7c\u7c7a\u7c7d\u7c78\u7c7a\u7c7e\u7c7a\u7c7b"}, d2={"\u02fe\u02e3\u02c4\u229c\u02ae\u02ac\u02ba\u02de\u02f8\u02f3\u02e4\u02f3\u02bd\u02fe\u02f3\u02fc\u02f5\u02bd\u02c1\u02e6\u02e0\u02fb\u02fc\u02f5\u02a9\u02bb\u02de\u02f8\u02f3\u02e4\u02f3\u02bd\u02fe\u02f3\u02fc\u02f5\u02bd\u02c1\u02e6\u02e0\u02fb\u02fc\u02f5\u02a9", "\u04d7\u04ca\u04ec\u24b5\u0487\u0485\u0493\u04f7\u04d1\u04da\u04cd\u04da\u0494\u04d7\u04da\u04d5\u04dc\u0494\u04e8\u04cf\u04c9\u04d2\u04d5\u04dc\u0480\u0492\u04f7\u04d1\u04da\u04cd\u04da\u0494\u04d7\u04da\u04d5\u04dc\u0494\u04e8\u04cf\u04c9\u04d2\u04d5\u04dc\u0480", "\u00e5\u00f8\u00d1\u2087\u00b5\u00b7\u00a1\u00c5\u00e3\u00e8\u00ff\u00e8\u00a6\u00e5\u00e8\u00e7\u00ee\u00a6\u00da\u00fd\u00fb\u00e0\u00e7\u00ee\u00b2\u00a0\u00c5\u00e3\u00e8\u00ff\u00e8\u00a6\u00e5\u00e8\u00e7\u00ee\u00a6\u00da\u00fd\u00fb\u00e0\u00e7\u00ee\u00b2", "\u0743\u071c\u0713\u0716\u0711\u0716\u070b\u0741\u0743\u0741\u0757\u0756\u0729", "\u06c6\u0693\u0694\u0693\u068e\u06c4\u06c6\u06c4\u06d2\u06d3\u06ac", "\u0368\u036a\u037b\u034c\u0363\u036e\u037c\u037c\u0333\u0331\u0327\u0326\u0343\u0365\u036e\u0379\u036e\u0320\u0363\u036e\u0361\u0368\u0320\u034c\u0363\u036e\u037c\u037c\u0334", "\u047d\u0474\u0466\u047d\u0456\u047a\u0471\u0470\u0429\u042b\u043d\u043c\u045c", "\u02de\u02ca\u02ce\u02da\u02d7\u02c8\u0287\u0285\u0293\u02f7\u02d1\u02da\u02cd\u02da\u0294\u02d7\u02da\u02d5\u02dc\u0294\u02f4\u02d9\u02d1\u02de\u02d8\u02cf\u0280\u0292\u02e1", "\u067f\u0670\u0673\u0672\u0679\u0620\u0622\u0634\u0635\u0650\u0676\u067d\u066a\u067d\u0633\u0670\u067d\u0672\u067b\u0633\u0653\u067e\u0676\u0679\u067f\u0668\u0627", "\u051b\u0500\u053c\u051b\u051d\u0506\u0501\u0508\u0553\u0551\u0547\u0546\u0523\u0505\u050e\u0519\u050e\u0540\u0503\u050e\u0501\u0508\u0540\u053c\u051b\u051d\u0506\u0501\u0508\u0554", "\u0693\u0692\u0689\u0694\u069b\u0684\u06c1\u06c3\u06d5\u06d4\u06ab", "\u04b0\u04b1\u04aa\u04b7\u04b8\u04a7\u049f\u04b2\u04b2\u04e2\u04e0\u04f6\u04f7\u0488", "\u06a5\u06b3\u06bb\u06a6\u06ee\u06ec\u06fa\u06fb\u0684", "\u0786\u0790\u0798\u0785\u07cd\u07cf\u07d9\u07bb\u07d8\u07a7", "\u0452\u0444\u044c\u0451\u0415\u0419\u041b\u040d\u046f\u040c\u0473", "\u0165\u0173\u017b\u0166\u012e\u012c\u013a\u0158\u015b\u013b\u0144", "\u02e8\u02e7\u02e0\u02ef\u02e2\u02e7\u02f4\u02eb\u02b2\u02b0\u02a6\u02a7\u02d8"})
public final class Class1435 {
    public static float field5482;
    public static int field5483 = -1351833867;
    public static double field5484;
    public static float field5485 = 0.7120996f;

    /*
     * WARNING - void declaration
     */
    private static CallSite VYljxLVNLvXOCQ(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1435.HaVfnaVTQWfvvODa(k2, 1018056808));
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
                int a2 = Integer.parseInt(Class1435.HaVfnaVTQWfvvODa(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1435.HaVfnaVTQWfvvODa(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1435.HaVfnaVTQWfvvODa(k2, 1018056808) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String HaVfnaVTQWfvvODa(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        field5484 = Double.longBitsToDouble(4606875948846214832L);
        ag\u200e = "Dont leak your key";
        ar\u200e = "Calculates server ping";
        field5482 = Float.intBitsToFloat(0x40800000);
        bM\u200e = "Page";
    }
}

