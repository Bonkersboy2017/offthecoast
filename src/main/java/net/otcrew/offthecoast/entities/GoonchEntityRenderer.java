package net.otcrew.offthecoast.entities;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.otcrew.offthecoast.client.OffTheCoastClient;

public class GoonchEntityRenderer extends MobEntityRenderer<GoonchEntity, GoonchEntityModel> {

    public GoonchEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new GoonchEntityModel(context.getPart(OffTheCoastClient.MODEL_GOONCH_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(GoonchEntity entity) {
        return new Identifier("offthecoast", "textures/entity/goonch.png");
    }
}
