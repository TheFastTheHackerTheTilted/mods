package net.horsepower.chips.item.custom;

import net.horsepower.chips.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DebugBag extends Item {
    public DebugBag(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {


        ItemStack itemHeld = user.getStackInHand(hand);
        user.sendMessage(Text.literal("Item held is: "+ itemHeld));
//        ServerPlayerEntity player = (ServerPlayerEntity) user;
//        player.dropItem(new ItemStack(Item.getRawId(itemHeld)));
        user.dropItem(Items.DIAMOND);
        user.dropItem(Item.byRawId(1));
//        player.dropItem(ModItems.BAG_RARE);

        return TypedActionResult.success(itemHeld);
    }





}
