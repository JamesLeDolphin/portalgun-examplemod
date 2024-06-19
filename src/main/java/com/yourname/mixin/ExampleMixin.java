package com.yourname.mixin;

import com.jdolphin.portalgun.client.model.PortalEntityModel;
import net.minecraft.client.model.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PortalEntityModel.class)
public abstract class ExampleMixin {

	/**
	 * @author JamesLeDolphin
	 * @reason Example on how to replace portal model
	 * Please note that you may need to offset your model for it to appear properly.
	 * To change the texture, simply change it the usual way using a resource pack.
	 */
	@Overwrite
	public static TexturedModelData getTexturedModelData() {
		//Simply replace this part below with your own version of it.
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main",
				ModelPartBuilder.create().uv(-21, -14)
						.cuboid(-8.0F, -32.0F, -8.0F, 16.0F, 32.0F, 16.0F,
								new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
}