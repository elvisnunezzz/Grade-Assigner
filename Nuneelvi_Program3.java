
//Elvis Nunez
//Reads the student's grades and assigns grades depending on their score


import java.util.*;
public class Nuneelvi_Program3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of grades");
		int x  = input.nextInt();
		System.out.println("Enter " + x + " grades separated by a space");
		int arr[] = new int[x];

		for(int i=0;i<x;i++){

			arr[i]=input.nextInt();
		}
		
		//System.out.println(findMax(arr));
		findMax(arr);
		int r = findMax(arr);
		printGrades(arr, r);
	}

	//Calculate and return the max in the array
	public static int findMax (int [] theArray) {
		int max = theArray [0];
		for (int i = 0; i < theArray.length; i++)
		{

			if (theArray[i] > max)
				max = theAßrray[i];
		}

		return max;
	}
	//Print the number of students with their particular grades and it will subtract 10 every time the condition its true
	public static void printGrades( int [] theArray, int highestGrade ) {

		int numbers = theArray[0];
		for (int i = 0; i < theArray.length; i++) {

			System.out.print("Student " + i + " is " + theArray [i] + " and grade is " + " " );

			if( theArray[i] > highestGrade - 10) 
				System.out.println('A');

			else if(theArray[i] > highestGrade - 20) 
				System.out.println('B');

			else if(theArray[i] > highestGrade - 30) 
				System.out.println('C');

			else if(theArray[i] > highestGrade - 40) 
				System.out.println('D');

			else 
				System.out.println('F');

		}
	}
}




