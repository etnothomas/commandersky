package com.commanderskye.luckyblocks.init;

import java.util.ArrayList;
import java.util.List;

import com.commanderskye.luckyblocks.blocks.LuckyBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//blocks
	public static final Block LUCKY_BLOCK = new LuckyBlock("lucky_block", Material.WOOD);

}
