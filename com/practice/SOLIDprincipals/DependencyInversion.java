package com.practice.SOLIDprincipals;

public class DependencyInversion {
	
	public static void main(String[] args) {
		Credit credit = new Credit();
		Debit debit = new Debit();
		Shopping shopping = new Shopping();
		shopping.shop(debit);
	}

}

class Shopping{
	
	public void shop(Object payment) {
		System.out.println("shop anything");
	}
	
}

class Credit{
	
	public void PayByCredit() {
		
		System.out.println("Pay by credit card");
	}
}

class Debit{
	
public void PayByDredit() {
		
		System.out.println("Pay by dredit card");
	}
}
