package com.ramilego.pixelgalaxy.items.drinkable.potions;

import com.ramilego.pixelgalaxy.items.PixelGalaxyItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class NitroogenDrink extends ItemFood
{
	public NitroogenDrink(int par2, float par3, boolean par4){super(par2, par3, par4);}

	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity){
		super.onFoodEaten(itemStack, world, entity);float var4 = 1.0F;
		int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
		int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
		int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

		if(true)
	{
		if(entity instanceof EntityPlayer)((EntityPlayer)entity).inventory.addItemStackToInventory(new ItemStack(PixelGalaxyItems.pixelBottle));
	}
		if(true)
	{
		if(entity instanceof EntityLivingBase) ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(1, 150, 100));
	}

	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.drink;
	}
	
	public boolean hasEffect(ItemStack par1ItemStack, int pass)
	{
	return true;
	}

}
