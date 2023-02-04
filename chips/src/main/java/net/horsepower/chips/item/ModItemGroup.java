package net.horsepower.chips.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.horsepower.chips.ChipsMain;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CHIPS = FabricItemGroup.builder(new Identifier(ChipsMain.MOD_ID))
            .displayName(Text.literal("Chips"))
            .icon(() -> new ItemStack(ModItems.DEBUG_BAG))
            .build();}
