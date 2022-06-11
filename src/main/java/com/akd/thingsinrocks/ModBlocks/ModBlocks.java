package com.akd.thingsinrocks.ModBlocks;

import com.akd.thingsinrocks.item.ModCreativeModeTab;
import com.akd.thingsinrocks.ThingsInRocks;
import com.akd.thingsinrocks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ThingsInRocks.MOD_ID);


    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock( "citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.THINGSINROCKS_TAB);
    public static final RegistryObject<Block> RAW_CITRINE_BLOCK = registerBlock( "raw_citrine_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.THINGSINROCKS_TAB);
    public static final RegistryObject<Block> CITRINE_ORE = registerBlock( "citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THINGSINROCKS_TAB);
    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock( "deepslate_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THINGSINROCKS_TAB);
    public static final RegistryObject<Block> ENDSTONE_CITRINE_ORE = registerBlock( "endstone_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THINGSINROCKS_TAB);
    public static final RegistryObject<Block> NETHERRACK_CITRINE_ORE = registerBlock( "netherrack_citrine_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THINGSINROCKS_TAB);

    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock( "amber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.THINGSINROCKS_TAB);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);

    }

}
