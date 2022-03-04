package com.tns.framework;

public  class PrimeAcc extends ShopAcc{
	public static boolean isprime;
	float deliveryCharges;

	public PrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges);
		this.setIsprime(isprime);
	}
	
	 void bookProduct(float charges) {

			System.out.println("Charges are: "+charges);
		
	 }

	@Override
	public String toString() {
		return "PrimeAcc [isprime=" + isIsprime() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public boolean isIsprime() {
		return isprime;
	}

	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}
	
	
	
	
	
	
	

}
