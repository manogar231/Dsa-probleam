package com.Dsaprobleam;

public class FindMinAndMax {

	int array[] = { 44, 66, 99, 77, 33, 22, 55 };

	public static void main(String[] args) {

		FindMinAndMax result = new FindMinAndMax();
		result.findMax();
		result.findMin();
	}

	void findMax() {
		int max = 0;
		for (int number : array) {
			if (number > max)
				max = number;
		}
		System.out.println("The Maximum Number in the Array :" + max);
	}

	void findMin() {
		int min =array[0];

		for (int i=0; i<array.length;i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("The Minimum Number in the Array :" + min);
	}

}
