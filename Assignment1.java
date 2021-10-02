import java.util.Scanner;

//عبدالله محمد الربيعاني
//442009583
// your grade is 4.5/5

//@ change the class name from Main to Assignment ( Golden rule Class name should match the file name ) (O)
public class Assignment1
{
	public static void main(String[] args) {
		System.out.println("Enter 2 floats: ");
		Scanner Floats = new Scanner(System.in);
		
		float F1 = Floats.nextFloat();
		float F2 = Floats.nextFloat();
		
		System.out.println(F1+F2);
		System.out.println(F1-F2);
		System.out.println(F1*F2);
		System.out.println(F1/F2);
		System.out.println(F1%F2);
		System.out.println(F1>F2);
		//@ is always true because it is equal to itself
		System.out.println(F1>=F1);
		System.out.println(F1<F2);
		System.out.println(F1<=F2);
		System.out.println(F1!=F2);
		System.out.println(F1==F2);
	}
}
