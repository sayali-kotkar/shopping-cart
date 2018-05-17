package com.practice.shopping.cart;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class DiscountCalculatorTest {

	DiscountCalculator underTest = new DiscountCalculator();
	
	@Test
	public void shouldCalculateCorrectDiscountForRegularCustomerunderSlab1() {
	 Double discountedAmount = underTest.calculateDiscountedPrice(CustomerType.REGULAR, 5000D);	
     assertThat(discountedAmount,Matchers.is(5000D));
	}

	@Test
	public void shouldCalculateCorrectDiscountForRegularCustomerunderSlab2() {
	 Double discountedAmount = underTest.calculateDiscountedPrice(CustomerType.REGULAR, 10000D);	
     assertThat(discountedAmount,Matchers.is(9500D));
	}

	@Test
	public void shouldCalculateCorrectDiscountForRegularCustomerunderSlab3() {
	 Double discountedAmount = underTest.calculateDiscountedPrice(CustomerType.REGULAR, 20000D);	
     assertThat(discountedAmount,Matchers.is(18000D));
	}
	
	@Test
	public void shouldCalculateCorrectDiscountForPreminumCustomerunderSlab1() {
	 Double discountedAmount = underTest.calculateDiscountedPrice(CustomerType.PREMIUM, 5000D);	
     assertThat(discountedAmount,Matchers.is(4500D));
	}

	@Test
	public void shouldCalculateCorrectDiscountForPreminumCustomerunderSlab2() {
	 Double discountedAmount = underTest.calculateDiscountedPrice(CustomerType.PREMIUM, 10000D);	
     assertThat(discountedAmount,Matchers.is(8750D));
	}

	@Test
	public void shouldCalculateCorrectDiscountForPremimumCustomerunderSlab3() {
	 Double discountedAmount = underTest.calculateDiscountedPrice(CustomerType.PREMIUM, 20000D);	
     assertThat(discountedAmount,Matchers.is(16750D));
	}
}
