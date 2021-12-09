package demo;

public class Demooo {

	public static void main(String[] args) {
		int[] ar = { 5, 4, 2, 1,6};
		int temp;

		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = i + 1; j <= i; j++) {

				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[j]=temp;
					ar[i]=ar[j];
					
					
					
					

				}
				
			}

		}
		System.out.println(ar[1]);
		
		

	}

}
