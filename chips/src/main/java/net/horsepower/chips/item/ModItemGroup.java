package net.horsepower.chips.item;



import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.horsepower.chips.ChipsMain;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup CHIPS = FabricItemGroupBuilder.build(
            new Identifier(ChipsMain.MOD_ID, "Chips"), () -> new ItemStack(Items.POTATO));}
