package com.Dsaprobleam;

public class CountingArray {

	public static void main(String[] args) {
		
		int array[] = { 44, 66, 99, 77, 33, 22, 55 };

		int target = 55;
		int count = 0;
		int total = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 1; j < array.length; j++) {
				total = array[j] + array[i];
				if (total == target) {
					count++;
				}
			}
		}
		System.out.println("The Total Count Is  " + count);
		
		
	}

}
