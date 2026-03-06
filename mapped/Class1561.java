/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package mapped;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import mapped.Class1104;
import mapped.Class1383;
import mapped.Class1503;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class277;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class5836;
import mapped.Class6322;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1561
implements ArgumentType {
    private final Class277 field5857;

    private static void method14518() {
        Class1807.method15744();
    }

    private Class1561(Class277 a2) {
        this.field5857 = a2;
    }

    private static void method14519(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method14520() {
        Class5836.method22885();
    }

    public static Class277 method14521(Class1561 class1561) {
        return class1561.field5857;
    }

    private static void method14522(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static void method14523() {
        Class3979.method19561();
    }

    /*
     * Enabled aggressive block sorting
     */
    public Class248 method14524(StringReader b2) throws CommandSyntaxException {
        String c2 = b2.readString();
        Class248 d2 = null;
        block4: for (Class248 a2 : Class1561.method14521(this).method471()) {
            int n2 = !Integer.valueOf("Enabled".toUpperCase().hashCode()).equals(Class1561.method14525(a2).toUpperCase().hashCode()) ? 53404 : 53405;
            block5: while (true) {
                switch (n2) {
                    default: {
                        continue block4;
                    }
                    case 53405: {
                        n2 = 53403;
                        continue block5;
                    }
                    case 53404: 
                }
                break;
            }
            if (Integer.valueOf("Keybind".toUpperCase().hashCode()).equals(a2.method512().toUpperCase().hashCode()) || Integer.valueOf("Hidden".toUpperCase().hashCode()).equals(a2.method512().toUpperCase().hashCode())) continue;
            if (Integer.valueOf("Notify".toUpperCase().hashCode()).equals(a2.method512().toUpperCase().hashCode())) {
                Class1561.method14523();
                return null;
            }
            if (!Integer.valueOf(c2.toUpperCase().hashCode()).equals(a2.method512().toUpperCase().hashCode())) continue;
            d2 = a2;
            break;
        }
        if (d2 == null) {
            throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherParseException().createWithContext((ImmutableStringReader)b2, null);
        }
        return d2;
    }

    private static String method14525(Class248 class248) {
        return class248.method512();
    }

    private static void method14526(float f2) {
        Class5836.method22907(f2);
    }

    public Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.method14524(stringReader);
    }

    private static int method14527(int n2, int n3, Class1104 class1104, Class5836 class5836) {
        return Class1383.method13981(n2, n3, class1104, class5836);
    }

    public CompletableFuture listSuggestions(CommandContext b2, SuggestionsBuilder c2) {
        for (Class248 a2 : Class1561.method14528(this).method471()) {
            if (Integer.valueOf("Enabled".toUpperCase().hashCode()).equals(a2.method512().toUpperCase().hashCode())) continue;
            if (Integer.valueOf("Keybind".toUpperCase().hashCode()).equals(a2.method512().toUpperCase().hashCode()) || Integer.valueOf("Hidden".toUpperCase().hashCode()).equals(a2.method512().toUpperCase().hashCode())) continue;
            c2.suggest(a2.method512().toLowerCase());
        }
        return c2.buildFuture();
    }

    public static Class277 method14528(Class1561 class1561) {
        return class1561.field5857;
    }

    public static Class248 method14529(CommandContext a2, String b2) {
        return (Class248)a2.getArgument(b2, Class248.class);
    }

    private static void method14530(float f2) {
        Class5836.method22907(f2);
    }

    private static void method14531(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method14532() {
        Class5836.method22890();
    }

    public static Class1561 method14533(Class277 a2) {
        return new Class1561(a2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

