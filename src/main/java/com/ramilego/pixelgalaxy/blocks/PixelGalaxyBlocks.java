package com.ramilego.pixelgalaxy.blocks;

import com.ramilego.pixelgalaxy.Constants;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class PixelGalaxyBlocks {
	
	public static Block greenGrass;
	public static Block pixelDirt;
	public static Block pixelStone;
	
	public static Block pixelLeaves;
	
	public static Block pixelOak;
	public static Block pixelLog;
	public static Block pixelWoodBlock;
	
	public static Block pixelizerOre;
	public static Block pixelizerBlock;
	
	public static void registerBlocks(){
		pixelizerOre = new NormalPixelBlock(Material.rock).setBlockName("pixelizerOre").setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelizerOre").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypePiston);
		pixelizerOre.setHarvestLevel("pickaxe", 2);
		
		pixelizerBlock = new NormalPixelBlock(Material.rock).setBlockName("pixelizerBlock").setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelizerBlock").setHardness(5.0F).setResistance(10.0F).setStepSound(Block.soundTypeMetal);
		pixelizerBlock.setHarvestLevel("pickaxe", 0);
		
		GameRegistry.registerBlock(pixelizerOre, "pixelizerOre");
		GameRegistry.registerBlock(pixelizerBlock, "pixelizerBlock");
		
		greenGrass = new GrassPixelBlock(Material.grass).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelgrass").setHardness(0.6f).setStepSound(Block.soundTypeGrass).setBlockName("greenGrass");
		pixelDirt = new NormalPixelBlock(Material.ground).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixeldirt").setHardness(0.6f).setStepSound(Block.soundTypeGravel).setBlockName("pixelDirt");
		pixelStone = new NormalPixelBlock(Material.rock).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelstone").setHardness(0.6f).setStepSound(Block.soundTypeStone).setBlockName("pixelStone");
		
		GameRegistry.registerBlock(greenGrass, "greenGrass");
		GameRegistry.registerBlock(pixelDirt, "pixelDirt");
		GameRegistry.registerBlock(pixelStone, "pixelStone");
		
		pixelLeaves = new LeavesPixelBlock().setBlockTextureName(Constants.TEXTURE_PREFIX + "pixelleaves").setBlockName("pixelLeaves");
		
		GameRegistry.registerBlock(pixelLeaves, "pixelLeaves");
		
		pixelOak = new OakPixelBlockOld(Material.wood).setBlockTextureName(Constants.TEXTURE_PREFIX + "pixeloak").setHardness(2.0f).setStepSound(Block.soundTypeWood).setBlockName("pixelOak");
		pixelLog = new OakPixelBlock().setBlockTextureName(Constants.TEXTURE_PREFIX + "pixellog").setBlockName("pixelLog");
		pixelWoodBlock = new WoodPixelBlock(Material.wood).setStepSound(Block.soundTypeWood).setBlockName("pixelWoodBlock");
		
		GameRegistry.registerBlock(pixelOak, "pixelOak");
		GameRegistry.registerBlock(pixelLog, "pixelLog");
		GameRegistry.registerBlock(pixelWoodBlock, ItemBlockMetaBlock.class, "pixelWoodBlock");
	}
}