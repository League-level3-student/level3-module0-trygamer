package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings

		String[] ms = new String[5];
		ms[0]="billy";
		ms[1]="scone";
		ms[2]="hi";
		ms[3]="pow";
		ms[4]="hola";
		int[] ii = new int[50];
		Random r = new Random();
	
		//2. print the third element in the array
		System.out.println(ms[2]);
		//3. set the third element to a different value
		ms[2]="joking";

		//4. print the third element again
		System.out.println(ms[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		
		for(int i = 0; i<ms.length; i++) {
			ms[i]="welp";
			System.out.println(ms[i]);
		}
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		int smallest =0;
		for(int i= 0; i<50; i++) {
			
			int y=r.nextInt(50);
			ii[i]=y;
			System.out.println(ii[i]);
			
			if(smallest<y) {
				 smallest=y;
			}
			
		}
		System.out.println(smallest); 
		//7. make an array of 50 integers

		//8. use a for loop to make every value of the integer array a random number

		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
