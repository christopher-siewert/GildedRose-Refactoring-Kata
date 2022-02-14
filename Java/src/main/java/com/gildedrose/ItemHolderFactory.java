package com.gildedrose;

public class ItemHolderFactory {
    public static ItemHolder createItemHolder(Item item){
        if (item.name == "Aged Brie") {
            return new BrieHolder(item);
        } else if (item.name == "Sulfuras, Hand of Ragnaros") {
            return new SulfurasHolder(item);
        } else if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
            return new BackstagePassesHolder(item);
        } else if (item.name == "Conjured Milk") {
            return new ConjuredItemHolder(item);
        } else {
            return new GenericItemHolder(item);
        }
    }
}
