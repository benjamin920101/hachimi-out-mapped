/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.PlayerListEntry
 *  org.apache.commons.io.IOUtils
 */
package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import mapped.Class1108;
import mapped.Class4122;
import mapped.Class4146;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class6322;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import org.apache.commons.io.IOUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3263 {
    private static long[] field7000 = new long[5];
    private static final Set field7001;
    private static final Map field7002;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Map method16762(String i2) {
        TreeMap j2 = new TreeMap(Collections.reverseOrder());
        try {
            Object[] objectArray = new Object[(int)field7000[0]];
            objectArray[(int)Class3263.field7000[1]] = i2;
            String e2 = String.format("https://api.2b2t.vc/stats/player?playerName=%s", objectArray);
            HttpURLConnection g2 = null;
            try {
                g2 = (HttpsURLConnection)new URL(e2).openConnection();
                g2.setDoOutput((boolean)field7000[0]);
                g2.setRequestMethod("GET");
                g2.setRequestProperty("Content-Type", "application/json");
                Scanner a2 = new Scanner(g2.getInputStream());
                StringBuilder b2 = new StringBuilder();
                while (true) {
                    if (!a2.hasNextLine()) {
                        Class3263.method16764();
                        return null;
                    }
                    b2.append(a2.nextLine());
                    b2.append((char)field7000[2]);
                }
            }
            catch (Throwable throwable) {
                if (g2 != null) {
                    g2.disconnect();
                }
                throw throwable;
            }
        }
        catch (Exception h2) {
            h2.printStackTrace();
            return j2;
        }
    }

    private static void method16763(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static void method16764() {
        Class5836.method22890();
    }

    public static class_310 method16765() {
        return Class4122.field9561;
    }

    private static boolean method16766(String a2, class_640 b2) {
        return Integer.valueOf(a2.toUpperCase().hashCode()).equals(b2.method_2966().getName().toUpperCase().hashCode());
    }

    public static Map method16767() {
        return field7002;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public Map method16768(UUID n2) {
        TreeMap o2 = new TreeMap(Collections.reverseOrder());
        try {
            void k2;
            Object[] objectArray = new Object[(int)field7000[0]];
            objectArray[(int)Class3263.field7000[1]] = n2.toString();
            String j2 = String.format("https://laby.net/api/v2/user/%s/get-profile", objectArray);
            HttpURLConnection l2 = null;
            try {
                l2 = (HttpsURLConnection)new URL(j2).openConnection();
                l2.setDoOutput((boolean)field7000[0]);
                l2.setRequestMethod("GET");
                l2.setRequestProperty("Content-Type", "application/json");
                Scanner a2 = new Scanner(l2.getInputStream());
                StringBuilder b2 = new StringBuilder();
                while (a2.hasNextLine()) {
                    b2.append(a2.nextLine());
                    b2.append((char)field7000[2]);
                }
                a2.close();
                String c2 = b2.toString();
                JsonObject d2 = JsonParser.parseString((String)c2).getAsJsonObject();
                JsonArray e2 = d2.getAsJsonArray("username_history");
            }
            finally {
                if (l2 != null) {
                    l2.disconnect();
                }
            }
            if (k2 == null) {
                return null;
            }
            for (JsonElement i2 : k2) {
                JsonObject f2 = i2.getAsJsonObject();
                String g2 = f2.get("username").getAsString();
                String h2 = f2.has("changed_at") ? f2.get("changed_at").getAsString() : "";
                o2.put(h2, g2);
            }
        }
        catch (Exception m2) {
            m2.printStackTrace();
        }
        return o2;
    }

    private static void method16769(boolean bl2) {
        Class1108.method12918(bl2);
    }

    static {
        Class3263.method16775(206614382855618430L);
        field7002 = new HashMap();
        field7001 = new HashSet();
    }

    public String method16770(UUID e2) {
        if (field7001.contains(e2)) {
            return null;
        }
        if (field7002.containsKey(e2)) {
            return (String)field7002.get(e2);
        }
        Object[] objectArray = new Object[(int)field7000[0]];
        objectArray[(int)Class3263.field7000[1]] = e2.toString();
        String f2 = String.format("https://laby.net/api/v2/user/%s/get-profile", objectArray);
        try {
            String a2 = IOUtils.toString((URL)new URL(f2), (Charset)StandardCharsets.UTF_8);
            JsonObject b2 = JsonParser.parseString((String)a2).getAsJsonObject();
            String c2 = b2.get("username").toString();
            Class3263.method16767().put(e2, c2.replace("\"", ""));
            return c2;
        }
        catch (IOException d2) {
            d2.printStackTrace();
            field7001.add(e2);
            return null;
        }
    }

    private static void method16771() {
        Class6009.method23560();
    }

    public static class_310 method16772() {
        return Class4122.field9561;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public String method16773() {
        try {
            void f2;
            String e2 = "https://api.2b2t.vc/queue";
            HttpURLConnection g2 = null;
            try {
                g2 = (HttpsURLConnection)new URL(e2).openConnection();
                g2.setDoOutput((boolean)field7000[0]);
                g2.setRequestMethod("GET");
                g2.setRequestProperty("Content-Type", "application/json");
                Scanner a2 = new Scanner(g2.getInputStream());
                StringBuilder b2 = new StringBuilder();
                while (a2.hasNextLine()) {
                    b2.append(a2.nextLine());
                    b2.append((char)field7000[2]);
                }
                a2.close();
                String c2 = b2.toString();
                JsonObject d2 = JsonParser.parseString((String)c2).getAsJsonObject();
            }
            finally {
                if (g2 != null) {
                    g2.disconnect();
                }
            }
            if (f2 == null) {
                return null;
            }
            Object[] objectArray = new Object[(int)field7000[4]];
            objectArray[(int)Class3263.field7000[1]] = f2.get("prio").getAsInt();
            objectArray[(int)Class3263.field7000[0]] = f2.get("regular").getAsInt();
            return String.format("\u00a77Priority: \u00a7f%d, \u00a77Regular: \u00a7f%d", objectArray);
        }
        catch (Exception h2) {
            h2.printStackTrace();
            return null;
        }
    }

    public UUID method16774(String c2) {
        ArrayList a2;
        class_640 b2;
        if (Class3263.method16772().method_1562() != null && (b2 = (class_640)(a2 = new ArrayList(Class3263.method16765().method_1562().method_2880())).stream().filter(arg_0 -> Class3263.method16766(c2, arg_0)).findFirst().orElse(null)) != null) {
            return b2.method_2966().getId();
        }
        return null;
    }

    private static void method16775(long l2) {
        Class3263.field7000[0] = l2 ^ 0x2DE0AAFBF987F7FL;
        Class3263.field7000[4] = l2 ^ 0x2DE0AAFBF987F7CL;
        Class3263.field7000[3] = l2 ^ 0x2DE0AAFBF98716EL;
        Class3263.field7000[1] = l2 ^ 0x2DE0AAFBF987F7EL;
        Class3263.field7000[2] = l2 ^ 0x2DE0AAFBF987F74L;
    }

    private static void method16776() {
        Class4146.method20694();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

