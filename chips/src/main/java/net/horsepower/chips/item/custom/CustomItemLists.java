package net.horsepower.chips.item.custom;

import net.horsepower.chips.config.ModConfigs;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.List;

public class CustomItemLists {

    static int commonCount = ModConfigs.commonCount;
    static List<Integer> commonList = listCommon();

    static int rareCount = ModConfigs.rareCount;
    static List<Integer> rareList = listRare();



    static int epicCount = ModConfigs.epicCount;
    static List<Integer> epicList = listEpic();



    static int legendaryCount = ModConfigs.legendaryCount;
    static List<Integer> legendaryList = listLegendary();




    public static List<Integer> listCommon(){
        String list = ModConfigs.commonItemList;
        String[] strResult = list.split(",");
        List<Integer> res = new ArrayList<>();
        for (String s : strResult){
            res.add(Integer.parseInt(s));
        }

        return res;
    }

    private static List<Integer> listRare() {
        String list = ModConfigs.rareItemList;
        String[] strResult = list.split(",");
        List<Integer> res = new ArrayList<>();
        for (String s : strResult){
            res.add(Integer.parseInt(s));
        }

        return res;
    }

    private static List<Integer> listEpic() {
        String list = ModConfigs.epicItemList;
        String[] strResult = list.split(",");
        List<Integer> res = new ArrayList<>();
        for (String s : strResult){
            res.add(Integer.parseInt(s));
        }

        return res;
    }

    private static List<Integer> listLegendary() {
        String list = ModConfigs.legendaryItemList;
        String[] strResult = list.split(",");
        List<Integer> res = new ArrayList<>();
        for (String s : strResult){
            res.add(Integer.parseInt(s));
        }

        return res;
    }

}
