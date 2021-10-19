import java.util.Scanner;

public class Mid
{
	public static void main(String[] args) {
	    String Name;
	    int age;
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Name: ");
	    Name = input.nextLine();
	    
	    System.out.print("Age: ");
	    age = input.nextInt();
	    
	    int Dob = 2021-age;
	    
	    if (Dob < 1990)
	        System.out.println("Hi "+Name+" in "+Dob+" you should have played Pac-man");
	    
	    else if (Dob >= 1990 && Dob <=2000)
	        System.out.println("Hi "+Name+" in "+Dob+" you should have played Super Mario or Kick off 2");
	    
	    else
	        System.out.println("Hi "+Name+" in "+Dob+" you should have played Fifa");
	}
}
