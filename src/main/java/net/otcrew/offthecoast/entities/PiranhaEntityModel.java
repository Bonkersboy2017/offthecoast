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

public class PiranhaEntityModel extends EntityModel<PiranhaEntity> {
private final ModelPart bone;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart cube_r6;
	private final ModelPart cube_r7;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
public PiranhaEntityModel(ModelPart root) {
this.bone = root.getChild("bone");
this.cube_r9 = this.bone.getChild("cube_r9");
this.cube_r8 = this.bone.getChild("cube_r8");
this.cube_r7 = this.bone.getChild("cube_r7");
this.cube_r6 = this.bone.getChild("cube_r6");
this.cube_r5 = this.bone.getChild("cube_r5");
this.cube_r4 = this.bone.getChild("cube_r4");
this.cube_r3 = this.bone.getChild("cube_r3");
this.cube_r2 = this.bone.getChild("cube_r2");
this.cube_r1 = this.bone.getChild("cube_r1");
}
public static TexturedModelData getTexturedModelData() {
ModelData modelData = new ModelData();
ModelPartData modelPartData = modelData.getRoot();
ModelPartData modelPartData1 = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0,0).cuboid(-3.0F, -4.0F, -1.0F, 5.0F, 3.0F, 2.0F).uv(4,10).cuboid(-2.0F, -5.0F, 0.0F, 4.0F, 1.0F, 0.0F).uv(6,11).cuboid(2.0F, -4.0F, 0.0F, 2.0F, 3.0F, 0.0F), ModelTransform.pivot(0.0F,24.0F,0.0F));
modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(0,0).cuboid(-2.0F, -4.0F, -1.0F, 1.0F, 3.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r2", ModelPartBuilder.create().uv(10,11).cuboid(-3.0F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r3", ModelPartBuilder.create().uv(4,3).cuboid(-3.0F, -2.0F, -1.0F, 0.0F, 1.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r4", ModelPartBuilder.create().uv(10,6).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r5", ModelPartBuilder.create().uv(4,6).cuboid(-3.0F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r6", ModelPartBuilder.create().uv(0,10).cuboid(-2.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r7", ModelPartBuilder.create().uv(6,5).cuboid(-2.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r8", ModelPartBuilder.create().uv(0,5).cuboid(-2.0F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r9", ModelPartBuilder.create().uv(10,5).cuboid(-2.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
return TexturedModelData.of(modelData,16,16);
}
@Override
public void setAngles(PiranhaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
this.cube_r1.yaw = 0.2618F;
this.cube_r2.pitch = -0.0915F;
this.cube_r2.yaw = 0.3042F;
this.cube_r2.roll = -0.0275F;
this.cube_r3.roll = -0.0873F;
this.cube_r4.yaw = 0.6545F;
this.cube_r4.roll = 0.4363F;
this.cube_r5.pitch = 0.0915F;
this.cube_r5.yaw = -0.3042F;
this.cube_r5.roll = -0.0275F;
this.cube_r6.roll = 1.3963F;
this.cube_r7.pitch = 0.0873F;
this.cube_r7.roll = 1.3963F;
this.cube_r8.pitch = -0.0873F;
this.cube_r8.roll = 1.3963F;
this.cube_r9.yaw = -0.6545F;
this.cube_r9.roll = 0.4363F;
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