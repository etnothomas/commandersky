package com.commanderskye.luckyblocks.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class LuckyBlock extends BlockBase {

	public LuckyBlock(String name, Material material) {
		
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(1.5f);
		setResistance(5.0f);
		setHarvestLevel("shovel", 0);
		setLightLevel(10.0f);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		Item returnItem = null; 
		int max = 5; 
		int value = new Random().nextInt(max); 
		switch (value) { 
			case 0: returnItem = Items.BED;
					break;
			case 1: returnItem = Items.BEEF; 
					break;
			case 2: returnItem = Items.GOLD_INGOT; 
					break;
			case 3: returnItem = Items.BLAZE_ROD;
					break;
			case 4: returnItem = Items.IRON_INGOT;
			} 
		return returnItem;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}
}