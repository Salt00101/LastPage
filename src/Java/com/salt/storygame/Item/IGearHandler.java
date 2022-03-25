package com.salt.storygame.Item;

import java.util.HashMap;

import static com.salt.storygame.Item.ItemList.*;

public class IGearHandler {
    public static HashMap<String, Item> _init_() {
        HashMap<String, Item> gear = new HashMap<>();
        gear.put("Weapon", NULL);
        gear.put("Armor", NULL);
        gear.put("Shield", NULL);
        gear.put("Accessory (necklace)", NULL);
        gear.put("Accessory (bracelet)", NULL);
        gear.put("Accessory (ring)", NULL);
        gear.put("Map", NULL);
        gear.put("Flame Gem Node", NULL);
        gear.put("Water Gem Node", NULL);
        gear.put("Wind Gem Node", NULL);
        gear.put("Lightning Gem Node", NULL);
        gear.put("Spirit Gem Node", NULL);
        gear.put("Shadow Gem Node", NULL);
        return gear;
    }
}
