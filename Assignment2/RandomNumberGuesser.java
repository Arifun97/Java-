/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 3/01/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ____Arifun Nabi______
*/

import java.util.Scanner;

class RandomNumberGuesser
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       
       int randNum, nextGuess, highGuess, lowGuess;
       
       String choice;
       
    do {                                                                //do-while loop to restart program. 
    	
       RNG.resetCount();
       
       RNG rng = new RNG();
       
       randNum= RNG.rand();
       
       highGuess=100;
       
       lowGuess=0;
       
       int numOfGuess = 0;
      
       
       System.out.println("Enter your first guess ");
       
       nextGuess = sc.nextInt();
       
       while(nextGuess != randNum)
    	   
       {
    	   numOfGuess++;
    	   
    	   while(!rng.inputValidation(nextGuess, lowGuess, highGuess))  //Check if the user input is between low guess and high guess.
    		                                                            //Runs until the user enter valid number.
           {
        	   
        	   nextGuess = sc.nextInt();
        	   
           }
    	                                 
           if (nextGuess > randNum) {                                   //if nextGuess is higher than randNum show message 
        	    
        	   System.out.println ("Your guess is too high");
        	   
        	   System.out.println ("Number of guesses is " + numOfGuess);
        	   
        	   highGuess = nextGuess;}                                  //set the highGuess to nextGuess  
           
           else if (nextGuess < randNum) {                              //if nextGuess is lower than randNum show message 
        	   
        	   System.out.println ("Your guess is too low");
        	   
        	   System.out.println ("Number of guesses is " + numOfGuess);
        	   
        	   lowGuess = nextGuess;}                                   //set the lowGuess to nextGuess  
       }
       
       if(nextGuess==randNum)                                           //if the nextGuess is equal to randNum show message
           {
    	   System.out.println ("Number of guesses is " + numOfGuess);  
    	   
           System.out.println("Congratulations, you guessed correctly");
           
           System.out.println("Try again? (yes or no)" );  //Ask the user if they want to try again
           }
       
           sc.nextLine();
           
           choice = sc.nextLine();
       
    }while(choice.toLowerCase().equals("yes"));                         //if yes restart the program
    	   
   }
}