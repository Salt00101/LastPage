package com.salt.storygame.Item;

public class ItemList {
    // Dev item :)
    public static final Item NULL = new Item();

    // Wood Short Sword
    public static final Item WOODEN_SHORTSWORD = new Item(
            0, "Wooden Shortsword",
            "Wooden Shortsword, An old wooden blade that you were given a long time ago, 1 atk",
            0, 1, 0, 0);

    // Wood Long Sword
    public static final Item WOODEN_LONGSWORD = new Item(
            0, "Wooden Longsword",
            "Wooden Longsword, An new wooden blade that is long and heavy, 3 atk, -1 spd",
            0, 3, 0, -1);

    // Wood Halberd
    public static final Item WOODEN_HALBERD = new Item(
            0, "Wooden Halberd",
            "Wooden Halberd, A well crafted halberd that has excellent range and speed, 2 atk, 2 spd",
            0, 2, 0, 2);

    // Wood Armor
    public static final Item WOODEN_ARMOR = new Item(
            0, "Wooden Armor",
            "Wooden Armor, Shoddy wooden armor that provides minimal defense, 1 def",
            0, 0, 1, 0);

    // Spiked Wood Armor
    public static final Item WOODEN_SPIKED_ARMOR = new Item(
            1, "Spiked Wooden Armor",
            "Spiked Wooden Armor, An new wooden blade that is long and heavy, 1 atk, 1 def",
            0, 1, 1, -1);

    // Wood shield
    public static final Item WOODEN_SHIELD = new Item(
            2, "Wooden Shield",
            "Wooden Shield, A shoddy wooden shield with a tattered red cloth on it, 1 def",
            0, 0, 1, 0);

    // Heavy Wood Shield
    public static final Item WOODEN_HEAVY_SHIELD = new Item(
            2, "Heavy Wooden Shield",
            "Heavy Wooden Shield, A shoddy wooden shield with a tattered red cloth on it, 1 def",
            0, 0, 1, 0);
}
