package main.concertomod.items;

import main.concertomod.Main;
import main.concertomod.init.ModItems;
import main.concertomod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		String[] Materials = {"reed"};
		String[] Tools = {"saxophone", "clarinet", "flute"};
		String[] Misc = {"concerto_stick"};
		
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		for(String item: Materials)
			if(item.equals(name)) {
				setCreativeTab(CreativeTabs.MATERIALS);
				break;
			}
		
		for(String item: Tools)
			if(item.equals(name)) {
				setCreativeTab(CreativeTabs.TOOLS);
				this.setMaxStackSize(1);
				break;
			}
		
		for(String item: Misc)
			if(item.equals(name)) {
				setCreativeTab(CreativeTabs.MISC);
				break;
			}
		
		//setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
