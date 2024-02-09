package com.tnsif.day7;

public class MethodOverridingMain {

	public static void main(String[] args) {
		SbiOverride sbi = new SbiOverride();
		HdfcOverride hdfc= new HdfcOverride();
		IciciOverride ic= new IciciOverride();
		
		System.out.println(sbi.getRateInterest());
		System.out.println(hdfc.getRateInterest());
		System.out.println(ic.getRateInterest());

	}

}
