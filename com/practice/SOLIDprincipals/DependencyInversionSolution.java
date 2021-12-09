package com.practice.SOLIDprincipals;

public class DependencyInversionSolution {
	public static void main(String[] args) {

		BankPayment bankPayment = new Creditpay();

		DoShopping doShopping = new DoShopping();

		doShopping.ShopAnyThing(bankPayment);

	}
}

interface BankPayment {

	public void doTranscation();
}

class Creditpay implements BankPayment {

	@Override
	public void doTranscation() {
		System.out.println("pay by credit");

	}

}

class Debitpay implements BankPayment {

	@Override
	public void doTranscation() {
		System.out.println("pay by debit");

	}

}


class DoShopping {

	public void ShopAnyThing(BankPayment payment) {
		System.out.println("shop anything");

	}
}
