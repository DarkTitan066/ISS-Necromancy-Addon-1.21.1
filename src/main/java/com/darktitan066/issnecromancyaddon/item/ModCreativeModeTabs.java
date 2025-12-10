package com.darktitan066.issnecromancyaddon.item;

import com.darktitan066.issnecromancyaddon.NecromancyAddon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NecromancyAddon.MOD_ID);

    public static final Supplier<CreativeModeTab>  Necromancy_Addon_Items = CREATIVE_MODE_TAB.register( "necromancy_addon_items_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NecromancyRune.get()))
            .title(Component.translatable( "creativetab.necromancyaddon.necromancy_items"))
            .displayItems((itemDisplayParameters, output) -> {
             output.accept(ModItems.NecromancyRune);
             output.accept(ModItems.DarkRunestone);
             output.accept(ModItems.VillagerSkin);
             output.accept(ModItems.TreatedSkin);

            }).build());


    public static final Supplier<CreativeModeTab>  Necromancy_Addon_Blocks = CREATIVE_MODE_TAB.register( "necromancy_addon_blocks_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DarkRunestone.get()))
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(NecromancyAddon.MOD_ID, "necromancy_addon_items_tab"))
            .title(Component.translatable( "creativetab.necromancyaddon.necromancy_blocks"))
            .displayItems((itemDisplayParameters, output) -> {


            }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
