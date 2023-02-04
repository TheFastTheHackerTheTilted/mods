package net.horsepower.chips.config;

import com.mojang.datafixers.util.Pair;
import net.horsepower.chips.ChipsMain;
import net.horsepower.chips.item.custom.CustomItemLists;

import java.util.Arrays;


public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static String TEST;

    public static int commonCount;
    public static String commonItemList;
    public static int rareCount;
    public static String rareItemList;
    public static int epicCount;
    public static String epicItemList;
    public static int legendaryCount;
    public static String legendaryItemList;

    public static String defaultList = "1,2,3";

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(ChipsMain.MOD_ID + "config").provider(configs).request();
        assignConfigs();
    }

    private static void createConfigs() {
        configs.addComment("Get the item id from in-game using id getter!!");
        configs.addComment("Change only the first value, do not leave a comma in the end of the line!!");
        configs.addComment("If you want to increase the chance of an item, add it multiple times ex: 1,2,2,2,3 = 60% chance to get 2");
        configs.addComment("The counts are used to determine max drop for an item, if count is 5 when opened that bag, it can drop max of 5");
        configs.addComment("Default counts are: common:4 | rare:3 | epic:2 | legendary:1");

        configs.addKeyValuePair(new Pair<>("common.item.count", 4));
        configs.addKeyValuePair(new Pair<>("common.item.list", defaultList));
        configs.addKeyValuePair(new Pair<>("rare.item.count", 3));
        configs.addKeyValuePair(new Pair<>("rare.item.list", defaultList));
        configs.addKeyValuePair(new Pair<>("epic.item.count", 2));
        configs.addKeyValuePair(new Pair<>("epic.item.list", defaultList));
        configs.addKeyValuePair(new Pair<>("legendary.item.count", 1));
        configs.addKeyValuePair(new Pair<>("legendary.item.list", defaultList));
    }

    private static void assignConfigs() {
        commonCount = CONFIG.getOrDefault("common.item.count", 4);
        commonItemList = CONFIG.getOrDefault("common.item.list", defaultList);
        rareCount = CONFIG.getOrDefault("rare.item.count", 3);
        rareItemList = CONFIG.getOrDefault("rare.item.list", defaultList);
        epicCount = CONFIG.getOrDefault("epic.item.count", 2);
        epicItemList = CONFIG.getOrDefault("epic.item.list", defaultList);
        legendaryCount = CONFIG.getOrDefault("legendary.item.count", 1);
        legendaryItemList = CONFIG.getOrDefault("legendary.item.list", defaultList);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}
