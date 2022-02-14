package com.gildedrose;

public class ConjuredItemHolder extends ItemHolder {

    public ConjuredItemHolder(Item item) {
        super(item);
    }
    public void updateQuality() {
        this.item.quality -= 2;
        this.item.quality = Math.max(this.item.quality, 0);
    }

    public void updateSellIn() {
      this.item.sellIn -= 1;
    }
}
