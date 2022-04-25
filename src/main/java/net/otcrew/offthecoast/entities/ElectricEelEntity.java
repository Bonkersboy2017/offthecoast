package net.otcrew.offthecoast.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class ElectricEelEntity extends FishEntity {

    public ElectricEelEntity(EntityType<? extends FishEntity> entityType, World world) {
        super(entityType, world);}

    @Override
    protected SoundEvent getFlopSound() {
        return getSwimSound();
    }

    @Override
    public ItemStack getBucketItem() {
        return null;
    }
}