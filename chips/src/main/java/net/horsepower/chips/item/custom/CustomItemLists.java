package net.horsepower.chips.item.custom;

import net.horsepower.chips.config.ModConfigs;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.List;

public class CustomItemLists {

    static int commonCount = ModConfigs.commonCount;
    static List<Integer> commonList = listCommon();


    public static List<Integer> listCommon(){
        String list = ModConfigs.commonItemList;
        String[] strResult = list.split(",");
        List<Integer> res = new ArrayList<>();
        for (String s : strResult){
            res.add(Integer.parseInt(s));
        }

        return res;
    }



}
