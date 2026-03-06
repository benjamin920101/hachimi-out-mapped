/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  baritone.api.Settings$Setting
 *  net.minecraft.text.Text
 */
package mapped;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import java.awt.Color;
import mapped.Class1;
import mapped.Class1197;
import mapped.Class228;
import mapped.Class248;
import mapped.Class251;
import mapped.Class252;
import mapped.Class253;
import mapped.Class42;
import mapped.Class451;
import mapped.Class543;
import mapped.Class556;
import mapped.Class68;
import mapped.Class890;
import net.minecraft.text.Text;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Baritone
extends Class451 {
    Class248 field2349;
    Class248 field2350;
    Class248 field2351;
    Class248 field2352;
    Class248 field2353;
    Class248 field2354;
    Class248 field2355;
    Class248 field2356;
    Class248 field2357;
    private static long[] field2358 = new long[2];
    Class248 field2359;
    Class248 field2360;
    Class248 field2361;
    Class248 field2362;
    Class248 field2363;
    Class248 field2364;
    Class248 field2365;
    Class248 field2366;
    Class248 field2367;
    Class248 field2368;
    Class248 field2369;
    Class248 field2370;
    Class248 field2371;
    Class248 field2372;
    Class248 field2373;
    Class248 field2374;
    Class248 field2375 = this.method450(new Class252("Range", "Baritone block reach distance", Float.valueOf(0.0f), Float.valueOf(4.0f), Float.valueOf(Class890.field3825)));

    private static void method10419(Class248 class248, Object object) {
        class248.method505(object);
    }

    public static Class248 method10420(Baritone class452) {
        return class452.field2370;
    }

    public static Class248 method10421(Baritone class452) {
        return class452.field2364;
    }

    @Class1
    public void method10422(Class68 a2) {
        if (a2.method128() != Class543.field2691 || a2.method140().method502() == this) {
            return;
        }
        Baritone.method10455(BaritoneAPI.getSettings().blockReachDistance, Baritone.method10435(this.field2375));
        BaritoneAPI.getSettings().allowPlace.value = this.field2363.method507();
        BaritoneAPI.getSettings().allowBreak.value = this.field2366.method507();
        BaritoneAPI.getSettings().allowSprint.value = this.field2355.method507();
        Baritone.method10439(BaritoneAPI.getSettings().allowInventory, this.field2360.method507());
        BaritoneAPI.getSettings().allowVines.value = this.field2350.method507();
        BaritoneAPI.getSettings().allowJumpAt256.value = Baritone.method10464(this).method507();
        BaritoneAPI.getSettings().allowWaterBucketFall.value = this.field2351.method507();
        BaritoneAPI.getSettings().allowParkour.value = this.field2357.method507();
        Baritone.method10442(BaritoneAPI.getSettings().allowParkourAscend, Baritone.method10454(this.field2354));
        BaritoneAPI.getSettings().allowParkourPlace.value = Baritone.method10424(this.field2371);
        BaritoneAPI.getSettings().allowDiagonalAscend.value = this.field2361.method507();
        BaritoneAPI.getSettings().allowDiagonalDescend.value = Baritone.method10440(this).method507();
        BaritoneAPI.getSettings().allowDownward.value = this.field2362.method507();
        Baritone.method10463(BaritoneAPI.getSettings().legitMine, this.field2368.method507());
        BaritoneAPI.getSettings().disconnectOnArrival.value = this.field2367.method507();
        Baritone.method10436(BaritoneAPI.getSettings().freeLook, Baritone.method10420(this).method507());
        Baritone.method10472((Settings)BaritoneAPI.getSettings()).value = this.field2356.method507();
        Baritone.method10437((Settings)BaritoneAPI.getSettings()).value = this.field2353.method507();
        Baritone.method10469(BaritoneAPI.getSettings().censorCoordinates, Baritone.method10456(this).method507());
        BaritoneAPI.getSettings().censorRanCommands.value = Baritone.method10450(Baritone.method10466(this));
        BaritoneAPI.getSettings().chatControl.value = this.field2352.method507();
        Baritone.method10428(BaritoneAPI.getSettings().chatDebug, this.field2372.method507());
        BaritoneAPI.getSettings().colorGoalBox.value = this.field2369.method507();
        Baritone.method10460(BaritoneAPI.getSettings().colorCurrentPath, Baritone.method10421(this).method507());
        Baritone.method10433(BaritoneAPI.getSettings().colorMostRecentConsidered, this.field2364.method507());
        BaritoneAPI.getSettings().colorNextPath.value = this.field2359.method507();
    }

    public static Class248 method10423(Baritone class452) {
        return class452.field2354;
    }

    private static Object method10424(Class248 class248) {
        return class248.method507();
    }

    public Baritone() {
        super("Baritone", "Configure baritone", Class556.field2757);
        this.field2363 = this.method450(new Class253("Place", "Allow baritone to place blocks", (boolean)field2358[0]));
        this.field2366 = this.method450(new Class253("Break", "Allow baritone to break blocks", (boolean)field2358[0]));
        this.field2355 = this.method450(new Class253("Sprint", "Allow baritone to sprint", (boolean)field2358[0]));
        this.field2360 = this.method450(new Class253("UseInventory", "Allow baritone to use player inventory", (boolean)field2358[1]));
        this.field2350 = this.method450(new Class253("Vines", "Allow baritone to climb vines", (boolean)field2358[0]));
        this.field2374 = this.method450(new Class253("JumpAt256", "Allow baritone to jump at 256 blocks", (boolean)field2358[1]));
        this.field2351 = this.method450(new Class253("WaterBucketFall", "Allow baritone to use waterbuckets when falling", (boolean)field2358[1]));
        this.field2357 = this.method450(new Class253("Parkour", "Allow baritone to jump between blocks", (boolean)field2358[0]));
        this.field2371 = this.method450(new Class253("ParkourPlace", "Allow baritone to jump and place blocks", (boolean)field2358[1]));
        this.field2354 = this.method450(new Class253("ParkourAscend", "Allow baritone to jump up blocks", (boolean)field2358[0]));
        this.field2361 = this.method450(new Class253("DiagonalAscend", "Allow baritone to jump up blocks diagonally", (boolean)field2358[1]));
        this.field2373 = this.method450(new Class253("DiagonalDescend", "Allow baritone to move down blocks diagonally", (boolean)field2358[1]));
        this.field2362 = this.method450(new Class253("MineDownward", "Allow baritone to mine down", (boolean)field2358[0]));
        this.field2368 = this.method450(new Class253("LegitMine", "Uses baritone legit mine", (boolean)field2358[1]));
        this.field2367 = this.method450(new Class253("LogOnArrival", "Logout when you arrive at destination", (boolean)field2358[1]));
        this.field2370 = this.method450(new Class253("FreeLook", "Allows you to look around freely while using baritone", (boolean)field2358[0]));
        this.field2356 = this.method450(new Class253("AntiCheat", "Uses NCP placements and breaks", (boolean)field2358[1]));
        this.field2353 = this.method450(new Class253("Strict-Liquid", "Uses strick liquid checks", (boolean)field2358[1]));
        this.field2349 = this.method450(new Class253("CensorCoords", "Censors goal coordinates in chat", (boolean)field2358[1]));
        this.field2365 = this.method450(new Class253("CensorCommands", "Censors baritone commands in chat", (boolean)field2358[1]));
        this.field2352 = this.method450(new Class253("ChatControl", "Allows you to type baritone commands in chat without prefix", (boolean)field2358[0]));
        this.field2372 = this.method450(new Class253("Debug", "Debugs in the chat", (boolean)field2358[1]));
        this.field2369 = this.method450(new Class251("GoalColor", "The color of the goal box", Color.GREEN, (boolean)field2358[1], (boolean)field2358[1]));
        this.field2364 = this.method450(new Class251("CurrentPathColor", "The color of the path", Color.RED, (boolean)field2358[1], (boolean)field2358[1]));
        this.field2359 = this.method450(new Class251("NextPathColor", "The color of the path", Color.MAGENTA, (boolean)field2358[1], (boolean)field2358[1]));
    }

    public static Object method10425(Settings.Setting setting) {
        return setting.value;
    }

    public static Settings.Setting method10426(Settings settings) {
        return settings.chatControl;
    }

    public static Object method10427(Settings.Setting setting) {
        return setting.value;
    }

    public static void method10428(Settings.Setting setting, Object object) {
        setting.value = object;
    }

    public static Settings.Setting method10429(Settings settings) {
        return settings.antiCheatCompatibility;
    }

    public static Object method10430(Settings.Setting setting) {
        return setting.value;
    }

    public static Class248 method10431(Baritone class452) {
        return class452.field2359;
    }

    @Class1
    public void method10432(Class42 a2) {
        String b2 = a2.method81().getString();
        if (b2.startsWith("[Baritone]")) {
            a2.method10();
            Baritone.method10444(a2, class_2561.method_30163((String)("\u00a7s[Hachimi] \u00a7r" + Class1197.method13212(a2.method81()))));
        }
    }

    public static void method10433(Settings.Setting setting, Object object) {
        setting.value = object;
    }

    public static Settings.Setting method10434(Settings settings) {
        return settings.allowDiagonalAscend;
    }

    private static Object method10435(Class248 class248) {
        return class248.method507();
    }

    public static void method10436(Settings.Setting setting, Object object) {
        setting.value = object;
    }

    public static Settings.Setting method10437(Settings settings) {
        return settings.strictLiquidCheck;
    }

    public static Object method10438(Settings.Setting setting) {
        return setting.value;
    }

    private static void method10439(Settings.Setting setting, Object object) {
        Baritone.method10461(setting, object);
    }

    public static Class248 method10440(Baritone class452) {
        return class452.field2373;
    }

    public static Class248 method10441(Baritone class452) {
        return class452.field2370;
    }

    public static void method10442(Settings.Setting setting, Object object) {
        setting.value = object;
    }

    static {
        Baritone.method10453(-1323540924367826173L);
    }

    private static void method10443(Class248 class248, Object object) {
        class248.method505(object);
    }

    private static void method10444(Class42 class42, class_2561 class_25612) {
        class42.method82(class_25612);
    }

    public static Settings.Setting method10445(Settings settings) {
        return settings.allowVines;
    }

    public static Settings.Setting method10446(Settings settings) {
        return settings.censorCoordinates;
    }

    public static Settings.Setting method10447(Settings settings) {
        return settings.allowParkour;
    }

    @Class1
    public void method10448(Class42 a2) {
        this.method10465();
    }

    public static Class248 method10449(Baritone class452) {
        return class452.field2360;
    }

    private static Object method10450(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method10451(Class228 a2) {
        this.method10465();
    }

    private static Object method10452(Settings.Setting setting) {
        return Baritone.method10459(setting);
    }

    private static void method10453(long l2) {
        Baritone.method10467(l2);
    }

    private static Object method10454(Class248 class248) {
        return class248.method507();
    }

    public static void method10455(Settings.Setting setting, Object object) {
        setting.value = object;
    }

    public static Class248 method10456(Baritone class452) {
        return class452.field2349;
    }

    private static void method10457(Class248 class248, Object object) {
        class248.method505(object);
    }

    public static Object method10458(Settings.Setting setting) {
        return setting.value;
    }

    public static Object method10459(Settings.Setting setting) {
        return setting.value;
    }

    public static void method10460(Settings.Setting setting, Object object) {
        setting.value = object;
    }

    public static void method10461(Settings.Setting setting, Object object) {
        setting.value = object;
    }

    public static Object method10462(Settings.Setting setting) {
        return setting.value;
    }

    public static void method10463(Settings.Setting setting, Object object) {
        setting.value = object;
    }

    public static Class248 method10464(Baritone class452) {
        return class452.field2374;
    }

    private void method10465() {
        Baritone.method10468(this).method505((Float)Baritone.method10452(BaritoneAPI.getSettings().blockReachDistance));
        this.field2363.method505((Boolean)Baritone.method10458(BaritoneAPI.getSettings().allowPlace));
        this.field2366.method505((Boolean)Baritone.method10462(BaritoneAPI.getSettings().allowBreak));
        this.field2355.method505((Boolean)BaritoneAPI.getSettings().allowSprint.value);
        Baritone.method10449(this).method505((Boolean)BaritoneAPI.getSettings().allowInventory.value);
        this.field2350.method505((Boolean)Baritone.method10470(Baritone.method10445(BaritoneAPI.getSettings())));
        this.field2374.method505((Boolean)BaritoneAPI.getSettings().allowJumpAt256.value);
        Baritone.method10471(this.field2351, (Boolean)Baritone.method10427(BaritoneAPI.getSettings().allowWaterBucketFall));
        this.field2357.method505((Boolean)Baritone.method10447((Settings)BaritoneAPI.getSettings()).value);
        Baritone.method10423(this).method505((Boolean)BaritoneAPI.getSettings().allowParkourAscend.value);
        this.field2371.method505((Boolean)BaritoneAPI.getSettings().allowParkourPlace.value);
        Baritone.method10443(this.field2361, (Boolean)Baritone.method10434((Settings)BaritoneAPI.getSettings()).value);
        this.field2373.method505((Boolean)BaritoneAPI.getSettings().allowDiagonalDescend.value);
        this.field2362.method505((Boolean)BaritoneAPI.getSettings().allowDownward.value);
        this.field2368.method505((Boolean)BaritoneAPI.getSettings().legitMine.value);
        this.field2367.method505((Boolean)BaritoneAPI.getSettings().disconnectOnArrival.value);
        Baritone.method10457(Baritone.method10441(this), (Boolean)Baritone.method10425(BaritoneAPI.getSettings().freeLook));
        this.field2356.method505((Boolean)BaritoneAPI.getSettings().antiCheatCompatibility.value);
        Baritone.method10419(this.field2353, (Boolean)BaritoneAPI.getSettings().strictLiquidCheck.value);
        this.field2349.method505((Boolean)Baritone.method10473((Settings)BaritoneAPI.getSettings()).value);
        this.field2365.method505((Boolean)BaritoneAPI.getSettings().censorRanCommands.value);
        this.field2352.method505((Boolean)Baritone.method10430(Baritone.method10426(BaritoneAPI.getSettings())));
        this.field2372.method505((Boolean)Baritone.method10438(BaritoneAPI.getSettings().chatDebug));
        this.field2369.method505((Color)BaritoneAPI.getSettings().colorGoalBox.value);
        this.field2364.method505((Color)BaritoneAPI.getSettings().colorCurrentPath.value);
        this.field2364.method505((Color)BaritoneAPI.getSettings().colorMostRecentConsidered.value);
        Baritone.method10431(this).method505((Color)BaritoneAPI.getSettings().colorNextPath.value);
    }

    public static Class248 method10466(Baritone class452) {
        return class452.field2365;
    }

    private static void method10467(long l2) {
        Baritone.field2358[1] = l2 ^ 0xEDA1D68AAD5D1303L;
        Baritone.field2358[0] = l2 ^ 0xEDA1D68AAD5D1302L;
    }

    public static Class248 method10468(Baritone class452) {
        return class452.field2375;
    }

    public static void method10469(Settings.Setting setting, Object object) {
        setting.value = object;
    }

    public static Object method10470(Settings.Setting setting) {
        return setting.value;
    }

    private static void method10471(Class248 class248, Object object) {
        class248.method505(object);
    }

    private static Settings.Setting method10472(Settings settings) {
        return Baritone.method10429(settings);
    }

    private static Settings.Setting method10473(Settings settings) {
        return Baritone.method10446(settings);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

