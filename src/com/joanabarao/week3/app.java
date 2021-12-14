package com.joanabarao.week3;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.	
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 100};

//a.	Programmatically subtract the value of the first element in the array
//		from the value in the last element
//		of the array (i.e. do not use ages[7] in your code). Print the result to the console.
// b.	Add a new age to your array and repeat the step above to ensure it is dynamic
//		(works for arrays of different lengths).
		
//	a and b questions answered together. (100 added to array)	.	
	
	int subtraction = (ages[ages.length -1] - ages[0]);
	
		System.out.println(" 1.a + 1.b - The difference between the value of the first element from "
							+ "the value in the last element is " + subtraction + ".");
		System.out.println();
		
//c.	Use a loop to iterate through the array and calculate the average age. 
//		Print the result to the console.
		
		double sum = 0;
		for (int age : ages) {
			 sum += age;
		}
		
	System.out.println("1.c - The average of age is " + (sum / ages.length) + ".");
	System.out.println();
//		
//		2.	Create an array of String called names that contains the following values: 
//	“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.	
		
	String[] names = {"Sam", "Tommy", "Tim", "Sally",  "Buck", "Bob"};
		
//a.	Use a loop to iterate through the array and calculate the average number of letters 
//	per name. Print the result to the console.
		double sumLetters = 0;
		double averageNumberOfLetters = 0;
		
		for (int i = 0; i < names.length; i++) {
			sumLetters += names[i].length();
		}
		
		averageNumberOfLetters = sumLetters / names.length;
		System.out.println("2.a- The average number of letters per name is " + averageNumberOfLetters + ".");
		System.out.println();
		
// b.	Use a loop to iterate through the array again and concatenate all the names together, 
//		separated by spaces, and print the result to the console.
		String namesConcat = "";
		
		for (String name : names) {
			namesConcat += name + " ";
		}
		
		System.out.println("2.b. - Names concatenated: " + namesConcat);
		System.out.println();

//3.	How do you access the last element of any array?
		
	System.out.println( "3. - This is the last element of the ages array: " + (ages [ages.length -1]) + ".");
	System.out.println();
		
// 4.	How do you access the first element of any array?
		
	System.out.println("4. - This is the first element of the ages array: " + ages[0] + ".");
	System.out.println();
		
//5.	Create a new array of int called nameLengths. 
//		Write a loop to iterate over the previously created names array and add the length 
//		of each name to the nameLengths array.		
		
		
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] += names[i].length();
		}
			System.out.println("5. Length of each name added: ");
			
		for (int i = 0; i < nameLengths.length; i++) {
			System.out.println(nameLengths[i] + " ");
		}
		System.out.println();
//	6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the 
//		elements in the array. Print the result to the console.
		int sumOfNameLengths = 0;
		for( int i = 0; i < nameLengths.length; i++) {
			sumOfNameLengths += nameLengths[i];
			
		}
		System.out.println("6. - The sum of all the elements in the array is : " + sumOfNameLengths + ".");
		System.out.println();
		
// 7.	Write a method that takes a String, word, and an int, n, as arguments and returns 
//		the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3,
//		I would expect the method to return “HelloHelloHello”).
	
		System.out.println("7. - The word concatenated to itself is " + concatHello("Hello", 3) + ".");
		System.out.println();
		
//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
//		(the full name should be the first and the last name as a String separated by a space).
	
	System.out.println(fullName("8. - The full name is " + "Joana", "Barao") + ".");
	System.out.println();
		
// 9.	Write a method that takes an array of int and returns true if the sum of all the ints in 
//	the array is greater than 100.	
		
		System.out.println("9. - Is the sum of all the ints in the array greater than 100? - "+ isSumGreaterThan100(ages)+ ".");
		System.out.println();
		
		
// 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	double[] newArray = {53.79, 73.92, 62,98};
	System.out.println("10. - The average of all elements in the array is "+ averageOfAllElements(newArray) + ".");	
	System.out.println();

// 11.	Write a method that takes two arrays of double and returns true if the average of the elements in the 
//	first array is greater than the average of the elements in the second array.
	double[] Arr1 = {53.54, 67.21, 86.22};
	double[] Arr2 = {63.76, 88.21, 95.45};
	
	System.out.println("11. - Is the average of the elements in the first array greater than the average of the elements"
						+ " in the second array? - " + isFirstArrayGreater(Arr1,Arr2) + ".");
	System.out.println();
	
// 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//	and returns true if it is hot outside and if moneyInPocket is greater than 10.50.		
		
	System.out.println("12. - Is is hot outside and is money in pocket greater than 10.50? - "+ willBuyDrink(true, 11) + ".");
	System.out.println();
	
//13.	Create a method of your own that solves a problem. In comments, write what the method does and
//	why you created it.
	
//	Create a method called enoughMoney that takes a double moneyInPocket and a boolean isHungry and returns
//	a String "You're not hungry!!" if isHungry is false, "Go eat at Mcdonald's!!" if moneyInPocket is less 
//	than 30.50 or "Go to a fancy restaurant!!" if moneyInPocket is greater than 30.50.

System.out.println("13. Where am I going to eat? - " + enoughMoney(trueS, 30.00));
System.out.println();
			
	}
	
	// answer to question 7. 
	
	public static String concatHello(String word, int n) {
		
		String concatStr = "";
		
		for(int i = 0; i < n; i++) {
			concatStr += word;
		}
	
		return concatStr;
	}
	
	
// Answer to question 8.
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
		
//  Answer to question 9. 
	public static boolean isSumGreaterThan100(int[] numbers) {
		int sumOfInt = 0;
		for(int number : numbers) {
			sumOfInt += number;
			if (sumOfInt > 100) {
				return true;
			}
		}
		return false;
		
	}


// Answer to question 10.
	
	public static double averageOfAllElements(double[] array) {
		double sumOfEl = 0;
		for( double i : array) {
			sumOfEl += i;
		}
		return sumOfEl / array.length;
	}

// Answer to question 11.
	public static boolean isFirstArrayGreater(double[] arr1, double[] arr2) {
		double sumArr1 = 0;
		double avgArr1 = 0;
		for(double i : arr1) {
			sumArr1 += i;
			avgArr1 = sumArr1 / arr1.length;
		}	
			
				
		double sumArr2 = 0;
		double avgArr2 = 0;
		for(double j : arr2) {
			sumArr2 += j;
			avgArr2 = sumArr2 / arr2.length;
		}
	
		if (avgArr1 > avgArr2) {
			return true;
		}
		return false;		
	}
	
//	Answer to question 12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {		
		if(isHotOutside == true && moneyInPocket >= 10.50) {
			return true;
		}
			return false;		
	}
	
//	 Answer to question 13.
////	Create a method called enoughMoney that takes a double moneyInPocket and a boolean isHungry and returns
//	a String "You're not hungry!!" if isHungry is false, "Go eat at Mcdonald's!!" if moneyInPocket is less 
//	than 100.00 or "Go eat at a fancy restaurant!!" if moneyInPocket is greater than 100.00.
	
	public static String enoughMoney(boolean isHungry, double moneyInPocket) {
		if(isHungry == true && moneyInPocket >= 100.00) {
		return "Go eat at a fancy restaurant!!";
		} else if (isHungry == true && moneyInPocket < 100.00) {
			return"Go eat at Mcdonald\'s !!";
		} 
		else
		{
			return "You\'re not hungry!";
		}
	}
	
	
	
	
	
	
}





