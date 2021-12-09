package com.practice.SOLIDprincipals;

/*
 *LiskovSubstititionPrinicpal-It applies for inheritance in such a way that dervied classes
 * must be completely substitutable with base class. In other words ,if class A is subtype 
 *  of class B then we can replace class A with class B without interrupting the program.
 * 
 */

public abstract class LiskovSubstititionPrinicpal {

	public abstract void postPhotos();

	public abstract void chat();

	public abstract void video();

	public abstract void sendPhotosAndVideos();

}

class WhatsApp extends LiskovSubstititionPrinicpal {

	@Override
	public void postPhotos() {
		// not supported is therefore we cant substitute with base class
		// i.e,LiskovSubstititionPrinicpal

	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void video() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendPhotosAndVideos() {
		// TODO Auto-generated method stub

	}

}

class instagram extends LiskovSubstititionPrinicpal {

	@Override
	public void postPhotos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void video() {
		// not supported is therefore we cant substitute with base class
		// i.e,LiskovSubstititionPrinicpal

	}

	@Override
	public void sendPhotosAndVideos() {
		// TODO Auto-generated method stub

	}

}
