package net.horsepower.chips.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RewardBagCommon extends Item {
    public RewardBagCommon(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        //use random
        Random rds = new Random();
        int count = rds.nextInt(CustomItemLists.commonCount) +1;

        //get the list
        List<Integer> list = CustomItemLists.commonList;
        int rItem = list.get(rds.nextInt(list.size()));

        //get main hand
        ItemStack itemHeld = user.getStackInHand(hand);


        if (!world.isClient() && hand == Hand.MAIN_HAND){
            user.sendMessage(Text.literal(count+" of id:"+rItem+" is given!"));
            itemHeld.decrement(1);
            user.dropStack(new ItemStack(Item.byRawId(rItem),count));
            return TypedActionResult.success(itemHeld);
        }

        return TypedActionResult.success(itemHeld);
    }
}
