package com.practice.programs;

public class SecondLargestInAnArray {

	public static void main(String[] args) {
		
		int [] ar= {2,5,4,7,9,0};
		int temp;
		
//		for(int i=0;i<ar.length;i++) {
//			for(int j=i+1;j<ar.length;j++) {
//				if(ar[i]<ar[j]) {
//					temp=ar[i];
//					ar[i]=ar[j];
//					ar[j]=temp;
//				}
//			}
//		}
//		System.out.println(ar[1]);
//
//	}
//
//}
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

