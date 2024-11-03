package week4;

public class week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.
		// in this block of code i have created an array of ages and subtracted the number in the last place
		//from the number in the first place.
		// printed the result as a new int called subtotal`
		int[] ages = {3,9,23,64,2,8,28,93};
		int subtotal = ages[ages.length-1] - ages[0];
		System.out.println(subtotal);
		
		//by using ages.length -1 i can always get the last index
		//of an array. therefore making it dynamic.
		int[] ages2 = {2,8,20,19,15,5,7,69,1,9};
		int subtotal2 = ages2[ages2.length-1] - ages2[0];
		System.out.println(subtotal2);
		int sum = 0;
		double average;
		for (int i = 0; i< ages2.length;i++) {
			sum = sum + ages2[i];
			
		}
		//calculated the average age of the array by taking the sum of the array
		//dividing by the ages2.length.
	    average = sum/ages2.length;
	    System.out.println("Average age is " + average); 
	    
	    //2
	    //created array of string that holds 6 names. then i created a variable called totalLetters to hold 
	    //the  total amount of letters in all the words
	    double totalLetters = 0;
	    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	    for(int i = 0; i < names.length; i++){
	    // to calculate the total of all the letters i first used the .length method on the name array in the [i] position so that it's variable.
	    // then added the number of letters to the totalLetter total.
	    	totalLetters = totalLetters + names[i].length(); 
	    }
	    //I created an empty variable called average2 to hold the average number of letters per word
	    //Then i did the math to get the result. the total number of letters divided by the total number of words.
	    double average2;
	    average2 = totalLetters / names.length; 
	   //printed the output to the console 
	    System.out.println("The average number of letters per name is " + average2);
	    {	
	    	//created another string to contain all the words after i concatenate them together
	    String totalWords = "";
	    //created a loop to run through and add all the words together into the totalWords string
	    for(int i = 0; i < names.length; i++){
		    	totalWords = totalWords + " " +names[i];
		    	
		    }
	    // printed the output to the console
	    	System.out.println(totalWords);
	    	
	    
	    //3. 	 How do you access the last element of any array?
	    // to access the last element in the array you must use array.length -1
	     
	    //4.How do you access the first element of any array?
	    // 	to access the first element in the array you can use array[0]
	    	
	 
	    //5.  created an array of int called nameLengths
	    //used a for loop to iterate through the names array 
	    // printed the results to the console
	    	
	    int[] nameLengths = new int[6];
	    for(int i = 0; i < names.length; i++){
	    	nameLengths[i] = names[i].length();
	    	
	    	System.out.println(nameLengths[i]);  
	    	
	    	
	    }
	    //6.  created a empty variable totalNames to hold the sum of all the elements
	    // did a for loop to add all the elements in nameLengths to the new variable totalNames
	    int totalNames = 0;
    	for(int i = 0; i < nameLengths.length; i++) {
    	 totalNames += nameLengths[i];
    	 
    	}
    	System.out.println(totalNames);
	    
    	//just testing out my methods
	    System.out.println(stringRepeater("hello",3));
	    
	    System.out.println(fullName("Greta","Regan"));
	    
	    int[] test = {99,2};
	    int[] test1 = {1,2,3};
	    int[] test2 = {50,25,25};
	    double[] test3 = {25, 25, 25 , 100, 10, 100};
	    double[] doubleTest = {10,20,30,40};
	    double[] doubleTest2 = {10,260,50,50};
	    
	    
	    System.out.println(overOrUnderBill(test2));
	    
	    System.out.println(averageMethod(test3));
	    
	    System.out.println(whatAvgIsGreater(doubleTest,doubleTest2));
	    
	    System.out.println(willBuyDrink(false,89));
	    
	    System.out.println(inTheFam("Asiya"));
	    
	    }
	    
		
	}
	// 7. wrote a method with both string and int
	
	static String stringRepeater(String word, int n) {
		//created a new empty string to hold the user input 
		String finalWord="";
		// wrote a for loop to add the String "word" to finalWord and concatenate it by "n" number of times (that is determined by the user above on line 90).
		for(int i=0;i<n;i++) {
			finalWord += word; 
		}
		//on line 90 i called the method and printed to the console.
		return finalWord;
	}
	//8. wrote a method with String to add first name and last name with a space in between.
	static String fullName(String firstName, String lastName) {
		

		
		return firstName + " "+ lastName;
		
	}
	//9. wrote a method called overOrUnderBill that checks the sum of all the ints in a array then prints out a true or false boolean if the sum is greater then a 100 or not
	
	static boolean overOrUnderBill(int []numbersArray) {
		// created empty int to hold the total numbers 
		int totalNumbers = 0;
		for(int i = 0;i<numbersArray.length; i++) {
			
			totalNumbers += numbersArray[i];
			
		}
		//wrote an if else statement so the program can decide what to return
		if (totalNumbers<=100){
			
			return false;
		
		} else {
			
			return true;
		}
		

				
				
			
		}
	//10. 
	// created a method that returns the average of all the methods in the array
	static double averageMethod(double []numbersArray) {
		//created empty double variable to hold the average of all the numbers
		double averageOfnumbers =0;
		// created a double to take the total of all the variables 
		double total = 0;
		//wrote a for loop to go through an array and the total of each element to the total variable.
		for (int i = 0; i< numbersArray.length;i++) {
			total += numbersArray[i];
			
			
		}
		//did the final calculation outside of the the for loop so it can just run once. 
		//then return average 
		averageOfnumbers = total / numbersArray.length;
		return averageOfnumbers;
		}
		
		//11.
		// Created a method with the return type boolean, so that it could return a true or false
		static boolean whatAvgIsGreater(double []doubleArray,double []doubleArray2) {
	
			// declared my variables 
			double average = 0;
			double average2 = 0;
			double total = 0;
			double total2 = 0;
			//ran a for loop to calculate the total of the array 
			for (int i = 0; i<doubleArray.length;i++) {
				total += doubleArray[i];
			}
			// ran another for loop to calculate the total of the second array
			for(int i=0;i<doubleArray2.length;i++) {
				total2 += doubleArray2[i];
				
			}
			//did the math to get the average and added that to the total variable
			// did that again for the the total 2 and avg2 variables
			average = total / doubleArray.length;
			average2 = total2 / doubleArray2.length;
			// did a if else statement so the program can decide what to return
			if(average>average2) {
				return true;
			}
				else { return false;
					
					
				}
		
			
			
	}	
		//12.
		
		static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			// wrote a method with the return type as boolean and two different types of variables
			//
			if(isHotOutside && moneyInPocket > 10.5) {			
				return true;
			}
			else {
				return false;
			}
			
		}
		// I created a method that runs through an array of string that contains all my
		//family member names, and then returns true or false if the user input is not a family members name
		
		static boolean inTheFam(String inputName) {
			//String of name 
			String[] familyNames = {"imran", "Asiya","Cubaydulah", "greta", "Musab", "Ilhan","Maryama", "Camaar", "Mohamed", "Aisha", "Cabaas", "Ikram", "Yunis","Faduma","Noridin"};
			
			for(int i = 0;i<familyNames.length;i++) {
				
				if(inputName == familyNames[i]) {
					
					return true;
				
				}
				 
				
				
			}
			return false;
		}
	
}
	



