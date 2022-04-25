package net.otcrew.offthecoast.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.otcrew.offthecoast.OffTheCoastMod;

public class RegisterBlocks {

    public static final Block WHITE_SAND = new Block(FabricBlockSettings.copyOf(Blocks.SAND));
    public static final Block WHITE_SANDSTONE = new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE));
    public static final Block CUT_WHITE_SANDSTONE = new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE));
    public static final Block CHISELED_WHITE_SANDSTONE = new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE));
    public static final Block BRAIN_CORAL_TILES = new Block(FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block BUBBLE_CORAL_TILES = new Block(FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block FIRE_CORAL_TILES = new Block(FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block HORN_CORAL_TILES = new Block(FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK));
    public static final Block TUBE_CORAL_TILES = new Block(FabricBlockSettings.copyOf(Blocks.BRAIN_CORAL_BLOCK));

    public static void registerAll() {

        registerBlock(WHITE_SAND, OffTheCoastMod.ITEM_GROUP, new Identifier(OffTheCoastMod.MOD_ID, "white_sand"));
        registerBlock(WHITE_SANDSTONE, OffTheCoastMod.ITEM_GROUP, new Identifier(OffTheCoastMod.MOD_ID, "white_sandstone"));
        registerBlock(CUT_WHITE_SANDSTONE, OffTheCoastMod.ITEM_GROUP, new Identifier(OffTheCoastMod.MOD_ID, "cut_white_sandstone"));
        registerBlock(CHISELED_WHITE_SANDSTONE, OffTheCoastMod.ITEM_GROUP, new Identifier(OffTheCoastMod.MOD_ID, "chiseled_white_sandstone"));
        registerBlock(BRAIN_CORAL_TILES, OffTheCoastMod.ITEM_GROUP, new Identifier(OffTheCoastMod.MOD_ID, "brain_coral_tiles"));
        registerBlock(BUBBLE_CORAL_TILES, OffTheCoastMod.ITEM_GROUP, new Identifier(OffTheCoastMod.MOD_ID, "bubble_coral_tiles"));
        registerBlock(FIRE_CORAL_TILES, OffTheCoastMod.ITEM_GROUP, new Identifier(OffTheCoastMod.MOD_ID, "fire_coral_tiles"));
        registerBlock(HORN_CORAL_TILES, OffTheCoastMod.ITEM_GROUP, new Identifier(OffTheCoastMod.MOD_ID, "horn_coral_tiles"));
        registerBlock(TUBE_CORAL_TILES, OffTheCoastMod.ITEM_GROUP, new Identifier(OffTheCoastMod.MOD_ID, "tube_coral_tiles"));

    }




    private static void registerBlock(Block block, ItemGroup group, Identifier ID) {
        Registry.register(Registry.BLOCK, ID, block);
        Registry.register(Registry.ITEM, ID, new BlockItem(block, new Item.Settings().group(group)));

    }}