package _05_for_loops._1_my_ages;

public class MyAges {
	public static void main(String[] args) {
		
		/** This program will use loops to print all the ages you have been alive, 
		 * from zero up to your current age. **/
		int age = 0;
		int currentAge = 14;
				
		while(age <= currentAge) {
			System.out.println(age);
			age +=1;
		}
		
		/*** Now you are going to do the same thing, but this time use a for loop. 
		 *   Notice how most of the information is the same, it is just written 
		 *   in a different way.
		 **/
		
		for(age=0; age <= currentAge; age += 1) {
			System.out.println(age);
		}
	}
}
