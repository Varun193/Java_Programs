package com.practice.SOLIDprincipals;

/*
 * SOLID is acronym for first five object-oriented-design(OOD)
 SingleResponsibility- A class should have one and only reason to change or single responsibility to the component
 
 */

class AccountService {

	AccountRepository accountRepository = new AccountRepository();
	SendNotification sendNotification = new SendNotification();

	public void create() { // create() has main resoponsibility is to create account and
							// just delegating resoponsibility to other classes for save and
							// sendNotification.

		System.out.println("Create Account");

		accountRepository.saveDetails();

		sendNotification.sendnotification();

//		System.out.println("store account details in database");
//
//		System.out.println("send Welcome notification for customer");
	}

	class AccountRepository {

		public void saveDetails() {

			System.out.println("store account details in database");
		}
	}

	class SendNotification {

		public void sendnotification() {

			System.out.println("send Welcome notification for customer");
		}
	}
}

public class SingleResponsibility {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		accountService.create();
	}

}
