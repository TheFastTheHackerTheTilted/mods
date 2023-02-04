package net.horsepower.chips.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class idGetter extends Item {
    public idGetter(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack offHandItem = playerIn.getOffHandStack();
        ItemStack held = playerIn.getStackInHand(Hand.MAIN_HAND);

        if (handIn == Hand.MAIN_HAND && !offHandItem.isEmpty()) {
            if (!offHandItem.getName().contains(Text.literal("Getter"))) {
                int itemId = Item.getRawId(offHandItem.getItem());
                playerIn.sendMessage(Text.literal(("The ID of off-hand item is: " + itemId)));
                return TypedActionResult.success(held);
            }
        }
        return TypedActionResult.fail(offHandItem);
    }
}
