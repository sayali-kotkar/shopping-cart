package com.practice.shopping.cart;

public class SlabRange {

   private double startAmount;
   private double endAmount;

   public SlabRange(double startAmount, double endAmount) {
	this.startAmount = startAmount;
	this.endAmount = endAmount;
}

 public SlabRange(double startAmount) {
	this.startAmount = startAmount;
}

public double getStartAmount() {
	return startAmount;
}

public double getEndAmount() {
	return endAmount;
}

   
   
}
