package net.otcrew.offthecoast.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.otcrew.offthecoast.OffTheCoastMod;
import net.otcrew.offthecoast.entities.*;
import net.otcrew.offthecoast.registry.RegisterEntities;

@Environment(EnvType.CLIENT)
public class OffTheCoastClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_ELECTRICEEL_LAYER = new EntityModelLayer(new Identifier(OffTheCoastMod.MOD_ID, "electriceel"), "main");
    public static final EntityModelLayer MODEL_GOONCH_LAYER = new EntityModelLayer(new Identifier(OffTheCoastMod.MOD_ID, "goonch"), "main");
    public static final EntityModelLayer MODEL_PIRANHA_LAYER = new EntityModelLayer(new Identifier(OffTheCoastMod.MOD_ID, "piranha"), "main");


    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(RegisterEntities.ELECTRICEEL, ElectricEeelEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_ELECTRICEEL_LAYER, ElectricEelEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.GOONCH, GoonchEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_GOONCH_LAYER, GoonchEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(RegisterEntities.PIRANHA, PiranhaEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_PIRANHA_LAYER, PiranhaEntityModel::getTexturedModelData);

    }
}
