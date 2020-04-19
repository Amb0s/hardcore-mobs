package ambos.hardcoremobs.mixin;

import net.minecraft.entity.mob.CreeperEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(CreeperEntity.class)
public class CreeperEntityMixin {
	@Shadow
	private int fuseTime = 15;

	@Shadow
	private int explosionRadius = 9;

}
