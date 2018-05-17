package com.practice.shopping.cart;

public enum CustomerType {
	REGULAR(new RegularCustomerDiscountSlab()), PREMIUM(new PremiumCustomerDiscountSlab());

	
	private DiscountSlab discountSlab;
	
	CustomerType(DiscountSlab discountSlab) {
		this.discountSlab = discountSlab;
		
		
	}
	public DiscountSlab getDiscountSlab() {
		return discountSlab;
		
	}

}

