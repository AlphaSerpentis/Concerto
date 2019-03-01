package main.concertomod.init;

import java.util.ArrayList;
import java.util.List;

import main.concertomod.items.ItemBase;
import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Misc
	public static final Item TESTING_STICK = new ItemBase("concerto_stick");

	//Instruments
	public static final Item SAXOPHONE = new ItemBase("saxophone");
	public static final Item CLARINET = new ItemBase("clarinet"); //TODO: Implement
	public static final Item FLUTE = new ItemBase("flute"); //TODO: Implement
	
	//Materials
	public static final Item REED = new ItemBase("reed"); //TODO: Implement
	public static final Item INSTRUMENT_CASE = new ItemBase("instrument_case"); //TODO: Implement
	
}
