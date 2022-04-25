package net.otcrew.offthecoast;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.otcrew.offthecoast.registry.RegisterBlocks;
import net.otcrew.offthecoast.registry.RegisterEntities;
import net.otcrew.offthecoast.registry.RegisterItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OffTheCoastMod implements ModInitializer {
	public static final String MOD_ID = "offthecoast";
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(RegisterItems.COCONUT));
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	@Override
	public void onInitialize() {
		RegisterItems.registerAll();
		RegisterBlocks.registerAll();
		RegisterEntities.registerAll();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


	}
}
