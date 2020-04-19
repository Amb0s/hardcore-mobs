package ambos.hardcoremobs.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SpiderEntity.class)
public class SpiderEntityMixin extends HostileEntity {

    private SpiderEntityMixin(EntityType<? extends HostileEntity> type, World world) {
        super(type, world);
    }

    @Inject(at = @At("RETURN"), method = "initAttributes", cancellable = true)
    protected void onInitAttributes(CallbackInfo ci) {
        this.getAttributeInstance(EntityAttributes.MOVEMENT_SPEED).setBaseValue(0.45D);
        this.getAttributeInstance(EntityAttributes.ATTACK_KNOCKBACK).setBaseValue(2.0D);
    }
}
