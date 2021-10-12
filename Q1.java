import java.util.Scanner;


public class Q1
{
  public static void main (String[]args)
  {
    int num;

    Scanner input = new Scanner (System.in);
      num = input.nextInt ();

    if (num % 2 != 0)
        System.out.println ("Odd");
    else
        System.out.println ("Even");
  }
}
