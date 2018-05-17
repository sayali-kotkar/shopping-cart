package com.practice.shopping.cart;

import java.util.LinkedHashMap;
import java.util.Map;

public class RegularCustomerDiscountSlab implements DiscountSlab{

	private static Map<SlabRange, Float> slabs = new LinkedHashMap<SlabRange, Float>();
	static {
		slabs.put(new SlabRange(0, 5000), 0F);
		slabs.put(new SlabRange(5000, 10000), 10F);
		slabs.put(new SlabRange(10000), 15F);
	}
	public Map<SlabRange, Float> getSlabs() {
		return slabs;
	}
	
	
}
