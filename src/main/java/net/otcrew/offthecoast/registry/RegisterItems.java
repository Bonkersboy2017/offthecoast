package net.otcrew.offthecoast.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.otcrew.offthecoast.OffTheCoastMod;
import net.otcrew.offthecoast.food.ModFoodComponents;

import javax.swing.*;

public class RegisterItems {

    public static final Item COCONUT = new Item(new Item.Settings().group(OffTheCoastMod.ITEM_GROUP).food(ModFoodComponents.COCONUT));
    public static final Item ELDER_EYE = new Item(new Item.Settings().group(OffTheCoastMod.ITEM_GROUP).rarity(Rarity.EPIC));
    public static final Item ELECTRICEEL_SPAWN_EGG = new SpawnEggItem(RegisterEntities.ELECTRICEEL, 0xC4A484, 0xa9a9a9, new Item.Settings().group(OffTheCoastMod.ITEM_GROUP));
    public static final Item GOONCH_SPAWN_EGG = new SpawnEggItem(RegisterEntities.GOONCH, 0xADD8E6, 0xa9a9a9, new Item.Settings().group(OffTheCoastMod.ITEM_GROUP));
    public static final Item PIRANHA_SPAWN_EGG = new SpawnEggItem(RegisterEntities.PIRANHA, 0xa9a9a9, 0x9b870c, new Item.Settings().group(OffTheCoastMod.ITEM_GROUP));






    public static void registerAll() {
        Registry.register(Registry.ITEM, new Identifier(OffTheCoastMod.MOD_ID, "coconut"), COCONUT);
        Registry.register(Registry.ITEM, new Identifier(OffTheCoastMod.MOD_ID, "elder_eye"), ELDER_EYE);
        Registry.register(Registry.ITEM, new Identifier(OffTheCoastMod.MOD_ID, "electriceel_spawn_egg"), ELECTRICEEL_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(OffTheCoastMod.MOD_ID, "goonch_spawn_egg"), GOONCH_SPAWN_EGG);
        Registry.register(Registry.ITEM, new Identifier(OffTheCoastMod.MOD_ID, "pirahna_spawn_egg"), PIRANHA_SPAWN_EGG);





    }
}
