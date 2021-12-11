import java.util.Scanner;
public class PostiveOrNegtive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if (num < 0)
        System.out.println("Negtive");
        else
        System.out.println("Postive");
    }
}
