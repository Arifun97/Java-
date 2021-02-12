import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		
		char ch='y';
		while(ch=='y')
		{
			Movie m = new Movie();
			String movieTitle;
			String movieRating;
			int soldTicket;
			
			
			
			System.out.println("Enter the name of a movie");
			
			movieTitle = scn.nextLine();
			m.setTitle(movieTitle);
			
			System.out.println("Enter the rating of the movie");
			
			movieRating = scn.nextLine(); 
			m.setRating(movieRating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			
			soldTicket = scn.nextInt(); 
			
			m.setSoldTickets(soldTicket);
			
			
			
			System.out.println(m.toString());
			
			System.out.println("Do you want to enter another?(y or n)");
			ch = scn.next().charAt(0);
			
			scn.nextLine();
			
		}
		
		System.out.println("Goodbye");

	}

}
