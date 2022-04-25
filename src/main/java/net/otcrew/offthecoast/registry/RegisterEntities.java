package net.otcrew.offthecoast.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.otcrew.offthecoast.OffTheCoastMod;
import net.otcrew.offthecoast.entities.ElectricEelEntity;
import net.otcrew.offthecoast.entities.GoonchEntity;
import net.otcrew.offthecoast.entities.PiranhaEntity;

public class RegisterEntities {
    public static final EntityType<ElectricEelEntity> ELECTRICEEL = Registry.register(Registry.ENTITY_TYPE, new Identifier(OffTheCoastMod.MOD_ID, "electriceel"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ElectricEelEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<GoonchEntity> GOONCH = Registry.register(Registry.ENTITY_TYPE, new Identifier(OffTheCoastMod.MOD_ID, "goonch"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GoonchEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());
    public static final EntityType<PiranhaEntity> PIRANHA = Registry.register(Registry.ENTITY_TYPE, new Identifier(OffTheCoastMod.MOD_ID, "piranha"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, PiranhaEntity::new).dimensions(EntityDimensions.fixed(2F, 3F)).build());

    public static void registerAll() {
        FabricDefaultAttributeRegistry.register(ELECTRICEEL, ElectricEelEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(GOONCH, GoonchEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(PIRANHA, PiranhaEntity.createMobAttributes());
    }
}