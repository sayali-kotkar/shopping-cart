package com.practice.shopping.cart;

import java.util.Map;
import java.util.Map.Entry;

public class DiscountCalculator {

	public Double calculateDiscountedPrice(CustomerType customerType, double purchaseAmount) {
		DiscountSlab discountSlab = customerType.getDiscountSlab();
		double finalPrice = calculateAmount(discountSlab, purchaseAmount);
		return finalPrice;
	}

	private double calculateAmount(DiscountSlab discountSlab, double purchaseAmount) {
		
		Map<SlabRange, Float> slabs = discountSlab.getSlabs();
		double amountOnWhichDiscountNeedsToBeApplied = purchaseAmount;
		double totalDiscount = 0;
		for (Entry<SlabRange, Float> slabConfig : slabs.entrySet()) {
			       
			SlabRange slab = slabConfig.getKey();  
			double appliedDiscount = 0;
			if(amountOnWhichDiscountNeedsToBeApplied > 0) {
            	if(slab.getEndAmount() == 0) {
            		appliedDiscount = amountOnWhichDiscountNeedsToBeApplied;
            	}
            	else if(purchaseAmount > slab.getEndAmount() ) {
            		 appliedDiscount = slab.getEndAmount() - slab.getStartAmount();
            	}else {
            		appliedDiscount = amountOnWhichDiscountNeedsToBeApplied;
            	}
            	totalDiscount += applyDiscount(appliedDiscount, slabConfig.getValue());
            	amountOnWhichDiscountNeedsToBeApplied = amountOnWhichDiscountNeedsToBeApplied - appliedDiscount;
            } 
		}
		return purchaseAmount - totalDiscount;
	}

	private double applyDiscount(double amount, Float discountPercent) {
            return (amount * discountPercent)/100;
		
	}

}
