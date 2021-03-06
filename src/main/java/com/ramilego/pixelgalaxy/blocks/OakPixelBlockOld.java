package com.ramilego.pixelgalaxy.blocks;

import java.util.Random;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import com.ramilego.pixelgalaxy.Constants;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OakPixelBlockOld extends MTPixelBlock {

	public OakPixelBlockOld(Material material) {
		super(material);
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		return PixelGalaxyItems.pixelWoodItem;
    }
	
	@Override
	public int quantityDropped(Random p_149745_1_){
		return 16;
	}
}
