import java.util.Scanner;

public class Degree
{
	public static void main(String[] args) {
		boolean Go = false;
		float Grade = 0;
		System.out.println("Enter a number from 0 to 100");
		while(Go == false){
		    Scanner Obj = new Scanner(System.in);
		    Grade = Obj.nextFloat();
		    if (Grade >= 0 && Grade <= 100){
		        Go = true;
		    }else{
		        System.out.println("Number isn't bettwen 0 and 100, Try another number");
		    }
		}
		if (Go == true){
		    if (Grade >= 0 && Grade <= 59){
		        System.out.println("F");
		    }
		    else if (Grade >= 60 && Grade <= 69){
		        System.out.println("D");
		    }
		    else if (Grade >= 70 && Grade <= 79){
		        System.out.println("C");
		    }
		    else if (Grade >= 80 && Grade <= 89){
		        System.out.println("B");
		    }
		    else if (Grade >= 90 && Grade <= 100){
		        System.out.println("A");
		    }
		}
	}
}
