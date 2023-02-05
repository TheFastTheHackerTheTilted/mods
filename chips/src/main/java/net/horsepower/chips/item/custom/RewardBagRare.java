package net.horsepower.chips.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;


public class RewardBagRare extends Item {
    public RewardBagRare(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        //use random
        Random rds = new Random();
        int count = rds.nextInt(CustomItemLists.rareCount) +1;

        //get the list
        List<Integer> list = CustomItemLists.rareList;
        int rItem = list.get(rds.nextInt(list.size()));

        //get main hand
        ItemStack itemHeld = user.getStackInHand(hand);


        if (!world.isClient() && hand == Hand.MAIN_HAND){
            Text name = Item.byRawId(rItem).getName();
            String nn = name.getString();
            user.sendMessage(Text.literal(count+" "+nn+" is given!").formatted(Formatting.YELLOW));

            itemHeld.decrement(1);
            user.dropStack(new ItemStack(Item.byRawId(rItem),count));
            return TypedActionResult.success(itemHeld);
        }

        return TypedActionResult.success(itemHeld);
    }
}
