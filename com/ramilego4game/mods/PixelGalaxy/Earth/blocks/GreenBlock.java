package com.ramilego4game.mods.PixelGalaxy.Earth.blocks;

import micdoodle8.mods.galacticraft.api.block.IPlantableBlock;
import micdoodle8.mods.galacticraft.api.block.ITerraformableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

public class GreenBlock extends Block implements ITerraformableBlock, IPlantableBlock{

	public GreenBlock(int id, Material material) {
		super(id, material);
		setCreativeTab(GalacticraftPixelEarth.tabPEarth);
	}

	@Override
	public boolean isTerraformable(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public int requiredLiquidBlocksNearby() {
		return 0;
	}

	@Override
	public boolean isPlantable(int metadata) {
		if (metadata >= 5 && metadata <= 13)
		{
			return true;
		}

		return false;
	}

}
