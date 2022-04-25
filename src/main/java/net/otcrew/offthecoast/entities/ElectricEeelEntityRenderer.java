package net.otcrew.offthecoast.entities;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.otcrew.offthecoast.client.OffTheCoastClient;

public class ElectricEeelEntityRenderer extends MobEntityRenderer<ElectricEelEntity, ElectricEelEntityModel> {

    public ElectricEeelEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ElectricEelEntityModel(context.getPart(OffTheCoastClient.MODEL_ELECTRICEEL_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(ElectricEelEntity entity) {
        return new Identifier("offthecoast", "textures/entity/electric_eel.png");
    }
}
