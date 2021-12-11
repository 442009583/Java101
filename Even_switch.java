import java.util.Scanner;
public class Even_switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        switch(num % 2) {
          case 0 :
            System.out.println("Even");
            break;
          case 1:
            System.out.println("Odd");
            break;
        }
    }
}
