ItemHolder is an abstract class that implements the update template (first update quality then sellIn).
Concrete classes implement algorithm for each item type.
ItemHolder object creation is put into its own factory class as it will change with new item types.

Improvements:

Could have all the holders instead extend the Item class, then GuildedRose just needs one array of item objects
and not one of the holders too. The constructor would replace the item in the items Array with a concrete subclass.
Not sure if this counts as breaking the rules.

Test code is highly duplicated. I assume Junit has paramaterized tests, just didn't bother looking it up.

Lots of magic numbers. Could refactor out into descriptive functions.
E.g. instead of `if (this.item.quality = 0)` could have `if (this.qualityAtMin())`

Strings are hardcoded, will break if you add more types of conjured items.
The factory could be refactored to check for what the string starts with.

Could also create a hashmap of item name to class name that should be instantiated so you don't require all the if statements.
