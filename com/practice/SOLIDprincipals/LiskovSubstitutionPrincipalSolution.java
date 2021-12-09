package com.practice.SOLIDprincipals;

public class LiskovSubstitutionPrincipalSolution {

	public static void main(String[] args) {
		Whatapp wa = new Whatapp();
		wa.chat();

		Insta i = new Insta();
		i.postPhotos();
	}

}

interface postPhotosService {

	public void postPhotos();

}

interface VideoService {

	public void video();

}

interface CommonServices {

	public void chat();

	public void sendPhotosAndVideos();
}

class Whatapp implements CommonServices, VideoService {

	@Override
	public void video() {
		System.out.println("video calling");

	}

	@Override
	public void chat() {
		System.out.println("chat");

	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("sendPhotosAndVideos");

	}

}

class Insta implements CommonServices, postPhotosService {

	@Override
	public void postPhotos() {
		System.out.println("postPhotos");

	}

	@Override
	public void chat() {
		System.out.println("chat");

	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("sendPhotosAndVideos");

	}

}
