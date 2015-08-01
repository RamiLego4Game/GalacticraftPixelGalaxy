package com.ramilego.pixelgalaxy.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.ramilego.pixelgalaxy.Constants;;

public class PixelGalaxyItems {
	
	public static Item pixelizerIngot;
	
	public static Item pixelizerSword;
	public static Item pixelizerHoe;
	public static Item pixelizerPickaxe;
	public static Item pixelizerShovel;
	public static Item pixelizerAxe;
	
	public static Item pixelizerHelmet;
	public static Item pixelizerChestplate;
	public static Item pixelizerLeggings;
	public static Item pixelizerBoots;
	
	public static Item pixelWoodItem;
	
	static ToolMaterial pixelizerToolMaterial = EnumHelper.addToolMaterial("pixelizerToolMaterial", 4, 2000, 10.0f, 4.0f, 15);
	static ArmorMaterial pixelizerArmorMaterial = EnumHelper.addArmorMaterial("pixelizerArmorMaterial", 44, new int[]{4, 9, 7, 4}, 15);
	
	public static void registerItems(){
		
		pixelWoodItem = new PixelWood().setUnlocalizedName("pixelWoodItem").setTextureName(Constants.TEXTURE_PREFIX + "pixelWoodItem");
		
		GameRegistry.registerItem(pixelWoodItem, "pixelWoodItem");
		
		pixelizerIngot = new PixelItem().setUnlocalizedName("pixelizerIngot").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerIngot");
		
		GameRegistry.registerItem(pixelizerIngot, "pixelizerIngot");
		
		pixelizerSword = new PixelSword(pixelizerToolMaterial).setUnlocalizedName("pixelizerSword").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerSword");
		pixelizerHoe = new PixelHoe(pixelizerToolMaterial).setUnlocalizedName("pixelizerHoe").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerHoe");
		pixelizerPickaxe = new PixelPickaxe(pixelizerToolMaterial).setUnlocalizedName("pixelizerPickaxe").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerPickaxe");
		pixelizerShovel = new PixelShovel(pixelizerToolMaterial).setUnlocalizedName("pixelizerShovel").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerShovel");
		pixelizerAxe = new PixelAxe(pixelizerToolMaterial).setUnlocalizedName("pixelizerAxe").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerAxe");
		
		GameRegistry.registerItem(pixelizerSword, "pixelizerSword");
		GameRegistry.registerItem(pixelizerHoe, "pixelizerHoe");
		GameRegistry.registerItem(pixelizerPickaxe, "pixelizerPickaxe");
		GameRegistry.registerItem(pixelizerShovel, "pixelizerShovel");
		GameRegistry.registerItem(pixelizerAxe, "pixelizerAxe");
		
		pixelizerHelmet = new PixelizerArmor(pixelizerArmorMaterial, 3, 0).setUnlocalizedName("pixelizerHelmet").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerHelmet");
		pixelizerChestplate = new PixelizerArmor(pixelizerArmorMaterial, 3, 1).setUnlocalizedName("pixelizerChestplate").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerChestplate");
		pixelizerLeggings = new PixelizerArmor(pixelizerArmorMaterial, 3, 2).setUnlocalizedName("pixelizerLeggings").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerLeggings");
		pixelizerBoots = new PixelizerArmor(pixelizerArmorMaterial, 3, 3).setUnlocalizedName("pixelizerBoots").setTextureName(Constants.TEXTURE_PREFIX + "pixelizerBoots");
		
		GameRegistry.registerItem(pixelizerHelmet, "pixelizerHelmet");
		GameRegistry.registerItem(pixelizerChestplate, "pixelizerChestplate");
		GameRegistry.registerItem(pixelizerLeggings, "pixelizerLeggings");
		GameRegistry.registerItem(pixelizerBoots, "pixelizerBoots");
	}
}
