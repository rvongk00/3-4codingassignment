package week3;

public class week3assignment {

	public static void main(String[] args) {
//	1. Create an array called ages that contains the following values: 3,9,23,64,2,8,28,93.
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 
//	a. Programatically subtract the value of the first element in the array from the value in the last element of the array. (i.e. do not use ages [7] in your code). Print the result to the console.
		System.out.println(ages[ages.length-1]-ages[0]); 
//		following the index 0 = 3, 93-3 = 90
//  b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 25};
		System.out.println(ages2[ages2.length-1]-ages2[0]);
//	c. Use a loop to iterate through the array and calculate the average age. Print the results to the console.
		int total = 0;
		for (int i = 0 ; i < ages2.length; i++) {
			total += ages2[i];
		}
			System.out.println(total/ages2.length);
//	2. Create an array of String called names that contains the following values: "Sam","Tommy","Tim","Sally","Buck","Bob".
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
//	a. 
		double total2 = 0;
		for (int j=0; j<names.length; j++) {
			total2 += names[j].length();
		} 
			System.out.println(total2 / names.length);		
//	b. 
		String concatNames = "";
		for (String name : names) {
			concatNames += name + " ";
		}
			System.out.println(concatNames);
//	3.
//	ANSWER: Within the name of your array you will put (array[array.length - 1]), last element can be accessed through length property which has one more value than the highest array index..
		System.out.println(names[names.length-1]);
//	4.
//	ANSWER: Within the name of your array you will put 0 as it is the first part of the index (0,1,2,3...)
		System.out.println(names[0]);
//	5.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths [i] = names [i].length();
		}
//	6.
//		enhances for loop
		int nameLengthtotal = 0;
		for (int nameLength : nameLengths) {
			nameLengthtotal += nameLength;
		}
			System.out.println(nameLengthtotal);
//	7.
		String doubleHello = multiplyString("Hello",2);
		System.out.println(doubleHello);	
//	8.
		String firstName = "Rasa";
		String lastName = "Vong";
		String fullName = createFullName (firstName, lastName);
		System.out.println(fullName);
//	9.
		int[] intArray = new int [5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i * 2;
		}
		int[] intArraytest = {101, 102, 103, 104, 106};
		System.out.println(sumArray(intArraytest));
//	10.
		double [] doubleArray = {3.00, 6.96, 7.64, 2.345, 42.321};
		System.out.println(giveAverage(doubleArray));
//	11.
		double [] doubleArray1 = {10,12,13,14,15};
		double [] doubleArray2 = {1,2,3,4,5};
		System.out.println(compareTwoArray(doubleArray1,doubleArray2));
//	12.
		boolean isHotOutside = true;
		double moneyInPocket = 10.51;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
//	13.
		multiplyWeightProtein (.8, 200);
		multiplyWeightProtein (.8,180);
		
	}  
//	^ end of main
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
	public static String multiplyString (String word, int n) {
		String newString = "";
		for (int i = 0; i < n; i++) {
			newString += word;
		}
		return newString; 
	}
//	8.
	public static String createFullName (String first, String last) {
		return (first + " " + last);
	}
//	9.
	public static boolean sumArray (int[] intArray) {
		int sum = 0;
		for(int i : intArray) {
			sum += i;
		}
		return (sum > 100);
	}
//	10.
	public static double giveAverage (double[] array) {
		double sum = 0;
		for (double num : array) {
			sum += num;
		}
		return (sum / array.length);
	}
//	11. 
	public static boolean compareTwoArray(double[] array1, double[] array2) {
		double avgArray1 = giveAverage (array1);
		double avgArray2 = giveAverage (array2);
		return avgArray1 > avgArray2;
	}
//	12.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}
//	13.
//	The recommended dietary allowance to prevent deficiency for an average sedentary adult is 0.8 grams per kilogram of body weight. This method will calculate the amount of protein(g) need for daily consumption based on body weight(kg).
	public static void multiplyWeightProtein (double d, int b) {
		System.out.println(d * b + " grams of protein.");
	}
}
// ^ end of class 	