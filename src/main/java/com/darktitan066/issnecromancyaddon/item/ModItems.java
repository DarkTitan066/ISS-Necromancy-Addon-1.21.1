package com.darktitan066.issnecromancyaddon.item;

import com.darktitan066.issnecromancyaddon.NecromancyAddon;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NecromancyAddon.MOD_ID);

    public static final DeferredItem<Item> NecromancyRune = ITEMS.register("necromancyrune", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DarkRunestone = ITEMS.register("darkrunestone", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VillagerSkin = ITEMS.register("villagerskin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TreatedSkin = ITEMS.register("treatedskin", () -> new Item(new Item.Properties()));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
