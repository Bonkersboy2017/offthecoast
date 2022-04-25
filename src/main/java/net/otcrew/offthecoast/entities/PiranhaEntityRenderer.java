package net.otcrew.offthecoast.entities;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.otcrew.offthecoast.client.OffTheCoastClient;

public class PiranhaEntityRenderer extends MobEntityRenderer<PiranhaEntity, PiranhaEntityModel> {

    public PiranhaEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new PiranhaEntityModel(context.getPart(OffTheCoastClient.MODEL_PIRANHA_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(PiranhaEntity entity) {
        return new Identifier("offthecoast", "textures/entity/piranha.png");
    }
}
