package com.tns.framework;

public class NormalAcc extends ShopAcc {
 protected static float deliveryCharge=50;
 
 

public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
	super(accNo, accNm, charges);
	this.deliveryCharge = deliveryCharge;
}

void bookProduct(float charges) {
	System.out.println("Charges are:"+deliveryCharge);
	
}

@Override
public String toString() {
	return "NormalAcc [deliveryCharge=" + getDeliveryCharge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

public float getDeliveryCharge() {
	return deliveryCharge;
}

public void setDeliveryCharge(float deliveryCharge) {
	this.deliveryCharge = deliveryCharge;
}
 
 
}
