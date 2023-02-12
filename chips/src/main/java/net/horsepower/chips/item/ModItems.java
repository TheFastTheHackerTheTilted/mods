package net.horsepower.chips.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.horsepower.chips.ChipsMain;
import net.horsepower.chips.item.custom.*;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;


public class ModItems {

//    public static final Item DEBUG_BAG = registerModItem("debug_bag",
//            new DebugBag(new Item.Settings().maxCount(1)), ModItemGroup.CHIPS);
    public static final Item ID_GETTER = registerModItem("id_getter",
            new idGetter(new Item.Settings().maxCount(1)), ModItemGroup.CHIPS);
    public static final Item BAG_COMMON = registerModItem("bag_common",
            new RewardBagCommon(new Item.Settings()), ModItemGroup.CHIPS);
    public static final Item BAG_RARE = registerModItem("bag_rare",
            new RewardBagRare(new Item.Settings()), ModItemGroup.CHIPS);
    public static final Item BAG_EPIC = registerModItem("bag_epic",
            new RewardBagEpic(new Item.Settings()), ModItemGroup.CHIPS);
    public static final Item BAG_LEGENDARY = registerModItem("bag_legendary",
            new RewardBagLegendary(new Item.Settings()), ModItemGroup.CHIPS);
    public static final Item FRIED_CHIPS = registerModItem("chips",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1f).snack().build())),ModItemGroup.CHIPS);
    public static final Item SLICED_POTATO = registerModItem("sliced_potato",
            new Item(new FabricItemSettings()),ModItemGroup.CHIPS);

    private static Item registerModItem(String name, Item item, ItemGroup group){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(ChipsMain.MOD_ID,name), item);
    }

    public static void registerItems(){

    }



}
