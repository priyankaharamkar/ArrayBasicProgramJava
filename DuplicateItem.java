package org.tech;

class Array {
// for duplicate array 
	void duplicateItem(int[] a) {

		/*
		 * You can sort the array before you compare
		 */

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int count = 0;
		 System.out.println("Repeating Element");
		for (int j = 0; j < a.length; j++) {

			for (int k = j + 1; k < a.length; k++) {

				if (a[j] == a[k]) {

					count++;
				}

			}

			if (count == 1) {

				System.out.println(a[j]);

			}

			count = 0;
		}

	}

	/*
	 * 
	 * for array of non duplicate elements in array just change int k=j+1; to int k
	 * = 0; in for loop
	 * 
	 */
	 void NonDuplicateItem(int[] a) {

		/*
		 * You can sort the array before you compare
		 */

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int count = 0;
		 System.out.println("Non Repeating Element");
		for (int j = 0; j < a.length; j++) {

			for (int k = 0; k < a.length; k++) {

				if (a[j] == a[k]) {

					count++;
				}

			}
        
			if (count == 1) {

				System.out.println(a[j]);

			}

			count = 0;
		}

	}
}

public class DuplicateItem {
	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 2, 2, 3, 6, 5, 3, 6, 7, 8 };
		Array ar = new Array();
		ar.duplicateItem(a);
		ar.NonDuplicateItem(a);
	}
}
