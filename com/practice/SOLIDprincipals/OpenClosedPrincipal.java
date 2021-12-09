package com.practice.SOLIDprincipals;



/*
 * OpenClosedPrincipal-
 * Objects or entities should open for Extension but closed for modification
 * 
 */

interface ValueComparator{
	/*
	 * return +ve if value1>value2, -ve if value1<value2 , 0 if value1 = value 2
	 */
	
	int compare(int value1, int value2);
	
}
public class OpenClosedPrincipal {

	public static void main(String[] args) {
		int arr[]= {1,5,4,8,6};
		ArrayUtil.Sort(arr, new DsecComparator());
		for(int e: arr) {
			System.out.println(e);
		}
	}
	   
}

class ArrayUtil{
	
	public static void  Sort(int ar[],ValueComparator comparator) {
		int temp;
		for(int i=0; i<ar.length ; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(comparator.compare(ar[i], ar[j])>0) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
}
	


//class ArrayUtil{
//	
//	public static void  descort(int ar[]) {
//		int temp;
//		for(int i=0; i<ar.length ; i++) {
//			for(int j=i+1; j<ar.length; j++) {
//				if(ar[i]<ar[j]) {
//					temp=ar[i];
//					ar[i]=ar[j];
//					ar[j]=temp;
//				}
//			}
//		}
//	}
//	
//	public static void  aescSort(int ar[]) {
//		int temp;
//		for(int i=0; i<ar.length ; i++) {
//			for(int j=i+1; j<ar.length; j++) {
//				if(ar[i]>ar[j]) {
//					temp=ar[i];
//					ar[i]=ar[j];
//					ar[j]=temp;
//				}
//			}
//		}
//	}
	
	class AsecComparator implements ValueComparator{

		@Override
		public int compare(int value1, int value2) {
			
			return value1-value2;
		}
		
	}
	
	class DsecComparator implements ValueComparator{

		@Override
		public int compare(int value1, int value2) {
			
			return value2-value1;
		}
		
	}
	

