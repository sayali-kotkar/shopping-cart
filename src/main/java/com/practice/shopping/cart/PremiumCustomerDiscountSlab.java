package com.practice.shopping.cart;

import java.util.LinkedHashMap;
import java.util.Map;

public class PremiumCustomerDiscountSlab implements DiscountSlab{

	private static Map<SlabRange, Float> slabs = new LinkedHashMap<SlabRange, Float>();
	static {
		slabs.put(new SlabRange(0, 5000), 10F);
		slabs.put(new SlabRange(5000, 10000), 15F);
		slabs.put(new SlabRange(10000), 20F);
	}
	
	public Map<SlabRange, Float> getSlabs() {
		// TODO Auto-generated method stub
		return slabs;
	}

}
