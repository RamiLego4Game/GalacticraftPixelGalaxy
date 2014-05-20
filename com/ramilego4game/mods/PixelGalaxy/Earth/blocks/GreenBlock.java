package com.ramilego4game.mods.PixelGalaxy.Earth.blocks;

import com.ramilego4game.mods.PixelGalaxy.Earth.GalacticraftPixelEarth;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GreenBlock extends Block{

	public GreenBlock(int id, Material material) {
		super(id, material);
		setCreativeTab(GalacticraftPixelEarth.tabPEarth);
	}

}