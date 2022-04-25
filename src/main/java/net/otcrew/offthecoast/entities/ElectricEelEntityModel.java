// Made with Model Converter by Globox_Z
// Generate all required imports
// Made with Blockbench 4.2.3
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	package net.otcrew.offthecoast.entities;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class ElectricEelEntityModel extends EntityModel<ElectricEelEntity> {

private final ModelPart bone;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
public ElectricEelEntityModel(ModelPart root) {
this.bone = root.getChild("bone");
this.cube_r2 = this.bone.getChild("cube_r2");
this.cube_r1 = this.bone.getChild("cube_r1");
}
public static TexturedModelData getTexturedModelData() {
ModelData modelData = new ModelData();
ModelPartData modelPartData = modelData.getRoot();
ModelPartData modelPartData1 = modelPartData.addChild("bone", ModelPartBuilder.create().uv(62,0).cuboid(19.0F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F).uv(42,42).cuboid(-12.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F).uv(12,14).cuboid(-14.0F, -2.0F, -1.0F, 4.0F, 2.0F, 2.0F).uv(0,0).cuboid(-10.0F, -2.0F, 0.0F, 29.0F, 4.0F, 0.0F).uv(0,9).cuboid(8.0F, -3.0F, -1.0F, 10.0F, 3.0F, 2.0F).uv(0,4).cuboid(-10.0F, -3.0F, -1.0F, 18.0F, 3.0F, 2.0F), ModelTransform.pivot(0.0F,22.0F,0.0F));
modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(0,14).cuboid(-12.0F, -7.0F, -1.0F, 4.0F, 1.0F, 2.0F).uv(0,14).cuboid(-10.0F, -6.0F, -1.0F, 2.0F, 1.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r2", ModelPartBuilder.create().uv(41,38).cuboid(-1.0F, -2.0F, 11.0F, 0.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
return TexturedModelData.of(modelData,64,64);
}
@Override
public void setAngles(ElectricEelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
this.cube_r1.roll = -0.3927F;
this.cube_r2.yaw = -1.5708F;
		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}
	}