/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 2/09/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ____Arifun Nabi______
*/

import java.util.Scanner;
public class WifiDiagnostic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String choice;
		
		System.out.println("First step: reboot your computer");
		
		System.out.println("Are you able to connect with the internet? (yes or no)");
		
		choice = sc.nextLine();
		
			if (choice.toLowerCase().equals("no"))  //if first step doesn't work go to second step
			{
				System.out.println("Second step: reboot your router");
				
				System.out.println("Are you able to connect with the internet? (yes or no)");
				
				choice = sc.nextLine();
				
				if (choice.toLowerCase().equals("no")) //if second step doesn't work go to third step
				{
					System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
					
					System.out.println("Are you able to connect with the internet? (yes or no)");
					
					choice = sc.nextLine();
					
					if (choice.toLowerCase().equals("no")) //if third step doesn't work go to fourth step
					{
						System.out.println("Fourth step: move your computer close to your router");
						
						System.out.println("Are you able to connect with the internet? (yes or no)");
						
						choice = sc.nextLine();
						
						if (choice.toLowerCase().equals("no")) //if fourth step doesn't work go to fifth step
						{
							System.out.println("Fifth step: contact your ISP");
							
							System.out.println("Make  sure your ISP is hooked up to your router.");
						}
						else if (choice.toLowerCase().equals("yes")) //if fourth step work show this message
						{
							System.out.println("Moving your computer closer to your router seemed to work");
							}
					
					}
					else if (choice.toLowerCase().equals("yes")) //if third step work show this message
					{
						System.out.println("Plugging the cables to your router seemed to work");
						}
				}
				else if (choice.toLowerCase().equals("yes")) //if second step work show this message
				{
				System.out.println("Rebooting your router seemed to work");
				}
			
			}
			else if (choice.toLowerCase().equals("yes")) //if first step work show this message
			{
			System.out.println("Rebooting your computer seemed to work");
			}
		
	}

}
