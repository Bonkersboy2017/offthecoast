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

public class GoonchEntityModel extends EntityModel<GoonchEntity> {
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
	private final ModelPart cube_r10;
	private final ModelPart cube_r11;
	private final ModelPart cube_r12;
	private final ModelPart cube_r13;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
public GoonchEntityModel(ModelPart root) {
this.bone = root.getChild("bone");
this.cube_r15 = this.bone.getChild("cube_r15");
this.cube_r14 = this.bone.getChild("cube_r14");
this.cube_r13 = this.bone.getChild("cube_r13");
this.cube_r12 = this.bone.getChild("cube_r12");
this.cube_r11 = this.bone.getChild("cube_r11");
this.cube_r10 = this.bone.getChild("cube_r10");
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
ModelPartData modelPartData1 = modelPartData.addChild("bone", ModelPartBuilder.create().uv(0,0).cuboid(-8.0F, -6.0F, -3.0F, 16.0F, 6.0F, 7.0F).uv(27,24).cuboid(8.0F, -5.0F, -2.0F, 10.0F, 4.0F, 5.0F).uv(49,13).cuboid(1.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F).uv(46,10).cuboid(-3.0F, -7.0F, 0.0F, 7.0F, 1.0F, 1.0F).uv(20,33).cuboid(-14.0F, -3.0F, -3.0F, 7.0F, 2.0F, 7.0F).uv(39,0).cuboid(8.0F, -1.0F, -2.0F, 7.0F, 1.0F, 5.0F).uv(40,48).cuboid(22.0F, -6.0F, 0.0F, 4.0F, 1.0F, 1.0F).uv(48,40).cuboid(18.0F, -6.0F, 0.0F, 4.0F, 1.0F, 1.0F).uv(11,44).cuboid(23.0F, -7.0F, 0.0F, 5.0F, 1.0F, 1.0F).uv(0,5).cuboid(23.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F).uv(0,44).cuboid(18.0F, -5.0F, -1.0F, 4.0F, 4.0F, 3.0F).uv(0,24).cuboid(26.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F).uv(0,0).cuboid(22.0F, -5.0F, 0.0F, 1.0F, 4.0F, 1.0F).uv(126,127).cuboid(-11.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F), ModelTransform.pivot(0.0F,23.0F,0.0F));
modelPartData1.addChild("cube_r1", ModelPartBuilder.create().uv(25,21).cuboid(24.0F, -2.0F, 0.0F, 3.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r2", ModelPartBuilder.create().uv(39,42).cuboid(8.0F, -3.0F, 2.0F, 6.0F, 0.0F, 3.0F).uv(0,29).cuboid(-4.0F, -2.0F, -6.0F, 11.0F, 0.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r3", ModelPartBuilder.create().uv(22,13).cuboid(-4.0F, -2.0F, 2.0F, 11.0F, 0.0F, 5.0F).uv(27,42).cuboid(8.0F, -3.0F, -4.0F, 6.0F, 0.0F, 3.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r4", ModelPartBuilder.create().uv(40,39).cuboid(-13.0F, 3.0F, 2.0F, 7.0F, 0.0F, 1.0F).uv(0,34).cuboid(-13.0F, 3.0F, -2.0F, 7.0F, 0.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r5", ModelPartBuilder.create().uv(3,17).cuboid(6.0F, -11.0F, 0.0F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r6", ModelPartBuilder.create().uv(46,6).cuboid(18.0F, 1.0F, -1.0F, 4.0F, 1.0F, 3.0F).uv(19,42).cuboid(15.0F, 1.0F, -2.0F, 3.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r7", ModelPartBuilder.create().uv(14,48).cuboid(18.0F, -7.0F, 0.0F, 6.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r8", ModelPartBuilder.create().uv(0,35).cuboid(-12.0F, -6.0F, -3.0F, 5.0F, 2.0F, 7.0F).uv(0,13).cuboid(-15.0F, -5.0F, -3.0F, 10.0F, 1.0F, 7.0F).uv(17,34).cuboid(20.0F, -3.0F, 0.0F, 4.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r9", ModelPartBuilder.create().uv(0,21).cuboid(-7.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r10", ModelPartBuilder.create().uv(46,12).cuboid(-13.0F, -2.0F, -7.0F, 7.0F, 1.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r11", ModelPartBuilder.create().uv(29,18).cuboid(7.0F, -7.0F, -2.0F, 10.0F, 1.0F, 5.0F).uv(35,45).cuboid(9.0F, -9.0F, 0.0F, 8.0F, 2.0F, 1.0F).uv(41,33).cuboid(-15.0F, 0.0F, -2.0F, 7.0F, 1.0F, 5.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r12", ModelPartBuilder.create().uv(0,21).cuboid(-14.0F, -8.0F, -3.0F, 9.0F, 1.0F, 7.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r13", ModelPartBuilder.create().uv(0,13).cuboid(-7.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F).uv(17,37).cuboid(-6.0F, -7.0F, 0.0F, 4.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r14", ModelPartBuilder.create().uv(27,48).cuboid(-13.0F, -2.0F, 8.0F, 7.0F, 1.0F, 0.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
modelPartData1.addChild("cube_r15", ModelPartBuilder.create().uv(126,127).cuboid(-3.0F, -4.0F, 10.0F, 0.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F,0.0F,0.0F));
return TexturedModelData.of(modelData,128,128);
}
@Override
public void setAngles(GoonchEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
this.cube_r1.roll = 0.0873F;
this.cube_r2.pitch = 0.4351F;
this.cube_r2.yaw = 0.3685F;
this.cube_r2.roll = 0.3125F;
this.cube_r3.pitch = -0.4351F;
this.cube_r3.yaw = -0.3685F;
this.cube_r3.roll = 0.3125F;
this.cube_r4.roll = 0.3054F;
this.cube_r5.roll = 0.4363F;
this.cube_r6.roll = -0.1309F;
this.cube_r7.roll = 0.2618F;
this.cube_r8.roll = -0.1745F;
this.cube_r9.roll = 0.7418F;
this.cube_r10.yaw = 0.3054F;
this.cube_r11.roll = 0.1309F;
this.cube_r12.roll = -0.3491F;
this.cube_r13.roll = 1.2217F;
this.cube_r14.yaw = -0.3054F;
this.cube_r15.yaw = -1.5708F;
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